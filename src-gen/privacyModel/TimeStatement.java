/**
 */
package privacyModel;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link privacyModel.TimeStatement#getPreposition <em>Preposition</em>}</li>
 *   <li>{@link privacyModel.TimeStatement#getDateTime <em>Date Time</em>}</li>
 * </ul>
 *
 * @see privacyModel.PrivacyModelPackage#getTimeStatement()
 * @model
 * @generated
 */
public interface TimeStatement extends AbstractTime {
	/**
	 * Returns the value of the '<em><b>Preposition</b></em>' attribute.
	 * The literals are from the enumeration {@link privacyModel.TimePreposition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preposition</em>' attribute.
	 * @see privacyModel.TimePreposition
	 * @see #setPreposition(TimePreposition)
	 * @see privacyModel.PrivacyModelPackage#getTimeStatement_Preposition()
	 * @model required="true"
	 * @generated
	 */
	TimePreposition getPreposition();

	/**
	 * Sets the value of the '{@link privacyModel.TimeStatement#getPreposition <em>Preposition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preposition</em>' attribute.
	 * @see privacyModel.TimePreposition
	 * @see #getPreposition()
	 * @generated
	 */
	void setPreposition(TimePreposition value);

	/**
	 * Returns the value of the '<em><b>Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Time</em>' attribute.
	 * @see #setDateTime(Date)
	 * @see privacyModel.PrivacyModelPackage#getTimeStatement_DateTime()
	 * @model required="true"
	 * @generated
	 */
	Date getDateTime();

	/**
	 * Sets the value of the '{@link privacyModel.TimeStatement#getDateTime <em>Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Time</em>' attribute.
	 * @see #getDateTime()
	 * @generated
	 */
	void setDateTime(Date value);

} // TimeStatement
