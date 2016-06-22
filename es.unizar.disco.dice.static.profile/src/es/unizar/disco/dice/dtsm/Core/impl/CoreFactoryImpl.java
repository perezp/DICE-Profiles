/**
 */
package es.unizar.disco.dice.dtsm.Core.impl;

import es.unizar.disco.dice.dtsm.Core.*;

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
public class CoreFactoryImpl extends EFactoryImpl implements CoreFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CoreFactory init() {
		try {
			CoreFactory theCoreFactory = (CoreFactory)EPackage.Registry.INSTANCE.getEFactory(CorePackage.eNS_URI);
			if (theCoreFactory != null) {
				return theCoreFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CoreFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoreFactoryImpl() {
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
			case CorePackage.CORE_COMPUTATION_NODE: return createCoreComputationNode();
			case CorePackage.CORE_DATA: return createCoreData();
			case CorePackage.CORE_DATA_SOURCE: return createCoreDataSource();
			case CorePackage.CORE_DIRECT_ACYCLIC_GRAPH: return createCoreDirectAcyclicGraph();
			case CorePackage.CORE_DAG_SOURCE_NODE: return createCoreDAGSourceNode();
			case CorePackage.CORE_DAG_NODE: return createCoreDAGNode();
			case CorePackage.CORE_STORAGE_NODE: return createCoreStorageNode();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoreComputationNode createCoreComputationNode() {
		CoreComputationNodeImpl coreComputationNode = new CoreComputationNodeImpl();
		return coreComputationNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoreData createCoreData() {
		CoreDataImpl coreData = new CoreDataImpl();
		return coreData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoreDataSource createCoreDataSource() {
		CoreDataSourceImpl coreDataSource = new CoreDataSourceImpl();
		return coreDataSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoreDirectAcyclicGraph createCoreDirectAcyclicGraph() {
		CoreDirectAcyclicGraphImpl coreDirectAcyclicGraph = new CoreDirectAcyclicGraphImpl();
		return coreDirectAcyclicGraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoreDAGSourceNode createCoreDAGSourceNode() {
		CoreDAGSourceNodeImpl coreDAGSourceNode = new CoreDAGSourceNodeImpl();
		return coreDAGSourceNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoreDAGNode createCoreDAGNode() {
		CoreDAGNodeImpl coreDAGNode = new CoreDAGNodeImpl();
		return coreDAGNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoreStorageNode createCoreStorageNode() {
		CoreStorageNodeImpl coreStorageNode = new CoreStorageNodeImpl();
		return coreStorageNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CorePackage getCorePackage() {
		return (CorePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CorePackage getPackage() {
		return CorePackage.eINSTANCE;
	}

} //CoreFactoryImpl
