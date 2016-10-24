/**
 */
package es.unizar.disco.dice.DDSM.impl;

import es.unizar.disco.dice.DDSM.DDSMPackage;
import es.unizar.disco.dice.DDSM.DdsmComponent;
import es.unizar.disco.dice.DDSM.DdsmPort;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ddsm Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.unizar.disco.dice.DDSM.impl.DdsmComponentImpl#getProvidedPortsList <em>Provided Ports List</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DdsmComponentImpl extends DdsmCloudElementImpl implements DdsmComponent {
	/**
	 * The cached value of the '{@link #getProvidedPortsList() <em>Provided Ports List</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidedPortsList()
	 * @generated
	 * @ordered
	 */
	protected EList<DdsmPort> providedPortsList;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DdsmComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DDSMPackage.Literals.DDSM_COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DdsmPort> getProvidedPortsList() {
		if (providedPortsList == null) {
			providedPortsList = new EObjectResolvingEList<DdsmPort>(DdsmPort.class, this, DDSMPackage.DDSM_COMPONENT__PROVIDED_PORTS_LIST);
		}
		return providedPortsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DDSMPackage.DDSM_COMPONENT__PROVIDED_PORTS_LIST:
				return getProvidedPortsList();
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
			case DDSMPackage.DDSM_COMPONENT__PROVIDED_PORTS_LIST:
				getProvidedPortsList().clear();
				getProvidedPortsList().addAll((Collection<? extends DdsmPort>)newValue);
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
			case DDSMPackage.DDSM_COMPONENT__PROVIDED_PORTS_LIST:
				getProvidedPortsList().clear();
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
			case DDSMPackage.DDSM_COMPONENT__PROVIDED_PORTS_LIST:
				return providedPortsList != null && !providedPortsList.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DdsmComponentImpl
