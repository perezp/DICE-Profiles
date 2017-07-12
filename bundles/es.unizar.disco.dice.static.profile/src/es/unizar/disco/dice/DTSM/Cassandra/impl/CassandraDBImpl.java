/**
 */
package es.unizar.disco.dice.DTSM.Cassandra.impl;

import es.unizar.disco.dice.Basic_Enumeration_Types.CassandraConsistencyLevelType;

import es.unizar.disco.dice.DTSM.Cassandra.CassandraDB;
import es.unizar.disco.dice.DTSM.Cassandra.CassandraPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.uml2.uml.Node;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DB</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.unizar.disco.dice.DTSM.Cassandra.impl.CassandraDBImpl#getReplicationFactor <em>Replication Factor</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DTSM.Cassandra.impl.CassandraDBImpl#getConsistencyLevel <em>Consistency Level</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DTSM.Cassandra.impl.CassandraDBImpl#getBase_Node <em>Base Node</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CassandraDBImpl extends MinimalEObjectImpl.Container implements CassandraDB {
	/**
	 * The default value of the '{@link #getReplicationFactor() <em>Replication Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplicationFactor()
	 * @generated
	 * @ordered
	 */
	protected static final int REPLICATION_FACTOR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getReplicationFactor() <em>Replication Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplicationFactor()
	 * @generated
	 * @ordered
	 */
	protected int replicationFactor = REPLICATION_FACTOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getConsistencyLevel() <em>Consistency Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsistencyLevel()
	 * @generated
	 * @ordered
	 */
	protected static final CassandraConsistencyLevelType CONSISTENCY_LEVEL_EDEFAULT = CassandraConsistencyLevelType.ONE;

	/**
	 * The cached value of the '{@link #getConsistencyLevel() <em>Consistency Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsistencyLevel()
	 * @generated
	 * @ordered
	 */
	protected CassandraConsistencyLevelType consistencyLevel = CONSISTENCY_LEVEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBase_Node() <em>Base Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Node()
	 * @generated
	 * @ordered
	 */
	protected Node base_Node;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CassandraDBImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CassandraPackage.Literals.CASSANDRA_DB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getReplicationFactor() {
		return replicationFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReplicationFactor(int newReplicationFactor) {
		int oldReplicationFactor = replicationFactor;
		replicationFactor = newReplicationFactor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CassandraPackage.CASSANDRA_DB__REPLICATION_FACTOR, oldReplicationFactor, replicationFactor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CassandraConsistencyLevelType getConsistencyLevel() {
		return consistencyLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConsistencyLevel(CassandraConsistencyLevelType newConsistencyLevel) {
		CassandraConsistencyLevelType oldConsistencyLevel = consistencyLevel;
		consistencyLevel = newConsistencyLevel == null ? CONSISTENCY_LEVEL_EDEFAULT : newConsistencyLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CassandraPackage.CASSANDRA_DB__CONSISTENCY_LEVEL, oldConsistencyLevel, consistencyLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getBase_Node() {
		if (base_Node != null && base_Node.eIsProxy()) {
			InternalEObject oldBase_Node = (InternalEObject)base_Node;
			base_Node = (Node)eResolveProxy(oldBase_Node);
			if (base_Node != oldBase_Node) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CassandraPackage.CASSANDRA_DB__BASE_NODE, oldBase_Node, base_Node));
			}
		}
		return base_Node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node basicGetBase_Node() {
		return base_Node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Node(Node newBase_Node) {
		Node oldBase_Node = base_Node;
		base_Node = newBase_Node;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CassandraPackage.CASSANDRA_DB__BASE_NODE, oldBase_Node, base_Node));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CassandraPackage.CASSANDRA_DB__REPLICATION_FACTOR:
				return getReplicationFactor();
			case CassandraPackage.CASSANDRA_DB__CONSISTENCY_LEVEL:
				return getConsistencyLevel();
			case CassandraPackage.CASSANDRA_DB__BASE_NODE:
				if (resolve) return getBase_Node();
				return basicGetBase_Node();
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
			case CassandraPackage.CASSANDRA_DB__REPLICATION_FACTOR:
				setReplicationFactor((Integer)newValue);
				return;
			case CassandraPackage.CASSANDRA_DB__CONSISTENCY_LEVEL:
				setConsistencyLevel((CassandraConsistencyLevelType)newValue);
				return;
			case CassandraPackage.CASSANDRA_DB__BASE_NODE:
				setBase_Node((Node)newValue);
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
			case CassandraPackage.CASSANDRA_DB__REPLICATION_FACTOR:
				setReplicationFactor(REPLICATION_FACTOR_EDEFAULT);
				return;
			case CassandraPackage.CASSANDRA_DB__CONSISTENCY_LEVEL:
				setConsistencyLevel(CONSISTENCY_LEVEL_EDEFAULT);
				return;
			case CassandraPackage.CASSANDRA_DB__BASE_NODE:
				setBase_Node((Node)null);
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
			case CassandraPackage.CASSANDRA_DB__REPLICATION_FACTOR:
				return replicationFactor != REPLICATION_FACTOR_EDEFAULT;
			case CassandraPackage.CASSANDRA_DB__CONSISTENCY_LEVEL:
				return consistencyLevel != CONSISTENCY_LEVEL_EDEFAULT;
			case CassandraPackage.CASSANDRA_DB__BASE_NODE:
				return base_Node != null;
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
		result.append(" (replicationFactor: ");
		result.append(replicationFactor);
		result.append(", consistencyLevel: ");
		result.append(consistencyLevel);
		result.append(')');
		return result.toString();
	}

} //CassandraDBImpl
