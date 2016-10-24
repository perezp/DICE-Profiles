/**
 */
package es.unizar.disco.dice.DDSM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ddsm Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.unizar.disco.dice.DDSM.DdsmComponent#getProvidedPortsList <em>Provided Ports List</em>}</li>
 * </ul>
 *
 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmComponent()
 * @model abstract="true"
 * @generated
 */
public interface DdsmComponent extends DdsmCloudElement {
	/**
	 * Returns the value of the '<em><b>Provided Ports List</b></em>' reference list.
	 * The list contents are of type {@link es.unizar.disco.dice.DDSM.DdsmPort}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provided Ports List</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provided Ports List</em>' reference list.
	 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmComponent_ProvidedPortsList()
	 * @model ordered="false"
	 * @generated
	 */
	EList<DdsmPort> getProvidedPortsList();

} // DdsmComponent
