/**
 */
package privacyModel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import privacyModel.ComplaintBasedOnAction;
import privacyModel.ComplaintBasedOnActionType;
import privacyModel.PolicyStatement;
import privacyModel.PrivacyModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Complaint Based On Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link privacyModel.impl.ComplaintBasedOnActionImpl#getStatement <em>Statement</em>}</li>
 *   <li>{@link privacyModel.impl.ComplaintBasedOnActionImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComplaintBasedOnActionImpl extends AbstractComplaintImpl implements ComplaintBasedOnAction {
	/**
	 * The cached value of the '{@link #getStatement() <em>Statement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatement()
	 * @generated
	 * @ordered
	 */
	protected PolicyStatement statement;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final ComplaintBasedOnActionType TYPE_EDEFAULT = ComplaintBasedOnActionType.OBJECTION;
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ComplaintBasedOnActionType type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComplaintBasedOnActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PrivacyModelPackage.Literals.COMPLAINT_BASED_ON_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolicyStatement getStatement() {
		if (statement != null && statement.eIsProxy()) {
			InternalEObject oldStatement = (InternalEObject) statement;
			statement = (PolicyStatement) eResolveProxy(oldStatement);
			if (statement != oldStatement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							PrivacyModelPackage.COMPLAINT_BASED_ON_ACTION__STATEMENT, oldStatement, statement));
			}
		}
		return statement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolicyStatement basicGetStatement() {
		return statement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatement(PolicyStatement newStatement) {
		PolicyStatement oldStatement = statement;
		statement = newStatement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PrivacyModelPackage.COMPLAINT_BASED_ON_ACTION__STATEMENT, oldStatement, statement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplaintBasedOnActionType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(ComplaintBasedOnActionType newType) {
		ComplaintBasedOnActionType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrivacyModelPackage.COMPLAINT_BASED_ON_ACTION__TYPE,
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
		case PrivacyModelPackage.COMPLAINT_BASED_ON_ACTION__STATEMENT:
			if (resolve)
				return getStatement();
			return basicGetStatement();
		case PrivacyModelPackage.COMPLAINT_BASED_ON_ACTION__TYPE:
			return getType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case PrivacyModelPackage.COMPLAINT_BASED_ON_ACTION__STATEMENT:
			setStatement((PolicyStatement) newValue);
			return;
		case PrivacyModelPackage.COMPLAINT_BASED_ON_ACTION__TYPE:
			setType((ComplaintBasedOnActionType) newValue);
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
		case PrivacyModelPackage.COMPLAINT_BASED_ON_ACTION__STATEMENT:
			setStatement((PolicyStatement) null);
			return;
		case PrivacyModelPackage.COMPLAINT_BASED_ON_ACTION__TYPE:
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
		case PrivacyModelPackage.COMPLAINT_BASED_ON_ACTION__STATEMENT:
			return statement != null;
		case PrivacyModelPackage.COMPLAINT_BASED_ON_ACTION__TYPE:
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

} //ComplaintBasedOnActionImpl
