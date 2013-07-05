/**
 */
package org.soluvas.buzz.core.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.soluvas.buzz.core.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BuzzCoreFactoryImpl extends EFactoryImpl implements BuzzCoreFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BuzzCoreFactory init() {
		try {
			BuzzCoreFactory theBuzzCoreFactory = (BuzzCoreFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.soluvas.org/schema/buzz-core/1.0"); 
			if (theBuzzCoreFactory != null) {
				return theBuzzCoreFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BuzzCoreFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuzzCoreFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case BuzzCorePackage.BUZZ_ACCOUNT: return createBuzzAccount();
			case BuzzCorePackage.TWITTER_LINK: return createTwitterLink();
			case BuzzCorePackage.BUZZ_ACCOUNTS: return createBuzzAccounts();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuzzAccount createBuzzAccount() {
		BuzzAccountImpl buzzAccount = new BuzzAccountImpl();
		return buzzAccount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TwitterLink createTwitterLink() {
		TwitterLinkImpl twitterLink = new TwitterLinkImpl();
		return twitterLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuzzAccounts createBuzzAccounts() {
		BuzzAccountsImpl buzzAccounts = new BuzzAccountsImpl();
		return buzzAccounts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuzzCorePackage getBuzzCorePackage() {
		return (BuzzCorePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BuzzCorePackage getPackage() {
		return BuzzCorePackage.eINSTANCE;
	}

} //BuzzCoreFactoryImpl
