/**
 */
package com.masdes.dam.Maintenance.impl;

import com.masdes.dam.Basic_Enumeration_Types.StepKind;

import com.masdes.dam.Core.DaStep;

import com.masdes.dam.Core.impl.DaStepImpl;

import com.masdes.dam.Maintenance.DaActivationStep;
import com.masdes.dam.Maintenance.DaAgentGroup;
import com.masdes.dam.Maintenance.MaintenancePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Da Activation Step</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.masdes.dam.Maintenance.impl.DaActivationStepImpl#getKindActS <em>Kind Act S</em>}</li>
 *   <li>{@link com.masdes.dam.Maintenance.impl.DaActivationStepImpl#getPrio <em>Prio</em>}</li>
 *   <li>{@link com.masdes.dam.Maintenance.impl.DaActivationStepImpl#getPreemption <em>Preemption</em>}</li>
 *   <li>{@link com.masdes.dam.Maintenance.impl.DaActivationStepImpl#getFailCause <em>Fail Cause</em>}</li>
 *   <li>{@link com.masdes.dam.Maintenance.impl.DaActivationStepImpl#getAgents <em>Agents</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DaActivationStepImpl extends DaStepImpl implements DaActivationStep {
	/**
	 * The default value of the '{@link #getKindActS() <em>Kind Act S</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKindActS()
	 * @generated
	 * @ordered
	 */
	protected static final StepKind KIND_ACT_S_EDEFAULT = StepKind.ACTIVATION;

	/**
	 * The cached value of the '{@link #getKindActS() <em>Kind Act S</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKindActS()
	 * @generated
	 * @ordered
	 */
	protected StepKind kindActS = KIND_ACT_S_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrio() <em>Prio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrio()
	 * @generated
	 * @ordered
	 */
	protected static final String PRIO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrio() <em>Prio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrio()
	 * @generated
	 * @ordered
	 */
	protected String prio = PRIO_EDEFAULT;

	/**
	 * The default value of the '{@link #getPreemption() <em>Preemption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreemption()
	 * @generated
	 * @ordered
	 */
	protected static final String PREEMPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPreemption() <em>Preemption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreemption()
	 * @generated
	 * @ordered
	 */
	protected String preemption = PREEMPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFailCause() <em>Fail Cause</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailCause()
	 * @generated
	 * @ordered
	 */
	protected EList<DaStep> failCause;

	/**
	 * The cached value of the '{@link #getAgents() <em>Agents</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgents()
	 * @generated
	 * @ordered
	 */
	protected EList<DaAgentGroup> agents;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DaActivationStepImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MaintenancePackage.Literals.DA_ACTIVATION_STEP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StepKind getKindActS() {
		return kindActS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKindActS(StepKind newKindActS) {
		StepKind oldKindActS = kindActS;
		kindActS = newKindActS == null ? KIND_ACT_S_EDEFAULT : newKindActS;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MaintenancePackage.DA_ACTIVATION_STEP__KIND_ACT_S, oldKindActS, kindActS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPrio() {
		return prio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrio(String newPrio) {
		String oldPrio = prio;
		prio = newPrio;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MaintenancePackage.DA_ACTIVATION_STEP__PRIO, oldPrio, prio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPreemption() {
		return preemption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreemption(String newPreemption) {
		String oldPreemption = preemption;
		preemption = newPreemption;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MaintenancePackage.DA_ACTIVATION_STEP__PREEMPTION, oldPreemption, preemption));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DaStep> getFailCause() {
		if (failCause == null) {
			failCause = new EObjectResolvingEList<DaStep>(DaStep.class, this, MaintenancePackage.DA_ACTIVATION_STEP__FAIL_CAUSE);
		}
		return failCause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DaAgentGroup> getAgents() {
		if (agents == null) {
			agents = new EObjectResolvingEList<DaAgentGroup>(DaAgentGroup.class, this, MaintenancePackage.DA_ACTIVATION_STEP__AGENTS);
		}
		return agents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MaintenancePackage.DA_ACTIVATION_STEP__KIND_ACT_S:
				return getKindActS();
			case MaintenancePackage.DA_ACTIVATION_STEP__PRIO:
				return getPrio();
			case MaintenancePackage.DA_ACTIVATION_STEP__PREEMPTION:
				return getPreemption();
			case MaintenancePackage.DA_ACTIVATION_STEP__FAIL_CAUSE:
				return getFailCause();
			case MaintenancePackage.DA_ACTIVATION_STEP__AGENTS:
				return getAgents();
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
			case MaintenancePackage.DA_ACTIVATION_STEP__KIND_ACT_S:
				setKindActS((StepKind)newValue);
				return;
			case MaintenancePackage.DA_ACTIVATION_STEP__PRIO:
				setPrio((String)newValue);
				return;
			case MaintenancePackage.DA_ACTIVATION_STEP__PREEMPTION:
				setPreemption((String)newValue);
				return;
			case MaintenancePackage.DA_ACTIVATION_STEP__FAIL_CAUSE:
				getFailCause().clear();
				getFailCause().addAll((Collection<? extends DaStep>)newValue);
				return;
			case MaintenancePackage.DA_ACTIVATION_STEP__AGENTS:
				getAgents().clear();
				getAgents().addAll((Collection<? extends DaAgentGroup>)newValue);
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
			case MaintenancePackage.DA_ACTIVATION_STEP__KIND_ACT_S:
				setKindActS(KIND_ACT_S_EDEFAULT);
				return;
			case MaintenancePackage.DA_ACTIVATION_STEP__PRIO:
				setPrio(PRIO_EDEFAULT);
				return;
			case MaintenancePackage.DA_ACTIVATION_STEP__PREEMPTION:
				setPreemption(PREEMPTION_EDEFAULT);
				return;
			case MaintenancePackage.DA_ACTIVATION_STEP__FAIL_CAUSE:
				getFailCause().clear();
				return;
			case MaintenancePackage.DA_ACTIVATION_STEP__AGENTS:
				getAgents().clear();
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
			case MaintenancePackage.DA_ACTIVATION_STEP__KIND_ACT_S:
				return kindActS != KIND_ACT_S_EDEFAULT;
			case MaintenancePackage.DA_ACTIVATION_STEP__PRIO:
				return PRIO_EDEFAULT == null ? prio != null : !PRIO_EDEFAULT.equals(prio);
			case MaintenancePackage.DA_ACTIVATION_STEP__PREEMPTION:
				return PREEMPTION_EDEFAULT == null ? preemption != null : !PREEMPTION_EDEFAULT.equals(preemption);
			case MaintenancePackage.DA_ACTIVATION_STEP__FAIL_CAUSE:
				return failCause != null && !failCause.isEmpty();
			case MaintenancePackage.DA_ACTIVATION_STEP__AGENTS:
				return agents != null && !agents.isEmpty();
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
		result.append(" (kindActS: ");
		result.append(kindActS);
		result.append(", prio: ");
		result.append(prio);
		result.append(", preemption: ");
		result.append(preemption);
		result.append(')');
		return result.toString();
	}

} //DaActivationStepImpl
