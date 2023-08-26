/**
 */
package privacyModel.impl;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import privacyModel.PrivacyModelPackage;
import privacyModel.TimePreposition;
import privacyModel.TimeStatement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link privacyModel.impl.TimeStatementImpl#getPreposition <em>Preposition</em>}</li>
 *   <li>{@link privacyModel.impl.TimeStatementImpl#getDateTime <em>Date Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimeStatementImpl extends AbstractTimeImpl implements TimeStatement {
	/**
	 * The default value of the '{@link #getPreposition() <em>Preposition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreposition()
	 * @generated
	 * @ordered
	 */
	protected static final TimePreposition PREPOSITION_EDEFAULT = TimePreposition.FROM;

	/**
	 * The cached value of the '{@link #getPreposition() <em>Preposition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreposition()
	 * @generated
	 * @ordered
	 */
	protected TimePreposition preposition = PREPOSITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDateTime() <em>Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateTime() <em>Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateTime()
	 * @generated
	 * @ordered
	 */
	protected Date dateTime = DATE_TIME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PrivacyModelPackage.Literals.TIME_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimePreposition getPreposition() {
		return preposition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreposition(TimePreposition newPreposition) {
		TimePreposition oldPreposition = preposition;
		preposition = newPreposition == null ? PREPOSITION_EDEFAULT : newPreposition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrivacyModelPackage.TIME_STATEMENT__PREPOSITION,
					oldPreposition, preposition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDateTime() {
		return dateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateTime(Date newDateTime) {
		Date oldDateTime = dateTime;
		dateTime = newDateTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrivacyModelPackage.TIME_STATEMENT__DATE_TIME,
					oldDateTime, dateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PrivacyModelPackage.TIME_STATEMENT__PREPOSITION:
			return getPreposition();
		case PrivacyModelPackage.TIME_STATEMENT__DATE_TIME:
			return getDateTime();
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
		case PrivacyModelPackage.TIME_STATEMENT__PREPOSITION:
			setPreposition((TimePreposition) newValue);
			return;
		case PrivacyModelPackage.TIME_STATEMENT__DATE_TIME:
			setDateTime((Date) newValue);
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
		case PrivacyModelPackage.TIME_STATEMENT__PREPOSITION:
			setPreposition(PREPOSITION_EDEFAULT);
			return;
		case PrivacyModelPackage.TIME_STATEMENT__DATE_TIME:
			setDateTime(DATE_TIME_EDEFAULT);
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
		case PrivacyModelPackage.TIME_STATEMENT__PREPOSITION:
			return preposition != PREPOSITION_EDEFAULT;
		case PrivacyModelPackage.TIME_STATEMENT__DATE_TIME:
			return DATE_TIME_EDEFAULT == null ? dateTime != null : !DATE_TIME_EDEFAULT.equals(dateTime);
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
		result.append(" (preposition: ");
		result.append(preposition);
		result.append(", dateTime: ");
		result.append(dateTime);
		result.append(')');
		return result.toString();
	}

} //TimeStatementImpl
