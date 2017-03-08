/**
 */
package es.unizar.disco.dice.DTSM.Spark.impl;

import com.masdes.dam.Basic_Data_Types.Basic_Data_TypesPackage;

import com.masdes.dam.Basic_Enumeration_Types.Basic_Enumeration_TypesPackage;

import com.masdes.dam.Complex_Data_Types.Complex_Data_TypesPackage;

import com.masdes.dam.DAM.DAMPackage;

import es.unizar.disco.dice.Basic_Data_Types.impl.Basic_Data_TypesPackageImpl;

import es.unizar.disco.dice.Basic_Enumeration_Types.impl.Basic_Enumeration_TypesPackageImpl;

import es.unizar.disco.dice.Complex_Data_Types.impl.Complex_Data_TypesPackageImpl;

import es.unizar.disco.dice.DDSM.DDSMPackage;

import es.unizar.disco.dice.DDSM.impl.DDSMPackageImpl;

import es.unizar.disco.dice.DICE.DICEPackage;

import es.unizar.disco.dice.DICE.impl.DICEPackageImpl;

import es.unizar.disco.dice.DPIM.DPIMPackage;

import es.unizar.disco.dice.DPIM.impl.DPIMPackageImpl;

import es.unizar.disco.dice.DTSM.Core.CorePackage;

import es.unizar.disco.dice.DTSM.Core.impl.CorePackageImpl;

import es.unizar.disco.dice.DTSM.Hadoop.HadoopPackage;

import es.unizar.disco.dice.DTSM.Hadoop.impl.HadoopPackageImpl;
import es.unizar.disco.dice.DTSM.Spark.SparkFactory;
import es.unizar.disco.dice.DTSM.Spark.SparkMap;
import es.unizar.disco.dice.DTSM.Spark.SparkNode;
import es.unizar.disco.dice.DTSM.Spark.SparkOperation;
import es.unizar.disco.dice.DTSM.Spark.SparkPackage;
import es.unizar.disco.dice.DTSM.Spark.SparkReduce;
import es.unizar.disco.dice.DTSM.Spark.SparkScenario;
import es.unizar.disco.dice.DTSM.Spark.SparkWorkloadEvent;

import es.unizar.disco.dice.DTSM.Storm.StormPackage;

import es.unizar.disco.dice.DTSM.Storm.impl.StormPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.papyrus.MARTE.MARTE_AnalysisModel.GQAM.GQAMPackage;

import org.eclipse.papyrus.MARTE_Library.BasicNFP_Types.BasicNFP_TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SparkPackageImpl extends EPackageImpl implements SparkPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sparkOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sparkMapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sparkReduceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sparkScenarioEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sparkWorkloadEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sparkNodeEClass = null;

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
	 * @see es.unizar.disco.dice.DTSM.Spark.SparkPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SparkPackageImpl() {
		super(eNS_URI, SparkFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SparkPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SparkPackage init() {
		if (isInited) return (SparkPackage)EPackage.Registry.INSTANCE.getEPackage(SparkPackage.eNS_URI);

		// Obtain or create and register package
		SparkPackageImpl theSparkPackage = (SparkPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SparkPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SparkPackageImpl());

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
		HadoopPackageImpl theHadoopPackage = (HadoopPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(HadoopPackage.eNS_URI) instanceof HadoopPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(HadoopPackage.eNS_URI) : HadoopPackage.eINSTANCE);
		DDSMPackageImpl theDDSMPackage = (DDSMPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DDSMPackage.eNS_URI) instanceof DDSMPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DDSMPackage.eNS_URI) : DDSMPackage.eINSTANCE);
		Complex_Data_TypesPackageImpl theComplex_Data_TypesPackage_1 = (Complex_Data_TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(es.unizar.disco.dice.Complex_Data_Types.Complex_Data_TypesPackage.eNS_URI) instanceof Complex_Data_TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(es.unizar.disco.dice.Complex_Data_Types.Complex_Data_TypesPackage.eNS_URI) : es.unizar.disco.dice.Complex_Data_Types.Complex_Data_TypesPackage.eINSTANCE);
		Basic_Data_TypesPackageImpl theBasic_Data_TypesPackage_1 = (Basic_Data_TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(es.unizar.disco.dice.Basic_Data_Types.Basic_Data_TypesPackage.eNS_URI) instanceof Basic_Data_TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(es.unizar.disco.dice.Basic_Data_Types.Basic_Data_TypesPackage.eNS_URI) : es.unizar.disco.dice.Basic_Data_Types.Basic_Data_TypesPackage.eINSTANCE);
		Basic_Enumeration_TypesPackageImpl theBasic_Enumeration_TypesPackage_1 = (Basic_Enumeration_TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(es.unizar.disco.dice.Basic_Enumeration_Types.Basic_Enumeration_TypesPackage.eNS_URI) instanceof Basic_Enumeration_TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(es.unizar.disco.dice.Basic_Enumeration_Types.Basic_Enumeration_TypesPackage.eNS_URI) : es.unizar.disco.dice.Basic_Enumeration_Types.Basic_Enumeration_TypesPackage.eINSTANCE);

		// Create package meta-data objects
		theSparkPackage.createPackageContents();
		theDICEPackage.createPackageContents();
		theDPIMPackage.createPackageContents();
		theCorePackage.createPackageContents();
		theStormPackage.createPackageContents();
		theHadoopPackage.createPackageContents();
		theDDSMPackage.createPackageContents();
		theComplex_Data_TypesPackage_1.createPackageContents();
		theBasic_Data_TypesPackage_1.createPackageContents();
		theBasic_Enumeration_TypesPackage_1.createPackageContents();

		// Initialize created meta-data
		theSparkPackage.initializePackageContents();
		theDICEPackage.initializePackageContents();
		theDPIMPackage.initializePackageContents();
		theCorePackage.initializePackageContents();
		theStormPackage.initializePackageContents();
		theHadoopPackage.initializePackageContents();
		theDDSMPackage.initializePackageContents();
		theComplex_Data_TypesPackage_1.initializePackageContents();
		theBasic_Data_TypesPackage_1.initializePackageContents();
		theBasic_Enumeration_TypesPackage_1.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSparkPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SparkPackage.eNS_URI, theSparkPackage);
		return theSparkPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSparkOperation() {
		return sparkOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSparkOperation_RDDAvailable() {
		return (EAttribute)sparkOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSparkOperation_RDD() {
		return (EAttribute)sparkOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSparkOperation_OpType() {
		return (EAttribute)sparkOperationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSparkMap() {
		return sparkMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSparkMap_MapType() {
		return (EAttribute)sparkMapEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSparkReduce() {
		return sparkReduceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSparkReduce_ReduceType() {
		return (EAttribute)sparkReduceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSparkScenario() {
		return sparkScenarioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSparkScenario_NAssignedCores() {
		return (EAttribute)sparkScenarioEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSparkScenario_NAssignedMemory() {
		return (EAttribute)sparkScenarioEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSparkScenario_JobSchedule() {
		return (EAttribute)sparkScenarioEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSparkWorkloadEvent() {
		return sparkWorkloadEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSparkWorkloadEvent_SparkPopulation() {
		return (EAttribute)sparkWorkloadEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSparkWorkloadEvent_SparkExtDelay() {
		return (EAttribute)sparkWorkloadEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSparkNode() {
		return sparkNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSparkNode_NCores() {
		return (EAttribute)sparkNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSparkNode_Memory() {
		return (EAttribute)sparkNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SparkFactory getSparkFactory() {
		return (SparkFactory)getEFactoryInstance();
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
		sparkOperationEClass = createEClass(SPARK_OPERATION);
		createEAttribute(sparkOperationEClass, SPARK_OPERATION__RDD_AVAILABLE);
		createEAttribute(sparkOperationEClass, SPARK_OPERATION__RDD);
		createEAttribute(sparkOperationEClass, SPARK_OPERATION__OP_TYPE);

		sparkMapEClass = createEClass(SPARK_MAP);
		createEAttribute(sparkMapEClass, SPARK_MAP__MAP_TYPE);

		sparkReduceEClass = createEClass(SPARK_REDUCE);
		createEAttribute(sparkReduceEClass, SPARK_REDUCE__REDUCE_TYPE);

		sparkScenarioEClass = createEClass(SPARK_SCENARIO);
		createEAttribute(sparkScenarioEClass, SPARK_SCENARIO__NASSIGNED_CORES);
		createEAttribute(sparkScenarioEClass, SPARK_SCENARIO__NASSIGNED_MEMORY);
		createEAttribute(sparkScenarioEClass, SPARK_SCENARIO__JOB_SCHEDULE);

		sparkWorkloadEventEClass = createEClass(SPARK_WORKLOAD_EVENT);
		createEAttribute(sparkWorkloadEventEClass, SPARK_WORKLOAD_EVENT__SPARK_POPULATION);
		createEAttribute(sparkWorkloadEventEClass, SPARK_WORKLOAD_EVENT__SPARK_EXT_DELAY);

		sparkNodeEClass = createEClass(SPARK_NODE);
		createEAttribute(sparkNodeEClass, SPARK_NODE__NCORES);
		createEAttribute(sparkNodeEClass, SPARK_NODE__MEMORY);
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
		GQAMPackage theGQAMPackage = (GQAMPackage)EPackage.Registry.INSTANCE.getEPackage(GQAMPackage.eNS_URI);
		BasicNFP_TypesPackage theBasicNFP_TypesPackage = (BasicNFP_TypesPackage)EPackage.Registry.INSTANCE.getEPackage(BasicNFP_TypesPackage.eNS_URI);
		es.unizar.disco.dice.Basic_Enumeration_Types.Basic_Enumeration_TypesPackage theBasic_Enumeration_TypesPackage_1 = (es.unizar.disco.dice.Basic_Enumeration_Types.Basic_Enumeration_TypesPackage)EPackage.Registry.INSTANCE.getEPackage(es.unizar.disco.dice.Basic_Enumeration_Types.Basic_Enumeration_TypesPackage.eNS_URI);
		CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		sparkOperationEClass.getESuperTypes().add(theGQAMPackage.getGaStep());
		sparkMapEClass.getESuperTypes().add(this.getSparkOperation());
		sparkReduceEClass.getESuperTypes().add(this.getSparkOperation());
		sparkScenarioEClass.getESuperTypes().add(theGQAMPackage.getGaScenario());
		sparkWorkloadEventEClass.getESuperTypes().add(theGQAMPackage.getGaWorkloadEvent());
		sparkNodeEClass.getESuperTypes().add(theCorePackage.getCoreComputationNode());

		// Initialize classes and features; add operations and parameters
		initEClass(sparkOperationEClass, SparkOperation.class, "SparkOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSparkOperation_RDDAvailable(), theBasicNFP_TypesPackage.getNFP_Integer(), "RDDAvailable", null, 1, 1, SparkOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSparkOperation_RDD(), theBasicNFP_TypesPackage.getNFP_Integer(), "RDD", null, 1, 1, SparkOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSparkOperation_OpType(), theBasic_Enumeration_TypesPackage_1.getSparkOperation(), "OpType", null, 1, 1, SparkOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(sparkMapEClass, SparkMap.class, "SparkMap", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSparkMap_MapType(), theBasic_Enumeration_TypesPackage_1.getSparkMap(), "MapType", null, 1, 1, SparkMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(sparkReduceEClass, SparkReduce.class, "SparkReduce", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSparkReduce_ReduceType(), theBasic_Enumeration_TypesPackage_1.getSparkReduce(), "ReduceType", null, 1, 1, SparkReduce.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(sparkScenarioEClass, SparkScenario.class, "SparkScenario", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSparkScenario_NAssignedCores(), theBasicNFP_TypesPackage.getNFP_Integer(), "nAssignedCores", null, 1, 1, SparkScenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSparkScenario_NAssignedMemory(), theBasicNFP_TypesPackage.getNFP_Integer(), "nAssignedMemory", null, 1, 1, SparkScenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSparkScenario_JobSchedule(), theBasic_Enumeration_TypesPackage_1.getScheduling(), "jobSchedule", null, 1, 1, SparkScenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(sparkWorkloadEventEClass, SparkWorkloadEvent.class, "SparkWorkloadEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSparkWorkloadEvent_SparkPopulation(), theBasicNFP_TypesPackage.getNFP_Integer(), "sparkPopulation", null, 1, 1, SparkWorkloadEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSparkWorkloadEvent_SparkExtDelay(), theBasicNFP_TypesPackage.getNFP_Duration(), "sparkExtDelay", null, 1, 1, SparkWorkloadEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(sparkNodeEClass, SparkNode.class, "SparkNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSparkNode_NCores(), theBasicNFP_TypesPackage.getNFP_Integer(), "nCores", null, 1, 1, SparkNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSparkNode_Memory(), theBasicNFP_TypesPackage.getNFP_Boolean(), "Memory", null, 1, 1, SparkNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
	}

} //SparkPackageImpl
