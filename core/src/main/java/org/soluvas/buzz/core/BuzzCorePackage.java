/**
 */
package org.soluvas.buzz.core;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.soluvas.commons.CommonsPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.soluvas.buzz.core.BuzzCoreFactory
 * @model kind="package"
 * @generated
 */
public interface BuzzCorePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "core";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.soluvas.org/schema/buzz-core/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "buzz-core";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BuzzCorePackage eINSTANCE = org.soluvas.buzz.core.impl.BuzzCorePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.soluvas.buzz.core.impl.BuzzAccountImpl <em>Buzz Account</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.soluvas.buzz.core.impl.BuzzAccountImpl
	 * @see org.soluvas.buzz.core.impl.BuzzCorePackageImpl#getBuzzAccount()
	 * @generated
	 */
	int BUZZ_ACCOUNT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUZZ_ACCOUNT__ID = CommonsPackage.IDENTIFIABLE__ID;

	/**
	 * The feature id for the '<em><b>Social Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUZZ_ACCOUNT__SOCIAL_LINKS = CommonsPackage.IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Buzz Account</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUZZ_ACCOUNT_FEATURE_COUNT = CommonsPackage.IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.soluvas.buzz.core.impl.TwitterConsumerImpl <em>Twitter Consumer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.soluvas.buzz.core.impl.TwitterConsumerImpl
	 * @see org.soluvas.buzz.core.impl.BuzzCorePackageImpl#getTwitterConsumer()
	 * @generated
	 */
	int TWITTER_CONSUMER = 1;

	/**
	 * The feature id for the '<em><b>Consumer Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWITTER_CONSUMER__CONSUMER_KEY = 0;

	/**
	 * The feature id for the '<em><b>Consumer Secret</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWITTER_CONSUMER__CONSUMER_SECRET = 1;

	/**
	 * The feature id for the '<em><b>Custom Domain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWITTER_CONSUMER__CUSTOM_DOMAIN = 2;

	/**
	 * The number of structural features of the '<em>Twitter Consumer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWITTER_CONSUMER_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.soluvas.buzz.core.impl.BuzzAccountsImpl <em>Buzz Accounts</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.soluvas.buzz.core.impl.BuzzAccountsImpl
	 * @see org.soluvas.buzz.core.impl.BuzzCorePackageImpl#getBuzzAccounts()
	 * @generated
	 */
	int BUZZ_ACCOUNTS = 2;

	/**
	 * The feature id for the '<em><b>Accounts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUZZ_ACCOUNTS__ACCOUNTS = 0;

	/**
	 * The number of structural features of the '<em>Buzz Accounts</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUZZ_ACCOUNTS_FEATURE_COUNT = 1;


	/**
	 * The meta object id for the '{@link org.soluvas.buzz.core.SocialLink <em>Social Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.soluvas.buzz.core.SocialLink
	 * @see org.soluvas.buzz.core.impl.BuzzCorePackageImpl#getSocialLink()
	 * @generated
	 */
	int SOCIAL_LINK = 7;

	/**
	 * The feature id for the '<em><b>Expiry Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_LINK__EXPIRY_TIME = 0;

	/**
	 * The feature id for the '<em><b>Permissions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_LINK__PERMISSIONS = 1;

	/**
	 * The number of structural features of the '<em>Social Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_LINK_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.soluvas.buzz.core.impl.TwitterUserLinkImpl <em>Twitter User Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.soluvas.buzz.core.impl.TwitterUserLinkImpl
	 * @see org.soluvas.buzz.core.impl.BuzzCorePackageImpl#getTwitterUserLink()
	 * @generated
	 */
	int TWITTER_USER_LINK = 3;

	/**
	 * The feature id for the '<em><b>Expiry Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWITTER_USER_LINK__EXPIRY_TIME = SOCIAL_LINK__EXPIRY_TIME;

	/**
	 * The feature id for the '<em><b>Permissions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWITTER_USER_LINK__PERMISSIONS = SOCIAL_LINK__PERMISSIONS;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWITTER_USER_LINK__TOKEN = SOCIAL_LINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Token Secret</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWITTER_USER_LINK__TOKEN_SECRET = SOCIAL_LINK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Twitter Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWITTER_USER_LINK__TWITTER_ID = SOCIAL_LINK_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Screen Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWITTER_USER_LINK__SCREEN_NAME = SOCIAL_LINK_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Twitter User Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWITTER_USER_LINK_FEATURE_COUNT = SOCIAL_LINK_FEATURE_COUNT + 4;


	/**
	 * The meta object id for the '{@link org.soluvas.buzz.core.impl.FacebookUserLinkImpl <em>Facebook User Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.soluvas.buzz.core.impl.FacebookUserLinkImpl
	 * @see org.soluvas.buzz.core.impl.BuzzCorePackageImpl#getFacebookUserLink()
	 * @generated
	 */
	int FACEBOOK_USER_LINK = 4;

	/**
	 * The feature id for the '<em><b>Expiry Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACEBOOK_USER_LINK__EXPIRY_TIME = SOCIAL_LINK__EXPIRY_TIME;

	/**
	 * The feature id for the '<em><b>Permissions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACEBOOK_USER_LINK__PERMISSIONS = SOCIAL_LINK__PERMISSIONS;

	/**
	 * The feature id for the '<em><b>Access Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACEBOOK_USER_LINK__ACCESS_TOKEN = SOCIAL_LINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Account Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACEBOOK_USER_LINK__ACCOUNT_ID = SOCIAL_LINK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACEBOOK_USER_LINK__NAME = SOCIAL_LINK_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACEBOOK_USER_LINK__USERNAME = SOCIAL_LINK_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Facebook User Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACEBOOK_USER_LINK_FEATURE_COUNT = SOCIAL_LINK_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.soluvas.buzz.core.FacebookLink <em>Facebook Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.soluvas.buzz.core.FacebookLink
	 * @see org.soluvas.buzz.core.impl.BuzzCorePackageImpl#getFacebookLink()
	 * @generated
	 */
	int FACEBOOK_LINK = 9;

	/**
	 * The feature id for the '<em><b>Expiry Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACEBOOK_LINK__EXPIRY_TIME = SOCIAL_LINK__EXPIRY_TIME;

	/**
	 * The feature id for the '<em><b>Permissions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACEBOOK_LINK__PERMISSIONS = SOCIAL_LINK__PERMISSIONS;

	/**
	 * The feature id for the '<em><b>Access Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACEBOOK_LINK__ACCESS_TOKEN = SOCIAL_LINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Account Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACEBOOK_LINK__ACCOUNT_ID = SOCIAL_LINK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACEBOOK_LINK__NAME = SOCIAL_LINK_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACEBOOK_LINK__USERNAME = SOCIAL_LINK_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Facebook Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACEBOOK_LINK_FEATURE_COUNT = SOCIAL_LINK_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.soluvas.buzz.core.impl.FacebookPageLinkImpl <em>Facebook Page Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.soluvas.buzz.core.impl.FacebookPageLinkImpl
	 * @see org.soluvas.buzz.core.impl.BuzzCorePackageImpl#getFacebookPageLink()
	 * @generated
	 */
	int FACEBOOK_PAGE_LINK = 5;

	/**
	 * The feature id for the '<em><b>Expiry Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACEBOOK_PAGE_LINK__EXPIRY_TIME = FACEBOOK_LINK__EXPIRY_TIME;

	/**
	 * The feature id for the '<em><b>Permissions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACEBOOK_PAGE_LINK__PERMISSIONS = FACEBOOK_LINK__PERMISSIONS;

	/**
	 * The feature id for the '<em><b>Access Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACEBOOK_PAGE_LINK__ACCESS_TOKEN = FACEBOOK_LINK__ACCESS_TOKEN;

	/**
	 * The feature id for the '<em><b>Account Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACEBOOK_PAGE_LINK__ACCOUNT_ID = FACEBOOK_LINK__ACCOUNT_ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACEBOOK_PAGE_LINK__NAME = FACEBOOK_LINK__NAME;

	/**
	 * The feature id for the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACEBOOK_PAGE_LINK__USERNAME = FACEBOOK_LINK__USERNAME;

	/**
	 * The number of structural features of the '<em>Facebook Page Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACEBOOK_PAGE_LINK_FEATURE_COUNT = FACEBOOK_LINK_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.soluvas.buzz.core.impl.FacebookConsumerImpl <em>Facebook Consumer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.soluvas.buzz.core.impl.FacebookConsumerImpl
	 * @see org.soluvas.buzz.core.impl.BuzzCorePackageImpl#getFacebookConsumer()
	 * @generated
	 */
	int FACEBOOK_CONSUMER = 6;

	/**
	 * The feature id for the '<em><b>App Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACEBOOK_CONSUMER__APP_ID = 0;

	/**
	 * The feature id for the '<em><b>App Secret</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACEBOOK_CONSUMER__APP_SECRET = 1;

	/**
	 * The feature id for the '<em><b>Default Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACEBOOK_CONSUMER__DEFAULT_SCOPE = 2;

	/**
	 * The feature id for the '<em><b>Custom Domain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACEBOOK_CONSUMER__CUSTOM_DOMAIN = 3;

	/**
	 * The number of structural features of the '<em>Facebook Consumer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACEBOOK_CONSUMER_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.soluvas.buzz.core.impl.BuzzAppImpl <em>Buzz App</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.soluvas.buzz.core.impl.BuzzAppImpl
	 * @see org.soluvas.buzz.core.impl.BuzzCorePackageImpl#getBuzzApp()
	 * @generated
	 */
	int BUZZ_APP = 8;

	/**
	 * The feature id for the '<em><b>Twitter Consumer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUZZ_APP__TWITTER_CONSUMER = 0;

	/**
	 * The feature id for the '<em><b>Facebook Consumer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUZZ_APP__FACEBOOK_CONSUMER = 1;

	/**
	 * The number of structural features of the '<em>Buzz App</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUZZ_APP_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link org.soluvas.buzz.core.BuzzAccount <em>Buzz Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Buzz Account</em>'.
	 * @see org.soluvas.buzz.core.BuzzAccount
	 * @generated
	 */
	EClass getBuzzAccount();

	/**
	 * Returns the meta object for the containment reference list '{@link org.soluvas.buzz.core.BuzzAccount#getSocialLinks <em>Social Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Social Links</em>'.
	 * @see org.soluvas.buzz.core.BuzzAccount#getSocialLinks()
	 * @see #getBuzzAccount()
	 * @generated
	 */
	EReference getBuzzAccount_SocialLinks();

	/**
	 * Returns the meta object for class '{@link org.soluvas.buzz.core.TwitterConsumer <em>Twitter Consumer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Twitter Consumer</em>'.
	 * @see org.soluvas.buzz.core.TwitterConsumer
	 * @generated
	 */
	EClass getTwitterConsumer();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.buzz.core.TwitterConsumer#getConsumerKey <em>Consumer Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Consumer Key</em>'.
	 * @see org.soluvas.buzz.core.TwitterConsumer#getConsumerKey()
	 * @see #getTwitterConsumer()
	 * @generated
	 */
	EAttribute getTwitterConsumer_ConsumerKey();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.buzz.core.TwitterConsumer#getConsumerSecret <em>Consumer Secret</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Consumer Secret</em>'.
	 * @see org.soluvas.buzz.core.TwitterConsumer#getConsumerSecret()
	 * @see #getTwitterConsumer()
	 * @generated
	 */
	EAttribute getTwitterConsumer_ConsumerSecret();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.buzz.core.TwitterConsumer#getCustomDomain <em>Custom Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Custom Domain</em>'.
	 * @see org.soluvas.buzz.core.TwitterConsumer#getCustomDomain()
	 * @see #getTwitterConsumer()
	 * @generated
	 */
	EAttribute getTwitterConsumer_CustomDomain();

	/**
	 * Returns the meta object for class '{@link org.soluvas.buzz.core.BuzzAccounts <em>Buzz Accounts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Buzz Accounts</em>'.
	 * @see org.soluvas.buzz.core.BuzzAccounts
	 * @generated
	 */
	EClass getBuzzAccounts();

	/**
	 * Returns the meta object for the containment reference list '{@link org.soluvas.buzz.core.BuzzAccounts#getAccounts <em>Accounts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Accounts</em>'.
	 * @see org.soluvas.buzz.core.BuzzAccounts#getAccounts()
	 * @see #getBuzzAccounts()
	 * @generated
	 */
	EReference getBuzzAccounts_Accounts();

	/**
	 * Returns the meta object for class '{@link org.soluvas.buzz.core.TwitterUserLink <em>Twitter User Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Twitter User Link</em>'.
	 * @see org.soluvas.buzz.core.TwitterUserLink
	 * @generated
	 */
	EClass getTwitterUserLink();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.buzz.core.TwitterUserLink#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token</em>'.
	 * @see org.soluvas.buzz.core.TwitterUserLink#getToken()
	 * @see #getTwitterUserLink()
	 * @generated
	 */
	EAttribute getTwitterUserLink_Token();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.buzz.core.TwitterUserLink#getTokenSecret <em>Token Secret</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token Secret</em>'.
	 * @see org.soluvas.buzz.core.TwitterUserLink#getTokenSecret()
	 * @see #getTwitterUserLink()
	 * @generated
	 */
	EAttribute getTwitterUserLink_TokenSecret();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.buzz.core.TwitterUserLink#getTwitterId <em>Twitter Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Twitter Id</em>'.
	 * @see org.soluvas.buzz.core.TwitterUserLink#getTwitterId()
	 * @see #getTwitterUserLink()
	 * @generated
	 */
	EAttribute getTwitterUserLink_TwitterId();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.buzz.core.TwitterUserLink#getScreenName <em>Screen Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Screen Name</em>'.
	 * @see org.soluvas.buzz.core.TwitterUserLink#getScreenName()
	 * @see #getTwitterUserLink()
	 * @generated
	 */
	EAttribute getTwitterUserLink_ScreenName();

	/**
	 * Returns the meta object for class '{@link org.soluvas.buzz.core.FacebookUserLink <em>Facebook User Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Facebook User Link</em>'.
	 * @see org.soluvas.buzz.core.FacebookUserLink
	 * @generated
	 */
	EClass getFacebookUserLink();

	/**
	 * Returns the meta object for class '{@link org.soluvas.buzz.core.FacebookPageLink <em>Facebook Page Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Facebook Page Link</em>'.
	 * @see org.soluvas.buzz.core.FacebookPageLink
	 * @generated
	 */
	EClass getFacebookPageLink();

	/**
	 * Returns the meta object for class '{@link org.soluvas.buzz.core.FacebookConsumer <em>Facebook Consumer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Facebook Consumer</em>'.
	 * @see org.soluvas.buzz.core.FacebookConsumer
	 * @generated
	 */
	EClass getFacebookConsumer();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.buzz.core.FacebookConsumer#getAppId <em>App Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>App Id</em>'.
	 * @see org.soluvas.buzz.core.FacebookConsumer#getAppId()
	 * @see #getFacebookConsumer()
	 * @generated
	 */
	EAttribute getFacebookConsumer_AppId();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.buzz.core.FacebookConsumer#getAppSecret <em>App Secret</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>App Secret</em>'.
	 * @see org.soluvas.buzz.core.FacebookConsumer#getAppSecret()
	 * @see #getFacebookConsumer()
	 * @generated
	 */
	EAttribute getFacebookConsumer_AppSecret();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.buzz.core.FacebookConsumer#getDefaultScope <em>Default Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Scope</em>'.
	 * @see org.soluvas.buzz.core.FacebookConsumer#getDefaultScope()
	 * @see #getFacebookConsumer()
	 * @generated
	 */
	EAttribute getFacebookConsumer_DefaultScope();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.buzz.core.FacebookConsumer#getCustomDomain <em>Custom Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Custom Domain</em>'.
	 * @see org.soluvas.buzz.core.FacebookConsumer#getCustomDomain()
	 * @see #getFacebookConsumer()
	 * @generated
	 */
	EAttribute getFacebookConsumer_CustomDomain();

	/**
	 * Returns the meta object for class '{@link org.soluvas.buzz.core.SocialLink <em>Social Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Social Link</em>'.
	 * @see org.soluvas.buzz.core.SocialLink
	 * @generated
	 */
	EClass getSocialLink();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.buzz.core.SocialLink#getExpiryTime <em>Expiry Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expiry Time</em>'.
	 * @see org.soluvas.buzz.core.SocialLink#getExpiryTime()
	 * @see #getSocialLink()
	 * @generated
	 */
	EAttribute getSocialLink_ExpiryTime();

	/**
	 * Returns the meta object for the attribute list '{@link org.soluvas.buzz.core.SocialLink#getPermissions <em>Permissions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Permissions</em>'.
	 * @see org.soluvas.buzz.core.SocialLink#getPermissions()
	 * @see #getSocialLink()
	 * @generated
	 */
	EAttribute getSocialLink_Permissions();

	/**
	 * Returns the meta object for class '{@link org.soluvas.buzz.core.BuzzApp <em>Buzz App</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Buzz App</em>'.
	 * @see org.soluvas.buzz.core.BuzzApp
	 * @generated
	 */
	EClass getBuzzApp();

	/**
	 * Returns the meta object for the containment reference '{@link org.soluvas.buzz.core.BuzzApp#getTwitterConsumer <em>Twitter Consumer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Twitter Consumer</em>'.
	 * @see org.soluvas.buzz.core.BuzzApp#getTwitterConsumer()
	 * @see #getBuzzApp()
	 * @generated
	 */
	EReference getBuzzApp_TwitterConsumer();

	/**
	 * Returns the meta object for the containment reference '{@link org.soluvas.buzz.core.BuzzApp#getFacebookConsumer <em>Facebook Consumer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Facebook Consumer</em>'.
	 * @see org.soluvas.buzz.core.BuzzApp#getFacebookConsumer()
	 * @see #getBuzzApp()
	 * @generated
	 */
	EReference getBuzzApp_FacebookConsumer();

	/**
	 * Returns the meta object for class '{@link org.soluvas.buzz.core.FacebookLink <em>Facebook Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Facebook Link</em>'.
	 * @see org.soluvas.buzz.core.FacebookLink
	 * @generated
	 */
	EClass getFacebookLink();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.buzz.core.FacebookLink#getAccessToken <em>Access Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access Token</em>'.
	 * @see org.soluvas.buzz.core.FacebookLink#getAccessToken()
	 * @see #getFacebookLink()
	 * @generated
	 */
	EAttribute getFacebookLink_AccessToken();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.buzz.core.FacebookLink#getAccountId <em>Account Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Account Id</em>'.
	 * @see org.soluvas.buzz.core.FacebookLink#getAccountId()
	 * @see #getFacebookLink()
	 * @generated
	 */
	EAttribute getFacebookLink_AccountId();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.buzz.core.FacebookLink#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.soluvas.buzz.core.FacebookLink#getName()
	 * @see #getFacebookLink()
	 * @generated
	 */
	EAttribute getFacebookLink_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.buzz.core.FacebookLink#getUsername <em>Username</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Username</em>'.
	 * @see org.soluvas.buzz.core.FacebookLink#getUsername()
	 * @see #getFacebookLink()
	 * @generated
	 */
	EAttribute getFacebookLink_Username();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BuzzCoreFactory getBuzzCoreFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.soluvas.buzz.core.impl.BuzzAccountImpl <em>Buzz Account</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.soluvas.buzz.core.impl.BuzzAccountImpl
		 * @see org.soluvas.buzz.core.impl.BuzzCorePackageImpl#getBuzzAccount()
		 * @generated
		 */
		EClass BUZZ_ACCOUNT = eINSTANCE.getBuzzAccount();

		/**
		 * The meta object literal for the '<em><b>Social Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUZZ_ACCOUNT__SOCIAL_LINKS = eINSTANCE.getBuzzAccount_SocialLinks();

		/**
		 * The meta object literal for the '{@link org.soluvas.buzz.core.impl.TwitterConsumerImpl <em>Twitter Consumer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.soluvas.buzz.core.impl.TwitterConsumerImpl
		 * @see org.soluvas.buzz.core.impl.BuzzCorePackageImpl#getTwitterConsumer()
		 * @generated
		 */
		EClass TWITTER_CONSUMER = eINSTANCE.getTwitterConsumer();

		/**
		 * The meta object literal for the '<em><b>Consumer Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TWITTER_CONSUMER__CONSUMER_KEY = eINSTANCE.getTwitterConsumer_ConsumerKey();

		/**
		 * The meta object literal for the '<em><b>Consumer Secret</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TWITTER_CONSUMER__CONSUMER_SECRET = eINSTANCE.getTwitterConsumer_ConsumerSecret();

		/**
		 * The meta object literal for the '<em><b>Custom Domain</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TWITTER_CONSUMER__CUSTOM_DOMAIN = eINSTANCE.getTwitterConsumer_CustomDomain();

		/**
		 * The meta object literal for the '{@link org.soluvas.buzz.core.impl.BuzzAccountsImpl <em>Buzz Accounts</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.soluvas.buzz.core.impl.BuzzAccountsImpl
		 * @see org.soluvas.buzz.core.impl.BuzzCorePackageImpl#getBuzzAccounts()
		 * @generated
		 */
		EClass BUZZ_ACCOUNTS = eINSTANCE.getBuzzAccounts();

		/**
		 * The meta object literal for the '<em><b>Accounts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUZZ_ACCOUNTS__ACCOUNTS = eINSTANCE.getBuzzAccounts_Accounts();

		/**
		 * The meta object literal for the '{@link org.soluvas.buzz.core.impl.TwitterUserLinkImpl <em>Twitter User Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.soluvas.buzz.core.impl.TwitterUserLinkImpl
		 * @see org.soluvas.buzz.core.impl.BuzzCorePackageImpl#getTwitterUserLink()
		 * @generated
		 */
		EClass TWITTER_USER_LINK = eINSTANCE.getTwitterUserLink();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TWITTER_USER_LINK__TOKEN = eINSTANCE.getTwitterUserLink_Token();

		/**
		 * The meta object literal for the '<em><b>Token Secret</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TWITTER_USER_LINK__TOKEN_SECRET = eINSTANCE.getTwitterUserLink_TokenSecret();

		/**
		 * The meta object literal for the '<em><b>Twitter Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TWITTER_USER_LINK__TWITTER_ID = eINSTANCE.getTwitterUserLink_TwitterId();

		/**
		 * The meta object literal for the '<em><b>Screen Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TWITTER_USER_LINK__SCREEN_NAME = eINSTANCE.getTwitterUserLink_ScreenName();

		/**
		 * The meta object literal for the '{@link org.soluvas.buzz.core.impl.FacebookUserLinkImpl <em>Facebook User Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.soluvas.buzz.core.impl.FacebookUserLinkImpl
		 * @see org.soluvas.buzz.core.impl.BuzzCorePackageImpl#getFacebookUserLink()
		 * @generated
		 */
		EClass FACEBOOK_USER_LINK = eINSTANCE.getFacebookUserLink();

		/**
		 * The meta object literal for the '{@link org.soluvas.buzz.core.impl.FacebookPageLinkImpl <em>Facebook Page Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.soluvas.buzz.core.impl.FacebookPageLinkImpl
		 * @see org.soluvas.buzz.core.impl.BuzzCorePackageImpl#getFacebookPageLink()
		 * @generated
		 */
		EClass FACEBOOK_PAGE_LINK = eINSTANCE.getFacebookPageLink();

		/**
		 * The meta object literal for the '{@link org.soluvas.buzz.core.impl.FacebookConsumerImpl <em>Facebook Consumer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.soluvas.buzz.core.impl.FacebookConsumerImpl
		 * @see org.soluvas.buzz.core.impl.BuzzCorePackageImpl#getFacebookConsumer()
		 * @generated
		 */
		EClass FACEBOOK_CONSUMER = eINSTANCE.getFacebookConsumer();

		/**
		 * The meta object literal for the '<em><b>App Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACEBOOK_CONSUMER__APP_ID = eINSTANCE.getFacebookConsumer_AppId();

		/**
		 * The meta object literal for the '<em><b>App Secret</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACEBOOK_CONSUMER__APP_SECRET = eINSTANCE.getFacebookConsumer_AppSecret();

		/**
		 * The meta object literal for the '<em><b>Default Scope</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACEBOOK_CONSUMER__DEFAULT_SCOPE = eINSTANCE.getFacebookConsumer_DefaultScope();

		/**
		 * The meta object literal for the '<em><b>Custom Domain</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACEBOOK_CONSUMER__CUSTOM_DOMAIN = eINSTANCE.getFacebookConsumer_CustomDomain();

		/**
		 * The meta object literal for the '{@link org.soluvas.buzz.core.SocialLink <em>Social Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.soluvas.buzz.core.SocialLink
		 * @see org.soluvas.buzz.core.impl.BuzzCorePackageImpl#getSocialLink()
		 * @generated
		 */
		EClass SOCIAL_LINK = eINSTANCE.getSocialLink();

		/**
		 * The meta object literal for the '<em><b>Expiry Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOCIAL_LINK__EXPIRY_TIME = eINSTANCE.getSocialLink_ExpiryTime();

		/**
		 * The meta object literal for the '<em><b>Permissions</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOCIAL_LINK__PERMISSIONS = eINSTANCE.getSocialLink_Permissions();

		/**
		 * The meta object literal for the '{@link org.soluvas.buzz.core.impl.BuzzAppImpl <em>Buzz App</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.soluvas.buzz.core.impl.BuzzAppImpl
		 * @see org.soluvas.buzz.core.impl.BuzzCorePackageImpl#getBuzzApp()
		 * @generated
		 */
		EClass BUZZ_APP = eINSTANCE.getBuzzApp();

		/**
		 * The meta object literal for the '<em><b>Twitter Consumer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUZZ_APP__TWITTER_CONSUMER = eINSTANCE.getBuzzApp_TwitterConsumer();

		/**
		 * The meta object literal for the '<em><b>Facebook Consumer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUZZ_APP__FACEBOOK_CONSUMER = eINSTANCE.getBuzzApp_FacebookConsumer();

		/**
		 * The meta object literal for the '{@link org.soluvas.buzz.core.FacebookLink <em>Facebook Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.soluvas.buzz.core.FacebookLink
		 * @see org.soluvas.buzz.core.impl.BuzzCorePackageImpl#getFacebookLink()
		 * @generated
		 */
		EClass FACEBOOK_LINK = eINSTANCE.getFacebookLink();

		/**
		 * The meta object literal for the '<em><b>Access Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACEBOOK_LINK__ACCESS_TOKEN = eINSTANCE.getFacebookLink_AccessToken();

		/**
		 * The meta object literal for the '<em><b>Account Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACEBOOK_LINK__ACCOUNT_ID = eINSTANCE.getFacebookLink_AccountId();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACEBOOK_LINK__NAME = eINSTANCE.getFacebookLink_Name();

		/**
		 * The meta object literal for the '<em><b>Username</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACEBOOK_LINK__USERNAME = eINSTANCE.getFacebookLink_Username();

	}

} //BuzzCorePackage
