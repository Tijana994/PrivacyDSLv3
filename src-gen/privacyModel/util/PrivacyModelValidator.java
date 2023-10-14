/**
 */
package privacyModel.util;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
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
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Unique Provider Name' of 'Privacy Policy'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PRIVACY_POLICY__UNIQUE_PROVIDER_NAME = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Unique Consent Name' of 'Privacy Policy'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PRIVACY_POLICY__UNIQUE_CONSENT_NAME = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Unique Service Name' of 'Privacy Policy'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PRIVACY_POLICY__UNIQUE_SERVICE_NAME = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Owner Should Have Defined Inhabits' of 'Privacy Policy'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PRIVACY_POLICY__OWNER_SHOULD_HAVE_DEFINED_INHABITS = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Unique Policy Statement Name' of 'Privacy Policy'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PRIVACY_POLICY__UNIQUE_POLICY_STATEMENT_NAME = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Protection Control Should Exists In Configuration' of 'Privacy Policy'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PRIVACY_POLICY__PROTECTION_CONTROL_SHOULD_EXISTS_IN_CONFIGURATION = 6;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Unique Privacy Data Name' of 'Privacy Policy'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PRIVACY_POLICY__UNIQUE_PRIVACY_DATA_NAME = 7;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Unique Document Name' of 'Privacy Policy'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PRIVACY_POLICY__UNIQUE_DOCUMENT_NAME = 8;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Unique Location Per Type' of 'Privacy Policy'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PRIVACY_POLICY__UNIQUE_LOCATION_PER_TYPE = 9;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Unique Principal Name Per Type' of 'Privacy Policy'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PRIVACY_POLICY__UNIQUE_PRINCIPAL_NAME_PER_TYPE = 10;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Unique Complaint Name' of 'Privacy Policy'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PRIVACY_POLICY__UNIQUE_COMPLAINT_NAME = 11;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Subject Should Be Notified About Transfer To Third Country' of 'Policy Statement'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int POLICY_STATEMENT__SUBJECT_SHOULD_BE_NOTIFIED_ABOUT_TRANSFER_TO_THIRD_COUNTRY = 12;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Subject Should Be Notified About Executed Rectification' of 'Policy Statement'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int POLICY_STATEMENT__SUBJECT_SHOULD_BE_NOTIFIED_ABOUT_EXECUTED_RECTIFICATION = 13;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Subject Should Be Notified About Stop Processing' of 'Policy Statement'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int POLICY_STATEMENT__SUBJECT_SHOULD_BE_NOTIFIED_ABOUT_STOP_PROCESSING = 14;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Controller Approval Is Need For Protect The Vital Interests Of The Data Subject Purpose' of 'Policy Statement'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int POLICY_STATEMENT__CONTROLLER_APPROVAL_IS_NEED_FOR_PROTECT_THE_VITAL_INTERESTS_OF_THE_DATA_SUBJECT_PURPOSE = 15;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Missing Consent For Collecting' of 'Policy Statement'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int POLICY_STATEMENT__MISSING_CONSENT_FOR_COLLECTING = 16;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Expired Consent' of 'Policy Statement'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int POLICY_STATEMENT__EXPIRED_CONSENT = 17;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Stop Processing Purpose For Action Stop Processing' of 'Policy Statement'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int POLICY_STATEMENT__STOP_PROCESSING_PURPOSE_FOR_ACTION_STOP_PROCESSING = 18;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Withdrawed Consent' of 'Policy Statement'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int POLICY_STATEMENT__WITHDRAWED_CONSENT = 19;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Processing Of Special Categories' of 'Policy Statement'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int POLICY_STATEMENT__PROCESSING_OF_SPECIAL_CATEGORIES = 20;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Subject Should Be Notified About Collecting' of 'Policy Statement'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int POLICY_STATEMENT__SUBJECT_SHOULD_BE_NOTIFIED_ABOUT_COLLECTING = 21;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Date Shoud Be Defined For Store Action' of 'Policy Statement'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int POLICY_STATEMENT__DATE_SHOUD_BE_DEFINED_FOR_STORE_ACTION = 22;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Court Approval Is Need For Public Interest Purpose' of 'Policy Statement'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int POLICY_STATEMENT__COURT_APPROVAL_IS_NEED_FOR_PUBLIC_INTEREST_PURPOSE = 23;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Controller Approval Is Need For Legitimate Interests Purpose' of 'Policy Statement'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int POLICY_STATEMENT__CONTROLLER_APPROVAL_IS_NEED_FOR_LEGITIMATE_INTERESTS_PURPOSE = 24;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Date Shoud Be Defined For Access Action' of 'Policy Statement'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int POLICY_STATEMENT__DATE_SHOUD_BE_DEFINED_FOR_ACCESS_ACTION = 25;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Expired Consent For Collecting' of 'Policy Statement'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int POLICY_STATEMENT__EXPIRED_CONSENT_FOR_COLLECTING = 26;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Caused By Should Be Defined For Stop Processing Action' of 'Policy Statement'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int POLICY_STATEMENT__CAUSED_BY_SHOULD_BE_DEFINED_FOR_STOP_PROCESSING_ACTION = 27;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Juvenile Data Should Be Used With Document Of Type Child Custody Provided By Responsible Person' of 'Policy Statement'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int POLICY_STATEMENT__JUVENILE_DATA_SHOULD_BE_USED_WITH_DOCUMENT_OF_TYPE_CHILD_CUSTODY_PROVIDED_BY_RESPONSIBLE_PERSON = 28;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Missing Consent Or Transfer Certificate' of 'Policy Statement'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int POLICY_STATEMENT__MISSING_CONSENT_OR_TRANSFER_CERTIFICATE = 29;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Undefined Purpose For Action' of 'Policy Statement'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int POLICY_STATEMENT__UNDEFINED_PURPOSE_FOR_ACTION = 30;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Caused By Should Be Defined For Rectification Action' of 'Policy Statement'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int POLICY_STATEMENT__CAUSED_BY_SHOULD_BE_DEFINED_FOR_RECTIFICATION_ACTION = 31;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Expired Document' of 'Policy Statement'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int POLICY_STATEMENT__EXPIRED_DOCUMENT = 32;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Missing Consent For Transfer' of 'Policy Statement'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int POLICY_STATEMENT__MISSING_CONSENT_FOR_TRANSFER = 33;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Caused By Should Be Defined For Erasure Action' of 'Policy Statement'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int POLICY_STATEMENT__CAUSED_BY_SHOULD_BE_DEFINED_FOR_ERASURE_ACTION = 34;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Subject Should Be Notified About Executed Erasure' of 'Policy Statement'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int POLICY_STATEMENT__SUBJECT_SHOULD_BE_NOTIFIED_ABOUT_EXECUTED_ERASURE = 35;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Whom Should Be Defined For Transfer' of 'Policy Statement'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int POLICY_STATEMENT__WHOM_SHOULD_BE_DEFINED_FOR_TRANSFER = 36;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Natural Person Can Not Conatains Sub Principals' of 'Principal'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PRINCIPAL__NATURAL_PERSON_CAN_NOT_CONATAINS_SUB_PRINCIPALS = 37;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Juvenile Should Have Responsible Person' of 'Principal'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PRINCIPAL__JUVENILE_SHOULD_HAVE_RESPONSIBLE_PERSON = 38;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'After Statement Before Before Statement' of 'Time Interval'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TIME_INTERVAL__AFTER_STATEMENT_BEFORE_BEFORE_STATEMENT = 39;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Until Type Should Be Defined Alone' of 'Time Interval'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TIME_INTERVAL__UNTIL_TYPE_SHOULD_BE_DEFINED_ALONE = 40;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'From Statement Before To Statement' of 'Time Interval'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TIME_INTERVAL__FROM_STATEMENT_BEFORE_TO_STATEMENT = 41;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Only From Or From With To' of 'Time Interval'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TIME_INTERVAL__ONLY_FROM_OR_FROM_WITH_TO = 42;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Only After Or After With Before' of 'Time Interval'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TIME_INTERVAL__ONLY_AFTER_OR_AFTER_WITH_BEFORE = 43;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'At Type Should Be Defined Alone' of 'Time Interval'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TIME_INTERVAL__AT_TYPE_SHOULD_BE_DEFINED_ALONE = 44;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Public Health Should Not Contain Sub Reason' of 'Purpose'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PURPOSE__PUBLIC_HEALTH_SHOULD_NOT_CONTAIN_SUB_REASON = 45;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Legitimate Interests Not Contain Sub Reason' of 'Purpose'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PURPOSE__LEGITIMATE_INTERESTS_NOT_CONTAIN_SUB_REASON = 46;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Stop Processing Interest Should Not Contain Sub Reason' of 'Purpose'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PURPOSE__STOP_PROCESSING_INTEREST_SHOULD_NOT_CONTAIN_SUB_REASON = 47;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Profiling Should Not Contain Sub Reason' of 'Purpose'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PURPOSE__PROFILING_SHOULD_NOT_CONTAIN_SUB_REASON = 48;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Marketing Should Not Contain Sub Reason' of 'Purpose'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PURPOSE__MARKETING_SHOULD_NOT_CONTAIN_SUB_REASON = 49;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Out Of Scope Cannot Contains This Sub Reason' of 'Purpose'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PURPOSE__OUT_OF_SCOPE_CANNOT_CONTAINS_THIS_SUB_REASON = 50;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Exercising Specific Rights Purposes Cannot Contains This Sub Reason' of 'Purpose'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PURPOSE__EXERCISING_SPECIFIC_RIGHTS_PURPOSES_CANNOT_CONTAINS_THIS_SUB_REASON = 51;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Protect The Vital Interests Of The Data Subject Cannot Contains This Sub Reason' of 'Purpose'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PURPOSE__PROTECT_THE_VITAL_INTERESTS_OF_THE_DATA_SUBJECT_CANNOT_CONTAINS_THIS_SUB_REASON = 52;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Public Interest Cannot Contains This Sub Reason' of 'Purpose'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PURPOSE__PUBLIC_INTEREST_CANNOT_CONTAINS_THIS_SUB_REASON = 53;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Research Cannot Contains This Sub Reason' of 'Purpose'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PURPOSE__RESEARCH_CANNOT_CONTAINS_THIS_SUB_REASON = 54;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Statistical Purposes Should Not Contain Sub Reason' of 'Purpose'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PURPOSE__STATISTICAL_PURPOSES_SHOULD_NOT_CONTAIN_SUB_REASON = 55;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Testing Should Not Contain Sub Reason' of 'Purpose'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PURPOSE__TESTING_SHOULD_NOT_CONTAIN_SUB_REASON = 56;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Cannot Identify Data From Complaint' of 'Complaint'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMPLAINT__CANNOT_IDENTIFY_DATA_FROM_COMPLAINT = 57;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Stop Processing Should Be Executed As Soon As Possible' of 'Complaint'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMPLAINT__STOP_PROCESSING_SHOULD_BE_EXECUTED_AS_SOON_AS_POSSIBLE = 58;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'User Doesnt Have Permission To Withdraw Consent' of 'Complaint'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMPLAINT__USER_DOESNT_HAVE_PERMISSION_TO_WITHDRAW_CONSENT = 59;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Erasure Should Be Executed As Soon As Possible' of 'Complaint'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMPLAINT__ERASURE_SHOULD_BE_EXECUTED_AS_SOON_AS_POSSIBLE = 60;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Subject Should Be Notified About Existing Complaint For Erasure' of 'Complaint'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMPLAINT__SUBJECT_SHOULD_BE_NOTIFIED_ABOUT_EXISTING_COMPLAINT_FOR_ERASURE = 61;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Rectification Should Be Executed As Soon As Possible' of 'Complaint'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMPLAINT__RECTIFICATION_SHOULD_BE_EXECUTED_AS_SOON_AS_POSSIBLE = 62;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Invalid Type Of Purpose For An Object' of 'Complaint'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMPLAINT__INVALID_TYPE_OF_PURPOSE_FOR_AN_OBJECT = 63;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'User Doesnt Have Permission To Complaint' of 'Complaint'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMPLAINT__USER_DOESNT_HAVE_PERMISSION_TO_COMPLAINT = 64;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Subject Should Be Notified About Withdraw' of 'Complaint'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMPLAINT__SUBJECT_SHOULD_BE_NOTIFIED_ABOUT_WITHDRAW = 65;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Subject Should Be Notified About Existing Complaint For Rectification' of 'Complaint'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMPLAINT__SUBJECT_SHOULD_BE_NOTIFIED_ABOUT_EXISTING_COMPLAINT_FOR_RECTIFICATION = 66;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Start Date Should Be Before Termination Date' of 'Abstract Paper'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ABSTRACT_PAPER__START_DATE_SHOULD_BE_BEFORE_TERMINATION_DATE = 67;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Protection Control Should Exists In Configuration' of 'Shared Privacy Data'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SHARED_PRIVACY_DATA__PROTECTION_CONTROL_SHOULD_EXISTS_IN_CONFIGURATION = 68;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Data Source Should Exists In Configuration' of 'Shared Privacy Data'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SHARED_PRIVACY_DATA__DATA_SOURCE_SHOULD_EXISTS_IN_CONFIGURATION = 69;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Should Define Caused By As Erasure' of 'Notification'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NOTIFICATION__SHOULD_DEFINE_CAUSED_BY_AS_ERASURE = 70;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Should Define Caused By As Privacy Policy' of 'Notification'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NOTIFICATION__SHOULD_DEFINE_CAUSED_BY_AS_PRIVACY_POLICY = 71;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Should Define Caused By As Withdraw' of 'Notification'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NOTIFICATION__SHOULD_DEFINE_CAUSED_BY_AS_WITHDRAW = 72;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Should Define Caused By As Rectification' of 'Notification'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NOTIFICATION__SHOULD_DEFINE_CAUSED_BY_AS_RECTIFICATION = 73;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 73;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Delegates evaluation of the given invariant expression against the object in the given context.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static boolean validate(EClass eClass, EObject eObject, DiagnosticChain diagnostics,
			Map<Object, Object> context, String validationDelegate, EOperation invariant, String expression,
			int severity, String source, int code) {
		return EObjectValidator.validate(eClass, eObject, diagnostics, context, validationDelegate, invariant,
				expression, severity, source, code);
	}

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
			result &= validatePrivacyPolicy_UniqueComplaintName(privacyPolicy, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePrivacyPolicy_UniqueProviderName(privacyPolicy, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePrivacyPolicy_UniqueConsentName(privacyPolicy, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePrivacyPolicy_UniqueServiceName(privacyPolicy, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePrivacyPolicy_OwnerShouldHaveDefinedInhabits(privacyPolicy, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePrivacyPolicy_UniquePolicyStatementName(privacyPolicy, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePrivacyPolicy_ProtectionControlShouldExistsInConfiguration(privacyPolicy, diagnostics,
					context);
		if (result || diagnostics != null)
			result &= validatePrivacyPolicy_UniquePrivacyDataName(privacyPolicy, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePrivacyPolicy_UniqueDocumentName(privacyPolicy, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePrivacyPolicy_UniqueLocationPerType(privacyPolicy, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePrivacyPolicy_UniquePrincipalNamePerType(privacyPolicy, diagnostics, context);
		return result;
	}

	/**
	 * Validates the UniquePolicyStatementName constraint of '<em>Privacy Policy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrivacyPolicy_UniquePolicyStatementName(PrivacyPolicy privacyPolicy,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return privacyPolicy.UniquePolicyStatementName(diagnostics, context);
	}

	/**
	 * Validates the UniquePrincipalNamePerType constraint of '<em>Privacy Policy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrivacyPolicy_UniquePrincipalNamePerType(PrivacyPolicy privacyPolicy,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return privacyPolicy.UniquePrincipalNamePerType(diagnostics, context);
	}

	/**
	 * Validates the UniquePrivacyDataName constraint of '<em>Privacy Policy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrivacyPolicy_UniquePrivacyDataName(PrivacyPolicy privacyPolicy, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return privacyPolicy.UniquePrivacyDataName(diagnostics, context);
	}

	/**
	 * Validates the UniqueServiceName constraint of '<em>Privacy Policy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrivacyPolicy_UniqueServiceName(PrivacyPolicy privacyPolicy, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return privacyPolicy.UniqueServiceName(diagnostics, context);
	}

	/**
	 * Validates the UniqueProviderName constraint of '<em>Privacy Policy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrivacyPolicy_UniqueProviderName(PrivacyPolicy privacyPolicy, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return privacyPolicy.UniqueProviderName(diagnostics, context);
	}

	/**
	 * Validates the UniqueDocumentName constraint of '<em>Privacy Policy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrivacyPolicy_UniqueDocumentName(PrivacyPolicy privacyPolicy, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return privacyPolicy.UniqueDocumentName(diagnostics, context);
	}

	/**
	 * Validates the UniqueConsentName constraint of '<em>Privacy Policy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrivacyPolicy_UniqueConsentName(PrivacyPolicy privacyPolicy, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return privacyPolicy.UniqueConsentName(diagnostics, context);
	}

	/**
	 * Validates the UniqueComplaintName constraint of '<em>Privacy Policy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrivacyPolicy_UniqueComplaintName(PrivacyPolicy privacyPolicy, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return privacyPolicy.UniqueComplaintName(diagnostics, context);
	}

	/**
	 * Validates the UniqueLocationPerType constraint of '<em>Privacy Policy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrivacyPolicy_UniqueLocationPerType(PrivacyPolicy privacyPolicy, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return privacyPolicy.UniqueLocationPerType(diagnostics, context);
	}

	/**
	 * Validates the ProtectionControlShouldExistsInConfiguration constraint of '<em>Privacy Policy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrivacyPolicy_ProtectionControlShouldExistsInConfiguration(PrivacyPolicy privacyPolicy,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return privacyPolicy.ProtectionControlShouldExistsInConfiguration(diagnostics, context);
	}

	/**
	 * Validates the OwnerShouldHaveDefinedInhabits constraint of '<em>Privacy Policy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrivacyPolicy_OwnerShouldHaveDefinedInhabits(PrivacyPolicy privacyPolicy,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return privacyPolicy.OwnerShouldHaveDefinedInhabits(diagnostics, context);
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
			result &= validatePolicyStatement_WhomShouldBeDefinedForTransfer(policyStatement, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePolicyStatement_SubjectShouldBeNotifiedAboutTransferToThirdCountry(policyStatement,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePolicyStatement_SubjectShouldBeNotifiedAboutExecutedRectification(policyStatement,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePolicyStatement_SubjectShouldBeNotifiedAboutStopProcessing(policyStatement, diagnostics,
					context);
		if (result || diagnostics != null)
			result &= validatePolicyStatement_ControllerApprovalIsNeedForProtectTheVitalInterestsOfTheDataSubjectPurpose(
					policyStatement, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePolicyStatement_MissingConsentForCollecting(policyStatement, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePolicyStatement_ExpiredConsent(policyStatement, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePolicyStatement_StopProcessingPurposeForActionStopProcessing(policyStatement, diagnostics,
					context);
		if (result || diagnostics != null)
			result &= validatePolicyStatement_WithdrawedConsent(policyStatement, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePolicyStatement_ProcessingOfSpecialCategories(policyStatement, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePolicyStatement_SubjectShouldBeNotifiedAboutCollecting(policyStatement, diagnostics,
					context);
		if (result || diagnostics != null)
			result &= validatePolicyStatement_DateShoudBeDefinedForStoreAction(policyStatement, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePolicyStatement_CourtApprovalIsNeedForPublicInterestPurpose(policyStatement, diagnostics,
					context);
		if (result || diagnostics != null)
			result &= validatePolicyStatement_ControllerApprovalIsNeedForLegitimateInterestsPurpose(policyStatement,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePolicyStatement_DateShoudBeDefinedForAccessAction(policyStatement, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePolicyStatement_ExpiredConsentForCollecting(policyStatement, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePolicyStatement_CausedByShouldBeDefinedForStopProcessingAction(policyStatement,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePolicyStatement_JuvenileDataShouldBeUsedWithDocumentOfTypeChildCustodyProvidedByResponsiblePerson(
					policyStatement, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePolicyStatement_MissingConsentOrTransferCertificate(policyStatement, diagnostics,
					context);
		if (result || diagnostics != null)
			result &= validatePolicyStatement_UndefinedPurposeForAction(policyStatement, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePolicyStatement_CausedByShouldBeDefinedForRectificationAction(policyStatement,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePolicyStatement_ExpiredDocument(policyStatement, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePolicyStatement_MissingConsentForTransfer(policyStatement, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePolicyStatement_CausedByShouldBeDefinedForErasureAction(policyStatement, diagnostics,
					context);
		if (result || diagnostics != null)
			result &= validatePolicyStatement_SubjectShouldBeNotifiedAboutExecutedErasure(policyStatement, diagnostics,
					context);
		return result;
	}

	/**
	 * Validates the DateShoudBeDefinedForAccessAction constraint of '<em>Policy Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolicyStatement_DateShoudBeDefinedForAccessAction(PolicyStatement policyStatement,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return policyStatement.DateShoudBeDefinedForAccessAction(diagnostics, context);
	}

	/**
	 * Validates the DateShoudBeDefinedForStoreAction constraint of '<em>Policy Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolicyStatement_DateShoudBeDefinedForStoreAction(PolicyStatement policyStatement,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return policyStatement.DateShoudBeDefinedForStoreAction(diagnostics, context);
	}

	/**
	 * Validates the CourtApprovalIsNeedForPublicInterestPurpose constraint of '<em>Policy Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolicyStatement_CourtApprovalIsNeedForPublicInterestPurpose(PolicyStatement policyStatement,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return policyStatement.CourtApprovalIsNeedForPublicInterestPurpose(diagnostics, context);
	}

	/**
	 * Validates the ControllerApprovalIsNeedForLegitimateInterestsPurpose constraint of '<em>Policy Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolicyStatement_ControllerApprovalIsNeedForLegitimateInterestsPurpose(
			PolicyStatement policyStatement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return policyStatement.ControllerApprovalIsNeedForLegitimateInterestsPurpose(diagnostics, context);
	}

	/**
	 * Validates the ControllerApprovalIsNeedForProtectTheVitalInterestsOfTheDataSubjectPurpose constraint of '<em>Policy Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolicyStatement_ControllerApprovalIsNeedForProtectTheVitalInterestsOfTheDataSubjectPurpose(
			PolicyStatement policyStatement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return policyStatement.ControllerApprovalIsNeedForProtectTheVitalInterestsOfTheDataSubjectPurpose(diagnostics,
				context);
	}

	/**
	 * Validates the StopProcessingPurposeForActionStopProcessing constraint of '<em>Policy Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolicyStatement_StopProcessingPurposeForActionStopProcessing(PolicyStatement policyStatement,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return policyStatement.StopProcessingPurposeForActionStopProcessing(diagnostics, context);
	}

	/**
	 * Validates the ExpiredDocument constraint of '<em>Policy Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolicyStatement_ExpiredDocument(PolicyStatement policyStatement, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return policyStatement.ExpiredDocument(diagnostics, context);
	}

	/**
	 * Validates the MissingConsentForCollecting constraint of '<em>Policy Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolicyStatement_MissingConsentForCollecting(PolicyStatement policyStatement,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return policyStatement.MissingConsentForCollecting(diagnostics, context);
	}

	/**
	 * Validates the UndefinedPurposeForAction constraint of '<em>Policy Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolicyStatement_UndefinedPurposeForAction(PolicyStatement policyStatement,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return policyStatement.UndefinedPurposeForAction(diagnostics, context);
	}

	/**
	 * Validates the ExpiredConsent constraint of '<em>Policy Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolicyStatement_ExpiredConsent(PolicyStatement policyStatement, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return policyStatement.ExpiredConsent(diagnostics, context);
	}

	/**
	 * Validates the ExpiredConsentForCollecting constraint of '<em>Policy Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolicyStatement_ExpiredConsentForCollecting(PolicyStatement policyStatement,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return policyStatement.ExpiredConsentForCollecting(diagnostics, context);
	}

	/**
	 * Validates the WithdrawedConsent constraint of '<em>Policy Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolicyStatement_WithdrawedConsent(PolicyStatement policyStatement,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return policyStatement.WithdrawedConsent(diagnostics, context);
	}

	/**
	 * Validates the JuvenileDataShouldBeUsedWithDocumentOfTypeChildCustodyProvidedByResponsiblePerson constraint of '<em>Policy Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolicyStatement_JuvenileDataShouldBeUsedWithDocumentOfTypeChildCustodyProvidedByResponsiblePerson(
			PolicyStatement policyStatement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return policyStatement.JuvenileDataShouldBeUsedWithDocumentOfTypeChildCustodyProvidedByResponsiblePerson(
				diagnostics, context);
	}

	/**
	 * Validates the ProcessingOfSpecialCategories constraint of '<em>Policy Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolicyStatement_ProcessingOfSpecialCategories(PolicyStatement policyStatement,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return policyStatement.ProcessingOfSpecialCategories(diagnostics, context);
	}

	/**
	 * Validates the SubjectShouldBeNotifiedAboutCollecting constraint of '<em>Policy Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolicyStatement_SubjectShouldBeNotifiedAboutCollecting(PolicyStatement policyStatement,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return policyStatement.SubjectShouldBeNotifiedAboutCollecting(diagnostics, context);
	}

	/**
	 * Validates the SubjectShouldBeNotifiedAboutTransferToThirdCountry constraint of '<em>Policy Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolicyStatement_SubjectShouldBeNotifiedAboutTransferToThirdCountry(
			PolicyStatement policyStatement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return policyStatement.SubjectShouldBeNotifiedAboutTransferToThirdCountry(diagnostics, context);
	}

	/**
	 * Validates the CausedByShouldBeDefinedForRectificationAction constraint of '<em>Policy Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolicyStatement_CausedByShouldBeDefinedForRectificationAction(
			PolicyStatement policyStatement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return policyStatement.CausedByShouldBeDefinedForRectificationAction(diagnostics, context);
	}

	/**
	 * Validates the CausedByShouldBeDefinedForErasureAction constraint of '<em>Policy Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolicyStatement_CausedByShouldBeDefinedForErasureAction(PolicyStatement policyStatement,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return policyStatement.CausedByShouldBeDefinedForErasureAction(diagnostics, context);
	}

	/**
	 * Validates the SubjectShouldBeNotifiedAboutExecutedErasure constraint of '<em>Policy Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolicyStatement_SubjectShouldBeNotifiedAboutExecutedErasure(PolicyStatement policyStatement,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return policyStatement.SubjectShouldBeNotifiedAboutExecutedErasure(diagnostics, context);
	}

	/**
	 * Validates the SubjectShouldBeNotifiedAboutExecutedRectification constraint of '<em>Policy Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolicyStatement_SubjectShouldBeNotifiedAboutExecutedRectification(
			PolicyStatement policyStatement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return policyStatement.SubjectShouldBeNotifiedAboutExecutedRectification(diagnostics, context);
	}

	/**
	 * Validates the WhomShouldBeDefinedForTransfer constraint of '<em>Policy Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolicyStatement_WhomShouldBeDefinedForTransfer(PolicyStatement policyStatement,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return policyStatement.WhomShouldBeDefinedForTransfer(diagnostics, context);
	}

	/**
	 * Validates the MissingConsentForTransfer constraint of '<em>Policy Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolicyStatement_MissingConsentForTransfer(PolicyStatement policyStatement,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return policyStatement.MissingConsentForTransfer(diagnostics, context);
	}

	/**
	 * Validates the SubjectShouldBeNotifiedAboutStopProcessing constraint of '<em>Policy Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolicyStatement_SubjectShouldBeNotifiedAboutStopProcessing(PolicyStatement policyStatement,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return policyStatement.SubjectShouldBeNotifiedAboutStopProcessing(diagnostics, context);
	}

	/**
	 * Validates the CausedByShouldBeDefinedForStopProcessingAction constraint of '<em>Policy Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolicyStatement_CausedByShouldBeDefinedForStopProcessingAction(
			PolicyStatement policyStatement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return policyStatement.CausedByShouldBeDefinedForStopProcessingAction(diagnostics, context);
	}

	/**
	 * Validates the MissingConsentOrTransferCertificate constraint of '<em>Policy Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolicyStatement_MissingConsentOrTransferCertificate(PolicyStatement policyStatement,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return policyStatement.MissingConsentOrTransferCertificate(diagnostics, context);
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
			result &= validatePrincipal_JuvenileShouldHaveResponsiblePerson(principal, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePrincipal_NaturalPersonCanNotConatainsSubPrincipals(principal, diagnostics, context);
		return result;
	}

	/**
	 * Validates the NaturalPersonCanNotConatainsSubPrincipals constraint of '<em>Principal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrincipal_NaturalPersonCanNotConatainsSubPrincipals(Principal principal,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return principal.NaturalPersonCanNotConatainsSubPrincipals(diagnostics, context);
	}

	/**
	 * Validates the JuvenileShouldHaveResponsiblePerson constraint of '<em>Principal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrincipal_JuvenileShouldHaveResponsiblePerson(Principal principal,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return principal.JuvenileShouldHaveResponsiblePerson(diagnostics, context);
	}

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
			result &= validateTimeInterval_AtTypeShouldBeDefinedAlone(timeInterval, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateTimeInterval_AfterStatementBeforeBeforeStatement(timeInterval, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateTimeInterval_UntilTypeShouldBeDefinedAlone(timeInterval, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateTimeInterval_FromStatementBeforeToStatement(timeInterval, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateTimeInterval_OnlyFromOrFromWithTo(timeInterval, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateTimeInterval_OnlyAfterOrAfterWithBefore(timeInterval, diagnostics, context);
		return result;
	}

	/**
	 * Validates the OnlyAfterOrAfterWithBefore constraint of '<em>Time Interval</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeInterval_OnlyAfterOrAfterWithBefore(TimeInterval timeInterval,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return timeInterval.OnlyAfterOrAfterWithBefore(diagnostics, context);
	}

	/**
	 * Validates the OnlyFromOrFromWithTo constraint of '<em>Time Interval</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeInterval_OnlyFromOrFromWithTo(TimeInterval timeInterval, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return timeInterval.OnlyFromOrFromWithTo(diagnostics, context);
	}

	/**
	 * Validates the AtTypeShouldBeDefinedAlone constraint of '<em>Time Interval</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeInterval_AtTypeShouldBeDefinedAlone(TimeInterval timeInterval,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return timeInterval.AtTypeShouldBeDefinedAlone(diagnostics, context);
	}

	/**
	 * Validates the UntilTypeShouldBeDefinedAlone constraint of '<em>Time Interval</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeInterval_UntilTypeShouldBeDefinedAlone(TimeInterval timeInterval,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return timeInterval.UntilTypeShouldBeDefinedAlone(diagnostics, context);
	}

	/**
	 * Validates the AfterStatementBeforeBeforeStatement constraint of '<em>Time Interval</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeInterval_AfterStatementBeforeBeforeStatement(TimeInterval timeInterval,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return timeInterval.AfterStatementBeforeBeforeStatement(diagnostics, context);
	}

	/**
	 * Validates the FromStatementBeforeToStatement constraint of '<em>Time Interval</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeInterval_FromStatementBeforeToStatement(TimeInterval timeInterval,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return timeInterval.FromStatementBeforeToStatement(diagnostics, context);
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
			result &= validatePurpose_TestingShouldNotContainSubReason(purpose, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePurpose_PublicHealthShouldNotContainSubReason(purpose, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePurpose_LegitimateInterestsNotContainSubReason(purpose, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePurpose_StopProcessingInterestShouldNotContainSubReason(purpose, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePurpose_ProfilingShouldNotContainSubReason(purpose, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePurpose_MarketingShouldNotContainSubReason(purpose, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePurpose_OutOfScopeCannotContainsThisSubReason(purpose, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePurpose_ExercisingSpecificRightsPurposesCannotContainsThisSubReason(purpose, diagnostics,
					context);
		if (result || diagnostics != null)
			result &= validatePurpose_ProtectTheVitalInterestsOfTheDataSubjectCannotContainsThisSubReason(purpose,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePurpose_PublicInterestCannotContainsThisSubReason(purpose, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePurpose_ResearchCannotContainsThisSubReason(purpose, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePurpose_StatisticalPurposesShouldNotContainSubReason(purpose, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ResearchCannotContainsThisSubReason constraint of '<em>Purpose</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePurpose_ResearchCannotContainsThisSubReason(Purpose purpose, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return purpose.ResearchCannotContainsThisSubReason(diagnostics, context);
	}

	/**
	 * Validates the PublicHealthShouldNotContainSubReason constraint of '<em>Purpose</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePurpose_PublicHealthShouldNotContainSubReason(Purpose purpose, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return purpose.PublicHealthShouldNotContainSubReason(diagnostics, context);
	}

	/**
	 * Validates the OutOfScopeCannotContainsThisSubReason constraint of '<em>Purpose</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePurpose_OutOfScopeCannotContainsThisSubReason(Purpose purpose, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return purpose.OutOfScopeCannotContainsThisSubReason(diagnostics, context);
	}

	/**
	 * Validates the PublicInterestCannotContainsThisSubReason constraint of '<em>Purpose</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePurpose_PublicInterestCannotContainsThisSubReason(Purpose purpose,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return purpose.PublicInterestCannotContainsThisSubReason(diagnostics, context);
	}

	/**
	 * Validates the StatisticalPurposesShouldNotContainSubReason constraint of '<em>Purpose</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePurpose_StatisticalPurposesShouldNotContainSubReason(Purpose purpose,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return purpose.StatisticalPurposesShouldNotContainSubReason(diagnostics, context);
	}

	/**
	 * Validates the ExercisingSpecificRightsPurposesCannotContainsThisSubReason constraint of '<em>Purpose</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePurpose_ExercisingSpecificRightsPurposesCannotContainsThisSubReason(Purpose purpose,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return purpose.ExercisingSpecificRightsPurposesCannotContainsThisSubReason(diagnostics, context);
	}

	/**
	 * Validates the MarketingShouldNotContainSubReason constraint of '<em>Purpose</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePurpose_MarketingShouldNotContainSubReason(Purpose purpose, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return purpose.MarketingShouldNotContainSubReason(diagnostics, context);
	}

	/**
	 * Validates the TestingShouldNotContainSubReason constraint of '<em>Purpose</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePurpose_TestingShouldNotContainSubReason(Purpose purpose, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return purpose.TestingShouldNotContainSubReason(diagnostics, context);
	}

	/**
	 * Validates the ProfilingShouldNotContainSubReason constraint of '<em>Purpose</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePurpose_ProfilingShouldNotContainSubReason(Purpose purpose, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return purpose.ProfilingShouldNotContainSubReason(diagnostics, context);
	}

	/**
	 * Validates the ProtectTheVitalInterestsOfTheDataSubjectCannotContainsThisSubReason constraint of '<em>Purpose</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePurpose_ProtectTheVitalInterestsOfTheDataSubjectCannotContainsThisSubReason(Purpose purpose,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return purpose.ProtectTheVitalInterestsOfTheDataSubjectCannotContainsThisSubReason(diagnostics, context);
	}

	/**
	 * Validates the LegitimateInterestsNotContainSubReason constraint of '<em>Purpose</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePurpose_LegitimateInterestsNotContainSubReason(Purpose purpose, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return purpose.LegitimateInterestsNotContainSubReason(diagnostics, context);
	}

	/**
	 * Validates the StopProcessingInterestShouldNotContainSubReason constraint of '<em>Purpose</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePurpose_StopProcessingInterestShouldNotContainSubReason(Purpose purpose,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return purpose.StopProcessingInterestShouldNotContainSubReason(diagnostics, context);
	}

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
			result &= validateComplaint_SubjectShouldBeNotifiedAboutExistingComplaintForRectification(complaint,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= validateComplaint_CannotIdentifyDataFromComplaint(complaint, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateComplaint_StopProcessingShouldBeExecutedAsSoonAsPossible(complaint, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateComplaint_UserDoesntHavePermissionToWithdrawConsent(complaint, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateComplaint_ErasureShouldBeExecutedAsSoonAsPossible(complaint, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateComplaint_SubjectShouldBeNotifiedAboutExistingComplaintForErasure(complaint, diagnostics,
					context);
		if (result || diagnostics != null)
			result &= validateComplaint_RectificationShouldBeExecutedAsSoonAsPossible(complaint, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateComplaint_InvalidTypeOfPurposeForAnObject(complaint, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateComplaint_UserDoesntHavePermissionToComplaint(complaint, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateComplaint_SubjectShouldBeNotifiedAboutWithdraw(complaint, diagnostics, context);
		return result;
	}

	/**
	 * Validates the UserDoesntHavePermissionToWithdrawConsent constraint of '<em>Complaint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComplaint_UserDoesntHavePermissionToWithdrawConsent(Complaint complaint,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return complaint.UserDoesntHavePermissionToWithdrawConsent(diagnostics, context);
	}

	/**
	 * Validates the SubjectShouldBeNotifiedAboutWithdraw constraint of '<em>Complaint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComplaint_SubjectShouldBeNotifiedAboutWithdraw(Complaint complaint,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return complaint.SubjectShouldBeNotifiedAboutWithdraw(diagnostics, context);
	}

	/**
	 * Validates the SubjectShouldBeNotifiedAboutExistingComplaintForRectification constraint of '<em>Complaint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComplaint_SubjectShouldBeNotifiedAboutExistingComplaintForRectification(Complaint complaint,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return complaint.SubjectShouldBeNotifiedAboutExistingComplaintForRectification(diagnostics, context);
	}

	/**
	 * Validates the SubjectShouldBeNotifiedAboutExistingComplaintForErasure constraint of '<em>Complaint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComplaint_SubjectShouldBeNotifiedAboutExistingComplaintForErasure(Complaint complaint,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return complaint.SubjectShouldBeNotifiedAboutExistingComplaintForErasure(diagnostics, context);
	}

	/**
	 * Validates the CannotIdentifyDataFromComplaint constraint of '<em>Complaint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComplaint_CannotIdentifyDataFromComplaint(Complaint complaint, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return complaint.CannotIdentifyDataFromComplaint(diagnostics, context);
	}

	/**
	 * Validates the RectificationShouldBeExecutedAsSoonAsPossible constraint of '<em>Complaint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComplaint_RectificationShouldBeExecutedAsSoonAsPossible(Complaint complaint,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return complaint.RectificationShouldBeExecutedAsSoonAsPossible(diagnostics, context);
	}

	/**
	 * Validates the ErasureShouldBeExecutedAsSoonAsPossible constraint of '<em>Complaint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComplaint_ErasureShouldBeExecutedAsSoonAsPossible(Complaint complaint,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return complaint.ErasureShouldBeExecutedAsSoonAsPossible(diagnostics, context);
	}

	/**
	 * Validates the InvalidTypeOfPurposeForAnObject constraint of '<em>Complaint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComplaint_InvalidTypeOfPurposeForAnObject(Complaint complaint, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return complaint.InvalidTypeOfPurposeForAnObject(diagnostics, context);
	}

	/**
	 * Validates the UserDoesntHavePermissionToComplaint constraint of '<em>Complaint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComplaint_UserDoesntHavePermissionToComplaint(Complaint complaint,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return complaint.UserDoesntHavePermissionToComplaint(diagnostics, context);
	}

	/**
	 * Validates the StopProcessingShouldBeExecutedAsSoonAsPossible constraint of '<em>Complaint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComplaint_StopProcessingShouldBeExecutedAsSoonAsPossible(Complaint complaint,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return complaint.StopProcessingShouldBeExecutedAsSoonAsPossible(diagnostics, context);
	}

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
	 * Validates the StartDateShouldBeBeforeTerminationDate constraint of '<em>Abstract Paper</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractPaper_StartDateShouldBeBeforeTerminationDate(AbstractPaper abstractPaper,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return abstractPaper.StartDateShouldBeBeforeTerminationDate(diagnostics, context);
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
			result &= validateSharedPrivacyData_DataSourceShouldExistsInConfiguration(sharedPrivacyData, diagnostics,
					context);
		if (result || diagnostics != null)
			result &= validateSharedPrivacyData_ProtectionControlShouldExistsInConfiguration(sharedPrivacyData,
					diagnostics, context);
		return result;
	}

	/**
	 * Validates the ProtectionControlShouldExistsInConfiguration constraint of '<em>Shared Privacy Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSharedPrivacyData_ProtectionControlShouldExistsInConfiguration(
			SharedPrivacyData sharedPrivacyData, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return sharedPrivacyData.ProtectionControlShouldExistsInConfiguration(diagnostics, context);
	}

	/**
	 * Validates the DataSourceShouldExistsInConfiguration constraint of '<em>Shared Privacy Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSharedPrivacyData_DataSourceShouldExistsInConfiguration(SharedPrivacyData sharedPrivacyData,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return sharedPrivacyData.DataSourceShouldExistsInConfiguration(diagnostics, context);
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
			result &= validateNotification_ShouldDefineCausedByAsRectification(notification, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateNotification_ShouldDefineCausedByAsErasure(notification, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateNotification_ShouldDefineCausedByAsPrivacyPolicy(notification, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateNotification_ShouldDefineCausedByAsWithdraw(notification, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ShouldDefineCausedByAsWithdraw constraint of '<em>Notification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNotification_ShouldDefineCausedByAsWithdraw(Notification notification,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return notification.ShouldDefineCausedByAsWithdraw(diagnostics, context);
	}

	/**
	 * Validates the ShouldDefineCausedByAsErasure constraint of '<em>Notification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNotification_ShouldDefineCausedByAsErasure(Notification notification,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return notification.ShouldDefineCausedByAsErasure(diagnostics, context);
	}

	/**
	 * Validates the ShouldDefineCausedByAsRectification constraint of '<em>Notification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNotification_ShouldDefineCausedByAsRectification(Notification notification,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return notification.ShouldDefineCausedByAsRectification(diagnostics, context);
	}

	/**
	 * Validates the ShouldDefineCausedByAsPrivacyPolicy constraint of '<em>Notification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNotification_ShouldDefineCausedByAsPrivacyPolicy(Notification notification,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return notification.ShouldDefineCausedByAsPrivacyPolicy(diagnostics, context);
	}

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
