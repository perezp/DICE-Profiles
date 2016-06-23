/**
 */
package es.unizar.disco.dice.dtsm.Storm;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Classifier;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Supervisor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.unizar.disco.dice.dtsm.Storm.StormSupervisor#getMonitroFrequency <em>Monitro Frequency</em>}</li>
 *   <li>{@link es.unizar.disco.dice.dtsm.Storm.StormSupervisor#getWorkerSatrtTimeout <em>Worker Satrt Timeout</em>}</li>
 *   <li>{@link es.unizar.disco.dice.dtsm.Storm.StormSupervisor#getWorkerTimeout <em>Worker Timeout</em>}</li>
 *   <li>{@link es.unizar.disco.dice.dtsm.Storm.StormSupervisor#getHeartbrackFrequency <em>Heartbrack Frequency</em>}</li>
 *   <li>{@link es.unizar.disco.dice.dtsm.Storm.StormSupervisor#getMemoryCapacity <em>Memory Capacity</em>}</li>
 *   <li>{@link es.unizar.disco.dice.dtsm.Storm.StormSupervisor#getCpuCapacity <em>Cpu Capacity</em>}</li>
 *   <li>{@link es.unizar.disco.dice.dtsm.Storm.StormSupervisor#getBase_Classifier <em>Base Classifier</em>}</li>
 * </ul>
 *
 * @see es.unizar.disco.dice.dtsm.Storm.StormPackage#getStormSupervisor()
 * @model
 * @generated
 */
public interface StormSupervisor extends EObject {
	/**
	 * Returns the value of the '<em><b>Monitro Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Monitro Frequency</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Monitro Frequency</em>' attribute.
	 * @see #setMonitroFrequency(int)
	 * @see es.unizar.disco.dice.dtsm.Storm.StormPackage#getStormSupervisor_MonitroFrequency()
	 * @model dataType="org.eclipse.uml2.types.Integer" ordered="false"
	 * @generated
	 */
	int getMonitroFrequency();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.dtsm.Storm.StormSupervisor#getMonitroFrequency <em>Monitro Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Monitro Frequency</em>' attribute.
	 * @see #getMonitroFrequency()
	 * @generated
	 */
	void setMonitroFrequency(int value);

	/**
	 * Returns the value of the '<em><b>Worker Satrt Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Worker Satrt Timeout</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Worker Satrt Timeout</em>' attribute.
	 * @see #setWorkerSatrtTimeout(int)
	 * @see es.unizar.disco.dice.dtsm.Storm.StormPackage#getStormSupervisor_WorkerSatrtTimeout()
	 * @model dataType="org.eclipse.uml2.types.Integer" ordered="false"
	 * @generated
	 */
	int getWorkerSatrtTimeout();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.dtsm.Storm.StormSupervisor#getWorkerSatrtTimeout <em>Worker Satrt Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Worker Satrt Timeout</em>' attribute.
	 * @see #getWorkerSatrtTimeout()
	 * @generated
	 */
	void setWorkerSatrtTimeout(int value);

	/**
	 * Returns the value of the '<em><b>Worker Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Worker Timeout</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Worker Timeout</em>' attribute.
	 * @see #setWorkerTimeout(int)
	 * @see es.unizar.disco.dice.dtsm.Storm.StormPackage#getStormSupervisor_WorkerTimeout()
	 * @model dataType="org.eclipse.uml2.types.Integer" ordered="false"
	 * @generated
	 */
	int getWorkerTimeout();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.dtsm.Storm.StormSupervisor#getWorkerTimeout <em>Worker Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Worker Timeout</em>' attribute.
	 * @see #getWorkerTimeout()
	 * @generated
	 */
	void setWorkerTimeout(int value);

	/**
	 * Returns the value of the '<em><b>Heartbrack Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Heartbrack Frequency</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Heartbrack Frequency</em>' attribute.
	 * @see #setHeartbrackFrequency(int)
	 * @see es.unizar.disco.dice.dtsm.Storm.StormPackage#getStormSupervisor_HeartbrackFrequency()
	 * @model dataType="org.eclipse.uml2.types.Integer" ordered="false"
	 * @generated
	 */
	int getHeartbrackFrequency();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.dtsm.Storm.StormSupervisor#getHeartbrackFrequency <em>Heartbrack Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Heartbrack Frequency</em>' attribute.
	 * @see #getHeartbrackFrequency()
	 * @generated
	 */
	void setHeartbrackFrequency(int value);

	/**
	 * Returns the value of the '<em><b>Memory Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Memory Capacity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Memory Capacity</em>' attribute.
	 * @see #setMemoryCapacity(int)
	 * @see es.unizar.disco.dice.dtsm.Storm.StormPackage#getStormSupervisor_MemoryCapacity()
	 * @model dataType="org.eclipse.uml2.types.Integer" ordered="false"
	 * @generated
	 */
	int getMemoryCapacity();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.dtsm.Storm.StormSupervisor#getMemoryCapacity <em>Memory Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Memory Capacity</em>' attribute.
	 * @see #getMemoryCapacity()
	 * @generated
	 */
	void setMemoryCapacity(int value);

	/**
	 * Returns the value of the '<em><b>Cpu Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cpu Capacity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cpu Capacity</em>' attribute.
	 * @see #setCpuCapacity(int)
	 * @see es.unizar.disco.dice.dtsm.Storm.StormPackage#getStormSupervisor_CpuCapacity()
	 * @model dataType="org.eclipse.uml2.types.Integer" ordered="false"
	 * @generated
	 */
	int getCpuCapacity();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.dtsm.Storm.StormSupervisor#getCpuCapacity <em>Cpu Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cpu Capacity</em>' attribute.
	 * @see #getCpuCapacity()
	 * @generated
	 */
	void setCpuCapacity(int value);

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
	 * @see es.unizar.disco.dice.dtsm.Storm.StormPackage#getStormSupervisor_Base_Classifier()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Classifier getBase_Classifier();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.dtsm.Storm.StormSupervisor#getBase_Classifier <em>Base Classifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Classifier</em>' reference.
	 * @see #getBase_Classifier()
	 * @generated
	 */
	void setBase_Classifier(Classifier value);

} // StormSupervisor
