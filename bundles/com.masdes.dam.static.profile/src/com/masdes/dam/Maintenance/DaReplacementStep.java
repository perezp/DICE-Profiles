/**
 */
package com.masdes.dam.Maintenance;

import com.masdes.dam.Basic_Enumeration_Types.StepKind;

import com.masdes.dam.Core.DaComponent;
import com.masdes.dam.Core.DaStep;

import com.masdes.dam.Redundancy.DaSpare;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Da Replacement Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.masdes.dam.Maintenance.DaReplacementStep#getKindRepS <em>Kind Rep S</em>}</li>
 *   <li>{@link com.masdes.dam.Maintenance.DaReplacementStep#getReplace <em>Replace</em>}</li>
 *   <li>{@link com.masdes.dam.Maintenance.DaReplacementStep#getWith <em>With</em>}</li>
 * </ul>
 *
 * @see com.masdes.dam.Maintenance.MaintenancePackage#getDaReplacementStep()
 * @model
 * @generated
 */
public interface DaReplacementStep extends DaStep {
	/**
	 * Returns the value of the '<em><b>Kind Rep S</b></em>' attribute.
	 * The default value is <code>"replacement"</code>.
	 * The literals are from the enumeration {@link com.masdes.dam.Basic_Enumeration_Types.StepKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind Rep S</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind Rep S</em>' attribute.
	 * @see com.masdes.dam.Basic_Enumeration_Types.StepKind
	 * @see #setKindRepS(StepKind)
	 * @see com.masdes.dam.Maintenance.MaintenancePackage#getDaReplacementStep_KindRepS()
	 * @model default="replacement" required="true" ordered="false"
	 * @generated
	 */
	StepKind getKindRepS();

	/**
	 * Sets the value of the '{@link com.masdes.dam.Maintenance.DaReplacementStep#getKindRepS <em>Kind Rep S</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind Rep S</em>' attribute.
	 * @see com.masdes.dam.Basic_Enumeration_Types.StepKind
	 * @see #getKindRepS()
	 * @generated
	 */
	void setKindRepS(StepKind value);

	/**
	 * Returns the value of the '<em><b>Replace</b></em>' reference list.
	 * The list contents are of type {@link com.masdes.dam.Core.DaComponent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Replace</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Replace</em>' reference list.
	 * @see com.masdes.dam.Maintenance.MaintenancePackage#getDaReplacementStep_Replace()
	 * @model
	 * @generated
	 */
	EList<DaComponent> getReplace();

	/**
	 * Returns the value of the '<em><b>With</b></em>' reference list.
	 * The list contents are of type {@link com.masdes.dam.Redundancy.DaSpare}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>With</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>With</em>' reference list.
	 * @see com.masdes.dam.Maintenance.MaintenancePackage#getDaReplacementStep_With()
	 * @model
	 * @generated
	 */
	EList<DaSpare> getWith();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.replace.size() = self.with.size()
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean replaceSize(DiagnosticChain diagnostics, Map<Object, Object> context);

} // DaReplacementStep
