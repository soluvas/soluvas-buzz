/**
 */
package org.soluvas.buzz.core.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.soluvas.buzz.core.BuzzAccount;
import org.soluvas.buzz.core.BuzzAccounts;
import org.soluvas.buzz.core.BuzzCoreFactory;
import org.soluvas.buzz.core.BuzzCorePackage;
import org.soluvas.buzz.core.TwitterLink;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BuzzCorePackageImpl extends EPackageImpl implements BuzzCorePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buzzAccountEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass twitterLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buzzAccountsEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.soluvas.buzz.core.BuzzCorePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BuzzCorePackageImpl() {
		super(eNS_URI, BuzzCoreFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link BuzzCorePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BuzzCorePackage init() {
		if (isInited) return (BuzzCorePackage)EPackage.Registry.INSTANCE.getEPackage(BuzzCorePackage.eNS_URI);

		// Obtain or create and register package
		BuzzCorePackageImpl theBuzzCorePackage = (BuzzCorePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof BuzzCorePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new BuzzCorePackageImpl());

		isInited = true;

		// Create package meta-data objects
		theBuzzCorePackage.createPackageContents();

		// Initialize created meta-data
		theBuzzCorePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBuzzCorePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BuzzCorePackage.eNS_URI, theBuzzCorePackage);
		return theBuzzCorePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBuzzAccount() {
		return buzzAccountEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBuzzAccount_Twitter() {
		return (EReference)buzzAccountEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBuzzAccount_Id() {
		return (EAttribute)buzzAccountEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTwitterLink() {
		return twitterLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTwitterLink_ConsumerKey() {
		return (EAttribute)twitterLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTwitterLink_ConsumerSecret() {
		return (EAttribute)twitterLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTwitterLink_Token() {
		return (EAttribute)twitterLinkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTwitterLink_TokenSecret() {
		return (EAttribute)twitterLinkEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTwitterLink_ScreenName() {
		return (EAttribute)twitterLinkEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTwitterLink_TwitterId() {
		return (EAttribute)twitterLinkEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBuzzAccounts() {
		return buzzAccountsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBuzzAccounts_Accounts() {
		return (EReference)buzzAccountsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuzzCoreFactory getBuzzCoreFactory() {
		return (BuzzCoreFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		buzzAccountEClass = createEClass(BUZZ_ACCOUNT);
		createEReference(buzzAccountEClass, BUZZ_ACCOUNT__TWITTER);
		createEAttribute(buzzAccountEClass, BUZZ_ACCOUNT__ID);

		twitterLinkEClass = createEClass(TWITTER_LINK);
		createEAttribute(twitterLinkEClass, TWITTER_LINK__CONSUMER_KEY);
		createEAttribute(twitterLinkEClass, TWITTER_LINK__CONSUMER_SECRET);
		createEAttribute(twitterLinkEClass, TWITTER_LINK__TOKEN);
		createEAttribute(twitterLinkEClass, TWITTER_LINK__TOKEN_SECRET);
		createEAttribute(twitterLinkEClass, TWITTER_LINK__SCREEN_NAME);
		createEAttribute(twitterLinkEClass, TWITTER_LINK__TWITTER_ID);

		buzzAccountsEClass = createEClass(BUZZ_ACCOUNTS);
		createEReference(buzzAccountsEClass, BUZZ_ACCOUNTS__ACCOUNTS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(buzzAccountEClass, BuzzAccount.class, "BuzzAccount", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBuzzAccount_Twitter(), this.getTwitterLink(), null, "twitter", null, 0, 1, BuzzAccount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBuzzAccount_Id(), ecorePackage.getEString(), "id", null, 1, 1, BuzzAccount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(twitterLinkEClass, TwitterLink.class, "TwitterLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTwitterLink_ConsumerKey(), ecorePackage.getEString(), "consumerKey", null, 0, 1, TwitterLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTwitterLink_ConsumerSecret(), ecorePackage.getEString(), "consumerSecret", null, 0, 1, TwitterLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTwitterLink_Token(), ecorePackage.getEString(), "token", null, 0, 1, TwitterLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTwitterLink_TokenSecret(), ecorePackage.getEString(), "tokenSecret", null, 0, 1, TwitterLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTwitterLink_ScreenName(), ecorePackage.getEString(), "screenName", null, 0, 1, TwitterLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTwitterLink_TwitterId(), ecorePackage.getELongObject(), "twitterId", null, 0, 1, TwitterLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(buzzAccountsEClass, BuzzAccounts.class, "BuzzAccounts", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBuzzAccounts_Accounts(), this.getBuzzAccount(), null, "accounts", null, 0, -1, BuzzAccounts.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //BuzzCorePackageImpl
