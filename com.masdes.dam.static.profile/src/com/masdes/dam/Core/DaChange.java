/**
 */
package com.masdes.dam.Core;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Transition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Da Change</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.masdes.dam.Core.DaChange#getThreats <em>Threats</em>}</li>
 *   <li>{@link com.masdes.dam.Core.DaChange#getRecognition <em>Recognition</em>}</li>
 *   <li>{@link com.masdes.dam.Core.DaChange#getRecovery <em>Recovery</em>}</li>
 *   <li>{@link com.masdes.dam.Core.DaChange#getResistance <em>Resistance</em>}</li>
 *   <li>{@link com.masdes.dam.Core.DaChange#getBase_Transition <em>Base Transition</em>}</li>
 * </ul>
 *
 * @see com.masdes.dam.Core.CorePackage#getDaChange()
 * @model
 * @generated
 */
public interface DaChange extends EObject {
	/**
	 * Returns the value of the '<em><b>Threats</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Threats</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Threats</em>' reference.
	 * @see #setThreats(DaStep)
	 * @see com.masdes.dam.Core.CorePackage#getDaChange_Threats()
	 * @model ordered="false"
	 * @generated
	 */
	DaStep getThreats();

	/**
	 * Sets the value of the '{@link com.masdes.dam.Core.DaChange#getThreats <em>Threats</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Threats</em>' reference.
	 * @see #getThreats()
	 * @generated
	 */
	void setThreats(DaStep value);

	/**
	 * Returns the value of the '<em><b>Recognition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recognition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recognition</em>' reference.
	 * @see #setRecognition(DaRecognition)
	 * @see com.masdes.dam.Core.CorePackage#getDaChange_Recognition()
	 * @model ordered="false"
	 * @generated
	 */
	DaRecognition getRecognition();

	/**
	 * Sets the value of the '{@link com.masdes.dam.Core.DaChange#getRecognition <em>Recognition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recognition</em>' reference.
	 * @see #getRecognition()
	 * @generated
	 */
	void setRecognition(DaRecognition value);

	/**
	 * Returns the value of the '<em><b>Recovery</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recovery</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recovery</em>' reference.
	 * @see #setRecovery(DaRecovery)
	 * @see com.masdes.dam.Core.CorePackage#getDaChange_Recovery()
	 * @model ordered="false"
	 * @generated
	 */
	DaRecovery getRecovery();

	/**
	 * Sets the value of the '{@link com.masdes.dam.Core.DaChange#getRecovery <em>Recovery</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recovery</em>' reference.
	 * @see #getRecovery()
	 * @generated
	 */
	void setRecovery(DaRecovery value);

	/**
	 * Returns the value of the '<em><b>Resistance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resistance</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resistance</em>' reference.
	 * @see #setResistance(DaResistance)
	 * @see com.masdes.dam.Core.CorePackage#getDaChange_Resistance()
	 * @model ordered="false"
	 * @generated
	 */
	DaResistance getResistance();

	/**
	 * Sets the value of the '{@link com.masdes.dam.Core.DaChange#getResistance <em>Resistance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resistance</em>' reference.
	 * @see #getResistance()
	 * @generated
	 */
	void setResistance(DaResistance value);

	/**
	 * Returns the value of the '<em><b>Base Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Transition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Transition</em>' reference.
	 * @see #setBase_Transition(Transition)
	 * @see com.masdes.dam.Core.CorePackage#getDaChange_Base_Transition()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Transition getBase_Transition();

	/**
	 * Sets the value of the '{@link com.masdes.dam.Core.DaChange#getBase_Transition <em>Base Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Transition</em>' reference.
	 * @see #getBase_Transition()
	 * @generated
	 */
	void setBase_Transition(Transition value);

} // DaChange
