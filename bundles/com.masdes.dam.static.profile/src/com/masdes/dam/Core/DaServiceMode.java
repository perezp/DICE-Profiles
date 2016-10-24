/**
 */
package com.masdes.dam.Core;

import com.masdes.dam.Complex_Data_Types.DaSurvivability;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.State;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Da Service Mode</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.masdes.dam.Core.DaServiceMode#getService <em>Service</em>}</li>
 *   <li>{@link com.masdes.dam.Core.DaServiceMode#getQos <em>Qos</em>}</li>
 *   <li>{@link com.masdes.dam.Core.DaServiceMode#getProb <em>Prob</em>}</li>
 *   <li>{@link com.masdes.dam.Core.DaServiceMode#getBase_State <em>Base State</em>}</li>
 * </ul>
 *
 * @see com.masdes.dam.Core.CorePackage#getDaServiceMode()
 * @model
 * @generated
 */
public interface DaServiceMode extends EObject {
	/**
	 * Returns the value of the '<em><b>Service</b></em>' reference list.
	 * The list contents are of type {@link com.masdes.dam.Core.DaService}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service</em>' reference list.
	 * @see com.masdes.dam.Core.CorePackage#getDaServiceMode_Service()
	 * @model
	 * @generated
	 */
	EList<DaService> getService();

	/**
	 * Returns the value of the '<em><b>Qos</b></em>' containment reference list.
	 * The list contents are of type {@link com.masdes.dam.Complex_Data_Types.DaSurvivability}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qos</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qos</em>' containment reference list.
	 * @see com.masdes.dam.Core.CorePackage#getDaServiceMode_Qos()
	 * @model containment="true"
	 * @generated
	 */
	EList<DaSurvivability> getQos();

	/**
	 * Returns the value of the '<em><b>Prob</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prob</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prob</em>' attribute.
	 * @see #setProb(String)
	 * @see com.masdes.dam.Core.CorePackage#getDaServiceMode_Prob()
	 * @model dataType="org.eclipse.papyrus.MARTE_Library.BasicNFP_Types.NFP_Percentage" ordered="false"
	 * @generated
	 */
	String getProb();

	/**
	 * Sets the value of the '{@link com.masdes.dam.Core.DaServiceMode#getProb <em>Prob</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prob</em>' attribute.
	 * @see #getProb()
	 * @generated
	 */
	void setProb(String value);

	/**
	 * Returns the value of the '<em><b>Base State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base State</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base State</em>' reference.
	 * @see #setBase_State(State)
	 * @see com.masdes.dam.Core.CorePackage#getDaServiceMode_Base_State()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	State getBase_State();

	/**
	 * Sets the value of the '{@link com.masdes.dam.Core.DaServiceMode#getBase_State <em>Base State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base State</em>' reference.
	 * @see #getBase_State()
	 * @generated
	 */
	void setBase_State(State value);

} // DaServiceMode
