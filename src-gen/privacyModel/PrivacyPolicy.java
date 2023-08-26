/**
 */
package privacyModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Privacy Policy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link privacyModel.PrivacyPolicy#getPolicyStatements <em>Policy Statements</em>}</li>
 *   <li>{@link privacyModel.PrivacyPolicy#getOwner <em>Owner</em>}</li>
 *   <li>{@link privacyModel.PrivacyPolicy#getAllPrincipals <em>All Principals</em>}</li>
 *   <li>{@link privacyModel.PrivacyPolicy#getLocations <em>Locations</em>}</li>
 *   <li>{@link privacyModel.PrivacyPolicy#getDefaultProtectionControls <em>Default Protection Controls</em>}</li>
 *   <li>{@link privacyModel.PrivacyPolicy#getAllServices <em>All Services</em>}</li>
 *   <li>{@link privacyModel.PrivacyPolicy#getAllProviders <em>All Providers</em>}</li>
 *   <li>{@link privacyModel.PrivacyPolicy#getConfigurationManager <em>Configuration Manager</em>}</li>
 *   <li>{@link privacyModel.PrivacyPolicy#getAllDatas <em>All Datas</em>}</li>
 *   <li>{@link privacyModel.PrivacyPolicy#getAllComplaints <em>All Complaints</em>}</li>
 *   <li>{@link privacyModel.PrivacyPolicy#getPrivacyPolicyHelper <em>Privacy Policy Helper</em>}</li>
 *   <li>{@link privacyModel.PrivacyPolicy#getAllDenials <em>All Denials</em>}</li>
 *   <li>{@link privacyModel.PrivacyPolicy#getAllConsents <em>All Consents</em>}</li>
 *   <li>{@link privacyModel.PrivacyPolicy#getAllDocuments <em>All Documents</em>}</li>
 *   <li>{@link privacyModel.PrivacyPolicy#getNotifications <em>Notifications</em>}</li>
 *   <li>{@link privacyModel.PrivacyPolicy#getAllSharedPrivacyData <em>All Shared Privacy Data</em>}</li>
 * </ul>
 *
 * @see privacyModel.PrivacyModelPackage#getPrivacyPolicy()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='UniquePolicyStatementName UniquePrincipalNamePerType UniquePrivacyDataName UniqueServiceName UniqueProviderName UniqueDocumentName UniqueConsentName UniqueComplaintName UniqueLocationPerType ProtectionControlShouldExistsInConfiguration OwnerShouldHaveDefinedInhabits'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot UniquePolicyStatementName='Tuple {\n\tmessage : String = \'PolicyStatement name is unique\',\n\tstatus : Boolean = \n\t\t\tself.policyStatements-&gt;forAll(st1:PolicyStatement,st2:PolicyStatement| st1.name = st2.name implies st1 = st2)\n}.status' UniquePrincipalNamePerType='Tuple {\n\tmessage : String = \'Principal name per type is unique\',\n\tstatus : Boolean = \n\t\tself.allPrincipals-&gt;forAll(pr1:Principal,pr2:Principal| \n\t\t\tif(pr1.type = pr2.type) then \n\t\t\tpr1.name = pr2.name implies pr1 = pr2\n\t\t\telse\n\t\t\t\ttrue\n\t\t\tendif\n\t\t)\n}.status' UniquePrivacyDataName='Tuple {\n\tmessage : String = \'PrivacyData name is unique\',\n\tstatus : Boolean = \n\t\tself.allDatas-&gt;forAll(data1:PrivacyData,data2:PrivacyData| data1.name = data2.name implies data1 = data2)\n}.status' UniqueServiceName='Tuple {\n\tmessage : String = \'Service name is unique\',\n\tstatus : Boolean = \n\t\tself.allServices-&gt;forAll(service1:Service,service2:Service| service1.name = service2.name implies service1 = service2)\n}.status' UniqueProviderName='Tuple {\n\tmessage : String = \'Provider name is unique\',\n\tstatus : Boolean = \n\t\tself.allProviders-&gt;forAll(provider1:Provider,provider2:Provider| provider1.name = provider2.name implies provider1 = provider2)\n}.status' UniqueDocumentName='Tuple {\n\tmessage : String = \'Document name is unique\',\n\tstatus : Boolean = \n\t\tself.allDocuments-&gt;forAll(document1:Document,document2:Document| document1.name = document2.name implies document1 = document2)\n}.status' UniqueConsentName='Tuple {\n\tmessage : String = \'Consent name is unique\',\n\tstatus : Boolean = \n\t\tself.allConsents-&gt;forAll(consent1:Consent,consent2:Consent| consent1.name = consent2.name implies consent1 = consent2)\n}.status' UniqueComplaintName='Tuple {\n\tmessage : String = \'Complaint name is unique\',\n\tstatus : Boolean = \n\t\tself.allComplaints-&gt;forAll(complaint1:Complaint,complaint2:Complaint| complaint1.name = complaint2.name implies complaint1 = complaint2)\n}.status' UniqueLocationPerType='Tuple {\n\tmessage : String = \'Location name per type is unique\',\n\tstatus : Boolean = \n\t\tself.locations-&gt;forAll(loc1:Location,loc2:Location| \n\t\t\tif(loc1.type = loc2.type) then \n\t\t\t\tloc1.name = loc2.name implies loc1 = loc2\n\t\t\telse\n\t\t\t\ttrue\n\t\t\tendif\n\t\t)\n}.status' ProtectionControlShouldExistsInConfiguration='Tuple {\n\tmessage : String = \'Protection controls should be defined in configuration.\',\n\tstatus : Boolean = \n\t\t\tself.defaultProtectionControls-&gt;forAll(protectionControl:String|\n\t\t\t\tself.privacyPolicyHelper.isPolicyControlValid(protectionControl)\n\t\t\t)\n}.status' OwnerShouldHaveDefinedInhabits='Tuple {\n\tmessage : String = \'Based on Art 3\',\n\tstatus : Boolean = \n\t\t\t(not(self.owner = null) and not(self.owner.inhabits = null))\n}.status'"
 * @generated
 */
public interface PrivacyPolicy extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Policy Statements</b></em>' containment reference list.
	 * The list contents are of type {@link privacyModel.PolicyStatement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Policy Statements</em>' containment reference list.
	 * @see privacyModel.PrivacyModelPackage#getPrivacyPolicy_PolicyStatements()
	 * @model containment="true"
	 * @generated
	 */
	EList<PolicyStatement> getPolicyStatements();

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' reference.
	 * @see #setOwner(Principal)
	 * @see privacyModel.PrivacyModelPackage#getPrivacyPolicy_Owner()
	 * @model required="true"
	 * @generated
	 */
	Principal getOwner();

	/**
	 * Sets the value of the '{@link privacyModel.PrivacyPolicy#getOwner <em>Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(Principal value);

	/**
	 * Returns the value of the '<em><b>All Principals</b></em>' containment reference list.
	 * The list contents are of type {@link privacyModel.Principal}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Principals</em>' containment reference list.
	 * @see privacyModel.PrivacyModelPackage#getPrivacyPolicy_AllPrincipals()
	 * @model containment="true"
	 * @generated
	 */
	EList<Principal> getAllPrincipals();

	/**
	 * Returns the value of the '<em><b>Locations</b></em>' containment reference list.
	 * The list contents are of type {@link privacyModel.Location}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locations</em>' containment reference list.
	 * @see privacyModel.PrivacyModelPackage#getPrivacyPolicy_Locations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Location> getLocations();

	/**
	 * Returns the value of the '<em><b>Default Protection Controls</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Protection Controls</em>' attribute list.
	 * @see privacyModel.PrivacyModelPackage#getPrivacyPolicy_DefaultProtectionControls()
	 * @model
	 * @generated
	 */
	EList<String> getDefaultProtectionControls();

	/**
	 * Returns the value of the '<em><b>All Services</b></em>' containment reference list.
	 * The list contents are of type {@link privacyModel.Service}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Services</em>' containment reference list.
	 * @see privacyModel.PrivacyModelPackage#getPrivacyPolicy_AllServices()
	 * @model containment="true"
	 * @generated
	 */
	EList<Service> getAllServices();

	/**
	 * Returns the value of the '<em><b>All Providers</b></em>' containment reference list.
	 * The list contents are of type {@link privacyModel.Provider}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Providers</em>' containment reference list.
	 * @see privacyModel.PrivacyModelPackage#getPrivacyPolicy_AllProviders()
	 * @model containment="true"
	 * @generated
	 */
	EList<Provider> getAllProviders();

	/**
	 * Returns the value of the '<em><b>Configuration Manager</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration Manager</em>' containment reference.
	 * @see #setConfigurationManager(ConfigurationManager)
	 * @see privacyModel.PrivacyModelPackage#getPrivacyPolicy_ConfigurationManager()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ConfigurationManager getConfigurationManager();

	/**
	 * Sets the value of the '{@link privacyModel.PrivacyPolicy#getConfigurationManager <em>Configuration Manager</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration Manager</em>' containment reference.
	 * @see #getConfigurationManager()
	 * @generated
	 */
	void setConfigurationManager(ConfigurationManager value);

	/**
	 * Returns the value of the '<em><b>All Datas</b></em>' containment reference list.
	 * The list contents are of type {@link privacyModel.PrivacyData}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Datas</em>' containment reference list.
	 * @see privacyModel.PrivacyModelPackage#getPrivacyPolicy_AllDatas()
	 * @model containment="true"
	 * @generated
	 */
	EList<PrivacyData> getAllDatas();

	/**
	 * Returns the value of the '<em><b>All Complaints</b></em>' containment reference list.
	 * The list contents are of type {@link privacyModel.Complaint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Complaints</em>' containment reference list.
	 * @see privacyModel.PrivacyModelPackage#getPrivacyPolicy_AllComplaints()
	 * @model containment="true"
	 * @generated
	 */
	EList<Complaint> getAllComplaints();

	/**
	 * Returns the value of the '<em><b>Privacy Policy Helper</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Privacy Policy Helper</em>' containment reference.
	 * @see #setPrivacyPolicyHelper(PrivacyPolicyHelper)
	 * @see privacyModel.PrivacyModelPackage#getPrivacyPolicy_PrivacyPolicyHelper()
	 * @model containment="true" required="true"
	 * @generated
	 */
	PrivacyPolicyHelper getPrivacyPolicyHelper();

	/**
	 * Sets the value of the '{@link privacyModel.PrivacyPolicy#getPrivacyPolicyHelper <em>Privacy Policy Helper</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Privacy Policy Helper</em>' containment reference.
	 * @see #getPrivacyPolicyHelper()
	 * @generated
	 */
	void setPrivacyPolicyHelper(PrivacyPolicyHelper value);

	/**
	 * Returns the value of the '<em><b>All Denials</b></em>' containment reference list.
	 * The list contents are of type {@link privacyModel.Denial}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Denials</em>' containment reference list.
	 * @see privacyModel.PrivacyModelPackage#getPrivacyPolicy_AllDenials()
	 * @model containment="true"
	 * @generated
	 */
	EList<Denial> getAllDenials();

	/**
	 * Returns the value of the '<em><b>All Consents</b></em>' containment reference list.
	 * The list contents are of type {@link privacyModel.Consent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Consents</em>' containment reference list.
	 * @see privacyModel.PrivacyModelPackage#getPrivacyPolicy_AllConsents()
	 * @model containment="true"
	 * @generated
	 */
	EList<Consent> getAllConsents();

	/**
	 * Returns the value of the '<em><b>All Documents</b></em>' containment reference list.
	 * The list contents are of type {@link privacyModel.Document}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Documents</em>' containment reference list.
	 * @see privacyModel.PrivacyModelPackage#getPrivacyPolicy_AllDocuments()
	 * @model containment="true"
	 * @generated
	 */
	EList<Document> getAllDocuments();

	/**
	 * Returns the value of the '<em><b>Notifications</b></em>' containment reference list.
	 * The list contents are of type {@link privacyModel.Notification}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notifications</em>' containment reference list.
	 * @see privacyModel.PrivacyModelPackage#getPrivacyPolicy_Notifications()
	 * @model containment="true"
	 * @generated
	 */
	EList<Notification> getNotifications();

	/**
	 * Returns the value of the '<em><b>All Shared Privacy Data</b></em>' containment reference list.
	 * The list contents are of type {@link privacyModel.SharedPrivacyData}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Shared Privacy Data</em>' containment reference list.
	 * @see privacyModel.PrivacyModelPackage#getPrivacyPolicy_AllSharedPrivacyData()
	 * @model containment="true"
	 * @generated
	 */
	EList<SharedPrivacyData> getAllSharedPrivacyData();

} // PrivacyPolicy
