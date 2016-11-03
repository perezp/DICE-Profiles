/**
 */
package es.unizar.disco.dice.DDSM.impl;

import com.masdes.dam.Basic_Data_Types.Basic_Data_TypesPackage;

import com.masdes.dam.Basic_Enumeration_Types.Basic_Enumeration_TypesPackage;

import com.masdes.dam.Complex_Data_Types.Complex_Data_TypesPackage;

import com.masdes.dam.DAM.DAMPackage;

import es.unizar.disco.dice.Basic_Data_Types.impl.Basic_Data_TypesPackageImpl;

import es.unizar.disco.dice.Basic_Enumeration_Types.impl.Basic_Enumeration_TypesPackageImpl;

import es.unizar.disco.dice.Complex_Data_Types.impl.Complex_Data_TypesPackageImpl;

import es.unizar.disco.dice.DDSM.DDSMFactory;
import es.unizar.disco.dice.DDSM.DDSMPackage;
import es.unizar.disco.dice.DDSM.DdsmBigDataJob;
import es.unizar.disco.dice.DDSM.DdsmCloudElement;
import es.unizar.disco.dice.DDSM.DdsmCluster;
import es.unizar.disco.dice.DDSM.DdsmComponent;
import es.unizar.disco.dice.DDSM.DdsmExternalComponent;
import es.unizar.disco.dice.DDSM.DdsmInternalComponent;
import es.unizar.disco.dice.DDSM.DdsmJobDeployedFrom;
import es.unizar.disco.dice.DDSM.DdsmJobSubmission;
import es.unizar.disco.dice.DDSM.DdsmKafka;
import es.unizar.disco.dice.DDSM.DdsmNimbus;
import es.unizar.disco.dice.DDSM.DdsmPort;
import es.unizar.disco.dice.DDSM.DdsmResource;
import es.unizar.disco.dice.DDSM.DdsmStormCluster;
import es.unizar.disco.dice.DDSM.DdsmSupervisor;
import es.unizar.disco.dice.DDSM.DdsmVm;
import es.unizar.disco.dice.DDSM.DdsmYarnResourceManager;
import es.unizar.disco.dice.DDSM.DdsmZookeeperServer;
import es.unizar.disco.dice.DDSM.util.DDSMValidator;

import es.unizar.disco.dice.DICE.DICEPackage;
import es.unizar.disco.dice.DICE.impl.DICEPackageImpl;
import es.unizar.disco.dice.DPIM.DPIMPackage;

import es.unizar.disco.dice.DPIM.impl.DPIMPackageImpl;

import es.unizar.disco.dice.dtsm.Core.CorePackage;

import es.unizar.disco.dice.dtsm.Core.impl.CorePackageImpl;

import es.unizar.disco.dice.dtsm.Hadoop.HadoopPackage;

import es.unizar.disco.dice.dtsm.Hadoop.impl.HadoopPackageImpl;

import es.unizar.disco.dice.dtsm.Storm.StormPackage;

import es.unizar.disco.dice.dtsm.Storm.impl.StormPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.uml2.uml.UMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DDSMPackageImpl extends EPackageImpl implements DDSMPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ddsmExternalComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ddsmComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ddsmCloudElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ddsmResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ddsmPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ddsmInternalComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ddsmClusterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ddsmVmEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ddsmYarnResourceManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ddsmZookeeperServerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ddsmKafkaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ddsmNimbusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ddsmJobSubmissionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ddsmSupervisorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ddsmStormClusterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ddsmBigDataJobEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ddsmJobDeployedFromEClass = null;

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
	 * @see es.unizar.disco.dice.DDSM.DDSMPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DDSMPackageImpl() {
		super(eNS_URI, DDSMFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link DDSMPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DDSMPackage init() {
		if (isInited) return (DDSMPackage)EPackage.Registry.INSTANCE.getEPackage(DDSMPackage.eNS_URI);

		// Obtain or create and register package
		DDSMPackageImpl theDDSMPackage = (DDSMPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DDSMPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DDSMPackageImpl());

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
		Complex_Data_TypesPackageImpl theComplex_Data_TypesPackage_1 = (Complex_Data_TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(es.unizar.disco.dice.Complex_Data_Types.Complex_Data_TypesPackage.eNS_URI) instanceof Complex_Data_TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(es.unizar.disco.dice.Complex_Data_Types.Complex_Data_TypesPackage.eNS_URI) : es.unizar.disco.dice.Complex_Data_Types.Complex_Data_TypesPackage.eINSTANCE);
		Basic_Data_TypesPackageImpl theBasic_Data_TypesPackage_1 = (Basic_Data_TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(es.unizar.disco.dice.Basic_Data_Types.Basic_Data_TypesPackage.eNS_URI) instanceof Basic_Data_TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(es.unizar.disco.dice.Basic_Data_Types.Basic_Data_TypesPackage.eNS_URI) : es.unizar.disco.dice.Basic_Data_Types.Basic_Data_TypesPackage.eINSTANCE);
		Basic_Enumeration_TypesPackageImpl theBasic_Enumeration_TypesPackage_1 = (Basic_Enumeration_TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(es.unizar.disco.dice.Basic_Enumeration_Types.Basic_Enumeration_TypesPackage.eNS_URI) instanceof Basic_Enumeration_TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(es.unizar.disco.dice.Basic_Enumeration_Types.Basic_Enumeration_TypesPackage.eNS_URI) : es.unizar.disco.dice.Basic_Enumeration_Types.Basic_Enumeration_TypesPackage.eINSTANCE);

		// Create package meta-data objects
		theDDSMPackage.createPackageContents();
		theDICEPackage.createPackageContents();
		theDPIMPackage.createPackageContents();
		theCorePackage.createPackageContents();
		theStormPackage.createPackageContents();
		theHadoopPackage.createPackageContents();
		theComplex_Data_TypesPackage_1.createPackageContents();
		theBasic_Data_TypesPackage_1.createPackageContents();
		theBasic_Enumeration_TypesPackage_1.createPackageContents();

		// Initialize created meta-data
		theDDSMPackage.initializePackageContents();
		theDICEPackage.initializePackageContents();
		theDPIMPackage.initializePackageContents();
		theCorePackage.initializePackageContents();
		theStormPackage.initializePackageContents();
		theHadoopPackage.initializePackageContents();
		theComplex_Data_TypesPackage_1.initializePackageContents();
		theBasic_Data_TypesPackage_1.initializePackageContents();
		theBasic_Enumeration_TypesPackage_1.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theDDSMPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return DDSMValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theDDSMPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DDSMPackage.eNS_URI, theDDSMPackage);
		return theDDSMPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDdsmExternalComponent() {
		return ddsmExternalComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsmExternalComponent_Location() {
		return (EAttribute)ddsmExternalComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsmExternalComponent_Provider() {
		return (EAttribute)ddsmExternalComponentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsmExternalComponent_ServiceType() {
		return (EAttribute)ddsmExternalComponentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsmExternalComponent_Region() {
		return (EAttribute)ddsmExternalComponentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsmExternalComponent_Login() {
		return (EAttribute)ddsmExternalComponentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsmExternalComponent_Password() {
		return (EAttribute)ddsmExternalComponentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDdsmExternalComponent_Base_Device() {
		return (EReference)ddsmExternalComponentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDdsmComponent() {
		return ddsmComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDdsmComponent_ProvidedPortsList() {
		return (EReference)ddsmComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDdsmCloudElement() {
		return ddsmCloudElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsmCloudElement_Description() {
		return (EAttribute)ddsmCloudElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsmCloudElement_PropertiesList() {
		return (EAttribute)ddsmCloudElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDdsmCloudElement_ResourcesList() {
		return (EReference)ddsmCloudElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsmCloudElement_Id() {
		return (EAttribute)ddsmCloudElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDdsmResource() {
		return ddsmResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDdsmResource_CommandsList() {
		return (EReference)ddsmResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDdsmResource_Base_Artifact() {
		return (EReference)ddsmResourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsmResource_Id() {
		return (EAttribute)ddsmResourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDdsmPort() {
		return ddsmPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsmPort_IsLocal() {
		return (EAttribute)ddsmPortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsmPort_PortNumber() {
		return (EAttribute)ddsmPortEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDdsmPort_Base_CommunicationPath() {
		return (EReference)ddsmPortEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDdsmInternalComponent() {
		return ddsmInternalComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDdsmInternalComponent_RequiredPort() {
		return (EReference)ddsmInternalComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsmInternalComponent_IsFrontEnd() {
		return (EAttribute)ddsmInternalComponentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsmInternalComponent_ComponentType() {
		return (EAttribute)ddsmInternalComponentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDdsmInternalComponent_Base_Node() {
		return (EReference)ddsmInternalComponentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDdsmCluster() {
		return ddsmClusterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDdsmCluster_HasVM() {
		return (EReference)ddsmClusterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDdsmVm() {
		return ddsmVmEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsmVm_Is64os() {
		return (EAttribute)ddsmVmEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsmVm_ImageId() {
		return (EAttribute)ddsmVmEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsmVm_MaxCores() {
		return (EAttribute)ddsmVmEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsmVm_MaxRam() {
		return (EAttribute)ddsmVmEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsmVm_MaxStorage() {
		return (EAttribute)ddsmVmEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsmVm_MinCores() {
		return (EAttribute)ddsmVmEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsmVm_MinRam() {
		return (EAttribute)ddsmVmEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsmVm_MinStorage() {
		return (EAttribute)ddsmVmEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsmVm_Os() {
		return (EAttribute)ddsmVmEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsmVm_SecurityGroup() {
		return (EAttribute)ddsmVmEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsmVm_PrivateKey() {
		return (EAttribute)ddsmVmEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsmVm_SshKey() {
		return (EAttribute)ddsmVmEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsmVm_PublicAddress() {
		return (EAttribute)ddsmVmEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsmVm_Instances() {
		return (EAttribute)ddsmVmEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsmVm_GenericSize() {
		return (EAttribute)ddsmVmEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDdsmYarnResourceManager() {
		return ddsmYarnResourceManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDdsmZookeeperServer() {
		return ddsmZookeeperServerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsmZookeeperServer_TickTime() {
		return (EAttribute)ddsmZookeeperServerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsmZookeeperServer_SyncLimit() {
		return (EAttribute)ddsmZookeeperServerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsmZookeeperServer_InitLimit() {
		return (EAttribute)ddsmZookeeperServerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDdsmKafka() {
		return ddsmKafkaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDdsmNimbus() {
		return ddsmNimbusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsmNimbus_TaskTimeout() {
		return (EAttribute)ddsmNimbusEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsmNimbus_SupervisorFrequency() {
		return (EAttribute)ddsmNimbusEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsmNimbus_QueueSize() {
		return (EAttribute)ddsmNimbusEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsmNimbus_MonitorFrequency() {
		return (EAttribute)ddsmNimbusEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsmNimbus_RetryTimes() {
		return (EAttribute)ddsmNimbusEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsmNimbus_RetryInterval() {
		return (EAttribute)ddsmNimbusEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDdsmJobSubmission() {
		return ddsmJobSubmissionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDdsmJobSubmission_Base_Deployment() {
		return (EReference)ddsmJobSubmissionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDdsmSupervisor() {
		return ddsmSupervisorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsmSupervisor_WorkerStartTimeout() {
		return (EAttribute)ddsmSupervisorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsmSupervisor_CpuCapacity() {
		return (EAttribute)ddsmSupervisorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsmSupervisor_MemoryCapacity() {
		return (EAttribute)ddsmSupervisorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsmSupervisor_HeartbeatFrequency() {
		return (EAttribute)ddsmSupervisorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDdsmStormCluster() {
		return ddsmStormClusterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDdsmBigDataJob() {
		return ddsmBigDataJobEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsmBigDataJob_ArtifactURL() {
		return (EAttribute)ddsmBigDataJobEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdsmBigDataJob_MainClass() {
		return (EAttribute)ddsmBigDataJobEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDdsmBigDataJob_Base_Artifact() {
		return (EReference)ddsmBigDataJobEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDdsmJobDeployedFrom() {
		return ddsmJobDeployedFromEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDdsmJobDeployedFrom_Base_Dependency() {
		return (EReference)ddsmJobDeployedFromEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DDSMFactory getDDSMFactory() {
		return (DDSMFactory)getEFactoryInstance();
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
		ddsmExternalComponentEClass = createEClass(DDSM_EXTERNAL_COMPONENT);
		createEAttribute(ddsmExternalComponentEClass, DDSM_EXTERNAL_COMPONENT__LOCATION);
		createEAttribute(ddsmExternalComponentEClass, DDSM_EXTERNAL_COMPONENT__PROVIDER);
		createEAttribute(ddsmExternalComponentEClass, DDSM_EXTERNAL_COMPONENT__SERVICE_TYPE);
		createEAttribute(ddsmExternalComponentEClass, DDSM_EXTERNAL_COMPONENT__REGION);
		createEAttribute(ddsmExternalComponentEClass, DDSM_EXTERNAL_COMPONENT__LOGIN);
		createEAttribute(ddsmExternalComponentEClass, DDSM_EXTERNAL_COMPONENT__PASSWORD);
		createEReference(ddsmExternalComponentEClass, DDSM_EXTERNAL_COMPONENT__BASE_DEVICE);

		ddsmComponentEClass = createEClass(DDSM_COMPONENT);
		createEReference(ddsmComponentEClass, DDSM_COMPONENT__PROVIDED_PORTS_LIST);

		ddsmCloudElementEClass = createEClass(DDSM_CLOUD_ELEMENT);
		createEAttribute(ddsmCloudElementEClass, DDSM_CLOUD_ELEMENT__DESCRIPTION);
		createEAttribute(ddsmCloudElementEClass, DDSM_CLOUD_ELEMENT__PROPERTIES_LIST);
		createEReference(ddsmCloudElementEClass, DDSM_CLOUD_ELEMENT__RESOURCES_LIST);
		createEAttribute(ddsmCloudElementEClass, DDSM_CLOUD_ELEMENT__ID);

		ddsmResourceEClass = createEClass(DDSM_RESOURCE);
		createEReference(ddsmResourceEClass, DDSM_RESOURCE__COMMANDS_LIST);
		createEReference(ddsmResourceEClass, DDSM_RESOURCE__BASE_ARTIFACT);
		createEAttribute(ddsmResourceEClass, DDSM_RESOURCE__ID);

		ddsmPortEClass = createEClass(DDSM_PORT);
		createEAttribute(ddsmPortEClass, DDSM_PORT__IS_LOCAL);
		createEAttribute(ddsmPortEClass, DDSM_PORT__PORT_NUMBER);
		createEReference(ddsmPortEClass, DDSM_PORT__BASE_COMMUNICATION_PATH);

		ddsmInternalComponentEClass = createEClass(DDSM_INTERNAL_COMPONENT);
		createEReference(ddsmInternalComponentEClass, DDSM_INTERNAL_COMPONENT__REQUIRED_PORT);
		createEAttribute(ddsmInternalComponentEClass, DDSM_INTERNAL_COMPONENT__IS_FRONT_END);
		createEAttribute(ddsmInternalComponentEClass, DDSM_INTERNAL_COMPONENT__COMPONENT_TYPE);
		createEReference(ddsmInternalComponentEClass, DDSM_INTERNAL_COMPONENT__BASE_NODE);

		ddsmClusterEClass = createEClass(DDSM_CLUSTER);
		createEReference(ddsmClusterEClass, DDSM_CLUSTER__HAS_VM);

		ddsmVmEClass = createEClass(DDSM_VM);
		createEAttribute(ddsmVmEClass, DDSM_VM__IS64OS);
		createEAttribute(ddsmVmEClass, DDSM_VM__IMAGE_ID);
		createEAttribute(ddsmVmEClass, DDSM_VM__MAX_CORES);
		createEAttribute(ddsmVmEClass, DDSM_VM__MAX_RAM);
		createEAttribute(ddsmVmEClass, DDSM_VM__MAX_STORAGE);
		createEAttribute(ddsmVmEClass, DDSM_VM__MIN_CORES);
		createEAttribute(ddsmVmEClass, DDSM_VM__MIN_RAM);
		createEAttribute(ddsmVmEClass, DDSM_VM__MIN_STORAGE);
		createEAttribute(ddsmVmEClass, DDSM_VM__OS);
		createEAttribute(ddsmVmEClass, DDSM_VM__SECURITY_GROUP);
		createEAttribute(ddsmVmEClass, DDSM_VM__PRIVATE_KEY);
		createEAttribute(ddsmVmEClass, DDSM_VM__SSH_KEY);
		createEAttribute(ddsmVmEClass, DDSM_VM__PUBLIC_ADDRESS);
		createEAttribute(ddsmVmEClass, DDSM_VM__INSTANCES);
		createEAttribute(ddsmVmEClass, DDSM_VM__GENERIC_SIZE);

		ddsmYarnResourceManagerEClass = createEClass(DDSM_YARN_RESOURCE_MANAGER);

		ddsmZookeeperServerEClass = createEClass(DDSM_ZOOKEEPER_SERVER);
		createEAttribute(ddsmZookeeperServerEClass, DDSM_ZOOKEEPER_SERVER__TICK_TIME);
		createEAttribute(ddsmZookeeperServerEClass, DDSM_ZOOKEEPER_SERVER__SYNC_LIMIT);
		createEAttribute(ddsmZookeeperServerEClass, DDSM_ZOOKEEPER_SERVER__INIT_LIMIT);

		ddsmKafkaEClass = createEClass(DDSM_KAFKA);

		ddsmNimbusEClass = createEClass(DDSM_NIMBUS);
		createEAttribute(ddsmNimbusEClass, DDSM_NIMBUS__TASK_TIMEOUT);
		createEAttribute(ddsmNimbusEClass, DDSM_NIMBUS__SUPERVISOR_FREQUENCY);
		createEAttribute(ddsmNimbusEClass, DDSM_NIMBUS__QUEUE_SIZE);
		createEAttribute(ddsmNimbusEClass, DDSM_NIMBUS__MONITOR_FREQUENCY);
		createEAttribute(ddsmNimbusEClass, DDSM_NIMBUS__RETRY_TIMES);
		createEAttribute(ddsmNimbusEClass, DDSM_NIMBUS__RETRY_INTERVAL);

		ddsmJobSubmissionEClass = createEClass(DDSM_JOB_SUBMISSION);
		createEReference(ddsmJobSubmissionEClass, DDSM_JOB_SUBMISSION__BASE_DEPLOYMENT);

		ddsmSupervisorEClass = createEClass(DDSM_SUPERVISOR);
		createEAttribute(ddsmSupervisorEClass, DDSM_SUPERVISOR__WORKER_START_TIMEOUT);
		createEAttribute(ddsmSupervisorEClass, DDSM_SUPERVISOR__CPU_CAPACITY);
		createEAttribute(ddsmSupervisorEClass, DDSM_SUPERVISOR__MEMORY_CAPACITY);
		createEAttribute(ddsmSupervisorEClass, DDSM_SUPERVISOR__HEARTBEAT_FREQUENCY);

		ddsmStormClusterEClass = createEClass(DDSM_STORM_CLUSTER);

		ddsmBigDataJobEClass = createEClass(DDSM_BIG_DATA_JOB);
		createEAttribute(ddsmBigDataJobEClass, DDSM_BIG_DATA_JOB__ARTIFACT_URL);
		createEAttribute(ddsmBigDataJobEClass, DDSM_BIG_DATA_JOB__MAIN_CLASS);
		createEReference(ddsmBigDataJobEClass, DDSM_BIG_DATA_JOB__BASE_ARTIFACT);

		ddsmJobDeployedFromEClass = createEClass(DDSM_JOB_DEPLOYED_FROM);
		createEReference(ddsmJobDeployedFromEClass, DDSM_JOB_DEPLOYED_FROM__BASE_DEPENDENCY);
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
		es.unizar.disco.dice.Basic_Enumeration_Types.Basic_Enumeration_TypesPackage theBasic_Enumeration_TypesPackage_1 = (es.unizar.disco.dice.Basic_Enumeration_Types.Basic_Enumeration_TypesPackage)EPackage.Registry.INSTANCE.getEPackage(es.unizar.disco.dice.Basic_Enumeration_Types.Basic_Enumeration_TypesPackage.eNS_URI);
		UMLPackage theUMLPackage = (UMLPackage)EPackage.Registry.INSTANCE.getEPackage(UMLPackage.eNS_URI);
		es.unizar.disco.dice.Basic_Data_Types.Basic_Data_TypesPackage theBasic_Data_TypesPackage_1 = (es.unizar.disco.dice.Basic_Data_Types.Basic_Data_TypesPackage)EPackage.Registry.INSTANCE.getEPackage(es.unizar.disco.dice.Basic_Data_Types.Basic_Data_TypesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		ddsmExternalComponentEClass.getESuperTypes().add(this.getDdsmComponent());
		ddsmComponentEClass.getESuperTypes().add(this.getDdsmCloudElement());
		ddsmPortEClass.getESuperTypes().add(this.getDdsmCloudElement());
		ddsmInternalComponentEClass.getESuperTypes().add(this.getDdsmComponent());
		ddsmClusterEClass.getESuperTypes().add(this.getDdsmExternalComponent());
		ddsmVmEClass.getESuperTypes().add(this.getDdsmExternalComponent());
		ddsmYarnResourceManagerEClass.getESuperTypes().add(this.getDdsmInternalComponent());
		ddsmZookeeperServerEClass.getESuperTypes().add(this.getDdsmInternalComponent());
		ddsmKafkaEClass.getESuperTypes().add(this.getDdsmInternalComponent());
		ddsmNimbusEClass.getESuperTypes().add(this.getDdsmInternalComponent());
		ddsmSupervisorEClass.getESuperTypes().add(this.getDdsmInternalComponent());
		ddsmStormClusterEClass.getESuperTypes().add(this.getDdsmInternalComponent());

		// Initialize classes and features; add operations and parameters
		initEClass(ddsmExternalComponentEClass, DdsmExternalComponent.class, "DdsmExternalComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDdsmExternalComponent_Location(), ecorePackage.getEString(), "location", null, 0, 1, DdsmExternalComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDdsmExternalComponent_Provider(), theBasic_Enumeration_TypesPackage_1.getProviderType(), "provider", null, 1, 1, DdsmExternalComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDdsmExternalComponent_ServiceType(), ecorePackage.getEString(), "serviceType", null, 0, 1, DdsmExternalComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDdsmExternalComponent_Region(), ecorePackage.getEString(), "region", null, 0, 1, DdsmExternalComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDdsmExternalComponent_Login(), ecorePackage.getEString(), "login", null, 0, 1, DdsmExternalComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDdsmExternalComponent_Password(), ecorePackage.getEString(), "password", null, 0, 1, DdsmExternalComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDdsmExternalComponent_Base_Device(), theUMLPackage.getDevice(), null, "base_Device", null, 1, 1, DdsmExternalComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(ddsmComponentEClass, DdsmComponent.class, "DdsmComponent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDdsmComponent_ProvidedPortsList(), this.getDdsmPort(), null, "providedPortsList", null, 0, -1, DdsmComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(ddsmCloudElementEClass, DdsmCloudElement.class, "DdsmCloudElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDdsmCloudElement_Description(), ecorePackage.getEString(), "description", null, 0, 1, DdsmCloudElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDdsmCloudElement_PropertiesList(), ecorePackage.getEString(), "propertiesList", null, 0, -1, DdsmCloudElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDdsmCloudElement_ResourcesList(), this.getDdsmResource(), null, "resourcesList", null, 0, -1, DdsmCloudElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDdsmCloudElement_Id(), ecorePackage.getEString(), "id", null, 0, 1, DdsmCloudElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(ddsmResourceEClass, DdsmResource.class, "DdsmResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDdsmResource_CommandsList(), theBasic_Data_TypesPackage_1.getScriptType(), null, "commandsList", null, 0, -1, DdsmResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDdsmResource_Base_Artifact(), theUMLPackage.getArtifact(), null, "base_Artifact", null, 1, 1, DdsmResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDdsmResource_Id(), ecorePackage.getEString(), "id", null, 1, 1, DdsmResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(ddsmPortEClass, DdsmPort.class, "DdsmPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDdsmPort_IsLocal(), ecorePackage.getEBoolean(), "isLocal", "false", 0, 1, DdsmPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDdsmPort_PortNumber(), ecorePackage.getEString(), "portNumber", null, 0, 1, DdsmPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDdsmPort_Base_CommunicationPath(), theUMLPackage.getCommunicationPath(), null, "base_CommunicationPath", null, 1, 1, DdsmPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(ddsmInternalComponentEClass, DdsmInternalComponent.class, "DdsmInternalComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDdsmInternalComponent_RequiredPort(), this.getDdsmPort(), null, "requiredPort", null, 0, -1, DdsmInternalComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDdsmInternalComponent_IsFrontEnd(), ecorePackage.getEBoolean(), "isFrontEnd", "false", 1, 1, DdsmInternalComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDdsmInternalComponent_ComponentType(), theBasic_Enumeration_TypesPackage_1.getDDSMcomponentType(), "componentType", null, 1, 1, DdsmInternalComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDdsmInternalComponent_Base_Node(), theUMLPackage.getNode(), null, "base_Node", null, 1, 1, DdsmInternalComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(ddsmClusterEClass, DdsmCluster.class, "DdsmCluster", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDdsmCluster_HasVM(), this.getDdsmVm(), null, "hasVM", null, 0, -1, DdsmCluster.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(ddsmVmEClass, DdsmVm.class, "DdsmVm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDdsmVm_Is64os(), ecorePackage.getEBoolean(), "is64os", "true", 0, 1, DdsmVm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDdsmVm_ImageId(), ecorePackage.getEString(), "imageId", null, 0, 1, DdsmVm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDdsmVm_MaxCores(), ecorePackage.getEInt(), "maxCores", null, 1, 1, DdsmVm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDdsmVm_MaxRam(), ecorePackage.getEInt(), "maxRam", null, 0, 1, DdsmVm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDdsmVm_MaxStorage(), ecorePackage.getEInt(), "maxStorage", "0", 0, 1, DdsmVm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDdsmVm_MinCores(), ecorePackage.getEInt(), "minCores", null, 0, 1, DdsmVm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDdsmVm_MinRam(), ecorePackage.getEInt(), "minRam", null, 0, 1, DdsmVm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDdsmVm_MinStorage(), ecorePackage.getEInt(), "minStorage", "0", 0, 1, DdsmVm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDdsmVm_Os(), ecorePackage.getEString(), "os", null, 0, 1, DdsmVm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDdsmVm_SecurityGroup(), ecorePackage.getEString(), "securityGroup", null, 0, 1, DdsmVm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDdsmVm_PrivateKey(), ecorePackage.getEString(), "privateKey", null, 0, 1, DdsmVm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDdsmVm_SshKey(), ecorePackage.getEString(), "sshKey", null, 0, 1, DdsmVm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDdsmVm_PublicAddress(), ecorePackage.getEString(), "publicAddress", null, 0, 1, DdsmVm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDdsmVm_Instances(), ecorePackage.getEIntegerObject(), "instances", "0", 1, 1, DdsmVm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDdsmVm_GenericSize(), theBasic_Enumeration_TypesPackage_1.getVMSize(), "genericSize", null, 0, 1, DdsmVm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(ddsmYarnResourceManagerEClass, DdsmYarnResourceManager.class, "DdsmYarnResourceManager", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = addEOperation(ddsmYarnResourceManagerEClass, ecorePackage.getEBoolean(), "YarnTypeMasterNode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(ddsmZookeeperServerEClass, DdsmZookeeperServer.class, "DdsmZookeeperServer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDdsmZookeeperServer_TickTime(), ecorePackage.getEInt(), "tickTime", "1500", 1, 1, DdsmZookeeperServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDdsmZookeeperServer_SyncLimit(), ecorePackage.getEInt(), "syncLimit", "10", 1, 1, DdsmZookeeperServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDdsmZookeeperServer_InitLimit(), ecorePackage.getEInt(), "initLimit", "5", 1, 1, DdsmZookeeperServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = addEOperation(ddsmZookeeperServerEClass, ecorePackage.getEBoolean(), "ZookeeperServerTypePeefNode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(ddsmKafkaEClass, DdsmKafka.class, "DdsmKafka", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ddsmNimbusEClass, DdsmNimbus.class, "DdsmNimbus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDdsmNimbus_TaskTimeout(), ecorePackage.getEInt(), "taskTimeout", "60", 1, 1, DdsmNimbus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDdsmNimbus_SupervisorFrequency(), ecorePackage.getEInt(), "supervisorFrequency", "60", 1, 1, DdsmNimbus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDdsmNimbus_QueueSize(), ecorePackage.getEInt(), "queueSize", "10000", 1, 1, DdsmNimbus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDdsmNimbus_MonitorFrequency(), ecorePackage.getEInt(), "monitorFrequency", "40", 1, 1, DdsmNimbus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDdsmNimbus_RetryTimes(), ecorePackage.getEInt(), "retryTimes", "5", 1, 1, DdsmNimbus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDdsmNimbus_RetryInterval(), ecorePackage.getEInt(), "retryInterval", "2000", 1, 1, DdsmNimbus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = addEOperation(ddsmNimbusEClass, ecorePackage.getEBoolean(), "NimbusTypeMasterNode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(ddsmJobSubmissionEClass, DdsmJobSubmission.class, "DdsmJobSubmission", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDdsmJobSubmission_Base_Deployment(), theUMLPackage.getDeployment(), null, "base_Deployment", null, 1, 1, DdsmJobSubmission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(ddsmSupervisorEClass, DdsmSupervisor.class, "DdsmSupervisor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDdsmSupervisor_WorkerStartTimeout(), ecorePackage.getEInt(), "workerStartTimeout", "120", 1, 1, DdsmSupervisor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDdsmSupervisor_CpuCapacity(), ecorePackage.getEInt(), "cpuCapacity", "400", 1, 1, DdsmSupervisor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDdsmSupervisor_MemoryCapacity(), ecorePackage.getEInt(), "memoryCapacity", "4096", 1, 1, DdsmSupervisor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDdsmSupervisor_HeartbeatFrequency(), ecorePackage.getEInt(), "heartbeatFrequency", "5", 1, 1, DdsmSupervisor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = addEOperation(ddsmSupervisorEClass, ecorePackage.getEBoolean(), "SupervisorTypeSlaveNode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(ddsmStormClusterEClass, DdsmStormCluster.class, "DdsmStormCluster", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(ddsmStormClusterEClass, ecorePackage.getEBoolean(), "StormClusterTypeMasterSlavePlatform", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(ddsmBigDataJobEClass, DdsmBigDataJob.class, "DdsmBigDataJob", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDdsmBigDataJob_ArtifactURL(), ecorePackage.getEString(), "artifactURL", null, 1, 1, DdsmBigDataJob.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDdsmBigDataJob_MainClass(), ecorePackage.getEString(), "mainClass", null, 1, 1, DdsmBigDataJob.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDdsmBigDataJob_Base_Artifact(), theUMLPackage.getArtifact(), null, "base_Artifact", null, 1, 1, DdsmBigDataJob.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(ddsmJobDeployedFromEClass, DdsmJobDeployedFrom.class, "DdsmJobDeployedFrom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDdsmJobDeployedFrom_Base_Dependency(), theUMLPackage.getDependency(), null, "base_Dependency", null, 1, 1, DdsmJobDeployedFrom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

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
		  (ddsmResourceEClass, 
		   source, 
		   new String[] {
		   });
	}

} //DDSMPackageImpl
