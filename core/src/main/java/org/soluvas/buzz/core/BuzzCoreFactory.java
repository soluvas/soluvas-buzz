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
	 * Returns a new object of class '<em>Twitter Consumer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Twitter Consumer</em>'.
	 * @generated
	 */
	TwitterConsumer createTwitterConsumer();

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
	 * Returns a new object of class '<em>Facebook User Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Facebook User Link</em>'.
	 * @generated
	 */
	FacebookUserLink createFacebookUserLink();

	/**
	 * Returns a new object of class '<em>Facebook Page Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Facebook Page Link</em>'.
	 * @generated
	 */
	FacebookPageLink createFacebookPageLink();

	/**
	 * Returns a new object of class '<em>Facebook Consumer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Facebook Consumer</em>'.
	 * @generated
	 */
	FacebookConsumer createFacebookConsumer();

	/**
	 * Returns a new object of class '<em>Buzz App</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Buzz App</em>'.
	 * @generated
	 */
	BuzzApp createBuzzApp();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BuzzCorePackage getBuzzCorePackage();

} //BuzzCoreFactory
