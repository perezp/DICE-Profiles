/**
 */
package es.unizar.disco.dice.dtsm.Storm.impl;

import com.masdes.dam.Basic_Data_Types.Basic_Data_TypesPackage;

import com.masdes.dam.Basic_Enumeration_Types.Basic_Enumeration_TypesPackage;

import com.masdes.dam.Complex_Data_Types.Complex_Data_TypesPackage;

import com.masdes.dam.DAM.DAMPackage;

import es.unizar.disco.dice.Basic_Data_Types.impl.Basic_Data_TypesPackageImpl;

import es.unizar.disco.dice.Basic_Enumeration_Types.impl.Basic_Enumeration_TypesPackageImpl;

import es.unizar.disco.dice.Complex_Data_Types.impl.Complex_Data_TypesPackageImpl;

import es.unizar.disco.dice.DICE.DICEPackage;

import es.unizar.disco.dice.DICE.impl.DICEPackageImpl;

import es.unizar.disco.dice.DPIM.DPIMPackage;

import es.unizar.disco.dice.DPIM.impl.DPIMPackageImpl;

import es.unizar.disco.dice.dtsm.Core.CorePackage;

import es.unizar.disco.dice.dtsm.Core.impl.CorePackageImpl;

import es.unizar.disco.dice.dtsm.Hadoop.HadoopPackage;

import es.unizar.disco.dice.dtsm.Hadoop.impl.HadoopPackageImpl;

import es.unizar.disco.dice.dtsm.Storm.StormApplication;
import es.unizar.disco.dice.dtsm.Storm.StormBolt;
import es.unizar.disco.dice.dtsm.Storm.StormFactory;
import es.unizar.disco.dice.dtsm.Storm.StormNimbus;
import es.unizar.disco.dice.dtsm.Storm.StormPackage;
import es.unizar.disco.dice.dtsm.Storm.StormScenarioTopology;
import es.unizar.disco.dice.dtsm.Storm.StormSpout;
import es.unizar.disco.dice.dtsm.Storm.StormStreamStep;
import es.unizar.disco.dice.dtsm.Storm.StormSupervisor;
import es.unizar.disco.dice.dtsm.Storm.StormZookeeper;

import es.unizar.disco.dice.dtsm.Storm.util.StormValidator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.papyrus.MARTE.MARTE_AnalysisModel.GQAM.GQAMPackage;

import org.eclipse.papyrus.MARTE_Library.BasicNFP_Types.BasicNFP_TypesPackage;

import org.eclipse.uml2.types.TypesPackage;

import org.eclipse.uml2.uml.UMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StormPackageImpl extends EPackageImpl implements StormPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stormBoltEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stormSpoutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stormScenarioTopologyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stormApplicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stormNimbusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stormSupervisorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stormZookeeperEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stormStreamStepEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see es.unizar.disco.dice.dtsm.Storm.StormPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private StormPackageImpl() {
		super(eNS_URI, StormFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link StormPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static StormPackage init() {
		if (isInited) return (StormPackage)EPackage.Registry.INSTANCE.getEPackage(StormPackage.eNS_URI);

		// Obtain or create and register package
		StormPackageImpl theStormPackage = (StormPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof StormPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new StormPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		DAMPackage.eINSTANCE.eClass();
		Complex_Data_TypesPackage.eINSTANCE.eClass();
		Basic_Data_TypesPackage.eINSTANCE.eClass();
		Basic_Enumeration_TypesPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		DICEPackageImpl theDICEPackage = (DICEPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DICEPackage.eNS_URI) instanceof DICEPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DICEPackage.eNS_URI) : DICEPackage.eINSTANCE);
		DPIMPackageImpl theDPIMPackage = (DPIMPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DPIMPackage.eNS_URI) instanceof DPIMPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DPIMPackage.eNS_URI) : DPIMPackage.eINSTANCE);
		CorePackageImpl theCorePackage = (CorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) instanceof CorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) : CorePackage.eINSTANCE);
		HadoopPackageImpl theHadoopPackage = (HadoopPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(HadoopPackage.eNS_URI) instanceof HadoopPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(HadoopPackage.eNS_URI) : HadoopPackage.eINSTANCE);
		Complex_Data_TypesPackageImpl theComplex_Data_TypesPackage_1 = (Complex_Data_TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(es.unizar.disco.dice.Complex_Data_Types.Complex_Data_TypesPackage.eNS_URI) instanceof Complex_Data_TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(es.unizar.disco.dice.Complex_Data_Types.Complex_Data_TypesPackage.eNS_URI) : es.unizar.disco.dice.Complex_Data_Types.Complex_Data_TypesPackage.eINSTANCE);
		Basic_Data_TypesPackageImpl theBasic_Data_TypesPackage_1 = (Basic_Data_TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(es.unizar.disco.dice.Basic_Data_Types.Basic_Data_TypesPackage.eNS_URI) instanceof Basic_Data_TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(es.unizar.disco.dice.Basic_Data_Types.Basic_Data_TypesPackage.eNS_URI) : es.unizar.disco.dice.Basic_Data_Types.Basic_Data_TypesPackage.eINSTANCE);
		Basic_Enumeration_TypesPackageImpl theBasic_Enumeration_TypesPackage_1 = (Basic_Enumeration_TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(es.unizar.disco.dice.Basic_Enumeration_Types.Basic_Enumeration_TypesPackage.eNS_URI) instanceof Basic_Enumeration_TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(es.unizar.disco.dice.Basic_Enumeration_Types.Basic_Enumeration_TypesPackage.eNS_URI) : es.unizar.disco.dice.Basic_Enumeration_Types.Basic_Enumeration_TypesPackage.eINSTANCE);

		// Create package meta-data objects
		theStormPackage.createPackageContents();
		theDICEPackage.createPackageContents();
		theDPIMPackage.createPackageContents();
		theCorePackage.createPackageContents();
		theHadoopPackage.createPackageContents();
		theComplex_Data_TypesPackage_1.createPackageContents();
		theBasic_Data_TypesPackage_1.createPackageContents();
		theBasic_Enumeration_TypesPackage_1.createPackageContents();

		// Initialize created meta-data
		theStormPackage.initializePackageContents();
		theDICEPackage.initializePackageContents();
		theDPIMPackage.initializePackageContents();
		theCorePackage.initializePackageContents();
		theHadoopPackage.initializePackageContents();
		theComplex_Data_TypesPackage_1.initializePackageContents();
		theBasic_Data_TypesPackage_1.initializePackageContents();
		theBasic_Enumeration_TypesPackage_1.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theStormPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return StormValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theStormPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(StormPackage.eNS_URI, theStormPackage);
		return theStormPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStormBolt() {
		return stormBoltEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStormBolt_D() {
		return (EAttribute)stormBoltEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStormBolt_Alpha() {
		return (EAttribute)stormBoltEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStormBolt_Sigma() {
		return (EAttribute)stormBoltEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStormBolt_MinRebootTime() {
		return (EAttribute)stormBoltEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStormBolt_MaxRebootTime() {
		return (EAttribute)stormBoltEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStormSpout() {
		return stormSpoutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStormSpout_AvgEmitRate() {
		return (EAttribute)stormSpoutEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStormScenarioTopology() {
		return stormScenarioTopologyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStormScenarioTopology_QueueThreshold() {
		return (EAttribute)stormScenarioTopologyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStormScenarioTopology_MaxTaskParallelism() {
		return (EAttribute)stormScenarioTopologyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStormScenarioTopology_MaxSpoutPending() {
		return (EAttribute)stormScenarioTopologyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStormScenarioTopology_IsReliable() {
		return (EAttribute)stormScenarioTopologyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStormApplication() {
		return stormApplicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStormApplication_HasMasterNode() {
		return (EReference)stormApplicationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStormApplication_HasSlaveNode() {
		return (EReference)stormApplicationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStormApplication_DependsOnZookeeper() {
		return (EReference)stormApplicationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStormNimbus() {
		return stormNimbusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStormNimbus_TaskTimeout() {
		return (EAttribute)stormNimbusEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStormNimbus_SupervisorTimeout() {
		return (EAttribute)stormNimbusEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStormNimbus_MonitorFrequency() {
		return (EAttribute)stormNimbusEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStormNimbus_Base_Classifier() {
		return (EReference)stormNimbusEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStormSupervisor() {
		return stormSupervisorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStormSupervisor_MonitroFrequency() {
		return (EAttribute)stormSupervisorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStormSupervisor_WorkerSatrtTimeout() {
		return (EAttribute)stormSupervisorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStormSupervisor_WorkerTimeout() {
		return (EAttribute)stormSupervisorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStormSupervisor_HeartbrackFrequency() {
		return (EAttribute)stormSupervisorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStormSupervisor_MemoryCapacity() {
		return (EAttribute)stormSupervisorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStormSupervisor_CpuCapacity() {
		return (EAttribute)stormSupervisorEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStormSupervisor_Base_Classifier() {
		return (EReference)stormSupervisorEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStormZookeeper() {
		return stormZookeeperEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStormZookeeper_SessionTimeout() {
		return (EAttribute)stormZookeeperEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStormZookeeper_ConnectionTimeout() {
		return (EAttribute)stormZookeeperEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStormZookeeper_RetryTime() {
		return (EAttribute)stormZookeeperEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStormZookeeper_RetryInterval() {
		return (EAttribute)stormZookeeperEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStormZookeeper_User() {
		return (EAttribute)stormZookeeperEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStormZookeeper_Password() {
		return (EAttribute)stormZookeeperEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStormZookeeper_Base_Classifier() {
		return (EReference)stormZookeeperEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStormStreamStep() {
		return stormStreamStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStormStreamStep_NumTuples() {
		return (EAttribute)stormStreamStepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStormStreamStep_Grouping() {
		return (EAttribute)stormStreamStepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StormFactory getStormFactory() {
		return (StormFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		stormBoltEClass = createEClass(STORM_BOLT);
		createEAttribute(stormBoltEClass, STORM_BOLT__D);
		createEAttribute(stormBoltEClass, STORM_BOLT__ALPHA);
		createEAttribute(stormBoltEClass, STORM_BOLT__SIGMA);
		createEAttribute(stormBoltEClass, STORM_BOLT__MIN_REBOOT_TIME);
		createEAttribute(stormBoltEClass, STORM_BOLT__MAX_REBOOT_TIME);

		stormSpoutEClass = createEClass(STORM_SPOUT);
		createEAttribute(stormSpoutEClass, STORM_SPOUT__AVG_EMIT_RATE);

		stormScenarioTopologyEClass = createEClass(STORM_SCENARIO_TOPOLOGY);
		createEAttribute(stormScenarioTopologyEClass, STORM_SCENARIO_TOPOLOGY__QUEUE_THRESHOLD);
		createEAttribute(stormScenarioTopologyEClass, STORM_SCENARIO_TOPOLOGY__MAX_TASK_PARALLELISM);
		createEAttribute(stormScenarioTopologyEClass, STORM_SCENARIO_TOPOLOGY__MAX_SPOUT_PENDING);
		createEAttribute(stormScenarioTopologyEClass, STORM_SCENARIO_TOPOLOGY__IS_RELIABLE);

		stormApplicationEClass = createEClass(STORM_APPLICATION);
		createEReference(stormApplicationEClass, STORM_APPLICATION__HAS_MASTER_NODE);
		createEReference(stormApplicationEClass, STORM_APPLICATION__HAS_SLAVE_NODE);
		createEReference(stormApplicationEClass, STORM_APPLICATION__DEPENDS_ON_ZOOKEEPER);

		stormNimbusEClass = createEClass(STORM_NIMBUS);
		createEAttribute(stormNimbusEClass, STORM_NIMBUS__TASK_TIMEOUT);
		createEAttribute(stormNimbusEClass, STORM_NIMBUS__SUPERVISOR_TIMEOUT);
		createEAttribute(stormNimbusEClass, STORM_NIMBUS__MONITOR_FREQUENCY);
		createEReference(stormNimbusEClass, STORM_NIMBUS__BASE_CLASSIFIER);

		stormSupervisorEClass = createEClass(STORM_SUPERVISOR);
		createEAttribute(stormSupervisorEClass, STORM_SUPERVISOR__MONITRO_FREQUENCY);
		createEAttribute(stormSupervisorEClass, STORM_SUPERVISOR__WORKER_SATRT_TIMEOUT);
		createEAttribute(stormSupervisorEClass, STORM_SUPERVISOR__WORKER_TIMEOUT);
		createEAttribute(stormSupervisorEClass, STORM_SUPERVISOR__HEARTBRACK_FREQUENCY);
		createEAttribute(stormSupervisorEClass, STORM_SUPERVISOR__MEMORY_CAPACITY);
		createEAttribute(stormSupervisorEClass, STORM_SUPERVISOR__CPU_CAPACITY);
		createEReference(stormSupervisorEClass, STORM_SUPERVISOR__BASE_CLASSIFIER);

		stormZookeeperEClass = createEClass(STORM_ZOOKEEPER);
		createEAttribute(stormZookeeperEClass, STORM_ZOOKEEPER__SESSION_TIMEOUT);
		createEAttribute(stormZookeeperEClass, STORM_ZOOKEEPER__CONNECTION_TIMEOUT);
		createEAttribute(stormZookeeperEClass, STORM_ZOOKEEPER__RETRY_TIME);
		createEAttribute(stormZookeeperEClass, STORM_ZOOKEEPER__RETRY_INTERVAL);
		createEAttribute(stormZookeeperEClass, STORM_ZOOKEEPER__USER);
		createEAttribute(stormZookeeperEClass, STORM_ZOOKEEPER__PASSWORD);
		createEReference(stormZookeeperEClass, STORM_ZOOKEEPER__BASE_CLASSIFIER);

		stormStreamStepEClass = createEClass(STORM_STREAM_STEP);
		createEAttribute(stormStreamStepEClass, STORM_STREAM_STEP__NUM_TUPLES);
		createEAttribute(stormStreamStepEClass, STORM_STREAM_STEP__GROUPING);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);
		BasicNFP_TypesPackage theBasicNFP_TypesPackage = (BasicNFP_TypesPackage)EPackage.Registry.INSTANCE.getEPackage(BasicNFP_TypesPackage.eNS_URI);
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);
		UMLPackage theUMLPackage = (UMLPackage)EPackage.Registry.INSTANCE.getEPackage(UMLPackage.eNS_URI);
		GQAMPackage theGQAMPackage = (GQAMPackage)EPackage.Registry.INSTANCE.getEPackage(GQAMPackage.eNS_URI);
		es.unizar.disco.dice.Basic_Enumeration_Types.Basic_Enumeration_TypesPackage theBasic_Enumeration_TypesPackage_1 = (es.unizar.disco.dice.Basic_Enumeration_Types.Basic_Enumeration_TypesPackage)EPackage.Registry.INSTANCE.getEPackage(es.unizar.disco.dice.Basic_Enumeration_Types.Basic_Enumeration_TypesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		stormBoltEClass.getESuperTypes().add(theCorePackage.getCoreDAGNode());
		stormSpoutEClass.getESuperTypes().add(theCorePackage.getCoreDAGSourceNode());
		stormScenarioTopologyEClass.getESuperTypes().add(theCorePackage.getCoreDirectAcyclicGraph());
		stormApplicationEClass.getESuperTypes().add(theCorePackage.getCoreComputationNode());
		stormStreamStepEClass.getESuperTypes().add(theGQAMPackage.getGaStep());

		// Initialize classes and features; add operations and parameters
		initEClass(stormBoltEClass, StormBolt.class, "StormBolt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStormBolt_D(), theBasicNFP_TypesPackage.getNFP_Real(), "d", null, 0, 1, StormBolt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getStormBolt_Alpha(), theBasicNFP_TypesPackage.getNFP_Real(), "alpha", null, 0, 1, StormBolt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getStormBolt_Sigma(), theBasicNFP_TypesPackage.getNFP_Real(), "sigma", null, 0, 1, StormBolt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getStormBolt_MinRebootTime(), theBasicNFP_TypesPackage.getNFP_Real(), "minRebootTime", null, 0, 1, StormBolt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getStormBolt_MaxRebootTime(), theBasicNFP_TypesPackage.getNFP_Real(), "maxRebootTime", null, 0, 1, StormBolt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(stormSpoutEClass, StormSpout.class, "StormSpout", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStormSpout_AvgEmitRate(), theBasicNFP_TypesPackage.getNFP_Real(), "avgEmitRate", null, 0, 1, StormSpout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(stormScenarioTopologyEClass, StormScenarioTopology.class, "StormScenarioTopology", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStormScenarioTopology_QueueThreshold(), theTypesPackage.getInteger(), "queueThreshold", null, 0, 1, StormScenarioTopology.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getStormScenarioTopology_MaxTaskParallelism(), theTypesPackage.getInteger(), "maxTaskParallelism", null, 0, 1, StormScenarioTopology.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getStormScenarioTopology_MaxSpoutPending(), theTypesPackage.getInteger(), "maxSpoutPending", null, 0, 1, StormScenarioTopology.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getStormScenarioTopology_IsReliable(), theTypesPackage.getBoolean(), "isReliable", null, 0, 1, StormScenarioTopology.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(stormApplicationEClass, StormApplication.class, "StormApplication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStormApplication_HasMasterNode(), this.getStormNimbus(), null, "hasMasterNode", null, 0, 1, StormApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getStormApplication_HasSlaveNode(), this.getStormSupervisor(), null, "hasSlaveNode", null, 0, 1, StormApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getStormApplication_DependsOnZookeeper(), this.getStormZookeeper(), null, "dependsOnZookeeper", null, 0, 1, StormApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(stormNimbusEClass, StormNimbus.class, "StormNimbus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStormNimbus_TaskTimeout(), theTypesPackage.getInteger(), "taskTimeout", null, 0, 1, StormNimbus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getStormNimbus_SupervisorTimeout(), theTypesPackage.getInteger(), "supervisorTimeout", null, 0, 1, StormNimbus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getStormNimbus_MonitorFrequency(), theTypesPackage.getInteger(), "monitorFrequency", null, 0, 1, StormNimbus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getStormNimbus_Base_Classifier(), theUMLPackage.getClassifier(), null, "base_Classifier", null, 1, 1, StormNimbus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(stormSupervisorEClass, StormSupervisor.class, "StormSupervisor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStormSupervisor_MonitroFrequency(), theTypesPackage.getInteger(), "monitroFrequency", null, 0, 1, StormSupervisor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getStormSupervisor_WorkerSatrtTimeout(), theTypesPackage.getInteger(), "workerSatrtTimeout", null, 0, 1, StormSupervisor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getStormSupervisor_WorkerTimeout(), theTypesPackage.getInteger(), "workerTimeout", null, 0, 1, StormSupervisor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getStormSupervisor_HeartbrackFrequency(), theTypesPackage.getInteger(), "heartbrackFrequency", null, 0, 1, StormSupervisor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getStormSupervisor_MemoryCapacity(), theTypesPackage.getInteger(), "memoryCapacity", null, 0, 1, StormSupervisor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getStormSupervisor_CpuCapacity(), theTypesPackage.getInteger(), "cpuCapacity", null, 0, 1, StormSupervisor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getStormSupervisor_Base_Classifier(), theUMLPackage.getClassifier(), null, "base_Classifier", null, 1, 1, StormSupervisor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(stormZookeeperEClass, StormZookeeper.class, "StormZookeeper", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStormZookeeper_SessionTimeout(), theTypesPackage.getInteger(), "sessionTimeout", null, 0, 1, StormZookeeper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getStormZookeeper_ConnectionTimeout(), theTypesPackage.getInteger(), "connectionTimeout", null, 0, 1, StormZookeeper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getStormZookeeper_RetryTime(), theTypesPackage.getInteger(), "retryTime", null, 0, 1, StormZookeeper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getStormZookeeper_RetryInterval(), theTypesPackage.getInteger(), "retryInterval", null, 0, 1, StormZookeeper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getStormZookeeper_User(), theTypesPackage.getString(), "user", null, 0, 1, StormZookeeper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getStormZookeeper_Password(), theTypesPackage.getString(), "password", null, 0, 1, StormZookeeper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getStormZookeeper_Base_Classifier(), theUMLPackage.getClassifier(), null, "base_Classifier", null, 1, 1, StormZookeeper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(stormStreamStepEClass, StormStreamStep.class, "StormStreamStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStormStreamStep_NumTuples(), theBasicNFP_TypesPackage.getNFP_Integer(), "numTuples", null, 1, 1, StormStreamStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getStormStreamStep_Grouping(), theBasic_Enumeration_TypesPackage_1.getStreamPolicy(), "grouping", null, 1, 1, StormStreamStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Create annotations
		// duplicates
		createDuplicatesAnnotations();
	}

	/**
	 * Initializes the annotations for <b>duplicates</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createDuplicatesAnnotations() {
		String source = "duplicates";	
		addAnnotation
		  (stormBoltEClass, 
		   source, 
		   new String[] {
		   });
		addAnnotation
		  (stormBoltEClass, 
		   new boolean[] { true },
		   "failure",
		   new String[] {
			 "upperBound", "1"
		   });
	}

} //StormPackageImpl
