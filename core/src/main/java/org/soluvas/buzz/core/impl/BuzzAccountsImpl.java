/**
 */
package org.soluvas.buzz.core.impl;

import org.soluvas.buzz.core.BuzzAccount;
import org.soluvas.buzz.core.BuzzAccounts;

import java.util.ArrayList;
import java.util.List;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Buzz Accounts</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.soluvas.buzz.core.impl.BuzzAccountsImpl#getAccounts <em>Accounts</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BuzzAccountsImpl implements BuzzAccounts {
	/**
	 * The cached value of the '{@link #getAccounts() <em>Accounts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccounts()
	 * @generated
	 * @ordered
	 */
	protected List<BuzzAccount> accounts = new ArrayList<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuzzAccountsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<BuzzAccount> getAccounts() {
		return accounts;
	}

} //BuzzAccountsImpl
