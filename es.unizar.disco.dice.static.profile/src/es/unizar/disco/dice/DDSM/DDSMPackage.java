/**
 */
package es.unizar.disco.dice.DDSM;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see es.unizar.disco.dice.DDSM.DDSMFactory
 * @model kind="package"
 * @generated
 */
public interface DDSMPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "DDSM";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://es.unizar.disco.dice/profiles/DDSM/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "DDSM";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DDSMPackage eINSTANCE = es.unizar.disco.dice.DDSM.impl.DDSMPackageImpl.init();

	/**
	 * The meta object id for the '{@link es.unizar.disco.dice.DDSM.impl.DdsmCloudElementImpl <em>Ddsm Cloud Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unizar.disco.dice.DDSM.impl.DdsmCloudElementImpl
	 * @see es.unizar.disco.dice.DDSM.impl.DDSMPackageImpl#getDdsmCloudElement()
	 * @generated
	 */
	int DDSM_CLOUD_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_CLOUD_ELEMENT__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Properties List</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_CLOUD_ELEMENT__PROPERTIES_LIST = 1;

	/**
	 * The feature id for the '<em><b>Resources List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_CLOUD_ELEMENT__RESOURCES_LIST = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_CLOUD_ELEMENT__ID = 3;

	/**
	 * The number of structural features of the '<em>Ddsm Cloud Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_CLOUD_ELEMENT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link es.unizar.disco.dice.DDSM.impl.DdsmComponentImpl <em>Ddsm Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unizar.disco.dice.DDSM.impl.DdsmComponentImpl
	 * @see es.unizar.disco.dice.DDSM.impl.DDSMPackageImpl#getDdsmComponent()
	 * @generated
	 */
	int DDSM_COMPONENT = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_COMPONENT__DESCRIPTION = DDSM_CLOUD_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Properties List</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_COMPONENT__PROPERTIES_LIST = DDSM_CLOUD_ELEMENT__PROPERTIES_LIST;

	/**
	 * The feature id for the '<em><b>Resources List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_COMPONENT__RESOURCES_LIST = DDSM_CLOUD_ELEMENT__RESOURCES_LIST;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_COMPONENT__ID = DDSM_CLOUD_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Provided Ports List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_COMPONENT__PROVIDED_PORTS_LIST = DDSM_CLOUD_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ddsm Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_COMPONENT_FEATURE_COUNT = DDSM_CLOUD_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link es.unizar.disco.dice.DDSM.impl.DdsmExternalComponentImpl <em>Ddsm External Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unizar.disco.dice.DDSM.impl.DdsmExternalComponentImpl
	 * @see es.unizar.disco.dice.DDSM.impl.DDSMPackageImpl#getDdsmExternalComponent()
	 * @generated
	 */
	int DDSM_EXTERNAL_COMPONENT = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_EXTERNAL_COMPONENT__DESCRIPTION = DDSM_COMPONENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Properties List</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_EXTERNAL_COMPONENT__PROPERTIES_LIST = DDSM_COMPONENT__PROPERTIES_LIST;

	/**
	 * The feature id for the '<em><b>Resources List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_EXTERNAL_COMPONENT__RESOURCES_LIST = DDSM_COMPONENT__RESOURCES_LIST;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_EXTERNAL_COMPONENT__ID = DDSM_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Provided Ports List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_EXTERNAL_COMPONENT__PROVIDED_PORTS_LIST = DDSM_COMPONENT__PROVIDED_PORTS_LIST;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_EXTERNAL_COMPONENT__LOCATION = DDSM_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Provider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_EXTERNAL_COMPONENT__PROVIDER = DDSM_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Service Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_EXTERNAL_COMPONENT__SERVICE_TYPE = DDSM_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_EXTERNAL_COMPONENT__REGION = DDSM_COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Login</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_EXTERNAL_COMPONENT__LOGIN = DDSM_COMPONENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_EXTERNAL_COMPONENT__PASSWORD = DDSM_COMPONENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Base Device</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_EXTERNAL_COMPONENT__BASE_DEVICE = DDSM_COMPONENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Ddsm External Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_EXTERNAL_COMPONENT_FEATURE_COUNT = DDSM_COMPONENT_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link es.unizar.disco.dice.DDSM.impl.DdsmResourceImpl <em>Ddsm Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unizar.disco.dice.DDSM.impl.DdsmResourceImpl
	 * @see es.unizar.disco.dice.DDSM.impl.DDSMPackageImpl#getDdsmResource()
	 * @generated
	 */
	int DDSM_RESOURCE = 3;

	/**
	 * The feature id for the '<em><b>Commands List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_RESOURCE__COMMANDS_LIST = 0;

	/**
	 * The feature id for the '<em><b>Base Artifact</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_RESOURCE__BASE_ARTIFACT = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_RESOURCE__ID = 2;

	/**
	 * The number of structural features of the '<em>Ddsm Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_RESOURCE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link es.unizar.disco.dice.DDSM.impl.DdsmPortImpl <em>Ddsm Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unizar.disco.dice.DDSM.impl.DdsmPortImpl
	 * @see es.unizar.disco.dice.DDSM.impl.DDSMPackageImpl#getDdsmPort()
	 * @generated
	 */
	int DDSM_PORT = 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_PORT__DESCRIPTION = DDSM_CLOUD_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Properties List</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_PORT__PROPERTIES_LIST = DDSM_CLOUD_ELEMENT__PROPERTIES_LIST;

	/**
	 * The feature id for the '<em><b>Resources List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_PORT__RESOURCES_LIST = DDSM_CLOUD_ELEMENT__RESOURCES_LIST;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_PORT__ID = DDSM_CLOUD_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Is Local</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_PORT__IS_LOCAL = DDSM_CLOUD_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Port Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_PORT__PORT_NUMBER = DDSM_CLOUD_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Base Communication Path</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_PORT__BASE_COMMUNICATION_PATH = DDSM_CLOUD_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Ddsm Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_PORT_FEATURE_COUNT = DDSM_CLOUD_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link es.unizar.disco.dice.DDSM.impl.DdsmInternalComponentImpl <em>Ddsm Internal Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unizar.disco.dice.DDSM.impl.DdsmInternalComponentImpl
	 * @see es.unizar.disco.dice.DDSM.impl.DDSMPackageImpl#getDdsmInternalComponent()
	 * @generated
	 */
	int DDSM_INTERNAL_COMPONENT = 5;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_INTERNAL_COMPONENT__DESCRIPTION = DDSM_COMPONENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Properties List</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_INTERNAL_COMPONENT__PROPERTIES_LIST = DDSM_COMPONENT__PROPERTIES_LIST;

	/**
	 * The feature id for the '<em><b>Resources List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_INTERNAL_COMPONENT__RESOURCES_LIST = DDSM_COMPONENT__RESOURCES_LIST;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_INTERNAL_COMPONENT__ID = DDSM_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Provided Ports List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_INTERNAL_COMPONENT__PROVIDED_PORTS_LIST = DDSM_COMPONENT__PROVIDED_PORTS_LIST;

	/**
	 * The feature id for the '<em><b>Required Port</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_INTERNAL_COMPONENT__REQUIRED_PORT = DDSM_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Front End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_INTERNAL_COMPONENT__IS_FRONT_END = DDSM_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Component Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_INTERNAL_COMPONENT__COMPONENT_TYPE = DDSM_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Base Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_INTERNAL_COMPONENT__BASE_NODE = DDSM_COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Ddsm Internal Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_INTERNAL_COMPONENT_FEATURE_COUNT = DDSM_COMPONENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link es.unizar.disco.dice.DDSM.impl.DdsmClusterImpl <em>Ddsm Cluster</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unizar.disco.dice.DDSM.impl.DdsmClusterImpl
	 * @see es.unizar.disco.dice.DDSM.impl.DDSMPackageImpl#getDdsmCluster()
	 * @generated
	 */
	int DDSM_CLUSTER = 6;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_CLUSTER__DESCRIPTION = DDSM_EXTERNAL_COMPONENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Properties List</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_CLUSTER__PROPERTIES_LIST = DDSM_EXTERNAL_COMPONENT__PROPERTIES_LIST;

	/**
	 * The feature id for the '<em><b>Resources List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_CLUSTER__RESOURCES_LIST = DDSM_EXTERNAL_COMPONENT__RESOURCES_LIST;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_CLUSTER__ID = DDSM_EXTERNAL_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Provided Ports List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_CLUSTER__PROVIDED_PORTS_LIST = DDSM_EXTERNAL_COMPONENT__PROVIDED_PORTS_LIST;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_CLUSTER__LOCATION = DDSM_EXTERNAL_COMPONENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Provider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_CLUSTER__PROVIDER = DDSM_EXTERNAL_COMPONENT__PROVIDER;

	/**
	 * The feature id for the '<em><b>Service Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_CLUSTER__SERVICE_TYPE = DDSM_EXTERNAL_COMPONENT__SERVICE_TYPE;

	/**
	 * The feature id for the '<em><b>Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_CLUSTER__REGION = DDSM_EXTERNAL_COMPONENT__REGION;

	/**
	 * The feature id for the '<em><b>Login</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_CLUSTER__LOGIN = DDSM_EXTERNAL_COMPONENT__LOGIN;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_CLUSTER__PASSWORD = DDSM_EXTERNAL_COMPONENT__PASSWORD;

	/**
	 * The feature id for the '<em><b>Base Device</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_CLUSTER__BASE_DEVICE = DDSM_EXTERNAL_COMPONENT__BASE_DEVICE;

	/**
	 * The feature id for the '<em><b>Has VM</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_CLUSTER__HAS_VM = DDSM_EXTERNAL_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ddsm Cluster</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_CLUSTER_FEATURE_COUNT = DDSM_EXTERNAL_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link es.unizar.disco.dice.DDSM.impl.DdsmVmImpl <em>Ddsm Vm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unizar.disco.dice.DDSM.impl.DdsmVmImpl
	 * @see es.unizar.disco.dice.DDSM.impl.DDSMPackageImpl#getDdsmVm()
	 * @generated
	 */
	int DDSM_VM = 7;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_VM__DESCRIPTION = DDSM_EXTERNAL_COMPONENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Properties List</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_VM__PROPERTIES_LIST = DDSM_EXTERNAL_COMPONENT__PROPERTIES_LIST;

	/**
	 * The feature id for the '<em><b>Resources List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_VM__RESOURCES_LIST = DDSM_EXTERNAL_COMPONENT__RESOURCES_LIST;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_VM__ID = DDSM_EXTERNAL_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Provided Ports List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_VM__PROVIDED_PORTS_LIST = DDSM_EXTERNAL_COMPONENT__PROVIDED_PORTS_LIST;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_VM__LOCATION = DDSM_EXTERNAL_COMPONENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Provider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_VM__PROVIDER = DDSM_EXTERNAL_COMPONENT__PROVIDER;

	/**
	 * The feature id for the '<em><b>Service Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_VM__SERVICE_TYPE = DDSM_EXTERNAL_COMPONENT__SERVICE_TYPE;

	/**
	 * The feature id for the '<em><b>Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_VM__REGION = DDSM_EXTERNAL_COMPONENT__REGION;

	/**
	 * The feature id for the '<em><b>Login</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_VM__LOGIN = DDSM_EXTERNAL_COMPONENT__LOGIN;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_VM__PASSWORD = DDSM_EXTERNAL_COMPONENT__PASSWORD;

	/**
	 * The feature id for the '<em><b>Base Device</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_VM__BASE_DEVICE = DDSM_EXTERNAL_COMPONENT__BASE_DEVICE;

	/**
	 * The feature id for the '<em><b>Is64os</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_VM__IS64OS = DDSM_EXTERNAL_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Image Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_VM__IMAGE_ID = DDSM_EXTERNAL_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Max Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_VM__MAX_CORES = DDSM_EXTERNAL_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Max Ram</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_VM__MAX_RAM = DDSM_EXTERNAL_COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Max Storage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_VM__MAX_STORAGE = DDSM_EXTERNAL_COMPONENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Min Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_VM__MIN_CORES = DDSM_EXTERNAL_COMPONENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Min Ram</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_VM__MIN_RAM = DDSM_EXTERNAL_COMPONENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Min Storage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_VM__MIN_STORAGE = DDSM_EXTERNAL_COMPONENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Os</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_VM__OS = DDSM_EXTERNAL_COMPONENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Security Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_VM__SECURITY_GROUP = DDSM_EXTERNAL_COMPONENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Private Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_VM__PRIVATE_KEY = DDSM_EXTERNAL_COMPONENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Ssh Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_VM__SSH_KEY = DDSM_EXTERNAL_COMPONENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Public Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_VM__PUBLIC_ADDRESS = DDSM_EXTERNAL_COMPONENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_VM__INSTANCES = DDSM_EXTERNAL_COMPONENT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Generic Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_VM__GENERIC_SIZE = DDSM_EXTERNAL_COMPONENT_FEATURE_COUNT + 14;

	/**
	 * The number of structural features of the '<em>Ddsm Vm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_VM_FEATURE_COUNT = DDSM_EXTERNAL_COMPONENT_FEATURE_COUNT + 15;

	/**
	 * The meta object id for the '{@link es.unizar.disco.dice.DDSM.impl.DdsmYarnResourceManagerImpl <em>Ddsm Yarn Resource Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unizar.disco.dice.DDSM.impl.DdsmYarnResourceManagerImpl
	 * @see es.unizar.disco.dice.DDSM.impl.DDSMPackageImpl#getDdsmYarnResourceManager()
	 * @generated
	 */
	int DDSM_YARN_RESOURCE_MANAGER = 8;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_YARN_RESOURCE_MANAGER__DESCRIPTION = DDSM_INTERNAL_COMPONENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Properties List</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_YARN_RESOURCE_MANAGER__PROPERTIES_LIST = DDSM_INTERNAL_COMPONENT__PROPERTIES_LIST;

	/**
	 * The feature id for the '<em><b>Resources List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_YARN_RESOURCE_MANAGER__RESOURCES_LIST = DDSM_INTERNAL_COMPONENT__RESOURCES_LIST;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_YARN_RESOURCE_MANAGER__ID = DDSM_INTERNAL_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Provided Ports List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_YARN_RESOURCE_MANAGER__PROVIDED_PORTS_LIST = DDSM_INTERNAL_COMPONENT__PROVIDED_PORTS_LIST;

	/**
	 * The feature id for the '<em><b>Required Port</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_YARN_RESOURCE_MANAGER__REQUIRED_PORT = DDSM_INTERNAL_COMPONENT__REQUIRED_PORT;

	/**
	 * The feature id for the '<em><b>Is Front End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_YARN_RESOURCE_MANAGER__IS_FRONT_END = DDSM_INTERNAL_COMPONENT__IS_FRONT_END;

	/**
	 * The feature id for the '<em><b>Component Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_YARN_RESOURCE_MANAGER__COMPONENT_TYPE = DDSM_INTERNAL_COMPONENT__COMPONENT_TYPE;

	/**
	 * The feature id for the '<em><b>Base Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_YARN_RESOURCE_MANAGER__BASE_NODE = DDSM_INTERNAL_COMPONENT__BASE_NODE;

	/**
	 * The number of structural features of the '<em>Ddsm Yarn Resource Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_YARN_RESOURCE_MANAGER_FEATURE_COUNT = DDSM_INTERNAL_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.unizar.disco.dice.DDSM.impl.DdsmZookeeperServerImpl <em>Ddsm Zookeeper Server</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unizar.disco.dice.DDSM.impl.DdsmZookeeperServerImpl
	 * @see es.unizar.disco.dice.DDSM.impl.DDSMPackageImpl#getDdsmZookeeperServer()
	 * @generated
	 */
	int DDSM_ZOOKEEPER_SERVER = 9;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_ZOOKEEPER_SERVER__DESCRIPTION = DDSM_INTERNAL_COMPONENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Properties List</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_ZOOKEEPER_SERVER__PROPERTIES_LIST = DDSM_INTERNAL_COMPONENT__PROPERTIES_LIST;

	/**
	 * The feature id for the '<em><b>Resources List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_ZOOKEEPER_SERVER__RESOURCES_LIST = DDSM_INTERNAL_COMPONENT__RESOURCES_LIST;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_ZOOKEEPER_SERVER__ID = DDSM_INTERNAL_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Provided Ports List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_ZOOKEEPER_SERVER__PROVIDED_PORTS_LIST = DDSM_INTERNAL_COMPONENT__PROVIDED_PORTS_LIST;

	/**
	 * The feature id for the '<em><b>Required Port</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_ZOOKEEPER_SERVER__REQUIRED_PORT = DDSM_INTERNAL_COMPONENT__REQUIRED_PORT;

	/**
	 * The feature id for the '<em><b>Is Front End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_ZOOKEEPER_SERVER__IS_FRONT_END = DDSM_INTERNAL_COMPONENT__IS_FRONT_END;

	/**
	 * The feature id for the '<em><b>Component Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_ZOOKEEPER_SERVER__COMPONENT_TYPE = DDSM_INTERNAL_COMPONENT__COMPONENT_TYPE;

	/**
	 * The feature id for the '<em><b>Base Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_ZOOKEEPER_SERVER__BASE_NODE = DDSM_INTERNAL_COMPONENT__BASE_NODE;

	/**
	 * The feature id for the '<em><b>Tick Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_ZOOKEEPER_SERVER__TICK_TIME = DDSM_INTERNAL_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sync Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_ZOOKEEPER_SERVER__SYNC_LIMIT = DDSM_INTERNAL_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Init Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_ZOOKEEPER_SERVER__INIT_LIMIT = DDSM_INTERNAL_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Ddsm Zookeeper Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_ZOOKEEPER_SERVER_FEATURE_COUNT = DDSM_INTERNAL_COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link es.unizar.disco.dice.DDSM.impl.DdsmKafkaImpl <em>Ddsm Kafka</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unizar.disco.dice.DDSM.impl.DdsmKafkaImpl
	 * @see es.unizar.disco.dice.DDSM.impl.DDSMPackageImpl#getDdsmKafka()
	 * @generated
	 */
	int DDSM_KAFKA = 10;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_KAFKA__DESCRIPTION = DDSM_INTERNAL_COMPONENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Properties List</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_KAFKA__PROPERTIES_LIST = DDSM_INTERNAL_COMPONENT__PROPERTIES_LIST;

	/**
	 * The feature id for the '<em><b>Resources List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_KAFKA__RESOURCES_LIST = DDSM_INTERNAL_COMPONENT__RESOURCES_LIST;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_KAFKA__ID = DDSM_INTERNAL_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Provided Ports List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_KAFKA__PROVIDED_PORTS_LIST = DDSM_INTERNAL_COMPONENT__PROVIDED_PORTS_LIST;

	/**
	 * The feature id for the '<em><b>Required Port</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_KAFKA__REQUIRED_PORT = DDSM_INTERNAL_COMPONENT__REQUIRED_PORT;

	/**
	 * The feature id for the '<em><b>Is Front End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_KAFKA__IS_FRONT_END = DDSM_INTERNAL_COMPONENT__IS_FRONT_END;

	/**
	 * The feature id for the '<em><b>Component Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_KAFKA__COMPONENT_TYPE = DDSM_INTERNAL_COMPONENT__COMPONENT_TYPE;

	/**
	 * The feature id for the '<em><b>Base Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_KAFKA__BASE_NODE = DDSM_INTERNAL_COMPONENT__BASE_NODE;

	/**
	 * The number of structural features of the '<em>Ddsm Kafka</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_KAFKA_FEATURE_COUNT = DDSM_INTERNAL_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.unizar.disco.dice.DDSM.impl.DdsmNimbusImpl <em>Ddsm Nimbus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unizar.disco.dice.DDSM.impl.DdsmNimbusImpl
	 * @see es.unizar.disco.dice.DDSM.impl.DDSMPackageImpl#getDdsmNimbus()
	 * @generated
	 */
	int DDSM_NIMBUS = 11;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_NIMBUS__DESCRIPTION = DDSM_INTERNAL_COMPONENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Properties List</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_NIMBUS__PROPERTIES_LIST = DDSM_INTERNAL_COMPONENT__PROPERTIES_LIST;

	/**
	 * The feature id for the '<em><b>Resources List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_NIMBUS__RESOURCES_LIST = DDSM_INTERNAL_COMPONENT__RESOURCES_LIST;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_NIMBUS__ID = DDSM_INTERNAL_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Provided Ports List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_NIMBUS__PROVIDED_PORTS_LIST = DDSM_INTERNAL_COMPONENT__PROVIDED_PORTS_LIST;

	/**
	 * The feature id for the '<em><b>Required Port</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_NIMBUS__REQUIRED_PORT = DDSM_INTERNAL_COMPONENT__REQUIRED_PORT;

	/**
	 * The feature id for the '<em><b>Is Front End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_NIMBUS__IS_FRONT_END = DDSM_INTERNAL_COMPONENT__IS_FRONT_END;

	/**
	 * The feature id for the '<em><b>Component Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_NIMBUS__COMPONENT_TYPE = DDSM_INTERNAL_COMPONENT__COMPONENT_TYPE;

	/**
	 * The feature id for the '<em><b>Base Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_NIMBUS__BASE_NODE = DDSM_INTERNAL_COMPONENT__BASE_NODE;

	/**
	 * The feature id for the '<em><b>Task Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_NIMBUS__TASK_TIMEOUT = DDSM_INTERNAL_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Supervisor Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_NIMBUS__SUPERVISOR_FREQUENCY = DDSM_INTERNAL_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Queue Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_NIMBUS__QUEUE_SIZE = DDSM_INTERNAL_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Monitor Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_NIMBUS__MONITOR_FREQUENCY = DDSM_INTERNAL_COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Retry Times</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_NIMBUS__RETRY_TIMES = DDSM_INTERNAL_COMPONENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Retry Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_NIMBUS__RETRY_INTERVAL = DDSM_INTERNAL_COMPONENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Ddsm Nimbus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_NIMBUS_FEATURE_COUNT = DDSM_INTERNAL_COMPONENT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link es.unizar.disco.dice.DDSM.impl.DdsmJobSubmissionImpl <em>Ddsm Job Submission</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unizar.disco.dice.DDSM.impl.DdsmJobSubmissionImpl
	 * @see es.unizar.disco.dice.DDSM.impl.DDSMPackageImpl#getDdsmJobSubmission()
	 * @generated
	 */
	int DDSM_JOB_SUBMISSION = 12;

	/**
	 * The feature id for the '<em><b>Base Deployment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_JOB_SUBMISSION__BASE_DEPLOYMENT = 0;

	/**
	 * The number of structural features of the '<em>Ddsm Job Submission</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_JOB_SUBMISSION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link es.unizar.disco.dice.DDSM.impl.DdsmSupervisorImpl <em>Ddsm Supervisor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unizar.disco.dice.DDSM.impl.DdsmSupervisorImpl
	 * @see es.unizar.disco.dice.DDSM.impl.DDSMPackageImpl#getDdsmSupervisor()
	 * @generated
	 */
	int DDSM_SUPERVISOR = 13;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_SUPERVISOR__DESCRIPTION = DDSM_INTERNAL_COMPONENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Properties List</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_SUPERVISOR__PROPERTIES_LIST = DDSM_INTERNAL_COMPONENT__PROPERTIES_LIST;

	/**
	 * The feature id for the '<em><b>Resources List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_SUPERVISOR__RESOURCES_LIST = DDSM_INTERNAL_COMPONENT__RESOURCES_LIST;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_SUPERVISOR__ID = DDSM_INTERNAL_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Provided Ports List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_SUPERVISOR__PROVIDED_PORTS_LIST = DDSM_INTERNAL_COMPONENT__PROVIDED_PORTS_LIST;

	/**
	 * The feature id for the '<em><b>Required Port</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_SUPERVISOR__REQUIRED_PORT = DDSM_INTERNAL_COMPONENT__REQUIRED_PORT;

	/**
	 * The feature id for the '<em><b>Is Front End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_SUPERVISOR__IS_FRONT_END = DDSM_INTERNAL_COMPONENT__IS_FRONT_END;

	/**
	 * The feature id for the '<em><b>Component Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_SUPERVISOR__COMPONENT_TYPE = DDSM_INTERNAL_COMPONENT__COMPONENT_TYPE;

	/**
	 * The feature id for the '<em><b>Base Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_SUPERVISOR__BASE_NODE = DDSM_INTERNAL_COMPONENT__BASE_NODE;

	/**
	 * The feature id for the '<em><b>Worker Start Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_SUPERVISOR__WORKER_START_TIMEOUT = DDSM_INTERNAL_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cpu Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_SUPERVISOR__CPU_CAPACITY = DDSM_INTERNAL_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Memory Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_SUPERVISOR__MEMORY_CAPACITY = DDSM_INTERNAL_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Heartbeat Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_SUPERVISOR__HEARTBEAT_FREQUENCY = DDSM_INTERNAL_COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Ddsm Supervisor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_SUPERVISOR_FEATURE_COUNT = DDSM_INTERNAL_COMPONENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link es.unizar.disco.dice.DDSM.impl.DdsmStormClusterImpl <em>Ddsm Storm Cluster</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unizar.disco.dice.DDSM.impl.DdsmStormClusterImpl
	 * @see es.unizar.disco.dice.DDSM.impl.DDSMPackageImpl#getDdsmStormCluster()
	 * @generated
	 */
	int DDSM_STORM_CLUSTER = 14;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_STORM_CLUSTER__DESCRIPTION = DDSM_INTERNAL_COMPONENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Properties List</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_STORM_CLUSTER__PROPERTIES_LIST = DDSM_INTERNAL_COMPONENT__PROPERTIES_LIST;

	/**
	 * The feature id for the '<em><b>Resources List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_STORM_CLUSTER__RESOURCES_LIST = DDSM_INTERNAL_COMPONENT__RESOURCES_LIST;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_STORM_CLUSTER__ID = DDSM_INTERNAL_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Provided Ports List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_STORM_CLUSTER__PROVIDED_PORTS_LIST = DDSM_INTERNAL_COMPONENT__PROVIDED_PORTS_LIST;

	/**
	 * The feature id for the '<em><b>Required Port</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_STORM_CLUSTER__REQUIRED_PORT = DDSM_INTERNAL_COMPONENT__REQUIRED_PORT;

	/**
	 * The feature id for the '<em><b>Is Front End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_STORM_CLUSTER__IS_FRONT_END = DDSM_INTERNAL_COMPONENT__IS_FRONT_END;

	/**
	 * The feature id for the '<em><b>Component Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_STORM_CLUSTER__COMPONENT_TYPE = DDSM_INTERNAL_COMPONENT__COMPONENT_TYPE;

	/**
	 * The feature id for the '<em><b>Base Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_STORM_CLUSTER__BASE_NODE = DDSM_INTERNAL_COMPONENT__BASE_NODE;

	/**
	 * The number of structural features of the '<em>Ddsm Storm Cluster</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_STORM_CLUSTER_FEATURE_COUNT = DDSM_INTERNAL_COMPONENT_FEATURE_COUNT + 0;


	/**
	 * The meta object id for the '{@link es.unizar.disco.dice.DDSM.impl.DdsmBigDataJobImpl <em>Ddsm Big Data Job</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unizar.disco.dice.DDSM.impl.DdsmBigDataJobImpl
	 * @see es.unizar.disco.dice.DDSM.impl.DDSMPackageImpl#getDdsmBigDataJob()
	 * @generated
	 */
	int DDSM_BIG_DATA_JOB = 15;

	/**
	 * The feature id for the '<em><b>Artifact URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_BIG_DATA_JOB__ARTIFACT_URL = 0;

	/**
	 * The feature id for the '<em><b>Main Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_BIG_DATA_JOB__MAIN_CLASS = 1;

	/**
	 * The feature id for the '<em><b>Base Artifact</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_BIG_DATA_JOB__BASE_ARTIFACT = 2;

	/**
	 * The number of structural features of the '<em>Ddsm Big Data Job</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_BIG_DATA_JOB_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link es.unizar.disco.dice.DDSM.impl.DdsmJobDeployedFromImpl <em>Ddsm Job Deployed From</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unizar.disco.dice.DDSM.impl.DdsmJobDeployedFromImpl
	 * @see es.unizar.disco.dice.DDSM.impl.DDSMPackageImpl#getDdsmJobDeployedFrom()
	 * @generated
	 */
	int DDSM_JOB_DEPLOYED_FROM = 16;

	/**
	 * The feature id for the '<em><b>Base Dependency</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_JOB_DEPLOYED_FROM__BASE_DEPENDENCY = 0;

	/**
	 * The number of structural features of the '<em>Ddsm Job Deployed From</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDSM_JOB_DEPLOYED_FROM_FEATURE_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link es.unizar.disco.dice.DDSM.DdsmExternalComponent <em>Ddsm External Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ddsm External Component</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmExternalComponent
	 * @generated
	 */
	EClass getDdsmExternalComponent();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DDSM.DdsmExternalComponent#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmExternalComponent#getLocation()
	 * @see #getDdsmExternalComponent()
	 * @generated
	 */
	EAttribute getDdsmExternalComponent_Location();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DDSM.DdsmExternalComponent#getProvider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Provider</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmExternalComponent#getProvider()
	 * @see #getDdsmExternalComponent()
	 * @generated
	 */
	EAttribute getDdsmExternalComponent_Provider();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DDSM.DdsmExternalComponent#getServiceType <em>Service Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Type</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmExternalComponent#getServiceType()
	 * @see #getDdsmExternalComponent()
	 * @generated
	 */
	EAttribute getDdsmExternalComponent_ServiceType();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DDSM.DdsmExternalComponent#getRegion <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Region</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmExternalComponent#getRegion()
	 * @see #getDdsmExternalComponent()
	 * @generated
	 */
	EAttribute getDdsmExternalComponent_Region();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DDSM.DdsmExternalComponent#getLogin <em>Login</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Login</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmExternalComponent#getLogin()
	 * @see #getDdsmExternalComponent()
	 * @generated
	 */
	EAttribute getDdsmExternalComponent_Login();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DDSM.DdsmExternalComponent#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmExternalComponent#getPassword()
	 * @see #getDdsmExternalComponent()
	 * @generated
	 */
	EAttribute getDdsmExternalComponent_Password();

	/**
	 * Returns the meta object for the reference '{@link es.unizar.disco.dice.DDSM.DdsmExternalComponent#getBase_Device <em>Base Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Device</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmExternalComponent#getBase_Device()
	 * @see #getDdsmExternalComponent()
	 * @generated
	 */
	EReference getDdsmExternalComponent_Base_Device();

	/**
	 * Returns the meta object for class '{@link es.unizar.disco.dice.DDSM.DdsmComponent <em>Ddsm Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ddsm Component</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmComponent
	 * @generated
	 */
	EClass getDdsmComponent();

	/**
	 * Returns the meta object for the reference list '{@link es.unizar.disco.dice.DDSM.DdsmComponent#getProvidedPortsList <em>Provided Ports List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Provided Ports List</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmComponent#getProvidedPortsList()
	 * @see #getDdsmComponent()
	 * @generated
	 */
	EReference getDdsmComponent_ProvidedPortsList();

	/**
	 * Returns the meta object for class '{@link es.unizar.disco.dice.DDSM.DdsmCloudElement <em>Ddsm Cloud Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ddsm Cloud Element</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmCloudElement
	 * @generated
	 */
	EClass getDdsmCloudElement();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DDSM.DdsmCloudElement#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmCloudElement#getDescription()
	 * @see #getDdsmCloudElement()
	 * @generated
	 */
	EAttribute getDdsmCloudElement_Description();

	/**
	 * Returns the meta object for the attribute list '{@link es.unizar.disco.dice.DDSM.DdsmCloudElement#getPropertiesList <em>Properties List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Properties List</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmCloudElement#getPropertiesList()
	 * @see #getDdsmCloudElement()
	 * @generated
	 */
	EAttribute getDdsmCloudElement_PropertiesList();

	/**
	 * Returns the meta object for the reference list '{@link es.unizar.disco.dice.DDSM.DdsmCloudElement#getResourcesList <em>Resources List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Resources List</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmCloudElement#getResourcesList()
	 * @see #getDdsmCloudElement()
	 * @generated
	 */
	EReference getDdsmCloudElement_ResourcesList();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DDSM.DdsmCloudElement#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmCloudElement#getId()
	 * @see #getDdsmCloudElement()
	 * @generated
	 */
	EAttribute getDdsmCloudElement_Id();

	/**
	 * Returns the meta object for class '{@link es.unizar.disco.dice.DDSM.DdsmResource <em>Ddsm Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ddsm Resource</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmResource
	 * @generated
	 */
	EClass getDdsmResource();

	/**
	 * Returns the meta object for the containment reference list '{@link es.unizar.disco.dice.DDSM.DdsmResource#getCommandsList <em>Commands List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Commands List</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmResource#getCommandsList()
	 * @see #getDdsmResource()
	 * @generated
	 */
	EReference getDdsmResource_CommandsList();

	/**
	 * Returns the meta object for the reference '{@link es.unizar.disco.dice.DDSM.DdsmResource#getBase_Artifact <em>Base Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Artifact</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmResource#getBase_Artifact()
	 * @see #getDdsmResource()
	 * @generated
	 */
	EReference getDdsmResource_Base_Artifact();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DDSM.DdsmResource#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmResource#getId()
	 * @see #getDdsmResource()
	 * @generated
	 */
	EAttribute getDdsmResource_Id();

	/**
	 * Returns the meta object for class '{@link es.unizar.disco.dice.DDSM.DdsmPort <em>Ddsm Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ddsm Port</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmPort
	 * @generated
	 */
	EClass getDdsmPort();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DDSM.DdsmPort#isLocal <em>Is Local</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Local</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmPort#isLocal()
	 * @see #getDdsmPort()
	 * @generated
	 */
	EAttribute getDdsmPort_IsLocal();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DDSM.DdsmPort#getPortNumber <em>Port Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port Number</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmPort#getPortNumber()
	 * @see #getDdsmPort()
	 * @generated
	 */
	EAttribute getDdsmPort_PortNumber();

	/**
	 * Returns the meta object for the reference '{@link es.unizar.disco.dice.DDSM.DdsmPort#getBase_CommunicationPath <em>Base Communication Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Communication Path</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmPort#getBase_CommunicationPath()
	 * @see #getDdsmPort()
	 * @generated
	 */
	EReference getDdsmPort_Base_CommunicationPath();

	/**
	 * Returns the meta object for class '{@link es.unizar.disco.dice.DDSM.DdsmInternalComponent <em>Ddsm Internal Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ddsm Internal Component</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmInternalComponent
	 * @generated
	 */
	EClass getDdsmInternalComponent();

	/**
	 * Returns the meta object for the reference list '{@link es.unizar.disco.dice.DDSM.DdsmInternalComponent#getRequiredPort <em>Required Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Required Port</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmInternalComponent#getRequiredPort()
	 * @see #getDdsmInternalComponent()
	 * @generated
	 */
	EReference getDdsmInternalComponent_RequiredPort();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DDSM.DdsmInternalComponent#isFrontEnd <em>Is Front End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Front End</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmInternalComponent#isFrontEnd()
	 * @see #getDdsmInternalComponent()
	 * @generated
	 */
	EAttribute getDdsmInternalComponent_IsFrontEnd();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DDSM.DdsmInternalComponent#getComponentType <em>Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Component Type</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmInternalComponent#getComponentType()
	 * @see #getDdsmInternalComponent()
	 * @generated
	 */
	EAttribute getDdsmInternalComponent_ComponentType();

	/**
	 * Returns the meta object for the reference '{@link es.unizar.disco.dice.DDSM.DdsmInternalComponent#getBase_Node <em>Base Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Node</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmInternalComponent#getBase_Node()
	 * @see #getDdsmInternalComponent()
	 * @generated
	 */
	EReference getDdsmInternalComponent_Base_Node();

	/**
	 * Returns the meta object for class '{@link es.unizar.disco.dice.DDSM.DdsmCluster <em>Ddsm Cluster</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ddsm Cluster</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmCluster
	 * @generated
	 */
	EClass getDdsmCluster();

	/**
	 * Returns the meta object for the reference list '{@link es.unizar.disco.dice.DDSM.DdsmCluster#getHasVM <em>Has VM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Has VM</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmCluster#getHasVM()
	 * @see #getDdsmCluster()
	 * @generated
	 */
	EReference getDdsmCluster_HasVM();

	/**
	 * Returns the meta object for class '{@link es.unizar.disco.dice.DDSM.DdsmVm <em>Ddsm Vm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ddsm Vm</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmVm
	 * @generated
	 */
	EClass getDdsmVm();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DDSM.DdsmVm#isIs64os <em>Is64os</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is64os</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmVm#isIs64os()
	 * @see #getDdsmVm()
	 * @generated
	 */
	EAttribute getDdsmVm_Is64os();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DDSM.DdsmVm#getImageId <em>Image Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image Id</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmVm#getImageId()
	 * @see #getDdsmVm()
	 * @generated
	 */
	EAttribute getDdsmVm_ImageId();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DDSM.DdsmVm#getMaxCores <em>Max Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Cores</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmVm#getMaxCores()
	 * @see #getDdsmVm()
	 * @generated
	 */
	EAttribute getDdsmVm_MaxCores();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DDSM.DdsmVm#getMaxRam <em>Max Ram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Ram</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmVm#getMaxRam()
	 * @see #getDdsmVm()
	 * @generated
	 */
	EAttribute getDdsmVm_MaxRam();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DDSM.DdsmVm#getMaxStorage <em>Max Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Storage</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmVm#getMaxStorage()
	 * @see #getDdsmVm()
	 * @generated
	 */
	EAttribute getDdsmVm_MaxStorage();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DDSM.DdsmVm#getMinCores <em>Min Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Cores</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmVm#getMinCores()
	 * @see #getDdsmVm()
	 * @generated
	 */
	EAttribute getDdsmVm_MinCores();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DDSM.DdsmVm#getMinRam <em>Min Ram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Ram</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmVm#getMinRam()
	 * @see #getDdsmVm()
	 * @generated
	 */
	EAttribute getDdsmVm_MinRam();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DDSM.DdsmVm#getMinStorage <em>Min Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Storage</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmVm#getMinStorage()
	 * @see #getDdsmVm()
	 * @generated
	 */
	EAttribute getDdsmVm_MinStorage();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DDSM.DdsmVm#getOs <em>Os</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Os</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmVm#getOs()
	 * @see #getDdsmVm()
	 * @generated
	 */
	EAttribute getDdsmVm_Os();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DDSM.DdsmVm#getSecurityGroup <em>Security Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Security Group</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmVm#getSecurityGroup()
	 * @see #getDdsmVm()
	 * @generated
	 */
	EAttribute getDdsmVm_SecurityGroup();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DDSM.DdsmVm#getPrivateKey <em>Private Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Private Key</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmVm#getPrivateKey()
	 * @see #getDdsmVm()
	 * @generated
	 */
	EAttribute getDdsmVm_PrivateKey();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DDSM.DdsmVm#getSshKey <em>Ssh Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ssh Key</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmVm#getSshKey()
	 * @see #getDdsmVm()
	 * @generated
	 */
	EAttribute getDdsmVm_SshKey();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DDSM.DdsmVm#getPublicAddress <em>Public Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Public Address</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmVm#getPublicAddress()
	 * @see #getDdsmVm()
	 * @generated
	 */
	EAttribute getDdsmVm_PublicAddress();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DDSM.DdsmVm#getInstances <em>Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instances</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmVm#getInstances()
	 * @see #getDdsmVm()
	 * @generated
	 */
	EAttribute getDdsmVm_Instances();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DDSM.DdsmVm#getGenericSize <em>Generic Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generic Size</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmVm#getGenericSize()
	 * @see #getDdsmVm()
	 * @generated
	 */
	EAttribute getDdsmVm_GenericSize();

	/**
	 * Returns the meta object for class '{@link es.unizar.disco.dice.DDSM.DdsmYarnResourceManager <em>Ddsm Yarn Resource Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ddsm Yarn Resource Manager</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmYarnResourceManager
	 * @generated
	 */
	EClass getDdsmYarnResourceManager();

	/**
	 * Returns the meta object for class '{@link es.unizar.disco.dice.DDSM.DdsmZookeeperServer <em>Ddsm Zookeeper Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ddsm Zookeeper Server</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmZookeeperServer
	 * @generated
	 */
	EClass getDdsmZookeeperServer();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DDSM.DdsmZookeeperServer#getTickTime <em>Tick Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tick Time</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmZookeeperServer#getTickTime()
	 * @see #getDdsmZookeeperServer()
	 * @generated
	 */
	EAttribute getDdsmZookeeperServer_TickTime();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DDSM.DdsmZookeeperServer#getSyncLimit <em>Sync Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sync Limit</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmZookeeperServer#getSyncLimit()
	 * @see #getDdsmZookeeperServer()
	 * @generated
	 */
	EAttribute getDdsmZookeeperServer_SyncLimit();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DDSM.DdsmZookeeperServer#getInitLimit <em>Init Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Init Limit</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmZookeeperServer#getInitLimit()
	 * @see #getDdsmZookeeperServer()
	 * @generated
	 */
	EAttribute getDdsmZookeeperServer_InitLimit();

	/**
	 * Returns the meta object for class '{@link es.unizar.disco.dice.DDSM.DdsmKafka <em>Ddsm Kafka</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ddsm Kafka</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmKafka
	 * @generated
	 */
	EClass getDdsmKafka();

	/**
	 * Returns the meta object for class '{@link es.unizar.disco.dice.DDSM.DdsmNimbus <em>Ddsm Nimbus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ddsm Nimbus</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmNimbus
	 * @generated
	 */
	EClass getDdsmNimbus();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DDSM.DdsmNimbus#getTaskTimeout <em>Task Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Task Timeout</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmNimbus#getTaskTimeout()
	 * @see #getDdsmNimbus()
	 * @generated
	 */
	EAttribute getDdsmNimbus_TaskTimeout();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DDSM.DdsmNimbus#getSupervisorFrequency <em>Supervisor Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Supervisor Frequency</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmNimbus#getSupervisorFrequency()
	 * @see #getDdsmNimbus()
	 * @generated
	 */
	EAttribute getDdsmNimbus_SupervisorFrequency();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DDSM.DdsmNimbus#getQueueSize <em>Queue Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Queue Size</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmNimbus#getQueueSize()
	 * @see #getDdsmNimbus()
	 * @generated
	 */
	EAttribute getDdsmNimbus_QueueSize();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DDSM.DdsmNimbus#getMonitorFrequency <em>Monitor Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Monitor Frequency</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmNimbus#getMonitorFrequency()
	 * @see #getDdsmNimbus()
	 * @generated
	 */
	EAttribute getDdsmNimbus_MonitorFrequency();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DDSM.DdsmNimbus#getRetryTimes <em>Retry Times</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Retry Times</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmNimbus#getRetryTimes()
	 * @see #getDdsmNimbus()
	 * @generated
	 */
	EAttribute getDdsmNimbus_RetryTimes();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DDSM.DdsmNimbus#getRetryInterval <em>Retry Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Retry Interval</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmNimbus#getRetryInterval()
	 * @see #getDdsmNimbus()
	 * @generated
	 */
	EAttribute getDdsmNimbus_RetryInterval();

	/**
	 * Returns the meta object for class '{@link es.unizar.disco.dice.DDSM.DdsmJobSubmission <em>Ddsm Job Submission</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ddsm Job Submission</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmJobSubmission
	 * @generated
	 */
	EClass getDdsmJobSubmission();

	/**
	 * Returns the meta object for the reference '{@link es.unizar.disco.dice.DDSM.DdsmJobSubmission#getBase_Deployment <em>Base Deployment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Deployment</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmJobSubmission#getBase_Deployment()
	 * @see #getDdsmJobSubmission()
	 * @generated
	 */
	EReference getDdsmJobSubmission_Base_Deployment();

	/**
	 * Returns the meta object for class '{@link es.unizar.disco.dice.DDSM.DdsmSupervisor <em>Ddsm Supervisor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ddsm Supervisor</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmSupervisor
	 * @generated
	 */
	EClass getDdsmSupervisor();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DDSM.DdsmSupervisor#getWorkerStartTimeout <em>Worker Start Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Worker Start Timeout</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmSupervisor#getWorkerStartTimeout()
	 * @see #getDdsmSupervisor()
	 * @generated
	 */
	EAttribute getDdsmSupervisor_WorkerStartTimeout();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DDSM.DdsmSupervisor#getCpuCapacity <em>Cpu Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cpu Capacity</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmSupervisor#getCpuCapacity()
	 * @see #getDdsmSupervisor()
	 * @generated
	 */
	EAttribute getDdsmSupervisor_CpuCapacity();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DDSM.DdsmSupervisor#getMemoryCapacity <em>Memory Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Memory Capacity</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmSupervisor#getMemoryCapacity()
	 * @see #getDdsmSupervisor()
	 * @generated
	 */
	EAttribute getDdsmSupervisor_MemoryCapacity();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DDSM.DdsmSupervisor#getHeartbeatFrequency <em>Heartbeat Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Heartbeat Frequency</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmSupervisor#getHeartbeatFrequency()
	 * @see #getDdsmSupervisor()
	 * @generated
	 */
	EAttribute getDdsmSupervisor_HeartbeatFrequency();

	/**
	 * Returns the meta object for class '{@link es.unizar.disco.dice.DDSM.DdsmStormCluster <em>Ddsm Storm Cluster</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ddsm Storm Cluster</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmStormCluster
	 * @generated
	 */
	EClass getDdsmStormCluster();

	/**
	 * Returns the meta object for class '{@link es.unizar.disco.dice.DDSM.DdsmBigDataJob <em>Ddsm Big Data Job</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ddsm Big Data Job</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmBigDataJob
	 * @generated
	 */
	EClass getDdsmBigDataJob();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DDSM.DdsmBigDataJob#getArtifactURL <em>Artifact URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Artifact URL</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmBigDataJob#getArtifactURL()
	 * @see #getDdsmBigDataJob()
	 * @generated
	 */
	EAttribute getDdsmBigDataJob_ArtifactURL();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DDSM.DdsmBigDataJob#getMainClass <em>Main Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Main Class</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmBigDataJob#getMainClass()
	 * @see #getDdsmBigDataJob()
	 * @generated
	 */
	EAttribute getDdsmBigDataJob_MainClass();

	/**
	 * Returns the meta object for the reference '{@link es.unizar.disco.dice.DDSM.DdsmBigDataJob#getBase_Artifact <em>Base Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Artifact</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmBigDataJob#getBase_Artifact()
	 * @see #getDdsmBigDataJob()
	 * @generated
	 */
	EReference getDdsmBigDataJob_Base_Artifact();

	/**
	 * Returns the meta object for class '{@link es.unizar.disco.dice.DDSM.DdsmJobDeployedFrom <em>Ddsm Job Deployed From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ddsm Job Deployed From</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmJobDeployedFrom
	 * @generated
	 */
	EClass getDdsmJobDeployedFrom();

	/**
	 * Returns the meta object for the reference '{@link es.unizar.disco.dice.DDSM.DdsmJobDeployedFrom#getBase_Dependency <em>Base Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Dependency</em>'.
	 * @see es.unizar.disco.dice.DDSM.DdsmJobDeployedFrom#getBase_Dependency()
	 * @see #getDdsmJobDeployedFrom()
	 * @generated
	 */
	EReference getDdsmJobDeployedFrom_Base_Dependency();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DDSMFactory getDDSMFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link es.unizar.disco.dice.DDSM.impl.DdsmExternalComponentImpl <em>Ddsm External Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unizar.disco.dice.DDSM.impl.DdsmExternalComponentImpl
		 * @see es.unizar.disco.dice.DDSM.impl.DDSMPackageImpl#getDdsmExternalComponent()
		 * @generated
		 */
		EClass DDSM_EXTERNAL_COMPONENT = eINSTANCE.getDdsmExternalComponent();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDSM_EXTERNAL_COMPONENT__LOCATION = eINSTANCE.getDdsmExternalComponent_Location();

		/**
		 * The meta object literal for the '<em><b>Provider</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDSM_EXTERNAL_COMPONENT__PROVIDER = eINSTANCE.getDdsmExternalComponent_Provider();

		/**
		 * The meta object literal for the '<em><b>Service Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDSM_EXTERNAL_COMPONENT__SERVICE_TYPE = eINSTANCE.getDdsmExternalComponent_ServiceType();

		/**
		 * The meta object literal for the '<em><b>Region</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDSM_EXTERNAL_COMPONENT__REGION = eINSTANCE.getDdsmExternalComponent_Region();

		/**
		 * The meta object literal for the '<em><b>Login</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDSM_EXTERNAL_COMPONENT__LOGIN = eINSTANCE.getDdsmExternalComponent_Login();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDSM_EXTERNAL_COMPONENT__PASSWORD = eINSTANCE.getDdsmExternalComponent_Password();

		/**
		 * The meta object literal for the '<em><b>Base Device</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDSM_EXTERNAL_COMPONENT__BASE_DEVICE = eINSTANCE.getDdsmExternalComponent_Base_Device();

		/**
		 * The meta object literal for the '{@link es.unizar.disco.dice.DDSM.impl.DdsmComponentImpl <em>Ddsm Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unizar.disco.dice.DDSM.impl.DdsmComponentImpl
		 * @see es.unizar.disco.dice.DDSM.impl.DDSMPackageImpl#getDdsmComponent()
		 * @generated
		 */
		EClass DDSM_COMPONENT = eINSTANCE.getDdsmComponent();

		/**
		 * The meta object literal for the '<em><b>Provided Ports List</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDSM_COMPONENT__PROVIDED_PORTS_LIST = eINSTANCE.getDdsmComponent_ProvidedPortsList();

		/**
		 * The meta object literal for the '{@link es.unizar.disco.dice.DDSM.impl.DdsmCloudElementImpl <em>Ddsm Cloud Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unizar.disco.dice.DDSM.impl.DdsmCloudElementImpl
		 * @see es.unizar.disco.dice.DDSM.impl.DDSMPackageImpl#getDdsmCloudElement()
		 * @generated
		 */
		EClass DDSM_CLOUD_ELEMENT = eINSTANCE.getDdsmCloudElement();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDSM_CLOUD_ELEMENT__DESCRIPTION = eINSTANCE.getDdsmCloudElement_Description();

		/**
		 * The meta object literal for the '<em><b>Properties List</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDSM_CLOUD_ELEMENT__PROPERTIES_LIST = eINSTANCE.getDdsmCloudElement_PropertiesList();

		/**
		 * The meta object literal for the '<em><b>Resources List</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDSM_CLOUD_ELEMENT__RESOURCES_LIST = eINSTANCE.getDdsmCloudElement_ResourcesList();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDSM_CLOUD_ELEMENT__ID = eINSTANCE.getDdsmCloudElement_Id();

		/**
		 * The meta object literal for the '{@link es.unizar.disco.dice.DDSM.impl.DdsmResourceImpl <em>Ddsm Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unizar.disco.dice.DDSM.impl.DdsmResourceImpl
		 * @see es.unizar.disco.dice.DDSM.impl.DDSMPackageImpl#getDdsmResource()
		 * @generated
		 */
		EClass DDSM_RESOURCE = eINSTANCE.getDdsmResource();

		/**
		 * The meta object literal for the '<em><b>Commands List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDSM_RESOURCE__COMMANDS_LIST = eINSTANCE.getDdsmResource_CommandsList();

		/**
		 * The meta object literal for the '<em><b>Base Artifact</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDSM_RESOURCE__BASE_ARTIFACT = eINSTANCE.getDdsmResource_Base_Artifact();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDSM_RESOURCE__ID = eINSTANCE.getDdsmResource_Id();

		/**
		 * The meta object literal for the '{@link es.unizar.disco.dice.DDSM.impl.DdsmPortImpl <em>Ddsm Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unizar.disco.dice.DDSM.impl.DdsmPortImpl
		 * @see es.unizar.disco.dice.DDSM.impl.DDSMPackageImpl#getDdsmPort()
		 * @generated
		 */
		EClass DDSM_PORT = eINSTANCE.getDdsmPort();

		/**
		 * The meta object literal for the '<em><b>Is Local</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDSM_PORT__IS_LOCAL = eINSTANCE.getDdsmPort_IsLocal();

		/**
		 * The meta object literal for the '<em><b>Port Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDSM_PORT__PORT_NUMBER = eINSTANCE.getDdsmPort_PortNumber();

		/**
		 * The meta object literal for the '<em><b>Base Communication Path</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDSM_PORT__BASE_COMMUNICATION_PATH = eINSTANCE.getDdsmPort_Base_CommunicationPath();

		/**
		 * The meta object literal for the '{@link es.unizar.disco.dice.DDSM.impl.DdsmInternalComponentImpl <em>Ddsm Internal Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unizar.disco.dice.DDSM.impl.DdsmInternalComponentImpl
		 * @see es.unizar.disco.dice.DDSM.impl.DDSMPackageImpl#getDdsmInternalComponent()
		 * @generated
		 */
		EClass DDSM_INTERNAL_COMPONENT = eINSTANCE.getDdsmInternalComponent();

		/**
		 * The meta object literal for the '<em><b>Required Port</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDSM_INTERNAL_COMPONENT__REQUIRED_PORT = eINSTANCE.getDdsmInternalComponent_RequiredPort();

		/**
		 * The meta object literal for the '<em><b>Is Front End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDSM_INTERNAL_COMPONENT__IS_FRONT_END = eINSTANCE.getDdsmInternalComponent_IsFrontEnd();

		/**
		 * The meta object literal for the '<em><b>Component Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDSM_INTERNAL_COMPONENT__COMPONENT_TYPE = eINSTANCE.getDdsmInternalComponent_ComponentType();

		/**
		 * The meta object literal for the '<em><b>Base Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDSM_INTERNAL_COMPONENT__BASE_NODE = eINSTANCE.getDdsmInternalComponent_Base_Node();

		/**
		 * The meta object literal for the '{@link es.unizar.disco.dice.DDSM.impl.DdsmClusterImpl <em>Ddsm Cluster</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unizar.disco.dice.DDSM.impl.DdsmClusterImpl
		 * @see es.unizar.disco.dice.DDSM.impl.DDSMPackageImpl#getDdsmCluster()
		 * @generated
		 */
		EClass DDSM_CLUSTER = eINSTANCE.getDdsmCluster();

		/**
		 * The meta object literal for the '<em><b>Has VM</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDSM_CLUSTER__HAS_VM = eINSTANCE.getDdsmCluster_HasVM();

		/**
		 * The meta object literal for the '{@link es.unizar.disco.dice.DDSM.impl.DdsmVmImpl <em>Ddsm Vm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unizar.disco.dice.DDSM.impl.DdsmVmImpl
		 * @see es.unizar.disco.dice.DDSM.impl.DDSMPackageImpl#getDdsmVm()
		 * @generated
		 */
		EClass DDSM_VM = eINSTANCE.getDdsmVm();

		/**
		 * The meta object literal for the '<em><b>Is64os</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDSM_VM__IS64OS = eINSTANCE.getDdsmVm_Is64os();

		/**
		 * The meta object literal for the '<em><b>Image Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDSM_VM__IMAGE_ID = eINSTANCE.getDdsmVm_ImageId();

		/**
		 * The meta object literal for the '<em><b>Max Cores</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDSM_VM__MAX_CORES = eINSTANCE.getDdsmVm_MaxCores();

		/**
		 * The meta object literal for the '<em><b>Max Ram</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDSM_VM__MAX_RAM = eINSTANCE.getDdsmVm_MaxRam();

		/**
		 * The meta object literal for the '<em><b>Max Storage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDSM_VM__MAX_STORAGE = eINSTANCE.getDdsmVm_MaxStorage();

		/**
		 * The meta object literal for the '<em><b>Min Cores</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDSM_VM__MIN_CORES = eINSTANCE.getDdsmVm_MinCores();

		/**
		 * The meta object literal for the '<em><b>Min Ram</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDSM_VM__MIN_RAM = eINSTANCE.getDdsmVm_MinRam();

		/**
		 * The meta object literal for the '<em><b>Min Storage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDSM_VM__MIN_STORAGE = eINSTANCE.getDdsmVm_MinStorage();

		/**
		 * The meta object literal for the '<em><b>Os</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDSM_VM__OS = eINSTANCE.getDdsmVm_Os();

		/**
		 * The meta object literal for the '<em><b>Security Group</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDSM_VM__SECURITY_GROUP = eINSTANCE.getDdsmVm_SecurityGroup();

		/**
		 * The meta object literal for the '<em><b>Private Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDSM_VM__PRIVATE_KEY = eINSTANCE.getDdsmVm_PrivateKey();

		/**
		 * The meta object literal for the '<em><b>Ssh Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDSM_VM__SSH_KEY = eINSTANCE.getDdsmVm_SshKey();

		/**
		 * The meta object literal for the '<em><b>Public Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDSM_VM__PUBLIC_ADDRESS = eINSTANCE.getDdsmVm_PublicAddress();

		/**
		 * The meta object literal for the '<em><b>Instances</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDSM_VM__INSTANCES = eINSTANCE.getDdsmVm_Instances();

		/**
		 * The meta object literal for the '<em><b>Generic Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDSM_VM__GENERIC_SIZE = eINSTANCE.getDdsmVm_GenericSize();

		/**
		 * The meta object literal for the '{@link es.unizar.disco.dice.DDSM.impl.DdsmYarnResourceManagerImpl <em>Ddsm Yarn Resource Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unizar.disco.dice.DDSM.impl.DdsmYarnResourceManagerImpl
		 * @see es.unizar.disco.dice.DDSM.impl.DDSMPackageImpl#getDdsmYarnResourceManager()
		 * @generated
		 */
		EClass DDSM_YARN_RESOURCE_MANAGER = eINSTANCE.getDdsmYarnResourceManager();

		/**
		 * The meta object literal for the '{@link es.unizar.disco.dice.DDSM.impl.DdsmZookeeperServerImpl <em>Ddsm Zookeeper Server</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unizar.disco.dice.DDSM.impl.DdsmZookeeperServerImpl
		 * @see es.unizar.disco.dice.DDSM.impl.DDSMPackageImpl#getDdsmZookeeperServer()
		 * @generated
		 */
		EClass DDSM_ZOOKEEPER_SERVER = eINSTANCE.getDdsmZookeeperServer();

		/**
		 * The meta object literal for the '<em><b>Tick Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDSM_ZOOKEEPER_SERVER__TICK_TIME = eINSTANCE.getDdsmZookeeperServer_TickTime();

		/**
		 * The meta object literal for the '<em><b>Sync Limit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDSM_ZOOKEEPER_SERVER__SYNC_LIMIT = eINSTANCE.getDdsmZookeeperServer_SyncLimit();

		/**
		 * The meta object literal for the '<em><b>Init Limit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDSM_ZOOKEEPER_SERVER__INIT_LIMIT = eINSTANCE.getDdsmZookeeperServer_InitLimit();

		/**
		 * The meta object literal for the '{@link es.unizar.disco.dice.DDSM.impl.DdsmKafkaImpl <em>Ddsm Kafka</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unizar.disco.dice.DDSM.impl.DdsmKafkaImpl
		 * @see es.unizar.disco.dice.DDSM.impl.DDSMPackageImpl#getDdsmKafka()
		 * @generated
		 */
		EClass DDSM_KAFKA = eINSTANCE.getDdsmKafka();

		/**
		 * The meta object literal for the '{@link es.unizar.disco.dice.DDSM.impl.DdsmNimbusImpl <em>Ddsm Nimbus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unizar.disco.dice.DDSM.impl.DdsmNimbusImpl
		 * @see es.unizar.disco.dice.DDSM.impl.DDSMPackageImpl#getDdsmNimbus()
		 * @generated
		 */
		EClass DDSM_NIMBUS = eINSTANCE.getDdsmNimbus();

		/**
		 * The meta object literal for the '<em><b>Task Timeout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDSM_NIMBUS__TASK_TIMEOUT = eINSTANCE.getDdsmNimbus_TaskTimeout();

		/**
		 * The meta object literal for the '<em><b>Supervisor Frequency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDSM_NIMBUS__SUPERVISOR_FREQUENCY = eINSTANCE.getDdsmNimbus_SupervisorFrequency();

		/**
		 * The meta object literal for the '<em><b>Queue Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDSM_NIMBUS__QUEUE_SIZE = eINSTANCE.getDdsmNimbus_QueueSize();

		/**
		 * The meta object literal for the '<em><b>Monitor Frequency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDSM_NIMBUS__MONITOR_FREQUENCY = eINSTANCE.getDdsmNimbus_MonitorFrequency();

		/**
		 * The meta object literal for the '<em><b>Retry Times</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDSM_NIMBUS__RETRY_TIMES = eINSTANCE.getDdsmNimbus_RetryTimes();

		/**
		 * The meta object literal for the '<em><b>Retry Interval</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDSM_NIMBUS__RETRY_INTERVAL = eINSTANCE.getDdsmNimbus_RetryInterval();

		/**
		 * The meta object literal for the '{@link es.unizar.disco.dice.DDSM.impl.DdsmJobSubmissionImpl <em>Ddsm Job Submission</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unizar.disco.dice.DDSM.impl.DdsmJobSubmissionImpl
		 * @see es.unizar.disco.dice.DDSM.impl.DDSMPackageImpl#getDdsmJobSubmission()
		 * @generated
		 */
		EClass DDSM_JOB_SUBMISSION = eINSTANCE.getDdsmJobSubmission();

		/**
		 * The meta object literal for the '<em><b>Base Deployment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDSM_JOB_SUBMISSION__BASE_DEPLOYMENT = eINSTANCE.getDdsmJobSubmission_Base_Deployment();

		/**
		 * The meta object literal for the '{@link es.unizar.disco.dice.DDSM.impl.DdsmSupervisorImpl <em>Ddsm Supervisor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unizar.disco.dice.DDSM.impl.DdsmSupervisorImpl
		 * @see es.unizar.disco.dice.DDSM.impl.DDSMPackageImpl#getDdsmSupervisor()
		 * @generated
		 */
		EClass DDSM_SUPERVISOR = eINSTANCE.getDdsmSupervisor();

		/**
		 * The meta object literal for the '<em><b>Worker Start Timeout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDSM_SUPERVISOR__WORKER_START_TIMEOUT = eINSTANCE.getDdsmSupervisor_WorkerStartTimeout();

		/**
		 * The meta object literal for the '<em><b>Cpu Capacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDSM_SUPERVISOR__CPU_CAPACITY = eINSTANCE.getDdsmSupervisor_CpuCapacity();

		/**
		 * The meta object literal for the '<em><b>Memory Capacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDSM_SUPERVISOR__MEMORY_CAPACITY = eINSTANCE.getDdsmSupervisor_MemoryCapacity();

		/**
		 * The meta object literal for the '<em><b>Heartbeat Frequency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDSM_SUPERVISOR__HEARTBEAT_FREQUENCY = eINSTANCE.getDdsmSupervisor_HeartbeatFrequency();

		/**
		 * The meta object literal for the '{@link es.unizar.disco.dice.DDSM.impl.DdsmStormClusterImpl <em>Ddsm Storm Cluster</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unizar.disco.dice.DDSM.impl.DdsmStormClusterImpl
		 * @see es.unizar.disco.dice.DDSM.impl.DDSMPackageImpl#getDdsmStormCluster()
		 * @generated
		 */
		EClass DDSM_STORM_CLUSTER = eINSTANCE.getDdsmStormCluster();

		/**
		 * The meta object literal for the '{@link es.unizar.disco.dice.DDSM.impl.DdsmBigDataJobImpl <em>Ddsm Big Data Job</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unizar.disco.dice.DDSM.impl.DdsmBigDataJobImpl
		 * @see es.unizar.disco.dice.DDSM.impl.DDSMPackageImpl#getDdsmBigDataJob()
		 * @generated
		 */
		EClass DDSM_BIG_DATA_JOB = eINSTANCE.getDdsmBigDataJob();

		/**
		 * The meta object literal for the '<em><b>Artifact URL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDSM_BIG_DATA_JOB__ARTIFACT_URL = eINSTANCE.getDdsmBigDataJob_ArtifactURL();

		/**
		 * The meta object literal for the '<em><b>Main Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDSM_BIG_DATA_JOB__MAIN_CLASS = eINSTANCE.getDdsmBigDataJob_MainClass();

		/**
		 * The meta object literal for the '<em><b>Base Artifact</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDSM_BIG_DATA_JOB__BASE_ARTIFACT = eINSTANCE.getDdsmBigDataJob_Base_Artifact();

		/**
		 * The meta object literal for the '{@link es.unizar.disco.dice.DDSM.impl.DdsmJobDeployedFromImpl <em>Ddsm Job Deployed From</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unizar.disco.dice.DDSM.impl.DdsmJobDeployedFromImpl
		 * @see es.unizar.disco.dice.DDSM.impl.DDSMPackageImpl#getDdsmJobDeployedFrom()
		 * @generated
		 */
		EClass DDSM_JOB_DEPLOYED_FROM = eINSTANCE.getDdsmJobDeployedFrom();

		/**
		 * The meta object literal for the '<em><b>Base Dependency</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDSM_JOB_DEPLOYED_FROM__BASE_DEPENDENCY = eINSTANCE.getDdsmJobDeployedFrom_Base_Dependency();

	}

} //DDSMPackage
