/**
 */
package org.soluvas.buzz.core.impl;

import org.joda.time.DateTime;
import org.soluvas.buzz.core.FacebookUserLink;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Facebook User Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.soluvas.buzz.core.impl.FacebookUserLinkImpl#getExpiryTime <em>Expiry Time</em>}</li>
 *   <li>{@link org.soluvas.buzz.core.impl.FacebookUserLinkImpl#getPermissions <em>Permissions</em>}</li>
 *   <li>{@link org.soluvas.buzz.core.impl.FacebookUserLinkImpl#getAccessToken <em>Access Token</em>}</li>
 *   <li>{@link org.soluvas.buzz.core.impl.FacebookUserLinkImpl#getAccountId <em>Account Id</em>}</li>
 *   <li>{@link org.soluvas.buzz.core.impl.FacebookUserLinkImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.soluvas.buzz.core.impl.FacebookUserLinkImpl#getUsername <em>Username</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FacebookUserLinkImpl implements FacebookUserLink {
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
	protected Set<String> permissions = new LinkedHashSet<>();

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
	public FacebookUserLinkImpl() {
		super();
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
		expiryTime = newExpiryTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Set<String> getPermissions() {
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
		accessToken = newAccessToken;
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
		accountId = newAccountId;
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
		name = newName;
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
		username = newUsername;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
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

} //FacebookUserLinkImpl
