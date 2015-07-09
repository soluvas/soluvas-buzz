/**
 */
package org.soluvas.buzz.core;

import javax.annotation.Nullable;

import org.eclipse.emf.common.util.EList;
import org.soluvas.commons.Identifiable;

import java.util.ArrayList;
import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Buzz Account</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.soluvas.buzz.core.BuzzAccount#getSocialLinks <em>Social Links</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.soluvas.buzz.core.BuzzCorePackage#getBuzzAccount()
 * @model
 * @generated
 */
public interface BuzzAccount {

	String getId();
	void setId(String id);

	/**
	 * Returns the value of the '<em><b>Social Links</b></em>' containment reference list.
	 * The list contents are of type {@link org.soluvas.buzz.core.SocialLink}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Collection of OAuth credentials for each registered Social Link.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Social Links</em>' containment reference list.
	 * @see org.soluvas.buzz.core.BuzzCorePackage#getBuzzAccount_SocialLinks()
	 * @model containment="true"
	 * @generated
	 */
	List<SocialLink> getSocialLinks();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Get the primary TwitterUserLink, if any.
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	@Nullable
	TwitterUserLink getTwitterUser();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Get the primary Facebook User Link, if any.
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	@Nullable
	FacebookUserLink getFacebookUser();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Get the primary Facebook Page Link, if any.
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	@Nullable
	FacebookPageLink getFacebookPage();

} // BuzzAccount
