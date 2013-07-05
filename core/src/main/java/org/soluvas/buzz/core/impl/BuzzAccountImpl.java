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
import org.soluvas.buzz.core.TwitterAppLink;
import org.soluvas.buzz.core.TwitterUserLink;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Buzz Account</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.soluvas.buzz.core.impl.BuzzAccountImpl#getTwitterApp <em>Twitter App</em>}</li>
 *   <li>{@link org.soluvas.buzz.core.impl.BuzzAccountImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.soluvas.buzz.core.impl.BuzzAccountImpl#getTwitterAppUser <em>Twitter App User</em>}</li>
 *   <li>{@link org.soluvas.buzz.core.impl.BuzzAccountImpl#getTwitterUsers <em>Twitter Users</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BuzzAccountImpl extends EObjectImpl implements BuzzAccount {
	/**
	 * The cached value of the '{@link #getTwitterApp() <em>Twitter App</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTwitterApp()
	 * @generated
	 * @ordered
	 */
	protected TwitterAppLink twitterApp;

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
	 * The cached value of the '{@link #getTwitterAppUser() <em>Twitter App User</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTwitterAppUser()
	 * @generated
	 * @ordered
	 */
	protected TwitterUserLink twitterAppUser;

	/**
	 * The cached value of the '{@link #getTwitterUsers() <em>Twitter Users</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTwitterUsers()
	 * @generated
	 * @ordered
	 */
	protected EList<TwitterUserLink> twitterUsers;

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
	public TwitterAppLink getTwitterApp() {
		return twitterApp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTwitterApp(TwitterAppLink newTwitterApp, NotificationChain msgs) {
		TwitterAppLink oldTwitterApp = twitterApp;
		twitterApp = newTwitterApp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BuzzCorePackage.BUZZ_ACCOUNT__TWITTER_APP, oldTwitterApp, newTwitterApp);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTwitterApp(TwitterAppLink newTwitterApp) {
		if (newTwitterApp != twitterApp) {
			NotificationChain msgs = null;
			if (twitterApp != null)
				msgs = ((InternalEObject)twitterApp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BuzzCorePackage.BUZZ_ACCOUNT__TWITTER_APP, null, msgs);
			if (newTwitterApp != null)
				msgs = ((InternalEObject)newTwitterApp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BuzzCorePackage.BUZZ_ACCOUNT__TWITTER_APP, null, msgs);
			msgs = basicSetTwitterApp(newTwitterApp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuzzCorePackage.BUZZ_ACCOUNT__TWITTER_APP, newTwitterApp, newTwitterApp));
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
	public TwitterUserLink getTwitterAppUser() {
		return twitterAppUser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTwitterAppUser(TwitterUserLink newTwitterAppUser, NotificationChain msgs) {
		TwitterUserLink oldTwitterAppUser = twitterAppUser;
		twitterAppUser = newTwitterAppUser;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BuzzCorePackage.BUZZ_ACCOUNT__TWITTER_APP_USER, oldTwitterAppUser, newTwitterAppUser);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTwitterAppUser(TwitterUserLink newTwitterAppUser) {
		if (newTwitterAppUser != twitterAppUser) {
			NotificationChain msgs = null;
			if (twitterAppUser != null)
				msgs = ((InternalEObject)twitterAppUser).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BuzzCorePackage.BUZZ_ACCOUNT__TWITTER_APP_USER, null, msgs);
			if (newTwitterAppUser != null)
				msgs = ((InternalEObject)newTwitterAppUser).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BuzzCorePackage.BUZZ_ACCOUNT__TWITTER_APP_USER, null, msgs);
			msgs = basicSetTwitterAppUser(newTwitterAppUser, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuzzCorePackage.BUZZ_ACCOUNT__TWITTER_APP_USER, newTwitterAppUser, newTwitterAppUser));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TwitterUserLink> getTwitterUsers() {
		if (twitterUsers == null) {
			twitterUsers = new EObjectContainmentEList<TwitterUserLink>(TwitterUserLink.class, this, BuzzCorePackage.BUZZ_ACCOUNT__TWITTER_USERS);
		}
		return twitterUsers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BuzzCorePackage.BUZZ_ACCOUNT__TWITTER_APP:
				return basicSetTwitterApp(null, msgs);
			case BuzzCorePackage.BUZZ_ACCOUNT__TWITTER_APP_USER:
				return basicSetTwitterAppUser(null, msgs);
			case BuzzCorePackage.BUZZ_ACCOUNT__TWITTER_USERS:
				return ((InternalEList<?>)getTwitterUsers()).basicRemove(otherEnd, msgs);
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
			case BuzzCorePackage.BUZZ_ACCOUNT__TWITTER_APP:
				return getTwitterApp();
			case BuzzCorePackage.BUZZ_ACCOUNT__ID:
				return getId();
			case BuzzCorePackage.BUZZ_ACCOUNT__TWITTER_APP_USER:
				return getTwitterAppUser();
			case BuzzCorePackage.BUZZ_ACCOUNT__TWITTER_USERS:
				return getTwitterUsers();
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
			case BuzzCorePackage.BUZZ_ACCOUNT__TWITTER_APP:
				setTwitterApp((TwitterAppLink)newValue);
				return;
			case BuzzCorePackage.BUZZ_ACCOUNT__ID:
				setId((String)newValue);
				return;
			case BuzzCorePackage.BUZZ_ACCOUNT__TWITTER_APP_USER:
				setTwitterAppUser((TwitterUserLink)newValue);
				return;
			case BuzzCorePackage.BUZZ_ACCOUNT__TWITTER_USERS:
				getTwitterUsers().clear();
				getTwitterUsers().addAll((Collection<? extends TwitterUserLink>)newValue);
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
			case BuzzCorePackage.BUZZ_ACCOUNT__TWITTER_APP:
				setTwitterApp((TwitterAppLink)null);
				return;
			case BuzzCorePackage.BUZZ_ACCOUNT__ID:
				setId(ID_EDEFAULT);
				return;
			case BuzzCorePackage.BUZZ_ACCOUNT__TWITTER_APP_USER:
				setTwitterAppUser((TwitterUserLink)null);
				return;
			case BuzzCorePackage.BUZZ_ACCOUNT__TWITTER_USERS:
				getTwitterUsers().clear();
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
			case BuzzCorePackage.BUZZ_ACCOUNT__TWITTER_APP:
				return twitterApp != null;
			case BuzzCorePackage.BUZZ_ACCOUNT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case BuzzCorePackage.BUZZ_ACCOUNT__TWITTER_APP_USER:
				return twitterAppUser != null;
			case BuzzCorePackage.BUZZ_ACCOUNT__TWITTER_USERS:
				return twitterUsers != null && !twitterUsers.isEmpty();
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
