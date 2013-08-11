/**
 */
package org.soluvas.buzz.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Facebook Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.soluvas.buzz.core.FacebookLink#getAccessToken <em>Access Token</em>}</li>
 *   <li>{@link org.soluvas.buzz.core.FacebookLink#getAccountId <em>Account Id</em>}</li>
 *   <li>{@link org.soluvas.buzz.core.FacebookLink#getName <em>Name</em>}</li>
 *   <li>{@link org.soluvas.buzz.core.FacebookLink#getUsername <em>Username</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.soluvas.buzz.core.BuzzCorePackage#getFacebookLink()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface FacebookLink extends SocialLink {
	/**
	 * Returns the value of the '<em><b>Access Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Access Token</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Token</em>' attribute.
	 * @see #setAccessToken(String)
	 * @see org.soluvas.buzz.core.BuzzCorePackage#getFacebookLink_AccessToken()
	 * @model
	 * @generated
	 */
	String getAccessToken();

	/**
	 * Sets the value of the '{@link org.soluvas.buzz.core.FacebookLink#getAccessToken <em>Access Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Token</em>' attribute.
	 * @see #getAccessToken()
	 * @generated
	 */
	void setAccessToken(String value);

	/**
	 * Returns the value of the '<em><b>Account Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Account Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Account Id</em>' attribute.
	 * @see #setAccountId(Long)
	 * @see org.soluvas.buzz.core.BuzzCorePackage#getFacebookLink_AccountId()
	 * @model
	 * @generated
	 */
	Long getAccountId();

	/**
	 * Sets the value of the '{@link org.soluvas.buzz.core.FacebookLink#getAccountId <em>Account Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Account Id</em>' attribute.
	 * @see #getAccountId()
	 * @generated
	 */
	void setAccountId(Long value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.soluvas.buzz.core.BuzzCorePackage#getFacebookLink_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.soluvas.buzz.core.FacebookLink#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Username</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Username</em>' attribute.
	 * @see #setUsername(String)
	 * @see org.soluvas.buzz.core.BuzzCorePackage#getFacebookLink_Username()
	 * @model
	 * @generated
	 */
	String getUsername();

	/**
	 * Sets the value of the '{@link org.soluvas.buzz.core.FacebookLink#getUsername <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Username</em>' attribute.
	 * @see #getUsername()
	 * @generated
	 */
	void setUsername(String value);

} // FacebookLink
