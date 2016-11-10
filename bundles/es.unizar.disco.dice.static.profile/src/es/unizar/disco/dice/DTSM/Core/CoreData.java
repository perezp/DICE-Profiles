/**
 */
package es.unizar.disco.dice.DTSM.Core;

import es.unizar.disco.dice.Complex_Data_Types.DiceDataSpecification;
import es.unizar.disco.dice.Complex_Data_Types.DiceDataVolume;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.unizar.disco.dice.DTSM.Core.CoreData#getLocation <em>Location</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DTSM.Core.CoreData#getHasSpecification <em>Has Specification</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DTSM.Core.CoreData#getHasVolume <em>Has Volume</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DTSM.Core.CoreData#getBase_Class <em>Base Class</em>}</li>
 * </ul>
 *
 * @see es.unizar.disco.dice.DTSM.Core.CorePackage#getCoreData()
 * @model abstract="true"
 * @generated
 */
public interface CoreData extends EObject {
	/**
	 * Returns the value of the '<em><b>Location</b></em>' reference list.
	 * The list contents are of type {@link es.unizar.disco.dice.DTSM.Core.CoreDataSource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' reference list.
	 * @see es.unizar.disco.dice.DTSM.Core.CorePackage#getCoreData_Location()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<CoreDataSource> getLocation();

	/**
	 * Returns the value of the '<em><b>Has Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Specification</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Specification</em>' containment reference.
	 * @see #setHasSpecification(DiceDataSpecification)
	 * @see es.unizar.disco.dice.DTSM.Core.CorePackage#getCoreData_HasSpecification()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	DiceDataSpecification getHasSpecification();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DTSM.Core.CoreData#getHasSpecification <em>Has Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Specification</em>' containment reference.
	 * @see #getHasSpecification()
	 * @generated
	 */
	void setHasSpecification(DiceDataSpecification value);

	/**
	 * Returns the value of the '<em><b>Has Volume</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Volume</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Volume</em>' containment reference.
	 * @see #setHasVolume(DiceDataVolume)
	 * @see es.unizar.disco.dice.DTSM.Core.CorePackage#getCoreData_HasVolume()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	DiceDataVolume getHasVolume();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DTSM.Core.CoreData#getHasVolume <em>Has Volume</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Volume</em>' containment reference.
	 * @see #getHasVolume()
	 * @generated
	 */
	void setHasVolume(DiceDataVolume value);

	/**
	 * Returns the value of the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Class</em>' reference.
	 * @see #setBase_Class(org.eclipse.uml2.uml.Class)
	 * @see es.unizar.disco.dice.DTSM.Core.CorePackage#getCoreData_Base_Class()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	org.eclipse.uml2.uml.Class getBase_Class();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DTSM.Core.CoreData#getBase_Class <em>Base Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Class</em>' reference.
	 * @see #getBase_Class()
	 * @generated
	 */
	void setBase_Class(org.eclipse.uml2.uml.Class value);

} // CoreData
