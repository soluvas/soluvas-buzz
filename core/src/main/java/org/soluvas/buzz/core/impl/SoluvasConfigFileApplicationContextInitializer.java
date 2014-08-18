package org.soluvas.buzz.core.impl;

import org.soluvas.commons.tenant.RequestOrCommandScope;
import org.springframework.beans.factory.config.CustomScopeConfigurer;
import org.springframework.boot.test.ConfigFileApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.context.WebApplicationContext;

import com.google.common.collect.ImmutableMap;

/**
 * Used for testing, but have to be in {@code src/main/java} because depended by other projects.
 * <p>http://blog.jamesdbloom.com/UsingPropertySourceAndEnvironment.html
 * @author atang
 * @see AppInitializer
 */
public class SoluvasConfigFileApplicationContextInitializer extends ConfigFileApplicationContextInitializer {

	@Override
	public void initialize(ConfigurableApplicationContext applicationContext) {
		super.initialize(applicationContext);
		final CustomScopeConfigurer scopeConfigurer = new CustomScopeConfigurer();
		scopeConfigurer.setScopes(ImmutableMap.<String, Object>of(WebApplicationContext.SCOPE_REQUEST, new RequestOrCommandScope()));
		applicationContext.addBeanFactoryPostProcessor(scopeConfigurer);
	}

}
