/**
 */
package es.unizar.disco.dice.DDSM.impl;

import es.unizar.disco.dice.Basic_Enumeration_Types.DDSMcomponentType;

import es.unizar.disco.dice.DDSM.DDSMPackage;
import es.unizar.disco.dice.DDSM.DdsmInternalComponent;
import es.unizar.disco.dice.DDSM.DdsmPort;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.uml2.uml.Node;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ddsm Internal Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.unizar.disco.dice.DDSM.impl.DdsmInternalComponentImpl#getRequiredPort <em>Required Port</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.impl.DdsmInternalComponentImpl#isFrontEnd <em>Is Front End</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.impl.DdsmInternalComponentImpl#getComponentType <em>Component Type</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.impl.DdsmInternalComponentImpl#getBase_Node <em>Base Node</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DdsmInternalComponentImpl extends DdsmComponentImpl implements DdsmInternalComponent {
	/**
	 * The cached value of the '{@link #getRequiredPort() <em>Required Port</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredPort()
	 * @generated
	 * @ordered
	 */
	protected EList<DdsmPort> requiredPort;

	/**
	 * The default value of the '{@link #isFrontEnd() <em>Is Front End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFrontEnd()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_FRONT_END_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFrontEnd() <em>Is Front End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFrontEnd()
	 * @generated
	 * @ordered
	 */
	protected boolean isFrontEnd = IS_FRONT_END_EDEFAULT;

	/**
	 * The default value of the '{@link #getComponentType() <em>Component Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentType()
	 * @generated
	 * @ordered
	 */
	protected static final DDSMcomponentType COMPONENT_TYPE_EDEFAULT = DDSMcomponentType.MASTER_SLAVE_PLATFORM;

	/**
	 * The cached value of the '{@link #getComponentType() <em>Component Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentType()
	 * @generated
	 * @ordered
	 */
	protected DDSMcomponentType componentType = COMPONENT_TYPE_EDEFAULT;

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
	protected DdsmInternalComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DDSMPackage.Literals.DDSM_INTERNAL_COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DdsmPort> getRequiredPort() {
		if (requiredPort == null) {
			requiredPort = new EObjectResolvingEList<DdsmPort>(DdsmPort.class, this, DDSMPackage.DDSM_INTERNAL_COMPONENT__REQUIRED_PORT);
		}
		return requiredPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFrontEnd() {
		return isFrontEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsFrontEnd(boolean newIsFrontEnd) {
		boolean oldIsFrontEnd = isFrontEnd;
		isFrontEnd = newIsFrontEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DDSMPackage.DDSM_INTERNAL_COMPONENT__IS_FRONT_END, oldIsFrontEnd, isFrontEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DDSMcomponentType getComponentType() {
		return componentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponentType(DDSMcomponentType newComponentType) {
		DDSMcomponentType oldComponentType = componentType;
		componentType = newComponentType == null ? COMPONENT_TYPE_EDEFAULT : newComponentType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DDSMPackage.DDSM_INTERNAL_COMPONENT__COMPONENT_TYPE, oldComponentType, componentType));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DDSMPackage.DDSM_INTERNAL_COMPONENT__BASE_NODE, oldBase_Node, base_Node));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DDSMPackage.DDSM_INTERNAL_COMPONENT__BASE_NODE, oldBase_Node, base_Node));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DDSMPackage.DDSM_INTERNAL_COMPONENT__REQUIRED_PORT:
				return getRequiredPort();
			case DDSMPackage.DDSM_INTERNAL_COMPONENT__IS_FRONT_END:
				return isFrontEnd();
			case DDSMPackage.DDSM_INTERNAL_COMPONENT__COMPONENT_TYPE:
				return getComponentType();
			case DDSMPackage.DDSM_INTERNAL_COMPONENT__BASE_NODE:
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
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DDSMPackage.DDSM_INTERNAL_COMPONENT__REQUIRED_PORT:
				getRequiredPort().clear();
				getRequiredPort().addAll((Collection<? extends DdsmPort>)newValue);
				return;
			case DDSMPackage.DDSM_INTERNAL_COMPONENT__IS_FRONT_END:
				setIsFrontEnd((Boolean)newValue);
				return;
			case DDSMPackage.DDSM_INTERNAL_COMPONENT__COMPONENT_TYPE:
				setComponentType((DDSMcomponentType)newValue);
				return;
			case DDSMPackage.DDSM_INTERNAL_COMPONENT__BASE_NODE:
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
			case DDSMPackage.DDSM_INTERNAL_COMPONENT__REQUIRED_PORT:
				getRequiredPort().clear();
				return;
			case DDSMPackage.DDSM_INTERNAL_COMPONENT__IS_FRONT_END:
				setIsFrontEnd(IS_FRONT_END_EDEFAULT);
				return;
			case DDSMPackage.DDSM_INTERNAL_COMPONENT__COMPONENT_TYPE:
				setComponentType(COMPONENT_TYPE_EDEFAULT);
				return;
			case DDSMPackage.DDSM_INTERNAL_COMPONENT__BASE_NODE:
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
			case DDSMPackage.DDSM_INTERNAL_COMPONENT__REQUIRED_PORT:
				return requiredPort != null && !requiredPort.isEmpty();
			case DDSMPackage.DDSM_INTERNAL_COMPONENT__IS_FRONT_END:
				return isFrontEnd != IS_FRONT_END_EDEFAULT;
			case DDSMPackage.DDSM_INTERNAL_COMPONENT__COMPONENT_TYPE:
				return componentType != COMPONENT_TYPE_EDEFAULT;
			case DDSMPackage.DDSM_INTERNAL_COMPONENT__BASE_NODE:
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
		result.append(" (isFrontEnd: ");
		result.append(isFrontEnd);
		result.append(", componentType: ");
		result.append(componentType);
		result.append(')');
		return result.toString();
	}

} //DdsmInternalComponentImpl
