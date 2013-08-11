package org.soluvas.buzz.app;

import java.sql.SQLException;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.soluvas.buzz.core.BuzzConfig;
import org.soluvas.commons.config.MultiTenantWebConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import com.google.common.eventbus.EventBus;
import com.mchange.v2.c3p0.DataSources;
import com.mchange.v2.c3p0.PooledDataSource;

/**
 * @author ceefour
 *
 */
@Configuration @Lazy
@PropertySource("classpath:/META-INF/buzz.properties")
@Import({BuzzConfig.class, // app-wide configs
	MultiTenantWebConfig.class, // common web config
	BuzzWebConfig.class // tenant-scoped configs
	})
public class AppConfig {
	
	@Inject
	private Environment env;
	
	@Bean
	public BuzzApplication webApp() {
		return new BuzzApplication();
	}
	
	@Bean(destroyMethod="close")
	public PooledDataSource dataSource() throws IllegalStateException, SQLException {
		final DataSource unpooled = DataSources.unpooledDataSource(env.getRequiredProperty("jpaUrl"), 
				env.getProperty("jpaUser"), env.getProperty("jpaPassword"));
		return (PooledDataSource) DataSources.pooledDataSource(unpooled);
	}
	
	@Bean
	public EventBus eventBus() {
		return new EventBus();
	}

}
