/**
 */
package privacyModel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import privacyModel.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PrivacyModelFactoryImpl extends EFactoryImpl implements PrivacyModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PrivacyModelFactory init() {
		try {
			PrivacyModelFactory thePrivacyModelFactory = (PrivacyModelFactory) EPackage.Registry.INSTANCE
					.getEFactory(PrivacyModelPackage.eNS_URI);
			if (thePrivacyModelFactory != null) {
				return thePrivacyModelFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PrivacyModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrivacyModelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case PrivacyModelPackage.PRIVACY_POLICY:
			return createPrivacyPolicy();
		case PrivacyModelPackage.POLICY_STATEMENT:
			return createPolicyStatement();
		case PrivacyModelPackage.PRIVACY_DATA:
			return createPrivacyData();
		case PrivacyModelPackage.SERVICE:
			return createService();
		case PrivacyModelPackage.PROVIDER:
			return createProvider();
		case PrivacyModelPackage.PRINCIPAL:
			return createPrincipal();
		case PrivacyModelPackage.LOCATION:
			return createLocation();
		case PrivacyModelPackage.TIME_INTERVAL:
			return createTimeInterval();
		case PrivacyModelPackage.TIME_STATEMENT:
			return createTimeStatement();
		case PrivacyModelPackage.PURPOSE:
			return createPurpose();
		case PrivacyModelPackage.WHAT:
			return createWhat();
		case PrivacyModelPackage.HOW:
			return createHow();
		case PrivacyModelPackage.CONSENT:
			return createConsent();
		case PrivacyModelPackage.CONFIGURATION_MANAGER:
			return createConfigurationManager();
		case PrivacyModelPackage.COMPLAINT:
			return createComplaint();
		case PrivacyModelPackage.PRIVACY_POLICY_HELPER:
			return createPrivacyPolicyHelper();
		case PrivacyModelPackage.WHERE:
			return createWhere();
		case PrivacyModelPackage.DOCUMENT:
			return createDocument();
		case PrivacyModelPackage.WITHDRAW:
			return createWithdraw();
		case PrivacyModelPackage.COMPLAINT_BASED_ON_DATA:
			return createComplaintBasedOnData();
		case PrivacyModelPackage.SHARED_PRIVACY_DATA:
			return createSharedPrivacyData();
		case PrivacyModelPackage.DENIAL:
			return createDenial();
		case PrivacyModelPackage.NOTIFICATION:
			return createNotification();
		case PrivacyModelPackage.COMPLAINT_BASED_ON_ACTION:
			return createComplaintBasedOnAction();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case PrivacyModelPackage.DATA_TYPE:
			return createDataTypeFromString(eDataType, initialValue);
		case PrivacyModelPackage.DOCUMENT_TYPE:
			return createDocumentTypeFromString(eDataType, initialValue);
		case PrivacyModelPackage.TIME_PREPOSITION:
			return createTimePrepositionFromString(eDataType, initialValue);
		case PrivacyModelPackage.PRINCIPAL_TYPE:
			return createPrincipalTypeFromString(eDataType, initialValue);
		case PrivacyModelPackage.PRINCIPAL_SCOPE:
			return createPrincipalScopeFromString(eDataType, initialValue);
		case PrivacyModelPackage.ACTION:
			return createActionFromString(eDataType, initialValue);
		case PrivacyModelPackage.LOCATION_TYPE:
			return createLocationTypeFromString(eDataType, initialValue);
		case PrivacyModelPackage.PROCESSING_REASON:
			return createProcessingReasonFromString(eDataType, initialValue);
		case PrivacyModelPackage.PROCESSING_REASON_SUBTYPE:
			return createProcessingReasonSubtypeFromString(eDataType, initialValue);
		case PrivacyModelPackage.CONSENT_FORMAT:
			return createConsentFormatFromString(eDataType, initialValue);
		case PrivacyModelPackage.CONSENT_TYPE:
			return createConsentTypeFromString(eDataType, initialValue);
		case PrivacyModelPackage.COMPLAINT_BASED_ON_DATA_TYPE:
			return createComplaintBasedOnDataTypeFromString(eDataType, initialValue);
		case PrivacyModelPackage.NOTIFICATION_TYPE:
			return createNotificationTypeFromString(eDataType, initialValue);
		case PrivacyModelPackage.COMPLAINT_STATUS:
			return createComplaintStatusFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case PrivacyModelPackage.DATA_TYPE:
			return convertDataTypeToString(eDataType, instanceValue);
		case PrivacyModelPackage.DOCUMENT_TYPE:
			return convertDocumentTypeToString(eDataType, instanceValue);
		case PrivacyModelPackage.TIME_PREPOSITION:
			return convertTimePrepositionToString(eDataType, instanceValue);
		case PrivacyModelPackage.PRINCIPAL_TYPE:
			return convertPrincipalTypeToString(eDataType, instanceValue);
		case PrivacyModelPackage.PRINCIPAL_SCOPE:
			return convertPrincipalScopeToString(eDataType, instanceValue);
		case PrivacyModelPackage.ACTION:
			return convertActionToString(eDataType, instanceValue);
		case PrivacyModelPackage.LOCATION_TYPE:
			return convertLocationTypeToString(eDataType, instanceValue);
		case PrivacyModelPackage.PROCESSING_REASON:
			return convertProcessingReasonToString(eDataType, instanceValue);
		case PrivacyModelPackage.PROCESSING_REASON_SUBTYPE:
			return convertProcessingReasonSubtypeToString(eDataType, instanceValue);
		case PrivacyModelPackage.CONSENT_FORMAT:
			return convertConsentFormatToString(eDataType, instanceValue);
		case PrivacyModelPackage.CONSENT_TYPE:
			return convertConsentTypeToString(eDataType, instanceValue);
		case PrivacyModelPackage.COMPLAINT_BASED_ON_DATA_TYPE:
			return convertComplaintBasedOnDataTypeToString(eDataType, instanceValue);
		case PrivacyModelPackage.NOTIFICATION_TYPE:
			return convertNotificationTypeToString(eDataType, instanceValue);
		case PrivacyModelPackage.COMPLAINT_STATUS:
			return convertComplaintStatusToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrivacyPolicy createPrivacyPolicy() {
		PrivacyPolicyImpl privacyPolicy = new PrivacyPolicyImpl();
		return privacyPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolicyStatement createPolicyStatement() {
		PolicyStatementImpl policyStatement = new PolicyStatementImpl();
		return policyStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrivacyData createPrivacyData() {
		PrivacyDataImpl privacyData = new PrivacyDataImpl();
		return privacyData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service createService() {
		ServiceImpl service = new ServiceImpl();
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Provider createProvider() {
		ProviderImpl provider = new ProviderImpl();
		return provider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Principal createPrincipal() {
		PrincipalImpl principal = new PrincipalImpl();
		return principal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location createLocation() {
		LocationImpl location = new LocationImpl();
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeInterval createTimeInterval() {
		TimeIntervalImpl timeInterval = new TimeIntervalImpl();
		return timeInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeStatement createTimeStatement() {
		TimeStatementImpl timeStatement = new TimeStatementImpl();
		return timeStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Purpose createPurpose() {
		PurposeImpl purpose = new PurposeImpl();
		return purpose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public What createWhat() {
		WhatImpl what = new WhatImpl();
		return what;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public How createHow() {
		HowImpl how = new HowImpl();
		return how;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Consent createConsent() {
		ConsentImpl consent = new ConsentImpl();
		return consent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationManager createConfigurationManager() {
		ConfigurationManagerImpl configurationManager = new ConfigurationManagerImpl();
		return configurationManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Complaint createComplaint() {
		ComplaintImpl complaint = new ComplaintImpl();
		return complaint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrivacyPolicyHelper createPrivacyPolicyHelper() {
		PrivacyPolicyHelperImpl privacyPolicyHelper = new PrivacyPolicyHelperImpl();
		return privacyPolicyHelper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Where createWhere() {
		WhereImpl where = new WhereImpl();
		return where;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Document createDocument() {
		DocumentImpl document = new DocumentImpl();
		return document;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Withdraw createWithdraw() {
		WithdrawImpl withdraw = new WithdrawImpl();
		return withdraw;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplaintBasedOnData createComplaintBasedOnData() {
		ComplaintBasedOnDataImpl complaintBasedOnData = new ComplaintBasedOnDataImpl();
		return complaintBasedOnData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SharedPrivacyData createSharedPrivacyData() {
		SharedPrivacyDataImpl sharedPrivacyData = new SharedPrivacyDataImpl();
		return sharedPrivacyData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Denial createDenial() {
		DenialImpl denial = new DenialImpl();
		return denial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Notification createNotification() {
		NotificationImpl notification = new NotificationImpl();
		return notification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplaintBasedOnAction createComplaintBasedOnAction() {
		ComplaintBasedOnActionImpl complaintBasedOnAction = new ComplaintBasedOnActionImpl();
		return complaintBasedOnAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType createDataTypeFromString(EDataType eDataType, String initialValue) {
		DataType result = DataType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentType createDocumentTypeFromString(EDataType eDataType, String initialValue) {
		DocumentType result = DocumentType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDocumentTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimePreposition createTimePrepositionFromString(EDataType eDataType, String initialValue) {
		TimePreposition result = TimePreposition.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTimePrepositionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrincipalType createPrincipalTypeFromString(EDataType eDataType, String initialValue) {
		PrincipalType result = PrincipalType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPrincipalTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrincipalScope createPrincipalScopeFromString(EDataType eDataType, String initialValue) {
		PrincipalScope result = PrincipalScope.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPrincipalScopeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action createActionFromString(EDataType eDataType, String initialValue) {
		Action result = Action.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationType createLocationTypeFromString(EDataType eDataType, String initialValue) {
		LocationType result = LocationType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLocationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessingReason createProcessingReasonFromString(EDataType eDataType, String initialValue) {
		ProcessingReason result = ProcessingReason.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProcessingReasonToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessingReasonSubtype createProcessingReasonSubtypeFromString(EDataType eDataType, String initialValue) {
		ProcessingReasonSubtype result = ProcessingReasonSubtype.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProcessingReasonSubtypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConsentFormat createConsentFormatFromString(EDataType eDataType, String initialValue) {
		ConsentFormat result = ConsentFormat.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConsentFormatToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConsentType createConsentTypeFromString(EDataType eDataType, String initialValue) {
		ConsentType result = ConsentType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConsentTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplaintBasedOnDataType createComplaintBasedOnDataTypeFromString(EDataType eDataType, String initialValue) {
		ComplaintBasedOnDataType result = ComplaintBasedOnDataType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertComplaintBasedOnDataTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationType createNotificationTypeFromString(EDataType eDataType, String initialValue) {
		NotificationType result = NotificationType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNotificationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplaintStatus createComplaintStatusFromString(EDataType eDataType, String initialValue) {
		ComplaintStatus result = ComplaintStatus.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertComplaintStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrivacyModelPackage getPrivacyModelPackage() {
		return (PrivacyModelPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PrivacyModelPackage getPackage() {
		return PrivacyModelPackage.eINSTANCE;
	}

} //PrivacyModelFactoryImpl
