/**
 */
package org.soluvas.buzz.core.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.soluvas.buzz.core.BuzzApp;
import org.soluvas.buzz.core.BuzzCorePackage;
import org.soluvas.buzz.core.FacebookConsumer;
import org.soluvas.buzz.core.TwitterConsumer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Buzz App</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.soluvas.buzz.core.impl.BuzzAppImpl#getTwitterConsumer <em>Twitter Consumer</em>}</li>
 *   <li>{@link org.soluvas.buzz.core.impl.BuzzAppImpl#getFacebookConsumer <em>Facebook Consumer</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BuzzAppImpl extends EObjectImpl implements BuzzApp {
	/**
	 * The cached value of the '{@link #getTwitterConsumer() <em>Twitter Consumer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTwitterConsumer()
	 * @generated
	 * @ordered
	 */
	protected TwitterConsumer twitterConsumer;

	/**
	 * The cached value of the '{@link #getFacebookConsumer() <em>Facebook Consumer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacebookConsumer()
	 * @generated
	 * @ordered
	 */
	protected FacebookConsumer facebookConsumer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuzzAppImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BuzzCorePackage.Literals.BUZZ_APP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TwitterConsumer getTwitterConsumer() {
		return twitterConsumer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTwitterConsumer(TwitterConsumer newTwitterConsumer, NotificationChain msgs) {
		TwitterConsumer oldTwitterConsumer = twitterConsumer;
		twitterConsumer = newTwitterConsumer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BuzzCorePackage.BUZZ_APP__TWITTER_CONSUMER, oldTwitterConsumer, newTwitterConsumer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTwitterConsumer(TwitterConsumer newTwitterConsumer) {
		if (newTwitterConsumer != twitterConsumer) {
			NotificationChain msgs = null;
			if (twitterConsumer != null)
				msgs = ((InternalEObject)twitterConsumer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BuzzCorePackage.BUZZ_APP__TWITTER_CONSUMER, null, msgs);
			if (newTwitterConsumer != null)
				msgs = ((InternalEObject)newTwitterConsumer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BuzzCorePackage.BUZZ_APP__TWITTER_CONSUMER, null, msgs);
			msgs = basicSetTwitterConsumer(newTwitterConsumer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuzzCorePackage.BUZZ_APP__TWITTER_CONSUMER, newTwitterConsumer, newTwitterConsumer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FacebookConsumer getFacebookConsumer() {
		return facebookConsumer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFacebookConsumer(FacebookConsumer newFacebookConsumer, NotificationChain msgs) {
		FacebookConsumer oldFacebookConsumer = facebookConsumer;
		facebookConsumer = newFacebookConsumer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BuzzCorePackage.BUZZ_APP__FACEBOOK_CONSUMER, oldFacebookConsumer, newFacebookConsumer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFacebookConsumer(FacebookConsumer newFacebookConsumer) {
		if (newFacebookConsumer != facebookConsumer) {
			NotificationChain msgs = null;
			if (facebookConsumer != null)
				msgs = ((InternalEObject)facebookConsumer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BuzzCorePackage.BUZZ_APP__FACEBOOK_CONSUMER, null, msgs);
			if (newFacebookConsumer != null)
				msgs = ((InternalEObject)newFacebookConsumer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BuzzCorePackage.BUZZ_APP__FACEBOOK_CONSUMER, null, msgs);
			msgs = basicSetFacebookConsumer(newFacebookConsumer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuzzCorePackage.BUZZ_APP__FACEBOOK_CONSUMER, newFacebookConsumer, newFacebookConsumer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BuzzCorePackage.BUZZ_APP__TWITTER_CONSUMER:
				return basicSetTwitterConsumer(null, msgs);
			case BuzzCorePackage.BUZZ_APP__FACEBOOK_CONSUMER:
				return basicSetFacebookConsumer(null, msgs);
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
			case BuzzCorePackage.BUZZ_APP__TWITTER_CONSUMER:
				return getTwitterConsumer();
			case BuzzCorePackage.BUZZ_APP__FACEBOOK_CONSUMER:
				return getFacebookConsumer();
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
			case BuzzCorePackage.BUZZ_APP__TWITTER_CONSUMER:
				setTwitterConsumer((TwitterConsumer)newValue);
				return;
			case BuzzCorePackage.BUZZ_APP__FACEBOOK_CONSUMER:
				setFacebookConsumer((FacebookConsumer)newValue);
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
			case BuzzCorePackage.BUZZ_APP__TWITTER_CONSUMER:
				setTwitterConsumer((TwitterConsumer)null);
				return;
			case BuzzCorePackage.BUZZ_APP__FACEBOOK_CONSUMER:
				setFacebookConsumer((FacebookConsumer)null);
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
			case BuzzCorePackage.BUZZ_APP__TWITTER_CONSUMER:
				return twitterConsumer != null;
			case BuzzCorePackage.BUZZ_APP__FACEBOOK_CONSUMER:
				return facebookConsumer != null;
		}
		return super.eIsSet(featureID);
	}

} //BuzzAppImpl
