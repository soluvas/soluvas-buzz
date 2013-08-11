/**
 */
package org.soluvas.buzz.core.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.soluvas.buzz.core.BuzzCorePackage;
import org.soluvas.buzz.core.FacebookConsumer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Facebook Consumer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.soluvas.buzz.core.impl.FacebookConsumerImpl#getAppId <em>App Id</em>}</li>
 *   <li>{@link org.soluvas.buzz.core.impl.FacebookConsumerImpl#getAppSecret <em>App Secret</em>}</li>
 *   <li>{@link org.soluvas.buzz.core.impl.FacebookConsumerImpl#getDefaultScope <em>Default Scope</em>}</li>
 *   <li>{@link org.soluvas.buzz.core.impl.FacebookConsumerImpl#getCustomDomain <em>Custom Domain</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FacebookConsumerImpl extends EObjectImpl implements FacebookConsumer {
	/**
	 * The default value of the '{@link #getAppId() <em>App Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppId()
	 * @generated
	 * @ordered
	 */
	protected static final String APP_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAppId() <em>App Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppId()
	 * @generated
	 * @ordered
	 */
	protected String appId = APP_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getAppSecret() <em>App Secret</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppSecret()
	 * @generated
	 * @ordered
	 */
	protected static final String APP_SECRET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAppSecret() <em>App Secret</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppSecret()
	 * @generated
	 * @ordered
	 */
	protected String appSecret = APP_SECRET_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultScope() <em>Default Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultScope()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_SCOPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultScope() <em>Default Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultScope()
	 * @generated
	 * @ordered
	 */
	protected String defaultScope = DEFAULT_SCOPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCustomDomain() <em>Custom Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomDomain()
	 * @generated
	 * @ordered
	 */
	protected static final String CUSTOM_DOMAIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCustomDomain() <em>Custom Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomDomain()
	 * @generated
	 * @ordered
	 */
	protected String customDomain = CUSTOM_DOMAIN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FacebookConsumerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BuzzCorePackage.Literals.FACEBOOK_CONSUMER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAppId() {
		return appId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAppId(String newAppId) {
		String oldAppId = appId;
		appId = newAppId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuzzCorePackage.FACEBOOK_CONSUMER__APP_ID, oldAppId, appId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAppSecret() {
		return appSecret;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAppSecret(String newAppSecret) {
		String oldAppSecret = appSecret;
		appSecret = newAppSecret;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuzzCorePackage.FACEBOOK_CONSUMER__APP_SECRET, oldAppSecret, appSecret));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefaultScope() {
		return defaultScope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultScope(String newDefaultScope) {
		String oldDefaultScope = defaultScope;
		defaultScope = newDefaultScope;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuzzCorePackage.FACEBOOK_CONSUMER__DEFAULT_SCOPE, oldDefaultScope, defaultScope));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCustomDomain() {
		return customDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomDomain(String newCustomDomain) {
		String oldCustomDomain = customDomain;
		customDomain = newCustomDomain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuzzCorePackage.FACEBOOK_CONSUMER__CUSTOM_DOMAIN, oldCustomDomain, customDomain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BuzzCorePackage.FACEBOOK_CONSUMER__APP_ID:
				return getAppId();
			case BuzzCorePackage.FACEBOOK_CONSUMER__APP_SECRET:
				return getAppSecret();
			case BuzzCorePackage.FACEBOOK_CONSUMER__DEFAULT_SCOPE:
				return getDefaultScope();
			case BuzzCorePackage.FACEBOOK_CONSUMER__CUSTOM_DOMAIN:
				return getCustomDomain();
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
			case BuzzCorePackage.FACEBOOK_CONSUMER__APP_ID:
				setAppId((String)newValue);
				return;
			case BuzzCorePackage.FACEBOOK_CONSUMER__APP_SECRET:
				setAppSecret((String)newValue);
				return;
			case BuzzCorePackage.FACEBOOK_CONSUMER__DEFAULT_SCOPE:
				setDefaultScope((String)newValue);
				return;
			case BuzzCorePackage.FACEBOOK_CONSUMER__CUSTOM_DOMAIN:
				setCustomDomain((String)newValue);
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
			case BuzzCorePackage.FACEBOOK_CONSUMER__APP_ID:
				setAppId(APP_ID_EDEFAULT);
				return;
			case BuzzCorePackage.FACEBOOK_CONSUMER__APP_SECRET:
				setAppSecret(APP_SECRET_EDEFAULT);
				return;
			case BuzzCorePackage.FACEBOOK_CONSUMER__DEFAULT_SCOPE:
				setDefaultScope(DEFAULT_SCOPE_EDEFAULT);
				return;
			case BuzzCorePackage.FACEBOOK_CONSUMER__CUSTOM_DOMAIN:
				setCustomDomain(CUSTOM_DOMAIN_EDEFAULT);
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
			case BuzzCorePackage.FACEBOOK_CONSUMER__APP_ID:
				return APP_ID_EDEFAULT == null ? appId != null : !APP_ID_EDEFAULT.equals(appId);
			case BuzzCorePackage.FACEBOOK_CONSUMER__APP_SECRET:
				return APP_SECRET_EDEFAULT == null ? appSecret != null : !APP_SECRET_EDEFAULT.equals(appSecret);
			case BuzzCorePackage.FACEBOOK_CONSUMER__DEFAULT_SCOPE:
				return DEFAULT_SCOPE_EDEFAULT == null ? defaultScope != null : !DEFAULT_SCOPE_EDEFAULT.equals(defaultScope);
			case BuzzCorePackage.FACEBOOK_CONSUMER__CUSTOM_DOMAIN:
				return CUSTOM_DOMAIN_EDEFAULT == null ? customDomain != null : !CUSTOM_DOMAIN_EDEFAULT.equals(customDomain);
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
		result.append(" (appId: ");
		result.append(appId);
		result.append(", appSecret: ");
		result.append(appSecret);
		result.append(", defaultScope: ");
		result.append(defaultScope);
		result.append(", customDomain: ");
		result.append(customDomain);
		result.append(')');
		return result.toString();
	}

} //FacebookConsumerImpl
