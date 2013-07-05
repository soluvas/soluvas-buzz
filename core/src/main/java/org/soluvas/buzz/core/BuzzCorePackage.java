/**
 */
package org.soluvas.buzz.core;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
	 * The feature id for the '<em><b>Twitter App</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUZZ_ACCOUNT__TWITTER_APP = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUZZ_ACCOUNT__ID = 1;

	/**
	 * The feature id for the '<em><b>Twitter App User</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUZZ_ACCOUNT__TWITTER_APP_USER = 2;

	/**
	 * The feature id for the '<em><b>Twitter Users</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUZZ_ACCOUNT__TWITTER_USERS = 3;

	/**
	 * The number of structural features of the '<em>Buzz Account</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUZZ_ACCOUNT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.soluvas.buzz.core.impl.TwitterAppLinkImpl <em>Twitter App Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.soluvas.buzz.core.impl.TwitterAppLinkImpl
	 * @see org.soluvas.buzz.core.impl.BuzzCorePackageImpl#getTwitterAppLink()
	 * @generated
	 */
	int TWITTER_APP_LINK = 1;

	/**
	 * The feature id for the '<em><b>Consumer Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWITTER_APP_LINK__CONSUMER_KEY = 0;

	/**
	 * The feature id for the '<em><b>Consumer Secret</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWITTER_APP_LINK__CONSUMER_SECRET = 1;

	/**
	 * The number of structural features of the '<em>Twitter App Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWITTER_APP_LINK_FEATURE_COUNT = 2;

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
	 * The meta object id for the '{@link org.soluvas.buzz.core.impl.TwitterUserLinkImpl <em>Twitter User Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.soluvas.buzz.core.impl.TwitterUserLinkImpl
	 * @see org.soluvas.buzz.core.impl.BuzzCorePackageImpl#getTwitterUserLink()
	 * @generated
	 */
	int TWITTER_USER_LINK = 3;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWITTER_USER_LINK__TOKEN = 0;

	/**
	 * The feature id for the '<em><b>Token Secret</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWITTER_USER_LINK__TOKEN_SECRET = 1;

	/**
	 * The feature id for the '<em><b>Twitter Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWITTER_USER_LINK__TWITTER_ID = 2;

	/**
	 * The feature id for the '<em><b>Screen Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWITTER_USER_LINK__SCREEN_NAME = 3;

	/**
	 * The number of structural features of the '<em>Twitter User Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWITTER_USER_LINK_FEATURE_COUNT = 4;


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
	 * Returns the meta object for the containment reference '{@link org.soluvas.buzz.core.BuzzAccount#getTwitterApp <em>Twitter App</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Twitter App</em>'.
	 * @see org.soluvas.buzz.core.BuzzAccount#getTwitterApp()
	 * @see #getBuzzAccount()
	 * @generated
	 */
	EReference getBuzzAccount_TwitterApp();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.buzz.core.BuzzAccount#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.soluvas.buzz.core.BuzzAccount#getId()
	 * @see #getBuzzAccount()
	 * @generated
	 */
	EAttribute getBuzzAccount_Id();

	/**
	 * Returns the meta object for the containment reference '{@link org.soluvas.buzz.core.BuzzAccount#getTwitterAppUser <em>Twitter App User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Twitter App User</em>'.
	 * @see org.soluvas.buzz.core.BuzzAccount#getTwitterAppUser()
	 * @see #getBuzzAccount()
	 * @generated
	 */
	EReference getBuzzAccount_TwitterAppUser();

	/**
	 * Returns the meta object for the containment reference list '{@link org.soluvas.buzz.core.BuzzAccount#getTwitterUsers <em>Twitter Users</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Twitter Users</em>'.
	 * @see org.soluvas.buzz.core.BuzzAccount#getTwitterUsers()
	 * @see #getBuzzAccount()
	 * @generated
	 */
	EReference getBuzzAccount_TwitterUsers();

	/**
	 * Returns the meta object for class '{@link org.soluvas.buzz.core.TwitterAppLink <em>Twitter App Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Twitter App Link</em>'.
	 * @see org.soluvas.buzz.core.TwitterAppLink
	 * @generated
	 */
	EClass getTwitterAppLink();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.buzz.core.TwitterAppLink#getConsumerKey <em>Consumer Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Consumer Key</em>'.
	 * @see org.soluvas.buzz.core.TwitterAppLink#getConsumerKey()
	 * @see #getTwitterAppLink()
	 * @generated
	 */
	EAttribute getTwitterAppLink_ConsumerKey();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.buzz.core.TwitterAppLink#getConsumerSecret <em>Consumer Secret</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Consumer Secret</em>'.
	 * @see org.soluvas.buzz.core.TwitterAppLink#getConsumerSecret()
	 * @see #getTwitterAppLink()
	 * @generated
	 */
	EAttribute getTwitterAppLink_ConsumerSecret();

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
		 * The meta object literal for the '<em><b>Twitter App</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUZZ_ACCOUNT__TWITTER_APP = eINSTANCE.getBuzzAccount_TwitterApp();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUZZ_ACCOUNT__ID = eINSTANCE.getBuzzAccount_Id();

		/**
		 * The meta object literal for the '<em><b>Twitter App User</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUZZ_ACCOUNT__TWITTER_APP_USER = eINSTANCE.getBuzzAccount_TwitterAppUser();

		/**
		 * The meta object literal for the '<em><b>Twitter Users</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUZZ_ACCOUNT__TWITTER_USERS = eINSTANCE.getBuzzAccount_TwitterUsers();

		/**
		 * The meta object literal for the '{@link org.soluvas.buzz.core.impl.TwitterAppLinkImpl <em>Twitter App Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.soluvas.buzz.core.impl.TwitterAppLinkImpl
		 * @see org.soluvas.buzz.core.impl.BuzzCorePackageImpl#getTwitterAppLink()
		 * @generated
		 */
		EClass TWITTER_APP_LINK = eINSTANCE.getTwitterAppLink();

		/**
		 * The meta object literal for the '<em><b>Consumer Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TWITTER_APP_LINK__CONSUMER_KEY = eINSTANCE.getTwitterAppLink_ConsumerKey();

		/**
		 * The meta object literal for the '<em><b>Consumer Secret</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TWITTER_APP_LINK__CONSUMER_SECRET = eINSTANCE.getTwitterAppLink_ConsumerSecret();

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

	}

} //BuzzCorePackage
