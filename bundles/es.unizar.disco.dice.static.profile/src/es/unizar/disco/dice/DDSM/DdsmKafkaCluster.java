/**
 */
package es.unizar.disco.dice.DDSM;

import org.eclipse.uml2.uml.ExecutionEnvironment;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ddsm Kafka Cluster</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.unizar.disco.dice.DDSM.DdsmKafkaCluster#getBase_ExecutionEnvironment <em>Base Execution Environment</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.DdsmKafkaCluster#isEnable_topic_deletion <em>Enable topic deletion</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.DdsmKafkaCluster#getNum_network_threads <em>Num network threads</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.DdsmKafkaCluster#getNum_io_threads <em>Num io threads</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.DdsmKafkaCluster#getNum_log_partition_per_topic <em>Num log partition per topic</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.DdsmKafkaCluster#getNum_recovery_threads_per_data_dir <em>Num recovery threads per data dir</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.DdsmKafkaCluster#getNum_messages_for_flush_to_dick <em>Num messages for flush to dick</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.DdsmKafkaCluster#getMax_message_sit_time_before_flush_ms <em>Max message sit time before flush ms</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.DdsmKafkaCluster#isEnable_topic_auto_creation <em>Enable topic auto creation</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.DdsmKafkaCluster#isEnable_leader_rebalancing <em>Enable leader rebalancing</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.DdsmKafkaCluster#getLog_retention_hours <em>Log retention hours</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.DdsmKafkaCluster#getQueued_max_requests <em>Queued max requests</em>}</li>
 * </ul>
 *
 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmKafkaCluster()
 * @model
 * @generated
 */
public interface DdsmKafkaCluster extends DdsmPeerToPeerPlatform {
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
	 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmKafkaCluster_Base_ExecutionEnvironment()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ExecutionEnvironment getBase_ExecutionEnvironment();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DDSM.DdsmKafkaCluster#getBase_ExecutionEnvironment <em>Base Execution Environment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Execution Environment</em>' reference.
	 * @see #getBase_ExecutionEnvironment()
	 * @generated
	 */
	void setBase_ExecutionEnvironment(ExecutionEnvironment value);

	/**
	 * Returns the value of the '<em><b>Enable topic deletion</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enable topic deletion</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enable topic deletion</em>' attribute.
	 * @see #setEnable_topic_deletion(boolean)
	 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmKafkaCluster_Enable_topic_deletion()
	 * @model default="false" dataType="org.eclipse.uml2.types.Boolean" ordered="false"
	 * @generated
	 */
	boolean isEnable_topic_deletion();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DDSM.DdsmKafkaCluster#isEnable_topic_deletion <em>Enable topic deletion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enable topic deletion</em>' attribute.
	 * @see #isEnable_topic_deletion()
	 * @generated
	 */
	void setEnable_topic_deletion(boolean value);

	/**
	 * Returns the value of the '<em><b>Num network threads</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Num network threads</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num network threads</em>' attribute.
	 * @see #setNum_network_threads(int)
	 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmKafkaCluster_Num_network_threads()
	 * @model default="0" dataType="org.eclipse.uml2.types.Integer" ordered="false"
	 * @generated
	 */
	int getNum_network_threads();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DDSM.DdsmKafkaCluster#getNum_network_threads <em>Num network threads</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num network threads</em>' attribute.
	 * @see #getNum_network_threads()
	 * @generated
	 */
	void setNum_network_threads(int value);

	/**
	 * Returns the value of the '<em><b>Num io threads</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Num io threads</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num io threads</em>' attribute.
	 * @see #setNum_io_threads(int)
	 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmKafkaCluster_Num_io_threads()
	 * @model default="0" dataType="org.eclipse.uml2.types.Integer" ordered="false"
	 * @generated
	 */
	int getNum_io_threads();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DDSM.DdsmKafkaCluster#getNum_io_threads <em>Num io threads</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num io threads</em>' attribute.
	 * @see #getNum_io_threads()
	 * @generated
	 */
	void setNum_io_threads(int value);

	/**
	 * Returns the value of the '<em><b>Num log partition per topic</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Num log partition per topic</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num log partition per topic</em>' attribute.
	 * @see #setNum_log_partition_per_topic(int)
	 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmKafkaCluster_Num_log_partition_per_topic()
	 * @model default="0" dataType="org.eclipse.uml2.types.Integer" ordered="false"
	 * @generated
	 */
	int getNum_log_partition_per_topic();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DDSM.DdsmKafkaCluster#getNum_log_partition_per_topic <em>Num log partition per topic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num log partition per topic</em>' attribute.
	 * @see #getNum_log_partition_per_topic()
	 * @generated
	 */
	void setNum_log_partition_per_topic(int value);

	/**
	 * Returns the value of the '<em><b>Num recovery threads per data dir</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Num recovery threads per data dir</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num recovery threads per data dir</em>' attribute.
	 * @see #setNum_recovery_threads_per_data_dir(int)
	 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmKafkaCluster_Num_recovery_threads_per_data_dir()
	 * @model default="0" dataType="org.eclipse.uml2.types.Integer" ordered="false"
	 * @generated
	 */
	int getNum_recovery_threads_per_data_dir();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DDSM.DdsmKafkaCluster#getNum_recovery_threads_per_data_dir <em>Num recovery threads per data dir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num recovery threads per data dir</em>' attribute.
	 * @see #getNum_recovery_threads_per_data_dir()
	 * @generated
	 */
	void setNum_recovery_threads_per_data_dir(int value);

	/**
	 * Returns the value of the '<em><b>Num messages for flush to dick</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Num messages for flush to dick</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num messages for flush to dick</em>' attribute.
	 * @see #setNum_messages_for_flush_to_dick(int)
	 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmKafkaCluster_Num_messages_for_flush_to_dick()
	 * @model default="0" dataType="org.eclipse.uml2.types.Integer" ordered="false"
	 * @generated
	 */
	int getNum_messages_for_flush_to_dick();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DDSM.DdsmKafkaCluster#getNum_messages_for_flush_to_dick <em>Num messages for flush to dick</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num messages for flush to dick</em>' attribute.
	 * @see #getNum_messages_for_flush_to_dick()
	 * @generated
	 */
	void setNum_messages_for_flush_to_dick(int value);

	/**
	 * Returns the value of the '<em><b>Max message sit time before flush ms</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max message sit time before flush ms</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max message sit time before flush ms</em>' attribute.
	 * @see #setMax_message_sit_time_before_flush_ms(int)
	 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmKafkaCluster_Max_message_sit_time_before_flush_ms()
	 * @model default="0" dataType="org.eclipse.uml2.types.Integer" ordered="false"
	 * @generated
	 */
	int getMax_message_sit_time_before_flush_ms();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DDSM.DdsmKafkaCluster#getMax_message_sit_time_before_flush_ms <em>Max message sit time before flush ms</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max message sit time before flush ms</em>' attribute.
	 * @see #getMax_message_sit_time_before_flush_ms()
	 * @generated
	 */
	void setMax_message_sit_time_before_flush_ms(int value);

	/**
	 * Returns the value of the '<em><b>Enable topic auto creation</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enable topic auto creation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enable topic auto creation</em>' attribute.
	 * @see #setEnable_topic_auto_creation(boolean)
	 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmKafkaCluster_Enable_topic_auto_creation()
	 * @model default="true" dataType="org.eclipse.uml2.types.Boolean" ordered="false"
	 * @generated
	 */
	boolean isEnable_topic_auto_creation();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DDSM.DdsmKafkaCluster#isEnable_topic_auto_creation <em>Enable topic auto creation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enable topic auto creation</em>' attribute.
	 * @see #isEnable_topic_auto_creation()
	 * @generated
	 */
	void setEnable_topic_auto_creation(boolean value);

	/**
	 * Returns the value of the '<em><b>Enable leader rebalancing</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enable leader rebalancing</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enable leader rebalancing</em>' attribute.
	 * @see #setEnable_leader_rebalancing(boolean)
	 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmKafkaCluster_Enable_leader_rebalancing()
	 * @model default="true" dataType="org.eclipse.uml2.types.Boolean" ordered="false"
	 * @generated
	 */
	boolean isEnable_leader_rebalancing();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DDSM.DdsmKafkaCluster#isEnable_leader_rebalancing <em>Enable leader rebalancing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enable leader rebalancing</em>' attribute.
	 * @see #isEnable_leader_rebalancing()
	 * @generated
	 */
	void setEnable_leader_rebalancing(boolean value);

	/**
	 * Returns the value of the '<em><b>Log retention hours</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Log retention hours</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Log retention hours</em>' attribute.
	 * @see #setLog_retention_hours(int)
	 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmKafkaCluster_Log_retention_hours()
	 * @model default="0" dataType="org.eclipse.uml2.types.Integer" ordered="false"
	 * @generated
	 */
	int getLog_retention_hours();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DDSM.DdsmKafkaCluster#getLog_retention_hours <em>Log retention hours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Log retention hours</em>' attribute.
	 * @see #getLog_retention_hours()
	 * @generated
	 */
	void setLog_retention_hours(int value);

	/**
	 * Returns the value of the '<em><b>Queued max requests</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Queued max requests</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Queued max requests</em>' attribute.
	 * @see #setQueued_max_requests(int)
	 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmKafkaCluster_Queued_max_requests()
	 * @model default="0" dataType="org.eclipse.uml2.types.Integer" ordered="false"
	 * @generated
	 */
	int getQueued_max_requests();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DDSM.DdsmKafkaCluster#getQueued_max_requests <em>Queued max requests</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Queued max requests</em>' attribute.
	 * @see #getQueued_max_requests()
	 * @generated
	 */
	void setQueued_max_requests(int value);

} // DdsmKafkaCluster
