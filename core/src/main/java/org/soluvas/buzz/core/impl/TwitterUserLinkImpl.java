/**
 */
package org.soluvas.buzz.core.impl;

import java.util.Collection;
import java.util.Set;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.joda.time.DateTime;
import org.soluvas.buzz.core.BuzzCorePackage;
import org.soluvas.buzz.core.TwitterUserLink;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Twitter User Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.soluvas.buzz.core.impl.TwitterUserLinkImpl#getExpiryTime <em>Expiry Time</em>}</li>
 *   <li>{@link org.soluvas.buzz.core.impl.TwitterUserLinkImpl#getPermissions <em>Permissions</em>}</li>
 *   <li>{@link org.soluvas.buzz.core.impl.TwitterUserLinkImpl#getToken <em>Token</em>}</li>
 *   <li>{@link org.soluvas.buzz.core.impl.TwitterUserLinkImpl#getTokenSecret <em>Token Secret</em>}</li>
 *   <li>{@link org.soluvas.buzz.core.impl.TwitterUserLinkImpl#getTwitterId <em>Twitter Id</em>}</li>
 *   <li>{@link org.soluvas.buzz.core.impl.TwitterUserLinkImpl#getScreenName <em>Screen Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TwitterUserLinkImpl extends EObjectImpl implements TwitterUserLink {
	/**
	 * The default value of the '{@link #getExpiryTime() <em>Expiry Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpiryTime()
	 * @generated
	 * @ordered
	 */
	protected static final DateTime EXPIRY_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExpiryTime() <em>Expiry Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpiryTime()
	 * @generated
	 * @ordered
	 */
	protected DateTime expiryTime = EXPIRY_TIME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPermissions() <em>Permissions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPermissions()
	 * @generated
	 * @ordered
	 */
	protected EList<String> permissions;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TwitterUserLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BuzzCorePackage.Literals.TWITTER_USER_LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getExpiryTime() {
		return expiryTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpiryTime(DateTime newExpiryTime) {
		DateTime oldExpiryTime = expiryTime;
		expiryTime = newExpiryTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuzzCorePackage.TWITTER_USER_LINK__EXPIRY_TIME, oldExpiryTime, expiryTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getPermissions() {
		if (permissions == null) {
			permissions = new EDataTypeUniqueEList<String>(String.class, this, BuzzCorePackage.TWITTER_USER_LINK__PERMISSIONS);
		}
		return permissions;
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
			eNotify(new ENotificationImpl(this, Notification.SET, BuzzCorePackage.TWITTER_USER_LINK__TOKEN, oldToken, token));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BuzzCorePackage.TWITTER_USER_LINK__TOKEN_SECRET, oldTokenSecret, tokenSecret));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BuzzCorePackage.TWITTER_USER_LINK__TWITTER_ID, oldTwitterId, twitterId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BuzzCorePackage.TWITTER_USER_LINK__SCREEN_NAME, oldScreenName, screenName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BuzzCorePackage.TWITTER_USER_LINK__EXPIRY_TIME:
				return getExpiryTime();
			case BuzzCorePackage.TWITTER_USER_LINK__PERMISSIONS:
				return getPermissions();
			case BuzzCorePackage.TWITTER_USER_LINK__TOKEN:
				return getToken();
			case BuzzCorePackage.TWITTER_USER_LINK__TOKEN_SECRET:
				return getTokenSecret();
			case BuzzCorePackage.TWITTER_USER_LINK__TWITTER_ID:
				return getTwitterId();
			case BuzzCorePackage.TWITTER_USER_LINK__SCREEN_NAME:
				return getScreenName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BuzzCorePackage.TWITTER_USER_LINK__EXPIRY_TIME:
				setExpiryTime((DateTime)newValue);
				return;
			case BuzzCorePackage.TWITTER_USER_LINK__PERMISSIONS:
				getPermissions().clear();
				getPermissions().addAll((Collection<? extends String>)newValue);
				return;
			case BuzzCorePackage.TWITTER_USER_LINK__TOKEN:
				setToken((String)newValue);
				return;
			case BuzzCorePackage.TWITTER_USER_LINK__TOKEN_SECRET:
				setTokenSecret((String)newValue);
				return;
			case BuzzCorePackage.TWITTER_USER_LINK__TWITTER_ID:
				setTwitterId((Long)newValue);
				return;
			case BuzzCorePackage.TWITTER_USER_LINK__SCREEN_NAME:
				setScreenName((String)newValue);
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
			case BuzzCorePackage.TWITTER_USER_LINK__EXPIRY_TIME:
				setExpiryTime(EXPIRY_TIME_EDEFAULT);
				return;
			case BuzzCorePackage.TWITTER_USER_LINK__PERMISSIONS:
				getPermissions().clear();
				return;
			case BuzzCorePackage.TWITTER_USER_LINK__TOKEN:
				setToken(TOKEN_EDEFAULT);
				return;
			case BuzzCorePackage.TWITTER_USER_LINK__TOKEN_SECRET:
				setTokenSecret(TOKEN_SECRET_EDEFAULT);
				return;
			case BuzzCorePackage.TWITTER_USER_LINK__TWITTER_ID:
				setTwitterId(TWITTER_ID_EDEFAULT);
				return;
			case BuzzCorePackage.TWITTER_USER_LINK__SCREEN_NAME:
				setScreenName(SCREEN_NAME_EDEFAULT);
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
			case BuzzCorePackage.TWITTER_USER_LINK__EXPIRY_TIME:
				return EXPIRY_TIME_EDEFAULT == null ? expiryTime != null : !EXPIRY_TIME_EDEFAULT.equals(expiryTime);
			case BuzzCorePackage.TWITTER_USER_LINK__PERMISSIONS:
				return permissions != null && !permissions.isEmpty();
			case BuzzCorePackage.TWITTER_USER_LINK__TOKEN:
				return TOKEN_EDEFAULT == null ? token != null : !TOKEN_EDEFAULT.equals(token);
			case BuzzCorePackage.TWITTER_USER_LINK__TOKEN_SECRET:
				return TOKEN_SECRET_EDEFAULT == null ? tokenSecret != null : !TOKEN_SECRET_EDEFAULT.equals(tokenSecret);
			case BuzzCorePackage.TWITTER_USER_LINK__TWITTER_ID:
				return TWITTER_ID_EDEFAULT == null ? twitterId != null : !TWITTER_ID_EDEFAULT.equals(twitterId);
			case BuzzCorePackage.TWITTER_USER_LINK__SCREEN_NAME:
				return SCREEN_NAME_EDEFAULT == null ? screenName != null : !SCREEN_NAME_EDEFAULT.equals(screenName);
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
		result.append(" (expiryTime: ");
		result.append(expiryTime);
		result.append(", permissions: ");
		result.append(permissions);
		result.append(", token: ");
		result.append(token);
		result.append(", tokenSecret: ");
		result.append(tokenSecret);
		result.append(", twitterId: ");
		result.append(twitterId);
		result.append(", screenName: ");
		result.append(screenName);
		result.append(')');
		return result.toString();
	}

} //TwitterUserLinkImpl
