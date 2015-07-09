package org.soluvas.buzz.core;

import java.io.IOException;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.soluvas.buzz.core.impl.JsonBuzzAccountRepository;
import org.soluvas.commons.OnDemandXmiLoader;
import org.soluvas.commons.ResourceType;
import org.soluvas.json.JsonUtils;
import org.soluvas.json.LowerEnumSerializer;
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

	static {
		LowerEnumSerializer.LOWER = false;
	}

	/**
	 * Tenant-specific BuzzApp configurations.
	 * The key is ${tenantId}.
	 * @return
	 * @throws IOException 
	 */
	@Bean
	public Map<String, BuzzApp> buzzApps() throws IOException {
		final Resource[] resources = new PathMatchingResourcePatternResolver(BuzzConfig.class.getClassLoader())
			.getResources("file:config/*.BuzzApp.jsonld");
		log.info("Loading {} BuzzApp resources from config folder: {}", resources.length, resources);
		Pattern tenantIdPattern = Pattern.compile("([^.]+).+");
		final ImmutableMap.Builder<String, BuzzApp> builder = ImmutableMap.builder();
		for (Resource res : resources) {
			Matcher tenantIdMatcher = tenantIdPattern.matcher(res.getFilename());
			Preconditions.checkState(tenantIdMatcher.matches(), "Invalid BuzzApp resource name: %s", res.getFilename());
			String tenantId = tenantIdMatcher.group(1);
			final BuzzApp buzzApp = JsonUtils.mapper.readValue(res.getFile(), BuzzApp.class);
			builder.put(tenantId, buzzApp);
		}
		return builder.build();
	}
	
	/**
	 * Tenant-specific {@link BuzzAccount} ({@link SocialLink}s container).
	 * The key depend is from filename.
	 * For loading from config folder, only "buzz" tenantId is supported.
	 * @return
	 * @throws IOException 
	 */
	@Bean
	public JsonBuzzAccountRepository buzzAccountRepo() throws IOException {
		final JsonBuzzAccountRepository buzzAccountRepo = new JsonBuzzAccountRepository();
		final Resource[] resources = new PathMatchingResourcePatternResolver(BuzzConfig.class.getClassLoader())
			.getResources("file:config/*.BuzzAccount.jsonld");
		log.info("Loading {} BuzzAccount resources from config folder: {}", resources.length, resources);
		Pattern accountIdPattern = Pattern.compile("([^.]+).+");
		for (Resource res : resources) {
			Matcher accountIdMatcher = accountIdPattern.matcher(res.getFilename());
			Preconditions.checkState(accountIdMatcher.matches(), "Invalid BuzzAccount resource name: %s", res.getFilename());
			String accountId = accountIdMatcher.group(1);
			final BuzzAccount buzzAccount = JsonUtils.mapper.readValue(res.getFile(), BuzzAccount.class);
			buzzAccountRepo.put("buzz", accountId, buzzAccount);
		}
		return buzzAccountRepo;
	}
	
}
