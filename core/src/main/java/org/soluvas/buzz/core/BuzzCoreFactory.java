/**
 */
package org.soluvas.buzz.core;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.soluvas.buzz.core.BuzzCorePackage
 * @generated
 */
public interface BuzzCoreFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BuzzCoreFactory eINSTANCE = org.soluvas.buzz.core.impl.BuzzCoreFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Buzz Account</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Buzz Account</em>'.
	 * @generated
	 */
	BuzzAccount createBuzzAccount();

	/**
	 * Returns a new object of class '<em>Twitter App Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Twitter App Link</em>'.
	 * @generated
	 */
	TwitterAppLink createTwitterAppLink();

	/**
	 * Returns a new object of class '<em>Buzz Accounts</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Buzz Accounts</em>'.
	 * @generated
	 */
	BuzzAccounts createBuzzAccounts();

	/**
	 * Returns a new object of class '<em>Twitter User Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Twitter User Link</em>'.
	 * @generated
	 */
	TwitterUserLink createTwitterUserLink();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BuzzCorePackage getBuzzCorePackage();

} //BuzzCoreFactory
