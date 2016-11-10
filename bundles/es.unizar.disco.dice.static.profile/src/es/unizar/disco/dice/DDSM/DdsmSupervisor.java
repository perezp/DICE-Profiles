/**
 */
package es.unizar.disco.dice.DDSM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ddsm Supervisor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * self.componentType = DDSMcomponentType::MasterSlavePlatform
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.unizar.disco.dice.DDSM.DdsmSupervisor#getWorkerStartTimeout <em>Worker Start Timeout</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.DdsmSupervisor#getCpuCapacity <em>Cpu Capacity</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.DdsmSupervisor#getMemoryCapacity <em>Memory Capacity</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.DdsmSupervisor#getHeartbeatFrequency <em>Heartbeat Frequency</em>}</li>
 * </ul>
 *
 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmSupervisor()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='SupervisorTypeSlaveNode'"
 * @generated
 */
public interface DdsmSupervisor extends DdsmInternalComponent {
	/**
	 * Returns the value of the '<em><b>Worker Start Timeout</b></em>' attribute.
	 * The default value is <code>"120"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Worker Start Timeout</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Worker Start Timeout</em>' attribute.
	 * @see #setWorkerStartTimeout(int)
	 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmSupervisor_WorkerStartTimeout()
	 * @model default="120" required="true" ordered="false"
	 * @generated
	 */
	int getWorkerStartTimeout();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DDSM.DdsmSupervisor#getWorkerStartTimeout <em>Worker Start Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Worker Start Timeout</em>' attribute.
	 * @see #getWorkerStartTimeout()
	 * @generated
	 */
	void setWorkerStartTimeout(int value);

	/**
	 * Returns the value of the '<em><b>Cpu Capacity</b></em>' attribute.
	 * The default value is <code>"400"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cpu Capacity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cpu Capacity</em>' attribute.
	 * @see #setCpuCapacity(int)
	 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmSupervisor_CpuCapacity()
	 * @model default="400" required="true" ordered="false"
	 * @generated
	 */
	int getCpuCapacity();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DDSM.DdsmSupervisor#getCpuCapacity <em>Cpu Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cpu Capacity</em>' attribute.
	 * @see #getCpuCapacity()
	 * @generated
	 */
	void setCpuCapacity(int value);

	/**
	 * Returns the value of the '<em><b>Memory Capacity</b></em>' attribute.
	 * The default value is <code>"4096"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Memory Capacity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Memory Capacity</em>' attribute.
	 * @see #setMemoryCapacity(int)
	 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmSupervisor_MemoryCapacity()
	 * @model default="4096" required="true" ordered="false"
	 * @generated
	 */
	int getMemoryCapacity();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DDSM.DdsmSupervisor#getMemoryCapacity <em>Memory Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Memory Capacity</em>' attribute.
	 * @see #getMemoryCapacity()
	 * @generated
	 */
	void setMemoryCapacity(int value);

	/**
	 * Returns the value of the '<em><b>Heartbeat Frequency</b></em>' attribute.
	 * The default value is <code>"5"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Heartbeat Frequency</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Heartbeat Frequency</em>' attribute.
	 * @see #setHeartbeatFrequency(int)
	 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmSupervisor_HeartbeatFrequency()
	 * @model default="5" required="true" ordered="false"
	 * @generated
	 */
	int getHeartbeatFrequency();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DDSM.DdsmSupervisor#getHeartbeatFrequency <em>Heartbeat Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Heartbeat Frequency</em>' attribute.
	 * @see #getHeartbeatFrequency()
	 * @generated
	 */
	void setHeartbeatFrequency(int value);

} // DdsmSupervisor
