/**
 */
package org.soluvas.buzz.core.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.soluvas.buzz.core.BuzzAccount;
import org.soluvas.buzz.core.BuzzCorePackage;
import org.soluvas.buzz.core.FacebookPageLink;
import org.soluvas.buzz.core.FacebookUserLink;
import org.soluvas.buzz.core.SocialLink;
import org.soluvas.buzz.core.TwitterUserLink;

import com.google.common.collect.Iterables;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Buzz Account</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.soluvas.buzz.core.impl.BuzzAccountImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.soluvas.buzz.core.impl.BuzzAccountImpl#getSocialLinks <em>Social Links</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BuzzAccountImpl extends EObjectImpl implements BuzzAccount {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSocialLinks() <em>Social Links</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSocialLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<SocialLink> socialLinks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuzzAccountImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BuzzCorePackage.Literals.BUZZ_ACCOUNT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuzzCorePackage.BUZZ_ACCOUNT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SocialLink> getSocialLinks() {
		if (socialLinks == null) {
			socialLinks = new EObjectContainmentEList<SocialLink>(SocialLink.class, this, BuzzCorePackage.BUZZ_ACCOUNT__SOCIAL_LINKS);
		}
		return socialLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public TwitterUserLink getTwitterUser() {
		return Iterables.getFirst(Iterables.filter(getSocialLinks(), TwitterUserLink.class), null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public FacebookUserLink getFacebookUser() {
		return Iterables.getFirst(Iterables.filter(getSocialLinks(), FacebookUserLink.class), null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public FacebookPageLink getFacebookPage() {
		return Iterables.getFirst(Iterables.filter(getSocialLinks(), FacebookPageLink.class), null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BuzzCorePackage.BUZZ_ACCOUNT__SOCIAL_LINKS:
				return ((InternalEList<?>)getSocialLinks()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BuzzCorePackage.BUZZ_ACCOUNT__ID:
				return getId();
			case BuzzCorePackage.BUZZ_ACCOUNT__SOCIAL_LINKS:
				return getSocialLinks();
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
			case BuzzCorePackage.BUZZ_ACCOUNT__ID:
				setId((String)newValue);
				return;
			case BuzzCorePackage.BUZZ_ACCOUNT__SOCIAL_LINKS:
				getSocialLinks().clear();
				getSocialLinks().addAll((Collection<? extends SocialLink>)newValue);
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
			case BuzzCorePackage.BUZZ_ACCOUNT__ID:
				setId(ID_EDEFAULT);
				return;
			case BuzzCorePackage.BUZZ_ACCOUNT__SOCIAL_LINKS:
				getSocialLinks().clear();
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
			case BuzzCorePackage.BUZZ_ACCOUNT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case BuzzCorePackage.BUZZ_ACCOUNT__SOCIAL_LINKS:
				return socialLinks != null && !socialLinks.isEmpty();
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
		result.append(" (id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //BuzzAccountImpl
