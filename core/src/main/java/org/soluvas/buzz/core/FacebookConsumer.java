/**
 */
package org.soluvas.buzz.core;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Facebook Consumer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * OAuth consumer (not user) info on Twitter for the app itself.
 * 
 * Apps include:
 * 1. Buzz Cloud
 * 2. AksiMata
 * 3. GaulDong
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.soluvas.buzz.core.FacebookConsumer#getAppId <em>App Id</em>}</li>
 *   <li>{@link org.soluvas.buzz.core.FacebookConsumer#getAppKey <em>App Key</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.soluvas.buzz.core.BuzzCorePackage#getFacebookConsumer()
 * @model
 * @generated
 */
public interface FacebookConsumer extends EObject {
	/**
	 * Returns the value of the '<em><b>App Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>App Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>App Id</em>' attribute.
	 * @see #setAppId(String)
	 * @see org.soluvas.buzz.core.BuzzCorePackage#getFacebookConsumer_AppId()
	 * @model
	 * @generated
	 */
	String getAppId();

	/**
	 * Sets the value of the '{@link org.soluvas.buzz.core.FacebookConsumer#getAppId <em>App Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>App Id</em>' attribute.
	 * @see #getAppId()
	 * @generated
	 */
	void setAppId(String value);

	/**
	 * Returns the value of the '<em><b>App Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>App Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>App Key</em>' attribute.
	 * @see #setAppKey(String)
	 * @see org.soluvas.buzz.core.BuzzCorePackage#getFacebookConsumer_AppKey()
	 * @model
	 * @generated
	 */
	String getAppKey();

	/**
	 * Sets the value of the '{@link org.soluvas.buzz.core.FacebookConsumer#getAppKey <em>App Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>App Key</em>' attribute.
	 * @see #getAppKey()
	 * @generated
	 */
	void setAppKey(String value);

} // FacebookConsumer
