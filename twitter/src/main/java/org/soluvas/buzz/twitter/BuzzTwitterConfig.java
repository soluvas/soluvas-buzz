package org.soluvas.buzz.twitter;

import org.soluvas.buzz.core.BuzzSqlConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@EnableJpaRepositories(basePackages="org.soluvas.buzz.twitter")
@Import(BuzzSqlConfig.class)
public class BuzzTwitterConfig {
	
	@Bean
	public TwitterFollowerManager twitterFollowerManager() {
		return new TwitterFollowerManager();
	}

}
