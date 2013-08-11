/**
 */
package org.soluvas.buzz.core.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.soluvas.buzz.core.BuzzAccount;
import org.soluvas.buzz.core.BuzzAccounts;
import org.soluvas.buzz.core.BuzzApp;
import org.soluvas.buzz.core.BuzzCoreFactory;
import org.soluvas.buzz.core.BuzzCorePackage;
import org.soluvas.buzz.core.FacebookConsumer;
import org.soluvas.buzz.core.FacebookPageLink;
import org.soluvas.buzz.core.FacebookUserLink;
import org.soluvas.buzz.core.SocialLink;
import org.soluvas.buzz.core.TwitterConsumer;
import org.soluvas.buzz.core.TwitterUserLink;
import org.soluvas.commons.CommonsPackage;

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
	private EClass twitterConsumerEClass = null;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass facebookUserLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass facebookPageLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass facebookConsumerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass socialLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buzzAppEClass = null;

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

		// Initialize simple dependencies
		CommonsPackage.eINSTANCE.eClass();

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
	public EReference getBuzzAccount_SocialLinks() {
		return (EReference)buzzAccountEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTwitterConsumer() {
		return twitterConsumerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTwitterConsumer_ConsumerKey() {
		return (EAttribute)twitterConsumerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTwitterConsumer_ConsumerSecret() {
		return (EAttribute)twitterConsumerEClass.getEStructuralFeatures().get(1);
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
	public EClass getFacebookUserLink() {
		return facebookUserLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFacebookPageLink() {
		return facebookPageLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFacebookConsumer() {
		return facebookConsumerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFacebookConsumer_AppId() {
		return (EAttribute)facebookConsumerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFacebookConsumer_AppKey() {
		return (EAttribute)facebookConsumerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSocialLink() {
		return socialLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSocialLink_ExpiryTime() {
		return (EAttribute)socialLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSocialLink_Permissions() {
		return (EAttribute)socialLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBuzzApp() {
		return buzzAppEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBuzzApp_TwitterConsumer() {
		return (EReference)buzzAppEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBuzzApp_FacebookConsumer() {
		return (EReference)buzzAppEClass.getEStructuralFeatures().get(1);
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
		createEReference(buzzAccountEClass, BUZZ_ACCOUNT__SOCIAL_LINKS);

		twitterConsumerEClass = createEClass(TWITTER_CONSUMER);
		createEAttribute(twitterConsumerEClass, TWITTER_CONSUMER__CONSUMER_KEY);
		createEAttribute(twitterConsumerEClass, TWITTER_CONSUMER__CONSUMER_SECRET);

		buzzAccountsEClass = createEClass(BUZZ_ACCOUNTS);
		createEReference(buzzAccountsEClass, BUZZ_ACCOUNTS__ACCOUNTS);

		twitterUserLinkEClass = createEClass(TWITTER_USER_LINK);
		createEAttribute(twitterUserLinkEClass, TWITTER_USER_LINK__TOKEN);
		createEAttribute(twitterUserLinkEClass, TWITTER_USER_LINK__TOKEN_SECRET);
		createEAttribute(twitterUserLinkEClass, TWITTER_USER_LINK__TWITTER_ID);
		createEAttribute(twitterUserLinkEClass, TWITTER_USER_LINK__SCREEN_NAME);

		facebookUserLinkEClass = createEClass(FACEBOOK_USER_LINK);

		facebookPageLinkEClass = createEClass(FACEBOOK_PAGE_LINK);

		facebookConsumerEClass = createEClass(FACEBOOK_CONSUMER);
		createEAttribute(facebookConsumerEClass, FACEBOOK_CONSUMER__APP_ID);
		createEAttribute(facebookConsumerEClass, FACEBOOK_CONSUMER__APP_KEY);

		socialLinkEClass = createEClass(SOCIAL_LINK);
		createEAttribute(socialLinkEClass, SOCIAL_LINK__EXPIRY_TIME);
		createEAttribute(socialLinkEClass, SOCIAL_LINK__PERMISSIONS);

		buzzAppEClass = createEClass(BUZZ_APP);
		createEReference(buzzAppEClass, BUZZ_APP__TWITTER_CONSUMER);
		createEReference(buzzAppEClass, BUZZ_APP__FACEBOOK_CONSUMER);
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

		// Obtain other dependent packages
		CommonsPackage theCommonsPackage = (CommonsPackage)EPackage.Registry.INSTANCE.getEPackage(CommonsPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		buzzAccountEClass.getESuperTypes().add(theCommonsPackage.getIdentifiable());
		twitterUserLinkEClass.getESuperTypes().add(this.getSocialLink());
		facebookUserLinkEClass.getESuperTypes().add(this.getSocialLink());
		facebookPageLinkEClass.getESuperTypes().add(this.getSocialLink());

		// Initialize classes and features; add operations and parameters
		initEClass(buzzAccountEClass, BuzzAccount.class, "BuzzAccount", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBuzzAccount_SocialLinks(), this.getSocialLink(), null, "socialLinks", null, 0, -1, BuzzAccount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(buzzAccountEClass, this.getTwitterUserLink(), "getTwitterUser", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(buzzAccountEClass, this.getFacebookUserLink(), "getFacebookUser", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(buzzAccountEClass, this.getFacebookPageLink(), "getFacebookPage", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(twitterConsumerEClass, TwitterConsumer.class, "TwitterConsumer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTwitterConsumer_ConsumerKey(), ecorePackage.getEString(), "consumerKey", null, 0, 1, TwitterConsumer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTwitterConsumer_ConsumerSecret(), ecorePackage.getEString(), "consumerSecret", null, 0, 1, TwitterConsumer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(buzzAccountsEClass, BuzzAccounts.class, "BuzzAccounts", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBuzzAccounts_Accounts(), this.getBuzzAccount(), null, "accounts", null, 0, -1, BuzzAccounts.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(twitterUserLinkEClass, TwitterUserLink.class, "TwitterUserLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTwitterUserLink_Token(), ecorePackage.getEString(), "token", null, 0, 1, TwitterUserLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTwitterUserLink_TokenSecret(), ecorePackage.getEString(), "tokenSecret", null, 0, 1, TwitterUserLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTwitterUserLink_TwitterId(), ecorePackage.getELongObject(), "twitterId", null, 0, 1, TwitterUserLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTwitterUserLink_ScreenName(), ecorePackage.getEString(), "screenName", null, 0, 1, TwitterUserLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(facebookUserLinkEClass, FacebookUserLink.class, "FacebookUserLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(facebookPageLinkEClass, FacebookPageLink.class, "FacebookPageLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(facebookConsumerEClass, FacebookConsumer.class, "FacebookConsumer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFacebookConsumer_AppId(), ecorePackage.getEString(), "appId", null, 0, 1, FacebookConsumer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFacebookConsumer_AppKey(), ecorePackage.getEString(), "appKey", null, 0, 1, FacebookConsumer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(socialLinkEClass, SocialLink.class, "SocialLink", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSocialLink_ExpiryTime(), theCommonsPackage.getDateTime(), "expiryTime", null, 0, 1, SocialLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSocialLink_Permissions(), theEcorePackage.getEString(), "permissions", null, 0, -1, SocialLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(buzzAppEClass, BuzzApp.class, "BuzzApp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBuzzApp_TwitterConsumer(), this.getTwitterConsumer(), null, "twitterConsumer", null, 0, 1, BuzzApp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBuzzApp_FacebookConsumer(), this.getFacebookConsumer(), null, "facebookConsumer", null, 0, 1, BuzzApp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		  (buzzAccountEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "documentation", "Get the primary TwitterUserLink, if any."
		   });		
		addAnnotation
		  (buzzAccountEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
			 "documentation", "Get the primary Facebook User Link, if any."
		   });		
		addAnnotation
		  (buzzAccountEClass.getEOperations().get(2), 
		   source, 
		   new String[] {
			 "documentation", "Get the primary Facebook Page Link, if any."
		   });		
		addAnnotation
		  (getBuzzAccount_SocialLinks(), 
		   source, 
		   new String[] {
			 "documentation", "Collection of OAuth credentials for each registered Social Link."
		   });		
		addAnnotation
		  (twitterConsumerEClass, 
		   source, 
		   new String[] {
			 "documentation", "OAuth consumer (not user) info on Twitter for the app itself.\n\nApps include:\n1. Buzz Cloud\n2. AksiMata\n3. GaulDong"
		   });		
		addAnnotation
		  (buzzAccountsEClass, 
		   source, 
		   new String[] {
			 "documentation", "A catalog of Buzz Accounts. It not used by DB, only used by XMI."
		   });		
		addAnnotation
		  (facebookConsumerEClass, 
		   source, 
		   new String[] {
			 "documentation", "OAuth consumer (not user) info on Twitter for the app itself.\n\nApps include:\n1. Buzz Cloud\n2. AksiMata\n3. GaulDong"
		   });		
		addAnnotation
		  (socialLinkEClass, 
		   source, 
		   new String[] {
			 "documentation", "A social media integration link between an app and an external user, containing:\n1. Type (as concrete class)\n2. ID\n3. Username\n4. OAuth token (and optionally, secret)\n5. Token expiry\n\nThe relationship between the external user (i.e. Arum on Facebook) to an internal user (i.e. Arum on AksiMata) is unspecified."
		   });		
		addAnnotation
		  (getSocialLink_ExpiryTime(), 
		   source, 
		   new String[] {
			 "documentation", "Expiry time of this Social Link token, if known."
		   });		
		addAnnotation
		  (getSocialLink_Permissions(), 
		   source, 
		   new String[] {
			 "documentation", "Social media provider-specific permissions (scope) granted to this Social Link token.\nFacebook uses this (partial permissions is possible). Twitter doesn\'t (either yes or no).\nOperations may optionally check this to ensure required permissions are allowed before posting."
		   });		
		addAnnotation
		  (buzzAppEClass, 
		   source, 
		   new String[] {
			 "documentation", "Tenant-wide Buzz consumer credentials.\n\nNote: SocialLinks should be stored *separate* to BuzzApp, because consumer credentials are fixed,\nwhile social tokens are temporary/revokable (esp. for Facebook)."
		   });		
		addAnnotation
		  (getBuzzApp_TwitterConsumer(), 
		   source, 
		   new String[] {
			 "documentation", "OAuth consumer (not user) info on Twitter for the app itself.\n\nApps include:\n1. Buzz Cloud\n2. AksiMata\n3. GaulDong"
		   });
	}

} //BuzzCorePackageImpl
