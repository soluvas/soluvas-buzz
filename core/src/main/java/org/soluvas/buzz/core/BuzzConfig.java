package org.soluvas.buzz.core;

import java.io.IOException;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.soluvas.commons.OnDemandXmiLoader;
import org.soluvas.commons.ResourceType;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;

/**
 * @author ceefour
 *
 */
@Configuration
public class BuzzConfig {
	private static final Logger log = LoggerFactory.getLogger(BuzzConfig.class);
	
	/**
	 * Tenant-specific BuzzApp configurations.
	 * The key is ${tenantId}.
	 * @return
	 * @throws IOException 
	 */
	@Bean
	public Map<String, BuzzApp> buzzApps() throws IOException {
		final Resource[] resources = new PathMatchingResourcePatternResolver(BuzzConfig.class.getClassLoader())
			.getResources("classpath*:/META-INF/*.BuzzApp.xmi");
		log.info("Loading {} BuzzApp resources from classpath: {}", resources.length, resources);
		Pattern tenantIdPattern = Pattern.compile("([^.]+).+");
		ImmutableMap.Builder<String, BuzzApp> builder = ImmutableMap.builder();
		for (Resource res : resources) {
			Matcher tenantIdMatcher = tenantIdPattern.matcher(res.getFilename());
			Preconditions.checkState(tenantIdMatcher.matches(), "Invalid BuzzApp resource name: %s", res.getFilename());
			String tenantId = tenantIdMatcher.group(1);
			BuzzApp buzzApp = new OnDemandXmiLoader<BuzzApp>(BuzzCorePackage.eINSTANCE, res.getURL(), ResourceType.CLASSPATH).get();
			builder.put(tenantId, buzzApp);
		}
		return builder.build();
	}
	
	/**
	 * Tenant-specific {@link BuzzAccount} ({@link SocialLink}s container).
	 * The key is ${tenantId}.
	 * @return
	 * @throws IOException 
	 */
	@Bean
	public Map<String, BuzzAccount> buzzAccounts() throws IOException {
		final Resource[] resources = new PathMatchingResourcePatternResolver(BuzzConfig.class.getClassLoader())
			.getResources("classpath*:/META-INF/*.BuzzAccount.xmi");
		log.info("Loading {} BuzzAccount resources from classpath: {}", resources.length, resources);
		Pattern tenantIdPattern = Pattern.compile("([^.]+).+");
		ImmutableMap.Builder<String, BuzzAccount> builder = ImmutableMap.builder();
		for (Resource res : resources) {
			Matcher tenantIdMatcher = tenantIdPattern.matcher(res.getFilename());
			Preconditions.checkState(tenantIdMatcher.matches(), "Invalid BuzzAccount resource name: %s", res.getFilename());
			String tenantId = tenantIdMatcher.group(1);
			BuzzAccount buzzAccount = new OnDemandXmiLoader<BuzzAccount>(BuzzCorePackage.eINSTANCE, res.getURL(), ResourceType.CLASSPATH).get();
			builder.put(tenantId, buzzAccount);
		}
		return builder.build();
	}
	
}
