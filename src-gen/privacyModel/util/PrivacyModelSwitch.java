/**
 */
package privacyModel.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import privacyModel.*;

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
 * @see privacyModel.PrivacyModelPackage
 * @generated
 */
public class PrivacyModelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PrivacyModelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrivacyModelSwitch() {
		if (modelPackage == null) {
			modelPackage = PrivacyModelPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
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
		case PrivacyModelPackage.NAMED_ELEMENT: {
			NamedElement namedElement = (NamedElement) theEObject;
			T result = caseNamedElement(namedElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PrivacyModelPackage.PRIVACY_POLICY: {
			PrivacyPolicy privacyPolicy = (PrivacyPolicy) theEObject;
			T result = casePrivacyPolicy(privacyPolicy);
			if (result == null)
				result = caseNamedElement(privacyPolicy);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PrivacyModelPackage.POLICY_STATEMENT: {
			PolicyStatement policyStatement = (PolicyStatement) theEObject;
			T result = casePolicyStatement(policyStatement);
			if (result == null)
				result = caseNotificationInfo(policyStatement);
			if (result == null)
				result = caseNamedElement(policyStatement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PrivacyModelPackage.PRIVACY_DATA: {
			PrivacyData privacyData = (PrivacyData) theEObject;
			T result = casePrivacyData(privacyData);
			if (result == null)
				result = caseNamedElement(privacyData);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PrivacyModelPackage.SERVICE: {
			Service service = (Service) theEObject;
			T result = caseService(service);
			if (result == null)
				result = caseNamedElement(service);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PrivacyModelPackage.PROVIDER: {
			Provider provider = (Provider) theEObject;
			T result = caseProvider(provider);
			if (result == null)
				result = caseNamedElement(provider);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PrivacyModelPackage.PRINCIPAL: {
			Principal principal = (Principal) theEObject;
			T result = casePrincipal(principal);
			if (result == null)
				result = caseNamedElement(principal);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PrivacyModelPackage.LOCATION: {
			Location location = (Location) theEObject;
			T result = caseLocation(location);
			if (result == null)
				result = caseNamedElement(location);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PrivacyModelPackage.ABSTRACT_TIME: {
			AbstractTime abstractTime = (AbstractTime) theEObject;
			T result = caseAbstractTime(abstractTime);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PrivacyModelPackage.TIME_INTERVAL: {
			TimeInterval timeInterval = (TimeInterval) theEObject;
			T result = caseTimeInterval(timeInterval);
			if (result == null)
				result = caseAbstractTime(timeInterval);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PrivacyModelPackage.TIME_STATEMENT: {
			TimeStatement timeStatement = (TimeStatement) theEObject;
			T result = caseTimeStatement(timeStatement);
			if (result == null)
				result = caseAbstractTime(timeStatement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PrivacyModelPackage.PURPOSE: {
			Purpose purpose = (Purpose) theEObject;
			T result = casePurpose(purpose);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PrivacyModelPackage.WHAT: {
			What what = (What) theEObject;
			T result = caseWhat(what);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PrivacyModelPackage.HOW: {
			How how = (How) theEObject;
			T result = caseHow(how);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PrivacyModelPackage.CONSENT: {
			Consent consent = (Consent) theEObject;
			T result = caseConsent(consent);
			if (result == null)
				result = caseAbstractPaper(consent);
			if (result == null)
				result = caseNamedElement(consent);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PrivacyModelPackage.CONFIGURATION_MANAGER: {
			ConfigurationManager configurationManager = (ConfigurationManager) theEObject;
			T result = caseConfigurationManager(configurationManager);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PrivacyModelPackage.COMPLAINT: {
			Complaint complaint = (Complaint) theEObject;
			T result = caseComplaint(complaint);
			if (result == null)
				result = caseNotificationInfo(complaint);
			if (result == null)
				result = caseNamedElement(complaint);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PrivacyModelPackage.PRIVACY_POLICY_HELPER: {
			PrivacyPolicyHelper privacyPolicyHelper = (PrivacyPolicyHelper) theEObject;
			T result = casePrivacyPolicyHelper(privacyPolicyHelper);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PrivacyModelPackage.WHERE: {
			Where where = (Where) theEObject;
			T result = caseWhere(where);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PrivacyModelPackage.DOCUMENT: {
			Document document = (Document) theEObject;
			T result = caseDocument(document);
			if (result == null)
				result = caseAbstractPaper(document);
			if (result == null)
				result = caseNamedElement(document);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PrivacyModelPackage.ABSTRACT_PAPER: {
			AbstractPaper abstractPaper = (AbstractPaper) theEObject;
			T result = caseAbstractPaper(abstractPaper);
			if (result == null)
				result = caseNamedElement(abstractPaper);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PrivacyModelPackage.ABSTRACT_COMPLAINT_ACTION: {
			AbstractComplaintAction abstractComplaintAction = (AbstractComplaintAction) theEObject;
			T result = caseAbstractComplaintAction(abstractComplaintAction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PrivacyModelPackage.WITHDRAW: {
			Withdraw withdraw = (Withdraw) theEObject;
			T result = caseWithdraw(withdraw);
			if (result == null)
				result = caseAbstractComplaintAction(withdraw);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PrivacyModelPackage.COMPLAINT_BASED_ON_DATA: {
			ComplaintBasedOnData complaintBasedOnData = (ComplaintBasedOnData) theEObject;
			T result = caseComplaintBasedOnData(complaintBasedOnData);
			if (result == null)
				result = caseAbstractComplaint(complaintBasedOnData);
			if (result == null)
				result = caseAbstractComplaintAction(complaintBasedOnData);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PrivacyModelPackage.SHARED_PRIVACY_DATA: {
			SharedPrivacyData sharedPrivacyData = (SharedPrivacyData) theEObject;
			T result = caseSharedPrivacyData(sharedPrivacyData);
			if (result == null)
				result = caseNamedElement(sharedPrivacyData);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PrivacyModelPackage.DENIAL: {
			Denial denial = (Denial) theEObject;
			T result = caseDenial(denial);
			if (result == null)
				result = caseNamedElement(denial);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PrivacyModelPackage.NOTIFICATION: {
			Notification notification = (Notification) theEObject;
			T result = caseNotification(notification);
			if (result == null)
				result = caseNamedElement(notification);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PrivacyModelPackage.NOTIFICATION_INFO: {
			NotificationInfo notificationInfo = (NotificationInfo) theEObject;
			T result = caseNotificationInfo(notificationInfo);
			if (result == null)
				result = caseNamedElement(notificationInfo);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PrivacyModelPackage.ABSTRACT_COMPLAINT: {
			AbstractComplaint abstractComplaint = (AbstractComplaint) theEObject;
			T result = caseAbstractComplaint(abstractComplaint);
			if (result == null)
				result = caseAbstractComplaintAction(abstractComplaint);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PrivacyModelPackage.COMPLAINT_BASED_ON_ACTION: {
			ComplaintBasedOnAction complaintBasedOnAction = (ComplaintBasedOnAction) theEObject;
			T result = caseComplaintBasedOnAction(complaintBasedOnAction);
			if (result == null)
				result = caseAbstractComplaint(complaintBasedOnAction);
			if (result == null)
				result = caseAbstractComplaintAction(complaintBasedOnAction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Privacy Policy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Privacy Policy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrivacyPolicy(PrivacyPolicy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Policy Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Policy Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePolicyStatement(PolicyStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Privacy Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Privacy Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrivacyData(PrivacyData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseService(Service object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProvider(Provider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Principal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Principal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrincipal(Principal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Location</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Location</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocation(Location object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Time</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Time</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractTime(AbstractTime object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Interval</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Interval</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeInterval(TimeInterval object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeStatement(TimeStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Purpose</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Purpose</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePurpose(Purpose object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>What</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>What</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWhat(What object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>How</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>How</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHow(How object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Consent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Consent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConsent(Consent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Configuration Manager</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Configuration Manager</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfigurationManager(ConfigurationManager object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Complaint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Complaint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComplaint(Complaint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Privacy Policy Helper</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Privacy Policy Helper</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrivacyPolicyHelper(PrivacyPolicyHelper object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Where</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Where</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWhere(Where object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocument(Document object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Paper</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Paper</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractPaper(AbstractPaper object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Complaint Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Complaint Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractComplaintAction(AbstractComplaintAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Withdraw</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Withdraw</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWithdraw(Withdraw object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Complaint Based On Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Complaint Based On Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComplaintBasedOnData(ComplaintBasedOnData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shared Privacy Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shared Privacy Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSharedPrivacyData(SharedPrivacyData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Denial</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Denial</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDenial(Denial object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Notification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Notification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNotification(Notification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Notification Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Notification Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNotificationInfo(NotificationInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Complaint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Complaint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractComplaint(AbstractComplaint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Complaint Based On Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Complaint Based On Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComplaintBasedOnAction(ComplaintBasedOnAction object) {
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

} //PrivacyModelSwitch
