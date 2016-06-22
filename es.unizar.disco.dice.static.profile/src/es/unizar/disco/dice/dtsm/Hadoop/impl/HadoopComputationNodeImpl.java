/**
 */
package es.unizar.disco.dice.dtsm.Hadoop.impl;

import es.unizar.disco.dice.dtsm.Core.impl.CoreComputationNodeImpl;

import es.unizar.disco.dice.dtsm.Hadoop.HadoopComputationNode;
import es.unizar.disco.dice.dtsm.Hadoop.HadoopPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Computation Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.unizar.disco.dice.dtsm.Hadoop.impl.HadoopComputationNodeImpl#getNCores <em>NCores</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HadoopComputationNodeImpl extends CoreComputationNodeImpl implements HadoopComputationNode {
	/**
	 * The cached value of the '{@link #getNCores() <em>NCores</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNCores()
	 * @generated
	 * @ordered
	 */
	protected EList<String> nCores;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HadoopComputationNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HadoopPackage.Literals.HADOOP_COMPUTATION_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getNCores() {
		if (nCores == null) {
			nCores = new EDataTypeUniqueEList<String>(String.class, this, HadoopPackage.HADOOP_COMPUTATION_NODE__NCORES);
		}
		return nCores;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HadoopPackage.HADOOP_COMPUTATION_NODE__NCORES:
				return getNCores();
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
			case HadoopPackage.HADOOP_COMPUTATION_NODE__NCORES:
				getNCores().clear();
				getNCores().addAll((Collection<? extends String>)newValue);
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
			case HadoopPackage.HADOOP_COMPUTATION_NODE__NCORES:
				getNCores().clear();
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
			case HadoopPackage.HADOOP_COMPUTATION_NODE__NCORES:
				return nCores != null && !nCores.isEmpty();
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
		result.append(" (nCores: ");
		result.append(nCores);
		result.append(')');
		return result.toString();
	}

} //HadoopComputationNodeImpl
