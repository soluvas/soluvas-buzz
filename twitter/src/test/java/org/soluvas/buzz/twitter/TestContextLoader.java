package org.soluvas.buzz.twitter;

import java.io.IOException;

import org.springframework.context.support.GenericApplicationContext;
import org.springframework.core.io.support.ResourcePropertySource;
import org.springframework.test.context.MergedContextConfiguration;
import org.springframework.test.context.support.GenericXmlContextLoader;

/**
 * @author ceefour
 *
 */
public class TestContextLoader extends GenericXmlContextLoader {
	
	@Override
	protected void loadBeanDefinitions(GenericApplicationContext context,
			MergedContextConfiguration mergedConfig) {
		try {
			final ResourcePropertySource propertySource = new ResourcePropertySource("classpath:/META-INF/jpa.properties", TestContextLoader.class.getClassLoader());
			context.getEnvironment().getPropertySources().addLast(propertySource);
		} catch (IOException e) {
			throw new RuntimeException("Cannot add PropertySource", e);
		}
		super.loadBeanDefinitions(context, mergedConfig);
	}

}
