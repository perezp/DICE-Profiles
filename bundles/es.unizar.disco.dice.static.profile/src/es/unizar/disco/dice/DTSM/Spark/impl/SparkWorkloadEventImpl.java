/**
 */
package es.unizar.disco.dice.DTSM.Spark.impl;

import es.unizar.disco.dice.DTSM.Spark.SparkPackage;
import es.unizar.disco.dice.DTSM.Spark.SparkWorkloadEvent;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.papyrus.MARTE.MARTE_AnalysisModel.GQAM.impl.GaWorkloadEventImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Workload Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.unizar.disco.dice.DTSM.Spark.impl.SparkWorkloadEventImpl#getSparkPopulation <em>Spark Population</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DTSM.Spark.impl.SparkWorkloadEventImpl#getSparkExtDelay <em>Spark Ext Delay</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SparkWorkloadEventImpl extends GaWorkloadEventImpl implements SparkWorkloadEvent {
	/**
	 * The default value of the '{@link #getSparkPopulation() <em>Spark Population</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSparkPopulation()
	 * @generated
	 * @ordered
	 */
	protected static final String SPARK_POPULATION_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getSparkPopulation() <em>Spark Population</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSparkPopulation()
	 * @generated
	 * @ordered
	 */
	protected String sparkPopulation = SPARK_POPULATION_EDEFAULT;
	/**
	 * The default value of the '{@link #getSparkExtDelay() <em>Spark Ext Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSparkExtDelay()
	 * @generated
	 * @ordered
	 */
	protected static final String SPARK_EXT_DELAY_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getSparkExtDelay() <em>Spark Ext Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSparkExtDelay()
	 * @generated
	 * @ordered
	 */
	protected String sparkExtDelay = SPARK_EXT_DELAY_EDEFAULT;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SparkWorkloadEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SparkPackage.Literals.SPARK_WORKLOAD_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSparkPopulation() {
		return sparkPopulation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSparkPopulation(String newSparkPopulation) {
		String oldSparkPopulation = sparkPopulation;
		sparkPopulation = newSparkPopulation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SparkPackage.SPARK_WORKLOAD_EVENT__SPARK_POPULATION, oldSparkPopulation, sparkPopulation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSparkExtDelay() {
		return sparkExtDelay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSparkExtDelay(String newSparkExtDelay) {
		String oldSparkExtDelay = sparkExtDelay;
		sparkExtDelay = newSparkExtDelay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SparkPackage.SPARK_WORKLOAD_EVENT__SPARK_EXT_DELAY, oldSparkExtDelay, sparkExtDelay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SparkPackage.SPARK_WORKLOAD_EVENT__SPARK_POPULATION:
				return getSparkPopulation();
			case SparkPackage.SPARK_WORKLOAD_EVENT__SPARK_EXT_DELAY:
				return getSparkExtDelay();
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
			case SparkPackage.SPARK_WORKLOAD_EVENT__SPARK_POPULATION:
				setSparkPopulation((String)newValue);
				return;
			case SparkPackage.SPARK_WORKLOAD_EVENT__SPARK_EXT_DELAY:
				setSparkExtDelay((String)newValue);
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
			case SparkPackage.SPARK_WORKLOAD_EVENT__SPARK_POPULATION:
				setSparkPopulation(SPARK_POPULATION_EDEFAULT);
				return;
			case SparkPackage.SPARK_WORKLOAD_EVENT__SPARK_EXT_DELAY:
				setSparkExtDelay(SPARK_EXT_DELAY_EDEFAULT);
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
			case SparkPackage.SPARK_WORKLOAD_EVENT__SPARK_POPULATION:
				return SPARK_POPULATION_EDEFAULT == null ? sparkPopulation != null : !SPARK_POPULATION_EDEFAULT.equals(sparkPopulation);
			case SparkPackage.SPARK_WORKLOAD_EVENT__SPARK_EXT_DELAY:
				return SPARK_EXT_DELAY_EDEFAULT == null ? sparkExtDelay != null : !SPARK_EXT_DELAY_EDEFAULT.equals(sparkExtDelay);
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
		result.append(" (sparkPopulation: ");
		result.append(sparkPopulation);
		result.append(", sparkExtDelay: ");
		result.append(sparkExtDelay);
		result.append(')');
		return result.toString();
	}

} //SparkWorkloadEventImpl
