package cn.com.bsfit.frms.policy.jms;

import java.util.List;

import javax.jms.JMSException;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.ibatis.session.ExecutorType;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.listener.adapter.MessageListenerAdapter;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSON;

import cn.com.bsfit.frms.obj.AuditObject;
import cn.com.bsfit.frms.obj.AuditResult;
import cn.com.bsfit.frms.obj.MemCachedItem;
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
						final List<MemCachedItem> memCachedItems = (publishObj.size() > 2 && publishObj.get(2) != null) ? (List<MemCachedItem>) publishObj.get(2) : null;
						long archivesId = saveRiskArchives(auditObject, auditResult, sqlSession);
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
	
	private Long saveRiskArchives(final AuditObject auditObject, final AuditResult auditResult, final SqlSession sqlSession) {
		final RiskArchives riskArchives = new RiskArchives();
		final RiskArchivesMapper mapper = sqlSession.getMapper(RiskArchivesMapper.class);
		return mapper.insertSelective(riskArchives);
	}
	
	private void saveRisks(final AuditResult auditResult, final long archivesId, final SqlSession sqlSession) {
		final List<Risk> riskList = auditResult.getRisks();
		if(riskList == null || riskList.isEmpty()) {
			return;
		}
		final RisksMapper mapper = sqlSession.getMapper(RisksMapper.class);
		for(Risk risk : riskList) {
			Risks risks = new Risks();
			String ruleName = risk.getRuleName();
			risks.setArchivesId(archivesId);
			risks.setRuleName(ruleName);
			risks.setScore(risk.getScore().longValue());
			risks.setComments(risk.getComments());
			risks.setRulePackageName(risk.getRulePackageName());
			if(ruleName != null && !"".equals(ruleName)) {
				final String[] ruleNames = ruleName.split(":");
				risks.setRuleId(ruleNames != null && ruleNames.length > 1 ? ruleNames[1] : "");
			}
			mapper.insertSelective(risks);
		}
	}
}
