/**
 */
package es.unizar.disco.dice.DDSM;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Deployment;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ddsm Job Submission</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.unizar.disco.dice.DDSM.DdsmJobSubmission#getBase_Deployment <em>Base Deployment</em>}</li>
 * </ul>
 *
 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmJobSubmission()
 * @model
 * @generated
 */
public interface DdsmJobSubmission extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Deployment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Deployment</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Deployment</em>' reference.
	 * @see #setBase_Deployment(Deployment)
	 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmJobSubmission_Base_Deployment()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Deployment getBase_Deployment();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DDSM.DdsmJobSubmission#getBase_Deployment <em>Base Deployment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Deployment</em>' reference.
	 * @see #getBase_Deployment()
	 * @generated
	 */
	void setBase_Deployment(Deployment value);

} // DdsmJobSubmission
