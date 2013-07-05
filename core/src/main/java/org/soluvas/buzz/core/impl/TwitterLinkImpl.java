/**
 */
package org.soluvas.buzz.core.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.soluvas.buzz.core.BuzzCorePackage;
import org.soluvas.buzz.core.TwitterLink;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Twitter Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.soluvas.buzz.core.impl.TwitterLinkImpl#getConsumerKey <em>Consumer Key</em>}</li>
 *   <li>{@link org.soluvas.buzz.core.impl.TwitterLinkImpl#getConsumerSecret <em>Consumer Secret</em>}</li>
 *   <li>{@link org.soluvas.buzz.core.impl.TwitterLinkImpl#getToken <em>Token</em>}</li>
 *   <li>{@link org.soluvas.buzz.core.impl.TwitterLinkImpl#getTokenSecret <em>Token Secret</em>}</li>
 *   <li>{@link org.soluvas.buzz.core.impl.TwitterLinkImpl#getScreenName <em>Screen Name</em>}</li>
 *   <li>{@link org.soluvas.buzz.core.impl.TwitterLinkImpl#getTwitterId <em>Twitter Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TwitterLinkImpl extends EObjectImpl implements TwitterLink {
	/**
	 * The default value of the '{@link #getConsumerKey() <em>Consumer Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsumerKey()
	 * @generated
	 * @ordered
	 */
	protected static final String CONSUMER_KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConsumerKey() <em>Consumer Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsumerKey()
	 * @generated
	 * @ordered
	 */
	protected String consumerKey = CONSUMER_KEY_EDEFAULT;

	/**
	 * The default value of the '{@link #getConsumerSecret() <em>Consumer Secret</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsumerSecret()
	 * @generated
	 * @ordered
	 */
	protected static final String CONSUMER_SECRET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConsumerSecret() <em>Consumer Secret</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsumerSecret()
	 * @generated
	 * @ordered
	 */
	protected String consumerSecret = CONSUMER_SECRET_EDEFAULT;

	/**
	 * The default value of the '{@link #getToken() <em>Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToken()
	 * @generated
	 * @ordered
	 */
	protected static final String TOKEN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getToken() <em>Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToken()
	 * @generated
	 * @ordered
	 */
	protected String token = TOKEN_EDEFAULT;

	/**
	 * The default value of the '{@link #getTokenSecret() <em>Token Secret</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTokenSecret()
	 * @generated
	 * @ordered
	 */
	protected static final String TOKEN_SECRET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTokenSecret() <em>Token Secret</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTokenSecret()
	 * @generated
	 * @ordered
	 */
	protected String tokenSecret = TOKEN_SECRET_EDEFAULT;

	/**
	 * The default value of the '{@link #getScreenName() <em>Screen Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScreenName()
	 * @generated
	 * @ordered
	 */
	protected static final String SCREEN_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScreenName() <em>Screen Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScreenName()
	 * @generated
	 * @ordered
	 */
	protected String screenName = SCREEN_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTwitterId() <em>Twitter Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTwitterId()
	 * @generated
	 * @ordered
	 */
	protected static final Long TWITTER_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTwitterId() <em>Twitter Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTwitterId()
	 * @generated
	 * @ordered
	 */
	protected Long twitterId = TWITTER_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TwitterLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BuzzCorePackage.Literals.TWITTER_LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConsumerKey() {
		return consumerKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConsumerKey(String newConsumerKey) {
		String oldConsumerKey = consumerKey;
		consumerKey = newConsumerKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuzzCorePackage.TWITTER_LINK__CONSUMER_KEY, oldConsumerKey, consumerKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConsumerSecret() {
		return consumerSecret;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConsumerSecret(String newConsumerSecret) {
		String oldConsumerSecret = consumerSecret;
		consumerSecret = newConsumerSecret;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuzzCorePackage.TWITTER_LINK__CONSUMER_SECRET, oldConsumerSecret, consumerSecret));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getToken() {
		return token;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToken(String newToken) {
		String oldToken = token;
		token = newToken;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuzzCorePackage.TWITTER_LINK__TOKEN, oldToken, token));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTokenSecret() {
		return tokenSecret;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTokenSecret(String newTokenSecret) {
		String oldTokenSecret = tokenSecret;
		tokenSecret = newTokenSecret;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuzzCorePackage.TWITTER_LINK__TOKEN_SECRET, oldTokenSecret, tokenSecret));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getScreenName() {
		return screenName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScreenName(String newScreenName) {
		String oldScreenName = screenName;
		screenName = newScreenName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuzzCorePackage.TWITTER_LINK__SCREEN_NAME, oldScreenName, screenName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getTwitterId() {
		return twitterId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTwitterId(Long newTwitterId) {
		Long oldTwitterId = twitterId;
		twitterId = newTwitterId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuzzCorePackage.TWITTER_LINK__TWITTER_ID, oldTwitterId, twitterId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BuzzCorePackage.TWITTER_LINK__CONSUMER_KEY:
				return getConsumerKey();
			case BuzzCorePackage.TWITTER_LINK__CONSUMER_SECRET:
				return getConsumerSecret();
			case BuzzCorePackage.TWITTER_LINK__TOKEN:
				return getToken();
			case BuzzCorePackage.TWITTER_LINK__TOKEN_SECRET:
				return getTokenSecret();
			case BuzzCorePackage.TWITTER_LINK__SCREEN_NAME:
				return getScreenName();
			case BuzzCorePackage.TWITTER_LINK__TWITTER_ID:
				return getTwitterId();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BuzzCorePackage.TWITTER_LINK__CONSUMER_KEY:
				setConsumerKey((String)newValue);
				return;
			case BuzzCorePackage.TWITTER_LINK__CONSUMER_SECRET:
				setConsumerSecret((String)newValue);
				return;
			case BuzzCorePackage.TWITTER_LINK__TOKEN:
				setToken((String)newValue);
				return;
			case BuzzCorePackage.TWITTER_LINK__TOKEN_SECRET:
				setTokenSecret((String)newValue);
				return;
			case BuzzCorePackage.TWITTER_LINK__SCREEN_NAME:
				setScreenName((String)newValue);
				return;
			case BuzzCorePackage.TWITTER_LINK__TWITTER_ID:
				setTwitterId((Long)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case BuzzCorePackage.TWITTER_LINK__CONSUMER_KEY:
				setConsumerKey(CONSUMER_KEY_EDEFAULT);
				return;
			case BuzzCorePackage.TWITTER_LINK__CONSUMER_SECRET:
				setConsumerSecret(CONSUMER_SECRET_EDEFAULT);
				return;
			case BuzzCorePackage.TWITTER_LINK__TOKEN:
				setToken(TOKEN_EDEFAULT);
				return;
			case BuzzCorePackage.TWITTER_LINK__TOKEN_SECRET:
				setTokenSecret(TOKEN_SECRET_EDEFAULT);
				return;
			case BuzzCorePackage.TWITTER_LINK__SCREEN_NAME:
				setScreenName(SCREEN_NAME_EDEFAULT);
				return;
			case BuzzCorePackage.TWITTER_LINK__TWITTER_ID:
				setTwitterId(TWITTER_ID_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case BuzzCorePackage.TWITTER_LINK__CONSUMER_KEY:
				return CONSUMER_KEY_EDEFAULT == null ? consumerKey != null : !CONSUMER_KEY_EDEFAULT.equals(consumerKey);
			case BuzzCorePackage.TWITTER_LINK__CONSUMER_SECRET:
				return CONSUMER_SECRET_EDEFAULT == null ? consumerSecret != null : !CONSUMER_SECRET_EDEFAULT.equals(consumerSecret);
			case BuzzCorePackage.TWITTER_LINK__TOKEN:
				return TOKEN_EDEFAULT == null ? token != null : !TOKEN_EDEFAULT.equals(token);
			case BuzzCorePackage.TWITTER_LINK__TOKEN_SECRET:
				return TOKEN_SECRET_EDEFAULT == null ? tokenSecret != null : !TOKEN_SECRET_EDEFAULT.equals(tokenSecret);
			case BuzzCorePackage.TWITTER_LINK__SCREEN_NAME:
				return SCREEN_NAME_EDEFAULT == null ? screenName != null : !SCREEN_NAME_EDEFAULT.equals(screenName);
			case BuzzCorePackage.TWITTER_LINK__TWITTER_ID:
				return TWITTER_ID_EDEFAULT == null ? twitterId != null : !TWITTER_ID_EDEFAULT.equals(twitterId);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (consumerKey: ");
		result.append(consumerKey);
		result.append(", consumerSecret: ");
		result.append(consumerSecret);
		result.append(", token: ");
		result.append(token);
		result.append(", tokenSecret: ");
		result.append(tokenSecret);
		result.append(", screenName: ");
		result.append(screenName);
		result.append(", twitterId: ");
		result.append(twitterId);
		result.append(')');
		return result.toString();
	}

} //TwitterLinkImpl
