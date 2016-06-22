/**
 */
package es.unizar.disco.dice.dtsm.Storm.impl;

import es.unizar.disco.dice.dtsm.Core.impl.CoreDirectAcyclicGraphImpl;

import es.unizar.disco.dice.dtsm.Storm.StormPackage;
import es.unizar.disco.dice.dtsm.Storm.StormScenarioTopology;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scenario Topology</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.unizar.disco.dice.dtsm.Storm.impl.StormScenarioTopologyImpl#getQueueThreshold <em>Queue Threshold</em>}</li>
 *   <li>{@link es.unizar.disco.dice.dtsm.Storm.impl.StormScenarioTopologyImpl#getMaxTaskParallelism <em>Max Task Parallelism</em>}</li>
 *   <li>{@link es.unizar.disco.dice.dtsm.Storm.impl.StormScenarioTopologyImpl#getMaxSpoutPending <em>Max Spout Pending</em>}</li>
 *   <li>{@link es.unizar.disco.dice.dtsm.Storm.impl.StormScenarioTopologyImpl#isReliable <em>Is Reliable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StormScenarioTopologyImpl extends CoreDirectAcyclicGraphImpl implements StormScenarioTopology {
	/**
	 * The default value of the '{@link #getQueueThreshold() <em>Queue Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueueThreshold()
	 * @generated
	 * @ordered
	 */
	protected static final int QUEUE_THRESHOLD_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getQueueThreshold() <em>Queue Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueueThreshold()
	 * @generated
	 * @ordered
	 */
	protected int queueThreshold = QUEUE_THRESHOLD_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxTaskParallelism() <em>Max Task Parallelism</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxTaskParallelism()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_TASK_PARALLELISM_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxTaskParallelism() <em>Max Task Parallelism</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxTaskParallelism()
	 * @generated
	 * @ordered
	 */
	protected int maxTaskParallelism = MAX_TASK_PARALLELISM_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxSpoutPending() <em>Max Spout Pending</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxSpoutPending()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_SPOUT_PENDING_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxSpoutPending() <em>Max Spout Pending</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxSpoutPending()
	 * @generated
	 * @ordered
	 */
	protected int maxSpoutPending = MAX_SPOUT_PENDING_EDEFAULT;

	/**
	 * The default value of the '{@link #isReliable() <em>Is Reliable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReliable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_RELIABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isReliable() <em>Is Reliable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReliable()
	 * @generated
	 * @ordered
	 */
	protected boolean isReliable = IS_RELIABLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StormScenarioTopologyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StormPackage.Literals.STORM_SCENARIO_TOPOLOGY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getQueueThreshold() {
		return queueThreshold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQueueThreshold(int newQueueThreshold) {
		int oldQueueThreshold = queueThreshold;
		queueThreshold = newQueueThreshold;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StormPackage.STORM_SCENARIO_TOPOLOGY__QUEUE_THRESHOLD, oldQueueThreshold, queueThreshold));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxTaskParallelism() {
		return maxTaskParallelism;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxTaskParallelism(int newMaxTaskParallelism) {
		int oldMaxTaskParallelism = maxTaskParallelism;
		maxTaskParallelism = newMaxTaskParallelism;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StormPackage.STORM_SCENARIO_TOPOLOGY__MAX_TASK_PARALLELISM, oldMaxTaskParallelism, maxTaskParallelism));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxSpoutPending() {
		return maxSpoutPending;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxSpoutPending(int newMaxSpoutPending) {
		int oldMaxSpoutPending = maxSpoutPending;
		maxSpoutPending = newMaxSpoutPending;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StormPackage.STORM_SCENARIO_TOPOLOGY__MAX_SPOUT_PENDING, oldMaxSpoutPending, maxSpoutPending));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isReliable() {
		return isReliable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsReliable(boolean newIsReliable) {
		boolean oldIsReliable = isReliable;
		isReliable = newIsReliable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StormPackage.STORM_SCENARIO_TOPOLOGY__IS_RELIABLE, oldIsReliable, isReliable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StormPackage.STORM_SCENARIO_TOPOLOGY__QUEUE_THRESHOLD:
				return getQueueThreshold();
			case StormPackage.STORM_SCENARIO_TOPOLOGY__MAX_TASK_PARALLELISM:
				return getMaxTaskParallelism();
			case StormPackage.STORM_SCENARIO_TOPOLOGY__MAX_SPOUT_PENDING:
				return getMaxSpoutPending();
			case StormPackage.STORM_SCENARIO_TOPOLOGY__IS_RELIABLE:
				return isReliable();
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
			case StormPackage.STORM_SCENARIO_TOPOLOGY__QUEUE_THRESHOLD:
				setQueueThreshold((Integer)newValue);
				return;
			case StormPackage.STORM_SCENARIO_TOPOLOGY__MAX_TASK_PARALLELISM:
				setMaxTaskParallelism((Integer)newValue);
				return;
			case StormPackage.STORM_SCENARIO_TOPOLOGY__MAX_SPOUT_PENDING:
				setMaxSpoutPending((Integer)newValue);
				return;
			case StormPackage.STORM_SCENARIO_TOPOLOGY__IS_RELIABLE:
				setIsReliable((Boolean)newValue);
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
			case StormPackage.STORM_SCENARIO_TOPOLOGY__QUEUE_THRESHOLD:
				setQueueThreshold(QUEUE_THRESHOLD_EDEFAULT);
				return;
			case StormPackage.STORM_SCENARIO_TOPOLOGY__MAX_TASK_PARALLELISM:
				setMaxTaskParallelism(MAX_TASK_PARALLELISM_EDEFAULT);
				return;
			case StormPackage.STORM_SCENARIO_TOPOLOGY__MAX_SPOUT_PENDING:
				setMaxSpoutPending(MAX_SPOUT_PENDING_EDEFAULT);
				return;
			case StormPackage.STORM_SCENARIO_TOPOLOGY__IS_RELIABLE:
				setIsReliable(IS_RELIABLE_EDEFAULT);
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
			case StormPackage.STORM_SCENARIO_TOPOLOGY__QUEUE_THRESHOLD:
				return queueThreshold != QUEUE_THRESHOLD_EDEFAULT;
			case StormPackage.STORM_SCENARIO_TOPOLOGY__MAX_TASK_PARALLELISM:
				return maxTaskParallelism != MAX_TASK_PARALLELISM_EDEFAULT;
			case StormPackage.STORM_SCENARIO_TOPOLOGY__MAX_SPOUT_PENDING:
				return maxSpoutPending != MAX_SPOUT_PENDING_EDEFAULT;
			case StormPackage.STORM_SCENARIO_TOPOLOGY__IS_RELIABLE:
				return isReliable != IS_RELIABLE_EDEFAULT;
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
		result.append(" (queueThreshold: ");
		result.append(queueThreshold);
		result.append(", maxTaskParallelism: ");
		result.append(maxTaskParallelism);
		result.append(", maxSpoutPending: ");
		result.append(maxSpoutPending);
		result.append(", isReliable: ");
		result.append(isReliable);
		result.append(')');
		return result.toString();
	}

} //StormScenarioTopologyImpl
