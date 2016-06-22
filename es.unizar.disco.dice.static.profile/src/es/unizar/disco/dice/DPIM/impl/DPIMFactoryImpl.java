/**
 */
package es.unizar.disco.dice.DPIM.impl;

import es.unizar.disco.dice.DPIM.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DPIMFactoryImpl extends EFactoryImpl implements DPIMFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DPIMFactory init() {
		try {
			DPIMFactory theDPIMFactory = (DPIMFactory)EPackage.Registry.INSTANCE.getEFactory(DPIMPackage.eNS_URI);
			if (theDPIMFactory != null) {
				return theDPIMFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DPIMFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DPIMFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case DPIMPackage.DPIM_COMPUTATION_NODE: return createDpimComputationNode();
			case DPIMPackage.DPIM_FILTER_NODE: return createDpimFilterNode();
			case DPIMPackage.DPIM_VISUALIZATION_NODE: return createDpimVisualizationNode();
			case DPIMPackage.DPIM_SOURCE_NODE: return createDpimSourceNode();
			case DPIMPackage.DPIM_STORAGE_NODE: return createDpimStorageNode();
			case DPIMPackage.DPIM_CHANNEL: return createDpimChannel();
			case DPIMPackage.DPIM_SCENARIO: return createDpimScenario();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DpimComputationNode createDpimComputationNode() {
		DpimComputationNodeImpl dpimComputationNode = new DpimComputationNodeImpl();
		return dpimComputationNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DpimFilterNode createDpimFilterNode() {
		DpimFilterNodeImpl dpimFilterNode = new DpimFilterNodeImpl();
		return dpimFilterNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DpimVisualizationNode createDpimVisualizationNode() {
		DpimVisualizationNodeImpl dpimVisualizationNode = new DpimVisualizationNodeImpl();
		return dpimVisualizationNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DpimSourceNode createDpimSourceNode() {
		DpimSourceNodeImpl dpimSourceNode = new DpimSourceNodeImpl();
		return dpimSourceNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DpimStorageNode createDpimStorageNode() {
		DpimStorageNodeImpl dpimStorageNode = new DpimStorageNodeImpl();
		return dpimStorageNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DpimChannel createDpimChannel() {
		DpimChannelImpl dpimChannel = new DpimChannelImpl();
		return dpimChannel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DpimScenario createDpimScenario() {
		DpimScenarioImpl dpimScenario = new DpimScenarioImpl();
		return dpimScenario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DPIMPackage getDPIMPackage() {
		return (DPIMPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DPIMPackage getPackage() {
		return DPIMPackage.eINSTANCE;
	}

} //DPIMFactoryImpl
