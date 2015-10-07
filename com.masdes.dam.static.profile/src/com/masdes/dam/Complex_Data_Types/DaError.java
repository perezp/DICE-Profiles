/**
 */
package com.masdes.dam.Complex_Data_Types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Da Error</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.masdes.dam.Complex_Data_Types.DaError#getLatency <em>Latency</em>}</li>
 *   <li>{@link com.masdes.dam.Complex_Data_Types.DaError#getProbability <em>Probability</em>}</li>
 *   <li>{@link com.masdes.dam.Complex_Data_Types.DaError#getCause <em>Cause</em>}</li>
 *   <li>{@link com.masdes.dam.Complex_Data_Types.DaError#getEffectF <em>Effect F</em>}</li>
 *   <li>{@link com.masdes.dam.Complex_Data_Types.DaError#getEffectH <em>Effect H</em>}</li>
 * </ul>
 *
 * @see com.masdes.dam.Complex_Data_Types.Complex_Data_TypesPackage#getDaError()
 * @model
 * @generated
 */
public interface DaError extends EObject {
	/**
	 * Returns the value of the '<em><b>Latency</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Latency</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Latency</em>' attribute list.
	 * @see com.masdes.dam.Complex_Data_Types.Complex_Data_TypesPackage#getDaError_Latency()
	 * @model dataType="org.eclipse.papyrus.MARTE_Library.BasicNFP_Types.NFP_Duration" ordered="false"
	 * @generated
	 */
	EList<String> getLatency();

	/**
	 * Returns the value of the '<em><b>Probability</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Probability</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Probability</em>' attribute list.
	 * @see com.masdes.dam.Complex_Data_Types.Complex_Data_TypesPackage#getDaError_Probability()
	 * @model dataType="org.eclipse.papyrus.MARTE_Library.BasicNFP_Types.NFP_Real" ordered="false"
	 * @generated
	 */
	EList<String> getProbability();

	/**
	 * Returns the value of the '<em><b>Cause</b></em>' containment reference list.
	 * The list contents are of type {@link com.masdes.dam.Complex_Data_Types.DaFault}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cause</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cause</em>' containment reference list.
	 * @see com.masdes.dam.Complex_Data_Types.Complex_Data_TypesPackage#getDaError_Cause()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<DaFault> getCause();

	/**
	 * Returns the value of the '<em><b>Effect F</b></em>' containment reference list.
	 * The list contents are of type {@link com.masdes.dam.Complex_Data_Types.DaFailure}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Effect F</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effect F</em>' containment reference list.
	 * @see com.masdes.dam.Complex_Data_Types.Complex_Data_TypesPackage#getDaError_EffectF()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<DaFailure> getEffectF();

	/**
	 * Returns the value of the '<em><b>Effect H</b></em>' containment reference list.
	 * The list contents are of type {@link com.masdes.dam.Complex_Data_Types.DaHazard}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Effect H</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effect H</em>' containment reference list.
	 * @see com.masdes.dam.Complex_Data_Types.Complex_Data_TypesPackage#getDaError_EffectH()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<DaHazard> getEffectH();

} // DaError
