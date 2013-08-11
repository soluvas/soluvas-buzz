package org.soluvas.buzz.app;

import java.io.IOException;
import java.util.Map;

import javax.inject.Inject;

import org.soluvas.buzz.core.BuzzAccount;
import org.soluvas.buzz.core.BuzzApp;
import org.soluvas.buzz.core.BuzzConfig;
import org.soluvas.commons.config.MultiTenantWebConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.google.common.base.Preconditions;

/**
 * Multi-tenant configuration class for web.
 * @author ceefour
 */
@Configuration
public class BuzzWebConfig {
	
	@Inject
	private MultiTenantWebConfig webConfig;
	@Inject
	private BuzzConfig buzzConfig;
//	@Autowired @Qualifier("")
//	private Map<String, BuzzApp> buzzApps;
	
	@Bean @Scope("request")
	public BuzzApp buzzApp() throws IOException {
		final String tenantId = webConfig.tenantRef().getTenantId();
		Map<String, BuzzApp> buzzApps = buzzConfig.buzzApps();
		return Preconditions.checkNotNull(buzzApps.get(tenantId), "No BuzzApp for tenant %s. %s available BuzzApps: %s",
				tenantId, buzzApps.size(), buzzApps.keySet());
	}

	/**
	 * Gets the tenant-wide {@link BuzzAccount}.
	 * @return Tenant-wide {@link BuzzAccount}.
	 * @throws IOException
	 */
	@Bean @Scope("request")
	public BuzzAccount buzzAccount() throws IOException {
		final String tenantId = webConfig.tenantRef().getTenantId();
		Map<String, BuzzAccount> buzzAccounts = buzzConfig.buzzAccounts();
		return Preconditions.checkNotNull(buzzAccounts.get(tenantId), "No BuzzAccount for tenant %s. %s available BuzzAccounts: %s",
				tenantId, buzzAccounts.size(), buzzAccounts.keySet());
	}

}
