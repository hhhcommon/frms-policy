package cn.com.bsfit.frms.policy.jms;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.jms.JMSException;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.listener.adapter.MessageListenerAdapter;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import com.alibaba.fastjson.JSON;

import cn.com.bsfit.frms.obj.AuditObject;
import cn.com.bsfit.frms.obj.AuditResult;
import cn.com.bsfit.frms.obj.NotifyPolicy;
import cn.com.bsfit.frms.obj.Risk;
import cn.com.bsfit.frms.policy.jms.util.SessionAwareBatchMessageListener;
import cn.com.bsfit.frms.policy.mapper.RiskArchivesMapper;
import cn.com.bsfit.frms.policy.mapper.RisksMapper;
import cn.com.bsfit.frms.policy.pojo.RiskArchives;
import cn.com.bsfit.frms.policy.pojo.Risks;

@Component
public class RiskArchivesListener extends MessageListenerAdapter implements SessionAwareBatchMessageListener<TextMessage> {

	@Autowired
    private transient SqlSessionFactory sqlSessionFactory;
	private final static String DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";
	private final static Logger LOGGER = LoggerFactory.getLogger(RiskArchivesListener.class);

	@SuppressWarnings("unchecked")
	public void onMessages(final Session session, final List<TextMessage> messages) throws JMSException {
		// TODO
		LOGGER.info("onMessage Thread[{}]", Thread.currentThread());
		if (messages == null || messages.isEmpty()) {
			LOGGER.warn("No messages available!");
			return;
		}
		LOGGER.info("RiskArchivesListener received [{}] msgs", messages.size());
		final SqlSession sqlSession = sqlSessionFactory.openSession(false);
		try {
			// 保存风险信息
			for (TextMessage message : messages) {
				// 队列里的消息的格式是：一个List集合，该集合里的每一个元素是由AuditResult,AuditObject,List<MemCachedItem>三部分组成的对象
				final List<List<Object>> publishObjList = (List<List<Object>>) JSON.parse(message.getText());
				if (publishObjList == null) {
					continue;
				}
				for (List<Object> publishObj : publishObjList) {
					if (publishObj != null && publishObj.size() >= 2) {
						final AuditResult auditResult = (AuditResult) publishObj.get(0);
						final AuditObject auditObject = (AuditObject) publishObj.get(1);
						final long archivesId = saveRiskArchives(auditObject, auditResult, sqlSession);
						saveRisks(auditResult, archivesId, sqlSession);
					}
				}
			}
		} catch (Exception e) {
			 LOGGER.error("An error occurred when saving data", e);
	         sqlSession.rollback();
		} finally {
			sqlSession.close();
		}
	}
	
	private Long saveRiskArchives(final AuditObject auditObject, final AuditResult auditResult, final SqlSession sqlSession) throws ParseException {
		final RiskArchives riskArchives = new RiskArchives();
		final RiskArchivesMapper mapper = sqlSession.getMapper(RiskArchivesMapper.class);
		// 支付方ID
		riskArchives.setAcctId(auditObject.get("frms_pay_user_id") == null ? "" : auditObject.get("frms_pay_user_id").toString());
		// 风险状态 默认未确认
		riskArchives.setStatus(Short.valueOf("1"));
		// 触发规则名称
		final List<Risk> riskList = auditResult.getRisks();
		if(riskList != null && !riskList.isEmpty()) {
			final StringBuffer ruleNames = new StringBuffer("");
			final StringBuffer ruleCodes = new StringBuffer("");
			final StringBuffer controlScodes = new StringBuffer("");
			
			for(Risk risk : riskList) {
				ruleNames.append(risk.getRuleName()).append(',');
				if (risk.getRuleName() != null) {
					ruleCodes.append(risk.getRuleName().split(":").length > 1 ? risk.getRuleName().split(":")[1].trim() : "").append(',');
	            }
				final NotifyPolicy notifyPolicy = risk.getNotifyPolicy();
				if(notifyPolicy != null && StringUtils.isEmpty(notifyPolicy.getCode())
						&& !"NO".equals(notifyPolicy.getCode())) {
					controlScodes.append(notifyPolicy.getCode().trim()).append(',');
				}
			}
			if(ruleNames.charAt(ruleNames.length() - 1) == ',') {
				ruleNames.deleteCharAt(ruleNames.length() - 1);
			}
			if(ruleCodes.charAt(ruleCodes.length() - 1) == ',') {
				ruleCodes.deleteCharAt(ruleCodes.length() - 1);
			}
			if(controlScodes.charAt(controlScodes.length() - 1) == ',') {
				controlScodes.deleteCharAt(controlScodes.length() - 1);
			}
			riskArchives.setComments(ruleNames.toString());
			riskArchives.setRuleIds(ruleCodes.toString());
			// 人行规则代码
			riskArchives.setControlScode(controlScodes.toString());
		}
		// 创建时间
		riskArchives.setCreateTime(auditObject.get("frms_create_time") == null ? new Date() : parse(auditObject.get("frms_create_time").toString()));
		// 交易时间
		final Object obj = auditObject.get("frms_trans_time");
		Date transTime = new Date();
		if(obj instanceof Long) {
			transTime = new Date((Long) obj);
		} else if(obj instanceof String) {
			transTime = parse(obj.toString());
		} else if(obj instanceof Date) {
			transTime = (Date) obj;
		}
		riskArchives.setUpdateTime(transTime);
		// 业务类型
		riskArchives.setBizCode(auditObject.get("frms_order_type") == null ? "" : auditObject.get("frms_order_type").toString());
		// 交易号
		riskArchives.setTransId(auditObject.get("frms_order_id") == null ? "" : auditObject.get("frms_order_id").toString());
		// 交易金额
		riskArchives.setTransVol(auditObject.get("frms_trans_amount") == null ? BigDecimal.ZERO : new BigDecimal(auditObject.get("frms_trans_amount").toString()));
		// UUID
		riskArchives.setUuid(auditObject.getUuid());
		riskArchives.setBizCategory(auditObject.getBizCategory());
		// 订单状态
		riskArchives.setControlStatus(auditObject.get("frms_or_state") == null ? Short.valueOf("1") : Short.valueOf(auditObject.get("frms_or_state").toString()));
		// 来源 默认规则触发
		riskArchives.setSource(Short.valueOf("0"));
		// 是否生成报告 默认未生成
		riskArchives.setCheckStatus(Short.valueOf("0"));
		// 银行卡号
		riskArchives.setBank(auditObject.get("frms_pay_card_no") == null ? "" : auditObject.get("frms_pay_card_no").toString());
		// 收款方ID
		riskArchives.setOidPartner(auditObject.get("frms_col_user_id") == null ? "" : auditObject.get("frms_col_user_id").toString());
		// 通道编号
		riskArchives.setVerifyCode(auditObject.get("frms_gateid") == null ? "" : auditObject.get("frms_gateid").toString());
		// 支付产品编号
		riskArchives.setNotifyCode(auditObject.get("frms_trade_no") == null ? "" : auditObject.get("frms_trade_no").toString());
		// 终端ID
		riskArchives.setMachineId(auditObject.get("frms_terminalid") == null ? "" : auditObject.get("frms_terminalid").toString());
		// 是否为反洗钱
		riskArchives.setIsAml(Short.valueOf("2"));
		// 分公司ID
		riskArchives.setDeptId(auditObject.get("frms_dept_code") == null ? "" : auditObject.get("frms_dept_code").toString());
		// 交易IP
		riskArchives.setTransIp(auditObject.get("frms_pay_ip") == null ? "" : auditObject.get("frms_pay_ip").toString());
		// 交易状态
		riskArchives.setTradeStatus(auditObject.get("frms_trade_status") == null ? "" : auditObject.get("frms_trade_status").toString());
		// 币种
		riskArchives.setCurrency(auditObject.get("frms_cry_type") == null ? "" : auditObject.get("frms_cry_type").toString());
		// 手机归属地
		riskArchives.setMobileAttribution(auditObject.get("frms_phone_addr") == null ? "" : auditObject.get("frms_phone_addr").toString());
		// IP归属地
		riskArchives.setIpAttribution(auditObject.get("frms_trans_ip_addr") == null ? "" : auditObject.get("frms_trans_ip_addr").toString());
		// MAC
		riskArchives.setMac(auditObject.get("frms_mac_addr") == null ? "" : auditObject.get("frms_mac_addr").toString());
		// 设备号
		riskArchives.setDeviceNum(auditObject.get("frms_device_num") == null ? "" : auditObject.get("frms_device_num").toString());
		// 商户订单号
		riskArchives.setMerOrderId(auditObject.get("frms_orderid") == null ? "" : auditObject.get("frms_orderid").toString());
		// 机构请求流水
		riskArchives.setDeptRequestNum(auditObject.get("frms_trace") == null ? "" : auditObject.get("frms_trace").toString());
		// 退款金额
		riskArchives.setRefundAmount(auditObject.get("frms_refund_amount") == null ? Integer.MIN_VALUE : Integer.valueOf(auditObject.get("frms_refund_amount").toString()));
		// 退款次数
		riskArchives.setRefundNum(auditObject.get("frms_refund_num") == null ? Integer.MIN_VALUE : Integer.valueOf(auditObject.get("frms_refund_num").toString()));
		// 产品号
		riskArchives.setProductId(auditObject.get("frms_product_id") == null ? "" : auditObject.get("frms_product_id").toString());
		mapper.insertSelective(riskArchives);
		return riskArchives.getArchivesId();
	}
	
	private void saveRisks(final AuditResult auditResult, final long archivesId, final SqlSession sqlSession) {
		final List<Risk> riskList = auditResult.getRisks();
		if(riskList == null || riskList.isEmpty()) {
			return;
		}
		final RisksMapper mapper = sqlSession.getMapper(RisksMapper.class);
		for(Risk risk : riskList) {
			final Risks risks = new Risks();
			final String ruleName = risk.getRuleName();
			risks.setArchivesId(archivesId);
			risks.setRuleName(ruleName);
			risks.setScore(risk.getScore().longValue());
			risks.setComments(risk.getComments());
			risks.setRulePackageName(risk.getRulePackageName());
			if(ruleName != null && !"".equals(ruleName)) {
				final String[] ruleNames = ruleName.split(":");
				risks.setRuleId(ruleNames != null && ruleNames.length > 1 ? ruleNames[1].trim() : "");
			}
			mapper.insertSelective(risks);
		}
	}
	
	private final transient ThreadLocal<DateFormat> threadLocal = new ThreadLocal<DateFormat>() {
		@Override
		protected DateFormat initialValue() {
			synchronized (this) {
				return new SimpleDateFormat(DATE_FORMAT, Locale.ENGLISH);
			}
		}
	};

	private DateFormat getDateFormat() {
		return threadLocal.get();
	}

	private Date parse(final String textDate) throws ParseException {
		return getDateFormat().parse(textDate);
	}
}
