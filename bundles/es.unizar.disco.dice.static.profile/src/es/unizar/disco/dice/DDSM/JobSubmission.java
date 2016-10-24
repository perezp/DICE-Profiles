/**
 */
package es.unizar.disco.dice.DDSM;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Artifact;
import org.eclipse.uml2.uml.Deployment;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Job Submission</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.unizar.disco.dice.DDSM.JobSubmission#getArtifactURL <em>Artifact URL</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.JobSubmission#getMainClass <em>Main Class</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.JobSubmission#getBase_Artifact <em>Base Artifact</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.JobSubmission#getBase_Deployment <em>Base Deployment</em>}</li>
 * </ul>
 *
 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getJobSubmission()
 * @model
 * @generated
 */
public interface JobSubmission extends EObject {
	/**
	 * Returns the value of the '<em><b>Artifact URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Artifact URL</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artifact URL</em>' attribute.
	 * @see #setArtifactURL(String)
	 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getJobSubmission_ArtifactURL()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getArtifactURL();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DDSM.JobSubmission#getArtifactURL <em>Artifact URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Artifact URL</em>' attribute.
	 * @see #getArtifactURL()
	 * @generated
	 */
	void setArtifactURL(String value);

	/**
	 * Returns the value of the '<em><b>Main Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Main Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Main Class</em>' attribute.
	 * @see #setMainClass(String)
	 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getJobSubmission_MainClass()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getMainClass();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DDSM.JobSubmission#getMainClass <em>Main Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Main Class</em>' attribute.
	 * @see #getMainClass()
	 * @generated
	 */
	void setMainClass(String value);

	/**
	 * Returns the value of the '<em><b>Base Artifact</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Artifact</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Artifact</em>' reference.
	 * @see #setBase_Artifact(Artifact)
	 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getJobSubmission_Base_Artifact()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Artifact getBase_Artifact();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DDSM.JobSubmission#getBase_Artifact <em>Base Artifact</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Artifact</em>' reference.
	 * @see #getBase_Artifact()
	 * @generated
	 */
	void setBase_Artifact(Artifact value);

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
	 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getJobSubmission_Base_Deployment()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Deployment getBase_Deployment();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DDSM.JobSubmission#getBase_Deployment <em>Base Deployment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Deployment</em>' reference.
	 * @see #getBase_Deployment()
	 * @generated
	 */
	void setBase_Deployment(Deployment value);

} // JobSubmission
