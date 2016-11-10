/**
 */
package es.unizar.disco.dice.DTSM.Hadoop.impl;

import es.unizar.disco.dice.DTSM.Hadoop.HadoopPackage;
import es.unizar.disco.dice.DTSM.Hadoop.HadoopWorkloadEvent;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import org.eclipse.papyrus.MARTE.MARTE_AnalysisModel.GQAM.impl.GaWorkloadEventImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Workload Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.unizar.disco.dice.DTSM.Hadoop.impl.HadoopWorkloadEventImpl#getHadoopPopulation <em>Hadoop Population</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DTSM.Hadoop.impl.HadoopWorkloadEventImpl#getHadoopExtDelay <em>Hadoop Ext Delay</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HadoopWorkloadEventImpl extends GaWorkloadEventImpl implements HadoopWorkloadEvent {
	/**
	 * The cached value of the '{@link #getHadoopPopulation() <em>Hadoop Population</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHadoopPopulation()
	 * @generated
	 * @ordered
	 */
	protected EList<String> hadoopPopulation;

	/**
	 * The cached value of the '{@link #getHadoopExtDelay() <em>Hadoop Ext Delay</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHadoopExtDelay()
	 * @generated
	 * @ordered
	 */
	protected EList<String> hadoopExtDelay;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HadoopWorkloadEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HadoopPackage.Literals.HADOOP_WORKLOAD_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getHadoopPopulation() {
		if (hadoopPopulation == null) {
			hadoopPopulation = new EDataTypeUniqueEList<String>(String.class, this, HadoopPackage.HADOOP_WORKLOAD_EVENT__HADOOP_POPULATION);
		}
		return hadoopPopulation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getHadoopExtDelay() {
		if (hadoopExtDelay == null) {
			hadoopExtDelay = new EDataTypeUniqueEList<String>(String.class, this, HadoopPackage.HADOOP_WORKLOAD_EVENT__HADOOP_EXT_DELAY);
		}
		return hadoopExtDelay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HadoopPackage.HADOOP_WORKLOAD_EVENT__HADOOP_POPULATION:
				return getHadoopPopulation();
			case HadoopPackage.HADOOP_WORKLOAD_EVENT__HADOOP_EXT_DELAY:
				return getHadoopExtDelay();
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
			case HadoopPackage.HADOOP_WORKLOAD_EVENT__HADOOP_POPULATION:
				getHadoopPopulation().clear();
				getHadoopPopulation().addAll((Collection<? extends String>)newValue);
				return;
			case HadoopPackage.HADOOP_WORKLOAD_EVENT__HADOOP_EXT_DELAY:
				getHadoopExtDelay().clear();
				getHadoopExtDelay().addAll((Collection<? extends String>)newValue);
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
			case HadoopPackage.HADOOP_WORKLOAD_EVENT__HADOOP_POPULATION:
				getHadoopPopulation().clear();
				return;
			case HadoopPackage.HADOOP_WORKLOAD_EVENT__HADOOP_EXT_DELAY:
				getHadoopExtDelay().clear();
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
			case HadoopPackage.HADOOP_WORKLOAD_EVENT__HADOOP_POPULATION:
				return hadoopPopulation != null && !hadoopPopulation.isEmpty();
			case HadoopPackage.HADOOP_WORKLOAD_EVENT__HADOOP_EXT_DELAY:
				return hadoopExtDelay != null && !hadoopExtDelay.isEmpty();
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
		result.append(" (hadoopPopulation: ");
		result.append(hadoopPopulation);
		result.append(", hadoopExtDelay: ");
		result.append(hadoopExtDelay);
		result.append(')');
		return result.toString();
	}

} //HadoopWorkloadEventImpl
