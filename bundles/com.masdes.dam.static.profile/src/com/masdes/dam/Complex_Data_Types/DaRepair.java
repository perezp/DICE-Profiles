/**
 */
package com.masdes.dam.Complex_Data_Types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Da Repair</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.masdes.dam.Complex_Data_Types.DaRepair#getRate <em>Rate</em>}</li>
 *   <li>{@link com.masdes.dam.Complex_Data_Types.DaRepair#getMTTR <em>MTTR</em>}</li>
 *   <li>{@link com.masdes.dam.Complex_Data_Types.DaRepair#getDistribution <em>Distribution</em>}</li>
 * </ul>
 *
 * @see com.masdes.dam.Complex_Data_Types.Complex_Data_TypesPackage#getDaRepair()
 * @model
 * @generated
 */
public interface DaRepair extends EObject {
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
	 * @see com.masdes.dam.Complex_Data_Types.Complex_Data_TypesPackage#getDaRepair_Rate()
	 * @model dataType="com.masdes.dam.Basic_Data_Types.DaFrequency" ordered="false"
	 * @generated
	 */
	EList<String> getRate();

	/**
	 * Returns the value of the '<em><b>MTTR</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MTTR</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MTTR</em>' attribute list.
	 * @see com.masdes.dam.Complex_Data_Types.Complex_Data_TypesPackage#getDaRepair_MTTR()
	 * @model dataType="org.eclipse.papyrus.MARTE_Library.BasicNFP_Types.NFP_Duration" ordered="false"
	 * @generated
	 */
	EList<String> getMTTR();

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
	 * @see com.masdes.dam.Complex_Data_Types.Complex_Data_TypesPackage#getDaRepair_Distribution()
	 * @model dataType="org.eclipse.papyrus.MARTE_Library.BasicNFP_Types.NFP_CommonType" ordered="false"
	 * @generated
	 */
	EList<String> getDistribution();

} // DaRepair
