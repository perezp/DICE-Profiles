/**
 */
package es.unizar.disco.dice.DTSM.Hadoop.impl;

import com.masdes.dam.Basic_Data_Types.Basic_Data_TypesPackage;

import com.masdes.dam.Basic_Enumeration_Types.Basic_Enumeration_TypesPackage;

import com.masdes.dam.Complex_Data_Types.Complex_Data_TypesPackage;

import com.masdes.dam.DAM.DAMPackage;

import es.unizar.disco.dice.Basic_Enumeration_Types.impl.Basic_Enumeration_TypesPackageImpl;

import es.unizar.disco.dice.Complex_Data_Types.impl.Complex_Data_TypesPackageImpl;

import es.unizar.disco.dice.DDSM.DDSMPackage;

import es.unizar.disco.dice.DDSM.impl.DDSMPackageImpl;

import es.unizar.disco.dice.DICE.DICEPackage;

import es.unizar.disco.dice.DICE.impl.DICEPackageImpl;

import es.unizar.disco.dice.DPIM.DPIMPackage;

import es.unizar.disco.dice.DPIM.impl.DPIMPackageImpl;

import es.unizar.disco.dice.DTSM.Cassandra.CassandraPackage;
import es.unizar.disco.dice.DTSM.Cassandra.impl.CassandraPackageImpl;
import es.unizar.disco.dice.DTSM.Core.CorePackage;

import es.unizar.disco.dice.DTSM.Core.impl.CorePackageImpl;

import es.unizar.disco.dice.DTSM.Hadoop.HadoopComputationNode;
import es.unizar.disco.dice.DTSM.Hadoop.HadoopFactory;
import es.unizar.disco.dice.DTSM.Hadoop.HadoopMap;
import es.unizar.disco.dice.DTSM.Hadoop.HadoopMapReduceJob;
import es.unizar.disco.dice.DTSM.Hadoop.HadoopMapReducePhase;
import es.unizar.disco.dice.DTSM.Hadoop.HadoopOperation;
import es.unizar.disco.dice.DTSM.Hadoop.HadoopPackage;
import es.unizar.disco.dice.DTSM.Hadoop.HadoopReduce;
import es.unizar.disco.dice.DTSM.Hadoop.HadoopScenario;
import es.unizar.disco.dice.DTSM.Hadoop.HadoopWorkloadEvent;

import es.unizar.disco.dice.DTSM.Spark.SparkPackage;

import es.unizar.disco.dice.DTSM.Spark.impl.SparkPackageImpl;

import es.unizar.disco.dice.DTSM.Storm.StormPackage;

import es.unizar.disco.dice.DTSM.Storm.impl.StormPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.papyrus.MARTE.MARTE_AnalysisModel.GQAM.GQAMPackage;

import org.eclipse.papyrus.MARTE_Library.BasicNFP_Types.BasicNFP_TypesPackage;

import org.eclipse.uml2.uml.UMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HadoopPackageImpl extends EPackageImpl implements HadoopPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hadoopMapReduceJobEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hadoopMapReducePhaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hadoopMapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hadoopOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hadoopReduceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hadoopScenarioEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hadoopWorkloadEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hadoopComputationNodeEClass = null;

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
	 * @see es.unizar.disco.dice.DTSM.Hadoop.HadoopPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private HadoopPackageImpl() {
		super(eNS_URI, HadoopFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link HadoopPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static HadoopPackage init() {
		if (isInited) return (HadoopPackage)EPackage.Registry.INSTANCE.getEPackage(HadoopPackage.eNS_URI);

		// Obtain or create and register package
		HadoopPackageImpl theHadoopPackage = (HadoopPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof HadoopPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new HadoopPackageImpl());

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
		StormPackageImpl theStormPackage = (StormPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StormPackage.eNS_URI) instanceof StormPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StormPackage.eNS_URI) : StormPackage.eINSTANCE);
		SparkPackageImpl theSparkPackage = (SparkPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SparkPackage.eNS_URI) instanceof SparkPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SparkPackage.eNS_URI) : SparkPackage.eINSTANCE);
		CassandraPackageImpl theCassandraPackage = (CassandraPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CassandraPackage.eNS_URI) instanceof CassandraPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CassandraPackage.eNS_URI) : CassandraPackage.eINSTANCE);
		DDSMPackageImpl theDDSMPackage = (DDSMPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DDSMPackage.eNS_URI) instanceof DDSMPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DDSMPackage.eNS_URI) : DDSMPackage.eINSTANCE);
		Complex_Data_TypesPackageImpl theComplex_Data_TypesPackage_1 = (Complex_Data_TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(es.unizar.disco.dice.Complex_Data_Types.Complex_Data_TypesPackage.eNS_URI) instanceof Complex_Data_TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(es.unizar.disco.dice.Complex_Data_Types.Complex_Data_TypesPackage.eNS_URI) : es.unizar.disco.dice.Complex_Data_Types.Complex_Data_TypesPackage.eINSTANCE);
		Basic_Enumeration_TypesPackageImpl theBasic_Enumeration_TypesPackage_1 = (Basic_Enumeration_TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(es.unizar.disco.dice.Basic_Enumeration_Types.Basic_Enumeration_TypesPackage.eNS_URI) instanceof Basic_Enumeration_TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(es.unizar.disco.dice.Basic_Enumeration_Types.Basic_Enumeration_TypesPackage.eNS_URI) : es.unizar.disco.dice.Basic_Enumeration_Types.Basic_Enumeration_TypesPackage.eINSTANCE);

		// Create package meta-data objects
		theHadoopPackage.createPackageContents();
		theDICEPackage.createPackageContents();
		theDPIMPackage.createPackageContents();
		theCorePackage.createPackageContents();
		theStormPackage.createPackageContents();
		theSparkPackage.createPackageContents();
		theCassandraPackage.createPackageContents();
		theDDSMPackage.createPackageContents();
		theComplex_Data_TypesPackage_1.createPackageContents();
		theBasic_Enumeration_TypesPackage_1.createPackageContents();

		// Initialize created meta-data
		theHadoopPackage.initializePackageContents();
		theDICEPackage.initializePackageContents();
		theDPIMPackage.initializePackageContents();
		theCorePackage.initializePackageContents();
		theStormPackage.initializePackageContents();
		theSparkPackage.initializePackageContents();
		theCassandraPackage.initializePackageContents();
		theDDSMPackage.initializePackageContents();
		theComplex_Data_TypesPackage_1.initializePackageContents();
		theBasic_Enumeration_TypesPackage_1.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theHadoopPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(HadoopPackage.eNS_URI, theHadoopPackage);
		return theHadoopPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHadoopMapReduceJob() {
		return hadoopMapReduceJobEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHadoopMapReduceJob_MapResucePhases() {
		return (EReference)hadoopMapReduceJobEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHadoopMapReduceJob_Base_Classifier() {
		return (EReference)hadoopMapReduceJobEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHadoopMapReducePhase() {
		return hadoopMapReducePhaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHadoopMapReducePhase_HasMap() {
		return (EReference)hadoopMapReducePhaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHadoopMapReducePhase_HasReduce() {
		return (EReference)hadoopMapReducePhaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHadoopMapReducePhase_Output() {
		return (EReference)hadoopMapReducePhaseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHadoopMapReducePhase_Base_Classifier() {
		return (EReference)hadoopMapReducePhaseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHadoopMap() {
		return hadoopMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHadoopMap_Type() {
		return (EAttribute)hadoopMapEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHadoopOperation() {
		return hadoopOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHadoopOperation_Parallelism() {
		return (EAttribute)hadoopOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHadoopOperation_NTasks() {
		return (EAttribute)hadoopOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHadoopReduce() {
		return hadoopReduceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHadoopReduce_Type() {
		return (EAttribute)hadoopReduceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHadoopScenario() {
		return hadoopScenarioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHadoopScenario_JobSchedule() {
		return (EAttribute)hadoopScenarioEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHadoopWorkloadEvent() {
		return hadoopWorkloadEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHadoopWorkloadEvent_HadoopPopulation() {
		return (EAttribute)hadoopWorkloadEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHadoopWorkloadEvent_HadoopExtDelay() {
		return (EAttribute)hadoopWorkloadEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHadoopComputationNode() {
		return hadoopComputationNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHadoopComputationNode_NCores() {
		return (EAttribute)hadoopComputationNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HadoopFactory getHadoopFactory() {
		return (HadoopFactory)getEFactoryInstance();
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
		hadoopMapReduceJobEClass = createEClass(HADOOP_MAP_REDUCE_JOB);
		createEReference(hadoopMapReduceJobEClass, HADOOP_MAP_REDUCE_JOB__MAP_RESUCE_PHASES);
		createEReference(hadoopMapReduceJobEClass, HADOOP_MAP_REDUCE_JOB__BASE_CLASSIFIER);

		hadoopMapReducePhaseEClass = createEClass(HADOOP_MAP_REDUCE_PHASE);
		createEReference(hadoopMapReducePhaseEClass, HADOOP_MAP_REDUCE_PHASE__HAS_MAP);
		createEReference(hadoopMapReducePhaseEClass, HADOOP_MAP_REDUCE_PHASE__HAS_REDUCE);
		createEReference(hadoopMapReducePhaseEClass, HADOOP_MAP_REDUCE_PHASE__OUTPUT);
		createEReference(hadoopMapReducePhaseEClass, HADOOP_MAP_REDUCE_PHASE__BASE_CLASSIFIER);

		hadoopMapEClass = createEClass(HADOOP_MAP);
		createEAttribute(hadoopMapEClass, HADOOP_MAP__TYPE);

		hadoopOperationEClass = createEClass(HADOOP_OPERATION);
		createEAttribute(hadoopOperationEClass, HADOOP_OPERATION__PARALLELISM);
		createEAttribute(hadoopOperationEClass, HADOOP_OPERATION__NTASKS);

		hadoopReduceEClass = createEClass(HADOOP_REDUCE);
		createEAttribute(hadoopReduceEClass, HADOOP_REDUCE__TYPE);

		hadoopScenarioEClass = createEClass(HADOOP_SCENARIO);
		createEAttribute(hadoopScenarioEClass, HADOOP_SCENARIO__JOB_SCHEDULE);

		hadoopWorkloadEventEClass = createEClass(HADOOP_WORKLOAD_EVENT);
		createEAttribute(hadoopWorkloadEventEClass, HADOOP_WORKLOAD_EVENT__HADOOP_POPULATION);
		createEAttribute(hadoopWorkloadEventEClass, HADOOP_WORKLOAD_EVENT__HADOOP_EXT_DELAY);

		hadoopComputationNodeEClass = createEClass(HADOOP_COMPUTATION_NODE);
		createEAttribute(hadoopComputationNodeEClass, HADOOP_COMPUTATION_NODE__NCORES);
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
		UMLPackage theUMLPackage = (UMLPackage)EPackage.Registry.INSTANCE.getEPackage(UMLPackage.eNS_URI);
		CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);
		es.unizar.disco.dice.Basic_Enumeration_Types.Basic_Enumeration_TypesPackage theBasic_Enumeration_TypesPackage_1 = (es.unizar.disco.dice.Basic_Enumeration_Types.Basic_Enumeration_TypesPackage)EPackage.Registry.INSTANCE.getEPackage(es.unizar.disco.dice.Basic_Enumeration_Types.Basic_Enumeration_TypesPackage.eNS_URI);
		GQAMPackage theGQAMPackage = (GQAMPackage)EPackage.Registry.INSTANCE.getEPackage(GQAMPackage.eNS_URI);
		BasicNFP_TypesPackage theBasicNFP_TypesPackage = (BasicNFP_TypesPackage)EPackage.Registry.INSTANCE.getEPackage(BasicNFP_TypesPackage.eNS_URI);
		com.masdes.dam.Core.CorePackage theCorePackage_1 = (com.masdes.dam.Core.CorePackage)EPackage.Registry.INSTANCE.getEPackage(com.masdes.dam.Core.CorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		hadoopMapEClass.getESuperTypes().add(this.getHadoopOperation());
		hadoopOperationEClass.getESuperTypes().add(theGQAMPackage.getGaStep());
		hadoopReduceEClass.getESuperTypes().add(this.getHadoopOperation());
		hadoopScenarioEClass.getESuperTypes().add(theCorePackage_1.getDaService());
		hadoopWorkloadEventEClass.getESuperTypes().add(theGQAMPackage.getGaWorkloadEvent());
		hadoopComputationNodeEClass.getESuperTypes().add(theCorePackage.getCoreComputationNode());

		// Initialize classes and features; add operations and parameters
		initEClass(hadoopMapReduceJobEClass, HadoopMapReduceJob.class, "HadoopMapReduceJob", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHadoopMapReduceJob_MapResucePhases(), this.getHadoopMapReducePhase(), null, "mapResucePhases", null, 1, -1, HadoopMapReduceJob.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getHadoopMapReduceJob_Base_Classifier(), theUMLPackage.getClassifier(), null, "base_Classifier", null, 1, 1, HadoopMapReduceJob.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(hadoopMapReducePhaseEClass, HadoopMapReducePhase.class, "HadoopMapReducePhase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHadoopMapReducePhase_HasMap(), this.getHadoopMap(), null, "hasMap", null, 1, 1, HadoopMapReducePhase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getHadoopMapReducePhase_HasReduce(), this.getHadoopReduce(), null, "hasReduce", null, 1, 1, HadoopMapReducePhase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getHadoopMapReducePhase_Output(), theCorePackage.getCoreData(), null, "output", null, 0, 1, HadoopMapReducePhase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getHadoopMapReducePhase_Base_Classifier(), theUMLPackage.getClassifier(), null, "base_Classifier", null, 1, 1, HadoopMapReducePhase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(hadoopMapEClass, HadoopMap.class, "HadoopMap", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHadoopMap_Type(), theBasic_Enumeration_TypesPackage_1.getMapType(), "type", null, 0, 1, HadoopMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(hadoopOperationEClass, HadoopOperation.class, "HadoopOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHadoopOperation_Parallelism(), theBasicNFP_TypesPackage.getNFP_Integer(), "parallelism", null, 0, 1, HadoopOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getHadoopOperation_NTasks(), theBasicNFP_TypesPackage.getNFP_Integer(), "nTasks", null, 0, -1, HadoopOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(hadoopReduceEClass, HadoopReduce.class, "HadoopReduce", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHadoopReduce_Type(), theBasic_Enumeration_TypesPackage_1.getReduceType(), "type", null, 0, 1, HadoopReduce.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(hadoopScenarioEClass, HadoopScenario.class, "HadoopScenario", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHadoopScenario_JobSchedule(), theBasic_Enumeration_TypesPackage_1.getScheduling(), "jobSchedule", null, 0, 1, HadoopScenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(hadoopWorkloadEventEClass, HadoopWorkloadEvent.class, "HadoopWorkloadEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHadoopWorkloadEvent_HadoopPopulation(), theBasicNFP_TypesPackage.getNFP_Integer(), "hadoopPopulation", null, 0, -1, HadoopWorkloadEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getHadoopWorkloadEvent_HadoopExtDelay(), theBasicNFP_TypesPackage.getNFP_Duration(), "hadoopExtDelay", null, 0, -1, HadoopWorkloadEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(hadoopComputationNodeEClass, HadoopComputationNode.class, "HadoopComputationNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHadoopComputationNode_NCores(), theBasicNFP_TypesPackage.getNFP_Integer(), "nCores", null, 0, -1, HadoopComputationNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
	}

} //HadoopPackageImpl
