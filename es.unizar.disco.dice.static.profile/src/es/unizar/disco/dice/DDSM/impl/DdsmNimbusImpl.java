/**
 */
package es.unizar.disco.dice.DDSM.impl;

import es.unizar.disco.dice.DDSM.DDSMPackage;
import es.unizar.disco.dice.DDSM.DdsmNimbus;

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
 * An implementation of the model object '<em><b>Ddsm Nimbus</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.unizar.disco.dice.DDSM.impl.DdsmNimbusImpl#getTaskTimeout <em>Task Timeout</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.impl.DdsmNimbusImpl#getSupervisorFrequency <em>Supervisor Frequency</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.impl.DdsmNimbusImpl#getQueueSize <em>Queue Size</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.impl.DdsmNimbusImpl#getMonitorFrequency <em>Monitor Frequency</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.impl.DdsmNimbusImpl#getRetryTimes <em>Retry Times</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.impl.DdsmNimbusImpl#getRetryInterval <em>Retry Interval</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DdsmNimbusImpl extends DdsmInternalComponentImpl implements DdsmNimbus {
	/**
	 * The default value of the '{@link #getTaskTimeout() <em>Task Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskTimeout()
	 * @generated
	 * @ordered
	 */
	protected static final int TASK_TIMEOUT_EDEFAULT = 60;

	/**
	 * The cached value of the '{@link #getTaskTimeout() <em>Task Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskTimeout()
	 * @generated
	 * @ordered
	 */
	protected int taskTimeout = TASK_TIMEOUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getSupervisorFrequency() <em>Supervisor Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupervisorFrequency()
	 * @generated
	 * @ordered
	 */
	protected static final int SUPERVISOR_FREQUENCY_EDEFAULT = 60;

	/**
	 * The cached value of the '{@link #getSupervisorFrequency() <em>Supervisor Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupervisorFrequency()
	 * @generated
	 * @ordered
	 */
	protected int supervisorFrequency = SUPERVISOR_FREQUENCY_EDEFAULT;

	/**
	 * The default value of the '{@link #getQueueSize() <em>Queue Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueueSize()
	 * @generated
	 * @ordered
	 */
	protected static final int QUEUE_SIZE_EDEFAULT = 10000;

	/**
	 * The cached value of the '{@link #getQueueSize() <em>Queue Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueueSize()
	 * @generated
	 * @ordered
	 */
	protected int queueSize = QUEUE_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMonitorFrequency() <em>Monitor Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonitorFrequency()
	 * @generated
	 * @ordered
	 */
	protected static final int MONITOR_FREQUENCY_EDEFAULT = 40;

	/**
	 * The cached value of the '{@link #getMonitorFrequency() <em>Monitor Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonitorFrequency()
	 * @generated
	 * @ordered
	 */
	protected int monitorFrequency = MONITOR_FREQUENCY_EDEFAULT;

	/**
	 * The default value of the '{@link #getRetryTimes() <em>Retry Times</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetryTimes()
	 * @generated
	 * @ordered
	 */
	protected static final int RETRY_TIMES_EDEFAULT = 5;

	/**
	 * The cached value of the '{@link #getRetryTimes() <em>Retry Times</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetryTimes()
	 * @generated
	 * @ordered
	 */
	protected int retryTimes = RETRY_TIMES_EDEFAULT;

	/**
	 * The default value of the '{@link #getRetryInterval() <em>Retry Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetryInterval()
	 * @generated
	 * @ordered
	 */
	protected static final int RETRY_INTERVAL_EDEFAULT = 2000;

	/**
	 * The cached value of the '{@link #getRetryInterval() <em>Retry Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetryInterval()
	 * @generated
	 * @ordered
	 */
	protected int retryInterval = RETRY_INTERVAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DdsmNimbusImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DDSMPackage.Literals.DDSM_NIMBUS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTaskTimeout() {
		return taskTimeout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTaskTimeout(int newTaskTimeout) {
		int oldTaskTimeout = taskTimeout;
		taskTimeout = newTaskTimeout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DDSMPackage.DDSM_NIMBUS__TASK_TIMEOUT, oldTaskTimeout, taskTimeout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSupervisorFrequency() {
		return supervisorFrequency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupervisorFrequency(int newSupervisorFrequency) {
		int oldSupervisorFrequency = supervisorFrequency;
		supervisorFrequency = newSupervisorFrequency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DDSMPackage.DDSM_NIMBUS__SUPERVISOR_FREQUENCY, oldSupervisorFrequency, supervisorFrequency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getQueueSize() {
		return queueSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQueueSize(int newQueueSize) {
		int oldQueueSize = queueSize;
		queueSize = newQueueSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DDSMPackage.DDSM_NIMBUS__QUEUE_SIZE, oldQueueSize, queueSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMonitorFrequency() {
		return monitorFrequency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMonitorFrequency(int newMonitorFrequency) {
		int oldMonitorFrequency = monitorFrequency;
		monitorFrequency = newMonitorFrequency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DDSMPackage.DDSM_NIMBUS__MONITOR_FREQUENCY, oldMonitorFrequency, monitorFrequency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRetryTimes() {
		return retryTimes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRetryTimes(int newRetryTimes) {
		int oldRetryTimes = retryTimes;
		retryTimes = newRetryTimes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DDSMPackage.DDSM_NIMBUS__RETRY_TIMES, oldRetryTimes, retryTimes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRetryInterval() {
		return retryInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRetryInterval(int newRetryInterval) {
		int oldRetryInterval = retryInterval;
		retryInterval = newRetryInterval;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DDSMPackage.DDSM_NIMBUS__RETRY_INTERVAL, oldRetryInterval, retryInterval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean NimbusTypeMasterNode(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 DDSMValidator.DDSM_NIMBUS__NIMBUS_TYPE_MASTER_NODE,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NimbusTypeMasterNode", EObjectValidator.getObjectLabel(this, context) }),
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
			case DDSMPackage.DDSM_NIMBUS__TASK_TIMEOUT:
				return getTaskTimeout();
			case DDSMPackage.DDSM_NIMBUS__SUPERVISOR_FREQUENCY:
				return getSupervisorFrequency();
			case DDSMPackage.DDSM_NIMBUS__QUEUE_SIZE:
				return getQueueSize();
			case DDSMPackage.DDSM_NIMBUS__MONITOR_FREQUENCY:
				return getMonitorFrequency();
			case DDSMPackage.DDSM_NIMBUS__RETRY_TIMES:
				return getRetryTimes();
			case DDSMPackage.DDSM_NIMBUS__RETRY_INTERVAL:
				return getRetryInterval();
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
			case DDSMPackage.DDSM_NIMBUS__TASK_TIMEOUT:
				setTaskTimeout((Integer)newValue);
				return;
			case DDSMPackage.DDSM_NIMBUS__SUPERVISOR_FREQUENCY:
				setSupervisorFrequency((Integer)newValue);
				return;
			case DDSMPackage.DDSM_NIMBUS__QUEUE_SIZE:
				setQueueSize((Integer)newValue);
				return;
			case DDSMPackage.DDSM_NIMBUS__MONITOR_FREQUENCY:
				setMonitorFrequency((Integer)newValue);
				return;
			case DDSMPackage.DDSM_NIMBUS__RETRY_TIMES:
				setRetryTimes((Integer)newValue);
				return;
			case DDSMPackage.DDSM_NIMBUS__RETRY_INTERVAL:
				setRetryInterval((Integer)newValue);
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
			case DDSMPackage.DDSM_NIMBUS__TASK_TIMEOUT:
				setTaskTimeout(TASK_TIMEOUT_EDEFAULT);
				return;
			case DDSMPackage.DDSM_NIMBUS__SUPERVISOR_FREQUENCY:
				setSupervisorFrequency(SUPERVISOR_FREQUENCY_EDEFAULT);
				return;
			case DDSMPackage.DDSM_NIMBUS__QUEUE_SIZE:
				setQueueSize(QUEUE_SIZE_EDEFAULT);
				return;
			case DDSMPackage.DDSM_NIMBUS__MONITOR_FREQUENCY:
				setMonitorFrequency(MONITOR_FREQUENCY_EDEFAULT);
				return;
			case DDSMPackage.DDSM_NIMBUS__RETRY_TIMES:
				setRetryTimes(RETRY_TIMES_EDEFAULT);
				return;
			case DDSMPackage.DDSM_NIMBUS__RETRY_INTERVAL:
				setRetryInterval(RETRY_INTERVAL_EDEFAULT);
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
			case DDSMPackage.DDSM_NIMBUS__TASK_TIMEOUT:
				return taskTimeout != TASK_TIMEOUT_EDEFAULT;
			case DDSMPackage.DDSM_NIMBUS__SUPERVISOR_FREQUENCY:
				return supervisorFrequency != SUPERVISOR_FREQUENCY_EDEFAULT;
			case DDSMPackage.DDSM_NIMBUS__QUEUE_SIZE:
				return queueSize != QUEUE_SIZE_EDEFAULT;
			case DDSMPackage.DDSM_NIMBUS__MONITOR_FREQUENCY:
				return monitorFrequency != MONITOR_FREQUENCY_EDEFAULT;
			case DDSMPackage.DDSM_NIMBUS__RETRY_TIMES:
				return retryTimes != RETRY_TIMES_EDEFAULT;
			case DDSMPackage.DDSM_NIMBUS__RETRY_INTERVAL:
				return retryInterval != RETRY_INTERVAL_EDEFAULT;
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
		result.append(" (taskTimeout: ");
		result.append(taskTimeout);
		result.append(", supervisorFrequency: ");
		result.append(supervisorFrequency);
		result.append(", queueSize: ");
		result.append(queueSize);
		result.append(", monitorFrequency: ");
		result.append(monitorFrequency);
		result.append(", retryTimes: ");
		result.append(retryTimes);
		result.append(", retryInterval: ");
		result.append(retryInterval);
		result.append(')');
		return result.toString();
	}

} //DdsmNimbusImpl
