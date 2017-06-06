/**
 */
package es.unizar.disco.dice.DTSM.Tez.impl;

import es.unizar.disco.dice.DTSM.Core.impl.CoreDirectAcyclicGraphImpl;

import es.unizar.disco.dice.DTSM.Tez.TezPackage;
import es.unizar.disco.dice.DTSM.Tez.TezScenario;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scenario</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.unizar.disco.dice.DTSM.Tez.impl.TezScenarioImpl#getMaxTaskParalellism <em>Max Task Paralellism</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DTSM.Tez.impl.TezScenarioImpl#getAmVirtualCores <em>Am Virtual Cores</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DTSM.Tez.impl.TezScenarioImpl#getAmMemory <em>Am Memory</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DTSM.Tez.impl.TezScenarioImpl#getTaskVirtualCores <em>Task Virtual Cores</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DTSM.Tez.impl.TezScenarioImpl#getTaskMemory <em>Task Memory</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TezScenarioImpl extends CoreDirectAcyclicGraphImpl implements TezScenario {
	/**
	 * The default value of the '{@link #getMaxTaskParalellism() <em>Max Task Paralellism</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxTaskParalellism()
	 * @generated
	 * @ordered
	 */
	protected static final String MAX_TASK_PARALELLISM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxTaskParalellism() <em>Max Task Paralellism</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxTaskParalellism()
	 * @generated
	 * @ordered
	 */
	protected String maxTaskParalellism = MAX_TASK_PARALELLISM_EDEFAULT;

	/**
	 * The default value of the '{@link #getAmVirtualCores() <em>Am Virtual Cores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmVirtualCores()
	 * @generated
	 * @ordered
	 */
	protected static final String AM_VIRTUAL_CORES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAmVirtualCores() <em>Am Virtual Cores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmVirtualCores()
	 * @generated
	 * @ordered
	 */
	protected String amVirtualCores = AM_VIRTUAL_CORES_EDEFAULT;

	/**
	 * The default value of the '{@link #getAmMemory() <em>Am Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmMemory()
	 * @generated
	 * @ordered
	 */
	protected static final String AM_MEMORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAmMemory() <em>Am Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmMemory()
	 * @generated
	 * @ordered
	 */
	protected String amMemory = AM_MEMORY_EDEFAULT;

	/**
	 * The default value of the '{@link #getTaskVirtualCores() <em>Task Virtual Cores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskVirtualCores()
	 * @generated
	 * @ordered
	 */
	protected static final String TASK_VIRTUAL_CORES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTaskVirtualCores() <em>Task Virtual Cores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskVirtualCores()
	 * @generated
	 * @ordered
	 */
	protected String taskVirtualCores = TASK_VIRTUAL_CORES_EDEFAULT;

	/**
	 * The default value of the '{@link #getTaskMemory() <em>Task Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskMemory()
	 * @generated
	 * @ordered
	 */
	protected static final String TASK_MEMORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTaskMemory() <em>Task Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskMemory()
	 * @generated
	 * @ordered
	 */
	protected String taskMemory = TASK_MEMORY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TezScenarioImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TezPackage.Literals.TEZ_SCENARIO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMaxTaskParalellism() {
		return maxTaskParalellism;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxTaskParalellism(String newMaxTaskParalellism) {
		String oldMaxTaskParalellism = maxTaskParalellism;
		maxTaskParalellism = newMaxTaskParalellism;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TezPackage.TEZ_SCENARIO__MAX_TASK_PARALELLISM, oldMaxTaskParalellism, maxTaskParalellism));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAmVirtualCores() {
		return amVirtualCores;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAmVirtualCores(String newAmVirtualCores) {
		String oldAmVirtualCores = amVirtualCores;
		amVirtualCores = newAmVirtualCores;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TezPackage.TEZ_SCENARIO__AM_VIRTUAL_CORES, oldAmVirtualCores, amVirtualCores));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAmMemory() {
		return amMemory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAmMemory(String newAmMemory) {
		String oldAmMemory = amMemory;
		amMemory = newAmMemory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TezPackage.TEZ_SCENARIO__AM_MEMORY, oldAmMemory, amMemory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTaskVirtualCores() {
		return taskVirtualCores;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTaskVirtualCores(String newTaskVirtualCores) {
		String oldTaskVirtualCores = taskVirtualCores;
		taskVirtualCores = newTaskVirtualCores;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TezPackage.TEZ_SCENARIO__TASK_VIRTUAL_CORES, oldTaskVirtualCores, taskVirtualCores));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTaskMemory() {
		return taskMemory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTaskMemory(String newTaskMemory) {
		String oldTaskMemory = taskMemory;
		taskMemory = newTaskMemory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TezPackage.TEZ_SCENARIO__TASK_MEMORY, oldTaskMemory, taskMemory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TezPackage.TEZ_SCENARIO__MAX_TASK_PARALELLISM:
				return getMaxTaskParalellism();
			case TezPackage.TEZ_SCENARIO__AM_VIRTUAL_CORES:
				return getAmVirtualCores();
			case TezPackage.TEZ_SCENARIO__AM_MEMORY:
				return getAmMemory();
			case TezPackage.TEZ_SCENARIO__TASK_VIRTUAL_CORES:
				return getTaskVirtualCores();
			case TezPackage.TEZ_SCENARIO__TASK_MEMORY:
				return getTaskMemory();
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
			case TezPackage.TEZ_SCENARIO__MAX_TASK_PARALELLISM:
				setMaxTaskParalellism((String)newValue);
				return;
			case TezPackage.TEZ_SCENARIO__AM_VIRTUAL_CORES:
				setAmVirtualCores((String)newValue);
				return;
			case TezPackage.TEZ_SCENARIO__AM_MEMORY:
				setAmMemory((String)newValue);
				return;
			case TezPackage.TEZ_SCENARIO__TASK_VIRTUAL_CORES:
				setTaskVirtualCores((String)newValue);
				return;
			case TezPackage.TEZ_SCENARIO__TASK_MEMORY:
				setTaskMemory((String)newValue);
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
			case TezPackage.TEZ_SCENARIO__MAX_TASK_PARALELLISM:
				setMaxTaskParalellism(MAX_TASK_PARALELLISM_EDEFAULT);
				return;
			case TezPackage.TEZ_SCENARIO__AM_VIRTUAL_CORES:
				setAmVirtualCores(AM_VIRTUAL_CORES_EDEFAULT);
				return;
			case TezPackage.TEZ_SCENARIO__AM_MEMORY:
				setAmMemory(AM_MEMORY_EDEFAULT);
				return;
			case TezPackage.TEZ_SCENARIO__TASK_VIRTUAL_CORES:
				setTaskVirtualCores(TASK_VIRTUAL_CORES_EDEFAULT);
				return;
			case TezPackage.TEZ_SCENARIO__TASK_MEMORY:
				setTaskMemory(TASK_MEMORY_EDEFAULT);
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
			case TezPackage.TEZ_SCENARIO__MAX_TASK_PARALELLISM:
				return MAX_TASK_PARALELLISM_EDEFAULT == null ? maxTaskParalellism != null : !MAX_TASK_PARALELLISM_EDEFAULT.equals(maxTaskParalellism);
			case TezPackage.TEZ_SCENARIO__AM_VIRTUAL_CORES:
				return AM_VIRTUAL_CORES_EDEFAULT == null ? amVirtualCores != null : !AM_VIRTUAL_CORES_EDEFAULT.equals(amVirtualCores);
			case TezPackage.TEZ_SCENARIO__AM_MEMORY:
				return AM_MEMORY_EDEFAULT == null ? amMemory != null : !AM_MEMORY_EDEFAULT.equals(amMemory);
			case TezPackage.TEZ_SCENARIO__TASK_VIRTUAL_CORES:
				return TASK_VIRTUAL_CORES_EDEFAULT == null ? taskVirtualCores != null : !TASK_VIRTUAL_CORES_EDEFAULT.equals(taskVirtualCores);
			case TezPackage.TEZ_SCENARIO__TASK_MEMORY:
				return TASK_MEMORY_EDEFAULT == null ? taskMemory != null : !TASK_MEMORY_EDEFAULT.equals(taskMemory);
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
		result.append(" (maxTaskParalellism: ");
		result.append(maxTaskParalellism);
		result.append(", amVirtualCores: ");
		result.append(amVirtualCores);
		result.append(", amMemory: ");
		result.append(amMemory);
		result.append(", taskVirtualCores: ");
		result.append(taskVirtualCores);
		result.append(", taskMemory: ");
		result.append(taskMemory);
		result.append(')');
		return result.toString();
	}

} //TezScenarioImpl
