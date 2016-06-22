/**
 */
package es.unizar.disco.dice.dtsm.Core.impl;

import es.unizar.disco.dice.dtsm.Core.CoreDAGSourceNode;
import es.unizar.disco.dice.dtsm.Core.CoreDirectAcyclicGraph;
import es.unizar.disco.dice.dtsm.Core.CorePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.papyrus.MARTE.MARTE_AnalysisModel.GQAM.impl.GaScenarioImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Direct Acyclic Graph</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.unizar.disco.dice.dtsm.Core.impl.CoreDirectAcyclicGraphImpl#getHasSourceNode <em>Has Source Node</em>}</li>
 *   <li>{@link es.unizar.disco.dice.dtsm.Core.impl.CoreDirectAcyclicGraphImpl#getBase_Class <em>Base Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CoreDirectAcyclicGraphImpl extends GaScenarioImpl implements CoreDirectAcyclicGraph {
	/**
	 * The cached value of the '{@link #getHasSourceNode() <em>Has Source Node</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasSourceNode()
	 * @generated
	 * @ordered
	 */
	protected EList<CoreDAGSourceNode> hasSourceNode;

	/**
	 * The cached value of the '{@link #getBase_Class() <em>Base Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Class()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.uml2.uml.Class base_Class;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoreDirectAcyclicGraphImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.CORE_DIRECT_ACYCLIC_GRAPH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CoreDAGSourceNode> getHasSourceNode() {
		if (hasSourceNode == null) {
			hasSourceNode = new EObjectResolvingEList<CoreDAGSourceNode>(CoreDAGSourceNode.class, this, CorePackage.CORE_DIRECT_ACYCLIC_GRAPH__HAS_SOURCE_NODE);
		}
		return hasSourceNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Class getBase_Class() {
		if (base_Class != null && base_Class.eIsProxy()) {
			InternalEObject oldBase_Class = (InternalEObject)base_Class;
			base_Class = (org.eclipse.uml2.uml.Class)eResolveProxy(oldBase_Class);
			if (base_Class != oldBase_Class) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.CORE_DIRECT_ACYCLIC_GRAPH__BASE_CLASS, oldBase_Class, base_Class));
			}
		}
		return base_Class;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Class basicGetBase_Class() {
		return base_Class;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Class(org.eclipse.uml2.uml.Class newBase_Class) {
		org.eclipse.uml2.uml.Class oldBase_Class = base_Class;
		base_Class = newBase_Class;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.CORE_DIRECT_ACYCLIC_GRAPH__BASE_CLASS, oldBase_Class, base_Class));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.CORE_DIRECT_ACYCLIC_GRAPH__HAS_SOURCE_NODE:
				return getHasSourceNode();
			case CorePackage.CORE_DIRECT_ACYCLIC_GRAPH__BASE_CLASS:
				if (resolve) return getBase_Class();
				return basicGetBase_Class();
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
			case CorePackage.CORE_DIRECT_ACYCLIC_GRAPH__HAS_SOURCE_NODE:
				getHasSourceNode().clear();
				getHasSourceNode().addAll((Collection<? extends CoreDAGSourceNode>)newValue);
				return;
			case CorePackage.CORE_DIRECT_ACYCLIC_GRAPH__BASE_CLASS:
				setBase_Class((org.eclipse.uml2.uml.Class)newValue);
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
			case CorePackage.CORE_DIRECT_ACYCLIC_GRAPH__HAS_SOURCE_NODE:
				getHasSourceNode().clear();
				return;
			case CorePackage.CORE_DIRECT_ACYCLIC_GRAPH__BASE_CLASS:
				setBase_Class((org.eclipse.uml2.uml.Class)null);
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
			case CorePackage.CORE_DIRECT_ACYCLIC_GRAPH__HAS_SOURCE_NODE:
				return hasSourceNode != null && !hasSourceNode.isEmpty();
			case CorePackage.CORE_DIRECT_ACYCLIC_GRAPH__BASE_CLASS:
				return base_Class != null;
		}
		return super.eIsSet(featureID);
	}

} //CoreDirectAcyclicGraphImpl
