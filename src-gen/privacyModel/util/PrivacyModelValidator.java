/**
 */
package privacyModel.util;

import java.util.Map;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import privacyModel.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see privacyModel.PrivacyModelPackage
 * @generated
 */
public class PrivacyModelValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final PrivacyModelValidator INSTANCE = new PrivacyModelValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "privacyModel";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrivacyModelValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
		return PrivacyModelPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		switch (classifierID) {
		case PrivacyModelPackage.NAMED_ELEMENT:
			return validateNamedElement((NamedElement) value, diagnostics, context);
		case PrivacyModelPackage.PRIVACY_POLICY:
			return validatePrivacyPolicy((PrivacyPolicy) value, diagnostics, context);
		case PrivacyModelPackage.POLICY_STATEMENT:
			return validatePolicyStatement((PolicyStatement) value, diagnostics, context);
		case PrivacyModelPackage.PRIVACY_DATA:
			return validatePrivacyData((PrivacyData) value, diagnostics, context);
		case PrivacyModelPackage.SERVICE:
			return validateService((Service) value, diagnostics, context);
		case PrivacyModelPackage.PROVIDER:
			return validateProvider((Provider) value, diagnostics, context);
		case PrivacyModelPackage.PRINCIPAL:
			return validatePrincipal((Principal) value, diagnostics, context);
		case PrivacyModelPackage.LOCATION:
			return validateLocation((Location) value, diagnostics, context);
		case PrivacyModelPackage.ABSTRACT_TIME:
			return validateAbstractTime((AbstractTime) value, diagnostics, context);
		case PrivacyModelPackage.TIME_INTERVAL:
			return validateTimeInterval((TimeInterval) value, diagnostics, context);
		case PrivacyModelPackage.TIME_STATEMENT:
			return validateTimeStatement((TimeStatement) value, diagnostics, context);
		case PrivacyModelPackage.PURPOSE:
			return validatePurpose((Purpose) value, diagnostics, context);
		case PrivacyModelPackage.WHAT:
			return validateWhat((What) value, diagnostics, context);
		case PrivacyModelPackage.HOW:
			return validateHow((How) value, diagnostics, context);
		case PrivacyModelPackage.CONSENT:
			return validateConsent((Consent) value, diagnostics, context);
		case PrivacyModelPackage.CONTRACT:
			return validateContract((Contract) value, diagnostics, context);
		case PrivacyModelPackage.CONFIGURATION_MANAGER:
			return validateConfigurationManager((ConfigurationManager) value, diagnostics, context);
		case PrivacyModelPackage.COMPLAINT:
			return validateComplaint((Complaint) value, diagnostics, context);
		case PrivacyModelPackage.PRIVACY_POLICY_HELPER:
			return validatePrivacyPolicyHelper((PrivacyPolicyHelper) value, diagnostics, context);
		case PrivacyModelPackage.WHERE:
			return validateWhere((Where) value, diagnostics, context);
		case PrivacyModelPackage.DOCUMENT:
			return validateDocument((Document) value, diagnostics, context);
		case PrivacyModelPackage.ABSTRACT_PAPER:
			return validateAbstractPaper((AbstractPaper) value, diagnostics, context);
		case PrivacyModelPackage.ABSTRACT_COMPLAINT_ACTION:
			return validateAbstractComplaintAction((AbstractComplaintAction) value, diagnostics, context);
		case PrivacyModelPackage.WITHDRAW:
			return validateWithdraw((Withdraw) value, diagnostics, context);
		case PrivacyModelPackage.COMPLAINT_BASED_ON_DATA:
			return validateComplaintBasedOnData((ComplaintBasedOnData) value, diagnostics, context);
		case PrivacyModelPackage.SHARED_PRIVACY_DATA:
			return validateSharedPrivacyData((SharedPrivacyData) value, diagnostics, context);
		case PrivacyModelPackage.DENIAL:
			return validateDenial((Denial) value, diagnostics, context);
		case PrivacyModelPackage.NOTIFICATION:
			return validateNotification((Notification) value, diagnostics, context);
		case PrivacyModelPackage.NOTIFICATION_INFO:
			return validateNotificationInfo((NotificationInfo) value, diagnostics, context);
		case PrivacyModelPackage.ABSTRACT_COMPLAINT:
			return validateAbstractComplaint((AbstractComplaint) value, diagnostics, context);
		case PrivacyModelPackage.COMPLAINT_BASED_ON_ACTION:
			return validateComplaintBasedOnAction((ComplaintBasedOnAction) value, diagnostics, context);
		case PrivacyModelPackage.DATA_ORIGIN:
			return validateDataOrigin((DataOrigin) value, diagnostics, context);
		case PrivacyModelPackage.DATA_TYPE:
			return validateDataType((DataType) value, diagnostics, context);
		case PrivacyModelPackage.DOCUMENT_TYPE:
			return validateDocumentType((DocumentType) value, diagnostics, context);
		case PrivacyModelPackage.TIME_PREPOSITION:
			return validateTimePreposition((TimePreposition) value, diagnostics, context);
		case PrivacyModelPackage.PRINCIPAL_TYPE:
			return validatePrincipalType((PrincipalType) value, diagnostics, context);
		case PrivacyModelPackage.PRINCIPAL_SCOPE:
			return validatePrincipalScope((PrincipalScope) value, diagnostics, context);
		case PrivacyModelPackage.ACTION:
			return validateAction((Action) value, diagnostics, context);
		case PrivacyModelPackage.LOCATION_TYPE:
			return validateLocationType((LocationType) value, diagnostics, context);
		case PrivacyModelPackage.PROCESSING_REASON:
			return validateProcessingReason((ProcessingReason) value, diagnostics, context);
		case PrivacyModelPackage.PROCESSING_REASON_SUBTYPE:
			return validateProcessingReasonSubtype((ProcessingReasonSubtype) value, diagnostics, context);
		case PrivacyModelPackage.CONSENT_FORMAT:
			return validateConsentFormat((ConsentFormat) value, diagnostics, context);
		case PrivacyModelPackage.CONSENT_TYPE:
			return validateConsentType((ConsentType) value, diagnostics, context);
		case PrivacyModelPackage.COMPLAINT_BASED_ON_ACTION_TYPE:
			return validateComplaintBasedOnActionType((ComplaintBasedOnActionType) value, diagnostics, context);
		case PrivacyModelPackage.COMPLAINT_BASED_ON_DATA_TYPE:
			return validateComplaintBasedOnDataType((ComplaintBasedOnDataType) value, diagnostics, context);
		case PrivacyModelPackage.NOTIFICATION_TYPE:
			return validateNotificationType((NotificationType) value, diagnostics, context);
		case PrivacyModelPackage.COMPLAINT_STATUS:
			return validateComplaintStatus((ComplaintStatus) value, diagnostics, context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamedElement(NamedElement namedElement, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(namedElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrivacyPolicy(PrivacyPolicy privacyPolicy, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(privacyPolicy, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(privacyPolicy, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(privacyPolicy, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(privacyPolicy, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(privacyPolicy, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(privacyPolicy, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(privacyPolicy, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(privacyPolicy, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(privacyPolicy, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePrivacyPolicy_UniquePolicyStatementName(privacyPolicy, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePrivacyPolicy_UniquePrincipalNamePerType(privacyPolicy, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePrivacyPolicy_UniquePrivacyDataName(privacyPolicy, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePrivacyPolicy_UniqueSharedPrivacyDataName(privacyPolicy, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePrivacyPolicy_UniqueServiceName(privacyPolicy, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePrivacyPolicy_UniqueProviderName(privacyPolicy, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePrivacyPolicy_UniqueDocumentName(privacyPolicy, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePrivacyPolicy_UniqueConsentName(privacyPolicy, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePrivacyPolicy_UniqueContractName(privacyPolicy, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePrivacyPolicy_UniqueComplaintName(privacyPolicy, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePrivacyPolicy_UniqueLocationPerType(privacyPolicy, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePrivacyPolicy_ProtectionControlShouldExistInConfiguration(privacyPolicy, diagnostics,
					context);
		if (result || diagnostics != null)
			result &= validatePrivacyPolicy_OwnerShouldHaveDefinedInhabits(privacyPolicy, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the UniquePolicyStatementName constraint of '<em>Privacy Policy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PRIVACY_POLICY__UNIQUE_POLICY_STATEMENT_NAME__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'PolicyStatement name is unique',\n" + "\tstatus : Boolean = \n"
			+ "\t\t\tself.policyStatements->forAll(st1:PolicyStatement,st2:PolicyStatement| st1.name = st2.name implies st1 = st2)\n"
			+ "}.status";

	/**
	 * Validates the ProtectionControlShouldExistInConfiguration constraint of '<em>Privacy Policy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrivacyPolicy_ProtectionControlShouldExistInConfiguration(PrivacyPolicy privacyPolicy,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(PrivacyModelPackage.Literals.PRIVACY_POLICY, privacyPolicy, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "ProtectionControlShouldExistInConfiguration",
				PRIVACY_POLICY__PROTECTION_CONTROL_SHOULD_EXIST_IN_CONFIGURATION__EEXPRESSION, Diagnostic.ERROR,
				DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the OwnerShouldHaveDefinedInhabits constraint of '<em>Privacy Policy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PRIVACY_POLICY__OWNER_SHOULD_HAVE_DEFINED_INHABITS__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'Based on Art 3',\n" + "\tstatus : Boolean = \n"
			+ "\t\t\tnot(self.owner = null) and not(self.owner.inhabits = null)\n" + "}.status";

	/**
	 * Validates the UniquePolicyStatementName constraint of '<em>Privacy Policy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrivacyPolicy_UniquePolicyStatementName(PrivacyPolicy privacyPolicy,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(PrivacyModelPackage.Literals.PRIVACY_POLICY, privacyPolicy, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "UniquePolicyStatementName",
				PRIVACY_POLICY__UNIQUE_POLICY_STATEMENT_NAME__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the UniquePrincipalNamePerType constraint of '<em>Privacy Policy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PRIVACY_POLICY__UNIQUE_PRINCIPAL_NAME_PER_TYPE__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'Principal name per type is unique',\n" + "\tstatus : Boolean = \n"
			+ "\t\tself.allPrincipals->forAll(pr1:Principal,pr2:Principal| \n" + "\t\t\tif(pr1.type = pr2.type) then \n"
			+ "\t\t\tpr1.name = pr2.name implies pr1 = pr2\n" + "\t\t\telse\n" + "\t\t\t\ttrue\n" + "\t\t\tendif\n"
			+ "\t\t)\n" + "}.status";

	/**
	 * Validates the UniquePrincipalNamePerType constraint of '<em>Privacy Policy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrivacyPolicy_UniquePrincipalNamePerType(PrivacyPolicy privacyPolicy,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(PrivacyModelPackage.Literals.PRIVACY_POLICY, privacyPolicy, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "UniquePrincipalNamePerType",
				PRIVACY_POLICY__UNIQUE_PRINCIPAL_NAME_PER_TYPE__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the UniquePrivacyDataName constraint of '<em>Privacy Policy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PRIVACY_POLICY__UNIQUE_PRIVACY_DATA_NAME__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'PrivacyData name is unique',\n" + "\tstatus : Boolean = \n"
			+ "\t\t\tself.allDatas->forAll(pd1:PrivacyData,pd2:PrivacyData| pd1.name = pd2.name implies pd1 = pd2)\n"
			+ "}.status";

	/**
	 * Validates the UniqueSharedPrivacyDataName constraint of '<em>Privacy Policy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrivacyPolicy_UniqueSharedPrivacyDataName(PrivacyPolicy privacyPolicy,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(PrivacyModelPackage.Literals.PRIVACY_POLICY, privacyPolicy, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "UniqueSharedPrivacyDataName",
				PRIVACY_POLICY__UNIQUE_SHARED_PRIVACY_DATA_NAME__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the UniqueServiceName constraint of '<em>Privacy Policy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PRIVACY_POLICY__UNIQUE_SERVICE_NAME__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'Service name is unique',\n" + "\tstatus : Boolean = \n"
			+ "\t\tself.allServices->forAll(service1:Service,service2:Service| service1.name = service2.name implies service1 = service2)\n"
			+ "}.status";

	/**
	 * Validates the UniquePrivacyDataName constraint of '<em>Privacy Policy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrivacyPolicy_UniquePrivacyDataName(PrivacyPolicy privacyPolicy, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(PrivacyModelPackage.Literals.PRIVACY_POLICY, privacyPolicy, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "UniquePrivacyDataName",
				PRIVACY_POLICY__UNIQUE_PRIVACY_DATA_NAME__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the UniqueSharedPrivacyDataName constraint of '<em>Privacy Policy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PRIVACY_POLICY__UNIQUE_SHARED_PRIVACY_DATA_NAME__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'SharedPrivacyData name is unique',\n" + "\tstatus : Boolean = \n"
			+ "\t\t\tself.allSharedPrivacyData->forAll(sd1:SharedPrivacyData,sd2:SharedPrivacyData| sd1.name = sd2.name implies sd1 = sd2)\n"
			+ "}.status";

	/**
	 * Validates the UniqueServiceName constraint of '<em>Privacy Policy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrivacyPolicy_UniqueServiceName(PrivacyPolicy privacyPolicy, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(PrivacyModelPackage.Literals.PRIVACY_POLICY, privacyPolicy, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "UniqueServiceName",
				PRIVACY_POLICY__UNIQUE_SERVICE_NAME__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the UniqueProviderName constraint of '<em>Privacy Policy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PRIVACY_POLICY__UNIQUE_PROVIDER_NAME__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'Provider name is unique',\n" + "\tstatus : Boolean = \n"
			+ "\t\tself.allProviders->forAll(provider1:Provider,provider2:Provider| provider1.name = provider2.name implies provider1 = provider2)\n"
			+ "}.status";

	/**
	 * Validates the UniqueProviderName constraint of '<em>Privacy Policy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrivacyPolicy_UniqueProviderName(PrivacyPolicy privacyPolicy, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(PrivacyModelPackage.Literals.PRIVACY_POLICY, privacyPolicy, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "UniqueProviderName",
				PRIVACY_POLICY__UNIQUE_PROVIDER_NAME__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the UniqueDocumentName constraint of '<em>Privacy Policy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PRIVACY_POLICY__UNIQUE_DOCUMENT_NAME__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'Document name is unique',\n" + "\tstatus : Boolean = \n"
			+ "\t\tself.allDocuments->forAll(document1:Document,document2:Document| document1.name = document2.name implies document1 = document2)\n"
			+ "}.status";

	/**
	 * Validates the UniqueDocumentName constraint of '<em>Privacy Policy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrivacyPolicy_UniqueDocumentName(PrivacyPolicy privacyPolicy, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(PrivacyModelPackage.Literals.PRIVACY_POLICY, privacyPolicy, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "UniqueDocumentName",
				PRIVACY_POLICY__UNIQUE_DOCUMENT_NAME__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the UniqueConsentName constraint of '<em>Privacy Policy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PRIVACY_POLICY__UNIQUE_CONSENT_NAME__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'Consent name is unique',\n" + "\tstatus : Boolean = \n"
			+ "\t\tself.allConsents->forAll(consent1:Consent,consent2:Consent| consent1.name = consent2.name implies consent1 = consent2)\n"
			+ "}.status";

	/**
	 * Validates the UniqueConsentName constraint of '<em>Privacy Policy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrivacyPolicy_UniqueConsentName(PrivacyPolicy privacyPolicy, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(PrivacyModelPackage.Literals.PRIVACY_POLICY, privacyPolicy, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "UniqueConsentName",
				PRIVACY_POLICY__UNIQUE_CONSENT_NAME__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the UniqueContractName constraint of '<em>Privacy Policy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PRIVACY_POLICY__UNIQUE_CONTRACT_NAME__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'Contract name is unique',\n" + "\tstatus : Boolean = \n"
			+ "\t\tself.allContracts->forAll(contract1:Contract,contract2:Contract| contract1.name = contract2.name implies contract1 = contract2)\n"
			+ "}.status";

	/**
	 * Validates the UniqueComplaintName constraint of '<em>Privacy Policy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrivacyPolicy_UniqueComplaintName(PrivacyPolicy privacyPolicy, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(PrivacyModelPackage.Literals.PRIVACY_POLICY, privacyPolicy, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "UniqueComplaintName",
				PRIVACY_POLICY__UNIQUE_COMPLAINT_NAME__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the UniqueLocationPerType constraint of '<em>Privacy Policy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PRIVACY_POLICY__UNIQUE_LOCATION_PER_TYPE__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'Location name per type is unique',\n" + "\tstatus : Boolean = \n"
			+ "\t\tself.locations->forAll(loc1:Location,loc2:Location| \n" + "\t\t\tif(loc1.type = loc2.type) then \n"
			+ "\t\t\t\tloc1.name = loc2.name implies loc1 = loc2\n" + "\t\t\telse\n" + "\t\t\t\ttrue\n"
			+ "\t\t\tendif\n" + "\t\t)\n" + "}.status";

	/**
	 * Validates the UniqueContractName constraint of '<em>Privacy Policy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrivacyPolicy_UniqueContractName(PrivacyPolicy privacyPolicy, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(PrivacyModelPackage.Literals.PRIVACY_POLICY, privacyPolicy, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "UniqueContractName",
				PRIVACY_POLICY__UNIQUE_CONTRACT_NAME__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the UniqueComplaintName constraint of '<em>Privacy Policy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PRIVACY_POLICY__UNIQUE_COMPLAINT_NAME__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'Complaint name is unique',\n" + "\tstatus : Boolean = \n"
			+ "\t\tself.allComplaints->forAll(complaint1:Complaint,complaint2:Complaint| complaint1.name = complaint2.name implies complaint1 = complaint2)\n"
			+ "}.status";

	/**
	 * Validates the UniqueLocationPerType constraint of '<em>Privacy Policy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrivacyPolicy_UniqueLocationPerType(PrivacyPolicy privacyPolicy, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(PrivacyModelPackage.Literals.PRIVACY_POLICY, privacyPolicy, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "UniqueLocationPerType",
				PRIVACY_POLICY__UNIQUE_LOCATION_PER_TYPE__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the ProtectionControlShouldExistInConfiguration constraint of '<em>Privacy Policy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PRIVACY_POLICY__PROTECTION_CONTROL_SHOULD_EXIST_IN_CONFIGURATION__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'Protection controls should be defined in configuration.',\n"
			+ "\tstatus : Boolean = \n" + "\t\t\tself.defaultProtectionControls->forAll(protectionControl:String|\n"
			+ "\t\t\t\tself.privacyPolicyHelper.isPolicyControlValid(protectionControl)\n" + "\t\t\t)\n" + "}.status";

	/**
	 * Validates the OwnerShouldHaveDefinedInhabits constraint of '<em>Privacy Policy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrivacyPolicy_OwnerShouldHaveDefinedInhabits(PrivacyPolicy privacyPolicy,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(PrivacyModelPackage.Literals.PRIVACY_POLICY, privacyPolicy, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "OwnerShouldHaveDefinedInhabits",
				PRIVACY_POLICY__OWNER_SHOULD_HAVE_DEFINED_INHABITS__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE,
				0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolicyStatement(PolicyStatement policyStatement, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(policyStatement, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(policyStatement, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(policyStatement, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(policyStatement, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(policyStatement, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(policyStatement, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(policyStatement, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(policyStatement, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(policyStatement, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePolicyStatement_DateShouldBeDefinedForAccessAction(policyStatement, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePolicyStatement_DateShouldBeDefinedForStoreAction(policyStatement, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePolicyStatement_WhereShouldBeDefinedForTransferAction(policyStatement, diagnostics,
					context);
		if (result || diagnostics != null)
			result &= validatePolicyStatement_CourtApprovalOrLegalProvisionIsNeededForPublicInterestPurpose(
					policyStatement, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePolicyStatement_ControllerApprovalIsNeededForLegitimateInterestsPurpose(policyStatement,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePolicyStatement_ControllerApprovalIsNeededForProtectTheVitalInterestsOfTheDataSubjectPurpose(
					policyStatement, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePolicyStatement_StopProcessingPurposeForActionStopProcessing(policyStatement, diagnostics,
					context);
		if (result || diagnostics != null)
			result &= validatePolicyStatement_ExpiredDocument(policyStatement, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePolicyStatement_MissingConsentForCollecting(policyStatement, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePolicyStatement_UndefinedPurposeForActionOrUserDoesNotHavePermission(policyStatement,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePolicyStatement_ExpiredConsent(policyStatement, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePolicyStatement_ExpiredConsentForCollecting(policyStatement, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePolicyStatement_WithdrawnConsent(policyStatement, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePolicyStatement_JuvenileDataShouldBeUsedWithDocumentOfTypeChildCustodyProvidedByResponsiblePerson(
					policyStatement, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePolicyStatement_ProcessingOfSpecialCategories(policyStatement, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePolicyStatement_SubjectShouldBeNotifiedAboutCollecting(policyStatement, diagnostics,
					context);
		if (result || diagnostics != null)
			result &= validatePolicyStatement_SubjectShouldBeNotifiedAboutTransferToThirdCountry(policyStatement,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePolicyStatement_CausedByShouldBeDefinedForRectificationAction(policyStatement,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePolicyStatement_CausedByShouldBeDefinedForErasureAction(policyStatement, diagnostics,
					context);
		if (result || diagnostics != null)
			result &= validatePolicyStatement_SubjectShouldBeNotifiedAboutExecutedErasure(policyStatement, diagnostics,
					context);
		if (result || diagnostics != null)
			result &= validatePolicyStatement_SubjectShouldBeNotifiedAboutExecutedRectification(policyStatement,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePolicyStatement_WhomShouldBeDefinedForTransfer(policyStatement, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePolicyStatement_MissingConsentOrContractForDataPortability(policyStatement, diagnostics,
					context);
		if (result || diagnostics != null)
			result &= validatePolicyStatement_SubjectShouldBeNotifiedAboutStopProcessing(policyStatement, diagnostics,
					context);
		if (result || diagnostics != null)
			result &= validatePolicyStatement_CausedByShouldBeDefinedForStopProcessingAction(policyStatement,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePolicyStatement_MissingConsentOrTransferCertificate(policyStatement, diagnostics,
					context);
		if (result || diagnostics != null)
			result &= validatePolicyStatement_MissingContractForContractPerformance(policyStatement, diagnostics,
					context);
		if (result || diagnostics != null)
			result &= validatePolicyStatement_ExpiredContract(policyStatement, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePolicyStatement_LegalProvisionIsNeededForLegalObligationPurpose(policyStatement,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePolicyStatement_ErasureDateShouldBeDefinedForCollecting(policyStatement, diagnostics,
					context);
		if (result || diagnostics != null)
			result &= validatePolicyStatement_ProcessingAfterErasureDate(policyStatement, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePolicyStatement_ProcessingOfCriminalConvictionData(policyStatement, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePolicyStatement_NotForProfitBodyDataShouldNotBeTransferred(policyStatement, diagnostics,
					context);
		if (result || diagnostics != null)
			result &= validatePolicyStatement_CausedByAndDateShouldBeDefinedForRestriction(policyStatement, diagnostics,
					context);
		if (result || diagnostics != null)
			result &= validatePolicyStatement_ProcessingDuringRestriction(policyStatement, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePolicyStatement_SubjectShouldBeNotifiedBeforeLiftingRestriction(policyStatement,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePolicyStatement_RestrictionShouldNotBeLiftedBeforeObjectionDecision(policyStatement,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePolicyStatement_DateShouldBeDefinedForCollectingAction(policyStatement, diagnostics,
					context);
		if (result || diagnostics != null)
			result &= validatePolicyStatement_RecipientsShouldBeNotifiedAboutExecutedErasure(policyStatement,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePolicyStatement_RecipientsShouldBeNotifiedAboutExecutedRectification(policyStatement,
					diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the DateShouldBeDefinedForAccessAction constraint of '<em>Policy Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String POLICY_STATEMENT__DATE_SHOULD_BE_DEFINED_FOR_ACCESS_ACTION__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'Date should be defined',\n" + "\tstatus : Boolean = \n"
			+ "\t\t\tdateShouldBeDefinedForType(Action::Access)\n" + "}.status";

	/**
	 * Validates the StopProcessingPurposeForActionStopProcessing constraint of '<em>Policy Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolicyStatement_StopProcessingPurposeForActionStopProcessing(PolicyStatement policyStatement,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(PrivacyModelPackage.Literals.POLICY_STATEMENT, policyStatement, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "StopProcessingPurposeForActionStopProcessing",
				POLICY_STATEMENT__STOP_PROCESSING_PURPOSE_FOR_ACTION_STOP_PROCESSING__EEXPRESSION, Diagnostic.ERROR,
				DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the ExpiredDocument constraint of '<em>Policy Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String POLICY_STATEMENT__EXPIRED_DOCUMENT__EEXPRESSION = "\n"
			+ "\t\t\tif(self.how = null or not(self.how.documents->notEmpty())) then\n" + "\t\t\t\ttrue\n"
			+ "\t\t\telse\n"
			+ "\t\t\tlet privacyPolicy : PrivacyPolicy = PrivacyPolicy.allInstances()->asSequence()->first() in\n"
			+ "\t\t\t\tself.how.documents->forAll(document|\n"
			+ "\t\t\t\t\t(privacyPolicy.privacyPolicyHelper.isDateInInterval(self.when, document.startDate) or \n"
			+ "\t\t\t\t\tprivacyPolicy.privacyPolicyHelper.isDateBeforeInterval(self.when, document.startDate))\n"
			+ "\t\t\t\t\tand\n"
			+ "\t\t\t\t\t(document.terminationDate = null or (not(privacyPolicy.privacyPolicyHelper.isDateBeforeInterval(self.when, document.terminationDate))))\n"
			+ "\t\t\t\t)\n" + "\t\t\tendif";

	/**
	 * Validates the ExpiredDocument constraint of '<em>Policy Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolicyStatement_ExpiredDocument(PolicyStatement policyStatement, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(PrivacyModelPackage.Literals.POLICY_STATEMENT, policyStatement, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "ExpiredDocument",
				POLICY_STATEMENT__EXPIRED_DOCUMENT__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the MissingConsentForCollecting constraint of '<em>Policy Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String POLICY_STATEMENT__MISSING_CONSENT_FOR_COLLECTING__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'Based on Art6',\n" + "\tstatus : Boolean = \n"
			+ "\t\t\tif(self.whose = null or not(self.what.actions->exists(action| action = Action::Collecting))) then\n"
			+ "\t\t\t\ttrue\n" + "\t\t\telse if(self.hasProcessingReason(ProcessingReason::LegalObligation)) then\n"
			+ "\t\t\t\ttrue\n" + "\t\t\telse if(self.hasProcessingReason(ProcessingReason::PublicInterest)) then\n"
			+ "\t\t\t\tnot(self.how = null) and self.how.documents->exists(doc| doc.documentType = DocumentType::CourtApproval or doc.documentType = DocumentType::LegalProvision)\n"
			+ "\t\t\telse if(self.hasProcessingReason(ProcessingReason::LegitimateInterests) or\n"
			+ "\t\t\t\tself.hasProcessingReason(ProcessingReason::ProtectTheVitalInterestsOfTheDataSubject)) then\n"
			+ "\t\t\t\tnot(self.how = null) and self.how.documents->exists(doc| doc.documentType = DocumentType::ControllerApproval)\n"
			+ "\t\t\telse if(self.hasProcessingReason(ProcessingReason::ContractPerformance)) then\n"
			+ "\t\t\t\tself.isContractProvidedBySubject()\n"
			+ "\t\t\telse if(self.whose.type = PrincipalType::NaturalPerson and self.whose.age < PrivacyPolicy.allInstances()->asSequence()->first().privacyPolicyHelper.legalAgeLimitFor(self.whose)) then\n"
			+ "\t\t\t\tnot(self.how = null) and not(self.how.consent = null) and self.whose.responsiblePersons->exists(person| self.how.consent.providedBy = person)\n"
			+ "\t\t\telse \n"
			+ "\t\t\t\tnot(self.how = null) and not(self.how.consent = null) and (self.how.consent.providedBy = self.whose or self.whose.responsiblePersons->exists(person| self.how.consent.providedBy = person))\n"
			+ "\t\t\tendif\n" + "\t\t\tendif\n" + "\t\t\tendif\n" + "\t\t\tendif\n" + "\t\t\tendif\n" + "\t\t\tendif\n"
			+ "}.status";

	/**
	 * Validates the SubjectShouldBeNotifiedBeforeLiftingRestriction constraint of '<em>Policy Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolicyStatement_SubjectShouldBeNotifiedBeforeLiftingRestriction(
			PolicyStatement policyStatement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(PrivacyModelPackage.Literals.POLICY_STATEMENT, policyStatement, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "SubjectShouldBeNotifiedBeforeLiftingRestriction",
				POLICY_STATEMENT__SUBJECT_SHOULD_BE_NOTIFIED_BEFORE_LIFTING_RESTRICTION__EEXPRESSION, Diagnostic.ERROR,
				DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the RestrictionShouldNotBeLiftedBeforeObjectionDecision constraint of '<em>Policy Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String POLICY_STATEMENT__RESTRICTION_SHOULD_NOT_BE_LIFTED_BEFORE_OBJECTION_DECISION__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'Based on Art18',\n" + "\tstatus : Boolean = \n"
			+ "\t\t\tif(self.whose = null or self.what = null or not(self.what.actions->exists(act| act = Action::LiftRestriction))) then\n"
			+ "\t\t\t\ttrue\n" + "\t\t\telse\n"
			+ "\t\t\tlet privacyPolicy : PrivacyPolicy = PrivacyPolicy.allInstances()->asSequence()->first() in\n"
			+ "\t\t\t\tnot(privacyPolicy.allComplaints->exists(c| c.action.oclIsKindOf(ComplaintBasedOnAction) and\n"
			+ "\t\t\t\t\tlet objection : ComplaintBasedOnAction = c.action.oclAsType(ComplaintBasedOnAction) in\n"
			+ "\t\t\t\t\t\tobjection.type = ComplaintBasedOnActionType::Objection and objection.denialReason = null and\n"
			+ "\t\t\t\t\t\tnot(objection.statement = null) and objection.statement.whose = self.whose and not(objection.statement.what = null) and\n"
			+ "\t\t\t\t\t\tobjection.statement.what.datas->exists(d| self.what.datas->exists(sd| sd.privacydata = d.privacydata)) and\n"
			+ "\t\t\t\t\t\tnot(privacyPolicy.policyStatements->exists(stop| not(stop.what = null) and\n"
			+ "\t\t\t\t\t\t\tstop.what.actions->exists(a| a = Action::StopProcessing) and stop.causedBy = c))))\n"
			+ "\t\t\tendif\n" + "}.status";

	/**
	 * Validates the MissingConsentOrContractForDataPortability constraint of '<em>Policy Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolicyStatement_MissingConsentOrContractForDataPortability(PolicyStatement policyStatement,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(PrivacyModelPackage.Literals.POLICY_STATEMENT, policyStatement, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "MissingConsentOrContractForDataPortability",
				POLICY_STATEMENT__MISSING_CONSENT_OR_CONTRACT_FOR_DATA_PORTABILITY__EEXPRESSION, Diagnostic.ERROR,
				DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the SubjectShouldBeNotifiedAboutStopProcessing constraint of '<em>Policy Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String POLICY_STATEMENT__SUBJECT_SHOULD_BE_NOTIFIED_ABOUT_STOP_PROCESSING__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'Based on Art12 and Art21',\n" + "\tstatus : Boolean = \n"
			+ "\t\t\tif(what.actions->exists(action| action = Action::StopProcessing)) then\n"
			+ "\t\t\t\t\tPrivacyPolicy.allInstances()->asSequence()->first().notifications->exists(notification| notification.type = NotificationType::StopProcessing and \n"
			+ "\t\t\t\t\t\tnotification.causedBy = self\n" + "\t\t\t\t\t)\n" + "\t\t\t\telse\n" + "\t\t\t\t\ttrue\n"
			+ "\t\t\tendif\n" + "}.status";

	/**
	 * Validates the MissingConsentForCollecting constraint of '<em>Policy Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolicyStatement_MissingConsentForCollecting(PolicyStatement policyStatement,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(PrivacyModelPackage.Literals.POLICY_STATEMENT, policyStatement, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "MissingConsentForCollecting",
				POLICY_STATEMENT__MISSING_CONSENT_FOR_COLLECTING__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the UndefinedPurposeForActionOrUserDoesNotHavePermission constraint of '<em>Policy Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String POLICY_STATEMENT__UNDEFINED_PURPOSE_FOR_ACTION_OR_USER_DOES_NOT_HAVE_PERMISSION__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'Based on Art6 and Art9',\n" + "\tstatus : Boolean = \n"
			+ "\t\tif(self.whose = null or self.what.actions->exists(act| act = Action::Collecting or act = Action::StopProcessing or act = Action::RestrictProcessing or act = Action::LiftRestriction)) then\n"
			+ "\t\t\ttrue\n" + "\t\telse\n"
			+ "\t\t\tlet privacyPolicy : PrivacyPolicy = PrivacyPolicy.allInstances()->asSequence()->first() in\n"
			+ "\t\t\tself.what.datas->forAll(data|\n"
			+ "\t\t\t\tlet statements = privacyPolicy.policyStatements->select(st| \n"
			+ "\t\t\t\t\tnot(st.whose = null) and st.whose = self.whose \n"
			+ "\t\t\t\t\tand st.what.actions->exists(act| act = Action::Collecting) and st.what.datas->exists(d| d = data))\n"
			+ "\t\t\t\tin \n" + "\t\t\t\tif(statements->isEmpty()) then \n" + "\t\t\t\t\ttrue\n"
			+ "\t\t\t\telse if(self.why = null) then\n" + "\t\t\t\t\tfalse\n" + "\t\t\t\telse\n"
			+ "\t\t\t\t\tstatements->exists(st|\n"
			+ "\t\t\t\t\t\tprivacyPolicy.privacyPolicyHelper.areIntervalsOverlap(self.when, st.when)\n"
			+ "\t\t\t\t\t\tand (not(st.whom = null) and (self.who.equals(st.whom) or st.whom.subPrincipals->exists(subprincipal| subprincipal = self.who) \n"
			+ "\t\t\t\t\t\t\tor self.who.equals(st.whose) or st.whose.responsiblePersons->exists(responsiblePerson| responsiblePerson = self.who)))\n"
			+ "\t\t\t\t\t\tand ((not(st.why = null) and st.why.isValid(self.why)) or \n"
			+ "\t\t\t\t\t\t\tlet reasons = Sequence{ProcessingReason::PublicInterest, ProcessingReason::LegitimateInterests, ProcessingReason::ProtectTheVitalInterestsOfTheDataSubject,\n"
			+ "\t\t\t\t\t\t\t\tProcessingReason::LegalObligation, ProcessingReason::ContractPerformance, ProcessingReason::PublicHealth,\n"
			+ "\t\t\t\t\t\t\t\tProcessingReason::Research, ProcessingReason::StatisticalPurposes} in\n"
			+ "\t\t\t\t\t\t\treasons->includes(self.why.processingReason) or self.why.subPurposes->exists(subpurpose| reasons->includes(subpurpose.processingReason)))\n"
			+ "\t\t\t\t\t)\n" + "\t\t\t\tendif\n" + "\t\t\t\tendif\n" + "\t\t\t)\n" + "\t\tendif\n" + "}.status";

	/**
	 * Validates the UndefinedPurposeForActionOrUserDoesNotHavePermission constraint of '<em>Policy Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolicyStatement_UndefinedPurposeForActionOrUserDoesNotHavePermission(
			PolicyStatement policyStatement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(PrivacyModelPackage.Literals.POLICY_STATEMENT, policyStatement, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				"UndefinedPurposeForActionOrUserDoesNotHavePermission",
				POLICY_STATEMENT__UNDEFINED_PURPOSE_FOR_ACTION_OR_USER_DOES_NOT_HAVE_PERMISSION__EEXPRESSION,
				Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the ExpiredConsent constraint of '<em>Policy Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String POLICY_STATEMENT__EXPIRED_CONSENT__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'Based on Art6',\n" + "\tstatus : Boolean = \n"
			+ "\t\t\tif(self.whose = null or self.what.actions->exists(act| act = Action::Collecting or act = Action::StopProcessing or act = Action::RestrictProcessing or act = Action::LiftRestriction)) then\n"
			+ "\t\t\t\ttrue\n" + "\t\t\telse\n"
			+ "\t\t\tlet privacyPolicy : PrivacyPolicy = PrivacyPolicy.allInstances()->asSequence()->first() in\n"
			+ "\t\t\t\tself.what.datas->forAll(data |\n"
			+ "\t\t\t\t\tlet statements = privacyPolicy.policyStatements->select(st| \n"
			+ "\t\t\t\t\t\tnot(st.whose = null) and st.whose = self.whose and \n"
			+ "\t\t\t\t\t\t(self.who.equals(st.who) or (not(st.who = null) and st.who.equals(self.who)) or \n"
			+ "\t\t\t\t\t\t(not(st.whom = null) and (self.who.equals(st.whom) or st.whom.subPrincipals->exists(subprincipal| subprincipal = self.who)))) and \n"
			+ "\t\t\t\t\t\tst.what.actions->exists(act| act = Action::Collecting) and st.what.datas->exists(d| d = data))\n"
			+ "\t\t\t\t\t\tin \n" + "\t\t\t\t\t\tif(statements->isEmpty()) then \n" + "\t\t\t\t\t\t\ttrue\n"
			+ "\t\t\t\t\t\telse\n" + "\t\t\t\t\t\t\tstatements -> exists(st|\n"
			+ "\t\t\t\t\t\t\t\tif(privacyPolicy.privacyPolicyHelper.areIntervalsOverlap(self.when, st.when)) then\n"
			+ "\t\t\t\t\t\t\t\t\tif(self.why = null \n" + "\t\t\t\t\t\t\t\t\t\tor \n"
			+ "\t\t\t\t\t\t\t\t\t\tlet reasons = Sequence{ProcessingReason::PublicInterest,ProcessingReason::LegitimateInterests,ProcessingReason::ProtectTheVitalInterestsOfTheDataSubject,\n"
			+ "\t\t\t\t\t\t\t\t\t\t\tProcessingReason::LegalObligation, ProcessingReason::ContractPerformance} in\n"
			+ "\t\t\t\t\t\t\t\t\t\t\treasons->includes(self.why.processingReason) or self.why.subPurposes->exists(subpurpose| reasons->includes(subpurpose.processingReason)\n"
			+ "\t\t\t\t\t\t\t\t\t)) then\n" + "\t\t\t\t\t\t\t\t\t\ttrue\n" + "\t\t\t\t\t\t\t\t\telse\n"
			+ "\t\t\t\t\t\t\t\t\t\tnot(st.how = null) and not(st.how.consent = null) and\n"
			+ "\t\t\t\t\t\t\t\t\t\tnot(privacyPolicy.privacyPolicyHelper.isDateAfterInterval(self.when, st.how.consent.startDate)) and\n"
			+ "\t\t\t\t\t\t\t\t\t\t(st.how.consent.terminationDate = null or not(privacyPolicy.privacyPolicyHelper.isDateBeforeInterval(self.when, st.how.consent.terminationDate)))\n"
			+ "\t\t\t\t\t\t\t\t\tendif\n" + "\t\t\t\t\t\t\t\telse\n" + "\t\t\t\t\t\t\t\t\tfalse\n"
			+ "\t\t\t\t\t\t\t\tendif\n" + "\t\t\t\t\t\t\t)\n" + "\t\t\t\t\t\tendif\n" + "\t\t\t\t)\n" + "\t\t\tendif\n"
			+ "}.status";

	/**
	 * Validates the ErasureDateShouldBeDefinedForCollecting constraint of '<em>Policy Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolicyStatement_ErasureDateShouldBeDefinedForCollecting(PolicyStatement policyStatement,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(PrivacyModelPackage.Literals.POLICY_STATEMENT, policyStatement, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "ErasureDateShouldBeDefinedForCollecting",
				POLICY_STATEMENT__ERASURE_DATE_SHOULD_BE_DEFINED_FOR_COLLECTING__EEXPRESSION, Diagnostic.ERROR,
				DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the ProcessingAfterErasureDate constraint of '<em>Policy Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String POLICY_STATEMENT__PROCESSING_AFTER_ERASURE_DATE__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'Based on Art5',\n" + "\tstatus : Boolean = \n"
			+ "\t\t\tif(self.whose = null or self.what = null or self.when = null or\n"
			+ "\t\t\t\tself.what.actions->forAll(act| act = Action::Collecting or act = Action::Erasure or act = Action::StopProcessing or act = Action::RestrictProcessing or act = Action::LiftRestriction) or\n"
			+ "\t\t\t\tself.hasProcessingReason(ProcessingReason::Research) or\n"
			+ "\t\t\t\tself.hasProcessingReason(ProcessingReason::StatisticalPurposes)) then\n" + "\t\t\t\ttrue\n"
			+ "\t\t\telse\n"
			+ "\t\t\tlet privacyPolicy : PrivacyPolicy = PrivacyPolicy.allInstances()->asSequence()->first() in\n"
			+ "\t\t\t\tself.what.datas->forAll(data |\n"
			+ "\t\t\t\t\tlet collectingStatements : Sequence(PolicyStatement) = privacyPolicy.policyStatements->select(st|\n"
			+ "\t\t\t\t\t\tnot(st.whose = null) and st.whose = self.whose and not(st.what = null) and\n"
			+ "\t\t\t\t\t\tst.what.actions->exists(act| act = Action::Collecting) and st.what.datas->exists(d| d = data) and\n"
			+ "\t\t\t\t\t\tnot(st.why = null) and not(st.why.erasureDate = null))->asSequence() in\n"
			+ "\t\t\t\t\t\tcollectingStatements->isEmpty() or\n"
			+ "\t\t\t\t\t\tcollectingStatements->exists(st| not(privacyPolicy.privacyPolicyHelper.isDateBeforeInterval(self.when, st.why.erasureDate)))\n"
			+ "\t\t\t\t)\n" + "\t\t\tendif\n" + "}.status";

	/**
	 * Validates the ExpiredConsent constraint of '<em>Policy Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolicyStatement_ExpiredConsent(PolicyStatement policyStatement, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(PrivacyModelPackage.Literals.POLICY_STATEMENT, policyStatement, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "ExpiredConsent",
				POLICY_STATEMENT__EXPIRED_CONSENT__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the ExpiredConsentForCollecting constraint of '<em>Policy Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String POLICY_STATEMENT__EXPIRED_CONSENT_FOR_COLLECTING__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'Based on Art6',\n" + "\tstatus : Boolean = \n"
			+ "\t\t\tif(self.whose = null or not(self.what.actions->exists(act| act = Action::Collecting)) or self.how = null or self.how.consent = null) then\n"
			+ "\t\t\t\ttrue\n" + "\t\t\telse\n"
			+ "\t\t\tlet privacyPolicy : PrivacyPolicy = PrivacyPolicy.allInstances()->asSequence()->first() in\n"
			+ "\t\t\t\tif(self.why = null \n" + "\t\t\t\t\tor \n"
			+ "\t\t\t\t\tlet reasons = Sequence{ProcessingReason::PublicInterest,ProcessingReason::LegitimateInterests,ProcessingReason::ProtectTheVitalInterestsOfTheDataSubject,\n"
			+ "\t\t\t\t\t\t\t\t\t\t\tProcessingReason::LegalObligation, ProcessingReason::ContractPerformance} in\n"
			+ "\t\t\t\t\t\treasons->includes(self.why.processingReason) or self.why.subPurposes->exists(subpurpose| reasons->includes(subpurpose.processingReason)\n"
			+ "\t\t\t\t)) then\n" + "\t\t\t\t\ttrue\n" + "\t\t\t\telse\n"
			+ "\t\t\t\t\t(privacyPolicy.privacyPolicyHelper.isDateInInterval(self.when, self.how.consent.startDate) or\n"
			+ "\t\t\t\t\tprivacyPolicy.privacyPolicyHelper.isDateBeforeInterval(self.when, self.how.consent.startDate))\n"
			+ "\t\t\t\t\tand\n"
			+ "\t\t\t\t\t(self.how.consent.terminationDate = null or not(privacyPolicy.privacyPolicyHelper.isDateBeforeInterval(self.when, self.how.consent.terminationDate)))\n"
			+ "\t\t\t\tendif\n" + "\t\t\tendif\n" + "}.status";

	/**
	 * Validates the ExpiredConsentForCollecting constraint of '<em>Policy Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolicyStatement_ExpiredConsentForCollecting(PolicyStatement policyStatement,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(PrivacyModelPackage.Literals.POLICY_STATEMENT, policyStatement, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "ExpiredConsentForCollecting",
				POLICY_STATEMENT__EXPIRED_CONSENT_FOR_COLLECTING__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the WithdrawnConsent constraint of '<em>Policy Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String POLICY_STATEMENT__WITHDRAWN_CONSENT__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'Based on Art7',\n" + "\tstatus : Boolean = \n"
			+ "\t\tif(self.whose = null or self.when = null or self.what.actions->exists(act| act = Action::Collecting or act = Action::StopProcessing or act = Action::RestrictProcessing or act = Action::LiftRestriction or act = Action::Erasure)) then\n"
			+ "\t\t\ttrue\n" + "\t\telse if(self.why = null \n" + "\t\t\tor \n"
			+ "\t\t\tlet reasons = Sequence{ProcessingReason::PublicInterest,ProcessingReason::LegitimateInterests,ProcessingReason::ProtectTheVitalInterestsOfTheDataSubject,\n"
			+ "\t\t\t\tProcessingReason::LegalObligation, ProcessingReason::ContractPerformance} in\n"
			+ "\t\t\treasons->includes(self.why.processingReason) or self.why.subPurposes->exists(subpurpose| reasons->includes(subpurpose.processingReason))\n"
			+ "\t\t\t) then\n" + "\t\t\ttrue\n" + "\t\telse\n"
			+ "\t\t\tlet privacyPolicy : PrivacyPolicy = PrivacyPolicy.allInstances()->asSequence()->first() in\n"
			+ "\t\t\tself.what.datas->forAll(data|\n"
			+ "\t\t\t\tlet statements = privacyPolicy.policyStatements->select(st: PolicyStatement| \n"
			+ "\t\t\t\t\tnot(st.whose = null) and st.whose = self.whose and \n"
			+ "\t\t\t\t\t(self.who.equals(st.who) or (not(st.who = null) and st.who.equals(self.who)) or \n"
			+ "\t\t\t\t\t(not(st.whom = null) and (self.who.equals(st.whom) or st.whom.subPrincipals->exists(subprincipal| subprincipal = self.who)))) and \n"
			+ "\t\t\t\t\tst.what.actions->exists(act| act = Action::Collecting) and st.what.datas->exists(d| d = data) and\n"
			+ "\t\t\t\t\tprivacyPolicy.privacyPolicyHelper.areIntervalsOverlap(self.when, st.when))\n" + "\t\t\t\tin \n"
			+ "\t\t\t\tlet consentStatements = statements->select(st| not(st.how = null) and not(st.how.consent = null)) in\n"
			+ "\t\t\t\tconsentStatements->isEmpty() or\n" + "\t\t\t\tconsentStatements->exists(st|\n"
			+ "\t\t\t\t\tnot(privacyPolicy.allComplaints->exists(complaint| complaint.action.oclIsTypeOf(Withdraw) and \n"
			+ "\t\t\t\t\t\tlet withdrawal : Withdraw = complaint.action.oclAsType(Withdraw) in\n"
			+ "\t\t\t\t\t\twithdrawal.subject = st.how.consent\n"
			+ "\t\t\t\t\t\tand (privacyPolicy.privacyPolicyHelper.isDateInInterval(self.when, complaint.when) \n"
			+ "\t\t\t\t\t\t\tor privacyPolicy.privacyPolicyHelper.isDateBeforeInterval(self.when, complaint.when))\n"
			+ "\t\t\t\t\t\tand not(privacyPolicy.policyStatements->exists(stopStatement| \n"
			+ "\t\t\t\t\t\t\tnot(stopStatement.when = null) and\n"
			+ "\t\t\t\t\t\t\tstopStatement.what.actions->exists(act| act = Action::StopProcessing) and \n"
			+ "\t\t\t\t\t\t\tstopStatement.what.datas->exists(d| d = data) and not(stopStatement.causedBy = null) and \n"
			+ "\t\t\t\t\t\t\tstopStatement.causedBy.action = withdrawal and\n"
			+ "\t\t\t\t\t\t\tnot(privacyPolicy.privacyPolicyHelper.doesIntervalStartBeforeInterval(stopStatement.when, self.when))))\n"
			+ "\t\t\t\t\t))\n" + "\t\t\t\t)\n" + "\t\t\t)\n" + "\t\tendif\n" + "\t\tendif\n" + "}.status";

	/**
	 * Validates the JuvenileDataShouldBeUsedWithDocumentOfTypeChildCustodyProvidedByResponsiblePerson constraint of '<em>Policy Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolicyStatement_JuvenileDataShouldBeUsedWithDocumentOfTypeChildCustodyProvidedByResponsiblePerson(
			PolicyStatement policyStatement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(PrivacyModelPackage.Literals.POLICY_STATEMENT, policyStatement, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				"JuvenileDataShouldBeUsedWithDocumentOfTypeChildCustodyProvidedByResponsiblePerson",
				POLICY_STATEMENT__JUVENILE_DATA_SHOULD_BE_USED_WITH_DOCUMENT_OF_TYPE_CHILD_CUSTODY_PROVIDED_BY_RESPONSIBLE_PERSON__EEXPRESSION,
				Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the ProcessingOfSpecialCategories constraint of '<em>Policy Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String POLICY_STATEMENT__PROCESSING_OF_SPECIAL_CATEGORIES__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'Based on Art9',\n" + "\tstatus : Boolean = \n"
			+ "\t\t\tif(self.what = null or self.what.actions->exists(action | action = Action::StopProcessing or action = Action::RestrictProcessing or action = Action::LiftRestriction or action = Action::Erasure)) then\n"
			+ "\t\t\t\ttrue\n" + "\t\t\telse\n" + "\t\t\tself.what.datas->forAll(data| \n"
			+ "\t\t\t\tlet specialCategories : Sequence(DataType) = Sequence{DataType::Biometric, DataType::Genetic, DataType::Health, DataType::PoliticalOpinion, \n"
			+ "\t\t\t\t\tDataType::RacialOrEthnicOrigin, DataType::Beliefs, DataType::Religious, DataType::SexLife, DataType::TradeUnionMembership\n"
			+ "\t\t\t\t} in\n" + "\t\t\t\tif(specialCategories->includes(data.privacydata.type)) then\n"
			+ "\t\t\t\t\t(not(self.how = null) and not(self.how.consent = null) and self.how.consent.type = ConsentType::Explicit)\n"
			+ "\t\t\t\t\tor self.hasProcessingReason(ProcessingReason::ExercisingSpecificRights)\n"
			+ "\t\t\t\t\tor (not(self.why = null) and\n"
			+ "\t\t\t\t\t\t(self.why.containsAllowedPurposeReasonAndSubreason(ProcessingReason::ProtectTheVitalInterestsOfTheDataSubject,\n"
			+ "\t\t\t\t\t\t\tSequence{ProcessingReasonSubtype::PhysicallyIncapable, ProcessingReasonSubtype::LegallyIncapable}) or\n"
			+ "\t\t\t\t\t\tself.why.subPurposes->exists(sub| sub.containsAllowedPurposeReasonAndSubreason(ProcessingReason::ProtectTheVitalInterestsOfTheDataSubject,\n"
			+ "\t\t\t\t\t\t\tSequence{ProcessingReasonSubtype::PhysicallyIncapable, ProcessingReasonSubtype::LegallyIncapable}))))\n"
			+ "\t\t\t\t\tor self.hasProcessingReason(ProcessingReason::PublicInterest)\n"
			+ "\t\t\t\t\tor self.hasProcessingReason(ProcessingReason::PublicHealth)\n"
			+ "\t\t\t\t\tor self.hasProcessingReason(ProcessingReason::Research)\n"
			+ "\t\t\t\t\tor self.hasProcessingReason(ProcessingReason::StatisticalPurposes)\n"
			+ "\t\t\t\t\tor self.hasProcessingReason(ProcessingReason::NotForProfitBodyActivity)\n"
			+ "\t\t\t\t\tor self.hasProcessingReason(ProcessingReason::HealthCare)\n"
			+ "\t\t\t\t\tor self.hasProcessingReason(ProcessingReason::LegalClaims)\n"
			+ "\t\t\t\t\tor data.origin = DataOrigin::MadePublicByDataSubject\n" + "\t\t\t\telse\n" + "\t\t\t\t\ttrue\n"
			+ "\t\t\t\tendif\n" + "\t\t\t)\n" + "\t\t\tendif\n" + "}.status";

	/**
	 * Validates the WithdrawnConsent constraint of '<em>Policy Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolicyStatement_WithdrawnConsent(PolicyStatement policyStatement,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(PrivacyModelPackage.Literals.POLICY_STATEMENT, policyStatement, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "WithdrawnConsent",
				POLICY_STATEMENT__WITHDRAWN_CONSENT__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the JuvenileDataShouldBeUsedWithDocumentOfTypeChildCustodyProvidedByResponsiblePerson constraint of '<em>Policy Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String POLICY_STATEMENT__JUVENILE_DATA_SHOULD_BE_USED_WITH_DOCUMENT_OF_TYPE_CHILD_CUSTODY_PROVIDED_BY_RESPONSIBLE_PERSON__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'Based on Art8 and national law',\n" + "\tstatus : Boolean = \n"
			+ "\t\t\tif(self.whose = null or not(self.what.actions->exists(action| action = Action::Collecting))) then\n"
			+ "\t\t\t\ttrue\n"
			+ "\t\t\telse if(self.whose.type = PrincipalType::NaturalPerson and self.whose.age < PrivacyPolicy.allInstances()->asSequence()->first().privacyPolicyHelper.legalAgeLimitFor(self.whose)) then\n"
			+ "\t\t\t\tif(self.how = null or self.whose.responsiblePersons->isEmpty() or self.how.documents->isEmpty() or \n"
			+ "\t\t\t\t\tnot(self.how.documents->exists(document| document.documentType = DocumentType::ChildCustody and self.whose.responsiblePersons->exists(p|p=document.providedBy)))\n"
			+ "\t\t\t\t) then \n" + "\t\t\t\t\tfalse\n" + "\t\t\t\telse\n" + "\t\t\t\t\ttrue\n" + "\t\t\t\tendif\n"
			+ "\t\t\telse\n" + "\t\t\t\ttrue\n" + "\t\t\tendif\n" + "\t\t\tendif\n" + "}.status";

	/**
	 * Validates the ProcessingOfSpecialCategories constraint of '<em>Policy Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolicyStatement_ProcessingOfSpecialCategories(PolicyStatement policyStatement,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(PrivacyModelPackage.Literals.POLICY_STATEMENT, policyStatement, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "ProcessingOfSpecialCategories",
				POLICY_STATEMENT__PROCESSING_OF_SPECIAL_CATEGORIES__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE,
				0);
	}

	/**
	 * The cached validation expression for the SubjectShouldBeNotifiedAboutCollecting constraint of '<em>Policy Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String POLICY_STATEMENT__SUBJECT_SHOULD_BE_NOTIFIED_ABOUT_COLLECTING__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'Based on Art14',\n" + "\tstatus : Boolean = \n"
			+ "\t\t\tif(self.what.actions->exists(action| action = Action::Collecting) and self.what.datas->exists(data| data.origin <> DataOrigin::DataSubject)) then\n"
			+ "\t\t\t\tif((((not(self.why = null) and \n"
			+ "\t\t\t\t(self.why.containsAllowedPurposeReasonAndSubreason(ProcessingReason::PublicInterest,Sequence{ProcessingReasonSubtype::None}) or\n"
			+ "\t\t\t\t\tself.why.containsAllowedPurposeReasonAndSubreason(ProcessingReason::Research,Sequence{ProcessingReasonSubtype::Statistical, \n"
			+ "\t\t\t\t\t\tProcessingReasonSubtype::Historical,ProcessingReasonSubtype::Scientific})))\n"
			+ "\t\t\t\t\tor self.hasProcessingReason(ProcessingReason::StatisticalPurposes))\n"
			+ "\t\t\t\t\tand not(self.how = null) and self.how.documents->exists(doc| doc.documentType = DocumentType::ControllerApproval))\n"
			+ "\t\t\t\t\tor (self.hasProcessingReason(ProcessingReason::LegalObligation) and not(self.how = null) and\n"
			+ "\t\t\t\t\t\tself.how.documents->exists(doc| doc.documentType = DocumentType::LegalProvision))\n"
			+ "\t\t\t\t)then\n" + "\t\t\t\t\ttrue\n" + "\t\t\t\telse\n"
			+ "\t\t\t\t\tPrivacyPolicy.allInstances()->asSequence()->first().notifications->exists(notification| notification.type = NotificationType::DataCollecting \n"
			+ "\t\t\t\t\t\tand notification.causedBy = self\n" + "\t\t\t\t\t)\n" + "\t\t\t\tendif\n" + "\t\t\t\telse\n"
			+ "\t\t\t\t\ttrue\n" + "\t\t\tendif\n" + "}.status";

	/**
	 * Validates the SubjectShouldBeNotifiedAboutCollecting constraint of '<em>Policy Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolicyStatement_SubjectShouldBeNotifiedAboutCollecting(PolicyStatement policyStatement,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(PrivacyModelPackage.Literals.POLICY_STATEMENT, policyStatement, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "SubjectShouldBeNotifiedAboutCollecting",
				POLICY_STATEMENT__SUBJECT_SHOULD_BE_NOTIFIED_ABOUT_COLLECTING__EEXPRESSION, Diagnostic.ERROR,
				DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the SubjectShouldBeNotifiedAboutTransferToThirdCountry constraint of '<em>Policy Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String POLICY_STATEMENT__SUBJECT_SHOULD_BE_NOTIFIED_ABOUT_TRANSFER_TO_THIRD_COUNTRY__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'Based on Art13(1)(f) and Art14(1)(f)',\n" + "\tstatus : Boolean = \n"
			+ "\t\t\tif(self.what.actions->exists(action| action = Action::Transfer) and not(self.where = null) and\n"
			+ "\t\t\t\tnot(self.where.destination = null) and self.where.destination.isEUMember = false\n"
			+ "\t\t\t) then\n"
			+ "\t\t\t\t\tPrivacyPolicy.allInstances()->asSequence()->first().notifications->exists(notification| notification.type = NotificationType::ThirdPartyTransfer \n"
			+ "\t\t\t\t\t\tand notification.causedBy = self\n" + "\t\t\t\t\t)\n" + "\t\t\t\telse\n" + "\t\t\t\t\ttrue\n"
			+ "\t\t\tendif\n" + "}.status";

	/**
	 * Validates the SubjectShouldBeNotifiedAboutTransferToThirdCountry constraint of '<em>Policy Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolicyStatement_SubjectShouldBeNotifiedAboutTransferToThirdCountry(
			PolicyStatement policyStatement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(PrivacyModelPackage.Literals.POLICY_STATEMENT, policyStatement, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "SubjectShouldBeNotifiedAboutTransferToThirdCountry",
				POLICY_STATEMENT__SUBJECT_SHOULD_BE_NOTIFIED_ABOUT_TRANSFER_TO_THIRD_COUNTRY__EEXPRESSION,
				Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the CausedByShouldBeDefinedForRectificationAction constraint of '<em>Policy Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String POLICY_STATEMENT__CAUSED_BY_SHOULD_BE_DEFINED_FOR_RECTIFICATION_ACTION__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'Based on Art16',\n" + "\tstatus : Boolean = \n"
			+ "\t\t\tcausedByShouldBeDefinedForType(Action::Rectification)\n" + "}.status";

	/**
	 * Validates the ProcessingDuringRestriction constraint of '<em>Policy Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolicyStatement_ProcessingDuringRestriction(PolicyStatement policyStatement,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(PrivacyModelPackage.Literals.POLICY_STATEMENT, policyStatement, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "ProcessingDuringRestriction",
				POLICY_STATEMENT__PROCESSING_DURING_RESTRICTION__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the SubjectShouldBeNotifiedBeforeLiftingRestriction constraint of '<em>Policy Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String POLICY_STATEMENT__SUBJECT_SHOULD_BE_NOTIFIED_BEFORE_LIFTING_RESTRICTION__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'Based on Art18',\n" + "\tstatus : Boolean = \n"
			+ "\t\t\tif(self.what = null or not(self.what.actions->exists(act| act = Action::LiftRestriction))) then\n"
			+ "\t\t\t\ttrue\n" + "\t\t\telse\n"
			+ "\t\t\tlet privacyPolicy : PrivacyPolicy = PrivacyPolicy.allInstances()->asSequence()->first() in\n"
			+ "\t\t\t\tprivacyPolicy.notifications->exists(notification| notification.type = NotificationType::RestrictionLifted and\n"
			+ "\t\t\t\t\tnotification.causedBy = self and not(notification.when = null) and\n"
			+ "\t\t\t\t\t(self.when = null or not(privacyPolicy.privacyPolicyHelper.isDateAfterInterval(self.when, notification.when))))\n"
			+ "\t\t\tendif\n" + "}.status";

	/**
	 * Validates the CausedByShouldBeDefinedForRectificationAction constraint of '<em>Policy Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolicyStatement_CausedByShouldBeDefinedForRectificationAction(
			PolicyStatement policyStatement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(PrivacyModelPackage.Literals.POLICY_STATEMENT, policyStatement, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "CausedByShouldBeDefinedForRectificationAction",
				POLICY_STATEMENT__CAUSED_BY_SHOULD_BE_DEFINED_FOR_RECTIFICATION_ACTION__EEXPRESSION, Diagnostic.ERROR,
				DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the CausedByShouldBeDefinedForErasureAction constraint of '<em>Policy Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String POLICY_STATEMENT__CAUSED_BY_SHOULD_BE_DEFINED_FOR_ERASURE_ACTION__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'Based on Art17',\n" + "\tstatus : Boolean = \n"
			+ "\t\t\tif(self.what = null or not(self.what.actions->exists(act| act = Action::Erasure)) or not(self.causedBy = null)) then\n"
			+ "\t\t\t\ttrue\n" + "\t\t\telse\n"
			+ "\t\t\t\tlet privacyPolicy : PrivacyPolicy = PrivacyPolicy.allInstances()->asSequence()->first() in\n"
			+ "\t\t\t\tnot(self.whose = null) and\n"
			+ "\t\t\t\tprivacyPolicy.policyStatements->exists(col| not(col.what = null) and\n"
			+ "\t\t\t\t\tcol.what.actions->exists(act| act = Action::Collecting) and\n"
			+ "\t\t\t\t\tcol.whose = self.whose and not(col.why = null) and not(col.why.erasureDate = null) and\n"
			+ "\t\t\t\t\tcol.what.datas->exists(d| self.what.datas->exists(sd| sd.privacydata = d.privacydata)) and\n"
			+ "\t\t\t\t\t(self.when = null or not(privacyPolicy.privacyPolicyHelper.isDateAfterInterval(self.when, col.why.erasureDate))))\n"
			+ "\t\t\tendif\n" + "}.status";

	/**
	 * The cached validation expression for the ControllerApprovalIsNeededForLegitimateInterestsPurpose constraint of '<em>Policy Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String POLICY_STATEMENT__CONTROLLER_APPROVAL_IS_NEEDED_FOR_LEGITIMATE_INTERESTS_PURPOSE__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'Based on Art6(1)(f)',\n" + "\tstatus : Boolean = \n"
			+ "\t\t\tdocumentIsNeededForPurpose(DocumentType::ControllerApproval,ProcessingReason::LegitimateInterests)\n"
			+ "}.status";

	/**
	 * Validates the CausedByShouldBeDefinedForErasureAction constraint of '<em>Policy Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolicyStatement_CausedByShouldBeDefinedForErasureAction(PolicyStatement policyStatement,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(PrivacyModelPackage.Literals.POLICY_STATEMENT, policyStatement, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "CausedByShouldBeDefinedForErasureAction",
				POLICY_STATEMENT__CAUSED_BY_SHOULD_BE_DEFINED_FOR_ERASURE_ACTION__EEXPRESSION, Diagnostic.ERROR,
				DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the SubjectShouldBeNotifiedAboutExecutedErasure constraint of '<em>Policy Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String POLICY_STATEMENT__SUBJECT_SHOULD_BE_NOTIFIED_ABOUT_EXECUTED_ERASURE__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'Based on Art12',\n" + "\tstatus : Boolean = \n"
			+ "\t\t\tif(what.actions->exists(action| action = Action::Erasure)) then\n"
			+ "\t\t\t\t\tPrivacyPolicy.allInstances()->asSequence()->first().notifications->exists(notification| notification.causedBy = self and\n"
			+ "\t\t\t\t\t\tnotification.type = NotificationType::ExecutedErasure and\n"
			+ "\t\t\t\t\t\t(self.whose = null or notification.receivers->includes(self.whose))\n" + "\t\t\t\t\t)\n"
			+ "\t\t\t\telse\n" + "\t\t\t\t\ttrue\n" + "\t\t\tendif\n" + "}.status";

	/**
	 * Validates the SubjectShouldBeNotifiedAboutExecutedErasure constraint of '<em>Policy Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolicyStatement_SubjectShouldBeNotifiedAboutExecutedErasure(PolicyStatement policyStatement,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(PrivacyModelPackage.Literals.POLICY_STATEMENT, policyStatement, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "SubjectShouldBeNotifiedAboutExecutedErasure",
				POLICY_STATEMENT__SUBJECT_SHOULD_BE_NOTIFIED_ABOUT_EXECUTED_ERASURE__EEXPRESSION, Diagnostic.ERROR,
				DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the SubjectShouldBeNotifiedAboutExecutedRectification constraint of '<em>Policy Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String POLICY_STATEMENT__SUBJECT_SHOULD_BE_NOTIFIED_ABOUT_EXECUTED_RECTIFICATION__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'Based on Art12',\n" + "\tstatus : Boolean = \n"
			+ "\t\t\tif(what.actions->exists(action| action = Action::Rectification)) then\n"
			+ "\t\t\t\t\tPrivacyPolicy.allInstances()->asSequence()->first().notifications->exists(notification| notification.causedBy = self and\n"
			+ "\t\t\t\t\t\tnotification.type = NotificationType::ExecutedRectification and\n"
			+ "\t\t\t\t\t\t(self.whose = null or notification.receivers->includes(self.whose))\n" + "\t\t\t\t\t)\n"
			+ "\t\t\t\telse\n" + "\t\t\t\t\ttrue\n" + "\t\t\tendif\n" + "}.status";

	/**
	 * Validates the ProcessingAfterErasureDate constraint of '<em>Policy Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolicyStatement_ProcessingAfterErasureDate(PolicyStatement policyStatement,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(PrivacyModelPackage.Literals.POLICY_STATEMENT, policyStatement, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "ProcessingAfterErasureDate",
				POLICY_STATEMENT__PROCESSING_AFTER_ERASURE_DATE__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the ProcessingOfCriminalConvictionData constraint of '<em>Policy Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String POLICY_STATEMENT__PROCESSING_OF_CRIMINAL_CONVICTION_DATA__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'Based on Art10',\n" + "\tstatus : Boolean = \n"
			+ "\t\t\tif(self.what = null or self.what.actions->exists(action | action = Action::StopProcessing or action = Action::RestrictProcessing or action = Action::LiftRestriction or action = Action::Erasure) or\n"
			+ "\t\t\t\tnot(self.what.datas->exists(data| data.privacydata.type = DataType::Judicial))) then\n"
			+ "\t\t\t\ttrue\n" + "\t\t\telse\n"
			+ "\t\t\t\t(self.hasProcessingReason(ProcessingReason::PublicInterest) and not(self.how = null) and\n"
			+ "\t\t\t\t\tself.how.documents->exists(doc| doc.documentType = DocumentType::CourtApproval or doc.documentType = DocumentType::LegalProvision))\n"
			+ "\t\t\t\tor\n"
			+ "\t\t\t\t(self.hasProcessingReason(ProcessingReason::LegalObligation) and not(self.how = null) and\n"
			+ "\t\t\t\t\tself.how.documents->exists(doc| doc.documentType = DocumentType::LegalProvision))\n"
			+ "\t\t\tendif\n" + "}.status";

	/**
	 * Validates the SubjectShouldBeNotifiedAboutExecutedRectification constraint of '<em>Policy Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolicyStatement_SubjectShouldBeNotifiedAboutExecutedRectification(
			PolicyStatement policyStatement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(PrivacyModelPackage.Literals.POLICY_STATEMENT, policyStatement, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "SubjectShouldBeNotifiedAboutExecutedRectification",
				POLICY_STATEMENT__SUBJECT_SHOULD_BE_NOTIFIED_ABOUT_EXECUTED_RECTIFICATION__EEXPRESSION,
				Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the WhomShouldBeDefinedForTransfer constraint of '<em>Policy Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String POLICY_STATEMENT__WHOM_SHOULD_BE_DEFINED_FOR_TRANSFER__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'Based on Arts 44-50',\n" + "\tstatus : Boolean = \n"
			+ "\t\t\tif(what.actions->exists(action| action = Action::Transfer)) then\n"
			+ "\t\t\t\t\tnot(self.whom = null)\n" + "\t\t\t\telse\n" + "\t\t\t\t\ttrue\n" + "\t\t\tendif\n"
			+ "}.status";

	/**
	 * Validates the ExpiredContract constraint of '<em>Policy Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolicyStatement_ExpiredContract(PolicyStatement policyStatement, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(PrivacyModelPackage.Literals.POLICY_STATEMENT, policyStatement, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "ExpiredContract",
				POLICY_STATEMENT__EXPIRED_CONTRACT__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the LegalProvisionIsNeededForLegalObligationPurpose constraint of '<em>Policy Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String POLICY_STATEMENT__LEGAL_PROVISION_IS_NEEDED_FOR_LEGAL_OBLIGATION_PURPOSE__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'Based on Art6',\n" + "\tstatus : Boolean = \n"
			+ "\t\t\tif(not(self.hasProcessingReason(ProcessingReason::LegalObligation))) then\n" + "\t\t\t\ttrue\n"
			+ "\t\t\telse\n"
			+ "\t\t\t\tnot(self.how = null) and self.how.documents->exists(doc| doc.documentType = DocumentType::LegalProvision)\n"
			+ "\t\t\tendif\n" + "}.status";

	/**
	 * Validates the RestrictionShouldNotBeLiftedBeforeObjectionDecision constraint of '<em>Policy Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolicyStatement_RestrictionShouldNotBeLiftedBeforeObjectionDecision(
			PolicyStatement policyStatement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(PrivacyModelPackage.Literals.POLICY_STATEMENT, policyStatement, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				"RestrictionShouldNotBeLiftedBeforeObjectionDecision",
				POLICY_STATEMENT__RESTRICTION_SHOULD_NOT_BE_LIFTED_BEFORE_OBJECTION_DECISION__EEXPRESSION,
				Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the DateShouldBeDefinedForCollectingAction constraint of '<em>Policy Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String POLICY_STATEMENT__DATE_SHOULD_BE_DEFINED_FOR_COLLECTING_ACTION__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'Date should be defined',\n" + "\tstatus : Boolean = \n"
			+ "\t\t\tdateShouldBeDefinedForType(Action::Collecting)\n" + "}.status";

	/**
	 * Validates the DateShouldBeDefinedForCollectingAction constraint of '<em>Policy Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolicyStatement_DateShouldBeDefinedForCollectingAction(PolicyStatement policyStatement,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(PrivacyModelPackage.Literals.POLICY_STATEMENT, policyStatement, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "DateShouldBeDefinedForCollectingAction",
				POLICY_STATEMENT__DATE_SHOULD_BE_DEFINED_FOR_COLLECTING_ACTION__EEXPRESSION, Diagnostic.ERROR,
				DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the RecipientsShouldBeNotifiedAboutExecutedErasure constraint of '<em>Policy Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String POLICY_STATEMENT__RECIPIENTS_SHOULD_BE_NOTIFIED_ABOUT_EXECUTED_ERASURE__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'Based on Art19',\n" + "\tstatus : Boolean = \n"
			+ "\t\t\tif(self.whose = null or self.what = null or not(self.what.actions->exists(act| act = Action::Erasure))) then\n"
			+ "\t\t\t\ttrue\n" + "\t\t\telse\n"
			+ "\t\t\tlet privacyPolicy : PrivacyPolicy = PrivacyPolicy.allInstances()->asSequence()->first() in\n"
			+ "\t\t\t\tprivacyPolicy.policyStatements->select(tr| not(tr.what = null) and\n"
			+ "\t\t\t\t\ttr.what.actions->exists(act| act = Action::Transfer) and\n"
			+ "\t\t\t\t\tnot(tr.whose = null) and tr.whose = self.whose and not(tr.whom = null) and\n"
			+ "\t\t\t\t\ttr.what.datas->exists(d| self.what.datas->exists(sd| sd.privacydata = d.privacydata)) and\n"
			+ "\t\t\t\t\t(tr.when = null or self.when = null or privacyPolicy.privacyPolicyHelper.doesIntervalStartBeforeInterval(tr.when, self.when)))\n"
			+ "\t\t\t\t->forAll(tr| privacyPolicy.notifications->exists(notification| notification.causedBy = self and\n"
			+ "\t\t\t\t\tnotification.type = NotificationType::ExecutedErasure and notification.receivers->includes(tr.whom)))\n"
			+ "\t\t\tendif\n" + "}.status";

	/**
	 * Validates the RecipientsShouldBeNotifiedAboutExecutedErasure constraint of '<em>Policy Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolicyStatement_RecipientsShouldBeNotifiedAboutExecutedErasure(
			PolicyStatement policyStatement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(PrivacyModelPackage.Literals.POLICY_STATEMENT, policyStatement, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "RecipientsShouldBeNotifiedAboutExecutedErasure",
				POLICY_STATEMENT__RECIPIENTS_SHOULD_BE_NOTIFIED_ABOUT_EXECUTED_ERASURE__EEXPRESSION, Diagnostic.ERROR,
				DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the RecipientsShouldBeNotifiedAboutExecutedRectification constraint of '<em>Policy Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String POLICY_STATEMENT__RECIPIENTS_SHOULD_BE_NOTIFIED_ABOUT_EXECUTED_RECTIFICATION__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'Based on Art19',\n" + "\tstatus : Boolean = \n"
			+ "\t\t\tif(self.whose = null or self.what = null or not(self.what.actions->exists(act| act = Action::Rectification))) then\n"
			+ "\t\t\t\ttrue\n" + "\t\t\telse\n"
			+ "\t\t\tlet privacyPolicy : PrivacyPolicy = PrivacyPolicy.allInstances()->asSequence()->first() in\n"
			+ "\t\t\t\tprivacyPolicy.policyStatements->select(tr| not(tr.what = null) and\n"
			+ "\t\t\t\t\ttr.what.actions->exists(act| act = Action::Transfer) and\n"
			+ "\t\t\t\t\tnot(tr.whose = null) and tr.whose = self.whose and not(tr.whom = null) and\n"
			+ "\t\t\t\t\ttr.what.datas->exists(d| self.what.datas->exists(sd| sd.privacydata = d.privacydata)) and\n"
			+ "\t\t\t\t\t(tr.when = null or self.when = null or privacyPolicy.privacyPolicyHelper.doesIntervalStartBeforeInterval(tr.when, self.when)))\n"
			+ "\t\t\t\t->forAll(tr| privacyPolicy.notifications->exists(notification| notification.causedBy = self and\n"
			+ "\t\t\t\t\tnotification.type = NotificationType::ExecutedRectification and notification.receivers->includes(tr.whom)))\n"
			+ "\t\t\tendif\n" + "}.status";

	/**
	 * Validates the RecipientsShouldBeNotifiedAboutExecutedRectification constraint of '<em>Policy Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolicyStatement_RecipientsShouldBeNotifiedAboutExecutedRectification(
			PolicyStatement policyStatement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(PrivacyModelPackage.Literals.POLICY_STATEMENT, policyStatement, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				"RecipientsShouldBeNotifiedAboutExecutedRectification",
				POLICY_STATEMENT__RECIPIENTS_SHOULD_BE_NOTIFIED_ABOUT_EXECUTED_RECTIFICATION__EEXPRESSION,
				Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * Validates the LegalProvisionIsNeededForLegalObligationPurpose constraint of '<em>Policy Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolicyStatement_LegalProvisionIsNeededForLegalObligationPurpose(
			PolicyStatement policyStatement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(PrivacyModelPackage.Literals.POLICY_STATEMENT, policyStatement, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "LegalProvisionIsNeededForLegalObligationPurpose",
				POLICY_STATEMENT__LEGAL_PROVISION_IS_NEEDED_FOR_LEGAL_OBLIGATION_PURPOSE__EEXPRESSION, Diagnostic.ERROR,
				DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the ErasureDateShouldBeDefinedForCollecting constraint of '<em>Policy Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String POLICY_STATEMENT__ERASURE_DATE_SHOULD_BE_DEFINED_FOR_COLLECTING__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'Based on Art5 and Art13',\n" + "\tstatus : Boolean = \n"
			+ "\t\t\tif(self.what = null or self.why = null or not(self.what.actions->exists(act| act = Action::Collecting)) or\n"
			+ "\t\t\t\tself.hasProcessingReason(ProcessingReason::Research) or\n"
			+ "\t\t\t\tself.hasProcessingReason(ProcessingReason::StatisticalPurposes)) then\n" + "\t\t\t\ttrue\n"
			+ "\t\t\telse\n" + "\t\t\t\tnot(self.why.erasureDate = null)\n" + "\t\t\tendif\n" + "}.status";

	/**
	 * Validates the ProcessingOfCriminalConvictionData constraint of '<em>Policy Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolicyStatement_ProcessingOfCriminalConvictionData(PolicyStatement policyStatement,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(PrivacyModelPackage.Literals.POLICY_STATEMENT, policyStatement, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "ProcessingOfCriminalConvictionData",
				POLICY_STATEMENT__PROCESSING_OF_CRIMINAL_CONVICTION_DATA__EEXPRESSION, Diagnostic.ERROR,
				DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the NotForProfitBodyDataShouldNotBeTransferred constraint of '<em>Policy Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String POLICY_STATEMENT__NOT_FOR_PROFIT_BODY_DATA_SHOULD_NOT_BE_TRANSFERRED__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'Based on Art9',\n" + "\tstatus : Boolean = \n"
			+ "\t\t\tif(self.what = null or not(self.hasProcessingReason(ProcessingReason::NotForProfitBodyActivity))) then\n"
			+ "\t\t\t\ttrue\n" + "\t\t\telse\n"
			+ "\t\t\t\tnot(self.what.actions->exists(action| action = Action::Transfer)) or\n"
			+ "\t\t\t\t(not(self.how = null) and not(self.how.consent = null) and self.how.consent.type = ConsentType::Explicit)\n"
			+ "\t\t\tendif\n" + "}.status";

	/**
	 * Validates the NotForProfitBodyDataShouldNotBeTransferred constraint of '<em>Policy Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolicyStatement_NotForProfitBodyDataShouldNotBeTransferred(PolicyStatement policyStatement,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(PrivacyModelPackage.Literals.POLICY_STATEMENT, policyStatement, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "NotForProfitBodyDataShouldNotBeTransferred",
				POLICY_STATEMENT__NOT_FOR_PROFIT_BODY_DATA_SHOULD_NOT_BE_TRANSFERRED__EEXPRESSION, Diagnostic.ERROR,
				DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the CausedByAndDateShouldBeDefinedForRestriction constraint of '<em>Policy Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String POLICY_STATEMENT__CAUSED_BY_AND_DATE_SHOULD_BE_DEFINED_FOR_RESTRICTION__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'Based on Art18',\n" + "\tstatus : Boolean = \n"
			+ "\t\t\tcausedByShouldBeDefinedForType(Action::RestrictProcessing) and causedByShouldBeDefinedForType(Action::LiftRestriction) and\n"
			+ "\t\t\tdateShouldBeDefinedForType(Action::RestrictProcessing) and dateShouldBeDefinedForType(Action::LiftRestriction)\n"
			+ "}.status";

	/**
	 * Validates the WhomShouldBeDefinedForTransfer constraint of '<em>Policy Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolicyStatement_WhomShouldBeDefinedForTransfer(PolicyStatement policyStatement,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(PrivacyModelPackage.Literals.POLICY_STATEMENT, policyStatement, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "WhomShouldBeDefinedForTransfer",
				POLICY_STATEMENT__WHOM_SHOULD_BE_DEFINED_FOR_TRANSFER__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE,
				0);
	}

	/**
	 * The cached validation expression for the MissingConsentOrContractForDataPortability constraint of '<em>Policy Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String POLICY_STATEMENT__MISSING_CONSENT_OR_CONTRACT_FOR_DATA_PORTABILITY__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'Based on Art20 and Art6',\n" + "\tstatus : Boolean = \n"
			+ "\t\t\tif(self.whose = null or not(self.what.actions->exists(action| action = Action::DataPortability))) then\n"
			+ "\t\t\t\ttrue\n"
			+ "\t\t\telse if(not(self.what.datas->forAll(d| d.origin = DataOrigin::DataSubject))) then\n"
			+ "\t\t\t\tfalse\n" + "\t\t\telse if(self.isContractProvidedBySubject()) then\n" + "\t\t\t\ttrue\n"
			+ "\t\t\telse if(self.whose.type= PrincipalType::NaturalPerson and self.whose.age < PrivacyPolicy.allInstances()->asSequence()->first().privacyPolicyHelper.legalAgeLimitFor(self.whose)) then\n"
			+ "\t\t\t\tnot(self.how = null) and not(self.how.consent = null) and self.whose.responsiblePersons->exists(person| self.how.consent.providedBy = person)\n"
			+ "\t\t\telse \n"
			+ "\t\t\t\tnot(self.how = null) and not(self.how.consent = null) and (self.how.consent.providedBy = self.whose or self.whose.responsiblePersons->exists(person| self.how.consent.providedBy = person))\n"
			+ "\t\t\tendif\n" + "\t\t\tendif\n" + "\t\t\tendif\n" + "\t\t\tendif\n" + "}.status";

	/**
	 * Validates the SubjectShouldBeNotifiedAboutStopProcessing constraint of '<em>Policy Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolicyStatement_SubjectShouldBeNotifiedAboutStopProcessing(PolicyStatement policyStatement,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(PrivacyModelPackage.Literals.POLICY_STATEMENT, policyStatement, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "SubjectShouldBeNotifiedAboutStopProcessing",
				POLICY_STATEMENT__SUBJECT_SHOULD_BE_NOTIFIED_ABOUT_STOP_PROCESSING__EEXPRESSION, Diagnostic.ERROR,
				DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the CausedByShouldBeDefinedForStopProcessingAction constraint of '<em>Policy Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String POLICY_STATEMENT__CAUSED_BY_SHOULD_BE_DEFINED_FOR_STOP_PROCESSING_ACTION__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'Based on Art21',\n" + "\tstatus : Boolean = \n"
			+ "\t\t\tcausedByShouldBeDefinedForType(Action::StopProcessing)\n" + "}.status";

	/**
	 * Validates the CausedByShouldBeDefinedForStopProcessingAction constraint of '<em>Policy Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolicyStatement_CausedByShouldBeDefinedForStopProcessingAction(
			PolicyStatement policyStatement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(PrivacyModelPackage.Literals.POLICY_STATEMENT, policyStatement, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "CausedByShouldBeDefinedForStopProcessingAction",
				POLICY_STATEMENT__CAUSED_BY_SHOULD_BE_DEFINED_FOR_STOP_PROCESSING_ACTION__EEXPRESSION, Diagnostic.ERROR,
				DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the MissingConsentOrTransferCertificate constraint of '<em>Policy Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String POLICY_STATEMENT__MISSING_CONSENT_OR_TRANSFER_CERTIFICATE__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'Based on Art45, Art46, Art47 and Art49(1)',\n" + "\tstatus : Boolean = \n"
			+ "\t\t\tif(not(self.what.actions->exists(action| action = Action::Transfer)) or self.where = null or self.where.destination = null or self.where.destination.isEUMember = true) then\n"
			+ "\t\t\t\ttrue\n" + "\t\t\telse\n"
			+ "\t\t\t\t(not(self.how = null) and self.how.documents->exists(doc| doc.documentType = DocumentType::TransferCertificate)) or\n"
			+ "\t\t\t\t(not(self.how = null) and not(self.how.consent = null) and self.how.consent.type = ConsentType::Explicit) or\n"
			+ "\t\t\t\t(self.hasProcessingReason(ProcessingReason::ContractPerformance) and self.isContractProvidedBySubject()) or\n"
			+ "\t\t\t\tself.hasProcessingReason(ProcessingReason::LegalClaims) or\n"
			+ "\t\t\t\t(not(self.why = null) and\n"
			+ "\t\t\t\t((self.why.containsAllowedPurposeReasonAndSubreason(ProcessingReason::PublicInterest, Sequence{ProcessingReasonSubtype::Prevention, ProcessingReasonSubtype::Investigation, ProcessingReasonSubtype::Detection,\n"
			+ "\t\t\t\t\tProcessingReasonSubtype::Prosecution, ProcessingReasonSubtype::PreventionOfThreats, ProcessingReasonSubtype::None, ProcessingReasonSubtype::Other}) and\n"
			+ "\t\t\t\t\tnot(self.how = null) and self.how.documents->exists(doc| doc.documentType = DocumentType::LegalProvision)) or\n"
			+ "\t\t\t\tself.why.containsAllowedPurposeReasonAndSubreason(ProcessingReason::ProtectTheVitalInterestsOfTheDataSubject, Sequence{ProcessingReasonSubtype::PhysicallyIncapable,\n"
			+ "\t\t\t\t\tProcessingReasonSubtype::LegallyIncapable})))\n" + "\t\t\tendif\n" + "}.status";

	/**
	 * Validates the MissingContractForContractPerformance constraint of '<em>Policy Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolicyStatement_MissingContractForContractPerformance(PolicyStatement policyStatement,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(PrivacyModelPackage.Literals.POLICY_STATEMENT, policyStatement, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "MissingContractForContractPerformance",
				POLICY_STATEMENT__MISSING_CONTRACT_FOR_CONTRACT_PERFORMANCE__EEXPRESSION, Diagnostic.ERROR,
				DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the ExpiredContract constraint of '<em>Policy Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String POLICY_STATEMENT__EXPIRED_CONTRACT__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'Based on Art6',\n" + "\tstatus : Boolean = \n"
			+ "\t\t\tif(not(self.hasProcessingReason(ProcessingReason::ContractPerformance)) or self.how = null or self.how.contract = null) then\n"
			+ "\t\t\t\ttrue\n" + "\t\t\telse\n"
			+ "\t\t\tlet privacyPolicy : PrivacyPolicy = PrivacyPolicy.allInstances()->asSequence()->first() in\n"
			+ "\t\t\t\t(self.why.processingReasonSubtype = ProcessingReasonSubtype::PreContractual or\n"
			+ "\t\t\t\tprivacyPolicy.privacyPolicyHelper.isDateInInterval(self.when, self.how.contract.startDate) or\n"
			+ "\t\t\t\tprivacyPolicy.privacyPolicyHelper.isDateBeforeInterval(self.when, self.how.contract.startDate))\n"
			+ "\t\t\t\tand\n"
			+ "\t\t\t\t(self.how.contract.terminationDate = null or not(privacyPolicy.privacyPolicyHelper.isDateBeforeInterval(self.when, self.how.contract.terminationDate)))\n"
			+ "\t\t\tendif\n" + "}.status";

	/**
	 * Validates the MissingConsentOrTransferCertificate constraint of '<em>Policy Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolicyStatement_MissingConsentOrTransferCertificate(PolicyStatement policyStatement,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(PrivacyModelPackage.Literals.POLICY_STATEMENT, policyStatement, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "MissingConsentOrTransferCertificate",
				POLICY_STATEMENT__MISSING_CONSENT_OR_TRANSFER_CERTIFICATE__EEXPRESSION, Diagnostic.ERROR,
				DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the MissingContractForContractPerformance constraint of '<em>Policy Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String POLICY_STATEMENT__MISSING_CONTRACT_FOR_CONTRACT_PERFORMANCE__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'Based on Art6',\n" + "\tstatus : Boolean = \n"
			+ "\t\t\tif(self.whose = null or not(self.hasProcessingReason(ProcessingReason::ContractPerformance))) then\n"
			+ "\t\t\t\ttrue\n" + "\t\t\telse\n" + "\t\t\t\tself.isContractProvidedBySubject()\n" + "\t\t\tendif\n"
			+ "}.status";

	/**
	 * Validates the ControllerApprovalIsNeededForProtectTheVitalInterestsOfTheDataSubjectPurpose constraint of '<em>Policy Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolicyStatement_ControllerApprovalIsNeededForProtectTheVitalInterestsOfTheDataSubjectPurpose(
			PolicyStatement policyStatement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(PrivacyModelPackage.Literals.POLICY_STATEMENT, policyStatement, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				"ControllerApprovalIsNeededForProtectTheVitalInterestsOfTheDataSubjectPurpose",
				POLICY_STATEMENT__CONTROLLER_APPROVAL_IS_NEEDED_FOR_PROTECT_THE_VITAL_INTERESTS_OF_THE_DATA_SUBJECT_PURPOSE__EEXPRESSION,
				Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the StopProcessingPurposeForActionStopProcessing constraint of '<em>Policy Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String POLICY_STATEMENT__STOP_PROCESSING_PURPOSE_FOR_ACTION_STOP_PROCESSING__EEXPRESSION = "\n"
			+ "\t\t\tif(not(self.what.actions->exists(act| act = Action::StopProcessing))) then\n" + "\t\t\t\ttrue\n"
			+ "\t\t\telse\n" + "\t\t\t\tself.why.processingReason = ProcessingReason::StopProcessing\n" + "\t\t\tendif";

	/**
	 * Validates the ControllerApprovalIsNeededForLegitimateInterestsPurpose constraint of '<em>Policy Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolicyStatement_ControllerApprovalIsNeededForLegitimateInterestsPurpose(
			PolicyStatement policyStatement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(PrivacyModelPackage.Literals.POLICY_STATEMENT, policyStatement, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				"ControllerApprovalIsNeededForLegitimateInterestsPurpose",
				POLICY_STATEMENT__CONTROLLER_APPROVAL_IS_NEEDED_FOR_LEGITIMATE_INTERESTS_PURPOSE__EEXPRESSION,
				Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the ControllerApprovalIsNeededForProtectTheVitalInterestsOfTheDataSubjectPurpose constraint of '<em>Policy Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String POLICY_STATEMENT__CONTROLLER_APPROVAL_IS_NEEDED_FOR_PROTECT_THE_VITAL_INTERESTS_OF_THE_DATA_SUBJECT_PURPOSE__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'Based on Art6(1)(d)',\n" + "\tstatus : Boolean = \n"
			+ "\t\t\tdocumentIsNeededForPurpose(DocumentType::ControllerApproval,ProcessingReason::ProtectTheVitalInterestsOfTheDataSubject)\n"
			+ "}.status";

	/**
	 * Validates the DateShouldBeDefinedForAccessAction constraint of '<em>Policy Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolicyStatement_DateShouldBeDefinedForAccessAction(PolicyStatement policyStatement,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(PrivacyModelPackage.Literals.POLICY_STATEMENT, policyStatement, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "DateShouldBeDefinedForAccessAction",
				POLICY_STATEMENT__DATE_SHOULD_BE_DEFINED_FOR_ACCESS_ACTION__EEXPRESSION, Diagnostic.ERROR,
				DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the DateShouldBeDefinedForStoreAction constraint of '<em>Policy Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String POLICY_STATEMENT__DATE_SHOULD_BE_DEFINED_FOR_STORE_ACTION__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'Date should be defined',\n" + "\tstatus : Boolean = \n"
			+ "\t\t\tdateShouldBeDefinedForType(Action::Store)\n" + "}.status";

	/**
	 * Validates the DateShouldBeDefinedForStoreAction constraint of '<em>Policy Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolicyStatement_DateShouldBeDefinedForStoreAction(PolicyStatement policyStatement,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(PrivacyModelPackage.Literals.POLICY_STATEMENT, policyStatement, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "DateShouldBeDefinedForStoreAction",
				POLICY_STATEMENT__DATE_SHOULD_BE_DEFINED_FOR_STORE_ACTION__EEXPRESSION, Diagnostic.ERROR,
				DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the WhereShouldBeDefinedForTransferAction constraint of '<em>Policy Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String POLICY_STATEMENT__WHERE_SHOULD_BE_DEFINED_FOR_TRANSFER_ACTION__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'Where should be defined',\n" + "\tstatus : Boolean = \n"
			+ "\t\t\tif(self.what.actions->exists(action| action = Action::Transfer)) then\n"
			+ "\t\t\t\t\tnot(self.where = null)\n" + "\t\t\t\telse\n" + "\t\t\t\t\ttrue\n" + "\t\t\tendif\n"
			+ "}.status";

	/**
	 * Validates the CausedByAndDateShouldBeDefinedForRestriction constraint of '<em>Policy Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolicyStatement_CausedByAndDateShouldBeDefinedForRestriction(PolicyStatement policyStatement,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(PrivacyModelPackage.Literals.POLICY_STATEMENT, policyStatement, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "CausedByAndDateShouldBeDefinedForRestriction",
				POLICY_STATEMENT__CAUSED_BY_AND_DATE_SHOULD_BE_DEFINED_FOR_RESTRICTION__EEXPRESSION, Diagnostic.ERROR,
				DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the ProcessingDuringRestriction constraint of '<em>Policy Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String POLICY_STATEMENT__PROCESSING_DURING_RESTRICTION__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'Based on Art18',\n" + "\tstatus : Boolean = \n"
			+ "\t\t\tif(self.whose = null or self.what = null or self.when = null or\n"
			+ "\t\t\t\tself.what.actions->forAll(act| act = Action::Store or act = Action::Erasure or act = Action::Rectification or act = Action::StopProcessing or act = Action::RestrictProcessing or act = Action::LiftRestriction) or\n"
			+ "\t\t\t\t(not(self.how = null) and not(self.how.consent = null)) or\n"
			+ "\t\t\t\t(self.hasProcessingReason(ProcessingReason::PublicInterest) and not(self.how = null) and\n"
			+ "\t\t\t\t\tself.how.documents->exists(doc| doc.documentType = DocumentType::LegalProvision)) or\n"
			+ "\t\t\t\tself.hasProcessingReason(ProcessingReason::LegalClaims)) then\n" + "\t\t\t\ttrue\n"
			+ "\t\t\telse\n"
			+ "\t\t\tlet privacyPolicy : PrivacyPolicy = PrivacyPolicy.allInstances()->asSequence()->first() in\n"
			+ "\t\t\t\tprivacyPolicy.policyStatements->select(restriction|\n"
			+ "\t\t\t\t\tnot(restriction.what = null) and not(restriction.when = null) and not(restriction.causedBy = null) and\n"
			+ "\t\t\t\t\trestriction.what.actions->exists(act| act = Action::RestrictProcessing) and restriction.whose = self.whose and\n"
			+ "\t\t\t\t\trestriction.what.datas->exists(d| self.what.datas->exists(sd| sd.privacydata = d.privacydata)))\n"
			+ "\t\t\t\t->forAll(restriction|\n"
			+ "\t\t\t\t\tnot(privacyPolicy.privacyPolicyHelper.doesIntervalStartBeforeInterval(restriction.when, self.when)) or\n"
			+ "\t\t\t\t\tprivacyPolicy.policyStatements->exists(lift|\n"
			+ "\t\t\t\t\t\tnot(lift.what = null) and not(lift.when = null) and lift.what.actions->exists(act| act = Action::LiftRestriction) and\n"
			+ "\t\t\t\t\t\tlift.causedBy = restriction.causedBy and\n"
			+ "\t\t\t\t\t\tprivacyPolicy.privacyPolicyHelper.doesIntervalStartBeforeInterval(lift.when, self.when)))\n"
			+ "\t\t\tendif\n" + "}.status";

	/**
	 * Validates the WhereShouldBeDefinedForTransferAction constraint of '<em>Policy Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolicyStatement_WhereShouldBeDefinedForTransferAction(PolicyStatement policyStatement,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(PrivacyModelPackage.Literals.POLICY_STATEMENT, policyStatement, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "WhereShouldBeDefinedForTransferAction",
				POLICY_STATEMENT__WHERE_SHOULD_BE_DEFINED_FOR_TRANSFER_ACTION__EEXPRESSION, Diagnostic.ERROR,
				DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the CourtApprovalOrLegalProvisionIsNeededForPublicInterestPurpose constraint of '<em>Policy Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String POLICY_STATEMENT__COURT_APPROVAL_OR_LEGAL_PROVISION_IS_NEEDED_FOR_PUBLIC_INTEREST_PURPOSE__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'Based on Art6(1)(e) and Art6(3)',\n" + "\tstatus : Boolean = \n"
			+ "\t\t\tdocumentIsNeededForPurpose(DocumentType::CourtApproval,ProcessingReason::PublicInterest) or\n"
			+ "\t\t\tdocumentIsNeededForPurpose(DocumentType::LegalProvision,ProcessingReason::PublicInterest)\n"
			+ "}.status";

	/**
	 * Validates the CourtApprovalOrLegalProvisionIsNeededForPublicInterestPurpose constraint of '<em>Policy Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolicyStatement_CourtApprovalOrLegalProvisionIsNeededForPublicInterestPurpose(
			PolicyStatement policyStatement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(PrivacyModelPackage.Literals.POLICY_STATEMENT, policyStatement, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				"CourtApprovalOrLegalProvisionIsNeededForPublicInterestPurpose",
				POLICY_STATEMENT__COURT_APPROVAL_OR_LEGAL_PROVISION_IS_NEEDED_FOR_PUBLIC_INTEREST_PURPOSE__EEXPRESSION,
				Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrivacyData(PrivacyData privacyData, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(privacyData, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateService(Service service, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(service, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProvider(Provider provider, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(provider, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrincipal(Principal principal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(principal, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(principal, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(principal, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(principal, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(principal, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(principal, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(principal, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(principal, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(principal, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePrincipal_NaturalPersonCannotContainSubPrincipals(principal, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePrincipal_JuvenileShouldHaveResponsiblePerson(principal, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the NaturalPersonCannotContainSubPrincipals constraint of '<em>Principal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PRINCIPAL__NATURAL_PERSON_CANNOT_CONTAIN_SUB_PRINCIPALS__EEXPRESSION = "\n"
			+ "\t\t\tif(self.type = PrincipalType::NaturalPerson) then\n" + "\t\t\t\tself.subPrincipals->isEmpty()\n"
			+ "\t\t\telse\n" + "\t\t\t\ttrue\n" + "\t\t\tendif";

	/**
	 * Validates the JuvenileShouldHaveResponsiblePerson constraint of '<em>Principal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrincipal_JuvenileShouldHaveResponsiblePerson(Principal principal,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(PrivacyModelPackage.Literals.PRINCIPAL, principal, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "JuvenileShouldHaveResponsiblePerson",
				PRINCIPAL__JUVENILE_SHOULD_HAVE_RESPONSIBLE_PERSON__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE,
				0);
	}

	/**
	 * Validates the NaturalPersonCannotContainSubPrincipals constraint of '<em>Principal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrincipal_NaturalPersonCannotContainSubPrincipals(Principal principal,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(PrivacyModelPackage.Literals.PRINCIPAL, principal, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "NaturalPersonCannotContainSubPrincipals",
				PRINCIPAL__NATURAL_PERSON_CANNOT_CONTAIN_SUB_PRINCIPALS__EEXPRESSION, Diagnostic.ERROR,
				DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the JuvenileShouldHaveResponsiblePerson constraint of '<em>Principal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PRINCIPAL__JUVENILE_SHOULD_HAVE_RESPONSIBLE_PERSON__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'Based on Art8 and national law',\n" + "\tstatus : Boolean = \n"
			+ "\t\tif(self.type = PrincipalType::NaturalPerson and self.age < PrivacyPolicy.allInstances()->asSequence()->first().privacyPolicyHelper.legalAgeLimitFor(self)) then\n"
			+ "\t\t\t\tnot(self.responsiblePersons->isEmpty())\n" + "\t\t\telse\n" + "\t\t\t\ttrue\n" + "\t\tendif\n"
			+ "}.status";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocation(Location location, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(location, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractTime(AbstractTime abstractTime, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractTime, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeInterval(TimeInterval timeInterval, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(timeInterval, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(timeInterval, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(timeInterval, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(timeInterval, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(timeInterval, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(timeInterval, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(timeInterval, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(timeInterval, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(timeInterval, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateTimeInterval_OnlyAfterOrAfterWithBefore(timeInterval, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateTimeInterval_OnlyFromOrFromWithTo(timeInterval, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateTimeInterval_AtTypeShouldBeDefinedAlone(timeInterval, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateTimeInterval_UntilTypeShouldBeDefinedAlone(timeInterval, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateTimeInterval_AfterStatementBeforeBeforeStatement(timeInterval, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateTimeInterval_FromStatementBeforeToStatement(timeInterval, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the OnlyAfterOrAfterWithBefore constraint of '<em>Time Interval</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TIME_INTERVAL__ONLY_AFTER_OR_AFTER_WITH_BEFORE__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'After interval should be defined alone or with before interval',\n"
			+ "\tstatus : Boolean = \n"
			+ "\t\t\tself.isTypeDefinedWithOtherType(TimePreposition::after, TimePreposition::before)\n" + "}.status";

	/**
	 * Validates the OnlyAfterOrAfterWithBefore constraint of '<em>Time Interval</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeInterval_OnlyAfterOrAfterWithBefore(TimeInterval timeInterval,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(PrivacyModelPackage.Literals.TIME_INTERVAL, timeInterval, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "OnlyAfterOrAfterWithBefore",
				TIME_INTERVAL__ONLY_AFTER_OR_AFTER_WITH_BEFORE__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the OnlyFromOrFromWithTo constraint of '<em>Time Interval</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TIME_INTERVAL__ONLY_FROM_OR_FROM_WITH_TO__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'From interval should be defined alone or with to interval',\n"
			+ "\tstatus : Boolean = \n"
			+ "\t\t\tself.isTypeDefinedWithOtherType(TimePreposition::from, TimePreposition::to)\n" + "}.status";

	/**
	 * Validates the OnlyFromOrFromWithTo constraint of '<em>Time Interval</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeInterval_OnlyFromOrFromWithTo(TimeInterval timeInterval, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(PrivacyModelPackage.Literals.TIME_INTERVAL, timeInterval, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "OnlyFromOrFromWithTo",
				TIME_INTERVAL__ONLY_FROM_OR_FROM_WITH_TO__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the AtTypeShouldBeDefinedAlone constraint of '<em>Time Interval</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TIME_INTERVAL__AT_TYPE_SHOULD_BE_DEFINED_ALONE__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'At statement should be defined alone',\n" + "\tstatus : Boolean = \n"
			+ "\t\t\tself.isTypeForbidden(TimePreposition::at)\n" + "}.status";

	/**
	 * Validates the AtTypeShouldBeDefinedAlone constraint of '<em>Time Interval</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeInterval_AtTypeShouldBeDefinedAlone(TimeInterval timeInterval,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(PrivacyModelPackage.Literals.TIME_INTERVAL, timeInterval, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "AtTypeShouldBeDefinedAlone",
				TIME_INTERVAL__AT_TYPE_SHOULD_BE_DEFINED_ALONE__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the UntilTypeShouldBeDefinedAlone constraint of '<em>Time Interval</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TIME_INTERVAL__UNTIL_TYPE_SHOULD_BE_DEFINED_ALONE__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'Until statement should be defined alone',\n" + "\tstatus : Boolean = \n"
			+ "\t\t\tself.isTypeForbidden(TimePreposition::until)\n" + "}.status";

	/**
	 * Validates the UntilTypeShouldBeDefinedAlone constraint of '<em>Time Interval</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeInterval_UntilTypeShouldBeDefinedAlone(TimeInterval timeInterval,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(PrivacyModelPackage.Literals.TIME_INTERVAL, timeInterval, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "UntilTypeShouldBeDefinedAlone",
				TIME_INTERVAL__UNTIL_TYPE_SHOULD_BE_DEFINED_ALONE__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the AfterStatementBeforeBeforeStatement constraint of '<em>Time Interval</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TIME_INTERVAL__AFTER_STATEMENT_BEFORE_BEFORE_STATEMENT__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'After interval should be defined before before interval',\n"
			+ "\tstatus : Boolean = \n" + "\t\t\tself.isValid(TimePreposition::after, TimePreposition::before)\n"
			+ "}.status";

	/**
	 * Validates the AfterStatementBeforeBeforeStatement constraint of '<em>Time Interval</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeInterval_AfterStatementBeforeBeforeStatement(TimeInterval timeInterval,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(PrivacyModelPackage.Literals.TIME_INTERVAL, timeInterval, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "AfterStatementBeforeBeforeStatement",
				TIME_INTERVAL__AFTER_STATEMENT_BEFORE_BEFORE_STATEMENT__EEXPRESSION, Diagnostic.ERROR,
				DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the FromStatementBeforeToStatement constraint of '<em>Time Interval</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TIME_INTERVAL__FROM_STATEMENT_BEFORE_TO_STATEMENT__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'From interval should be defined before to interval',\n" + "\tstatus : Boolean = \n"
			+ "\t\t\tself.isValid(TimePreposition::from, TimePreposition::to)\n" + "}.status";

	/**
	 * Validates the FromStatementBeforeToStatement constraint of '<em>Time Interval</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeInterval_FromStatementBeforeToStatement(TimeInterval timeInterval,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(PrivacyModelPackage.Literals.TIME_INTERVAL, timeInterval, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "FromStatementBeforeToStatement",
				TIME_INTERVAL__FROM_STATEMENT_BEFORE_TO_STATEMENT__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeStatement(TimeStatement timeStatement, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(timeStatement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePurpose(Purpose purpose, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(purpose, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(purpose, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(purpose, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(purpose, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(purpose, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(purpose, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(purpose, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(purpose, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(purpose, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePurpose_ResearchShouldNotContainThisSubReason(purpose, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePurpose_PublicHealthShouldNotContainSubReason(purpose, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePurpose_OutOfScopeShouldNotContainThisSubReason(purpose, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePurpose_PublicInterestShouldNotContainThisSubReason(purpose, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePurpose_StatisticalPurposesShouldNotContainSubReason(purpose, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePurpose_ExercisingSpecificRightsPurposesCannotContainThisSubReason(purpose, diagnostics,
					context);
		if (result || diagnostics != null)
			result &= validatePurpose_MarketingShouldNotContainSubReason(purpose, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePurpose_TestingShouldNotContainSubReason(purpose, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePurpose_ProfilingShouldNotContainSubReason(purpose, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePurpose_ProtectTheVitalInterestsOfTheDataSubjectShouldNotContainThisSubReason(purpose,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePurpose_LegitimateInterestsShouldNotContainThisSubReason(purpose, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePurpose_StopProcessingShouldNotContainSubReason(purpose, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePurpose_ContractPerformanceCannotContainThisSubReason(purpose, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePurpose_LegalObligationShouldNotContainSubReason(purpose, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePurpose_LegalClaimsShouldNotContainThisSubReason(purpose, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePurpose_HealthCareShouldNotContainSubReason(purpose, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePurpose_NotForProfitBodyActivityShouldNotContainSubReason(purpose, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the ResearchShouldNotContainThisSubReason constraint of '<em>Purpose</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PURPOSE__RESEARCH_SHOULD_NOT_CONTAIN_THIS_SUB_REASON__EEXPRESSION = "\n"
			+ "\t\t\t\tisSubPurposeValid(ProcessingReason::Research, \n"
			+ "\t\t\t\tSequence{ProcessingReasonSubtype::None, ProcessingReasonSubtype::Other, ProcessingReasonSubtype::Scientific, ProcessingReasonSubtype::Historical,\n"
			+ "\t\t\t\t\tProcessingReasonSubtype::Statistical\n" + "\t\t\t\t})";

	/**
	 * Validates the PublicHealthShouldNotContainSubReason constraint of '<em>Purpose</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePurpose_PublicHealthShouldNotContainSubReason(Purpose purpose, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(PrivacyModelPackage.Literals.PURPOSE, purpose, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "PublicHealthShouldNotContainSubReason",
				PURPOSE__PUBLIC_HEALTH_SHOULD_NOT_CONTAIN_SUB_REASON__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE,
				0);
	}

	/**
	 * The cached validation expression for the OutOfScopeShouldNotContainThisSubReason constraint of '<em>Purpose</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PURPOSE__OUT_OF_SCOPE_SHOULD_NOT_CONTAIN_THIS_SUB_REASON__EEXPRESSION = "\n"
			+ "\t\t\tisSubPurposeValid(ProcessingReason::OutOfScope, \n"
			+ "\t\t\t\tSequence{ProcessingReasonSubtype::OutOfEU,\n"
			+ "\t\t\t\t\tProcessingReasonSubtype::PersonalActivity, ProcessingReasonSubtype::SpecialScopeOfActivity, ProcessingReasonSubtype::None,\n"
			+ "\t\t\t\t\tProcessingReasonSubtype::Other\n" + "\t\t\t\t})";

	/**
	 * Validates the OutOfScopeShouldNotContainThisSubReason constraint of '<em>Purpose</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePurpose_OutOfScopeShouldNotContainThisSubReason(Purpose purpose, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(PrivacyModelPackage.Literals.PURPOSE, purpose, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "OutOfScopeShouldNotContainThisSubReason",
				PURPOSE__OUT_OF_SCOPE_SHOULD_NOT_CONTAIN_THIS_SUB_REASON__EEXPRESSION, Diagnostic.ERROR,
				DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the PublicInterestShouldNotContainThisSubReason constraint of '<em>Purpose</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PURPOSE__PUBLIC_INTEREST_SHOULD_NOT_CONTAIN_THIS_SUB_REASON__EEXPRESSION = "\n"
			+ "\t\t\t\tisSubPurposeValid(ProcessingReason::PublicInterest, \n"
			+ "\t\t\t\tSequence{ProcessingReasonSubtype::Prevention,ProcessingReasonSubtype::Investigation,ProcessingReasonSubtype::Detection,\n"
			+ "\t\t\t\t\tProcessingReasonSubtype::Prosecution, ProcessingReasonSubtype::PreventionOfThreats,ProcessingReasonSubtype::None, ProcessingReasonSubtype::Other})";

	/**
	 * Validates the StatisticalPurposesShouldNotContainSubReason constraint of '<em>Purpose</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePurpose_StatisticalPurposesShouldNotContainSubReason(Purpose purpose,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(PrivacyModelPackage.Literals.PURPOSE, purpose, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "StatisticalPurposesShouldNotContainSubReason",
				PURPOSE__STATISTICAL_PURPOSES_SHOULD_NOT_CONTAIN_SUB_REASON__EEXPRESSION, Diagnostic.ERROR,
				DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the ExercisingSpecificRightsPurposesCannotContainThisSubReason constraint of '<em>Purpose</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PURPOSE__EXERCISING_SPECIFIC_RIGHTS_PURPOSES_CANNOT_CONTAIN_THIS_SUB_REASON__EEXPRESSION = "\n"
			+ "\t\t\t\tisSubPurposeValid(ProcessingReason::ExercisingSpecificRights, \n"
			+ "\t\t\t\tSequence{ProcessingReasonSubtype::Employment, ProcessingReasonSubtype::SocialSecurity,ProcessingReasonSubtype::SocialProtection, \n"
			+ "\t\t\t\tProcessingReasonSubtype::None, ProcessingReasonSubtype::Other})";

	/**
	 * Validates the MarketingShouldNotContainSubReason constraint of '<em>Purpose</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePurpose_MarketingShouldNotContainSubReason(Purpose purpose, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(PrivacyModelPackage.Literals.PURPOSE, purpose, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "MarketingShouldNotContainSubReason",
				PURPOSE__MARKETING_SHOULD_NOT_CONTAIN_SUB_REASON__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the TestingShouldNotContainSubReason constraint of '<em>Purpose</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PURPOSE__TESTING_SHOULD_NOT_CONTAIN_SUB_REASON__EEXPRESSION = "\n"
			+ "\t\t\t\tisSubPurposeValid(ProcessingReason::Testing, \n"
			+ "\t\t\t\tSequence{ProcessingReasonSubtype::None})";

	/**
	 * Validates the ExercisingSpecificRightsPurposesCannotContainThisSubReason constraint of '<em>Purpose</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePurpose_ExercisingSpecificRightsPurposesCannotContainThisSubReason(Purpose purpose,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(PrivacyModelPackage.Literals.PURPOSE, purpose, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				"ExercisingSpecificRightsPurposesCannotContainThisSubReason",
				PURPOSE__EXERCISING_SPECIFIC_RIGHTS_PURPOSES_CANNOT_CONTAIN_THIS_SUB_REASON__EEXPRESSION,
				Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the MarketingShouldNotContainSubReason constraint of '<em>Purpose</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PURPOSE__MARKETING_SHOULD_NOT_CONTAIN_SUB_REASON__EEXPRESSION = "\n"
			+ "\t\t\t\tisSubPurposeValid(ProcessingReason::Marketing, \n"
			+ "\t\t\t\tSequence{ProcessingReasonSubtype::None})";

	/**
	 * Validates the ProtectTheVitalInterestsOfTheDataSubjectShouldNotContainThisSubReason constraint of '<em>Purpose</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePurpose_ProtectTheVitalInterestsOfTheDataSubjectShouldNotContainThisSubReason(
			Purpose purpose, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(PrivacyModelPackage.Literals.PURPOSE, purpose, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				"ProtectTheVitalInterestsOfTheDataSubjectShouldNotContainThisSubReason",
				PURPOSE__PROTECT_THE_VITAL_INTERESTS_OF_THE_DATA_SUBJECT_SHOULD_NOT_CONTAIN_THIS_SUB_REASON__EEXPRESSION,
				Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the LegitimateInterestsShouldNotContainThisSubReason constraint of '<em>Purpose</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PURPOSE__LEGITIMATE_INTERESTS_SHOULD_NOT_CONTAIN_THIS_SUB_REASON__EEXPRESSION = "\n"
			+ "\t\t\tisSubPurposeValid(ProcessingReason::LegitimateInterests, \n"
			+ "\t\t\t\tSequence{ProcessingReasonSubtype::None})";

	/**
	 * Validates the LegitimateInterestsShouldNotContainThisSubReason constraint of '<em>Purpose</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePurpose_LegitimateInterestsShouldNotContainThisSubReason(Purpose purpose,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(PrivacyModelPackage.Literals.PURPOSE, purpose, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "LegitimateInterestsShouldNotContainThisSubReason",
				PURPOSE__LEGITIMATE_INTERESTS_SHOULD_NOT_CONTAIN_THIS_SUB_REASON__EEXPRESSION, Diagnostic.ERROR,
				DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the StopProcessingShouldNotContainSubReason constraint of '<em>Purpose</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PURPOSE__STOP_PROCESSING_SHOULD_NOT_CONTAIN_SUB_REASON__EEXPRESSION = "\n"
			+ "\t\t\t\tisSubPurposeValid(ProcessingReason::StopProcessing, \n"
			+ "\t\t\t\tSequence{ProcessingReasonSubtype::None})";

	/**
	 * Validates the LegalClaimsShouldNotContainThisSubReason constraint of '<em>Purpose</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePurpose_LegalClaimsShouldNotContainThisSubReason(Purpose purpose,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(PrivacyModelPackage.Literals.PURPOSE, purpose, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "LegalClaimsShouldNotContainThisSubReason",
				PURPOSE__LEGAL_CLAIMS_SHOULD_NOT_CONTAIN_THIS_SUB_REASON__EEXPRESSION, Diagnostic.ERROR,
				DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the HealthCareShouldNotContainSubReason constraint of '<em>Purpose</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PURPOSE__HEALTH_CARE_SHOULD_NOT_CONTAIN_SUB_REASON__EEXPRESSION = "\n"
			+ "\t\t\t\tisSubPurposeValid(ProcessingReason::HealthCare, \n"
			+ "\t\t\t\tSequence{ProcessingReasonSubtype::None})";

	/**
	 * Validates the HealthCareShouldNotContainSubReason constraint of '<em>Purpose</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePurpose_HealthCareShouldNotContainSubReason(Purpose purpose, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(PrivacyModelPackage.Literals.PURPOSE, purpose, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "HealthCareShouldNotContainSubReason",
				PURPOSE__HEALTH_CARE_SHOULD_NOT_CONTAIN_SUB_REASON__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE,
				0);
	}

	/**
	 * The cached validation expression for the NotForProfitBodyActivityShouldNotContainSubReason constraint of '<em>Purpose</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PURPOSE__NOT_FOR_PROFIT_BODY_ACTIVITY_SHOULD_NOT_CONTAIN_SUB_REASON__EEXPRESSION = "\n"
			+ "\t\t\t\tisSubPurposeValid(ProcessingReason::NotForProfitBodyActivity, \n"
			+ "\t\t\t\tSequence{ProcessingReasonSubtype::None})";

	/**
	 * Validates the NotForProfitBodyActivityShouldNotContainSubReason constraint of '<em>Purpose</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePurpose_NotForProfitBodyActivityShouldNotContainSubReason(Purpose purpose,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(PrivacyModelPackage.Literals.PURPOSE, purpose, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "NotForProfitBodyActivityShouldNotContainSubReason",
				PURPOSE__NOT_FOR_PROFIT_BODY_ACTIVITY_SHOULD_NOT_CONTAIN_SUB_REASON__EEXPRESSION, Diagnostic.ERROR,
				DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * Validates the ResearchShouldNotContainThisSubReason constraint of '<em>Purpose</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePurpose_ResearchShouldNotContainThisSubReason(Purpose purpose, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(PrivacyModelPackage.Literals.PURPOSE, purpose, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "ResearchShouldNotContainThisSubReason",
				PURPOSE__RESEARCH_SHOULD_NOT_CONTAIN_THIS_SUB_REASON__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE,
				0);
	}

	/**
	 * The cached validation expression for the PublicHealthShouldNotContainSubReason constraint of '<em>Purpose</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PURPOSE__PUBLIC_HEALTH_SHOULD_NOT_CONTAIN_SUB_REASON__EEXPRESSION = "\n"
			+ "\t\t\t\tisSubPurposeValid(ProcessingReason::PublicHealth, \n"
			+ "\t\t\t\tSequence{ProcessingReasonSubtype::None})";

	/**
	 * Validates the TestingShouldNotContainSubReason constraint of '<em>Purpose</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePurpose_TestingShouldNotContainSubReason(Purpose purpose, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(PrivacyModelPackage.Literals.PURPOSE, purpose, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "TestingShouldNotContainSubReason",
				PURPOSE__TESTING_SHOULD_NOT_CONTAIN_SUB_REASON__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the ProfilingShouldNotContainSubReason constraint of '<em>Purpose</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PURPOSE__PROFILING_SHOULD_NOT_CONTAIN_SUB_REASON__EEXPRESSION = "\n"
			+ "\t\t\t\tisSubPurposeValid(ProcessingReason::Profiling, \n"
			+ "\t\t\t\tSequence{ProcessingReasonSubtype::None})";

	/**
	 * Validates the PublicInterestShouldNotContainThisSubReason constraint of '<em>Purpose</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePurpose_PublicInterestShouldNotContainThisSubReason(Purpose purpose,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(PrivacyModelPackage.Literals.PURPOSE, purpose, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "PublicInterestShouldNotContainThisSubReason",
				PURPOSE__PUBLIC_INTEREST_SHOULD_NOT_CONTAIN_THIS_SUB_REASON__EEXPRESSION, Diagnostic.ERROR,
				DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the StatisticalPurposesShouldNotContainSubReason constraint of '<em>Purpose</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PURPOSE__STATISTICAL_PURPOSES_SHOULD_NOT_CONTAIN_SUB_REASON__EEXPRESSION = "\n"
			+ "\t\t\t\tisSubPurposeValid(ProcessingReason::StatisticalPurposes, \n"
			+ "\t\t\t\tSequence{ProcessingReasonSubtype::None})";

	/**
	 * Validates the ProfilingShouldNotContainSubReason constraint of '<em>Purpose</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePurpose_ProfilingShouldNotContainSubReason(Purpose purpose, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(PrivacyModelPackage.Literals.PURPOSE, purpose, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "ProfilingShouldNotContainSubReason",
				PURPOSE__PROFILING_SHOULD_NOT_CONTAIN_SUB_REASON__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the ProtectTheVitalInterestsOfTheDataSubjectShouldNotContainThisSubReason constraint of '<em>Purpose</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PURPOSE__PROTECT_THE_VITAL_INTERESTS_OF_THE_DATA_SUBJECT_SHOULD_NOT_CONTAIN_THIS_SUB_REASON__EEXPRESSION = "\n"
			+ "\t\t\tisSubPurposeValid(ProcessingReason::ProtectTheVitalInterestsOfTheDataSubject, \n"
			+ "\t\t\t\tSequence{ProcessingReasonSubtype::PhysicallyIncapable,ProcessingReasonSubtype::LegallyIncapable, ProcessingReasonSubtype::Other, ProcessingReasonSubtype::None})";

	/**
	 * Validates the ContractPerformanceCannotContainThisSubReason constraint of '<em>Purpose</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePurpose_ContractPerformanceCannotContainThisSubReason(Purpose purpose,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(PrivacyModelPackage.Literals.PURPOSE, purpose, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "ContractPerformanceCannotContainThisSubReason",
				PURPOSE__CONTRACT_PERFORMANCE_CANNOT_CONTAIN_THIS_SUB_REASON__EEXPRESSION, Diagnostic.ERROR,
				DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the LegalObligationShouldNotContainSubReason constraint of '<em>Purpose</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PURPOSE__LEGAL_OBLIGATION_SHOULD_NOT_CONTAIN_SUB_REASON__EEXPRESSION = "\n"
			+ "\t\t\t\tisSubPurposeValid(ProcessingReason::LegalObligation, \n"
			+ "\t\t\t\tSequence{ProcessingReasonSubtype::None})";

	/**
	 * Validates the LegalObligationShouldNotContainSubReason constraint of '<em>Purpose</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePurpose_LegalObligationShouldNotContainSubReason(Purpose purpose,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(PrivacyModelPackage.Literals.PURPOSE, purpose, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "LegalObligationShouldNotContainSubReason",
				PURPOSE__LEGAL_OBLIGATION_SHOULD_NOT_CONTAIN_SUB_REASON__EEXPRESSION, Diagnostic.ERROR,
				DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the LegalClaimsShouldNotContainThisSubReason constraint of '<em>Purpose</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PURPOSE__LEGAL_CLAIMS_SHOULD_NOT_CONTAIN_THIS_SUB_REASON__EEXPRESSION = "\n"
			+ "\t\t\t\tisSubPurposeValid(ProcessingReason::LegalClaims, \n"
			+ "\t\t\t\tSequence{ProcessingReasonSubtype::ProtectionOfRightsOfOthers, ProcessingReasonSubtype::None, ProcessingReasonSubtype::Other})";

	/**
	 * Validates the StopProcessingShouldNotContainSubReason constraint of '<em>Purpose</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePurpose_StopProcessingShouldNotContainSubReason(Purpose purpose, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(PrivacyModelPackage.Literals.PURPOSE, purpose, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "StopProcessingShouldNotContainSubReason",
				PURPOSE__STOP_PROCESSING_SHOULD_NOT_CONTAIN_SUB_REASON__EEXPRESSION, Diagnostic.ERROR,
				DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the ContractPerformanceCannotContainThisSubReason constraint of '<em>Purpose</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PURPOSE__CONTRACT_PERFORMANCE_CANNOT_CONTAIN_THIS_SUB_REASON__EEXPRESSION = "\n"
			+ "\t\t\t\tisSubPurposeValid(ProcessingReason::ContractPerformance, \n"
			+ "\t\t\t\tSequence{ProcessingReasonSubtype::PreContractual, \n"
			+ "\t\t\t\tProcessingReasonSubtype::None, ProcessingReasonSubtype::Other})";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWhat(What what, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(what, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHow(How how, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(how, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsent(Consent consent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(consent, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(consent, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(consent, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(consent, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(consent, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(consent, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(consent, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(consent, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(consent, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateAbstractPaper_StartDateShouldBeBeforeTerminationDate(consent, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContract(Contract contract, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(contract, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(contract, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(contract, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(contract, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(contract, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(contract, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(contract, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(contract, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(contract, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateAbstractPaper_StartDateShouldBeBeforeTerminationDate(contract, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConfigurationManager(ConfigurationManager configurationManager, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(configurationManager, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComplaint(Complaint complaint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(complaint, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(complaint, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(complaint, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(complaint, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(complaint, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(complaint, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(complaint, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(complaint, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(complaint, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateComplaint_UserDoesNotHavePermissionToWithdrawConsent(complaint, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateComplaint_ConsentWithdrawalShouldBeExecutedAsSoonAsPossible(complaint, diagnostics,
					context);
		if (result || diagnostics != null)
			result &= validateComplaint_SubjectShouldBeNotifiedAboutWithdrawal(complaint, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateComplaint_SubjectShouldBeNotifiedAboutExistingComplaintForRectification(complaint,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= validateComplaint_SubjectShouldBeNotifiedAboutExistingComplaintForErasure(complaint, diagnostics,
					context);
		if (result || diagnostics != null)
			result &= validateComplaint_CannotIdentifyDataFromComplaint(complaint, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateComplaint_RectificationShouldBeExecutedAsSoonAsPossible(complaint, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateComplaint_ErasureShouldBeExecutedAsSoonAsPossible(complaint, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateComplaint_InvalidTypeOfPurposeForAnObject(complaint, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateComplaint_UserDoesNotHavePermissionToComplain(complaint, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateComplaint_StopProcessingShouldBeExecutedAsSoonAsPossible(complaint, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateComplaint_RestrictionShouldBeExecutedAsSoonAsPossible(complaint, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateComplaint_RecipientsShouldBeNotifiedAboutRestriction(complaint, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the UserDoesNotHavePermissionToWithdrawConsent constraint of '<em>Complaint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COMPLAINT__USER_DOES_NOT_HAVE_PERMISSION_TO_WITHDRAW_CONSENT__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'Based on Art7',\n" + "\tstatus : Boolean = \n"
			+ "\t\t\tif(not(self.action.oclIsKindOf(Withdraw))) then\n" + "\t\t\t\t\ttrue\n" + "\t\t\telse\n"
			+ "\t\t\t\tlet withdraw : Withdraw = self.action.oclAsType(Withdraw) in\n"
			+ "\t\t\t\t\tself.who = withdraw.subject.providedBy or withdraw.subject.providedBy.responsiblePersons->exists(rp| rp = self.who) or\n"
			+ "\t\t\t\t\tPrivacyPolicy.allInstances()->asSequence()->first().policyStatements->exists(st| not(st.how = null) and st.how.consent = withdraw.subject and\n"
			+ "\t\t\t\t\t\tnot(st.whose = null) and (st.whose = self.who or st.whose.responsiblePersons->exists(rp| rp = self.who)))\n"
			+ "\t\t\tendif\n" + "}.status";

	/**
	 * Validates the SubjectShouldBeNotifiedAboutExistingComplaintForRectification constraint of '<em>Complaint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComplaint_SubjectShouldBeNotifiedAboutExistingComplaintForRectification(Complaint complaint,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(PrivacyModelPackage.Literals.COMPLAINT, complaint, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				"SubjectShouldBeNotifiedAboutExistingComplaintForRectification",
				COMPLAINT__SUBJECT_SHOULD_BE_NOTIFIED_ABOUT_EXISTING_COMPLAINT_FOR_RECTIFICATION__EEXPRESSION,
				Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the SubjectShouldBeNotifiedAboutExistingComplaintForErasure constraint of '<em>Complaint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COMPLAINT__SUBJECT_SHOULD_BE_NOTIFIED_ABOUT_EXISTING_COMPLAINT_FOR_ERASURE__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'Based on Art12',\n" + "\tstatus : Boolean = \n"
			+ "\t\t\tif(self.action.oclIsKindOf(ComplaintBasedOnData)) then\n"
			+ "\t\t\t\tlet basedOnData : ComplaintBasedOnData = self.action.oclAsType(ComplaintBasedOnData) in\n"
			+ "\t\t\t\t\tif(basedOnData.type = ComplaintBasedOnDataType::Erasure)then\n"
			+ "\t\t\t\t\t\tPrivacyPolicy.allInstances()->asSequence()->first().notifications->exists(notification| notification.causedBy = self and\n"
			+ "\t\t\t\t\t\t\tnotification.type = NotificationType::Erasure\n" + "\t\t\t\t\t\t)\n" + "\t\t\t\t\telse\n"
			+ "\t\t\t\t\t\ttrue\n" + "\t\t\t\t\tendif\n" + "\t\t\t\telse\n" + "\t\t\t\t\ttrue\n" + "\t\t\tendif\n"
			+ "}.status";

	/**
	 * Validates the SubjectShouldBeNotifiedAboutExistingComplaintForErasure constraint of '<em>Complaint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComplaint_SubjectShouldBeNotifiedAboutExistingComplaintForErasure(Complaint complaint,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(PrivacyModelPackage.Literals.COMPLAINT, complaint, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				"SubjectShouldBeNotifiedAboutExistingComplaintForErasure",
				COMPLAINT__SUBJECT_SHOULD_BE_NOTIFIED_ABOUT_EXISTING_COMPLAINT_FOR_ERASURE__EEXPRESSION,
				Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the CannotIdentifyDataFromComplaint constraint of '<em>Complaint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COMPLAINT__CANNOT_IDENTIFY_DATA_FROM_COMPLAINT__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'Based on Art11',\n" + "\tstatus : Boolean = \n"
			+ "\t\t\tlet privacyPolicy : PrivacyPolicy = PrivacyPolicy.allInstances()->asSequence()->first() in\n"
			+ "\t\t\tif(not(self.action.oclIsKindOf(ComplaintBasedOnData))) then\n" + "\t\t\t\ttrue\n" + "\t\t\telse\n"
			+ "\t\t\tlet basedOnData : ComplaintBasedOnData = self.action.oclAsType(ComplaintBasedOnData) in\n"
			+ "\t\t\t\t\tbasedOnData.subject->forAll(data: PrivacyData|\n"
			+ "\t\t\t\t\tprivacyPolicy.policyStatements->exists(stmt| stmt.what.actions->exists(action| action = Action::Collecting) and \n"
			+ "\t\t\t\t\t\tnot(stmt.whose = null) and (stmt.whose = self.who or stmt.whose.responsiblePersons->exists(rp| rp = self.who))\n"
			+ "\t\t\t\t\t\tand privacyPolicy.privacyPolicyHelper.isDateAfterInterval(stmt.when, self.when) \n"
			+ "\t\t\t\t\t\tand stmt.what.datas->exists(selectedData| selectedData.privacydata = data)\n"
			+ "\t\t\t\t\t)\n" + "\t\t\t\t)\n" + "\t\t  endif\n" + "}.status";

	/**
	 * Validates the UserDoesNotHavePermissionToWithdrawConsent constraint of '<em>Complaint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComplaint_UserDoesNotHavePermissionToWithdrawConsent(Complaint complaint,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(PrivacyModelPackage.Literals.COMPLAINT, complaint, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "UserDoesNotHavePermissionToWithdrawConsent",
				COMPLAINT__USER_DOES_NOT_HAVE_PERMISSION_TO_WITHDRAW_CONSENT__EEXPRESSION, Diagnostic.ERROR,
				DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the ConsentWithdrawalShouldBeExecutedAsSoonAsPossible constraint of '<em>Complaint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COMPLAINT__CONSENT_WITHDRAWAL_SHOULD_BE_EXECUTED_AS_SOON_AS_POSSIBLE__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'Based on Art7',\n" + "\tstatus : Boolean = \n"
			+ "\t\tlet privacyPolicy : PrivacyPolicy = PrivacyPolicy.allInstances()->asSequence()->first() in\n"
			+ "\t\t\t\tif(not(self.action.oclIsKindOf(Withdraw))) then\n" + "\t\t\t\t\ttrue\n" + "\t\t\t\telse\n"
			+ "\t\t\t\tprivacyPolicy.policyStatements->exists(stmt| stmt.what.actions->exists(action| action = Action::StopProcessing) and \n"
			+ "\t\t\t\t\t\t\tnot(stmt.whose = null) and (stmt.whose = self.who or stmt.whose.responsiblePersons->exists(rp| rp = self.who)) and privacyPolicy.privacyPolicyHelper.isDateBeforeInterval(stmt.when, self.when) \n"
			+ "\t\t\t\t\t\t\tand not(stmt.causedBy = null) and stmt.causedBy = self)\n" + "\t\t\t  endif\n"
			+ "}.status";

	/**
	 * Validates the RecipientsShouldBeNotifiedAboutRestriction constraint of '<em>Complaint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComplaint_RecipientsShouldBeNotifiedAboutRestriction(Complaint complaint,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(PrivacyModelPackage.Literals.COMPLAINT, complaint, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "RecipientsShouldBeNotifiedAboutRestriction",
				COMPLAINT__RECIPIENTS_SHOULD_BE_NOTIFIED_ABOUT_RESTRICTION__EEXPRESSION, Diagnostic.ERROR,
				DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * Validates the ConsentWithdrawalShouldBeExecutedAsSoonAsPossible constraint of '<em>Complaint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComplaint_ConsentWithdrawalShouldBeExecutedAsSoonAsPossible(Complaint complaint,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(PrivacyModelPackage.Literals.COMPLAINT, complaint, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "ConsentWithdrawalShouldBeExecutedAsSoonAsPossible",
				COMPLAINT__CONSENT_WITHDRAWAL_SHOULD_BE_EXECUTED_AS_SOON_AS_POSSIBLE__EEXPRESSION, Diagnostic.ERROR,
				DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the SubjectShouldBeNotifiedAboutWithdrawal constraint of '<em>Complaint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COMPLAINT__SUBJECT_SHOULD_BE_NOTIFIED_ABOUT_WITHDRAWAL__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'Based on Art7',\n" + "\tstatus : Boolean = \n"
			+ "\t\t\tif(self.action.oclIsKindOf(Withdraw)) then\n"
			+ "\t\t\t\t\tPrivacyPolicy.allInstances()->asSequence()->first().notifications->exists(notification| notification.causedBy = self and \n"
			+ "\t\t\t\t\t\tnotification.type = NotificationType::Withdraw\n" + "\t\t\t\t\t)\n" + "\t\t\t\telse\n"
			+ "\t\t\t\t\ttrue\n" + "\t\t\tendif\n" + "}.status";

	/**
	 * Validates the CannotIdentifyDataFromComplaint constraint of '<em>Complaint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComplaint_CannotIdentifyDataFromComplaint(Complaint complaint, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(PrivacyModelPackage.Literals.COMPLAINT, complaint, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "CannotIdentifyDataFromComplaint",
				COMPLAINT__CANNOT_IDENTIFY_DATA_FROM_COMPLAINT__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the RectificationShouldBeExecutedAsSoonAsPossible constraint of '<em>Complaint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COMPLAINT__RECTIFICATION_SHOULD_BE_EXECUTED_AS_SOON_AS_POSSIBLE__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'Based on Art16',\n" + "\tstatus : Boolean = \n"
			+ "\t\t\tdoesPolicyStatementExists(Action::Rectification,ComplaintBasedOnDataType::Rectification)\n"
			+ "}.status";

	/**
	 * Validates the RestrictionShouldBeExecutedAsSoonAsPossible constraint of '<em>Complaint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComplaint_RestrictionShouldBeExecutedAsSoonAsPossible(Complaint complaint,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(PrivacyModelPackage.Literals.COMPLAINT, complaint, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "RestrictionShouldBeExecutedAsSoonAsPossible",
				COMPLAINT__RESTRICTION_SHOULD_BE_EXECUTED_AS_SOON_AS_POSSIBLE__EEXPRESSION, Diagnostic.ERROR,
				DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the RecipientsShouldBeNotifiedAboutRestriction constraint of '<em>Complaint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COMPLAINT__RECIPIENTS_SHOULD_BE_NOTIFIED_ABOUT_RESTRICTION__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'Based on Art19',\n" + "\tstatus : Boolean = \n"
			+ "\t\t\tif(not(self.action.oclIsKindOf(ComplaintBasedOnAction))) then\n" + "\t\t\t\ttrue\n"
			+ "\t\t\telse\n"
			+ "\t\t\tlet basedOnAction : ComplaintBasedOnAction = self.action.oclAsType(ComplaintBasedOnAction) in\n"
			+ "\t\t\t\tif(not(basedOnAction.type = ComplaintBasedOnActionType::Restriction) or not(basedOnAction.denialReason = null)) then\n"
			+ "\t\t\t\t\ttrue\n" + "\t\t\t\telse\n"
			+ "\t\t\t\tlet privacyPolicy : PrivacyPolicy = PrivacyPolicy.allInstances()->asSequence()->first() in\n"
			+ "\t\t\t\t\tprivacyPolicy.notifications->exists(notification| notification.causedBy = self and\n"
			+ "\t\t\t\t\t\tnotification.type = NotificationType::Restriction) and\n"
			+ "\t\t\t\t\t(basedOnAction.statement = null or basedOnAction.statement.whose = null or basedOnAction.statement.what = null or\n"
			+ "\t\t\t\t\tprivacyPolicy.policyStatements->select(tr| not(tr.what = null) and\n"
			+ "\t\t\t\t\t\ttr.what.actions->exists(act| act = Action::Transfer) and\n"
			+ "\t\t\t\t\t\tnot(tr.whose = null) and tr.whose = basedOnAction.statement.whose and not(tr.whom = null) and\n"
			+ "\t\t\t\t\t\ttr.what.datas->exists(d| basedOnAction.statement.what.datas->exists(sd| sd.privacydata = d.privacydata)) and\n"
			+ "\t\t\t\t\t\t(tr.when = null or self.when = null or not(privacyPolicy.privacyPolicyHelper.isDateBeforeInterval(tr.when, self.when))))\n"
			+ "\t\t\t\t\t->forAll(tr| privacyPolicy.notifications->exists(notification| notification.causedBy = self and\n"
			+ "\t\t\t\t\t\tnotification.type = NotificationType::Restriction and notification.receivers->includes(tr.whom))))\n"
			+ "\t\t\t\tendif\n" + "\t\t\tendif\n" + "}.status";

	/**
	 * Validates the UserDoesNotHavePermissionToComplain constraint of '<em>Complaint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComplaint_UserDoesNotHavePermissionToComplain(Complaint complaint,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(PrivacyModelPackage.Literals.COMPLAINT, complaint, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "UserDoesNotHavePermissionToComplain",
				COMPLAINT__USER_DOES_NOT_HAVE_PERMISSION_TO_COMPLAIN__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE,
				0);
	}

	/**
	 * The cached validation expression for the StopProcessingShouldBeExecutedAsSoonAsPossible constraint of '<em>Complaint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COMPLAINT__STOP_PROCESSING_SHOULD_BE_EXECUTED_AS_SOON_AS_POSSIBLE__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'Based on Art21',\n" + "\tstatus : Boolean = \n"
			+ "\t\t\tlet privacyPolicy : PrivacyPolicy = PrivacyPolicy.allInstances()->asSequence()->first() in\n"
			+ "\t\t\t\tif(not(self.action.oclIsKindOf(ComplaintBasedOnAction))) then\n" + "\t\t\t\t\ttrue\n"
			+ "\t\t\t\telse\n"
			+ "\t\t\t\tlet basedOnAction : ComplaintBasedOnAction = self.action.oclAsType(ComplaintBasedOnAction) in\n"
			+ "\t\t\t\tlet directMarketing : Boolean = not(basedOnAction.statement = null) and not(basedOnAction.statement.why = null) and\n"
			+ "\t\t\t\t\tbasedOnAction.statement.why.containsAllowedPurposeReasonAndSubreason(ProcessingReason::Marketing, Sequence{ProcessingReasonSubtype::None}) in\n"
			+ "\t\t\t\t\tif((not(basedOnAction.denialReason = null) and not(directMarketing)) or basedOnAction.type = ComplaintBasedOnActionType::Restriction) then\n"
			+ "\t\t\t\t\t\ttrue\n" + "\t\t\t\t\telse\n"
			+ "\t\t\t\t\t\tprivacyPolicy.policyStatements->exists(stmt| stmt.what.actions->exists(action| action = Action::StopProcessing) and \n"
			+ "\t\t\t\t\t\t\tnot(stmt.causedBy = null) and stmt.causedBy = self)\n" + "\t\t\t\t\tendif\n"
			+ "\t\t\t  endif\n" + "}.status";

	/**
	 * Validates the SubjectShouldBeNotifiedAboutWithdrawal constraint of '<em>Complaint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComplaint_SubjectShouldBeNotifiedAboutWithdrawal(Complaint complaint,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(PrivacyModelPackage.Literals.COMPLAINT, complaint, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "SubjectShouldBeNotifiedAboutWithdrawal",
				COMPLAINT__SUBJECT_SHOULD_BE_NOTIFIED_ABOUT_WITHDRAWAL__EEXPRESSION, Diagnostic.ERROR,
				DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the SubjectShouldBeNotifiedAboutExistingComplaintForRectification constraint of '<em>Complaint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COMPLAINT__SUBJECT_SHOULD_BE_NOTIFIED_ABOUT_EXISTING_COMPLAINT_FOR_RECTIFICATION__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'Based on Art12',\n" + "\tstatus : Boolean = \n"
			+ "\t\t\tif(self.action.oclIsKindOf(ComplaintBasedOnData)) then\n"
			+ "\t\t\t\tlet basedOnData : ComplaintBasedOnData = self.action.oclAsType(ComplaintBasedOnData) in\n"
			+ "\t\t\t\t\tif(basedOnData.type = ComplaintBasedOnDataType::Rectification)then\n"
			+ "\t\t\t\t\t\tPrivacyPolicy.allInstances()->asSequence()->first().notifications->exists(notification| notification.causedBy = self and\n"
			+ "\t\t\t\t\t\t\tnotification.type = NotificationType::Rectification\n" + "\t\t\t\t\t\t)\n"
			+ "\t\t\t\t\telse\n" + "\t\t\t\t\t\ttrue\n" + "\t\t\t\t\tendif\n" + "\t\t\t\telse\n" + "\t\t\t\t\ttrue\n"
			+ "\t\t\tendif\n" + "}.status";

	/**
	 * Validates the RectificationShouldBeExecutedAsSoonAsPossible constraint of '<em>Complaint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComplaint_RectificationShouldBeExecutedAsSoonAsPossible(Complaint complaint,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(PrivacyModelPackage.Literals.COMPLAINT, complaint, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "RectificationShouldBeExecutedAsSoonAsPossible",
				COMPLAINT__RECTIFICATION_SHOULD_BE_EXECUTED_AS_SOON_AS_POSSIBLE__EEXPRESSION, Diagnostic.ERROR,
				DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the ErasureShouldBeExecutedAsSoonAsPossible constraint of '<em>Complaint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COMPLAINT__ERASURE_SHOULD_BE_EXECUTED_AS_SOON_AS_POSSIBLE__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'Based on Art17',\n" + "\tstatus : Boolean = \n"
			+ "\t\t\tdoesPolicyStatementExists(Action::Erasure,ComplaintBasedOnDataType::Erasure)\n" + "}.status";

	/**
	 * Validates the ErasureShouldBeExecutedAsSoonAsPossible constraint of '<em>Complaint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComplaint_ErasureShouldBeExecutedAsSoonAsPossible(Complaint complaint,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(PrivacyModelPackage.Literals.COMPLAINT, complaint, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "ErasureShouldBeExecutedAsSoonAsPossible",
				COMPLAINT__ERASURE_SHOULD_BE_EXECUTED_AS_SOON_AS_POSSIBLE__EEXPRESSION, Diagnostic.ERROR,
				DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the InvalidTypeOfPurposeForAnObject constraint of '<em>Complaint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COMPLAINT__INVALID_TYPE_OF_PURPOSE_FOR_AN_OBJECT__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'Based on Art21',\n" + "\tstatus : Boolean = \n"
			+ "\t\t\tif(not(self.action.oclIsKindOf(ComplaintBasedOnAction))) then\n" + "\t\t\t\t\ttrue\n"
			+ "\t\t\telse\n"
			+ "\t\t\t\tlet basedOnAction : ComplaintBasedOnAction = self.action.oclAsType(ComplaintBasedOnAction) in\n"
			+ "\t\t\t\tif(basedOnAction.statement.why = null or not(basedOnAction.denialReason = null) or basedOnAction.type = ComplaintBasedOnActionType::Restriction) then\n"
			+ "\t\t\t\t\t\ttrue\n" + "\t\t\t\telse\n"
			+ "\t\t\t\t\tbasedOnAction.statement.why.containsAllowedPurposeReasonAndSubreason(ProcessingReason::Marketing, Sequence{ProcessingReasonSubtype::None})\n"
			+ "\t\t\t\t\tor\n"
			+ "\t\t\t\t\tbasedOnAction.statement.why.containsAllowedPurposeReasonAndSubreason(ProcessingReason::Profiling, Sequence{ProcessingReasonSubtype::None})\n"
			+ "\t\t\t\t\tor\n"
			+ "\t\t\t\t\tbasedOnAction.statement.why.containsAllowedPurposeReasonAndSubreason(ProcessingReason::LegitimateInterests, Sequence{ProcessingReasonSubtype::None})\n"
			+ "\t\t\t\t\tor\n"
			+ "\t\t\t\t\tbasedOnAction.statement.why.containsAllowedPurposeReasonAndSubreason(ProcessingReason::PublicInterest, Sequence{ProcessingReasonSubtype::None, ProcessingReasonSubtype::Other})\n"
			+ "\t\t\t\t\tor\n"
			+ "\t\t\t\t\tbasedOnAction.statement.why.containsAllowedPurposeReasonAndSubreason(ProcessingReason::Research, Sequence{ProcessingReasonSubtype::None, ProcessingReasonSubtype::Other,\n"
			+ "\t\t\t\t\t\tProcessingReasonSubtype::Scientific, ProcessingReasonSubtype::Historical, ProcessingReasonSubtype::Statistical})\n"
			+ "\t\t\t\t\tor\n"
			+ "\t\t\t\t\tbasedOnAction.statement.why.containsAllowedPurposeReasonAndSubreason(ProcessingReason::StatisticalPurposes, Sequence{ProcessingReasonSubtype::None})\n"
			+ "\t\t\t\tendif\n" + "\t\t\tendif\n" + "}.status";

	/**
	 * Validates the InvalidTypeOfPurposeForAnObject constraint of '<em>Complaint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComplaint_InvalidTypeOfPurposeForAnObject(Complaint complaint, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(PrivacyModelPackage.Literals.COMPLAINT, complaint, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "InvalidTypeOfPurposeForAnObject",
				COMPLAINT__INVALID_TYPE_OF_PURPOSE_FOR_AN_OBJECT__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the UserDoesNotHavePermissionToComplain constraint of '<em>Complaint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COMPLAINT__USER_DOES_NOT_HAVE_PERMISSION_TO_COMPLAIN__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'Based on Art18 and Art21',\n" + "\tstatus : Boolean = \n"
			+ "\t\t\tif(not(self.action.oclIsKindOf(ComplaintBasedOnAction))) then\n" + "\t\t\t\t\ttrue\n"
			+ "\t\t\telse\n"
			+ "\t\t\t\tlet basedOnAction : ComplaintBasedOnAction = self.action.oclAsType(ComplaintBasedOnAction) in\n"
			+ "\t\t\t\t\tnot(basedOnAction.statement.whose = null) \n" + "\t\t\t\t\tand \n"
			+ "\t\t\t\t\t(basedOnAction.statement.whose = self.who or basedOnAction.statement.whose.responsiblePersons->exists(rp| rp = self.who))\n"
			+ "\t\t\tendif\n" + "}.status";

	/**
	 * Validates the StopProcessingShouldBeExecutedAsSoonAsPossible constraint of '<em>Complaint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComplaint_StopProcessingShouldBeExecutedAsSoonAsPossible(Complaint complaint,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(PrivacyModelPackage.Literals.COMPLAINT, complaint, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "StopProcessingShouldBeExecutedAsSoonAsPossible",
				COMPLAINT__STOP_PROCESSING_SHOULD_BE_EXECUTED_AS_SOON_AS_POSSIBLE__EEXPRESSION, Diagnostic.ERROR,
				DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the RestrictionShouldBeExecutedAsSoonAsPossible constraint of '<em>Complaint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COMPLAINT__RESTRICTION_SHOULD_BE_EXECUTED_AS_SOON_AS_POSSIBLE__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'Based on Art18',\n" + "\tstatus : Boolean = \n"
			+ "\t\t\tlet privacyPolicy : PrivacyPolicy = PrivacyPolicy.allInstances()->asSequence()->first() in\n"
			+ "\t\t\t\tif(not(self.action.oclIsKindOf(ComplaintBasedOnAction))) then\n" + "\t\t\t\t\ttrue\n"
			+ "\t\t\t\telse\n"
			+ "\t\t\t\tlet basedOnAction : ComplaintBasedOnAction = self.action.oclAsType(ComplaintBasedOnAction) in\n"
			+ "\t\t\t\t\tif(not(basedOnAction.type = ComplaintBasedOnActionType::Restriction) or not(basedOnAction.denialReason = null)) then\n"
			+ "\t\t\t\t\t\ttrue\n" + "\t\t\t\t\telse\n"
			+ "\t\t\t\t\t\tprivacyPolicy.policyStatements->exists(stmt| not(stmt.what = null) and stmt.what.actions->exists(action| action = Action::RestrictProcessing) and \n"
			+ "\t\t\t\t\t\t\tnot(stmt.causedBy = null) and stmt.causedBy = self)\n" + "\t\t\t\t\tendif\n"
			+ "\t\t\t  endif\n" + "}.status";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrivacyPolicyHelper(PrivacyPolicyHelper privacyPolicyHelper, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(privacyPolicyHelper, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWhere(Where where, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(where, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocument(Document document, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(document, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(document, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(document, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(document, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(document, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(document, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(document, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(document, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(document, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateAbstractPaper_StartDateShouldBeBeforeTerminationDate(document, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractPaper(AbstractPaper abstractPaper, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(abstractPaper, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(abstractPaper, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(abstractPaper, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(abstractPaper, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(abstractPaper, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(abstractPaper, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(abstractPaper, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(abstractPaper, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(abstractPaper, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateAbstractPaper_StartDateShouldBeBeforeTerminationDate(abstractPaper, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the StartDateShouldBeBeforeTerminationDate constraint of '<em>Abstract Paper</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ABSTRACT_PAPER__START_DATE_SHOULD_BE_BEFORE_TERMINATION_DATE__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'Termination date is before start date',\n" + "\tstatus : Boolean = \n"
			+ "\t\t\tself.terminationDate = null or (not(self.startDate > self.terminationDate))\n" + "}.status";

	/**
	 * Validates the StartDateShouldBeBeforeTerminationDate constraint of '<em>Abstract Paper</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractPaper_StartDateShouldBeBeforeTerminationDate(AbstractPaper abstractPaper,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(PrivacyModelPackage.Literals.ABSTRACT_PAPER, abstractPaper, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "StartDateShouldBeBeforeTerminationDate",
				ABSTRACT_PAPER__START_DATE_SHOULD_BE_BEFORE_TERMINATION_DATE__EEXPRESSION, Diagnostic.ERROR,
				DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractComplaintAction(AbstractComplaintAction abstractComplaintAction,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractComplaintAction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWithdraw(Withdraw withdraw, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(withdraw, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComplaintBasedOnData(ComplaintBasedOnData complaintBasedOnData, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(complaintBasedOnData, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSharedPrivacyData(SharedPrivacyData sharedPrivacyData, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(sharedPrivacyData, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(sharedPrivacyData, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(sharedPrivacyData, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(sharedPrivacyData, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(sharedPrivacyData, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(sharedPrivacyData, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(sharedPrivacyData, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(sharedPrivacyData, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(sharedPrivacyData, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateSharedPrivacyData_AdditionalProtectionControlShouldExistInConfiguration(sharedPrivacyData,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= validateSharedPrivacyData_DataSourceShouldExistInConfiguration(sharedPrivacyData, diagnostics,
					context);
		return result;
	}

	/**
	 * The cached validation expression for the AdditionalProtectionControlShouldExistInConfiguration constraint of '<em>Shared Privacy Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SHARED_PRIVACY_DATA__ADDITIONAL_PROTECTION_CONTROL_SHOULD_EXIST_IN_CONFIGURATION__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'Additional protection controls should be defined in configuration.',\n"
			+ "\tstatus : Boolean = \n" + "\t\t\tself.additionalProtectionControls->forAll(protectionControl:String|\n"
			+ "\t\t\t\tPrivacyPolicy.allInstances()->asSequence()->first().privacyPolicyHelper.isPolicyControlValid(protectionControl)\n"
			+ "\t\t\t)\n" + "}.status";

	/**
	 * Validates the AdditionalProtectionControlShouldExistInConfiguration constraint of '<em>Shared Privacy Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSharedPrivacyData_AdditionalProtectionControlShouldExistInConfiguration(
			SharedPrivacyData sharedPrivacyData, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(PrivacyModelPackage.Literals.SHARED_PRIVACY_DATA, sharedPrivacyData, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				"AdditionalProtectionControlShouldExistInConfiguration",
				SHARED_PRIVACY_DATA__ADDITIONAL_PROTECTION_CONTROL_SHOULD_EXIST_IN_CONFIGURATION__EEXPRESSION,
				Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the DataSourceShouldExistInConfiguration constraint of '<em>Shared Privacy Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SHARED_PRIVACY_DATA__DATA_SOURCE_SHOULD_EXIST_IN_CONFIGURATION__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'Data source should be defined in configuration.',\n" + "\tstatus : Boolean = \n"
			+ "\t\t\tself.dataSource = null or PrivacyPolicy.allInstances()->asSequence()->first().privacyPolicyHelper.isDataSourceValid(self.dataSource)\n"
			+ "}.status";

	/**
	 * Validates the DataSourceShouldExistInConfiguration constraint of '<em>Shared Privacy Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSharedPrivacyData_DataSourceShouldExistInConfiguration(SharedPrivacyData sharedPrivacyData,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(PrivacyModelPackage.Literals.SHARED_PRIVACY_DATA, sharedPrivacyData, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "DataSourceShouldExistInConfiguration",
				SHARED_PRIVACY_DATA__DATA_SOURCE_SHOULD_EXIST_IN_CONFIGURATION__EEXPRESSION, Diagnostic.ERROR,
				DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDenial(Denial denial, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(denial, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNotification(Notification notification, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(notification, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(notification, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(notification, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(notification, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(notification, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(notification, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(notification, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(notification, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(notification, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateNotification_ShouldDefineCausedByAsWithdraw(notification, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateNotification_ShouldDefineCausedByAsErasure(notification, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateNotification_ShouldDefineCausedByAsRectification(notification, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateNotification_ShouldDefineCausedByAsPrivacyPolicy(notification, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateNotification_ShouldDefineCausedByAsRestriction(notification, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the ShouldDefineCausedByAsWithdraw constraint of '<em>Notification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String NOTIFICATION__SHOULD_DEFINE_CAUSED_BY_AS_WITHDRAW__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'NotifyAboutWithdraw should contain causedBy with complaint Withdraw',\n"
			+ "\tstatus : Boolean = \n" + "\t\t\tif(type = NotificationType::Withdraw) then\n"
			+ "\t\t\t\tif(causedBy.oclIsKindOf(Complaint)) then\n"
			+ "\t\t\t\t\tlet complaint : Complaint = causedBy.oclAsType(Complaint) in\n"
			+ "\t\t\t\t\tcomplaint.action.oclIsKindOf(Withdraw)\n" + "\t\t\t\telse\n" + "\t\t\t\t\tfalse\n"
			+ "\t\t\t\tendif\n" + "\t\t\telse\n" + "\t\t\t\ttrue\n" + "\t\t\tendif\n" + "}.status";

	/**
	 * Validates the ShouldDefineCausedByAsRestriction constraint of '<em>Notification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNotification_ShouldDefineCausedByAsRestriction(Notification notification,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(PrivacyModelPackage.Literals.NOTIFICATION, notification, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "ShouldDefineCausedByAsRestriction",
				NOTIFICATION__SHOULD_DEFINE_CAUSED_BY_AS_RESTRICTION__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE,
				0);
	}

	/**
	 * Validates the ShouldDefineCausedByAsWithdraw constraint of '<em>Notification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNotification_ShouldDefineCausedByAsWithdraw(Notification notification,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(PrivacyModelPackage.Literals.NOTIFICATION, notification, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "ShouldDefineCausedByAsWithdraw",
				NOTIFICATION__SHOULD_DEFINE_CAUSED_BY_AS_WITHDRAW__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the ShouldDefineCausedByAsErasure constraint of '<em>Notification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String NOTIFICATION__SHOULD_DEFINE_CAUSED_BY_AS_ERASURE__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'NotifyAboutErasure should contain causedBy with complaint Erasure',\n"
			+ "\tstatus : Boolean = \n" + "\t\t\tif(type = NotificationType::Erasure) then\n"
			+ "\t\t\t\tif(causedBy.oclIsKindOf(Complaint)) then\n"
			+ "\t\t\t\t\tlet complaint : Complaint = causedBy.oclAsType(Complaint) in\n"
			+ "\t\t\t\t\tif(complaint.action.oclIsKindOf(ComplaintBasedOnData)) then\n"
			+ "\t\t\t\t\t\tlet basedOnData : ComplaintBasedOnData = complaint.action.oclAsType(ComplaintBasedOnData) in\n"
			+ "\t\t\t\t\t\tbasedOnData.type = ComplaintBasedOnDataType::Erasure\n" + "\t\t\t\t\telse\n"
			+ "\t\t\t\t\t\tfalse\n" + "\t\t\t\t\tendif\n" + "\t\t\t\telse\n" + "\t\t\t\t\tfalse\n" + "\t\t\t\tendif\n"
			+ "\t\t\telse\n" + "\t\t\t\ttrue\n" + "\t\t\tendif\n" + "}.status";

	/**
	 * Validates the ShouldDefineCausedByAsErasure constraint of '<em>Notification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNotification_ShouldDefineCausedByAsErasure(Notification notification,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(PrivacyModelPackage.Literals.NOTIFICATION, notification, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "ShouldDefineCausedByAsErasure",
				NOTIFICATION__SHOULD_DEFINE_CAUSED_BY_AS_ERASURE__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the ShouldDefineCausedByAsRectification constraint of '<em>Notification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String NOTIFICATION__SHOULD_DEFINE_CAUSED_BY_AS_RECTIFICATION__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'NotifyAboutRectification should contain causedBy with complaint Rectification',\n"
			+ "\tstatus : Boolean = \n" + "\t\t\tif(type = NotificationType::Rectification) then\n"
			+ "\t\t\t\tif(causedBy.oclIsKindOf(Complaint)) then\n"
			+ "\t\t\t\t\tlet complaint : Complaint = causedBy.oclAsType(Complaint) in\n"
			+ "\t\t\t\t\tif(complaint.action.oclIsKindOf(ComplaintBasedOnData)) then\n"
			+ "\t\t\t\t\t\tlet basedOnData : ComplaintBasedOnData = complaint.action.oclAsType(ComplaintBasedOnData) in\n"
			+ "\t\t\t\t\t\tbasedOnData.type = ComplaintBasedOnDataType::Rectification\n" + "\t\t\t\t\telse\n"
			+ "\t\t\t\t\t\tfalse\n" + "\t\t\t\t\tendif\n" + "\t\t\t\telse\n" + "\t\t\t\t\tfalse\n" + "\t\t\t\tendif\n"
			+ "\t\t\telse\n" + "\t\t\t\ttrue\n" + "\t\t\tendif\n" + "}.status";

	/**
	 * Validates the ShouldDefineCausedByAsRectification constraint of '<em>Notification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNotification_ShouldDefineCausedByAsRectification(Notification notification,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(PrivacyModelPackage.Literals.NOTIFICATION, notification, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "ShouldDefineCausedByAsRectification",
				NOTIFICATION__SHOULD_DEFINE_CAUSED_BY_AS_RECTIFICATION__EEXPRESSION, Diagnostic.ERROR,
				DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the ShouldDefineCausedByAsPrivacyPolicy constraint of '<em>Notification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String NOTIFICATION__SHOULD_DEFINE_CAUSED_BY_AS_PRIVACY_POLICY__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'NotifyAboutCollecting or StopProcessing should contain causedBy with policy statement',\n"
			+ "\tstatus : Boolean = \n"
			+ "\t\t\tif(type = NotificationType::DataCollecting or type = NotificationType::StopProcessing \n"
			+ "\t\t\t\tor type = NotificationType::ExecutedRectification or type = NotificationType::ExecutedErasure\n"
			+ "\t\t\t\tor type = NotificationType::RestrictionLifted\n" + "\t\t\t) then\n"
			+ "\t\t\t\tcausedBy.oclIsKindOf(PolicyStatement)\n" + "\t\t\telse\n" + "\t\t\t\ttrue\n" + "\t\t\tendif\n"
			+ "}.status";

	/**
	 * Validates the ShouldDefineCausedByAsPrivacyPolicy constraint of '<em>Notification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNotification_ShouldDefineCausedByAsPrivacyPolicy(Notification notification,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(PrivacyModelPackage.Literals.NOTIFICATION, notification, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "ShouldDefineCausedByAsPrivacyPolicy",
				NOTIFICATION__SHOULD_DEFINE_CAUSED_BY_AS_PRIVACY_POLICY__EEXPRESSION, Diagnostic.ERROR,
				DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the ShouldDefineCausedByAsRestriction constraint of '<em>Notification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String NOTIFICATION__SHOULD_DEFINE_CAUSED_BY_AS_RESTRICTION__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'NotifyAboutRestriction should contain causedBy with complaint Restriction',\n"
			+ "\tstatus : Boolean = \n" + "\t\t\tif(type = NotificationType::Restriction) then\n"
			+ "\t\t\t\tif(causedBy.oclIsKindOf(Complaint)) then\n"
			+ "\t\t\t\t\tlet complaint : Complaint = causedBy.oclAsType(Complaint) in\n"
			+ "\t\t\t\t\tif(complaint.action.oclIsKindOf(ComplaintBasedOnAction)) then\n"
			+ "\t\t\t\t\t\tcomplaint.action.oclAsType(ComplaintBasedOnAction).type = ComplaintBasedOnActionType::Restriction\n"
			+ "\t\t\t\t\telse\n" + "\t\t\t\t\t\tfalse\n" + "\t\t\t\t\tendif\n" + "\t\t\t\telse\n" + "\t\t\t\t\tfalse\n"
			+ "\t\t\t\tendif\n" + "\t\t\telse\n" + "\t\t\t\ttrue\n" + "\t\t\tendif\n" + "}.status";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNotificationInfo(NotificationInfo notificationInfo, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(notificationInfo, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractComplaint(AbstractComplaint abstractComplaint, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractComplaint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComplaintBasedOnAction(ComplaintBasedOnAction complaintBasedOnAction,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(complaintBasedOnAction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataOrigin(DataOrigin dataOrigin, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataType(DataType dataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentType(DocumentType documentType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimePreposition(TimePreposition timePreposition, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrincipalType(PrincipalType principalType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrincipalScope(PrincipalScope principalScope, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAction(Action action, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocationType(LocationType locationType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessingReason(ProcessingReason processingReason, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessingReasonSubtype(ProcessingReasonSubtype processingReasonSubtype,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsentFormat(ConsentFormat consentFormat, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsentType(ConsentType consentType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComplaintBasedOnActionType(ComplaintBasedOnActionType complaintBasedOnActionType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComplaintBasedOnDataType(ComplaintBasedOnDataType complaintBasedOnDataType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNotificationType(NotificationType notificationType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComplaintStatus(ComplaintStatus complaintStatus, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //PrivacyModelValidator
