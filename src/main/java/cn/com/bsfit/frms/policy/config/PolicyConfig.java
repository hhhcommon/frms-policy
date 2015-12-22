package cn.com.bsfit.frms.policy.config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jms.connection.CachingConnectionFactory;
import org.springframework.transaction.PlatformTransactionManager;

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
@MapperScan(basePackages = { "cn.com.bsfit.frms.policy.mapper" }, sqlSessionFactoryRef = "policySqlSessionFactory")
public class PolicyConfig {

	@Value("${policy.jdbc.type}")
	private transient String policyJdbcType;
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

	@Bean
	@ConfigurationProperties(prefix = "policy.jdbc")
	public DataSource policyDataSource() {
		return DataSourceBuilder.create().build();
	}

	@Bean
	public SqlSessionFactory policySqlSessionFactory(final @Qualifier("policyDataSource") DataSource dataSource) throws Exception {
		final SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
		bean.setDataSource(dataSource);
		bean.setConfigLocation(new ClassPathResource("MybatisConfig_" + policyJdbcType + ".xml"));
		return bean.getObject();
	}

	@Bean
	public PlatformTransactionManager policyTransactionManager(final @Qualifier("policyDataSource") DataSource dataSource) {
		return new DataSourceTransactionManager(dataSource);
	}
}
