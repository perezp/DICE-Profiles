/**
 */
package es.unizar.disco.dice.dtsm.Core.impl;

import es.unizar.disco.dice.Basic_Enumeration_Types.WorkflowOperation;

import es.unizar.disco.dice.DPIM.impl.DpimSourceNodeImpl;

import es.unizar.disco.dice.dtsm.Core.CoreDAGNode;
import es.unizar.disco.dice.dtsm.Core.CorePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DAG Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.unizar.disco.dice.dtsm.Core.impl.CoreDAGNodeImpl#getParallelism <em>Parallelism</em>}</li>
 *   <li>{@link es.unizar.disco.dice.dtsm.Core.impl.CoreDAGNodeImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link es.unizar.disco.dice.dtsm.Core.impl.CoreDAGNodeImpl#getHasSuccessor <em>Has Successor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CoreDAGNodeImpl extends DpimSourceNodeImpl implements CoreDAGNode {
	/**
	 * The default value of the '{@link #getParallelism() <em>Parallelism</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParallelism()
	 * @generated
	 * @ordered
	 */
	protected static final String PARALLELISM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParallelism() <em>Parallelism</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParallelism()
	 * @generated
	 * @ordered
	 */
	protected String parallelism = PARALLELISM_EDEFAULT;

	/**
	 * The default value of the '{@link #getOperation() <em>Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperation()
	 * @generated
	 * @ordered
	 */
	protected static final WorkflowOperation OPERATION_EDEFAULT = WorkflowOperation.GROUP_BY;

	/**
	 * The cached value of the '{@link #getOperation() <em>Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperation()
	 * @generated
	 * @ordered
	 */
	protected WorkflowOperation operation = OPERATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHasSuccessor() <em>Has Successor</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasSuccessor()
	 * @generated
	 * @ordered
	 */
	protected EList<CoreDAGNode> hasSuccessor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoreDAGNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.CORE_DAG_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getParallelism() {
		return parallelism;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParallelism(String newParallelism) {
		String oldParallelism = parallelism;
		parallelism = newParallelism;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.CORE_DAG_NODE__PARALLELISM, oldParallelism, parallelism));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowOperation getOperation() {
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperation(WorkflowOperation newOperation) {
		WorkflowOperation oldOperation = operation;
		operation = newOperation == null ? OPERATION_EDEFAULT : newOperation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.CORE_DAG_NODE__OPERATION, oldOperation, operation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CoreDAGNode> getHasSuccessor() {
		if (hasSuccessor == null) {
			hasSuccessor = new EObjectResolvingEList<CoreDAGNode>(CoreDAGNode.class, this, CorePackage.CORE_DAG_NODE__HAS_SUCCESSOR);
		}
		return hasSuccessor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.CORE_DAG_NODE__PARALLELISM:
				return getParallelism();
			case CorePackage.CORE_DAG_NODE__OPERATION:
				return getOperation();
			case CorePackage.CORE_DAG_NODE__HAS_SUCCESSOR:
				return getHasSuccessor();
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
			case CorePackage.CORE_DAG_NODE__PARALLELISM:
				setParallelism((String)newValue);
				return;
			case CorePackage.CORE_DAG_NODE__OPERATION:
				setOperation((WorkflowOperation)newValue);
				return;
			case CorePackage.CORE_DAG_NODE__HAS_SUCCESSOR:
				getHasSuccessor().clear();
				getHasSuccessor().addAll((Collection<? extends CoreDAGNode>)newValue);
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
			case CorePackage.CORE_DAG_NODE__PARALLELISM:
				setParallelism(PARALLELISM_EDEFAULT);
				return;
			case CorePackage.CORE_DAG_NODE__OPERATION:
				setOperation(OPERATION_EDEFAULT);
				return;
			case CorePackage.CORE_DAG_NODE__HAS_SUCCESSOR:
				getHasSuccessor().clear();
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
			case CorePackage.CORE_DAG_NODE__PARALLELISM:
				return PARALLELISM_EDEFAULT == null ? parallelism != null : !PARALLELISM_EDEFAULT.equals(parallelism);
			case CorePackage.CORE_DAG_NODE__OPERATION:
				return operation != OPERATION_EDEFAULT;
			case CorePackage.CORE_DAG_NODE__HAS_SUCCESSOR:
				return hasSuccessor != null && !hasSuccessor.isEmpty();
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
		result.append(" (parallelism: ");
		result.append(parallelism);
		result.append(", operation: ");
		result.append(operation);
		result.append(')');
		return result.toString();
	}

} //CoreDAGNodeImpl
