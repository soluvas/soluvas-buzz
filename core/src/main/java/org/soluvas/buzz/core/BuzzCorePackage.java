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
	 * The feature id for the '<em><b>Twitter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUZZ_ACCOUNT__TWITTER = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUZZ_ACCOUNT__ID = 1;

	/**
	 * The number of structural features of the '<em>Buzz Account</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUZZ_ACCOUNT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.soluvas.buzz.core.impl.TwitterLinkImpl <em>Twitter Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.soluvas.buzz.core.impl.TwitterLinkImpl
	 * @see org.soluvas.buzz.core.impl.BuzzCorePackageImpl#getTwitterLink()
	 * @generated
	 */
	int TWITTER_LINK = 1;

	/**
	 * The feature id for the '<em><b>Consumer Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWITTER_LINK__CONSUMER_KEY = 0;

	/**
	 * The feature id for the '<em><b>Consumer Secret</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWITTER_LINK__CONSUMER_SECRET = 1;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWITTER_LINK__TOKEN = 2;

	/**
	 * The feature id for the '<em><b>Token Secret</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWITTER_LINK__TOKEN_SECRET = 3;

	/**
	 * The feature id for the '<em><b>Screen Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWITTER_LINK__SCREEN_NAME = 4;

	/**
	 * The feature id for the '<em><b>Twitter Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWITTER_LINK__TWITTER_ID = 5;

	/**
	 * The number of structural features of the '<em>Twitter Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWITTER_LINK_FEATURE_COUNT = 6;

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
	 * Returns the meta object for class '{@link org.soluvas.buzz.core.BuzzAccount <em>Buzz Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Buzz Account</em>'.
	 * @see org.soluvas.buzz.core.BuzzAccount
	 * @generated
	 */
	EClass getBuzzAccount();

	/**
	 * Returns the meta object for the containment reference '{@link org.soluvas.buzz.core.BuzzAccount#getTwitter <em>Twitter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Twitter</em>'.
	 * @see org.soluvas.buzz.core.BuzzAccount#getTwitter()
	 * @see #getBuzzAccount()
	 * @generated
	 */
	EReference getBuzzAccount_Twitter();

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
	 * Returns the meta object for class '{@link org.soluvas.buzz.core.TwitterLink <em>Twitter Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Twitter Link</em>'.
	 * @see org.soluvas.buzz.core.TwitterLink
	 * @generated
	 */
	EClass getTwitterLink();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.buzz.core.TwitterLink#getConsumerKey <em>Consumer Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Consumer Key</em>'.
	 * @see org.soluvas.buzz.core.TwitterLink#getConsumerKey()
	 * @see #getTwitterLink()
	 * @generated
	 */
	EAttribute getTwitterLink_ConsumerKey();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.buzz.core.TwitterLink#getConsumerSecret <em>Consumer Secret</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Consumer Secret</em>'.
	 * @see org.soluvas.buzz.core.TwitterLink#getConsumerSecret()
	 * @see #getTwitterLink()
	 * @generated
	 */
	EAttribute getTwitterLink_ConsumerSecret();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.buzz.core.TwitterLink#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token</em>'.
	 * @see org.soluvas.buzz.core.TwitterLink#getToken()
	 * @see #getTwitterLink()
	 * @generated
	 */
	EAttribute getTwitterLink_Token();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.buzz.core.TwitterLink#getTokenSecret <em>Token Secret</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token Secret</em>'.
	 * @see org.soluvas.buzz.core.TwitterLink#getTokenSecret()
	 * @see #getTwitterLink()
	 * @generated
	 */
	EAttribute getTwitterLink_TokenSecret();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.buzz.core.TwitterLink#getScreenName <em>Screen Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Screen Name</em>'.
	 * @see org.soluvas.buzz.core.TwitterLink#getScreenName()
	 * @see #getTwitterLink()
	 * @generated
	 */
	EAttribute getTwitterLink_ScreenName();

	/**
	 * Returns the meta object for the attribute '{@link org.soluvas.buzz.core.TwitterLink#getTwitterId <em>Twitter Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Twitter Id</em>'.
	 * @see org.soluvas.buzz.core.TwitterLink#getTwitterId()
	 * @see #getTwitterLink()
	 * @generated
	 */
	EAttribute getTwitterLink_TwitterId();

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
		 * The meta object literal for the '<em><b>Twitter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUZZ_ACCOUNT__TWITTER = eINSTANCE.getBuzzAccount_Twitter();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUZZ_ACCOUNT__ID = eINSTANCE.getBuzzAccount_Id();

		/**
		 * The meta object literal for the '{@link org.soluvas.buzz.core.impl.TwitterLinkImpl <em>Twitter Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.soluvas.buzz.core.impl.TwitterLinkImpl
		 * @see org.soluvas.buzz.core.impl.BuzzCorePackageImpl#getTwitterLink()
		 * @generated
		 */
		EClass TWITTER_LINK = eINSTANCE.getTwitterLink();

		/**
		 * The meta object literal for the '<em><b>Consumer Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TWITTER_LINK__CONSUMER_KEY = eINSTANCE.getTwitterLink_ConsumerKey();

		/**
		 * The meta object literal for the '<em><b>Consumer Secret</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TWITTER_LINK__CONSUMER_SECRET = eINSTANCE.getTwitterLink_ConsumerSecret();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TWITTER_LINK__TOKEN = eINSTANCE.getTwitterLink_Token();

		/**
		 * The meta object literal for the '<em><b>Token Secret</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TWITTER_LINK__TOKEN_SECRET = eINSTANCE.getTwitterLink_TokenSecret();

		/**
		 * The meta object literal for the '<em><b>Screen Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TWITTER_LINK__SCREEN_NAME = eINSTANCE.getTwitterLink_ScreenName();

		/**
		 * The meta object literal for the '<em><b>Twitter Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TWITTER_LINK__TWITTER_ID = eINSTANCE.getTwitterLink_TwitterId();

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

	}

} //BuzzCorePackage
