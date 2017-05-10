/**
 */
package es.unizar.disco.dice.DDSM;

import es.unizar.disco.dice.Complex_Data_Types.MongoDBShard;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ddsm Mongo DB Cluster</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.unizar.disco.dice.DDSM.DdsmMongoDBCluster#isShardingMode <em>Sharding Mode</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.DdsmMongoDBCluster#getRouterServerHost <em>Router Server Host</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.DdsmMongoDBCluster#getShards <em>Shards</em>}</li>
 * </ul>
 *
 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmMongoDBCluster()
 * @model
 * @generated
 */
public interface DdsmMongoDBCluster extends DdsmPeerToPeerPlatform {
	/**
	 * Returns the value of the '<em><b>Sharding Mode</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sharding Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sharding Mode</em>' attribute.
	 * @see #setShardingMode(boolean)
	 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmMongoDBCluster_ShardingMode()
	 * @model default="false" dataType="org.eclipse.uml2.types.Boolean" ordered="false"
	 * @generated
	 */
	boolean isShardingMode();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DDSM.DdsmMongoDBCluster#isShardingMode <em>Sharding Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sharding Mode</em>' attribute.
	 * @see #isShardingMode()
	 * @generated
	 */
	void setShardingMode(boolean value);

	/**
	 * Returns the value of the '<em><b>Router Server Host</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Router Server Host</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Router Server Host</em>' reference.
	 * @see #setRouterServerHost(DdsmVMsCluster)
	 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmMongoDBCluster_RouterServerHost()
	 * @model ordered="false"
	 * @generated
	 */
	DdsmVMsCluster getRouterServerHost();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DDSM.DdsmMongoDBCluster#getRouterServerHost <em>Router Server Host</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Router Server Host</em>' reference.
	 * @see #getRouterServerHost()
	 * @generated
	 */
	void setRouterServerHost(DdsmVMsCluster value);

	/**
	 * Returns the value of the '<em><b>Shards</b></em>' containment reference list.
	 * The list contents are of type {@link es.unizar.disco.dice.Complex_Data_Types.MongoDBShard}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shards</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shards</em>' containment reference list.
	 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmMongoDBCluster_Shards()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<MongoDBShard> getShards();

} // DdsmMongoDBCluster
