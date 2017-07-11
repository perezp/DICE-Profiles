/**
 */
package es.unizar.disco.dice.DPIM.impl;

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

import es.unizar.disco.dice.DPIM.DPIMFactory;
import es.unizar.disco.dice.DPIM.DPIMPackage;
import es.unizar.disco.dice.DPIM.DpimChannel;
import es.unizar.disco.dice.DPIM.DpimComputationNode;
import es.unizar.disco.dice.DPIM.DpimFilterNode;
import es.unizar.disco.dice.DPIM.DpimScenario;
import es.unizar.disco.dice.DPIM.DpimSourceNode;
import es.unizar.disco.dice.DPIM.DpimStorageNode;
import es.unizar.disco.dice.DPIM.DpimVisualizationNode;

import es.unizar.disco.dice.DTSM.Cassandra.CassandraPackage;
import es.unizar.disco.dice.DTSM.Cassandra.impl.CassandraPackageImpl;
import es.unizar.disco.dice.DTSM.Core.CorePackage;

import es.unizar.disco.dice.DTSM.Core.impl.CorePackageImpl;

import es.unizar.disco.dice.DTSM.Hadoop.HadoopPackage;

import es.unizar.disco.dice.DTSM.Hadoop.impl.HadoopPackageImpl;

import es.unizar.disco.dice.DTSM.Spark.SparkPackage;

import es.unizar.disco.dice.DTSM.Spark.impl.SparkPackageImpl;

import es.unizar.disco.dice.DTSM.Storm.StormPackage;

import es.unizar.disco.dice.DTSM.Storm.impl.StormPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.papyrus.MARTE.MARTE_Foundations.GRM.GRMPackage;

import org.eclipse.papyrus.MARTE_Library.BasicNFP_Types.BasicNFP_TypesPackage;

import org.eclipse.uml2.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DPIMPackageImpl extends EPackageImpl implements DPIMPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dpimComputationNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dpimFilterNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dpimVisualizationNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dpimSourceNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dpimStorageNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dpimChannelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dpimScenarioEClass = null;

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
	 * @see es.unizar.disco.dice.DPIM.DPIMPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DPIMPackageImpl() {
		super(eNS_URI, DPIMFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link DPIMPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DPIMPackage init() {
		if (isInited) return (DPIMPackage)EPackage.Registry.INSTANCE.getEPackage(DPIMPackage.eNS_URI);

		// Obtain or create and register package
		DPIMPackageImpl theDPIMPackage = (DPIMPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DPIMPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DPIMPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		DAMPackage.eINSTANCE.eClass();
		Complex_Data_TypesPackage.eINSTANCE.eClass();
		Basic_Data_TypesPackage.eINSTANCE.eClass();
		Basic_Enumeration_TypesPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		DICEPackageImpl theDICEPackage = (DICEPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DICEPackage.eNS_URI) instanceof DICEPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DICEPackage.eNS_URI) : DICEPackage.eINSTANCE);
		CorePackageImpl theCorePackage = (CorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) instanceof CorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) : CorePackage.eINSTANCE);
		StormPackageImpl theStormPackage = (StormPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StormPackage.eNS_URI) instanceof StormPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StormPackage.eNS_URI) : StormPackage.eINSTANCE);
		HadoopPackageImpl theHadoopPackage = (HadoopPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(HadoopPackage.eNS_URI) instanceof HadoopPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(HadoopPackage.eNS_URI) : HadoopPackage.eINSTANCE);
		SparkPackageImpl theSparkPackage = (SparkPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SparkPackage.eNS_URI) instanceof SparkPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SparkPackage.eNS_URI) : SparkPackage.eINSTANCE);
		CassandraPackageImpl theCassandraPackage = (CassandraPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CassandraPackage.eNS_URI) instanceof CassandraPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CassandraPackage.eNS_URI) : CassandraPackage.eINSTANCE);
		DDSMPackageImpl theDDSMPackage = (DDSMPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DDSMPackage.eNS_URI) instanceof DDSMPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DDSMPackage.eNS_URI) : DDSMPackage.eINSTANCE);
		Complex_Data_TypesPackageImpl theComplex_Data_TypesPackage_1 = (Complex_Data_TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(es.unizar.disco.dice.Complex_Data_Types.Complex_Data_TypesPackage.eNS_URI) instanceof Complex_Data_TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(es.unizar.disco.dice.Complex_Data_Types.Complex_Data_TypesPackage.eNS_URI) : es.unizar.disco.dice.Complex_Data_Types.Complex_Data_TypesPackage.eINSTANCE);
		Basic_Enumeration_TypesPackageImpl theBasic_Enumeration_TypesPackage_1 = (Basic_Enumeration_TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(es.unizar.disco.dice.Basic_Enumeration_Types.Basic_Enumeration_TypesPackage.eNS_URI) instanceof Basic_Enumeration_TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(es.unizar.disco.dice.Basic_Enumeration_Types.Basic_Enumeration_TypesPackage.eNS_URI) : es.unizar.disco.dice.Basic_Enumeration_Types.Basic_Enumeration_TypesPackage.eINSTANCE);

		// Create package meta-data objects
		theDPIMPackage.createPackageContents();
		theDICEPackage.createPackageContents();
		theCorePackage.createPackageContents();
		theStormPackage.createPackageContents();
		theHadoopPackage.createPackageContents();
		theSparkPackage.createPackageContents();
		theCassandraPackage.createPackageContents();
		theDDSMPackage.createPackageContents();
		theComplex_Data_TypesPackage_1.createPackageContents();
		theBasic_Enumeration_TypesPackage_1.createPackageContents();

		// Initialize created meta-data
		theDPIMPackage.initializePackageContents();
		theDICEPackage.initializePackageContents();
		theCorePackage.initializePackageContents();
		theStormPackage.initializePackageContents();
		theHadoopPackage.initializePackageContents();
		theSparkPackage.initializePackageContents();
		theCassandraPackage.initializePackageContents();
		theDDSMPackage.initializePackageContents();
		theComplex_Data_TypesPackage_1.initializePackageContents();
		theBasic_Enumeration_TypesPackage_1.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDPIMPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DPIMPackage.eNS_URI, theDPIMPackage);
		return theDPIMPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDpimComputationNode() {
		return dpimComputationNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDpimComputationNode_NodeThroughput() {
		return (EAttribute)dpimComputationNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDpimComputationNode_Type() {
		return (EAttribute)dpimComputationNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDpimComputationNode_TargetTech() {
		return (EAttribute)dpimComputationNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDpimComputationNode_ProcType() {
		return (EAttribute)dpimComputationNodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDpimFilterNode() {
		return dpimFilterNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDpimFilterNode_InputRatio() {
		return (EAttribute)dpimFilterNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDpimFilterNode_OutputRation() {
		return (EAttribute)dpimFilterNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDpimVisualizationNode() {
		return dpimVisualizationNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDpimSourceNode() {
		return dpimSourceNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDpimSourceNode_Store() {
		return (EReference)dpimSourceNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDpimSourceNode_Provides() {
		return (EReference)dpimSourceNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDpimSourceNode_SourceType() {
		return (EAttribute)dpimSourceNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDpimSourceNode_Rate() {
		return (EAttribute)dpimSourceNodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDpimStorageNode() {
		return dpimStorageNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDpimStorageNode_RespondsTo() {
		return (EReference)dpimStorageNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDpimStorageNode_CrudRate() {
		return (EAttribute)dpimStorageNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDpimChannel() {
		return dpimChannelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDpimChannel_Rate() {
		return (EAttribute)dpimChannelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDpimChannel_MessageBroker() {
		return (EAttribute)dpimChannelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDpimChannel_ChannelDescription() {
		return (EReference)dpimChannelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDpimScenario() {
		return dpimScenarioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DPIMFactory getDPIMFactory() {
		return (DPIMFactory)getEFactoryInstance();
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
		dpimComputationNodeEClass = createEClass(DPIM_COMPUTATION_NODE);
		createEAttribute(dpimComputationNodeEClass, DPIM_COMPUTATION_NODE__NODE_THROUGHPUT);
		createEAttribute(dpimComputationNodeEClass, DPIM_COMPUTATION_NODE__TYPE);
		createEAttribute(dpimComputationNodeEClass, DPIM_COMPUTATION_NODE__TARGET_TECH);
		createEAttribute(dpimComputationNodeEClass, DPIM_COMPUTATION_NODE__PROC_TYPE);

		dpimFilterNodeEClass = createEClass(DPIM_FILTER_NODE);
		createEAttribute(dpimFilterNodeEClass, DPIM_FILTER_NODE__INPUT_RATIO);
		createEAttribute(dpimFilterNodeEClass, DPIM_FILTER_NODE__OUTPUT_RATION);

		dpimVisualizationNodeEClass = createEClass(DPIM_VISUALIZATION_NODE);

		dpimSourceNodeEClass = createEClass(DPIM_SOURCE_NODE);
		createEReference(dpimSourceNodeEClass, DPIM_SOURCE_NODE__STORE);
		createEReference(dpimSourceNodeEClass, DPIM_SOURCE_NODE__PROVIDES);
		createEAttribute(dpimSourceNodeEClass, DPIM_SOURCE_NODE__SOURCE_TYPE);
		createEAttribute(dpimSourceNodeEClass, DPIM_SOURCE_NODE__RATE);

		dpimStorageNodeEClass = createEClass(DPIM_STORAGE_NODE);
		createEReference(dpimStorageNodeEClass, DPIM_STORAGE_NODE__RESPONDS_TO);
		createEAttribute(dpimStorageNodeEClass, DPIM_STORAGE_NODE__CRUD_RATE);

		dpimChannelEClass = createEClass(DPIM_CHANNEL);
		createEAttribute(dpimChannelEClass, DPIM_CHANNEL__RATE);
		createEAttribute(dpimChannelEClass, DPIM_CHANNEL__MESSAGE_BROKER);
		createEReference(dpimChannelEClass, DPIM_CHANNEL__CHANNEL_DESCRIPTION);

		dpimScenarioEClass = createEClass(DPIM_SCENARIO);
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
		com.masdes.dam.Core.CorePackage theCorePackage_1 = (com.masdes.dam.Core.CorePackage)EPackage.Registry.INSTANCE.getEPackage(com.masdes.dam.Core.CorePackage.eNS_URI);
		BasicNFP_TypesPackage theBasicNFP_TypesPackage = (BasicNFP_TypesPackage)EPackage.Registry.INSTANCE.getEPackage(BasicNFP_TypesPackage.eNS_URI);
		es.unizar.disco.dice.Basic_Enumeration_Types.Basic_Enumeration_TypesPackage theBasic_Enumeration_TypesPackage_1 = (es.unizar.disco.dice.Basic_Enumeration_Types.Basic_Enumeration_TypesPackage)EPackage.Registry.INSTANCE.getEPackage(es.unizar.disco.dice.Basic_Enumeration_Types.Basic_Enumeration_TypesPackage.eNS_URI);
		es.unizar.disco.dice.Complex_Data_Types.Complex_Data_TypesPackage theComplex_Data_TypesPackage_1 = (es.unizar.disco.dice.Complex_Data_Types.Complex_Data_TypesPackage)EPackage.Registry.INSTANCE.getEPackage(es.unizar.disco.dice.Complex_Data_Types.Complex_Data_TypesPackage.eNS_URI);
		GRMPackage theGRMPackage = (GRMPackage)EPackage.Registry.INSTANCE.getEPackage(GRMPackage.eNS_URI);
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		dpimComputationNodeEClass.getESuperTypes().add(theCorePackage_1.getDaComponent());
		dpimFilterNodeEClass.getESuperTypes().add(this.getDpimComputationNode());
		dpimVisualizationNodeEClass.getESuperTypes().add(this.getDpimComputationNode());
		dpimSourceNodeEClass.getESuperTypes().add(this.getDpimComputationNode());
		dpimStorageNodeEClass.getESuperTypes().add(theGRMPackage.getStorageResource());
		dpimChannelEClass.getESuperTypes().add(theCorePackage_1.getDaConnector());
		dpimScenarioEClass.getESuperTypes().add(theCorePackage_1.getDaService());

		// Initialize classes and features; add operations and parameters
		initEClass(dpimComputationNodeEClass, DpimComputationNode.class, "DpimComputationNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDpimComputationNode_NodeThroughput(), theBasicNFP_TypesPackage.getNFP_Frequency(), "nodeThroughput", null, 0, 1, DpimComputationNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDpimComputationNode_Type(), theBasic_Enumeration_TypesPackage_1.getComputationType(), "type", null, 0, 1, DpimComputationNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDpimComputationNode_TargetTech(), theBasic_Enumeration_TypesPackage_1.getTechType(), "targetTech", null, 0, 1, DpimComputationNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDpimComputationNode_ProcType(), theBasic_Enumeration_TypesPackage_1.getProcessingType(), "procType", null, 0, 1, DpimComputationNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(dpimFilterNodeEClass, DpimFilterNode.class, "DpimFilterNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDpimFilterNode_InputRatio(), theBasicNFP_TypesPackage.getNFP_Frequency(), "inputRatio", null, 0, 1, DpimFilterNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDpimFilterNode_OutputRation(), theBasicNFP_TypesPackage.getNFP_Frequency(), "outputRation", null, 0, 1, DpimFilterNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(dpimVisualizationNodeEClass, DpimVisualizationNode.class, "DpimVisualizationNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dpimSourceNodeEClass, DpimSourceNode.class, "DpimSourceNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDpimSourceNode_Store(), theComplex_Data_TypesPackage_1.getDiceDataVolume(), null, "store", null, 0, 1, DpimSourceNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDpimSourceNode_Provides(), theComplex_Data_TypesPackage_1.getDiceDataSpecification(), null, "provides", null, 0, 1, DpimSourceNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDpimSourceNode_SourceType(), theBasic_Enumeration_TypesPackage_1.getSourceType(), "sourceType", null, 0, 1, DpimSourceNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDpimSourceNode_Rate(), theBasicNFP_TypesPackage.getNFP_Frequency(), "rate", null, 0, 1, DpimSourceNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(dpimStorageNodeEClass, DpimStorageNode.class, "DpimStorageNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDpimStorageNode_RespondsTo(), theComplex_Data_TypesPackage_1.getDiceDataSpecification(), null, "respondsTo", null, 0, 1, DpimStorageNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDpimStorageNode_CrudRate(), theBasicNFP_TypesPackage.getNFP_Frequency(), "crudRate", null, 0, 1, DpimStorageNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(dpimChannelEClass, DpimChannel.class, "DpimChannel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDpimChannel_Rate(), theBasicNFP_TypesPackage.getNFP_Frequency(), "rate", null, 0, 1, DpimChannel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDpimChannel_MessageBroker(), theTypesPackage.getString(), "messageBroker", null, 0, 1, DpimChannel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDpimChannel_ChannelDescription(), theComplex_Data_TypesPackage_1.getDiceChannelSpecification(), null, "channelDescription", null, 0, 1, DpimChannel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(dpimScenarioEClass, DpimScenario.class, "DpimScenario", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
	}

} //DPIMPackageImpl
