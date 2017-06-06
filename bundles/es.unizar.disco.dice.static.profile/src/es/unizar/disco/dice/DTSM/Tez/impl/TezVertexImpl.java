/**
 */
package es.unizar.disco.dice.DTSM.Tez.impl;

import es.unizar.disco.dice.DTSM.Core.impl.CoreDAGNodeImpl;

import es.unizar.disco.dice.DTSM.Tez.TezPackage;
import es.unizar.disco.dice.DTSM.Tez.TezVertex;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vertex</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.unizar.disco.dice.DTSM.Tez.impl.TezVertexImpl#getTaskInputSize <em>Task Input Size</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DTSM.Tez.impl.TezVertexImpl#getMinSrcFraction <em>Min Src Fraction</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DTSM.Tez.impl.TezVertexImpl#getMaxScrFraction <em>Max Scr Fraction</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DTSM.Tez.impl.TezVertexImpl#getVirtualCores <em>Virtual Cores</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DTSM.Tez.impl.TezVertexImpl#getMemory <em>Memory</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TezVertexImpl extends CoreDAGNodeImpl implements TezVertex {
	/**
	 * The default value of the '{@link #getTaskInputSize() <em>Task Input Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskInputSize()
	 * @generated
	 * @ordered
	 */
	protected static final String TASK_INPUT_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTaskInputSize() <em>Task Input Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskInputSize()
	 * @generated
	 * @ordered
	 */
	protected String taskInputSize = TASK_INPUT_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinSrcFraction() <em>Min Src Fraction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinSrcFraction()
	 * @generated
	 * @ordered
	 */
	protected static final String MIN_SRC_FRACTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinSrcFraction() <em>Min Src Fraction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinSrcFraction()
	 * @generated
	 * @ordered
	 */
	protected String minSrcFraction = MIN_SRC_FRACTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxScrFraction() <em>Max Scr Fraction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxScrFraction()
	 * @generated
	 * @ordered
	 */
	protected static final String MAX_SCR_FRACTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxScrFraction() <em>Max Scr Fraction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxScrFraction()
	 * @generated
	 * @ordered
	 */
	protected String maxScrFraction = MAX_SCR_FRACTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getVirtualCores() <em>Virtual Cores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVirtualCores()
	 * @generated
	 * @ordered
	 */
	protected static final String VIRTUAL_CORES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVirtualCores() <em>Virtual Cores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVirtualCores()
	 * @generated
	 * @ordered
	 */
	protected String virtualCores = VIRTUAL_CORES_EDEFAULT;

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
	protected TezVertexImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TezPackage.Literals.TEZ_VERTEX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTaskInputSize() {
		return taskInputSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTaskInputSize(String newTaskInputSize) {
		String oldTaskInputSize = taskInputSize;
		taskInputSize = newTaskInputSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TezPackage.TEZ_VERTEX__TASK_INPUT_SIZE, oldTaskInputSize, taskInputSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMinSrcFraction() {
		return minSrcFraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinSrcFraction(String newMinSrcFraction) {
		String oldMinSrcFraction = minSrcFraction;
		minSrcFraction = newMinSrcFraction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TezPackage.TEZ_VERTEX__MIN_SRC_FRACTION, oldMinSrcFraction, minSrcFraction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMaxScrFraction() {
		return maxScrFraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxScrFraction(String newMaxScrFraction) {
		String oldMaxScrFraction = maxScrFraction;
		maxScrFraction = newMaxScrFraction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TezPackage.TEZ_VERTEX__MAX_SCR_FRACTION, oldMaxScrFraction, maxScrFraction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVirtualCores() {
		return virtualCores;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVirtualCores(String newVirtualCores) {
		String oldVirtualCores = virtualCores;
		virtualCores = newVirtualCores;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TezPackage.TEZ_VERTEX__VIRTUAL_CORES, oldVirtualCores, virtualCores));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TezPackage.TEZ_VERTEX__MEMORY, oldMemory, memory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TezPackage.TEZ_VERTEX__TASK_INPUT_SIZE:
				return getTaskInputSize();
			case TezPackage.TEZ_VERTEX__MIN_SRC_FRACTION:
				return getMinSrcFraction();
			case TezPackage.TEZ_VERTEX__MAX_SCR_FRACTION:
				return getMaxScrFraction();
			case TezPackage.TEZ_VERTEX__VIRTUAL_CORES:
				return getVirtualCores();
			case TezPackage.TEZ_VERTEX__MEMORY:
				return getMemory();
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
			case TezPackage.TEZ_VERTEX__TASK_INPUT_SIZE:
				setTaskInputSize((String)newValue);
				return;
			case TezPackage.TEZ_VERTEX__MIN_SRC_FRACTION:
				setMinSrcFraction((String)newValue);
				return;
			case TezPackage.TEZ_VERTEX__MAX_SCR_FRACTION:
				setMaxScrFraction((String)newValue);
				return;
			case TezPackage.TEZ_VERTEX__VIRTUAL_CORES:
				setVirtualCores((String)newValue);
				return;
			case TezPackage.TEZ_VERTEX__MEMORY:
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
			case TezPackage.TEZ_VERTEX__TASK_INPUT_SIZE:
				setTaskInputSize(TASK_INPUT_SIZE_EDEFAULT);
				return;
			case TezPackage.TEZ_VERTEX__MIN_SRC_FRACTION:
				setMinSrcFraction(MIN_SRC_FRACTION_EDEFAULT);
				return;
			case TezPackage.TEZ_VERTEX__MAX_SCR_FRACTION:
				setMaxScrFraction(MAX_SCR_FRACTION_EDEFAULT);
				return;
			case TezPackage.TEZ_VERTEX__VIRTUAL_CORES:
				setVirtualCores(VIRTUAL_CORES_EDEFAULT);
				return;
			case TezPackage.TEZ_VERTEX__MEMORY:
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
			case TezPackage.TEZ_VERTEX__TASK_INPUT_SIZE:
				return TASK_INPUT_SIZE_EDEFAULT == null ? taskInputSize != null : !TASK_INPUT_SIZE_EDEFAULT.equals(taskInputSize);
			case TezPackage.TEZ_VERTEX__MIN_SRC_FRACTION:
				return MIN_SRC_FRACTION_EDEFAULT == null ? minSrcFraction != null : !MIN_SRC_FRACTION_EDEFAULT.equals(minSrcFraction);
			case TezPackage.TEZ_VERTEX__MAX_SCR_FRACTION:
				return MAX_SCR_FRACTION_EDEFAULT == null ? maxScrFraction != null : !MAX_SCR_FRACTION_EDEFAULT.equals(maxScrFraction);
			case TezPackage.TEZ_VERTEX__VIRTUAL_CORES:
				return VIRTUAL_CORES_EDEFAULT == null ? virtualCores != null : !VIRTUAL_CORES_EDEFAULT.equals(virtualCores);
			case TezPackage.TEZ_VERTEX__MEMORY:
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
		result.append(" (taskInputSize: ");
		result.append(taskInputSize);
		result.append(", minSrcFraction: ");
		result.append(minSrcFraction);
		result.append(", maxScrFraction: ");
		result.append(maxScrFraction);
		result.append(", virtualCores: ");
		result.append(virtualCores);
		result.append(", memory: ");
		result.append(memory);
		result.append(')');
		return result.toString();
	}

} //TezVertexImpl
