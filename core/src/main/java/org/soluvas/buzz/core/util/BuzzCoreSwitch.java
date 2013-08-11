/**
 */
package org.soluvas.buzz.core.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.soluvas.buzz.core.*;
import org.soluvas.commons.Identifiable;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.soluvas.buzz.core.BuzzCorePackage
 * @generated
 */
public class BuzzCoreSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BuzzCorePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuzzCoreSwitch() {
		if (modelPackage == null) {
			modelPackage = BuzzCorePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case BuzzCorePackage.BUZZ_ACCOUNT: {
				BuzzAccount buzzAccount = (BuzzAccount)theEObject;
				T result = caseBuzzAccount(buzzAccount);
				if (result == null) result = caseIdentifiable(buzzAccount);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BuzzCorePackage.TWITTER_CONSUMER: {
				TwitterConsumer twitterConsumer = (TwitterConsumer)theEObject;
				T result = caseTwitterConsumer(twitterConsumer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BuzzCorePackage.BUZZ_ACCOUNTS: {
				BuzzAccounts buzzAccounts = (BuzzAccounts)theEObject;
				T result = caseBuzzAccounts(buzzAccounts);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BuzzCorePackage.TWITTER_USER_LINK: {
				TwitterUserLink twitterUserLink = (TwitterUserLink)theEObject;
				T result = caseTwitterUserLink(twitterUserLink);
				if (result == null) result = caseSocialLink(twitterUserLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BuzzCorePackage.FACEBOOK_USER_LINK: {
				FacebookUserLink facebookUserLink = (FacebookUserLink)theEObject;
				T result = caseFacebookUserLink(facebookUserLink);
				if (result == null) result = caseFacebookLink(facebookUserLink);
				if (result == null) result = caseSocialLink(facebookUserLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BuzzCorePackage.FACEBOOK_PAGE_LINK: {
				FacebookPageLink facebookPageLink = (FacebookPageLink)theEObject;
				T result = caseFacebookPageLink(facebookPageLink);
				if (result == null) result = caseFacebookLink(facebookPageLink);
				if (result == null) result = caseSocialLink(facebookPageLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BuzzCorePackage.FACEBOOK_CONSUMER: {
				FacebookConsumer facebookConsumer = (FacebookConsumer)theEObject;
				T result = caseFacebookConsumer(facebookConsumer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BuzzCorePackage.SOCIAL_LINK: {
				SocialLink socialLink = (SocialLink)theEObject;
				T result = caseSocialLink(socialLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BuzzCorePackage.BUZZ_APP: {
				BuzzApp buzzApp = (BuzzApp)theEObject;
				T result = caseBuzzApp(buzzApp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BuzzCorePackage.FACEBOOK_LINK: {
				FacebookLink facebookLink = (FacebookLink)theEObject;
				T result = caseFacebookLink(facebookLink);
				if (result == null) result = caseSocialLink(facebookLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Buzz Account</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Buzz Account</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBuzzAccount(BuzzAccount object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Twitter Consumer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Twitter Consumer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTwitterConsumer(TwitterConsumer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Buzz Accounts</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Buzz Accounts</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBuzzAccounts(BuzzAccounts object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Twitter User Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Twitter User Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTwitterUserLink(TwitterUserLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Facebook User Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Facebook User Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFacebookUserLink(FacebookUserLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Facebook Page Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Facebook Page Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFacebookPageLink(FacebookPageLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Facebook Consumer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Facebook Consumer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFacebookConsumer(FacebookConsumer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Social Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Social Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSocialLink(SocialLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Buzz App</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Buzz App</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBuzzApp(BuzzApp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Facebook Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Facebook Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFacebookLink(FacebookLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identifiable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identifiable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentifiable(Identifiable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //BuzzCoreSwitch
