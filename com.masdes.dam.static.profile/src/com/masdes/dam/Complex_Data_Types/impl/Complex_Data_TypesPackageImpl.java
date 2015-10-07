/**
 */
package com.masdes.dam.Complex_Data_Types.impl;

import com.masdes.dam.Basic_Data_Types.Basic_Data_TypesPackage;

import com.masdes.dam.Basic_Data_Types.impl.Basic_Data_TypesPackageImpl;

import com.masdes.dam.Basic_Enumeration_Types.Basic_Enumeration_TypesPackage;

import com.masdes.dam.Basic_Enumeration_Types.impl.Basic_Enumeration_TypesPackageImpl;

import com.masdes.dam.Complex_Data_Types.Complex_Data_TypesFactory;
import com.masdes.dam.Complex_Data_Types.Complex_Data_TypesPackage;
import com.masdes.dam.Complex_Data_Types.DaError;
import com.masdes.dam.Complex_Data_Types.DaErrorPropagation;
import com.masdes.dam.Complex_Data_Types.DaFailure;
import com.masdes.dam.Complex_Data_Types.DaFault;
import com.masdes.dam.Complex_Data_Types.DaHazard;
import com.masdes.dam.Complex_Data_Types.DaRec;
import com.masdes.dam.Complex_Data_Types.DaRepair;
import com.masdes.dam.Complex_Data_Types.DaSurvivability;

import com.masdes.dam.Core.CorePackage;

import com.masdes.dam.Core.impl.CorePackageImpl;

import com.masdes.dam.DAM.DAMPackage;

import com.masdes.dam.DAM.impl.DAMPackageImpl;

import com.masdes.dam.Maintenance.MaintenancePackage;

import com.masdes.dam.Maintenance.impl.MaintenancePackageImpl;

import com.masdes.dam.Redundancy.RedundancyPackage;

import com.masdes.dam.Redundancy.impl.RedundancyPackageImpl;

import com.masdes.dam.Threats.ThreatsPackage;

import com.masdes.dam.Threats.impl.ThreatsPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Complex_Data_TypesPackageImpl extends EPackageImpl implements Complex_Data_TypesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass daErrorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass daFaultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass daFailureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass daHazardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass daErrorPropagationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass daRecEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass daRepairEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass daSurvivabilityEClass = null;

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
	 * @see com.masdes.dam.Complex_Data_Types.Complex_Data_TypesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Complex_Data_TypesPackageImpl() {
		super(eNS_URI, Complex_Data_TypesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Complex_Data_TypesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Complex_Data_TypesPackage init() {
		if (isInited) return (Complex_Data_TypesPackage)EPackage.Registry.INSTANCE.getEPackage(Complex_Data_TypesPackage.eNS_URI);

		// Obtain or create and register package
		Complex_Data_TypesPackageImpl theComplex_Data_TypesPackage = (Complex_Data_TypesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Complex_Data_TypesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Complex_Data_TypesPackageImpl());

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
		MaintenancePackageImpl theMaintenancePackage = (MaintenancePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MaintenancePackage.eNS_URI) instanceof MaintenancePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MaintenancePackage.eNS_URI) : MaintenancePackage.eINSTANCE);
		Basic_Data_TypesPackageImpl theBasic_Data_TypesPackage = (Basic_Data_TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Basic_Data_TypesPackage.eNS_URI) instanceof Basic_Data_TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Basic_Data_TypesPackage.eNS_URI) : Basic_Data_TypesPackage.eINSTANCE);
		Basic_Enumeration_TypesPackageImpl theBasic_Enumeration_TypesPackage = (Basic_Enumeration_TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Basic_Enumeration_TypesPackage.eNS_URI) instanceof Basic_Enumeration_TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Basic_Enumeration_TypesPackage.eNS_URI) : Basic_Enumeration_TypesPackage.eINSTANCE);

		// Create package meta-data objects
		theComplex_Data_TypesPackage.createPackageContents();
		theDAMPackage.createPackageContents();
		theCorePackage.createPackageContents();
		theRedundancyPackage.createPackageContents();
		theThreatsPackage.createPackageContents();
		theMaintenancePackage.createPackageContents();
		theBasic_Data_TypesPackage.createPackageContents();
		theBasic_Enumeration_TypesPackage.createPackageContents();

		// Initialize created meta-data
		theComplex_Data_TypesPackage.initializePackageContents();
		theDAMPackage.initializePackageContents();
		theCorePackage.initializePackageContents();
		theRedundancyPackage.initializePackageContents();
		theThreatsPackage.initializePackageContents();
		theMaintenancePackage.initializePackageContents();
		theBasic_Data_TypesPackage.initializePackageContents();
		theBasic_Enumeration_TypesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theComplex_Data_TypesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Complex_Data_TypesPackage.eNS_URI, theComplex_Data_TypesPackage);
		return theComplex_Data_TypesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDaError() {
		return daErrorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDaError_Latency() {
		return (EAttribute)daErrorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDaError_Probability() {
		return (EAttribute)daErrorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDaError_Cause() {
		return (EReference)daErrorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDaError_EffectF() {
		return (EReference)daErrorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDaError_EffectH() {
		return (EReference)daErrorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDaFault() {
		return daFaultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDaFault_OccurrenceRate() {
		return (EAttribute)daFaultEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDaFault_Latency() {
		return (EAttribute)daFaultEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDaFault_OccurrenceProb() {
		return (EAttribute)daFaultEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDaFault_OccurrenceDist() {
		return (EAttribute)daFaultEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDaFault_Persistency() {
		return (EAttribute)daFaultEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDaFault_Duration() {
		return (EAttribute)daFaultEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDaFault_EffectE() {
		return (EReference)daFaultEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDaFault_EffectF() {
		return (EReference)daFaultEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDaFault_EffectH() {
		return (EReference)daFaultEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDaFault_PhaseCreation() {
		return (EAttribute)daFaultEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDaFault_SysBoundaries() {
		return (EAttribute)daFaultEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDaFault_PhenomCause() {
		return (EAttribute)daFaultEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDaFault_Dimension() {
		return (EAttribute)daFaultEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDaFault_Objective() {
		return (EAttribute)daFaultEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDaFault_Intent() {
		return (EAttribute)daFaultEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDaFault_Capability() {
		return (EAttribute)daFaultEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDaFailure() {
		return daFailureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDaFailure_OccurrenceRate() {
		return (EAttribute)daFailureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDaFailure_MTTF() {
		return (EAttribute)daFailureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDaFailure_MTBF() {
		return (EAttribute)daFailureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDaFailure_OccurrenceProb() {
		return (EAttribute)daFailureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDaFailure_OccurrenceDist() {
		return (EAttribute)daFailureEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDaFailure_Domain() {
		return (EAttribute)daFailureEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDaFailure_Consistency() {
		return (EAttribute)daFailureEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDaFailure_Consequence() {
		return (EAttribute)daFailureEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDaFailure_Risk() {
		return (EAttribute)daFailureEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDaFailure_Cost() {
		return (EAttribute)daFailureEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDaFailure_Condition() {
		return (EAttribute)daFailureEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDaFailure_CauseF() {
		return (EReference)daFailureEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDaFailure_CauseE() {
		return (EReference)daFailureEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDaFailure_Description() {
		return (EAttribute)daFailureEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDaFailure_Detectability() {
		return (EAttribute)daFailureEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDaHazard() {
		return daHazardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDaHazard_Origin() {
		return (EAttribute)daHazardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDaHazard_Severity() {
		return (EAttribute)daHazardEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDaHazard_OccurrenceProb() {
		return (EAttribute)daHazardEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDaHazard_Likelihood() {
		return (EAttribute)daHazardEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDaHazard_Level() {
		return (EAttribute)daHazardEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDaHazard_Latency() {
		return (EAttribute)daHazardEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDaHazard_AccidentLikelihood() {
		return (EAttribute)daHazardEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDaHazard_Risk() {
		return (EAttribute)daHazardEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDaHazard_Cost() {
		return (EAttribute)daHazardEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDaHazard_Guideword() {
		return (EAttribute)daHazardEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDaHazard_Accident() {
		return (EAttribute)daHazardEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDaHazard_CauseF() {
		return (EReference)daHazardEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDaHazard_CauseE() {
		return (EReference)daHazardEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDaHazard_Description() {
		return (EAttribute)daHazardEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDaErrorPropagation() {
		return daErrorPropagationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDaErrorPropagation_Probability() {
		return (EAttribute)daErrorPropagationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDaErrorPropagation_From() {
		return (EAttribute)daErrorPropagationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDaErrorPropagation_To() {
		return (EAttribute)daErrorPropagationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDaErrorPropagation_Cause() {
		return (EReference)daErrorPropagationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDaErrorPropagation_Effect() {
		return (EReference)daErrorPropagationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDaRec() {
		return daRecEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDaRec_Rate() {
		return (EAttribute)daRecEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDaRec_Duration() {
		return (EAttribute)daRecEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDaRec_Distribution() {
		return (EAttribute)daRecEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDaRec_CoverageFactor() {
		return (EAttribute)daRecEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDaRepair() {
		return daRepairEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDaRepair_Rate() {
		return (EAttribute)daRepairEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDaRepair_MTTR() {
		return (EAttribute)daRepairEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDaRepair_Distribution() {
		return (EAttribute)daRepairEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDaSurvivability() {
		return daSurvivabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDaSurvivability_Metric() {
		return (EAttribute)daSurvivabilityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDaSurvivability_Value() {
		return (EAttribute)daSurvivabilityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Complex_Data_TypesFactory getComplex_Data_TypesFactory() {
		return (Complex_Data_TypesFactory)getEFactoryInstance();
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
		daErrorEClass = createEClass(DA_ERROR);
		createEAttribute(daErrorEClass, DA_ERROR__LATENCY);
		createEAttribute(daErrorEClass, DA_ERROR__PROBABILITY);
		createEReference(daErrorEClass, DA_ERROR__CAUSE);
		createEReference(daErrorEClass, DA_ERROR__EFFECT_F);
		createEReference(daErrorEClass, DA_ERROR__EFFECT_H);

		daFaultEClass = createEClass(DA_FAULT);
		createEAttribute(daFaultEClass, DA_FAULT__OCCURRENCE_RATE);
		createEAttribute(daFaultEClass, DA_FAULT__LATENCY);
		createEAttribute(daFaultEClass, DA_FAULT__OCCURRENCE_PROB);
		createEAttribute(daFaultEClass, DA_FAULT__OCCURRENCE_DIST);
		createEAttribute(daFaultEClass, DA_FAULT__PERSISTENCY);
		createEAttribute(daFaultEClass, DA_FAULT__DURATION);
		createEReference(daFaultEClass, DA_FAULT__EFFECT_E);
		createEReference(daFaultEClass, DA_FAULT__EFFECT_F);
		createEReference(daFaultEClass, DA_FAULT__EFFECT_H);
		createEAttribute(daFaultEClass, DA_FAULT__PHASE_CREATION);
		createEAttribute(daFaultEClass, DA_FAULT__SYS_BOUNDARIES);
		createEAttribute(daFaultEClass, DA_FAULT__PHENOM_CAUSE);
		createEAttribute(daFaultEClass, DA_FAULT__DIMENSION);
		createEAttribute(daFaultEClass, DA_FAULT__OBJECTIVE);
		createEAttribute(daFaultEClass, DA_FAULT__INTENT);
		createEAttribute(daFaultEClass, DA_FAULT__CAPABILITY);

		daFailureEClass = createEClass(DA_FAILURE);
		createEAttribute(daFailureEClass, DA_FAILURE__OCCURRENCE_RATE);
		createEAttribute(daFailureEClass, DA_FAILURE__MTTF);
		createEAttribute(daFailureEClass, DA_FAILURE__MTBF);
		createEAttribute(daFailureEClass, DA_FAILURE__OCCURRENCE_PROB);
		createEAttribute(daFailureEClass, DA_FAILURE__OCCURRENCE_DIST);
		createEAttribute(daFailureEClass, DA_FAILURE__DOMAIN);
		createEAttribute(daFailureEClass, DA_FAILURE__CONSISTENCY);
		createEAttribute(daFailureEClass, DA_FAILURE__CONSEQUENCE);
		createEAttribute(daFailureEClass, DA_FAILURE__RISK);
		createEAttribute(daFailureEClass, DA_FAILURE__COST);
		createEAttribute(daFailureEClass, DA_FAILURE__CONDITION);
		createEReference(daFailureEClass, DA_FAILURE__CAUSE_F);
		createEReference(daFailureEClass, DA_FAILURE__CAUSE_E);
		createEAttribute(daFailureEClass, DA_FAILURE__DESCRIPTION);
		createEAttribute(daFailureEClass, DA_FAILURE__DETECTABILITY);

		daHazardEClass = createEClass(DA_HAZARD);
		createEAttribute(daHazardEClass, DA_HAZARD__ORIGIN);
		createEAttribute(daHazardEClass, DA_HAZARD__SEVERITY);
		createEAttribute(daHazardEClass, DA_HAZARD__OCCURRENCE_PROB);
		createEAttribute(daHazardEClass, DA_HAZARD__LIKELIHOOD);
		createEAttribute(daHazardEClass, DA_HAZARD__LEVEL);
		createEAttribute(daHazardEClass, DA_HAZARD__LATENCY);
		createEAttribute(daHazardEClass, DA_HAZARD__ACCIDENT_LIKELIHOOD);
		createEAttribute(daHazardEClass, DA_HAZARD__RISK);
		createEAttribute(daHazardEClass, DA_HAZARD__COST);
		createEAttribute(daHazardEClass, DA_HAZARD__GUIDEWORD);
		createEAttribute(daHazardEClass, DA_HAZARD__ACCIDENT);
		createEReference(daHazardEClass, DA_HAZARD__CAUSE_F);
		createEReference(daHazardEClass, DA_HAZARD__CAUSE_E);
		createEAttribute(daHazardEClass, DA_HAZARD__DESCRIPTION);

		daErrorPropagationEClass = createEClass(DA_ERROR_PROPAGATION);
		createEAttribute(daErrorPropagationEClass, DA_ERROR_PROPAGATION__PROBABILITY);
		createEAttribute(daErrorPropagationEClass, DA_ERROR_PROPAGATION__FROM);
		createEAttribute(daErrorPropagationEClass, DA_ERROR_PROPAGATION__TO);
		createEReference(daErrorPropagationEClass, DA_ERROR_PROPAGATION__CAUSE);
		createEReference(daErrorPropagationEClass, DA_ERROR_PROPAGATION__EFFECT);

		daRecEClass = createEClass(DA_REC);
		createEAttribute(daRecEClass, DA_REC__RATE);
		createEAttribute(daRecEClass, DA_REC__DURATION);
		createEAttribute(daRecEClass, DA_REC__DISTRIBUTION);
		createEAttribute(daRecEClass, DA_REC__COVERAGE_FACTOR);

		daRepairEClass = createEClass(DA_REPAIR);
		createEAttribute(daRepairEClass, DA_REPAIR__RATE);
		createEAttribute(daRepairEClass, DA_REPAIR__MTTR);
		createEAttribute(daRepairEClass, DA_REPAIR__DISTRIBUTION);

		daSurvivabilityEClass = createEClass(DA_SURVIVABILITY);
		createEAttribute(daSurvivabilityEClass, DA_SURVIVABILITY__METRIC);
		createEAttribute(daSurvivabilityEClass, DA_SURVIVABILITY__VALUE);
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
		BasicNFP_TypesPackage theBasicNFP_TypesPackage = (BasicNFP_TypesPackage)EPackage.Registry.INSTANCE.getEPackage(BasicNFP_TypesPackage.eNS_URI);
		Basic_Data_TypesPackage theBasic_Data_TypesPackage = (Basic_Data_TypesPackage)EPackage.Registry.INSTANCE.getEPackage(Basic_Data_TypesPackage.eNS_URI);
		Basic_Enumeration_TypesPackage theBasic_Enumeration_TypesPackage = (Basic_Enumeration_TypesPackage)EPackage.Registry.INSTANCE.getEPackage(Basic_Enumeration_TypesPackage.eNS_URI);
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(daErrorEClass, DaError.class, "DaError", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDaError_Latency(), theBasicNFP_TypesPackage.getNFP_Duration(), "latency", null, 0, -1, DaError.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDaError_Probability(), theBasicNFP_TypesPackage.getNFP_Real(), "probability", null, 0, -1, DaError.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDaError_Cause(), this.getDaFault(), null, "cause", null, 0, -1, DaError.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDaError_EffectF(), this.getDaFailure(), null, "effectF", null, 0, -1, DaError.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDaError_EffectH(), this.getDaHazard(), null, "effectH", null, 0, -1, DaError.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(daFaultEClass, DaFault.class, "DaFault", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDaFault_OccurrenceRate(), theBasic_Data_TypesPackage.getDaFrequency(), "occurrenceRate", null, 0, -1, DaFault.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDaFault_Latency(), theBasicNFP_TypesPackage.getNFP_Duration(), "latency", null, 0, -1, DaFault.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDaFault_OccurrenceProb(), theBasicNFP_TypesPackage.getNFP_Real(), "occurrenceProb", null, 0, -1, DaFault.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDaFault_OccurrenceDist(), theBasicNFP_TypesPackage.getNFP_CommonType(), "occurrenceDist", null, 0, -1, DaFault.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDaFault_Persistency(), theBasic_Enumeration_TypesPackage.getPersistency(), "persistency", null, 0, 1, DaFault.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDaFault_Duration(), theBasicNFP_TypesPackage.getNFP_Duration(), "duration", null, 0, -1, DaFault.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDaFault_EffectE(), this.getDaError(), null, "effectE", null, 0, -1, DaFault.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDaFault_EffectF(), this.getDaFailure(), null, "effectF", null, 0, -1, DaFault.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDaFault_EffectH(), this.getDaHazard(), null, "effectH", null, 0, -1, DaFault.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDaFault_PhaseCreation(), theBasic_Enumeration_TypesPackage.getPhaseCreation(), "phaseCreation", null, 0, -1, DaFault.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDaFault_SysBoundaries(), theBasic_Enumeration_TypesPackage.getSysBoundaries(), "sysBoundaries", null, 0, -1, DaFault.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDaFault_PhenomCause(), theBasic_Enumeration_TypesPackage.getPhenomCause(), "phenomCause", null, 0, -1, DaFault.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDaFault_Dimension(), theBasic_Enumeration_TypesPackage.getOrigin(), "dimension", null, 0, -1, DaFault.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDaFault_Objective(), theBasic_Enumeration_TypesPackage.getObjective(), "objective", null, 0, -1, DaFault.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDaFault_Intent(), theBasic_Enumeration_TypesPackage.getIntent(), "intent", null, 0, -1, DaFault.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDaFault_Capability(), theBasic_Enumeration_TypesPackage.getCapability(), "capability", null, 0, -1, DaFault.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(daFailureEClass, DaFailure.class, "DaFailure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDaFailure_OccurrenceRate(), theBasic_Data_TypesPackage.getDaFrequency(), "occurrenceRate", null, 0, -1, DaFailure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDaFailure_MTTF(), theBasicNFP_TypesPackage.getNFP_Duration(), "MTTF", null, 0, -1, DaFailure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDaFailure_MTBF(), theBasicNFP_TypesPackage.getNFP_Duration(), "MTBF", null, 0, -1, DaFailure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDaFailure_OccurrenceProb(), theBasicNFP_TypesPackage.getNFP_Real(), "occurrenceProb", null, 0, -1, DaFailure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDaFailure_OccurrenceDist(), theBasicNFP_TypesPackage.getNFP_CommonType(), "occurrenceDist", null, 0, -1, DaFailure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDaFailure_Domain(), theBasic_Enumeration_TypesPackage.getDomain(), "domain", null, 0, 1, DaFailure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDaFailure_Consistency(), theBasic_Enumeration_TypesPackage.getConsistency(), "consistency", null, 0, 1, DaFailure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDaFailure_Consequence(), theBasic_Data_TypesPackage.getDaCriticalLevel(), "consequence", null, 0, -1, DaFailure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDaFailure_Risk(), theBasicNFP_TypesPackage.getNFP_Real(), "risk", null, 0, -1, DaFailure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDaFailure_Cost(), theBasic_Data_TypesPackage.getDaCurrency(), "cost", null, 0, -1, DaFailure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDaFailure_Condition(), theTypesPackage.getString(), "condition", null, 0, 1, DaFailure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDaFailure_CauseF(), this.getDaFault(), null, "causeF", null, 0, -1, DaFailure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDaFailure_CauseE(), this.getDaError(), null, "causeE", null, 0, -1, DaFailure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDaFailure_Description(), theTypesPackage.getString(), "description", null, 0, 1, DaFailure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDaFailure_Detectability(), theBasic_Enumeration_TypesPackage.getDetectabillity(), "detectability", null, 0, 1, DaFailure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(daHazardEClass, DaHazard.class, "DaHazard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDaHazard_Origin(), theBasic_Enumeration_TypesPackage.getFactorOrigin(), "origin", null, 0, 1, DaHazard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDaHazard_Severity(), theBasic_Data_TypesPackage.getDaCriticalLevel(), "severity", null, 0, -1, DaHazard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDaHazard_OccurrenceProb(), theBasicNFP_TypesPackage.getNFP_Real(), "occurrenceProb", null, 0, -1, DaHazard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDaHazard_Likelihood(), theBasic_Data_TypesPackage.getDaLikelihood(), "likelihood", null, 0, -1, DaHazard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDaHazard_Level(), theBasicNFP_TypesPackage.getNFP_Real(), "level", null, 0, -1, DaHazard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDaHazard_Latency(), theBasicNFP_TypesPackage.getNFP_Duration(), "latency", null, 0, -1, DaHazard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDaHazard_AccidentLikelihood(), theBasic_Data_TypesPackage.getDaLikelihood(), "accidentLikelihood", null, 0, -1, DaHazard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDaHazard_Risk(), theBasicNFP_TypesPackage.getNFP_Real(), "risk", null, 0, -1, DaHazard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDaHazard_Cost(), theBasic_Data_TypesPackage.getDaCurrency(), "cost", null, 0, -1, DaHazard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDaHazard_Guideword(), theBasic_Enumeration_TypesPackage.getGuideword(), "guideword", null, 0, 1, DaHazard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDaHazard_Accident(), theTypesPackage.getString(), "accident", null, 0, 1, DaHazard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDaHazard_CauseF(), this.getDaFault(), null, "causeF", null, 0, -1, DaHazard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDaHazard_CauseE(), this.getDaError(), null, "causeE", null, 0, -1, DaHazard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDaHazard_Description(), theTypesPackage.getString(), "description", null, 0, 1, DaHazard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(daErrorPropagationEClass, DaErrorPropagation.class, "DaErrorPropagation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDaErrorPropagation_Probability(), theBasicNFP_TypesPackage.getNFP_Real(), "probability", null, 0, -1, DaErrorPropagation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDaErrorPropagation_From(), theTypesPackage.getString(), "from", null, 0, 1, DaErrorPropagation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDaErrorPropagation_To(), theTypesPackage.getString(), "to", null, 0, 1, DaErrorPropagation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDaErrorPropagation_Cause(), this.getDaFailure(), null, "cause", null, 0, 1, DaErrorPropagation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDaErrorPropagation_Effect(), this.getDaError(), null, "effect", null, 0, 1, DaErrorPropagation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(daRecEClass, DaRec.class, "DaRec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDaRec_Rate(), theBasic_Data_TypesPackage.getDaFrequency(), "rate", null, 0, -1, DaRec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDaRec_Duration(), theBasicNFP_TypesPackage.getNFP_Duration(), "duration", null, 0, -1, DaRec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDaRec_Distribution(), theBasicNFP_TypesPackage.getNFP_CommonType(), "distribution", null, 0, -1, DaRec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDaRec_CoverageFactor(), theBasicNFP_TypesPackage.getNFP_Real(), "coverageFactor", null, 0, -1, DaRec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(daRepairEClass, DaRepair.class, "DaRepair", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDaRepair_Rate(), theBasic_Data_TypesPackage.getDaFrequency(), "rate", null, 0, -1, DaRepair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDaRepair_MTTR(), theBasicNFP_TypesPackage.getNFP_Duration(), "MTTR", null, 0, -1, DaRepair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDaRepair_Distribution(), theBasicNFP_TypesPackage.getNFP_CommonType(), "distribution", null, 0, -1, DaRepair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(daSurvivabilityEClass, DaSurvivability.class, "DaSurvivability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDaSurvivability_Metric(), theBasic_Enumeration_TypesPackage.getMetricName(), "metric", null, 1, 1, DaSurvivability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDaSurvivability_Value(), theBasicNFP_TypesPackage.getNFP_CommonType(), "value", null, 0, -1, DaSurvivability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/uml2/2.0.0/UML
		createUMLAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/uml2/2.0.0/UML</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUMLAnnotations() {
		String source = "http://www.eclipse.org/uml2/2.0.0/UML";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "originalName", "Data_Types"
		   });
	}

} //Complex_Data_TypesPackageImpl
