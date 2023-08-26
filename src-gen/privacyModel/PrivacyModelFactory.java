/**
 */
package privacyModel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see privacyModel.PrivacyModelPackage
 * @generated
 */
public interface PrivacyModelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PrivacyModelFactory eINSTANCE = privacyModel.impl.PrivacyModelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Privacy Policy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Privacy Policy</em>'.
	 * @generated
	 */
	PrivacyPolicy createPrivacyPolicy();

	/**
	 * Returns a new object of class '<em>Policy Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Policy Statement</em>'.
	 * @generated
	 */
	PolicyStatement createPolicyStatement();

	/**
	 * Returns a new object of class '<em>Privacy Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Privacy Data</em>'.
	 * @generated
	 */
	PrivacyData createPrivacyData();

	/**
	 * Returns a new object of class '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service</em>'.
	 * @generated
	 */
	Service createService();

	/**
	 * Returns a new object of class '<em>Provider</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Provider</em>'.
	 * @generated
	 */
	Provider createProvider();

	/**
	 * Returns a new object of class '<em>Principal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Principal</em>'.
	 * @generated
	 */
	Principal createPrincipal();

	/**
	 * Returns a new object of class '<em>Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Location</em>'.
	 * @generated
	 */
	Location createLocation();

	/**
	 * Returns a new object of class '<em>Time Interval</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time Interval</em>'.
	 * @generated
	 */
	TimeInterval createTimeInterval();

	/**
	 * Returns a new object of class '<em>Time Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time Statement</em>'.
	 * @generated
	 */
	TimeStatement createTimeStatement();

	/**
	 * Returns a new object of class '<em>Purpose</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Purpose</em>'.
	 * @generated
	 */
	Purpose createPurpose();

	/**
	 * Returns a new object of class '<em>What</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>What</em>'.
	 * @generated
	 */
	What createWhat();

	/**
	 * Returns a new object of class '<em>How</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>How</em>'.
	 * @generated
	 */
	How createHow();

	/**
	 * Returns a new object of class '<em>Consent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Consent</em>'.
	 * @generated
	 */
	Consent createConsent();

	/**
	 * Returns a new object of class '<em>Configuration Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Configuration Manager</em>'.
	 * @generated
	 */
	ConfigurationManager createConfigurationManager();

	/**
	 * Returns a new object of class '<em>Complaint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Complaint</em>'.
	 * @generated
	 */
	Complaint createComplaint();

	/**
	 * Returns a new object of class '<em>Privacy Policy Helper</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Privacy Policy Helper</em>'.
	 * @generated
	 */
	PrivacyPolicyHelper createPrivacyPolicyHelper();

	/**
	 * Returns a new object of class '<em>Where</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Where</em>'.
	 * @generated
	 */
	Where createWhere();

	/**
	 * Returns a new object of class '<em>Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document</em>'.
	 * @generated
	 */
	Document createDocument();

	/**
	 * Returns a new object of class '<em>Withdraw</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Withdraw</em>'.
	 * @generated
	 */
	Withdraw createWithdraw();

	/**
	 * Returns a new object of class '<em>Complaint Based On Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Complaint Based On Data</em>'.
	 * @generated
	 */
	ComplaintBasedOnData createComplaintBasedOnData();

	/**
	 * Returns a new object of class '<em>Shared Privacy Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Shared Privacy Data</em>'.
	 * @generated
	 */
	SharedPrivacyData createSharedPrivacyData();

	/**
	 * Returns a new object of class '<em>Denial</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Denial</em>'.
	 * @generated
	 */
	Denial createDenial();

	/**
	 * Returns a new object of class '<em>Notification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Notification</em>'.
	 * @generated
	 */
	Notification createNotification();

	/**
	 * Returns a new object of class '<em>Complaint Based On Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Complaint Based On Action</em>'.
	 * @generated
	 */
	ComplaintBasedOnAction createComplaintBasedOnAction();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PrivacyModelPackage getPrivacyModelPackage();

} //PrivacyModelFactory
