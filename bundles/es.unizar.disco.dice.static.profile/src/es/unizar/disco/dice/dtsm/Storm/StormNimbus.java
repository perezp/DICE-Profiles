/**
 */
package es.unizar.disco.dice.DTSM.Storm;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Classifier;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nimbus</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.unizar.disco.dice.DTSM.Storm.StormNimbus#getTaskTimeout <em>Task Timeout</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DTSM.Storm.StormNimbus#getSupervisorTimeout <em>Supervisor Timeout</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DTSM.Storm.StormNimbus#getMonitorFrequency <em>Monitor Frequency</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DTSM.Storm.StormNimbus#getBase_Classifier <em>Base Classifier</em>}</li>
 * </ul>
 *
 * @see es.unizar.disco.dice.DTSM.Storm.StormPackage#getStormNimbus()
 * @model
 * @generated
 */
public interface StormNimbus extends EObject {
	/**
	 * Returns the value of the '<em><b>Task Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task Timeout</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task Timeout</em>' attribute.
	 * @see #setTaskTimeout(int)
	 * @see es.unizar.disco.dice.DTSM.Storm.StormPackage#getStormNimbus_TaskTimeout()
	 * @model dataType="org.eclipse.uml2.types.Integer" ordered="false"
	 * @generated
	 */
	int getTaskTimeout();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DTSM.Storm.StormNimbus#getTaskTimeout <em>Task Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task Timeout</em>' attribute.
	 * @see #getTaskTimeout()
	 * @generated
	 */
	void setTaskTimeout(int value);

	/**
	 * Returns the value of the '<em><b>Supervisor Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supervisor Timeout</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supervisor Timeout</em>' attribute.
	 * @see #setSupervisorTimeout(int)
	 * @see es.unizar.disco.dice.DTSM.Storm.StormPackage#getStormNimbus_SupervisorTimeout()
	 * @model dataType="org.eclipse.uml2.types.Integer" ordered="false"
	 * @generated
	 */
	int getSupervisorTimeout();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DTSM.Storm.StormNimbus#getSupervisorTimeout <em>Supervisor Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supervisor Timeout</em>' attribute.
	 * @see #getSupervisorTimeout()
	 * @generated
	 */
	void setSupervisorTimeout(int value);

	/**
	 * Returns the value of the '<em><b>Monitor Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Monitor Frequency</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Monitor Frequency</em>' attribute.
	 * @see #setMonitorFrequency(int)
	 * @see es.unizar.disco.dice.DTSM.Storm.StormPackage#getStormNimbus_MonitorFrequency()
	 * @model dataType="org.eclipse.uml2.types.Integer" ordered="false"
	 * @generated
	 */
	int getMonitorFrequency();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DTSM.Storm.StormNimbus#getMonitorFrequency <em>Monitor Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Monitor Frequency</em>' attribute.
	 * @see #getMonitorFrequency()
	 * @generated
	 */
	void setMonitorFrequency(int value);

	/**
	 * Returns the value of the '<em><b>Base Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Classifier</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Classifier</em>' reference.
	 * @see #setBase_Classifier(Classifier)
	 * @see es.unizar.disco.dice.DTSM.Storm.StormPackage#getStormNimbus_Base_Classifier()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Classifier getBase_Classifier();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DTSM.Storm.StormNimbus#getBase_Classifier <em>Base Classifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Classifier</em>' reference.
	 * @see #getBase_Classifier()
	 * @generated
	 */
	void setBase_Classifier(Classifier value);

} // StormNimbus
