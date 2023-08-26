/**
 */
package privacyModel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import privacyModel.ComplaintBasedOnData;
import privacyModel.ComplaintBasedOnDataType;
import privacyModel.PrivacyData;
import privacyModel.PrivacyModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Complaint Based On Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link privacyModel.impl.ComplaintBasedOnDataImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link privacyModel.impl.ComplaintBasedOnDataImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComplaintBasedOnDataImpl extends AbstractComplaintImpl implements ComplaintBasedOnData {
	/**
	 * The cached value of the '{@link #getSubject() <em>Subject</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubject()
	 * @generated
	 * @ordered
	 */
	protected EList<PrivacyData> subject;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final ComplaintBasedOnDataType TYPE_EDEFAULT = ComplaintBasedOnDataType.ERASURE;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ComplaintBasedOnDataType type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComplaintBasedOnDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PrivacyModelPackage.Literals.COMPLAINT_BASED_ON_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PrivacyData> getSubject() {
		if (subject == null) {
			subject = new EObjectResolvingEList<PrivacyData>(PrivacyData.class, this,
					PrivacyModelPackage.COMPLAINT_BASED_ON_DATA__SUBJECT);
		}
		return subject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplaintBasedOnDataType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(ComplaintBasedOnDataType newType) {
		ComplaintBasedOnDataType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrivacyModelPackage.COMPLAINT_BASED_ON_DATA__TYPE,
					oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PrivacyModelPackage.COMPLAINT_BASED_ON_DATA__SUBJECT:
			return getSubject();
		case PrivacyModelPackage.COMPLAINT_BASED_ON_DATA__TYPE:
			return getType();
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
		case PrivacyModelPackage.COMPLAINT_BASED_ON_DATA__SUBJECT:
			getSubject().clear();
			getSubject().addAll((Collection<? extends PrivacyData>) newValue);
			return;
		case PrivacyModelPackage.COMPLAINT_BASED_ON_DATA__TYPE:
			setType((ComplaintBasedOnDataType) newValue);
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
		case PrivacyModelPackage.COMPLAINT_BASED_ON_DATA__SUBJECT:
			getSubject().clear();
			return;
		case PrivacyModelPackage.COMPLAINT_BASED_ON_DATA__TYPE:
			setType(TYPE_EDEFAULT);
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
		case PrivacyModelPackage.COMPLAINT_BASED_ON_DATA__SUBJECT:
			return subject != null && !subject.isEmpty();
		case PrivacyModelPackage.COMPLAINT_BASED_ON_DATA__TYPE:
			return type != TYPE_EDEFAULT;
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
		result.append(" (type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //ComplaintBasedOnDataImpl
