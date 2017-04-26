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
 *   <li>{@link es.unizar.disco.dice.DDSM.DdsmComponent#isMonitored <em>Monitored</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.DdsmComponent#getMonitoringRoles <em>Monitoring Roles</em>}</li>
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

	/**
	 * Returns the value of the '<em><b>Monitored</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Monitored</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Monitored</em>' attribute.
	 * @see #setMonitored(boolean)
	 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmComponent_Monitored()
	 * @model default="false" dataType="org.eclipse.uml2.types.Boolean" ordered="false"
	 * @generated
	 */
	boolean isMonitored();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DDSM.DdsmComponent#isMonitored <em>Monitored</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Monitored</em>' attribute.
	 * @see #isMonitored()
	 * @generated
	 */
	void setMonitored(boolean value);

	/**
	 * Returns the value of the '<em><b>Monitoring Roles</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Monitoring Roles</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Monitoring Roles</em>' attribute list.
	 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmComponent_MonitoringRoles()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	EList<String> getMonitoringRoles();

} // DdsmComponent
