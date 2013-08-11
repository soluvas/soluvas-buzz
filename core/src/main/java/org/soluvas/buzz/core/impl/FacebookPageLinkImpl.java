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
import org.soluvas.buzz.core.FacebookPageLink;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Facebook Page Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.soluvas.buzz.core.impl.FacebookPageLinkImpl#getExpiryTime <em>Expiry Time</em>}</li>
 *   <li>{@link org.soluvas.buzz.core.impl.FacebookPageLinkImpl#getPermissions <em>Permissions</em>}</li>
 *   <li>{@link org.soluvas.buzz.core.impl.FacebookPageLinkImpl#getAccessToken <em>Access Token</em>}</li>
 *   <li>{@link org.soluvas.buzz.core.impl.FacebookPageLinkImpl#getAccountId <em>Account Id</em>}</li>
 *   <li>{@link org.soluvas.buzz.core.impl.FacebookPageLinkImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.soluvas.buzz.core.impl.FacebookPageLinkImpl#getUsername <em>Username</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FacebookPageLinkImpl extends EObjectImpl implements FacebookPageLink {
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
	 * The default value of the '{@link #getAccessToken() <em>Access Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessToken()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCESS_TOKEN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAccessToken() <em>Access Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessToken()
	 * @generated
	 * @ordered
	 */
	protected String accessToken = ACCESS_TOKEN_EDEFAULT;

	/**
	 * The default value of the '{@link #getAccountId() <em>Account Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccountId()
	 * @generated
	 * @ordered
	 */
	protected static final Long ACCOUNT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAccountId() <em>Account Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccountId()
	 * @generated
	 * @ordered
	 */
	protected Long accountId = ACCOUNT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getUsername() <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsername()
	 * @generated
	 * @ordered
	 */
	protected static final String USERNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUsername() <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsername()
	 * @generated
	 * @ordered
	 */
	protected String username = USERNAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FacebookPageLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BuzzCorePackage.Literals.FACEBOOK_PAGE_LINK;
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
			eNotify(new ENotificationImpl(this, Notification.SET, BuzzCorePackage.FACEBOOK_PAGE_LINK__EXPIRY_TIME, oldExpiryTime, expiryTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getPermissions() {
		if (permissions == null) {
			permissions = new EDataTypeUniqueEList<String>(String.class, this, BuzzCorePackage.FACEBOOK_PAGE_LINK__PERMISSIONS);
		}
		return permissions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAccessToken() {
		return accessToken;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccessToken(String newAccessToken) {
		String oldAccessToken = accessToken;
		accessToken = newAccessToken;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuzzCorePackage.FACEBOOK_PAGE_LINK__ACCESS_TOKEN, oldAccessToken, accessToken));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getAccountId() {
		return accountId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccountId(Long newAccountId) {
		Long oldAccountId = accountId;
		accountId = newAccountId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuzzCorePackage.FACEBOOK_PAGE_LINK__ACCOUNT_ID, oldAccountId, accountId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuzzCorePackage.FACEBOOK_PAGE_LINK__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsername(String newUsername) {
		String oldUsername = username;
		username = newUsername;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuzzCorePackage.FACEBOOK_PAGE_LINK__USERNAME, oldUsername, username));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BuzzCorePackage.FACEBOOK_PAGE_LINK__EXPIRY_TIME:
				return getExpiryTime();
			case BuzzCorePackage.FACEBOOK_PAGE_LINK__PERMISSIONS:
				return getPermissions();
			case BuzzCorePackage.FACEBOOK_PAGE_LINK__ACCESS_TOKEN:
				return getAccessToken();
			case BuzzCorePackage.FACEBOOK_PAGE_LINK__ACCOUNT_ID:
				return getAccountId();
			case BuzzCorePackage.FACEBOOK_PAGE_LINK__NAME:
				return getName();
			case BuzzCorePackage.FACEBOOK_PAGE_LINK__USERNAME:
				return getUsername();
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
			case BuzzCorePackage.FACEBOOK_PAGE_LINK__EXPIRY_TIME:
				setExpiryTime((DateTime)newValue);
				return;
			case BuzzCorePackage.FACEBOOK_PAGE_LINK__PERMISSIONS:
				getPermissions().clear();
				getPermissions().addAll((Collection<? extends String>)newValue);
				return;
			case BuzzCorePackage.FACEBOOK_PAGE_LINK__ACCESS_TOKEN:
				setAccessToken((String)newValue);
				return;
			case BuzzCorePackage.FACEBOOK_PAGE_LINK__ACCOUNT_ID:
				setAccountId((Long)newValue);
				return;
			case BuzzCorePackage.FACEBOOK_PAGE_LINK__NAME:
				setName((String)newValue);
				return;
			case BuzzCorePackage.FACEBOOK_PAGE_LINK__USERNAME:
				setUsername((String)newValue);
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
			case BuzzCorePackage.FACEBOOK_PAGE_LINK__EXPIRY_TIME:
				setExpiryTime(EXPIRY_TIME_EDEFAULT);
				return;
			case BuzzCorePackage.FACEBOOK_PAGE_LINK__PERMISSIONS:
				getPermissions().clear();
				return;
			case BuzzCorePackage.FACEBOOK_PAGE_LINK__ACCESS_TOKEN:
				setAccessToken(ACCESS_TOKEN_EDEFAULT);
				return;
			case BuzzCorePackage.FACEBOOK_PAGE_LINK__ACCOUNT_ID:
				setAccountId(ACCOUNT_ID_EDEFAULT);
				return;
			case BuzzCorePackage.FACEBOOK_PAGE_LINK__NAME:
				setName(NAME_EDEFAULT);
				return;
			case BuzzCorePackage.FACEBOOK_PAGE_LINK__USERNAME:
				setUsername(USERNAME_EDEFAULT);
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
			case BuzzCorePackage.FACEBOOK_PAGE_LINK__EXPIRY_TIME:
				return EXPIRY_TIME_EDEFAULT == null ? expiryTime != null : !EXPIRY_TIME_EDEFAULT.equals(expiryTime);
			case BuzzCorePackage.FACEBOOK_PAGE_LINK__PERMISSIONS:
				return permissions != null && !permissions.isEmpty();
			case BuzzCorePackage.FACEBOOK_PAGE_LINK__ACCESS_TOKEN:
				return ACCESS_TOKEN_EDEFAULT == null ? accessToken != null : !ACCESS_TOKEN_EDEFAULT.equals(accessToken);
			case BuzzCorePackage.FACEBOOK_PAGE_LINK__ACCOUNT_ID:
				return ACCOUNT_ID_EDEFAULT == null ? accountId != null : !ACCOUNT_ID_EDEFAULT.equals(accountId);
			case BuzzCorePackage.FACEBOOK_PAGE_LINK__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case BuzzCorePackage.FACEBOOK_PAGE_LINK__USERNAME:
				return USERNAME_EDEFAULT == null ? username != null : !USERNAME_EDEFAULT.equals(username);
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
		result.append(", accessToken: ");
		result.append(accessToken);
		result.append(", accountId: ");
		result.append(accountId);
		result.append(", name: ");
		result.append(name);
		result.append(", username: ");
		result.append(username);
		result.append(')');
		return result.toString();
	}

} //FacebookPageLinkImpl
