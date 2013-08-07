package org.soluvas.buzz.app;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.PropertySource;

/**
 * @author ceefour
 *
 */
@Configuration @Lazy
@PropertySource("classpath:/META-INF/buzz.properties")
public class AppConfig {
	
//	@Bean
//	public FrequencyJobApplication webApp() {
//		return new FrequencyJobApplication();
//	}
	
}
