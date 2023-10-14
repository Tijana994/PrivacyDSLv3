/**
 */
package privacyModel;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shared Privacy Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link privacyModel.SharedPrivacyData#getAdditionalProtectionControls <em>Additional Protection Controls</em>}</li>
 *   <li>{@link privacyModel.SharedPrivacyData#getPrivacydata <em>Privacydata</em>}</li>
 *   <li>{@link privacyModel.SharedPrivacyData#isColllectedFromSubject <em>Colllected From Subject</em>}</li>
 *   <li>{@link privacyModel.SharedPrivacyData#getDataSource <em>Data Source</em>}</li>
 * </ul>
 *
 * @see privacyModel.PrivacyModelPackage#getSharedPrivacyData()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='DataSourceShouldExistsInConfiguration'"
 * @generated
 */
public interface SharedPrivacyData extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Additional Protection Controls</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additional Protection Controls</em>' attribute list.
	 * @see privacyModel.PrivacyModelPackage#getSharedPrivacyData_AdditionalProtectionControls()
	 * @model
	 * @generated
	 */
	EList<String> getAdditionalProtectionControls();

	/**
	 * Returns the value of the '<em><b>Privacydata</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Privacydata</em>' reference.
	 * @see #setPrivacydata(PrivacyData)
	 * @see privacyModel.PrivacyModelPackage#getSharedPrivacyData_Privacydata()
	 * @model required="true"
	 * @generated
	 */
	PrivacyData getPrivacydata();

	/**
	 * Sets the value of the '{@link privacyModel.SharedPrivacyData#getPrivacydata <em>Privacydata</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Privacydata</em>' reference.
	 * @see #getPrivacydata()
	 * @generated
	 */
	void setPrivacydata(PrivacyData value);

	/**
	 * Returns the value of the '<em><b>Colllected From Subject</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Colllected From Subject</em>' attribute.
	 * @see #setColllectedFromSubject(boolean)
	 * @see privacyModel.PrivacyModelPackage#getSharedPrivacyData_ColllectedFromSubject()
	 * @model default="true" required="true"
	 * @generated
	 */
	boolean isColllectedFromSubject();

	/**
	 * Sets the value of the '{@link privacyModel.SharedPrivacyData#isColllectedFromSubject <em>Colllected From Subject</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Colllected From Subject</em>' attribute.
	 * @see #isColllectedFromSubject()
	 * @generated
	 */
	void setColllectedFromSubject(boolean value);

	/**
	 * Returns the value of the '<em><b>Data Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Source</em>' attribute.
	 * @see #setDataSource(String)
	 * @see privacyModel.PrivacyModelPackage#getSharedPrivacyData_DataSource()
	 * @model
	 * @generated
	 */
	String getDataSource();

	/**
	 * Sets the value of the '{@link privacyModel.SharedPrivacyData#getDataSource <em>Data Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Source</em>' attribute.
	 * @see #getDataSource()
	 * @generated
	 */
	void setDataSource(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'Protection controls should be defined in configuration.\',\n\tstatus : Boolean = \n\t\t\tself.additionalProtectionControls-&gt;forAll(protectionControl:String|\n\t\t\t\tPrivacyPolicy.allInstances()-&gt;asSequence()-&gt;first().privacyPolicyHelper.isPolicyControlValid(protectionControl)\n\t\t\t)\n}.status'"
	 * @generated
	 */
	boolean ProtectionControlShouldExistsInConfiguration(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'Data source should be defined in configuration.\',\n\tstatus : Boolean = \n\t\t\tself.dataSource = null or PrivacyPolicy.allInstances()-&gt;asSequence()-&gt;first().privacyPolicyHelper.isDataSourceValid(self.dataSource)\n}.status'"
	 * @generated
	 */
	boolean DataSourceShouldExistsInConfiguration(DiagnosticChain diagnostics, Map<Object, Object> context);

} // SharedPrivacyData
