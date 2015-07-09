package org.soluvas.buzz.core;

import org.soluvas.data.EntityLookupException;

import java.util.List;

/**
 * @author ceefour
 *
 */
public interface BuzzAccountRepository {

	List<BuzzAccount> findAll(String tenantId);
	BuzzAccount findOne(String tenantId, String accountId) throws EntityLookupException;

}
