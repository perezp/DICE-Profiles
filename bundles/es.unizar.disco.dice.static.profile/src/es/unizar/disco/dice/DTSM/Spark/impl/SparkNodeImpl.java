/**
 */
package es.unizar.disco.dice.DTSM.Spark.impl;

import es.unizar.disco.dice.DTSM.Core.impl.CoreComputationNodeImpl;

import es.unizar.disco.dice.DTSM.Spark.SparkNode;
import es.unizar.disco.dice.DTSM.Spark.SparkPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.unizar.disco.dice.DTSM.Spark.impl.SparkNodeImpl#getParallelize <em>Parallelize</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DTSM.Spark.impl.SparkNodeImpl#getNCores <em>NCores</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DTSM.Spark.impl.SparkNodeImpl#getMemory <em>Memory</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SparkNodeImpl extends CoreComputationNodeImpl implements SparkNode {
	/**
	 * The cached value of the '{@link #getParallelize() <em>Parallelize</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParallelize()
	 * @generated
	 * @ordered
	 */
	protected EList<String> parallelize;
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
	public EList<String> getParallelize() {
		if (parallelize == null) {
			parallelize = new EDataTypeUniqueEList<String>(String.class, this, SparkPackage.SPARK_NODE__PARALLELIZE);
		}
		return parallelize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getNCores() {
		if (nCores == null) {
			nCores = new EDataTypeUniqueEList<String>(String.class, this, SparkPackage.SPARK_NODE__NCORES);
		}
		return nCores;
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
			case SparkPackage.SPARK_NODE__PARALLELIZE:
				return getParallelize();
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
			case SparkPackage.SPARK_NODE__PARALLELIZE:
				getParallelize().clear();
				getParallelize().addAll((Collection<? extends String>)newValue);
				return;
			case SparkPackage.SPARK_NODE__NCORES:
				getNCores().clear();
				getNCores().addAll((Collection<? extends String>)newValue);
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
			case SparkPackage.SPARK_NODE__PARALLELIZE:
				getParallelize().clear();
				return;
			case SparkPackage.SPARK_NODE__NCORES:
				getNCores().clear();
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
			case SparkPackage.SPARK_NODE__PARALLELIZE:
				return parallelize != null && !parallelize.isEmpty();
			case SparkPackage.SPARK_NODE__NCORES:
				return nCores != null && !nCores.isEmpty();
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
		result.append(" (Parallelize: ");
		result.append(parallelize);
		result.append(", nCores: ");
		result.append(nCores);
		result.append(", Memory: ");
		result.append(memory);
		result.append(')');
		return result.toString();
	}

} //SparkNodeImpl
