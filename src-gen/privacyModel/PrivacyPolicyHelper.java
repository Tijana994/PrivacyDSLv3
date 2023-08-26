/**
 */
package privacyModel;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Privacy Policy Helper</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see privacyModel.PrivacyModelPackage#getPrivacyPolicyHelper()
 * @model
 * @generated
 */
public interface PrivacyPolicyHelper extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" policyControlRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='PrivacyPolicy.allInstances()-&gt;asSequence()-&gt;first().configurationManager.protectionControlMethods-&gt;exists(q | q = policyControl)'"
	 * @generated
	 */
	boolean isPolicyControlValid(String policyControl);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" dataSourceRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='PrivacyPolicy.allInstances()-&gt;asSequence()-&gt;first().configurationManager.dataSources-&gt;exists(q | q = dataSource)'"
	 * @generated
	 */
	boolean isDataSourceValid(String dataSource);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" time1Required="true" time2Required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='if(time2.oclIsKindOf(TimeStatement)) then\n\t\t\t\t\tlet timestmt : TimeStatement = time2.oclAsType(TimeStatement) in \n\t\t\t\t\tif(timestmt.preposition = TimePreposition::from or timestmt.preposition = TimePreposition::after or timestmt.preposition = TimePreposition::at) then\n\t\t\t\t\t\tareDatesOverlap(time1, timestmt.dateTime)\n\t\t\t\t\telse\n\t\t\t\t\t\tnot(areDatesOverlap(time1, timestmt.dateTime))\n\t\t\t\t\tendif\n\t\t\t\t  else\n\t\t\t\t\tlet interval : TimeInterval = time2.oclAsType(TimeInterval) in\n\t\t\t  \t\tif(interval.start.preposition = TimePreposition::from or interval.start.preposition = TimePreposition::after or interval.start.preposition = TimePreposition::at) then\n\t\t\t\t\t\tareDatesOverlap(time1, interval.start.dateTime) and (not(areDatesOverlap(time1,interval.end.dateTime)))\n\t\t\t\t\telse\n\t\t\t\t\t\tnot(areDatesOverlap(time1, interval.start.dateTime)) and areDatesOverlap(time1, interval.end.dateTime)\n\t\t\t\t\tendif\n\t\t\t\t  endif'"
	 * @generated
	 */
	boolean areIntervalsOverlap(AbstractTime time1, AbstractTime time2);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" timeRequired="true" dateRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\t\tif(time.oclIsKindOf(TimeStatement)) then\n\t\t\t\tlet timestmt : TimeStatement = time.oclAsType(TimeStatement) in \n\t\t\t\t\tif(timestmt.preposition = TimePreposition::from or timestmt.preposition = TimePreposition::after or timestmt.preposition = TimePreposition::at) then\n\t\t\t\t\t\tnot(timestmt.dateTime &lt; date)\n\t\t\t\t\telse \n\t\t\t\t\t\tnot(timestmt.dateTime &gt; date)\n\t\t\t\t\tendif\n\t\t\t\telse\n\t\t\t\tlet interval : TimeInterval = time.oclAsType(TimeInterval) in\n\t\t\t\t\tif(interval.start.preposition = TimePreposition::from or interval.start.preposition = TimePreposition::after) then\n\t\t\t\t\t\tnot(interval.start.dateTime &lt; date) and (not(interval.end.dateTime &lt; date))\n\t\t\t\t\telse \n\t\t\t\t\t\tnot(interval.start.dateTime &gt; date) and (not(interval.end.dateTime &gt; date))\n\t\t\t\t\tendif\n\t\t\t\tendif'"
	 * @generated
	 */
	boolean areDatesOverlap(AbstractTime time, Date date);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" startIntervalRequired="true" finishIntervalRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='if(startInterval.oclIsKindOf(TimeStatement)) then\n\t\t\t\t\tlet timestmt : TimeStatement = startInterval.oclAsType(TimeStatement) in \n\t\t\t\t\tif(timestmt.preposition = TimePreposition::from or timestmt.preposition = TimePreposition::after or timestmt.preposition = TimePreposition::at) then\n\t\t\t\t\t\tisDateBeforeInterval(finishInterval, timestmt.dateTime)\n\t\t\t\t\telse\n\t\t\t\t\t\tnot(isDateBeforeInterval(finishInterval, timestmt.dateTime))\n\t\t\t\t\tendif\n\t\t\t\t  else\n\t\t\t\t\tlet interval : TimeInterval = startInterval.oclAsType(TimeInterval) in\n\t\t\t  \t\tif(interval.start.preposition = TimePreposition::from or interval.start.preposition = TimePreposition::after or interval.start.preposition = TimePreposition::at) then\n\t\t\t\t\t\tisDateBeforeInterval(finishInterval, interval.start.dateTime) and not(isDateBeforeInterval(finishInterval, interval.end.dateTime))\n\t\t\t\t\telse\n\t\t\t\t\t\tnot(isDateBeforeInterval(finishInterval, interval.start.dateTime)) and isDateBeforeInterval(finishInterval, interval.end.dateTime)\n\t\t\t\t\tendif\n\t\t\t\t  endif'"
	 * @generated
	 */
	boolean doesIntervalStartBeforeInterval(AbstractTime startInterval, AbstractTime finishInterval);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" timeRequired="true" dateRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\t\tif(time.oclIsKindOf(TimeStatement)) then\n\t\t\t\tlet timestmt : TimeStatement = time.oclAsType(TimeStatement) in \n\t\t\t\t\tif(timestmt.preposition = TimePreposition::from or timestmt.preposition = TimePreposition::after or timestmt.preposition = TimePreposition::at) then\n\t\t\t\t\t\tdate &lt; timestmt.dateTime\n\t\t\t\t\telse \n\t\t\t\t\t\ttimestmt.dateTime &lt; date\n\t\t\t\t\tendif\n\t\t\t\telse\n\t\t\t\t\tlet interval : TimeInterval = time.oclAsType(TimeInterval) in\n\t\t\t\t\tif(interval.start.preposition = TimePreposition::from or interval.start.preposition = TimePreposition::after) then\n\t\t\t\t\t\tif(interval.start.dateTime &lt; interval.end.dateTime) then\n\t\t\t\t\t\t\tinterval.start.dateTime &gt; date and interval.end.dateTime &gt; date\n\t\t\t\t\t\telse\n\t\t\t\t\t\t\tfalse\n\t\t\t\t\t\tendif\n\t\t\t\t\telse \n\t\t\t\t\t\tif(interval.end.dateTime &lt; interval.start.dateTime) then\n\t\t\t\t\t\t\tinterval.start.dateTime &gt; date and interval.end.dateTime &gt; date\n\t\t\t\t\t\telse\n\t\t\t\t\t\t\tfalse\n\t\t\t\t\t\tendif\n\t\t\t\t\tendif\n\t\t\t\tendif'"
	 * @generated
	 */
	boolean isDateBeforeInterval(AbstractTime time, Date date);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" timeRequired="true" dateRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\t\tif(time.oclIsKindOf(TimeStatement)) then\n\t\t\t\t\tlet timestmt : TimeStatement = time.oclAsType(TimeStatement) in \n\t\t\t\t\tif(timestmt.preposition = TimePreposition::to or timestmt.preposition = TimePreposition::before or timestmt.preposition = TimePreposition::until) then\n\t\t\t\t\t\ttimestmt.dateTime &gt; date\n\t\t\t\t\telse \n\t\t\t\t\t\ttimestmt.dateTime &lt; date\n\t\t\t\t\tendif\n\t\t\t\telse\n\t\t\t\t\tlet interval : TimeInterval = time.oclAsType(TimeInterval) in\n\t\t\t\t\tif(interval.start.preposition = TimePreposition::from or interval.start.preposition = TimePreposition::after) then\n\t\t\t\t\t\tif(interval.start.dateTime &lt; interval.end.dateTime) then\n\t\t\t\t\t\t\tinterval.start.dateTime &lt; date and interval.end.dateTime &lt; date\n\t\t\t\t\t\telse\n\t\t\t\t\t\t\tfalse\n\t\t\t\t\t\tendif\n\t\t\t\t\telse \n\t\t\t\t\t\tif(interval.end.dateTime &lt; interval.start.dateTime) then\n\t\t\t\t\t\t\tinterval.start.dateTime &lt; date and interval.end.dateTime &lt; date\n\t\t\t\t\t\telse\n\t\t\t\t\t\t\tfalse\n\t\t\t\t\t\tendif\n\t\t\t\t\tendif\n\t\t\t\tendif'"
	 * @generated
	 */
	boolean isDateAfterInterval(AbstractTime time, Date date);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" timeRequired="true" dateRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\t\tif(time.oclIsKindOf(TimeStatement)) then\n\t\t\t\t\tlet timestmt : TimeStatement = time.oclAsType(TimeStatement) in \n\t\t\t\t\tif(timestmt.preposition = TimePreposition::at) then\n\t\t\t\t\t\ttimestmt.dateTime = date\n\t\t\t\t\telse if(timestmt.preposition = TimePreposition::to or timestmt.preposition = TimePreposition::before or timestmt.preposition = TimePreposition::until) then\n\t\t\t\t\t\t\tnot(timestmt.dateTime &gt; date)\n\t\t\t\t\t\telse \n\t\t\t\t\t\t\tnot(timestmt.dateTime &lt; date)\n\t\t\t\t\t\tendif\n\t\t\t\t\tendif\n\t\t\t\telse\n\t\t\t\t\tlet interval : TimeInterval = time.oclAsType(TimeInterval) in \n\t\t\t\t\tif(interval.start.preposition = TimePreposition::from or interval.start.preposition = TimePreposition::after) then\n\t\t\t\t\t\tif(interval.start.dateTime &lt; interval.end.dateTime) then\n\t\t\t\t\t\t\tnot(interval.start.dateTime &lt; date) and not(interval.end.dateTime &gt; date)\n\t\t\t\t\t\telse\n\t\t\t\t\t\t\tnot(date &lt; interval.end.dateTime) and not(date &gt; interval.start.dateTime)\n\t\t\t\t\t\tendif\n\t\t\t\t\telse \n\t\t\t\t\t\tif(interval.end.dateTime &lt; interval.start.dateTime) then\n\t\t\t\t\t\t\tnot(interval.end.dateTime &lt; date) and not(interval.start.dateTime &gt; date)\n\t\t\t\t\t\telse\n\t\t\t\t\t\t\tnot(date &lt; interval.start.dateTime) and not(date &gt; interval.end.dateTime)\n\t\t\t\t\t\tendif\n\t\t\t\t\tendif\n\t\t\t\tendif'"
	 * @generated
	 */
	boolean isDateInInterval(AbstractTime time, Date date);

} // PrivacyPolicyHelper
