package org.soluvas.buzz.core.impl;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import org.soluvas.buzz.core.BuzzAccount;
import org.soluvas.buzz.core.BuzzAccountRepository;
import org.soluvas.data.EntityLookupException;
import org.soluvas.data.LookupKey;
import org.soluvas.data.StatusMask;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * @author ceefour
 *
 */
public class JsonBuzzAccountRepository implements BuzzAccountRepository {

	private Map<String, Map<String, BuzzAccount>> buzzAccounts = new LinkedHashMap<>();

	@Override
	public List<BuzzAccount> findAll(String tenantId) {
		return ImmutableList.copyOf(Optional.ofNullable(buzzAccounts.get(tenantId))
				.orElse(ImmutableMap.of()).values());
	}

	@Override
	public BuzzAccount findOne(String tenantId, String accountId) throws EntityLookupException {
		if (buzzAccounts.containsKey(tenantId) && buzzAccounts.get(tenantId).containsKey(accountId)) {
			return buzzAccounts.get(tenantId).get(accountId);
		} else {
			throw new EntityLookupException(BuzzAccount.class, StatusMask.RAW, LookupKey.ID, tenantId + "/" + accountId);
		}
	}

	public void put(String tenantId, String accountId, BuzzAccount buzzAccount) {
		if (!buzzAccounts.containsKey(tenantId)) {
			buzzAccounts.put(tenantId, new LinkedHashMap<>());
		}
		buzzAccounts.get(tenantId).put(accountId, buzzAccount);
	}

}
