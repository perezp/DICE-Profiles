/**
 */
package com.masdes.dam.Core.impl;

import com.masdes.dam.Basic_Data_Types.Basic_Data_TypesPackage;

import com.masdes.dam.Basic_Data_Types.impl.Basic_Data_TypesPackageImpl;

import com.masdes.dam.Basic_Enumeration_Types.Basic_Enumeration_TypesPackage;

import com.masdes.dam.Basic_Enumeration_Types.impl.Basic_Enumeration_TypesPackageImpl;

import com.masdes.dam.Complex_Data_Types.Complex_Data_TypesPackage;

import com.masdes.dam.Complex_Data_Types.impl.Complex_Data_TypesPackageImpl;

import com.masdes.dam.Core.CoreFactory;
import com.masdes.dam.Core.CorePackage;
import com.masdes.dam.Core.DaChange;
import com.masdes.dam.Core.DaComponent;
import com.masdes.dam.Core.DaConnector;
import com.masdes.dam.Core.DaRecognition;
import com.masdes.dam.Core.DaRecovery;
import com.masdes.dam.Core.DaResistance;
import com.masdes.dam.Core.DaService;
import com.masdes.dam.Core.DaServiceMode;
import com.masdes.dam.Core.DaServiceRequest;
import com.masdes.dam.Core.DaStep;

import com.masdes.dam.Core.util.CoreValidator;

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
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.papyrus.MARTE.MARTEPackage;

import org.eclipse.papyrus.MARTE.MARTE_AnalysisModel.GQAM.GQAMPackage;

import org.eclipse.papyrus.MARTE.MARTE_Foundations.GRM.GRMPackage;

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
public class CorePackageImpl extends EPackageImpl implements CorePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass daComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass daServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass daStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass daResistanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass daRecognitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass daRecoveryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass daServiceModeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass daServiceRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass daConnectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass daChangeEClass = null;

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
	 * @see com.masdes.dam.Core.CorePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CorePackageImpl() {
		super(eNS_URI, CoreFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CorePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CorePackage init() {
		if (isInited) return (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);

		// Obtain or create and register package
		CorePackageImpl theCorePackage = (CorePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CorePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CorePackageImpl());

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
		RedundancyPackageImpl theRedundancyPackage = (RedundancyPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RedundancyPackage.eNS_URI) instanceof RedundancyPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RedundancyPackage.eNS_URI) : RedundancyPackage.eINSTANCE);
		ThreatsPackageImpl theThreatsPackage = (ThreatsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ThreatsPackage.eNS_URI) instanceof ThreatsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ThreatsPackage.eNS_URI) : ThreatsPackage.eINSTANCE);
		MaintenancePackageImpl theMaintenancePackage = (MaintenancePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MaintenancePackage.eNS_URI) instanceof MaintenancePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MaintenancePackage.eNS_URI) : MaintenancePackage.eINSTANCE);
		Complex_Data_TypesPackageImpl theComplex_Data_TypesPackage = (Complex_Data_TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Complex_Data_TypesPackage.eNS_URI) instanceof Complex_Data_TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Complex_Data_TypesPackage.eNS_URI) : Complex_Data_TypesPackage.eINSTANCE);
		Basic_Data_TypesPackageImpl theBasic_Data_TypesPackage = (Basic_Data_TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Basic_Data_TypesPackage.eNS_URI) instanceof Basic_Data_TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Basic_Data_TypesPackage.eNS_URI) : Basic_Data_TypesPackage.eINSTANCE);
		Basic_Enumeration_TypesPackageImpl theBasic_Enumeration_TypesPackage = (Basic_Enumeration_TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Basic_Enumeration_TypesPackage.eNS_URI) instanceof Basic_Enumeration_TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Basic_Enumeration_TypesPackage.eNS_URI) : Basic_Enumeration_TypesPackage.eINSTANCE);

		// Create package meta-data objects
		theCorePackage.createPackageContents();
		theDAMPackage.createPackageContents();
		theRedundancyPackage.createPackageContents();
		theThreatsPackage.createPackageContents();
		theMaintenancePackage.createPackageContents();
		theComplex_Data_TypesPackage.createPackageContents();
		theBasic_Data_TypesPackage.createPackageContents();
		theBasic_Enumeration_TypesPackage.createPackageContents();

		// Initialize created meta-data
		theCorePackage.initializePackageContents();
		theDAMPackage.initializePackageContents();
		theRedundancyPackage.initializePackageContents();
		theThreatsPackage.initializePackageContents();
		theMaintenancePackage.initializePackageContents();
		theComplex_Data_TypesPackage.initializePackageContents();
		theBasic_Data_TypesPackage.initializePackageContents();
		theBasic_Enumeration_TypesPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theCorePackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return CoreValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theCorePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CorePackage.eNS_URI, theCorePackage);
		return theCorePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDaComponent() {
		return daComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDaComponent_Stateful() {
		return (EAttribute)daComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDaComponent_Origin() {
		return (EAttribute)daComponentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDaComponent_FailureCoverage() {
		return (EAttribute)daComponentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDaComponent_PercPermFault() {
		return (EAttribute)daComponentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDaComponent_SsAvail() {
		return (EAttribute)daComponentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDaComponent_Unreliability() {
		return (EAttribute)daComponentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDaComponent_Reliability() {
		return (EAttribute)daComponentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDaComponent_MissionTime() {
		return (EAttribute)daComponentEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDaComponent_AvailLevel() {
		return (EAttribute)daComponentEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDaComponent_ReliabilityLevel() {
		return (EAttribute)daComponentEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDaComponent_SafetyLevel() {
		return (EAttribute)daComponentEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDaComponent_Complexity() {
		return (EAttribute)daComponentEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDaComponent_Fault() {
		return (EReference)daComponentEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDaComponent_Error() {
		return (EReference)daComponentEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDaComponent_Failure() {
		return (EReference)daComponentEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDaComponent_Hazard() {
		return (EReference)daComponentEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDaComponent_Repair() {
		return (EReference)daComponentEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDaComponent_SubstitutedBy() {
		return (EReference)daComponentEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDaService() {
		return daServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDaService_ExecProb() {
		return (EAttribute)daServiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDaService_SsAvail() {
		return (EAttribute)daServiceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDaService_InstAvail() {
		return (EAttribute)daServiceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDaService_Unreliability() {
		return (EAttribute)daServiceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDaService_Reliability() {
		return (EAttribute)daServiceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDaService_MissionTime() {
		return (EAttribute)daServiceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDaService_AvailLevel() {
		return (EAttribute)daServiceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDaService_ReliabLevel() {
		return (EAttribute)daServiceEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDaService_SafetyLevel() {
		return (EAttribute)daServiceEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDaService_Complexity() {
		return (EAttribute)daServiceEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDaService_Failure() {
		return (EReference)daServiceEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDaService_Hazard() {
		return (EReference)daServiceEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDaService_Recovery() {
		return (EReference)daServiceEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDaService_ConfLevel() {
		return (EAttribute)daServiceEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDaService_IntegLevel() {
		return (EAttribute)daServiceEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDaStep() {
		return daStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDaStep_Kind() {
		return (EAttribute)daStepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDaStep_Error() {
		return (EReference)daStepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDaStep_Fault() {
		return (EReference)daStepEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDaResistance() {
		return daResistanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDaResistance_Coverage() {
		return (EAttribute)daResistanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDaRecognition() {
		return daRecognitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDaRecovery() {
		return daRecoveryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDaServiceMode() {
		return daServiceModeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDaServiceMode_Service() {
		return (EReference)daServiceModeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDaServiceMode_Qos() {
		return (EReference)daServiceModeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDaServiceMode_Prob() {
		return (EAttribute)daServiceModeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDaServiceMode_Base_State() {
		return (EReference)daServiceModeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDaServiceRequest() {
		return daServiceRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDaServiceRequest_AccessProb() {
		return (EAttribute)daServiceRequestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDaServiceRequest_ServiceProb() {
		return (EAttribute)daServiceRequestEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDaServiceRequest_Request() {
		return (EReference)daServiceRequestEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDaServiceRequest_Base_Classifier() {
		return (EReference)daServiceRequestEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDaServiceRequest_Base_Lifeline() {
		return (EReference)daServiceRequestEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDaServiceRequest_Base_Interaction() {
		return (EReference)daServiceRequestEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDaServiceRequest_Base_InstanceSpecification() {
		return (EReference)daServiceRequestEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDaConnector() {
		return daConnectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDaConnector_Coupling() {
		return (EAttribute)daConnectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDaConnector_ErrorProp() {
		return (EReference)daConnectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDaConnector_Failure() {
		return (EReference)daConnectorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDaConnector_Hazard() {
		return (EReference)daConnectorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDaConnector_Base_InvocationAction() {
		return (EReference)daConnectorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDaConnector_Base_Extend() {
		return (EReference)daConnectorEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDaConnector_Base_Include() {
		return (EReference)daConnectorEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDaConnector_Base_Message() {
		return (EReference)daConnectorEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDaConnector_Base_Connector() {
		return (EReference)daConnectorEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDaConnector_Base_Dependency() {
		return (EReference)daConnectorEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDaConnector_Base_Association() {
		return (EReference)daConnectorEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDaChange() {
		return daChangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDaChange_Threats() {
		return (EReference)daChangeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDaChange_Recognition() {
		return (EReference)daChangeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDaChange_Recovery() {
		return (EReference)daChangeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDaChange_Resistance() {
		return (EReference)daChangeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDaChange_Base_Transition() {
		return (EReference)daChangeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoreFactory getCoreFactory() {
		return (CoreFactory)getEFactoryInstance();
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
		daComponentEClass = createEClass(DA_COMPONENT);
		createEAttribute(daComponentEClass, DA_COMPONENT__STATEFUL);
		createEAttribute(daComponentEClass, DA_COMPONENT__ORIGIN);
		createEAttribute(daComponentEClass, DA_COMPONENT__FAILURE_COVERAGE);
		createEAttribute(daComponentEClass, DA_COMPONENT__PERC_PERM_FAULT);
		createEAttribute(daComponentEClass, DA_COMPONENT__SS_AVAIL);
		createEAttribute(daComponentEClass, DA_COMPONENT__UNRELIABILITY);
		createEAttribute(daComponentEClass, DA_COMPONENT__RELIABILITY);
		createEAttribute(daComponentEClass, DA_COMPONENT__MISSION_TIME);
		createEAttribute(daComponentEClass, DA_COMPONENT__AVAIL_LEVEL);
		createEAttribute(daComponentEClass, DA_COMPONENT__RELIABILITY_LEVEL);
		createEAttribute(daComponentEClass, DA_COMPONENT__SAFETY_LEVEL);
		createEAttribute(daComponentEClass, DA_COMPONENT__COMPLEXITY);
		createEReference(daComponentEClass, DA_COMPONENT__FAULT);
		createEReference(daComponentEClass, DA_COMPONENT__ERROR);
		createEReference(daComponentEClass, DA_COMPONENT__FAILURE);
		createEReference(daComponentEClass, DA_COMPONENT__HAZARD);
		createEReference(daComponentEClass, DA_COMPONENT__REPAIR);
		createEReference(daComponentEClass, DA_COMPONENT__SUBSTITUTED_BY);

		daServiceEClass = createEClass(DA_SERVICE);
		createEAttribute(daServiceEClass, DA_SERVICE__EXEC_PROB);
		createEAttribute(daServiceEClass, DA_SERVICE__SS_AVAIL);
		createEAttribute(daServiceEClass, DA_SERVICE__INST_AVAIL);
		createEAttribute(daServiceEClass, DA_SERVICE__UNRELIABILITY);
		createEAttribute(daServiceEClass, DA_SERVICE__RELIABILITY);
		createEAttribute(daServiceEClass, DA_SERVICE__MISSION_TIME);
		createEAttribute(daServiceEClass, DA_SERVICE__AVAIL_LEVEL);
		createEAttribute(daServiceEClass, DA_SERVICE__RELIAB_LEVEL);
		createEAttribute(daServiceEClass, DA_SERVICE__SAFETY_LEVEL);
		createEAttribute(daServiceEClass, DA_SERVICE__COMPLEXITY);
		createEReference(daServiceEClass, DA_SERVICE__FAILURE);
		createEReference(daServiceEClass, DA_SERVICE__HAZARD);
		createEReference(daServiceEClass, DA_SERVICE__RECOVERY);
		createEAttribute(daServiceEClass, DA_SERVICE__CONF_LEVEL);
		createEAttribute(daServiceEClass, DA_SERVICE__INTEG_LEVEL);

		daStepEClass = createEClass(DA_STEP);
		createEAttribute(daStepEClass, DA_STEP__KIND);
		createEReference(daStepEClass, DA_STEP__ERROR);
		createEReference(daStepEClass, DA_STEP__FAULT);

		daResistanceEClass = createEClass(DA_RESISTANCE);
		createEAttribute(daResistanceEClass, DA_RESISTANCE__COVERAGE);

		daRecognitionEClass = createEClass(DA_RECOGNITION);

		daRecoveryEClass = createEClass(DA_RECOVERY);

		daServiceModeEClass = createEClass(DA_SERVICE_MODE);
		createEReference(daServiceModeEClass, DA_SERVICE_MODE__SERVICE);
		createEReference(daServiceModeEClass, DA_SERVICE_MODE__QOS);
		createEAttribute(daServiceModeEClass, DA_SERVICE_MODE__PROB);
		createEReference(daServiceModeEClass, DA_SERVICE_MODE__BASE_STATE);

		daServiceRequestEClass = createEClass(DA_SERVICE_REQUEST);
		createEAttribute(daServiceRequestEClass, DA_SERVICE_REQUEST__ACCESS_PROB);
		createEAttribute(daServiceRequestEClass, DA_SERVICE_REQUEST__SERVICE_PROB);
		createEReference(daServiceRequestEClass, DA_SERVICE_REQUEST__REQUEST);
		createEReference(daServiceRequestEClass, DA_SERVICE_REQUEST__BASE_CLASSIFIER);
		createEReference(daServiceRequestEClass, DA_SERVICE_REQUEST__BASE_LIFELINE);
		createEReference(daServiceRequestEClass, DA_SERVICE_REQUEST__BASE_INTERACTION);
		createEReference(daServiceRequestEClass, DA_SERVICE_REQUEST__BASE_INSTANCE_SPECIFICATION);

		daConnectorEClass = createEClass(DA_CONNECTOR);
		createEAttribute(daConnectorEClass, DA_CONNECTOR__COUPLING);
		createEReference(daConnectorEClass, DA_CONNECTOR__ERROR_PROP);
		createEReference(daConnectorEClass, DA_CONNECTOR__FAILURE);
		createEReference(daConnectorEClass, DA_CONNECTOR__HAZARD);
		createEReference(daConnectorEClass, DA_CONNECTOR__BASE_INVOCATION_ACTION);
		createEReference(daConnectorEClass, DA_CONNECTOR__BASE_EXTEND);
		createEReference(daConnectorEClass, DA_CONNECTOR__BASE_INCLUDE);
		createEReference(daConnectorEClass, DA_CONNECTOR__BASE_MESSAGE);
		createEReference(daConnectorEClass, DA_CONNECTOR__BASE_CONNECTOR);
		createEReference(daConnectorEClass, DA_CONNECTOR__BASE_DEPENDENCY);
		createEReference(daConnectorEClass, DA_CONNECTOR__BASE_ASSOCIATION);

		daChangeEClass = createEClass(DA_CHANGE);
		createEReference(daChangeEClass, DA_CHANGE__THREATS);
		createEReference(daChangeEClass, DA_CHANGE__RECOGNITION);
		createEReference(daChangeEClass, DA_CHANGE__RECOVERY);
		createEReference(daChangeEClass, DA_CHANGE__RESISTANCE);
		createEReference(daChangeEClass, DA_CHANGE__BASE_TRANSITION);
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
		GRMPackage theGRMPackage = (GRMPackage)EPackage.Registry.INSTANCE.getEPackage(GRMPackage.eNS_URI);
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);
		Basic_Enumeration_TypesPackage theBasic_Enumeration_TypesPackage = (Basic_Enumeration_TypesPackage)EPackage.Registry.INSTANCE.getEPackage(Basic_Enumeration_TypesPackage.eNS_URI);
		BasicNFP_TypesPackage theBasicNFP_TypesPackage = (BasicNFP_TypesPackage)EPackage.Registry.INSTANCE.getEPackage(BasicNFP_TypesPackage.eNS_URI);
		Basic_Data_TypesPackage theBasic_Data_TypesPackage = (Basic_Data_TypesPackage)EPackage.Registry.INSTANCE.getEPackage(Basic_Data_TypesPackage.eNS_URI);
		Complex_Data_TypesPackage theComplex_Data_TypesPackage = (Complex_Data_TypesPackage)EPackage.Registry.INSTANCE.getEPackage(Complex_Data_TypesPackage.eNS_URI);
		RedundancyPackage theRedundancyPackage = (RedundancyPackage)EPackage.Registry.INSTANCE.getEPackage(RedundancyPackage.eNS_URI);
		GQAMPackage theGQAMPackage = (GQAMPackage)EPackage.Registry.INSTANCE.getEPackage(GQAMPackage.eNS_URI);
		UMLPackage theUMLPackage = (UMLPackage)EPackage.Registry.INSTANCE.getEPackage(UMLPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		daComponentEClass.getESuperTypes().add(theGRMPackage.getResource());
		daServiceEClass.getESuperTypes().add(theGQAMPackage.getGaScenario());
		daStepEClass.getESuperTypes().add(this.getDaService());
		daStepEClass.getESuperTypes().add(theGQAMPackage.getGaStep());
		daResistanceEClass.getESuperTypes().add(this.getDaService());
		daRecognitionEClass.getESuperTypes().add(this.getDaService());
		daRecoveryEClass.getESuperTypes().add(this.getDaService());

		// Initialize classes and features; add operations and parameters
		initEClass(daComponentEClass, DaComponent.class, "DaComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDaComponent_Stateful(), theTypesPackage.getBoolean(), "stateful", null, 0, 1, DaComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDaComponent_Origin(), theBasic_Enumeration_TypesPackage.getOrigin(), "origin", null, 0, 1, DaComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDaComponent_FailureCoverage(), theBasicNFP_TypesPackage.getNFP_Percentage(), "failureCoverage", null, 0, -1, DaComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDaComponent_PercPermFault(), theBasicNFP_TypesPackage.getNFP_Percentage(), "percPermFault", null, 0, -1, DaComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDaComponent_SsAvail(), theBasicNFP_TypesPackage.getNFP_Percentage(), "ssAvail", null, 0, -1, DaComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDaComponent_Unreliability(), theBasicNFP_TypesPackage.getNFP_CommonType(), "unreliability", null, 0, -1, DaComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDaComponent_Reliability(), theBasicNFP_TypesPackage.getNFP_CommonType(), "reliability", null, 0, -1, DaComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDaComponent_MissionTime(), theBasicNFP_TypesPackage.getNFP_CommonType(), "missionTime", null, 0, -1, DaComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDaComponent_AvailLevel(), theBasic_Data_TypesPackage.getDaLevel(), "availLevel", null, 0, -1, DaComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDaComponent_ReliabilityLevel(), theBasic_Data_TypesPackage.getDaLevel(), "reliabilityLevel", null, 0, -1, DaComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDaComponent_SafetyLevel(), theBasic_Data_TypesPackage.getDaLevel(), "safetyLevel", null, 0, -1, DaComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDaComponent_Complexity(), theBasicNFP_TypesPackage.getNFP_Real(), "complexity", null, 0, -1, DaComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDaComponent_Fault(), theComplex_Data_TypesPackage.getDaFault(), null, "fault", null, 0, -1, DaComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDaComponent_Error(), theComplex_Data_TypesPackage.getDaError(), null, "error", null, 0, -1, DaComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDaComponent_Failure(), theComplex_Data_TypesPackage.getDaFailure(), null, "failure", null, 0, -1, DaComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDaComponent_Hazard(), theComplex_Data_TypesPackage.getDaHazard(), null, "hazard", null, 0, -1, DaComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDaComponent_Repair(), theComplex_Data_TypesPackage.getDaRepair(), null, "repair", null, 0, -1, DaComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDaComponent_SubstitutedBy(), theRedundancyPackage.getDaSpare(), null, "substitutedBy", null, 0, -1, DaComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(daServiceEClass, DaService.class, "DaService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDaService_ExecProb(), theBasicNFP_TypesPackage.getNFP_Real(), "execProb", null, 0, -1, DaService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDaService_SsAvail(), theBasicNFP_TypesPackage.getNFP_Percentage(), "ssAvail", null, 0, -1, DaService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDaService_InstAvail(), theBasicNFP_TypesPackage.getNFP_CommonType(), "instAvail", null, 0, -1, DaService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDaService_Unreliability(), theBasicNFP_TypesPackage.getNFP_CommonType(), "unreliability", null, 0, -1, DaService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDaService_Reliability(), theBasicNFP_TypesPackage.getNFP_CommonType(), "reliability", null, 0, -1, DaService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDaService_MissionTime(), theBasicNFP_TypesPackage.getNFP_CommonType(), "missionTime", null, 0, -1, DaService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDaService_AvailLevel(), theBasic_Data_TypesPackage.getDaLevel(), "availLevel", null, 0, -1, DaService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDaService_ReliabLevel(), theBasic_Data_TypesPackage.getDaLevel(), "reliabLevel", null, 0, -1, DaService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDaService_SafetyLevel(), theBasic_Data_TypesPackage.getDaLevel(), "safetyLevel", null, 0, -1, DaService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDaService_Complexity(), theBasicNFP_TypesPackage.getNFP_Real(), "complexity", null, 0, -1, DaService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDaService_Failure(), theComplex_Data_TypesPackage.getDaFailure(), null, "failure", null, 0, -1, DaService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDaService_Hazard(), theComplex_Data_TypesPackage.getDaHazard(), null, "hazard", null, 0, -1, DaService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDaService_Recovery(), theComplex_Data_TypesPackage.getDaRec(), null, "recovery", null, 0, -1, DaService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDaService_ConfLevel(), theBasic_Data_TypesPackage.getDaLevel(), "confLevel", null, 0, -1, DaService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDaService_IntegLevel(), theBasic_Data_TypesPackage.getDaLevel(), "integLevel", null, 0, -1, DaService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(daStepEClass, DaStep.class, "DaStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDaStep_Kind(), theBasic_Enumeration_TypesPackage.getStepKind(), "kind", null, 1, 1, DaStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDaStep_Error(), theComplex_Data_TypesPackage.getDaError(), null, "error", null, 0, -1, DaStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDaStep_Fault(), theComplex_Data_TypesPackage.getDaFault(), null, "fault", null, 0, -1, DaStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(daResistanceEClass, DaResistance.class, "DaResistance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDaResistance_Coverage(), theBasicNFP_TypesPackage.getNFP_Percentage(), "coverage", null, 0, 1, DaResistance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(daRecognitionEClass, DaRecognition.class, "DaRecognition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(daRecoveryEClass, DaRecovery.class, "DaRecovery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(daServiceModeEClass, DaServiceMode.class, "DaServiceMode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDaServiceMode_Service(), this.getDaService(), null, "service", null, 0, -1, DaServiceMode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDaServiceMode_Qos(), theComplex_Data_TypesPackage.getDaSurvivability(), null, "qos", null, 0, -1, DaServiceMode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDaServiceMode_Prob(), theBasicNFP_TypesPackage.getNFP_Percentage(), "prob", null, 0, 1, DaServiceMode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDaServiceMode_Base_State(), theUMLPackage.getState(), null, "base_State", null, 1, 1, DaServiceMode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(daServiceRequestEClass, DaServiceRequest.class, "DaServiceRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDaServiceRequest_AccessProb(), theBasicNFP_TypesPackage.getNFP_Real(), "accessProb", null, 0, -1, DaServiceRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDaServiceRequest_ServiceProb(), theBasicNFP_TypesPackage.getNFP_Real(), "serviceProb", null, 0, -1, DaServiceRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDaServiceRequest_Request(), this.getDaService(), null, "request", null, 0, -1, DaServiceRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDaServiceRequest_Base_Classifier(), theUMLPackage.getClassifier(), null, "base_Classifier", null, 1, 1, DaServiceRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDaServiceRequest_Base_Lifeline(), theUMLPackage.getLifeline(), null, "base_Lifeline", null, 1, 1, DaServiceRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDaServiceRequest_Base_Interaction(), theUMLPackage.getInteraction(), null, "base_Interaction", null, 1, 1, DaServiceRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDaServiceRequest_Base_InstanceSpecification(), theUMLPackage.getInstanceSpecification(), null, "base_InstanceSpecification", null, 1, 1, DaServiceRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		EOperation op = addEOperation(daServiceRequestEClass, ecorePackage.getEBoolean(), "requestSize", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(daConnectorEClass, DaConnector.class, "DaConnector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDaConnector_Coupling(), theBasicNFP_TypesPackage.getNFP_Real(), "coupling", null, 0, -1, DaConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDaConnector_ErrorProp(), theComplex_Data_TypesPackage.getDaErrorPropagation(), null, "errorProp", null, 0, -1, DaConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDaConnector_Failure(), theComplex_Data_TypesPackage.getDaFailure(), null, "failure", null, 0, -1, DaConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDaConnector_Hazard(), theComplex_Data_TypesPackage.getDaHazard(), null, "hazard", null, 0, -1, DaConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDaConnector_Base_InvocationAction(), theUMLPackage.getInvocationAction(), null, "base_InvocationAction", null, 1, 1, DaConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDaConnector_Base_Extend(), theUMLPackage.getExtend(), null, "base_Extend", null, 1, 1, DaConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDaConnector_Base_Include(), theUMLPackage.getInclude(), null, "base_Include", null, 1, 1, DaConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDaConnector_Base_Message(), theUMLPackage.getMessage(), null, "base_Message", null, 1, 1, DaConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDaConnector_Base_Connector(), theUMLPackage.getConnector(), null, "base_Connector", null, 1, 1, DaConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDaConnector_Base_Dependency(), theUMLPackage.getDependency(), null, "base_Dependency", null, 1, 1, DaConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDaConnector_Base_Association(), theUMLPackage.getAssociation(), null, "base_Association", null, 1, 1, DaConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(daChangeEClass, DaChange.class, "DaChange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDaChange_Threats(), this.getDaStep(), null, "threats", null, 0, 1, DaChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDaChange_Recognition(), this.getDaRecognition(), null, "recognition", null, 0, 1, DaChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDaChange_Recovery(), this.getDaRecovery(), null, "recovery", null, 0, 1, DaChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDaChange_Resistance(), this.getDaResistance(), null, "resistance", null, 0, 1, DaChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDaChange_Base_Transition(), theUMLPackage.getTransition(), null, "base_Transition", null, 1, 1, DaChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
	}

} //CorePackageImpl
