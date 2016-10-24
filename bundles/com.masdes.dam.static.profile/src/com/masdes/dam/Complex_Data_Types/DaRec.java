/**
 */
package com.masdes.dam.Complex_Data_Types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Da Rec</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.masdes.dam.Complex_Data_Types.DaRec#getRate <em>Rate</em>}</li>
 *   <li>{@link com.masdes.dam.Complex_Data_Types.DaRec#getDuration <em>Duration</em>}</li>
 *   <li>{@link com.masdes.dam.Complex_Data_Types.DaRec#getDistribution <em>Distribution</em>}</li>
 *   <li>{@link com.masdes.dam.Complex_Data_Types.DaRec#getCoverageFactor <em>Coverage Factor</em>}</li>
 * </ul>
 *
 * @see com.masdes.dam.Complex_Data_Types.Complex_Data_TypesPackage#getDaRec()
 * @model
 * @generated
 */
public interface DaRec extends EObject {
	/**
	 * Returns the value of the '<em><b>Rate</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rate</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rate</em>' attribute list.
	 * @see com.masdes.dam.Complex_Data_Types.Complex_Data_TypesPackage#getDaRec_Rate()
	 * @model dataType="com.masdes.dam.Basic_Data_Types.DaFrequency" ordered="false"
	 * @generated
	 */
	EList<String> getRate();

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duration</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' attribute list.
	 * @see com.masdes.dam.Complex_Data_Types.Complex_Data_TypesPackage#getDaRec_Duration()
	 * @model dataType="org.eclipse.papyrus.MARTE_Library.BasicNFP_Types.NFP_Duration" ordered="false"
	 * @generated
	 */
	EList<String> getDuration();

	/**
	 * Returns the value of the '<em><b>Distribution</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distribution</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distribution</em>' attribute list.
	 * @see com.masdes.dam.Complex_Data_Types.Complex_Data_TypesPackage#getDaRec_Distribution()
	 * @model dataType="org.eclipse.papyrus.MARTE_Library.BasicNFP_Types.NFP_CommonType" ordered="false"
	 * @generated
	 */
	EList<String> getDistribution();

	/**
	 * Returns the value of the '<em><b>Coverage Factor</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coverage Factor</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coverage Factor</em>' attribute list.
	 * @see com.masdes.dam.Complex_Data_Types.Complex_Data_TypesPackage#getDaRec_CoverageFactor()
	 * @model dataType="org.eclipse.papyrus.MARTE_Library.BasicNFP_Types.NFP_Real" ordered="false"
	 * @generated
	 */
	EList<String> getCoverageFactor();

} // DaRec
