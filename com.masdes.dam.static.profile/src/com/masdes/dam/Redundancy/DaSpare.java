/**
 */
package com.masdes.dam.Redundancy;

import com.masdes.dam.Core.DaComponent;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Da Spare</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.masdes.dam.Redundancy.DaSpare#getDormancyFactor <em>Dormancy Factor</em>}</li>
 *   <li>{@link com.masdes.dam.Redundancy.DaSpare#getSubstituteFor <em>Substitute For</em>}</li>
 * </ul>
 *
 * @see com.masdes.dam.Redundancy.RedundancyPackage#getDaSpare()
 * @model
 * @generated
 */
public interface DaSpare extends DaComponent {
	/**
	 * Returns the value of the '<em><b>Dormancy Factor</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dormancy Factor</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dormancy Factor</em>' attribute list.
	 * @see com.masdes.dam.Redundancy.RedundancyPackage#getDaSpare_DormancyFactor()
	 * @model dataType="org.eclipse.papyrus.MARTE_Library.BasicNFP_Types.NFP_Real" ordered="false"
	 * @generated
	 */
	EList<String> getDormancyFactor();

	/**
	 * Returns the value of the '<em><b>Substitute For</b></em>' reference list.
	 * The list contents are of type {@link com.masdes.dam.Core.DaComponent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Substitute For</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Substitute For</em>' reference list.
	 * @see com.masdes.dam.Redundancy.RedundancyPackage#getDaSpare_SubstituteFor()
	 * @model ordered="false"
	 * @generated
	 */
	EList<DaComponent> getSubstituteFor();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.substituteFor.excludes(self.oclAsType(DaComponent))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean excludeSelfElement(DiagnosticChain diagnostics, Map<Object, Object> context);

} // DaSpare
