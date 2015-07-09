/**
 */
package org.soluvas.buzz.core;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Buzz App</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Tenant-wide Buzz consumer credentials.
 * 
 * Note: SocialLinks should be stored *separate* to BuzzApp, because consumer credentials are fixed,
 * while social tokens are temporary/revokable (esp. for Facebook).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.soluvas.buzz.core.BuzzApp#getTwitterConsumer <em>Twitter Consumer</em>}</li>
 *   <li>{@link org.soluvas.buzz.core.BuzzApp#getFacebookConsumer <em>Facebook Consumer</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.soluvas.buzz.core.BuzzCorePackage#getBuzzApp()
 * @model
 * @generated
 */
public interface BuzzApp {
	/**
	 * Returns the value of the '<em><b>Twitter Consumer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * OAuth consumer (not user) info on Twitter for the app itself.
	 * 
	 * Apps include:
	 * 1. Buzz Cloud
	 * 2. AksiMata
	 * 3. GaulDong
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Twitter Consumer</em>' containment reference.
	 * @see #setTwitterConsumer(TwitterConsumer)
	 * @see org.soluvas.buzz.core.BuzzCorePackage#getBuzzApp_TwitterConsumer()
	 * @model containment="true"
	 * @generated
	 */
	TwitterConsumer getTwitterConsumer();

	/**
	 * Sets the value of the '{@link org.soluvas.buzz.core.BuzzApp#getTwitterConsumer <em>Twitter Consumer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Twitter Consumer</em>' containment reference.
	 * @see #getTwitterConsumer()
	 * @generated
	 */
	void setTwitterConsumer(TwitterConsumer value);

	/**
	 * Returns the value of the '<em><b>Facebook Consumer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Facebook Consumer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Facebook Consumer</em>' containment reference.
	 * @see #setFacebookConsumer(FacebookConsumer)
	 * @see org.soluvas.buzz.core.BuzzCorePackage#getBuzzApp_FacebookConsumer()
	 * @model containment="true"
	 * @generated
	 */
	FacebookConsumer getFacebookConsumer();

	/**
	 * Sets the value of the '{@link org.soluvas.buzz.core.BuzzApp#getFacebookConsumer <em>Facebook Consumer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Facebook Consumer</em>' containment reference.
	 * @see #getFacebookConsumer()
	 * @generated
	 */
	void setFacebookConsumer(FacebookConsumer value);

} // BuzzApp
