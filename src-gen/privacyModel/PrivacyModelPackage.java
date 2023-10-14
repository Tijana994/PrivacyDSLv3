/**
 */
package privacyModel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see privacyModel.PrivacyModelFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface PrivacyModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "privacyModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://privacymodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "privacyModel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PrivacyModelPackage eINSTANCE = privacyModel.impl.PrivacyModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link privacyModel.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see privacyModel.impl.NamedElementImpl
	 * @see privacyModel.impl.PrivacyModelPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link privacyModel.impl.PrivacyPolicyImpl <em>Privacy Policy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see privacyModel.impl.PrivacyPolicyImpl
	 * @see privacyModel.impl.PrivacyModelPackageImpl#getPrivacyPolicy()
	 * @generated
	 */
	int PRIVACY_POLICY = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVACY_POLICY__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Policy Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVACY_POLICY__POLICY_STATEMENTS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVACY_POLICY__OWNER = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>All Principals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVACY_POLICY__ALL_PRINCIPALS = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVACY_POLICY__LOCATIONS = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Default Protection Controls</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVACY_POLICY__DEFAULT_PROTECTION_CONTROLS = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>All Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVACY_POLICY__ALL_SERVICES = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>All Providers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVACY_POLICY__ALL_PROVIDERS = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Configuration Manager</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVACY_POLICY__CONFIGURATION_MANAGER = NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>All Datas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVACY_POLICY__ALL_DATAS = NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>All Complaints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVACY_POLICY__ALL_COMPLAINTS = NAMED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Privacy Policy Helper</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVACY_POLICY__PRIVACY_POLICY_HELPER = NAMED_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>All Denials</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVACY_POLICY__ALL_DENIALS = NAMED_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>All Consents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVACY_POLICY__ALL_CONSENTS = NAMED_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>All Documents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVACY_POLICY__ALL_DOCUMENTS = NAMED_ELEMENT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Notifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVACY_POLICY__NOTIFICATIONS = NAMED_ELEMENT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>All Shared Privacy Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVACY_POLICY__ALL_SHARED_PRIVACY_DATA = NAMED_ELEMENT_FEATURE_COUNT + 15;

	/**
	 * The number of structural features of the '<em>Privacy Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVACY_POLICY_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 16;

	/**
	 * The operation id for the '<em>Unique Provider Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVACY_POLICY___UNIQUE_PROVIDER_NAME__DIAGNOSTICCHAIN_MAP = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Unique Consent Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVACY_POLICY___UNIQUE_CONSENT_NAME__DIAGNOSTICCHAIN_MAP = NAMED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Unique Service Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVACY_POLICY___UNIQUE_SERVICE_NAME__DIAGNOSTICCHAIN_MAP = NAMED_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Owner Should Have Defined Inhabits</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVACY_POLICY___OWNER_SHOULD_HAVE_DEFINED_INHABITS__DIAGNOSTICCHAIN_MAP = NAMED_ELEMENT_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Unique Policy Statement Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVACY_POLICY___UNIQUE_POLICY_STATEMENT_NAME__DIAGNOSTICCHAIN_MAP = NAMED_ELEMENT_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Protection Control Should Exists In Configuration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVACY_POLICY___PROTECTION_CONTROL_SHOULD_EXISTS_IN_CONFIGURATION__DIAGNOSTICCHAIN_MAP = NAMED_ELEMENT_OPERATION_COUNT
			+ 5;

	/**
	 * The operation id for the '<em>Unique Privacy Data Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVACY_POLICY___UNIQUE_PRIVACY_DATA_NAME__DIAGNOSTICCHAIN_MAP = NAMED_ELEMENT_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Unique Document Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVACY_POLICY___UNIQUE_DOCUMENT_NAME__DIAGNOSTICCHAIN_MAP = NAMED_ELEMENT_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Unique Location Per Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVACY_POLICY___UNIQUE_LOCATION_PER_TYPE__DIAGNOSTICCHAIN_MAP = NAMED_ELEMENT_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Unique Principal Name Per Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVACY_POLICY___UNIQUE_PRINCIPAL_NAME_PER_TYPE__DIAGNOSTICCHAIN_MAP = NAMED_ELEMENT_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Unique Complaint Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVACY_POLICY___UNIQUE_COMPLAINT_NAME__DIAGNOSTICCHAIN_MAP = NAMED_ELEMENT_OPERATION_COUNT + 10;

	/**
	 * The number of operations of the '<em>Privacy Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVACY_POLICY_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 11;

	/**
	 * The meta object id for the '{@link privacyModel.impl.NotificationInfoImpl <em>Notification Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see privacyModel.impl.NotificationInfoImpl
	 * @see privacyModel.impl.PrivacyModelPackageImpl#getNotificationInfo()
	 * @generated
	 */
	int NOTIFICATION_INFO = 27;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_INFO__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Notification Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_INFO_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Notification Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_INFO_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link privacyModel.impl.PolicyStatementImpl <em>Policy Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see privacyModel.impl.PolicyStatementImpl
	 * @see privacyModel.impl.PrivacyModelPackageImpl#getPolicyStatement()
	 * @generated
	 */
	int POLICY_STATEMENT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_STATEMENT__NAME = NOTIFICATION_INFO__NAME;

	/**
	 * The feature id for the '<em><b>When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_STATEMENT__WHEN = NOTIFICATION_INFO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Who</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_STATEMENT__WHO = NOTIFICATION_INFO_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Why</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_STATEMENT__WHY = NOTIFICATION_INFO_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>What</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_STATEMENT__WHAT = NOTIFICATION_INFO_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>How</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_STATEMENT__HOW = NOTIFICATION_INFO_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Whose</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_STATEMENT__WHOSE = NOTIFICATION_INFO_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Whom</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_STATEMENT__WHOM = NOTIFICATION_INFO_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Where</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_STATEMENT__WHERE = NOTIFICATION_INFO_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Caused By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_STATEMENT__CAUSED_BY = NOTIFICATION_INFO_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Policy Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_STATEMENT_FEATURE_COUNT = NOTIFICATION_INFO_FEATURE_COUNT + 9;

	/**
	 * The operation id for the '<em>Date Should Be Defined For Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_STATEMENT___DATE_SHOULD_BE_DEFINED_FOR_TYPE__ACTION = NOTIFICATION_INFO_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Caused By Should Be Defined For Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_STATEMENT___CAUSED_BY_SHOULD_BE_DEFINED_FOR_TYPE__ACTION = NOTIFICATION_INFO_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Document Is Needed For Purpose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_STATEMENT___DOCUMENT_IS_NEEDED_FOR_PURPOSE__DOCUMENTTYPE_PROCESSINGREASON = NOTIFICATION_INFO_OPERATION_COUNT
			+ 2;

	/**
	 * The operation id for the '<em>Subject Should Be Notified About Transfer To Third Country</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_STATEMENT___SUBJECT_SHOULD_BE_NOTIFIED_ABOUT_TRANSFER_TO_THIRD_COUNTRY__DIAGNOSTICCHAIN_MAP = NOTIFICATION_INFO_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Subject Should Be Notified About Executed Rectification</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_STATEMENT___SUBJECT_SHOULD_BE_NOTIFIED_ABOUT_EXECUTED_RECTIFICATION__DIAGNOSTICCHAIN_MAP = NOTIFICATION_INFO_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Subject Should Be Notified About Stop Processing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_STATEMENT___SUBJECT_SHOULD_BE_NOTIFIED_ABOUT_STOP_PROCESSING__DIAGNOSTICCHAIN_MAP = NOTIFICATION_INFO_OPERATION_COUNT
			+ 5;

	/**
	 * The operation id for the '<em>Controller Approval Is Need For Protect The Vital Interests Of The Data Subject Purpose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_STATEMENT___CONTROLLER_APPROVAL_IS_NEED_FOR_PROTECT_THE_VITAL_INTERESTS_OF_THE_DATA_SUBJECT_PURPOSE__DIAGNOSTICCHAIN_MAP = NOTIFICATION_INFO_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Missing Consent For Collecting</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_STATEMENT___MISSING_CONSENT_FOR_COLLECTING__DIAGNOSTICCHAIN_MAP = NOTIFICATION_INFO_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Expired Consent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_STATEMENT___EXPIRED_CONSENT__DIAGNOSTICCHAIN_MAP = NOTIFICATION_INFO_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Stop Processing Purpose For Action Stop Processing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_STATEMENT___STOP_PROCESSING_PURPOSE_FOR_ACTION_STOP_PROCESSING__DIAGNOSTICCHAIN_MAP = NOTIFICATION_INFO_OPERATION_COUNT
			+ 9;

	/**
	 * The operation id for the '<em>Withdrawed Consent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_STATEMENT___WITHDRAWED_CONSENT__DIAGNOSTICCHAIN_MAP = NOTIFICATION_INFO_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Processing Of Special Categories</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_STATEMENT___PROCESSING_OF_SPECIAL_CATEGORIES__DIAGNOSTICCHAIN_MAP = NOTIFICATION_INFO_OPERATION_COUNT
			+ 11;

	/**
	 * The operation id for the '<em>Subject Should Be Notified About Collecting</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_STATEMENT___SUBJECT_SHOULD_BE_NOTIFIED_ABOUT_COLLECTING__DIAGNOSTICCHAIN_MAP = NOTIFICATION_INFO_OPERATION_COUNT
			+ 12;

	/**
	 * The operation id for the '<em>Date Shoud Be Defined For Store Action</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_STATEMENT___DATE_SHOUD_BE_DEFINED_FOR_STORE_ACTION__DIAGNOSTICCHAIN_MAP = NOTIFICATION_INFO_OPERATION_COUNT
			+ 13;

	/**
	 * The operation id for the '<em>Court Approval Is Need For Public Interest Purpose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_STATEMENT___COURT_APPROVAL_IS_NEED_FOR_PUBLIC_INTEREST_PURPOSE__DIAGNOSTICCHAIN_MAP = NOTIFICATION_INFO_OPERATION_COUNT
			+ 14;

	/**
	 * The operation id for the '<em>Controller Approval Is Need For Legitimate Interests Purpose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_STATEMENT___CONTROLLER_APPROVAL_IS_NEED_FOR_LEGITIMATE_INTERESTS_PURPOSE__DIAGNOSTICCHAIN_MAP = NOTIFICATION_INFO_OPERATION_COUNT
			+ 15;

	/**
	 * The operation id for the '<em>Date Shoud Be Defined For Access Action</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_STATEMENT___DATE_SHOUD_BE_DEFINED_FOR_ACCESS_ACTION__DIAGNOSTICCHAIN_MAP = NOTIFICATION_INFO_OPERATION_COUNT
			+ 16;

	/**
	 * The operation id for the '<em>Expired Consent For Collecting</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_STATEMENT___EXPIRED_CONSENT_FOR_COLLECTING__DIAGNOSTICCHAIN_MAP = NOTIFICATION_INFO_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Caused By Should Be Defined For Stop Processing Action</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_STATEMENT___CAUSED_BY_SHOULD_BE_DEFINED_FOR_STOP_PROCESSING_ACTION__DIAGNOSTICCHAIN_MAP = NOTIFICATION_INFO_OPERATION_COUNT
			+ 18;

	/**
	 * The operation id for the '<em>Juvenile Data Should Be Used With Document Of Type Child Custody Provided By Responsible Person</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_STATEMENT___JUVENILE_DATA_SHOULD_BE_USED_WITH_DOCUMENT_OF_TYPE_CHILD_CUSTODY_PROVIDED_BY_RESPONSIBLE_PERSON__DIAGNOSTICCHAIN_MAP = NOTIFICATION_INFO_OPERATION_COUNT
			+ 19;

	/**
	 * The operation id for the '<em>Missing Consent Or Transfer Certificate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_STATEMENT___MISSING_CONSENT_OR_TRANSFER_CERTIFICATE__DIAGNOSTICCHAIN_MAP = NOTIFICATION_INFO_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Undefined Purpose For Action</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_STATEMENT___UNDEFINED_PURPOSE_FOR_ACTION__DIAGNOSTICCHAIN_MAP = NOTIFICATION_INFO_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Caused By Should Be Defined For Rectification Action</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_STATEMENT___CAUSED_BY_SHOULD_BE_DEFINED_FOR_RECTIFICATION_ACTION__DIAGNOSTICCHAIN_MAP = NOTIFICATION_INFO_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Expired Document</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_STATEMENT___EXPIRED_DOCUMENT__DIAGNOSTICCHAIN_MAP = NOTIFICATION_INFO_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Missing Consent For Transfer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_STATEMENT___MISSING_CONSENT_FOR_TRANSFER__DIAGNOSTICCHAIN_MAP = NOTIFICATION_INFO_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Caused By Should Be Defined For Erasure Action</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_STATEMENT___CAUSED_BY_SHOULD_BE_DEFINED_FOR_ERASURE_ACTION__DIAGNOSTICCHAIN_MAP = NOTIFICATION_INFO_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Subject Should Be Notified About Executed Erasure</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_STATEMENT___SUBJECT_SHOULD_BE_NOTIFIED_ABOUT_EXECUTED_ERASURE__DIAGNOSTICCHAIN_MAP = NOTIFICATION_INFO_OPERATION_COUNT
			+ 26;

	/**
	 * The operation id for the '<em>Whom Should Be Defined For Transfer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_STATEMENT___WHOM_SHOULD_BE_DEFINED_FOR_TRANSFER__DIAGNOSTICCHAIN_MAP = NOTIFICATION_INFO_OPERATION_COUNT
			+ 27;

	/**
	 * The number of operations of the '<em>Policy Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_STATEMENT_OPERATION_COUNT = NOTIFICATION_INFO_OPERATION_COUNT + 28;

	/**
	 * The meta object id for the '{@link privacyModel.impl.PrivacyDataImpl <em>Privacy Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see privacyModel.impl.PrivacyDataImpl
	 * @see privacyModel.impl.PrivacyModelPackageImpl#getPrivacyData()
	 * @generated
	 */
	int PRIVACY_DATA = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVACY_DATA__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVACY_DATA__TYPE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Privacy Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVACY_DATA_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Privacy Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVACY_DATA_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link privacyModel.impl.ServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see privacyModel.impl.ServiceImpl
	 * @see privacyModel.impl.PrivacyModelPackageImpl#getService()
	 * @generated
	 */
	int SERVICE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Subservices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__SUBSERVICES = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link privacyModel.impl.ProviderImpl <em>Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see privacyModel.impl.ProviderImpl
	 * @see privacyModel.impl.PrivacyModelPackageImpl#getProvider()
	 * @generated
	 */
	int PROVIDER = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Provide</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER__PROVIDE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Located</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER__LOCATED = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link privacyModel.impl.PrincipalImpl <em>Principal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see privacyModel.impl.PrincipalImpl
	 * @see privacyModel.impl.PrivacyModelPackageImpl#getPrincipal()
	 * @generated
	 */
	int PRINCIPAL = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINCIPAL__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Sub Principals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINCIPAL__SUB_PRINCIPALS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINCIPAL__TYPE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINCIPAL__SCOPE = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Responsible Persons</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINCIPAL__RESPONSIBLE_PERSONS = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Inhabits</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINCIPAL__INHABITS = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Birthdate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINCIPAL__BIRTHDATE = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINCIPAL__AGE = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Principal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINCIPAL_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINCIPAL___EQUALS__PRINCIPAL = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Natural Person Can Not Conatains Sub Principals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINCIPAL___NATURAL_PERSON_CAN_NOT_CONATAINS_SUB_PRINCIPALS__DIAGNOSTICCHAIN_MAP = NAMED_ELEMENT_OPERATION_COUNT
			+ 1;

	/**
	 * The operation id for the '<em>Juvenile Should Have Responsible Person</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINCIPAL___JUVENILE_SHOULD_HAVE_RESPONSIBLE_PERSON__DIAGNOSTICCHAIN_MAP = NAMED_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Principal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINCIPAL_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link privacyModel.impl.LocationImpl <em>Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see privacyModel.impl.LocationImpl
	 * @see privacyModel.impl.PrivacyModelPackageImpl#getLocation()
	 * @generated
	 */
	int LOCATION = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Is EU Member</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__IS_EU_MEMBER = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__TYPE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sub Locations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__SUB_LOCATIONS = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Legal Age Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__LEGAL_AGE_LIMIT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION___EQUALS__LOCATION = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link privacyModel.impl.AbstractTimeImpl <em>Abstract Time</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see privacyModel.impl.AbstractTimeImpl
	 * @see privacyModel.impl.PrivacyModelPackageImpl#getAbstractTime()
	 * @generated
	 */
	int ABSTRACT_TIME = 8;

	/**
	 * The number of structural features of the '<em>Abstract Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TIME_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Abstract Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TIME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link privacyModel.impl.TimeIntervalImpl <em>Time Interval</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see privacyModel.impl.TimeIntervalImpl
	 * @see privacyModel.impl.PrivacyModelPackageImpl#getTimeInterval()
	 * @generated
	 */
	int TIME_INTERVAL = 9;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_INTERVAL__START = ABSTRACT_TIME_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_INTERVAL__END = ABSTRACT_TIME_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Time Interval</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_INTERVAL_FEATURE_COUNT = ABSTRACT_TIME_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Is Type Defined With Other Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_INTERVAL___IS_TYPE_DEFINED_WITH_OTHER_TYPE__TIMEPREPOSITION_TIMEPREPOSITION = ABSTRACT_TIME_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Is Type Forbidden</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_INTERVAL___IS_TYPE_FORBIDDEN__TIMEPREPOSITION = ABSTRACT_TIME_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_INTERVAL___IS_VALID__TIMEPREPOSITION_TIMEPREPOSITION = ABSTRACT_TIME_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>After Statement Before Before Statement</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_INTERVAL___AFTER_STATEMENT_BEFORE_BEFORE_STATEMENT__DIAGNOSTICCHAIN_MAP = ABSTRACT_TIME_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Until Type Should Be Defined Alone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_INTERVAL___UNTIL_TYPE_SHOULD_BE_DEFINED_ALONE__DIAGNOSTICCHAIN_MAP = ABSTRACT_TIME_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>From Statement Before To Statement</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_INTERVAL___FROM_STATEMENT_BEFORE_TO_STATEMENT__DIAGNOSTICCHAIN_MAP = ABSTRACT_TIME_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Only From Or From With To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_INTERVAL___ONLY_FROM_OR_FROM_WITH_TO__DIAGNOSTICCHAIN_MAP = ABSTRACT_TIME_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Only After Or After With Before</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_INTERVAL___ONLY_AFTER_OR_AFTER_WITH_BEFORE__DIAGNOSTICCHAIN_MAP = ABSTRACT_TIME_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>At Type Should Be Defined Alone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_INTERVAL___AT_TYPE_SHOULD_BE_DEFINED_ALONE__DIAGNOSTICCHAIN_MAP = ABSTRACT_TIME_OPERATION_COUNT + 8;

	/**
	 * The number of operations of the '<em>Time Interval</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_INTERVAL_OPERATION_COUNT = ABSTRACT_TIME_OPERATION_COUNT + 9;

	/**
	 * The meta object id for the '{@link privacyModel.impl.TimeStatementImpl <em>Time Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see privacyModel.impl.TimeStatementImpl
	 * @see privacyModel.impl.PrivacyModelPackageImpl#getTimeStatement()
	 * @generated
	 */
	int TIME_STATEMENT = 10;

	/**
	 * The feature id for the '<em><b>Preposition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_STATEMENT__PREPOSITION = ABSTRACT_TIME_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_STATEMENT__DATE_TIME = ABSTRACT_TIME_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Time Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_STATEMENT_FEATURE_COUNT = ABSTRACT_TIME_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Time Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_STATEMENT_OPERATION_COUNT = ABSTRACT_TIME_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link privacyModel.impl.PurposeImpl <em>Purpose</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see privacyModel.impl.PurposeImpl
	 * @see privacyModel.impl.PrivacyModelPackageImpl#getPurpose()
	 * @generated
	 */
	int PURPOSE = 11;

	/**
	 * The feature id for the '<em><b>Processing Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURPOSE__PROCESSING_REASON = 0;

	/**
	 * The feature id for the '<em><b>Processing Reason Subtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURPOSE__PROCESSING_REASON_SUBTYPE = 1;

	/**
	 * The feature id for the '<em><b>Sub Purposes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURPOSE__SUB_PURPOSES = 2;

	/**
	 * The feature id for the '<em><b>Details</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURPOSE__DETAILS = 3;

	/**
	 * The number of structural features of the '<em>Purpose</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURPOSE_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURPOSE___IS_VALID__PURPOSE = 0;

	/**
	 * The operation id for the '<em>Is Sub Purpose Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURPOSE___IS_SUB_PURPOSE_VALID__PROCESSINGREASON_ELIST = 1;

	/**
	 * The operation id for the '<em>Contains Allowed Purpose Reason And Subreason</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURPOSE___CONTAINS_ALLOWED_PURPOSE_REASON_AND_SUBREASON__PROCESSINGREASON_ELIST = 2;

	/**
	 * The operation id for the '<em>Public Health Should Not Contain Sub Reason</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURPOSE___PUBLIC_HEALTH_SHOULD_NOT_CONTAIN_SUB_REASON__DIAGNOSTICCHAIN_MAP = 3;

	/**
	 * The operation id for the '<em>Legitimate Interests Not Contain Sub Reason</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURPOSE___LEGITIMATE_INTERESTS_NOT_CONTAIN_SUB_REASON__DIAGNOSTICCHAIN_MAP = 4;

	/**
	 * The operation id for the '<em>Stop Processing Interest Should Not Contain Sub Reason</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURPOSE___STOP_PROCESSING_INTEREST_SHOULD_NOT_CONTAIN_SUB_REASON__DIAGNOSTICCHAIN_MAP = 5;

	/**
	 * The operation id for the '<em>Profiling Should Not Contain Sub Reason</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURPOSE___PROFILING_SHOULD_NOT_CONTAIN_SUB_REASON__DIAGNOSTICCHAIN_MAP = 6;

	/**
	 * The operation id for the '<em>Marketing Should Not Contain Sub Reason</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURPOSE___MARKETING_SHOULD_NOT_CONTAIN_SUB_REASON__DIAGNOSTICCHAIN_MAP = 7;

	/**
	 * The operation id for the '<em>Out Of Scope Cannot Contains This Sub Reason</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURPOSE___OUT_OF_SCOPE_CANNOT_CONTAINS_THIS_SUB_REASON__DIAGNOSTICCHAIN_MAP = 8;

	/**
	 * The operation id for the '<em>Exercising Specific Rights Purposes Cannot Contains This Sub Reason</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURPOSE___EXERCISING_SPECIFIC_RIGHTS_PURPOSES_CANNOT_CONTAINS_THIS_SUB_REASON__DIAGNOSTICCHAIN_MAP = 9;

	/**
	 * The operation id for the '<em>Protect The Vital Interests Of The Data Subject Cannot Contains This Sub Reason</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURPOSE___PROTECT_THE_VITAL_INTERESTS_OF_THE_DATA_SUBJECT_CANNOT_CONTAINS_THIS_SUB_REASON__DIAGNOSTICCHAIN_MAP = 10;

	/**
	 * The operation id for the '<em>Public Interest Cannot Contains This Sub Reason</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURPOSE___PUBLIC_INTEREST_CANNOT_CONTAINS_THIS_SUB_REASON__DIAGNOSTICCHAIN_MAP = 11;

	/**
	 * The operation id for the '<em>Research Cannot Contains This Sub Reason</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURPOSE___RESEARCH_CANNOT_CONTAINS_THIS_SUB_REASON__DIAGNOSTICCHAIN_MAP = 12;

	/**
	 * The operation id for the '<em>Statistical Purposes Should Not Contain Sub Reason</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURPOSE___STATISTICAL_PURPOSES_SHOULD_NOT_CONTAIN_SUB_REASON__DIAGNOSTICCHAIN_MAP = 13;

	/**
	 * The operation id for the '<em>Testing Should Not Contain Sub Reason</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURPOSE___TESTING_SHOULD_NOT_CONTAIN_SUB_REASON__DIAGNOSTICCHAIN_MAP = 14;

	/**
	 * The number of operations of the '<em>Purpose</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURPOSE_OPERATION_COUNT = 15;

	/**
	 * The meta object id for the '{@link privacyModel.impl.WhatImpl <em>What</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see privacyModel.impl.WhatImpl
	 * @see privacyModel.impl.PrivacyModelPackageImpl#getWhat()
	 * @generated
	 */
	int WHAT = 12;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHAT__ACTIONS = 0;

	/**
	 * The feature id for the '<em><b>Providers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHAT__PROVIDERS = 1;

	/**
	 * The feature id for the '<em><b>Datas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHAT__DATAS = 2;

	/**
	 * The number of structural features of the '<em>What</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHAT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>What</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHAT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link privacyModel.impl.HowImpl <em>How</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see privacyModel.impl.HowImpl
	 * @see privacyModel.impl.PrivacyModelPackageImpl#getHow()
	 * @generated
	 */
	int HOW = 13;

	/**
	 * The feature id for the '<em><b>Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOW__DOCUMENTS = 0;

	/**
	 * The feature id for the '<em><b>Consent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOW__CONSENT = 1;

	/**
	 * The number of structural features of the '<em>How</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOW_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Is Consent Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOW___IS_CONSENT_VALID__HOW = 0;

	/**
	 * The number of operations of the '<em>How</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOW_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link privacyModel.impl.AbstractPaperImpl <em>Abstract Paper</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see privacyModel.impl.AbstractPaperImpl
	 * @see privacyModel.impl.PrivacyModelPackageImpl#getAbstractPaper()
	 * @generated
	 */
	int ABSTRACT_PAPER = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PAPER__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Provided By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PAPER__PROVIDED_BY = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Termination Explanation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PAPER__TERMINATION_EXPLANATION = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PAPER__START_DATE = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Termination Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PAPER__TERMINATION_DATE = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PAPER__LOCATION = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PAPER__DESCRIPTION = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Abstract Paper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PAPER_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Start Date Should Be Before Termination Date</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PAPER___START_DATE_SHOULD_BE_BEFORE_TERMINATION_DATE__DIAGNOSTICCHAIN_MAP = NAMED_ELEMENT_OPERATION_COUNT
			+ 0;

	/**
	 * The number of operations of the '<em>Abstract Paper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PAPER_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link privacyModel.impl.ConsentImpl <em>Consent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see privacyModel.impl.ConsentImpl
	 * @see privacyModel.impl.PrivacyModelPackageImpl#getConsent()
	 * @generated
	 */
	int CONSENT = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSENT__NAME = ABSTRACT_PAPER__NAME;

	/**
	 * The feature id for the '<em><b>Provided By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSENT__PROVIDED_BY = ABSTRACT_PAPER__PROVIDED_BY;

	/**
	 * The feature id for the '<em><b>Termination Explanation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSENT__TERMINATION_EXPLANATION = ABSTRACT_PAPER__TERMINATION_EXPLANATION;

	/**
	 * The feature id for the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSENT__START_DATE = ABSTRACT_PAPER__START_DATE;

	/**
	 * The feature id for the '<em><b>Termination Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSENT__TERMINATION_DATE = ABSTRACT_PAPER__TERMINATION_DATE;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSENT__LOCATION = ABSTRACT_PAPER__LOCATION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSENT__DESCRIPTION = ABSTRACT_PAPER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSENT__FORMAT = ABSTRACT_PAPER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSENT__TYPE = ABSTRACT_PAPER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Consent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSENT_FEATURE_COUNT = ABSTRACT_PAPER_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Start Date Should Be Before Termination Date</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSENT___START_DATE_SHOULD_BE_BEFORE_TERMINATION_DATE__DIAGNOSTICCHAIN_MAP = ABSTRACT_PAPER___START_DATE_SHOULD_BE_BEFORE_TERMINATION_DATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Consent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSENT_OPERATION_COUNT = ABSTRACT_PAPER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link privacyModel.impl.ConfigurationManagerImpl <em>Configuration Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see privacyModel.impl.ConfigurationManagerImpl
	 * @see privacyModel.impl.PrivacyModelPackageImpl#getConfigurationManager()
	 * @generated
	 */
	int CONFIGURATION_MANAGER = 15;

	/**
	 * The feature id for the '<em><b>Data Sources</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_MANAGER__DATA_SOURCES = 0;

	/**
	 * The feature id for the '<em><b>Protection Control Methods</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_MANAGER__PROTECTION_CONTROL_METHODS = 1;

	/**
	 * The number of structural features of the '<em>Configuration Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_MANAGER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Configuration Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_MANAGER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link privacyModel.impl.ComplaintImpl <em>Complaint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see privacyModel.impl.ComplaintImpl
	 * @see privacyModel.impl.PrivacyModelPackageImpl#getComplaint()
	 * @generated
	 */
	int COMPLAINT = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLAINT__NAME = NOTIFICATION_INFO__NAME;

	/**
	 * The feature id for the '<em><b>Who</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLAINT__WHO = NOTIFICATION_INFO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>When</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLAINT__WHEN = NOTIFICATION_INFO_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLAINT__REASON = NOTIFICATION_INFO_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLAINT__ACTION = NOTIFICATION_INFO_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Complaint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLAINT_FEATURE_COUNT = NOTIFICATION_INFO_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Does Policy Statement Exists</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLAINT___DOES_POLICY_STATEMENT_EXISTS__ACTION_COMPLAINTBASEDONDATATYPE = NOTIFICATION_INFO_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Cannot Identify Data From Complaint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLAINT___CANNOT_IDENTIFY_DATA_FROM_COMPLAINT__DIAGNOSTICCHAIN_MAP = NOTIFICATION_INFO_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Stop Processing Should Be Executed As Soon As Possible</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLAINT___STOP_PROCESSING_SHOULD_BE_EXECUTED_AS_SOON_AS_POSSIBLE__DIAGNOSTICCHAIN_MAP = NOTIFICATION_INFO_OPERATION_COUNT
			+ 2;

	/**
	 * The operation id for the '<em>User Doesnt Have Permission To Withdraw Consent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLAINT___USER_DOESNT_HAVE_PERMISSION_TO_WITHDRAW_CONSENT__DIAGNOSTICCHAIN_MAP = NOTIFICATION_INFO_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Erasure Should Be Executed As Soon As Possible</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLAINT___ERASURE_SHOULD_BE_EXECUTED_AS_SOON_AS_POSSIBLE__DIAGNOSTICCHAIN_MAP = NOTIFICATION_INFO_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Subject Should Be Notified About Existing Complaint For Erasure</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLAINT___SUBJECT_SHOULD_BE_NOTIFIED_ABOUT_EXISTING_COMPLAINT_FOR_ERASURE__DIAGNOSTICCHAIN_MAP = NOTIFICATION_INFO_OPERATION_COUNT
			+ 5;

	/**
	 * The operation id for the '<em>Rectification Should Be Executed As Soon As Possible</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLAINT___RECTIFICATION_SHOULD_BE_EXECUTED_AS_SOON_AS_POSSIBLE__DIAGNOSTICCHAIN_MAP = NOTIFICATION_INFO_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Invalid Type Of Purpose For An Object</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLAINT___INVALID_TYPE_OF_PURPOSE_FOR_AN_OBJECT__DIAGNOSTICCHAIN_MAP = NOTIFICATION_INFO_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>User Doesnt Have Permission To Complaint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLAINT___USER_DOESNT_HAVE_PERMISSION_TO_COMPLAINT__DIAGNOSTICCHAIN_MAP = NOTIFICATION_INFO_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Subject Should Be Notified About Withdraw</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLAINT___SUBJECT_SHOULD_BE_NOTIFIED_ABOUT_WITHDRAW__DIAGNOSTICCHAIN_MAP = NOTIFICATION_INFO_OPERATION_COUNT
			+ 9;

	/**
	 * The operation id for the '<em>Subject Should Be Notified About Existing Complaint For Rectification</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLAINT___SUBJECT_SHOULD_BE_NOTIFIED_ABOUT_EXISTING_COMPLAINT_FOR_RECTIFICATION__DIAGNOSTICCHAIN_MAP = NOTIFICATION_INFO_OPERATION_COUNT
			+ 10;

	/**
	 * The number of operations of the '<em>Complaint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLAINT_OPERATION_COUNT = NOTIFICATION_INFO_OPERATION_COUNT + 11;

	/**
	 * The meta object id for the '{@link privacyModel.impl.PrivacyPolicyHelperImpl <em>Privacy Policy Helper</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see privacyModel.impl.PrivacyPolicyHelperImpl
	 * @see privacyModel.impl.PrivacyModelPackageImpl#getPrivacyPolicyHelper()
	 * @generated
	 */
	int PRIVACY_POLICY_HELPER = 17;

	/**
	 * The number of structural features of the '<em>Privacy Policy Helper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVACY_POLICY_HELPER_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Is Policy Control Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVACY_POLICY_HELPER___IS_POLICY_CONTROL_VALID__STRING = 0;

	/**
	 * The operation id for the '<em>Is Data Source Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVACY_POLICY_HELPER___IS_DATA_SOURCE_VALID__STRING = 1;

	/**
	 * The operation id for the '<em>Are Intervals Overlap</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVACY_POLICY_HELPER___ARE_INTERVALS_OVERLAP__ABSTRACTTIME_ABSTRACTTIME = 2;

	/**
	 * The operation id for the '<em>Are Dates Overlap</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVACY_POLICY_HELPER___ARE_DATES_OVERLAP__ABSTRACTTIME_DATE = 3;

	/**
	 * The operation id for the '<em>Does Interval Start Before Interval</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVACY_POLICY_HELPER___DOES_INTERVAL_START_BEFORE_INTERVAL__ABSTRACTTIME_ABSTRACTTIME = 4;

	/**
	 * The operation id for the '<em>Is Date Before Interval</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVACY_POLICY_HELPER___IS_DATE_BEFORE_INTERVAL__ABSTRACTTIME_DATE = 5;

	/**
	 * The operation id for the '<em>Is Date After Interval</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVACY_POLICY_HELPER___IS_DATE_AFTER_INTERVAL__ABSTRACTTIME_DATE = 6;

	/**
	 * The operation id for the '<em>Is Date In Interval</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVACY_POLICY_HELPER___IS_DATE_IN_INTERVAL__ABSTRACTTIME_DATE = 7;

	/**
	 * The number of operations of the '<em>Privacy Policy Helper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVACY_POLICY_HELPER_OPERATION_COUNT = 8;

	/**
	 * The meta object id for the '{@link privacyModel.impl.WhereImpl <em>Where</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see privacyModel.impl.WhereImpl
	 * @see privacyModel.impl.PrivacyModelPackageImpl#getWhere()
	 * @generated
	 */
	int WHERE = 18;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHERE__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHERE__DESTINATION = 1;

	/**
	 * The number of structural features of the '<em>Where</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHERE_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHERE___EQUALS__WHERE = 0;

	/**
	 * The number of operations of the '<em>Where</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHERE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link privacyModel.impl.DocumentImpl <em>Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see privacyModel.impl.DocumentImpl
	 * @see privacyModel.impl.PrivacyModelPackageImpl#getDocument()
	 * @generated
	 */
	int DOCUMENT = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__NAME = ABSTRACT_PAPER__NAME;

	/**
	 * The feature id for the '<em><b>Provided By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__PROVIDED_BY = ABSTRACT_PAPER__PROVIDED_BY;

	/**
	 * The feature id for the '<em><b>Termination Explanation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__TERMINATION_EXPLANATION = ABSTRACT_PAPER__TERMINATION_EXPLANATION;

	/**
	 * The feature id for the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__START_DATE = ABSTRACT_PAPER__START_DATE;

	/**
	 * The feature id for the '<em><b>Termination Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__TERMINATION_DATE = ABSTRACT_PAPER__TERMINATION_DATE;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__LOCATION = ABSTRACT_PAPER__LOCATION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__DESCRIPTION = ABSTRACT_PAPER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Document Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__DOCUMENT_TYPE = ABSTRACT_PAPER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_FEATURE_COUNT = ABSTRACT_PAPER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Start Date Should Be Before Termination Date</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT___START_DATE_SHOULD_BE_BEFORE_TERMINATION_DATE__DIAGNOSTICCHAIN_MAP = ABSTRACT_PAPER___START_DATE_SHOULD_BE_BEFORE_TERMINATION_DATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_OPERATION_COUNT = ABSTRACT_PAPER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link privacyModel.impl.AbstractComplaintActionImpl <em>Abstract Complaint Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see privacyModel.impl.AbstractComplaintActionImpl
	 * @see privacyModel.impl.PrivacyModelPackageImpl#getAbstractComplaintAction()
	 * @generated
	 */
	int ABSTRACT_COMPLAINT_ACTION = 21;

	/**
	 * The number of structural features of the '<em>Abstract Complaint Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMPLAINT_ACTION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Abstract Complaint Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMPLAINT_ACTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link privacyModel.impl.WithdrawImpl <em>Withdraw</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see privacyModel.impl.WithdrawImpl
	 * @see privacyModel.impl.PrivacyModelPackageImpl#getWithdraw()
	 * @generated
	 */
	int WITHDRAW = 22;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WITHDRAW__SUBJECT = ABSTRACT_COMPLAINT_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Withdraw</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WITHDRAW_FEATURE_COUNT = ABSTRACT_COMPLAINT_ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Withdraw</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WITHDRAW_OPERATION_COUNT = ABSTRACT_COMPLAINT_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link privacyModel.impl.AbstractComplaintImpl <em>Abstract Complaint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see privacyModel.impl.AbstractComplaintImpl
	 * @see privacyModel.impl.PrivacyModelPackageImpl#getAbstractComplaint()
	 * @generated
	 */
	int ABSTRACT_COMPLAINT = 28;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMPLAINT__STATUS = ABSTRACT_COMPLAINT_ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Denial Reason</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMPLAINT__DENIAL_REASON = ABSTRACT_COMPLAINT_ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Abstract Complaint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMPLAINT_FEATURE_COUNT = ABSTRACT_COMPLAINT_ACTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Abstract Complaint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMPLAINT_OPERATION_COUNT = ABSTRACT_COMPLAINT_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link privacyModel.impl.ComplaintBasedOnDataImpl <em>Complaint Based On Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see privacyModel.impl.ComplaintBasedOnDataImpl
	 * @see privacyModel.impl.PrivacyModelPackageImpl#getComplaintBasedOnData()
	 * @generated
	 */
	int COMPLAINT_BASED_ON_DATA = 23;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLAINT_BASED_ON_DATA__STATUS = ABSTRACT_COMPLAINT__STATUS;

	/**
	 * The feature id for the '<em><b>Denial Reason</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLAINT_BASED_ON_DATA__DENIAL_REASON = ABSTRACT_COMPLAINT__DENIAL_REASON;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLAINT_BASED_ON_DATA__SUBJECT = ABSTRACT_COMPLAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLAINT_BASED_ON_DATA__TYPE = ABSTRACT_COMPLAINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Complaint Based On Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLAINT_BASED_ON_DATA_FEATURE_COUNT = ABSTRACT_COMPLAINT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Complaint Based On Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLAINT_BASED_ON_DATA_OPERATION_COUNT = ABSTRACT_COMPLAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link privacyModel.impl.SharedPrivacyDataImpl <em>Shared Privacy Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see privacyModel.impl.SharedPrivacyDataImpl
	 * @see privacyModel.impl.PrivacyModelPackageImpl#getSharedPrivacyData()
	 * @generated
	 */
	int SHARED_PRIVACY_DATA = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_PRIVACY_DATA__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Additional Protection Controls</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_PRIVACY_DATA__ADDITIONAL_PROTECTION_CONTROLS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Privacydata</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_PRIVACY_DATA__PRIVACYDATA = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Colllected From Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_PRIVACY_DATA__COLLLECTED_FROM_SUBJECT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Data Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_PRIVACY_DATA__DATA_SOURCE = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Shared Privacy Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_PRIVACY_DATA_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Protection Control Should Exists In Configuration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_PRIVACY_DATA___PROTECTION_CONTROL_SHOULD_EXISTS_IN_CONFIGURATION__DIAGNOSTICCHAIN_MAP = NAMED_ELEMENT_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Data Source Should Exists In Configuration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_PRIVACY_DATA___DATA_SOURCE_SHOULD_EXISTS_IN_CONFIGURATION__DIAGNOSTICCHAIN_MAP = NAMED_ELEMENT_OPERATION_COUNT
			+ 1;

	/**
	 * The number of operations of the '<em>Shared Privacy Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_PRIVACY_DATA_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link privacyModel.impl.DenialImpl <em>Denial</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see privacyModel.impl.DenialImpl
	 * @see privacyModel.impl.PrivacyModelPackageImpl#getDenial()
	 * @generated
	 */
	int DENIAL = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENIAL__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>When</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENIAL__WHEN = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Approved By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENIAL__APPROVED_BY = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENIAL__REASON = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Based On Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENIAL__BASED_ON_STATEMENTS = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Denial</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENIAL_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Denial</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENIAL_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link privacyModel.impl.NotificationImpl <em>Notification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see privacyModel.impl.NotificationImpl
	 * @see privacyModel.impl.PrivacyModelPackageImpl#getNotification()
	 * @generated
	 */
	int NOTIFICATION = 26;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION__TYPE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Notifiers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION__NOTIFIERS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Receivers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION__RECEIVERS = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Caused By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION__CAUSED_BY = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>When</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION__WHEN = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Notification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Should Define Caused By As Erasure</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION___SHOULD_DEFINE_CAUSED_BY_AS_ERASURE__DIAGNOSTICCHAIN_MAP = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Should Define Caused By As Privacy Policy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION___SHOULD_DEFINE_CAUSED_BY_AS_PRIVACY_POLICY__DIAGNOSTICCHAIN_MAP = NAMED_ELEMENT_OPERATION_COUNT
			+ 1;

	/**
	 * The operation id for the '<em>Should Define Caused By As Withdraw</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION___SHOULD_DEFINE_CAUSED_BY_AS_WITHDRAW__DIAGNOSTICCHAIN_MAP = NAMED_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Should Define Caused By As Rectification</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION___SHOULD_DEFINE_CAUSED_BY_AS_RECTIFICATION__DIAGNOSTICCHAIN_MAP = NAMED_ELEMENT_OPERATION_COUNT
			+ 3;

	/**
	 * The number of operations of the '<em>Notification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 4;

	/**
	 * The meta object id for the '{@link privacyModel.impl.ComplaintBasedOnActionImpl <em>Complaint Based On Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see privacyModel.impl.ComplaintBasedOnActionImpl
	 * @see privacyModel.impl.PrivacyModelPackageImpl#getComplaintBasedOnAction()
	 * @generated
	 */
	int COMPLAINT_BASED_ON_ACTION = 29;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLAINT_BASED_ON_ACTION__STATUS = ABSTRACT_COMPLAINT__STATUS;

	/**
	 * The feature id for the '<em><b>Denial Reason</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLAINT_BASED_ON_ACTION__DENIAL_REASON = ABSTRACT_COMPLAINT__DENIAL_REASON;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLAINT_BASED_ON_ACTION__STATEMENT = ABSTRACT_COMPLAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Complaint Based On Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLAINT_BASED_ON_ACTION_FEATURE_COUNT = ABSTRACT_COMPLAINT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Complaint Based On Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLAINT_BASED_ON_ACTION_OPERATION_COUNT = ABSTRACT_COMPLAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link privacyModel.DataType <em>Data Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see privacyModel.DataType
	 * @see privacyModel.impl.PrivacyModelPackageImpl#getDataType()
	 * @generated
	 */
	int DATA_TYPE = 30;

	/**
	 * The meta object id for the '{@link privacyModel.DocumentType <em>Document Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see privacyModel.DocumentType
	 * @see privacyModel.impl.PrivacyModelPackageImpl#getDocumentType()
	 * @generated
	 */
	int DOCUMENT_TYPE = 31;

	/**
	 * The meta object id for the '{@link privacyModel.TimePreposition <em>Time Preposition</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see privacyModel.TimePreposition
	 * @see privacyModel.impl.PrivacyModelPackageImpl#getTimePreposition()
	 * @generated
	 */
	int TIME_PREPOSITION = 32;

	/**
	 * The meta object id for the '{@link privacyModel.PrincipalType <em>Principal Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see privacyModel.PrincipalType
	 * @see privacyModel.impl.PrivacyModelPackageImpl#getPrincipalType()
	 * @generated
	 */
	int PRINCIPAL_TYPE = 33;

	/**
	 * The meta object id for the '{@link privacyModel.PrincipalScope <em>Principal Scope</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see privacyModel.PrincipalScope
	 * @see privacyModel.impl.PrivacyModelPackageImpl#getPrincipalScope()
	 * @generated
	 */
	int PRINCIPAL_SCOPE = 34;

	/**
	 * The meta object id for the '{@link privacyModel.Action <em>Action</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see privacyModel.Action
	 * @see privacyModel.impl.PrivacyModelPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 35;

	/**
	 * The meta object id for the '{@link privacyModel.LocationType <em>Location Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see privacyModel.LocationType
	 * @see privacyModel.impl.PrivacyModelPackageImpl#getLocationType()
	 * @generated
	 */
	int LOCATION_TYPE = 36;

	/**
	 * The meta object id for the '{@link privacyModel.ProcessingReason <em>Processing Reason</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see privacyModel.ProcessingReason
	 * @see privacyModel.impl.PrivacyModelPackageImpl#getProcessingReason()
	 * @generated
	 */
	int PROCESSING_REASON = 37;

	/**
	 * The meta object id for the '{@link privacyModel.ProcessingReasonSubtype <em>Processing Reason Subtype</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see privacyModel.ProcessingReasonSubtype
	 * @see privacyModel.impl.PrivacyModelPackageImpl#getProcessingReasonSubtype()
	 * @generated
	 */
	int PROCESSING_REASON_SUBTYPE = 38;

	/**
	 * The meta object id for the '{@link privacyModel.ConsentFormat <em>Consent Format</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see privacyModel.ConsentFormat
	 * @see privacyModel.impl.PrivacyModelPackageImpl#getConsentFormat()
	 * @generated
	 */
	int CONSENT_FORMAT = 39;

	/**
	 * The meta object id for the '{@link privacyModel.ConsentType <em>Consent Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see privacyModel.ConsentType
	 * @see privacyModel.impl.PrivacyModelPackageImpl#getConsentType()
	 * @generated
	 */
	int CONSENT_TYPE = 40;

	/**
	 * The meta object id for the '{@link privacyModel.ComplaintBasedOnDataType <em>Complaint Based On Data Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see privacyModel.ComplaintBasedOnDataType
	 * @see privacyModel.impl.PrivacyModelPackageImpl#getComplaintBasedOnDataType()
	 * @generated
	 */
	int COMPLAINT_BASED_ON_DATA_TYPE = 41;

	/**
	 * The meta object id for the '{@link privacyModel.NotificationType <em>Notification Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see privacyModel.NotificationType
	 * @see privacyModel.impl.PrivacyModelPackageImpl#getNotificationType()
	 * @generated
	 */
	int NOTIFICATION_TYPE = 42;

	/**
	 * The meta object id for the '{@link privacyModel.ComplaintStatus <em>Complaint Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see privacyModel.ComplaintStatus
	 * @see privacyModel.impl.PrivacyModelPackageImpl#getComplaintStatus()
	 * @generated
	 */
	int COMPLAINT_STATUS = 43;

	/**
	 * Returns the meta object for class '{@link privacyModel.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see privacyModel.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link privacyModel.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see privacyModel.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link privacyModel.PrivacyPolicy <em>Privacy Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Privacy Policy</em>'.
	 * @see privacyModel.PrivacyPolicy
	 * @generated
	 */
	EClass getPrivacyPolicy();

	/**
	 * Returns the meta object for the containment reference list '{@link privacyModel.PrivacyPolicy#getPolicyStatements <em>Policy Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Policy Statements</em>'.
	 * @see privacyModel.PrivacyPolicy#getPolicyStatements()
	 * @see #getPrivacyPolicy()
	 * @generated
	 */
	EReference getPrivacyPolicy_PolicyStatements();

	/**
	 * Returns the meta object for the reference '{@link privacyModel.PrivacyPolicy#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owner</em>'.
	 * @see privacyModel.PrivacyPolicy#getOwner()
	 * @see #getPrivacyPolicy()
	 * @generated
	 */
	EReference getPrivacyPolicy_Owner();

	/**
	 * Returns the meta object for the containment reference list '{@link privacyModel.PrivacyPolicy#getAllPrincipals <em>All Principals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>All Principals</em>'.
	 * @see privacyModel.PrivacyPolicy#getAllPrincipals()
	 * @see #getPrivacyPolicy()
	 * @generated
	 */
	EReference getPrivacyPolicy_AllPrincipals();

	/**
	 * Returns the meta object for the containment reference list '{@link privacyModel.PrivacyPolicy#getLocations <em>Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Locations</em>'.
	 * @see privacyModel.PrivacyPolicy#getLocations()
	 * @see #getPrivacyPolicy()
	 * @generated
	 */
	EReference getPrivacyPolicy_Locations();

	/**
	 * Returns the meta object for the attribute list '{@link privacyModel.PrivacyPolicy#getDefaultProtectionControls <em>Default Protection Controls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Default Protection Controls</em>'.
	 * @see privacyModel.PrivacyPolicy#getDefaultProtectionControls()
	 * @see #getPrivacyPolicy()
	 * @generated
	 */
	EAttribute getPrivacyPolicy_DefaultProtectionControls();

	/**
	 * Returns the meta object for the containment reference list '{@link privacyModel.PrivacyPolicy#getAllServices <em>All Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>All Services</em>'.
	 * @see privacyModel.PrivacyPolicy#getAllServices()
	 * @see #getPrivacyPolicy()
	 * @generated
	 */
	EReference getPrivacyPolicy_AllServices();

	/**
	 * Returns the meta object for the containment reference list '{@link privacyModel.PrivacyPolicy#getAllProviders <em>All Providers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>All Providers</em>'.
	 * @see privacyModel.PrivacyPolicy#getAllProviders()
	 * @see #getPrivacyPolicy()
	 * @generated
	 */
	EReference getPrivacyPolicy_AllProviders();

	/**
	 * Returns the meta object for the containment reference '{@link privacyModel.PrivacyPolicy#getConfigurationManager <em>Configuration Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Configuration Manager</em>'.
	 * @see privacyModel.PrivacyPolicy#getConfigurationManager()
	 * @see #getPrivacyPolicy()
	 * @generated
	 */
	EReference getPrivacyPolicy_ConfigurationManager();

	/**
	 * Returns the meta object for the containment reference list '{@link privacyModel.PrivacyPolicy#getAllDatas <em>All Datas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>All Datas</em>'.
	 * @see privacyModel.PrivacyPolicy#getAllDatas()
	 * @see #getPrivacyPolicy()
	 * @generated
	 */
	EReference getPrivacyPolicy_AllDatas();

	/**
	 * Returns the meta object for the containment reference list '{@link privacyModel.PrivacyPolicy#getAllComplaints <em>All Complaints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>All Complaints</em>'.
	 * @see privacyModel.PrivacyPolicy#getAllComplaints()
	 * @see #getPrivacyPolicy()
	 * @generated
	 */
	EReference getPrivacyPolicy_AllComplaints();

	/**
	 * Returns the meta object for the containment reference '{@link privacyModel.PrivacyPolicy#getPrivacyPolicyHelper <em>Privacy Policy Helper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Privacy Policy Helper</em>'.
	 * @see privacyModel.PrivacyPolicy#getPrivacyPolicyHelper()
	 * @see #getPrivacyPolicy()
	 * @generated
	 */
	EReference getPrivacyPolicy_PrivacyPolicyHelper();

	/**
	 * Returns the meta object for the containment reference list '{@link privacyModel.PrivacyPolicy#getAllDenials <em>All Denials</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>All Denials</em>'.
	 * @see privacyModel.PrivacyPolicy#getAllDenials()
	 * @see #getPrivacyPolicy()
	 * @generated
	 */
	EReference getPrivacyPolicy_AllDenials();

	/**
	 * Returns the meta object for the containment reference list '{@link privacyModel.PrivacyPolicy#getAllConsents <em>All Consents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>All Consents</em>'.
	 * @see privacyModel.PrivacyPolicy#getAllConsents()
	 * @see #getPrivacyPolicy()
	 * @generated
	 */
	EReference getPrivacyPolicy_AllConsents();

	/**
	 * Returns the meta object for the containment reference list '{@link privacyModel.PrivacyPolicy#getAllDocuments <em>All Documents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>All Documents</em>'.
	 * @see privacyModel.PrivacyPolicy#getAllDocuments()
	 * @see #getPrivacyPolicy()
	 * @generated
	 */
	EReference getPrivacyPolicy_AllDocuments();

	/**
	 * Returns the meta object for the containment reference list '{@link privacyModel.PrivacyPolicy#getNotifications <em>Notifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Notifications</em>'.
	 * @see privacyModel.PrivacyPolicy#getNotifications()
	 * @see #getPrivacyPolicy()
	 * @generated
	 */
	EReference getPrivacyPolicy_Notifications();

	/**
	 * Returns the meta object for the containment reference list '{@link privacyModel.PrivacyPolicy#getAllSharedPrivacyData <em>All Shared Privacy Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>All Shared Privacy Data</em>'.
	 * @see privacyModel.PrivacyPolicy#getAllSharedPrivacyData()
	 * @see #getPrivacyPolicy()
	 * @generated
	 */
	EReference getPrivacyPolicy_AllSharedPrivacyData();

	/**
	 * Returns the meta object for the '{@link privacyModel.PrivacyPolicy#UniqueProviderName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Unique Provider Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unique Provider Name</em>' operation.
	 * @see privacyModel.PrivacyPolicy#UniqueProviderName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getPrivacyPolicy__UniqueProviderName__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link privacyModel.PrivacyPolicy#UniqueConsentName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Unique Consent Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unique Consent Name</em>' operation.
	 * @see privacyModel.PrivacyPolicy#UniqueConsentName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getPrivacyPolicy__UniqueConsentName__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link privacyModel.PrivacyPolicy#UniqueServiceName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Unique Service Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unique Service Name</em>' operation.
	 * @see privacyModel.PrivacyPolicy#UniqueServiceName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getPrivacyPolicy__UniqueServiceName__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link privacyModel.PrivacyPolicy#OwnerShouldHaveDefinedInhabits(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Owner Should Have Defined Inhabits</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Owner Should Have Defined Inhabits</em>' operation.
	 * @see privacyModel.PrivacyPolicy#OwnerShouldHaveDefinedInhabits(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getPrivacyPolicy__OwnerShouldHaveDefinedInhabits__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link privacyModel.PrivacyPolicy#UniquePolicyStatementName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Unique Policy Statement Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unique Policy Statement Name</em>' operation.
	 * @see privacyModel.PrivacyPolicy#UniquePolicyStatementName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getPrivacyPolicy__UniquePolicyStatementName__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link privacyModel.PrivacyPolicy#ProtectionControlShouldExistsInConfiguration(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Protection Control Should Exists In Configuration</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Protection Control Should Exists In Configuration</em>' operation.
	 * @see privacyModel.PrivacyPolicy#ProtectionControlShouldExistsInConfiguration(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getPrivacyPolicy__ProtectionControlShouldExistsInConfiguration__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link privacyModel.PrivacyPolicy#UniquePrivacyDataName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Unique Privacy Data Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unique Privacy Data Name</em>' operation.
	 * @see privacyModel.PrivacyPolicy#UniquePrivacyDataName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getPrivacyPolicy__UniquePrivacyDataName__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link privacyModel.PrivacyPolicy#UniqueDocumentName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Unique Document Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unique Document Name</em>' operation.
	 * @see privacyModel.PrivacyPolicy#UniqueDocumentName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getPrivacyPolicy__UniqueDocumentName__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link privacyModel.PrivacyPolicy#UniqueLocationPerType(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Unique Location Per Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unique Location Per Type</em>' operation.
	 * @see privacyModel.PrivacyPolicy#UniqueLocationPerType(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getPrivacyPolicy__UniqueLocationPerType__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link privacyModel.PrivacyPolicy#UniquePrincipalNamePerType(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Unique Principal Name Per Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unique Principal Name Per Type</em>' operation.
	 * @see privacyModel.PrivacyPolicy#UniquePrincipalNamePerType(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getPrivacyPolicy__UniquePrincipalNamePerType__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link privacyModel.PrivacyPolicy#UniqueComplaintName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Unique Complaint Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unique Complaint Name</em>' operation.
	 * @see privacyModel.PrivacyPolicy#UniqueComplaintName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getPrivacyPolicy__UniqueComplaintName__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link privacyModel.PolicyStatement <em>Policy Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Policy Statement</em>'.
	 * @see privacyModel.PolicyStatement
	 * @generated
	 */
	EClass getPolicyStatement();

	/**
	 * Returns the meta object for the containment reference '{@link privacyModel.PolicyStatement#getWhen <em>When</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>When</em>'.
	 * @see privacyModel.PolicyStatement#getWhen()
	 * @see #getPolicyStatement()
	 * @generated
	 */
	EReference getPolicyStatement_When();

	/**
	 * Returns the meta object for the reference '{@link privacyModel.PolicyStatement#getWho <em>Who</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Who</em>'.
	 * @see privacyModel.PolicyStatement#getWho()
	 * @see #getPolicyStatement()
	 * @generated
	 */
	EReference getPolicyStatement_Who();

	/**
	 * Returns the meta object for the containment reference '{@link privacyModel.PolicyStatement#getWhy <em>Why</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Why</em>'.
	 * @see privacyModel.PolicyStatement#getWhy()
	 * @see #getPolicyStatement()
	 * @generated
	 */
	EReference getPolicyStatement_Why();

	/**
	 * Returns the meta object for the containment reference '{@link privacyModel.PolicyStatement#getWhat <em>What</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>What</em>'.
	 * @see privacyModel.PolicyStatement#getWhat()
	 * @see #getPolicyStatement()
	 * @generated
	 */
	EReference getPolicyStatement_What();

	/**
	 * Returns the meta object for the containment reference '{@link privacyModel.PolicyStatement#getHow <em>How</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>How</em>'.
	 * @see privacyModel.PolicyStatement#getHow()
	 * @see #getPolicyStatement()
	 * @generated
	 */
	EReference getPolicyStatement_How();

	/**
	 * Returns the meta object for the reference '{@link privacyModel.PolicyStatement#getWhose <em>Whose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Whose</em>'.
	 * @see privacyModel.PolicyStatement#getWhose()
	 * @see #getPolicyStatement()
	 * @generated
	 */
	EReference getPolicyStatement_Whose();

	/**
	 * Returns the meta object for the reference '{@link privacyModel.PolicyStatement#getWhom <em>Whom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Whom</em>'.
	 * @see privacyModel.PolicyStatement#getWhom()
	 * @see #getPolicyStatement()
	 * @generated
	 */
	EReference getPolicyStatement_Whom();

	/**
	 * Returns the meta object for the containment reference '{@link privacyModel.PolicyStatement#getWhere <em>Where</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Where</em>'.
	 * @see privacyModel.PolicyStatement#getWhere()
	 * @see #getPolicyStatement()
	 * @generated
	 */
	EReference getPolicyStatement_Where();

	/**
	 * Returns the meta object for the reference '{@link privacyModel.PolicyStatement#getCausedBy <em>Caused By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Caused By</em>'.
	 * @see privacyModel.PolicyStatement#getCausedBy()
	 * @see #getPolicyStatement()
	 * @generated
	 */
	EReference getPolicyStatement_CausedBy();

	/**
	 * Returns the meta object for the '{@link privacyModel.PolicyStatement#dateShouldBeDefinedForType(privacyModel.Action) <em>Date Should Be Defined For Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Date Should Be Defined For Type</em>' operation.
	 * @see privacyModel.PolicyStatement#dateShouldBeDefinedForType(privacyModel.Action)
	 * @generated
	 */
	EOperation getPolicyStatement__DateShouldBeDefinedForType__Action();

	/**
	 * Returns the meta object for the '{@link privacyModel.PolicyStatement#causedByShouldBeDefinedForType(privacyModel.Action) <em>Caused By Should Be Defined For Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Caused By Should Be Defined For Type</em>' operation.
	 * @see privacyModel.PolicyStatement#causedByShouldBeDefinedForType(privacyModel.Action)
	 * @generated
	 */
	EOperation getPolicyStatement__CausedByShouldBeDefinedForType__Action();

	/**
	 * Returns the meta object for the '{@link privacyModel.PolicyStatement#documentIsNeededForPurpose(privacyModel.DocumentType, privacyModel.ProcessingReason) <em>Document Is Needed For Purpose</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Document Is Needed For Purpose</em>' operation.
	 * @see privacyModel.PolicyStatement#documentIsNeededForPurpose(privacyModel.DocumentType, privacyModel.ProcessingReason)
	 * @generated
	 */
	EOperation getPolicyStatement__DocumentIsNeededForPurpose__DocumentType_ProcessingReason();

	/**
	 * Returns the meta object for the '{@link privacyModel.PolicyStatement#SubjectShouldBeNotifiedAboutTransferToThirdCountry(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Subject Should Be Notified About Transfer To Third Country</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Subject Should Be Notified About Transfer To Third Country</em>' operation.
	 * @see privacyModel.PolicyStatement#SubjectShouldBeNotifiedAboutTransferToThirdCountry(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getPolicyStatement__SubjectShouldBeNotifiedAboutTransferToThirdCountry__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link privacyModel.PolicyStatement#SubjectShouldBeNotifiedAboutExecutedRectification(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Subject Should Be Notified About Executed Rectification</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Subject Should Be Notified About Executed Rectification</em>' operation.
	 * @see privacyModel.PolicyStatement#SubjectShouldBeNotifiedAboutExecutedRectification(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getPolicyStatement__SubjectShouldBeNotifiedAboutExecutedRectification__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link privacyModel.PolicyStatement#SubjectShouldBeNotifiedAboutStopProcessing(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Subject Should Be Notified About Stop Processing</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Subject Should Be Notified About Stop Processing</em>' operation.
	 * @see privacyModel.PolicyStatement#SubjectShouldBeNotifiedAboutStopProcessing(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getPolicyStatement__SubjectShouldBeNotifiedAboutStopProcessing__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link privacyModel.PolicyStatement#ControllerApprovalIsNeedForProtectTheVitalInterestsOfTheDataSubjectPurpose(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Controller Approval Is Need For Protect The Vital Interests Of The Data Subject Purpose</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Controller Approval Is Need For Protect The Vital Interests Of The Data Subject Purpose</em>' operation.
	 * @see privacyModel.PolicyStatement#ControllerApprovalIsNeedForProtectTheVitalInterestsOfTheDataSubjectPurpose(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getPolicyStatement__ControllerApprovalIsNeedForProtectTheVitalInterestsOfTheDataSubjectPurpose__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link privacyModel.PolicyStatement#MissingConsentForCollecting(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Missing Consent For Collecting</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Missing Consent For Collecting</em>' operation.
	 * @see privacyModel.PolicyStatement#MissingConsentForCollecting(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getPolicyStatement__MissingConsentForCollecting__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link privacyModel.PolicyStatement#ExpiredConsent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Expired Consent</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Expired Consent</em>' operation.
	 * @see privacyModel.PolicyStatement#ExpiredConsent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getPolicyStatement__ExpiredConsent__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link privacyModel.PolicyStatement#StopProcessingPurposeForActionStopProcessing(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Stop Processing Purpose For Action Stop Processing</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Stop Processing Purpose For Action Stop Processing</em>' operation.
	 * @see privacyModel.PolicyStatement#StopProcessingPurposeForActionStopProcessing(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getPolicyStatement__StopProcessingPurposeForActionStopProcessing__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link privacyModel.PolicyStatement#WithdrawedConsent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Withdrawed Consent</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Withdrawed Consent</em>' operation.
	 * @see privacyModel.PolicyStatement#WithdrawedConsent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getPolicyStatement__WithdrawedConsent__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link privacyModel.PolicyStatement#ProcessingOfSpecialCategories(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Processing Of Special Categories</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Processing Of Special Categories</em>' operation.
	 * @see privacyModel.PolicyStatement#ProcessingOfSpecialCategories(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getPolicyStatement__ProcessingOfSpecialCategories__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link privacyModel.PolicyStatement#SubjectShouldBeNotifiedAboutCollecting(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Subject Should Be Notified About Collecting</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Subject Should Be Notified About Collecting</em>' operation.
	 * @see privacyModel.PolicyStatement#SubjectShouldBeNotifiedAboutCollecting(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getPolicyStatement__SubjectShouldBeNotifiedAboutCollecting__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link privacyModel.PolicyStatement#DateShoudBeDefinedForStoreAction(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Date Shoud Be Defined For Store Action</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Date Shoud Be Defined For Store Action</em>' operation.
	 * @see privacyModel.PolicyStatement#DateShoudBeDefinedForStoreAction(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getPolicyStatement__DateShoudBeDefinedForStoreAction__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link privacyModel.PolicyStatement#CourtApprovalIsNeedForPublicInterestPurpose(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Court Approval Is Need For Public Interest Purpose</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Court Approval Is Need For Public Interest Purpose</em>' operation.
	 * @see privacyModel.PolicyStatement#CourtApprovalIsNeedForPublicInterestPurpose(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getPolicyStatement__CourtApprovalIsNeedForPublicInterestPurpose__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link privacyModel.PolicyStatement#ControllerApprovalIsNeedForLegitimateInterestsPurpose(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Controller Approval Is Need For Legitimate Interests Purpose</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Controller Approval Is Need For Legitimate Interests Purpose</em>' operation.
	 * @see privacyModel.PolicyStatement#ControllerApprovalIsNeedForLegitimateInterestsPurpose(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getPolicyStatement__ControllerApprovalIsNeedForLegitimateInterestsPurpose__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link privacyModel.PolicyStatement#DateShoudBeDefinedForAccessAction(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Date Shoud Be Defined For Access Action</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Date Shoud Be Defined For Access Action</em>' operation.
	 * @see privacyModel.PolicyStatement#DateShoudBeDefinedForAccessAction(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getPolicyStatement__DateShoudBeDefinedForAccessAction__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link privacyModel.PolicyStatement#ExpiredConsentForCollecting(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Expired Consent For Collecting</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Expired Consent For Collecting</em>' operation.
	 * @see privacyModel.PolicyStatement#ExpiredConsentForCollecting(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getPolicyStatement__ExpiredConsentForCollecting__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link privacyModel.PolicyStatement#CausedByShouldBeDefinedForStopProcessingAction(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Caused By Should Be Defined For Stop Processing Action</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Caused By Should Be Defined For Stop Processing Action</em>' operation.
	 * @see privacyModel.PolicyStatement#CausedByShouldBeDefinedForStopProcessingAction(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getPolicyStatement__CausedByShouldBeDefinedForStopProcessingAction__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link privacyModel.PolicyStatement#JuvenileDataShouldBeUsedWithDocumentOfTypeChildCustodyProvidedByResponsiblePerson(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Juvenile Data Should Be Used With Document Of Type Child Custody Provided By Responsible Person</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Juvenile Data Should Be Used With Document Of Type Child Custody Provided By Responsible Person</em>' operation.
	 * @see privacyModel.PolicyStatement#JuvenileDataShouldBeUsedWithDocumentOfTypeChildCustodyProvidedByResponsiblePerson(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getPolicyStatement__JuvenileDataShouldBeUsedWithDocumentOfTypeChildCustodyProvidedByResponsiblePerson__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link privacyModel.PolicyStatement#MissingConsentOrTransferCertificate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Missing Consent Or Transfer Certificate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Missing Consent Or Transfer Certificate</em>' operation.
	 * @see privacyModel.PolicyStatement#MissingConsentOrTransferCertificate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getPolicyStatement__MissingConsentOrTransferCertificate__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link privacyModel.PolicyStatement#UndefinedPurposeForAction(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Undefined Purpose For Action</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Undefined Purpose For Action</em>' operation.
	 * @see privacyModel.PolicyStatement#UndefinedPurposeForAction(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getPolicyStatement__UndefinedPurposeForAction__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link privacyModel.PolicyStatement#CausedByShouldBeDefinedForRectificationAction(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Caused By Should Be Defined For Rectification Action</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Caused By Should Be Defined For Rectification Action</em>' operation.
	 * @see privacyModel.PolicyStatement#CausedByShouldBeDefinedForRectificationAction(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getPolicyStatement__CausedByShouldBeDefinedForRectificationAction__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link privacyModel.PolicyStatement#ExpiredDocument(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Expired Document</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Expired Document</em>' operation.
	 * @see privacyModel.PolicyStatement#ExpiredDocument(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getPolicyStatement__ExpiredDocument__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link privacyModel.PolicyStatement#MissingConsentForTransfer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Missing Consent For Transfer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Missing Consent For Transfer</em>' operation.
	 * @see privacyModel.PolicyStatement#MissingConsentForTransfer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getPolicyStatement__MissingConsentForTransfer__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link privacyModel.PolicyStatement#CausedByShouldBeDefinedForErasureAction(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Caused By Should Be Defined For Erasure Action</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Caused By Should Be Defined For Erasure Action</em>' operation.
	 * @see privacyModel.PolicyStatement#CausedByShouldBeDefinedForErasureAction(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getPolicyStatement__CausedByShouldBeDefinedForErasureAction__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link privacyModel.PolicyStatement#SubjectShouldBeNotifiedAboutExecutedErasure(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Subject Should Be Notified About Executed Erasure</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Subject Should Be Notified About Executed Erasure</em>' operation.
	 * @see privacyModel.PolicyStatement#SubjectShouldBeNotifiedAboutExecutedErasure(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getPolicyStatement__SubjectShouldBeNotifiedAboutExecutedErasure__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link privacyModel.PolicyStatement#WhomShouldBeDefinedForTransfer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Whom Should Be Defined For Transfer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Whom Should Be Defined For Transfer</em>' operation.
	 * @see privacyModel.PolicyStatement#WhomShouldBeDefinedForTransfer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getPolicyStatement__WhomShouldBeDefinedForTransfer__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link privacyModel.PrivacyData <em>Privacy Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Privacy Data</em>'.
	 * @see privacyModel.PrivacyData
	 * @generated
	 */
	EClass getPrivacyData();

	/**
	 * Returns the meta object for the attribute '{@link privacyModel.PrivacyData#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see privacyModel.PrivacyData#getType()
	 * @see #getPrivacyData()
	 * @generated
	 */
	EAttribute getPrivacyData_Type();

	/**
	 * Returns the meta object for class '{@link privacyModel.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see privacyModel.Service
	 * @generated
	 */
	EClass getService();

	/**
	 * Returns the meta object for the reference list '{@link privacyModel.Service#getSubservices <em>Subservices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Subservices</em>'.
	 * @see privacyModel.Service#getSubservices()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_Subservices();

	/**
	 * Returns the meta object for class '{@link privacyModel.Provider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Provider</em>'.
	 * @see privacyModel.Provider
	 * @generated
	 */
	EClass getProvider();

	/**
	 * Returns the meta object for the reference list '{@link privacyModel.Provider#getProvide <em>Provide</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Provide</em>'.
	 * @see privacyModel.Provider#getProvide()
	 * @see #getProvider()
	 * @generated
	 */
	EReference getProvider_Provide();

	/**
	 * Returns the meta object for the reference '{@link privacyModel.Provider#getLocated <em>Located</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Located</em>'.
	 * @see privacyModel.Provider#getLocated()
	 * @see #getProvider()
	 * @generated
	 */
	EReference getProvider_Located();

	/**
	 * Returns the meta object for class '{@link privacyModel.Principal <em>Principal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Principal</em>'.
	 * @see privacyModel.Principal
	 * @generated
	 */
	EClass getPrincipal();

	/**
	 * Returns the meta object for the reference list '{@link privacyModel.Principal#getSubPrincipals <em>Sub Principals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sub Principals</em>'.
	 * @see privacyModel.Principal#getSubPrincipals()
	 * @see #getPrincipal()
	 * @generated
	 */
	EReference getPrincipal_SubPrincipals();

	/**
	 * Returns the meta object for the attribute '{@link privacyModel.Principal#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see privacyModel.Principal#getType()
	 * @see #getPrincipal()
	 * @generated
	 */
	EAttribute getPrincipal_Type();

	/**
	 * Returns the meta object for the attribute '{@link privacyModel.Principal#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scope</em>'.
	 * @see privacyModel.Principal#getScope()
	 * @see #getPrincipal()
	 * @generated
	 */
	EAttribute getPrincipal_Scope();

	/**
	 * Returns the meta object for the reference list '{@link privacyModel.Principal#getResponsiblePersons <em>Responsible Persons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Responsible Persons</em>'.
	 * @see privacyModel.Principal#getResponsiblePersons()
	 * @see #getPrincipal()
	 * @generated
	 */
	EReference getPrincipal_ResponsiblePersons();

	/**
	 * Returns the meta object for the reference '{@link privacyModel.Principal#getInhabits <em>Inhabits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Inhabits</em>'.
	 * @see privacyModel.Principal#getInhabits()
	 * @see #getPrincipal()
	 * @generated
	 */
	EReference getPrincipal_Inhabits();

	/**
	 * Returns the meta object for the attribute '{@link privacyModel.Principal#getBirthdate <em>Birthdate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Birthdate</em>'.
	 * @see privacyModel.Principal#getBirthdate()
	 * @see #getPrincipal()
	 * @generated
	 */
	EAttribute getPrincipal_Birthdate();

	/**
	 * Returns the meta object for the attribute '{@link privacyModel.Principal#getAge <em>Age</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Age</em>'.
	 * @see privacyModel.Principal#getAge()
	 * @see #getPrincipal()
	 * @generated
	 */
	EAttribute getPrincipal_Age();

	/**
	 * Returns the meta object for the '{@link privacyModel.Principal#equals(privacyModel.Principal) <em>Equals</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Equals</em>' operation.
	 * @see privacyModel.Principal#equals(privacyModel.Principal)
	 * @generated
	 */
	EOperation getPrincipal__Equals__Principal();

	/**
	 * Returns the meta object for the '{@link privacyModel.Principal#NaturalPersonCanNotConatainsSubPrincipals(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Natural Person Can Not Conatains Sub Principals</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Natural Person Can Not Conatains Sub Principals</em>' operation.
	 * @see privacyModel.Principal#NaturalPersonCanNotConatainsSubPrincipals(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getPrincipal__NaturalPersonCanNotConatainsSubPrincipals__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link privacyModel.Principal#JuvenileShouldHaveResponsiblePerson(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Juvenile Should Have Responsible Person</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Juvenile Should Have Responsible Person</em>' operation.
	 * @see privacyModel.Principal#JuvenileShouldHaveResponsiblePerson(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getPrincipal__JuvenileShouldHaveResponsiblePerson__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link privacyModel.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location</em>'.
	 * @see privacyModel.Location
	 * @generated
	 */
	EClass getLocation();

	/**
	 * Returns the meta object for the attribute '{@link privacyModel.Location#isIsEUMember <em>Is EU Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is EU Member</em>'.
	 * @see privacyModel.Location#isIsEUMember()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_IsEUMember();

	/**
	 * Returns the meta object for the attribute '{@link privacyModel.Location#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see privacyModel.Location#getType()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_Type();

	/**
	 * Returns the meta object for the reference list '{@link privacyModel.Location#getSubLocations <em>Sub Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sub Locations</em>'.
	 * @see privacyModel.Location#getSubLocations()
	 * @see #getLocation()
	 * @generated
	 */
	EReference getLocation_SubLocations();

	/**
	 * Returns the meta object for the attribute '{@link privacyModel.Location#getLegalAgeLimit <em>Legal Age Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Legal Age Limit</em>'.
	 * @see privacyModel.Location#getLegalAgeLimit()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_LegalAgeLimit();

	/**
	 * Returns the meta object for the '{@link privacyModel.Location#equals(privacyModel.Location) <em>Equals</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Equals</em>' operation.
	 * @see privacyModel.Location#equals(privacyModel.Location)
	 * @generated
	 */
	EOperation getLocation__Equals__Location();

	/**
	 * Returns the meta object for class '{@link privacyModel.AbstractTime <em>Abstract Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Time</em>'.
	 * @see privacyModel.AbstractTime
	 * @generated
	 */
	EClass getAbstractTime();

	/**
	 * Returns the meta object for class '{@link privacyModel.TimeInterval <em>Time Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Interval</em>'.
	 * @see privacyModel.TimeInterval
	 * @generated
	 */
	EClass getTimeInterval();

	/**
	 * Returns the meta object for the containment reference '{@link privacyModel.TimeInterval#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Start</em>'.
	 * @see privacyModel.TimeInterval#getStart()
	 * @see #getTimeInterval()
	 * @generated
	 */
	EReference getTimeInterval_Start();

	/**
	 * Returns the meta object for the containment reference '{@link privacyModel.TimeInterval#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>End</em>'.
	 * @see privacyModel.TimeInterval#getEnd()
	 * @see #getTimeInterval()
	 * @generated
	 */
	EReference getTimeInterval_End();

	/**
	 * Returns the meta object for the '{@link privacyModel.TimeInterval#isTypeDefinedWithOtherType(privacyModel.TimePreposition, privacyModel.TimePreposition) <em>Is Type Defined With Other Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Type Defined With Other Type</em>' operation.
	 * @see privacyModel.TimeInterval#isTypeDefinedWithOtherType(privacyModel.TimePreposition, privacyModel.TimePreposition)
	 * @generated
	 */
	EOperation getTimeInterval__IsTypeDefinedWithOtherType__TimePreposition_TimePreposition();

	/**
	 * Returns the meta object for the '{@link privacyModel.TimeInterval#isTypeForbidden(privacyModel.TimePreposition) <em>Is Type Forbidden</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Type Forbidden</em>' operation.
	 * @see privacyModel.TimeInterval#isTypeForbidden(privacyModel.TimePreposition)
	 * @generated
	 */
	EOperation getTimeInterval__IsTypeForbidden__TimePreposition();

	/**
	 * Returns the meta object for the '{@link privacyModel.TimeInterval#isValid(privacyModel.TimePreposition, privacyModel.TimePreposition) <em>Is Valid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Valid</em>' operation.
	 * @see privacyModel.TimeInterval#isValid(privacyModel.TimePreposition, privacyModel.TimePreposition)
	 * @generated
	 */
	EOperation getTimeInterval__IsValid__TimePreposition_TimePreposition();

	/**
	 * Returns the meta object for the '{@link privacyModel.TimeInterval#AfterStatementBeforeBeforeStatement(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>After Statement Before Before Statement</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>After Statement Before Before Statement</em>' operation.
	 * @see privacyModel.TimeInterval#AfterStatementBeforeBeforeStatement(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getTimeInterval__AfterStatementBeforeBeforeStatement__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link privacyModel.TimeInterval#UntilTypeShouldBeDefinedAlone(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Until Type Should Be Defined Alone</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Until Type Should Be Defined Alone</em>' operation.
	 * @see privacyModel.TimeInterval#UntilTypeShouldBeDefinedAlone(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getTimeInterval__UntilTypeShouldBeDefinedAlone__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link privacyModel.TimeInterval#FromStatementBeforeToStatement(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>From Statement Before To Statement</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>From Statement Before To Statement</em>' operation.
	 * @see privacyModel.TimeInterval#FromStatementBeforeToStatement(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getTimeInterval__FromStatementBeforeToStatement__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link privacyModel.TimeInterval#OnlyFromOrFromWithTo(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Only From Or From With To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Only From Or From With To</em>' operation.
	 * @see privacyModel.TimeInterval#OnlyFromOrFromWithTo(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getTimeInterval__OnlyFromOrFromWithTo__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link privacyModel.TimeInterval#OnlyAfterOrAfterWithBefore(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Only After Or After With Before</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Only After Or After With Before</em>' operation.
	 * @see privacyModel.TimeInterval#OnlyAfterOrAfterWithBefore(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getTimeInterval__OnlyAfterOrAfterWithBefore__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link privacyModel.TimeInterval#AtTypeShouldBeDefinedAlone(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>At Type Should Be Defined Alone</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>At Type Should Be Defined Alone</em>' operation.
	 * @see privacyModel.TimeInterval#AtTypeShouldBeDefinedAlone(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getTimeInterval__AtTypeShouldBeDefinedAlone__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link privacyModel.TimeStatement <em>Time Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Statement</em>'.
	 * @see privacyModel.TimeStatement
	 * @generated
	 */
	EClass getTimeStatement();

	/**
	 * Returns the meta object for the attribute '{@link privacyModel.TimeStatement#getPreposition <em>Preposition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Preposition</em>'.
	 * @see privacyModel.TimeStatement#getPreposition()
	 * @see #getTimeStatement()
	 * @generated
	 */
	EAttribute getTimeStatement_Preposition();

	/**
	 * Returns the meta object for the attribute '{@link privacyModel.TimeStatement#getDateTime <em>Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Time</em>'.
	 * @see privacyModel.TimeStatement#getDateTime()
	 * @see #getTimeStatement()
	 * @generated
	 */
	EAttribute getTimeStatement_DateTime();

	/**
	 * Returns the meta object for class '{@link privacyModel.Purpose <em>Purpose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Purpose</em>'.
	 * @see privacyModel.Purpose
	 * @generated
	 */
	EClass getPurpose();

	/**
	 * Returns the meta object for the attribute '{@link privacyModel.Purpose#getProcessingReason <em>Processing Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Processing Reason</em>'.
	 * @see privacyModel.Purpose#getProcessingReason()
	 * @see #getPurpose()
	 * @generated
	 */
	EAttribute getPurpose_ProcessingReason();

	/**
	 * Returns the meta object for the attribute '{@link privacyModel.Purpose#getProcessingReasonSubtype <em>Processing Reason Subtype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Processing Reason Subtype</em>'.
	 * @see privacyModel.Purpose#getProcessingReasonSubtype()
	 * @see #getPurpose()
	 * @generated
	 */
	EAttribute getPurpose_ProcessingReasonSubtype();

	/**
	 * Returns the meta object for the containment reference list '{@link privacyModel.Purpose#getSubPurposes <em>Sub Purposes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Purposes</em>'.
	 * @see privacyModel.Purpose#getSubPurposes()
	 * @see #getPurpose()
	 * @generated
	 */
	EReference getPurpose_SubPurposes();

	/**
	 * Returns the meta object for the attribute '{@link privacyModel.Purpose#getDetails <em>Details</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Details</em>'.
	 * @see privacyModel.Purpose#getDetails()
	 * @see #getPurpose()
	 * @generated
	 */
	EAttribute getPurpose_Details();

	/**
	 * Returns the meta object for the '{@link privacyModel.Purpose#isValid(privacyModel.Purpose) <em>Is Valid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Valid</em>' operation.
	 * @see privacyModel.Purpose#isValid(privacyModel.Purpose)
	 * @generated
	 */
	EOperation getPurpose__IsValid__Purpose();

	/**
	 * Returns the meta object for the '{@link privacyModel.Purpose#isSubPurposeValid(privacyModel.ProcessingReason, org.eclipse.emf.common.util.EList) <em>Is Sub Purpose Valid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Sub Purpose Valid</em>' operation.
	 * @see privacyModel.Purpose#isSubPurposeValid(privacyModel.ProcessingReason, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getPurpose__IsSubPurposeValid__ProcessingReason_EList();

	/**
	 * Returns the meta object for the '{@link privacyModel.Purpose#containsAllowedPurposeReasonAndSubreason(privacyModel.ProcessingReason, org.eclipse.emf.common.util.EList) <em>Contains Allowed Purpose Reason And Subreason</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Contains Allowed Purpose Reason And Subreason</em>' operation.
	 * @see privacyModel.Purpose#containsAllowedPurposeReasonAndSubreason(privacyModel.ProcessingReason, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getPurpose__ContainsAllowedPurposeReasonAndSubreason__ProcessingReason_EList();

	/**
	 * Returns the meta object for the '{@link privacyModel.Purpose#PublicHealthShouldNotContainSubReason(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Public Health Should Not Contain Sub Reason</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Public Health Should Not Contain Sub Reason</em>' operation.
	 * @see privacyModel.Purpose#PublicHealthShouldNotContainSubReason(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getPurpose__PublicHealthShouldNotContainSubReason__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link privacyModel.Purpose#LegitimateInterestsNotContainSubReason(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Legitimate Interests Not Contain Sub Reason</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Legitimate Interests Not Contain Sub Reason</em>' operation.
	 * @see privacyModel.Purpose#LegitimateInterestsNotContainSubReason(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getPurpose__LegitimateInterestsNotContainSubReason__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link privacyModel.Purpose#StopProcessingInterestShouldNotContainSubReason(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Stop Processing Interest Should Not Contain Sub Reason</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Stop Processing Interest Should Not Contain Sub Reason</em>' operation.
	 * @see privacyModel.Purpose#StopProcessingInterestShouldNotContainSubReason(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getPurpose__StopProcessingInterestShouldNotContainSubReason__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link privacyModel.Purpose#ProfilingShouldNotContainSubReason(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Profiling Should Not Contain Sub Reason</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Profiling Should Not Contain Sub Reason</em>' operation.
	 * @see privacyModel.Purpose#ProfilingShouldNotContainSubReason(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getPurpose__ProfilingShouldNotContainSubReason__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link privacyModel.Purpose#MarketingShouldNotContainSubReason(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Marketing Should Not Contain Sub Reason</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Marketing Should Not Contain Sub Reason</em>' operation.
	 * @see privacyModel.Purpose#MarketingShouldNotContainSubReason(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getPurpose__MarketingShouldNotContainSubReason__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link privacyModel.Purpose#OutOfScopeCannotContainsThisSubReason(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Out Of Scope Cannot Contains This Sub Reason</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Out Of Scope Cannot Contains This Sub Reason</em>' operation.
	 * @see privacyModel.Purpose#OutOfScopeCannotContainsThisSubReason(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getPurpose__OutOfScopeCannotContainsThisSubReason__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link privacyModel.Purpose#ExercisingSpecificRightsPurposesCannotContainsThisSubReason(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Exercising Specific Rights Purposes Cannot Contains This Sub Reason</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Exercising Specific Rights Purposes Cannot Contains This Sub Reason</em>' operation.
	 * @see privacyModel.Purpose#ExercisingSpecificRightsPurposesCannotContainsThisSubReason(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getPurpose__ExercisingSpecificRightsPurposesCannotContainsThisSubReason__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link privacyModel.Purpose#ProtectTheVitalInterestsOfTheDataSubjectCannotContainsThisSubReason(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Protect The Vital Interests Of The Data Subject Cannot Contains This Sub Reason</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Protect The Vital Interests Of The Data Subject Cannot Contains This Sub Reason</em>' operation.
	 * @see privacyModel.Purpose#ProtectTheVitalInterestsOfTheDataSubjectCannotContainsThisSubReason(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getPurpose__ProtectTheVitalInterestsOfTheDataSubjectCannotContainsThisSubReason__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link privacyModel.Purpose#PublicInterestCannotContainsThisSubReason(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Public Interest Cannot Contains This Sub Reason</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Public Interest Cannot Contains This Sub Reason</em>' operation.
	 * @see privacyModel.Purpose#PublicInterestCannotContainsThisSubReason(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getPurpose__PublicInterestCannotContainsThisSubReason__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link privacyModel.Purpose#ResearchCannotContainsThisSubReason(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Research Cannot Contains This Sub Reason</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Research Cannot Contains This Sub Reason</em>' operation.
	 * @see privacyModel.Purpose#ResearchCannotContainsThisSubReason(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getPurpose__ResearchCannotContainsThisSubReason__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link privacyModel.Purpose#StatisticalPurposesShouldNotContainSubReason(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Statistical Purposes Should Not Contain Sub Reason</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Statistical Purposes Should Not Contain Sub Reason</em>' operation.
	 * @see privacyModel.Purpose#StatisticalPurposesShouldNotContainSubReason(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getPurpose__StatisticalPurposesShouldNotContainSubReason__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link privacyModel.Purpose#TestingShouldNotContainSubReason(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Testing Should Not Contain Sub Reason</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Testing Should Not Contain Sub Reason</em>' operation.
	 * @see privacyModel.Purpose#TestingShouldNotContainSubReason(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getPurpose__TestingShouldNotContainSubReason__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link privacyModel.What <em>What</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>What</em>'.
	 * @see privacyModel.What
	 * @generated
	 */
	EClass getWhat();

	/**
	 * Returns the meta object for the attribute list '{@link privacyModel.What#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Actions</em>'.
	 * @see privacyModel.What#getActions()
	 * @see #getWhat()
	 * @generated
	 */
	EAttribute getWhat_Actions();

	/**
	 * Returns the meta object for the reference list '{@link privacyModel.What#getProviders <em>Providers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Providers</em>'.
	 * @see privacyModel.What#getProviders()
	 * @see #getWhat()
	 * @generated
	 */
	EReference getWhat_Providers();

	/**
	 * Returns the meta object for the reference list '{@link privacyModel.What#getDatas <em>Datas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Datas</em>'.
	 * @see privacyModel.What#getDatas()
	 * @see #getWhat()
	 * @generated
	 */
	EReference getWhat_Datas();

	/**
	 * Returns the meta object for class '{@link privacyModel.How <em>How</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>How</em>'.
	 * @see privacyModel.How
	 * @generated
	 */
	EClass getHow();

	/**
	 * Returns the meta object for the reference list '{@link privacyModel.How#getDocuments <em>Documents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Documents</em>'.
	 * @see privacyModel.How#getDocuments()
	 * @see #getHow()
	 * @generated
	 */
	EReference getHow_Documents();

	/**
	 * Returns the meta object for the reference '{@link privacyModel.How#getConsent <em>Consent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Consent</em>'.
	 * @see privacyModel.How#getConsent()
	 * @see #getHow()
	 * @generated
	 */
	EReference getHow_Consent();

	/**
	 * Returns the meta object for the '{@link privacyModel.How#isConsentValid(privacyModel.How) <em>Is Consent Valid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Consent Valid</em>' operation.
	 * @see privacyModel.How#isConsentValid(privacyModel.How)
	 * @generated
	 */
	EOperation getHow__IsConsentValid__How();

	/**
	 * Returns the meta object for class '{@link privacyModel.Consent <em>Consent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Consent</em>'.
	 * @see privacyModel.Consent
	 * @generated
	 */
	EClass getConsent();

	/**
	 * Returns the meta object for the attribute '{@link privacyModel.Consent#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format</em>'.
	 * @see privacyModel.Consent#getFormat()
	 * @see #getConsent()
	 * @generated
	 */
	EAttribute getConsent_Format();

	/**
	 * Returns the meta object for the attribute '{@link privacyModel.Consent#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see privacyModel.Consent#getType()
	 * @see #getConsent()
	 * @generated
	 */
	EAttribute getConsent_Type();

	/**
	 * Returns the meta object for class '{@link privacyModel.ConfigurationManager <em>Configuration Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration Manager</em>'.
	 * @see privacyModel.ConfigurationManager
	 * @generated
	 */
	EClass getConfigurationManager();

	/**
	 * Returns the meta object for the attribute list '{@link privacyModel.ConfigurationManager#getDataSources <em>Data Sources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Data Sources</em>'.
	 * @see privacyModel.ConfigurationManager#getDataSources()
	 * @see #getConfigurationManager()
	 * @generated
	 */
	EAttribute getConfigurationManager_DataSources();

	/**
	 * Returns the meta object for the attribute list '{@link privacyModel.ConfigurationManager#getProtectionControlMethods <em>Protection Control Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Protection Control Methods</em>'.
	 * @see privacyModel.ConfigurationManager#getProtectionControlMethods()
	 * @see #getConfigurationManager()
	 * @generated
	 */
	EAttribute getConfigurationManager_ProtectionControlMethods();

	/**
	 * Returns the meta object for class '{@link privacyModel.Complaint <em>Complaint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Complaint</em>'.
	 * @see privacyModel.Complaint
	 * @generated
	 */
	EClass getComplaint();

	/**
	 * Returns the meta object for the reference '{@link privacyModel.Complaint#getWho <em>Who</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Who</em>'.
	 * @see privacyModel.Complaint#getWho()
	 * @see #getComplaint()
	 * @generated
	 */
	EReference getComplaint_Who();

	/**
	 * Returns the meta object for the attribute '{@link privacyModel.Complaint#getWhen <em>When</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>When</em>'.
	 * @see privacyModel.Complaint#getWhen()
	 * @see #getComplaint()
	 * @generated
	 */
	EAttribute getComplaint_When();

	/**
	 * Returns the meta object for the attribute '{@link privacyModel.Complaint#getReason <em>Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reason</em>'.
	 * @see privacyModel.Complaint#getReason()
	 * @see #getComplaint()
	 * @generated
	 */
	EAttribute getComplaint_Reason();

	/**
	 * Returns the meta object for the containment reference '{@link privacyModel.Complaint#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Action</em>'.
	 * @see privacyModel.Complaint#getAction()
	 * @see #getComplaint()
	 * @generated
	 */
	EReference getComplaint_Action();

	/**
	 * Returns the meta object for the '{@link privacyModel.Complaint#doesPolicyStatementExists(privacyModel.Action, privacyModel.ComplaintBasedOnDataType) <em>Does Policy Statement Exists</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Does Policy Statement Exists</em>' operation.
	 * @see privacyModel.Complaint#doesPolicyStatementExists(privacyModel.Action, privacyModel.ComplaintBasedOnDataType)
	 * @generated
	 */
	EOperation getComplaint__DoesPolicyStatementExists__Action_ComplaintBasedOnDataType();

	/**
	 * Returns the meta object for the '{@link privacyModel.Complaint#CannotIdentifyDataFromComplaint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Cannot Identify Data From Complaint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Cannot Identify Data From Complaint</em>' operation.
	 * @see privacyModel.Complaint#CannotIdentifyDataFromComplaint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getComplaint__CannotIdentifyDataFromComplaint__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link privacyModel.Complaint#StopProcessingShouldBeExecutedAsSoonAsPossible(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Stop Processing Should Be Executed As Soon As Possible</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Stop Processing Should Be Executed As Soon As Possible</em>' operation.
	 * @see privacyModel.Complaint#StopProcessingShouldBeExecutedAsSoonAsPossible(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getComplaint__StopProcessingShouldBeExecutedAsSoonAsPossible__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link privacyModel.Complaint#UserDoesntHavePermissionToWithdrawConsent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>User Doesnt Have Permission To Withdraw Consent</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>User Doesnt Have Permission To Withdraw Consent</em>' operation.
	 * @see privacyModel.Complaint#UserDoesntHavePermissionToWithdrawConsent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getComplaint__UserDoesntHavePermissionToWithdrawConsent__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link privacyModel.Complaint#ErasureShouldBeExecutedAsSoonAsPossible(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Erasure Should Be Executed As Soon As Possible</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Erasure Should Be Executed As Soon As Possible</em>' operation.
	 * @see privacyModel.Complaint#ErasureShouldBeExecutedAsSoonAsPossible(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getComplaint__ErasureShouldBeExecutedAsSoonAsPossible__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link privacyModel.Complaint#SubjectShouldBeNotifiedAboutExistingComplaintForErasure(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Subject Should Be Notified About Existing Complaint For Erasure</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Subject Should Be Notified About Existing Complaint For Erasure</em>' operation.
	 * @see privacyModel.Complaint#SubjectShouldBeNotifiedAboutExistingComplaintForErasure(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getComplaint__SubjectShouldBeNotifiedAboutExistingComplaintForErasure__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link privacyModel.Complaint#RectificationShouldBeExecutedAsSoonAsPossible(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Rectification Should Be Executed As Soon As Possible</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Rectification Should Be Executed As Soon As Possible</em>' operation.
	 * @see privacyModel.Complaint#RectificationShouldBeExecutedAsSoonAsPossible(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getComplaint__RectificationShouldBeExecutedAsSoonAsPossible__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link privacyModel.Complaint#InvalidTypeOfPurposeForAnObject(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Invalid Type Of Purpose For An Object</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Invalid Type Of Purpose For An Object</em>' operation.
	 * @see privacyModel.Complaint#InvalidTypeOfPurposeForAnObject(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getComplaint__InvalidTypeOfPurposeForAnObject__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link privacyModel.Complaint#UserDoesntHavePermissionToComplaint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>User Doesnt Have Permission To Complaint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>User Doesnt Have Permission To Complaint</em>' operation.
	 * @see privacyModel.Complaint#UserDoesntHavePermissionToComplaint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getComplaint__UserDoesntHavePermissionToComplaint__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link privacyModel.Complaint#SubjectShouldBeNotifiedAboutWithdraw(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Subject Should Be Notified About Withdraw</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Subject Should Be Notified About Withdraw</em>' operation.
	 * @see privacyModel.Complaint#SubjectShouldBeNotifiedAboutWithdraw(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getComplaint__SubjectShouldBeNotifiedAboutWithdraw__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link privacyModel.Complaint#SubjectShouldBeNotifiedAboutExistingComplaintForRectification(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Subject Should Be Notified About Existing Complaint For Rectification</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Subject Should Be Notified About Existing Complaint For Rectification</em>' operation.
	 * @see privacyModel.Complaint#SubjectShouldBeNotifiedAboutExistingComplaintForRectification(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getComplaint__SubjectShouldBeNotifiedAboutExistingComplaintForRectification__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link privacyModel.PrivacyPolicyHelper <em>Privacy Policy Helper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Privacy Policy Helper</em>'.
	 * @see privacyModel.PrivacyPolicyHelper
	 * @generated
	 */
	EClass getPrivacyPolicyHelper();

	/**
	 * Returns the meta object for the '{@link privacyModel.PrivacyPolicyHelper#isPolicyControlValid(java.lang.String) <em>Is Policy Control Valid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Policy Control Valid</em>' operation.
	 * @see privacyModel.PrivacyPolicyHelper#isPolicyControlValid(java.lang.String)
	 * @generated
	 */
	EOperation getPrivacyPolicyHelper__IsPolicyControlValid__String();

	/**
	 * Returns the meta object for the '{@link privacyModel.PrivacyPolicyHelper#isDataSourceValid(java.lang.String) <em>Is Data Source Valid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Data Source Valid</em>' operation.
	 * @see privacyModel.PrivacyPolicyHelper#isDataSourceValid(java.lang.String)
	 * @generated
	 */
	EOperation getPrivacyPolicyHelper__IsDataSourceValid__String();

	/**
	 * Returns the meta object for the '{@link privacyModel.PrivacyPolicyHelper#areIntervalsOverlap(privacyModel.AbstractTime, privacyModel.AbstractTime) <em>Are Intervals Overlap</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Are Intervals Overlap</em>' operation.
	 * @see privacyModel.PrivacyPolicyHelper#areIntervalsOverlap(privacyModel.AbstractTime, privacyModel.AbstractTime)
	 * @generated
	 */
	EOperation getPrivacyPolicyHelper__AreIntervalsOverlap__AbstractTime_AbstractTime();

	/**
	 * Returns the meta object for the '{@link privacyModel.PrivacyPolicyHelper#areDatesOverlap(privacyModel.AbstractTime, java.util.Date) <em>Are Dates Overlap</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Are Dates Overlap</em>' operation.
	 * @see privacyModel.PrivacyPolicyHelper#areDatesOverlap(privacyModel.AbstractTime, java.util.Date)
	 * @generated
	 */
	EOperation getPrivacyPolicyHelper__AreDatesOverlap__AbstractTime_Date();

	/**
	 * Returns the meta object for the '{@link privacyModel.PrivacyPolicyHelper#doesIntervalStartBeforeInterval(privacyModel.AbstractTime, privacyModel.AbstractTime) <em>Does Interval Start Before Interval</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Does Interval Start Before Interval</em>' operation.
	 * @see privacyModel.PrivacyPolicyHelper#doesIntervalStartBeforeInterval(privacyModel.AbstractTime, privacyModel.AbstractTime)
	 * @generated
	 */
	EOperation getPrivacyPolicyHelper__DoesIntervalStartBeforeInterval__AbstractTime_AbstractTime();

	/**
	 * Returns the meta object for the '{@link privacyModel.PrivacyPolicyHelper#isDateBeforeInterval(privacyModel.AbstractTime, java.util.Date) <em>Is Date Before Interval</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Date Before Interval</em>' operation.
	 * @see privacyModel.PrivacyPolicyHelper#isDateBeforeInterval(privacyModel.AbstractTime, java.util.Date)
	 * @generated
	 */
	EOperation getPrivacyPolicyHelper__IsDateBeforeInterval__AbstractTime_Date();

	/**
	 * Returns the meta object for the '{@link privacyModel.PrivacyPolicyHelper#isDateAfterInterval(privacyModel.AbstractTime, java.util.Date) <em>Is Date After Interval</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Date After Interval</em>' operation.
	 * @see privacyModel.PrivacyPolicyHelper#isDateAfterInterval(privacyModel.AbstractTime, java.util.Date)
	 * @generated
	 */
	EOperation getPrivacyPolicyHelper__IsDateAfterInterval__AbstractTime_Date();

	/**
	 * Returns the meta object for the '{@link privacyModel.PrivacyPolicyHelper#isDateInInterval(privacyModel.AbstractTime, java.util.Date) <em>Is Date In Interval</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Date In Interval</em>' operation.
	 * @see privacyModel.PrivacyPolicyHelper#isDateInInterval(privacyModel.AbstractTime, java.util.Date)
	 * @generated
	 */
	EOperation getPrivacyPolicyHelper__IsDateInInterval__AbstractTime_Date();

	/**
	 * Returns the meta object for class '{@link privacyModel.Where <em>Where</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Where</em>'.
	 * @see privacyModel.Where
	 * @generated
	 */
	EClass getWhere();

	/**
	 * Returns the meta object for the reference '{@link privacyModel.Where#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see privacyModel.Where#getSource()
	 * @see #getWhere()
	 * @generated
	 */
	EReference getWhere_Source();

	/**
	 * Returns the meta object for the reference '{@link privacyModel.Where#getDestination <em>Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Destination</em>'.
	 * @see privacyModel.Where#getDestination()
	 * @see #getWhere()
	 * @generated
	 */
	EReference getWhere_Destination();

	/**
	 * Returns the meta object for the '{@link privacyModel.Where#equals(privacyModel.Where) <em>Equals</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Equals</em>' operation.
	 * @see privacyModel.Where#equals(privacyModel.Where)
	 * @generated
	 */
	EOperation getWhere__Equals__Where();

	/**
	 * Returns the meta object for class '{@link privacyModel.Document <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document</em>'.
	 * @see privacyModel.Document
	 * @generated
	 */
	EClass getDocument();

	/**
	 * Returns the meta object for the attribute '{@link privacyModel.Document#getDocumentType <em>Document Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Document Type</em>'.
	 * @see privacyModel.Document#getDocumentType()
	 * @see #getDocument()
	 * @generated
	 */
	EAttribute getDocument_DocumentType();

	/**
	 * Returns the meta object for class '{@link privacyModel.AbstractPaper <em>Abstract Paper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Paper</em>'.
	 * @see privacyModel.AbstractPaper
	 * @generated
	 */
	EClass getAbstractPaper();

	/**
	 * Returns the meta object for the reference '{@link privacyModel.AbstractPaper#getProvidedBy <em>Provided By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Provided By</em>'.
	 * @see privacyModel.AbstractPaper#getProvidedBy()
	 * @see #getAbstractPaper()
	 * @generated
	 */
	EReference getAbstractPaper_ProvidedBy();

	/**
	 * Returns the meta object for the attribute '{@link privacyModel.AbstractPaper#getTerminationExplanation <em>Termination Explanation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Termination Explanation</em>'.
	 * @see privacyModel.AbstractPaper#getTerminationExplanation()
	 * @see #getAbstractPaper()
	 * @generated
	 */
	EAttribute getAbstractPaper_TerminationExplanation();

	/**
	 * Returns the meta object for the attribute '{@link privacyModel.AbstractPaper#getStartDate <em>Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Date</em>'.
	 * @see privacyModel.AbstractPaper#getStartDate()
	 * @see #getAbstractPaper()
	 * @generated
	 */
	EAttribute getAbstractPaper_StartDate();

	/**
	 * Returns the meta object for the attribute '{@link privacyModel.AbstractPaper#getTerminationDate <em>Termination Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Termination Date</em>'.
	 * @see privacyModel.AbstractPaper#getTerminationDate()
	 * @see #getAbstractPaper()
	 * @generated
	 */
	EAttribute getAbstractPaper_TerminationDate();

	/**
	 * Returns the meta object for the attribute '{@link privacyModel.AbstractPaper#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see privacyModel.AbstractPaper#getLocation()
	 * @see #getAbstractPaper()
	 * @generated
	 */
	EAttribute getAbstractPaper_Location();

	/**
	 * Returns the meta object for the attribute '{@link privacyModel.AbstractPaper#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see privacyModel.AbstractPaper#getDescription()
	 * @see #getAbstractPaper()
	 * @generated
	 */
	EAttribute getAbstractPaper_Description();

	/**
	 * Returns the meta object for the '{@link privacyModel.AbstractPaper#StartDateShouldBeBeforeTerminationDate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Start Date Should Be Before Termination Date</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Start Date Should Be Before Termination Date</em>' operation.
	 * @see privacyModel.AbstractPaper#StartDateShouldBeBeforeTerminationDate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getAbstractPaper__StartDateShouldBeBeforeTerminationDate__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link privacyModel.AbstractComplaintAction <em>Abstract Complaint Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Complaint Action</em>'.
	 * @see privacyModel.AbstractComplaintAction
	 * @generated
	 */
	EClass getAbstractComplaintAction();

	/**
	 * Returns the meta object for class '{@link privacyModel.Withdraw <em>Withdraw</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Withdraw</em>'.
	 * @see privacyModel.Withdraw
	 * @generated
	 */
	EClass getWithdraw();

	/**
	 * Returns the meta object for the reference '{@link privacyModel.Withdraw#getSubject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Subject</em>'.
	 * @see privacyModel.Withdraw#getSubject()
	 * @see #getWithdraw()
	 * @generated
	 */
	EReference getWithdraw_Subject();

	/**
	 * Returns the meta object for class '{@link privacyModel.ComplaintBasedOnData <em>Complaint Based On Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Complaint Based On Data</em>'.
	 * @see privacyModel.ComplaintBasedOnData
	 * @generated
	 */
	EClass getComplaintBasedOnData();

	/**
	 * Returns the meta object for the reference list '{@link privacyModel.ComplaintBasedOnData#getSubject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Subject</em>'.
	 * @see privacyModel.ComplaintBasedOnData#getSubject()
	 * @see #getComplaintBasedOnData()
	 * @generated
	 */
	EReference getComplaintBasedOnData_Subject();

	/**
	 * Returns the meta object for the attribute '{@link privacyModel.ComplaintBasedOnData#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see privacyModel.ComplaintBasedOnData#getType()
	 * @see #getComplaintBasedOnData()
	 * @generated
	 */
	EAttribute getComplaintBasedOnData_Type();

	/**
	 * Returns the meta object for class '{@link privacyModel.SharedPrivacyData <em>Shared Privacy Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shared Privacy Data</em>'.
	 * @see privacyModel.SharedPrivacyData
	 * @generated
	 */
	EClass getSharedPrivacyData();

	/**
	 * Returns the meta object for the attribute list '{@link privacyModel.SharedPrivacyData#getAdditionalProtectionControls <em>Additional Protection Controls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Additional Protection Controls</em>'.
	 * @see privacyModel.SharedPrivacyData#getAdditionalProtectionControls()
	 * @see #getSharedPrivacyData()
	 * @generated
	 */
	EAttribute getSharedPrivacyData_AdditionalProtectionControls();

	/**
	 * Returns the meta object for the reference '{@link privacyModel.SharedPrivacyData#getPrivacydata <em>Privacydata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Privacydata</em>'.
	 * @see privacyModel.SharedPrivacyData#getPrivacydata()
	 * @see #getSharedPrivacyData()
	 * @generated
	 */
	EReference getSharedPrivacyData_Privacydata();

	/**
	 * Returns the meta object for the attribute '{@link privacyModel.SharedPrivacyData#isColllectedFromSubject <em>Colllected From Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Colllected From Subject</em>'.
	 * @see privacyModel.SharedPrivacyData#isColllectedFromSubject()
	 * @see #getSharedPrivacyData()
	 * @generated
	 */
	EAttribute getSharedPrivacyData_ColllectedFromSubject();

	/**
	 * Returns the meta object for the attribute '{@link privacyModel.SharedPrivacyData#getDataSource <em>Data Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Source</em>'.
	 * @see privacyModel.SharedPrivacyData#getDataSource()
	 * @see #getSharedPrivacyData()
	 * @generated
	 */
	EAttribute getSharedPrivacyData_DataSource();

	/**
	 * Returns the meta object for the '{@link privacyModel.SharedPrivacyData#ProtectionControlShouldExistsInConfiguration(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Protection Control Should Exists In Configuration</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Protection Control Should Exists In Configuration</em>' operation.
	 * @see privacyModel.SharedPrivacyData#ProtectionControlShouldExistsInConfiguration(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getSharedPrivacyData__ProtectionControlShouldExistsInConfiguration__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link privacyModel.SharedPrivacyData#DataSourceShouldExistsInConfiguration(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Data Source Should Exists In Configuration</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Data Source Should Exists In Configuration</em>' operation.
	 * @see privacyModel.SharedPrivacyData#DataSourceShouldExistsInConfiguration(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getSharedPrivacyData__DataSourceShouldExistsInConfiguration__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link privacyModel.Denial <em>Denial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Denial</em>'.
	 * @see privacyModel.Denial
	 * @generated
	 */
	EClass getDenial();

	/**
	 * Returns the meta object for the attribute '{@link privacyModel.Denial#getWhen <em>When</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>When</em>'.
	 * @see privacyModel.Denial#getWhen()
	 * @see #getDenial()
	 * @generated
	 */
	EAttribute getDenial_When();

	/**
	 * Returns the meta object for the reference '{@link privacyModel.Denial#getApprovedBy <em>Approved By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Approved By</em>'.
	 * @see privacyModel.Denial#getApprovedBy()
	 * @see #getDenial()
	 * @generated
	 */
	EReference getDenial_ApprovedBy();

	/**
	 * Returns the meta object for the attribute '{@link privacyModel.Denial#getReason <em>Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reason</em>'.
	 * @see privacyModel.Denial#getReason()
	 * @see #getDenial()
	 * @generated
	 */
	EAttribute getDenial_Reason();

	/**
	 * Returns the meta object for the reference list '{@link privacyModel.Denial#getBasedOnStatements <em>Based On Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Based On Statements</em>'.
	 * @see privacyModel.Denial#getBasedOnStatements()
	 * @see #getDenial()
	 * @generated
	 */
	EReference getDenial_BasedOnStatements();

	/**
	 * Returns the meta object for class '{@link privacyModel.Notification <em>Notification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Notification</em>'.
	 * @see privacyModel.Notification
	 * @generated
	 */
	EClass getNotification();

	/**
	 * Returns the meta object for the attribute '{@link privacyModel.Notification#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see privacyModel.Notification#getType()
	 * @see #getNotification()
	 * @generated
	 */
	EAttribute getNotification_Type();

	/**
	 * Returns the meta object for the reference list '{@link privacyModel.Notification#getNotifiers <em>Notifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Notifiers</em>'.
	 * @see privacyModel.Notification#getNotifiers()
	 * @see #getNotification()
	 * @generated
	 */
	EReference getNotification_Notifiers();

	/**
	 * Returns the meta object for the reference list '{@link privacyModel.Notification#getReceivers <em>Receivers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Receivers</em>'.
	 * @see privacyModel.Notification#getReceivers()
	 * @see #getNotification()
	 * @generated
	 */
	EReference getNotification_Receivers();

	/**
	 * Returns the meta object for the reference '{@link privacyModel.Notification#getCausedBy <em>Caused By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Caused By</em>'.
	 * @see privacyModel.Notification#getCausedBy()
	 * @see #getNotification()
	 * @generated
	 */
	EReference getNotification_CausedBy();

	/**
	 * Returns the meta object for the attribute '{@link privacyModel.Notification#getWhen <em>When</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>When</em>'.
	 * @see privacyModel.Notification#getWhen()
	 * @see #getNotification()
	 * @generated
	 */
	EAttribute getNotification_When();

	/**
	 * Returns the meta object for the '{@link privacyModel.Notification#ShouldDefineCausedByAsErasure(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Should Define Caused By As Erasure</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Should Define Caused By As Erasure</em>' operation.
	 * @see privacyModel.Notification#ShouldDefineCausedByAsErasure(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getNotification__ShouldDefineCausedByAsErasure__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link privacyModel.Notification#ShouldDefineCausedByAsPrivacyPolicy(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Should Define Caused By As Privacy Policy</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Should Define Caused By As Privacy Policy</em>' operation.
	 * @see privacyModel.Notification#ShouldDefineCausedByAsPrivacyPolicy(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getNotification__ShouldDefineCausedByAsPrivacyPolicy__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link privacyModel.Notification#ShouldDefineCausedByAsWithdraw(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Should Define Caused By As Withdraw</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Should Define Caused By As Withdraw</em>' operation.
	 * @see privacyModel.Notification#ShouldDefineCausedByAsWithdraw(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getNotification__ShouldDefineCausedByAsWithdraw__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link privacyModel.Notification#ShouldDefineCausedByAsRectification(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Should Define Caused By As Rectification</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Should Define Caused By As Rectification</em>' operation.
	 * @see privacyModel.Notification#ShouldDefineCausedByAsRectification(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getNotification__ShouldDefineCausedByAsRectification__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link privacyModel.NotificationInfo <em>Notification Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Notification Info</em>'.
	 * @see privacyModel.NotificationInfo
	 * @generated
	 */
	EClass getNotificationInfo();

	/**
	 * Returns the meta object for class '{@link privacyModel.AbstractComplaint <em>Abstract Complaint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Complaint</em>'.
	 * @see privacyModel.AbstractComplaint
	 * @generated
	 */
	EClass getAbstractComplaint();

	/**
	 * Returns the meta object for the attribute '{@link privacyModel.AbstractComplaint#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see privacyModel.AbstractComplaint#getStatus()
	 * @see #getAbstractComplaint()
	 * @generated
	 */
	EAttribute getAbstractComplaint_Status();

	/**
	 * Returns the meta object for the reference '{@link privacyModel.AbstractComplaint#getDenialReason <em>Denial Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Denial Reason</em>'.
	 * @see privacyModel.AbstractComplaint#getDenialReason()
	 * @see #getAbstractComplaint()
	 * @generated
	 */
	EReference getAbstractComplaint_DenialReason();

	/**
	 * Returns the meta object for class '{@link privacyModel.ComplaintBasedOnAction <em>Complaint Based On Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Complaint Based On Action</em>'.
	 * @see privacyModel.ComplaintBasedOnAction
	 * @generated
	 */
	EClass getComplaintBasedOnAction();

	/**
	 * Returns the meta object for the reference '{@link privacyModel.ComplaintBasedOnAction#getStatement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Statement</em>'.
	 * @see privacyModel.ComplaintBasedOnAction#getStatement()
	 * @see #getComplaintBasedOnAction()
	 * @generated
	 */
	EReference getComplaintBasedOnAction_Statement();

	/**
	 * Returns the meta object for enum '{@link privacyModel.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Data Type</em>'.
	 * @see privacyModel.DataType
	 * @generated
	 */
	EEnum getDataType();

	/**
	 * Returns the meta object for enum '{@link privacyModel.DocumentType <em>Document Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Document Type</em>'.
	 * @see privacyModel.DocumentType
	 * @generated
	 */
	EEnum getDocumentType();

	/**
	 * Returns the meta object for enum '{@link privacyModel.TimePreposition <em>Time Preposition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Time Preposition</em>'.
	 * @see privacyModel.TimePreposition
	 * @generated
	 */
	EEnum getTimePreposition();

	/**
	 * Returns the meta object for enum '{@link privacyModel.PrincipalType <em>Principal Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Principal Type</em>'.
	 * @see privacyModel.PrincipalType
	 * @generated
	 */
	EEnum getPrincipalType();

	/**
	 * Returns the meta object for enum '{@link privacyModel.PrincipalScope <em>Principal Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Principal Scope</em>'.
	 * @see privacyModel.PrincipalScope
	 * @generated
	 */
	EEnum getPrincipalScope();

	/**
	 * Returns the meta object for enum '{@link privacyModel.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Action</em>'.
	 * @see privacyModel.Action
	 * @generated
	 */
	EEnum getAction();

	/**
	 * Returns the meta object for enum '{@link privacyModel.LocationType <em>Location Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Location Type</em>'.
	 * @see privacyModel.LocationType
	 * @generated
	 */
	EEnum getLocationType();

	/**
	 * Returns the meta object for enum '{@link privacyModel.ProcessingReason <em>Processing Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Processing Reason</em>'.
	 * @see privacyModel.ProcessingReason
	 * @generated
	 */
	EEnum getProcessingReason();

	/**
	 * Returns the meta object for enum '{@link privacyModel.ProcessingReasonSubtype <em>Processing Reason Subtype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Processing Reason Subtype</em>'.
	 * @see privacyModel.ProcessingReasonSubtype
	 * @generated
	 */
	EEnum getProcessingReasonSubtype();

	/**
	 * Returns the meta object for enum '{@link privacyModel.ConsentFormat <em>Consent Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Consent Format</em>'.
	 * @see privacyModel.ConsentFormat
	 * @generated
	 */
	EEnum getConsentFormat();

	/**
	 * Returns the meta object for enum '{@link privacyModel.ConsentType <em>Consent Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Consent Type</em>'.
	 * @see privacyModel.ConsentType
	 * @generated
	 */
	EEnum getConsentType();

	/**
	 * Returns the meta object for enum '{@link privacyModel.ComplaintBasedOnDataType <em>Complaint Based On Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Complaint Based On Data Type</em>'.
	 * @see privacyModel.ComplaintBasedOnDataType
	 * @generated
	 */
	EEnum getComplaintBasedOnDataType();

	/**
	 * Returns the meta object for enum '{@link privacyModel.NotificationType <em>Notification Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Notification Type</em>'.
	 * @see privacyModel.NotificationType
	 * @generated
	 */
	EEnum getNotificationType();

	/**
	 * Returns the meta object for enum '{@link privacyModel.ComplaintStatus <em>Complaint Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Complaint Status</em>'.
	 * @see privacyModel.ComplaintStatus
	 * @generated
	 */
	EEnum getComplaintStatus();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PrivacyModelFactory getPrivacyModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link privacyModel.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see privacyModel.impl.NamedElementImpl
		 * @see privacyModel.impl.PrivacyModelPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link privacyModel.impl.PrivacyPolicyImpl <em>Privacy Policy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see privacyModel.impl.PrivacyPolicyImpl
		 * @see privacyModel.impl.PrivacyModelPackageImpl#getPrivacyPolicy()
		 * @generated
		 */
		EClass PRIVACY_POLICY = eINSTANCE.getPrivacyPolicy();

		/**
		 * The meta object literal for the '<em><b>Policy Statements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIVACY_POLICY__POLICY_STATEMENTS = eINSTANCE.getPrivacyPolicy_PolicyStatements();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIVACY_POLICY__OWNER = eINSTANCE.getPrivacyPolicy_Owner();

		/**
		 * The meta object literal for the '<em><b>All Principals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIVACY_POLICY__ALL_PRINCIPALS = eINSTANCE.getPrivacyPolicy_AllPrincipals();

		/**
		 * The meta object literal for the '<em><b>Locations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIVACY_POLICY__LOCATIONS = eINSTANCE.getPrivacyPolicy_Locations();

		/**
		 * The meta object literal for the '<em><b>Default Protection Controls</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIVACY_POLICY__DEFAULT_PROTECTION_CONTROLS = eINSTANCE.getPrivacyPolicy_DefaultProtectionControls();

		/**
		 * The meta object literal for the '<em><b>All Services</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIVACY_POLICY__ALL_SERVICES = eINSTANCE.getPrivacyPolicy_AllServices();

		/**
		 * The meta object literal for the '<em><b>All Providers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIVACY_POLICY__ALL_PROVIDERS = eINSTANCE.getPrivacyPolicy_AllProviders();

		/**
		 * The meta object literal for the '<em><b>Configuration Manager</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIVACY_POLICY__CONFIGURATION_MANAGER = eINSTANCE.getPrivacyPolicy_ConfigurationManager();

		/**
		 * The meta object literal for the '<em><b>All Datas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIVACY_POLICY__ALL_DATAS = eINSTANCE.getPrivacyPolicy_AllDatas();

		/**
		 * The meta object literal for the '<em><b>All Complaints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIVACY_POLICY__ALL_COMPLAINTS = eINSTANCE.getPrivacyPolicy_AllComplaints();

		/**
		 * The meta object literal for the '<em><b>Privacy Policy Helper</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIVACY_POLICY__PRIVACY_POLICY_HELPER = eINSTANCE.getPrivacyPolicy_PrivacyPolicyHelper();

		/**
		 * The meta object literal for the '<em><b>All Denials</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIVACY_POLICY__ALL_DENIALS = eINSTANCE.getPrivacyPolicy_AllDenials();

		/**
		 * The meta object literal for the '<em><b>All Consents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIVACY_POLICY__ALL_CONSENTS = eINSTANCE.getPrivacyPolicy_AllConsents();

		/**
		 * The meta object literal for the '<em><b>All Documents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIVACY_POLICY__ALL_DOCUMENTS = eINSTANCE.getPrivacyPolicy_AllDocuments();

		/**
		 * The meta object literal for the '<em><b>Notifications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIVACY_POLICY__NOTIFICATIONS = eINSTANCE.getPrivacyPolicy_Notifications();

		/**
		 * The meta object literal for the '<em><b>All Shared Privacy Data</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIVACY_POLICY__ALL_SHARED_PRIVACY_DATA = eINSTANCE.getPrivacyPolicy_AllSharedPrivacyData();

		/**
		 * The meta object literal for the '<em><b>Unique Provider Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PRIVACY_POLICY___UNIQUE_PROVIDER_NAME__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getPrivacyPolicy__UniqueProviderName__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Unique Consent Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PRIVACY_POLICY___UNIQUE_CONSENT_NAME__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getPrivacyPolicy__UniqueConsentName__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Unique Service Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PRIVACY_POLICY___UNIQUE_SERVICE_NAME__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getPrivacyPolicy__UniqueServiceName__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Owner Should Have Defined Inhabits</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PRIVACY_POLICY___OWNER_SHOULD_HAVE_DEFINED_INHABITS__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getPrivacyPolicy__OwnerShouldHaveDefinedInhabits__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Unique Policy Statement Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PRIVACY_POLICY___UNIQUE_POLICY_STATEMENT_NAME__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getPrivacyPolicy__UniquePolicyStatementName__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Protection Control Should Exists In Configuration</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PRIVACY_POLICY___PROTECTION_CONTROL_SHOULD_EXISTS_IN_CONFIGURATION__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getPrivacyPolicy__ProtectionControlShouldExistsInConfiguration__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Unique Privacy Data Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PRIVACY_POLICY___UNIQUE_PRIVACY_DATA_NAME__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getPrivacyPolicy__UniquePrivacyDataName__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Unique Document Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PRIVACY_POLICY___UNIQUE_DOCUMENT_NAME__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getPrivacyPolicy__UniqueDocumentName__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Unique Location Per Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PRIVACY_POLICY___UNIQUE_LOCATION_PER_TYPE__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getPrivacyPolicy__UniqueLocationPerType__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Unique Principal Name Per Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PRIVACY_POLICY___UNIQUE_PRINCIPAL_NAME_PER_TYPE__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getPrivacyPolicy__UniquePrincipalNamePerType__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Unique Complaint Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PRIVACY_POLICY___UNIQUE_COMPLAINT_NAME__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getPrivacyPolicy__UniqueComplaintName__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link privacyModel.impl.PolicyStatementImpl <em>Policy Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see privacyModel.impl.PolicyStatementImpl
		 * @see privacyModel.impl.PrivacyModelPackageImpl#getPolicyStatement()
		 * @generated
		 */
		EClass POLICY_STATEMENT = eINSTANCE.getPolicyStatement();

		/**
		 * The meta object literal for the '<em><b>When</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POLICY_STATEMENT__WHEN = eINSTANCE.getPolicyStatement_When();

		/**
		 * The meta object literal for the '<em><b>Who</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POLICY_STATEMENT__WHO = eINSTANCE.getPolicyStatement_Who();

		/**
		 * The meta object literal for the '<em><b>Why</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POLICY_STATEMENT__WHY = eINSTANCE.getPolicyStatement_Why();

		/**
		 * The meta object literal for the '<em><b>What</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POLICY_STATEMENT__WHAT = eINSTANCE.getPolicyStatement_What();

		/**
		 * The meta object literal for the '<em><b>How</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POLICY_STATEMENT__HOW = eINSTANCE.getPolicyStatement_How();

		/**
		 * The meta object literal for the '<em><b>Whose</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POLICY_STATEMENT__WHOSE = eINSTANCE.getPolicyStatement_Whose();

		/**
		 * The meta object literal for the '<em><b>Whom</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POLICY_STATEMENT__WHOM = eINSTANCE.getPolicyStatement_Whom();

		/**
		 * The meta object literal for the '<em><b>Where</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POLICY_STATEMENT__WHERE = eINSTANCE.getPolicyStatement_Where();

		/**
		 * The meta object literal for the '<em><b>Caused By</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POLICY_STATEMENT__CAUSED_BY = eINSTANCE.getPolicyStatement_CausedBy();

		/**
		 * The meta object literal for the '<em><b>Date Should Be Defined For Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation POLICY_STATEMENT___DATE_SHOULD_BE_DEFINED_FOR_TYPE__ACTION = eINSTANCE
				.getPolicyStatement__DateShouldBeDefinedForType__Action();

		/**
		 * The meta object literal for the '<em><b>Caused By Should Be Defined For Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation POLICY_STATEMENT___CAUSED_BY_SHOULD_BE_DEFINED_FOR_TYPE__ACTION = eINSTANCE
				.getPolicyStatement__CausedByShouldBeDefinedForType__Action();

		/**
		 * The meta object literal for the '<em><b>Document Is Needed For Purpose</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation POLICY_STATEMENT___DOCUMENT_IS_NEEDED_FOR_PURPOSE__DOCUMENTTYPE_PROCESSINGREASON = eINSTANCE
				.getPolicyStatement__DocumentIsNeededForPurpose__DocumentType_ProcessingReason();

		/**
		 * The meta object literal for the '<em><b>Subject Should Be Notified About Transfer To Third Country</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation POLICY_STATEMENT___SUBJECT_SHOULD_BE_NOTIFIED_ABOUT_TRANSFER_TO_THIRD_COUNTRY__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getPolicyStatement__SubjectShouldBeNotifiedAboutTransferToThirdCountry__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Subject Should Be Notified About Executed Rectification</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation POLICY_STATEMENT___SUBJECT_SHOULD_BE_NOTIFIED_ABOUT_EXECUTED_RECTIFICATION__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getPolicyStatement__SubjectShouldBeNotifiedAboutExecutedRectification__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Subject Should Be Notified About Stop Processing</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation POLICY_STATEMENT___SUBJECT_SHOULD_BE_NOTIFIED_ABOUT_STOP_PROCESSING__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getPolicyStatement__SubjectShouldBeNotifiedAboutStopProcessing__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Controller Approval Is Need For Protect The Vital Interests Of The Data Subject Purpose</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation POLICY_STATEMENT___CONTROLLER_APPROVAL_IS_NEED_FOR_PROTECT_THE_VITAL_INTERESTS_OF_THE_DATA_SUBJECT_PURPOSE__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getPolicyStatement__ControllerApprovalIsNeedForProtectTheVitalInterestsOfTheDataSubjectPurpose__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Missing Consent For Collecting</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation POLICY_STATEMENT___MISSING_CONSENT_FOR_COLLECTING__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getPolicyStatement__MissingConsentForCollecting__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Expired Consent</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation POLICY_STATEMENT___EXPIRED_CONSENT__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getPolicyStatement__ExpiredConsent__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Stop Processing Purpose For Action Stop Processing</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation POLICY_STATEMENT___STOP_PROCESSING_PURPOSE_FOR_ACTION_STOP_PROCESSING__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getPolicyStatement__StopProcessingPurposeForActionStopProcessing__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Withdrawed Consent</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation POLICY_STATEMENT___WITHDRAWED_CONSENT__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getPolicyStatement__WithdrawedConsent__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Processing Of Special Categories</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation POLICY_STATEMENT___PROCESSING_OF_SPECIAL_CATEGORIES__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getPolicyStatement__ProcessingOfSpecialCategories__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Subject Should Be Notified About Collecting</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation POLICY_STATEMENT___SUBJECT_SHOULD_BE_NOTIFIED_ABOUT_COLLECTING__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getPolicyStatement__SubjectShouldBeNotifiedAboutCollecting__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Date Shoud Be Defined For Store Action</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation POLICY_STATEMENT___DATE_SHOUD_BE_DEFINED_FOR_STORE_ACTION__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getPolicyStatement__DateShoudBeDefinedForStoreAction__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Court Approval Is Need For Public Interest Purpose</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation POLICY_STATEMENT___COURT_APPROVAL_IS_NEED_FOR_PUBLIC_INTEREST_PURPOSE__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getPolicyStatement__CourtApprovalIsNeedForPublicInterestPurpose__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Controller Approval Is Need For Legitimate Interests Purpose</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation POLICY_STATEMENT___CONTROLLER_APPROVAL_IS_NEED_FOR_LEGITIMATE_INTERESTS_PURPOSE__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getPolicyStatement__ControllerApprovalIsNeedForLegitimateInterestsPurpose__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Date Shoud Be Defined For Access Action</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation POLICY_STATEMENT___DATE_SHOUD_BE_DEFINED_FOR_ACCESS_ACTION__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getPolicyStatement__DateShoudBeDefinedForAccessAction__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Expired Consent For Collecting</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation POLICY_STATEMENT___EXPIRED_CONSENT_FOR_COLLECTING__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getPolicyStatement__ExpiredConsentForCollecting__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Caused By Should Be Defined For Stop Processing Action</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation POLICY_STATEMENT___CAUSED_BY_SHOULD_BE_DEFINED_FOR_STOP_PROCESSING_ACTION__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getPolicyStatement__CausedByShouldBeDefinedForStopProcessingAction__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Juvenile Data Should Be Used With Document Of Type Child Custody Provided By Responsible Person</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation POLICY_STATEMENT___JUVENILE_DATA_SHOULD_BE_USED_WITH_DOCUMENT_OF_TYPE_CHILD_CUSTODY_PROVIDED_BY_RESPONSIBLE_PERSON__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getPolicyStatement__JuvenileDataShouldBeUsedWithDocumentOfTypeChildCustodyProvidedByResponsiblePerson__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Missing Consent Or Transfer Certificate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation POLICY_STATEMENT___MISSING_CONSENT_OR_TRANSFER_CERTIFICATE__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getPolicyStatement__MissingConsentOrTransferCertificate__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Undefined Purpose For Action</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation POLICY_STATEMENT___UNDEFINED_PURPOSE_FOR_ACTION__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getPolicyStatement__UndefinedPurposeForAction__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Caused By Should Be Defined For Rectification Action</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation POLICY_STATEMENT___CAUSED_BY_SHOULD_BE_DEFINED_FOR_RECTIFICATION_ACTION__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getPolicyStatement__CausedByShouldBeDefinedForRectificationAction__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Expired Document</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation POLICY_STATEMENT___EXPIRED_DOCUMENT__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getPolicyStatement__ExpiredDocument__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Missing Consent For Transfer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation POLICY_STATEMENT___MISSING_CONSENT_FOR_TRANSFER__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getPolicyStatement__MissingConsentForTransfer__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Caused By Should Be Defined For Erasure Action</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation POLICY_STATEMENT___CAUSED_BY_SHOULD_BE_DEFINED_FOR_ERASURE_ACTION__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getPolicyStatement__CausedByShouldBeDefinedForErasureAction__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Subject Should Be Notified About Executed Erasure</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation POLICY_STATEMENT___SUBJECT_SHOULD_BE_NOTIFIED_ABOUT_EXECUTED_ERASURE__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getPolicyStatement__SubjectShouldBeNotifiedAboutExecutedErasure__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Whom Should Be Defined For Transfer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation POLICY_STATEMENT___WHOM_SHOULD_BE_DEFINED_FOR_TRANSFER__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getPolicyStatement__WhomShouldBeDefinedForTransfer__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link privacyModel.impl.PrivacyDataImpl <em>Privacy Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see privacyModel.impl.PrivacyDataImpl
		 * @see privacyModel.impl.PrivacyModelPackageImpl#getPrivacyData()
		 * @generated
		 */
		EClass PRIVACY_DATA = eINSTANCE.getPrivacyData();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIVACY_DATA__TYPE = eINSTANCE.getPrivacyData_Type();

		/**
		 * The meta object literal for the '{@link privacyModel.impl.ServiceImpl <em>Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see privacyModel.impl.ServiceImpl
		 * @see privacyModel.impl.PrivacyModelPackageImpl#getService()
		 * @generated
		 */
		EClass SERVICE = eINSTANCE.getService();

		/**
		 * The meta object literal for the '<em><b>Subservices</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__SUBSERVICES = eINSTANCE.getService_Subservices();

		/**
		 * The meta object literal for the '{@link privacyModel.impl.ProviderImpl <em>Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see privacyModel.impl.ProviderImpl
		 * @see privacyModel.impl.PrivacyModelPackageImpl#getProvider()
		 * @generated
		 */
		EClass PROVIDER = eINSTANCE.getProvider();

		/**
		 * The meta object literal for the '<em><b>Provide</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROVIDER__PROVIDE = eINSTANCE.getProvider_Provide();

		/**
		 * The meta object literal for the '<em><b>Located</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROVIDER__LOCATED = eINSTANCE.getProvider_Located();

		/**
		 * The meta object literal for the '{@link privacyModel.impl.PrincipalImpl <em>Principal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see privacyModel.impl.PrincipalImpl
		 * @see privacyModel.impl.PrivacyModelPackageImpl#getPrincipal()
		 * @generated
		 */
		EClass PRINCIPAL = eINSTANCE.getPrincipal();

		/**
		 * The meta object literal for the '<em><b>Sub Principals</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRINCIPAL__SUB_PRINCIPALS = eINSTANCE.getPrincipal_SubPrincipals();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRINCIPAL__TYPE = eINSTANCE.getPrincipal_Type();

		/**
		 * The meta object literal for the '<em><b>Scope</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRINCIPAL__SCOPE = eINSTANCE.getPrincipal_Scope();

		/**
		 * The meta object literal for the '<em><b>Responsible Persons</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRINCIPAL__RESPONSIBLE_PERSONS = eINSTANCE.getPrincipal_ResponsiblePersons();

		/**
		 * The meta object literal for the '<em><b>Inhabits</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRINCIPAL__INHABITS = eINSTANCE.getPrincipal_Inhabits();

		/**
		 * The meta object literal for the '<em><b>Birthdate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRINCIPAL__BIRTHDATE = eINSTANCE.getPrincipal_Birthdate();

		/**
		 * The meta object literal for the '<em><b>Age</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRINCIPAL__AGE = eINSTANCE.getPrincipal_Age();

		/**
		 * The meta object literal for the '<em><b>Equals</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PRINCIPAL___EQUALS__PRINCIPAL = eINSTANCE.getPrincipal__Equals__Principal();

		/**
		 * The meta object literal for the '<em><b>Natural Person Can Not Conatains Sub Principals</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PRINCIPAL___NATURAL_PERSON_CAN_NOT_CONATAINS_SUB_PRINCIPALS__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getPrincipal__NaturalPersonCanNotConatainsSubPrincipals__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Juvenile Should Have Responsible Person</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PRINCIPAL___JUVENILE_SHOULD_HAVE_RESPONSIBLE_PERSON__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getPrincipal__JuvenileShouldHaveResponsiblePerson__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link privacyModel.impl.LocationImpl <em>Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see privacyModel.impl.LocationImpl
		 * @see privacyModel.impl.PrivacyModelPackageImpl#getLocation()
		 * @generated
		 */
		EClass LOCATION = eINSTANCE.getLocation();

		/**
		 * The meta object literal for the '<em><b>Is EU Member</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__IS_EU_MEMBER = eINSTANCE.getLocation_IsEUMember();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__TYPE = eINSTANCE.getLocation_Type();

		/**
		 * The meta object literal for the '<em><b>Sub Locations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATION__SUB_LOCATIONS = eINSTANCE.getLocation_SubLocations();

		/**
		 * The meta object literal for the '<em><b>Legal Age Limit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__LEGAL_AGE_LIMIT = eINSTANCE.getLocation_LegalAgeLimit();

		/**
		 * The meta object literal for the '<em><b>Equals</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LOCATION___EQUALS__LOCATION = eINSTANCE.getLocation__Equals__Location();

		/**
		 * The meta object literal for the '{@link privacyModel.impl.AbstractTimeImpl <em>Abstract Time</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see privacyModel.impl.AbstractTimeImpl
		 * @see privacyModel.impl.PrivacyModelPackageImpl#getAbstractTime()
		 * @generated
		 */
		EClass ABSTRACT_TIME = eINSTANCE.getAbstractTime();

		/**
		 * The meta object literal for the '{@link privacyModel.impl.TimeIntervalImpl <em>Time Interval</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see privacyModel.impl.TimeIntervalImpl
		 * @see privacyModel.impl.PrivacyModelPackageImpl#getTimeInterval()
		 * @generated
		 */
		EClass TIME_INTERVAL = eINSTANCE.getTimeInterval();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_INTERVAL__START = eINSTANCE.getTimeInterval_Start();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_INTERVAL__END = eINSTANCE.getTimeInterval_End();

		/**
		 * The meta object literal for the '<em><b>Is Type Defined With Other Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TIME_INTERVAL___IS_TYPE_DEFINED_WITH_OTHER_TYPE__TIMEPREPOSITION_TIMEPREPOSITION = eINSTANCE
				.getTimeInterval__IsTypeDefinedWithOtherType__TimePreposition_TimePreposition();

		/**
		 * The meta object literal for the '<em><b>Is Type Forbidden</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TIME_INTERVAL___IS_TYPE_FORBIDDEN__TIMEPREPOSITION = eINSTANCE
				.getTimeInterval__IsTypeForbidden__TimePreposition();

		/**
		 * The meta object literal for the '<em><b>Is Valid</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TIME_INTERVAL___IS_VALID__TIMEPREPOSITION_TIMEPREPOSITION = eINSTANCE
				.getTimeInterval__IsValid__TimePreposition_TimePreposition();

		/**
		 * The meta object literal for the '<em><b>After Statement Before Before Statement</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TIME_INTERVAL___AFTER_STATEMENT_BEFORE_BEFORE_STATEMENT__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getTimeInterval__AfterStatementBeforeBeforeStatement__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Until Type Should Be Defined Alone</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TIME_INTERVAL___UNTIL_TYPE_SHOULD_BE_DEFINED_ALONE__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getTimeInterval__UntilTypeShouldBeDefinedAlone__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>From Statement Before To Statement</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TIME_INTERVAL___FROM_STATEMENT_BEFORE_TO_STATEMENT__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getTimeInterval__FromStatementBeforeToStatement__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Only From Or From With To</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TIME_INTERVAL___ONLY_FROM_OR_FROM_WITH_TO__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getTimeInterval__OnlyFromOrFromWithTo__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Only After Or After With Before</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TIME_INTERVAL___ONLY_AFTER_OR_AFTER_WITH_BEFORE__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getTimeInterval__OnlyAfterOrAfterWithBefore__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>At Type Should Be Defined Alone</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TIME_INTERVAL___AT_TYPE_SHOULD_BE_DEFINED_ALONE__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getTimeInterval__AtTypeShouldBeDefinedAlone__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link privacyModel.impl.TimeStatementImpl <em>Time Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see privacyModel.impl.TimeStatementImpl
		 * @see privacyModel.impl.PrivacyModelPackageImpl#getTimeStatement()
		 * @generated
		 */
		EClass TIME_STATEMENT = eINSTANCE.getTimeStatement();

		/**
		 * The meta object literal for the '<em><b>Preposition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_STATEMENT__PREPOSITION = eINSTANCE.getTimeStatement_Preposition();

		/**
		 * The meta object literal for the '<em><b>Date Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_STATEMENT__DATE_TIME = eINSTANCE.getTimeStatement_DateTime();

		/**
		 * The meta object literal for the '{@link privacyModel.impl.PurposeImpl <em>Purpose</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see privacyModel.impl.PurposeImpl
		 * @see privacyModel.impl.PrivacyModelPackageImpl#getPurpose()
		 * @generated
		 */
		EClass PURPOSE = eINSTANCE.getPurpose();

		/**
		 * The meta object literal for the '<em><b>Processing Reason</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PURPOSE__PROCESSING_REASON = eINSTANCE.getPurpose_ProcessingReason();

		/**
		 * The meta object literal for the '<em><b>Processing Reason Subtype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PURPOSE__PROCESSING_REASON_SUBTYPE = eINSTANCE.getPurpose_ProcessingReasonSubtype();

		/**
		 * The meta object literal for the '<em><b>Sub Purposes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PURPOSE__SUB_PURPOSES = eINSTANCE.getPurpose_SubPurposes();

		/**
		 * The meta object literal for the '<em><b>Details</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PURPOSE__DETAILS = eINSTANCE.getPurpose_Details();

		/**
		 * The meta object literal for the '<em><b>Is Valid</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PURPOSE___IS_VALID__PURPOSE = eINSTANCE.getPurpose__IsValid__Purpose();

		/**
		 * The meta object literal for the '<em><b>Is Sub Purpose Valid</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PURPOSE___IS_SUB_PURPOSE_VALID__PROCESSINGREASON_ELIST = eINSTANCE
				.getPurpose__IsSubPurposeValid__ProcessingReason_EList();

		/**
		 * The meta object literal for the '<em><b>Contains Allowed Purpose Reason And Subreason</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PURPOSE___CONTAINS_ALLOWED_PURPOSE_REASON_AND_SUBREASON__PROCESSINGREASON_ELIST = eINSTANCE
				.getPurpose__ContainsAllowedPurposeReasonAndSubreason__ProcessingReason_EList();

		/**
		 * The meta object literal for the '<em><b>Public Health Should Not Contain Sub Reason</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PURPOSE___PUBLIC_HEALTH_SHOULD_NOT_CONTAIN_SUB_REASON__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getPurpose__PublicHealthShouldNotContainSubReason__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Legitimate Interests Not Contain Sub Reason</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PURPOSE___LEGITIMATE_INTERESTS_NOT_CONTAIN_SUB_REASON__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getPurpose__LegitimateInterestsNotContainSubReason__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Stop Processing Interest Should Not Contain Sub Reason</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PURPOSE___STOP_PROCESSING_INTEREST_SHOULD_NOT_CONTAIN_SUB_REASON__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getPurpose__StopProcessingInterestShouldNotContainSubReason__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Profiling Should Not Contain Sub Reason</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PURPOSE___PROFILING_SHOULD_NOT_CONTAIN_SUB_REASON__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getPurpose__ProfilingShouldNotContainSubReason__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Marketing Should Not Contain Sub Reason</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PURPOSE___MARKETING_SHOULD_NOT_CONTAIN_SUB_REASON__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getPurpose__MarketingShouldNotContainSubReason__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Out Of Scope Cannot Contains This Sub Reason</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PURPOSE___OUT_OF_SCOPE_CANNOT_CONTAINS_THIS_SUB_REASON__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getPurpose__OutOfScopeCannotContainsThisSubReason__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Exercising Specific Rights Purposes Cannot Contains This Sub Reason</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PURPOSE___EXERCISING_SPECIFIC_RIGHTS_PURPOSES_CANNOT_CONTAINS_THIS_SUB_REASON__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getPurpose__ExercisingSpecificRightsPurposesCannotContainsThisSubReason__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Protect The Vital Interests Of The Data Subject Cannot Contains This Sub Reason</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PURPOSE___PROTECT_THE_VITAL_INTERESTS_OF_THE_DATA_SUBJECT_CANNOT_CONTAINS_THIS_SUB_REASON__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getPurpose__ProtectTheVitalInterestsOfTheDataSubjectCannotContainsThisSubReason__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Public Interest Cannot Contains This Sub Reason</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PURPOSE___PUBLIC_INTEREST_CANNOT_CONTAINS_THIS_SUB_REASON__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getPurpose__PublicInterestCannotContainsThisSubReason__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Research Cannot Contains This Sub Reason</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PURPOSE___RESEARCH_CANNOT_CONTAINS_THIS_SUB_REASON__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getPurpose__ResearchCannotContainsThisSubReason__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Statistical Purposes Should Not Contain Sub Reason</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PURPOSE___STATISTICAL_PURPOSES_SHOULD_NOT_CONTAIN_SUB_REASON__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getPurpose__StatisticalPurposesShouldNotContainSubReason__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Testing Should Not Contain Sub Reason</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PURPOSE___TESTING_SHOULD_NOT_CONTAIN_SUB_REASON__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getPurpose__TestingShouldNotContainSubReason__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link privacyModel.impl.WhatImpl <em>What</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see privacyModel.impl.WhatImpl
		 * @see privacyModel.impl.PrivacyModelPackageImpl#getWhat()
		 * @generated
		 */
		EClass WHAT = eINSTANCE.getWhat();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WHAT__ACTIONS = eINSTANCE.getWhat_Actions();

		/**
		 * The meta object literal for the '<em><b>Providers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WHAT__PROVIDERS = eINSTANCE.getWhat_Providers();

		/**
		 * The meta object literal for the '<em><b>Datas</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WHAT__DATAS = eINSTANCE.getWhat_Datas();

		/**
		 * The meta object literal for the '{@link privacyModel.impl.HowImpl <em>How</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see privacyModel.impl.HowImpl
		 * @see privacyModel.impl.PrivacyModelPackageImpl#getHow()
		 * @generated
		 */
		EClass HOW = eINSTANCE.getHow();

		/**
		 * The meta object literal for the '<em><b>Documents</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOW__DOCUMENTS = eINSTANCE.getHow_Documents();

		/**
		 * The meta object literal for the '<em><b>Consent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOW__CONSENT = eINSTANCE.getHow_Consent();

		/**
		 * The meta object literal for the '<em><b>Is Consent Valid</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HOW___IS_CONSENT_VALID__HOW = eINSTANCE.getHow__IsConsentValid__How();

		/**
		 * The meta object literal for the '{@link privacyModel.impl.ConsentImpl <em>Consent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see privacyModel.impl.ConsentImpl
		 * @see privacyModel.impl.PrivacyModelPackageImpl#getConsent()
		 * @generated
		 */
		EClass CONSENT = eINSTANCE.getConsent();

		/**
		 * The meta object literal for the '<em><b>Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSENT__FORMAT = eINSTANCE.getConsent_Format();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSENT__TYPE = eINSTANCE.getConsent_Type();

		/**
		 * The meta object literal for the '{@link privacyModel.impl.ConfigurationManagerImpl <em>Configuration Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see privacyModel.impl.ConfigurationManagerImpl
		 * @see privacyModel.impl.PrivacyModelPackageImpl#getConfigurationManager()
		 * @generated
		 */
		EClass CONFIGURATION_MANAGER = eINSTANCE.getConfigurationManager();

		/**
		 * The meta object literal for the '<em><b>Data Sources</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURATION_MANAGER__DATA_SOURCES = eINSTANCE.getConfigurationManager_DataSources();

		/**
		 * The meta object literal for the '<em><b>Protection Control Methods</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURATION_MANAGER__PROTECTION_CONTROL_METHODS = eINSTANCE
				.getConfigurationManager_ProtectionControlMethods();

		/**
		 * The meta object literal for the '{@link privacyModel.impl.ComplaintImpl <em>Complaint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see privacyModel.impl.ComplaintImpl
		 * @see privacyModel.impl.PrivacyModelPackageImpl#getComplaint()
		 * @generated
		 */
		EClass COMPLAINT = eINSTANCE.getComplaint();

		/**
		 * The meta object literal for the '<em><b>Who</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPLAINT__WHO = eINSTANCE.getComplaint_Who();

		/**
		 * The meta object literal for the '<em><b>When</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPLAINT__WHEN = eINSTANCE.getComplaint_When();

		/**
		 * The meta object literal for the '<em><b>Reason</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPLAINT__REASON = eINSTANCE.getComplaint_Reason();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPLAINT__ACTION = eINSTANCE.getComplaint_Action();

		/**
		 * The meta object literal for the '<em><b>Does Policy Statement Exists</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPLAINT___DOES_POLICY_STATEMENT_EXISTS__ACTION_COMPLAINTBASEDONDATATYPE = eINSTANCE
				.getComplaint__DoesPolicyStatementExists__Action_ComplaintBasedOnDataType();

		/**
		 * The meta object literal for the '<em><b>Cannot Identify Data From Complaint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPLAINT___CANNOT_IDENTIFY_DATA_FROM_COMPLAINT__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getComplaint__CannotIdentifyDataFromComplaint__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Stop Processing Should Be Executed As Soon As Possible</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPLAINT___STOP_PROCESSING_SHOULD_BE_EXECUTED_AS_SOON_AS_POSSIBLE__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getComplaint__StopProcessingShouldBeExecutedAsSoonAsPossible__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>User Doesnt Have Permission To Withdraw Consent</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPLAINT___USER_DOESNT_HAVE_PERMISSION_TO_WITHDRAW_CONSENT__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getComplaint__UserDoesntHavePermissionToWithdrawConsent__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Erasure Should Be Executed As Soon As Possible</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPLAINT___ERASURE_SHOULD_BE_EXECUTED_AS_SOON_AS_POSSIBLE__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getComplaint__ErasureShouldBeExecutedAsSoonAsPossible__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Subject Should Be Notified About Existing Complaint For Erasure</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPLAINT___SUBJECT_SHOULD_BE_NOTIFIED_ABOUT_EXISTING_COMPLAINT_FOR_ERASURE__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getComplaint__SubjectShouldBeNotifiedAboutExistingComplaintForErasure__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Rectification Should Be Executed As Soon As Possible</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPLAINT___RECTIFICATION_SHOULD_BE_EXECUTED_AS_SOON_AS_POSSIBLE__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getComplaint__RectificationShouldBeExecutedAsSoonAsPossible__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Invalid Type Of Purpose For An Object</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPLAINT___INVALID_TYPE_OF_PURPOSE_FOR_AN_OBJECT__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getComplaint__InvalidTypeOfPurposeForAnObject__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>User Doesnt Have Permission To Complaint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPLAINT___USER_DOESNT_HAVE_PERMISSION_TO_COMPLAINT__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getComplaint__UserDoesntHavePermissionToComplaint__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Subject Should Be Notified About Withdraw</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPLAINT___SUBJECT_SHOULD_BE_NOTIFIED_ABOUT_WITHDRAW__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getComplaint__SubjectShouldBeNotifiedAboutWithdraw__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Subject Should Be Notified About Existing Complaint For Rectification</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPLAINT___SUBJECT_SHOULD_BE_NOTIFIED_ABOUT_EXISTING_COMPLAINT_FOR_RECTIFICATION__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getComplaint__SubjectShouldBeNotifiedAboutExistingComplaintForRectification__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link privacyModel.impl.PrivacyPolicyHelperImpl <em>Privacy Policy Helper</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see privacyModel.impl.PrivacyPolicyHelperImpl
		 * @see privacyModel.impl.PrivacyModelPackageImpl#getPrivacyPolicyHelper()
		 * @generated
		 */
		EClass PRIVACY_POLICY_HELPER = eINSTANCE.getPrivacyPolicyHelper();

		/**
		 * The meta object literal for the '<em><b>Is Policy Control Valid</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PRIVACY_POLICY_HELPER___IS_POLICY_CONTROL_VALID__STRING = eINSTANCE
				.getPrivacyPolicyHelper__IsPolicyControlValid__String();

		/**
		 * The meta object literal for the '<em><b>Is Data Source Valid</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PRIVACY_POLICY_HELPER___IS_DATA_SOURCE_VALID__STRING = eINSTANCE
				.getPrivacyPolicyHelper__IsDataSourceValid__String();

		/**
		 * The meta object literal for the '<em><b>Are Intervals Overlap</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PRIVACY_POLICY_HELPER___ARE_INTERVALS_OVERLAP__ABSTRACTTIME_ABSTRACTTIME = eINSTANCE
				.getPrivacyPolicyHelper__AreIntervalsOverlap__AbstractTime_AbstractTime();

		/**
		 * The meta object literal for the '<em><b>Are Dates Overlap</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PRIVACY_POLICY_HELPER___ARE_DATES_OVERLAP__ABSTRACTTIME_DATE = eINSTANCE
				.getPrivacyPolicyHelper__AreDatesOverlap__AbstractTime_Date();

		/**
		 * The meta object literal for the '<em><b>Does Interval Start Before Interval</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PRIVACY_POLICY_HELPER___DOES_INTERVAL_START_BEFORE_INTERVAL__ABSTRACTTIME_ABSTRACTTIME = eINSTANCE
				.getPrivacyPolicyHelper__DoesIntervalStartBeforeInterval__AbstractTime_AbstractTime();

		/**
		 * The meta object literal for the '<em><b>Is Date Before Interval</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PRIVACY_POLICY_HELPER___IS_DATE_BEFORE_INTERVAL__ABSTRACTTIME_DATE = eINSTANCE
				.getPrivacyPolicyHelper__IsDateBeforeInterval__AbstractTime_Date();

		/**
		 * The meta object literal for the '<em><b>Is Date After Interval</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PRIVACY_POLICY_HELPER___IS_DATE_AFTER_INTERVAL__ABSTRACTTIME_DATE = eINSTANCE
				.getPrivacyPolicyHelper__IsDateAfterInterval__AbstractTime_Date();

		/**
		 * The meta object literal for the '<em><b>Is Date In Interval</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PRIVACY_POLICY_HELPER___IS_DATE_IN_INTERVAL__ABSTRACTTIME_DATE = eINSTANCE
				.getPrivacyPolicyHelper__IsDateInInterval__AbstractTime_Date();

		/**
		 * The meta object literal for the '{@link privacyModel.impl.WhereImpl <em>Where</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see privacyModel.impl.WhereImpl
		 * @see privacyModel.impl.PrivacyModelPackageImpl#getWhere()
		 * @generated
		 */
		EClass WHERE = eINSTANCE.getWhere();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WHERE__SOURCE = eINSTANCE.getWhere_Source();

		/**
		 * The meta object literal for the '<em><b>Destination</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WHERE__DESTINATION = eINSTANCE.getWhere_Destination();

		/**
		 * The meta object literal for the '<em><b>Equals</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation WHERE___EQUALS__WHERE = eINSTANCE.getWhere__Equals__Where();

		/**
		 * The meta object literal for the '{@link privacyModel.impl.DocumentImpl <em>Document</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see privacyModel.impl.DocumentImpl
		 * @see privacyModel.impl.PrivacyModelPackageImpl#getDocument()
		 * @generated
		 */
		EClass DOCUMENT = eINSTANCE.getDocument();

		/**
		 * The meta object literal for the '<em><b>Document Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT__DOCUMENT_TYPE = eINSTANCE.getDocument_DocumentType();

		/**
		 * The meta object literal for the '{@link privacyModel.impl.AbstractPaperImpl <em>Abstract Paper</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see privacyModel.impl.AbstractPaperImpl
		 * @see privacyModel.impl.PrivacyModelPackageImpl#getAbstractPaper()
		 * @generated
		 */
		EClass ABSTRACT_PAPER = eINSTANCE.getAbstractPaper();

		/**
		 * The meta object literal for the '<em><b>Provided By</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_PAPER__PROVIDED_BY = eINSTANCE.getAbstractPaper_ProvidedBy();

		/**
		 * The meta object literal for the '<em><b>Termination Explanation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_PAPER__TERMINATION_EXPLANATION = eINSTANCE.getAbstractPaper_TerminationExplanation();

		/**
		 * The meta object literal for the '<em><b>Start Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_PAPER__START_DATE = eINSTANCE.getAbstractPaper_StartDate();

		/**
		 * The meta object literal for the '<em><b>Termination Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_PAPER__TERMINATION_DATE = eINSTANCE.getAbstractPaper_TerminationDate();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_PAPER__LOCATION = eINSTANCE.getAbstractPaper_Location();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_PAPER__DESCRIPTION = eINSTANCE.getAbstractPaper_Description();

		/**
		 * The meta object literal for the '<em><b>Start Date Should Be Before Termination Date</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_PAPER___START_DATE_SHOULD_BE_BEFORE_TERMINATION_DATE__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getAbstractPaper__StartDateShouldBeBeforeTerminationDate__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link privacyModel.impl.AbstractComplaintActionImpl <em>Abstract Complaint Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see privacyModel.impl.AbstractComplaintActionImpl
		 * @see privacyModel.impl.PrivacyModelPackageImpl#getAbstractComplaintAction()
		 * @generated
		 */
		EClass ABSTRACT_COMPLAINT_ACTION = eINSTANCE.getAbstractComplaintAction();

		/**
		 * The meta object literal for the '{@link privacyModel.impl.WithdrawImpl <em>Withdraw</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see privacyModel.impl.WithdrawImpl
		 * @see privacyModel.impl.PrivacyModelPackageImpl#getWithdraw()
		 * @generated
		 */
		EClass WITHDRAW = eINSTANCE.getWithdraw();

		/**
		 * The meta object literal for the '<em><b>Subject</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WITHDRAW__SUBJECT = eINSTANCE.getWithdraw_Subject();

		/**
		 * The meta object literal for the '{@link privacyModel.impl.ComplaintBasedOnDataImpl <em>Complaint Based On Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see privacyModel.impl.ComplaintBasedOnDataImpl
		 * @see privacyModel.impl.PrivacyModelPackageImpl#getComplaintBasedOnData()
		 * @generated
		 */
		EClass COMPLAINT_BASED_ON_DATA = eINSTANCE.getComplaintBasedOnData();

		/**
		 * The meta object literal for the '<em><b>Subject</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPLAINT_BASED_ON_DATA__SUBJECT = eINSTANCE.getComplaintBasedOnData_Subject();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPLAINT_BASED_ON_DATA__TYPE = eINSTANCE.getComplaintBasedOnData_Type();

		/**
		 * The meta object literal for the '{@link privacyModel.impl.SharedPrivacyDataImpl <em>Shared Privacy Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see privacyModel.impl.SharedPrivacyDataImpl
		 * @see privacyModel.impl.PrivacyModelPackageImpl#getSharedPrivacyData()
		 * @generated
		 */
		EClass SHARED_PRIVACY_DATA = eINSTANCE.getSharedPrivacyData();

		/**
		 * The meta object literal for the '<em><b>Additional Protection Controls</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHARED_PRIVACY_DATA__ADDITIONAL_PROTECTION_CONTROLS = eINSTANCE
				.getSharedPrivacyData_AdditionalProtectionControls();

		/**
		 * The meta object literal for the '<em><b>Privacydata</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHARED_PRIVACY_DATA__PRIVACYDATA = eINSTANCE.getSharedPrivacyData_Privacydata();

		/**
		 * The meta object literal for the '<em><b>Colllected From Subject</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHARED_PRIVACY_DATA__COLLLECTED_FROM_SUBJECT = eINSTANCE
				.getSharedPrivacyData_ColllectedFromSubject();

		/**
		 * The meta object literal for the '<em><b>Data Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHARED_PRIVACY_DATA__DATA_SOURCE = eINSTANCE.getSharedPrivacyData_DataSource();

		/**
		 * The meta object literal for the '<em><b>Protection Control Should Exists In Configuration</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SHARED_PRIVACY_DATA___PROTECTION_CONTROL_SHOULD_EXISTS_IN_CONFIGURATION__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getSharedPrivacyData__ProtectionControlShouldExistsInConfiguration__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Data Source Should Exists In Configuration</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SHARED_PRIVACY_DATA___DATA_SOURCE_SHOULD_EXISTS_IN_CONFIGURATION__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getSharedPrivacyData__DataSourceShouldExistsInConfiguration__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link privacyModel.impl.DenialImpl <em>Denial</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see privacyModel.impl.DenialImpl
		 * @see privacyModel.impl.PrivacyModelPackageImpl#getDenial()
		 * @generated
		 */
		EClass DENIAL = eINSTANCE.getDenial();

		/**
		 * The meta object literal for the '<em><b>When</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DENIAL__WHEN = eINSTANCE.getDenial_When();

		/**
		 * The meta object literal for the '<em><b>Approved By</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DENIAL__APPROVED_BY = eINSTANCE.getDenial_ApprovedBy();

		/**
		 * The meta object literal for the '<em><b>Reason</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DENIAL__REASON = eINSTANCE.getDenial_Reason();

		/**
		 * The meta object literal for the '<em><b>Based On Statements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DENIAL__BASED_ON_STATEMENTS = eINSTANCE.getDenial_BasedOnStatements();

		/**
		 * The meta object literal for the '{@link privacyModel.impl.NotificationImpl <em>Notification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see privacyModel.impl.NotificationImpl
		 * @see privacyModel.impl.PrivacyModelPackageImpl#getNotification()
		 * @generated
		 */
		EClass NOTIFICATION = eINSTANCE.getNotification();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTIFICATION__TYPE = eINSTANCE.getNotification_Type();

		/**
		 * The meta object literal for the '<em><b>Notifiers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOTIFICATION__NOTIFIERS = eINSTANCE.getNotification_Notifiers();

		/**
		 * The meta object literal for the '<em><b>Receivers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOTIFICATION__RECEIVERS = eINSTANCE.getNotification_Receivers();

		/**
		 * The meta object literal for the '<em><b>Caused By</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOTIFICATION__CAUSED_BY = eINSTANCE.getNotification_CausedBy();

		/**
		 * The meta object literal for the '<em><b>When</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTIFICATION__WHEN = eINSTANCE.getNotification_When();

		/**
		 * The meta object literal for the '<em><b>Should Define Caused By As Erasure</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NOTIFICATION___SHOULD_DEFINE_CAUSED_BY_AS_ERASURE__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getNotification__ShouldDefineCausedByAsErasure__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Should Define Caused By As Privacy Policy</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NOTIFICATION___SHOULD_DEFINE_CAUSED_BY_AS_PRIVACY_POLICY__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getNotification__ShouldDefineCausedByAsPrivacyPolicy__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Should Define Caused By As Withdraw</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NOTIFICATION___SHOULD_DEFINE_CAUSED_BY_AS_WITHDRAW__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getNotification__ShouldDefineCausedByAsWithdraw__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Should Define Caused By As Rectification</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NOTIFICATION___SHOULD_DEFINE_CAUSED_BY_AS_RECTIFICATION__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getNotification__ShouldDefineCausedByAsRectification__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link privacyModel.impl.NotificationInfoImpl <em>Notification Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see privacyModel.impl.NotificationInfoImpl
		 * @see privacyModel.impl.PrivacyModelPackageImpl#getNotificationInfo()
		 * @generated
		 */
		EClass NOTIFICATION_INFO = eINSTANCE.getNotificationInfo();

		/**
		 * The meta object literal for the '{@link privacyModel.impl.AbstractComplaintImpl <em>Abstract Complaint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see privacyModel.impl.AbstractComplaintImpl
		 * @see privacyModel.impl.PrivacyModelPackageImpl#getAbstractComplaint()
		 * @generated
		 */
		EClass ABSTRACT_COMPLAINT = eINSTANCE.getAbstractComplaint();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_COMPLAINT__STATUS = eINSTANCE.getAbstractComplaint_Status();

		/**
		 * The meta object literal for the '<em><b>Denial Reason</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_COMPLAINT__DENIAL_REASON = eINSTANCE.getAbstractComplaint_DenialReason();

		/**
		 * The meta object literal for the '{@link privacyModel.impl.ComplaintBasedOnActionImpl <em>Complaint Based On Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see privacyModel.impl.ComplaintBasedOnActionImpl
		 * @see privacyModel.impl.PrivacyModelPackageImpl#getComplaintBasedOnAction()
		 * @generated
		 */
		EClass COMPLAINT_BASED_ON_ACTION = eINSTANCE.getComplaintBasedOnAction();

		/**
		 * The meta object literal for the '<em><b>Statement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPLAINT_BASED_ON_ACTION__STATEMENT = eINSTANCE.getComplaintBasedOnAction_Statement();

		/**
		 * The meta object literal for the '{@link privacyModel.DataType <em>Data Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see privacyModel.DataType
		 * @see privacyModel.impl.PrivacyModelPackageImpl#getDataType()
		 * @generated
		 */
		EEnum DATA_TYPE = eINSTANCE.getDataType();

		/**
		 * The meta object literal for the '{@link privacyModel.DocumentType <em>Document Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see privacyModel.DocumentType
		 * @see privacyModel.impl.PrivacyModelPackageImpl#getDocumentType()
		 * @generated
		 */
		EEnum DOCUMENT_TYPE = eINSTANCE.getDocumentType();

		/**
		 * The meta object literal for the '{@link privacyModel.TimePreposition <em>Time Preposition</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see privacyModel.TimePreposition
		 * @see privacyModel.impl.PrivacyModelPackageImpl#getTimePreposition()
		 * @generated
		 */
		EEnum TIME_PREPOSITION = eINSTANCE.getTimePreposition();

		/**
		 * The meta object literal for the '{@link privacyModel.PrincipalType <em>Principal Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see privacyModel.PrincipalType
		 * @see privacyModel.impl.PrivacyModelPackageImpl#getPrincipalType()
		 * @generated
		 */
		EEnum PRINCIPAL_TYPE = eINSTANCE.getPrincipalType();

		/**
		 * The meta object literal for the '{@link privacyModel.PrincipalScope <em>Principal Scope</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see privacyModel.PrincipalScope
		 * @see privacyModel.impl.PrivacyModelPackageImpl#getPrincipalScope()
		 * @generated
		 */
		EEnum PRINCIPAL_SCOPE = eINSTANCE.getPrincipalScope();

		/**
		 * The meta object literal for the '{@link privacyModel.Action <em>Action</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see privacyModel.Action
		 * @see privacyModel.impl.PrivacyModelPackageImpl#getAction()
		 * @generated
		 */
		EEnum ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '{@link privacyModel.LocationType <em>Location Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see privacyModel.LocationType
		 * @see privacyModel.impl.PrivacyModelPackageImpl#getLocationType()
		 * @generated
		 */
		EEnum LOCATION_TYPE = eINSTANCE.getLocationType();

		/**
		 * The meta object literal for the '{@link privacyModel.ProcessingReason <em>Processing Reason</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see privacyModel.ProcessingReason
		 * @see privacyModel.impl.PrivacyModelPackageImpl#getProcessingReason()
		 * @generated
		 */
		EEnum PROCESSING_REASON = eINSTANCE.getProcessingReason();

		/**
		 * The meta object literal for the '{@link privacyModel.ProcessingReasonSubtype <em>Processing Reason Subtype</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see privacyModel.ProcessingReasonSubtype
		 * @see privacyModel.impl.PrivacyModelPackageImpl#getProcessingReasonSubtype()
		 * @generated
		 */
		EEnum PROCESSING_REASON_SUBTYPE = eINSTANCE.getProcessingReasonSubtype();

		/**
		 * The meta object literal for the '{@link privacyModel.ConsentFormat <em>Consent Format</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see privacyModel.ConsentFormat
		 * @see privacyModel.impl.PrivacyModelPackageImpl#getConsentFormat()
		 * @generated
		 */
		EEnum CONSENT_FORMAT = eINSTANCE.getConsentFormat();

		/**
		 * The meta object literal for the '{@link privacyModel.ConsentType <em>Consent Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see privacyModel.ConsentType
		 * @see privacyModel.impl.PrivacyModelPackageImpl#getConsentType()
		 * @generated
		 */
		EEnum CONSENT_TYPE = eINSTANCE.getConsentType();

		/**
		 * The meta object literal for the '{@link privacyModel.ComplaintBasedOnDataType <em>Complaint Based On Data Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see privacyModel.ComplaintBasedOnDataType
		 * @see privacyModel.impl.PrivacyModelPackageImpl#getComplaintBasedOnDataType()
		 * @generated
		 */
		EEnum COMPLAINT_BASED_ON_DATA_TYPE = eINSTANCE.getComplaintBasedOnDataType();

		/**
		 * The meta object literal for the '{@link privacyModel.NotificationType <em>Notification Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see privacyModel.NotificationType
		 * @see privacyModel.impl.PrivacyModelPackageImpl#getNotificationType()
		 * @generated
		 */
		EEnum NOTIFICATION_TYPE = eINSTANCE.getNotificationType();

		/**
		 * The meta object literal for the '{@link privacyModel.ComplaintStatus <em>Complaint Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see privacyModel.ComplaintStatus
		 * @see privacyModel.impl.PrivacyModelPackageImpl#getComplaintStatus()
		 * @generated
		 */
		EEnum COMPLAINT_STATUS = eINSTANCE.getComplaintStatus();

	}

} //PrivacyModelPackage
