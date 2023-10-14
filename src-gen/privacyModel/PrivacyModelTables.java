/*******************************************************************************
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 *   /PrivacyModel/model/privacyModel.ecore
 * using:
 *   /PrivacyModel/model/privacyModel.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package privacyModel;

import java.lang.String;
import oclstdlib.OclstdlibTables;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.EcoreTables;
import org.eclipse.ocl.pivot.ParameterTypes;
import org.eclipse.ocl.pivot.TemplateParameters;
import org.eclipse.ocl.pivot.ids.ClassId;
import org.eclipse.ocl.pivot.ids.CollectionTypeId;
import org.eclipse.ocl.pivot.ids.DataTypeId;
import org.eclipse.ocl.pivot.ids.EnumerationId;
import org.eclipse.ocl.pivot.ids.EnumerationLiteralId;
import org.eclipse.ocl.pivot.ids.IdManager;
import org.eclipse.ocl.pivot.ids.NsURIPackageId;
import org.eclipse.ocl.pivot.ids.RootPackageId;
import org.eclipse.ocl.pivot.ids.TuplePartId;
import org.eclipse.ocl.pivot.ids.TupleTypeId;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumeration;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumerationLiteral;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreLibraryOppositeProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorFragment;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorOperation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorPropertyWithImplementation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorSpecializedType;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorType;
import org.eclipse.ocl.pivot.utilities.AbstractTables;
import org.eclipse.ocl.pivot.utilities.TypeUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.SequenceValue;
// import privacyModel.PrivacyModelPackage;
// import privacyModel.PrivacyModelTables;

/**
 * PrivacyModelTables provides the dispatch tables for the privacyModel for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
public class PrivacyModelTables extends AbstractTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(PrivacyModelPackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final ExecutorStandardLibrary LIBRARY = OclstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ RootPackageId PACKid_$metamodel$ = IdManager.getRootPackageId("$metamodel$");
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_privacymodel = IdManager.getNsURIPackageId("http://privacymodel", null, PrivacyModelPackage.eINSTANCE);
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore = IdManager.getNsURIPackageId("http://www.eclipse.org/emf/2002/Ecore", null, EcorePackage.eINSTANCE);
	public static final /*@NonInvalid*/ ClassId CLSSid_AbstractComplaint = PrivacyModelTables.PACKid_http_c_s_s_privacymodel.getClassId("AbstractComplaint", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_AbstractComplaintAction = PrivacyModelTables.PACKid_http_c_s_s_privacymodel.getClassId("AbstractComplaintAction", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_AbstractPaper = PrivacyModelTables.PACKid_http_c_s_s_privacymodel.getClassId("AbstractPaper", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_AbstractTime = PrivacyModelTables.PACKid_http_c_s_s_privacymodel.getClassId("AbstractTime", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Class = PrivacyModelTables.PACKid_$metamodel$.getClassId("Class", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Complaint = PrivacyModelTables.PACKid_http_c_s_s_privacymodel.getClassId("Complaint", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_ComplaintBasedOnAction = PrivacyModelTables.PACKid_http_c_s_s_privacymodel.getClassId("ComplaintBasedOnAction", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_ComplaintBasedOnData = PrivacyModelTables.PACKid_http_c_s_s_privacymodel.getClassId("ComplaintBasedOnData", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_ConfigurationManager = PrivacyModelTables.PACKid_http_c_s_s_privacymodel.getClassId("ConfigurationManager", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Consent = PrivacyModelTables.PACKid_http_c_s_s_privacymodel.getClassId("Consent", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Denial = PrivacyModelTables.PACKid_http_c_s_s_privacymodel.getClassId("Denial", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Document = PrivacyModelTables.PACKid_http_c_s_s_privacymodel.getClassId("Document", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_How = PrivacyModelTables.PACKid_http_c_s_s_privacymodel.getClassId("How", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Location = PrivacyModelTables.PACKid_http_c_s_s_privacymodel.getClassId("Location", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Notification = PrivacyModelTables.PACKid_http_c_s_s_privacymodel.getClassId("Notification", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_NotificationInfo = PrivacyModelTables.PACKid_http_c_s_s_privacymodel.getClassId("NotificationInfo", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_PolicyStatement = PrivacyModelTables.PACKid_http_c_s_s_privacymodel.getClassId("PolicyStatement", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Principal = PrivacyModelTables.PACKid_http_c_s_s_privacymodel.getClassId("Principal", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_PrivacyData = PrivacyModelTables.PACKid_http_c_s_s_privacymodel.getClassId("PrivacyData", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_PrivacyPolicy = PrivacyModelTables.PACKid_http_c_s_s_privacymodel.getClassId("PrivacyPolicy", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_PrivacyPolicyHelper = PrivacyModelTables.PACKid_http_c_s_s_privacymodel.getClassId("PrivacyPolicyHelper", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Provider = PrivacyModelTables.PACKid_http_c_s_s_privacymodel.getClassId("Provider", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Purpose = PrivacyModelTables.PACKid_http_c_s_s_privacymodel.getClassId("Purpose", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Service = PrivacyModelTables.PACKid_http_c_s_s_privacymodel.getClassId("Service", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_SharedPrivacyData = PrivacyModelTables.PACKid_http_c_s_s_privacymodel.getClassId("SharedPrivacyData", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_TimeInterval = PrivacyModelTables.PACKid_http_c_s_s_privacymodel.getClassId("TimeInterval", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_TimeStatement = PrivacyModelTables.PACKid_http_c_s_s_privacymodel.getClassId("TimeStatement", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_What = PrivacyModelTables.PACKid_http_c_s_s_privacymodel.getClassId("What", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Where = PrivacyModelTables.PACKid_http_c_s_s_privacymodel.getClassId("Where", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Withdraw = PrivacyModelTables.PACKid_http_c_s_s_privacymodel.getClassId("Withdraw", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EDate = PrivacyModelTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EDate", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EInt = PrivacyModelTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EInt", 0);
	public static final /*@NonInvalid*/ EnumerationId ENUMid_Action = PrivacyModelTables.PACKid_http_c_s_s_privacymodel.getEnumerationId("Action");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_ComplaintBasedOnDataType = PrivacyModelTables.PACKid_http_c_s_s_privacymodel.getEnumerationId("ComplaintBasedOnDataType");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_ComplaintStatus = PrivacyModelTables.PACKid_http_c_s_s_privacymodel.getEnumerationId("ComplaintStatus");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_ConsentFormat = PrivacyModelTables.PACKid_http_c_s_s_privacymodel.getEnumerationId("ConsentFormat");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_ConsentType = PrivacyModelTables.PACKid_http_c_s_s_privacymodel.getEnumerationId("ConsentType");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_DataType = PrivacyModelTables.PACKid_http_c_s_s_privacymodel.getEnumerationId("DataType");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_DocumentType = PrivacyModelTables.PACKid_http_c_s_s_privacymodel.getEnumerationId("DocumentType");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_LocationType = PrivacyModelTables.PACKid_http_c_s_s_privacymodel.getEnumerationId("LocationType");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_NotificationType = PrivacyModelTables.PACKid_http_c_s_s_privacymodel.getEnumerationId("NotificationType");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_PrincipalScope = PrivacyModelTables.PACKid_http_c_s_s_privacymodel.getEnumerationId("PrincipalScope");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_PrincipalType = PrivacyModelTables.PACKid_http_c_s_s_privacymodel.getEnumerationId("PrincipalType");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_ProcessingReason = PrivacyModelTables.PACKid_http_c_s_s_privacymodel.getEnumerationId("ProcessingReason");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_ProcessingReasonSubtype = PrivacyModelTables.PACKid_http_c_s_s_privacymodel.getEnumerationId("ProcessingReasonSubtype");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_TimePreposition = PrivacyModelTables.PACKid_http_c_s_s_privacymodel.getEnumerationId("TimePreposition");
	public static final /*@NonInvalid*/ IntegerValue INT_0 = ValueUtil.integerValueOf("0");
	public static final /*@NonInvalid*/ CollectionTypeId ORD_PRIMid_String = TypeId.ORDERED_SET.getSpecializedId(TypeId.STRING);
	public static final /*@NonInvalid*/ TuplePartId PARTid_ = IdManager.getTuplePartId(0, "message", TypeId.STRING);
	public static final /*@NonInvalid*/ TuplePartId PARTid__0 = IdManager.getTuplePartId(1, "status", TypeId.BOOLEAN);
	public static final /*@NonInvalid*/ String STR_After_32_interval_32_should_32_be_32_defined_32_alone_32_or_32_with_32_before_32_interval = "After interval should be defined alone or with before interval";
	public static final /*@NonInvalid*/ String STR_After_32_interval_32_should_32_be_32_defined_32_before_32_before_32_interval = "After interval should be defined before before interval";
	public static final /*@NonInvalid*/ String STR_At_32_statement_32_should_32_be_32_defined_32_alone = "At statement should be defined alone";
	public static final /*@NonInvalid*/ String STR_Based_32_on_32_Art11 = "Based on Art11";
	public static final /*@NonInvalid*/ String STR_Based_32_on_32_Art14 = "Based on Art14";
	public static final /*@NonInvalid*/ String STR_Based_32_on_32_Art15 = "Based on Art15";
	public static final /*@NonInvalid*/ String STR_Based_32_on_32_Art16 = "Based on Art16";
	public static final /*@NonInvalid*/ String STR_Based_32_on_32_Art17 = "Based on Art17";
	public static final /*@NonInvalid*/ String STR_Based_32_on_32_Art19 = "Based on Art19";
	public static final /*@NonInvalid*/ String STR_Based_32_on_32_Art20 = "Based on Art20";
	public static final /*@NonInvalid*/ String STR_Based_32_on_32_Art21 = "Based on Art21";
	public static final /*@NonInvalid*/ String STR_Based_32_on_32_Art6 = "Based on Art6";
	public static final /*@NonInvalid*/ String STR_Based_32_on_32_Art7 = "Based on Art7";
	public static final /*@NonInvalid*/ String STR_Based_32_on_32_Art8 = "Based on Art8";
	public static final /*@NonInvalid*/ String STR_Based_32_on_32_Art9 = "Based on Art9";
	public static final /*@NonInvalid*/ String STR_Based_32_on_32_Art_32_3 = "Based on Art 3";
	public static final /*@NonInvalid*/ String STR_Based_32_on_32_Arts_32_44_m_50 = "Based on Arts 44-50";
	public static final /*@NonInvalid*/ String STR_Complaint_32_name_32_is_32_unique = "Complaint name is unique";
	public static final /*@NonInvalid*/ String STR_Consent_32_name_32_is_32_unique = "Consent name is unique";
	public static final /*@NonInvalid*/ String STR_Data_32_source_32_should_32_be_32_defined_32_in_32_configuration = "Data source should be defined in configuration.";
	public static final /*@NonInvalid*/ String STR_Date_32_shoud_32_be_32_defined = "Date shoud be defined";
	public static final /*@NonInvalid*/ String STR_Document_32_name_32_is_32_unique = "Document name is unique";
	public static final /*@NonInvalid*/ String STR_From_32_interval_32_should_32_be_32_defined_32_alone_32_or_32_with_32_to_32_interval = "From interval should be defined alone or with to interval";
	public static final /*@NonInvalid*/ String STR_From_32_interval_32_should_32_be_32_defined_32_before_32_to_32_interval = "From interval should be defined before to interval";
	public static final /*@NonInvalid*/ String STR_Location_32_name_32_per_32_type_32_is_32_unique = "Location name per type is unique";
	public static final /*@NonInvalid*/ String STR_NotifyAboutCollecting_32_or_32_StopProcessing_32_should_32_contain_32_causedBy_32 = "NotifyAboutCollecting or StopProcessing should contain causedBy with policy statement";
	public static final /*@NonInvalid*/ String STR_NotifyAboutErasure_32_should_32_contain_32_causedBy_32_with_32_complaint_32_Erasur = "NotifyAboutErasure should contain causedBy with complaint Erasure";
	public static final /*@NonInvalid*/ String STR_NotifyAboutRectification_32_should_32_contain_32_causedBy_32_with_32_complaint_32 = "NotifyAboutRectification should contain causedBy with complaint Rectification";
	public static final /*@NonInvalid*/ String STR_NotifyAboutWithdraw_32_should_32_contain_32_causedBy_32_with_32_complaint_32_Withr = "NotifyAboutWithdraw should contain causedBy with complaint Withraw";
	public static final /*@NonInvalid*/ String STR_PolicyStatement_32_name_32_is_32_unique = "PolicyStatement name is unique";
	public static final /*@NonInvalid*/ String STR_Principal_32_name_32_per_32_type_32_is_32_unique = "Principal name per type is unique";
	public static final /*@NonInvalid*/ String STR_PrivacyData_32_name_32_is_32_unique = "PrivacyData name is unique";
	public static final /*@NonInvalid*/ String STR_Protection_32_controls_32_should_32_be_32_defined_32_in_32_configuration = "Protection controls should be defined in configuration.";
	public static final /*@NonInvalid*/ String STR_Provider_32_name_32_is_32_unique = "Provider name is unique";
	public static final /*@NonInvalid*/ String STR_Service_32_name_32_is_32_unique = "Service name is unique";
	public static final /*@NonInvalid*/ String STR_Terminationdate_32_is_32_after_32_startdate_33 = "Terminationdate is after startdate!";
	public static final /*@NonInvalid*/ String STR_Until_32_statement_32_should_32_be_32_defined_32_alone = "Until statement should be defined alone";
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_AbstractComplaint = TypeId.BAG.getSpecializedId(PrivacyModelTables.CLSSid_AbstractComplaint);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_AbstractPaper = TypeId.BAG.getSpecializedId(PrivacyModelTables.CLSSid_AbstractPaper);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Complaint = TypeId.BAG.getSpecializedId(PrivacyModelTables.CLSSid_Complaint);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_ComplaintBasedOnAction = TypeId.BAG.getSpecializedId(PrivacyModelTables.CLSSid_ComplaintBasedOnAction);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_ComplaintBasedOnData = TypeId.BAG.getSpecializedId(PrivacyModelTables.CLSSid_ComplaintBasedOnData);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Denial = TypeId.BAG.getSpecializedId(PrivacyModelTables.CLSSid_Denial);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_How = TypeId.BAG.getSpecializedId(PrivacyModelTables.CLSSid_How);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Location = TypeId.BAG.getSpecializedId(PrivacyModelTables.CLSSid_Location);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Notification = TypeId.BAG.getSpecializedId(PrivacyModelTables.CLSSid_Notification);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_PolicyStatement = TypeId.BAG.getSpecializedId(PrivacyModelTables.CLSSid_PolicyStatement);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Principal = TypeId.BAG.getSpecializedId(PrivacyModelTables.CLSSid_Principal);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_PrivacyPolicy = TypeId.BAG.getSpecializedId(PrivacyModelTables.CLSSid_PrivacyPolicy);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Provider = TypeId.BAG.getSpecializedId(PrivacyModelTables.CLSSid_Provider);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Service = TypeId.BAG.getSpecializedId(PrivacyModelTables.CLSSid_Service);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_SharedPrivacyData = TypeId.BAG.getSpecializedId(PrivacyModelTables.CLSSid_SharedPrivacyData);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_What = TypeId.BAG.getSpecializedId(PrivacyModelTables.CLSSid_What);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Where = TypeId.BAG.getSpecializedId(PrivacyModelTables.CLSSid_Where);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Withdraw = TypeId.BAG.getSpecializedId(PrivacyModelTables.CLSSid_Withdraw);
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_Access = PrivacyModelTables.ENUMid_Action.getEnumerationLiteralId("Access");
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_Biometric = PrivacyModelTables.ENUMid_DataType.getEnumerationLiteralId("Biometric");
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_ChildCustody = PrivacyModelTables.ENUMid_DocumentType.getEnumerationLiteralId("ChildCustody");
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_Collecting = PrivacyModelTables.ENUMid_Action.getEnumerationLiteralId("Collecting");
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_ControllerApproval = PrivacyModelTables.ENUMid_DocumentType.getEnumerationLiteralId("ControllerApproval");
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_CourtApproval = PrivacyModelTables.ENUMid_DocumentType.getEnumerationLiteralId("CourtApproval");
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_DataCollecting = PrivacyModelTables.ENUMid_NotificationType.getEnumerationLiteralId("DataCollecting");
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_Detection = PrivacyModelTables.ENUMid_ProcessingReasonSubtype.getEnumerationLiteralId("Detection");
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_Employment = PrivacyModelTables.ENUMid_ProcessingReasonSubtype.getEnumerationLiteralId("Employment");
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_Erasure = PrivacyModelTables.ENUMid_Action.getEnumerationLiteralId("Erasure");
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_Erasure_0 = PrivacyModelTables.ENUMid_ComplaintBasedOnDataType.getEnumerationLiteralId("Erasure");
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_Erasure_1 = PrivacyModelTables.ENUMid_NotificationType.getEnumerationLiteralId("Erasure");
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_ExecutedErasure = PrivacyModelTables.ENUMid_NotificationType.getEnumerationLiteralId("ExecutedErasure");
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_ExecutedRectification = PrivacyModelTables.ENUMid_NotificationType.getEnumerationLiteralId("ExecutedRectification");
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_ExercisingSpecificRights = PrivacyModelTables.ENUMid_ProcessingReason.getEnumerationLiteralId("ExercisingSpecificRights");
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_Genetic = PrivacyModelTables.ENUMid_DataType.getEnumerationLiteralId("Genetic");
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_Historical = PrivacyModelTables.ENUMid_ProcessingReasonSubtype.getEnumerationLiteralId("Historical");
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_Investigation = PrivacyModelTables.ENUMid_ProcessingReasonSubtype.getEnumerationLiteralId("Investigation");
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_Judical = PrivacyModelTables.ENUMid_DataType.getEnumerationLiteralId("Judical");
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_LegallyIncapable = PrivacyModelTables.ENUMid_ProcessingReasonSubtype.getEnumerationLiteralId("LegallyIncapable");
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_LegitimateInterests = PrivacyModelTables.ENUMid_ProcessingReason.getEnumerationLiteralId("LegitimateInterests");
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_Marketing = PrivacyModelTables.ENUMid_ProcessingReason.getEnumerationLiteralId("Marketing");
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_NaturalPerson = PrivacyModelTables.ENUMid_PrincipalType.getEnumerationLiteralId("NaturalPerson");
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_None = PrivacyModelTables.ENUMid_ProcessingReasonSubtype.getEnumerationLiteralId("None");
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_Other = PrivacyModelTables.ENUMid_ProcessingReasonSubtype.getEnumerationLiteralId("Other");
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_OutOfEU = PrivacyModelTables.ENUMid_ProcessingReasonSubtype.getEnumerationLiteralId("OutOfEU");
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_OutOfScope = PrivacyModelTables.ENUMid_ProcessingReason.getEnumerationLiteralId("OutOfScope");
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_Pending = PrivacyModelTables.ENUMid_ComplaintStatus.getEnumerationLiteralId("Pending");
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_PersonalActivity = PrivacyModelTables.ENUMid_ProcessingReasonSubtype.getEnumerationLiteralId("PersonalActivity");
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_PhisicallyIncapable = PrivacyModelTables.ENUMid_ProcessingReasonSubtype.getEnumerationLiteralId("PhisicallyIncapable");
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_PoliticalOpinion = PrivacyModelTables.ENUMid_DataType.getEnumerationLiteralId("PoliticalOpinion");
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_Prevention = PrivacyModelTables.ENUMid_ProcessingReasonSubtype.getEnumerationLiteralId("Prevention");
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_PreventionOfThreats = PrivacyModelTables.ENUMid_ProcessingReasonSubtype.getEnumerationLiteralId("PreventionOfThreats");
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_Profiling = PrivacyModelTables.ENUMid_ProcessingReason.getEnumerationLiteralId("Profiling");
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_Prosecution = PrivacyModelTables.ENUMid_ProcessingReasonSubtype.getEnumerationLiteralId("Prosecution");
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_ProtectTheVitalInterestsOfTheDataSubject = PrivacyModelTables.ENUMid_ProcessingReason.getEnumerationLiteralId("ProtectTheVitalInterestsOfTheDataSubject");
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_PublicHealth = PrivacyModelTables.ENUMid_ProcessingReason.getEnumerationLiteralId("PublicHealth");
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_PublicInterest = PrivacyModelTables.ENUMid_ProcessingReason.getEnumerationLiteralId("PublicInterest");
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_RacialOrEthnicOrigin = PrivacyModelTables.ENUMid_DataType.getEnumerationLiteralId("RacialOrEthnicOrigin");
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_Rectification = PrivacyModelTables.ENUMid_Action.getEnumerationLiteralId("Rectification");
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_Rectification_0 = PrivacyModelTables.ENUMid_ComplaintBasedOnDataType.getEnumerationLiteralId("Rectification");
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_Rectification_1 = PrivacyModelTables.ENUMid_NotificationType.getEnumerationLiteralId("Rectification");
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_Religic = PrivacyModelTables.ENUMid_DataType.getEnumerationLiteralId("Religic");
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_Research = PrivacyModelTables.ENUMid_ProcessingReason.getEnumerationLiteralId("Research");
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_Scientific = PrivacyModelTables.ENUMid_ProcessingReasonSubtype.getEnumerationLiteralId("Scientific");
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_SexLife = PrivacyModelTables.ENUMid_DataType.getEnumerationLiteralId("SexLife");
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_SocialProtection = PrivacyModelTables.ENUMid_ProcessingReasonSubtype.getEnumerationLiteralId("SocialProtection");
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_SocialSecurity = PrivacyModelTables.ENUMid_ProcessingReasonSubtype.getEnumerationLiteralId("SocialSecurity");
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_SpecialScopeOfActivity = PrivacyModelTables.ENUMid_ProcessingReasonSubtype.getEnumerationLiteralId("SpecialScopeOfActivity");
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_Statistical = PrivacyModelTables.ENUMid_ProcessingReasonSubtype.getEnumerationLiteralId("Statistical");
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_StatisticalPurposes = PrivacyModelTables.ENUMid_ProcessingReason.getEnumerationLiteralId("StatisticalPurposes");
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_StopProcessing = PrivacyModelTables.ENUMid_Action.getEnumerationLiteralId("StopProcessing");
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_StopProcessing_0 = PrivacyModelTables.ENUMid_ProcessingReason.getEnumerationLiteralId("StopProcessing");
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_StopProcessing_1 = PrivacyModelTables.ENUMid_NotificationType.getEnumerationLiteralId("StopProcessing");
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_Store = PrivacyModelTables.ENUMid_Action.getEnumerationLiteralId("Store");
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_Testing = PrivacyModelTables.ENUMid_ProcessingReason.getEnumerationLiteralId("Testing");
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_ThirdPartyTransfer = PrivacyModelTables.ENUMid_NotificationType.getEnumerationLiteralId("ThirdPartyTransfer");
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_Transfer = PrivacyModelTables.ENUMid_Action.getEnumerationLiteralId("Transfer");
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_TransferCertificate = PrivacyModelTables.ENUMid_DocumentType.getEnumerationLiteralId("TransferCertificate");
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_Withdraw = PrivacyModelTables.ENUMid_NotificationType.getEnumerationLiteralId("Withdraw");
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_after = PrivacyModelTables.ENUMid_TimePreposition.getEnumerationLiteralId("after");
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_at = PrivacyModelTables.ENUMid_TimePreposition.getEnumerationLiteralId("at");
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_before = PrivacyModelTables.ENUMid_TimePreposition.getEnumerationLiteralId("before");
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_from = PrivacyModelTables.ENUMid_TimePreposition.getEnumerationLiteralId("from");
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_to = PrivacyModelTables.ENUMid_TimePreposition.getEnumerationLiteralId("to");
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_until = PrivacyModelTables.ENUMid_TimePreposition.getEnumerationLiteralId("until");
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Complaint = TypeId.ORDERED_SET.getSpecializedId(PrivacyModelTables.CLSSid_Complaint);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Consent = TypeId.ORDERED_SET.getSpecializedId(PrivacyModelTables.CLSSid_Consent);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Denial = TypeId.ORDERED_SET.getSpecializedId(PrivacyModelTables.CLSSid_Denial);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Document = TypeId.ORDERED_SET.getSpecializedId(PrivacyModelTables.CLSSid_Document);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Location = TypeId.ORDERED_SET.getSpecializedId(PrivacyModelTables.CLSSid_Location);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Notification = TypeId.ORDERED_SET.getSpecializedId(PrivacyModelTables.CLSSid_Notification);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_PolicyStatement = TypeId.ORDERED_SET.getSpecializedId(PrivacyModelTables.CLSSid_PolicyStatement);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Principal = TypeId.ORDERED_SET.getSpecializedId(PrivacyModelTables.CLSSid_Principal);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_PrivacyData = TypeId.ORDERED_SET.getSpecializedId(PrivacyModelTables.CLSSid_PrivacyData);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Provider = TypeId.ORDERED_SET.getSpecializedId(PrivacyModelTables.CLSSid_Provider);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Purpose = TypeId.ORDERED_SET.getSpecializedId(PrivacyModelTables.CLSSid_Purpose);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Service = TypeId.ORDERED_SET.getSpecializedId(PrivacyModelTables.CLSSid_Service);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_SharedPrivacyData = TypeId.ORDERED_SET.getSpecializedId(PrivacyModelTables.CLSSid_SharedPrivacyData);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_ENUMid_Action = TypeId.ORDERED_SET.getSpecializedId(PrivacyModelTables.ENUMid_Action);
	public static final /*@NonInvalid*/ CollectionTypeId SEQ_CLSSid_PrivacyPolicy = TypeId.SEQUENCE.getSpecializedId(PrivacyModelTables.CLSSid_PrivacyPolicy);
	public static final /*@NonInvalid*/ CollectionTypeId SEQ_ENUMid_DataType = TypeId.SEQUENCE.getSpecializedId(PrivacyModelTables.ENUMid_DataType);
	public static final /*@NonInvalid*/ CollectionTypeId SEQ_ENUMid_ProcessingReason = TypeId.SEQUENCE.getSpecializedId(PrivacyModelTables.ENUMid_ProcessingReason);
	public static final /*@NonInvalid*/ CollectionTypeId SEQ_ENUMid_ProcessingReasonSubtype = TypeId.SEQUENCE.getSpecializedId(PrivacyModelTables.ENUMid_ProcessingReasonSubtype);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_PrivacyPolicy = TypeId.SET.getSpecializedId(PrivacyModelTables.CLSSid_PrivacyPolicy);
	public static final /*@NonInvalid*/ TupleTypeId TUPLid_ = IdManager.getTupleTypeId("Tuple", PrivacyModelTables.PARTid_, PrivacyModelTables.PARTid__0);
	public static final /*@NonInvalid*/ SequenceValue Sequence_8 = ValueUtil.createSequenceOfEach(PrivacyModelTables.SEQ_ENUMid_ProcessingReasonSubtype, PrivacyModelTables.ELITid_Employment, PrivacyModelTables.ELITid_SocialSecurity, PrivacyModelTables.ELITid_SocialProtection, PrivacyModelTables.ELITid_None, PrivacyModelTables.ELITid_Other);
	public static final /*@NonInvalid*/ SequenceValue Sequence_3 = ValueUtil.createSequenceOfEach(PrivacyModelTables.SEQ_ENUMid_ProcessingReasonSubtype, PrivacyModelTables.ELITid_None, PrivacyModelTables.ELITid_Other, PrivacyModelTables.ELITid_Scientific, PrivacyModelTables.ELITid_Historical, PrivacyModelTables.ELITid_Statistical);
	public static final /*@NonInvalid*/ SequenceValue Sequence_4 = ValueUtil.createSequenceOfEach(PrivacyModelTables.SEQ_ENUMid_ProcessingReasonSubtype, PrivacyModelTables.ELITid_None);
	public static final /*@NonInvalid*/ SequenceValue Sequence_5 = ValueUtil.createSequenceOfEach(PrivacyModelTables.SEQ_ENUMid_ProcessingReasonSubtype, PrivacyModelTables.ELITid_OutOfEU, PrivacyModelTables.ELITid_PersonalActivity, PrivacyModelTables.ELITid_SpecialScopeOfActivity, PrivacyModelTables.ELITid_None, PrivacyModelTables.ELITid_Other);
	public static final /*@NonInvalid*/ SequenceValue Sequence_12 = ValueUtil.createSequenceOfEach(PrivacyModelTables.SEQ_ENUMid_ProcessingReasonSubtype, PrivacyModelTables.ELITid_PhisicallyIncapable, PrivacyModelTables.ELITid_LegallyIncapable, PrivacyModelTables.ELITid_Other, PrivacyModelTables.ELITid_None);
	public static final /*@NonInvalid*/ SequenceValue Sequence_2 = ValueUtil.createSequenceOfEach(PrivacyModelTables.SEQ_ENUMid_ProcessingReasonSubtype, PrivacyModelTables.ELITid_PhisicallyIncapable, PrivacyModelTables.ELITid_Other, PrivacyModelTables.ELITid_None);
	public static final /*@NonInvalid*/ SequenceValue Sequence_6 = ValueUtil.createSequenceOfEach(PrivacyModelTables.SEQ_ENUMid_ProcessingReasonSubtype, PrivacyModelTables.ELITid_Prevention, PrivacyModelTables.ELITid_Investigation, PrivacyModelTables.ELITid_Detection, PrivacyModelTables.ELITid_Prosecution, PrivacyModelTables.ELITid_PreventionOfThreats, PrivacyModelTables.ELITid_None, PrivacyModelTables.ELITid_Other);
	public static final /*@NonInvalid*/ SequenceValue Sequence_0 = ValueUtil.createSequenceOfEach(PrivacyModelTables.SEQ_ENUMid_ProcessingReasonSubtype, PrivacyModelTables.ELITid_Statistical, PrivacyModelTables.ELITid_Historical, PrivacyModelTables.ELITid_Scientific);
	public static final /*@NonInvalid*/ SequenceValue dataTypes = ValueUtil.createSequenceOfEach(PrivacyModelTables.SEQ_ENUMid_DataType, PrivacyModelTables.ELITid_Biometric, PrivacyModelTables.ELITid_Genetic, PrivacyModelTables.ELITid_PoliticalOpinion, PrivacyModelTables.ELITid_RacialOrEthnicOrigin, PrivacyModelTables.ELITid_SexLife, PrivacyModelTables.ELITid_Religic, PrivacyModelTables.ELITid_Judical);
	public static final /*@NonInvalid*/ SequenceValue reasons = ValueUtil.createSequenceOfEach(PrivacyModelTables.SEQ_ENUMid_ProcessingReason, PrivacyModelTables.ELITid_PublicInterest, PrivacyModelTables.ELITid_LegitimateInterests, PrivacyModelTables.ELITid_ProtectTheVitalInterestsOfTheDataSubject, PrivacyModelTables.ELITid_PublicHealth);
	public static final /*@NonInvalid*/ SequenceValue reasons_3 = ValueUtil.createSequenceOfEach(PrivacyModelTables.SEQ_ENUMid_ProcessingReason, PrivacyModelTables.ELITid_PublicInterest, PrivacyModelTables.ELITid_LegitimateInterests, PrivacyModelTables.ELITid_ProtectTheVitalInterestsOfTheDataSubject, PrivacyModelTables.ELITid_Research, PrivacyModelTables.ELITid_PublicHealth);
	public static final /*@NonInvalid*/ SequenceValue reasons_1 = ValueUtil.createSequenceOfEach(PrivacyModelTables.SEQ_ENUMid_ProcessingReason, PrivacyModelTables.ELITid_PublicInterest, PrivacyModelTables.ELITid_LegitimateInterests, PrivacyModelTables.ELITid_ProtectTheVitalInterestsOfTheDataSubject);

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			PrivacyModelTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of PrivacyModelTables::TypeParameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The type descriptors for each type.
	 */
	public static class Types {
		static {
			Init.initStart();
			TypeParameters.init();
		}

		public static final EcoreExecutorType _AbstractComplaint = new EcoreExecutorType(PrivacyModelPackage.Literals.ABSTRACT_COMPLAINT, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _AbstractComplaintAction = new EcoreExecutorType(PrivacyModelPackage.Literals.ABSTRACT_COMPLAINT_ACTION, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _AbstractPaper = new EcoreExecutorType(PrivacyModelPackage.Literals.ABSTRACT_PAPER, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _AbstractTime = new EcoreExecutorType(PrivacyModelPackage.Literals.ABSTRACT_TIME, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorEnumeration _Action = new EcoreExecutorEnumeration(PrivacyModelPackage.Literals.ACTION, PACKAGE, 0);
		public static final EcoreExecutorType _Complaint = new EcoreExecutorType(PrivacyModelPackage.Literals.COMPLAINT, PACKAGE, 0);
		public static final EcoreExecutorType _ComplaintBasedOnAction = new EcoreExecutorType(PrivacyModelPackage.Literals.COMPLAINT_BASED_ON_ACTION, PACKAGE, 0);
		public static final EcoreExecutorType _ComplaintBasedOnData = new EcoreExecutorType(PrivacyModelPackage.Literals.COMPLAINT_BASED_ON_DATA, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _ComplaintBasedOnDataType = new EcoreExecutorEnumeration(PrivacyModelPackage.Literals.COMPLAINT_BASED_ON_DATA_TYPE, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _ComplaintStatus = new EcoreExecutorEnumeration(PrivacyModelPackage.Literals.COMPLAINT_STATUS, PACKAGE, 0);
		public static final EcoreExecutorType _ConfigurationManager = new EcoreExecutorType(PrivacyModelPackage.Literals.CONFIGURATION_MANAGER, PACKAGE, 0);
		public static final EcoreExecutorType _Consent = new EcoreExecutorType(PrivacyModelPackage.Literals.CONSENT, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _ConsentFormat = new EcoreExecutorEnumeration(PrivacyModelPackage.Literals.CONSENT_FORMAT, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _ConsentType = new EcoreExecutorEnumeration(PrivacyModelPackage.Literals.CONSENT_TYPE, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _DataType = new EcoreExecutorEnumeration(PrivacyModelPackage.Literals.DATA_TYPE, PACKAGE, 0);
		public static final EcoreExecutorType _Denial = new EcoreExecutorType(PrivacyModelPackage.Literals.DENIAL, PACKAGE, 0);
		public static final EcoreExecutorType _Document = new EcoreExecutorType(PrivacyModelPackage.Literals.DOCUMENT, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _DocumentType = new EcoreExecutorEnumeration(PrivacyModelPackage.Literals.DOCUMENT_TYPE, PACKAGE, 0);
		public static final EcoreExecutorType _How = new EcoreExecutorType(PrivacyModelPackage.Literals.HOW, PACKAGE, 0);
		public static final EcoreExecutorType _Location = new EcoreExecutorType(PrivacyModelPackage.Literals.LOCATION, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _LocationType = new EcoreExecutorEnumeration(PrivacyModelPackage.Literals.LOCATION_TYPE, PACKAGE, 0);
		public static final EcoreExecutorType _NamedElement = new EcoreExecutorType(PrivacyModelPackage.Literals.NAMED_ELEMENT, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _Notification = new EcoreExecutorType(PrivacyModelPackage.Literals.NOTIFICATION, PACKAGE, 0);
		public static final EcoreExecutorType _NotificationInfo = new EcoreExecutorType(PrivacyModelPackage.Literals.NOTIFICATION_INFO, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorEnumeration _NotificationType = new EcoreExecutorEnumeration(PrivacyModelPackage.Literals.NOTIFICATION_TYPE, PACKAGE, 0);
		public static final EcoreExecutorType _PolicyStatement = new EcoreExecutorType(PrivacyModelPackage.Literals.POLICY_STATEMENT, PACKAGE, 0);
		public static final EcoreExecutorType _Principal = new EcoreExecutorType(PrivacyModelPackage.Literals.PRINCIPAL, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _PrincipalScope = new EcoreExecutorEnumeration(PrivacyModelPackage.Literals.PRINCIPAL_SCOPE, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _PrincipalType = new EcoreExecutorEnumeration(PrivacyModelPackage.Literals.PRINCIPAL_TYPE, PACKAGE, 0);
		public static final EcoreExecutorType _PrivacyData = new EcoreExecutorType(PrivacyModelPackage.Literals.PRIVACY_DATA, PACKAGE, 0);
		public static final EcoreExecutorType _PrivacyPolicy = new EcoreExecutorType(PrivacyModelPackage.Literals.PRIVACY_POLICY, PACKAGE, 0);
		public static final EcoreExecutorType _PrivacyPolicyHelper = new EcoreExecutorType(PrivacyModelPackage.Literals.PRIVACY_POLICY_HELPER, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _ProcessingReason = new EcoreExecutorEnumeration(PrivacyModelPackage.Literals.PROCESSING_REASON, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _ProcessingReasonSubtype = new EcoreExecutorEnumeration(PrivacyModelPackage.Literals.PROCESSING_REASON_SUBTYPE, PACKAGE, 0);
		public static final EcoreExecutorType _Provider = new EcoreExecutorType(PrivacyModelPackage.Literals.PROVIDER, PACKAGE, 0);
		public static final EcoreExecutorType _Purpose = new EcoreExecutorType(PrivacyModelPackage.Literals.PURPOSE, PACKAGE, 0);
		public static final EcoreExecutorType _Service = new EcoreExecutorType(PrivacyModelPackage.Literals.SERVICE, PACKAGE, 0);
		public static final EcoreExecutorType _SharedPrivacyData = new EcoreExecutorType(PrivacyModelPackage.Literals.SHARED_PRIVACY_DATA, PACKAGE, 0);
		public static final EcoreExecutorType _TimeInterval = new EcoreExecutorType(PrivacyModelPackage.Literals.TIME_INTERVAL, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _TimePreposition = new EcoreExecutorEnumeration(PrivacyModelPackage.Literals.TIME_PREPOSITION, PACKAGE, 0);
		public static final EcoreExecutorType _TimeStatement = new EcoreExecutorType(PrivacyModelPackage.Literals.TIME_STATEMENT, PACKAGE, 0);
		public static final EcoreExecutorType _What = new EcoreExecutorType(PrivacyModelPackage.Literals.WHAT, PACKAGE, 0);
		public static final EcoreExecutorType _Where = new EcoreExecutorType(PrivacyModelPackage.Literals.WHERE, PACKAGE, 0);
		public static final EcoreExecutorType _Withdraw = new EcoreExecutorType(PrivacyModelPackage.Literals.WITHDRAW, PACKAGE, 0);

		private static final EcoreExecutorType /*@NonNull*/ [] types = {
			_AbstractComplaint,
			_AbstractComplaintAction,
			_AbstractPaper,
			_AbstractTime,
			_Action,
			_Complaint,
			_ComplaintBasedOnAction,
			_ComplaintBasedOnData,
			_ComplaintBasedOnDataType,
			_ComplaintStatus,
			_ConfigurationManager,
			_Consent,
			_ConsentFormat,
			_ConsentType,
			_DataType,
			_Denial,
			_Document,
			_DocumentType,
			_How,
			_Location,
			_LocationType,
			_NamedElement,
			_Notification,
			_NotificationInfo,
			_NotificationType,
			_PolicyStatement,
			_Principal,
			_PrincipalScope,
			_PrincipalType,
			_PrivacyData,
			_PrivacyPolicy,
			_PrivacyPolicyHelper,
			_ProcessingReason,
			_ProcessingReasonSubtype,
			_Provider,
			_Purpose,
			_Service,
			_SharedPrivacyData,
			_TimeInterval,
			_TimePreposition,
			_TimeStatement,
			_What,
			_Where,
			_Withdraw
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of PrivacyModelTables::Types and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragment descriptors for the local elements of each type and its supertypes.
	 */
	public static class Fragments {
		static {
			Init.initStart();
			Types.init();
		}

		private static final ExecutorFragment _AbstractComplaint__AbstractComplaint = new ExecutorFragment(Types._AbstractComplaint, PrivacyModelTables.Types._AbstractComplaint);
		private static final ExecutorFragment _AbstractComplaint__AbstractComplaintAction = new ExecutorFragment(Types._AbstractComplaint, PrivacyModelTables.Types._AbstractComplaintAction);
		private static final ExecutorFragment _AbstractComplaint__OclAny = new ExecutorFragment(Types._AbstractComplaint, OclstdlibTables.Types._OclAny);
		private static final ExecutorFragment _AbstractComplaint__OclElement = new ExecutorFragment(Types._AbstractComplaint, OclstdlibTables.Types._OclElement);

		private static final ExecutorFragment _AbstractComplaintAction__AbstractComplaintAction = new ExecutorFragment(Types._AbstractComplaintAction, PrivacyModelTables.Types._AbstractComplaintAction);
		private static final ExecutorFragment _AbstractComplaintAction__OclAny = new ExecutorFragment(Types._AbstractComplaintAction, OclstdlibTables.Types._OclAny);
		private static final ExecutorFragment _AbstractComplaintAction__OclElement = new ExecutorFragment(Types._AbstractComplaintAction, OclstdlibTables.Types._OclElement);

		private static final ExecutorFragment _AbstractPaper__AbstractPaper = new ExecutorFragment(Types._AbstractPaper, PrivacyModelTables.Types._AbstractPaper);
		private static final ExecutorFragment _AbstractPaper__NamedElement = new ExecutorFragment(Types._AbstractPaper, PrivacyModelTables.Types._NamedElement);
		private static final ExecutorFragment _AbstractPaper__OclAny = new ExecutorFragment(Types._AbstractPaper, OclstdlibTables.Types._OclAny);
		private static final ExecutorFragment _AbstractPaper__OclElement = new ExecutorFragment(Types._AbstractPaper, OclstdlibTables.Types._OclElement);

		private static final ExecutorFragment _AbstractTime__AbstractTime = new ExecutorFragment(Types._AbstractTime, PrivacyModelTables.Types._AbstractTime);
		private static final ExecutorFragment _AbstractTime__OclAny = new ExecutorFragment(Types._AbstractTime, OclstdlibTables.Types._OclAny);
		private static final ExecutorFragment _AbstractTime__OclElement = new ExecutorFragment(Types._AbstractTime, OclstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Action__Action = new ExecutorFragment(Types._Action, PrivacyModelTables.Types._Action);
		private static final ExecutorFragment _Action__OclAny = new ExecutorFragment(Types._Action, OclstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Action__OclElement = new ExecutorFragment(Types._Action, OclstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Action__OclEnumeration = new ExecutorFragment(Types._Action, OclstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _Action__OclType = new ExecutorFragment(Types._Action, OclstdlibTables.Types._OclType);

		private static final ExecutorFragment _Complaint__Complaint = new ExecutorFragment(Types._Complaint, PrivacyModelTables.Types._Complaint);
		private static final ExecutorFragment _Complaint__NamedElement = new ExecutorFragment(Types._Complaint, PrivacyModelTables.Types._NamedElement);
		private static final ExecutorFragment _Complaint__NotificationInfo = new ExecutorFragment(Types._Complaint, PrivacyModelTables.Types._NotificationInfo);
		private static final ExecutorFragment _Complaint__OclAny = new ExecutorFragment(Types._Complaint, OclstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Complaint__OclElement = new ExecutorFragment(Types._Complaint, OclstdlibTables.Types._OclElement);

		private static final ExecutorFragment _ComplaintBasedOnAction__AbstractComplaint = new ExecutorFragment(Types._ComplaintBasedOnAction, PrivacyModelTables.Types._AbstractComplaint);
		private static final ExecutorFragment _ComplaintBasedOnAction__AbstractComplaintAction = new ExecutorFragment(Types._ComplaintBasedOnAction, PrivacyModelTables.Types._AbstractComplaintAction);
		private static final ExecutorFragment _ComplaintBasedOnAction__ComplaintBasedOnAction = new ExecutorFragment(Types._ComplaintBasedOnAction, PrivacyModelTables.Types._ComplaintBasedOnAction);
		private static final ExecutorFragment _ComplaintBasedOnAction__OclAny = new ExecutorFragment(Types._ComplaintBasedOnAction, OclstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ComplaintBasedOnAction__OclElement = new ExecutorFragment(Types._ComplaintBasedOnAction, OclstdlibTables.Types._OclElement);

		private static final ExecutorFragment _ComplaintBasedOnData__AbstractComplaint = new ExecutorFragment(Types._ComplaintBasedOnData, PrivacyModelTables.Types._AbstractComplaint);
		private static final ExecutorFragment _ComplaintBasedOnData__AbstractComplaintAction = new ExecutorFragment(Types._ComplaintBasedOnData, PrivacyModelTables.Types._AbstractComplaintAction);
		private static final ExecutorFragment _ComplaintBasedOnData__ComplaintBasedOnData = new ExecutorFragment(Types._ComplaintBasedOnData, PrivacyModelTables.Types._ComplaintBasedOnData);
		private static final ExecutorFragment _ComplaintBasedOnData__OclAny = new ExecutorFragment(Types._ComplaintBasedOnData, OclstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ComplaintBasedOnData__OclElement = new ExecutorFragment(Types._ComplaintBasedOnData, OclstdlibTables.Types._OclElement);

		private static final ExecutorFragment _ComplaintBasedOnDataType__ComplaintBasedOnDataType = new ExecutorFragment(Types._ComplaintBasedOnDataType, PrivacyModelTables.Types._ComplaintBasedOnDataType);
		private static final ExecutorFragment _ComplaintBasedOnDataType__OclAny = new ExecutorFragment(Types._ComplaintBasedOnDataType, OclstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ComplaintBasedOnDataType__OclElement = new ExecutorFragment(Types._ComplaintBasedOnDataType, OclstdlibTables.Types._OclElement);
		private static final ExecutorFragment _ComplaintBasedOnDataType__OclEnumeration = new ExecutorFragment(Types._ComplaintBasedOnDataType, OclstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _ComplaintBasedOnDataType__OclType = new ExecutorFragment(Types._ComplaintBasedOnDataType, OclstdlibTables.Types._OclType);

		private static final ExecutorFragment _ComplaintStatus__ComplaintStatus = new ExecutorFragment(Types._ComplaintStatus, PrivacyModelTables.Types._ComplaintStatus);
		private static final ExecutorFragment _ComplaintStatus__OclAny = new ExecutorFragment(Types._ComplaintStatus, OclstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ComplaintStatus__OclElement = new ExecutorFragment(Types._ComplaintStatus, OclstdlibTables.Types._OclElement);
		private static final ExecutorFragment _ComplaintStatus__OclEnumeration = new ExecutorFragment(Types._ComplaintStatus, OclstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _ComplaintStatus__OclType = new ExecutorFragment(Types._ComplaintStatus, OclstdlibTables.Types._OclType);

		private static final ExecutorFragment _ConfigurationManager__ConfigurationManager = new ExecutorFragment(Types._ConfigurationManager, PrivacyModelTables.Types._ConfigurationManager);
		private static final ExecutorFragment _ConfigurationManager__OclAny = new ExecutorFragment(Types._ConfigurationManager, OclstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ConfigurationManager__OclElement = new ExecutorFragment(Types._ConfigurationManager, OclstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Consent__AbstractPaper = new ExecutorFragment(Types._Consent, PrivacyModelTables.Types._AbstractPaper);
		private static final ExecutorFragment _Consent__Consent = new ExecutorFragment(Types._Consent, PrivacyModelTables.Types._Consent);
		private static final ExecutorFragment _Consent__NamedElement = new ExecutorFragment(Types._Consent, PrivacyModelTables.Types._NamedElement);
		private static final ExecutorFragment _Consent__OclAny = new ExecutorFragment(Types._Consent, OclstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Consent__OclElement = new ExecutorFragment(Types._Consent, OclstdlibTables.Types._OclElement);

		private static final ExecutorFragment _ConsentFormat__ConsentFormat = new ExecutorFragment(Types._ConsentFormat, PrivacyModelTables.Types._ConsentFormat);
		private static final ExecutorFragment _ConsentFormat__OclAny = new ExecutorFragment(Types._ConsentFormat, OclstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ConsentFormat__OclElement = new ExecutorFragment(Types._ConsentFormat, OclstdlibTables.Types._OclElement);
		private static final ExecutorFragment _ConsentFormat__OclEnumeration = new ExecutorFragment(Types._ConsentFormat, OclstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _ConsentFormat__OclType = new ExecutorFragment(Types._ConsentFormat, OclstdlibTables.Types._OclType);

		private static final ExecutorFragment _ConsentType__ConsentType = new ExecutorFragment(Types._ConsentType, PrivacyModelTables.Types._ConsentType);
		private static final ExecutorFragment _ConsentType__OclAny = new ExecutorFragment(Types._ConsentType, OclstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ConsentType__OclElement = new ExecutorFragment(Types._ConsentType, OclstdlibTables.Types._OclElement);
		private static final ExecutorFragment _ConsentType__OclEnumeration = new ExecutorFragment(Types._ConsentType, OclstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _ConsentType__OclType = new ExecutorFragment(Types._ConsentType, OclstdlibTables.Types._OclType);

		private static final ExecutorFragment _DataType__DataType = new ExecutorFragment(Types._DataType, PrivacyModelTables.Types._DataType);
		private static final ExecutorFragment _DataType__OclAny = new ExecutorFragment(Types._DataType, OclstdlibTables.Types._OclAny);
		private static final ExecutorFragment _DataType__OclElement = new ExecutorFragment(Types._DataType, OclstdlibTables.Types._OclElement);
		private static final ExecutorFragment _DataType__OclEnumeration = new ExecutorFragment(Types._DataType, OclstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _DataType__OclType = new ExecutorFragment(Types._DataType, OclstdlibTables.Types._OclType);

		private static final ExecutorFragment _Denial__Denial = new ExecutorFragment(Types._Denial, PrivacyModelTables.Types._Denial);
		private static final ExecutorFragment _Denial__NamedElement = new ExecutorFragment(Types._Denial, PrivacyModelTables.Types._NamedElement);
		private static final ExecutorFragment _Denial__OclAny = new ExecutorFragment(Types._Denial, OclstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Denial__OclElement = new ExecutorFragment(Types._Denial, OclstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Document__AbstractPaper = new ExecutorFragment(Types._Document, PrivacyModelTables.Types._AbstractPaper);
		private static final ExecutorFragment _Document__Document = new ExecutorFragment(Types._Document, PrivacyModelTables.Types._Document);
		private static final ExecutorFragment _Document__NamedElement = new ExecutorFragment(Types._Document, PrivacyModelTables.Types._NamedElement);
		private static final ExecutorFragment _Document__OclAny = new ExecutorFragment(Types._Document, OclstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Document__OclElement = new ExecutorFragment(Types._Document, OclstdlibTables.Types._OclElement);

		private static final ExecutorFragment _DocumentType__DocumentType = new ExecutorFragment(Types._DocumentType, PrivacyModelTables.Types._DocumentType);
		private static final ExecutorFragment _DocumentType__OclAny = new ExecutorFragment(Types._DocumentType, OclstdlibTables.Types._OclAny);
		private static final ExecutorFragment _DocumentType__OclElement = new ExecutorFragment(Types._DocumentType, OclstdlibTables.Types._OclElement);
		private static final ExecutorFragment _DocumentType__OclEnumeration = new ExecutorFragment(Types._DocumentType, OclstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _DocumentType__OclType = new ExecutorFragment(Types._DocumentType, OclstdlibTables.Types._OclType);

		private static final ExecutorFragment _How__How = new ExecutorFragment(Types._How, PrivacyModelTables.Types._How);
		private static final ExecutorFragment _How__OclAny = new ExecutorFragment(Types._How, OclstdlibTables.Types._OclAny);
		private static final ExecutorFragment _How__OclElement = new ExecutorFragment(Types._How, OclstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Location__Location = new ExecutorFragment(Types._Location, PrivacyModelTables.Types._Location);
		private static final ExecutorFragment _Location__NamedElement = new ExecutorFragment(Types._Location, PrivacyModelTables.Types._NamedElement);
		private static final ExecutorFragment _Location__OclAny = new ExecutorFragment(Types._Location, OclstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Location__OclElement = new ExecutorFragment(Types._Location, OclstdlibTables.Types._OclElement);

		private static final ExecutorFragment _LocationType__LocationType = new ExecutorFragment(Types._LocationType, PrivacyModelTables.Types._LocationType);
		private static final ExecutorFragment _LocationType__OclAny = new ExecutorFragment(Types._LocationType, OclstdlibTables.Types._OclAny);
		private static final ExecutorFragment _LocationType__OclElement = new ExecutorFragment(Types._LocationType, OclstdlibTables.Types._OclElement);
		private static final ExecutorFragment _LocationType__OclEnumeration = new ExecutorFragment(Types._LocationType, OclstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _LocationType__OclType = new ExecutorFragment(Types._LocationType, OclstdlibTables.Types._OclType);

		private static final ExecutorFragment _NamedElement__NamedElement = new ExecutorFragment(Types._NamedElement, PrivacyModelTables.Types._NamedElement);
		private static final ExecutorFragment _NamedElement__OclAny = new ExecutorFragment(Types._NamedElement, OclstdlibTables.Types._OclAny);
		private static final ExecutorFragment _NamedElement__OclElement = new ExecutorFragment(Types._NamedElement, OclstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Notification__NamedElement = new ExecutorFragment(Types._Notification, PrivacyModelTables.Types._NamedElement);
		private static final ExecutorFragment _Notification__Notification = new ExecutorFragment(Types._Notification, PrivacyModelTables.Types._Notification);
		private static final ExecutorFragment _Notification__OclAny = new ExecutorFragment(Types._Notification, OclstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Notification__OclElement = new ExecutorFragment(Types._Notification, OclstdlibTables.Types._OclElement);

		private static final ExecutorFragment _NotificationInfo__NamedElement = new ExecutorFragment(Types._NotificationInfo, PrivacyModelTables.Types._NamedElement);
		private static final ExecutorFragment _NotificationInfo__NotificationInfo = new ExecutorFragment(Types._NotificationInfo, PrivacyModelTables.Types._NotificationInfo);
		private static final ExecutorFragment _NotificationInfo__OclAny = new ExecutorFragment(Types._NotificationInfo, OclstdlibTables.Types._OclAny);
		private static final ExecutorFragment _NotificationInfo__OclElement = new ExecutorFragment(Types._NotificationInfo, OclstdlibTables.Types._OclElement);

		private static final ExecutorFragment _NotificationType__NotificationType = new ExecutorFragment(Types._NotificationType, PrivacyModelTables.Types._NotificationType);
		private static final ExecutorFragment _NotificationType__OclAny = new ExecutorFragment(Types._NotificationType, OclstdlibTables.Types._OclAny);
		private static final ExecutorFragment _NotificationType__OclElement = new ExecutorFragment(Types._NotificationType, OclstdlibTables.Types._OclElement);
		private static final ExecutorFragment _NotificationType__OclEnumeration = new ExecutorFragment(Types._NotificationType, OclstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _NotificationType__OclType = new ExecutorFragment(Types._NotificationType, OclstdlibTables.Types._OclType);

		private static final ExecutorFragment _PolicyStatement__NamedElement = new ExecutorFragment(Types._PolicyStatement, PrivacyModelTables.Types._NamedElement);
		private static final ExecutorFragment _PolicyStatement__NotificationInfo = new ExecutorFragment(Types._PolicyStatement, PrivacyModelTables.Types._NotificationInfo);
		private static final ExecutorFragment _PolicyStatement__OclAny = new ExecutorFragment(Types._PolicyStatement, OclstdlibTables.Types._OclAny);
		private static final ExecutorFragment _PolicyStatement__OclElement = new ExecutorFragment(Types._PolicyStatement, OclstdlibTables.Types._OclElement);
		private static final ExecutorFragment _PolicyStatement__PolicyStatement = new ExecutorFragment(Types._PolicyStatement, PrivacyModelTables.Types._PolicyStatement);

		private static final ExecutorFragment _Principal__NamedElement = new ExecutorFragment(Types._Principal, PrivacyModelTables.Types._NamedElement);
		private static final ExecutorFragment _Principal__OclAny = new ExecutorFragment(Types._Principal, OclstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Principal__OclElement = new ExecutorFragment(Types._Principal, OclstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Principal__Principal = new ExecutorFragment(Types._Principal, PrivacyModelTables.Types._Principal);

		private static final ExecutorFragment _PrincipalScope__OclAny = new ExecutorFragment(Types._PrincipalScope, OclstdlibTables.Types._OclAny);
		private static final ExecutorFragment _PrincipalScope__OclElement = new ExecutorFragment(Types._PrincipalScope, OclstdlibTables.Types._OclElement);
		private static final ExecutorFragment _PrincipalScope__OclEnumeration = new ExecutorFragment(Types._PrincipalScope, OclstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _PrincipalScope__OclType = new ExecutorFragment(Types._PrincipalScope, OclstdlibTables.Types._OclType);
		private static final ExecutorFragment _PrincipalScope__PrincipalScope = new ExecutorFragment(Types._PrincipalScope, PrivacyModelTables.Types._PrincipalScope);

		private static final ExecutorFragment _PrincipalType__OclAny = new ExecutorFragment(Types._PrincipalType, OclstdlibTables.Types._OclAny);
		private static final ExecutorFragment _PrincipalType__OclElement = new ExecutorFragment(Types._PrincipalType, OclstdlibTables.Types._OclElement);
		private static final ExecutorFragment _PrincipalType__OclEnumeration = new ExecutorFragment(Types._PrincipalType, OclstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _PrincipalType__OclType = new ExecutorFragment(Types._PrincipalType, OclstdlibTables.Types._OclType);
		private static final ExecutorFragment _PrincipalType__PrincipalType = new ExecutorFragment(Types._PrincipalType, PrivacyModelTables.Types._PrincipalType);

		private static final ExecutorFragment _PrivacyData__NamedElement = new ExecutorFragment(Types._PrivacyData, PrivacyModelTables.Types._NamedElement);
		private static final ExecutorFragment _PrivacyData__OclAny = new ExecutorFragment(Types._PrivacyData, OclstdlibTables.Types._OclAny);
		private static final ExecutorFragment _PrivacyData__OclElement = new ExecutorFragment(Types._PrivacyData, OclstdlibTables.Types._OclElement);
		private static final ExecutorFragment _PrivacyData__PrivacyData = new ExecutorFragment(Types._PrivacyData, PrivacyModelTables.Types._PrivacyData);

		private static final ExecutorFragment _PrivacyPolicy__NamedElement = new ExecutorFragment(Types._PrivacyPolicy, PrivacyModelTables.Types._NamedElement);
		private static final ExecutorFragment _PrivacyPolicy__OclAny = new ExecutorFragment(Types._PrivacyPolicy, OclstdlibTables.Types._OclAny);
		private static final ExecutorFragment _PrivacyPolicy__OclElement = new ExecutorFragment(Types._PrivacyPolicy, OclstdlibTables.Types._OclElement);
		private static final ExecutorFragment _PrivacyPolicy__PrivacyPolicy = new ExecutorFragment(Types._PrivacyPolicy, PrivacyModelTables.Types._PrivacyPolicy);

		private static final ExecutorFragment _PrivacyPolicyHelper__OclAny = new ExecutorFragment(Types._PrivacyPolicyHelper, OclstdlibTables.Types._OclAny);
		private static final ExecutorFragment _PrivacyPolicyHelper__OclElement = new ExecutorFragment(Types._PrivacyPolicyHelper, OclstdlibTables.Types._OclElement);
		private static final ExecutorFragment _PrivacyPolicyHelper__PrivacyPolicyHelper = new ExecutorFragment(Types._PrivacyPolicyHelper, PrivacyModelTables.Types._PrivacyPolicyHelper);

		private static final ExecutorFragment _ProcessingReason__OclAny = new ExecutorFragment(Types._ProcessingReason, OclstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ProcessingReason__OclElement = new ExecutorFragment(Types._ProcessingReason, OclstdlibTables.Types._OclElement);
		private static final ExecutorFragment _ProcessingReason__OclEnumeration = new ExecutorFragment(Types._ProcessingReason, OclstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _ProcessingReason__OclType = new ExecutorFragment(Types._ProcessingReason, OclstdlibTables.Types._OclType);
		private static final ExecutorFragment _ProcessingReason__ProcessingReason = new ExecutorFragment(Types._ProcessingReason, PrivacyModelTables.Types._ProcessingReason);

		private static final ExecutorFragment _ProcessingReasonSubtype__OclAny = new ExecutorFragment(Types._ProcessingReasonSubtype, OclstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ProcessingReasonSubtype__OclElement = new ExecutorFragment(Types._ProcessingReasonSubtype, OclstdlibTables.Types._OclElement);
		private static final ExecutorFragment _ProcessingReasonSubtype__OclEnumeration = new ExecutorFragment(Types._ProcessingReasonSubtype, OclstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _ProcessingReasonSubtype__OclType = new ExecutorFragment(Types._ProcessingReasonSubtype, OclstdlibTables.Types._OclType);
		private static final ExecutorFragment _ProcessingReasonSubtype__ProcessingReasonSubtype = new ExecutorFragment(Types._ProcessingReasonSubtype, PrivacyModelTables.Types._ProcessingReasonSubtype);

		private static final ExecutorFragment _Provider__NamedElement = new ExecutorFragment(Types._Provider, PrivacyModelTables.Types._NamedElement);
		private static final ExecutorFragment _Provider__OclAny = new ExecutorFragment(Types._Provider, OclstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Provider__OclElement = new ExecutorFragment(Types._Provider, OclstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Provider__Provider = new ExecutorFragment(Types._Provider, PrivacyModelTables.Types._Provider);

		private static final ExecutorFragment _Purpose__OclAny = new ExecutorFragment(Types._Purpose, OclstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Purpose__OclElement = new ExecutorFragment(Types._Purpose, OclstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Purpose__Purpose = new ExecutorFragment(Types._Purpose, PrivacyModelTables.Types._Purpose);

		private static final ExecutorFragment _Service__NamedElement = new ExecutorFragment(Types._Service, PrivacyModelTables.Types._NamedElement);
		private static final ExecutorFragment _Service__OclAny = new ExecutorFragment(Types._Service, OclstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Service__OclElement = new ExecutorFragment(Types._Service, OclstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Service__Service = new ExecutorFragment(Types._Service, PrivacyModelTables.Types._Service);

		private static final ExecutorFragment _SharedPrivacyData__NamedElement = new ExecutorFragment(Types._SharedPrivacyData, PrivacyModelTables.Types._NamedElement);
		private static final ExecutorFragment _SharedPrivacyData__OclAny = new ExecutorFragment(Types._SharedPrivacyData, OclstdlibTables.Types._OclAny);
		private static final ExecutorFragment _SharedPrivacyData__OclElement = new ExecutorFragment(Types._SharedPrivacyData, OclstdlibTables.Types._OclElement);
		private static final ExecutorFragment _SharedPrivacyData__SharedPrivacyData = new ExecutorFragment(Types._SharedPrivacyData, PrivacyModelTables.Types._SharedPrivacyData);

		private static final ExecutorFragment _TimeInterval__AbstractTime = new ExecutorFragment(Types._TimeInterval, PrivacyModelTables.Types._AbstractTime);
		private static final ExecutorFragment _TimeInterval__OclAny = new ExecutorFragment(Types._TimeInterval, OclstdlibTables.Types._OclAny);
		private static final ExecutorFragment _TimeInterval__OclElement = new ExecutorFragment(Types._TimeInterval, OclstdlibTables.Types._OclElement);
		private static final ExecutorFragment _TimeInterval__TimeInterval = new ExecutorFragment(Types._TimeInterval, PrivacyModelTables.Types._TimeInterval);

		private static final ExecutorFragment _TimePreposition__OclAny = new ExecutorFragment(Types._TimePreposition, OclstdlibTables.Types._OclAny);
		private static final ExecutorFragment _TimePreposition__OclElement = new ExecutorFragment(Types._TimePreposition, OclstdlibTables.Types._OclElement);
		private static final ExecutorFragment _TimePreposition__OclEnumeration = new ExecutorFragment(Types._TimePreposition, OclstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _TimePreposition__OclType = new ExecutorFragment(Types._TimePreposition, OclstdlibTables.Types._OclType);
		private static final ExecutorFragment _TimePreposition__TimePreposition = new ExecutorFragment(Types._TimePreposition, PrivacyModelTables.Types._TimePreposition);

		private static final ExecutorFragment _TimeStatement__AbstractTime = new ExecutorFragment(Types._TimeStatement, PrivacyModelTables.Types._AbstractTime);
		private static final ExecutorFragment _TimeStatement__OclAny = new ExecutorFragment(Types._TimeStatement, OclstdlibTables.Types._OclAny);
		private static final ExecutorFragment _TimeStatement__OclElement = new ExecutorFragment(Types._TimeStatement, OclstdlibTables.Types._OclElement);
		private static final ExecutorFragment _TimeStatement__TimeStatement = new ExecutorFragment(Types._TimeStatement, PrivacyModelTables.Types._TimeStatement);

		private static final ExecutorFragment _What__OclAny = new ExecutorFragment(Types._What, OclstdlibTables.Types._OclAny);
		private static final ExecutorFragment _What__OclElement = new ExecutorFragment(Types._What, OclstdlibTables.Types._OclElement);
		private static final ExecutorFragment _What__What = new ExecutorFragment(Types._What, PrivacyModelTables.Types._What);

		private static final ExecutorFragment _Where__OclAny = new ExecutorFragment(Types._Where, OclstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Where__OclElement = new ExecutorFragment(Types._Where, OclstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Where__Where = new ExecutorFragment(Types._Where, PrivacyModelTables.Types._Where);

		private static final ExecutorFragment _Withdraw__AbstractComplaintAction = new ExecutorFragment(Types._Withdraw, PrivacyModelTables.Types._AbstractComplaintAction);
		private static final ExecutorFragment _Withdraw__OclAny = new ExecutorFragment(Types._Withdraw, OclstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Withdraw__OclElement = new ExecutorFragment(Types._Withdraw, OclstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Withdraw__Withdraw = new ExecutorFragment(Types._Withdraw, PrivacyModelTables.Types._Withdraw);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of PrivacyModelTables::Fragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The parameter lists shared by operations.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Parameters {
		static {
			Init.initStart();
			Fragments.init();
		}

		public static final ParameterTypes _AbstractTime___AbstractTime = TypeUtil.createParameterTypes(PrivacyModelTables.Types._AbstractTime, PrivacyModelTables.Types._AbstractTime);
		public static final ParameterTypes _AbstractTime___EDate = TypeUtil.createParameterTypes(PrivacyModelTables.Types._AbstractTime, EcoreTables.Types._EDate);
		public static final ParameterTypes _Action = TypeUtil.createParameterTypes(PrivacyModelTables.Types._Action);
		public static final ParameterTypes _Action___ComplaintBasedOnDataType = TypeUtil.createParameterTypes(PrivacyModelTables.Types._Action, PrivacyModelTables.Types._ComplaintBasedOnDataType);
		public static final ParameterTypes _DocumentType___ProcessingReason = TypeUtil.createParameterTypes(PrivacyModelTables.Types._DocumentType, PrivacyModelTables.Types._ProcessingReason);
		public static final ParameterTypes _How = TypeUtil.createParameterTypes(PrivacyModelTables.Types._How);
		public static final ParameterTypes _Location = TypeUtil.createParameterTypes(PrivacyModelTables.Types._Location);
		public static final ParameterTypes _Principal = TypeUtil.createParameterTypes(PrivacyModelTables.Types._Principal);
		public static final ParameterTypes _ProcessingReason___Sequence__ProcessingReasonSubtype__ = TypeUtil.createParameterTypes(PrivacyModelTables.Types._ProcessingReason, new ExecutorSpecializedType("Sequence", PrivacyModelTables.Types._ProcessingReasonSubtype));
		public static final ParameterTypes _Purpose = TypeUtil.createParameterTypes(PrivacyModelTables.Types._Purpose);
		public static final ParameterTypes _String = TypeUtil.createParameterTypes(OclstdlibTables.Types._String);
		public static final ParameterTypes _TimePreposition = TypeUtil.createParameterTypes(PrivacyModelTables.Types._TimePreposition);
		public static final ParameterTypes _TimePreposition___TimePreposition = TypeUtil.createParameterTypes(PrivacyModelTables.Types._TimePreposition, PrivacyModelTables.Types._TimePreposition);
		public static final ParameterTypes _Where = TypeUtil.createParameterTypes(PrivacyModelTables.Types._Where);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of PrivacyModelTables::Parameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The operation descriptors for each operation of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Operations {
		static {
			Init.initStart();
			Parameters.init();
		}

		public static final ExecutorOperation _Complaint__doesPolicyStatementExists = new ExecutorOperation("doesPolicyStatementExists", Parameters._Action___ComplaintBasedOnDataType, Types._Complaint,
			0, TemplateParameters.EMPTY_LIST, null);

		public static final ExecutorOperation _How__isConsentValid = new ExecutorOperation("isConsentValid", Parameters._How, Types._How,
			0, TemplateParameters.EMPTY_LIST, null);

		public static final ExecutorOperation _Location__equals = new ExecutorOperation("equals", Parameters._Location, Types._Location,
			0, TemplateParameters.EMPTY_LIST, null);

		public static final ExecutorOperation _PolicyStatement__causedByShouldBeDefinedForType = new ExecutorOperation("causedByShouldBeDefinedForType", Parameters._Action, Types._PolicyStatement,
			0, TemplateParameters.EMPTY_LIST, null);
		public static final ExecutorOperation _PolicyStatement__dateShouldBeDefinedForType = new ExecutorOperation("dateShouldBeDefinedForType", Parameters._Action, Types._PolicyStatement,
			1, TemplateParameters.EMPTY_LIST, null);
		public static final ExecutorOperation _PolicyStatement__documentIsNeededForPurpose = new ExecutorOperation("documentIsNeededForPurpose", Parameters._DocumentType___ProcessingReason, Types._PolicyStatement,
			2, TemplateParameters.EMPTY_LIST, null);

		public static final ExecutorOperation _Principal__equals = new ExecutorOperation("equals", Parameters._Principal, Types._Principal,
			0, TemplateParameters.EMPTY_LIST, null);

		public static final ExecutorOperation _PrivacyPolicyHelper__areDatesOverlap = new ExecutorOperation("areDatesOverlap", Parameters._AbstractTime___EDate, Types._PrivacyPolicyHelper,
			0, TemplateParameters.EMPTY_LIST, null);
		public static final ExecutorOperation _PrivacyPolicyHelper__areIntervalsOverlap = new ExecutorOperation("areIntervalsOverlap", Parameters._AbstractTime___AbstractTime, Types._PrivacyPolicyHelper,
			1, TemplateParameters.EMPTY_LIST, null);
		public static final ExecutorOperation _PrivacyPolicyHelper__doesIntervalStartBeforeInterval = new ExecutorOperation("doesIntervalStartBeforeInterval", Parameters._AbstractTime___AbstractTime, Types._PrivacyPolicyHelper,
			2, TemplateParameters.EMPTY_LIST, null);
		public static final ExecutorOperation _PrivacyPolicyHelper__isDataSourceValid = new ExecutorOperation("isDataSourceValid", Parameters._String, Types._PrivacyPolicyHelper,
			3, TemplateParameters.EMPTY_LIST, null);
		public static final ExecutorOperation _PrivacyPolicyHelper__isDateAfterInterval = new ExecutorOperation("isDateAfterInterval", Parameters._AbstractTime___EDate, Types._PrivacyPolicyHelper,
			4, TemplateParameters.EMPTY_LIST, null);
		public static final ExecutorOperation _PrivacyPolicyHelper__isDateBeforeInterval = new ExecutorOperation("isDateBeforeInterval", Parameters._AbstractTime___EDate, Types._PrivacyPolicyHelper,
			5, TemplateParameters.EMPTY_LIST, null);
		public static final ExecutorOperation _PrivacyPolicyHelper__isDateInInterval = new ExecutorOperation("isDateInInterval", Parameters._AbstractTime___EDate, Types._PrivacyPolicyHelper,
			6, TemplateParameters.EMPTY_LIST, null);
		public static final ExecutorOperation _PrivacyPolicyHelper__isPolicyControlValid = new ExecutorOperation("isPolicyControlValid", Parameters._String, Types._PrivacyPolicyHelper,
			7, TemplateParameters.EMPTY_LIST, null);

		public static final ExecutorOperation _Purpose__containsAllowedPurposeReasonAndSubreason = new ExecutorOperation("containsAllowedPurposeReasonAndSubreason", Parameters._ProcessingReason___Sequence__ProcessingReasonSubtype__, Types._Purpose,
			0, TemplateParameters.EMPTY_LIST, null);
		public static final ExecutorOperation _Purpose__isSubPurposeValid = new ExecutorOperation("isSubPurposeValid", Parameters._ProcessingReason___Sequence__ProcessingReasonSubtype__, Types._Purpose,
			1, TemplateParameters.EMPTY_LIST, null);
		public static final ExecutorOperation _Purpose__isValid = new ExecutorOperation("isValid", Parameters._Purpose, Types._Purpose,
			2, TemplateParameters.EMPTY_LIST, null);

		public static final ExecutorOperation _TimeInterval__isTypeDefinedWithOtherType = new ExecutorOperation("isTypeDefinedWithOtherType", Parameters._TimePreposition___TimePreposition, Types._TimeInterval,
			0, TemplateParameters.EMPTY_LIST, null);
		public static final ExecutorOperation _TimeInterval__isTypeForbidden = new ExecutorOperation("isTypeForbidden", Parameters._TimePreposition, Types._TimeInterval,
			1, TemplateParameters.EMPTY_LIST, null);
		public static final ExecutorOperation _TimeInterval__isValid = new ExecutorOperation("isValid", Parameters._TimePreposition___TimePreposition, Types._TimeInterval,
			2, TemplateParameters.EMPTY_LIST, null);

		public static final ExecutorOperation _Where__equals = new ExecutorOperation("equals", Parameters._Where, Types._Where,
			0, TemplateParameters.EMPTY_LIST, null);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of PrivacyModelTables::Operations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The property descriptors for each property of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Properties {
		static {
			Init.initStart();
			Operations.init();
		}

		public static final ExecutorProperty _AbstractComplaint__denialReason = new EcoreExecutorProperty(PrivacyModelPackage.Literals.ABSTRACT_COMPLAINT__DENIAL_REASON, Types._AbstractComplaint, 0);
		public static final ExecutorProperty _AbstractComplaint__status = new EcoreExecutorProperty(PrivacyModelPackage.Literals.ABSTRACT_COMPLAINT__STATUS, Types._AbstractComplaint, 1);

		public static final ExecutorProperty _AbstractComplaintAction__Complaint__action = new ExecutorPropertyWithImplementation("Complaint", Types._AbstractComplaintAction, 0, new EcoreLibraryOppositeProperty(PrivacyModelPackage.Literals.COMPLAINT__ACTION));

		public static final ExecutorProperty _AbstractPaper__description = new EcoreExecutorProperty(PrivacyModelPackage.Literals.ABSTRACT_PAPER__DESCRIPTION, Types._AbstractPaper, 0);
		public static final ExecutorProperty _AbstractPaper__location = new EcoreExecutorProperty(PrivacyModelPackage.Literals.ABSTRACT_PAPER__LOCATION, Types._AbstractPaper, 1);
		public static final ExecutorProperty _AbstractPaper__providedBy = new EcoreExecutorProperty(PrivacyModelPackage.Literals.ABSTRACT_PAPER__PROVIDED_BY, Types._AbstractPaper, 2);
		public static final ExecutorProperty _AbstractPaper__startDate = new EcoreExecutorProperty(PrivacyModelPackage.Literals.ABSTRACT_PAPER__START_DATE, Types._AbstractPaper, 3);
		public static final ExecutorProperty _AbstractPaper__terminationDate = new EcoreExecutorProperty(PrivacyModelPackage.Literals.ABSTRACT_PAPER__TERMINATION_DATE, Types._AbstractPaper, 4);
		public static final ExecutorProperty _AbstractPaper__terminationExplanation = new EcoreExecutorProperty(PrivacyModelPackage.Literals.ABSTRACT_PAPER__TERMINATION_EXPLANATION, Types._AbstractPaper, 5);

		public static final ExecutorProperty _AbstractTime__PolicyStatement__when = new ExecutorPropertyWithImplementation("PolicyStatement", Types._AbstractTime, 0, new EcoreLibraryOppositeProperty(PrivacyModelPackage.Literals.POLICY_STATEMENT__WHEN));

		public static final ExecutorProperty _Complaint__action = new EcoreExecutorProperty(PrivacyModelPackage.Literals.COMPLAINT__ACTION, Types._Complaint, 0);
		public static final ExecutorProperty _Complaint__reason = new EcoreExecutorProperty(PrivacyModelPackage.Literals.COMPLAINT__REASON, Types._Complaint, 1);
		public static final ExecutorProperty _Complaint__when = new EcoreExecutorProperty(PrivacyModelPackage.Literals.COMPLAINT__WHEN, Types._Complaint, 2);
		public static final ExecutorProperty _Complaint__who = new EcoreExecutorProperty(PrivacyModelPackage.Literals.COMPLAINT__WHO, Types._Complaint, 3);
		public static final ExecutorProperty _Complaint__PolicyStatement__causedBy = new ExecutorPropertyWithImplementation("PolicyStatement", Types._Complaint, 4, new EcoreLibraryOppositeProperty(PrivacyModelPackage.Literals.POLICY_STATEMENT__CAUSED_BY));
		public static final ExecutorProperty _Complaint__PrivacyPolicy__allComplaints = new ExecutorPropertyWithImplementation("PrivacyPolicy", Types._Complaint, 5, new EcoreLibraryOppositeProperty(PrivacyModelPackage.Literals.PRIVACY_POLICY__ALL_COMPLAINTS));

		public static final ExecutorProperty _ComplaintBasedOnAction__statement = new EcoreExecutorProperty(PrivacyModelPackage.Literals.COMPLAINT_BASED_ON_ACTION__STATEMENT, Types._ComplaintBasedOnAction, 0);

		public static final ExecutorProperty _ComplaintBasedOnData__subject = new EcoreExecutorProperty(PrivacyModelPackage.Literals.COMPLAINT_BASED_ON_DATA__SUBJECT, Types._ComplaintBasedOnData, 0);
		public static final ExecutorProperty _ComplaintBasedOnData__type = new EcoreExecutorProperty(PrivacyModelPackage.Literals.COMPLAINT_BASED_ON_DATA__TYPE, Types._ComplaintBasedOnData, 1);

		public static final ExecutorProperty _ConfigurationManager__dataSources = new EcoreExecutorProperty(PrivacyModelPackage.Literals.CONFIGURATION_MANAGER__DATA_SOURCES, Types._ConfigurationManager, 0);
		public static final ExecutorProperty _ConfigurationManager__protectionControlMethods = new EcoreExecutorProperty(PrivacyModelPackage.Literals.CONFIGURATION_MANAGER__PROTECTION_CONTROL_METHODS, Types._ConfigurationManager, 1);
		public static final ExecutorProperty _ConfigurationManager__PrivacyPolicy__configurationManager = new ExecutorPropertyWithImplementation("PrivacyPolicy", Types._ConfigurationManager, 2, new EcoreLibraryOppositeProperty(PrivacyModelPackage.Literals.PRIVACY_POLICY__CONFIGURATION_MANAGER));

		public static final ExecutorProperty _Consent__format = new EcoreExecutorProperty(PrivacyModelPackage.Literals.CONSENT__FORMAT, Types._Consent, 0);
		public static final ExecutorProperty _Consent__type = new EcoreExecutorProperty(PrivacyModelPackage.Literals.CONSENT__TYPE, Types._Consent, 1);
		public static final ExecutorProperty _Consent__How__consent = new ExecutorPropertyWithImplementation("How", Types._Consent, 2, new EcoreLibraryOppositeProperty(PrivacyModelPackage.Literals.HOW__CONSENT));
		public static final ExecutorProperty _Consent__PrivacyPolicy__allConsents = new ExecutorPropertyWithImplementation("PrivacyPolicy", Types._Consent, 3, new EcoreLibraryOppositeProperty(PrivacyModelPackage.Literals.PRIVACY_POLICY__ALL_CONSENTS));
		public static final ExecutorProperty _Consent__Withdraw__subject = new ExecutorPropertyWithImplementation("Withdraw", Types._Consent, 4, new EcoreLibraryOppositeProperty(PrivacyModelPackage.Literals.WITHDRAW__SUBJECT));

		public static final ExecutorProperty _Denial__approvedBy = new EcoreExecutorProperty(PrivacyModelPackage.Literals.DENIAL__APPROVED_BY, Types._Denial, 0);
		public static final ExecutorProperty _Denial__basedOnStatements = new EcoreExecutorProperty(PrivacyModelPackage.Literals.DENIAL__BASED_ON_STATEMENTS, Types._Denial, 1);
		public static final ExecutorProperty _Denial__reason = new EcoreExecutorProperty(PrivacyModelPackage.Literals.DENIAL__REASON, Types._Denial, 2);
		public static final ExecutorProperty _Denial__when = new EcoreExecutorProperty(PrivacyModelPackage.Literals.DENIAL__WHEN, Types._Denial, 3);
		public static final ExecutorProperty _Denial__AbstractComplaint__denialReason = new ExecutorPropertyWithImplementation("AbstractComplaint", Types._Denial, 4, new EcoreLibraryOppositeProperty(PrivacyModelPackage.Literals.ABSTRACT_COMPLAINT__DENIAL_REASON));
		public static final ExecutorProperty _Denial__PrivacyPolicy__allDenials = new ExecutorPropertyWithImplementation("PrivacyPolicy", Types._Denial, 5, new EcoreLibraryOppositeProperty(PrivacyModelPackage.Literals.PRIVACY_POLICY__ALL_DENIALS));

		public static final ExecutorProperty _Document__documentType = new EcoreExecutorProperty(PrivacyModelPackage.Literals.DOCUMENT__DOCUMENT_TYPE, Types._Document, 0);
		public static final ExecutorProperty _Document__How__documents = new ExecutorPropertyWithImplementation("How", Types._Document, 1, new EcoreLibraryOppositeProperty(PrivacyModelPackage.Literals.HOW__DOCUMENTS));
		public static final ExecutorProperty _Document__PrivacyPolicy__allDocuments = new ExecutorPropertyWithImplementation("PrivacyPolicy", Types._Document, 2, new EcoreLibraryOppositeProperty(PrivacyModelPackage.Literals.PRIVACY_POLICY__ALL_DOCUMENTS));

		public static final ExecutorProperty _How__consent = new EcoreExecutorProperty(PrivacyModelPackage.Literals.HOW__CONSENT, Types._How, 0);
		public static final ExecutorProperty _How__documents = new EcoreExecutorProperty(PrivacyModelPackage.Literals.HOW__DOCUMENTS, Types._How, 1);
		public static final ExecutorProperty _How__PolicyStatement__how = new ExecutorPropertyWithImplementation("PolicyStatement", Types._How, 2, new EcoreLibraryOppositeProperty(PrivacyModelPackage.Literals.POLICY_STATEMENT__HOW));

		public static final ExecutorProperty _Location__isEUMember = new EcoreExecutorProperty(PrivacyModelPackage.Literals.LOCATION__IS_EU_MEMBER, Types._Location, 0);
		public static final ExecutorProperty _Location__legalAgeLimit = new EcoreExecutorProperty(PrivacyModelPackage.Literals.LOCATION__LEGAL_AGE_LIMIT, Types._Location, 1);
		public static final ExecutorProperty _Location__subLocations = new EcoreExecutorProperty(PrivacyModelPackage.Literals.LOCATION__SUB_LOCATIONS, Types._Location, 2);
		public static final ExecutorProperty _Location__type = new EcoreExecutorProperty(PrivacyModelPackage.Literals.LOCATION__TYPE, Types._Location, 3);
		public static final ExecutorProperty _Location__Location__subLocations = new ExecutorPropertyWithImplementation("Location", Types._Location, 4, new EcoreLibraryOppositeProperty(PrivacyModelPackage.Literals.LOCATION__SUB_LOCATIONS));
		public static final ExecutorProperty _Location__Principal__inhabits = new ExecutorPropertyWithImplementation("Principal", Types._Location, 5, new EcoreLibraryOppositeProperty(PrivacyModelPackage.Literals.PRINCIPAL__INHABITS));
		public static final ExecutorProperty _Location__PrivacyPolicy__locations = new ExecutorPropertyWithImplementation("PrivacyPolicy", Types._Location, 6, new EcoreLibraryOppositeProperty(PrivacyModelPackage.Literals.PRIVACY_POLICY__LOCATIONS));
		public static final ExecutorProperty _Location__Provider__located = new ExecutorPropertyWithImplementation("Provider", Types._Location, 7, new EcoreLibraryOppositeProperty(PrivacyModelPackage.Literals.PROVIDER__LOCATED));
		public static final ExecutorProperty _Location__Where__destination = new ExecutorPropertyWithImplementation("Where", Types._Location, 8, new EcoreLibraryOppositeProperty(PrivacyModelPackage.Literals.WHERE__DESTINATION));
		public static final ExecutorProperty _Location__Where__source = new ExecutorPropertyWithImplementation("Where", Types._Location, 9, new EcoreLibraryOppositeProperty(PrivacyModelPackage.Literals.WHERE__SOURCE));

		public static final ExecutorProperty _NamedElement__name = new EcoreExecutorProperty(PrivacyModelPackage.Literals.NAMED_ELEMENT__NAME, Types._NamedElement, 0);

		public static final ExecutorProperty _Notification__causedBy = new EcoreExecutorProperty(PrivacyModelPackage.Literals.NOTIFICATION__CAUSED_BY, Types._Notification, 0);
		public static final ExecutorProperty _Notification__notifiers = new EcoreExecutorProperty(PrivacyModelPackage.Literals.NOTIFICATION__NOTIFIERS, Types._Notification, 1);
		public static final ExecutorProperty _Notification__receivers = new EcoreExecutorProperty(PrivacyModelPackage.Literals.NOTIFICATION__RECEIVERS, Types._Notification, 2);
		public static final ExecutorProperty _Notification__type = new EcoreExecutorProperty(PrivacyModelPackage.Literals.NOTIFICATION__TYPE, Types._Notification, 3);
		public static final ExecutorProperty _Notification__when = new EcoreExecutorProperty(PrivacyModelPackage.Literals.NOTIFICATION__WHEN, Types._Notification, 4);
		public static final ExecutorProperty _Notification__PrivacyPolicy__notifications = new ExecutorPropertyWithImplementation("PrivacyPolicy", Types._Notification, 5, new EcoreLibraryOppositeProperty(PrivacyModelPackage.Literals.PRIVACY_POLICY__NOTIFICATIONS));

		public static final ExecutorProperty _NotificationInfo__Notification__causedBy = new ExecutorPropertyWithImplementation("Notification", Types._NotificationInfo, 0, new EcoreLibraryOppositeProperty(PrivacyModelPackage.Literals.NOTIFICATION__CAUSED_BY));

		public static final ExecutorProperty _PolicyStatement__causedBy = new EcoreExecutorProperty(PrivacyModelPackage.Literals.POLICY_STATEMENT__CAUSED_BY, Types._PolicyStatement, 0);
		public static final ExecutorProperty _PolicyStatement__how = new EcoreExecutorProperty(PrivacyModelPackage.Literals.POLICY_STATEMENT__HOW, Types._PolicyStatement, 1);
		public static final ExecutorProperty _PolicyStatement__what = new EcoreExecutorProperty(PrivacyModelPackage.Literals.POLICY_STATEMENT__WHAT, Types._PolicyStatement, 2);
		public static final ExecutorProperty _PolicyStatement__when = new EcoreExecutorProperty(PrivacyModelPackage.Literals.POLICY_STATEMENT__WHEN, Types._PolicyStatement, 3);
		public static final ExecutorProperty _PolicyStatement__where = new EcoreExecutorProperty(PrivacyModelPackage.Literals.POLICY_STATEMENT__WHERE, Types._PolicyStatement, 4);
		public static final ExecutorProperty _PolicyStatement__who = new EcoreExecutorProperty(PrivacyModelPackage.Literals.POLICY_STATEMENT__WHO, Types._PolicyStatement, 5);
		public static final ExecutorProperty _PolicyStatement__whom = new EcoreExecutorProperty(PrivacyModelPackage.Literals.POLICY_STATEMENT__WHOM, Types._PolicyStatement, 6);
		public static final ExecutorProperty _PolicyStatement__whose = new EcoreExecutorProperty(PrivacyModelPackage.Literals.POLICY_STATEMENT__WHOSE, Types._PolicyStatement, 7);
		public static final ExecutorProperty _PolicyStatement__why = new EcoreExecutorProperty(PrivacyModelPackage.Literals.POLICY_STATEMENT__WHY, Types._PolicyStatement, 8);
		public static final ExecutorProperty _PolicyStatement__ComplaintBasedOnAction__statement = new ExecutorPropertyWithImplementation("ComplaintBasedOnAction", Types._PolicyStatement, 9, new EcoreLibraryOppositeProperty(PrivacyModelPackage.Literals.COMPLAINT_BASED_ON_ACTION__STATEMENT));
		public static final ExecutorProperty _PolicyStatement__Denial__basedOnStatements = new ExecutorPropertyWithImplementation("Denial", Types._PolicyStatement, 10, new EcoreLibraryOppositeProperty(PrivacyModelPackage.Literals.DENIAL__BASED_ON_STATEMENTS));
		public static final ExecutorProperty _PolicyStatement__PrivacyPolicy__policyStatements = new ExecutorPropertyWithImplementation("PrivacyPolicy", Types._PolicyStatement, 11, new EcoreLibraryOppositeProperty(PrivacyModelPackage.Literals.PRIVACY_POLICY__POLICY_STATEMENTS));

		public static final ExecutorProperty _Principal__age = new EcoreExecutorProperty(PrivacyModelPackage.Literals.PRINCIPAL__AGE, Types._Principal, 0);
		public static final ExecutorProperty _Principal__birthdate = new EcoreExecutorProperty(PrivacyModelPackage.Literals.PRINCIPAL__BIRTHDATE, Types._Principal, 1);
		public static final ExecutorProperty _Principal__inhabits = new EcoreExecutorProperty(PrivacyModelPackage.Literals.PRINCIPAL__INHABITS, Types._Principal, 2);
		public static final ExecutorProperty _Principal__responsiblePersons = new EcoreExecutorProperty(PrivacyModelPackage.Literals.PRINCIPAL__RESPONSIBLE_PERSONS, Types._Principal, 3);
		public static final ExecutorProperty _Principal__scope = new EcoreExecutorProperty(PrivacyModelPackage.Literals.PRINCIPAL__SCOPE, Types._Principal, 4);
		public static final ExecutorProperty _Principal__subPrincipals = new EcoreExecutorProperty(PrivacyModelPackage.Literals.PRINCIPAL__SUB_PRINCIPALS, Types._Principal, 5);
		public static final ExecutorProperty _Principal__type = new EcoreExecutorProperty(PrivacyModelPackage.Literals.PRINCIPAL__TYPE, Types._Principal, 6);
		public static final ExecutorProperty _Principal__AbstractPaper__providedBy = new ExecutorPropertyWithImplementation("AbstractPaper", Types._Principal, 7, new EcoreLibraryOppositeProperty(PrivacyModelPackage.Literals.ABSTRACT_PAPER__PROVIDED_BY));
		public static final ExecutorProperty _Principal__Complaint__who = new ExecutorPropertyWithImplementation("Complaint", Types._Principal, 8, new EcoreLibraryOppositeProperty(PrivacyModelPackage.Literals.COMPLAINT__WHO));
		public static final ExecutorProperty _Principal__Denial__approvedBy = new ExecutorPropertyWithImplementation("Denial", Types._Principal, 9, new EcoreLibraryOppositeProperty(PrivacyModelPackage.Literals.DENIAL__APPROVED_BY));
		public static final ExecutorProperty _Principal__Notification__notifiers = new ExecutorPropertyWithImplementation("Notification", Types._Principal, 10, new EcoreLibraryOppositeProperty(PrivacyModelPackage.Literals.NOTIFICATION__NOTIFIERS));
		public static final ExecutorProperty _Principal__Notification__receivers = new ExecutorPropertyWithImplementation("Notification", Types._Principal, 11, new EcoreLibraryOppositeProperty(PrivacyModelPackage.Literals.NOTIFICATION__RECEIVERS));
		public static final ExecutorProperty _Principal__PolicyStatement__who = new ExecutorPropertyWithImplementation("PolicyStatement", Types._Principal, 12, new EcoreLibraryOppositeProperty(PrivacyModelPackage.Literals.POLICY_STATEMENT__WHO));
		public static final ExecutorProperty _Principal__PolicyStatement__whom = new ExecutorPropertyWithImplementation("PolicyStatement", Types._Principal, 13, new EcoreLibraryOppositeProperty(PrivacyModelPackage.Literals.POLICY_STATEMENT__WHOM));
		public static final ExecutorProperty _Principal__PolicyStatement__whose = new ExecutorPropertyWithImplementation("PolicyStatement", Types._Principal, 14, new EcoreLibraryOppositeProperty(PrivacyModelPackage.Literals.POLICY_STATEMENT__WHOSE));
		public static final ExecutorProperty _Principal__Principal__responsiblePersons = new ExecutorPropertyWithImplementation("Principal", Types._Principal, 15, new EcoreLibraryOppositeProperty(PrivacyModelPackage.Literals.PRINCIPAL__RESPONSIBLE_PERSONS));
		public static final ExecutorProperty _Principal__Principal__subPrincipals = new ExecutorPropertyWithImplementation("Principal", Types._Principal, 16, new EcoreLibraryOppositeProperty(PrivacyModelPackage.Literals.PRINCIPAL__SUB_PRINCIPALS));
		public static final ExecutorProperty _Principal__PrivacyPolicy__allPrincipals = new ExecutorPropertyWithImplementation("PrivacyPolicy", Types._Principal, 17, new EcoreLibraryOppositeProperty(PrivacyModelPackage.Literals.PRIVACY_POLICY__ALL_PRINCIPALS));
		public static final ExecutorProperty _Principal__PrivacyPolicy__owner = new ExecutorPropertyWithImplementation("PrivacyPolicy", Types._Principal, 18, new EcoreLibraryOppositeProperty(PrivacyModelPackage.Literals.PRIVACY_POLICY__OWNER));

		public static final ExecutorProperty _PrivacyData__type = new EcoreExecutorProperty(PrivacyModelPackage.Literals.PRIVACY_DATA__TYPE, Types._PrivacyData, 0);
		public static final ExecutorProperty _PrivacyData__ComplaintBasedOnData__subject = new ExecutorPropertyWithImplementation("ComplaintBasedOnData", Types._PrivacyData, 1, new EcoreLibraryOppositeProperty(PrivacyModelPackage.Literals.COMPLAINT_BASED_ON_DATA__SUBJECT));
		public static final ExecutorProperty _PrivacyData__PrivacyPolicy__allDatas = new ExecutorPropertyWithImplementation("PrivacyPolicy", Types._PrivacyData, 2, new EcoreLibraryOppositeProperty(PrivacyModelPackage.Literals.PRIVACY_POLICY__ALL_DATAS));
		public static final ExecutorProperty _PrivacyData__SharedPrivacyData__privacydata = new ExecutorPropertyWithImplementation("SharedPrivacyData", Types._PrivacyData, 3, new EcoreLibraryOppositeProperty(PrivacyModelPackage.Literals.SHARED_PRIVACY_DATA__PRIVACYDATA));

		public static final ExecutorProperty _PrivacyPolicy__allComplaints = new EcoreExecutorProperty(PrivacyModelPackage.Literals.PRIVACY_POLICY__ALL_COMPLAINTS, Types._PrivacyPolicy, 0);
		public static final ExecutorProperty _PrivacyPolicy__allConsents = new EcoreExecutorProperty(PrivacyModelPackage.Literals.PRIVACY_POLICY__ALL_CONSENTS, Types._PrivacyPolicy, 1);
		public static final ExecutorProperty _PrivacyPolicy__allDatas = new EcoreExecutorProperty(PrivacyModelPackage.Literals.PRIVACY_POLICY__ALL_DATAS, Types._PrivacyPolicy, 2);
		public static final ExecutorProperty _PrivacyPolicy__allDenials = new EcoreExecutorProperty(PrivacyModelPackage.Literals.PRIVACY_POLICY__ALL_DENIALS, Types._PrivacyPolicy, 3);
		public static final ExecutorProperty _PrivacyPolicy__allDocuments = new EcoreExecutorProperty(PrivacyModelPackage.Literals.PRIVACY_POLICY__ALL_DOCUMENTS, Types._PrivacyPolicy, 4);
		public static final ExecutorProperty _PrivacyPolicy__allPrincipals = new EcoreExecutorProperty(PrivacyModelPackage.Literals.PRIVACY_POLICY__ALL_PRINCIPALS, Types._PrivacyPolicy, 5);
		public static final ExecutorProperty _PrivacyPolicy__allProviders = new EcoreExecutorProperty(PrivacyModelPackage.Literals.PRIVACY_POLICY__ALL_PROVIDERS, Types._PrivacyPolicy, 6);
		public static final ExecutorProperty _PrivacyPolicy__allServices = new EcoreExecutorProperty(PrivacyModelPackage.Literals.PRIVACY_POLICY__ALL_SERVICES, Types._PrivacyPolicy, 7);
		public static final ExecutorProperty _PrivacyPolicy__allSharedPrivacyData = new EcoreExecutorProperty(PrivacyModelPackage.Literals.PRIVACY_POLICY__ALL_SHARED_PRIVACY_DATA, Types._PrivacyPolicy, 8);
		public static final ExecutorProperty _PrivacyPolicy__configurationManager = new EcoreExecutorProperty(PrivacyModelPackage.Literals.PRIVACY_POLICY__CONFIGURATION_MANAGER, Types._PrivacyPolicy, 9);
		public static final ExecutorProperty _PrivacyPolicy__defaultProtectionControls = new EcoreExecutorProperty(PrivacyModelPackage.Literals.PRIVACY_POLICY__DEFAULT_PROTECTION_CONTROLS, Types._PrivacyPolicy, 10);
		public static final ExecutorProperty _PrivacyPolicy__locations = new EcoreExecutorProperty(PrivacyModelPackage.Literals.PRIVACY_POLICY__LOCATIONS, Types._PrivacyPolicy, 11);
		public static final ExecutorProperty _PrivacyPolicy__notifications = new EcoreExecutorProperty(PrivacyModelPackage.Literals.PRIVACY_POLICY__NOTIFICATIONS, Types._PrivacyPolicy, 12);
		public static final ExecutorProperty _PrivacyPolicy__owner = new EcoreExecutorProperty(PrivacyModelPackage.Literals.PRIVACY_POLICY__OWNER, Types._PrivacyPolicy, 13);
		public static final ExecutorProperty _PrivacyPolicy__policyStatements = new EcoreExecutorProperty(PrivacyModelPackage.Literals.PRIVACY_POLICY__POLICY_STATEMENTS, Types._PrivacyPolicy, 14);
		public static final ExecutorProperty _PrivacyPolicy__privacyPolicyHelper = new EcoreExecutorProperty(PrivacyModelPackage.Literals.PRIVACY_POLICY__PRIVACY_POLICY_HELPER, Types._PrivacyPolicy, 15);

		public static final ExecutorProperty _PrivacyPolicyHelper__PrivacyPolicy__privacyPolicyHelper = new ExecutorPropertyWithImplementation("PrivacyPolicy", Types._PrivacyPolicyHelper, 0, new EcoreLibraryOppositeProperty(PrivacyModelPackage.Literals.PRIVACY_POLICY__PRIVACY_POLICY_HELPER));

		public static final ExecutorProperty _Provider__located = new EcoreExecutorProperty(PrivacyModelPackage.Literals.PROVIDER__LOCATED, Types._Provider, 0);
		public static final ExecutorProperty _Provider__provide = new EcoreExecutorProperty(PrivacyModelPackage.Literals.PROVIDER__PROVIDE, Types._Provider, 1);
		public static final ExecutorProperty _Provider__PrivacyPolicy__allProviders = new ExecutorPropertyWithImplementation("PrivacyPolicy", Types._Provider, 2, new EcoreLibraryOppositeProperty(PrivacyModelPackage.Literals.PRIVACY_POLICY__ALL_PROVIDERS));
		public static final ExecutorProperty _Provider__What__providers = new ExecutorPropertyWithImplementation("What", Types._Provider, 3, new EcoreLibraryOppositeProperty(PrivacyModelPackage.Literals.WHAT__PROVIDERS));

		public static final ExecutorProperty _Purpose__details = new EcoreExecutorProperty(PrivacyModelPackage.Literals.PURPOSE__DETAILS, Types._Purpose, 0);
		public static final ExecutorProperty _Purpose__processingReason = new EcoreExecutorProperty(PrivacyModelPackage.Literals.PURPOSE__PROCESSING_REASON, Types._Purpose, 1);
		public static final ExecutorProperty _Purpose__processingReasonSubtype = new EcoreExecutorProperty(PrivacyModelPackage.Literals.PURPOSE__PROCESSING_REASON_SUBTYPE, Types._Purpose, 2);
		public static final ExecutorProperty _Purpose__subPurposes = new EcoreExecutorProperty(PrivacyModelPackage.Literals.PURPOSE__SUB_PURPOSES, Types._Purpose, 3);
		public static final ExecutorProperty _Purpose__PolicyStatement__why = new ExecutorPropertyWithImplementation("PolicyStatement", Types._Purpose, 4, new EcoreLibraryOppositeProperty(PrivacyModelPackage.Literals.POLICY_STATEMENT__WHY));
		public static final ExecutorProperty _Purpose__Purpose__subPurposes = new ExecutorPropertyWithImplementation("Purpose", Types._Purpose, 5, new EcoreLibraryOppositeProperty(PrivacyModelPackage.Literals.PURPOSE__SUB_PURPOSES));

		public static final ExecutorProperty _Service__subservices = new EcoreExecutorProperty(PrivacyModelPackage.Literals.SERVICE__SUBSERVICES, Types._Service, 0);
		public static final ExecutorProperty _Service__PrivacyPolicy__allServices = new ExecutorPropertyWithImplementation("PrivacyPolicy", Types._Service, 1, new EcoreLibraryOppositeProperty(PrivacyModelPackage.Literals.PRIVACY_POLICY__ALL_SERVICES));
		public static final ExecutorProperty _Service__Provider__provide = new ExecutorPropertyWithImplementation("Provider", Types._Service, 2, new EcoreLibraryOppositeProperty(PrivacyModelPackage.Literals.PROVIDER__PROVIDE));
		public static final ExecutorProperty _Service__Service__subservices = new ExecutorPropertyWithImplementation("Service", Types._Service, 3, new EcoreLibraryOppositeProperty(PrivacyModelPackage.Literals.SERVICE__SUBSERVICES));

		public static final ExecutorProperty _SharedPrivacyData__additionalProtectionControls = new EcoreExecutorProperty(PrivacyModelPackage.Literals.SHARED_PRIVACY_DATA__ADDITIONAL_PROTECTION_CONTROLS, Types._SharedPrivacyData, 0);
		public static final ExecutorProperty _SharedPrivacyData__colllectedFromSubject = new EcoreExecutorProperty(PrivacyModelPackage.Literals.SHARED_PRIVACY_DATA__COLLLECTED_FROM_SUBJECT, Types._SharedPrivacyData, 1);
		public static final ExecutorProperty _SharedPrivacyData__dataSource = new EcoreExecutorProperty(PrivacyModelPackage.Literals.SHARED_PRIVACY_DATA__DATA_SOURCE, Types._SharedPrivacyData, 2);
		public static final ExecutorProperty _SharedPrivacyData__privacydata = new EcoreExecutorProperty(PrivacyModelPackage.Literals.SHARED_PRIVACY_DATA__PRIVACYDATA, Types._SharedPrivacyData, 3);
		public static final ExecutorProperty _SharedPrivacyData__PrivacyPolicy__allSharedPrivacyData = new ExecutorPropertyWithImplementation("PrivacyPolicy", Types._SharedPrivacyData, 4, new EcoreLibraryOppositeProperty(PrivacyModelPackage.Literals.PRIVACY_POLICY__ALL_SHARED_PRIVACY_DATA));
		public static final ExecutorProperty _SharedPrivacyData__What__datas = new ExecutorPropertyWithImplementation("What", Types._SharedPrivacyData, 5, new EcoreLibraryOppositeProperty(PrivacyModelPackage.Literals.WHAT__DATAS));

		public static final ExecutorProperty _TimeInterval__end = new EcoreExecutorProperty(PrivacyModelPackage.Literals.TIME_INTERVAL__END, Types._TimeInterval, 0);
		public static final ExecutorProperty _TimeInterval__start = new EcoreExecutorProperty(PrivacyModelPackage.Literals.TIME_INTERVAL__START, Types._TimeInterval, 1);

		public static final ExecutorProperty _TimeStatement__dateTime = new EcoreExecutorProperty(PrivacyModelPackage.Literals.TIME_STATEMENT__DATE_TIME, Types._TimeStatement, 0);
		public static final ExecutorProperty _TimeStatement__preposition = new EcoreExecutorProperty(PrivacyModelPackage.Literals.TIME_STATEMENT__PREPOSITION, Types._TimeStatement, 1);
		public static final ExecutorProperty _TimeStatement__TimeInterval__end = new ExecutorPropertyWithImplementation("TimeInterval", Types._TimeStatement, 2, new EcoreLibraryOppositeProperty(PrivacyModelPackage.Literals.TIME_INTERVAL__END));
		public static final ExecutorProperty _TimeStatement__TimeInterval__start = new ExecutorPropertyWithImplementation("TimeInterval", Types._TimeStatement, 3, new EcoreLibraryOppositeProperty(PrivacyModelPackage.Literals.TIME_INTERVAL__START));

		public static final ExecutorProperty _What__actions = new EcoreExecutorProperty(PrivacyModelPackage.Literals.WHAT__ACTIONS, Types._What, 0);
		public static final ExecutorProperty _What__datas = new EcoreExecutorProperty(PrivacyModelPackage.Literals.WHAT__DATAS, Types._What, 1);
		public static final ExecutorProperty _What__providers = new EcoreExecutorProperty(PrivacyModelPackage.Literals.WHAT__PROVIDERS, Types._What, 2);
		public static final ExecutorProperty _What__PolicyStatement__what = new ExecutorPropertyWithImplementation("PolicyStatement", Types._What, 3, new EcoreLibraryOppositeProperty(PrivacyModelPackage.Literals.POLICY_STATEMENT__WHAT));

		public static final ExecutorProperty _Where__destination = new EcoreExecutorProperty(PrivacyModelPackage.Literals.WHERE__DESTINATION, Types._Where, 0);
		public static final ExecutorProperty _Where__source = new EcoreExecutorProperty(PrivacyModelPackage.Literals.WHERE__SOURCE, Types._Where, 1);
		public static final ExecutorProperty _Where__PolicyStatement__where = new ExecutorPropertyWithImplementation("PolicyStatement", Types._Where, 2, new EcoreLibraryOppositeProperty(PrivacyModelPackage.Literals.POLICY_STATEMENT__WHERE));

		public static final ExecutorProperty _Withdraw__subject = new EcoreExecutorProperty(PrivacyModelPackage.Literals.WITHDRAW__SUBJECT, Types._Withdraw, 0);
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of PrivacyModelTables::Properties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragments for all base types in depth order: OclAny first, OclSelf last.
	 */
	public static class TypeFragments {
		static {
			Init.initStart();
			Properties.init();
		}

		private static final ExecutorFragment /*@NonNull*/ [] _AbstractComplaint =
			{
				Fragments._AbstractComplaint__OclAny /* 0 */,
				Fragments._AbstractComplaint__OclElement /* 1 */,
				Fragments._AbstractComplaint__AbstractComplaintAction /* 2 */,
				Fragments._AbstractComplaint__AbstractComplaint /* 3 */
			};
		private static final int /*@NonNull*/ [] __AbstractComplaint = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _AbstractComplaintAction =
			{
				Fragments._AbstractComplaintAction__OclAny /* 0 */,
				Fragments._AbstractComplaintAction__OclElement /* 1 */,
				Fragments._AbstractComplaintAction__AbstractComplaintAction /* 2 */
			};
		private static final int /*@NonNull*/ [] __AbstractComplaintAction = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _AbstractPaper =
			{
				Fragments._AbstractPaper__OclAny /* 0 */,
				Fragments._AbstractPaper__OclElement /* 1 */,
				Fragments._AbstractPaper__NamedElement /* 2 */,
				Fragments._AbstractPaper__AbstractPaper /* 3 */
			};
		private static final int /*@NonNull*/ [] __AbstractPaper = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _AbstractTime =
			{
				Fragments._AbstractTime__OclAny /* 0 */,
				Fragments._AbstractTime__OclElement /* 1 */,
				Fragments._AbstractTime__AbstractTime /* 2 */
			};
		private static final int /*@NonNull*/ [] __AbstractTime = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Action =
			{
				Fragments._Action__OclAny /* 0 */,
				Fragments._Action__OclElement /* 1 */,
				Fragments._Action__OclType /* 2 */,
				Fragments._Action__OclEnumeration /* 3 */,
				Fragments._Action__Action /* 4 */
			};
		private static final int /*@NonNull*/ [] __Action = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Complaint =
			{
				Fragments._Complaint__OclAny /* 0 */,
				Fragments._Complaint__OclElement /* 1 */,
				Fragments._Complaint__NamedElement /* 2 */,
				Fragments._Complaint__NotificationInfo /* 3 */,
				Fragments._Complaint__Complaint /* 4 */
			};
		private static final int /*@NonNull*/ [] __Complaint = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ComplaintBasedOnAction =
			{
				Fragments._ComplaintBasedOnAction__OclAny /* 0 */,
				Fragments._ComplaintBasedOnAction__OclElement /* 1 */,
				Fragments._ComplaintBasedOnAction__AbstractComplaintAction /* 2 */,
				Fragments._ComplaintBasedOnAction__AbstractComplaint /* 3 */,
				Fragments._ComplaintBasedOnAction__ComplaintBasedOnAction /* 4 */
			};
		private static final int /*@NonNull*/ [] __ComplaintBasedOnAction = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ComplaintBasedOnData =
			{
				Fragments._ComplaintBasedOnData__OclAny /* 0 */,
				Fragments._ComplaintBasedOnData__OclElement /* 1 */,
				Fragments._ComplaintBasedOnData__AbstractComplaintAction /* 2 */,
				Fragments._ComplaintBasedOnData__AbstractComplaint /* 3 */,
				Fragments._ComplaintBasedOnData__ComplaintBasedOnData /* 4 */
			};
		private static final int /*@NonNull*/ [] __ComplaintBasedOnData = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ComplaintBasedOnDataType =
			{
				Fragments._ComplaintBasedOnDataType__OclAny /* 0 */,
				Fragments._ComplaintBasedOnDataType__OclElement /* 1 */,
				Fragments._ComplaintBasedOnDataType__OclType /* 2 */,
				Fragments._ComplaintBasedOnDataType__OclEnumeration /* 3 */,
				Fragments._ComplaintBasedOnDataType__ComplaintBasedOnDataType /* 4 */
			};
		private static final int /*@NonNull*/ [] __ComplaintBasedOnDataType = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ComplaintStatus =
			{
				Fragments._ComplaintStatus__OclAny /* 0 */,
				Fragments._ComplaintStatus__OclElement /* 1 */,
				Fragments._ComplaintStatus__OclType /* 2 */,
				Fragments._ComplaintStatus__OclEnumeration /* 3 */,
				Fragments._ComplaintStatus__ComplaintStatus /* 4 */
			};
		private static final int /*@NonNull*/ [] __ComplaintStatus = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ConfigurationManager =
			{
				Fragments._ConfigurationManager__OclAny /* 0 */,
				Fragments._ConfigurationManager__OclElement /* 1 */,
				Fragments._ConfigurationManager__ConfigurationManager /* 2 */
			};
		private static final int /*@NonNull*/ [] __ConfigurationManager = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Consent =
			{
				Fragments._Consent__OclAny /* 0 */,
				Fragments._Consent__OclElement /* 1 */,
				Fragments._Consent__NamedElement /* 2 */,
				Fragments._Consent__AbstractPaper /* 3 */,
				Fragments._Consent__Consent /* 4 */
			};
		private static final int /*@NonNull*/ [] __Consent = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ConsentFormat =
			{
				Fragments._ConsentFormat__OclAny /* 0 */,
				Fragments._ConsentFormat__OclElement /* 1 */,
				Fragments._ConsentFormat__OclType /* 2 */,
				Fragments._ConsentFormat__OclEnumeration /* 3 */,
				Fragments._ConsentFormat__ConsentFormat /* 4 */
			};
		private static final int /*@NonNull*/ [] __ConsentFormat = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ConsentType =
			{
				Fragments._ConsentType__OclAny /* 0 */,
				Fragments._ConsentType__OclElement /* 1 */,
				Fragments._ConsentType__OclType /* 2 */,
				Fragments._ConsentType__OclEnumeration /* 3 */,
				Fragments._ConsentType__ConsentType /* 4 */
			};
		private static final int /*@NonNull*/ [] __ConsentType = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _DataType =
			{
				Fragments._DataType__OclAny /* 0 */,
				Fragments._DataType__OclElement /* 1 */,
				Fragments._DataType__OclType /* 2 */,
				Fragments._DataType__OclEnumeration /* 3 */,
				Fragments._DataType__DataType /* 4 */
			};
		private static final int /*@NonNull*/ [] __DataType = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Denial =
			{
				Fragments._Denial__OclAny /* 0 */,
				Fragments._Denial__OclElement /* 1 */,
				Fragments._Denial__NamedElement /* 2 */,
				Fragments._Denial__Denial /* 3 */
			};
		private static final int /*@NonNull*/ [] __Denial = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Document =
			{
				Fragments._Document__OclAny /* 0 */,
				Fragments._Document__OclElement /* 1 */,
				Fragments._Document__NamedElement /* 2 */,
				Fragments._Document__AbstractPaper /* 3 */,
				Fragments._Document__Document /* 4 */
			};
		private static final int /*@NonNull*/ [] __Document = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _DocumentType =
			{
				Fragments._DocumentType__OclAny /* 0 */,
				Fragments._DocumentType__OclElement /* 1 */,
				Fragments._DocumentType__OclType /* 2 */,
				Fragments._DocumentType__OclEnumeration /* 3 */,
				Fragments._DocumentType__DocumentType /* 4 */
			};
		private static final int /*@NonNull*/ [] __DocumentType = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _How =
			{
				Fragments._How__OclAny /* 0 */,
				Fragments._How__OclElement /* 1 */,
				Fragments._How__How /* 2 */
			};
		private static final int /*@NonNull*/ [] __How = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Location =
			{
				Fragments._Location__OclAny /* 0 */,
				Fragments._Location__OclElement /* 1 */,
				Fragments._Location__NamedElement /* 2 */,
				Fragments._Location__Location /* 3 */
			};
		private static final int /*@NonNull*/ [] __Location = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _LocationType =
			{
				Fragments._LocationType__OclAny /* 0 */,
				Fragments._LocationType__OclElement /* 1 */,
				Fragments._LocationType__OclType /* 2 */,
				Fragments._LocationType__OclEnumeration /* 3 */,
				Fragments._LocationType__LocationType /* 4 */
			};
		private static final int /*@NonNull*/ [] __LocationType = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _NamedElement =
			{
				Fragments._NamedElement__OclAny /* 0 */,
				Fragments._NamedElement__OclElement /* 1 */,
				Fragments._NamedElement__NamedElement /* 2 */
			};
		private static final int /*@NonNull*/ [] __NamedElement = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Notification =
			{
				Fragments._Notification__OclAny /* 0 */,
				Fragments._Notification__OclElement /* 1 */,
				Fragments._Notification__NamedElement /* 2 */,
				Fragments._Notification__Notification /* 3 */
			};
		private static final int /*@NonNull*/ [] __Notification = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _NotificationInfo =
			{
				Fragments._NotificationInfo__OclAny /* 0 */,
				Fragments._NotificationInfo__OclElement /* 1 */,
				Fragments._NotificationInfo__NamedElement /* 2 */,
				Fragments._NotificationInfo__NotificationInfo /* 3 */
			};
		private static final int /*@NonNull*/ [] __NotificationInfo = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _NotificationType =
			{
				Fragments._NotificationType__OclAny /* 0 */,
				Fragments._NotificationType__OclElement /* 1 */,
				Fragments._NotificationType__OclType /* 2 */,
				Fragments._NotificationType__OclEnumeration /* 3 */,
				Fragments._NotificationType__NotificationType /* 4 */
			};
		private static final int /*@NonNull*/ [] __NotificationType = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _PolicyStatement =
			{
				Fragments._PolicyStatement__OclAny /* 0 */,
				Fragments._PolicyStatement__OclElement /* 1 */,
				Fragments._PolicyStatement__NamedElement /* 2 */,
				Fragments._PolicyStatement__NotificationInfo /* 3 */,
				Fragments._PolicyStatement__PolicyStatement /* 4 */
			};
		private static final int /*@NonNull*/ [] __PolicyStatement = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Principal =
			{
				Fragments._Principal__OclAny /* 0 */,
				Fragments._Principal__OclElement /* 1 */,
				Fragments._Principal__NamedElement /* 2 */,
				Fragments._Principal__Principal /* 3 */
			};
		private static final int /*@NonNull*/ [] __Principal = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _PrincipalScope =
			{
				Fragments._PrincipalScope__OclAny /* 0 */,
				Fragments._PrincipalScope__OclElement /* 1 */,
				Fragments._PrincipalScope__OclType /* 2 */,
				Fragments._PrincipalScope__OclEnumeration /* 3 */,
				Fragments._PrincipalScope__PrincipalScope /* 4 */
			};
		private static final int /*@NonNull*/ [] __PrincipalScope = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _PrincipalType =
			{
				Fragments._PrincipalType__OclAny /* 0 */,
				Fragments._PrincipalType__OclElement /* 1 */,
				Fragments._PrincipalType__OclType /* 2 */,
				Fragments._PrincipalType__OclEnumeration /* 3 */,
				Fragments._PrincipalType__PrincipalType /* 4 */
			};
		private static final int /*@NonNull*/ [] __PrincipalType = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _PrivacyData =
			{
				Fragments._PrivacyData__OclAny /* 0 */,
				Fragments._PrivacyData__OclElement /* 1 */,
				Fragments._PrivacyData__NamedElement /* 2 */,
				Fragments._PrivacyData__PrivacyData /* 3 */
			};
		private static final int /*@NonNull*/ [] __PrivacyData = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _PrivacyPolicy =
			{
				Fragments._PrivacyPolicy__OclAny /* 0 */,
				Fragments._PrivacyPolicy__OclElement /* 1 */,
				Fragments._PrivacyPolicy__NamedElement /* 2 */,
				Fragments._PrivacyPolicy__PrivacyPolicy /* 3 */
			};
		private static final int /*@NonNull*/ [] __PrivacyPolicy = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _PrivacyPolicyHelper =
			{
				Fragments._PrivacyPolicyHelper__OclAny /* 0 */,
				Fragments._PrivacyPolicyHelper__OclElement /* 1 */,
				Fragments._PrivacyPolicyHelper__PrivacyPolicyHelper /* 2 */
			};
		private static final int /*@NonNull*/ [] __PrivacyPolicyHelper = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ProcessingReason =
			{
				Fragments._ProcessingReason__OclAny /* 0 */,
				Fragments._ProcessingReason__OclElement /* 1 */,
				Fragments._ProcessingReason__OclType /* 2 */,
				Fragments._ProcessingReason__OclEnumeration /* 3 */,
				Fragments._ProcessingReason__ProcessingReason /* 4 */
			};
		private static final int /*@NonNull*/ [] __ProcessingReason = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ProcessingReasonSubtype =
			{
				Fragments._ProcessingReasonSubtype__OclAny /* 0 */,
				Fragments._ProcessingReasonSubtype__OclElement /* 1 */,
				Fragments._ProcessingReasonSubtype__OclType /* 2 */,
				Fragments._ProcessingReasonSubtype__OclEnumeration /* 3 */,
				Fragments._ProcessingReasonSubtype__ProcessingReasonSubtype /* 4 */
			};
		private static final int /*@NonNull*/ [] __ProcessingReasonSubtype = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Provider =
			{
				Fragments._Provider__OclAny /* 0 */,
				Fragments._Provider__OclElement /* 1 */,
				Fragments._Provider__NamedElement /* 2 */,
				Fragments._Provider__Provider /* 3 */
			};
		private static final int /*@NonNull*/ [] __Provider = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Purpose =
			{
				Fragments._Purpose__OclAny /* 0 */,
				Fragments._Purpose__OclElement /* 1 */,
				Fragments._Purpose__Purpose /* 2 */
			};
		private static final int /*@NonNull*/ [] __Purpose = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Service =
			{
				Fragments._Service__OclAny /* 0 */,
				Fragments._Service__OclElement /* 1 */,
				Fragments._Service__NamedElement /* 2 */,
				Fragments._Service__Service /* 3 */
			};
		private static final int /*@NonNull*/ [] __Service = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _SharedPrivacyData =
			{
				Fragments._SharedPrivacyData__OclAny /* 0 */,
				Fragments._SharedPrivacyData__OclElement /* 1 */,
				Fragments._SharedPrivacyData__NamedElement /* 2 */,
				Fragments._SharedPrivacyData__SharedPrivacyData /* 3 */
			};
		private static final int /*@NonNull*/ [] __SharedPrivacyData = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _TimeInterval =
			{
				Fragments._TimeInterval__OclAny /* 0 */,
				Fragments._TimeInterval__OclElement /* 1 */,
				Fragments._TimeInterval__AbstractTime /* 2 */,
				Fragments._TimeInterval__TimeInterval /* 3 */
			};
		private static final int /*@NonNull*/ [] __TimeInterval = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _TimePreposition =
			{
				Fragments._TimePreposition__OclAny /* 0 */,
				Fragments._TimePreposition__OclElement /* 1 */,
				Fragments._TimePreposition__OclType /* 2 */,
				Fragments._TimePreposition__OclEnumeration /* 3 */,
				Fragments._TimePreposition__TimePreposition /* 4 */
			};
		private static final int /*@NonNull*/ [] __TimePreposition = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _TimeStatement =
			{
				Fragments._TimeStatement__OclAny /* 0 */,
				Fragments._TimeStatement__OclElement /* 1 */,
				Fragments._TimeStatement__AbstractTime /* 2 */,
				Fragments._TimeStatement__TimeStatement /* 3 */
			};
		private static final int /*@NonNull*/ [] __TimeStatement = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _What =
			{
				Fragments._What__OclAny /* 0 */,
				Fragments._What__OclElement /* 1 */,
				Fragments._What__What /* 2 */
			};
		private static final int /*@NonNull*/ [] __What = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Where =
			{
				Fragments._Where__OclAny /* 0 */,
				Fragments._Where__OclElement /* 1 */,
				Fragments._Where__Where /* 2 */
			};
		private static final int /*@NonNull*/ [] __Where = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Withdraw =
			{
				Fragments._Withdraw__OclAny /* 0 */,
				Fragments._Withdraw__OclElement /* 1 */,
				Fragments._Withdraw__AbstractComplaintAction /* 2 */,
				Fragments._Withdraw__Withdraw /* 3 */
			};
		private static final int /*@NonNull*/ [] __Withdraw = { 1,1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._AbstractComplaint.initFragments(_AbstractComplaint, __AbstractComplaint);
			Types._AbstractComplaintAction.initFragments(_AbstractComplaintAction, __AbstractComplaintAction);
			Types._AbstractPaper.initFragments(_AbstractPaper, __AbstractPaper);
			Types._AbstractTime.initFragments(_AbstractTime, __AbstractTime);
			Types._Action.initFragments(_Action, __Action);
			Types._Complaint.initFragments(_Complaint, __Complaint);
			Types._ComplaintBasedOnAction.initFragments(_ComplaintBasedOnAction, __ComplaintBasedOnAction);
			Types._ComplaintBasedOnData.initFragments(_ComplaintBasedOnData, __ComplaintBasedOnData);
			Types._ComplaintBasedOnDataType.initFragments(_ComplaintBasedOnDataType, __ComplaintBasedOnDataType);
			Types._ComplaintStatus.initFragments(_ComplaintStatus, __ComplaintStatus);
			Types._ConfigurationManager.initFragments(_ConfigurationManager, __ConfigurationManager);
			Types._Consent.initFragments(_Consent, __Consent);
			Types._ConsentFormat.initFragments(_ConsentFormat, __ConsentFormat);
			Types._ConsentType.initFragments(_ConsentType, __ConsentType);
			Types._DataType.initFragments(_DataType, __DataType);
			Types._Denial.initFragments(_Denial, __Denial);
			Types._Document.initFragments(_Document, __Document);
			Types._DocumentType.initFragments(_DocumentType, __DocumentType);
			Types._How.initFragments(_How, __How);
			Types._Location.initFragments(_Location, __Location);
			Types._LocationType.initFragments(_LocationType, __LocationType);
			Types._NamedElement.initFragments(_NamedElement, __NamedElement);
			Types._Notification.initFragments(_Notification, __Notification);
			Types._NotificationInfo.initFragments(_NotificationInfo, __NotificationInfo);
			Types._NotificationType.initFragments(_NotificationType, __NotificationType);
			Types._PolicyStatement.initFragments(_PolicyStatement, __PolicyStatement);
			Types._Principal.initFragments(_Principal, __Principal);
			Types._PrincipalScope.initFragments(_PrincipalScope, __PrincipalScope);
			Types._PrincipalType.initFragments(_PrincipalType, __PrincipalType);
			Types._PrivacyData.initFragments(_PrivacyData, __PrivacyData);
			Types._PrivacyPolicy.initFragments(_PrivacyPolicy, __PrivacyPolicy);
			Types._PrivacyPolicyHelper.initFragments(_PrivacyPolicyHelper, __PrivacyPolicyHelper);
			Types._ProcessingReason.initFragments(_ProcessingReason, __ProcessingReason);
			Types._ProcessingReasonSubtype.initFragments(_ProcessingReasonSubtype, __ProcessingReasonSubtype);
			Types._Provider.initFragments(_Provider, __Provider);
			Types._Purpose.initFragments(_Purpose, __Purpose);
			Types._Service.initFragments(_Service, __Service);
			Types._SharedPrivacyData.initFragments(_SharedPrivacyData, __SharedPrivacyData);
			Types._TimeInterval.initFragments(_TimeInterval, __TimeInterval);
			Types._TimePreposition.initFragments(_TimePreposition, __TimePreposition);
			Types._TimeStatement.initFragments(_TimeStatement, __TimeStatement);
			Types._What.initFragments(_What, __What);
			Types._Where.initFragments(_Where, __Where);
			Types._Withdraw.initFragments(_Withdraw, __Withdraw);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of PrivacyModelTables::TypeFragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local operations or local operation overrides for each fragment of each type.
	 */
	public static class FragmentOperations {
		static {
			Init.initStart();
			TypeFragments.init();
		}

		private static final ExecutorOperation /*@NonNull*/ [] _AbstractComplaint__AbstractComplaint = {};
		private static final ExecutorOperation /*@NonNull*/ [] _AbstractComplaint__AbstractComplaintAction = {};
		private static final ExecutorOperation /*@NonNull*/ [] _AbstractComplaint__OclAny = {
			OclstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OclstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OclstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OclstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OclstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OclstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OclstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OclstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OclstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OclstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OclstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OclstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OclstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OclstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OclstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _AbstractComplaint__OclElement = {
			OclstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OclstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OclstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OclstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OclstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OclstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OclstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _AbstractComplaintAction__AbstractComplaintAction = {};
		private static final ExecutorOperation /*@NonNull*/ [] _AbstractComplaintAction__OclAny = {
			OclstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OclstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OclstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OclstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OclstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OclstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OclstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OclstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OclstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OclstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OclstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OclstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OclstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OclstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OclstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _AbstractComplaintAction__OclElement = {
			OclstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OclstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OclstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OclstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OclstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OclstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OclstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _AbstractPaper__AbstractPaper = {};
		private static final ExecutorOperation /*@NonNull*/ [] _AbstractPaper__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _AbstractPaper__OclAny = {
			OclstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OclstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OclstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OclstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OclstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OclstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OclstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OclstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OclstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OclstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OclstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OclstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OclstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OclstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OclstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _AbstractPaper__OclElement = {
			OclstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OclstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OclstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OclstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OclstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OclstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OclstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _AbstractTime__AbstractTime = {};
		private static final ExecutorOperation /*@NonNull*/ [] _AbstractTime__OclAny = {
			OclstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OclstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OclstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OclstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OclstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OclstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OclstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OclstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OclstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OclstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OclstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OclstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OclstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OclstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OclstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _AbstractTime__OclElement = {
			OclstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OclstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OclstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OclstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OclstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OclstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OclstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Action__Action = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Action__OclAny = {
			OclstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OclstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OclstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OclstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OclstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OclstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OclstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OclstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OclstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OclstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OclstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OclstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OclstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OclstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OclstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Action__OclElement = {
			OclstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OclstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OclstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OclstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OclstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OclstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OclstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Action__OclEnumeration = {
			OclstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Action__OclType = {
			OclstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Complaint__Complaint = {
			PrivacyModelTables.Operations._Complaint__doesPolicyStatementExists /* doesPolicyStatementExists(Action[1],ComplaintBasedOnDataType[1]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Complaint__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Complaint__NotificationInfo = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Complaint__OclAny = {
			OclstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OclstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OclstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OclstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OclstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OclstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OclstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OclstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OclstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OclstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OclstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OclstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OclstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OclstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OclstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Complaint__OclElement = {
			OclstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OclstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OclstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OclstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OclstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OclstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OclstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _ComplaintBasedOnAction__ComplaintBasedOnAction = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ComplaintBasedOnAction__AbstractComplaint = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ComplaintBasedOnAction__AbstractComplaintAction = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ComplaintBasedOnAction__OclAny = {
			OclstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OclstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OclstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OclstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OclstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OclstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OclstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OclstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OclstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OclstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OclstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OclstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OclstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OclstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OclstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ComplaintBasedOnAction__OclElement = {
			OclstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OclstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OclstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OclstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OclstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OclstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OclstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _ComplaintBasedOnData__ComplaintBasedOnData = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ComplaintBasedOnData__AbstractComplaint = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ComplaintBasedOnData__AbstractComplaintAction = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ComplaintBasedOnData__OclAny = {
			OclstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OclstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OclstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OclstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OclstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OclstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OclstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OclstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OclstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OclstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OclstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OclstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OclstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OclstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OclstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ComplaintBasedOnData__OclElement = {
			OclstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OclstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OclstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OclstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OclstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OclstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OclstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _ComplaintBasedOnDataType__ComplaintBasedOnDataType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ComplaintBasedOnDataType__OclAny = {
			OclstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OclstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OclstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OclstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OclstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OclstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OclstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OclstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OclstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OclstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OclstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OclstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OclstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OclstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OclstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ComplaintBasedOnDataType__OclElement = {
			OclstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OclstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OclstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OclstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OclstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OclstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OclstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ComplaintBasedOnDataType__OclEnumeration = {
			OclstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ComplaintBasedOnDataType__OclType = {
			OclstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _ComplaintStatus__ComplaintStatus = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ComplaintStatus__OclAny = {
			OclstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OclstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OclstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OclstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OclstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OclstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OclstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OclstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OclstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OclstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OclstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OclstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OclstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OclstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OclstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ComplaintStatus__OclElement = {
			OclstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OclstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OclstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OclstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OclstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OclstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OclstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ComplaintStatus__OclEnumeration = {
			OclstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ComplaintStatus__OclType = {
			OclstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _ConfigurationManager__ConfigurationManager = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ConfigurationManager__OclAny = {
			OclstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OclstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OclstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OclstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OclstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OclstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OclstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OclstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OclstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OclstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OclstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OclstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OclstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OclstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OclstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ConfigurationManager__OclElement = {
			OclstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OclstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OclstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OclstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OclstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OclstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OclstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Consent__Consent = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Consent__AbstractPaper = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Consent__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Consent__OclAny = {
			OclstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OclstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OclstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OclstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OclstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OclstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OclstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OclstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OclstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OclstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OclstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OclstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OclstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OclstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OclstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Consent__OclElement = {
			OclstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OclstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OclstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OclstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OclstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OclstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OclstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _ConsentFormat__ConsentFormat = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ConsentFormat__OclAny = {
			OclstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OclstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OclstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OclstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OclstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OclstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OclstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OclstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OclstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OclstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OclstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OclstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OclstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OclstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OclstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ConsentFormat__OclElement = {
			OclstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OclstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OclstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OclstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OclstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OclstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OclstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ConsentFormat__OclEnumeration = {
			OclstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ConsentFormat__OclType = {
			OclstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _ConsentType__ConsentType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ConsentType__OclAny = {
			OclstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OclstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OclstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OclstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OclstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OclstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OclstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OclstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OclstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OclstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OclstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OclstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OclstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OclstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OclstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ConsentType__OclElement = {
			OclstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OclstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OclstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OclstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OclstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OclstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OclstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ConsentType__OclEnumeration = {
			OclstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ConsentType__OclType = {
			OclstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _DataType__DataType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _DataType__OclAny = {
			OclstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OclstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OclstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OclstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OclstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OclstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OclstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OclstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OclstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OclstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OclstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OclstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OclstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OclstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OclstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _DataType__OclElement = {
			OclstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OclstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OclstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OclstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OclstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OclstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OclstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _DataType__OclEnumeration = {
			OclstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _DataType__OclType = {
			OclstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Denial__Denial = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Denial__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Denial__OclAny = {
			OclstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OclstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OclstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OclstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OclstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OclstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OclstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OclstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OclstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OclstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OclstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OclstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OclstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OclstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OclstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Denial__OclElement = {
			OclstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OclstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OclstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OclstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OclstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OclstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OclstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Document__Document = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Document__AbstractPaper = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Document__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Document__OclAny = {
			OclstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OclstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OclstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OclstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OclstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OclstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OclstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OclstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OclstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OclstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OclstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OclstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OclstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OclstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OclstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Document__OclElement = {
			OclstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OclstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OclstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OclstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OclstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OclstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OclstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _DocumentType__DocumentType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _DocumentType__OclAny = {
			OclstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OclstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OclstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OclstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OclstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OclstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OclstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OclstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OclstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OclstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OclstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OclstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OclstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OclstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OclstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _DocumentType__OclElement = {
			OclstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OclstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OclstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OclstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OclstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OclstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OclstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _DocumentType__OclEnumeration = {
			OclstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _DocumentType__OclType = {
			OclstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _How__How = {
			PrivacyModelTables.Operations._How__isConsentValid /* isConsentValid(How[?]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _How__OclAny = {
			OclstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OclstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OclstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OclstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OclstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OclstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OclstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OclstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OclstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OclstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OclstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OclstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OclstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OclstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OclstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _How__OclElement = {
			OclstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OclstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OclstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OclstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OclstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OclstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OclstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Location__Location = {
			PrivacyModelTables.Operations._Location__equals /* equals(Location[?]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Location__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Location__OclAny = {
			OclstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OclstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OclstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OclstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OclstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OclstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OclstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OclstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OclstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OclstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OclstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OclstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OclstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OclstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OclstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Location__OclElement = {
			OclstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OclstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OclstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OclstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OclstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OclstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OclstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _LocationType__LocationType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _LocationType__OclAny = {
			OclstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OclstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OclstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OclstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OclstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OclstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OclstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OclstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OclstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OclstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OclstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OclstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OclstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OclstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OclstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _LocationType__OclElement = {
			OclstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OclstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OclstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OclstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OclstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OclstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OclstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _LocationType__OclEnumeration = {
			OclstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _LocationType__OclType = {
			OclstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _NamedElement__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _NamedElement__OclAny = {
			OclstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OclstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OclstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OclstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OclstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OclstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OclstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OclstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OclstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OclstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OclstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OclstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OclstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OclstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OclstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _NamedElement__OclElement = {
			OclstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OclstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OclstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OclstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OclstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OclstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OclstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Notification__Notification = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Notification__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Notification__OclAny = {
			OclstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OclstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OclstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OclstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OclstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OclstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OclstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OclstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OclstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OclstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OclstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OclstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OclstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OclstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OclstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Notification__OclElement = {
			OclstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OclstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OclstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OclstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OclstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OclstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OclstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _NotificationInfo__NotificationInfo = {};
		private static final ExecutorOperation /*@NonNull*/ [] _NotificationInfo__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _NotificationInfo__OclAny = {
			OclstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OclstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OclstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OclstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OclstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OclstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OclstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OclstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OclstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OclstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OclstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OclstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OclstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OclstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OclstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _NotificationInfo__OclElement = {
			OclstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OclstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OclstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OclstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OclstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OclstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OclstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _NotificationType__NotificationType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _NotificationType__OclAny = {
			OclstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OclstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OclstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OclstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OclstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OclstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OclstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OclstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OclstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OclstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OclstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OclstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OclstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OclstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OclstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _NotificationType__OclElement = {
			OclstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OclstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OclstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OclstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OclstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OclstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OclstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _NotificationType__OclEnumeration = {
			OclstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _NotificationType__OclType = {
			OclstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _PolicyStatement__PolicyStatement = {
			PrivacyModelTables.Operations._PolicyStatement__causedByShouldBeDefinedForType /* causedByShouldBeDefinedForType(Action[1]) */,
			PrivacyModelTables.Operations._PolicyStatement__dateShouldBeDefinedForType /* dateShouldBeDefinedForType(Action[1]) */,
			PrivacyModelTables.Operations._PolicyStatement__documentIsNeededForPurpose /* documentIsNeededForPurpose(DocumentType[1],ProcessingReason[1]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _PolicyStatement__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _PolicyStatement__NotificationInfo = {};
		private static final ExecutorOperation /*@NonNull*/ [] _PolicyStatement__OclAny = {
			OclstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OclstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OclstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OclstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OclstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OclstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OclstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OclstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OclstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OclstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OclstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OclstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OclstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OclstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OclstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _PolicyStatement__OclElement = {
			OclstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OclstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OclstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OclstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OclstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OclstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OclstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Principal__Principal = {
			PrivacyModelTables.Operations._Principal__equals /* equals(Principal[?]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Principal__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Principal__OclAny = {
			OclstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OclstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OclstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OclstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OclstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OclstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OclstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OclstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OclstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OclstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OclstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OclstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OclstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OclstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OclstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Principal__OclElement = {
			OclstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OclstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OclstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OclstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OclstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OclstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OclstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _PrincipalScope__PrincipalScope = {};
		private static final ExecutorOperation /*@NonNull*/ [] _PrincipalScope__OclAny = {
			OclstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OclstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OclstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OclstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OclstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OclstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OclstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OclstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OclstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OclstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OclstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OclstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OclstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OclstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OclstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _PrincipalScope__OclElement = {
			OclstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OclstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OclstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OclstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OclstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OclstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OclstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _PrincipalScope__OclEnumeration = {
			OclstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _PrincipalScope__OclType = {
			OclstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _PrincipalType__PrincipalType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _PrincipalType__OclAny = {
			OclstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OclstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OclstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OclstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OclstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OclstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OclstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OclstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OclstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OclstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OclstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OclstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OclstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OclstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OclstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _PrincipalType__OclElement = {
			OclstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OclstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OclstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OclstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OclstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OclstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OclstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _PrincipalType__OclEnumeration = {
			OclstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _PrincipalType__OclType = {
			OclstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _PrivacyData__PrivacyData = {};
		private static final ExecutorOperation /*@NonNull*/ [] _PrivacyData__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _PrivacyData__OclAny = {
			OclstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OclstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OclstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OclstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OclstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OclstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OclstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OclstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OclstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OclstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OclstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OclstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OclstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OclstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OclstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _PrivacyData__OclElement = {
			OclstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OclstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OclstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OclstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OclstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OclstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OclstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _PrivacyPolicy__PrivacyPolicy = {};
		private static final ExecutorOperation /*@NonNull*/ [] _PrivacyPolicy__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _PrivacyPolicy__OclAny = {
			OclstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OclstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OclstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OclstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OclstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OclstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OclstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OclstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OclstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OclstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OclstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OclstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OclstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OclstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OclstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _PrivacyPolicy__OclElement = {
			OclstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OclstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OclstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OclstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OclstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OclstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OclstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _PrivacyPolicyHelper__PrivacyPolicyHelper = {
			PrivacyModelTables.Operations._PrivacyPolicyHelper__areDatesOverlap /* areDatesOverlap(AbstractTime[1],EDate[1]) */,
			PrivacyModelTables.Operations._PrivacyPolicyHelper__areIntervalsOverlap /* areIntervalsOverlap(AbstractTime[1],AbstractTime[1]) */,
			PrivacyModelTables.Operations._PrivacyPolicyHelper__doesIntervalStartBeforeInterval /* doesIntervalStartBeforeInterval(AbstractTime[1],AbstractTime[1]) */,
			PrivacyModelTables.Operations._PrivacyPolicyHelper__isDataSourceValid /* isDataSourceValid(String[1]) */,
			PrivacyModelTables.Operations._PrivacyPolicyHelper__isDateAfterInterval /* isDateAfterInterval(AbstractTime[1],EDate[1]) */,
			PrivacyModelTables.Operations._PrivacyPolicyHelper__isDateBeforeInterval /* isDateBeforeInterval(AbstractTime[1],EDate[1]) */,
			PrivacyModelTables.Operations._PrivacyPolicyHelper__isDateInInterval /* isDateInInterval(AbstractTime[1],EDate[1]) */,
			PrivacyModelTables.Operations._PrivacyPolicyHelper__isPolicyControlValid /* isPolicyControlValid(String[1]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _PrivacyPolicyHelper__OclAny = {
			OclstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OclstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OclstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OclstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OclstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OclstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OclstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OclstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OclstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OclstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OclstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OclstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OclstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OclstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OclstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _PrivacyPolicyHelper__OclElement = {
			OclstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OclstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OclstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OclstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OclstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OclstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OclstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _ProcessingReason__ProcessingReason = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ProcessingReason__OclAny = {
			OclstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OclstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OclstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OclstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OclstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OclstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OclstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OclstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OclstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OclstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OclstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OclstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OclstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OclstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OclstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ProcessingReason__OclElement = {
			OclstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OclstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OclstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OclstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OclstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OclstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OclstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ProcessingReason__OclEnumeration = {
			OclstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ProcessingReason__OclType = {
			OclstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _ProcessingReasonSubtype__ProcessingReasonSubtype = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ProcessingReasonSubtype__OclAny = {
			OclstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OclstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OclstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OclstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OclstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OclstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OclstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OclstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OclstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OclstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OclstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OclstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OclstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OclstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OclstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ProcessingReasonSubtype__OclElement = {
			OclstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OclstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OclstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OclstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OclstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OclstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OclstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ProcessingReasonSubtype__OclEnumeration = {
			OclstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ProcessingReasonSubtype__OclType = {
			OclstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Provider__Provider = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Provider__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Provider__OclAny = {
			OclstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OclstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OclstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OclstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OclstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OclstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OclstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OclstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OclstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OclstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OclstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OclstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OclstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OclstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OclstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Provider__OclElement = {
			OclstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OclstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OclstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OclstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OclstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OclstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OclstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Purpose__Purpose = {
			PrivacyModelTables.Operations._Purpose__containsAllowedPurposeReasonAndSubreason /* containsAllowedPurposeReasonAndSubreason(ProcessingReason[1],Sequence(privacyModel::ProcessingReasonSubtype)) */,
			PrivacyModelTables.Operations._Purpose__isSubPurposeValid /* isSubPurposeValid(ProcessingReason[?],Sequence(privacyModel::ProcessingReasonSubtype)) */,
			PrivacyModelTables.Operations._Purpose__isValid /* isValid(Purpose[?]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Purpose__OclAny = {
			OclstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OclstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OclstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OclstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OclstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OclstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OclstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OclstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OclstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OclstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OclstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OclstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OclstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OclstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OclstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Purpose__OclElement = {
			OclstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OclstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OclstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OclstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OclstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OclstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OclstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Service__Service = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Service__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Service__OclAny = {
			OclstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OclstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OclstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OclstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OclstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OclstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OclstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OclstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OclstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OclstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OclstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OclstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OclstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OclstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OclstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Service__OclElement = {
			OclstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OclstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OclstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OclstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OclstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OclstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OclstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _SharedPrivacyData__SharedPrivacyData = {};
		private static final ExecutorOperation /*@NonNull*/ [] _SharedPrivacyData__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _SharedPrivacyData__OclAny = {
			OclstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OclstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OclstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OclstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OclstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OclstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OclstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OclstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OclstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OclstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OclstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OclstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OclstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OclstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OclstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _SharedPrivacyData__OclElement = {
			OclstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OclstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OclstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OclstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OclstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OclstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OclstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _TimeInterval__TimeInterval = {
			PrivacyModelTables.Operations._TimeInterval__isTypeDefinedWithOtherType /* isTypeDefinedWithOtherType(TimePreposition[1],TimePreposition[1]) */,
			PrivacyModelTables.Operations._TimeInterval__isTypeForbidden /* isTypeForbidden(TimePreposition[1]) */,
			PrivacyModelTables.Operations._TimeInterval__isValid /* isValid(TimePreposition[1],TimePreposition[1]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _TimeInterval__AbstractTime = {};
		private static final ExecutorOperation /*@NonNull*/ [] _TimeInterval__OclAny = {
			OclstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OclstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OclstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OclstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OclstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OclstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OclstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OclstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OclstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OclstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OclstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OclstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OclstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OclstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OclstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _TimeInterval__OclElement = {
			OclstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OclstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OclstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OclstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OclstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OclstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OclstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _TimePreposition__TimePreposition = {};
		private static final ExecutorOperation /*@NonNull*/ [] _TimePreposition__OclAny = {
			OclstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OclstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OclstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OclstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OclstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OclstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OclstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OclstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OclstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OclstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OclstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OclstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OclstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OclstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OclstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _TimePreposition__OclElement = {
			OclstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OclstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OclstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OclstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OclstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OclstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OclstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _TimePreposition__OclEnumeration = {
			OclstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _TimePreposition__OclType = {
			OclstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _TimeStatement__TimeStatement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _TimeStatement__AbstractTime = {};
		private static final ExecutorOperation /*@NonNull*/ [] _TimeStatement__OclAny = {
			OclstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OclstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OclstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OclstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OclstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OclstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OclstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OclstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OclstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OclstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OclstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OclstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OclstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OclstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OclstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _TimeStatement__OclElement = {
			OclstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OclstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OclstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OclstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OclstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OclstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OclstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _What__What = {};
		private static final ExecutorOperation /*@NonNull*/ [] _What__OclAny = {
			OclstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OclstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OclstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OclstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OclstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OclstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OclstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OclstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OclstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OclstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OclstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OclstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OclstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OclstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OclstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _What__OclElement = {
			OclstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OclstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OclstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OclstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OclstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OclstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OclstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Where__Where = {
			PrivacyModelTables.Operations._Where__equals /* equals(Where[1]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Where__OclAny = {
			OclstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OclstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OclstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OclstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OclstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OclstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OclstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OclstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OclstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OclstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OclstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OclstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OclstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OclstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OclstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Where__OclElement = {
			OclstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OclstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OclstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OclstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OclstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OclstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OclstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Withdraw__Withdraw = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Withdraw__AbstractComplaintAction = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Withdraw__OclAny = {
			OclstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OclstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OclstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OclstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OclstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OclstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OclstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OclstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OclstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OclstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OclstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OclstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OclstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OclstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OclstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Withdraw__OclElement = {
			OclstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OclstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OclstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OclstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OclstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OclstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OclstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._AbstractComplaint__AbstractComplaint.initOperations(_AbstractComplaint__AbstractComplaint);
			Fragments._AbstractComplaint__AbstractComplaintAction.initOperations(_AbstractComplaint__AbstractComplaintAction);
			Fragments._AbstractComplaint__OclAny.initOperations(_AbstractComplaint__OclAny);
			Fragments._AbstractComplaint__OclElement.initOperations(_AbstractComplaint__OclElement);

			Fragments._AbstractComplaintAction__AbstractComplaintAction.initOperations(_AbstractComplaintAction__AbstractComplaintAction);
			Fragments._AbstractComplaintAction__OclAny.initOperations(_AbstractComplaintAction__OclAny);
			Fragments._AbstractComplaintAction__OclElement.initOperations(_AbstractComplaintAction__OclElement);

			Fragments._AbstractPaper__AbstractPaper.initOperations(_AbstractPaper__AbstractPaper);
			Fragments._AbstractPaper__NamedElement.initOperations(_AbstractPaper__NamedElement);
			Fragments._AbstractPaper__OclAny.initOperations(_AbstractPaper__OclAny);
			Fragments._AbstractPaper__OclElement.initOperations(_AbstractPaper__OclElement);

			Fragments._AbstractTime__AbstractTime.initOperations(_AbstractTime__AbstractTime);
			Fragments._AbstractTime__OclAny.initOperations(_AbstractTime__OclAny);
			Fragments._AbstractTime__OclElement.initOperations(_AbstractTime__OclElement);

			Fragments._Action__Action.initOperations(_Action__Action);
			Fragments._Action__OclAny.initOperations(_Action__OclAny);
			Fragments._Action__OclElement.initOperations(_Action__OclElement);
			Fragments._Action__OclEnumeration.initOperations(_Action__OclEnumeration);
			Fragments._Action__OclType.initOperations(_Action__OclType);

			Fragments._Complaint__Complaint.initOperations(_Complaint__Complaint);
			Fragments._Complaint__NamedElement.initOperations(_Complaint__NamedElement);
			Fragments._Complaint__NotificationInfo.initOperations(_Complaint__NotificationInfo);
			Fragments._Complaint__OclAny.initOperations(_Complaint__OclAny);
			Fragments._Complaint__OclElement.initOperations(_Complaint__OclElement);

			Fragments._ComplaintBasedOnAction__AbstractComplaint.initOperations(_ComplaintBasedOnAction__AbstractComplaint);
			Fragments._ComplaintBasedOnAction__AbstractComplaintAction.initOperations(_ComplaintBasedOnAction__AbstractComplaintAction);
			Fragments._ComplaintBasedOnAction__ComplaintBasedOnAction.initOperations(_ComplaintBasedOnAction__ComplaintBasedOnAction);
			Fragments._ComplaintBasedOnAction__OclAny.initOperations(_ComplaintBasedOnAction__OclAny);
			Fragments._ComplaintBasedOnAction__OclElement.initOperations(_ComplaintBasedOnAction__OclElement);

			Fragments._ComplaintBasedOnData__AbstractComplaint.initOperations(_ComplaintBasedOnData__AbstractComplaint);
			Fragments._ComplaintBasedOnData__AbstractComplaintAction.initOperations(_ComplaintBasedOnData__AbstractComplaintAction);
			Fragments._ComplaintBasedOnData__ComplaintBasedOnData.initOperations(_ComplaintBasedOnData__ComplaintBasedOnData);
			Fragments._ComplaintBasedOnData__OclAny.initOperations(_ComplaintBasedOnData__OclAny);
			Fragments._ComplaintBasedOnData__OclElement.initOperations(_ComplaintBasedOnData__OclElement);

			Fragments._ComplaintBasedOnDataType__ComplaintBasedOnDataType.initOperations(_ComplaintBasedOnDataType__ComplaintBasedOnDataType);
			Fragments._ComplaintBasedOnDataType__OclAny.initOperations(_ComplaintBasedOnDataType__OclAny);
			Fragments._ComplaintBasedOnDataType__OclElement.initOperations(_ComplaintBasedOnDataType__OclElement);
			Fragments._ComplaintBasedOnDataType__OclEnumeration.initOperations(_ComplaintBasedOnDataType__OclEnumeration);
			Fragments._ComplaintBasedOnDataType__OclType.initOperations(_ComplaintBasedOnDataType__OclType);

			Fragments._ComplaintStatus__ComplaintStatus.initOperations(_ComplaintStatus__ComplaintStatus);
			Fragments._ComplaintStatus__OclAny.initOperations(_ComplaintStatus__OclAny);
			Fragments._ComplaintStatus__OclElement.initOperations(_ComplaintStatus__OclElement);
			Fragments._ComplaintStatus__OclEnumeration.initOperations(_ComplaintStatus__OclEnumeration);
			Fragments._ComplaintStatus__OclType.initOperations(_ComplaintStatus__OclType);

			Fragments._ConfigurationManager__ConfigurationManager.initOperations(_ConfigurationManager__ConfigurationManager);
			Fragments._ConfigurationManager__OclAny.initOperations(_ConfigurationManager__OclAny);
			Fragments._ConfigurationManager__OclElement.initOperations(_ConfigurationManager__OclElement);

			Fragments._Consent__AbstractPaper.initOperations(_Consent__AbstractPaper);
			Fragments._Consent__Consent.initOperations(_Consent__Consent);
			Fragments._Consent__NamedElement.initOperations(_Consent__NamedElement);
			Fragments._Consent__OclAny.initOperations(_Consent__OclAny);
			Fragments._Consent__OclElement.initOperations(_Consent__OclElement);

			Fragments._ConsentFormat__ConsentFormat.initOperations(_ConsentFormat__ConsentFormat);
			Fragments._ConsentFormat__OclAny.initOperations(_ConsentFormat__OclAny);
			Fragments._ConsentFormat__OclElement.initOperations(_ConsentFormat__OclElement);
			Fragments._ConsentFormat__OclEnumeration.initOperations(_ConsentFormat__OclEnumeration);
			Fragments._ConsentFormat__OclType.initOperations(_ConsentFormat__OclType);

			Fragments._ConsentType__ConsentType.initOperations(_ConsentType__ConsentType);
			Fragments._ConsentType__OclAny.initOperations(_ConsentType__OclAny);
			Fragments._ConsentType__OclElement.initOperations(_ConsentType__OclElement);
			Fragments._ConsentType__OclEnumeration.initOperations(_ConsentType__OclEnumeration);
			Fragments._ConsentType__OclType.initOperations(_ConsentType__OclType);

			Fragments._DataType__DataType.initOperations(_DataType__DataType);
			Fragments._DataType__OclAny.initOperations(_DataType__OclAny);
			Fragments._DataType__OclElement.initOperations(_DataType__OclElement);
			Fragments._DataType__OclEnumeration.initOperations(_DataType__OclEnumeration);
			Fragments._DataType__OclType.initOperations(_DataType__OclType);

			Fragments._Denial__Denial.initOperations(_Denial__Denial);
			Fragments._Denial__NamedElement.initOperations(_Denial__NamedElement);
			Fragments._Denial__OclAny.initOperations(_Denial__OclAny);
			Fragments._Denial__OclElement.initOperations(_Denial__OclElement);

			Fragments._Document__AbstractPaper.initOperations(_Document__AbstractPaper);
			Fragments._Document__Document.initOperations(_Document__Document);
			Fragments._Document__NamedElement.initOperations(_Document__NamedElement);
			Fragments._Document__OclAny.initOperations(_Document__OclAny);
			Fragments._Document__OclElement.initOperations(_Document__OclElement);

			Fragments._DocumentType__DocumentType.initOperations(_DocumentType__DocumentType);
			Fragments._DocumentType__OclAny.initOperations(_DocumentType__OclAny);
			Fragments._DocumentType__OclElement.initOperations(_DocumentType__OclElement);
			Fragments._DocumentType__OclEnumeration.initOperations(_DocumentType__OclEnumeration);
			Fragments._DocumentType__OclType.initOperations(_DocumentType__OclType);

			Fragments._How__How.initOperations(_How__How);
			Fragments._How__OclAny.initOperations(_How__OclAny);
			Fragments._How__OclElement.initOperations(_How__OclElement);

			Fragments._Location__Location.initOperations(_Location__Location);
			Fragments._Location__NamedElement.initOperations(_Location__NamedElement);
			Fragments._Location__OclAny.initOperations(_Location__OclAny);
			Fragments._Location__OclElement.initOperations(_Location__OclElement);

			Fragments._LocationType__LocationType.initOperations(_LocationType__LocationType);
			Fragments._LocationType__OclAny.initOperations(_LocationType__OclAny);
			Fragments._LocationType__OclElement.initOperations(_LocationType__OclElement);
			Fragments._LocationType__OclEnumeration.initOperations(_LocationType__OclEnumeration);
			Fragments._LocationType__OclType.initOperations(_LocationType__OclType);

			Fragments._NamedElement__NamedElement.initOperations(_NamedElement__NamedElement);
			Fragments._NamedElement__OclAny.initOperations(_NamedElement__OclAny);
			Fragments._NamedElement__OclElement.initOperations(_NamedElement__OclElement);

			Fragments._Notification__NamedElement.initOperations(_Notification__NamedElement);
			Fragments._Notification__Notification.initOperations(_Notification__Notification);
			Fragments._Notification__OclAny.initOperations(_Notification__OclAny);
			Fragments._Notification__OclElement.initOperations(_Notification__OclElement);

			Fragments._NotificationInfo__NamedElement.initOperations(_NotificationInfo__NamedElement);
			Fragments._NotificationInfo__NotificationInfo.initOperations(_NotificationInfo__NotificationInfo);
			Fragments._NotificationInfo__OclAny.initOperations(_NotificationInfo__OclAny);
			Fragments._NotificationInfo__OclElement.initOperations(_NotificationInfo__OclElement);

			Fragments._NotificationType__NotificationType.initOperations(_NotificationType__NotificationType);
			Fragments._NotificationType__OclAny.initOperations(_NotificationType__OclAny);
			Fragments._NotificationType__OclElement.initOperations(_NotificationType__OclElement);
			Fragments._NotificationType__OclEnumeration.initOperations(_NotificationType__OclEnumeration);
			Fragments._NotificationType__OclType.initOperations(_NotificationType__OclType);

			Fragments._PolicyStatement__NamedElement.initOperations(_PolicyStatement__NamedElement);
			Fragments._PolicyStatement__NotificationInfo.initOperations(_PolicyStatement__NotificationInfo);
			Fragments._PolicyStatement__OclAny.initOperations(_PolicyStatement__OclAny);
			Fragments._PolicyStatement__OclElement.initOperations(_PolicyStatement__OclElement);
			Fragments._PolicyStatement__PolicyStatement.initOperations(_PolicyStatement__PolicyStatement);

			Fragments._Principal__NamedElement.initOperations(_Principal__NamedElement);
			Fragments._Principal__OclAny.initOperations(_Principal__OclAny);
			Fragments._Principal__OclElement.initOperations(_Principal__OclElement);
			Fragments._Principal__Principal.initOperations(_Principal__Principal);

			Fragments._PrincipalScope__OclAny.initOperations(_PrincipalScope__OclAny);
			Fragments._PrincipalScope__OclElement.initOperations(_PrincipalScope__OclElement);
			Fragments._PrincipalScope__OclEnumeration.initOperations(_PrincipalScope__OclEnumeration);
			Fragments._PrincipalScope__OclType.initOperations(_PrincipalScope__OclType);
			Fragments._PrincipalScope__PrincipalScope.initOperations(_PrincipalScope__PrincipalScope);

			Fragments._PrincipalType__OclAny.initOperations(_PrincipalType__OclAny);
			Fragments._PrincipalType__OclElement.initOperations(_PrincipalType__OclElement);
			Fragments._PrincipalType__OclEnumeration.initOperations(_PrincipalType__OclEnumeration);
			Fragments._PrincipalType__OclType.initOperations(_PrincipalType__OclType);
			Fragments._PrincipalType__PrincipalType.initOperations(_PrincipalType__PrincipalType);

			Fragments._PrivacyData__NamedElement.initOperations(_PrivacyData__NamedElement);
			Fragments._PrivacyData__OclAny.initOperations(_PrivacyData__OclAny);
			Fragments._PrivacyData__OclElement.initOperations(_PrivacyData__OclElement);
			Fragments._PrivacyData__PrivacyData.initOperations(_PrivacyData__PrivacyData);

			Fragments._PrivacyPolicy__NamedElement.initOperations(_PrivacyPolicy__NamedElement);
			Fragments._PrivacyPolicy__OclAny.initOperations(_PrivacyPolicy__OclAny);
			Fragments._PrivacyPolicy__OclElement.initOperations(_PrivacyPolicy__OclElement);
			Fragments._PrivacyPolicy__PrivacyPolicy.initOperations(_PrivacyPolicy__PrivacyPolicy);

			Fragments._PrivacyPolicyHelper__OclAny.initOperations(_PrivacyPolicyHelper__OclAny);
			Fragments._PrivacyPolicyHelper__OclElement.initOperations(_PrivacyPolicyHelper__OclElement);
			Fragments._PrivacyPolicyHelper__PrivacyPolicyHelper.initOperations(_PrivacyPolicyHelper__PrivacyPolicyHelper);

			Fragments._ProcessingReason__OclAny.initOperations(_ProcessingReason__OclAny);
			Fragments._ProcessingReason__OclElement.initOperations(_ProcessingReason__OclElement);
			Fragments._ProcessingReason__OclEnumeration.initOperations(_ProcessingReason__OclEnumeration);
			Fragments._ProcessingReason__OclType.initOperations(_ProcessingReason__OclType);
			Fragments._ProcessingReason__ProcessingReason.initOperations(_ProcessingReason__ProcessingReason);

			Fragments._ProcessingReasonSubtype__OclAny.initOperations(_ProcessingReasonSubtype__OclAny);
			Fragments._ProcessingReasonSubtype__OclElement.initOperations(_ProcessingReasonSubtype__OclElement);
			Fragments._ProcessingReasonSubtype__OclEnumeration.initOperations(_ProcessingReasonSubtype__OclEnumeration);
			Fragments._ProcessingReasonSubtype__OclType.initOperations(_ProcessingReasonSubtype__OclType);
			Fragments._ProcessingReasonSubtype__ProcessingReasonSubtype.initOperations(_ProcessingReasonSubtype__ProcessingReasonSubtype);

			Fragments._Provider__NamedElement.initOperations(_Provider__NamedElement);
			Fragments._Provider__OclAny.initOperations(_Provider__OclAny);
			Fragments._Provider__OclElement.initOperations(_Provider__OclElement);
			Fragments._Provider__Provider.initOperations(_Provider__Provider);

			Fragments._Purpose__OclAny.initOperations(_Purpose__OclAny);
			Fragments._Purpose__OclElement.initOperations(_Purpose__OclElement);
			Fragments._Purpose__Purpose.initOperations(_Purpose__Purpose);

			Fragments._Service__NamedElement.initOperations(_Service__NamedElement);
			Fragments._Service__OclAny.initOperations(_Service__OclAny);
			Fragments._Service__OclElement.initOperations(_Service__OclElement);
			Fragments._Service__Service.initOperations(_Service__Service);

			Fragments._SharedPrivacyData__NamedElement.initOperations(_SharedPrivacyData__NamedElement);
			Fragments._SharedPrivacyData__OclAny.initOperations(_SharedPrivacyData__OclAny);
			Fragments._SharedPrivacyData__OclElement.initOperations(_SharedPrivacyData__OclElement);
			Fragments._SharedPrivacyData__SharedPrivacyData.initOperations(_SharedPrivacyData__SharedPrivacyData);

			Fragments._TimeInterval__AbstractTime.initOperations(_TimeInterval__AbstractTime);
			Fragments._TimeInterval__OclAny.initOperations(_TimeInterval__OclAny);
			Fragments._TimeInterval__OclElement.initOperations(_TimeInterval__OclElement);
			Fragments._TimeInterval__TimeInterval.initOperations(_TimeInterval__TimeInterval);

			Fragments._TimePreposition__OclAny.initOperations(_TimePreposition__OclAny);
			Fragments._TimePreposition__OclElement.initOperations(_TimePreposition__OclElement);
			Fragments._TimePreposition__OclEnumeration.initOperations(_TimePreposition__OclEnumeration);
			Fragments._TimePreposition__OclType.initOperations(_TimePreposition__OclType);
			Fragments._TimePreposition__TimePreposition.initOperations(_TimePreposition__TimePreposition);

			Fragments._TimeStatement__AbstractTime.initOperations(_TimeStatement__AbstractTime);
			Fragments._TimeStatement__OclAny.initOperations(_TimeStatement__OclAny);
			Fragments._TimeStatement__OclElement.initOperations(_TimeStatement__OclElement);
			Fragments._TimeStatement__TimeStatement.initOperations(_TimeStatement__TimeStatement);

			Fragments._What__OclAny.initOperations(_What__OclAny);
			Fragments._What__OclElement.initOperations(_What__OclElement);
			Fragments._What__What.initOperations(_What__What);

			Fragments._Where__OclAny.initOperations(_Where__OclAny);
			Fragments._Where__OclElement.initOperations(_Where__OclElement);
			Fragments._Where__Where.initOperations(_Where__Where);

			Fragments._Withdraw__AbstractComplaintAction.initOperations(_Withdraw__AbstractComplaintAction);
			Fragments._Withdraw__OclAny.initOperations(_Withdraw__OclAny);
			Fragments._Withdraw__OclElement.initOperations(_Withdraw__OclElement);
			Fragments._Withdraw__Withdraw.initOperations(_Withdraw__Withdraw);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of PrivacyModelTables::FragmentOperations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local properties for the local fragment of each type.
	 */
	public static class FragmentProperties {
		static {
			Init.initStart();
			FragmentOperations.init();
		}

		private static final ExecutorProperty /*@NonNull*/ [] _AbstractComplaint = {
			PrivacyModelTables.Properties._AbstractComplaint__denialReason,
			OclstdlibTables.Properties._OclElement__oclContainer,
			OclstdlibTables.Properties._OclElement__oclContents,
			PrivacyModelTables.Properties._AbstractComplaint__status
		};

		private static final ExecutorProperty /*@NonNull*/ [] _AbstractComplaintAction = {
			OclstdlibTables.Properties._OclElement__oclContainer,
			OclstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _AbstractPaper = {
			PrivacyModelTables.Properties._AbstractPaper__description,
			PrivacyModelTables.Properties._AbstractPaper__location,
			PrivacyModelTables.Properties._NamedElement__name,
			OclstdlibTables.Properties._OclElement__oclContainer,
			OclstdlibTables.Properties._OclElement__oclContents,
			PrivacyModelTables.Properties._AbstractPaper__providedBy,
			PrivacyModelTables.Properties._AbstractPaper__startDate,
			PrivacyModelTables.Properties._AbstractPaper__terminationDate,
			PrivacyModelTables.Properties._AbstractPaper__terminationExplanation
		};

		private static final ExecutorProperty /*@NonNull*/ [] _AbstractTime = {
			OclstdlibTables.Properties._OclElement__oclContainer,
			OclstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Action = {
			OclstdlibTables.Properties._OclElement__oclContainer,
			OclstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Complaint = {
			PrivacyModelTables.Properties._Complaint__action,
			PrivacyModelTables.Properties._NamedElement__name,
			OclstdlibTables.Properties._OclElement__oclContainer,
			OclstdlibTables.Properties._OclElement__oclContents,
			PrivacyModelTables.Properties._Complaint__reason,
			PrivacyModelTables.Properties._Complaint__when,
			PrivacyModelTables.Properties._Complaint__who
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ComplaintBasedOnAction = {
			PrivacyModelTables.Properties._AbstractComplaint__denialReason,
			OclstdlibTables.Properties._OclElement__oclContainer,
			OclstdlibTables.Properties._OclElement__oclContents,
			PrivacyModelTables.Properties._ComplaintBasedOnAction__statement,
			PrivacyModelTables.Properties._AbstractComplaint__status
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ComplaintBasedOnData = {
			PrivacyModelTables.Properties._AbstractComplaint__denialReason,
			OclstdlibTables.Properties._OclElement__oclContainer,
			OclstdlibTables.Properties._OclElement__oclContents,
			PrivacyModelTables.Properties._AbstractComplaint__status,
			PrivacyModelTables.Properties._ComplaintBasedOnData__subject,
			PrivacyModelTables.Properties._ComplaintBasedOnData__type
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ComplaintBasedOnDataType = {
			OclstdlibTables.Properties._OclElement__oclContainer,
			OclstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ComplaintStatus = {
			OclstdlibTables.Properties._OclElement__oclContainer,
			OclstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ConfigurationManager = {
			PrivacyModelTables.Properties._ConfigurationManager__dataSources,
			OclstdlibTables.Properties._OclElement__oclContainer,
			OclstdlibTables.Properties._OclElement__oclContents,
			PrivacyModelTables.Properties._ConfigurationManager__protectionControlMethods
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Consent = {
			PrivacyModelTables.Properties._AbstractPaper__description,
			PrivacyModelTables.Properties._Consent__format,
			PrivacyModelTables.Properties._AbstractPaper__location,
			PrivacyModelTables.Properties._NamedElement__name,
			OclstdlibTables.Properties._OclElement__oclContainer,
			OclstdlibTables.Properties._OclElement__oclContents,
			PrivacyModelTables.Properties._AbstractPaper__providedBy,
			PrivacyModelTables.Properties._AbstractPaper__startDate,
			PrivacyModelTables.Properties._AbstractPaper__terminationDate,
			PrivacyModelTables.Properties._AbstractPaper__terminationExplanation,
			PrivacyModelTables.Properties._Consent__type
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ConsentFormat = {
			OclstdlibTables.Properties._OclElement__oclContainer,
			OclstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ConsentType = {
			OclstdlibTables.Properties._OclElement__oclContainer,
			OclstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _DataType = {
			OclstdlibTables.Properties._OclElement__oclContainer,
			OclstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Denial = {
			PrivacyModelTables.Properties._Denial__approvedBy,
			PrivacyModelTables.Properties._Denial__basedOnStatements,
			PrivacyModelTables.Properties._NamedElement__name,
			OclstdlibTables.Properties._OclElement__oclContainer,
			OclstdlibTables.Properties._OclElement__oclContents,
			PrivacyModelTables.Properties._Denial__reason,
			PrivacyModelTables.Properties._Denial__when
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Document = {
			PrivacyModelTables.Properties._AbstractPaper__description,
			PrivacyModelTables.Properties._Document__documentType,
			PrivacyModelTables.Properties._AbstractPaper__location,
			PrivacyModelTables.Properties._NamedElement__name,
			OclstdlibTables.Properties._OclElement__oclContainer,
			OclstdlibTables.Properties._OclElement__oclContents,
			PrivacyModelTables.Properties._AbstractPaper__providedBy,
			PrivacyModelTables.Properties._AbstractPaper__startDate,
			PrivacyModelTables.Properties._AbstractPaper__terminationDate,
			PrivacyModelTables.Properties._AbstractPaper__terminationExplanation
		};

		private static final ExecutorProperty /*@NonNull*/ [] _DocumentType = {
			OclstdlibTables.Properties._OclElement__oclContainer,
			OclstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _How = {
			PrivacyModelTables.Properties._How__consent,
			PrivacyModelTables.Properties._How__documents,
			OclstdlibTables.Properties._OclElement__oclContainer,
			OclstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Location = {
			PrivacyModelTables.Properties._Location__isEUMember,
			PrivacyModelTables.Properties._Location__legalAgeLimit,
			PrivacyModelTables.Properties._NamedElement__name,
			OclstdlibTables.Properties._OclElement__oclContainer,
			OclstdlibTables.Properties._OclElement__oclContents,
			PrivacyModelTables.Properties._Location__subLocations,
			PrivacyModelTables.Properties._Location__type
		};

		private static final ExecutorProperty /*@NonNull*/ [] _LocationType = {
			OclstdlibTables.Properties._OclElement__oclContainer,
			OclstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _NamedElement = {
			PrivacyModelTables.Properties._NamedElement__name,
			OclstdlibTables.Properties._OclElement__oclContainer,
			OclstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Notification = {
			PrivacyModelTables.Properties._Notification__causedBy,
			PrivacyModelTables.Properties._NamedElement__name,
			PrivacyModelTables.Properties._Notification__notifiers,
			OclstdlibTables.Properties._OclElement__oclContainer,
			OclstdlibTables.Properties._OclElement__oclContents,
			PrivacyModelTables.Properties._Notification__receivers,
			PrivacyModelTables.Properties._Notification__type,
			PrivacyModelTables.Properties._Notification__when
		};

		private static final ExecutorProperty /*@NonNull*/ [] _NotificationInfo = {
			PrivacyModelTables.Properties._NamedElement__name,
			OclstdlibTables.Properties._OclElement__oclContainer,
			OclstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _NotificationType = {
			OclstdlibTables.Properties._OclElement__oclContainer,
			OclstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _PolicyStatement = {
			PrivacyModelTables.Properties._PolicyStatement__causedBy,
			PrivacyModelTables.Properties._PolicyStatement__how,
			PrivacyModelTables.Properties._NamedElement__name,
			OclstdlibTables.Properties._OclElement__oclContainer,
			OclstdlibTables.Properties._OclElement__oclContents,
			PrivacyModelTables.Properties._PolicyStatement__what,
			PrivacyModelTables.Properties._PolicyStatement__when,
			PrivacyModelTables.Properties._PolicyStatement__where,
			PrivacyModelTables.Properties._PolicyStatement__who,
			PrivacyModelTables.Properties._PolicyStatement__whom,
			PrivacyModelTables.Properties._PolicyStatement__whose,
			PrivacyModelTables.Properties._PolicyStatement__why
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Principal = {
			PrivacyModelTables.Properties._Principal__age,
			PrivacyModelTables.Properties._Principal__birthdate,
			PrivacyModelTables.Properties._Principal__inhabits,
			PrivacyModelTables.Properties._NamedElement__name,
			OclstdlibTables.Properties._OclElement__oclContainer,
			OclstdlibTables.Properties._OclElement__oclContents,
			PrivacyModelTables.Properties._Principal__responsiblePersons,
			PrivacyModelTables.Properties._Principal__scope,
			PrivacyModelTables.Properties._Principal__subPrincipals,
			PrivacyModelTables.Properties._Principal__type
		};

		private static final ExecutorProperty /*@NonNull*/ [] _PrincipalScope = {
			OclstdlibTables.Properties._OclElement__oclContainer,
			OclstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _PrincipalType = {
			OclstdlibTables.Properties._OclElement__oclContainer,
			OclstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _PrivacyData = {
			PrivacyModelTables.Properties._NamedElement__name,
			OclstdlibTables.Properties._OclElement__oclContainer,
			OclstdlibTables.Properties._OclElement__oclContents,
			PrivacyModelTables.Properties._PrivacyData__type
		};

		private static final ExecutorProperty /*@NonNull*/ [] _PrivacyPolicy = {
			PrivacyModelTables.Properties._PrivacyPolicy__allComplaints,
			PrivacyModelTables.Properties._PrivacyPolicy__allConsents,
			PrivacyModelTables.Properties._PrivacyPolicy__allDatas,
			PrivacyModelTables.Properties._PrivacyPolicy__allDenials,
			PrivacyModelTables.Properties._PrivacyPolicy__allDocuments,
			PrivacyModelTables.Properties._PrivacyPolicy__allPrincipals,
			PrivacyModelTables.Properties._PrivacyPolicy__allProviders,
			PrivacyModelTables.Properties._PrivacyPolicy__allServices,
			PrivacyModelTables.Properties._PrivacyPolicy__allSharedPrivacyData,
			PrivacyModelTables.Properties._PrivacyPolicy__configurationManager,
			PrivacyModelTables.Properties._PrivacyPolicy__defaultProtectionControls,
			PrivacyModelTables.Properties._PrivacyPolicy__locations,
			PrivacyModelTables.Properties._NamedElement__name,
			PrivacyModelTables.Properties._PrivacyPolicy__notifications,
			OclstdlibTables.Properties._OclElement__oclContainer,
			OclstdlibTables.Properties._OclElement__oclContents,
			PrivacyModelTables.Properties._PrivacyPolicy__owner,
			PrivacyModelTables.Properties._PrivacyPolicy__policyStatements,
			PrivacyModelTables.Properties._PrivacyPolicy__privacyPolicyHelper
		};

		private static final ExecutorProperty /*@NonNull*/ [] _PrivacyPolicyHelper = {
			OclstdlibTables.Properties._OclElement__oclContainer,
			OclstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ProcessingReason = {
			OclstdlibTables.Properties._OclElement__oclContainer,
			OclstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ProcessingReasonSubtype = {
			OclstdlibTables.Properties._OclElement__oclContainer,
			OclstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Provider = {
			PrivacyModelTables.Properties._Provider__located,
			PrivacyModelTables.Properties._NamedElement__name,
			OclstdlibTables.Properties._OclElement__oclContainer,
			OclstdlibTables.Properties._OclElement__oclContents,
			PrivacyModelTables.Properties._Provider__provide
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Purpose = {
			PrivacyModelTables.Properties._Purpose__details,
			OclstdlibTables.Properties._OclElement__oclContainer,
			OclstdlibTables.Properties._OclElement__oclContents,
			PrivacyModelTables.Properties._Purpose__processingReason,
			PrivacyModelTables.Properties._Purpose__processingReasonSubtype,
			PrivacyModelTables.Properties._Purpose__subPurposes
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Service = {
			PrivacyModelTables.Properties._NamedElement__name,
			OclstdlibTables.Properties._OclElement__oclContainer,
			OclstdlibTables.Properties._OclElement__oclContents,
			PrivacyModelTables.Properties._Service__subservices
		};

		private static final ExecutorProperty /*@NonNull*/ [] _SharedPrivacyData = {
			PrivacyModelTables.Properties._SharedPrivacyData__additionalProtectionControls,
			PrivacyModelTables.Properties._SharedPrivacyData__colllectedFromSubject,
			PrivacyModelTables.Properties._SharedPrivacyData__dataSource,
			PrivacyModelTables.Properties._NamedElement__name,
			OclstdlibTables.Properties._OclElement__oclContainer,
			OclstdlibTables.Properties._OclElement__oclContents,
			PrivacyModelTables.Properties._SharedPrivacyData__privacydata
		};

		private static final ExecutorProperty /*@NonNull*/ [] _TimeInterval = {
			PrivacyModelTables.Properties._TimeInterval__end,
			OclstdlibTables.Properties._OclElement__oclContainer,
			OclstdlibTables.Properties._OclElement__oclContents,
			PrivacyModelTables.Properties._TimeInterval__start
		};

		private static final ExecutorProperty /*@NonNull*/ [] _TimePreposition = {
			OclstdlibTables.Properties._OclElement__oclContainer,
			OclstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _TimeStatement = {
			PrivacyModelTables.Properties._TimeStatement__dateTime,
			OclstdlibTables.Properties._OclElement__oclContainer,
			OclstdlibTables.Properties._OclElement__oclContents,
			PrivacyModelTables.Properties._TimeStatement__preposition
		};

		private static final ExecutorProperty /*@NonNull*/ [] _What = {
			PrivacyModelTables.Properties._What__actions,
			PrivacyModelTables.Properties._What__datas,
			OclstdlibTables.Properties._OclElement__oclContainer,
			OclstdlibTables.Properties._OclElement__oclContents,
			PrivacyModelTables.Properties._What__providers
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Where = {
			PrivacyModelTables.Properties._Where__destination,
			OclstdlibTables.Properties._OclElement__oclContainer,
			OclstdlibTables.Properties._OclElement__oclContents,
			PrivacyModelTables.Properties._Where__source
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Withdraw = {
			OclstdlibTables.Properties._OclElement__oclContainer,
			OclstdlibTables.Properties._OclElement__oclContents,
			PrivacyModelTables.Properties._Withdraw__subject
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._AbstractComplaint__AbstractComplaint.initProperties(_AbstractComplaint);
			Fragments._AbstractComplaintAction__AbstractComplaintAction.initProperties(_AbstractComplaintAction);
			Fragments._AbstractPaper__AbstractPaper.initProperties(_AbstractPaper);
			Fragments._AbstractTime__AbstractTime.initProperties(_AbstractTime);
			Fragments._Action__Action.initProperties(_Action);
			Fragments._Complaint__Complaint.initProperties(_Complaint);
			Fragments._ComplaintBasedOnAction__ComplaintBasedOnAction.initProperties(_ComplaintBasedOnAction);
			Fragments._ComplaintBasedOnData__ComplaintBasedOnData.initProperties(_ComplaintBasedOnData);
			Fragments._ComplaintBasedOnDataType__ComplaintBasedOnDataType.initProperties(_ComplaintBasedOnDataType);
			Fragments._ComplaintStatus__ComplaintStatus.initProperties(_ComplaintStatus);
			Fragments._ConfigurationManager__ConfigurationManager.initProperties(_ConfigurationManager);
			Fragments._Consent__Consent.initProperties(_Consent);
			Fragments._ConsentFormat__ConsentFormat.initProperties(_ConsentFormat);
			Fragments._ConsentType__ConsentType.initProperties(_ConsentType);
			Fragments._DataType__DataType.initProperties(_DataType);
			Fragments._Denial__Denial.initProperties(_Denial);
			Fragments._Document__Document.initProperties(_Document);
			Fragments._DocumentType__DocumentType.initProperties(_DocumentType);
			Fragments._How__How.initProperties(_How);
			Fragments._Location__Location.initProperties(_Location);
			Fragments._LocationType__LocationType.initProperties(_LocationType);
			Fragments._NamedElement__NamedElement.initProperties(_NamedElement);
			Fragments._Notification__Notification.initProperties(_Notification);
			Fragments._NotificationInfo__NotificationInfo.initProperties(_NotificationInfo);
			Fragments._NotificationType__NotificationType.initProperties(_NotificationType);
			Fragments._PolicyStatement__PolicyStatement.initProperties(_PolicyStatement);
			Fragments._Principal__Principal.initProperties(_Principal);
			Fragments._PrincipalScope__PrincipalScope.initProperties(_PrincipalScope);
			Fragments._PrincipalType__PrincipalType.initProperties(_PrincipalType);
			Fragments._PrivacyData__PrivacyData.initProperties(_PrivacyData);
			Fragments._PrivacyPolicy__PrivacyPolicy.initProperties(_PrivacyPolicy);
			Fragments._PrivacyPolicyHelper__PrivacyPolicyHelper.initProperties(_PrivacyPolicyHelper);
			Fragments._ProcessingReason__ProcessingReason.initProperties(_ProcessingReason);
			Fragments._ProcessingReasonSubtype__ProcessingReasonSubtype.initProperties(_ProcessingReasonSubtype);
			Fragments._Provider__Provider.initProperties(_Provider);
			Fragments._Purpose__Purpose.initProperties(_Purpose);
			Fragments._Service__Service.initProperties(_Service);
			Fragments._SharedPrivacyData__SharedPrivacyData.initProperties(_SharedPrivacyData);
			Fragments._TimeInterval__TimeInterval.initProperties(_TimeInterval);
			Fragments._TimePreposition__TimePreposition.initProperties(_TimePreposition);
			Fragments._TimeStatement__TimeStatement.initProperties(_TimeStatement);
			Fragments._What__What.initProperties(_What);
			Fragments._Where__Where.initProperties(_Where);
			Fragments._Withdraw__Withdraw.initProperties(_Withdraw);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of PrivacyModelTables::FragmentProperties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of enumeration literals for each enumeration.
	 */
	public static class EnumerationLiterals {
		static {
			Init.initStart();
			FragmentProperties.init();
		}

		public static final EcoreExecutorEnumerationLiteral _Action__Store = new EcoreExecutorEnumerationLiteral(PrivacyModelPackage.Literals.ACTION.getEEnumLiteral("Store"), Types._Action, 0);
		public static final EcoreExecutorEnumerationLiteral _Action__Access = new EcoreExecutorEnumerationLiteral(PrivacyModelPackage.Literals.ACTION.getEEnumLiteral("Access"), Types._Action, 1);
		public static final EcoreExecutorEnumerationLiteral _Action__Collecting = new EcoreExecutorEnumerationLiteral(PrivacyModelPackage.Literals.ACTION.getEEnumLiteral("Collecting"), Types._Action, 2);
		public static final EcoreExecutorEnumerationLiteral _Action__Profiling = new EcoreExecutorEnumerationLiteral(PrivacyModelPackage.Literals.ACTION.getEEnumLiteral("Profiling"), Types._Action, 3);
		public static final EcoreExecutorEnumerationLiteral _Action__Erasure = new EcoreExecutorEnumerationLiteral(PrivacyModelPackage.Literals.ACTION.getEEnumLiteral("Erasure"), Types._Action, 4);
		public static final EcoreExecutorEnumerationLiteral _Action__Rectification = new EcoreExecutorEnumerationLiteral(PrivacyModelPackage.Literals.ACTION.getEEnumLiteral("Rectification"), Types._Action, 5);
		public static final EcoreExecutorEnumerationLiteral _Action__Transfer = new EcoreExecutorEnumerationLiteral(PrivacyModelPackage.Literals.ACTION.getEEnumLiteral("Transfer"), Types._Action, 6);
		public static final EcoreExecutorEnumerationLiteral _Action__StopProcessing = new EcoreExecutorEnumerationLiteral(PrivacyModelPackage.Literals.ACTION.getEEnumLiteral("StopProcessing"), Types._Action, 7);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _Action = {
			_Action__Store,
			_Action__Access,
			_Action__Collecting,
			_Action__Profiling,
			_Action__Erasure,
			_Action__Rectification,
			_Action__Transfer,
			_Action__StopProcessing
		};

		public static final EcoreExecutorEnumerationLiteral _ComplaintBasedOnDataType__Erasure = new EcoreExecutorEnumerationLiteral(PrivacyModelPackage.Literals.COMPLAINT_BASED_ON_DATA_TYPE.getEEnumLiteral("Erasure"), Types._ComplaintBasedOnDataType, 0);
		public static final EcoreExecutorEnumerationLiteral _ComplaintBasedOnDataType__Rectification = new EcoreExecutorEnumerationLiteral(PrivacyModelPackage.Literals.COMPLAINT_BASED_ON_DATA_TYPE.getEEnumLiteral("Rectification"), Types._ComplaintBasedOnDataType, 1);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _ComplaintBasedOnDataType = {
			_ComplaintBasedOnDataType__Erasure,
			_ComplaintBasedOnDataType__Rectification
		};

		public static final EcoreExecutorEnumerationLiteral _ComplaintStatus__Pending = new EcoreExecutorEnumerationLiteral(PrivacyModelPackage.Literals.COMPLAINT_STATUS.getEEnumLiteral("Pending"), Types._ComplaintStatus, 0);
		public static final EcoreExecutorEnumerationLiteral _ComplaintStatus__Accepted = new EcoreExecutorEnumerationLiteral(PrivacyModelPackage.Literals.COMPLAINT_STATUS.getEEnumLiteral("Accepted"), Types._ComplaintStatus, 1);
		public static final EcoreExecutorEnumerationLiteral _ComplaintStatus__Denied = new EcoreExecutorEnumerationLiteral(PrivacyModelPackage.Literals.COMPLAINT_STATUS.getEEnumLiteral("Denied"), Types._ComplaintStatus, 2);
		public static final EcoreExecutorEnumerationLiteral _ComplaintStatus__Executed = new EcoreExecutorEnumerationLiteral(PrivacyModelPackage.Literals.COMPLAINT_STATUS.getEEnumLiteral("Executed"), Types._ComplaintStatus, 3);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _ComplaintStatus = {
			_ComplaintStatus__Pending,
			_ComplaintStatus__Accepted,
			_ComplaintStatus__Denied,
			_ComplaintStatus__Executed
		};

		public static final EcoreExecutorEnumerationLiteral _ConsentFormat__Written = new EcoreExecutorEnumerationLiteral(PrivacyModelPackage.Literals.CONSENT_FORMAT.getEEnumLiteral("Written"), Types._ConsentFormat, 0);
		public static final EcoreExecutorEnumerationLiteral _ConsentFormat__Verbal = new EcoreExecutorEnumerationLiteral(PrivacyModelPackage.Literals.CONSENT_FORMAT.getEEnumLiteral("Verbal"), Types._ConsentFormat, 1);
		public static final EcoreExecutorEnumerationLiteral _ConsentFormat__NonVerbal = new EcoreExecutorEnumerationLiteral(PrivacyModelPackage.Literals.CONSENT_FORMAT.getEEnumLiteral("NonVerbal"), Types._ConsentFormat, 2);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _ConsentFormat = {
			_ConsentFormat__Written,
			_ConsentFormat__Verbal,
			_ConsentFormat__NonVerbal
		};

		public static final EcoreExecutorEnumerationLiteral _ConsentType__Explicit = new EcoreExecutorEnumerationLiteral(PrivacyModelPackage.Literals.CONSENT_TYPE.getEEnumLiteral("Explicit"), Types._ConsentType, 0);
		public static final EcoreExecutorEnumerationLiteral _ConsentType__Implied = new EcoreExecutorEnumerationLiteral(PrivacyModelPackage.Literals.CONSENT_TYPE.getEEnumLiteral("Implied"), Types._ConsentType, 1);
		public static final EcoreExecutorEnumerationLiteral _ConsentType__Informed = new EcoreExecutorEnumerationLiteral(PrivacyModelPackage.Literals.CONSENT_TYPE.getEEnumLiteral("Informed"), Types._ConsentType, 2);
		public static final EcoreExecutorEnumerationLiteral _ConsentType__Unanomius = new EcoreExecutorEnumerationLiteral(PrivacyModelPackage.Literals.CONSENT_TYPE.getEEnumLiteral("Unanomius"), Types._ConsentType, 3);
		public static final EcoreExecutorEnumerationLiteral _ConsentType__Substituted = new EcoreExecutorEnumerationLiteral(PrivacyModelPackage.Literals.CONSENT_TYPE.getEEnumLiteral("Substituted"), Types._ConsentType, 4);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _ConsentType = {
			_ConsentType__Explicit,
			_ConsentType__Implied,
			_ConsentType__Informed,
			_ConsentType__Unanomius,
			_ConsentType__Substituted
		};

		public static final EcoreExecutorEnumerationLiteral _DataType__Biometric = new EcoreExecutorEnumerationLiteral(PrivacyModelPackage.Literals.DATA_TYPE.getEEnumLiteral("Biometric"), Types._DataType, 0);
		public static final EcoreExecutorEnumerationLiteral _DataType__General = new EcoreExecutorEnumerationLiteral(PrivacyModelPackage.Literals.DATA_TYPE.getEEnumLiteral("General"), Types._DataType, 1);
		public static final EcoreExecutorEnumerationLiteral _DataType__Genetic = new EcoreExecutorEnumerationLiteral(PrivacyModelPackage.Literals.DATA_TYPE.getEEnumLiteral("Genetic"), Types._DataType, 2);
		public static final EcoreExecutorEnumerationLiteral _DataType__PoliticalOpinion = new EcoreExecutorEnumerationLiteral(PrivacyModelPackage.Literals.DATA_TYPE.getEEnumLiteral("PoliticalOpinion"), Types._DataType, 3);
		public static final EcoreExecutorEnumerationLiteral _DataType__RacialOrEthnicOrigin = new EcoreExecutorEnumerationLiteral(PrivacyModelPackage.Literals.DATA_TYPE.getEEnumLiteral("RacialOrEthnicOrigin"), Types._DataType, 4);
		public static final EcoreExecutorEnumerationLiteral _DataType__Beliefs = new EcoreExecutorEnumerationLiteral(PrivacyModelPackage.Literals.DATA_TYPE.getEEnumLiteral("Beliefs"), Types._DataType, 5);
		public static final EcoreExecutorEnumerationLiteral _DataType__SexLife = new EcoreExecutorEnumerationLiteral(PrivacyModelPackage.Literals.DATA_TYPE.getEEnumLiteral("SexLife"), Types._DataType, 6);
		public static final EcoreExecutorEnumerationLiteral _DataType__Religic = new EcoreExecutorEnumerationLiteral(PrivacyModelPackage.Literals.DATA_TYPE.getEEnumLiteral("Religic"), Types._DataType, 7);
		public static final EcoreExecutorEnumerationLiteral _DataType__Health = new EcoreExecutorEnumerationLiteral(PrivacyModelPackage.Literals.DATA_TYPE.getEEnumLiteral("Health"), Types._DataType, 8);
		public static final EcoreExecutorEnumerationLiteral _DataType__Judical = new EcoreExecutorEnumerationLiteral(PrivacyModelPackage.Literals.DATA_TYPE.getEEnumLiteral("Judical"), Types._DataType, 9);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _DataType = {
			_DataType__Biometric,
			_DataType__General,
			_DataType__Genetic,
			_DataType__PoliticalOpinion,
			_DataType__RacialOrEthnicOrigin,
			_DataType__Beliefs,
			_DataType__SexLife,
			_DataType__Religic,
			_DataType__Health,
			_DataType__Judical
		};

		public static final EcoreExecutorEnumerationLiteral _DocumentType__ChildCustody = new EcoreExecutorEnumerationLiteral(PrivacyModelPackage.Literals.DOCUMENT_TYPE.getEEnumLiteral("ChildCustody"), Types._DocumentType, 0);
		public static final EcoreExecutorEnumerationLiteral _DocumentType__CourtApproval = new EcoreExecutorEnumerationLiteral(PrivacyModelPackage.Literals.DOCUMENT_TYPE.getEEnumLiteral("CourtApproval"), Types._DocumentType, 1);
		public static final EcoreExecutorEnumerationLiteral _DocumentType__ControllerApproval = new EcoreExecutorEnumerationLiteral(PrivacyModelPackage.Literals.DOCUMENT_TYPE.getEEnumLiteral("ControllerApproval"), Types._DocumentType, 2);
		public static final EcoreExecutorEnumerationLiteral _DocumentType__TransferCertificate = new EcoreExecutorEnumerationLiteral(PrivacyModelPackage.Literals.DOCUMENT_TYPE.getEEnumLiteral("TransferCertificate"), Types._DocumentType, 3);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _DocumentType = {
			_DocumentType__ChildCustody,
			_DocumentType__CourtApproval,
			_DocumentType__ControllerApproval,
			_DocumentType__TransferCertificate
		};

		public static final EcoreExecutorEnumerationLiteral _LocationType__Union = new EcoreExecutorEnumerationLiteral(PrivacyModelPackage.Literals.LOCATION_TYPE.getEEnumLiteral("Union"), Types._LocationType, 0);
		public static final EcoreExecutorEnumerationLiteral _LocationType__Country = new EcoreExecutorEnumerationLiteral(PrivacyModelPackage.Literals.LOCATION_TYPE.getEEnumLiteral("Country"), Types._LocationType, 1);
		public static final EcoreExecutorEnumerationLiteral _LocationType__Region = new EcoreExecutorEnumerationLiteral(PrivacyModelPackage.Literals.LOCATION_TYPE.getEEnumLiteral("Region"), Types._LocationType, 2);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _LocationType = {
			_LocationType__Union,
			_LocationType__Country,
			_LocationType__Region
		};

		public static final EcoreExecutorEnumerationLiteral _NotificationType__Erasure = new EcoreExecutorEnumerationLiteral(PrivacyModelPackage.Literals.NOTIFICATION_TYPE.getEEnumLiteral("Erasure"), Types._NotificationType, 0);
		public static final EcoreExecutorEnumerationLiteral _NotificationType__Withdraw = new EcoreExecutorEnumerationLiteral(PrivacyModelPackage.Literals.NOTIFICATION_TYPE.getEEnumLiteral("Withdraw"), Types._NotificationType, 1);
		public static final EcoreExecutorEnumerationLiteral _NotificationType__Rectification = new EcoreExecutorEnumerationLiteral(PrivacyModelPackage.Literals.NOTIFICATION_TYPE.getEEnumLiteral("Rectification"), Types._NotificationType, 2);
		public static final EcoreExecutorEnumerationLiteral _NotificationType__DataCollecting = new EcoreExecutorEnumerationLiteral(PrivacyModelPackage.Literals.NOTIFICATION_TYPE.getEEnumLiteral("DataCollecting"), Types._NotificationType, 3);
		public static final EcoreExecutorEnumerationLiteral _NotificationType__StopProcessing = new EcoreExecutorEnumerationLiteral(PrivacyModelPackage.Literals.NOTIFICATION_TYPE.getEEnumLiteral("StopProcessing"), Types._NotificationType, 4);
		public static final EcoreExecutorEnumerationLiteral _NotificationType__ThirdPartyTransfer = new EcoreExecutorEnumerationLiteral(PrivacyModelPackage.Literals.NOTIFICATION_TYPE.getEEnumLiteral("ThirdPartyTransfer"), Types._NotificationType, 5);
		public static final EcoreExecutorEnumerationLiteral _NotificationType__ExecutedRectification = new EcoreExecutorEnumerationLiteral(PrivacyModelPackage.Literals.NOTIFICATION_TYPE.getEEnumLiteral("ExecutedRectification"), Types._NotificationType, 6);
		public static final EcoreExecutorEnumerationLiteral _NotificationType__ExecutedErasure = new EcoreExecutorEnumerationLiteral(PrivacyModelPackage.Literals.NOTIFICATION_TYPE.getEEnumLiteral("ExecutedErasure"), Types._NotificationType, 7);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _NotificationType = {
			_NotificationType__Erasure,
			_NotificationType__Withdraw,
			_NotificationType__Rectification,
			_NotificationType__DataCollecting,
			_NotificationType__StopProcessing,
			_NotificationType__ThirdPartyTransfer,
			_NotificationType__ExecutedRectification,
			_NotificationType__ExecutedErasure
		};

		public static final EcoreExecutorEnumerationLiteral _PrincipalScope__In = new EcoreExecutorEnumerationLiteral(PrivacyModelPackage.Literals.PRINCIPAL_SCOPE.getEEnumLiteral("In"), Types._PrincipalScope, 0);
		public static final EcoreExecutorEnumerationLiteral _PrincipalScope__Out = new EcoreExecutorEnumerationLiteral(PrivacyModelPackage.Literals.PRINCIPAL_SCOPE.getEEnumLiteral("Out"), Types._PrincipalScope, 1);
		public static final EcoreExecutorEnumerationLiteral _PrincipalScope__Unknown = new EcoreExecutorEnumerationLiteral(PrivacyModelPackage.Literals.PRINCIPAL_SCOPE.getEEnumLiteral("Unknown"), Types._PrincipalScope, 2);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _PrincipalScope = {
			_PrincipalScope__In,
			_PrincipalScope__Out,
			_PrincipalScope__Unknown
		};

		public static final EcoreExecutorEnumerationLiteral _PrincipalType__LegalEntity = new EcoreExecutorEnumerationLiteral(PrivacyModelPackage.Literals.PRINCIPAL_TYPE.getEEnumLiteral("LegalEntity"), Types._PrincipalType, 0);
		public static final EcoreExecutorEnumerationLiteral _PrincipalType__NaturalPerson = new EcoreExecutorEnumerationLiteral(PrivacyModelPackage.Literals.PRINCIPAL_TYPE.getEEnumLiteral("NaturalPerson"), Types._PrincipalType, 1);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _PrincipalType = {
			_PrincipalType__LegalEntity,
			_PrincipalType__NaturalPerson
		};

		public static final EcoreExecutorEnumerationLiteral _ProcessingReason__Research = new EcoreExecutorEnumerationLiteral(PrivacyModelPackage.Literals.PROCESSING_REASON.getEEnumLiteral("Research"), Types._ProcessingReason, 0);
		public static final EcoreExecutorEnumerationLiteral _ProcessingReason__PublicHealth = new EcoreExecutorEnumerationLiteral(PrivacyModelPackage.Literals.PROCESSING_REASON.getEEnumLiteral("PublicHealth"), Types._ProcessingReason, 1);
		public static final EcoreExecutorEnumerationLiteral _ProcessingReason__OutOfScope = new EcoreExecutorEnumerationLiteral(PrivacyModelPackage.Literals.PROCESSING_REASON.getEEnumLiteral("OutOfScope"), Types._ProcessingReason, 2);
		public static final EcoreExecutorEnumerationLiteral _ProcessingReason__PublicInterest = new EcoreExecutorEnumerationLiteral(PrivacyModelPackage.Literals.PROCESSING_REASON.getEEnumLiteral("PublicInterest"), Types._ProcessingReason, 3);
		public static final EcoreExecutorEnumerationLiteral _ProcessingReason__StatisticalPurposes = new EcoreExecutorEnumerationLiteral(PrivacyModelPackage.Literals.PROCESSING_REASON.getEEnumLiteral("StatisticalPurposes"), Types._ProcessingReason, 4);
		public static final EcoreExecutorEnumerationLiteral _ProcessingReason__ExercisingSpecificRights = new EcoreExecutorEnumerationLiteral(PrivacyModelPackage.Literals.PROCESSING_REASON.getEEnumLiteral("ExercisingSpecificRights"), Types._ProcessingReason, 5);
		public static final EcoreExecutorEnumerationLiteral _ProcessingReason__Marketing = new EcoreExecutorEnumerationLiteral(PrivacyModelPackage.Literals.PROCESSING_REASON.getEEnumLiteral("Marketing"), Types._ProcessingReason, 6);
		public static final EcoreExecutorEnumerationLiteral _ProcessingReason__Testing = new EcoreExecutorEnumerationLiteral(PrivacyModelPackage.Literals.PROCESSING_REASON.getEEnumLiteral("Testing"), Types._ProcessingReason, 7);
		public static final EcoreExecutorEnumerationLiteral _ProcessingReason__Profiling = new EcoreExecutorEnumerationLiteral(PrivacyModelPackage.Literals.PROCESSING_REASON.getEEnumLiteral("Profiling"), Types._ProcessingReason, 8);
		public static final EcoreExecutorEnumerationLiteral _ProcessingReason__ProtectTheVitalInterestsOfTheDataSubject = new EcoreExecutorEnumerationLiteral(PrivacyModelPackage.Literals.PROCESSING_REASON.getEEnumLiteral("ProtectTheVitalInterestsOfTheDataSubject"), Types._ProcessingReason, 9);
		public static final EcoreExecutorEnumerationLiteral _ProcessingReason__LegitimateInterests = new EcoreExecutorEnumerationLiteral(PrivacyModelPackage.Literals.PROCESSING_REASON.getEEnumLiteral("LegitimateInterests"), Types._ProcessingReason, 10);
		public static final EcoreExecutorEnumerationLiteral _ProcessingReason__StopProcessing = new EcoreExecutorEnumerationLiteral(PrivacyModelPackage.Literals.PROCESSING_REASON.getEEnumLiteral("StopProcessing"), Types._ProcessingReason, 11);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _ProcessingReason = {
			_ProcessingReason__Research,
			_ProcessingReason__PublicHealth,
			_ProcessingReason__OutOfScope,
			_ProcessingReason__PublicInterest,
			_ProcessingReason__StatisticalPurposes,
			_ProcessingReason__ExercisingSpecificRights,
			_ProcessingReason__Marketing,
			_ProcessingReason__Testing,
			_ProcessingReason__Profiling,
			_ProcessingReason__ProtectTheVitalInterestsOfTheDataSubject,
			_ProcessingReason__LegitimateInterests,
			_ProcessingReason__StopProcessing
		};

		public static final EcoreExecutorEnumerationLiteral _ProcessingReasonSubtype__None = new EcoreExecutorEnumerationLiteral(PrivacyModelPackage.Literals.PROCESSING_REASON_SUBTYPE.getEEnumLiteral("None"), Types._ProcessingReasonSubtype, 0);
		public static final EcoreExecutorEnumerationLiteral _ProcessingReasonSubtype__Prevention = new EcoreExecutorEnumerationLiteral(PrivacyModelPackage.Literals.PROCESSING_REASON_SUBTYPE.getEEnumLiteral("Prevention"), Types._ProcessingReasonSubtype, 1);
		public static final EcoreExecutorEnumerationLiteral _ProcessingReasonSubtype__Investigation = new EcoreExecutorEnumerationLiteral(PrivacyModelPackage.Literals.PROCESSING_REASON_SUBTYPE.getEEnumLiteral("Investigation"), Types._ProcessingReasonSubtype, 2);
		public static final EcoreExecutorEnumerationLiteral _ProcessingReasonSubtype__Detection = new EcoreExecutorEnumerationLiteral(PrivacyModelPackage.Literals.PROCESSING_REASON_SUBTYPE.getEEnumLiteral("Detection"), Types._ProcessingReasonSubtype, 3);
		public static final EcoreExecutorEnumerationLiteral _ProcessingReasonSubtype__Prosecution = new EcoreExecutorEnumerationLiteral(PrivacyModelPackage.Literals.PROCESSING_REASON_SUBTYPE.getEEnumLiteral("Prosecution"), Types._ProcessingReasonSubtype, 4);
		public static final EcoreExecutorEnumerationLiteral _ProcessingReasonSubtype__PreventionOfThreats = new EcoreExecutorEnumerationLiteral(PrivacyModelPackage.Literals.PROCESSING_REASON_SUBTYPE.getEEnumLiteral("PreventionOfThreats"), Types._ProcessingReasonSubtype, 5);
		public static final EcoreExecutorEnumerationLiteral _ProcessingReasonSubtype__OutOfEU = new EcoreExecutorEnumerationLiteral(PrivacyModelPackage.Literals.PROCESSING_REASON_SUBTYPE.getEEnumLiteral("OutOfEU"), Types._ProcessingReasonSubtype, 6);
		public static final EcoreExecutorEnumerationLiteral _ProcessingReasonSubtype__PersonalActivity = new EcoreExecutorEnumerationLiteral(PrivacyModelPackage.Literals.PROCESSING_REASON_SUBTYPE.getEEnumLiteral("PersonalActivity"), Types._ProcessingReasonSubtype, 7);
		public static final EcoreExecutorEnumerationLiteral _ProcessingReasonSubtype__SpecialScopeOfActivity = new EcoreExecutorEnumerationLiteral(PrivacyModelPackage.Literals.PROCESSING_REASON_SUBTYPE.getEEnumLiteral("SpecialScopeOfActivity"), Types._ProcessingReasonSubtype, 8);
		public static final EcoreExecutorEnumerationLiteral _ProcessingReasonSubtype__Employment = new EcoreExecutorEnumerationLiteral(PrivacyModelPackage.Literals.PROCESSING_REASON_SUBTYPE.getEEnumLiteral("Employment"), Types._ProcessingReasonSubtype, 9);
		public static final EcoreExecutorEnumerationLiteral _ProcessingReasonSubtype__SocialSecurity = new EcoreExecutorEnumerationLiteral(PrivacyModelPackage.Literals.PROCESSING_REASON_SUBTYPE.getEEnumLiteral("SocialSecurity"), Types._ProcessingReasonSubtype, 10);
		public static final EcoreExecutorEnumerationLiteral _ProcessingReasonSubtype__SocialProtection = new EcoreExecutorEnumerationLiteral(PrivacyModelPackage.Literals.PROCESSING_REASON_SUBTYPE.getEEnumLiteral("SocialProtection"), Types._ProcessingReasonSubtype, 11);
		public static final EcoreExecutorEnumerationLiteral _ProcessingReasonSubtype__PhisicallyIncapable = new EcoreExecutorEnumerationLiteral(PrivacyModelPackage.Literals.PROCESSING_REASON_SUBTYPE.getEEnumLiteral("PhisicallyIncapable"), Types._ProcessingReasonSubtype, 12);
		public static final EcoreExecutorEnumerationLiteral _ProcessingReasonSubtype__LegallyIncapable = new EcoreExecutorEnumerationLiteral(PrivacyModelPackage.Literals.PROCESSING_REASON_SUBTYPE.getEEnumLiteral("LegallyIncapable"), Types._ProcessingReasonSubtype, 13);
		public static final EcoreExecutorEnumerationLiteral _ProcessingReasonSubtype__Statistical = new EcoreExecutorEnumerationLiteral(PrivacyModelPackage.Literals.PROCESSING_REASON_SUBTYPE.getEEnumLiteral("Statistical"), Types._ProcessingReasonSubtype, 14);
		public static final EcoreExecutorEnumerationLiteral _ProcessingReasonSubtype__Historical = new EcoreExecutorEnumerationLiteral(PrivacyModelPackage.Literals.PROCESSING_REASON_SUBTYPE.getEEnumLiteral("Historical"), Types._ProcessingReasonSubtype, 15);
		public static final EcoreExecutorEnumerationLiteral _ProcessingReasonSubtype__Scientific = new EcoreExecutorEnumerationLiteral(PrivacyModelPackage.Literals.PROCESSING_REASON_SUBTYPE.getEEnumLiteral("Scientific"), Types._ProcessingReasonSubtype, 16);
		public static final EcoreExecutorEnumerationLiteral _ProcessingReasonSubtype__Other = new EcoreExecutorEnumerationLiteral(PrivacyModelPackage.Literals.PROCESSING_REASON_SUBTYPE.getEEnumLiteral("Other"), Types._ProcessingReasonSubtype, 17);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _ProcessingReasonSubtype = {
			_ProcessingReasonSubtype__None,
			_ProcessingReasonSubtype__Prevention,
			_ProcessingReasonSubtype__Investigation,
			_ProcessingReasonSubtype__Detection,
			_ProcessingReasonSubtype__Prosecution,
			_ProcessingReasonSubtype__PreventionOfThreats,
			_ProcessingReasonSubtype__OutOfEU,
			_ProcessingReasonSubtype__PersonalActivity,
			_ProcessingReasonSubtype__SpecialScopeOfActivity,
			_ProcessingReasonSubtype__Employment,
			_ProcessingReasonSubtype__SocialSecurity,
			_ProcessingReasonSubtype__SocialProtection,
			_ProcessingReasonSubtype__PhisicallyIncapable,
			_ProcessingReasonSubtype__LegallyIncapable,
			_ProcessingReasonSubtype__Statistical,
			_ProcessingReasonSubtype__Historical,
			_ProcessingReasonSubtype__Scientific,
			_ProcessingReasonSubtype__Other
		};

		public static final EcoreExecutorEnumerationLiteral _TimePreposition__from = new EcoreExecutorEnumerationLiteral(PrivacyModelPackage.Literals.TIME_PREPOSITION.getEEnumLiteral("from"), Types._TimePreposition, 0);
		public static final EcoreExecutorEnumerationLiteral _TimePreposition__to = new EcoreExecutorEnumerationLiteral(PrivacyModelPackage.Literals.TIME_PREPOSITION.getEEnumLiteral("to"), Types._TimePreposition, 1);
		public static final EcoreExecutorEnumerationLiteral _TimePreposition__at = new EcoreExecutorEnumerationLiteral(PrivacyModelPackage.Literals.TIME_PREPOSITION.getEEnumLiteral("at"), Types._TimePreposition, 2);
		public static final EcoreExecutorEnumerationLiteral _TimePreposition__until = new EcoreExecutorEnumerationLiteral(PrivacyModelPackage.Literals.TIME_PREPOSITION.getEEnumLiteral("until"), Types._TimePreposition, 3);
		public static final EcoreExecutorEnumerationLiteral _TimePreposition__before = new EcoreExecutorEnumerationLiteral(PrivacyModelPackage.Literals.TIME_PREPOSITION.getEEnumLiteral("before"), Types._TimePreposition, 4);
		public static final EcoreExecutorEnumerationLiteral _TimePreposition__after = new EcoreExecutorEnumerationLiteral(PrivacyModelPackage.Literals.TIME_PREPOSITION.getEEnumLiteral("after"), Types._TimePreposition, 5);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _TimePreposition = {
			_TimePreposition__from,
			_TimePreposition__to,
			_TimePreposition__at,
			_TimePreposition__until,
			_TimePreposition__before,
			_TimePreposition__after
		};

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {
			Types._Action.initLiterals(_Action);
			Types._ComplaintBasedOnDataType.initLiterals(_ComplaintBasedOnDataType);
			Types._ComplaintStatus.initLiterals(_ComplaintStatus);
			Types._ConsentFormat.initLiterals(_ConsentFormat);
			Types._ConsentType.initLiterals(_ConsentType);
			Types._DataType.initLiterals(_DataType);
			Types._DocumentType.initLiterals(_DocumentType);
			Types._LocationType.initLiterals(_LocationType);
			Types._NotificationType.initLiterals(_NotificationType);
			Types._PrincipalScope.initLiterals(_PrincipalScope);
			Types._PrincipalType.initLiterals(_PrincipalType);
			Types._ProcessingReason.initLiterals(_ProcessingReason);
			Types._ProcessingReasonSubtype.initLiterals(_ProcessingReasonSubtype);
			Types._TimePreposition.initLiterals(_TimePreposition);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of PrivacyModelTables::EnumerationLiterals and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 * The multiple packages above avoid problems with the Java 65536 byte limit but introduce a difficulty in ensuring that
	 * static construction occurs in the disciplined order of the packages when construction may start in any of the packages.
	 * The problem is resolved by ensuring that the static construction of each package first initializes its immediate predecessor.
	 * On completion of predecessor initialization, the residual packages are initialized by starting an initialization in the last package.
	 * This class maintains a count so that the various predecessors can distinguish whether they are the starting point and so
	 * ensure that residual construction occurs just once after all predecessors.
	 */
	private static class Init {
		/**
		 * Counter of nested static constructions. On return to zero residual construction starts. -ve once residual construction started.
		 */
		private static int initCount = 0;

		/**
		 * Invoked at the start of a static construction to defer residual construction until primary constructions complete.
		 */
		private static void initStart() {
			if (initCount >= 0) {
				initCount++;
			}
		}

		/**
		 * Invoked at the end of a static construction to activate residual construction once primary constructions complete.
		 */
		private static void initEnd() {
			if (initCount > 0) {
				if (--initCount == 0) {
					initCount = -1;
					EnumerationLiterals.init();
				}
			}
		}
	}

	static {
		Init.initEnd();
	}

	/*
	 * Force initialization of outer fields. Inner fields are lazily initialized.
	 */
	public static void init() {
		new PrivacyModelTables();
	}

	private PrivacyModelTables() {
		super(PrivacyModelPackage.eNS_URI);
	}

	/*
	 * The EClasses whose instances should be cached to support allInstances().
	 */
	private static final EClass allInstancesEClasses /*@NonNull*/ [] = {
		PrivacyModelPackage.Literals.PRIVACY_POLICY
	};

	@Override
	public EClass /*@NonNull*/ [] basicGetAllInstancesClasses() {
		return allInstancesEClasses;
	}
}
