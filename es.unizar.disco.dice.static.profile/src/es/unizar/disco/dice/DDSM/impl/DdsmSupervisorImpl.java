/**
 */
package es.unizar.disco.dice.DDSM.impl;

import es.unizar.disco.dice.DDSM.DDSMPackage;
import es.unizar.disco.dice.DDSM.DdsmSupervisor;

import es.unizar.disco.dice.DDSM.util.DDSMValidator;

import java.util.Map;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ddsm Supervisor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.unizar.disco.dice.DDSM.impl.DdsmSupervisorImpl#getWorkerStartTimeout <em>Worker Start Timeout</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.impl.DdsmSupervisorImpl#getCpuCapacity <em>Cpu Capacity</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.impl.DdsmSupervisorImpl#getMemoryCapacity <em>Memory Capacity</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.impl.DdsmSupervisorImpl#getHeartbeatFrequency <em>Heartbeat Frequency</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DdsmSupervisorImpl extends DdsmInternalComponentImpl implements DdsmSupervisor {
	/**
	 * The default value of the '{@link #getWorkerStartTimeout() <em>Worker Start Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkerStartTimeout()
	 * @generated
	 * @ordered
	 */
	protected static final int WORKER_START_TIMEOUT_EDEFAULT = 120;

	/**
	 * The cached value of the '{@link #getWorkerStartTimeout() <em>Worker Start Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkerStartTimeout()
	 * @generated
	 * @ordered
	 */
	protected int workerStartTimeout = WORKER_START_TIMEOUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getCpuCapacity() <em>Cpu Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpuCapacity()
	 * @generated
	 * @ordered
	 */
	protected static final int CPU_CAPACITY_EDEFAULT = 400;

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
	 * The default value of the '{@link #getMemoryCapacity() <em>Memory Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemoryCapacity()
	 * @generated
	 * @ordered
	 */
	protected static final int MEMORY_CAPACITY_EDEFAULT = 4096;

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
	 * The default value of the '{@link #getHeartbeatFrequency() <em>Heartbeat Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeartbeatFrequency()
	 * @generated
	 * @ordered
	 */
	protected static final int HEARTBEAT_FREQUENCY_EDEFAULT = 5;

	/**
	 * The cached value of the '{@link #getHeartbeatFrequency() <em>Heartbeat Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeartbeatFrequency()
	 * @generated
	 * @ordered
	 */
	protected int heartbeatFrequency = HEARTBEAT_FREQUENCY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DdsmSupervisorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DDSMPackage.Literals.DDSM_SUPERVISOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getWorkerStartTimeout() {
		return workerStartTimeout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorkerStartTimeout(int newWorkerStartTimeout) {
		int oldWorkerStartTimeout = workerStartTimeout;
		workerStartTimeout = newWorkerStartTimeout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DDSMPackage.DDSM_SUPERVISOR__WORKER_START_TIMEOUT, oldWorkerStartTimeout, workerStartTimeout));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DDSMPackage.DDSM_SUPERVISOR__CPU_CAPACITY, oldCpuCapacity, cpuCapacity));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DDSMPackage.DDSM_SUPERVISOR__MEMORY_CAPACITY, oldMemoryCapacity, memoryCapacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHeartbeatFrequency() {
		return heartbeatFrequency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeartbeatFrequency(int newHeartbeatFrequency) {
		int oldHeartbeatFrequency = heartbeatFrequency;
		heartbeatFrequency = newHeartbeatFrequency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DDSMPackage.DDSM_SUPERVISOR__HEARTBEAT_FREQUENCY, oldHeartbeatFrequency, heartbeatFrequency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean SupervisorTypeSlaveNode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DDSMValidator.DIAGNOSTIC_SOURCE,
						 DDSMValidator.DDSM_SUPERVISOR__SUPERVISOR_TYPE_SLAVE_NODE,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SupervisorTypeSlaveNode", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DDSMPackage.DDSM_SUPERVISOR__WORKER_START_TIMEOUT:
				return getWorkerStartTimeout();
			case DDSMPackage.DDSM_SUPERVISOR__CPU_CAPACITY:
				return getCpuCapacity();
			case DDSMPackage.DDSM_SUPERVISOR__MEMORY_CAPACITY:
				return getMemoryCapacity();
			case DDSMPackage.DDSM_SUPERVISOR__HEARTBEAT_FREQUENCY:
				return getHeartbeatFrequency();
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
			case DDSMPackage.DDSM_SUPERVISOR__WORKER_START_TIMEOUT:
				setWorkerStartTimeout((Integer)newValue);
				return;
			case DDSMPackage.DDSM_SUPERVISOR__CPU_CAPACITY:
				setCpuCapacity((Integer)newValue);
				return;
			case DDSMPackage.DDSM_SUPERVISOR__MEMORY_CAPACITY:
				setMemoryCapacity((Integer)newValue);
				return;
			case DDSMPackage.DDSM_SUPERVISOR__HEARTBEAT_FREQUENCY:
				setHeartbeatFrequency((Integer)newValue);
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
			case DDSMPackage.DDSM_SUPERVISOR__WORKER_START_TIMEOUT:
				setWorkerStartTimeout(WORKER_START_TIMEOUT_EDEFAULT);
				return;
			case DDSMPackage.DDSM_SUPERVISOR__CPU_CAPACITY:
				setCpuCapacity(CPU_CAPACITY_EDEFAULT);
				return;
			case DDSMPackage.DDSM_SUPERVISOR__MEMORY_CAPACITY:
				setMemoryCapacity(MEMORY_CAPACITY_EDEFAULT);
				return;
			case DDSMPackage.DDSM_SUPERVISOR__HEARTBEAT_FREQUENCY:
				setHeartbeatFrequency(HEARTBEAT_FREQUENCY_EDEFAULT);
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
			case DDSMPackage.DDSM_SUPERVISOR__WORKER_START_TIMEOUT:
				return workerStartTimeout != WORKER_START_TIMEOUT_EDEFAULT;
			case DDSMPackage.DDSM_SUPERVISOR__CPU_CAPACITY:
				return cpuCapacity != CPU_CAPACITY_EDEFAULT;
			case DDSMPackage.DDSM_SUPERVISOR__MEMORY_CAPACITY:
				return memoryCapacity != MEMORY_CAPACITY_EDEFAULT;
			case DDSMPackage.DDSM_SUPERVISOR__HEARTBEAT_FREQUENCY:
				return heartbeatFrequency != HEARTBEAT_FREQUENCY_EDEFAULT;
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
		result.append(" (workerStartTimeout: ");
		result.append(workerStartTimeout);
		result.append(", cpuCapacity: ");
		result.append(cpuCapacity);
		result.append(", memoryCapacity: ");
		result.append(memoryCapacity);
		result.append(", heartbeatFrequency: ");
		result.append(heartbeatFrequency);
		result.append(')');
		return result.toString();
	}

} //DdsmSupervisorImpl
