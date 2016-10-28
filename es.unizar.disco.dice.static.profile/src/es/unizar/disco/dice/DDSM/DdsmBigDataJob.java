/**
 */
package es.unizar.disco.dice.DDSM;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Artifact;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ddsm Big Data Job</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.unizar.disco.dice.DDSM.DdsmBigDataJob#getArtifactURL <em>Artifact URL</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.DdsmBigDataJob#getMainClass <em>Main Class</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.DdsmBigDataJob#getBase_Artifact <em>Base Artifact</em>}</li>
 * </ul>
 *
 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmBigDataJob()
 * @model
 * @generated
 */
public interface DdsmBigDataJob extends EObject {
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
	 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmBigDataJob_ArtifactURL()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getArtifactURL();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DDSM.DdsmBigDataJob#getArtifactURL <em>Artifact URL</em>}' attribute.
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
	 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmBigDataJob_MainClass()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getMainClass();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DDSM.DdsmBigDataJob#getMainClass <em>Main Class</em>}' attribute.
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
	 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmBigDataJob_Base_Artifact()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Artifact getBase_Artifact();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DDSM.DdsmBigDataJob#getBase_Artifact <em>Base Artifact</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Artifact</em>' reference.
	 * @see #getBase_Artifact()
	 * @generated
	 */
	void setBase_Artifact(Artifact value);

} // DdsmBigDataJob
