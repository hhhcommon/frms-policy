package cn.com.bsfit.frms.policy.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.connection.CachingConnectionFactory;

import cn.com.bsfit.frms.policy.jms.RiskArchivesListener;
import cn.com.bsfit.frms.policy.jms.util.BatchMessageListenerContainer;

/**
 * policy配置
 * 
 * @author hjp
 * 
 * @since 1.0.0
 *
 */
@Configuration
public class PolicyConfig {
	
	@Value("${concurrentConsumers:6}")
	private transient int concurrentConsumers;
	@Value("${concurrency:2-9}")
	private transient String concurrency;
	@Value("${maxConcurrentConsumers:15}")
	private transient int maxConcurrentConsumers;
	@Value("${destinationName:FrmsRiskArchiveQueue}")
	private transient String destinationName;
	
	@Bean
	public BatchMessageListenerContainer batchMessageListener(final @Qualifier("cachedConnectionFactory") CachingConnectionFactory cFactory,
			final RiskArchivesListener riskArchivesListener) {
		final BatchMessageListenerContainer container = new BatchMessageListenerContainer();
		container.setConnectionFactory(cFactory);
		container.setDestinationName(destinationName);
		container.setMessageListener(riskArchivesListener);
		// 设置固定的线程数 
		container.setConcurrentConsumers(concurrentConsumers);
		// 设置动态的线程数
		container.setConcurrency(concurrency);
		// 设置最大的线程数
		container.setMaxConcurrentConsumers(maxConcurrentConsumers);
		return container;
	}
}
