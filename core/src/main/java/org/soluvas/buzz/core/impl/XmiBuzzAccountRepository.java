package org.soluvas.buzz.core.impl;

import org.eclipse.emf.common.util.EList;
import org.soluvas.buzz.core.BuzzAccount;
import org.soluvas.buzz.core.BuzzAccountRepository;
import org.soluvas.data.repository.XmiRepositoryBase;

/**
 * @author ceefour
 *
 */
public class XmiBuzzAccountRepository extends XmiRepositoryBase<BuzzAccount> 
	implements BuzzAccountRepository {

	@Override
	public EList<BuzzAccount> getRoot() {
		// FIXME Auto-generated method stub
		return null;
	}

}
