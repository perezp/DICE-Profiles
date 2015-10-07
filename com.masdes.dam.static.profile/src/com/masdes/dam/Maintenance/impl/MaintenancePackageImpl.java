/**
 */
package com.masdes.dam.Maintenance.impl;

import com.masdes.dam.Basic_Data_Types.Basic_Data_TypesPackage;

import com.masdes.dam.Basic_Data_Types.impl.Basic_Data_TypesPackageImpl;

import com.masdes.dam.Basic_Enumeration_Types.Basic_Enumeration_TypesPackage;

import com.masdes.dam.Basic_Enumeration_Types.impl.Basic_Enumeration_TypesPackageImpl;

import com.masdes.dam.Complex_Data_Types.Complex_Data_TypesPackage;

import com.masdes.dam.Complex_Data_Types.impl.Complex_Data_TypesPackageImpl;

import com.masdes.dam.Core.CorePackage;

import com.masdes.dam.Core.impl.CorePackageImpl;

import com.masdes.dam.DAM.DAMPackage;

import com.masdes.dam.DAM.impl.DAMPackageImpl;

import com.masdes.dam.Maintenance.DaActivationStep;
import com.masdes.dam.Maintenance.DaAgentGroup;
import com.masdes.dam.Maintenance.DaReallocationStep;
import com.masdes.dam.Maintenance.DaReplacementStep;
import com.masdes.dam.Maintenance.MaintenanceFactory;
import com.masdes.dam.Maintenance.MaintenancePackage;

import com.masdes.dam.Maintenance.util.MaintenanceValidator;

import com.masdes.dam.Redundancy.RedundancyPackage;

import com.masdes.dam.Redundancy.impl.RedundancyPackageImpl;

import com.masdes.dam.Threats.ThreatsPackage;

import com.masdes.dam.Threats.impl.ThreatsPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.papyrus.MARTE.MARTEPackage;

import org.eclipse.papyrus.MARTE_Library.BasicNFP_Types.BasicNFP_TypesPackage;

import org.eclipse.papyrus.MARTE_Library.GRM_BasicTypes.GRM_BasicTypesPackage;

import org.eclipse.papyrus.MARTE_Library.MARTE_DataTypes.MARTE_DataTypesPackage;

import org.eclipse.papyrus.MARTE_Library.MARTE_PrimitivesTypes.MARTE_PrimitivesTypesPackage;

import org.eclipse.papyrus.MARTE_Library.MeasurementUnits.MeasurementUnitsPackage;

import org.eclipse.papyrus.MARTE_Library.RS_Library.RS_LibraryPackage;

import org.eclipse.papyrus.MARTE_Library.TimeLibrary.TimeLibraryPackage;

import org.eclipse.papyrus.MARTE_Library.TimeTypesLibrary.TimeTypesLibraryPackage;

import org.eclipse.uml2.uml.UMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MaintenancePackageImpl extends EPackageImpl implements MaintenancePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass daReplacementStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass daReallocationStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass daActivationStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass daAgentGroupEClass = null;

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
	 * @see com.masdes.dam.Maintenance.MaintenancePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MaintenancePackageImpl() {
		super(eNS_URI, MaintenanceFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link MaintenancePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MaintenancePackage init() {
		if (isInited) return (MaintenancePackage)EPackage.Registry.INSTANCE.getEPackage(MaintenancePackage.eNS_URI);

		// Obtain or create and register package
		MaintenancePackageImpl theMaintenancePackage = (MaintenancePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MaintenancePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MaintenancePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		MARTEPackage.eINSTANCE.eClass();
		MeasurementUnitsPackage.eINSTANCE.eClass();
		GRM_BasicTypesPackage.eINSTANCE.eClass();
		MARTE_DataTypesPackage.eINSTANCE.eClass();
		BasicNFP_TypesPackage.eINSTANCE.eClass();
		TimeTypesLibraryPackage.eINSTANCE.eClass();
		TimeLibraryPackage.eINSTANCE.eClass();
		RS_LibraryPackage.eINSTANCE.eClass();
		MARTE_PrimitivesTypesPackage.eINSTANCE.eClass();
		BasicNFP_TypesPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		DAMPackageImpl theDAMPackage = (DAMPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DAMPackage.eNS_URI) instanceof DAMPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DAMPackage.eNS_URI) : DAMPackage.eINSTANCE);
		CorePackageImpl theCorePackage = (CorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) instanceof CorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) : CorePackage.eINSTANCE);
		RedundancyPackageImpl theRedundancyPackage = (RedundancyPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RedundancyPackage.eNS_URI) instanceof RedundancyPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RedundancyPackage.eNS_URI) : RedundancyPackage.eINSTANCE);
		ThreatsPackageImpl theThreatsPackage = (ThreatsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ThreatsPackage.eNS_URI) instanceof ThreatsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ThreatsPackage.eNS_URI) : ThreatsPackage.eINSTANCE);
		Complex_Data_TypesPackageImpl theComplex_Data_TypesPackage = (Complex_Data_TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Complex_Data_TypesPackage.eNS_URI) instanceof Complex_Data_TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Complex_Data_TypesPackage.eNS_URI) : Complex_Data_TypesPackage.eINSTANCE);
		Basic_Data_TypesPackageImpl theBasic_Data_TypesPackage = (Basic_Data_TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Basic_Data_TypesPackage.eNS_URI) instanceof Basic_Data_TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Basic_Data_TypesPackage.eNS_URI) : Basic_Data_TypesPackage.eINSTANCE);
		Basic_Enumeration_TypesPackageImpl theBasic_Enumeration_TypesPackage = (Basic_Enumeration_TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Basic_Enumeration_TypesPackage.eNS_URI) instanceof Basic_Enumeration_TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Basic_Enumeration_TypesPackage.eNS_URI) : Basic_Enumeration_TypesPackage.eINSTANCE);

		// Create package meta-data objects
		theMaintenancePackage.createPackageContents();
		theDAMPackage.createPackageContents();
		theCorePackage.createPackageContents();
		theRedundancyPackage.createPackageContents();
		theThreatsPackage.createPackageContents();
		theComplex_Data_TypesPackage.createPackageContents();
		theBasic_Data_TypesPackage.createPackageContents();
		theBasic_Enumeration_TypesPackage.createPackageContents();

		// Initialize created meta-data
		theMaintenancePackage.initializePackageContents();
		theDAMPackage.initializePackageContents();
		theCorePackage.initializePackageContents();
		theRedundancyPackage.initializePackageContents();
		theThreatsPackage.initializePackageContents();
		theComplex_Data_TypesPackage.initializePackageContents();
		theBasic_Data_TypesPackage.initializePackageContents();
		theBasic_Enumeration_TypesPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theMaintenancePackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return MaintenanceValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theMaintenancePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MaintenancePackage.eNS_URI, theMaintenancePackage);
		return theMaintenancePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDaReplacementStep() {
		return daReplacementStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDaReplacementStep_KindRepS() {
		return (EAttribute)daReplacementStepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDaReplacementStep_Replace() {
		return (EReference)daReplacementStepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDaReplacementStep_With() {
		return (EReference)daReplacementStepEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDaReallocationStep() {
		return daReallocationStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDaReallocationStep_KindRealS() {
		return (EAttribute)daReallocationStepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDaReallocationStep_Map() {
		return (EReference)daReallocationStepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDaReallocationStep_To() {
		return (EReference)daReallocationStepEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDaActivationStep() {
		return daActivationStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDaActivationStep_KindActS() {
		return (EAttribute)daActivationStepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDaActivationStep_Prio() {
		return (EAttribute)daActivationStepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDaActivationStep_Preemption() {
		return (EAttribute)daActivationStepEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDaActivationStep_FailCause() {
		return (EReference)daActivationStepEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDaActivationStep_Agents() {
		return (EReference)daActivationStepEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDaAgentGroup() {
		return daAgentGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDaAgentGroup_Skill() {
		return (EAttribute)daAgentGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDaAgentGroup_Correctness() {
		return (EAttribute)daAgentGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDaAgentGroup_AgentNumber() {
		return (EAttribute)daAgentGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDaAgentGroup_Base_Classifier() {
		return (EReference)daAgentGroupEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaintenanceFactory getMaintenanceFactory() {
		return (MaintenanceFactory)getEFactoryInstance();
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
		daReplacementStepEClass = createEClass(DA_REPLACEMENT_STEP);
		createEAttribute(daReplacementStepEClass, DA_REPLACEMENT_STEP__KIND_REP_S);
		createEReference(daReplacementStepEClass, DA_REPLACEMENT_STEP__REPLACE);
		createEReference(daReplacementStepEClass, DA_REPLACEMENT_STEP__WITH);

		daReallocationStepEClass = createEClass(DA_REALLOCATION_STEP);
		createEAttribute(daReallocationStepEClass, DA_REALLOCATION_STEP__KIND_REAL_S);
		createEReference(daReallocationStepEClass, DA_REALLOCATION_STEP__MAP);
		createEReference(daReallocationStepEClass, DA_REALLOCATION_STEP__TO);

		daActivationStepEClass = createEClass(DA_ACTIVATION_STEP);
		createEAttribute(daActivationStepEClass, DA_ACTIVATION_STEP__KIND_ACT_S);
		createEAttribute(daActivationStepEClass, DA_ACTIVATION_STEP__PRIO);
		createEAttribute(daActivationStepEClass, DA_ACTIVATION_STEP__PREEMPTION);
		createEReference(daActivationStepEClass, DA_ACTIVATION_STEP__FAIL_CAUSE);
		createEReference(daActivationStepEClass, DA_ACTIVATION_STEP__AGENTS);

		daAgentGroupEClass = createEClass(DA_AGENT_GROUP);
		createEAttribute(daAgentGroupEClass, DA_AGENT_GROUP__SKILL);
		createEAttribute(daAgentGroupEClass, DA_AGENT_GROUP__CORRECTNESS);
		createEAttribute(daAgentGroupEClass, DA_AGENT_GROUP__AGENT_NUMBER);
		createEReference(daAgentGroupEClass, DA_AGENT_GROUP__BASE_CLASSIFIER);
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
		Basic_Enumeration_TypesPackage theBasic_Enumeration_TypesPackage = (Basic_Enumeration_TypesPackage)EPackage.Registry.INSTANCE.getEPackage(Basic_Enumeration_TypesPackage.eNS_URI);
		RedundancyPackage theRedundancyPackage = (RedundancyPackage)EPackage.Registry.INSTANCE.getEPackage(RedundancyPackage.eNS_URI);
		BasicNFP_TypesPackage theBasicNFP_TypesPackage = (BasicNFP_TypesPackage)EPackage.Registry.INSTANCE.getEPackage(BasicNFP_TypesPackage.eNS_URI);
		UMLPackage theUMLPackage = (UMLPackage)EPackage.Registry.INSTANCE.getEPackage(UMLPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		daReplacementStepEClass.getESuperTypes().add(theCorePackage.getDaStep());
		daReallocationStepEClass.getESuperTypes().add(theCorePackage.getDaStep());
		daActivationStepEClass.getESuperTypes().add(theCorePackage.getDaStep());

		// Initialize classes and features; add operations and parameters
		initEClass(daReplacementStepEClass, DaReplacementStep.class, "DaReplacementStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDaReplacementStep_KindRepS(), theBasic_Enumeration_TypesPackage.getStepKind(), "kindRepS", "replacement", 1, 1, DaReplacementStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDaReplacementStep_Replace(), theCorePackage.getDaComponent(), null, "replace", null, 0, -1, DaReplacementStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDaReplacementStep_With(), theRedundancyPackage.getDaSpare(), null, "with", null, 0, -1, DaReplacementStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(daReplacementStepEClass, ecorePackage.getEBoolean(), "replaceSize", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(daReallocationStepEClass, DaReallocationStep.class, "DaReallocationStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDaReallocationStep_KindRealS(), theBasic_Enumeration_TypesPackage.getStepKind(), "kindRealS", "reallocation", 1, 1, DaReallocationStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDaReallocationStep_Map(), theCorePackage.getDaComponent(), null, "map", null, 0, -1, DaReallocationStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDaReallocationStep_To(), theRedundancyPackage.getDaSpare(), null, "to", null, 0, -1, DaReallocationStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(daReallocationStepEClass, ecorePackage.getEBoolean(), "mapSize", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(daActivationStepEClass, DaActivationStep.class, "DaActivationStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDaActivationStep_KindActS(), theBasic_Enumeration_TypesPackage.getStepKind(), "kindActS", "activation", 1, 1, DaActivationStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDaActivationStep_Prio(), theBasicNFP_TypesPackage.getNFP_Integer(), "prio", null, 0, 1, DaActivationStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDaActivationStep_Preemption(), theBasicNFP_TypesPackage.getNFP_Boolean(), "preemption", null, 0, 1, DaActivationStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDaActivationStep_FailCause(), theCorePackage.getDaStep(), null, "failCause", null, 0, -1, DaActivationStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDaActivationStep_Agents(), this.getDaAgentGroup(), null, "agents", null, 0, -1, DaActivationStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(daAgentGroupEClass, DaAgentGroup.class, "DaAgentGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDaAgentGroup_Skill(), theBasic_Enumeration_TypesPackage.getSkillType(), "skill", "hwTechnician", 1, 1, DaAgentGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDaAgentGroup_Correctness(), theBasicNFP_TypesPackage.getNFP_Real(), "correctness", null, 0, -1, DaAgentGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDaAgentGroup_AgentNumber(), theBasicNFP_TypesPackage.getNFP_Integer(), "agentNumber", null, 0, -1, DaAgentGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDaAgentGroup_Base_Classifier(), theUMLPackage.getClassifier(), null, "base_Classifier", null, 1, 1, DaAgentGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
	}

} //MaintenancePackageImpl
