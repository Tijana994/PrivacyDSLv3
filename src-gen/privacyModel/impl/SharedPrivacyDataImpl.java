/**
 */
package privacyModel.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import java.util.Map;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import privacyModel.PrivacyData;
import privacyModel.PrivacyModelPackage;
import privacyModel.SharedPrivacyData;
import privacyModel.util.PrivacyModelValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shared Privacy Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link privacyModel.impl.SharedPrivacyDataImpl#getAdditionalProtectionControls <em>Additional Protection Controls</em>}</li>
 *   <li>{@link privacyModel.impl.SharedPrivacyDataImpl#getPrivacydata <em>Privacydata</em>}</li>
 *   <li>{@link privacyModel.impl.SharedPrivacyDataImpl#isCollectedFromSubject <em>Collected From Subject</em>}</li>
 *   <li>{@link privacyModel.impl.SharedPrivacyDataImpl#getDataSource <em>Data Source</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SharedPrivacyDataImpl extends NamedElementImpl implements SharedPrivacyData {
	/**
	 * The cached value of the '{@link #getAdditionalProtectionControls() <em>Additional Protection Controls</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalProtectionControls()
	 * @generated
	 * @ordered
	 */
	protected EList<String> additionalProtectionControls;

	/**
	 * The cached value of the '{@link #getPrivacydata() <em>Privacydata</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrivacydata()
	 * @generated
	 * @ordered
	 */
	protected PrivacyData privacydata;

	/**
	 * The default value of the '{@link #isCollectedFromSubject() <em>Collected From Subject</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCollectedFromSubject()
	 * @generated
	 * @ordered
	 */
	protected static final boolean COLLECTED_FROM_SUBJECT_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isCollectedFromSubject() <em>Collected From Subject</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCollectedFromSubject()
	 * @generated
	 * @ordered
	 */
	protected boolean collectedFromSubject = COLLECTED_FROM_SUBJECT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDataSource() <em>Data Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSource()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_SOURCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataSource() <em>Data Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSource()
	 * @generated
	 * @ordered
	 */
	protected String dataSource = DATA_SOURCE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SharedPrivacyDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PrivacyModelPackage.Literals.SHARED_PRIVACY_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getAdditionalProtectionControls() {
		if (additionalProtectionControls == null) {
			additionalProtectionControls = new EDataTypeUniqueEList<String>(String.class, this,
					PrivacyModelPackage.SHARED_PRIVACY_DATA__ADDITIONAL_PROTECTION_CONTROLS);
		}
		return additionalProtectionControls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrivacyData getPrivacydata() {
		if (privacydata != null && privacydata.eIsProxy()) {
			InternalEObject oldPrivacydata = (InternalEObject) privacydata;
			privacydata = (PrivacyData) eResolveProxy(oldPrivacydata);
			if (privacydata != oldPrivacydata) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							PrivacyModelPackage.SHARED_PRIVACY_DATA__PRIVACYDATA, oldPrivacydata, privacydata));
			}
		}
		return privacydata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrivacyData basicGetPrivacydata() {
		return privacydata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrivacydata(PrivacyData newPrivacydata) {
		PrivacyData oldPrivacydata = privacydata;
		privacydata = newPrivacydata;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrivacyModelPackage.SHARED_PRIVACY_DATA__PRIVACYDATA,
					oldPrivacydata, privacydata));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCollectedFromSubject() {
		return collectedFromSubject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCollectedFromSubject(boolean newCollectedFromSubject) {
		boolean oldCollectedFromSubject = collectedFromSubject;
		collectedFromSubject = newCollectedFromSubject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PrivacyModelPackage.SHARED_PRIVACY_DATA__COLLECTED_FROM_SUBJECT, oldCollectedFromSubject,
					collectedFromSubject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDataSource() {
		return dataSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataSource(String newDataSource) {
		String oldDataSource = dataSource;
		dataSource = newDataSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrivacyModelPackage.SHARED_PRIVACY_DATA__DATA_SOURCE,
					oldDataSource, dataSource));
	}

	/**
	 * The cached validation expression for the '{@link #ProtectionControlShouldExistsInConfiguration(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Protection Control Should Exists In Configuration</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ProtectionControlShouldExistsInConfiguration(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String PROTECTION_CONTROL_SHOULD_EXISTS_IN_CONFIGURATION_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'Protection controls should be defined in configuration.',\n"
			+ "\tstatus : Boolean = \n" + "\t\t\tself.additionalProtectionControls->forAll(protectionControl:String|\n"
			+ "\t\t\t\tPrivacyPolicy.allInstances()->asSequence()->first().privacyPolicyHelper.isPolicyControlValid(protectionControl)\n"
			+ "\t\t\t)\n" + "}.status";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean ProtectionControlShouldExistsInConfiguration(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PrivacyModelValidator.validate(PrivacyModelPackage.Literals.SHARED_PRIVACY_DATA, this, diagnostics,
				context, "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				PrivacyModelPackage.Literals.SHARED_PRIVACY_DATA___PROTECTION_CONTROL_SHOULD_EXISTS_IN_CONFIGURATION__DIAGNOSTICCHAIN_MAP,
				PROTECTION_CONTROL_SHOULD_EXISTS_IN_CONFIGURATION_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION, Diagnostic.ERROR,
				PrivacyModelValidator.DIAGNOSTIC_SOURCE,
				PrivacyModelValidator.SHARED_PRIVACY_DATA__PROTECTION_CONTROL_SHOULD_EXISTS_IN_CONFIGURATION);
	}

	/**
	 * The cached validation expression for the '{@link #DataSourceShouldExistsInConfiguration(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Data Source Should Exists In Configuration</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DataSourceShouldExistsInConfiguration(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_SOURCE_SHOULD_EXISTS_IN_CONFIGURATION_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'Data source should be defined in configuration.',\n" + "\tstatus : Boolean = \n"
			+ "\t\t\tself.dataSource = null or PrivacyPolicy.allInstances()->asSequence()->first().privacyPolicyHelper.isDataSourceValid(self.dataSource)\n"
			+ "}.status";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean DataSourceShouldExistsInConfiguration(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PrivacyModelValidator.validate(PrivacyModelPackage.Literals.SHARED_PRIVACY_DATA, this, diagnostics,
				context, "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				PrivacyModelPackage.Literals.SHARED_PRIVACY_DATA___DATA_SOURCE_SHOULD_EXISTS_IN_CONFIGURATION__DIAGNOSTICCHAIN_MAP,
				DATA_SOURCE_SHOULD_EXISTS_IN_CONFIGURATION_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION, Diagnostic.ERROR,
				PrivacyModelValidator.DIAGNOSTIC_SOURCE,
				PrivacyModelValidator.SHARED_PRIVACY_DATA__DATA_SOURCE_SHOULD_EXISTS_IN_CONFIGURATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PrivacyModelPackage.SHARED_PRIVACY_DATA__ADDITIONAL_PROTECTION_CONTROLS:
			return getAdditionalProtectionControls();
		case PrivacyModelPackage.SHARED_PRIVACY_DATA__PRIVACYDATA:
			if (resolve)
				return getPrivacydata();
			return basicGetPrivacydata();
		case PrivacyModelPackage.SHARED_PRIVACY_DATA__COLLECTED_FROM_SUBJECT:
			return isCollectedFromSubject();
		case PrivacyModelPackage.SHARED_PRIVACY_DATA__DATA_SOURCE:
			return getDataSource();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case PrivacyModelPackage.SHARED_PRIVACY_DATA__ADDITIONAL_PROTECTION_CONTROLS:
			getAdditionalProtectionControls().clear();
			getAdditionalProtectionControls().addAll((Collection<? extends String>) newValue);
			return;
		case PrivacyModelPackage.SHARED_PRIVACY_DATA__PRIVACYDATA:
			setPrivacydata((PrivacyData) newValue);
			return;
		case PrivacyModelPackage.SHARED_PRIVACY_DATA__COLLECTED_FROM_SUBJECT:
			setCollectedFromSubject((Boolean) newValue);
			return;
		case PrivacyModelPackage.SHARED_PRIVACY_DATA__DATA_SOURCE:
			setDataSource((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case PrivacyModelPackage.SHARED_PRIVACY_DATA__ADDITIONAL_PROTECTION_CONTROLS:
			getAdditionalProtectionControls().clear();
			return;
		case PrivacyModelPackage.SHARED_PRIVACY_DATA__PRIVACYDATA:
			setPrivacydata((PrivacyData) null);
			return;
		case PrivacyModelPackage.SHARED_PRIVACY_DATA__COLLECTED_FROM_SUBJECT:
			setCollectedFromSubject(COLLECTED_FROM_SUBJECT_EDEFAULT);
			return;
		case PrivacyModelPackage.SHARED_PRIVACY_DATA__DATA_SOURCE:
			setDataSource(DATA_SOURCE_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case PrivacyModelPackage.SHARED_PRIVACY_DATA__ADDITIONAL_PROTECTION_CONTROLS:
			return additionalProtectionControls != null && !additionalProtectionControls.isEmpty();
		case PrivacyModelPackage.SHARED_PRIVACY_DATA__PRIVACYDATA:
			return privacydata != null;
		case PrivacyModelPackage.SHARED_PRIVACY_DATA__COLLECTED_FROM_SUBJECT:
			return collectedFromSubject != COLLECTED_FROM_SUBJECT_EDEFAULT;
		case PrivacyModelPackage.SHARED_PRIVACY_DATA__DATA_SOURCE:
			return DATA_SOURCE_EDEFAULT == null ? dataSource != null : !DATA_SOURCE_EDEFAULT.equals(dataSource);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case PrivacyModelPackage.SHARED_PRIVACY_DATA___PROTECTION_CONTROL_SHOULD_EXISTS_IN_CONFIGURATION__DIAGNOSTICCHAIN_MAP:
			return ProtectionControlShouldExistsInConfiguration((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case PrivacyModelPackage.SHARED_PRIVACY_DATA___DATA_SOURCE_SHOULD_EXISTS_IN_CONFIGURATION__DIAGNOSTICCHAIN_MAP:
			return DataSourceShouldExistsInConfiguration((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (additionalProtectionControls: ");
		result.append(additionalProtectionControls);
		result.append(", collectedFromSubject: ");
		result.append(collectedFromSubject);
		result.append(", dataSource: ");
		result.append(dataSource);
		result.append(')');
		return result.toString();
	}

} //SharedPrivacyDataImpl
