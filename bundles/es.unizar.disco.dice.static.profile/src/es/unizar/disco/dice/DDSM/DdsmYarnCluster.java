/**
 */
package es.unizar.disco.dice.DDSM;

import es.unizar.disco.dice.Basic_Enumeration_Types.Scheduling;

import org.eclipse.uml2.uml.ExecutionEnvironment;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ddsm Yarn Cluster</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.unizar.disco.dice.DDSM.DdsmYarnCluster#getBase_ExecutionEnvironment <em>Base Execution Environment</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.DdsmYarnCluster#isEnable_acl <em>Enable acl</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.DdsmYarnCluster#getScheduler_type <em>Scheduler type</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.DdsmYarnCluster#getScheduler_min_container_mem_mb <em>Scheduler min container mem mb</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.DdsmYarnCluster#getScheduler_max_container_mem_mb <em>Scheduler max container mem mb</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.DdsmYarnCluster#getScheduler_min_container_core_num <em>Scheduler min container core num</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.DdsmYarnCluster#getScheduler_max_container_core_num <em>Scheduler max container core num</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.DdsmYarnCluster#getNodemanager_available_mem <em>Nodemanager available mem</em>}</li>
 * </ul>
 *
 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmYarnCluster()
 * @model
 * @generated
 */
public interface DdsmYarnCluster extends DdsmMasterSlavePlatform {
	/**
	 * Returns the value of the '<em><b>Base Execution Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Execution Environment</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Execution Environment</em>' reference.
	 * @see #setBase_ExecutionEnvironment(ExecutionEnvironment)
	 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmYarnCluster_Base_ExecutionEnvironment()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ExecutionEnvironment getBase_ExecutionEnvironment();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DDSM.DdsmYarnCluster#getBase_ExecutionEnvironment <em>Base Execution Environment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Execution Environment</em>' reference.
	 * @see #getBase_ExecutionEnvironment()
	 * @generated
	 */
	void setBase_ExecutionEnvironment(ExecutionEnvironment value);

	/**
	 * Returns the value of the '<em><b>Enable acl</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enable acl</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enable acl</em>' attribute.
	 * @see #setEnable_acl(boolean)
	 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmYarnCluster_Enable_acl()
	 * @model default="false" dataType="org.eclipse.uml2.types.Boolean" ordered="false"
	 * @generated
	 */
	boolean isEnable_acl();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DDSM.DdsmYarnCluster#isEnable_acl <em>Enable acl</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enable acl</em>' attribute.
	 * @see #isEnable_acl()
	 * @generated
	 */
	void setEnable_acl(boolean value);

	/**
	 * Returns the value of the '<em><b>Scheduler type</b></em>' attribute.
	 * The default value is <code>"capacity"</code>.
	 * The literals are from the enumeration {@link es.unizar.disco.dice.Basic_Enumeration_Types.Scheduling}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scheduler type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scheduler type</em>' attribute.
	 * @see es.unizar.disco.dice.Basic_Enumeration_Types.Scheduling
	 * @see #setScheduler_type(Scheduling)
	 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmYarnCluster_Scheduler_type()
	 * @model default="capacity" ordered="false"
	 * @generated
	 */
	Scheduling getScheduler_type();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DDSM.DdsmYarnCluster#getScheduler_type <em>Scheduler type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scheduler type</em>' attribute.
	 * @see es.unizar.disco.dice.Basic_Enumeration_Types.Scheduling
	 * @see #getScheduler_type()
	 * @generated
	 */
	void setScheduler_type(Scheduling value);

	/**
	 * Returns the value of the '<em><b>Scheduler min container mem mb</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scheduler min container mem mb</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scheduler min container mem mb</em>' attribute.
	 * @see #setScheduler_min_container_mem_mb(int)
	 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmYarnCluster_Scheduler_min_container_mem_mb()
	 * @model default="0" dataType="org.eclipse.uml2.types.Integer" ordered="false"
	 * @generated
	 */
	int getScheduler_min_container_mem_mb();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DDSM.DdsmYarnCluster#getScheduler_min_container_mem_mb <em>Scheduler min container mem mb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scheduler min container mem mb</em>' attribute.
	 * @see #getScheduler_min_container_mem_mb()
	 * @generated
	 */
	void setScheduler_min_container_mem_mb(int value);

	/**
	 * Returns the value of the '<em><b>Scheduler max container mem mb</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scheduler max container mem mb</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scheduler max container mem mb</em>' attribute.
	 * @see #setScheduler_max_container_mem_mb(int)
	 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmYarnCluster_Scheduler_max_container_mem_mb()
	 * @model default="0" dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getScheduler_max_container_mem_mb();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DDSM.DdsmYarnCluster#getScheduler_max_container_mem_mb <em>Scheduler max container mem mb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scheduler max container mem mb</em>' attribute.
	 * @see #getScheduler_max_container_mem_mb()
	 * @generated
	 */
	void setScheduler_max_container_mem_mb(int value);

	/**
	 * Returns the value of the '<em><b>Scheduler min container core num</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scheduler min container core num</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scheduler min container core num</em>' attribute.
	 * @see #setScheduler_min_container_core_num(int)
	 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmYarnCluster_Scheduler_min_container_core_num()
	 * @model default="0" dataType="org.eclipse.uml2.types.Integer" ordered="false"
	 * @generated
	 */
	int getScheduler_min_container_core_num();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DDSM.DdsmYarnCluster#getScheduler_min_container_core_num <em>Scheduler min container core num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scheduler min container core num</em>' attribute.
	 * @see #getScheduler_min_container_core_num()
	 * @generated
	 */
	void setScheduler_min_container_core_num(int value);

	/**
	 * Returns the value of the '<em><b>Scheduler max container core num</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scheduler max container core num</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scheduler max container core num</em>' attribute.
	 * @see #setScheduler_max_container_core_num(int)
	 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmYarnCluster_Scheduler_max_container_core_num()
	 * @model default="0" dataType="org.eclipse.uml2.types.Integer" ordered="false"
	 * @generated
	 */
	int getScheduler_max_container_core_num();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DDSM.DdsmYarnCluster#getScheduler_max_container_core_num <em>Scheduler max container core num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scheduler max container core num</em>' attribute.
	 * @see #getScheduler_max_container_core_num()
	 * @generated
	 */
	void setScheduler_max_container_core_num(int value);

	/**
	 * Returns the value of the '<em><b>Nodemanager available mem</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nodemanager available mem</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodemanager available mem</em>' attribute.
	 * @see #setNodemanager_available_mem(int)
	 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmYarnCluster_Nodemanager_available_mem()
	 * @model default="0" dataType="org.eclipse.uml2.types.Integer" ordered="false"
	 * @generated
	 */
	int getNodemanager_available_mem();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DDSM.DdsmYarnCluster#getNodemanager_available_mem <em>Nodemanager available mem</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nodemanager available mem</em>' attribute.
	 * @see #getNodemanager_available_mem()
	 * @generated
	 */
	void setNodemanager_available_mem(int value);

} // DdsmYarnCluster
