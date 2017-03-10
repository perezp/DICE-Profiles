/**
 */
package es.unizar.disco.dice.DDSM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ddsm Hdfs Cluster</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.unizar.disco.dice.DDSM.DdsmHdfsCluster#getDfs_blocksize <em>Dfs blocksize</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.DdsmHdfsCluster#getNamenode_handler_count <em>Namenode handler count</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.DdsmHdfsCluster#getDatanode_handler_count <em>Datanode handler count</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.DdsmHdfsCluster#getNamenode_heartbeat_recheck_interval_ms <em>Namenode heartbeat recheck interval ms</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.DdsmHdfsCluster#isPermission_enabled <em>Permission enabled</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.DdsmHdfsCluster#getBlock_replication <em>Block replication</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.DdsmHdfsCluster#getBlocksize_bytes <em>Blocksize bytes</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.DdsmHdfsCluster#getBlock_write_retries <em>Block write retries</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.DdsmHdfsCluster#isResource_manager_recovery_enabled <em>Resource manager recovery enabled</em>}</li>
 * </ul>
 *
 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmHdfsCluster()
 * @model
 * @generated
 */
public interface DdsmHdfsCluster extends DdsmMasterSlavePlatform {
	/**
	 * Returns the value of the '<em><b>Dfs blocksize</b></em>' attribute.
	 * The default value is <code>"134217728"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dfs blocksize</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dfs blocksize</em>' attribute.
	 * @see #setDfs_blocksize(int)
	 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmHdfsCluster_Dfs_blocksize()
	 * @model default="134217728" dataType="org.eclipse.uml2.types.Integer" ordered="false"
	 * @generated
	 */
	int getDfs_blocksize();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DDSM.DdsmHdfsCluster#getDfs_blocksize <em>Dfs blocksize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dfs blocksize</em>' attribute.
	 * @see #getDfs_blocksize()
	 * @generated
	 */
	void setDfs_blocksize(int value);

	/**
	 * Returns the value of the '<em><b>Namenode handler count</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Namenode handler count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Namenode handler count</em>' attribute.
	 * @see #setNamenode_handler_count(int)
	 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmHdfsCluster_Namenode_handler_count()
	 * @model default="0" dataType="org.eclipse.uml2.types.Integer" ordered="false"
	 * @generated
	 */
	int getNamenode_handler_count();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DDSM.DdsmHdfsCluster#getNamenode_handler_count <em>Namenode handler count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Namenode handler count</em>' attribute.
	 * @see #getNamenode_handler_count()
	 * @generated
	 */
	void setNamenode_handler_count(int value);

	/**
	 * Returns the value of the '<em><b>Datanode handler count</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datanode handler count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datanode handler count</em>' attribute.
	 * @see #setDatanode_handler_count(int)
	 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmHdfsCluster_Datanode_handler_count()
	 * @model default="0" dataType="org.eclipse.uml2.types.Integer" ordered="false"
	 * @generated
	 */
	int getDatanode_handler_count();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DDSM.DdsmHdfsCluster#getDatanode_handler_count <em>Datanode handler count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datanode handler count</em>' attribute.
	 * @see #getDatanode_handler_count()
	 * @generated
	 */
	void setDatanode_handler_count(int value);

	/**
	 * Returns the value of the '<em><b>Namenode heartbeat recheck interval ms</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Namenode heartbeat recheck interval ms</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Namenode heartbeat recheck interval ms</em>' attribute.
	 * @see #setNamenode_heartbeat_recheck_interval_ms(int)
	 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmHdfsCluster_Namenode_heartbeat_recheck_interval_ms()
	 * @model default="0" dataType="org.eclipse.uml2.types.Integer" ordered="false"
	 * @generated
	 */
	int getNamenode_heartbeat_recheck_interval_ms();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DDSM.DdsmHdfsCluster#getNamenode_heartbeat_recheck_interval_ms <em>Namenode heartbeat recheck interval ms</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Namenode heartbeat recheck interval ms</em>' attribute.
	 * @see #getNamenode_heartbeat_recheck_interval_ms()
	 * @generated
	 */
	void setNamenode_heartbeat_recheck_interval_ms(int value);

	/**
	 * Returns the value of the '<em><b>Permission enabled</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Permission enabled</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Permission enabled</em>' attribute.
	 * @see #setPermission_enabled(boolean)
	 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmHdfsCluster_Permission_enabled()
	 * @model default="false" dataType="org.eclipse.uml2.types.Boolean" ordered="false"
	 * @generated
	 */
	boolean isPermission_enabled();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DDSM.DdsmHdfsCluster#isPermission_enabled <em>Permission enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Permission enabled</em>' attribute.
	 * @see #isPermission_enabled()
	 * @generated
	 */
	void setPermission_enabled(boolean value);

	/**
	 * Returns the value of the '<em><b>Block replication</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Block replication</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Block replication</em>' attribute.
	 * @see #setBlock_replication(int)
	 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmHdfsCluster_Block_replication()
	 * @model default="0" dataType="org.eclipse.uml2.types.Integer" ordered="false"
	 * @generated
	 */
	int getBlock_replication();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DDSM.DdsmHdfsCluster#getBlock_replication <em>Block replication</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Block replication</em>' attribute.
	 * @see #getBlock_replication()
	 * @generated
	 */
	void setBlock_replication(int value);

	/**
	 * Returns the value of the '<em><b>Blocksize bytes</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Blocksize bytes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blocksize bytes</em>' attribute.
	 * @see #setBlocksize_bytes(int)
	 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmHdfsCluster_Blocksize_bytes()
	 * @model default="0" dataType="org.eclipse.uml2.types.Integer" ordered="false"
	 * @generated
	 */
	int getBlocksize_bytes();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DDSM.DdsmHdfsCluster#getBlocksize_bytes <em>Blocksize bytes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Blocksize bytes</em>' attribute.
	 * @see #getBlocksize_bytes()
	 * @generated
	 */
	void setBlocksize_bytes(int value);

	/**
	 * Returns the value of the '<em><b>Block write retries</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Block write retries</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Block write retries</em>' attribute.
	 * @see #setBlock_write_retries(int)
	 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmHdfsCluster_Block_write_retries()
	 * @model default="0" dataType="org.eclipse.uml2.types.Integer" ordered="false"
	 * @generated
	 */
	int getBlock_write_retries();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DDSM.DdsmHdfsCluster#getBlock_write_retries <em>Block write retries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Block write retries</em>' attribute.
	 * @see #getBlock_write_retries()
	 * @generated
	 */
	void setBlock_write_retries(int value);

	/**
	 * Returns the value of the '<em><b>Resource manager recovery enabled</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource manager recovery enabled</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource manager recovery enabled</em>' attribute.
	 * @see #setResource_manager_recovery_enabled(boolean)
	 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmHdfsCluster_Resource_manager_recovery_enabled()
	 * @model default="false" dataType="org.eclipse.uml2.types.Boolean" ordered="false"
	 * @generated
	 */
	boolean isResource_manager_recovery_enabled();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DDSM.DdsmHdfsCluster#isResource_manager_recovery_enabled <em>Resource manager recovery enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource manager recovery enabled</em>' attribute.
	 * @see #isResource_manager_recovery_enabled()
	 * @generated
	 */
	void setResource_manager_recovery_enabled(boolean value);

} // DdsmHdfsCluster
