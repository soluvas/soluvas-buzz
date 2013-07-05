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
import org.soluvas.buzz.core.TwitterAppLink;
import org.soluvas.buzz.core.TwitterUserLink;

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
	private EClass twitterAppLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buzzAccountsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass twitterUserLinkEClass = null;

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
	@Override
	public EClass getBuzzAccount() {
		return buzzAccountEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBuzzAccount_TwitterApp() {
		return (EReference)buzzAccountEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBuzzAccount_Id() {
		return (EAttribute)buzzAccountEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBuzzAccount_TwitterAppUser() {
		return (EReference)buzzAccountEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBuzzAccount_TwitterUsers() {
		return (EReference)buzzAccountEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTwitterAppLink() {
		return twitterAppLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTwitterAppLink_ConsumerKey() {
		return (EAttribute)twitterAppLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTwitterAppLink_ConsumerSecret() {
		return (EAttribute)twitterAppLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBuzzAccounts() {
		return buzzAccountsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBuzzAccounts_Accounts() {
		return (EReference)buzzAccountsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTwitterUserLink() {
		return twitterUserLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTwitterUserLink_Token() {
		return (EAttribute)twitterUserLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTwitterUserLink_TokenSecret() {
		return (EAttribute)twitterUserLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTwitterUserLink_TwitterId() {
		return (EAttribute)twitterUserLinkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTwitterUserLink_ScreenName() {
		return (EAttribute)twitterUserLinkEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
		createEReference(buzzAccountEClass, BUZZ_ACCOUNT__TWITTER_APP);
		createEAttribute(buzzAccountEClass, BUZZ_ACCOUNT__ID);
		createEReference(buzzAccountEClass, BUZZ_ACCOUNT__TWITTER_APP_USER);
		createEReference(buzzAccountEClass, BUZZ_ACCOUNT__TWITTER_USERS);

		twitterAppLinkEClass = createEClass(TWITTER_APP_LINK);
		createEAttribute(twitterAppLinkEClass, TWITTER_APP_LINK__CONSUMER_KEY);
		createEAttribute(twitterAppLinkEClass, TWITTER_APP_LINK__CONSUMER_SECRET);

		buzzAccountsEClass = createEClass(BUZZ_ACCOUNTS);
		createEReference(buzzAccountsEClass, BUZZ_ACCOUNTS__ACCOUNTS);

		twitterUserLinkEClass = createEClass(TWITTER_USER_LINK);
		createEAttribute(twitterUserLinkEClass, TWITTER_USER_LINK__TOKEN);
		createEAttribute(twitterUserLinkEClass, TWITTER_USER_LINK__TOKEN_SECRET);
		createEAttribute(twitterUserLinkEClass, TWITTER_USER_LINK__TWITTER_ID);
		createEAttribute(twitterUserLinkEClass, TWITTER_USER_LINK__SCREEN_NAME);
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
		initEReference(getBuzzAccount_TwitterApp(), this.getTwitterAppLink(), null, "twitterApp", null, 0, 1, BuzzAccount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBuzzAccount_Id(), ecorePackage.getEString(), "id", null, 1, 1, BuzzAccount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBuzzAccount_TwitterAppUser(), this.getTwitterUserLink(), null, "twitterAppUser", null, 0, 1, BuzzAccount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBuzzAccount_TwitterUsers(), this.getTwitterUserLink(), null, "twitterUsers", null, 0, -1, BuzzAccount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(twitterAppLinkEClass, TwitterAppLink.class, "TwitterAppLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTwitterAppLink_ConsumerKey(), ecorePackage.getEString(), "consumerKey", null, 0, 1, TwitterAppLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTwitterAppLink_ConsumerSecret(), ecorePackage.getEString(), "consumerSecret", null, 0, 1, TwitterAppLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(buzzAccountsEClass, BuzzAccounts.class, "BuzzAccounts", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBuzzAccounts_Accounts(), this.getBuzzAccount(), null, "accounts", null, 0, -1, BuzzAccounts.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(twitterUserLinkEClass, TwitterUserLink.class, "TwitterUserLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTwitterUserLink_Token(), ecorePackage.getEString(), "token", null, 0, 1, TwitterUserLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTwitterUserLink_TokenSecret(), ecorePackage.getEString(), "tokenSecret", null, 0, 1, TwitterUserLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTwitterUserLink_TwitterId(), ecorePackage.getELongObject(), "twitterId", null, 0, 1, TwitterUserLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTwitterUserLink_ScreenName(), ecorePackage.getEString(), "screenName", null, 0, 1, TwitterUserLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/GenModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenModelAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/GenModel";		
		addAnnotation
		  (getBuzzAccount_TwitterApp(), 
		   source, 
		   new String[] {
			 "documentation", "OAuth consumer info on Twitter for the app itself."
		   });		
		addAnnotation
		  (getBuzzAccount_TwitterAppUser(), 
		   source, 
		   new String[] {
			 "documentation", "OAuth credentials for the app\'s Twitter user."
		   });		
		addAnnotation
		  (getBuzzAccount_TwitterUsers(), 
		   source, 
		   new String[] {
			 "documentation", "Collection of OAuth credentials for each registered Twitter user."
		   });
	}

} //BuzzCorePackageImpl
