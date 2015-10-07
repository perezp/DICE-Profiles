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
 * A representation of the model object '<em><b>Da Reallocation Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.masdes.dam.Maintenance.DaReallocationStep#getKindRealS <em>Kind Real S</em>}</li>
 *   <li>{@link com.masdes.dam.Maintenance.DaReallocationStep#getMap <em>Map</em>}</li>
 *   <li>{@link com.masdes.dam.Maintenance.DaReallocationStep#getTo <em>To</em>}</li>
 * </ul>
 *
 * @see com.masdes.dam.Maintenance.MaintenancePackage#getDaReallocationStep()
 * @model
 * @generated
 */
public interface DaReallocationStep extends DaStep {
	/**
	 * Returns the value of the '<em><b>Kind Real S</b></em>' attribute.
	 * The default value is <code>"reallocation"</code>.
	 * The literals are from the enumeration {@link com.masdes.dam.Basic_Enumeration_Types.StepKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind Real S</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind Real S</em>' attribute.
	 * @see com.masdes.dam.Basic_Enumeration_Types.StepKind
	 * @see #setKindRealS(StepKind)
	 * @see com.masdes.dam.Maintenance.MaintenancePackage#getDaReallocationStep_KindRealS()
	 * @model default="reallocation" required="true" ordered="false"
	 * @generated
	 */
	StepKind getKindRealS();

	/**
	 * Sets the value of the '{@link com.masdes.dam.Maintenance.DaReallocationStep#getKindRealS <em>Kind Real S</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind Real S</em>' attribute.
	 * @see com.masdes.dam.Basic_Enumeration_Types.StepKind
	 * @see #getKindRealS()
	 * @generated
	 */
	void setKindRealS(StepKind value);

	/**
	 * Returns the value of the '<em><b>Map</b></em>' reference list.
	 * The list contents are of type {@link com.masdes.dam.Core.DaComponent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Map</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Map</em>' reference list.
	 * @see com.masdes.dam.Maintenance.MaintenancePackage#getDaReallocationStep_Map()
	 * @model
	 * @generated
	 */
	EList<DaComponent> getMap();

	/**
	 * Returns the value of the '<em><b>To</b></em>' reference list.
	 * The list contents are of type {@link com.masdes.dam.Redundancy.DaSpare}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference list.
	 * @see com.masdes.dam.Maintenance.MaintenancePackage#getDaReallocationStep_To()
	 * @model
	 * @generated
	 */
	EList<DaSpare> getTo();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.map.size() = self.to.size()
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean mapSize(DiagnosticChain diagnostics, Map<Object, Object> context);

} // DaReallocationStep
