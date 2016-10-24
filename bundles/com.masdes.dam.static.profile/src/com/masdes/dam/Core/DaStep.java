/**
 */
package com.masdes.dam.Core;

import com.masdes.dam.Basic_Enumeration_Types.StepKind;

import com.masdes.dam.Complex_Data_Types.DaError;
import com.masdes.dam.Complex_Data_Types.DaFault;

import org.eclipse.emf.common.util.EList;

import org.eclipse.papyrus.MARTE.MARTE_AnalysisModel.GQAM.GaStep;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Da Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.masdes.dam.Core.DaStep#getKind <em>Kind</em>}</li>
 *   <li>{@link com.masdes.dam.Core.DaStep#getError <em>Error</em>}</li>
 *   <li>{@link com.masdes.dam.Core.DaStep#getFault <em>Fault</em>}</li>
 * </ul>
 *
 * @see com.masdes.dam.Core.CorePackage#getDaStep()
 * @model
 * @generated
 */
public interface DaStep extends DaService, GaStep {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link com.masdes.dam.Basic_Enumeration_Types.StepKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see com.masdes.dam.Basic_Enumeration_Types.StepKind
	 * @see #setKind(StepKind)
	 * @see com.masdes.dam.Core.CorePackage#getDaStep_Kind()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	StepKind getKind();

	/**
	 * Sets the value of the '{@link com.masdes.dam.Core.DaStep#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see com.masdes.dam.Basic_Enumeration_Types.StepKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(StepKind value);

	/**
	 * Returns the value of the '<em><b>Error</b></em>' containment reference list.
	 * The list contents are of type {@link com.masdes.dam.Complex_Data_Types.DaError}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error</em>' containment reference list.
	 * @see com.masdes.dam.Core.CorePackage#getDaStep_Error()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<DaError> getError();

	/**
	 * Returns the value of the '<em><b>Fault</b></em>' containment reference list.
	 * The list contents are of type {@link com.masdes.dam.Complex_Data_Types.DaFault}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fault</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fault</em>' containment reference list.
	 * @see com.masdes.dam.Core.CorePackage#getDaStep_Fault()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<DaFault> getFault();

} // DaStep
