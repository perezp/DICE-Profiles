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
			case DPIMPackage.COMPUTATION_NODE: return createComputationNode();
			case DPIMPackage.FILTER_NODE: return createFilterNode();
			case DPIMPackage.VISUALIZATION_NODE: return createVisualizationNode();
			case DPIMPackage.SOURCE_NODE: return createSourceNode();
			case DPIMPackage.STORAGATE_NODE: return createStoragateNode();
			case DPIMPackage.CHANNEL: return createChannel();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComputationNode createComputationNode() {
		ComputationNodeImpl computationNode = new ComputationNodeImpl();
		return computationNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterNode createFilterNode() {
		FilterNodeImpl filterNode = new FilterNodeImpl();
		return filterNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisualizationNode createVisualizationNode() {
		VisualizationNodeImpl visualizationNode = new VisualizationNodeImpl();
		return visualizationNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceNode createSourceNode() {
		SourceNodeImpl sourceNode = new SourceNodeImpl();
		return sourceNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StoragateNode createStoragateNode() {
		StoragateNodeImpl storagateNode = new StoragateNodeImpl();
		return storagateNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Channel createChannel() {
		ChannelImpl channel = new ChannelImpl();
		return channel;
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
