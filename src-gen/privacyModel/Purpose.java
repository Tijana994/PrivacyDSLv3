/**
 */
package privacyModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Purpose</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link privacyModel.Purpose#getProcessingReason <em>Processing Reason</em>}</li>
 *   <li>{@link privacyModel.Purpose#getProcessingReasonSubtype <em>Processing Reason Subtype</em>}</li>
 *   <li>{@link privacyModel.Purpose#getSubPurposes <em>Sub Purposes</em>}</li>
 *   <li>{@link privacyModel.Purpose#getDetails <em>Details</em>}</li>
 * </ul>
 *
 * @see privacyModel.PrivacyModelPackage#getPurpose()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ResearchCannotContainsThisSubReason PublicHealthShouldNotContainSubReason OutOfScopeCannotContainsThisSubReason PublicInterestCannotContainsThisSubReason StatisticalPurposesShouldNotContainSubReason ExercisingSpecificRightsPurposesCannotContainsThisSubReason MarketingShouldNotContainSubReason TestingShouldNotContainSubReason ProfilingShouldNotContainSubReason ProtectTheVitalInterestsOfTheDataSubjectCannotContainsThisSubReason LegitimateInterestsNotContainSubReason StopProcessingInterestShouldNotContainSubReason'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot ResearchCannotContainsThisSubReason='\n\t\t\t\tisSubPurposeValid(ProcessingReason::Research, \n\t\t\t\tSequence{ProcessingReasonSubtype::None, ProcessingReasonSubtype::Other, ProcessingReasonSubtype::Scientific, ProcessingReasonSubtype::Historical,\n\t\t\t\t\tProcessingReasonSubtype::Statistical\n\t\t\t\t})' PublicHealthShouldNotContainSubReason='\n\t\t\t\tisSubPurposeValid(ProcessingReason::PublicHealth, \n\t\t\t\tSequence{ProcessingReasonSubtype::None})' OutOfScopeCannotContainsThisSubReason='\n\t\t\tisSubPurposeValid(ProcessingReason::OutOfScope, \n\t\t\t\tSequence{ProcessingReasonSubtype::OutOfEU,\n\t\t\t\t\tProcessingReasonSubtype::PersonalActivity, ProcessingReasonSubtype::SpecialScopeOfActivity, ProcessingReasonSubtype::None,\n\t\t\t\t\tProcessingReasonSubtype::Other\n\t\t\t\t})' PublicInterestCannotContainsThisSubReason='\n\t\t\t\tisSubPurposeValid(ProcessingReason::PublicInterest, \n\t\t\t\tSequence{ProcessingReasonSubtype::Prevention,ProcessingReasonSubtype::Investigation,ProcessingReasonSubtype::Detection,\n\t\t\t\t\tProcessingReasonSubtype::Prosecution, ProcessingReasonSubtype::PreventionOfThreats,ProcessingReasonSubtype::None, ProcessingReasonSubtype::Other})' StatisticalPurposesShouldNotContainSubReason='\n\t\t\t\tisSubPurposeValid(ProcessingReason::StatisticalPurposes, \n\t\t\t\tSequence{ProcessingReasonSubtype::None})' ExercisingSpecificRightsPurposesCannotContainsThisSubReason='\n\t\t\t\tisSubPurposeValid(ProcessingReason::ExercisingSpecificRights, \n\t\t\t\tSequence{ProcessingReasonSubtype::Employment, ProcessingReasonSubtype::SocialSecurity,ProcessingReasonSubtype::SocialProtection, \n\t\t\t\tProcessingReasonSubtype::None, ProcessingReasonSubtype::Other})' MarketingShouldNotContainSubReason='\n\t\t\t\tisSubPurposeValid(ProcessingReason::Marketing, \n\t\t\t\tSequence{ProcessingReasonSubtype::None})' TestingShouldNotContainSubReason='\n\t\t\t\tisSubPurposeValid(ProcessingReason::Testing, \n\t\t\t\tSequence{ProcessingReasonSubtype::None})' ProfilingShouldNotContainSubReason='\n\t\t\t\tisSubPurposeValid(ProcessingReason::Profiling, \n\t\t\t\tSequence{ProcessingReasonSubtype::None})' ProtectTheVitalInterestsOfTheDataSubjectCannotContainsThisSubReason='\n\t\t\tisSubPurposeValid(ProcessingReason::ProtectTheVitalInterestsOfTheDataSubject, \n\t\t\t\tSequence{ProcessingReasonSubtype::PhisicallyIncapable,ProcessingReasonSubtype::LegallyIncapable, ProcessingReasonSubtype::Other, ProcessingReasonSubtype::None})' LegitimateInterestsNotContainSubReason='\n\t\t\tisSubPurposeValid(ProcessingReason::LegitimateInterests, \n\t\t\t\tSequence{ProcessingReasonSubtype::None})' StopProcessingInterestShouldNotContainSubReason='\n\t\t\t\tisSubPurposeValid(ProcessingReason::StopProcessing, \n\t\t\t\tSequence{ProcessingReasonSubtype::None})'"
 * @generated
 */
public interface Purpose extends EObject {
	/**
	 * Returns the value of the '<em><b>Processing Reason</b></em>' attribute.
	 * The literals are from the enumeration {@link privacyModel.ProcessingReason}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processing Reason</em>' attribute.
	 * @see privacyModel.ProcessingReason
	 * @see #setProcessingReason(ProcessingReason)
	 * @see privacyModel.PrivacyModelPackage#getPurpose_ProcessingReason()
	 * @model required="true"
	 * @generated
	 */
	ProcessingReason getProcessingReason();

	/**
	 * Sets the value of the '{@link privacyModel.Purpose#getProcessingReason <em>Processing Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Processing Reason</em>' attribute.
	 * @see privacyModel.ProcessingReason
	 * @see #getProcessingReason()
	 * @generated
	 */
	void setProcessingReason(ProcessingReason value);

	/**
	 * Returns the value of the '<em><b>Processing Reason Subtype</b></em>' attribute.
	 * The literals are from the enumeration {@link privacyModel.ProcessingReasonSubtype}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processing Reason Subtype</em>' attribute.
	 * @see privacyModel.ProcessingReasonSubtype
	 * @see #setProcessingReasonSubtype(ProcessingReasonSubtype)
	 * @see privacyModel.PrivacyModelPackage#getPurpose_ProcessingReasonSubtype()
	 * @model required="true"
	 * @generated
	 */
	ProcessingReasonSubtype getProcessingReasonSubtype();

	/**
	 * Sets the value of the '{@link privacyModel.Purpose#getProcessingReasonSubtype <em>Processing Reason Subtype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Processing Reason Subtype</em>' attribute.
	 * @see privacyModel.ProcessingReasonSubtype
	 * @see #getProcessingReasonSubtype()
	 * @generated
	 */
	void setProcessingReasonSubtype(ProcessingReasonSubtype value);

	/**
	 * Returns the value of the '<em><b>Sub Purposes</b></em>' containment reference list.
	 * The list contents are of type {@link privacyModel.Purpose}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Purposes</em>' containment reference list.
	 * @see privacyModel.PrivacyModelPackage#getPurpose_SubPurposes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Purpose> getSubPurposes();

	/**
	 * Returns the value of the '<em><b>Details</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Details</em>' attribute.
	 * @see #setDetails(String)
	 * @see privacyModel.PrivacyModelPackage#getPurpose_Details()
	 * @model
	 * @generated
	 */
	String getDetails();

	/**
	 * Sets the value of the '{@link privacyModel.Purpose#getDetails <em>Details</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Details</em>' attribute.
	 * @see #getDetails()
	 * @generated
	 */
	void setDetails(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\t\t\tif(self.processingReason = null) then\n\t\t\t\t\t\ttrue\n\t\t\t\t\telse if(self.processingReasonSubtype = null) then\n\t\t\t\t\t\t\t(not(purpose.processingReason = null) and self.processingReason = purpose.processingReason) \n\t\t\t\t\t\t\tor\n\t\t\t\t\t\t\t(self.subPurposes-&gt;notEmpty() and self.subPurposes-&gt;exists(s| s.isValid(purpose)))\n\t\t\t\t\t\telse\n\t\t\t\t\t\t\t(not(purpose.processingReason = null) and not(purpose.processingReasonSubtype = null) \n\t\t\t\t\t\t\tand self.processingReason = purpose.processingReason and self.processingReasonSubtype = purpose.processingReasonSubtype)\n\t\t\t\t\t\t\tor \n\t\t\t\t\t\t\t(self.subPurposes-&gt;notEmpty() and self.subPurposes-&gt;exists(s| s.isValid(purpose)))\n\t\t\t\t\t\tendif\n\t\t\t\t\tendif'"
	 * @generated
	 */
	boolean isValid(Purpose purpose);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" subreasonsUnique="false" subreasonsMany="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='if(self.processingReason = null) then\n\t\t\t\t\ttrue\n\t\t\t\t  else \n\t\t\t\t  \tif(self.processingReason = reason) then\n\t\t\t\t  \t\tif(self.processingReasonSubtype = null) then\n\t\t\t\t  \t\t\ttrue\n\t\t\t\t  \t\telse\n\t\t\t\t  \t\t\tsubreasons-&gt;exists(r| r = self.processingReasonSubtype)\n\t\t\t\t  \t\tendif\n\t\t\t\t  \telse\n\t\t\t\t  \t\ttrue\n\t\t\t\t  \tendif\n\t\t\t\t  endif'"
	 * @generated
	 */
	boolean isSubPurposeValid(ProcessingReason reason, EList<ProcessingReasonSubtype> subreasons);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" allowedReasonRequired="true" allowedSubreasonsUnique="false" allowedSubreasonsMany="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='allowedReason = self.processingReason and allowedSubreasons-&gt;exists(r| r = self.processingReasonSubtype)'"
	 * @generated
	 */
	boolean containsAllowedPurposeReasonAndSubreason(ProcessingReason allowedReason,
			EList<ProcessingReasonSubtype> allowedSubreasons);

} // Purpose
