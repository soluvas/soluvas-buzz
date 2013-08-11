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
 *   <li>{@link org.soluvas.buzz.core.impl.FacebookConsumerImpl#getAppKey <em>App Key</em>}</li>
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
	 * The default value of the '{@link #getAppKey() <em>App Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppKey()
	 * @generated
	 * @ordered
	 */
	protected static final String APP_KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAppKey() <em>App Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppKey()
	 * @generated
	 * @ordered
	 */
	protected String appKey = APP_KEY_EDEFAULT;

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
	public String getAppKey() {
		return appKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAppKey(String newAppKey) {
		String oldAppKey = appKey;
		appKey = newAppKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuzzCorePackage.FACEBOOK_CONSUMER__APP_KEY, oldAppKey, appKey));
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
			case BuzzCorePackage.FACEBOOK_CONSUMER__APP_KEY:
				return getAppKey();
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
			case BuzzCorePackage.FACEBOOK_CONSUMER__APP_KEY:
				setAppKey((String)newValue);
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
			case BuzzCorePackage.FACEBOOK_CONSUMER__APP_KEY:
				setAppKey(APP_KEY_EDEFAULT);
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
			case BuzzCorePackage.FACEBOOK_CONSUMER__APP_KEY:
				return APP_KEY_EDEFAULT == null ? appKey != null : !APP_KEY_EDEFAULT.equals(appKey);
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
		result.append(", appKey: ");
		result.append(appKey);
		result.append(')');
		return result.toString();
	}

} //FacebookConsumerImpl
