/**
 */
package es.unizar.disco.dice.DTSM.Hadoop.impl;

import es.unizar.disco.dice.Basic_Enumeration_Types.Scheduling;

import es.unizar.disco.dice.DTSM.Hadoop.HadoopPackage;
import es.unizar.disco.dice.DTSM.Hadoop.HadoopScenario;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.papyrus.MARTE.MARTE_AnalysisModel.GQAM.impl.GaScenarioImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scenario</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.unizar.disco.dice.DTSM.Hadoop.impl.HadoopScenarioImpl#getJobSchedule <em>Job Schedule</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HadoopScenarioImpl extends GaScenarioImpl implements HadoopScenario {
	/**
	 * The default value of the '{@link #getJobSchedule() <em>Job Schedule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobSchedule()
	 * @generated
	 * @ordered
	 */
	protected static final Scheduling JOB_SCHEDULE_EDEFAULT = Scheduling.CAPACITY;

	/**
	 * The cached value of the '{@link #getJobSchedule() <em>Job Schedule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobSchedule()
	 * @generated
	 * @ordered
	 */
	protected Scheduling jobSchedule = JOB_SCHEDULE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HadoopScenarioImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HadoopPackage.Literals.HADOOP_SCENARIO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scheduling getJobSchedule() {
		return jobSchedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJobSchedule(Scheduling newJobSchedule) {
		Scheduling oldJobSchedule = jobSchedule;
		jobSchedule = newJobSchedule == null ? JOB_SCHEDULE_EDEFAULT : newJobSchedule;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HadoopPackage.HADOOP_SCENARIO__JOB_SCHEDULE, oldJobSchedule, jobSchedule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HadoopPackage.HADOOP_SCENARIO__JOB_SCHEDULE:
				return getJobSchedule();
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
			case HadoopPackage.HADOOP_SCENARIO__JOB_SCHEDULE:
				setJobSchedule((Scheduling)newValue);
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
			case HadoopPackage.HADOOP_SCENARIO__JOB_SCHEDULE:
				setJobSchedule(JOB_SCHEDULE_EDEFAULT);
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
			case HadoopPackage.HADOOP_SCENARIO__JOB_SCHEDULE:
				return jobSchedule != JOB_SCHEDULE_EDEFAULT;
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
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (jobSchedule: ");
		result.append(jobSchedule);
		result.append(')');
		return result.toString();
	}

} //HadoopScenarioImpl
