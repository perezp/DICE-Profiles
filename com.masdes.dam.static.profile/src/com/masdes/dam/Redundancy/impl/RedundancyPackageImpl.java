/**
 */
package com.masdes.dam.Redundancy.impl;

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

import com.masdes.dam.Maintenance.MaintenancePackage;

import com.masdes.dam.Maintenance.impl.MaintenancePackageImpl;

import com.masdes.dam.Redundancy.DaAdjudicator;
import com.masdes.dam.Redundancy.DaController;
import com.masdes.dam.Redundancy.DaRedundantStructure;
import com.masdes.dam.Redundancy.DaSpare;
import com.masdes.dam.Redundancy.DaVariant;
import com.masdes.dam.Redundancy.RedundancyFactory;
import com.masdes.dam.Redundancy.RedundancyPackage;

import com.masdes.dam.Redundancy.util.RedundancyValidator;

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

import org.eclipse.uml2.types.TypesPackage;

import org.eclipse.uml2.uml.UMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RedundancyPackageImpl extends EPackageImpl implements RedundancyPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass daControllerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass daVariantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass daAdjudicatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass daRedundantStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass daSpareEClass = null;

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
	 * @see com.masdes.dam.Redundancy.RedundancyPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RedundancyPackageImpl() {
		super(eNS_URI, RedundancyFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link RedundancyPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RedundancyPackage init() {
		if (isInited) return (RedundancyPackage)EPackage.Registry.INSTANCE.getEPackage(RedundancyPackage.eNS_URI);

		// Obtain or create and register package
		RedundancyPackageImpl theRedundancyPackage = (RedundancyPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RedundancyPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RedundancyPackageImpl());

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
		ThreatsPackageImpl theThreatsPackage = (ThreatsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ThreatsPackage.eNS_URI) instanceof ThreatsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ThreatsPackage.eNS_URI) : ThreatsPackage.eINSTANCE);
		MaintenancePackageImpl theMaintenancePackage = (MaintenancePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MaintenancePackage.eNS_URI) instanceof MaintenancePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MaintenancePackage.eNS_URI) : MaintenancePackage.eINSTANCE);
		Complex_Data_TypesPackageImpl theComplex_Data_TypesPackage = (Complex_Data_TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Complex_Data_TypesPackage.eNS_URI) instanceof Complex_Data_TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Complex_Data_TypesPackage.eNS_URI) : Complex_Data_TypesPackage.eINSTANCE);
		Basic_Data_TypesPackageImpl theBasic_Data_TypesPackage = (Basic_Data_TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Basic_Data_TypesPackage.eNS_URI) instanceof Basic_Data_TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Basic_Data_TypesPackage.eNS_URI) : Basic_Data_TypesPackage.eINSTANCE);
		Basic_Enumeration_TypesPackageImpl theBasic_Enumeration_TypesPackage = (Basic_Enumeration_TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Basic_Enumeration_TypesPackage.eNS_URI) instanceof Basic_Enumeration_TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Basic_Enumeration_TypesPackage.eNS_URI) : Basic_Enumeration_TypesPackage.eINSTANCE);

		// Create package meta-data objects
		theRedundancyPackage.createPackageContents();
		theDAMPackage.createPackageContents();
		theCorePackage.createPackageContents();
		theThreatsPackage.createPackageContents();
		theMaintenancePackage.createPackageContents();
		theComplex_Data_TypesPackage.createPackageContents();
		theBasic_Data_TypesPackage.createPackageContents();
		theBasic_Enumeration_TypesPackage.createPackageContents();

		// Initialize created meta-data
		theRedundancyPackage.initializePackageContents();
		theDAMPackage.initializePackageContents();
		theCorePackage.initializePackageContents();
		theThreatsPackage.initializePackageContents();
		theMaintenancePackage.initializePackageContents();
		theComplex_Data_TypesPackage.initializePackageContents();
		theBasic_Data_TypesPackage.initializePackageContents();
		theBasic_Enumeration_TypesPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theRedundancyPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return RedundancyValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theRedundancyPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RedundancyPackage.eNS_URI, theRedundancyPackage);
		return theRedundancyPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDaController() {
		return daControllerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDaVariant() {
		return daVariantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDaAdjudicator() {
		return daAdjudicatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDaAdjudicator_ErrorDetecCoverage() {
		return (EAttribute)daAdjudicatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDaRedundantStructure() {
		return daRedundantStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDaRedundantStructure_CommonModeFailure() {
		return (EReference)daRedundantStructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDaRedundantStructure_CommonModeHazard() {
		return (EReference)daRedundantStructureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDaRedundantStructure_FTlevel() {
		return (EAttribute)daRedundantStructureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDaRedundantStructure_Base_Package() {
		return (EReference)daRedundantStructureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDaSpare() {
		return daSpareEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDaSpare_DormancyFactor() {
		return (EAttribute)daSpareEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDaSpare_SubstituteFor() {
		return (EReference)daSpareEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RedundancyFactory getRedundancyFactory() {
		return (RedundancyFactory)getEFactoryInstance();
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
		daControllerEClass = createEClass(DA_CONTROLLER);

		daVariantEClass = createEClass(DA_VARIANT);

		daAdjudicatorEClass = createEClass(DA_ADJUDICATOR);
		createEAttribute(daAdjudicatorEClass, DA_ADJUDICATOR__ERROR_DETEC_COVERAGE);

		daRedundantStructureEClass = createEClass(DA_REDUNDANT_STRUCTURE);
		createEReference(daRedundantStructureEClass, DA_REDUNDANT_STRUCTURE__COMMON_MODE_FAILURE);
		createEReference(daRedundantStructureEClass, DA_REDUNDANT_STRUCTURE__COMMON_MODE_HAZARD);
		createEAttribute(daRedundantStructureEClass, DA_REDUNDANT_STRUCTURE__FTLEVEL);
		createEReference(daRedundantStructureEClass, DA_REDUNDANT_STRUCTURE__BASE_PACKAGE);

		daSpareEClass = createEClass(DA_SPARE);
		createEAttribute(daSpareEClass, DA_SPARE__DORMANCY_FACTOR);
		createEReference(daSpareEClass, DA_SPARE__SUBSTITUTE_FOR);
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
		Complex_Data_TypesPackage theComplex_Data_TypesPackage = (Complex_Data_TypesPackage)EPackage.Registry.INSTANCE.getEPackage(Complex_Data_TypesPackage.eNS_URI);
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);
		UMLPackage theUMLPackage = (UMLPackage)EPackage.Registry.INSTANCE.getEPackage(UMLPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		daControllerEClass.getESuperTypes().add(theCorePackage.getDaComponent());
		daVariantEClass.getESuperTypes().add(theCorePackage.getDaComponent());
		daAdjudicatorEClass.getESuperTypes().add(theCorePackage.getDaComponent());
		daSpareEClass.getESuperTypes().add(theCorePackage.getDaComponent());

		// Initialize classes and features; add operations and parameters
		initEClass(daControllerEClass, DaController.class, "DaController", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(daVariantEClass, DaVariant.class, "DaVariant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(daAdjudicatorEClass, DaAdjudicator.class, "DaAdjudicator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDaAdjudicator_ErrorDetecCoverage(), theBasicNFP_TypesPackage.getNFP_Percentage(), "errorDetecCoverage", null, 0, -1, DaAdjudicator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(daRedundantStructureEClass, DaRedundantStructure.class, "DaRedundantStructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDaRedundantStructure_CommonModeFailure(), theComplex_Data_TypesPackage.getDaFailure(), null, "commonModeFailure", null, 0, -1, DaRedundantStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDaRedundantStructure_CommonModeHazard(), theComplex_Data_TypesPackage.getDaHazard(), null, "commonModeHazard", null, 0, -1, DaRedundantStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDaRedundantStructure_FTlevel(), theTypesPackage.getInteger(), "FTlevel", "0", 1, 1, DaRedundantStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDaRedundantStructure_Base_Package(), theUMLPackage.getPackage(), null, "base_Package", null, 1, 1, DaRedundantStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		EOperation op = addEOperation(daRedundantStructureEClass, ecorePackage.getEBoolean(), "packageSize", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(daSpareEClass, DaSpare.class, "DaSpare", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDaSpare_DormancyFactor(), theBasicNFP_TypesPackage.getNFP_Real(), "dormancyFactor", null, 0, -1, DaSpare.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDaSpare_SubstituteFor(), theCorePackage.getDaComponent(), null, "substituteFor", null, 0, -1, DaSpare.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = addEOperation(daSpareEClass, ecorePackage.getEBoolean(), "excludeSelfElement", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);
	}

} //RedundancyPackageImpl
