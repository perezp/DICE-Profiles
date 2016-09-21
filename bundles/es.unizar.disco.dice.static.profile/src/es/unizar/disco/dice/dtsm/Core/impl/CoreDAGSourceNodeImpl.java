/**
 */
package es.unizar.disco.dice.dtsm.Core.impl;

import es.unizar.disco.dice.dtsm.Core.CoreDAGSourceNode;
import es.unizar.disco.dice.dtsm.Core.CoreDataSource;
import es.unizar.disco.dice.dtsm.Core.CorePackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DAG Source Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.unizar.disco.dice.dtsm.Core.impl.CoreDAGSourceNodeImpl#getReadFrom <em>Read From</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CoreDAGSourceNodeImpl extends CoreDAGNodeImpl implements CoreDAGSourceNode {
	/**
	 * The cached value of the '{@link #getReadFrom() <em>Read From</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadFrom()
	 * @generated
	 * @ordered
	 */
	protected EList<CoreDataSource> readFrom;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoreDAGSourceNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.CORE_DAG_SOURCE_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CoreDataSource> getReadFrom() {
		if (readFrom == null) {
			readFrom = new EObjectResolvingEList<CoreDataSource>(CoreDataSource.class, this, CorePackage.CORE_DAG_SOURCE_NODE__READ_FROM);
		}
		return readFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.CORE_DAG_SOURCE_NODE__READ_FROM:
				return getReadFrom();
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
			case CorePackage.CORE_DAG_SOURCE_NODE__READ_FROM:
				getReadFrom().clear();
				getReadFrom().addAll((Collection<? extends CoreDataSource>)newValue);
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
			case CorePackage.CORE_DAG_SOURCE_NODE__READ_FROM:
				getReadFrom().clear();
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
			case CorePackage.CORE_DAG_SOURCE_NODE__READ_FROM:
				return readFrom != null && !readFrom.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CoreDAGSourceNodeImpl
