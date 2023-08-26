/**
 */
package privacyModel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import privacyModel.PrivacyData;
import privacyModel.PrivacyModelPackage;
import privacyModel.SharedPrivacyData;

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
 *   <li>{@link privacyModel.impl.SharedPrivacyDataImpl#isColllectedFromSubject <em>Colllected From Subject</em>}</li>
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
	 * The default value of the '{@link #isColllectedFromSubject() <em>Colllected From Subject</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isColllectedFromSubject()
	 * @generated
	 * @ordered
	 */
	protected static final boolean COLLLECTED_FROM_SUBJECT_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isColllectedFromSubject() <em>Colllected From Subject</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isColllectedFromSubject()
	 * @generated
	 * @ordered
	 */
	protected boolean colllectedFromSubject = COLLLECTED_FROM_SUBJECT_EDEFAULT;

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
	public boolean isColllectedFromSubject() {
		return colllectedFromSubject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColllectedFromSubject(boolean newColllectedFromSubject) {
		boolean oldColllectedFromSubject = colllectedFromSubject;
		colllectedFromSubject = newColllectedFromSubject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PrivacyModelPackage.SHARED_PRIVACY_DATA__COLLLECTED_FROM_SUBJECT, oldColllectedFromSubject,
					colllectedFromSubject));
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
		case PrivacyModelPackage.SHARED_PRIVACY_DATA__COLLLECTED_FROM_SUBJECT:
			return isColllectedFromSubject();
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
		case PrivacyModelPackage.SHARED_PRIVACY_DATA__COLLLECTED_FROM_SUBJECT:
			setColllectedFromSubject((Boolean) newValue);
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
		case PrivacyModelPackage.SHARED_PRIVACY_DATA__COLLLECTED_FROM_SUBJECT:
			setColllectedFromSubject(COLLLECTED_FROM_SUBJECT_EDEFAULT);
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
		case PrivacyModelPackage.SHARED_PRIVACY_DATA__COLLLECTED_FROM_SUBJECT:
			return colllectedFromSubject != COLLLECTED_FROM_SUBJECT_EDEFAULT;
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
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (additionalProtectionControls: ");
		result.append(additionalProtectionControls);
		result.append(", colllectedFromSubject: ");
		result.append(colllectedFromSubject);
		result.append(", dataSource: ");
		result.append(dataSource);
		result.append(')');
		return result.toString();
	}

} //SharedPrivacyDataImpl
