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
public class FacebookConsumerImpl implements FacebookConsumer {
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
	public String getAppId() {
		return appId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAppId(String newAppId) {
		appId = newAppId;
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
		appSecret = newAppSecret;
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
		defaultScope = newDefaultScope;
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
		customDomain = newCustomDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
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
