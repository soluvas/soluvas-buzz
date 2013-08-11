/**
 */
package org.soluvas.buzz.core;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Buzz Accounts</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A catalog of Buzz Accounts. It not used by DB, only used by XMI.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.soluvas.buzz.core.BuzzAccounts#getAccounts <em>Accounts</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.soluvas.buzz.core.BuzzCorePackage#getBuzzAccounts()
 * @model
 * @generated
 */
public interface BuzzAccounts extends EObject {
	/**
	 * Returns the value of the '<em><b>Accounts</b></em>' containment reference list.
	 * The list contents are of type {@link org.soluvas.buzz.core.BuzzAccount}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accounts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accounts</em>' containment reference list.
	 * @see org.soluvas.buzz.core.BuzzCorePackage#getBuzzAccounts_Accounts()
	 * @model containment="true"
	 * @generated
	 */
	EList<BuzzAccount> getAccounts();

} // BuzzAccounts
