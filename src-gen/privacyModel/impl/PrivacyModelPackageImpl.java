/**
 */
package privacyModel.impl;

import oclstdlib.OclstdlibPackage;

import oclstdlib.impl.OclstdlibPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import privacyModel.AbstractComplaint;
import privacyModel.AbstractComplaintAction;
import privacyModel.AbstractPaper;
import privacyModel.AbstractTime;
import privacyModel.Action;
import privacyModel.Complaint;
import privacyModel.ComplaintBasedOnAction;
import privacyModel.ComplaintBasedOnData;
import privacyModel.ComplaintBasedOnDataType;
import privacyModel.ComplaintStatus;
import privacyModel.ConfigurationManager;
import privacyModel.Consent;
import privacyModel.ConsentFormat;
import privacyModel.ConsentType;
import privacyModel.DataType;
import privacyModel.Denial;
import privacyModel.Document;
import privacyModel.DocumentType;
import privacyModel.How;
import privacyModel.Location;
import privacyModel.LocationType;
import privacyModel.NamedElement;
import privacyModel.Notification;
import privacyModel.NotificationInfo;
import privacyModel.NotificationType;
import privacyModel.PolicyStatement;
import privacyModel.Principal;
import privacyModel.PrincipalScope;
import privacyModel.PrincipalType;
import privacyModel.PrivacyData;
import privacyModel.PrivacyModelFactory;
import privacyModel.PrivacyModelPackage;
import privacyModel.PrivacyPolicy;
import privacyModel.PrivacyPolicyHelper;
import privacyModel.ProcessingReason;
import privacyModel.ProcessingReasonSubtype;
import privacyModel.Provider;
import privacyModel.Purpose;
import privacyModel.Service;
import privacyModel.SharedPrivacyData;
import privacyModel.TimeInterval;
import privacyModel.TimePreposition;
import privacyModel.TimeStatement;
import privacyModel.What;
import privacyModel.Where;
import privacyModel.Withdraw;

import privacyModel.util.PrivacyModelValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PrivacyModelPackageImpl extends EPackageImpl implements PrivacyModelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass privacyPolicyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass policyStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass privacyDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass providerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass principalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractTimeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeIntervalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass purposeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass whatEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass howEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass consentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configurationManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass complaintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass privacyPolicyHelperEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass whereEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractPaperEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractComplaintActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass withdrawEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass complaintBasedOnDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sharedPrivacyDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass denialEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notificationInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractComplaintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass complaintBasedOnActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dataTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum documentTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum timePrepositionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum principalTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum principalScopeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum actionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum locationTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum processingReasonEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum processingReasonSubtypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum consentFormatEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum consentTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum complaintBasedOnDataTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum notificationTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum complaintStatusEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see privacyModel.PrivacyModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PrivacyModelPackageImpl() {
		super(eNS_URI, PrivacyModelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link PrivacyModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PrivacyModelPackage init() {
		if (isInited)
			return (PrivacyModelPackage) EPackage.Registry.INSTANCE.getEPackage(PrivacyModelPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredPrivacyModelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		PrivacyModelPackageImpl thePrivacyModelPackage = registeredPrivacyModelPackage instanceof PrivacyModelPackageImpl
				? (PrivacyModelPackageImpl) registeredPrivacyModelPackage
				: new PrivacyModelPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(OclstdlibPackage.eNS_URI);
		OclstdlibPackageImpl theOclstdlibPackage = (OclstdlibPackageImpl) (registeredPackage instanceof OclstdlibPackageImpl
				? registeredPackage
				: OclstdlibPackage.eINSTANCE);

		// Create package meta-data objects
		thePrivacyModelPackage.createPackageContents();
		theOclstdlibPackage.createPackageContents();

		// Initialize created meta-data
		thePrivacyModelPackage.initializePackageContents();
		theOclstdlibPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put(thePrivacyModelPackage, new EValidator.Descriptor() {
			public EValidator getEValidator() {
				return PrivacyModelValidator.INSTANCE;
			}
		});

		// Mark meta-data to indicate it can't be changed
		thePrivacyModelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PrivacyModelPackage.eNS_URI, thePrivacyModelPackage);
		return thePrivacyModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Name() {
		return (EAttribute) namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrivacyPolicy() {
		return privacyPolicyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrivacyPolicy_PolicyStatements() {
		return (EReference) privacyPolicyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrivacyPolicy_Owner() {
		return (EReference) privacyPolicyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrivacyPolicy_AllPrincipals() {
		return (EReference) privacyPolicyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrivacyPolicy_Locations() {
		return (EReference) privacyPolicyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrivacyPolicy_DefaultProtectionControls() {
		return (EAttribute) privacyPolicyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrivacyPolicy_AllServices() {
		return (EReference) privacyPolicyEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrivacyPolicy_AllProviders() {
		return (EReference) privacyPolicyEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrivacyPolicy_ConfigurationManager() {
		return (EReference) privacyPolicyEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrivacyPolicy_AllDatas() {
		return (EReference) privacyPolicyEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrivacyPolicy_AllComplaints() {
		return (EReference) privacyPolicyEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrivacyPolicy_PrivacyPolicyHelper() {
		return (EReference) privacyPolicyEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrivacyPolicy_AllDenials() {
		return (EReference) privacyPolicyEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrivacyPolicy_AllConsents() {
		return (EReference) privacyPolicyEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrivacyPolicy_AllDocuments() {
		return (EReference) privacyPolicyEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrivacyPolicy_Notifications() {
		return (EReference) privacyPolicyEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrivacyPolicy_AllSharedPrivacyData() {
		return (EReference) privacyPolicyEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrivacyPolicy__UniqueProviderName__DiagnosticChain_Map() {
		return privacyPolicyEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrivacyPolicy__UniqueConsentName__DiagnosticChain_Map() {
		return privacyPolicyEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrivacyPolicy__UniqueServiceName__DiagnosticChain_Map() {
		return privacyPolicyEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrivacyPolicy__OwnerShouldHaveDefinedInhabits__DiagnosticChain_Map() {
		return privacyPolicyEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrivacyPolicy__UniquePolicyStatementName__DiagnosticChain_Map() {
		return privacyPolicyEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrivacyPolicy__ProtectionControlShouldExistsInConfiguration__DiagnosticChain_Map() {
		return privacyPolicyEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrivacyPolicy__UniquePrivacyDataName__DiagnosticChain_Map() {
		return privacyPolicyEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrivacyPolicy__UniqueDocumentName__DiagnosticChain_Map() {
		return privacyPolicyEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrivacyPolicy__UniqueLocationPerType__DiagnosticChain_Map() {
		return privacyPolicyEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrivacyPolicy__UniquePrincipalNamePerType__DiagnosticChain_Map() {
		return privacyPolicyEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrivacyPolicy__UniqueComplaintName__DiagnosticChain_Map() {
		return privacyPolicyEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPolicyStatement() {
		return policyStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPolicyStatement_When() {
		return (EReference) policyStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPolicyStatement_Who() {
		return (EReference) policyStatementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPolicyStatement_Why() {
		return (EReference) policyStatementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPolicyStatement_What() {
		return (EReference) policyStatementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPolicyStatement_How() {
		return (EReference) policyStatementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPolicyStatement_Whose() {
		return (EReference) policyStatementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPolicyStatement_Whom() {
		return (EReference) policyStatementEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPolicyStatement_Where() {
		return (EReference) policyStatementEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPolicyStatement_CausedBy() {
		return (EReference) policyStatementEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPolicyStatement__DateShouldBeDefinedForType__Action() {
		return policyStatementEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPolicyStatement__CausedByShouldBeDefinedForType__Action() {
		return policyStatementEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPolicyStatement__DocumentIsNeededForPurpose__DocumentType_ProcessingReason() {
		return policyStatementEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPolicyStatement__SubjectShouldBeNotifiedAboutTransferToThirdCountry__DiagnosticChain_Map() {
		return policyStatementEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPolicyStatement__SubjectShouldBeNotifiedAboutExecutedRectification__DiagnosticChain_Map() {
		return policyStatementEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPolicyStatement__SubjectShouldBeNotifiedAboutStopProcessing__DiagnosticChain_Map() {
		return policyStatementEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPolicyStatement__ControllerApprovalIsNeedForProtectTheVitalInterestsOfTheDataSubjectPurpose__DiagnosticChain_Map() {
		return policyStatementEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPolicyStatement__MissingConsentForCollecting__DiagnosticChain_Map() {
		return policyStatementEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPolicyStatement__ExpiredConsent__DiagnosticChain_Map() {
		return policyStatementEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPolicyStatement__StopProcessingPurposeForActionStopProcessing__DiagnosticChain_Map() {
		return policyStatementEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPolicyStatement__WithdrawedConsent__DiagnosticChain_Map() {
		return policyStatementEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPolicyStatement__ProcessingOfSpecialCategories__DiagnosticChain_Map() {
		return policyStatementEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPolicyStatement__SubjectShouldBeNotifiedAboutCollecting__DiagnosticChain_Map() {
		return policyStatementEClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPolicyStatement__DateShoudBeDefinedForStoreAction__DiagnosticChain_Map() {
		return policyStatementEClass.getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPolicyStatement__CourtApprovalIsNeedForPublicInterestPurpose__DiagnosticChain_Map() {
		return policyStatementEClass.getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPolicyStatement__ControllerApprovalIsNeedForLegitimateInterestsPurpose__DiagnosticChain_Map() {
		return policyStatementEClass.getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPolicyStatement__DateShoudBeDefinedForAccessAction__DiagnosticChain_Map() {
		return policyStatementEClass.getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPolicyStatement__ExpiredConsentForCollecting__DiagnosticChain_Map() {
		return policyStatementEClass.getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPolicyStatement__CausedByShouldBeDefinedForStopProcessingAction__DiagnosticChain_Map() {
		return policyStatementEClass.getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPolicyStatement__JuvenileDataShouldBeUsedWithDocumentOfTypeChildCustodyProvidedByResponsiblePerson__DiagnosticChain_Map() {
		return policyStatementEClass.getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPolicyStatement__MissingConsentOrTransferCertificate__DiagnosticChain_Map() {
		return policyStatementEClass.getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPolicyStatement__UndefinedPurposeForAction__DiagnosticChain_Map() {
		return policyStatementEClass.getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPolicyStatement__CausedByShouldBeDefinedForRectificationAction__DiagnosticChain_Map() {
		return policyStatementEClass.getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPolicyStatement__ExpiredDocument__DiagnosticChain_Map() {
		return policyStatementEClass.getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPolicyStatement__MissingConsentForTransfer__DiagnosticChain_Map() {
		return policyStatementEClass.getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPolicyStatement__CausedByShouldBeDefinedForErasureAction__DiagnosticChain_Map() {
		return policyStatementEClass.getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPolicyStatement__SubjectShouldBeNotifiedAboutExecutedErasure__DiagnosticChain_Map() {
		return policyStatementEClass.getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPolicyStatement__WhomShouldBeDefinedForTransfer__DiagnosticChain_Map() {
		return policyStatementEClass.getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrivacyData() {
		return privacyDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrivacyData_Type() {
		return (EAttribute) privacyDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getService() {
		return serviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getService_Subservices() {
		return (EReference) serviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProvider() {
		return providerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProvider_Provide() {
		return (EReference) providerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProvider_Located() {
		return (EReference) providerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrincipal() {
		return principalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrincipal_SubPrincipals() {
		return (EReference) principalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrincipal_Type() {
		return (EAttribute) principalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrincipal_Scope() {
		return (EAttribute) principalEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrincipal_ResponsiblePersons() {
		return (EReference) principalEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrincipal_Inhabits() {
		return (EReference) principalEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrincipal_Birthdate() {
		return (EAttribute) principalEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrincipal_Age() {
		return (EAttribute) principalEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrincipal__Equals__Principal() {
		return principalEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrincipal__NaturalPersonCanNotConatainsSubPrincipals__DiagnosticChain_Map() {
		return principalEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrincipal__JuvenileShouldHaveResponsiblePerson__DiagnosticChain_Map() {
		return principalEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocation() {
		return locationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocation_IsEUMember() {
		return (EAttribute) locationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocation_Type() {
		return (EAttribute) locationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocation_SubLocations() {
		return (EReference) locationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocation_LegalAgeLimit() {
		return (EAttribute) locationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLocation__Equals__Location() {
		return locationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractTime() {
		return abstractTimeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeInterval() {
		return timeIntervalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeInterval_Start() {
		return (EReference) timeIntervalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeInterval_End() {
		return (EReference) timeIntervalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTimeInterval__IsTypeDefinedWithOtherType__TimePreposition_TimePreposition() {
		return timeIntervalEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTimeInterval__IsTypeForbidden__TimePreposition() {
		return timeIntervalEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTimeInterval__IsValid__TimePreposition_TimePreposition() {
		return timeIntervalEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTimeInterval__AfterStatementBeforeBeforeStatement__DiagnosticChain_Map() {
		return timeIntervalEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTimeInterval__UntilTypeShouldBeDefinedAlone__DiagnosticChain_Map() {
		return timeIntervalEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTimeInterval__FromStatementBeforeToStatement__DiagnosticChain_Map() {
		return timeIntervalEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTimeInterval__OnlyFromOrFromWithTo__DiagnosticChain_Map() {
		return timeIntervalEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTimeInterval__OnlyAfterOrAfterWithBefore__DiagnosticChain_Map() {
		return timeIntervalEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTimeInterval__AtTypeShouldBeDefinedAlone__DiagnosticChain_Map() {
		return timeIntervalEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeStatement() {
		return timeStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeStatement_Preposition() {
		return (EAttribute) timeStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeStatement_DateTime() {
		return (EAttribute) timeStatementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPurpose() {
		return purposeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPurpose_ProcessingReason() {
		return (EAttribute) purposeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPurpose_ProcessingReasonSubtype() {
		return (EAttribute) purposeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPurpose_SubPurposes() {
		return (EReference) purposeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPurpose_Details() {
		return (EAttribute) purposeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPurpose__IsValid__Purpose() {
		return purposeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPurpose__IsSubPurposeValid__ProcessingReason_EList() {
		return purposeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPurpose__ContainsAllowedPurposeReasonAndSubreason__ProcessingReason_EList() {
		return purposeEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPurpose__PublicHealthShouldNotContainSubReason__DiagnosticChain_Map() {
		return purposeEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPurpose__LegitimateInterestsNotContainSubReason__DiagnosticChain_Map() {
		return purposeEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPurpose__StopProcessingInterestShouldNotContainSubReason__DiagnosticChain_Map() {
		return purposeEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPurpose__ProfilingShouldNotContainSubReason__DiagnosticChain_Map() {
		return purposeEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPurpose__MarketingShouldNotContainSubReason__DiagnosticChain_Map() {
		return purposeEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPurpose__OutOfScopeCannotContainsThisSubReason__DiagnosticChain_Map() {
		return purposeEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPurpose__ExercisingSpecificRightsPurposesCannotContainsThisSubReason__DiagnosticChain_Map() {
		return purposeEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPurpose__ProtectTheVitalInterestsOfTheDataSubjectCannotContainsThisSubReason__DiagnosticChain_Map() {
		return purposeEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPurpose__PublicInterestCannotContainsThisSubReason__DiagnosticChain_Map() {
		return purposeEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPurpose__ResearchCannotContainsThisSubReason__DiagnosticChain_Map() {
		return purposeEClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPurpose__StatisticalPurposesShouldNotContainSubReason__DiagnosticChain_Map() {
		return purposeEClass.getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPurpose__TestingShouldNotContainSubReason__DiagnosticChain_Map() {
		return purposeEClass.getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWhat() {
		return whatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWhat_Actions() {
		return (EAttribute) whatEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWhat_Providers() {
		return (EReference) whatEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWhat_Datas() {
		return (EReference) whatEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHow() {
		return howEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHow_Documents() {
		return (EReference) howEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHow_Consent() {
		return (EReference) howEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHow__IsConsentValid__How() {
		return howEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConsent() {
		return consentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConsent_Format() {
		return (EAttribute) consentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConsent_Type() {
		return (EAttribute) consentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfigurationManager() {
		return configurationManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfigurationManager_DataSources() {
		return (EAttribute) configurationManagerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfigurationManager_ProtectionControlMethods() {
		return (EAttribute) configurationManagerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComplaint() {
		return complaintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComplaint_Who() {
		return (EReference) complaintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComplaint_When() {
		return (EAttribute) complaintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComplaint_Reason() {
		return (EAttribute) complaintEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComplaint_Action() {
		return (EReference) complaintEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getComplaint__DoesPolicyStatementExists__Action_ComplaintBasedOnDataType() {
		return complaintEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getComplaint__CannotIdentifyDataFromComplaint__DiagnosticChain_Map() {
		return complaintEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getComplaint__StopProcessingShouldBeExecutedAsSoonAsPossible__DiagnosticChain_Map() {
		return complaintEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getComplaint__UserDoesntHavePermissionToWithdrawConsent__DiagnosticChain_Map() {
		return complaintEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getComplaint__ErasureShouldBeExecutedAsSoonAsPossible__DiagnosticChain_Map() {
		return complaintEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getComplaint__SubjectShouldBeNotifiedAboutExistingComplaintForErasure__DiagnosticChain_Map() {
		return complaintEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getComplaint__RectificationShouldBeExecutedAsSoonAsPossible__DiagnosticChain_Map() {
		return complaintEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getComplaint__InvalidTypeOfPurposeForAnObject__DiagnosticChain_Map() {
		return complaintEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getComplaint__UserDoesntHavePermissionToComplaint__DiagnosticChain_Map() {
		return complaintEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getComplaint__SubjectShouldBeNotifiedAboutWithdraw__DiagnosticChain_Map() {
		return complaintEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getComplaint__SubjectShouldBeNotifiedAboutExistingComplaintForRectification__DiagnosticChain_Map() {
		return complaintEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrivacyPolicyHelper() {
		return privacyPolicyHelperEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrivacyPolicyHelper__IsPolicyControlValid__String() {
		return privacyPolicyHelperEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrivacyPolicyHelper__IsDataSourceValid__String() {
		return privacyPolicyHelperEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrivacyPolicyHelper__AreIntervalsOverlap__AbstractTime_AbstractTime() {
		return privacyPolicyHelperEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrivacyPolicyHelper__AreDatesOverlap__AbstractTime_Date() {
		return privacyPolicyHelperEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrivacyPolicyHelper__DoesIntervalStartBeforeInterval__AbstractTime_AbstractTime() {
		return privacyPolicyHelperEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrivacyPolicyHelper__IsDateBeforeInterval__AbstractTime_Date() {
		return privacyPolicyHelperEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrivacyPolicyHelper__IsDateAfterInterval__AbstractTime_Date() {
		return privacyPolicyHelperEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrivacyPolicyHelper__IsDateInInterval__AbstractTime_Date() {
		return privacyPolicyHelperEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWhere() {
		return whereEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWhere_Source() {
		return (EReference) whereEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWhere_Destination() {
		return (EReference) whereEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getWhere__Equals__Where() {
		return whereEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocument() {
		return documentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocument_DocumentType() {
		return (EAttribute) documentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractPaper() {
		return abstractPaperEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractPaper_ProvidedBy() {
		return (EReference) abstractPaperEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractPaper_TerminationExplanation() {
		return (EAttribute) abstractPaperEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractPaper_StartDate() {
		return (EAttribute) abstractPaperEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractPaper_TerminationDate() {
		return (EAttribute) abstractPaperEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractPaper_Location() {
		return (EAttribute) abstractPaperEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractPaper_Description() {
		return (EAttribute) abstractPaperEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractPaper__StartDateShouldBeBeforeTerminationDate__DiagnosticChain_Map() {
		return abstractPaperEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractComplaintAction() {
		return abstractComplaintActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWithdraw() {
		return withdrawEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWithdraw_Subject() {
		return (EReference) withdrawEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComplaintBasedOnData() {
		return complaintBasedOnDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComplaintBasedOnData_Subject() {
		return (EReference) complaintBasedOnDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComplaintBasedOnData_Type() {
		return (EAttribute) complaintBasedOnDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSharedPrivacyData() {
		return sharedPrivacyDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSharedPrivacyData_AdditionalProtectionControls() {
		return (EAttribute) sharedPrivacyDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSharedPrivacyData_Privacydata() {
		return (EReference) sharedPrivacyDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSharedPrivacyData_ColllectedFromSubject() {
		return (EAttribute) sharedPrivacyDataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSharedPrivacyData_DataSource() {
		return (EAttribute) sharedPrivacyDataEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSharedPrivacyData__ProtectionControlShouldExistsInConfiguration__DiagnosticChain_Map() {
		return sharedPrivacyDataEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSharedPrivacyData__DataSourceShouldExistsInConfiguration__DiagnosticChain_Map() {
		return sharedPrivacyDataEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDenial() {
		return denialEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDenial_When() {
		return (EAttribute) denialEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDenial_ApprovedBy() {
		return (EReference) denialEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDenial_Reason() {
		return (EAttribute) denialEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDenial_BasedOnStatements() {
		return (EReference) denialEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNotification() {
		return notificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNotification_Type() {
		return (EAttribute) notificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNotification_Notifiers() {
		return (EReference) notificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNotification_Receivers() {
		return (EReference) notificationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNotification_CausedBy() {
		return (EReference) notificationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNotification_When() {
		return (EAttribute) notificationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNotification__ShouldDefineCausedByAsErasure__DiagnosticChain_Map() {
		return notificationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNotification__ShouldDefineCausedByAsPrivacyPolicy__DiagnosticChain_Map() {
		return notificationEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNotification__ShouldDefineCausedByAsWithdraw__DiagnosticChain_Map() {
		return notificationEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNotification__ShouldDefineCausedByAsRectification__DiagnosticChain_Map() {
		return notificationEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNotificationInfo() {
		return notificationInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractComplaint() {
		return abstractComplaintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractComplaint_Status() {
		return (EAttribute) abstractComplaintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractComplaint_DenialReason() {
		return (EReference) abstractComplaintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComplaintBasedOnAction() {
		return complaintBasedOnActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComplaintBasedOnAction_Statement() {
		return (EReference) complaintBasedOnActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDataType() {
		return dataTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDocumentType() {
		return documentTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTimePreposition() {
		return timePrepositionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPrincipalType() {
		return principalTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPrincipalScope() {
		return principalScopeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAction() {
		return actionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLocationType() {
		return locationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getProcessingReason() {
		return processingReasonEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getProcessingReasonSubtype() {
		return processingReasonSubtypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getConsentFormat() {
		return consentFormatEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getConsentType() {
		return consentTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getComplaintBasedOnDataType() {
		return complaintBasedOnDataTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getNotificationType() {
		return notificationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getComplaintStatus() {
		return complaintStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrivacyModelFactory getPrivacyModelFactory() {
		return (PrivacyModelFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		privacyPolicyEClass = createEClass(PRIVACY_POLICY);
		createEReference(privacyPolicyEClass, PRIVACY_POLICY__POLICY_STATEMENTS);
		createEReference(privacyPolicyEClass, PRIVACY_POLICY__OWNER);
		createEReference(privacyPolicyEClass, PRIVACY_POLICY__ALL_PRINCIPALS);
		createEReference(privacyPolicyEClass, PRIVACY_POLICY__LOCATIONS);
		createEAttribute(privacyPolicyEClass, PRIVACY_POLICY__DEFAULT_PROTECTION_CONTROLS);
		createEReference(privacyPolicyEClass, PRIVACY_POLICY__ALL_SERVICES);
		createEReference(privacyPolicyEClass, PRIVACY_POLICY__ALL_PROVIDERS);
		createEReference(privacyPolicyEClass, PRIVACY_POLICY__CONFIGURATION_MANAGER);
		createEReference(privacyPolicyEClass, PRIVACY_POLICY__ALL_DATAS);
		createEReference(privacyPolicyEClass, PRIVACY_POLICY__ALL_COMPLAINTS);
		createEReference(privacyPolicyEClass, PRIVACY_POLICY__PRIVACY_POLICY_HELPER);
		createEReference(privacyPolicyEClass, PRIVACY_POLICY__ALL_DENIALS);
		createEReference(privacyPolicyEClass, PRIVACY_POLICY__ALL_CONSENTS);
		createEReference(privacyPolicyEClass, PRIVACY_POLICY__ALL_DOCUMENTS);
		createEReference(privacyPolicyEClass, PRIVACY_POLICY__NOTIFICATIONS);
		createEReference(privacyPolicyEClass, PRIVACY_POLICY__ALL_SHARED_PRIVACY_DATA);
		createEOperation(privacyPolicyEClass, PRIVACY_POLICY___UNIQUE_PROVIDER_NAME__DIAGNOSTICCHAIN_MAP);
		createEOperation(privacyPolicyEClass, PRIVACY_POLICY___UNIQUE_CONSENT_NAME__DIAGNOSTICCHAIN_MAP);
		createEOperation(privacyPolicyEClass, PRIVACY_POLICY___UNIQUE_SERVICE_NAME__DIAGNOSTICCHAIN_MAP);
		createEOperation(privacyPolicyEClass, PRIVACY_POLICY___OWNER_SHOULD_HAVE_DEFINED_INHABITS__DIAGNOSTICCHAIN_MAP);
		createEOperation(privacyPolicyEClass, PRIVACY_POLICY___UNIQUE_POLICY_STATEMENT_NAME__DIAGNOSTICCHAIN_MAP);
		createEOperation(privacyPolicyEClass,
				PRIVACY_POLICY___PROTECTION_CONTROL_SHOULD_EXISTS_IN_CONFIGURATION__DIAGNOSTICCHAIN_MAP);
		createEOperation(privacyPolicyEClass, PRIVACY_POLICY___UNIQUE_PRIVACY_DATA_NAME__DIAGNOSTICCHAIN_MAP);
		createEOperation(privacyPolicyEClass, PRIVACY_POLICY___UNIQUE_DOCUMENT_NAME__DIAGNOSTICCHAIN_MAP);
		createEOperation(privacyPolicyEClass, PRIVACY_POLICY___UNIQUE_LOCATION_PER_TYPE__DIAGNOSTICCHAIN_MAP);
		createEOperation(privacyPolicyEClass, PRIVACY_POLICY___UNIQUE_PRINCIPAL_NAME_PER_TYPE__DIAGNOSTICCHAIN_MAP);
		createEOperation(privacyPolicyEClass, PRIVACY_POLICY___UNIQUE_COMPLAINT_NAME__DIAGNOSTICCHAIN_MAP);

		policyStatementEClass = createEClass(POLICY_STATEMENT);
		createEReference(policyStatementEClass, POLICY_STATEMENT__WHEN);
		createEReference(policyStatementEClass, POLICY_STATEMENT__WHO);
		createEReference(policyStatementEClass, POLICY_STATEMENT__WHY);
		createEReference(policyStatementEClass, POLICY_STATEMENT__WHAT);
		createEReference(policyStatementEClass, POLICY_STATEMENT__HOW);
		createEReference(policyStatementEClass, POLICY_STATEMENT__WHOSE);
		createEReference(policyStatementEClass, POLICY_STATEMENT__WHOM);
		createEReference(policyStatementEClass, POLICY_STATEMENT__WHERE);
		createEReference(policyStatementEClass, POLICY_STATEMENT__CAUSED_BY);
		createEOperation(policyStatementEClass, POLICY_STATEMENT___DATE_SHOULD_BE_DEFINED_FOR_TYPE__ACTION);
		createEOperation(policyStatementEClass, POLICY_STATEMENT___CAUSED_BY_SHOULD_BE_DEFINED_FOR_TYPE__ACTION);
		createEOperation(policyStatementEClass,
				POLICY_STATEMENT___DOCUMENT_IS_NEEDED_FOR_PURPOSE__DOCUMENTTYPE_PROCESSINGREASON);
		createEOperation(policyStatementEClass,
				POLICY_STATEMENT___SUBJECT_SHOULD_BE_NOTIFIED_ABOUT_TRANSFER_TO_THIRD_COUNTRY__DIAGNOSTICCHAIN_MAP);
		createEOperation(policyStatementEClass,
				POLICY_STATEMENT___SUBJECT_SHOULD_BE_NOTIFIED_ABOUT_EXECUTED_RECTIFICATION__DIAGNOSTICCHAIN_MAP);
		createEOperation(policyStatementEClass,
				POLICY_STATEMENT___SUBJECT_SHOULD_BE_NOTIFIED_ABOUT_STOP_PROCESSING__DIAGNOSTICCHAIN_MAP);
		createEOperation(policyStatementEClass,
				POLICY_STATEMENT___CONTROLLER_APPROVAL_IS_NEED_FOR_PROTECT_THE_VITAL_INTERESTS_OF_THE_DATA_SUBJECT_PURPOSE__DIAGNOSTICCHAIN_MAP);
		createEOperation(policyStatementEClass, POLICY_STATEMENT___MISSING_CONSENT_FOR_COLLECTING__DIAGNOSTICCHAIN_MAP);
		createEOperation(policyStatementEClass, POLICY_STATEMENT___EXPIRED_CONSENT__DIAGNOSTICCHAIN_MAP);
		createEOperation(policyStatementEClass,
				POLICY_STATEMENT___STOP_PROCESSING_PURPOSE_FOR_ACTION_STOP_PROCESSING__DIAGNOSTICCHAIN_MAP);
		createEOperation(policyStatementEClass, POLICY_STATEMENT___WITHDRAWED_CONSENT__DIAGNOSTICCHAIN_MAP);
		createEOperation(policyStatementEClass,
				POLICY_STATEMENT___PROCESSING_OF_SPECIAL_CATEGORIES__DIAGNOSTICCHAIN_MAP);
		createEOperation(policyStatementEClass,
				POLICY_STATEMENT___SUBJECT_SHOULD_BE_NOTIFIED_ABOUT_COLLECTING__DIAGNOSTICCHAIN_MAP);
		createEOperation(policyStatementEClass,
				POLICY_STATEMENT___DATE_SHOUD_BE_DEFINED_FOR_STORE_ACTION__DIAGNOSTICCHAIN_MAP);
		createEOperation(policyStatementEClass,
				POLICY_STATEMENT___COURT_APPROVAL_IS_NEED_FOR_PUBLIC_INTEREST_PURPOSE__DIAGNOSTICCHAIN_MAP);
		createEOperation(policyStatementEClass,
				POLICY_STATEMENT___CONTROLLER_APPROVAL_IS_NEED_FOR_LEGITIMATE_INTERESTS_PURPOSE__DIAGNOSTICCHAIN_MAP);
		createEOperation(policyStatementEClass,
				POLICY_STATEMENT___DATE_SHOUD_BE_DEFINED_FOR_ACCESS_ACTION__DIAGNOSTICCHAIN_MAP);
		createEOperation(policyStatementEClass, POLICY_STATEMENT___EXPIRED_CONSENT_FOR_COLLECTING__DIAGNOSTICCHAIN_MAP);
		createEOperation(policyStatementEClass,
				POLICY_STATEMENT___CAUSED_BY_SHOULD_BE_DEFINED_FOR_STOP_PROCESSING_ACTION__DIAGNOSTICCHAIN_MAP);
		createEOperation(policyStatementEClass,
				POLICY_STATEMENT___JUVENILE_DATA_SHOULD_BE_USED_WITH_DOCUMENT_OF_TYPE_CHILD_CUSTODY_PROVIDED_BY_RESPONSIBLE_PERSON__DIAGNOSTICCHAIN_MAP);
		createEOperation(policyStatementEClass,
				POLICY_STATEMENT___MISSING_CONSENT_OR_TRANSFER_CERTIFICATE__DIAGNOSTICCHAIN_MAP);
		createEOperation(policyStatementEClass, POLICY_STATEMENT___UNDEFINED_PURPOSE_FOR_ACTION__DIAGNOSTICCHAIN_MAP);
		createEOperation(policyStatementEClass,
				POLICY_STATEMENT___CAUSED_BY_SHOULD_BE_DEFINED_FOR_RECTIFICATION_ACTION__DIAGNOSTICCHAIN_MAP);
		createEOperation(policyStatementEClass, POLICY_STATEMENT___EXPIRED_DOCUMENT__DIAGNOSTICCHAIN_MAP);
		createEOperation(policyStatementEClass, POLICY_STATEMENT___MISSING_CONSENT_FOR_TRANSFER__DIAGNOSTICCHAIN_MAP);
		createEOperation(policyStatementEClass,
				POLICY_STATEMENT___CAUSED_BY_SHOULD_BE_DEFINED_FOR_ERASURE_ACTION__DIAGNOSTICCHAIN_MAP);
		createEOperation(policyStatementEClass,
				POLICY_STATEMENT___SUBJECT_SHOULD_BE_NOTIFIED_ABOUT_EXECUTED_ERASURE__DIAGNOSTICCHAIN_MAP);
		createEOperation(policyStatementEClass,
				POLICY_STATEMENT___WHOM_SHOULD_BE_DEFINED_FOR_TRANSFER__DIAGNOSTICCHAIN_MAP);

		privacyDataEClass = createEClass(PRIVACY_DATA);
		createEAttribute(privacyDataEClass, PRIVACY_DATA__TYPE);

		serviceEClass = createEClass(SERVICE);
		createEReference(serviceEClass, SERVICE__SUBSERVICES);

		providerEClass = createEClass(PROVIDER);
		createEReference(providerEClass, PROVIDER__PROVIDE);
		createEReference(providerEClass, PROVIDER__LOCATED);

		principalEClass = createEClass(PRINCIPAL);
		createEReference(principalEClass, PRINCIPAL__SUB_PRINCIPALS);
		createEAttribute(principalEClass, PRINCIPAL__TYPE);
		createEAttribute(principalEClass, PRINCIPAL__SCOPE);
		createEReference(principalEClass, PRINCIPAL__RESPONSIBLE_PERSONS);
		createEReference(principalEClass, PRINCIPAL__INHABITS);
		createEAttribute(principalEClass, PRINCIPAL__BIRTHDATE);
		createEAttribute(principalEClass, PRINCIPAL__AGE);
		createEOperation(principalEClass, PRINCIPAL___EQUALS__PRINCIPAL);
		createEOperation(principalEClass,
				PRINCIPAL___NATURAL_PERSON_CAN_NOT_CONATAINS_SUB_PRINCIPALS__DIAGNOSTICCHAIN_MAP);
		createEOperation(principalEClass, PRINCIPAL___JUVENILE_SHOULD_HAVE_RESPONSIBLE_PERSON__DIAGNOSTICCHAIN_MAP);

		locationEClass = createEClass(LOCATION);
		createEAttribute(locationEClass, LOCATION__IS_EU_MEMBER);
		createEAttribute(locationEClass, LOCATION__TYPE);
		createEReference(locationEClass, LOCATION__SUB_LOCATIONS);
		createEAttribute(locationEClass, LOCATION__LEGAL_AGE_LIMIT);
		createEOperation(locationEClass, LOCATION___EQUALS__LOCATION);

		abstractTimeEClass = createEClass(ABSTRACT_TIME);

		timeIntervalEClass = createEClass(TIME_INTERVAL);
		createEReference(timeIntervalEClass, TIME_INTERVAL__START);
		createEReference(timeIntervalEClass, TIME_INTERVAL__END);
		createEOperation(timeIntervalEClass,
				TIME_INTERVAL___IS_TYPE_DEFINED_WITH_OTHER_TYPE__TIMEPREPOSITION_TIMEPREPOSITION);
		createEOperation(timeIntervalEClass, TIME_INTERVAL___IS_TYPE_FORBIDDEN__TIMEPREPOSITION);
		createEOperation(timeIntervalEClass, TIME_INTERVAL___IS_VALID__TIMEPREPOSITION_TIMEPREPOSITION);
		createEOperation(timeIntervalEClass,
				TIME_INTERVAL___AFTER_STATEMENT_BEFORE_BEFORE_STATEMENT__DIAGNOSTICCHAIN_MAP);
		createEOperation(timeIntervalEClass, TIME_INTERVAL___UNTIL_TYPE_SHOULD_BE_DEFINED_ALONE__DIAGNOSTICCHAIN_MAP);
		createEOperation(timeIntervalEClass, TIME_INTERVAL___FROM_STATEMENT_BEFORE_TO_STATEMENT__DIAGNOSTICCHAIN_MAP);
		createEOperation(timeIntervalEClass, TIME_INTERVAL___ONLY_FROM_OR_FROM_WITH_TO__DIAGNOSTICCHAIN_MAP);
		createEOperation(timeIntervalEClass, TIME_INTERVAL___ONLY_AFTER_OR_AFTER_WITH_BEFORE__DIAGNOSTICCHAIN_MAP);
		createEOperation(timeIntervalEClass, TIME_INTERVAL___AT_TYPE_SHOULD_BE_DEFINED_ALONE__DIAGNOSTICCHAIN_MAP);

		timeStatementEClass = createEClass(TIME_STATEMENT);
		createEAttribute(timeStatementEClass, TIME_STATEMENT__PREPOSITION);
		createEAttribute(timeStatementEClass, TIME_STATEMENT__DATE_TIME);

		purposeEClass = createEClass(PURPOSE);
		createEAttribute(purposeEClass, PURPOSE__PROCESSING_REASON);
		createEAttribute(purposeEClass, PURPOSE__PROCESSING_REASON_SUBTYPE);
		createEReference(purposeEClass, PURPOSE__SUB_PURPOSES);
		createEAttribute(purposeEClass, PURPOSE__DETAILS);
		createEOperation(purposeEClass, PURPOSE___IS_VALID__PURPOSE);
		createEOperation(purposeEClass, PURPOSE___IS_SUB_PURPOSE_VALID__PROCESSINGREASON_ELIST);
		createEOperation(purposeEClass,
				PURPOSE___CONTAINS_ALLOWED_PURPOSE_REASON_AND_SUBREASON__PROCESSINGREASON_ELIST);
		createEOperation(purposeEClass, PURPOSE___PUBLIC_HEALTH_SHOULD_NOT_CONTAIN_SUB_REASON__DIAGNOSTICCHAIN_MAP);
		createEOperation(purposeEClass, PURPOSE___LEGITIMATE_INTERESTS_NOT_CONTAIN_SUB_REASON__DIAGNOSTICCHAIN_MAP);
		createEOperation(purposeEClass,
				PURPOSE___STOP_PROCESSING_INTEREST_SHOULD_NOT_CONTAIN_SUB_REASON__DIAGNOSTICCHAIN_MAP);
		createEOperation(purposeEClass, PURPOSE___PROFILING_SHOULD_NOT_CONTAIN_SUB_REASON__DIAGNOSTICCHAIN_MAP);
		createEOperation(purposeEClass, PURPOSE___MARKETING_SHOULD_NOT_CONTAIN_SUB_REASON__DIAGNOSTICCHAIN_MAP);
		createEOperation(purposeEClass, PURPOSE___OUT_OF_SCOPE_CANNOT_CONTAINS_THIS_SUB_REASON__DIAGNOSTICCHAIN_MAP);
		createEOperation(purposeEClass,
				PURPOSE___EXERCISING_SPECIFIC_RIGHTS_PURPOSES_CANNOT_CONTAINS_THIS_SUB_REASON__DIAGNOSTICCHAIN_MAP);
		createEOperation(purposeEClass,
				PURPOSE___PROTECT_THE_VITAL_INTERESTS_OF_THE_DATA_SUBJECT_CANNOT_CONTAINS_THIS_SUB_REASON__DIAGNOSTICCHAIN_MAP);
		createEOperation(purposeEClass, PURPOSE___PUBLIC_INTEREST_CANNOT_CONTAINS_THIS_SUB_REASON__DIAGNOSTICCHAIN_MAP);
		createEOperation(purposeEClass, PURPOSE___RESEARCH_CANNOT_CONTAINS_THIS_SUB_REASON__DIAGNOSTICCHAIN_MAP);
		createEOperation(purposeEClass,
				PURPOSE___STATISTICAL_PURPOSES_SHOULD_NOT_CONTAIN_SUB_REASON__DIAGNOSTICCHAIN_MAP);
		createEOperation(purposeEClass, PURPOSE___TESTING_SHOULD_NOT_CONTAIN_SUB_REASON__DIAGNOSTICCHAIN_MAP);

		whatEClass = createEClass(WHAT);
		createEAttribute(whatEClass, WHAT__ACTIONS);
		createEReference(whatEClass, WHAT__PROVIDERS);
		createEReference(whatEClass, WHAT__DATAS);

		howEClass = createEClass(HOW);
		createEReference(howEClass, HOW__DOCUMENTS);
		createEReference(howEClass, HOW__CONSENT);
		createEOperation(howEClass, HOW___IS_CONSENT_VALID__HOW);

		consentEClass = createEClass(CONSENT);
		createEAttribute(consentEClass, CONSENT__FORMAT);
		createEAttribute(consentEClass, CONSENT__TYPE);

		configurationManagerEClass = createEClass(CONFIGURATION_MANAGER);
		createEAttribute(configurationManagerEClass, CONFIGURATION_MANAGER__DATA_SOURCES);
		createEAttribute(configurationManagerEClass, CONFIGURATION_MANAGER__PROTECTION_CONTROL_METHODS);

		complaintEClass = createEClass(COMPLAINT);
		createEReference(complaintEClass, COMPLAINT__WHO);
		createEAttribute(complaintEClass, COMPLAINT__WHEN);
		createEAttribute(complaintEClass, COMPLAINT__REASON);
		createEReference(complaintEClass, COMPLAINT__ACTION);
		createEOperation(complaintEClass, COMPLAINT___DOES_POLICY_STATEMENT_EXISTS__ACTION_COMPLAINTBASEDONDATATYPE);
		createEOperation(complaintEClass, COMPLAINT___CANNOT_IDENTIFY_DATA_FROM_COMPLAINT__DIAGNOSTICCHAIN_MAP);
		createEOperation(complaintEClass,
				COMPLAINT___STOP_PROCESSING_SHOULD_BE_EXECUTED_AS_SOON_AS_POSSIBLE__DIAGNOSTICCHAIN_MAP);
		createEOperation(complaintEClass,
				COMPLAINT___USER_DOESNT_HAVE_PERMISSION_TO_WITHDRAW_CONSENT__DIAGNOSTICCHAIN_MAP);
		createEOperation(complaintEClass,
				COMPLAINT___ERASURE_SHOULD_BE_EXECUTED_AS_SOON_AS_POSSIBLE__DIAGNOSTICCHAIN_MAP);
		createEOperation(complaintEClass,
				COMPLAINT___SUBJECT_SHOULD_BE_NOTIFIED_ABOUT_EXISTING_COMPLAINT_FOR_ERASURE__DIAGNOSTICCHAIN_MAP);
		createEOperation(complaintEClass,
				COMPLAINT___RECTIFICATION_SHOULD_BE_EXECUTED_AS_SOON_AS_POSSIBLE__DIAGNOSTICCHAIN_MAP);
		createEOperation(complaintEClass, COMPLAINT___INVALID_TYPE_OF_PURPOSE_FOR_AN_OBJECT__DIAGNOSTICCHAIN_MAP);
		createEOperation(complaintEClass, COMPLAINT___USER_DOESNT_HAVE_PERMISSION_TO_COMPLAINT__DIAGNOSTICCHAIN_MAP);
		createEOperation(complaintEClass, COMPLAINT___SUBJECT_SHOULD_BE_NOTIFIED_ABOUT_WITHDRAW__DIAGNOSTICCHAIN_MAP);
		createEOperation(complaintEClass,
				COMPLAINT___SUBJECT_SHOULD_BE_NOTIFIED_ABOUT_EXISTING_COMPLAINT_FOR_RECTIFICATION__DIAGNOSTICCHAIN_MAP);

		privacyPolicyHelperEClass = createEClass(PRIVACY_POLICY_HELPER);
		createEOperation(privacyPolicyHelperEClass, PRIVACY_POLICY_HELPER___IS_POLICY_CONTROL_VALID__STRING);
		createEOperation(privacyPolicyHelperEClass, PRIVACY_POLICY_HELPER___IS_DATA_SOURCE_VALID__STRING);
		createEOperation(privacyPolicyHelperEClass,
				PRIVACY_POLICY_HELPER___ARE_INTERVALS_OVERLAP__ABSTRACTTIME_ABSTRACTTIME);
		createEOperation(privacyPolicyHelperEClass, PRIVACY_POLICY_HELPER___ARE_DATES_OVERLAP__ABSTRACTTIME_DATE);
		createEOperation(privacyPolicyHelperEClass,
				PRIVACY_POLICY_HELPER___DOES_INTERVAL_START_BEFORE_INTERVAL__ABSTRACTTIME_ABSTRACTTIME);
		createEOperation(privacyPolicyHelperEClass, PRIVACY_POLICY_HELPER___IS_DATE_BEFORE_INTERVAL__ABSTRACTTIME_DATE);
		createEOperation(privacyPolicyHelperEClass, PRIVACY_POLICY_HELPER___IS_DATE_AFTER_INTERVAL__ABSTRACTTIME_DATE);
		createEOperation(privacyPolicyHelperEClass, PRIVACY_POLICY_HELPER___IS_DATE_IN_INTERVAL__ABSTRACTTIME_DATE);

		whereEClass = createEClass(WHERE);
		createEReference(whereEClass, WHERE__SOURCE);
		createEReference(whereEClass, WHERE__DESTINATION);
		createEOperation(whereEClass, WHERE___EQUALS__WHERE);

		documentEClass = createEClass(DOCUMENT);
		createEAttribute(documentEClass, DOCUMENT__DOCUMENT_TYPE);

		abstractPaperEClass = createEClass(ABSTRACT_PAPER);
		createEReference(abstractPaperEClass, ABSTRACT_PAPER__PROVIDED_BY);
		createEAttribute(abstractPaperEClass, ABSTRACT_PAPER__TERMINATION_EXPLANATION);
		createEAttribute(abstractPaperEClass, ABSTRACT_PAPER__START_DATE);
		createEAttribute(abstractPaperEClass, ABSTRACT_PAPER__TERMINATION_DATE);
		createEAttribute(abstractPaperEClass, ABSTRACT_PAPER__LOCATION);
		createEAttribute(abstractPaperEClass, ABSTRACT_PAPER__DESCRIPTION);
		createEOperation(abstractPaperEClass,
				ABSTRACT_PAPER___START_DATE_SHOULD_BE_BEFORE_TERMINATION_DATE__DIAGNOSTICCHAIN_MAP);

		abstractComplaintActionEClass = createEClass(ABSTRACT_COMPLAINT_ACTION);

		withdrawEClass = createEClass(WITHDRAW);
		createEReference(withdrawEClass, WITHDRAW__SUBJECT);

		complaintBasedOnDataEClass = createEClass(COMPLAINT_BASED_ON_DATA);
		createEReference(complaintBasedOnDataEClass, COMPLAINT_BASED_ON_DATA__SUBJECT);
		createEAttribute(complaintBasedOnDataEClass, COMPLAINT_BASED_ON_DATA__TYPE);

		sharedPrivacyDataEClass = createEClass(SHARED_PRIVACY_DATA);
		createEAttribute(sharedPrivacyDataEClass, SHARED_PRIVACY_DATA__ADDITIONAL_PROTECTION_CONTROLS);
		createEReference(sharedPrivacyDataEClass, SHARED_PRIVACY_DATA__PRIVACYDATA);
		createEAttribute(sharedPrivacyDataEClass, SHARED_PRIVACY_DATA__COLLLECTED_FROM_SUBJECT);
		createEAttribute(sharedPrivacyDataEClass, SHARED_PRIVACY_DATA__DATA_SOURCE);
		createEOperation(sharedPrivacyDataEClass,
				SHARED_PRIVACY_DATA___PROTECTION_CONTROL_SHOULD_EXISTS_IN_CONFIGURATION__DIAGNOSTICCHAIN_MAP);
		createEOperation(sharedPrivacyDataEClass,
				SHARED_PRIVACY_DATA___DATA_SOURCE_SHOULD_EXISTS_IN_CONFIGURATION__DIAGNOSTICCHAIN_MAP);

		denialEClass = createEClass(DENIAL);
		createEAttribute(denialEClass, DENIAL__WHEN);
		createEReference(denialEClass, DENIAL__APPROVED_BY);
		createEAttribute(denialEClass, DENIAL__REASON);
		createEReference(denialEClass, DENIAL__BASED_ON_STATEMENTS);

		notificationEClass = createEClass(NOTIFICATION);
		createEAttribute(notificationEClass, NOTIFICATION__TYPE);
		createEReference(notificationEClass, NOTIFICATION__NOTIFIERS);
		createEReference(notificationEClass, NOTIFICATION__RECEIVERS);
		createEReference(notificationEClass, NOTIFICATION__CAUSED_BY);
		createEAttribute(notificationEClass, NOTIFICATION__WHEN);
		createEOperation(notificationEClass, NOTIFICATION___SHOULD_DEFINE_CAUSED_BY_AS_ERASURE__DIAGNOSTICCHAIN_MAP);
		createEOperation(notificationEClass,
				NOTIFICATION___SHOULD_DEFINE_CAUSED_BY_AS_PRIVACY_POLICY__DIAGNOSTICCHAIN_MAP);
		createEOperation(notificationEClass, NOTIFICATION___SHOULD_DEFINE_CAUSED_BY_AS_WITHDRAW__DIAGNOSTICCHAIN_MAP);
		createEOperation(notificationEClass,
				NOTIFICATION___SHOULD_DEFINE_CAUSED_BY_AS_RECTIFICATION__DIAGNOSTICCHAIN_MAP);

		notificationInfoEClass = createEClass(NOTIFICATION_INFO);

		abstractComplaintEClass = createEClass(ABSTRACT_COMPLAINT);
		createEAttribute(abstractComplaintEClass, ABSTRACT_COMPLAINT__STATUS);
		createEReference(abstractComplaintEClass, ABSTRACT_COMPLAINT__DENIAL_REASON);

		complaintBasedOnActionEClass = createEClass(COMPLAINT_BASED_ON_ACTION);
		createEReference(complaintBasedOnActionEClass, COMPLAINT_BASED_ON_ACTION__STATEMENT);

		// Create enums
		dataTypeEEnum = createEEnum(DATA_TYPE);
		documentTypeEEnum = createEEnum(DOCUMENT_TYPE);
		timePrepositionEEnum = createEEnum(TIME_PREPOSITION);
		principalTypeEEnum = createEEnum(PRINCIPAL_TYPE);
		principalScopeEEnum = createEEnum(PRINCIPAL_SCOPE);
		actionEEnum = createEEnum(ACTION);
		locationTypeEEnum = createEEnum(LOCATION_TYPE);
		processingReasonEEnum = createEEnum(PROCESSING_REASON);
		processingReasonSubtypeEEnum = createEEnum(PROCESSING_REASON_SUBTYPE);
		consentFormatEEnum = createEEnum(CONSENT_FORMAT);
		consentTypeEEnum = createEEnum(CONSENT_TYPE);
		complaintBasedOnDataTypeEEnum = createEEnum(COMPLAINT_BASED_ON_DATA_TYPE);
		notificationTypeEEnum = createEEnum(NOTIFICATION_TYPE);
		complaintStatusEEnum = createEEnum(COMPLAINT_STATUS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		privacyPolicyEClass.getESuperTypes().add(this.getNamedElement());
		policyStatementEClass.getESuperTypes().add(this.getNotificationInfo());
		privacyDataEClass.getESuperTypes().add(this.getNamedElement());
		serviceEClass.getESuperTypes().add(this.getNamedElement());
		providerEClass.getESuperTypes().add(this.getNamedElement());
		principalEClass.getESuperTypes().add(this.getNamedElement());
		locationEClass.getESuperTypes().add(this.getNamedElement());
		timeIntervalEClass.getESuperTypes().add(this.getAbstractTime());
		timeStatementEClass.getESuperTypes().add(this.getAbstractTime());
		consentEClass.getESuperTypes().add(this.getAbstractPaper());
		complaintEClass.getESuperTypes().add(this.getNotificationInfo());
		documentEClass.getESuperTypes().add(this.getAbstractPaper());
		abstractPaperEClass.getESuperTypes().add(this.getNamedElement());
		withdrawEClass.getESuperTypes().add(this.getAbstractComplaintAction());
		complaintBasedOnDataEClass.getESuperTypes().add(this.getAbstractComplaint());
		sharedPrivacyDataEClass.getESuperTypes().add(this.getNamedElement());
		denialEClass.getESuperTypes().add(this.getNamedElement());
		notificationEClass.getESuperTypes().add(this.getNamedElement());
		notificationInfoEClass.getESuperTypes().add(this.getNamedElement());
		abstractComplaintEClass.getESuperTypes().add(this.getAbstractComplaintAction());
		complaintBasedOnActionEClass.getESuperTypes().add(this.getAbstractComplaint());

		// Initialize classes, features, and operations; add parameters
		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 1, 1, NamedElement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(privacyPolicyEClass, PrivacyPolicy.class, "PrivacyPolicy", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPrivacyPolicy_PolicyStatements(), this.getPolicyStatement(), null, "policyStatements", null,
				0, -1, PrivacyPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPrivacyPolicy_Owner(), this.getPrincipal(), null, "owner", null, 1, 1, PrivacyPolicy.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPrivacyPolicy_AllPrincipals(), this.getPrincipal(), null, "allPrincipals", null, 0, -1,
				PrivacyPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPrivacyPolicy_Locations(), this.getLocation(), null, "locations", null, 0, -1,
				PrivacyPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrivacyPolicy_DefaultProtectionControls(), ecorePackage.getEString(),
				"defaultProtectionControls", null, 0, -1, PrivacyPolicy.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPrivacyPolicy_AllServices(), this.getService(), null, "allServices", null, 0, -1,
				PrivacyPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPrivacyPolicy_AllProviders(), this.getProvider(), null, "allProviders", null, 0, -1,
				PrivacyPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPrivacyPolicy_ConfigurationManager(), this.getConfigurationManager(), null,
				"configurationManager", null, 1, 1, PrivacyPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPrivacyPolicy_AllDatas(), this.getPrivacyData(), null, "allDatas", null, 0, -1,
				PrivacyPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPrivacyPolicy_AllComplaints(), this.getComplaint(), null, "allComplaints", null, 0, -1,
				PrivacyPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPrivacyPolicy_PrivacyPolicyHelper(), this.getPrivacyPolicyHelper(), null,
				"privacyPolicyHelper", null, 1, 1, PrivacyPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPrivacyPolicy_AllDenials(), this.getDenial(), null, "allDenials", null, 0, -1,
				PrivacyPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPrivacyPolicy_AllConsents(), this.getConsent(), null, "allConsents", null, 0, -1,
				PrivacyPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPrivacyPolicy_AllDocuments(), this.getDocument(), null, "allDocuments", null, 0, -1,
				PrivacyPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPrivacyPolicy_Notifications(), this.getNotification(), null, "notifications", null, 0, -1,
				PrivacyPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPrivacyPolicy_AllSharedPrivacyData(), this.getSharedPrivacyData(), null,
				"allSharedPrivacyData", null, 0, -1, PrivacyPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getPrivacyPolicy__UniqueProviderName__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "UniqueProviderName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPrivacyPolicy__UniqueConsentName__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"UniqueConsentName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPrivacyPolicy__UniqueServiceName__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"UniqueServiceName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPrivacyPolicy__OwnerShouldHaveDefinedInhabits__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "OwnerShouldHaveDefinedInhabits", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPrivacyPolicy__UniquePolicyStatementName__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "UniquePolicyStatementName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPrivacyPolicy__ProtectionControlShouldExistsInConfiguration__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "ProtectionControlShouldExistsInConfiguration", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPrivacyPolicy__UniquePrivacyDataName__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"UniquePrivacyDataName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPrivacyPolicy__UniqueDocumentName__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"UniqueDocumentName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPrivacyPolicy__UniqueLocationPerType__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"UniqueLocationPerType", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPrivacyPolicy__UniquePrincipalNamePerType__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "UniquePrincipalNamePerType", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPrivacyPolicy__UniqueComplaintName__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"UniqueComplaintName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(policyStatementEClass, PolicyStatement.class, "PolicyStatement", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPolicyStatement_When(), this.getAbstractTime(), null, "when", null, 0, 1,
				PolicyStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPolicyStatement_Who(), this.getPrincipal(), null, "who", null, 1, 1, PolicyStatement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPolicyStatement_Why(), this.getPurpose(), null, "why", null, 1, 1, PolicyStatement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPolicyStatement_What(), this.getWhat(), null, "what", null, 1, 1, PolicyStatement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPolicyStatement_How(), this.getHow(), null, "how", null, 0, 1, PolicyStatement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPolicyStatement_Whose(), this.getPrincipal(), null, "whose", null, 0, 1,
				PolicyStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPolicyStatement_Whom(), this.getPrincipal(), null, "whom", null, 0, 1, PolicyStatement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPolicyStatement_Where(), this.getWhere(), null, "where", null, 0, 1, PolicyStatement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPolicyStatement_CausedBy(), this.getComplaint(), null, "causedBy", null, 0, 1,
				PolicyStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getPolicyStatement__DateShouldBeDefinedForType__Action(), ecorePackage.getEBoolean(),
				"dateShouldBeDefinedForType", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAction(), "actionType", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPolicyStatement__CausedByShouldBeDefinedForType__Action(), ecorePackage.getEBoolean(),
				"causedByShouldBeDefinedForType", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAction(), "actionType", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPolicyStatement__DocumentIsNeededForPurpose__DocumentType_ProcessingReason(),
				ecorePackage.getEBoolean(), "documentIsNeededForPurpose", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDocumentType(), "documentType", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getProcessingReason(), "processingReason", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getPolicyStatement__SubjectShouldBeNotifiedAboutTransferToThirdCountry__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "SubjectShouldBeNotifiedAboutTransferToThirdCountry", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getPolicyStatement__SubjectShouldBeNotifiedAboutExecutedRectification__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "SubjectShouldBeNotifiedAboutExecutedRectification", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPolicyStatement__SubjectShouldBeNotifiedAboutStopProcessing__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "SubjectShouldBeNotifiedAboutStopProcessing", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getPolicyStatement__ControllerApprovalIsNeedForProtectTheVitalInterestsOfTheDataSubjectPurpose__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(),
				"ControllerApprovalIsNeedForProtectTheVitalInterestsOfTheDataSubjectPurpose", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPolicyStatement__MissingConsentForCollecting__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "MissingConsentForCollecting", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPolicyStatement__ExpiredConsent__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"ExpiredConsent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPolicyStatement__StopProcessingPurposeForActionStopProcessing__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "StopProcessingPurposeForActionStopProcessing", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPolicyStatement__WithdrawedConsent__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"WithdrawedConsent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPolicyStatement__ProcessingOfSpecialCategories__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "ProcessingOfSpecialCategories", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPolicyStatement__SubjectShouldBeNotifiedAboutCollecting__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "SubjectShouldBeNotifiedAboutCollecting", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPolicyStatement__DateShoudBeDefinedForStoreAction__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "DateShoudBeDefinedForStoreAction", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPolicyStatement__CourtApprovalIsNeedForPublicInterestPurpose__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "CourtApprovalIsNeedForPublicInterestPurpose", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getPolicyStatement__ControllerApprovalIsNeedForLegitimateInterestsPurpose__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "ControllerApprovalIsNeedForLegitimateInterestsPurpose", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPolicyStatement__DateShoudBeDefinedForAccessAction__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "DateShoudBeDefinedForAccessAction", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPolicyStatement__ExpiredConsentForCollecting__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "ExpiredConsentForCollecting", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPolicyStatement__CausedByShouldBeDefinedForStopProcessingAction__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "CausedByShouldBeDefinedForStopProcessingAction", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getPolicyStatement__JuvenileDataShouldBeUsedWithDocumentOfTypeChildCustodyProvidedByResponsiblePerson__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(),
				"JuvenileDataShouldBeUsedWithDocumentOfTypeChildCustodyProvidedByResponsiblePerson", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPolicyStatement__MissingConsentOrTransferCertificate__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "MissingConsentOrTransferCertificate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPolicyStatement__UndefinedPurposeForAction__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "UndefinedPurposeForAction", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPolicyStatement__CausedByShouldBeDefinedForRectificationAction__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "CausedByShouldBeDefinedForRectificationAction", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPolicyStatement__ExpiredDocument__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"ExpiredDocument", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPolicyStatement__MissingConsentForTransfer__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "MissingConsentForTransfer", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPolicyStatement__CausedByShouldBeDefinedForErasureAction__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "CausedByShouldBeDefinedForErasureAction", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPolicyStatement__SubjectShouldBeNotifiedAboutExecutedErasure__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "SubjectShouldBeNotifiedAboutExecutedErasure", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPolicyStatement__WhomShouldBeDefinedForTransfer__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "WhomShouldBeDefinedForTransfer", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(privacyDataEClass, PrivacyData.class, "PrivacyData", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPrivacyData_Type(), this.getDataType(), "type", null, 1, 1, PrivacyData.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceEClass, Service.class, "Service", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getService_Subservices(), this.getService(), null, "subservices", null, 0, -1, Service.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(providerEClass, Provider.class, "Provider", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProvider_Provide(), this.getService(), null, "provide", null, 0, -1, Provider.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProvider_Located(), this.getLocation(), null, "located", null, 1, 1, Provider.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(principalEClass, Principal.class, "Principal", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPrincipal_SubPrincipals(), this.getPrincipal(), null, "subPrincipals", null, 0, -1,
				Principal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrincipal_Type(), this.getPrincipalType(), "type", null, 1, 1, Principal.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrincipal_Scope(), this.getPrincipalScope(), "scope", null, 1, 1, Principal.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPrincipal_ResponsiblePersons(), this.getPrincipal(), null, "responsiblePersons", null, 0, -1,
				Principal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPrincipal_Inhabits(), this.getLocation(), null, "inhabits", null, 0, 1, Principal.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrincipal_Birthdate(), ecorePackage.getEDate(), "birthdate", null, 0, 1, Principal.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrincipal_Age(), ecorePackage.getEInt(), "age", null, 1, 1, Principal.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		op = initEOperation(getPrincipal__Equals__Principal(), ecorePackage.getEBoolean(), "equals", 1, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, this.getPrincipal(), "observed", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPrincipal__NaturalPersonCanNotConatainsSubPrincipals__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "NaturalPersonCanNotConatainsSubPrincipals", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPrincipal__JuvenileShouldHaveResponsiblePerson__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "JuvenileShouldHaveResponsiblePerson", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(locationEClass, Location.class, "Location", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLocation_IsEUMember(), ecorePackage.getEBoolean(), "isEUMember", null, 1, 1, Location.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocation_Type(), this.getLocationType(), "type", null, 1, 1, Location.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLocation_SubLocations(), this.getLocation(), null, "subLocations", null, 0, -1,
				Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocation_LegalAgeLimit(), ecorePackage.getEInt(), "legalAgeLimit", "16", 1, 1, Location.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getLocation__Equals__Location(), ecorePackage.getEBoolean(), "equals", 1, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, this.getLocation(), "observed", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(abstractTimeEClass, AbstractTime.class, "AbstractTime", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(timeIntervalEClass, TimeInterval.class, "TimeInterval", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTimeInterval_Start(), this.getTimeStatement(), null, "start", null, 1, 1, TimeInterval.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimeInterval_End(), this.getTimeStatement(), null, "end", null, 1, 1, TimeInterval.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getTimeInterval__IsTypeDefinedWithOtherType__TimePreposition_TimePreposition(),
				ecorePackage.getEBoolean(), "isTypeDefinedWithOtherType", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTimePreposition(), "firstPrepositionType", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTimePreposition(), "secondPrepositionType", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTimeInterval__IsTypeForbidden__TimePreposition(), ecorePackage.getEBoolean(),
				"isTypeForbidden", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTimePreposition(), "prepositionType", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTimeInterval__IsValid__TimePreposition_TimePreposition(), ecorePackage.getEBoolean(),
				"isValid", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTimePreposition(), "firstPrepositionType", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTimePreposition(), "secondPrepositionType", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTimeInterval__AfterStatementBeforeBeforeStatement__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "AfterStatementBeforeBeforeStatement", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTimeInterval__UntilTypeShouldBeDefinedAlone__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "UntilTypeShouldBeDefinedAlone", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTimeInterval__FromStatementBeforeToStatement__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "FromStatementBeforeToStatement", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTimeInterval__OnlyFromOrFromWithTo__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"OnlyFromOrFromWithTo", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTimeInterval__OnlyAfterOrAfterWithBefore__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "OnlyAfterOrAfterWithBefore", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTimeInterval__AtTypeShouldBeDefinedAlone__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "AtTypeShouldBeDefinedAlone", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(timeStatementEClass, TimeStatement.class, "TimeStatement", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimeStatement_Preposition(), this.getTimePreposition(), "preposition", null, 1, 1,
				TimeStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeStatement_DateTime(), ecorePackage.getEDate(), "dateTime", null, 1, 1,
				TimeStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(purposeEClass, Purpose.class, "Purpose", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPurpose_ProcessingReason(), this.getProcessingReason(), "processingReason", null, 1, 1,
				Purpose.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getPurpose_ProcessingReasonSubtype(), this.getProcessingReasonSubtype(),
				"processingReasonSubtype", null, 1, 1, Purpose.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPurpose_SubPurposes(), this.getPurpose(), null, "subPurposes", null, 0, -1, Purpose.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPurpose_Details(), ecorePackage.getEString(), "details", null, 0, 1, Purpose.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getPurpose__IsValid__Purpose(), ecorePackage.getEBoolean(), "isValid", 1, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, this.getPurpose(), "purpose", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPurpose__IsSubPurposeValid__ProcessingReason_EList(), ecorePackage.getEBoolean(),
				"isSubPurposeValid", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getProcessingReason(), "reason", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getProcessingReasonSubtype(), "subreasons", 0, -1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPurpose__ContainsAllowedPurposeReasonAndSubreason__ProcessingReason_EList(),
				ecorePackage.getEBoolean(), "containsAllowedPurposeReasonAndSubreason", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getProcessingReason(), "allowedReason", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getProcessingReasonSubtype(), "allowedSubreasons", 0, -1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPurpose__PublicHealthShouldNotContainSubReason__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "PublicHealthShouldNotContainSubReason", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPurpose__LegitimateInterestsNotContainSubReason__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "LegitimateInterestsNotContainSubReason", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPurpose__StopProcessingInterestShouldNotContainSubReason__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "StopProcessingInterestShouldNotContainSubReason", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPurpose__ProfilingShouldNotContainSubReason__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "ProfilingShouldNotContainSubReason", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPurpose__MarketingShouldNotContainSubReason__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "MarketingShouldNotContainSubReason", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPurpose__OutOfScopeCannotContainsThisSubReason__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "OutOfScopeCannotContainsThisSubReason", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getPurpose__ExercisingSpecificRightsPurposesCannotContainsThisSubReason__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "ExercisingSpecificRightsPurposesCannotContainsThisSubReason", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getPurpose__ProtectTheVitalInterestsOfTheDataSubjectCannotContainsThisSubReason__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "ProtectTheVitalInterestsOfTheDataSubjectCannotContainsThisSubReason", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPurpose__PublicInterestCannotContainsThisSubReason__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "PublicInterestCannotContainsThisSubReason", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPurpose__ResearchCannotContainsThisSubReason__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "ResearchCannotContainsThisSubReason", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPurpose__StatisticalPurposesShouldNotContainSubReason__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "StatisticalPurposesShouldNotContainSubReason", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPurpose__TestingShouldNotContainSubReason__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "TestingShouldNotContainSubReason", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(whatEClass, What.class, "What", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWhat_Actions(), this.getAction(), "actions", null, 1, -1, What.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWhat_Providers(), this.getProvider(), null, "providers", null, 0, -1, What.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWhat_Datas(), this.getSharedPrivacyData(), null, "datas", null, 0, -1, What.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(howEClass, How.class, "How", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHow_Documents(), this.getDocument(), null, "documents", null, 0, -1, How.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getHow_Consent(), this.getConsent(), null, "consent", null, 0, 1, How.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		op = initEOperation(getHow__IsConsentValid__How(), ecorePackage.getEBoolean(), "isConsentValid", 1, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getHow(), "howConsent", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(consentEClass, Consent.class, "Consent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConsent_Format(), this.getConsentFormat(), "format", null, 0, 1, Consent.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConsent_Type(), this.getConsentType(), "type", null, 0, 1, Consent.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(configurationManagerEClass, ConfigurationManager.class, "ConfigurationManager", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConfigurationManager_DataSources(), ecorePackage.getEString(), "dataSources", null, 0, -1,
				ConfigurationManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfigurationManager_ProtectionControlMethods(), ecorePackage.getEString(),
				"protectionControlMethods", null, 0, -1, ConfigurationManager.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(complaintEClass, Complaint.class, "Complaint", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComplaint_Who(), this.getPrincipal(), null, "who", null, 1, 1, Complaint.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getComplaint_When(), ecorePackage.getEDate(), "when", null, 1, 1, Complaint.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComplaint_Reason(), ecorePackage.getEString(), "reason", null, 0, 1, Complaint.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComplaint_Action(), this.getAbstractComplaintAction(), null, "action", null, 1, 1,
				Complaint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getComplaint__DoesPolicyStatementExists__Action_ComplaintBasedOnDataType(),
				ecorePackage.getEBoolean(), "doesPolicyStatementExists", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAction(), "actionType", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getComplaintBasedOnDataType(), "type", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getComplaint__CannotIdentifyDataFromComplaint__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "CannotIdentifyDataFromComplaint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getComplaint__StopProcessingShouldBeExecutedAsSoonAsPossible__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "StopProcessingShouldBeExecutedAsSoonAsPossible", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getComplaint__UserDoesntHavePermissionToWithdrawConsent__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "UserDoesntHavePermissionToWithdrawConsent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getComplaint__ErasureShouldBeExecutedAsSoonAsPossible__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "ErasureShouldBeExecutedAsSoonAsPossible", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getComplaint__SubjectShouldBeNotifiedAboutExistingComplaintForErasure__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "SubjectShouldBeNotifiedAboutExistingComplaintForErasure", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getComplaint__RectificationShouldBeExecutedAsSoonAsPossible__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "RectificationShouldBeExecutedAsSoonAsPossible", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getComplaint__InvalidTypeOfPurposeForAnObject__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "InvalidTypeOfPurposeForAnObject", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getComplaint__UserDoesntHavePermissionToComplaint__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "UserDoesntHavePermissionToComplaint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getComplaint__SubjectShouldBeNotifiedAboutWithdraw__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "SubjectShouldBeNotifiedAboutWithdraw", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getComplaint__SubjectShouldBeNotifiedAboutExistingComplaintForRectification__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "SubjectShouldBeNotifiedAboutExistingComplaintForRectification", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(privacyPolicyHelperEClass, PrivacyPolicyHelper.class, "PrivacyPolicyHelper", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getPrivacyPolicyHelper__IsPolicyControlValid__String(), ecorePackage.getEBoolean(),
				"isPolicyControlValid", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "policyControl", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPrivacyPolicyHelper__IsDataSourceValid__String(), ecorePackage.getEBoolean(),
				"isDataSourceValid", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "dataSource", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPrivacyPolicyHelper__AreIntervalsOverlap__AbstractTime_AbstractTime(),
				ecorePackage.getEBoolean(), "areIntervalsOverlap", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAbstractTime(), "time1", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAbstractTime(), "time2", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPrivacyPolicyHelper__AreDatesOverlap__AbstractTime_Date(), ecorePackage.getEBoolean(),
				"areDatesOverlap", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAbstractTime(), "time", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "date", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPrivacyPolicyHelper__DoesIntervalStartBeforeInterval__AbstractTime_AbstractTime(),
				ecorePackage.getEBoolean(), "doesIntervalStartBeforeInterval", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAbstractTime(), "startInterval", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAbstractTime(), "finishInterval", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPrivacyPolicyHelper__IsDateBeforeInterval__AbstractTime_Date(),
				ecorePackage.getEBoolean(), "isDateBeforeInterval", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAbstractTime(), "time", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "date", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPrivacyPolicyHelper__IsDateAfterInterval__AbstractTime_Date(),
				ecorePackage.getEBoolean(), "isDateAfterInterval", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAbstractTime(), "time", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "date", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPrivacyPolicyHelper__IsDateInInterval__AbstractTime_Date(), ecorePackage.getEBoolean(),
				"isDateInInterval", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAbstractTime(), "time", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "date", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(whereEClass, Where.class, "Where", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWhere_Source(), this.getLocation(), null, "source", null, 0, 1, Where.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getWhere_Destination(), this.getLocation(), null, "destination", null, 0, 1, Where.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getWhere__Equals__Where(), ecorePackage.getEBoolean(), "equals", 1, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, this.getWhere(), "observed", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(documentEClass, Document.class, "Document", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocument_DocumentType(), this.getDocumentType(), "documentType", null, 0, 1, Document.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractPaperEClass, AbstractPaper.class, "AbstractPaper", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractPaper_ProvidedBy(), this.getPrincipal(), null, "providedBy", null, 1, 1,
				AbstractPaper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractPaper_TerminationExplanation(), ecorePackage.getEString(), "terminationExplanation",
				null, 0, 1, AbstractPaper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractPaper_StartDate(), ecorePackage.getEDate(), "startDate", null, 1, 1,
				AbstractPaper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractPaper_TerminationDate(), ecorePackage.getEDate(), "terminationDate", null, 0, 1,
				AbstractPaper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractPaper_Location(), ecorePackage.getEString(), "location", null, 1, 1,
				AbstractPaper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractPaper_Description(), ecorePackage.getEString(), "description", null, 0, 1,
				AbstractPaper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		op = initEOperation(getAbstractPaper__StartDateShouldBeBeforeTerminationDate__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "StartDateShouldBeBeforeTerminationDate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(abstractComplaintActionEClass, AbstractComplaintAction.class, "AbstractComplaintAction", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(withdrawEClass, Withdraw.class, "Withdraw", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWithdraw_Subject(), this.getConsent(), null, "subject", null, 1, 1, Withdraw.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(complaintBasedOnDataEClass, ComplaintBasedOnData.class, "ComplaintBasedOnData", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComplaintBasedOnData_Subject(), this.getPrivacyData(), null, "subject", null, 1, -1,
				ComplaintBasedOnData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComplaintBasedOnData_Type(), this.getComplaintBasedOnDataType(), "type", null, 1, 1,
				ComplaintBasedOnData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sharedPrivacyDataEClass, SharedPrivacyData.class, "SharedPrivacyData", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSharedPrivacyData_AdditionalProtectionControls(), ecorePackage.getEString(),
				"additionalProtectionControls", null, 0, -1, SharedPrivacyData.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSharedPrivacyData_Privacydata(), this.getPrivacyData(), null, "privacydata", null, 1, 1,
				SharedPrivacyData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSharedPrivacyData_ColllectedFromSubject(), ecorePackage.getEBoolean(),
				"colllectedFromSubject", "true", 1, 1, SharedPrivacyData.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSharedPrivacyData_DataSource(), ecorePackage.getEString(), "dataSource", null, 0, 1,
				SharedPrivacyData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		op = initEOperation(getSharedPrivacyData__ProtectionControlShouldExistsInConfiguration__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "ProtectionControlShouldExistsInConfiguration", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSharedPrivacyData__DataSourceShouldExistsInConfiguration__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "DataSourceShouldExistsInConfiguration", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(denialEClass, Denial.class, "Denial", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDenial_When(), ecorePackage.getEDate(), "when", null, 1, 1, Denial.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDenial_ApprovedBy(), this.getPrincipal(), null, "approvedBy", null, 1, 1, Denial.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDenial_Reason(), ecorePackage.getEString(), "reason", null, 0, 1, Denial.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDenial_BasedOnStatements(), this.getPolicyStatement(), null, "basedOnStatements", null, 0, -1,
				Denial.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(notificationEClass, Notification.class, "Notification", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNotification_Type(), this.getNotificationType(), "type", null, 1, 1, Notification.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNotification_Notifiers(), this.getPrincipal(), null, "notifiers", null, 1, -1,
				Notification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNotification_Receivers(), this.getPrincipal(), null, "receivers", null, 1, -1,
				Notification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNotification_CausedBy(), this.getNotificationInfo(), null, "causedBy", null, 1, 1,
				Notification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNotification_When(), ecorePackage.getEDate(), "when", null, 1, 1, Notification.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getNotification__ShouldDefineCausedByAsErasure__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "ShouldDefineCausedByAsErasure", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getNotification__ShouldDefineCausedByAsPrivacyPolicy__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "ShouldDefineCausedByAsPrivacyPolicy", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getNotification__ShouldDefineCausedByAsWithdraw__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "ShouldDefineCausedByAsWithdraw", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getNotification__ShouldDefineCausedByAsRectification__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "ShouldDefineCausedByAsRectification", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(notificationInfoEClass, NotificationInfo.class, "NotificationInfo", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(abstractComplaintEClass, AbstractComplaint.class, "AbstractComplaint", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractComplaint_Status(), this.getComplaintStatus(), "status", null, 1, 1,
				AbstractComplaint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractComplaint_DenialReason(), this.getDenial(), null, "denialReason", null, 0, 1,
				AbstractComplaint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(complaintBasedOnActionEClass, ComplaintBasedOnAction.class, "ComplaintBasedOnAction", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComplaintBasedOnAction_Statement(), this.getPolicyStatement(), null, "statement", null, 1, 1,
				ComplaintBasedOnAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(dataTypeEEnum, DataType.class, "DataType");
		addEEnumLiteral(dataTypeEEnum, DataType.BIOMETRIC);
		addEEnumLiteral(dataTypeEEnum, DataType.GENERAL);
		addEEnumLiteral(dataTypeEEnum, DataType.GENETIC);
		addEEnumLiteral(dataTypeEEnum, DataType.POLITICAL_OPINION);
		addEEnumLiteral(dataTypeEEnum, DataType.RACIAL_OR_ETHNIC_ORIGIN);
		addEEnumLiteral(dataTypeEEnum, DataType.BELIEFS);
		addEEnumLiteral(dataTypeEEnum, DataType.SEX_LIFE);
		addEEnumLiteral(dataTypeEEnum, DataType.RELIGIC);
		addEEnumLiteral(dataTypeEEnum, DataType.HEALTH);
		addEEnumLiteral(dataTypeEEnum, DataType.JUDICAL);

		initEEnum(documentTypeEEnum, DocumentType.class, "DocumentType");
		addEEnumLiteral(documentTypeEEnum, DocumentType.CHILD_CUSTODY);
		addEEnumLiteral(documentTypeEEnum, DocumentType.COURT_APPROVAL);
		addEEnumLiteral(documentTypeEEnum, DocumentType.CONTROLLER_APPROVAL);
		addEEnumLiteral(documentTypeEEnum, DocumentType.TRANSFER_CERTIFICATE);

		initEEnum(timePrepositionEEnum, TimePreposition.class, "TimePreposition");
		addEEnumLiteral(timePrepositionEEnum, TimePreposition.FROM);
		addEEnumLiteral(timePrepositionEEnum, TimePreposition.TO);
		addEEnumLiteral(timePrepositionEEnum, TimePreposition.AT);
		addEEnumLiteral(timePrepositionEEnum, TimePreposition.UNTIL);
		addEEnumLiteral(timePrepositionEEnum, TimePreposition.BEFORE);
		addEEnumLiteral(timePrepositionEEnum, TimePreposition.AFTER);

		initEEnum(principalTypeEEnum, PrincipalType.class, "PrincipalType");
		addEEnumLiteral(principalTypeEEnum, PrincipalType.LEGAL_ENTITY);
		addEEnumLiteral(principalTypeEEnum, PrincipalType.NATURAL_PERSON);

		initEEnum(principalScopeEEnum, PrincipalScope.class, "PrincipalScope");
		addEEnumLiteral(principalScopeEEnum, PrincipalScope.IN);
		addEEnumLiteral(principalScopeEEnum, PrincipalScope.OUT);
		addEEnumLiteral(principalScopeEEnum, PrincipalScope.UNKNOWN);

		initEEnum(actionEEnum, Action.class, "Action");
		addEEnumLiteral(actionEEnum, Action.STORE);
		addEEnumLiteral(actionEEnum, Action.ACCESS);
		addEEnumLiteral(actionEEnum, Action.COLLECTING);
		addEEnumLiteral(actionEEnum, Action.PROFILING);
		addEEnumLiteral(actionEEnum, Action.ERASURE);
		addEEnumLiteral(actionEEnum, Action.RECTIFICATION);
		addEEnumLiteral(actionEEnum, Action.TRANSFER);
		addEEnumLiteral(actionEEnum, Action.STOP_PROCESSING);

		initEEnum(locationTypeEEnum, LocationType.class, "LocationType");
		addEEnumLiteral(locationTypeEEnum, LocationType.UNION);
		addEEnumLiteral(locationTypeEEnum, LocationType.COUNTRY);
		addEEnumLiteral(locationTypeEEnum, LocationType.REGION);

		initEEnum(processingReasonEEnum, ProcessingReason.class, "ProcessingReason");
		addEEnumLiteral(processingReasonEEnum, ProcessingReason.RESEARCH);
		addEEnumLiteral(processingReasonEEnum, ProcessingReason.PUBLIC_HEALTH);
		addEEnumLiteral(processingReasonEEnum, ProcessingReason.OUT_OF_SCOPE);
		addEEnumLiteral(processingReasonEEnum, ProcessingReason.PUBLIC_INTEREST);
		addEEnumLiteral(processingReasonEEnum, ProcessingReason.STATISTICAL_PURPOSES);
		addEEnumLiteral(processingReasonEEnum, ProcessingReason.EXERCISING_SPECIFIC_RIGHTS);
		addEEnumLiteral(processingReasonEEnum, ProcessingReason.MARKETING);
		addEEnumLiteral(processingReasonEEnum, ProcessingReason.TESTING);
		addEEnumLiteral(processingReasonEEnum, ProcessingReason.PROFILING);
		addEEnumLiteral(processingReasonEEnum, ProcessingReason.PROTECT_THE_VITAL_INTERESTS_OF_THE_DATA_SUBJECT);
		addEEnumLiteral(processingReasonEEnum, ProcessingReason.LEGITIMATE_INTERESTS);
		addEEnumLiteral(processingReasonEEnum, ProcessingReason.STOP_PROCESSING);

		initEEnum(processingReasonSubtypeEEnum, ProcessingReasonSubtype.class, "ProcessingReasonSubtype");
		addEEnumLiteral(processingReasonSubtypeEEnum, ProcessingReasonSubtype.NONE);
		addEEnumLiteral(processingReasonSubtypeEEnum, ProcessingReasonSubtype.PREVENTION);
		addEEnumLiteral(processingReasonSubtypeEEnum, ProcessingReasonSubtype.INVESTIGATION);
		addEEnumLiteral(processingReasonSubtypeEEnum, ProcessingReasonSubtype.DETECTION);
		addEEnumLiteral(processingReasonSubtypeEEnum, ProcessingReasonSubtype.PROSECUTION);
		addEEnumLiteral(processingReasonSubtypeEEnum, ProcessingReasonSubtype.PREVENTION_OF_THREATS);
		addEEnumLiteral(processingReasonSubtypeEEnum, ProcessingReasonSubtype.OUT_OF_EU);
		addEEnumLiteral(processingReasonSubtypeEEnum, ProcessingReasonSubtype.PERSONAL_ACTIVITY);
		addEEnumLiteral(processingReasonSubtypeEEnum, ProcessingReasonSubtype.SPECIAL_SCOPE_OF_ACTIVITY);
		addEEnumLiteral(processingReasonSubtypeEEnum, ProcessingReasonSubtype.EMPLOYMENT);
		addEEnumLiteral(processingReasonSubtypeEEnum, ProcessingReasonSubtype.SOCIAL_SECURITY);
		addEEnumLiteral(processingReasonSubtypeEEnum, ProcessingReasonSubtype.SOCIAL_PROTECTION);
		addEEnumLiteral(processingReasonSubtypeEEnum, ProcessingReasonSubtype.PHISICALLY_INCAPABLE);
		addEEnumLiteral(processingReasonSubtypeEEnum, ProcessingReasonSubtype.LEGALLY_INCAPABLE);
		addEEnumLiteral(processingReasonSubtypeEEnum, ProcessingReasonSubtype.STATISTICAL);
		addEEnumLiteral(processingReasonSubtypeEEnum, ProcessingReasonSubtype.HISTORICAL);
		addEEnumLiteral(processingReasonSubtypeEEnum, ProcessingReasonSubtype.SCIENTIFIC);
		addEEnumLiteral(processingReasonSubtypeEEnum, ProcessingReasonSubtype.OTHER);

		initEEnum(consentFormatEEnum, ConsentFormat.class, "ConsentFormat");
		addEEnumLiteral(consentFormatEEnum, ConsentFormat.WRITTEN);
		addEEnumLiteral(consentFormatEEnum, ConsentFormat.VERBAL);
		addEEnumLiteral(consentFormatEEnum, ConsentFormat.NON_VERBAL);

		initEEnum(consentTypeEEnum, ConsentType.class, "ConsentType");
		addEEnumLiteral(consentTypeEEnum, ConsentType.EXPLICIT);
		addEEnumLiteral(consentTypeEEnum, ConsentType.IMPLIED);
		addEEnumLiteral(consentTypeEEnum, ConsentType.INFORMED);
		addEEnumLiteral(consentTypeEEnum, ConsentType.UNANOMIUS);
		addEEnumLiteral(consentTypeEEnum, ConsentType.SUBSTITUTED);

		initEEnum(complaintBasedOnDataTypeEEnum, ComplaintBasedOnDataType.class, "ComplaintBasedOnDataType");
		addEEnumLiteral(complaintBasedOnDataTypeEEnum, ComplaintBasedOnDataType.ERASURE);
		addEEnumLiteral(complaintBasedOnDataTypeEEnum, ComplaintBasedOnDataType.RECTIFICATION);

		initEEnum(notificationTypeEEnum, NotificationType.class, "NotificationType");
		addEEnumLiteral(notificationTypeEEnum, NotificationType.ERASURE);
		addEEnumLiteral(notificationTypeEEnum, NotificationType.WITHDRAW);
		addEEnumLiteral(notificationTypeEEnum, NotificationType.RECTIFICATION);
		addEEnumLiteral(notificationTypeEEnum, NotificationType.DATA_COLLECTING);
		addEEnumLiteral(notificationTypeEEnum, NotificationType.STOP_PROCESSING);
		addEEnumLiteral(notificationTypeEEnum, NotificationType.THIRD_PARTY_TRANSFER);
		addEEnumLiteral(notificationTypeEEnum, NotificationType.EXECUTED_RECTIFICATION);
		addEEnumLiteral(notificationTypeEEnum, NotificationType.EXECUTED_ERASURE);

		initEEnum(complaintStatusEEnum, ComplaintStatus.class, "ComplaintStatus");
		addEEnumLiteral(complaintStatusEEnum, ComplaintStatus.PENDING);
		addEEnumLiteral(complaintStatusEEnum, ComplaintStatus.ACCEPTED);
		addEEnumLiteral(complaintStatusEEnum, ComplaintStatus.DENIED);
		addEEnumLiteral(complaintStatusEEnum, ComplaintStatus.EXECUTED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation(this, source,
				new String[] { "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
						"settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "validationDelegates",
						"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot" });
		addAnnotation(privacyPolicyEClass, source, new String[] { "constraints", "UniqueComplaintName" });
		addAnnotation(policyStatementEClass, source, new String[] { "constraints", "WhomShouldBeDefinedForTransfer" });
		addAnnotation(principalEClass, source, new String[] { "constraints", "JuvenileShouldHaveResponsiblePerson" });
		addAnnotation(timeIntervalEClass, source, new String[] { "constraints", "AtTypeShouldBeDefinedAlone" });
		addAnnotation(purposeEClass, source, new String[] { "constraints", "TestingShouldNotContainSubReason" });
		addAnnotation(complaintEClass, source,
				new String[] { "constraints", "SubjectShouldBeNotifiedAboutExistingComplaintForRectification" });
		addAnnotation(abstractPaperEClass, source,
				new String[] { "constraints", "StartDateShouldBeBeforeTerminationDate" });
		addAnnotation(sharedPrivacyDataEClass, source,
				new String[] { "constraints", "DataSourceShouldExistsInConfiguration" });
		addAnnotation(notificationEClass, source,
				new String[] { "constraints", "ShouldDefineCausedByAsRectification" });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";
		addAnnotation(getPrivacyPolicy__UniqueProviderName__DiagnosticChain_Map(), source, new String[] { "body",
				"Tuple {\n\tmessage : String = \'Provider name is unique\',\n\tstatus : Boolean = \n\t\tself.allProviders->forAll(provider1:Provider,provider2:Provider| provider1.name = provider2.name implies provider1 = provider2)\n}.status" });
		addAnnotation(getPrivacyPolicy__UniqueConsentName__DiagnosticChain_Map(), source, new String[] { "body",
				"Tuple {\n\tmessage : String = \'Consent name is unique\',\n\tstatus : Boolean = \n\t\tself.allConsents->forAll(consent1:Consent,consent2:Consent| consent1.name = consent2.name implies consent1 = consent2)\n}.status" });
		addAnnotation(getPrivacyPolicy__UniqueServiceName__DiagnosticChain_Map(), source, new String[] { "body",
				"Tuple {\n\tmessage : String = \'Service name is unique\',\n\tstatus : Boolean = \n\t\tself.allServices->forAll(service1:Service,service2:Service| service1.name = service2.name implies service1 = service2)\n}.status" });
		addAnnotation(getPrivacyPolicy__OwnerShouldHaveDefinedInhabits__DiagnosticChain_Map(), source, new String[] {
				"body",
				"Tuple {\n\tmessage : String = \'Based on Art 3\',\n\tstatus : Boolean = \n\t\t\t(not(self.owner = null) and not(self.owner.inhabits = null))\n}.status" });
		addAnnotation(getPrivacyPolicy__UniquePolicyStatementName__DiagnosticChain_Map(), source, new String[] { "body",
				"Tuple {\n\tmessage : String = \'PolicyStatement name is unique\',\n\tstatus : Boolean = \n\t\t\tself.policyStatements->forAll(st1:PolicyStatement,st2:PolicyStatement| st1.name = st2.name implies st1 = st2)\n}.status" });
		addAnnotation(getPrivacyPolicy__ProtectionControlShouldExistsInConfiguration__DiagnosticChain_Map(), source,
				new String[] { "body",
						"Tuple {\n\tmessage : String = \'Protection controls should be defined in configuration.\',\n\tstatus : Boolean = \n\t\t\tself.defaultProtectionControls->forAll(protectionControl:String|\n\t\t\t\tself.privacyPolicyHelper.isPolicyControlValid(protectionControl)\n\t\t\t)\n}.status" });
		addAnnotation(getPrivacyPolicy__UniquePrivacyDataName__DiagnosticChain_Map(), source, new String[] { "body",
				"Tuple {\n\tmessage : String = \'PrivacyData name is unique\',\n\tstatus : Boolean = \n\t\tself.allDatas->forAll(data1:PrivacyData,data2:PrivacyData| data1.name = data2.name implies data1 = data2)\n}.status" });
		addAnnotation(getPrivacyPolicy__UniqueDocumentName__DiagnosticChain_Map(), source, new String[] { "body",
				"Tuple {\n\tmessage : String = \'Document name is unique\',\n\tstatus : Boolean = \n\t\tself.allDocuments->forAll(document1:Document,document2:Document| document1.name = document2.name implies document1 = document2)\n}.status" });
		addAnnotation(getPrivacyPolicy__UniqueLocationPerType__DiagnosticChain_Map(), source, new String[] { "body",
				"Tuple {\n\tmessage : String = \'Location name per type is unique\',\n\tstatus : Boolean = \n\t\tself.locations->forAll(loc1:Location,loc2:Location| \n\t\t\tif(loc1.type = loc2.type) then \n\t\t\t\tloc1.name = loc2.name implies loc1 = loc2\n\t\t\telse\n\t\t\t\ttrue\n\t\t\tendif\n\t\t)\n}.status" });
		addAnnotation(getPrivacyPolicy__UniquePrincipalNamePerType__DiagnosticChain_Map(), source, new String[] {
				"body",
				"Tuple {\n\tmessage : String = \'Principal name per type is unique\',\n\tstatus : Boolean = \n\t\tself.allPrincipals->forAll(pr1:Principal,pr2:Principal| \n\t\t\tif(pr1.type = pr2.type) then \n\t\t\tpr1.name = pr2.name implies pr1 = pr2\n\t\t\telse\n\t\t\t\ttrue\n\t\t\tendif\n\t\t)\n}.status" });
		addAnnotation(getPrivacyPolicy__UniqueComplaintName__DiagnosticChain_Map(), source, new String[] { "body",
				"Tuple {\n\tmessage : String = \'Complaint name is unique\',\n\tstatus : Boolean = \n\t\tself.allComplaints->forAll(complaint1:Complaint,complaint2:Complaint| complaint1.name = complaint2.name implies complaint1 = complaint2)\n}.status" });
		addAnnotation(getPolicyStatement__DateShouldBeDefinedForType__Action(), source, new String[] { "body",
				"\n\t\t\t\t\tif(self.what = null) then\n\t\t\t\t\t\ttrue\n\t\t\t\t\telse\n\t\t\t\t\t\tif(self.what.actions->exists(act| act = actionType)) then\n\t\t\t\t\t\t\tnot(self.when = null)\n\t\t\t\t\t\telse\n\t\t\t\t\t\t\ttrue\n\t\t\t\t\t\tendif\n\t\t\t\t\tendif" });
		addAnnotation(getPolicyStatement__CausedByShouldBeDefinedForType__Action(), source, new String[] { "body",
				"\n\t\t\t\t\tif(self.what = null) then\n\t\t\t\t\t\ttrue\n\t\t\t\t\telse\n\t\t\t\t\t\tif(self.what.actions->exists(act| act = actionType)) then\n\t\t\t\t\t\t\tnot(self.causedBy = null)\n\t\t\t\t\t\telse\n\t\t\t\t\t\t\ttrue\n\t\t\t\t\t\tendif\n\t\t\t\t\tendif" });
		addAnnotation(getPolicyStatement__DocumentIsNeededForPurpose__DocumentType_ProcessingReason(), source,
				new String[] { "body",
						"\n\t\t\t\t\tif(self.what.actions->exists(act| act = Action::Collecting)) then\n\t\t\t\t\t\ttrue\n\t\t\t\t\telse\n\t\t\t\t\t\tif(self.why.processingReason = processingReason) then\n\t\t\t\t\t\t not(self.how = null) and self.how.documents->exists(doc| doc.documentType = documentType)\n\t\t\t\t\t\telse\n\t\t\t\t\t\tself.why.subPurposes->forAll(purpose|\n\t\t\t\t\t\t\tif(purpose.processingReason = processingReason)then\n\t\t\t\t\t\t\t\tnot(self.how = null) and self.how.documents->exists(doc| doc.documentType = documentType)\n\t\t\t\t\t\t\telse \n\t\t\t\t\t\t\t\ttrue\n\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t)\n\t\t\t\t\t\tendif\n\t\t\t\t\tendif" });
		addAnnotation(getPolicyStatement__SubjectShouldBeNotifiedAboutTransferToThirdCountry__DiagnosticChain_Map(),
				source, new String[] { "body",
						"Tuple {\n\tmessage : String = \'Based on Art15\',\n\tstatus : Boolean = \n\t\t\tif(self.what.actions->exists(action| action = Action::Transfer) and not(self.where.destination = null) and self.where.destination.isEUMember = false) then\n\t\t\t\t\tPrivacyPolicy.allInstances()->asSequence()->first().notifications->exists(notification| notification.type = NotificationType::ThirdPartyTransfer \n\t\t\t\t\t\tand notification.causedBy = self\n\t\t\t\t\t)\n\t\t\t\telse\n\t\t\t\t\ttrue\n\t\t\tendif\n}.status" });
		addAnnotation(getPolicyStatement__SubjectShouldBeNotifiedAboutExecutedRectification__DiagnosticChain_Map(),
				source, new String[] { "body",
						"Tuple {\n\tmessage : String = \'Based on Art19\',\n\tstatus : Boolean = \n\t\t\tif(what.actions->exists(action| action = Action::Rectification)) then\n\t\t\t\t\tPrivacyPolicy.allInstances()->asSequence()->first().notifications->exists(notification| notification.causedBy = self and\n\t\t\t\t\t\tnotification.type = NotificationType::ExecutedRectification\n\t\t\t\t\t)\n\t\t\t\telse\n\t\t\t\t\ttrue\n\t\t\tendif\n}.status" });
		addAnnotation(getPolicyStatement__SubjectShouldBeNotifiedAboutStopProcessing__DiagnosticChain_Map(), source,
				new String[] { "body",
						"Tuple {\n\tmessage : String = \'Based on Art21\',\n\tstatus : Boolean = \n\t\t\tif(what.actions->exists(action| action = Action::StopProcessing)) then\n\t\t\t\t\tPrivacyPolicy.allInstances()->asSequence()->first().notifications->exists(notification| notification.type = NotificationType::StopProcessing and \n\t\t\t\t\t\tnotification.causedBy = self\n\t\t\t\t\t)\n\t\t\t\telse\n\t\t\t\t\ttrue\n\t\t\tendif\n}.status" });
		addAnnotation(
				getPolicyStatement__ControllerApprovalIsNeedForProtectTheVitalInterestsOfTheDataSubjectPurpose__DiagnosticChain_Map(),
				source, new String[] { "body",
						"Tuple {\n\tmessage : String = \'Based on Art9\',\n\tstatus : Boolean = \n\t\t\tdocumentIsNeededForPurpose(DocumentType::ControllerApproval,ProcessingReason::ProtectTheVitalInterestsOfTheDataSubject)\n}.status" });
		addAnnotation(getPolicyStatement__MissingConsentForCollecting__DiagnosticChain_Map(), source, new String[] {
				"body",
				"Tuple {\n\tmessage : String = \'Based on Art6\',\n\tstatus : Boolean = \n\t\t\tif(self.whose = null or not(self.what.actions->exists(action| action = Action::Collecting)) or \n\t\t\t\t(what.datas->exists(data| data.colllectedFromSubject = false) and self.what.actions->exists(action| action = Action::Collecting))\n\t\t\t) then\n\t\t\t\ttrue\n\t\t\telse if(self.whose.type = PrincipalType::NaturalPerson and self.whose.age < PrivacyPolicy.allInstances()->asSequence()->first().owner.inhabits.legalAgeLimit) then\n\t\t\t\tnot(self.how = null) and not(self.how.consent = null) and self.whose.responsiblePersons->exists(person| self.how.consent.providedBy = person)\n\t\t\telse \n\t\t\t\tnot(self.how = null) and not(self.how.consent = null) and (self.how.consent.providedBy = self.whose or self.whose.responsiblePersons->exists(person| self.how.consent.providedBy = person))\n\t\t\tendif\n\t\t\tendif\n}.status" });
		addAnnotation(getPolicyStatement__ExpiredConsent__DiagnosticChain_Map(), source, new String[] { "body",
				"Tuple {\n\tmessage : String = \'Based on Art6\',\n\tstatus : Boolean = \n\t\t\tif(self.whose = null or self.what.actions->exists(act| act = Action::Collecting or act = Action::StopProcessing)) then\n\t\t\t\ttrue\n\t\t\telse\n\t\t\tlet privacyPolicy : PrivacyPolicy = PrivacyPolicy.allInstances()->asSequence()->first() in\n\t\t\t\tself.what.datas->forAll(data |\n\t\t\t\t\tlet statements = privacyPolicy.policyStatements->select(st| \n\t\t\t\t\t\tnot(st.whose = null) and st.whose = self.whose and self.who.equals(st.who) and st.what.actions->exists(act| act = Action::Collecting) and st.what.datas->exists(d| d = data))\n\t\t\t\t\t\tin \n\t\t\t\t\t\tif(statements->isEmpty()) then \n\t\t\t\t\t\t\ttrue\n\t\t\t\t\t\telse\n\t\t\t\t\t\t\tstatements -> exists(st|\n\t\t\t\t\t\t\t\tif(privacyPolicy.privacyPolicyHelper.areIntervalsOverlap(self.when, st.when)) then\n\t\t\t\t\t\t\t\t\tif(self.why = null \n\t\t\t\t\t\t\t\t\t\tor \n\t\t\t\t\t\t\t\t\t\tlet reasons = Sequence{ProcessingReason::PublicInterest,ProcessingReason::LegitimateInterests,ProcessingReason::ProtectTheVitalInterestsOfTheDataSubject} in\n\t\t\t\t\t\t\t\t\t\t\treasons->includes(self.why.processingReason) or self.why.subPurposes->exists(subpurpose| reasons->includes(subpurpose)\n\t\t\t\t\t\t\t\t\t)) then\n\t\t\t\t\t\t\t\t\t\ttrue\n\t\t\t\t\t\t\t\t\telse\n\t\t\t\t\t\t\t\t\t\tnot(privacyPolicy.privacyPolicyHelper.isDateAfterInterval(self.when, st.how.consent.startDate)) and\n\t\t\t\t\t\t\t\t\t\t(st.how.consent.terminationDate = null or not(privacyPolicy.privacyPolicyHelper.isDateBeforeInterval(self.when, st.how.consent.terminationDate)))\n\t\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\t\telse\n\t\t\t\t\t\t\t\t\tfalse\n\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\t)\n\t\t\t\t\t\tendif\n\t\t\t\t)\n\t\t\tendif\n}.status" });
		addAnnotation(getPolicyStatement__StopProcessingPurposeForActionStopProcessing__DiagnosticChain_Map(), source,
				new String[] { "body",
						"\n\t\t\tif(not(self.what.actions->exists(act| act = Action::StopProcessing))) then\n\t\t\t\ttrue\n\t\t\telse\n\t\t\t\tself.why.processingReason = ProcessingReason::StopProcessing\n\t\t\tendif" });
		addAnnotation(getPolicyStatement__WithdrawedConsent__DiagnosticChain_Map(), source, new String[] { "body",
				"Tuple {\n\tmessage : String = \'Based on Art7\',\n\tstatus : Boolean = \n\t\t\tif(self.whose = null or self.what.actions->exists(act| act = Action::Collecting)) then\n\t\t\t\ttrue\n\t\t\telse\n\t\t\tlet privacyPolicy : PrivacyPolicy = PrivacyPolicy.allInstances()->asSequence()->first() in\n\t\t\t\tself.what.datas->forAll(data|\n\t\t\t\t\tlet statements = privacyPolicy.policyStatements->select(st: PolicyStatement| \n\t\t\t\t\t\tnot(st.whose = null) and st.whose = self.whose and self.who.equals(st.who) and st.what.actions->exists(act| act = Action::Collecting) and st.what.datas->exists(d| d = data))\n\t\t\t\t\t\tin \n\t\t\t\t\t\tif(statements->isEmpty()) then \n\t\t\t\t\t\t\ttrue\n\t\t\t\t\t\telse\n\t\t\t\t\t\t\tstatements -> forAll(st|\n\t\t\t\t\t\t\t\tif(privacyPolicy.privacyPolicyHelper.areIntervalsOverlap(self.when, st.when)) then\n\t\t\t\t\t\t\t\t\tif(self.why = null \n\t\t\t\t\t\t\t\t\t\tor \n\t\t\t\t\t\t\t\t\t\tlet reasons  = Sequence{ProcessingReason::PublicInterest,ProcessingReason::LegitimateInterests,ProcessingReason::ProtectTheVitalInterestsOfTheDataSubject} in\n\t\t\t\t\t\t\t\t\t\t\treasons->includes(self.why.processingReason) or self.why.subPurposes->exists(subpurpose| reasons->includes(subpurpose)\n\t\t\t\t\t\t\t\t\t)) then\n\t\t\t\t\t\t\t\t\t\ttrue\n\t\t\t\t\t\t\t\t\telse\n\t\t\t\t\t\t\t\t\t\tnot(privacyPolicy.allComplaints->exists(complaint| complaint.action.oclIsTypeOf(Withdraw) and \n\t\t\t\t\t\t\t\t\t\t\tlet withdrawal: Withdraw = complaint.action.oclAsType(Withdraw) in\n\t\t\t\t\t\t\t\t\t\t\t\twithdrawal.subject = st.how.consent\n\t\t\t\t\t\t\t\t\t\t\t\tand (privacyPolicy.privacyPolicyHelper.isDateInInterval(self.when, complaint.when) \n\t\t\t\t\t\t\t\t\t\t\t\tor privacyPolicy.privacyPolicyHelper.isDateBeforeInterval(self.when, complaint.when))\n\t\t\t\t\t\t\t\t\t\t\tand not(privacyPolicy.policyStatements->exists(stopStatement| \n\t\t\t\t\t\t\t\t\t\t\t\tstopStatement.what.actions->exists(act| act = Action::StopProcessing) and \n\t\t\t\t\t\t\t\t\t\t\t\tstopStatement.what.datas->exists(d| d = data) and not(stopStatement.causedBy = null) and \n\t\t\t\t\t\t\t\t\t\t\t\tstopStatement.causedBy.action= withdrawal))\n\t\t\t\t\t\t\t\t\t\t))\n\t\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\t\telse\n\t\t\t\t\t\t\t\t\tfalse\n\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\t)\n\t\t\t\t\t\tendif\n\t\t\t\t)\n\t\t\tendif\n}.status" });
		addAnnotation(getPolicyStatement__ProcessingOfSpecialCategories__DiagnosticChain_Map(), source, new String[] {
				"body",
				"Tuple {\n\tmessage : String = \'Based on Art9\',\n\tstatus : Boolean = \n\t\t\tif(self.what.actions->exists(action | action = Action::StopProcessing)) then\n\t\t\t\ttrue\n\t\t\telse\n\t\t\tself.what.datas->forAll(data| \n\t\t\t\tlet dataTypes  = Sequence{DataType::Biometric, DataType::Genetic, DataType::PoliticalOpinion, \n\t\t\t\t\tDataType::RacialOrEthnicOrigin, DataType::SexLife, DataType::Religic, DataType::Judical\n\t\t\t\t} in\n\t\t\t\tif(dataTypes->includes(data.privacydata.type)) then\n\t\t\t\t\t((not(self.how = null) and not(self.how.consent = null))\n\t\t\t\t\t\tor\n\t\t\t\t\t(not(self.why = null) and\n\t\t\t\t\tlet reasons  = Sequence{ProcessingReason::PublicInterest,ProcessingReason::LegitimateInterests,\n\t\t\t\t\t\tProcessingReason::ProtectTheVitalInterestsOfTheDataSubject, ProcessingReason::Research, ProcessingReason::PublicHealth\n\t\t\t\t\t} in\n\t\t\t\t\t\treasons->includes(self.why.processingReason) or (not(self.why.subPurposes = null) and self.why.subPurposes->exists(subpurpose| reasons->includes(subpurpose)\n\t\t\t\t\t))))\n\t\t\t\telse\n\t\t\t\t\ttrue\n\t\t\t\tendif\n\t\t\t)\n\t\t\tendif\n}.status" });
		addAnnotation(getPolicyStatement__SubjectShouldBeNotifiedAboutCollecting__DiagnosticChain_Map(), source,
				new String[] { "body",
						"Tuple {\n\tmessage : String = \'Based on Art14\',\n\tstatus : Boolean = \n\t\t\tif(self.what.actions->exists(action| action = Action::Collecting) and self.what.datas->exists(data| data.colllectedFromSubject = false)) then\n\t\t\t\tif(not(self.why = null) and \n\t\t\t\t(self.why.containsAllowedPurposeReasonAndSubreason(ProcessingReason::PublicInterest,Sequence{ProcessingReasonSubtype::None}) or\n\t\t\t\t\tself.why.containsAllowedPurposeReasonAndSubreason(ProcessingReason::Research,Sequence{ProcessingReasonSubtype::Statistical, \n\t\t\t\t\t\tProcessingReasonSubtype::Historical,ProcessingReasonSubtype::Scientific}))\n\t\t\t\t)then\n\t\t\t\t\ttrue\n\t\t\t\telse\n\t\t\t\t\tPrivacyPolicy.allInstances()->asSequence()->first().notifications->exists(notification| notification.type = NotificationType::DataCollecting \n\t\t\t\t\t\tand notification.causedBy = self\n\t\t\t\t\t)\n\t\t\t\tendif\n\t\t\t\telse\n\t\t\t\t\ttrue\n\t\t\tendif\n}.status" });
		addAnnotation(getPolicyStatement__DateShoudBeDefinedForStoreAction__DiagnosticChain_Map(), source,
				new String[] { "body",
						"Tuple {\n\tmessage : String = \'Date shoud be defined\',\n\tstatus : Boolean = \n\t\t\tdateShouldBeDefinedForType(Action::Store)\n}.status" });
		addAnnotation(getPolicyStatement__CourtApprovalIsNeedForPublicInterestPurpose__DiagnosticChain_Map(), source,
				new String[] { "body",
						"Tuple {\n\tmessage : String = \'Based on Art9\',\n\tstatus : Boolean = \n\t\t\tdocumentIsNeededForPurpose(DocumentType::CourtApproval,ProcessingReason::PublicInterest)\n}.status" });
		addAnnotation(getPolicyStatement__ControllerApprovalIsNeedForLegitimateInterestsPurpose__DiagnosticChain_Map(),
				source, new String[] { "body",
						"Tuple {\n\tmessage : String = \'Based on Art9\',\n\tstatus : Boolean = \n\t\t\tdocumentIsNeededForPurpose(DocumentType::ControllerApproval,ProcessingReason::LegitimateInterests)\n}.status" });
		addAnnotation(getPolicyStatement__DateShoudBeDefinedForAccessAction__DiagnosticChain_Map(), source,
				new String[] { "body",
						"Tuple {\n\tmessage : String = \'Date shoud be defined\',\n\tstatus : Boolean = \n\t\t\tdateShouldBeDefinedForType(Action::Access)\n}.status" });
		addAnnotation(getPolicyStatement__ExpiredConsentForCollecting__DiagnosticChain_Map(), source, new String[] {
				"body",
				"Tuple {\n\tmessage : String = \'Based on Art6\',\n\tstatus : Boolean = \n\t\t\tif(self.whose = null or not(self.what.actions->exists(act| act = Action::Collecting)) or self.how = null or self.how.consent = null) then\n\t\t\t\ttrue\n\t\t\telse\n\t\t\tlet privacyPolicy : PrivacyPolicy = PrivacyPolicy.allInstances()->asSequence()->first() in\n\t\t\t\tif(self.why = null \n\t\t\t\t\tor \n\t\t\t\t\tlet reasons = Sequence{ProcessingReason::PublicInterest,ProcessingReason::LegitimateInterests,ProcessingReason::ProtectTheVitalInterestsOfTheDataSubject} in\n\t\t\t\t\t\treasons->includes(self.why.processingReason) or self.why.subPurposes->exists(subpurpose| reasons->includes(subpurpose)\n\t\t\t\t)) then\n\t\t\t\t\ttrue\n\t\t\t\telse\n\t\t\t\t\t(privacyPolicy.privacyPolicyHelper.isDateInInterval(self.when, self.how.consent.startDate) or\n\t\t\t\t\tprivacyPolicy.privacyPolicyHelper.isDateBeforeInterval(self.when, self.how.consent.startDate))\n\t\t\t\t\tand\n\t\t\t\t\t(self.how.consent.terminationDate = null or not(privacyPolicy.privacyPolicyHelper.isDateBeforeInterval(self.when, self.how.consent.terminationDate)))\n\t\t\t\tendif\n\t\t\tendif\n}.status" });
		addAnnotation(getPolicyStatement__CausedByShouldBeDefinedForStopProcessingAction__DiagnosticChain_Map(), source,
				new String[] { "body",
						"Tuple {\n\tmessage : String = \'Based on Art21\',\n\tstatus : Boolean = \n\t\t\tcausedByShouldBeDefinedForType(Action::StopProcessing)\n}.status" });
		addAnnotation(
				getPolicyStatement__JuvenileDataShouldBeUsedWithDocumentOfTypeChildCustodyProvidedByResponsiblePerson__DiagnosticChain_Map(),
				source, new String[] { "body",
						"Tuple {\n\tmessage : String = \'Based on Art8\',\n\tstatus : Boolean = \n\t\t\tif(self.whose = null or not(self.what.actions->exists(action| action = Action::Collecting))) then\n\t\t\t\ttrue\n\t\t\telse if(self.whose.type = PrincipalType::NaturalPerson and self.whose.age < PrivacyPolicy.allInstances()->asSequence()->first().owner.inhabits.legalAgeLimit) then\n\t\t\t\tif(self.how = null or self.whose.responsiblePersons->isEmpty() or self.how.documents->isEmpty() or \n\t\t\t\t\tnot(self.how.documents->exists(document| document.documentType = DocumentType::ChildCustody and self.whose.responsiblePersons->exists(p|p=document.providedBy)))\n\t\t\t\t) then \n\t\t\t\t\tfalse\n\t\t\t\telse\n\t\t\t\t\ttrue\n\t\t\t\tendif\n\t\t\telse\n\t\t\t\ttrue\n\t\t\tendif\n\t\t\tendif\n}.status" });
		addAnnotation(getPolicyStatement__MissingConsentOrTransferCertificate__DiagnosticChain_Map(), source,
				new String[] { "body",
						"Tuple {\n\tmessage : String = \'Based on Arts 44-50\',\n\tstatus : Boolean = \n\t\t\tif(not(self.what.actions->exists(action| action = Action::Transfer))or self.where = null or self.where.destination = null or self.where.destination.isEUMember = true) then\n\t\t\t\ttrue\n\t\t\telse\n\t\t\t\tif((not(self.where.destination = null)) and self.where.destination.isEUMember = false) then\n\t\t\t\t\t(not(self.how = null) and (self.how.documents->exists(doc| doc.documentType = DocumentType::TransferCertificate) or (not(self.how = null) and not(self.how.consent = null)))) or\n\t\t\t\t\t(not(self.why = null) and \n\t\t\t\t\t(self.why.containsAllowedPurposeReasonAndSubreason(ProcessingReason::PublicInterest,Sequence{ProcessingReasonSubtype::Prevention,ProcessingReasonSubtype::Investigation,ProcessingReasonSubtype::Detection,\n\t\t\t\t\tProcessingReasonSubtype::Prosecution, ProcessingReasonSubtype::PreventionOfThreats,ProcessingReasonSubtype::None, ProcessingReasonSubtype::Other}) or\n\t\t\t\t\t\tself.why.containsAllowedPurposeReasonAndSubreason(ProcessingReason::ProtectTheVitalInterestsOfTheDataSubject,Sequence{ProcessingReasonSubtype::PhisicallyIncapable, \n\t\t\t\t\t\t\tProcessingReasonSubtype::Other,ProcessingReasonSubtype::None})))\n\t\t\t\telse\n\t\t\t\t\ttrue\n\t\t\t\tendif\n\t\t\tendif\n}.status" });
		addAnnotation(getPolicyStatement__UndefinedPurposeForAction__DiagnosticChain_Map(), source, new String[] {
				"body",
				"Tuple {\n\tmessage : String = \'Based on Art6\',\n\tstatus : Boolean = \n\t\t\tif(self.whose = null or self.what.actions->exists(act| act = Action::Collecting or act = Action::StopProcessing)) then\n\t\t\t\ttrue\n\t\t\telse\n\t\t\tlet privacyPolicy : PrivacyPolicy = PrivacyPolicy.allInstances()->asSequence()->first() in\n\t\t\t\tself.what.datas->forAll(data|\n\t\t\t\t\tlet statements = privacyPolicy.policyStatements->select(st| \n\t\t\t\t\t\tnot(st.whose = null) and st.whose = self.whose  \n\t\t\t\t\t\tand st.what.actions->exists(act| act = Action::Collecting) and st.what.datas->exists(d| d = data))\n\t\t\t\t\t\tin \n\t\t\t\t\t\tif(statements->isEmpty()) then \n\t\t\t\t\t\t\ttrue\n\t\t\t\t\t\telse\n\t\t\t\t\t\t\tstatements -> forAll(st|\n\t\t\t\t\t\t\t\tif(privacyPolicy.privacyPolicyHelper.areIntervalsOverlap(self.when, st.when)) then\n\t\t\t\t\t\t\t\t\tif(self.why = null) then\n\t\t\t\t\t\t\t\t\t\tfalse\n\t\t\t\t\t\t\t\t\telse\n\t\t\t\t\t\t\t\t\t\t(not(st.whom = null) and (self.who.equals(st.whom) or st.whom.subPrincipals->exists(subprincipal| subprincipal = self.who)) \n\t\t\t\t\t\t\t\t\t\tor self.who.equals(st.who) or privacyPolicy.owner.subPrincipals->exists(subprincipal| subprincipal = self.who))\n\t\t\t\t\t\t\t\t\t\tand (st.why.isValid(self.why) \n\t\t\t\t\t\t\t\t\t\tor \n\t\t\t\t\t\t\t\t\t\tlet reasons = Sequence{ProcessingReason::PublicInterest,ProcessingReason::LegitimateInterests,ProcessingReason::ProtectTheVitalInterestsOfTheDataSubject, ProcessingReason::PublicHealth} in\n\t\t\t\t\t\t\t\t\t\t\treasons->includes(self.why.processingReason) or self.why.subPurposes->exists(subpurpose| reasons->includes(subpurpose))\n\t\t\t\t\t\t\t\t\t\t)\n\t\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\t\telse\n\t\t\t\t\t\t\t\t\tfalse\n\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\t)\n\t\t\t\t\t\tendif\n\t\t\t\t)\n\t\t\tendif\n}.status" });
		addAnnotation(getPolicyStatement__CausedByShouldBeDefinedForRectificationAction__DiagnosticChain_Map(), source,
				new String[] { "body",
						"Tuple {\n\tmessage : String = \'Based on Art16\',\n\tstatus : Boolean = \n\t\t\tcausedByShouldBeDefinedForType(Action::Rectification)\n}.status" });
		addAnnotation(getPolicyStatement__ExpiredDocument__DiagnosticChain_Map(), source, new String[] { "body",
				"\n\t\t\tif(self.how = null or not(self.how.documents->notEmpty())) then\n\t\t\t\ttrue\n\t\t\telse\n\t\t\tlet privacyPolicy : PrivacyPolicy = PrivacyPolicy.allInstances()->asSequence()->first() in\n\t\t\t\tself.how.documents->forAll(document|\n\t\t\t\t\t(privacyPolicy.privacyPolicyHelper.isDateInInterval(self.when, document.startDate) or \n\t\t\t\t\tprivacyPolicy.privacyPolicyHelper.isDateBeforeInterval(self.when, document.startDate))\n\t\t\t\t\tand\n\t\t\t\t\t(document.terminationDate = null or (not(privacyPolicy.privacyPolicyHelper.isDateBeforeInterval(self.when, document.terminationDate))))\n\t\t\t\t)\n\t\t\tendif" });
		addAnnotation(getPolicyStatement__MissingConsentForTransfer__DiagnosticChain_Map(), source, new String[] {
				"body",
				"Tuple {\n\tmessage : String = \'Based on Art20\',\n\tstatus : Boolean = \n\t\t\tif(self.whose = null or not(self.what.actions->exists(action| action = Action::Transfer)) or self.where = null or self.where.destination = null or self.where.destination.isEUMember = false) then\n\t\t\t\ttrue\n\t\t\telse if(self.whose.type= PrincipalType::NaturalPerson and self.whose.age < PrivacyPolicy.allInstances()->asSequence()->first().owner.inhabits.legalAgeLimit) then\n\t\t\t\tnot(self.how = null) and not(self.how.consent = null) and self.whose.responsiblePersons->exists(person| self.how.consent.providedBy)\n\t\t\telse \n\t\t\t\tnot(self.how = null) and not(self.how.consent = null) and (self.how.consent.providedBy = self.whose or self.whose.responsiblePersons->exists(person| self.how.consent.providedBy))\n\t\t\tendif\n\t\t\tendif\n}.status" });
		addAnnotation(getPolicyStatement__CausedByShouldBeDefinedForErasureAction__DiagnosticChain_Map(), source,
				new String[] { "body",
						"Tuple {\n\tmessage : String = \'Based on Art17\',\n\tstatus : Boolean = \n\t\t\tcausedByShouldBeDefinedForType(Action::Erasure)\n}.status" });
		addAnnotation(getPolicyStatement__SubjectShouldBeNotifiedAboutExecutedErasure__DiagnosticChain_Map(), source,
				new String[] { "body",
						"Tuple {\n\tmessage : String = \'Based on Art19\',\n\tstatus : Boolean = \n\t\t\tif(what.actions->exists(action| action = Action::Erasure)) then\n\t\t\t\t\tPrivacyPolicy.allInstances()->asSequence()->first().notifications->exists(notification| notification.causedBy = self and\n\t\t\t\t\t\tnotification.type = NotificationType::ExecutedErasure\n\t\t\t\t\t)\n\t\t\t\telse\n\t\t\t\t\ttrue\n\t\t\tendif\n}.status" });
		addAnnotation(getPolicyStatement__WhomShouldBeDefinedForTransfer__DiagnosticChain_Map(), source, new String[] {
				"body",
				"Tuple {\n\tmessage : String = \'Based on Art20\',\n\tstatus : Boolean = \n\t\t\tif(what.actions->exists(action| action = Action::Transfer)) then\n\t\t\t\t\tnot(self.whom = null)\n\t\t\t\telse\n\t\t\t\t\ttrue\n\t\t\tendif\n}.status" });
		addAnnotation(getPrincipal__Equals__Principal(), source, new String[] { "body",
				"if(self = null) then\n\t\t\t\t\tfalse\n\t\t\t\telse\n\t\t\t\t\tself = observed or self.subPrincipals->exists(principal| principal = observed)\n\t\t\t\tendif" });
		addAnnotation(getPrincipal__NaturalPersonCanNotConatainsSubPrincipals__DiagnosticChain_Map(), source,
				new String[] { "body",
						"\n\t\t\tif(self.type = PrincipalType::NaturalPerson) then\n\t\t\t\tself.subPrincipals->isEmpty()\n\t\t\telse\n\t\t\t\ttrue\n\t\t\tendif" });
		addAnnotation(getPrincipal__JuvenileShouldHaveResponsiblePerson__DiagnosticChain_Map(), source, new String[] {
				"body",
				"Tuple {\n\tmessage : String = \'Based on Art8\',\n\tstatus : Boolean = \n\t\tif(self.type = PrincipalType::NaturalPerson and self.age < PrivacyPolicy.allInstances()->asSequence()->first().owner.inhabits.legalAgeLimit) then\n\t\t\t\tnot(self.responsiblePersons->isEmpty())\n\t\t\telse\n\t\t\t\ttrue\n\t\tendif\n}.status" });
		addAnnotation(getLocation__Equals__Location(), source, new String[] { "body",
				"if(self = observed) then\n\t\t\t\t\t\ttrue\n\t\t\t\t  else \n\t\t\t\t  \tself.subLocations->notEmpty() and self.subLocations->exists(s| s.equals(observed))\n\t\t\t\t  endif" });
		addAnnotation(getTimeInterval__IsTypeDefinedWithOtherType__TimePreposition_TimePreposition(), source,
				new String[] { "body",
						"\n\t\t\t\tif(self.start.preposition = firstPrepositionType) then\n\t\t\t\t\tself.end.preposition = secondPrepositionType\n\t\t\t\telse\n\t\t\t\t\ttrue\n\t\t\t\tendif" });
		addAnnotation(getTimeInterval__IsTypeForbidden__TimePreposition(), source, new String[] { "body",
				"\n\t\t\t\t\tif(self.start.preposition = prepositionType or self.end.preposition = prepositionType) then\n\t\t\t\t\t\tfalse\n\t\t\t\t\telse \n\t\t\t\t\t\ttrue\n\t\t\t\t\tendif" });
		addAnnotation(getTimeInterval__IsValid__TimePreposition_TimePreposition(), source, new String[] { "body",
				"\n\t\t\t\t\tif(self.start.preposition = firstPrepositionType and self.end.preposition = secondPrepositionType) then\n\t\t\t\t\t\tself.start.dateTime < self.end.dateTime\n\t\t\t\t\telse \n\t\t\t\t\t\tif(self.end.preposition = firstPrepositionType and self.start.preposition = secondPrepositionType) then\n\t\t\t\t\t\t\tfalse\n\t\t\t\t\t\telse\n\t\t\t\t\t\t\ttrue\n\t\t\t\t\t\tendif\n\t\t\t\t\tendif" });
		addAnnotation(getTimeInterval__AfterStatementBeforeBeforeStatement__DiagnosticChain_Map(), source,
				new String[] { "body",
						"Tuple {\n\tmessage : String = \'After interval should be defined before before interval\',\n\tstatus : Boolean = \n\t\t\tself.isValid(TimePreposition::after, TimePreposition::before)\n}.status" });
		addAnnotation(getTimeInterval__UntilTypeShouldBeDefinedAlone__DiagnosticChain_Map(), source, new String[] {
				"body",
				"Tuple {\n\tmessage : String = \'Until statement should be defined alone\',\n\tstatus : Boolean = \n\t\t\tself.isTypeForbidden(TimePreposition::until)\n}.status" });
		addAnnotation(getTimeInterval__FromStatementBeforeToStatement__DiagnosticChain_Map(), source, new String[] {
				"body",
				"Tuple {\n\tmessage : String = \'From interval should be defined before to interval\',\n\tstatus : Boolean = \n\t\t\tself.isValid(TimePreposition::from, TimePreposition::to)\n}.status" });
		addAnnotation(getTimeInterval__OnlyFromOrFromWithTo__DiagnosticChain_Map(), source, new String[] { "body",
				"Tuple {\n\tmessage : String = \'From interval should be defined alone or with to interval\',\n\tstatus : Boolean = \n\t\t\tself.isTypeDefinedWithOtherType(TimePreposition::from, TimePreposition::to)\n}.status" });
		addAnnotation(getTimeInterval__OnlyAfterOrAfterWithBefore__DiagnosticChain_Map(), source, new String[] { "body",
				"Tuple {\n\tmessage : String = \'After interval should be defined alone or with before interval\',\n\tstatus : Boolean = \n\t\t\tself.isTypeDefinedWithOtherType(TimePreposition::after, TimePreposition::before)\n}.status" });
		addAnnotation(getTimeInterval__AtTypeShouldBeDefinedAlone__DiagnosticChain_Map(), source, new String[] { "body",
				"Tuple {\n\tmessage : String = \'At statement should be defined alone\',\n\tstatus : Boolean = \n\t\t\tself.isTypeForbidden(TimePreposition::at)\n}.status" });
		addAnnotation(getPurpose__IsValid__Purpose(), source, new String[] { "body",
				"\n\t\t\t\t\tif(self.processingReason = null) then\n\t\t\t\t\t\ttrue\n\t\t\t\t\telse if(self.processingReasonSubtype = null) then\n\t\t\t\t\t\t\t(not(purpose.processingReason = null) and self.processingReason = purpose.processingReason) \n\t\t\t\t\t\t\tor\n\t\t\t\t\t\t\t(self.subPurposes->notEmpty() and self.subPurposes->exists(s| s.isValid(purpose)))\n\t\t\t\t\t\telse\n\t\t\t\t\t\t\t(not(purpose.processingReason = null) and not(purpose.processingReasonSubtype = null) \n\t\t\t\t\t\t\tand self.processingReason = purpose.processingReason and self.processingReasonSubtype = purpose.processingReasonSubtype)\n\t\t\t\t\t\t\tor \n\t\t\t\t\t\t\t(self.subPurposes->notEmpty() and self.subPurposes->exists(s| s.isValid(purpose)))\n\t\t\t\t\t\tendif\n\t\t\t\t\tendif" });
		addAnnotation(getPurpose__IsSubPurposeValid__ProcessingReason_EList(), source, new String[] { "body",
				"if(self.processingReason = null) then\n\t\t\t\t\ttrue\n\t\t\t\t  else \n\t\t\t\t  \tif(self.processingReason = reason) then\n\t\t\t\t  \t\tif(self.processingReasonSubtype = null) then\n\t\t\t\t  \t\t\ttrue\n\t\t\t\t  \t\telse\n\t\t\t\t  \t\t\tsubreasons->exists(r| r = self.processingReasonSubtype)\n\t\t\t\t  \t\tendif\n\t\t\t\t  \telse\n\t\t\t\t  \t\ttrue\n\t\t\t\t  \tendif\n\t\t\t\t  endif" });
		addAnnotation(getPurpose__ContainsAllowedPurposeReasonAndSubreason__ProcessingReason_EList(), source,
				new String[] { "body",
						"allowedReason = self.processingReason and allowedSubreasons->exists(r| r = self.processingReasonSubtype)" });
		addAnnotation(getPurpose__PublicHealthShouldNotContainSubReason__DiagnosticChain_Map(), source, new String[] {
				"body",
				"\n\t\t\t\tisSubPurposeValid(ProcessingReason::PublicHealth, \n\t\t\t\tSequence{ProcessingReasonSubtype::None})" });
		addAnnotation(getPurpose__LegitimateInterestsNotContainSubReason__DiagnosticChain_Map(), source, new String[] {
				"body",
				"\n\t\t\tisSubPurposeValid(ProcessingReason::LegitimateInterests, \n\t\t\t\tSequence{ProcessingReasonSubtype::None})" });
		addAnnotation(getPurpose__StopProcessingInterestShouldNotContainSubReason__DiagnosticChain_Map(), source,
				new String[] { "body",
						"\n\t\t\t\tisSubPurposeValid(ProcessingReason::StopProcessing, \n\t\t\t\tSequence{ProcessingReasonSubtype::None})" });
		addAnnotation(getPurpose__ProfilingShouldNotContainSubReason__DiagnosticChain_Map(), source, new String[] {
				"body",
				"\n\t\t\t\tisSubPurposeValid(ProcessingReason::Profiling, \n\t\t\t\tSequence{ProcessingReasonSubtype::None})" });
		addAnnotation(getPurpose__MarketingShouldNotContainSubReason__DiagnosticChain_Map(), source, new String[] {
				"body",
				"\n\t\t\t\tisSubPurposeValid(ProcessingReason::Marketing, \n\t\t\t\tSequence{ProcessingReasonSubtype::None})" });
		addAnnotation(getPurpose__OutOfScopeCannotContainsThisSubReason__DiagnosticChain_Map(), source, new String[] {
				"body",
				"\n\t\t\tisSubPurposeValid(ProcessingReason::OutOfScope, \n\t\t\t\tSequence{ProcessingReasonSubtype::OutOfEU,\n\t\t\t\t\tProcessingReasonSubtype::PersonalActivity, ProcessingReasonSubtype::SpecialScopeOfActivity, ProcessingReasonSubtype::None,\n\t\t\t\t\tProcessingReasonSubtype::Other\n\t\t\t\t})" });
		addAnnotation(getPurpose__ExercisingSpecificRightsPurposesCannotContainsThisSubReason__DiagnosticChain_Map(),
				source, new String[] { "body",
						"\n\t\t\t\tisSubPurposeValid(ProcessingReason::ExercisingSpecificRights, \n\t\t\t\tSequence{ProcessingReasonSubtype::Employment, ProcessingReasonSubtype::SocialSecurity,ProcessingReasonSubtype::SocialProtection, \n\t\t\t\tProcessingReasonSubtype::None, ProcessingReasonSubtype::Other})" });
		addAnnotation(
				getPurpose__ProtectTheVitalInterestsOfTheDataSubjectCannotContainsThisSubReason__DiagnosticChain_Map(),
				source, new String[] { "body",
						"\n\t\t\tisSubPurposeValid(ProcessingReason::ProtectTheVitalInterestsOfTheDataSubject, \n\t\t\t\tSequence{ProcessingReasonSubtype::PhisicallyIncapable,ProcessingReasonSubtype::LegallyIncapable, ProcessingReasonSubtype::Other, ProcessingReasonSubtype::None})" });
		addAnnotation(getPurpose__PublicInterestCannotContainsThisSubReason__DiagnosticChain_Map(), source,
				new String[] { "body",
						"\n\t\t\t\tisSubPurposeValid(ProcessingReason::PublicInterest, \n\t\t\t\tSequence{ProcessingReasonSubtype::Prevention,ProcessingReasonSubtype::Investigation,ProcessingReasonSubtype::Detection,\n\t\t\t\t\tProcessingReasonSubtype::Prosecution, ProcessingReasonSubtype::PreventionOfThreats,ProcessingReasonSubtype::None, ProcessingReasonSubtype::Other})" });
		addAnnotation(getPurpose__ResearchCannotContainsThisSubReason__DiagnosticChain_Map(), source, new String[] {
				"body",
				"\n\t\t\t\tisSubPurposeValid(ProcessingReason::Research, \n\t\t\t\tSequence{ProcessingReasonSubtype::None, ProcessingReasonSubtype::Other, ProcessingReasonSubtype::Scientific, ProcessingReasonSubtype::Historical,\n\t\t\t\t\tProcessingReasonSubtype::Statistical\n\t\t\t\t})" });
		addAnnotation(getPurpose__StatisticalPurposesShouldNotContainSubReason__DiagnosticChain_Map(), source,
				new String[] { "body",
						"\n\t\t\t\tisSubPurposeValid(ProcessingReason::StatisticalPurposes, \n\t\t\t\tSequence{ProcessingReasonSubtype::None})" });
		addAnnotation(getPurpose__TestingShouldNotContainSubReason__DiagnosticChain_Map(), source, new String[] {
				"body",
				"\n\t\t\t\tisSubPurposeValid(ProcessingReason::Testing, \n\t\t\t\tSequence{ProcessingReasonSubtype::None})" });
		addAnnotation(getHow__IsConsentValid__How(), source, new String[] { "body",
				"\n\t\t\t\t\tif(self.consent = null) then\n\t\t\t\t\t\ttrue\n\t\t\t\t\telse if(howConsent.consent = null) then\n\t\t\t\t\t\tfalse\n\t\t\t\t\telse\n\t\t\t\t\t\tself.consent = howConsent.consent\n\t\t\t\t\tendif\n\t\t\t\t\tendif" });
		addAnnotation(getComplaint__DoesPolicyStatementExists__Action_ComplaintBasedOnDataType(), source, new String[] {
				"body",
				"\t\t \t\n\t\t\tlet privacyPolicy : PrivacyPolicy = PrivacyPolicy.allInstances()->asSequence()->first() in\n\t\t\t\tif(not(self.action.oclIsKindOf(ComplaintBasedOnData))) then\n\t\t\t\t\ttrue\n\t\t\t\telse\n\t\t\t\tlet basedOnData : ComplaintBasedOnData = self.action.oclAsType(ComplaintBasedOnData) in\n\t\t\t\tif(basedOnData.type = type) then\n\t\t\t\t\tif(not(basedOnData.denialReason = null) or not(basedOnData.status = ComplaintStatus::Pending)) then\n\t\t\t\t\t\ttrue\n\t\t\t\t\telse\n\t\t\t\t\tbasedOnData.subject->forAll(data: PrivacyData|\n\t\t\t\t\t\tprivacyPolicy.policyStatements->exists(stmt| stmt.what.actions->exists(action| action = actionType) and \n\t\t\t\t\t\t\tnot(stmt.whose = null) and stmt.whose = self.who and privacyPolicy.privacyPolicyHelper.isDateBeforeInterval(stmt.when, self.when) \n\t\t\t\t\t\t\tand stmt.what.datas->exists(selectedData| selectedData.privacydata = data) and not(stmt.causedBy = null) and stmt.causedBy = self)\n\t\t\t\t\t)\n\t\t\t\t\tendif\n\t\t\t\telse\n\t\t\t\t\ttrue\n\t\t\t\tendif\n\t\t\t  endif" });
		addAnnotation(getComplaint__CannotIdentifyDataFromComplaint__DiagnosticChain_Map(), source, new String[] {
				"body",
				"Tuple {\n\tmessage : String = \'Based on Art11\',\n\tstatus : Boolean = \n\t\t\tlet privacyPolicy : PrivacyPolicy = PrivacyPolicy.allInstances()->asSequence()->first() in\n\t\t\tif(not(self.action.oclIsKindOf(ComplaintBasedOnData))) then\n\t\t\t\ttrue\n\t\t\telse\n\t\t\tlet basedOnData : ComplaintBasedOnData = self.action.oclAsType(ComplaintBasedOnData) in\n\t\t\t\t\tbasedOnData.subject->forAll(data: PrivacyData|\n\t\t\t\t\tprivacyPolicy.policyStatements->exists(stmt| stmt.what.actions->exists(action| action = Action::Collecting) and \n\t\t\t\t\t\tnot(stmt.whose = null) and (stmt.whose = self.who or stmt.whose.responsiblePersons->exists(rp| rp = self.who))\n\t\t\t\t\t\tand privacyPolicy.privacyPolicyHelper.isDateAfterInterval(stmt.when, self.when) \n\t\t\t\t\t\tand stmt.what.datas->exists(selectedData| selectedData.privacydata = data)\n\t\t\t\t\t)\n\t\t\t\t)\n\t\t  endif\n}.status" });
		addAnnotation(getComplaint__StopProcessingShouldBeExecutedAsSoonAsPossible__DiagnosticChain_Map(), source,
				new String[] { "body",
						"Tuple {\n\tmessage : String = \'Based on Art21\',\n\tstatus : Boolean = \n\t\t\tlet privacyPolicy : PrivacyPolicy = PrivacyPolicy.allInstances()->asSequence()->first() in\n\t\t\t\tif(not(self.action.oclIsKindOf(ComplaintBasedOnAction))) then\n\t\t\t\t\ttrue\n\t\t\t\telse\n\t\t\t\tlet basedOnAction : ComplaintBasedOnAction = self.action.oclAsType(ComplaintBasedOnAction) in\n\t\t\t\t\tif(not(basedOnAction.denialReason = null)) then\n\t\t\t\t\t\ttrue\n\t\t\t\t\telse\n\t\t\t\t\t\tprivacyPolicy.policyStatements->exists(stmt| stmt.what.actions->exists(action| action = Action::StopProcessing) and \n\t\t\t\t\t\t\tnot(stmt.causedBy = null) and stmt.causedBy = self)\n\t\t\t\t\tendif\n\t\t\t  endif\n}.status" });
		addAnnotation(getComplaint__UserDoesntHavePermissionToWithdrawConsent__DiagnosticChain_Map(), source,
				new String[] { "body",
						"Tuple {\n\tmessage : String = \'Based on Art7\',\n\tstatus : Boolean = \n\t\t\tif(not(self.action.oclIsKindOf(Withdraw))) then\n\t\t\t\t\ttrue\n\t\t\telse\n\t\t\t\tlet withdraw : Withdraw = self.action.oclAsType(Withdraw) in\n\t\t\t\t\tself.who = withdraw.subject.providedBy or  withdraw.subject.providedBy.responsiblePersons->exists(rp| rp = self.who)\n\t\t\tendif\n}.status" });
		addAnnotation(getComplaint__ErasureShouldBeExecutedAsSoonAsPossible__DiagnosticChain_Map(), source,
				new String[] { "body",
						"Tuple {\n\tmessage : String = \'Based on Art17\',\n\tstatus : Boolean = \n\t\t\tdoesPolicyStatementExists(Action::Erasure,ComplaintBasedOnDataType::Erasure)\n}.status" });
		addAnnotation(getComplaint__SubjectShouldBeNotifiedAboutExistingComplaintForErasure__DiagnosticChain_Map(),
				source, new String[] { "body",
						"Tuple {\n\tmessage : String = \'Based on Art19\',\n\tstatus : Boolean = \n\t\t\tif(self.action.oclIsKindOf(ComplaintBasedOnData)) then\n\t\t\t\tlet basedOnData : ComplaintBasedOnData = self.action.oclAsType(ComplaintBasedOnData) in\n\t\t\t\t\tif(basedOnData.type = ComplaintBasedOnDataType::Erasure)then\n\t\t\t\t\t\tPrivacyPolicy.allInstances()->asSequence()->first().notifications->exists(notification| notification.causedBy = self and\n\t\t\t\t\t\t\tnotification.type = NotificationType::Erasure\n\t\t\t\t\t\t)\n\t\t\t\t\telse\n\t\t\t\t\t\ttrue\n\t\t\t\t\tendif\n\t\t\t\telse\n\t\t\t\t\ttrue\n\t\t\tendif\n}.status" });
		addAnnotation(getComplaint__RectificationShouldBeExecutedAsSoonAsPossible__DiagnosticChain_Map(), source,
				new String[] { "body",
						"Tuple {\n\tmessage : String = \'Based on Art16\',\n\tstatus : Boolean = \n\t\t\tdoesPolicyStatementExists(Action::Rectification,ComplaintBasedOnDataType::Rectification)\n}.status" });
		addAnnotation(getComplaint__InvalidTypeOfPurposeForAnObject__DiagnosticChain_Map(), source, new String[] {
				"body",
				"Tuple {\n\tmessage : String = \'Based on Art21\',\n\tstatus : Boolean = \n\t\t\tif(not(self.action.oclIsKindOf(ComplaintBasedOnAction))) then\n\t\t\t\t\ttrue\n\t\t\telse\n\t\t\t\tlet basedOnAction : ComplaintBasedOnAction = self.action.oclAsType(ComplaintBasedOnAction) in\n\t\t\t\tif(basedOnAction.statement.why = null or not(basedOnAction.denialReason = null)) then\n\t\t\t\t\t\ttrue\n\t\t\t\telse\n\t\t\t\t\t(not(basedOnAction.statement.why.containsAllowedPurposeReasonAndSubreason(ProcessingReason::PublicInterest,\n\t\t\t\t\tSequence{ProcessingReasonSubtype::Prevention,ProcessingReasonSubtype::Investigation,ProcessingReasonSubtype::Detection,\n\t\t\t\t\tProcessingReasonSubtype::Prosecution, ProcessingReasonSubtype::PreventionOfThreats,ProcessingReasonSubtype::None, ProcessingReasonSubtype::Other}))) \n\t\t\t\t\tand\n\t\t\t\t\t(basedOnAction.statement.why.containsAllowedPurposeReasonAndSubreason(ProcessingReason::Marketing,Sequence{ProcessingReasonSubtype::None})\n\t\t\t\t\tor\n\t\t\t\t\tbasedOnAction.statement.why.containsAllowedPurposeReasonAndSubreason(ProcessingReason::Profiling,Sequence{ProcessingReasonSubtype::None}))\n\t\t\t\tendif\n\t\t\tendif\n}.status" });
		addAnnotation(getComplaint__UserDoesntHavePermissionToComplaint__DiagnosticChain_Map(), source, new String[] {
				"body",
				"Tuple {\n\tmessage : String = \'Based on Art21\',\n\tstatus : Boolean = \n\t\t\tif(not(self.action.oclIsKindOf(ComplaintBasedOnAction))) then\n\t\t\t\t\ttrue\n\t\t\telse\n\t\t\t\tlet basedOnAction : ComplaintBasedOnAction = self.action.oclAsType(ComplaintBasedOnAction) in\n\t\t\t\t\tnot(basedOnAction.statement.whose = null) \n\t\t\t\t\tand \n\t\t\t\t\t(basedOnAction.statement.whose = self.who or basedOnAction.statement.whose.responsiblePersons->exists(rp| rp = self.who))\n\t\t\tendif\n}.status" });
		addAnnotation(getComplaint__SubjectShouldBeNotifiedAboutWithdraw__DiagnosticChain_Map(), source, new String[] {
				"body",
				"Tuple {\n\tmessage : String = \'Based on Art19\',\n\tstatus : Boolean = \n\t\t\tif(self.action.oclIsKindOf(Withdraw)) then\n\t\t\t\t\tPrivacyPolicy.allInstances()->asSequence()->first().notifications->exists(notification| notification.causedBy = self and \n\t\t\t\t\t\tnotification.type = NotificationType::Withdraw\n\t\t\t\t\t)\n\t\t\t\telse\n\t\t\t\t\ttrue\n\t\t\tendif\n}.status" });
		addAnnotation(
				getComplaint__SubjectShouldBeNotifiedAboutExistingComplaintForRectification__DiagnosticChain_Map(),
				source, new String[] { "body",
						"Tuple {\n\tmessage : String = \'Based on Art19\',\n\tstatus : Boolean = \n\t\t\tif(self.action.oclIsKindOf(ComplaintBasedOnData)) then\n\t\t\t\tlet basedOnData : ComplaintBasedOnData = self.action.oclAsType(ComplaintBasedOnData) in\n\t\t\t\t\tif(basedOnData.type = ComplaintBasedOnDataType::Rectification)then\n\t\t\t\t\t\tPrivacyPolicy.allInstances()->asSequence()->first().notifications->exists(notification| notification.causedBy = self and\n\t\t\t\t\t\t\tnotification.type = NotificationType::Rectification\n\t\t\t\t\t\t)\n\t\t\t\t\telse\n\t\t\t\t\t\ttrue\n\t\t\t\t\tendif\n\t\t\t\telse\n\t\t\t\t\ttrue\n\t\t\tendif\n}.status" });
		addAnnotation(getPrivacyPolicyHelper__IsPolicyControlValid__String(), source, new String[] { "body",
				"PrivacyPolicy.allInstances()->asSequence()->first().configurationManager.protectionControlMethods->exists(q | q = policyControl)" });
		addAnnotation(getPrivacyPolicyHelper__IsDataSourceValid__String(), source, new String[] { "body",
				"PrivacyPolicy.allInstances()->asSequence()->first().configurationManager.dataSources->exists(q | q = dataSource)" });
		addAnnotation(getPrivacyPolicyHelper__AreIntervalsOverlap__AbstractTime_AbstractTime(), source, new String[] {
				"body",
				"if(time2.oclIsKindOf(TimeStatement)) then\n\t\t\t\t\tlet timestmt : TimeStatement = time2.oclAsType(TimeStatement) in \n\t\t\t\t\tif(timestmt.preposition = TimePreposition::from or timestmt.preposition = TimePreposition::after or timestmt.preposition = TimePreposition::at) then\n\t\t\t\t\t\tareDatesOverlap(time1, timestmt.dateTime)\n\t\t\t\t\telse\n\t\t\t\t\t\tnot(areDatesOverlap(time1, timestmt.dateTime))\n\t\t\t\t\tendif\n\t\t\t\t  else\n\t\t\t\t\tlet interval : TimeInterval = time2.oclAsType(TimeInterval) in\n\t\t\t  \t\tif(interval.start.preposition = TimePreposition::from or interval.start.preposition = TimePreposition::after or interval.start.preposition = TimePreposition::at) then\n\t\t\t\t\t\tareDatesOverlap(time1, interval.start.dateTime) and (not(areDatesOverlap(time1,interval.end.dateTime)))\n\t\t\t\t\telse\n\t\t\t\t\t\tnot(areDatesOverlap(time1, interval.start.dateTime)) and areDatesOverlap(time1, interval.end.dateTime)\n\t\t\t\t\tendif\n\t\t\t\t  endif" });
		addAnnotation(getPrivacyPolicyHelper__AreDatesOverlap__AbstractTime_Date(), source, new String[] { "body",
				"\n\t\t\t\tif(time.oclIsKindOf(TimeStatement)) then\n\t\t\t\tlet timestmt : TimeStatement = time.oclAsType(TimeStatement) in \n\t\t\t\t\tif(timestmt.preposition = TimePreposition::from or timestmt.preposition = TimePreposition::after or timestmt.preposition = TimePreposition::at) then\n\t\t\t\t\t\tnot(timestmt.dateTime < date)\n\t\t\t\t\telse \n\t\t\t\t\t\tnot(timestmt.dateTime > date)\n\t\t\t\t\tendif\n\t\t\t\telse\n\t\t\t\tlet interval : TimeInterval = time.oclAsType(TimeInterval) in\n\t\t\t\t\tif(interval.start.preposition = TimePreposition::from or interval.start.preposition = TimePreposition::after) then\n\t\t\t\t\t\tnot(interval.start.dateTime < date) and (not(interval.end.dateTime < date))\n\t\t\t\t\telse \n\t\t\t\t\t\tnot(interval.start.dateTime > date) and (not(interval.end.dateTime > date))\n\t\t\t\t\tendif\n\t\t\t\tendif" });
		addAnnotation(getPrivacyPolicyHelper__DoesIntervalStartBeforeInterval__AbstractTime_AbstractTime(), source,
				new String[] { "body",
						"if(startInterval.oclIsKindOf(TimeStatement)) then\n\t\t\t\t\tlet timestmt : TimeStatement = startInterval.oclAsType(TimeStatement) in \n\t\t\t\t\tif(timestmt.preposition = TimePreposition::from or timestmt.preposition = TimePreposition::after or timestmt.preposition = TimePreposition::at) then\n\t\t\t\t\t\tisDateBeforeInterval(finishInterval, timestmt.dateTime)\n\t\t\t\t\telse\n\t\t\t\t\t\tnot(isDateBeforeInterval(finishInterval, timestmt.dateTime))\n\t\t\t\t\tendif\n\t\t\t\t  else\n\t\t\t\t\tlet interval : TimeInterval = startInterval.oclAsType(TimeInterval) in\n\t\t\t  \t\tif(interval.start.preposition = TimePreposition::from or interval.start.preposition = TimePreposition::after or interval.start.preposition = TimePreposition::at) then\n\t\t\t\t\t\tisDateBeforeInterval(finishInterval, interval.start.dateTime) and not(isDateBeforeInterval(finishInterval, interval.end.dateTime))\n\t\t\t\t\telse\n\t\t\t\t\t\tnot(isDateBeforeInterval(finishInterval, interval.start.dateTime)) and isDateBeforeInterval(finishInterval, interval.end.dateTime)\n\t\t\t\t\tendif\n\t\t\t\t  endif" });
		addAnnotation(getPrivacyPolicyHelper__IsDateBeforeInterval__AbstractTime_Date(), source, new String[] { "body",
				"\n\t\t\t\tif(time.oclIsKindOf(TimeStatement)) then\n\t\t\t\tlet timestmt : TimeStatement = time.oclAsType(TimeStatement) in \n\t\t\t\t\tif(timestmt.preposition = TimePreposition::from or timestmt.preposition = TimePreposition::after or timestmt.preposition = TimePreposition::at) then\n\t\t\t\t\t\tdate < timestmt.dateTime\n\t\t\t\t\telse \n\t\t\t\t\t\ttimestmt.dateTime < date\n\t\t\t\t\tendif\n\t\t\t\telse\n\t\t\t\t\tlet interval : TimeInterval = time.oclAsType(TimeInterval) in\n\t\t\t\t\tif(interval.start.preposition = TimePreposition::from or interval.start.preposition = TimePreposition::after) then\n\t\t\t\t\t\tif(interval.start.dateTime < interval.end.dateTime) then\n\t\t\t\t\t\t\tinterval.start.dateTime > date and interval.end.dateTime > date\n\t\t\t\t\t\telse\n\t\t\t\t\t\t\tfalse\n\t\t\t\t\t\tendif\n\t\t\t\t\telse \n\t\t\t\t\t\tif(interval.end.dateTime < interval.start.dateTime) then\n\t\t\t\t\t\t\tinterval.start.dateTime > date and interval.end.dateTime > date\n\t\t\t\t\t\telse\n\t\t\t\t\t\t\tfalse\n\t\t\t\t\t\tendif\n\t\t\t\t\tendif\n\t\t\t\tendif" });
		addAnnotation(getPrivacyPolicyHelper__IsDateAfterInterval__AbstractTime_Date(), source, new String[] { "body",
				"\n\t\t\t\tif(time.oclIsKindOf(TimeStatement)) then\n\t\t\t\t\tlet timestmt : TimeStatement = time.oclAsType(TimeStatement) in \n\t\t\t\t\tif(timestmt.preposition = TimePreposition::to or timestmt.preposition = TimePreposition::before or timestmt.preposition = TimePreposition::until) then\n\t\t\t\t\t\ttimestmt.dateTime > date\n\t\t\t\t\telse \n\t\t\t\t\t\ttimestmt.dateTime < date\n\t\t\t\t\tendif\n\t\t\t\telse\n\t\t\t\t\tlet interval : TimeInterval = time.oclAsType(TimeInterval) in\n\t\t\t\t\tif(interval.start.preposition = TimePreposition::from or interval.start.preposition = TimePreposition::after) then\n\t\t\t\t\t\tif(interval.start.dateTime < interval.end.dateTime) then\n\t\t\t\t\t\t\tinterval.start.dateTime < date and interval.end.dateTime < date\n\t\t\t\t\t\telse\n\t\t\t\t\t\t\tfalse\n\t\t\t\t\t\tendif\n\t\t\t\t\telse \n\t\t\t\t\t\tif(interval.end.dateTime < interval.start.dateTime) then\n\t\t\t\t\t\t\tinterval.start.dateTime < date and interval.end.dateTime < date\n\t\t\t\t\t\telse\n\t\t\t\t\t\t\tfalse\n\t\t\t\t\t\tendif\n\t\t\t\t\tendif\n\t\t\t\tendif" });
		addAnnotation(getPrivacyPolicyHelper__IsDateInInterval__AbstractTime_Date(), source, new String[] { "body",
				"\n\t\t\t\tif(time.oclIsKindOf(TimeStatement)) then\n\t\t\t\t\tlet timestmt : TimeStatement = time.oclAsType(TimeStatement) in \n\t\t\t\t\tif(timestmt.preposition = TimePreposition::at) then\n\t\t\t\t\t\ttimestmt.dateTime = date\n\t\t\t\t\telse if(timestmt.preposition = TimePreposition::to or timestmt.preposition = TimePreposition::before or timestmt.preposition = TimePreposition::until) then\n\t\t\t\t\t\t\tnot(timestmt.dateTime > date)\n\t\t\t\t\t\telse \n\t\t\t\t\t\t\tnot(timestmt.dateTime < date)\n\t\t\t\t\t\tendif\n\t\t\t\t\tendif\n\t\t\t\telse\n\t\t\t\t\tlet interval : TimeInterval = time.oclAsType(TimeInterval) in \n\t\t\t\t\tif(interval.start.preposition = TimePreposition::from or interval.start.preposition = TimePreposition::after) then\n\t\t\t\t\t\tif(interval.start.dateTime < interval.end.dateTime) then\n\t\t\t\t\t\t\tnot(interval.start.dateTime < date) and not(interval.end.dateTime > date)\n\t\t\t\t\t\telse\n\t\t\t\t\t\t\tnot(date < interval.end.dateTime) and not(date > interval.start.dateTime)\n\t\t\t\t\t\tendif\n\t\t\t\t\telse \n\t\t\t\t\t\tif(interval.end.dateTime < interval.start.dateTime) then\n\t\t\t\t\t\t\tnot(interval.end.dateTime < date) and not(interval.start.dateTime > date)\n\t\t\t\t\t\telse\n\t\t\t\t\t\t\tnot(date < interval.start.dateTime) and not(date > interval.end.dateTime)\n\t\t\t\t\t\tendif\n\t\t\t\t\tendif\n\t\t\t\tendif" });
		addAnnotation(getWhere__Equals__Where(), source, new String[] { "body",
				"\n\t\t\t\t\tif(self.source = null) then\n\t\t\t\t\t\tif(self.destination = null) then\n\t\t\t\t\t\t\ttrue\n\t\t\t\t\t\telse\n\t\t\t\t\t\t\tif(observed.destination = null) then\n\t\t\t\t\t\t\t\tfalse\n\t\t\t\t\t\t\telse\n\t\t\t\t\t\t\t\tself.destination.equals(observed.destination)\n\t\t\t\t\t\t\tendif\n\t\t\t\t\t\tendif\n\t\t\t\t\t\n\t\t\t\t\telse\n\t\t\t\t\t\tif(self.destination = null) then\n\t\t\t\t\t\t\tif(observed.source = null) then\n\t\t\t\t\t\t\t\tfalse\n\t\t\t\t\t\t\telse\n\t\t\t\t\t\t\t\tself.source.equals(observed.source)\n\t\t\t\t\t\t\tendif\n\t\t\t\t\t\telse\n\t\t\t\t\t\t\tif(observed.destination = null) then\n\t\t\t\t\t\t\t\tfalse\n\t\t\t\t\t\t\telse\n\t\t\t\t\t\t\t\tif(observed.source = null) then\n\t\t\t\t\t\t\t\tfalse\n\t\t\t\t\t\t\telse\n\t\t\t\t\t\t\t\tself.source.equals(observed.source) and self.destination.equals(observed.destination)\n\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\tendif\n\t\t\t\t\t\tendif\n\t\t\t\t\tendif" });
		addAnnotation(getAbstractPaper__StartDateShouldBeBeforeTerminationDate__DiagnosticChain_Map(), source,
				new String[] { "body",
						"Tuple {\n\tmessage : String = \'Terminationdate is after startdate!\',\n\tstatus : Boolean = \n\t\t\tself.terminationDate = null or (not(self.startDate > self.terminationDate))\n}.status" });
		addAnnotation(getSharedPrivacyData__ProtectionControlShouldExistsInConfiguration__DiagnosticChain_Map(), source,
				new String[] { "body",
						"Tuple {\n\tmessage : String = \'Protection controls should be defined in configuration.\',\n\tstatus : Boolean = \n\t\t\tself.additionalProtectionControls->forAll(protectionControl:String|\n\t\t\t\tPrivacyPolicy.allInstances()->asSequence()->first().privacyPolicyHelper.isPolicyControlValid(protectionControl)\n\t\t\t)\n}.status" });
		addAnnotation(getSharedPrivacyData__DataSourceShouldExistsInConfiguration__DiagnosticChain_Map(), source,
				new String[] { "body",
						"Tuple {\n\tmessage : String = \'Data source should be defined in configuration.\',\n\tstatus : Boolean = \n\t\t\tself.dataSource = null or PrivacyPolicy.allInstances()->asSequence()->first().privacyPolicyHelper.isDataSourceValid(self.dataSource)\n}.status" });
		addAnnotation(getNotification__ShouldDefineCausedByAsErasure__DiagnosticChain_Map(), source, new String[] {
				"body",
				"Tuple {\n\tmessage : String = \'NotifyAboutErasure should contain causedBy with complaint Erasure\',\n\tstatus : Boolean = \n\t\t\tif(type = NotificationType::Erasure) then\n\t\t\t\tif(causedBy.oclIsKindOf(Complaint)) then\n\t\t\t\t\tlet complaint : Complaint = causedBy.oclAsType(Complaint) in\n\t\t\t\t\tif(complaint.action.oclIsKindOf(ComplaintBasedOnData)) then\n\t\t\t\t\t\tlet basedOnData : ComplaintBasedOnData = complaint.action.oclAsType(ComplaintBasedOnData) in\n\t\t\t\t\t\tbasedOnData.type = ComplaintBasedOnDataType::Erasure\n\t\t\t\t\telse\n\t\t\t\t\t\tfalse\n\t\t\t\t\tendif\n\t\t\t\telse\n\t\t\t\t\tfalse\n\t\t\t\tendif\n\t\t\telse\n\t\t\t\ttrue\n\t\t\tendif\n}.status" });
		addAnnotation(getNotification__ShouldDefineCausedByAsPrivacyPolicy__DiagnosticChain_Map(), source,
				new String[] { "body",
						"Tuple {\n\tmessage : String = \'NotifyAboutCollecting or StopProcessing should contain causedBy with policy statement\',\n\tstatus : Boolean = \n\t\t\tif(type = NotificationType::DataCollecting or type = NotificationType::StopProcessing \n\t\t\t\tor type = NotificationType::ExecutedRectification or type = NotificationType::ExecutedErasure\n\t\t\t) then\n\t\t\t\tcausedBy.oclIsKindOf(PolicyStatement)\n\t\t\telse\n\t\t\t\ttrue\n\t\t\tendif\n}.status" });
		addAnnotation(getNotification__ShouldDefineCausedByAsWithdraw__DiagnosticChain_Map(), source, new String[] {
				"body",
				"Tuple {\n\tmessage : String = \'NotifyAboutWithdraw should contain causedBy with complaint Withraw\',\n\tstatus : Boolean = \n\t\t\tif(type = NotificationType::Withdraw) then\n\t\t\t\tif(causedBy.oclIsKindOf(Complaint)) then\n\t\t\t\t\tlet complaint : Complaint = causedBy.oclAsType(Complaint) in\n\t\t\t\t\tcomplaint.action.oclIsKindOf(Withdraw)\n\t\t\t\telse\n\t\t\t\t\tfalse\n\t\t\t\tendif\n\t\t\telse\n\t\t\t\ttrue\n\t\t\tendif\n}.status" });
		addAnnotation(getNotification__ShouldDefineCausedByAsRectification__DiagnosticChain_Map(), source,
				new String[] { "body",
						"Tuple {\n\tmessage : String = \'NotifyAboutRectification should contain causedBy with complaint Rectification\',\n\tstatus : Boolean = \n\t\t\tif(type = NotificationType::Rectification) then\n\t\t\t\tif(causedBy.oclIsKindOf(Complaint)) then\n\t\t\t\t\tlet complaint : Complaint = causedBy.oclAsType(Complaint) in\n\t\t\t\t\tif(complaint.action.oclIsKindOf(ComplaintBasedOnData)) then\n\t\t\t\t\t\tlet basedOnData : ComplaintBasedOnData = complaint.action.oclAsType(ComplaintBasedOnData) in\n\t\t\t\t\t\tbasedOnData.type = ComplaintBasedOnDataType::Rectification\n\t\t\t\t\telse\n\t\t\t\t\t\tfalse\n\t\t\t\t\tendif\n\t\t\t\telse\n\t\t\t\t\tfalse\n\t\t\t\tendif\n\t\t\telse\n\t\t\t\ttrue\n\t\t\tendif\n}.status" });
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";
		addAnnotation(getPolicyStatement_When(), source, new String[] { "name", "when" });
	}

} //PrivacyModelPackageImpl
