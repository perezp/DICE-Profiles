/**
 */
package com.masdes.dam.Maintenance;

import com.masdes.dam.Basic_Enumeration_Types.StepKind;

import com.masdes.dam.Core.DaStep;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Da Activation Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.masdes.dam.Maintenance.DaActivationStep#getKindActS <em>Kind Act S</em>}</li>
 *   <li>{@link com.masdes.dam.Maintenance.DaActivationStep#getPrio <em>Prio</em>}</li>
 *   <li>{@link com.masdes.dam.Maintenance.DaActivationStep#getPreemption <em>Preemption</em>}</li>
 *   <li>{@link com.masdes.dam.Maintenance.DaActivationStep#getFailCause <em>Fail Cause</em>}</li>
 *   <li>{@link com.masdes.dam.Maintenance.DaActivationStep#getAgents <em>Agents</em>}</li>
 * </ul>
 *
 * @see com.masdes.dam.Maintenance.MaintenancePackage#getDaActivationStep()
 * @model
 * @generated
 */
public interface DaActivationStep extends DaStep {
	/**
	 * Returns the value of the '<em><b>Kind Act S</b></em>' attribute.
	 * The default value is <code>"activation"</code>.
	 * The literals are from the enumeration {@link com.masdes.dam.Basic_Enumeration_Types.StepKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind Act S</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind Act S</em>' attribute.
	 * @see com.masdes.dam.Basic_Enumeration_Types.StepKind
	 * @see #setKindActS(StepKind)
	 * @see com.masdes.dam.Maintenance.MaintenancePackage#getDaActivationStep_KindActS()
	 * @model default="activation" required="true" ordered="false"
	 * @generated
	 */
	StepKind getKindActS();

	/**
	 * Sets the value of the '{@link com.masdes.dam.Maintenance.DaActivationStep#getKindActS <em>Kind Act S</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind Act S</em>' attribute.
	 * @see com.masdes.dam.Basic_Enumeration_Types.StepKind
	 * @see #getKindActS()
	 * @generated
	 */
	void setKindActS(StepKind value);

	/**
	 * Returns the value of the '<em><b>Prio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prio</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prio</em>' attribute.
	 * @see #setPrio(String)
	 * @see com.masdes.dam.Maintenance.MaintenancePackage#getDaActivationStep_Prio()
	 * @model dataType="org.eclipse.papyrus.MARTE_Library.BasicNFP_Types.NFP_Integer" ordered="false"
	 * @generated
	 */
	String getPrio();

	/**
	 * Sets the value of the '{@link com.masdes.dam.Maintenance.DaActivationStep#getPrio <em>Prio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prio</em>' attribute.
	 * @see #getPrio()
	 * @generated
	 */
	void setPrio(String value);

	/**
	 * Returns the value of the '<em><b>Preemption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Preemption</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preemption</em>' attribute.
	 * @see #setPreemption(String)
	 * @see com.masdes.dam.Maintenance.MaintenancePackage#getDaActivationStep_Preemption()
	 * @model dataType="org.eclipse.papyrus.MARTE_Library.BasicNFP_Types.NFP_Boolean" ordered="false"
	 * @generated
	 */
	String getPreemption();

	/**
	 * Sets the value of the '{@link com.masdes.dam.Maintenance.DaActivationStep#getPreemption <em>Preemption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preemption</em>' attribute.
	 * @see #getPreemption()
	 * @generated
	 */
	void setPreemption(String value);

	/**
	 * Returns the value of the '<em><b>Fail Cause</b></em>' reference list.
	 * The list contents are of type {@link com.masdes.dam.Core.DaStep}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fail Cause</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fail Cause</em>' reference list.
	 * @see com.masdes.dam.Maintenance.MaintenancePackage#getDaActivationStep_FailCause()
	 * @model ordered="false"
	 * @generated
	 */
	EList<DaStep> getFailCause();

	/**
	 * Returns the value of the '<em><b>Agents</b></em>' reference list.
	 * The list contents are of type {@link com.masdes.dam.Maintenance.DaAgentGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Agents</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agents</em>' reference list.
	 * @see com.masdes.dam.Maintenance.MaintenancePackage#getDaActivationStep_Agents()
	 * @model ordered="false"
	 * @generated
	 */
	EList<DaAgentGroup> getAgents();

} // DaActivationStep
