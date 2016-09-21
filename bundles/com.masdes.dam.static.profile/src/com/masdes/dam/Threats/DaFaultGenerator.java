/**
 */
package com.masdes.dam.Threats;

import com.masdes.dam.Complex_Data_Types.DaFault;

import org.eclipse.emf.common.util.EList;

import org.eclipse.papyrus.MARTE.MARTE_AnalysisModel.GQAM.GaWorkloadGenerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Da Fault Generator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.masdes.dam.Threats.DaFaultGenerator#getNumberOfFaults <em>Number Of Faults</em>}</li>
 *   <li>{@link com.masdes.dam.Threats.DaFaultGenerator#getFault <em>Fault</em>}</li>
 * </ul>
 *
 * @see com.masdes.dam.Threats.ThreatsPackage#getDaFaultGenerator()
 * @model
 * @generated
 */
public interface DaFaultGenerator extends GaWorkloadGenerator {
	/**
	 * Returns the value of the '<em><b>Number Of Faults</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Faults</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Faults</em>' attribute list.
	 * @see com.masdes.dam.Threats.ThreatsPackage#getDaFaultGenerator_NumberOfFaults()
	 * @model dataType="org.eclipse.papyrus.MARTE_Library.BasicNFP_Types.NFP_Integer" ordered="false"
	 * @generated
	 */
	EList<String> getNumberOfFaults();

	/**
	 * Returns the value of the '<em><b>Fault</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fault</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fault</em>' containment reference.
	 * @see #setFault(DaFault)
	 * @see com.masdes.dam.Threats.ThreatsPackage#getDaFaultGenerator_Fault()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	DaFault getFault();

	/**
	 * Sets the value of the '{@link com.masdes.dam.Threats.DaFaultGenerator#getFault <em>Fault</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fault</em>' containment reference.
	 * @see #getFault()
	 * @generated
	 */
	void setFault(DaFault value);

} // DaFaultGenerator
