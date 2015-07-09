package org.soluvas.buzz.core;

import java.util.List;

/**
 * @author ceefour
 *
 */
public interface BuzzAccountRepository {

	List<BuzzAccount> getRoot(String tenantId);

}
