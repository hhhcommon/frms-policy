package cn.com.bsfit.frms.policy.jms;

import java.util.List;

import javax.jms.JMSException;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.listener.adapter.MessageListenerAdapter;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSON;

import cn.com.bsfit.frms.obj.AuditObject;
import cn.com.bsfit.frms.obj.AuditResult;
import cn.com.bsfit.frms.obj.MemCachedItem;
import cn.com.bsfit.frms.policy.jms.util.SessionAwareBatchMessageListener;

@Component
public class RiskArchivesListener extends MessageListenerAdapter
		implements SessionAwareBatchMessageListener<TextMessage> {

	private final static Logger LOGGER = LoggerFactory.getLogger(RiskArchivesListener.class);

	@SuppressWarnings("unchecked")
	public void onMessages(Session session, List<TextMessage> messages) throws JMSException {
		// TODO
		LOGGER.info("onMessage Thread[{}]", Thread.currentThread());
		if (messages == null || messages.isEmpty()) {
			LOGGER.warn("No messages available!");
			return;
		}
		LOGGER.info("RiskArchivesListener received [{}] msgs", messages.size());
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
					}
				}
			}
		} catch (Exception e) {

		}
	}
	
	private Long saveRiskArchives(AuditObject auditObject, AuditResult auditResult) {
		return null;
	}
}
