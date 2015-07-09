/**
 */
package org.soluvas.buzz.core.impl;

import com.google.common.collect.Iterables;
import org.soluvas.buzz.core.*;

import java.util.ArrayList;
import java.util.List;

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
public class BuzzAccountImpl implements BuzzAccount {
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
	protected List<SocialLink> socialLinks = new ArrayList<>();

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
		id = newId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<SocialLink> getSocialLinks() {
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

	@Override
	public String toString() {
		return "BuzzAccountImpl{" +
				"id='" + id + '\'' +
				", socialLinks=" + socialLinks +
				'}';
	}
} //BuzzAccountImpl
