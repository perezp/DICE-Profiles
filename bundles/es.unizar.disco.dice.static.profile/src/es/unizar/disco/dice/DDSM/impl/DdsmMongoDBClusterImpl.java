/**
 */
package es.unizar.disco.dice.DDSM.impl;

import es.unizar.disco.dice.Complex_Data_Types.MongoDBShard;

import es.unizar.disco.dice.DDSM.DDSMPackage;
import es.unizar.disco.dice.DDSM.DdsmMongoDBCluster;
import es.unizar.disco.dice.DDSM.DdsmVMsCluster;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ddsm Mongo DB Cluster</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.unizar.disco.dice.DDSM.impl.DdsmMongoDBClusterImpl#isShardingMode <em>Sharding Mode</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.impl.DdsmMongoDBClusterImpl#getRouterServerHost <em>Router Server Host</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.impl.DdsmMongoDBClusterImpl#getShards <em>Shards</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DdsmMongoDBClusterImpl extends DdsmPeerToPeerPlatformImpl implements DdsmMongoDBCluster {
	/**
	 * The default value of the '{@link #isShardingMode() <em>Sharding Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShardingMode()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SHARDING_MODE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isShardingMode() <em>Sharding Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShardingMode()
	 * @generated
	 * @ordered
	 */
	protected boolean shardingMode = SHARDING_MODE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRouterServerHost() <em>Router Server Host</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRouterServerHost()
	 * @generated
	 * @ordered
	 */
	protected DdsmVMsCluster routerServerHost;

	/**
	 * The cached value of the '{@link #getShards() <em>Shards</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShards()
	 * @generated
	 * @ordered
	 */
	protected EList<MongoDBShard> shards;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DdsmMongoDBClusterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DDSMPackage.Literals.DDSM_MONGO_DB_CLUSTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isShardingMode() {
		return shardingMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShardingMode(boolean newShardingMode) {
		boolean oldShardingMode = shardingMode;
		shardingMode = newShardingMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DDSMPackage.DDSM_MONGO_DB_CLUSTER__SHARDING_MODE, oldShardingMode, shardingMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsmVMsCluster getRouterServerHost() {
		if (routerServerHost != null && routerServerHost.eIsProxy()) {
			InternalEObject oldRouterServerHost = (InternalEObject)routerServerHost;
			routerServerHost = (DdsmVMsCluster)eResolveProxy(oldRouterServerHost);
			if (routerServerHost != oldRouterServerHost) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DDSMPackage.DDSM_MONGO_DB_CLUSTER__ROUTER_SERVER_HOST, oldRouterServerHost, routerServerHost));
			}
		}
		return routerServerHost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsmVMsCluster basicGetRouterServerHost() {
		return routerServerHost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRouterServerHost(DdsmVMsCluster newRouterServerHost) {
		DdsmVMsCluster oldRouterServerHost = routerServerHost;
		routerServerHost = newRouterServerHost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DDSMPackage.DDSM_MONGO_DB_CLUSTER__ROUTER_SERVER_HOST, oldRouterServerHost, routerServerHost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MongoDBShard> getShards() {
		if (shards == null) {
			shards = new EObjectContainmentEList<MongoDBShard>(MongoDBShard.class, this, DDSMPackage.DDSM_MONGO_DB_CLUSTER__SHARDS);
		}
		return shards;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DDSMPackage.DDSM_MONGO_DB_CLUSTER__SHARDS:
				return ((InternalEList<?>)getShards()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DDSMPackage.DDSM_MONGO_DB_CLUSTER__SHARDING_MODE:
				return isShardingMode();
			case DDSMPackage.DDSM_MONGO_DB_CLUSTER__ROUTER_SERVER_HOST:
				if (resolve) return getRouterServerHost();
				return basicGetRouterServerHost();
			case DDSMPackage.DDSM_MONGO_DB_CLUSTER__SHARDS:
				return getShards();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DDSMPackage.DDSM_MONGO_DB_CLUSTER__SHARDING_MODE:
				setShardingMode((Boolean)newValue);
				return;
			case DDSMPackage.DDSM_MONGO_DB_CLUSTER__ROUTER_SERVER_HOST:
				setRouterServerHost((DdsmVMsCluster)newValue);
				return;
			case DDSMPackage.DDSM_MONGO_DB_CLUSTER__SHARDS:
				getShards().clear();
				getShards().addAll((Collection<? extends MongoDBShard>)newValue);
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
			case DDSMPackage.DDSM_MONGO_DB_CLUSTER__SHARDING_MODE:
				setShardingMode(SHARDING_MODE_EDEFAULT);
				return;
			case DDSMPackage.DDSM_MONGO_DB_CLUSTER__ROUTER_SERVER_HOST:
				setRouterServerHost((DdsmVMsCluster)null);
				return;
			case DDSMPackage.DDSM_MONGO_DB_CLUSTER__SHARDS:
				getShards().clear();
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
			case DDSMPackage.DDSM_MONGO_DB_CLUSTER__SHARDING_MODE:
				return shardingMode != SHARDING_MODE_EDEFAULT;
			case DDSMPackage.DDSM_MONGO_DB_CLUSTER__ROUTER_SERVER_HOST:
				return routerServerHost != null;
			case DDSMPackage.DDSM_MONGO_DB_CLUSTER__SHARDS:
				return shards != null && !shards.isEmpty();
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
		result.append(" (shardingMode: ");
		result.append(shardingMode);
		result.append(')');
		return result.toString();
	}

} //DdsmMongoDBClusterImpl
