/**
 */
package com.masdes.dam.Core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Da Resistance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.masdes.dam.Core.DaResistance#getCoverage <em>Coverage</em>}</li>
 * </ul>
 *
 * @see com.masdes.dam.Core.CorePackage#getDaResistance()
 * @model
 * @generated
 */
public interface DaResistance extends DaService {
	/**
	 * Returns the value of the '<em><b>Coverage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coverage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coverage</em>' attribute.
	 * @see #setCoverage(String)
	 * @see com.masdes.dam.Core.CorePackage#getDaResistance_Coverage()
	 * @model dataType="org.eclipse.papyrus.MARTE_Library.BasicNFP_Types.NFP_Percentage" ordered="false"
	 * @generated
	 */
	String getCoverage();

	/**
	 * Sets the value of the '{@link com.masdes.dam.Core.DaResistance#getCoverage <em>Coverage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coverage</em>' attribute.
	 * @see #getCoverage()
	 * @generated
	 */
	void setCoverage(String value);

} // DaResistance
