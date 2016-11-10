/**
 */
package es.unizar.disco.dice.DTSM.Core.impl;

import es.unizar.disco.dice.DPIM.impl.DpimComputationNodeImpl;

import es.unizar.disco.dice.DTSM.Core.CoreComputationNode;
import es.unizar.disco.dice.DTSM.Core.CoreData;
import es.unizar.disco.dice.DTSM.Core.CoreDirectAcyclicGraph;
import es.unizar.disco.dice.DTSM.Core.CorePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Computation Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.unizar.disco.dice.DTSM.Core.impl.CoreComputationNodeImpl#getHasSuccessor <em>Has Successor</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DTSM.Core.impl.CoreComputationNodeImpl#getProcessInputData <em>Process Input Data</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DTSM.Core.impl.CoreComputationNodeImpl#getRealise <em>Realise</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DTSM.Core.impl.CoreComputationNodeImpl#getProduceOutputData <em>Produce Output Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CoreComputationNodeImpl extends DpimComputationNodeImpl implements CoreComputationNode {
	/**
	 * The cached value of the '{@link #getHasSuccessor() <em>Has Successor</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasSuccessor()
	 * @generated
	 * @ordered
	 */
	protected EList<CoreComputationNode> hasSuccessor;

	/**
	 * The cached value of the '{@link #getProcessInputData() <em>Process Input Data</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessInputData()
	 * @generated
	 * @ordered
	 */
	protected EList<CoreData> processInputData;

	/**
	 * The cached value of the '{@link #getRealise() <em>Realise</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealise()
	 * @generated
	 * @ordered
	 */
	protected CoreDirectAcyclicGraph realise;

	/**
	 * The cached value of the '{@link #getProduceOutputData() <em>Produce Output Data</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProduceOutputData()
	 * @generated
	 * @ordered
	 */
	protected EList<CoreData> produceOutputData;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoreComputationNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.CORE_COMPUTATION_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CoreComputationNode> getHasSuccessor() {
		if (hasSuccessor == null) {
			hasSuccessor = new EObjectResolvingEList<CoreComputationNode>(CoreComputationNode.class, this, CorePackage.CORE_COMPUTATION_NODE__HAS_SUCCESSOR);
		}
		return hasSuccessor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CoreData> getProcessInputData() {
		if (processInputData == null) {
			processInputData = new EObjectResolvingEList<CoreData>(CoreData.class, this, CorePackage.CORE_COMPUTATION_NODE__PROCESS_INPUT_DATA);
		}
		return processInputData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoreDirectAcyclicGraph getRealise() {
		if (realise != null && realise.eIsProxy()) {
			InternalEObject oldRealise = (InternalEObject)realise;
			realise = (CoreDirectAcyclicGraph)eResolveProxy(oldRealise);
			if (realise != oldRealise) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.CORE_COMPUTATION_NODE__REALISE, oldRealise, realise));
			}
		}
		return realise;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoreDirectAcyclicGraph basicGetRealise() {
		return realise;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRealise(CoreDirectAcyclicGraph newRealise) {
		CoreDirectAcyclicGraph oldRealise = realise;
		realise = newRealise;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.CORE_COMPUTATION_NODE__REALISE, oldRealise, realise));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CoreData> getProduceOutputData() {
		if (produceOutputData == null) {
			produceOutputData = new EObjectResolvingEList<CoreData>(CoreData.class, this, CorePackage.CORE_COMPUTATION_NODE__PRODUCE_OUTPUT_DATA);
		}
		return produceOutputData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.CORE_COMPUTATION_NODE__HAS_SUCCESSOR:
				return getHasSuccessor();
			case CorePackage.CORE_COMPUTATION_NODE__PROCESS_INPUT_DATA:
				return getProcessInputData();
			case CorePackage.CORE_COMPUTATION_NODE__REALISE:
				if (resolve) return getRealise();
				return basicGetRealise();
			case CorePackage.CORE_COMPUTATION_NODE__PRODUCE_OUTPUT_DATA:
				return getProduceOutputData();
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
			case CorePackage.CORE_COMPUTATION_NODE__HAS_SUCCESSOR:
				getHasSuccessor().clear();
				getHasSuccessor().addAll((Collection<? extends CoreComputationNode>)newValue);
				return;
			case CorePackage.CORE_COMPUTATION_NODE__PROCESS_INPUT_DATA:
				getProcessInputData().clear();
				getProcessInputData().addAll((Collection<? extends CoreData>)newValue);
				return;
			case CorePackage.CORE_COMPUTATION_NODE__REALISE:
				setRealise((CoreDirectAcyclicGraph)newValue);
				return;
			case CorePackage.CORE_COMPUTATION_NODE__PRODUCE_OUTPUT_DATA:
				getProduceOutputData().clear();
				getProduceOutputData().addAll((Collection<? extends CoreData>)newValue);
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
			case CorePackage.CORE_COMPUTATION_NODE__HAS_SUCCESSOR:
				getHasSuccessor().clear();
				return;
			case CorePackage.CORE_COMPUTATION_NODE__PROCESS_INPUT_DATA:
				getProcessInputData().clear();
				return;
			case CorePackage.CORE_COMPUTATION_NODE__REALISE:
				setRealise((CoreDirectAcyclicGraph)null);
				return;
			case CorePackage.CORE_COMPUTATION_NODE__PRODUCE_OUTPUT_DATA:
				getProduceOutputData().clear();
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
			case CorePackage.CORE_COMPUTATION_NODE__HAS_SUCCESSOR:
				return hasSuccessor != null && !hasSuccessor.isEmpty();
			case CorePackage.CORE_COMPUTATION_NODE__PROCESS_INPUT_DATA:
				return processInputData != null && !processInputData.isEmpty();
			case CorePackage.CORE_COMPUTATION_NODE__REALISE:
				return realise != null;
			case CorePackage.CORE_COMPUTATION_NODE__PRODUCE_OUTPUT_DATA:
				return produceOutputData != null && !produceOutputData.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CoreComputationNodeImpl
