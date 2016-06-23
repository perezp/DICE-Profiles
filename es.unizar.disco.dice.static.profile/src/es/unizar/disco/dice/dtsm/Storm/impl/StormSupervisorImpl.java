/**
 */
package es.unizar.disco.dice.dtsm.Storm.impl;

import es.unizar.disco.dice.dtsm.Storm.StormPackage;
import es.unizar.disco.dice.dtsm.Storm.StormSupervisor;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.uml2.uml.Classifier;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Supervisor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.unizar.disco.dice.dtsm.Storm.impl.StormSupervisorImpl#getMonitroFrequency <em>Monitro Frequency</em>}</li>
 *   <li>{@link es.unizar.disco.dice.dtsm.Storm.impl.StormSupervisorImpl#getWorkerSatrtTimeout <em>Worker Satrt Timeout</em>}</li>
 *   <li>{@link es.unizar.disco.dice.dtsm.Storm.impl.StormSupervisorImpl#getWorkerTimeout <em>Worker Timeout</em>}</li>
 *   <li>{@link es.unizar.disco.dice.dtsm.Storm.impl.StormSupervisorImpl#getHeartbrackFrequency <em>Heartbrack Frequency</em>}</li>
 *   <li>{@link es.unizar.disco.dice.dtsm.Storm.impl.StormSupervisorImpl#getMemoryCapacity <em>Memory Capacity</em>}</li>
 *   <li>{@link es.unizar.disco.dice.dtsm.Storm.impl.StormSupervisorImpl#getCpuCapacity <em>Cpu Capacity</em>}</li>
 *   <li>{@link es.unizar.disco.dice.dtsm.Storm.impl.StormSupervisorImpl#getBase_Classifier <em>Base Classifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StormSupervisorImpl extends MinimalEObjectImpl.Container implements StormSupervisor {
	/**
	 * The default value of the '{@link #getMonitroFrequency() <em>Monitro Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonitroFrequency()
	 * @generated
	 * @ordered
	 */
	protected static final int MONITRO_FREQUENCY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMonitroFrequency() <em>Monitro Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonitroFrequency()
	 * @generated
	 * @ordered
	 */
	protected int monitroFrequency = MONITRO_FREQUENCY_EDEFAULT;

	/**
	 * The default value of the '{@link #getWorkerSatrtTimeout() <em>Worker Satrt Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkerSatrtTimeout()
	 * @generated
	 * @ordered
	 */
	protected static final int WORKER_SATRT_TIMEOUT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getWorkerSatrtTimeout() <em>Worker Satrt Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkerSatrtTimeout()
	 * @generated
	 * @ordered
	 */
	protected int workerSatrtTimeout = WORKER_SATRT_TIMEOUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getWorkerTimeout() <em>Worker Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkerTimeout()
	 * @generated
	 * @ordered
	 */
	protected static final int WORKER_TIMEOUT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getWorkerTimeout() <em>Worker Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkerTimeout()
	 * @generated
	 * @ordered
	 */
	protected int workerTimeout = WORKER_TIMEOUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeartbrackFrequency() <em>Heartbrack Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeartbrackFrequency()
	 * @generated
	 * @ordered
	 */
	protected static final int HEARTBRACK_FREQUENCY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getHeartbrackFrequency() <em>Heartbrack Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeartbrackFrequency()
	 * @generated
	 * @ordered
	 */
	protected int heartbrackFrequency = HEARTBRACK_FREQUENCY_EDEFAULT;

	/**
	 * The default value of the '{@link #getMemoryCapacity() <em>Memory Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemoryCapacity()
	 * @generated
	 * @ordered
	 */
	protected static final int MEMORY_CAPACITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMemoryCapacity() <em>Memory Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemoryCapacity()
	 * @generated
	 * @ordered
	 */
	protected int memoryCapacity = MEMORY_CAPACITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getCpuCapacity() <em>Cpu Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpuCapacity()
	 * @generated
	 * @ordered
	 */
	protected static final int CPU_CAPACITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCpuCapacity() <em>Cpu Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpuCapacity()
	 * @generated
	 * @ordered
	 */
	protected int cpuCapacity = CPU_CAPACITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBase_Classifier() <em>Base Classifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Classifier()
	 * @generated
	 * @ordered
	 */
	protected Classifier base_Classifier;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StormSupervisorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StormPackage.Literals.STORM_SUPERVISOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMonitroFrequency() {
		return monitroFrequency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMonitroFrequency(int newMonitroFrequency) {
		int oldMonitroFrequency = monitroFrequency;
		monitroFrequency = newMonitroFrequency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StormPackage.STORM_SUPERVISOR__MONITRO_FREQUENCY, oldMonitroFrequency, monitroFrequency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getWorkerSatrtTimeout() {
		return workerSatrtTimeout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorkerSatrtTimeout(int newWorkerSatrtTimeout) {
		int oldWorkerSatrtTimeout = workerSatrtTimeout;
		workerSatrtTimeout = newWorkerSatrtTimeout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StormPackage.STORM_SUPERVISOR__WORKER_SATRT_TIMEOUT, oldWorkerSatrtTimeout, workerSatrtTimeout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getWorkerTimeout() {
		return workerTimeout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorkerTimeout(int newWorkerTimeout) {
		int oldWorkerTimeout = workerTimeout;
		workerTimeout = newWorkerTimeout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StormPackage.STORM_SUPERVISOR__WORKER_TIMEOUT, oldWorkerTimeout, workerTimeout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHeartbrackFrequency() {
		return heartbrackFrequency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeartbrackFrequency(int newHeartbrackFrequency) {
		int oldHeartbrackFrequency = heartbrackFrequency;
		heartbrackFrequency = newHeartbrackFrequency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StormPackage.STORM_SUPERVISOR__HEARTBRACK_FREQUENCY, oldHeartbrackFrequency, heartbrackFrequency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMemoryCapacity() {
		return memoryCapacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemoryCapacity(int newMemoryCapacity) {
		int oldMemoryCapacity = memoryCapacity;
		memoryCapacity = newMemoryCapacity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StormPackage.STORM_SUPERVISOR__MEMORY_CAPACITY, oldMemoryCapacity, memoryCapacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCpuCapacity() {
		return cpuCapacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCpuCapacity(int newCpuCapacity) {
		int oldCpuCapacity = cpuCapacity;
		cpuCapacity = newCpuCapacity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StormPackage.STORM_SUPERVISOR__CPU_CAPACITY, oldCpuCapacity, cpuCapacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier getBase_Classifier() {
		if (base_Classifier != null && base_Classifier.eIsProxy()) {
			InternalEObject oldBase_Classifier = (InternalEObject)base_Classifier;
			base_Classifier = (Classifier)eResolveProxy(oldBase_Classifier);
			if (base_Classifier != oldBase_Classifier) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StormPackage.STORM_SUPERVISOR__BASE_CLASSIFIER, oldBase_Classifier, base_Classifier));
			}
		}
		return base_Classifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier basicGetBase_Classifier() {
		return base_Classifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Classifier(Classifier newBase_Classifier) {
		Classifier oldBase_Classifier = base_Classifier;
		base_Classifier = newBase_Classifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StormPackage.STORM_SUPERVISOR__BASE_CLASSIFIER, oldBase_Classifier, base_Classifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StormPackage.STORM_SUPERVISOR__MONITRO_FREQUENCY:
				return getMonitroFrequency();
			case StormPackage.STORM_SUPERVISOR__WORKER_SATRT_TIMEOUT:
				return getWorkerSatrtTimeout();
			case StormPackage.STORM_SUPERVISOR__WORKER_TIMEOUT:
				return getWorkerTimeout();
			case StormPackage.STORM_SUPERVISOR__HEARTBRACK_FREQUENCY:
				return getHeartbrackFrequency();
			case StormPackage.STORM_SUPERVISOR__MEMORY_CAPACITY:
				return getMemoryCapacity();
			case StormPackage.STORM_SUPERVISOR__CPU_CAPACITY:
				return getCpuCapacity();
			case StormPackage.STORM_SUPERVISOR__BASE_CLASSIFIER:
				if (resolve) return getBase_Classifier();
				return basicGetBase_Classifier();
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
			case StormPackage.STORM_SUPERVISOR__MONITRO_FREQUENCY:
				setMonitroFrequency((Integer)newValue);
				return;
			case StormPackage.STORM_SUPERVISOR__WORKER_SATRT_TIMEOUT:
				setWorkerSatrtTimeout((Integer)newValue);
				return;
			case StormPackage.STORM_SUPERVISOR__WORKER_TIMEOUT:
				setWorkerTimeout((Integer)newValue);
				return;
			case StormPackage.STORM_SUPERVISOR__HEARTBRACK_FREQUENCY:
				setHeartbrackFrequency((Integer)newValue);
				return;
			case StormPackage.STORM_SUPERVISOR__MEMORY_CAPACITY:
				setMemoryCapacity((Integer)newValue);
				return;
			case StormPackage.STORM_SUPERVISOR__CPU_CAPACITY:
				setCpuCapacity((Integer)newValue);
				return;
			case StormPackage.STORM_SUPERVISOR__BASE_CLASSIFIER:
				setBase_Classifier((Classifier)newValue);
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
			case StormPackage.STORM_SUPERVISOR__MONITRO_FREQUENCY:
				setMonitroFrequency(MONITRO_FREQUENCY_EDEFAULT);
				return;
			case StormPackage.STORM_SUPERVISOR__WORKER_SATRT_TIMEOUT:
				setWorkerSatrtTimeout(WORKER_SATRT_TIMEOUT_EDEFAULT);
				return;
			case StormPackage.STORM_SUPERVISOR__WORKER_TIMEOUT:
				setWorkerTimeout(WORKER_TIMEOUT_EDEFAULT);
				return;
			case StormPackage.STORM_SUPERVISOR__HEARTBRACK_FREQUENCY:
				setHeartbrackFrequency(HEARTBRACK_FREQUENCY_EDEFAULT);
				return;
			case StormPackage.STORM_SUPERVISOR__MEMORY_CAPACITY:
				setMemoryCapacity(MEMORY_CAPACITY_EDEFAULT);
				return;
			case StormPackage.STORM_SUPERVISOR__CPU_CAPACITY:
				setCpuCapacity(CPU_CAPACITY_EDEFAULT);
				return;
			case StormPackage.STORM_SUPERVISOR__BASE_CLASSIFIER:
				setBase_Classifier((Classifier)null);
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
			case StormPackage.STORM_SUPERVISOR__MONITRO_FREQUENCY:
				return monitroFrequency != MONITRO_FREQUENCY_EDEFAULT;
			case StormPackage.STORM_SUPERVISOR__WORKER_SATRT_TIMEOUT:
				return workerSatrtTimeout != WORKER_SATRT_TIMEOUT_EDEFAULT;
			case StormPackage.STORM_SUPERVISOR__WORKER_TIMEOUT:
				return workerTimeout != WORKER_TIMEOUT_EDEFAULT;
			case StormPackage.STORM_SUPERVISOR__HEARTBRACK_FREQUENCY:
				return heartbrackFrequency != HEARTBRACK_FREQUENCY_EDEFAULT;
			case StormPackage.STORM_SUPERVISOR__MEMORY_CAPACITY:
				return memoryCapacity != MEMORY_CAPACITY_EDEFAULT;
			case StormPackage.STORM_SUPERVISOR__CPU_CAPACITY:
				return cpuCapacity != CPU_CAPACITY_EDEFAULT;
			case StormPackage.STORM_SUPERVISOR__BASE_CLASSIFIER:
				return base_Classifier != null;
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
		result.append(" (monitroFrequency: ");
		result.append(monitroFrequency);
		result.append(", workerSatrtTimeout: ");
		result.append(workerSatrtTimeout);
		result.append(", workerTimeout: ");
		result.append(workerTimeout);
		result.append(", heartbrackFrequency: ");
		result.append(heartbrackFrequency);
		result.append(", memoryCapacity: ");
		result.append(memoryCapacity);
		result.append(", cpuCapacity: ");
		result.append(cpuCapacity);
		result.append(')');
		return result.toString();
	}

} //StormSupervisorImpl
