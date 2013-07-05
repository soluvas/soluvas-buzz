/**
 */
package org.soluvas.buzz.core;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Buzz Account</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.soluvas.buzz.core.BuzzAccount#getTwitter <em>Twitter</em>}</li>
 *   <li>{@link org.soluvas.buzz.core.BuzzAccount#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.soluvas.buzz.core.BuzzCorePackage#getBuzzAccount()
 * @model
 * @generated
 */
public interface BuzzAccount extends EObject {
	/**
	 * Returns the value of the '<em><b>Twitter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Twitter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Twitter</em>' containment reference.
	 * @see #setTwitter(TwitterLink)
	 * @see org.soluvas.buzz.core.BuzzCorePackage#getBuzzAccount_Twitter()
	 * @model containment="true"
	 * @generated
	 */
	TwitterLink getTwitter();

	/**
	 * Sets the value of the '{@link org.soluvas.buzz.core.BuzzAccount#getTwitter <em>Twitter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Twitter</em>' containment reference.
	 * @see #getTwitter()
	 * @generated
	 */
	void setTwitter(TwitterLink value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.soluvas.buzz.core.BuzzCorePackage#getBuzzAccount_Id()
	 * @model required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.soluvas.buzz.core.BuzzAccount#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // BuzzAccount
