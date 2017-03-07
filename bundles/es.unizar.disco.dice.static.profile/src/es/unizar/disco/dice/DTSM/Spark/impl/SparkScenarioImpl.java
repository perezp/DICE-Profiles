/**
 */
package es.unizar.disco.dice.DTSM.Spark.impl;

import es.unizar.disco.dice.Basic_Enumeration_Types.Scheduling;
import es.unizar.disco.dice.DTSM.Spark.SparkPackage;
import es.unizar.disco.dice.DTSM.Spark.SparkScenario;
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
 *   <li>{@link es.unizar.disco.dice.DTSM.Spark.impl.SparkScenarioImpl#getNAssignedCores <em>NAssigned Cores</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DTSM.Spark.impl.SparkScenarioImpl#getNAssignedMemory <em>NAssigned Memory</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DTSM.Spark.impl.SparkScenarioImpl#getJobSchedule <em>Job Schedule</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SparkScenarioImpl extends GaScenarioImpl implements SparkScenario {
	/**
	 * The default value of the '{@link #getNAssignedCores() <em>NAssigned Cores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNAssignedCores()
	 * @generated
	 * @ordered
	 */
	protected static final String NASSIGNED_CORES_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getNAssignedCores() <em>NAssigned Cores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNAssignedCores()
	 * @generated
	 * @ordered
	 */
	protected String nAssignedCores = NASSIGNED_CORES_EDEFAULT;
	/**
	 * The default value of the '{@link #getNAssignedMemory() <em>NAssigned Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNAssignedMemory()
	 * @generated
	 * @ordered
	 */
	protected static final String NASSIGNED_MEMORY_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getNAssignedMemory() <em>NAssigned Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNAssignedMemory()
	 * @generated
	 * @ordered
	 */
	protected String nAssignedMemory = NASSIGNED_MEMORY_EDEFAULT;
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
	protected SparkScenarioImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SparkPackage.Literals.SPARK_SCENARIO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNAssignedCores() {
		return nAssignedCores;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNAssignedCores(String newNAssignedCores) {
		String oldNAssignedCores = nAssignedCores;
		nAssignedCores = newNAssignedCores;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SparkPackage.SPARK_SCENARIO__NASSIGNED_CORES, oldNAssignedCores, nAssignedCores));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNAssignedMemory() {
		return nAssignedMemory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNAssignedMemory(String newNAssignedMemory) {
		String oldNAssignedMemory = nAssignedMemory;
		nAssignedMemory = newNAssignedMemory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SparkPackage.SPARK_SCENARIO__NASSIGNED_MEMORY, oldNAssignedMemory, nAssignedMemory));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SparkPackage.SPARK_SCENARIO__JOB_SCHEDULE, oldJobSchedule, jobSchedule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SparkPackage.SPARK_SCENARIO__NASSIGNED_CORES:
				return getNAssignedCores();
			case SparkPackage.SPARK_SCENARIO__NASSIGNED_MEMORY:
				return getNAssignedMemory();
			case SparkPackage.SPARK_SCENARIO__JOB_SCHEDULE:
				return getJobSchedule();
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
			case SparkPackage.SPARK_SCENARIO__NASSIGNED_CORES:
				setNAssignedCores((String)newValue);
				return;
			case SparkPackage.SPARK_SCENARIO__NASSIGNED_MEMORY:
				setNAssignedMemory((String)newValue);
				return;
			case SparkPackage.SPARK_SCENARIO__JOB_SCHEDULE:
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
			case SparkPackage.SPARK_SCENARIO__NASSIGNED_CORES:
				setNAssignedCores(NASSIGNED_CORES_EDEFAULT);
				return;
			case SparkPackage.SPARK_SCENARIO__NASSIGNED_MEMORY:
				setNAssignedMemory(NASSIGNED_MEMORY_EDEFAULT);
				return;
			case SparkPackage.SPARK_SCENARIO__JOB_SCHEDULE:
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
			case SparkPackage.SPARK_SCENARIO__NASSIGNED_CORES:
				return NASSIGNED_CORES_EDEFAULT == null ? nAssignedCores != null : !NASSIGNED_CORES_EDEFAULT.equals(nAssignedCores);
			case SparkPackage.SPARK_SCENARIO__NASSIGNED_MEMORY:
				return NASSIGNED_MEMORY_EDEFAULT == null ? nAssignedMemory != null : !NASSIGNED_MEMORY_EDEFAULT.equals(nAssignedMemory);
			case SparkPackage.SPARK_SCENARIO__JOB_SCHEDULE:
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
		result.append(" (nAssignedCores: ");
		result.append(nAssignedCores);
		result.append(", nAssignedMemory: ");
		result.append(nAssignedMemory);
		result.append(", jobSchedule: ");
		result.append(jobSchedule);
		result.append(')');
		return result.toString();
	}

} //SparkScenarioImpl
