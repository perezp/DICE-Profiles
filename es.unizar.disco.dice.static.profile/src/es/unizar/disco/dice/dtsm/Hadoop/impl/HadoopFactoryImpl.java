/**
 */
package es.unizar.disco.dice.dtsm.Hadoop.impl;

import es.unizar.disco.dice.dtsm.Hadoop.*;

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
public class HadoopFactoryImpl extends EFactoryImpl implements HadoopFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HadoopFactory init() {
		try {
			HadoopFactory theHadoopFactory = (HadoopFactory)EPackage.Registry.INSTANCE.getEFactory(HadoopPackage.eNS_URI);
			if (theHadoopFactory != null) {
				return theHadoopFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new HadoopFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HadoopFactoryImpl() {
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
			case HadoopPackage.HADOOP_MAP_REDUCE_JOB: return createHadoopMapReduceJob();
			case HadoopPackage.HADOOP_MAP_REDUCE_PHASE: return createHadoopMapReducePhase();
			case HadoopPackage.HADOOP_MAP: return createHadoopMap();
			case HadoopPackage.HADOOP_OPERATION: return createHadoopOperation();
			case HadoopPackage.HADOOP_REDUCE: return createHadoopReduce();
			case HadoopPackage.HADOOP_SCENARIO: return createHadoopScenario();
			case HadoopPackage.HADOOP_WORKLOAD_EVENT: return createHadoopWorkloadEvent();
			case HadoopPackage.HADOOP_COMPUTATION_NODE: return createHadoopComputationNode();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HadoopMapReduceJob createHadoopMapReduceJob() {
		HadoopMapReduceJobImpl hadoopMapReduceJob = new HadoopMapReduceJobImpl();
		return hadoopMapReduceJob;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HadoopMapReducePhase createHadoopMapReducePhase() {
		HadoopMapReducePhaseImpl hadoopMapReducePhase = new HadoopMapReducePhaseImpl();
		return hadoopMapReducePhase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HadoopMap createHadoopMap() {
		HadoopMapImpl hadoopMap = new HadoopMapImpl();
		return hadoopMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HadoopOperation createHadoopOperation() {
		HadoopOperationImpl hadoopOperation = new HadoopOperationImpl();
		return hadoopOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HadoopReduce createHadoopReduce() {
		HadoopReduceImpl hadoopReduce = new HadoopReduceImpl();
		return hadoopReduce;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HadoopScenario createHadoopScenario() {
		HadoopScenarioImpl hadoopScenario = new HadoopScenarioImpl();
		return hadoopScenario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HadoopWorkloadEvent createHadoopWorkloadEvent() {
		HadoopWorkloadEventImpl hadoopWorkloadEvent = new HadoopWorkloadEventImpl();
		return hadoopWorkloadEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HadoopComputationNode createHadoopComputationNode() {
		HadoopComputationNodeImpl hadoopComputationNode = new HadoopComputationNodeImpl();
		return hadoopComputationNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HadoopPackage getHadoopPackage() {
		return (HadoopPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static HadoopPackage getPackage() {
		return HadoopPackage.eINSTANCE;
	}

} //HadoopFactoryImpl
