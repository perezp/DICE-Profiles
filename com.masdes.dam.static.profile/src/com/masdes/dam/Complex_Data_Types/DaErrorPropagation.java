/**
 */
package com.masdes.dam.Complex_Data_Types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Da Error Propagation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.masdes.dam.Complex_Data_Types.DaErrorPropagation#getProbability <em>Probability</em>}</li>
 *   <li>{@link com.masdes.dam.Complex_Data_Types.DaErrorPropagation#getFrom <em>From</em>}</li>
 *   <li>{@link com.masdes.dam.Complex_Data_Types.DaErrorPropagation#getTo <em>To</em>}</li>
 *   <li>{@link com.masdes.dam.Complex_Data_Types.DaErrorPropagation#getCause <em>Cause</em>}</li>
 *   <li>{@link com.masdes.dam.Complex_Data_Types.DaErrorPropagation#getEffect <em>Effect</em>}</li>
 * </ul>
 *
 * @see com.masdes.dam.Complex_Data_Types.Complex_Data_TypesPackage#getDaErrorPropagation()
 * @model
 * @generated
 */
public interface DaErrorPropagation extends EObject {
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
	 * @see com.masdes.dam.Complex_Data_Types.Complex_Data_TypesPackage#getDaErrorPropagation_Probability()
	 * @model dataType="org.eclipse.papyrus.MARTE_Library.BasicNFP_Types.NFP_Real" ordered="false"
	 * @generated
	 */
	EList<String> getProbability();

	/**
	 * Returns the value of the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' attribute.
	 * @see #setFrom(String)
	 * @see com.masdes.dam.Complex_Data_Types.Complex_Data_TypesPackage#getDaErrorPropagation_From()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getFrom();

	/**
	 * Sets the value of the '{@link com.masdes.dam.Complex_Data_Types.DaErrorPropagation#getFrom <em>From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' attribute.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(String value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' attribute.
	 * @see #setTo(String)
	 * @see com.masdes.dam.Complex_Data_Types.Complex_Data_TypesPackage#getDaErrorPropagation_To()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getTo();

	/**
	 * Sets the value of the '{@link com.masdes.dam.Complex_Data_Types.DaErrorPropagation#getTo <em>To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' attribute.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(String value);

	/**
	 * Returns the value of the '<em><b>Cause</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cause</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cause</em>' containment reference.
	 * @see #setCause(DaFailure)
	 * @see com.masdes.dam.Complex_Data_Types.Complex_Data_TypesPackage#getDaErrorPropagation_Cause()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	DaFailure getCause();

	/**
	 * Sets the value of the '{@link com.masdes.dam.Complex_Data_Types.DaErrorPropagation#getCause <em>Cause</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cause</em>' containment reference.
	 * @see #getCause()
	 * @generated
	 */
	void setCause(DaFailure value);

	/**
	 * Returns the value of the '<em><b>Effect</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Effect</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effect</em>' containment reference.
	 * @see #setEffect(DaError)
	 * @see com.masdes.dam.Complex_Data_Types.Complex_Data_TypesPackage#getDaErrorPropagation_Effect()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	DaError getEffect();

	/**
	 * Sets the value of the '{@link com.masdes.dam.Complex_Data_Types.DaErrorPropagation#getEffect <em>Effect</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effect</em>' containment reference.
	 * @see #getEffect()
	 * @generated
	 */
	void setEffect(DaError value);

} // DaErrorPropagation
