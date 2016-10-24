/**
 */
package com.masdes.dam.Redundancy;

import com.masdes.dam.Core.DaComponent;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Da Adjudicator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.masdes.dam.Redundancy.DaAdjudicator#getErrorDetecCoverage <em>Error Detec Coverage</em>}</li>
 * </ul>
 *
 * @see com.masdes.dam.Redundancy.RedundancyPackage#getDaAdjudicator()
 * @model
 * @generated
 */
public interface DaAdjudicator extends DaComponent {
	/**
	 * Returns the value of the '<em><b>Error Detec Coverage</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error Detec Coverage</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error Detec Coverage</em>' attribute list.
	 * @see com.masdes.dam.Redundancy.RedundancyPackage#getDaAdjudicator_ErrorDetecCoverage()
	 * @model dataType="org.eclipse.papyrus.MARTE_Library.BasicNFP_Types.NFP_Percentage" ordered="false"
	 * @generated
	 */
	EList<String> getErrorDetecCoverage();

} // DaAdjudicator
