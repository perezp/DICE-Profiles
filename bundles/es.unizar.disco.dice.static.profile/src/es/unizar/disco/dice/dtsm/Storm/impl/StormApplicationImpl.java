/**
 */
package es.unizar.disco.dice.DTSM.Storm.impl;

import es.unizar.disco.dice.DTSM.Core.impl.CoreComputationNodeImpl;

import es.unizar.disco.dice.DTSM.Storm.StormApplication;
import es.unizar.disco.dice.DTSM.Storm.StormNimbus;
import es.unizar.disco.dice.DTSM.Storm.StormPackage;
import es.unizar.disco.dice.DTSM.Storm.StormSupervisor;
import es.unizar.disco.dice.DTSM.Storm.StormZookeeper;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Application</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.unizar.disco.dice.DTSM.Storm.impl.StormApplicationImpl#getHasMasterNode <em>Has Master Node</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DTSM.Storm.impl.StormApplicationImpl#getHasSlaveNode <em>Has Slave Node</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DTSM.Storm.impl.StormApplicationImpl#getDependsOnZookeeper <em>Depends On Zookeeper</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StormApplicationImpl extends CoreComputationNodeImpl implements StormApplication {
	/**
	 * The cached value of the '{@link #getHasMasterNode() <em>Has Master Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasMasterNode()
	 * @generated
	 * @ordered
	 */
	protected StormNimbus hasMasterNode;

	/**
	 * The cached value of the '{@link #getHasSlaveNode() <em>Has Slave Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasSlaveNode()
	 * @generated
	 * @ordered
	 */
	protected StormSupervisor hasSlaveNode;

	/**
	 * The cached value of the '{@link #getDependsOnZookeeper() <em>Depends On Zookeeper</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependsOnZookeeper()
	 * @generated
	 * @ordered
	 */
	protected StormZookeeper dependsOnZookeeper;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StormApplicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StormPackage.Literals.STORM_APPLICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StormNimbus getHasMasterNode() {
		if (hasMasterNode != null && hasMasterNode.eIsProxy()) {
			InternalEObject oldHasMasterNode = (InternalEObject)hasMasterNode;
			hasMasterNode = (StormNimbus)eResolveProxy(oldHasMasterNode);
			if (hasMasterNode != oldHasMasterNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StormPackage.STORM_APPLICATION__HAS_MASTER_NODE, oldHasMasterNode, hasMasterNode));
			}
		}
		return hasMasterNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StormNimbus basicGetHasMasterNode() {
		return hasMasterNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasMasterNode(StormNimbus newHasMasterNode) {
		StormNimbus oldHasMasterNode = hasMasterNode;
		hasMasterNode = newHasMasterNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StormPackage.STORM_APPLICATION__HAS_MASTER_NODE, oldHasMasterNode, hasMasterNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StormSupervisor getHasSlaveNode() {
		if (hasSlaveNode != null && hasSlaveNode.eIsProxy()) {
			InternalEObject oldHasSlaveNode = (InternalEObject)hasSlaveNode;
			hasSlaveNode = (StormSupervisor)eResolveProxy(oldHasSlaveNode);
			if (hasSlaveNode != oldHasSlaveNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StormPackage.STORM_APPLICATION__HAS_SLAVE_NODE, oldHasSlaveNode, hasSlaveNode));
			}
		}
		return hasSlaveNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StormSupervisor basicGetHasSlaveNode() {
		return hasSlaveNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasSlaveNode(StormSupervisor newHasSlaveNode) {
		StormSupervisor oldHasSlaveNode = hasSlaveNode;
		hasSlaveNode = newHasSlaveNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StormPackage.STORM_APPLICATION__HAS_SLAVE_NODE, oldHasSlaveNode, hasSlaveNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StormZookeeper getDependsOnZookeeper() {
		if (dependsOnZookeeper != null && dependsOnZookeeper.eIsProxy()) {
			InternalEObject oldDependsOnZookeeper = (InternalEObject)dependsOnZookeeper;
			dependsOnZookeeper = (StormZookeeper)eResolveProxy(oldDependsOnZookeeper);
			if (dependsOnZookeeper != oldDependsOnZookeeper) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StormPackage.STORM_APPLICATION__DEPENDS_ON_ZOOKEEPER, oldDependsOnZookeeper, dependsOnZookeeper));
			}
		}
		return dependsOnZookeeper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StormZookeeper basicGetDependsOnZookeeper() {
		return dependsOnZookeeper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDependsOnZookeeper(StormZookeeper newDependsOnZookeeper) {
		StormZookeeper oldDependsOnZookeeper = dependsOnZookeeper;
		dependsOnZookeeper = newDependsOnZookeeper;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StormPackage.STORM_APPLICATION__DEPENDS_ON_ZOOKEEPER, oldDependsOnZookeeper, dependsOnZookeeper));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StormPackage.STORM_APPLICATION__HAS_MASTER_NODE:
				if (resolve) return getHasMasterNode();
				return basicGetHasMasterNode();
			case StormPackage.STORM_APPLICATION__HAS_SLAVE_NODE:
				if (resolve) return getHasSlaveNode();
				return basicGetHasSlaveNode();
			case StormPackage.STORM_APPLICATION__DEPENDS_ON_ZOOKEEPER:
				if (resolve) return getDependsOnZookeeper();
				return basicGetDependsOnZookeeper();
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
			case StormPackage.STORM_APPLICATION__HAS_MASTER_NODE:
				setHasMasterNode((StormNimbus)newValue);
				return;
			case StormPackage.STORM_APPLICATION__HAS_SLAVE_NODE:
				setHasSlaveNode((StormSupervisor)newValue);
				return;
			case StormPackage.STORM_APPLICATION__DEPENDS_ON_ZOOKEEPER:
				setDependsOnZookeeper((StormZookeeper)newValue);
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
			case StormPackage.STORM_APPLICATION__HAS_MASTER_NODE:
				setHasMasterNode((StormNimbus)null);
				return;
			case StormPackage.STORM_APPLICATION__HAS_SLAVE_NODE:
				setHasSlaveNode((StormSupervisor)null);
				return;
			case StormPackage.STORM_APPLICATION__DEPENDS_ON_ZOOKEEPER:
				setDependsOnZookeeper((StormZookeeper)null);
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
			case StormPackage.STORM_APPLICATION__HAS_MASTER_NODE:
				return hasMasterNode != null;
			case StormPackage.STORM_APPLICATION__HAS_SLAVE_NODE:
				return hasSlaveNode != null;
			case StormPackage.STORM_APPLICATION__DEPENDS_ON_ZOOKEEPER:
				return dependsOnZookeeper != null;
		}
		return super.eIsSet(featureID);
	}

} //StormApplicationImpl
