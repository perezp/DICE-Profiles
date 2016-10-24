/**
 */
package com.masdes.dam.Complex_Data_Types;

import com.masdes.dam.Basic_Enumeration_Types.MetricName;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Da Survivability</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.masdes.dam.Complex_Data_Types.DaSurvivability#getMetric <em>Metric</em>}</li>
 *   <li>{@link com.masdes.dam.Complex_Data_Types.DaSurvivability#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see com.masdes.dam.Complex_Data_Types.Complex_Data_TypesPackage#getDaSurvivability()
 * @model
 * @generated
 */
public interface DaSurvivability extends EObject {
	/**
	 * Returns the value of the '<em><b>Metric</b></em>' attribute.
	 * The literals are from the enumeration {@link com.masdes.dam.Basic_Enumeration_Types.MetricName}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metric</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metric</em>' attribute.
	 * @see com.masdes.dam.Basic_Enumeration_Types.MetricName
	 * @see #setMetric(MetricName)
	 * @see com.masdes.dam.Complex_Data_Types.Complex_Data_TypesPackage#getDaSurvivability_Metric()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	MetricName getMetric();

	/**
	 * Sets the value of the '{@link com.masdes.dam.Complex_Data_Types.DaSurvivability#getMetric <em>Metric</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metric</em>' attribute.
	 * @see com.masdes.dam.Basic_Enumeration_Types.MetricName
	 * @see #getMetric()
	 * @generated
	 */
	void setMetric(MetricName value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute list.
	 * @see com.masdes.dam.Complex_Data_Types.Complex_Data_TypesPackage#getDaSurvivability_Value()
	 * @model dataType="org.eclipse.papyrus.MARTE_Library.BasicNFP_Types.NFP_CommonType" ordered="false"
	 * @generated
	 */
	EList<String> getValue();

} // DaSurvivability
