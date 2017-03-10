/**
 */
package es.unizar.disco.dice.DDSM.impl;

import es.unizar.disco.dice.DDSM.DDSMPackage;
import es.unizar.disco.dice.DDSM.DdsmHdfsCluster;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ddsm Hdfs Cluster</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.unizar.disco.dice.DDSM.impl.DdsmHdfsClusterImpl#getDfs_blocksize <em>Dfs blocksize</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.impl.DdsmHdfsClusterImpl#getNamenode_handler_count <em>Namenode handler count</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.impl.DdsmHdfsClusterImpl#getDatanode_handler_count <em>Datanode handler count</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.impl.DdsmHdfsClusterImpl#getNamenode_heartbeat_recheck_interval_ms <em>Namenode heartbeat recheck interval ms</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.impl.DdsmHdfsClusterImpl#isPermission_enabled <em>Permission enabled</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.impl.DdsmHdfsClusterImpl#getBlock_replication <em>Block replication</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.impl.DdsmHdfsClusterImpl#getBlocksize_bytes <em>Blocksize bytes</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.impl.DdsmHdfsClusterImpl#getBlock_write_retries <em>Block write retries</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.impl.DdsmHdfsClusterImpl#isResource_manager_recovery_enabled <em>Resource manager recovery enabled</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DdsmHdfsClusterImpl extends DdsmMasterSlavePlatformImpl implements DdsmHdfsCluster {
	/**
	 * The default value of the '{@link #getDfs_blocksize() <em>Dfs blocksize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDfs_blocksize()
	 * @generated
	 * @ordered
	 */
	protected static final int DFS_BLOCKSIZE_EDEFAULT = 134217728;

	/**
	 * The cached value of the '{@link #getDfs_blocksize() <em>Dfs blocksize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDfs_blocksize()
	 * @generated
	 * @ordered
	 */
	protected int dfs_blocksize = DFS_BLOCKSIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNamenode_handler_count() <em>Namenode handler count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamenode_handler_count()
	 * @generated
	 * @ordered
	 */
	protected static final int NAMENODE_HANDLER_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNamenode_handler_count() <em>Namenode handler count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamenode_handler_count()
	 * @generated
	 * @ordered
	 */
	protected int namenode_handler_count = NAMENODE_HANDLER_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDatanode_handler_count() <em>Datanode handler count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatanode_handler_count()
	 * @generated
	 * @ordered
	 */
	protected static final int DATANODE_HANDLER_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDatanode_handler_count() <em>Datanode handler count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatanode_handler_count()
	 * @generated
	 * @ordered
	 */
	protected int datanode_handler_count = DATANODE_HANDLER_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getNamenode_heartbeat_recheck_interval_ms() <em>Namenode heartbeat recheck interval ms</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamenode_heartbeat_recheck_interval_ms()
	 * @generated
	 * @ordered
	 */
	protected static final int NAMENODE_HEARTBEAT_RECHECK_INTERVAL_MS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNamenode_heartbeat_recheck_interval_ms() <em>Namenode heartbeat recheck interval ms</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamenode_heartbeat_recheck_interval_ms()
	 * @generated
	 * @ordered
	 */
	protected int namenode_heartbeat_recheck_interval_ms = NAMENODE_HEARTBEAT_RECHECK_INTERVAL_MS_EDEFAULT;

	/**
	 * The default value of the '{@link #isPermission_enabled() <em>Permission enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPermission_enabled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PERMISSION_ENABLED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPermission_enabled() <em>Permission enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPermission_enabled()
	 * @generated
	 * @ordered
	 */
	protected boolean permission_enabled = PERMISSION_ENABLED_EDEFAULT;

	/**
	 * The default value of the '{@link #getBlock_replication() <em>Block replication</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlock_replication()
	 * @generated
	 * @ordered
	 */
	protected static final int BLOCK_REPLICATION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBlock_replication() <em>Block replication</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlock_replication()
	 * @generated
	 * @ordered
	 */
	protected int block_replication = BLOCK_REPLICATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getBlocksize_bytes() <em>Blocksize bytes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlocksize_bytes()
	 * @generated
	 * @ordered
	 */
	protected static final int BLOCKSIZE_BYTES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBlocksize_bytes() <em>Blocksize bytes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlocksize_bytes()
	 * @generated
	 * @ordered
	 */
	protected int blocksize_bytes = BLOCKSIZE_BYTES_EDEFAULT;

	/**
	 * The default value of the '{@link #getBlock_write_retries() <em>Block write retries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlock_write_retries()
	 * @generated
	 * @ordered
	 */
	protected static final int BLOCK_WRITE_RETRIES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBlock_write_retries() <em>Block write retries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlock_write_retries()
	 * @generated
	 * @ordered
	 */
	protected int block_write_retries = BLOCK_WRITE_RETRIES_EDEFAULT;

	/**
	 * The default value of the '{@link #isResource_manager_recovery_enabled() <em>Resource manager recovery enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isResource_manager_recovery_enabled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RESOURCE_MANAGER_RECOVERY_ENABLED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isResource_manager_recovery_enabled() <em>Resource manager recovery enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isResource_manager_recovery_enabled()
	 * @generated
	 * @ordered
	 */
	protected boolean resource_manager_recovery_enabled = RESOURCE_MANAGER_RECOVERY_ENABLED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DdsmHdfsClusterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DDSMPackage.Literals.DDSM_HDFS_CLUSTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDfs_blocksize() {
		return dfs_blocksize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDfs_blocksize(int newDfs_blocksize) {
		int oldDfs_blocksize = dfs_blocksize;
		dfs_blocksize = newDfs_blocksize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DDSMPackage.DDSM_HDFS_CLUSTER__DFS_BLOCKSIZE, oldDfs_blocksize, dfs_blocksize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNamenode_handler_count() {
		return namenode_handler_count;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNamenode_handler_count(int newNamenode_handler_count) {
		int oldNamenode_handler_count = namenode_handler_count;
		namenode_handler_count = newNamenode_handler_count;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DDSMPackage.DDSM_HDFS_CLUSTER__NAMENODE_HANDLER_COUNT, oldNamenode_handler_count, namenode_handler_count));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDatanode_handler_count() {
		return datanode_handler_count;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatanode_handler_count(int newDatanode_handler_count) {
		int oldDatanode_handler_count = datanode_handler_count;
		datanode_handler_count = newDatanode_handler_count;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DDSMPackage.DDSM_HDFS_CLUSTER__DATANODE_HANDLER_COUNT, oldDatanode_handler_count, datanode_handler_count));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNamenode_heartbeat_recheck_interval_ms() {
		return namenode_heartbeat_recheck_interval_ms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNamenode_heartbeat_recheck_interval_ms(int newNamenode_heartbeat_recheck_interval_ms) {
		int oldNamenode_heartbeat_recheck_interval_ms = namenode_heartbeat_recheck_interval_ms;
		namenode_heartbeat_recheck_interval_ms = newNamenode_heartbeat_recheck_interval_ms;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DDSMPackage.DDSM_HDFS_CLUSTER__NAMENODE_HEARTBEAT_RECHECK_INTERVAL_MS, oldNamenode_heartbeat_recheck_interval_ms, namenode_heartbeat_recheck_interval_ms));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPermission_enabled() {
		return permission_enabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPermission_enabled(boolean newPermission_enabled) {
		boolean oldPermission_enabled = permission_enabled;
		permission_enabled = newPermission_enabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DDSMPackage.DDSM_HDFS_CLUSTER__PERMISSION_ENABLED, oldPermission_enabled, permission_enabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBlock_replication() {
		return block_replication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBlock_replication(int newBlock_replication) {
		int oldBlock_replication = block_replication;
		block_replication = newBlock_replication;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DDSMPackage.DDSM_HDFS_CLUSTER__BLOCK_REPLICATION, oldBlock_replication, block_replication));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBlocksize_bytes() {
		return blocksize_bytes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBlocksize_bytes(int newBlocksize_bytes) {
		int oldBlocksize_bytes = blocksize_bytes;
		blocksize_bytes = newBlocksize_bytes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DDSMPackage.DDSM_HDFS_CLUSTER__BLOCKSIZE_BYTES, oldBlocksize_bytes, blocksize_bytes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBlock_write_retries() {
		return block_write_retries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBlock_write_retries(int newBlock_write_retries) {
		int oldBlock_write_retries = block_write_retries;
		block_write_retries = newBlock_write_retries;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DDSMPackage.DDSM_HDFS_CLUSTER__BLOCK_WRITE_RETRIES, oldBlock_write_retries, block_write_retries));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isResource_manager_recovery_enabled() {
		return resource_manager_recovery_enabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResource_manager_recovery_enabled(boolean newResource_manager_recovery_enabled) {
		boolean oldResource_manager_recovery_enabled = resource_manager_recovery_enabled;
		resource_manager_recovery_enabled = newResource_manager_recovery_enabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DDSMPackage.DDSM_HDFS_CLUSTER__RESOURCE_MANAGER_RECOVERY_ENABLED, oldResource_manager_recovery_enabled, resource_manager_recovery_enabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DDSMPackage.DDSM_HDFS_CLUSTER__DFS_BLOCKSIZE:
				return getDfs_blocksize();
			case DDSMPackage.DDSM_HDFS_CLUSTER__NAMENODE_HANDLER_COUNT:
				return getNamenode_handler_count();
			case DDSMPackage.DDSM_HDFS_CLUSTER__DATANODE_HANDLER_COUNT:
				return getDatanode_handler_count();
			case DDSMPackage.DDSM_HDFS_CLUSTER__NAMENODE_HEARTBEAT_RECHECK_INTERVAL_MS:
				return getNamenode_heartbeat_recheck_interval_ms();
			case DDSMPackage.DDSM_HDFS_CLUSTER__PERMISSION_ENABLED:
				return isPermission_enabled();
			case DDSMPackage.DDSM_HDFS_CLUSTER__BLOCK_REPLICATION:
				return getBlock_replication();
			case DDSMPackage.DDSM_HDFS_CLUSTER__BLOCKSIZE_BYTES:
				return getBlocksize_bytes();
			case DDSMPackage.DDSM_HDFS_CLUSTER__BLOCK_WRITE_RETRIES:
				return getBlock_write_retries();
			case DDSMPackage.DDSM_HDFS_CLUSTER__RESOURCE_MANAGER_RECOVERY_ENABLED:
				return isResource_manager_recovery_enabled();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DDSMPackage.DDSM_HDFS_CLUSTER__DFS_BLOCKSIZE:
				setDfs_blocksize((Integer)newValue);
				return;
			case DDSMPackage.DDSM_HDFS_CLUSTER__NAMENODE_HANDLER_COUNT:
				setNamenode_handler_count((Integer)newValue);
				return;
			case DDSMPackage.DDSM_HDFS_CLUSTER__DATANODE_HANDLER_COUNT:
				setDatanode_handler_count((Integer)newValue);
				return;
			case DDSMPackage.DDSM_HDFS_CLUSTER__NAMENODE_HEARTBEAT_RECHECK_INTERVAL_MS:
				setNamenode_heartbeat_recheck_interval_ms((Integer)newValue);
				return;
			case DDSMPackage.DDSM_HDFS_CLUSTER__PERMISSION_ENABLED:
				setPermission_enabled((Boolean)newValue);
				return;
			case DDSMPackage.DDSM_HDFS_CLUSTER__BLOCK_REPLICATION:
				setBlock_replication((Integer)newValue);
				return;
			case DDSMPackage.DDSM_HDFS_CLUSTER__BLOCKSIZE_BYTES:
				setBlocksize_bytes((Integer)newValue);
				return;
			case DDSMPackage.DDSM_HDFS_CLUSTER__BLOCK_WRITE_RETRIES:
				setBlock_write_retries((Integer)newValue);
				return;
			case DDSMPackage.DDSM_HDFS_CLUSTER__RESOURCE_MANAGER_RECOVERY_ENABLED:
				setResource_manager_recovery_enabled((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DDSMPackage.DDSM_HDFS_CLUSTER__DFS_BLOCKSIZE:
				setDfs_blocksize(DFS_BLOCKSIZE_EDEFAULT);
				return;
			case DDSMPackage.DDSM_HDFS_CLUSTER__NAMENODE_HANDLER_COUNT:
				setNamenode_handler_count(NAMENODE_HANDLER_COUNT_EDEFAULT);
				return;
			case DDSMPackage.DDSM_HDFS_CLUSTER__DATANODE_HANDLER_COUNT:
				setDatanode_handler_count(DATANODE_HANDLER_COUNT_EDEFAULT);
				return;
			case DDSMPackage.DDSM_HDFS_CLUSTER__NAMENODE_HEARTBEAT_RECHECK_INTERVAL_MS:
				setNamenode_heartbeat_recheck_interval_ms(NAMENODE_HEARTBEAT_RECHECK_INTERVAL_MS_EDEFAULT);
				return;
			case DDSMPackage.DDSM_HDFS_CLUSTER__PERMISSION_ENABLED:
				setPermission_enabled(PERMISSION_ENABLED_EDEFAULT);
				return;
			case DDSMPackage.DDSM_HDFS_CLUSTER__BLOCK_REPLICATION:
				setBlock_replication(BLOCK_REPLICATION_EDEFAULT);
				return;
			case DDSMPackage.DDSM_HDFS_CLUSTER__BLOCKSIZE_BYTES:
				setBlocksize_bytes(BLOCKSIZE_BYTES_EDEFAULT);
				return;
			case DDSMPackage.DDSM_HDFS_CLUSTER__BLOCK_WRITE_RETRIES:
				setBlock_write_retries(BLOCK_WRITE_RETRIES_EDEFAULT);
				return;
			case DDSMPackage.DDSM_HDFS_CLUSTER__RESOURCE_MANAGER_RECOVERY_ENABLED:
				setResource_manager_recovery_enabled(RESOURCE_MANAGER_RECOVERY_ENABLED_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DDSMPackage.DDSM_HDFS_CLUSTER__DFS_BLOCKSIZE:
				return dfs_blocksize != DFS_BLOCKSIZE_EDEFAULT;
			case DDSMPackage.DDSM_HDFS_CLUSTER__NAMENODE_HANDLER_COUNT:
				return namenode_handler_count != NAMENODE_HANDLER_COUNT_EDEFAULT;
			case DDSMPackage.DDSM_HDFS_CLUSTER__DATANODE_HANDLER_COUNT:
				return datanode_handler_count != DATANODE_HANDLER_COUNT_EDEFAULT;
			case DDSMPackage.DDSM_HDFS_CLUSTER__NAMENODE_HEARTBEAT_RECHECK_INTERVAL_MS:
				return namenode_heartbeat_recheck_interval_ms != NAMENODE_HEARTBEAT_RECHECK_INTERVAL_MS_EDEFAULT;
			case DDSMPackage.DDSM_HDFS_CLUSTER__PERMISSION_ENABLED:
				return permission_enabled != PERMISSION_ENABLED_EDEFAULT;
			case DDSMPackage.DDSM_HDFS_CLUSTER__BLOCK_REPLICATION:
				return block_replication != BLOCK_REPLICATION_EDEFAULT;
			case DDSMPackage.DDSM_HDFS_CLUSTER__BLOCKSIZE_BYTES:
				return blocksize_bytes != BLOCKSIZE_BYTES_EDEFAULT;
			case DDSMPackage.DDSM_HDFS_CLUSTER__BLOCK_WRITE_RETRIES:
				return block_write_retries != BLOCK_WRITE_RETRIES_EDEFAULT;
			case DDSMPackage.DDSM_HDFS_CLUSTER__RESOURCE_MANAGER_RECOVERY_ENABLED:
				return resource_manager_recovery_enabled != RESOURCE_MANAGER_RECOVERY_ENABLED_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (dfs_blocksize: ");
		result.append(dfs_blocksize);
		result.append(", namenode_handler_count: ");
		result.append(namenode_handler_count);
		result.append(", datanode_handler_count: ");
		result.append(datanode_handler_count);
		result.append(", namenode_heartbeat_recheck_interval_ms: ");
		result.append(namenode_heartbeat_recheck_interval_ms);
		result.append(", permission_enabled: ");
		result.append(permission_enabled);
		result.append(", block_replication: ");
		result.append(block_replication);
		result.append(", blocksize_bytes: ");
		result.append(blocksize_bytes);
		result.append(", block_write_retries: ");
		result.append(block_write_retries);
		result.append(", resource_manager_recovery_enabled: ");
		result.append(resource_manager_recovery_enabled);
		result.append(')');
		return result.toString();
	}

} //DdsmHdfsClusterImpl
