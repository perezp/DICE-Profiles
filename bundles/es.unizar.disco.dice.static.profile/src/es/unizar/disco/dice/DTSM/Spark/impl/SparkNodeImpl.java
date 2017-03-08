/**
 */
package es.unizar.disco.dice.DTSM.Spark.impl;

import es.unizar.disco.dice.DTSM.Core.impl.CoreComputationNodeImpl;

import es.unizar.disco.dice.DTSM.Spark.SparkNode;
import es.unizar.disco.dice.DTSM.Spark.SparkPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.unizar.disco.dice.DTSM.Spark.impl.SparkNodeImpl#getNCores <em>NCores</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DTSM.Spark.impl.SparkNodeImpl#getMemory <em>Memory</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SparkNodeImpl extends CoreComputationNodeImpl implements SparkNode {
	/**
	 * The default value of the '{@link #getNCores() <em>NCores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNCores()
	 * @generated
	 * @ordered
	 */
	protected static final String NCORES_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getNCores() <em>NCores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNCores()
	 * @generated
	 * @ordered
	 */
	protected String nCores = NCORES_EDEFAULT;

	/**
	 * The default value of the '{@link #getMemory() <em>Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemory()
	 * @generated
	 * @ordered
	 */
	protected static final String MEMORY_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getMemory() <em>Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemory()
	 * @generated
	 * @ordered
	 */
	protected String memory = MEMORY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SparkNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SparkPackage.Literals.SPARK_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNCores() {
		return nCores;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNCores(String newNCores) {
		String oldNCores = nCores;
		nCores = newNCores;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SparkPackage.SPARK_NODE__NCORES, oldNCores, nCores));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMemory() {
		return memory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemory(String newMemory) {
		String oldMemory = memory;
		memory = newMemory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SparkPackage.SPARK_NODE__MEMORY, oldMemory, memory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SparkPackage.SPARK_NODE__NCORES:
				return getNCores();
			case SparkPackage.SPARK_NODE__MEMORY:
				return getMemory();
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
			case SparkPackage.SPARK_NODE__NCORES:
				setNCores((String)newValue);
				return;
			case SparkPackage.SPARK_NODE__MEMORY:
				setMemory((String)newValue);
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
			case SparkPackage.SPARK_NODE__NCORES:
				setNCores(NCORES_EDEFAULT);
				return;
			case SparkPackage.SPARK_NODE__MEMORY:
				setMemory(MEMORY_EDEFAULT);
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
			case SparkPackage.SPARK_NODE__NCORES:
				return NCORES_EDEFAULT == null ? nCores != null : !NCORES_EDEFAULT.equals(nCores);
			case SparkPackage.SPARK_NODE__MEMORY:
				return MEMORY_EDEFAULT == null ? memory != null : !MEMORY_EDEFAULT.equals(memory);
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
		result.append(", Memory: ");
		result.append(memory);
		result.append(')');
		return result.toString();
	}

} //SparkNodeImpl
