/**
 */
package es.unizar.disco.dice.dtsm.Storm.impl;

import es.unizar.disco.dice.dtsm.Storm.Nimbus;
import es.unizar.disco.dice.dtsm.Storm.StormPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.uml2.uml.Classifier;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nimbus</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.unizar.disco.dice.dtsm.Storm.impl.NimbusImpl#getTaskTimeout <em>Task Timeout</em>}</li>
 *   <li>{@link es.unizar.disco.dice.dtsm.Storm.impl.NimbusImpl#getSupervisorTimeout <em>Supervisor Timeout</em>}</li>
 *   <li>{@link es.unizar.disco.dice.dtsm.Storm.impl.NimbusImpl#getMonitorFrequency <em>Monitor Frequency</em>}</li>
 *   <li>{@link es.unizar.disco.dice.dtsm.Storm.impl.NimbusImpl#getBase_Classifier <em>Base Classifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NimbusImpl extends MinimalEObjectImpl.Container implements Nimbus {
	/**
	 * The default value of the '{@link #getTaskTimeout() <em>Task Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskTimeout()
	 * @generated
	 * @ordered
	 */
	protected static final int TASK_TIMEOUT_EDEFAULT = 0;

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
	 * The default value of the '{@link #getSupervisorTimeout() <em>Supervisor Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupervisorTimeout()
	 * @generated
	 * @ordered
	 */
	protected static final int SUPERVISOR_TIMEOUT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSupervisorTimeout() <em>Supervisor Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupervisorTimeout()
	 * @generated
	 * @ordered
	 */
	protected int supervisorTimeout = SUPERVISOR_TIMEOUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMonitorFrequency() <em>Monitor Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonitorFrequency()
	 * @generated
	 * @ordered
	 */
	protected static final int MONITOR_FREQUENCY_EDEFAULT = 0;

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
	protected NimbusImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StormPackage.Literals.NIMBUS;
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
			eNotify(new ENotificationImpl(this, Notification.SET, StormPackage.NIMBUS__TASK_TIMEOUT, oldTaskTimeout, taskTimeout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSupervisorTimeout() {
		return supervisorTimeout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupervisorTimeout(int newSupervisorTimeout) {
		int oldSupervisorTimeout = supervisorTimeout;
		supervisorTimeout = newSupervisorTimeout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StormPackage.NIMBUS__SUPERVISOR_TIMEOUT, oldSupervisorTimeout, supervisorTimeout));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StormPackage.NIMBUS__MONITOR_FREQUENCY, oldMonitorFrequency, monitorFrequency));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StormPackage.NIMBUS__BASE_CLASSIFIER, oldBase_Classifier, base_Classifier));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StormPackage.NIMBUS__BASE_CLASSIFIER, oldBase_Classifier, base_Classifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StormPackage.NIMBUS__TASK_TIMEOUT:
				return getTaskTimeout();
			case StormPackage.NIMBUS__SUPERVISOR_TIMEOUT:
				return getSupervisorTimeout();
			case StormPackage.NIMBUS__MONITOR_FREQUENCY:
				return getMonitorFrequency();
			case StormPackage.NIMBUS__BASE_CLASSIFIER:
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
			case StormPackage.NIMBUS__TASK_TIMEOUT:
				setTaskTimeout((Integer)newValue);
				return;
			case StormPackage.NIMBUS__SUPERVISOR_TIMEOUT:
				setSupervisorTimeout((Integer)newValue);
				return;
			case StormPackage.NIMBUS__MONITOR_FREQUENCY:
				setMonitorFrequency((Integer)newValue);
				return;
			case StormPackage.NIMBUS__BASE_CLASSIFIER:
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
			case StormPackage.NIMBUS__TASK_TIMEOUT:
				setTaskTimeout(TASK_TIMEOUT_EDEFAULT);
				return;
			case StormPackage.NIMBUS__SUPERVISOR_TIMEOUT:
				setSupervisorTimeout(SUPERVISOR_TIMEOUT_EDEFAULT);
				return;
			case StormPackage.NIMBUS__MONITOR_FREQUENCY:
				setMonitorFrequency(MONITOR_FREQUENCY_EDEFAULT);
				return;
			case StormPackage.NIMBUS__BASE_CLASSIFIER:
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
			case StormPackage.NIMBUS__TASK_TIMEOUT:
				return taskTimeout != TASK_TIMEOUT_EDEFAULT;
			case StormPackage.NIMBUS__SUPERVISOR_TIMEOUT:
				return supervisorTimeout != SUPERVISOR_TIMEOUT_EDEFAULT;
			case StormPackage.NIMBUS__MONITOR_FREQUENCY:
				return monitorFrequency != MONITOR_FREQUENCY_EDEFAULT;
			case StormPackage.NIMBUS__BASE_CLASSIFIER:
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
		result.append(" (taskTimeout: ");
		result.append(taskTimeout);
		result.append(", supervisorTimeout: ");
		result.append(supervisorTimeout);
		result.append(", monitorFrequency: ");
		result.append(monitorFrequency);
		result.append(')');
		return result.toString();
	}

} //NimbusImpl
