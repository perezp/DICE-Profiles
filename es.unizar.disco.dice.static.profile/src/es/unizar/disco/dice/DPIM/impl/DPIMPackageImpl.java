/**
 */
package es.unizar.disco.dice.DPIM.impl;

import com.masdes.dam.Basic_Data_Types.Basic_Data_TypesPackage;

import com.masdes.dam.Basic_Enumeration_Types.Basic_Enumeration_TypesPackage;

import com.masdes.dam.Complex_Data_Types.Complex_Data_TypesPackage;

import com.masdes.dam.Core.CorePackage;

import com.masdes.dam.DAM.DAMPackage;

import es.unizar.disco.dice.Basic_Enumeration_Types.impl.Basic_Enumeration_TypesPackageImpl;

import es.unizar.disco.dice.Complex_Data_Types.impl.Complex_Data_TypesPackageImpl;

import es.unizar.disco.dice.DICE.DICEPackage;

import es.unizar.disco.dice.DICE.impl.DICEPackageImpl;

import es.unizar.disco.dice.DPIM.DPIMFactory;
import es.unizar.disco.dice.DPIM.DPIMPackage;
import es.unizar.disco.dice.DPIM.DiceChannel;
import es.unizar.disco.dice.DPIM.DiceComponent;
import es.unizar.disco.dice.DPIM.DiceFilterNode;
import es.unizar.disco.dice.DPIM.DiceSourceNode;
import es.unizar.disco.dice.DPIM.DiceStorageResource;
import es.unizar.disco.dice.DPIM.DiceVisualizationNode;

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
	private EClass diceComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diceFilterNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diceVisualizationNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diceSourceNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diceStorageResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diceChannelEClass = null;

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
		Complex_Data_TypesPackageImpl theComplex_Data_TypesPackage_1 = (Complex_Data_TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(es.unizar.disco.dice.Complex_Data_Types.Complex_Data_TypesPackage.eNS_URI) instanceof Complex_Data_TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(es.unizar.disco.dice.Complex_Data_Types.Complex_Data_TypesPackage.eNS_URI) : es.unizar.disco.dice.Complex_Data_Types.Complex_Data_TypesPackage.eINSTANCE);
		Basic_Enumeration_TypesPackageImpl theBasic_Enumeration_TypesPackage_1 = (Basic_Enumeration_TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(es.unizar.disco.dice.Basic_Enumeration_Types.Basic_Enumeration_TypesPackage.eNS_URI) instanceof Basic_Enumeration_TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(es.unizar.disco.dice.Basic_Enumeration_Types.Basic_Enumeration_TypesPackage.eNS_URI) : es.unizar.disco.dice.Basic_Enumeration_Types.Basic_Enumeration_TypesPackage.eINSTANCE);

		// Create package meta-data objects
		theDPIMPackage.createPackageContents();
		theDICEPackage.createPackageContents();
		theComplex_Data_TypesPackage_1.createPackageContents();
		theBasic_Enumeration_TypesPackage_1.createPackageContents();

		// Initialize created meta-data
		theDPIMPackage.initializePackageContents();
		theDICEPackage.initializePackageContents();
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
	public EClass getDiceComponent() {
		return diceComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiceComponent_Throughput() {
		return (EAttribute)diceComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiceComponent_Type() {
		return (EAttribute)diceComponentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiceComponent_TargetTech() {
		return (EAttribute)diceComponentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiceComponent_ProcType() {
		return (EAttribute)diceComponentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiceFilterNode() {
		return diceFilterNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiceFilterNode_InputRatio() {
		return (EAttribute)diceFilterNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiceFilterNode_OutputRation() {
		return (EAttribute)diceFilterNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiceVisualizationNode() {
		return diceVisualizationNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiceSourceNode() {
		return diceSourceNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiceSourceNode_Store() {
		return (EReference)diceSourceNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiceSourceNode_Provides() {
		return (EReference)diceSourceNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiceSourceNode_SourceType() {
		return (EAttribute)diceSourceNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiceSourceNode_Rate() {
		return (EAttribute)diceSourceNodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiceStorageResource() {
		return diceStorageResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiceStorageResource_RespondsTo() {
		return (EReference)diceStorageResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiceStorageResource_CrudRate() {
		return (EAttribute)diceStorageResourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiceChannel() {
		return diceChannelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiceChannel_Rate() {
		return (EAttribute)diceChannelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiceChannel_MessageBroker() {
		return (EAttribute)diceChannelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiceChannel_ChannelDescription() {
		return (EReference)diceChannelEClass.getEStructuralFeatures().get(2);
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
		diceComponentEClass = createEClass(DICE_COMPONENT);
		createEAttribute(diceComponentEClass, DICE_COMPONENT__THROUGHPUT);
		createEAttribute(diceComponentEClass, DICE_COMPONENT__TYPE);
		createEAttribute(diceComponentEClass, DICE_COMPONENT__TARGET_TECH);
		createEAttribute(diceComponentEClass, DICE_COMPONENT__PROC_TYPE);

		diceFilterNodeEClass = createEClass(DICE_FILTER_NODE);
		createEAttribute(diceFilterNodeEClass, DICE_FILTER_NODE__INPUT_RATIO);
		createEAttribute(diceFilterNodeEClass, DICE_FILTER_NODE__OUTPUT_RATION);

		diceVisualizationNodeEClass = createEClass(DICE_VISUALIZATION_NODE);

		diceSourceNodeEClass = createEClass(DICE_SOURCE_NODE);
		createEReference(diceSourceNodeEClass, DICE_SOURCE_NODE__STORE);
		createEReference(diceSourceNodeEClass, DICE_SOURCE_NODE__PROVIDES);
		createEAttribute(diceSourceNodeEClass, DICE_SOURCE_NODE__SOURCE_TYPE);
		createEAttribute(diceSourceNodeEClass, DICE_SOURCE_NODE__RATE);

		diceStorageResourceEClass = createEClass(DICE_STORAGE_RESOURCE);
		createEReference(diceStorageResourceEClass, DICE_STORAGE_RESOURCE__RESPONDS_TO);
		createEAttribute(diceStorageResourceEClass, DICE_STORAGE_RESOURCE__CRUD_RATE);

		diceChannelEClass = createEClass(DICE_CHANNEL);
		createEAttribute(diceChannelEClass, DICE_CHANNEL__RATE);
		createEAttribute(diceChannelEClass, DICE_CHANNEL__MESSAGE_BROKER);
		createEReference(diceChannelEClass, DICE_CHANNEL__CHANNEL_DESCRIPTION);
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
		es.unizar.disco.dice.Basic_Enumeration_Types.Basic_Enumeration_TypesPackage theBasic_Enumeration_TypesPackage_1 = (es.unizar.disco.dice.Basic_Enumeration_Types.Basic_Enumeration_TypesPackage)EPackage.Registry.INSTANCE.getEPackage(es.unizar.disco.dice.Basic_Enumeration_Types.Basic_Enumeration_TypesPackage.eNS_URI);
		es.unizar.disco.dice.Complex_Data_Types.Complex_Data_TypesPackage theComplex_Data_TypesPackage_1 = (es.unizar.disco.dice.Complex_Data_Types.Complex_Data_TypesPackage)EPackage.Registry.INSTANCE.getEPackage(es.unizar.disco.dice.Complex_Data_Types.Complex_Data_TypesPackage.eNS_URI);
		GRMPackage theGRMPackage = (GRMPackage)EPackage.Registry.INSTANCE.getEPackage(GRMPackage.eNS_URI);
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		diceComponentEClass.getESuperTypes().add(theCorePackage.getDaComponent());
		diceFilterNodeEClass.getESuperTypes().add(this.getDiceComponent());
		diceVisualizationNodeEClass.getESuperTypes().add(this.getDiceComponent());
		diceSourceNodeEClass.getESuperTypes().add(this.getDiceComponent());
		diceStorageResourceEClass.getESuperTypes().add(theGRMPackage.getStorageResource());
		diceChannelEClass.getESuperTypes().add(theCorePackage.getDaConnector());

		// Initialize classes and features; add operations and parameters
		initEClass(diceComponentEClass, DiceComponent.class, "DiceComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiceComponent_Throughput(), theBasicNFP_TypesPackage.getNFP_Frequency(), "throughput", null, 0, 1, DiceComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDiceComponent_Type(), theBasic_Enumeration_TypesPackage_1.getComputationType(), "type", null, 0, 1, DiceComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDiceComponent_TargetTech(), theBasic_Enumeration_TypesPackage_1.getTechType(), "targetTech", null, 0, 1, DiceComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDiceComponent_ProcType(), theBasic_Enumeration_TypesPackage_1.getProcessingType(), "procType", null, 0, 1, DiceComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(diceFilterNodeEClass, DiceFilterNode.class, "DiceFilterNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiceFilterNode_InputRatio(), theBasicNFP_TypesPackage.getNFP_Frequency(), "inputRatio", null, 0, 1, DiceFilterNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDiceFilterNode_OutputRation(), theBasicNFP_TypesPackage.getNFP_Frequency(), "outputRation", null, 0, 1, DiceFilterNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(diceVisualizationNodeEClass, DiceVisualizationNode.class, "DiceVisualizationNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(diceSourceNodeEClass, DiceSourceNode.class, "DiceSourceNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDiceSourceNode_Store(), theComplex_Data_TypesPackage_1.getDiceDataVolume(), null, "store", null, 0, 1, DiceSourceNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDiceSourceNode_Provides(), theComplex_Data_TypesPackage_1.getDiceDataSpecification(), null, "provides", null, 0, 1, DiceSourceNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDiceSourceNode_SourceType(), theBasic_Enumeration_TypesPackage_1.getSourceType(), "sourceType", null, 0, 1, DiceSourceNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDiceSourceNode_Rate(), theBasicNFP_TypesPackage.getNFP_Frequency(), "rate", null, 0, 1, DiceSourceNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(diceStorageResourceEClass, DiceStorageResource.class, "DiceStorageResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDiceStorageResource_RespondsTo(), theComplex_Data_TypesPackage_1.getDiceDataSpecification(), null, "respondsTo", null, 0, 1, DiceStorageResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDiceStorageResource_CrudRate(), theBasicNFP_TypesPackage.getNFP_Frequency(), "crudRate", null, 0, 1, DiceStorageResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(diceChannelEClass, DiceChannel.class, "DiceChannel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiceChannel_Rate(), theBasicNFP_TypesPackage.getNFP_Frequency(), "rate", null, 0, 1, DiceChannel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDiceChannel_MessageBroker(), theTypesPackage.getString(), "messageBroker", null, 0, 1, DiceChannel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDiceChannel_ChannelDescription(), theComplex_Data_TypesPackage_1.getDiceChannelSpecification(), null, "channelDescription", null, 0, 1, DiceChannel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
	}

} //DPIMPackageImpl
