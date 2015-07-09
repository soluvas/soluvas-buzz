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
public class BuzzAppImpl implements BuzzApp {
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
	public TwitterConsumer getTwitterConsumer() {
		return twitterConsumer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTwitterConsumer(TwitterConsumer newTwitterConsumer) {
		this.twitterConsumer = newTwitterConsumer;
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
	public void setFacebookConsumer(FacebookConsumer newFacebookConsumer) {
		facebookConsumer = newFacebookConsumer;
	}

} //BuzzAppImpl
