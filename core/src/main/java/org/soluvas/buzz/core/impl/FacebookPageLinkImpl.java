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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BuzzCorePackage.FACEBOOK_PAGE_LINK__EXPIRY_TIME:
				return getExpiryTime();
			case BuzzCorePackage.FACEBOOK_PAGE_LINK__PERMISSIONS:
				return getPermissions();
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
		result.append(')');
		return result.toString();
	}

} //FacebookPageLinkImpl
