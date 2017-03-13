/**
 */
package es.unizar.disco.dice.DTSM.Storm;

import es.unizar.disco.dice.DTSM.Core.CorePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.papyrus.MARTE.MARTE_AnalysisModel.GQAM.GQAMPackage;

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
 * @see es.unizar.disco.dice.DTSM.Storm.StormFactory
 * @model kind="package"
 * @generated
 */
public interface StormPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Storm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://es.unizar.disco.dice/profiles/DTSM/Storm/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Storm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StormPackage eINSTANCE = es.unizar.disco.dice.DTSM.Storm.impl.StormPackageImpl.init();

	/**
	 * The meta object id for the '{@link es.unizar.disco.dice.DTSM.Storm.impl.StormBoltImpl <em>Bolt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unizar.disco.dice.DTSM.Storm.impl.StormBoltImpl
	 * @see es.unizar.disco.dice.DTSM.Storm.impl.StormPackageImpl#getStormBolt()
	 * @generated
	 */
	int STORM_BOLT = 0;

	/**
	 * The feature id for the '<em><b>Exec Time</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_BOLT__EXEC_TIME = CorePackage.CORE_DAG_NODE__EXEC_TIME;

	/**
	 * The feature id for the '<em><b>Allocated Memory</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_BOLT__ALLOCATED_MEMORY = CorePackage.CORE_DAG_NODE__ALLOCATED_MEMORY;

	/**
	 * The feature id for the '<em><b>Used Memory</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_BOLT__USED_MEMORY = CorePackage.CORE_DAG_NODE__USED_MEMORY;

	/**
	 * The feature id for the '<em><b>Power Peak</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_BOLT__POWER_PEAK = CorePackage.CORE_DAG_NODE__POWER_PEAK;

	/**
	 * The feature id for the '<em><b>Energy</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_BOLT__ENERGY = CorePackage.CORE_DAG_NODE__ENERGY;

	/**
	 * The feature id for the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_BOLT__BASE_NAMED_ELEMENT = CorePackage.CORE_DAG_NODE__BASE_NAMED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Sub Usage</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_BOLT__SUB_USAGE = CorePackage.CORE_DAG_NODE__SUB_USAGE;

	/**
	 * The feature id for the '<em><b>Used Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_BOLT__USED_RESOURCES = CorePackage.CORE_DAG_NODE__USED_RESOURCES;

	/**
	 * The feature id for the '<em><b>Msg Size</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_BOLT__MSG_SIZE = CorePackage.CORE_DAG_NODE__MSG_SIZE;

	/**
	 * The feature id for the '<em><b>On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_BOLT__ON = CorePackage.CORE_DAG_NODE__ON;

	/**
	 * The feature id for the '<em><b>Base Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_BOLT__BASE_ACTION = CorePackage.CORE_DAG_NODE__BASE_ACTION;

	/**
	 * The feature id for the '<em><b>Base Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_BOLT__BASE_BEHAVIOR = CorePackage.CORE_DAG_NODE__BASE_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Base Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_BOLT__BASE_MESSAGE = CorePackage.CORE_DAG_NODE__BASE_MESSAGE;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_BOLT__DURATION = CorePackage.CORE_DAG_NODE__DURATION;

	/**
	 * The feature id for the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_BOLT__START = CorePackage.CORE_DAG_NODE__START;

	/**
	 * The feature id for the '<em><b>Finish</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_BOLT__FINISH = CorePackage.CORE_DAG_NODE__FINISH;

	/**
	 * The feature id for the '<em><b>Cause</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_BOLT__CAUSE = CorePackage.CORE_DAG_NODE__CAUSE;

	/**
	 * The feature id for the '<em><b>Host Demand</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_BOLT__HOST_DEMAND = CorePackage.CORE_DAG_NODE__HOST_DEMAND;

	/**
	 * The feature id for the '<em><b>Host Demand Ops</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_BOLT__HOST_DEMAND_OPS = CorePackage.CORE_DAG_NODE__HOST_DEMAND_OPS;

	/**
	 * The feature id for the '<em><b>Inter Occ T</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_BOLT__INTER_OCC_T = CorePackage.CORE_DAG_NODE__INTER_OCC_T;

	/**
	 * The feature id for the '<em><b>Throughput</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_BOLT__THROUGHPUT = CorePackage.CORE_DAG_NODE__THROUGHPUT;

	/**
	 * The feature id for the '<em><b>Resp T</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_BOLT__RESP_T = CorePackage.CORE_DAG_NODE__RESP_T;

	/**
	 * The feature id for the '<em><b>Utilization</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_BOLT__UTILIZATION = CorePackage.CORE_DAG_NODE__UTILIZATION;

	/**
	 * The feature id for the '<em><b>Utilization On Host</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_BOLT__UTILIZATION_ON_HOST = CorePackage.CORE_DAG_NODE__UTILIZATION_ON_HOST;

	/**
	 * The feature id for the '<em><b>Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_BOLT__ROOT = CorePackage.CORE_DAG_NODE__ROOT;

	/**
	 * The feature id for the '<em><b>Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_BOLT__STEPS = CorePackage.CORE_DAG_NODE__STEPS;

	/**
	 * The feature id for the '<em><b>Parent Step</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_BOLT__PARENT_STEP = CorePackage.CORE_DAG_NODE__PARENT_STEP;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_BOLT__TIMING = CorePackage.CORE_DAG_NODE__TIMING;

	/**
	 * The feature id for the '<em><b>Is Atomic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_BOLT__IS_ATOMIC = CorePackage.CORE_DAG_NODE__IS_ATOMIC;

	/**
	 * The feature id for the '<em><b>Block T</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_BOLT__BLOCK_T = CorePackage.CORE_DAG_NODE__BLOCK_T;

	/**
	 * The feature id for the '<em><b>Rep</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_BOLT__REP = CorePackage.CORE_DAG_NODE__REP;

	/**
	 * The feature id for the '<em><b>Prob</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_BOLT__PROB = CorePackage.CORE_DAG_NODE__PROB;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_BOLT__PRIORITY = CorePackage.CORE_DAG_NODE__PRIORITY;

	/**
	 * The feature id for the '<em><b>Concur Res</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_BOLT__CONCUR_RES = CorePackage.CORE_DAG_NODE__CONCUR_RES;

	/**
	 * The feature id for the '<em><b>Host</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_BOLT__HOST = CorePackage.CORE_DAG_NODE__HOST;

	/**
	 * The feature id for the '<em><b>Serv Demand</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_BOLT__SERV_DEMAND = CorePackage.CORE_DAG_NODE__SERV_DEMAND;

	/**
	 * The feature id for the '<em><b>Serv Count</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_BOLT__SERV_COUNT = CorePackage.CORE_DAG_NODE__SERV_COUNT;

	/**
	 * The feature id for the '<em><b>Self Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_BOLT__SELF_DELAY = CorePackage.CORE_DAG_NODE__SELF_DELAY;

	/**
	 * The feature id for the '<em><b>Scenario</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_BOLT__SCENARIO = CorePackage.CORE_DAG_NODE__SCENARIO;

	/**
	 * The feature id for the '<em><b>Child Scenario</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_BOLT__CHILD_SCENARIO = CorePackage.CORE_DAG_NODE__CHILD_SCENARIO;

	/**
	 * The feature id for the '<em><b>Res Mult</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_BOLT__RES_MULT = CorePackage.CORE_DAG_NODE__RES_MULT;

	/**
	 * The feature id for the '<em><b>Is Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_BOLT__IS_PROTECTED = CorePackage.CORE_DAG_NODE__IS_PROTECTED;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_BOLT__IS_ACTIVE = CorePackage.CORE_DAG_NODE__IS_ACTIVE;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_BOLT__BASE_PROPERTY = CorePackage.CORE_DAG_NODE__BASE_PROPERTY;

	/**
	 * The feature id for the '<em><b>Base Instance Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_BOLT__BASE_INSTANCE_SPECIFICATION = CorePackage.CORE_DAG_NODE__BASE_INSTANCE_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Base Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_BOLT__BASE_CLASSIFIER = CorePackage.CORE_DAG_NODE__BASE_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Base Lifeline</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_BOLT__BASE_LIFELINE = CorePackage.CORE_DAG_NODE__BASE_LIFELINE;

	/**
	 * The feature id for the '<em><b>Base Connectable Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_BOLT__BASE_CONNECTABLE_ELEMENT = CorePackage.CORE_DAG_NODE__BASE_CONNECTABLE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Stateful</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_BOLT__STATEFUL = CorePackage.CORE_DAG_NODE__STATEFUL;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_BOLT__ORIGIN = CorePackage.CORE_DAG_NODE__ORIGIN;

	/**
	 * The feature id for the '<em><b>Failure Coverage</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_BOLT__FAILURE_COVERAGE = CorePackage.CORE_DAG_NODE__FAILURE_COVERAGE;

	/**
	 * The feature id for the '<em><b>Perc Perm Fault</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_BOLT__PERC_PERM_FAULT = CorePackage.CORE_DAG_NODE__PERC_PERM_FAULT;

	/**
	 * The feature id for the '<em><b>Ss Avail</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_BOLT__SS_AVAIL = CorePackage.CORE_DAG_NODE__SS_AVAIL;

	/**
	 * The feature id for the '<em><b>Unreliability</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_BOLT__UNRELIABILITY = CorePackage.CORE_DAG_NODE__UNRELIABILITY;

	/**
	 * The feature id for the '<em><b>Reliability</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_BOLT__RELIABILITY = CorePackage.CORE_DAG_NODE__RELIABILITY;

	/**
	 * The feature id for the '<em><b>Mission Time</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_BOLT__MISSION_TIME = CorePackage.CORE_DAG_NODE__MISSION_TIME;

	/**
	 * The feature id for the '<em><b>Avail Level</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_BOLT__AVAIL_LEVEL = CorePackage.CORE_DAG_NODE__AVAIL_LEVEL;

	/**
	 * The feature id for the '<em><b>Reliability Level</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_BOLT__RELIABILITY_LEVEL = CorePackage.CORE_DAG_NODE__RELIABILITY_LEVEL;

	/**
	 * The feature id for the '<em><b>Safety Level</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_BOLT__SAFETY_LEVEL = CorePackage.CORE_DAG_NODE__SAFETY_LEVEL;

	/**
	 * The feature id for the '<em><b>Complexity</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_BOLT__COMPLEXITY = CorePackage.CORE_DAG_NODE__COMPLEXITY;

	/**
	 * The feature id for the '<em><b>Fault</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_BOLT__FAULT = CorePackage.CORE_DAG_NODE__FAULT;

	/**
	 * The feature id for the '<em><b>Error</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_BOLT__ERROR = CorePackage.CORE_DAG_NODE__ERROR;

	/**
	 * The feature id for the '<em><b>Failure</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_BOLT__FAILURE = CorePackage.CORE_DAG_NODE__FAILURE;

	/**
	 * The feature id for the '<em><b>Hazard</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_BOLT__HAZARD = CorePackage.CORE_DAG_NODE__HAZARD;

	/**
	 * The feature id for the '<em><b>Repair</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_BOLT__REPAIR = CorePackage.CORE_DAG_NODE__REPAIR;

	/**
	 * The feature id for the '<em><b>Substituted By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_BOLT__SUBSTITUTED_BY = CorePackage.CORE_DAG_NODE__SUBSTITUTED_BY;

	/**
	 * The feature id for the '<em><b>Node Throughput</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_BOLT__NODE_THROUGHPUT = CorePackage.CORE_DAG_NODE__NODE_THROUGHPUT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_BOLT__TYPE = CorePackage.CORE_DAG_NODE__TYPE;

	/**
	 * The feature id for the '<em><b>Target Tech</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_BOLT__TARGET_TECH = CorePackage.CORE_DAG_NODE__TARGET_TECH;

	/**
	 * The feature id for the '<em><b>Proc Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_BOLT__PROC_TYPE = CorePackage.CORE_DAG_NODE__PROC_TYPE;

	/**
	 * The feature id for the '<em><b>Store</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_BOLT__STORE = CorePackage.CORE_DAG_NODE__STORE;

	/**
	 * The feature id for the '<em><b>Provides</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_BOLT__PROVIDES = CorePackage.CORE_DAG_NODE__PROVIDES;

	/**
	 * The feature id for the '<em><b>Source Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_BOLT__SOURCE_TYPE = CorePackage.CORE_DAG_NODE__SOURCE_TYPE;

	/**
	 * The feature id for the '<em><b>Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_BOLT__RATE = CorePackage.CORE_DAG_NODE__RATE;

	/**
	 * The feature id for the '<em><b>Parallelism</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_BOLT__PARALLELISM = CorePackage.CORE_DAG_NODE__PARALLELISM;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_BOLT__OPERATION = CorePackage.CORE_DAG_NODE__OPERATION;

	/**
	 * The feature id for the '<em><b>Has Successor</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_BOLT__HAS_SUCCESSOR = CorePackage.CORE_DAG_NODE__HAS_SUCCESSOR;

	/**
	 * The feature id for the '<em><b>D</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_BOLT__D = CorePackage.CORE_DAG_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Alpha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_BOLT__ALPHA = CorePackage.CORE_DAG_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sigma</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_BOLT__SIGMA = CorePackage.CORE_DAG_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Min Reboot Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_BOLT__MIN_REBOOT_TIME = CorePackage.CORE_DAG_NODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Max Reboot Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_BOLT__MAX_REBOOT_TIME = CorePackage.CORE_DAG_NODE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Bolt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_BOLT_FEATURE_COUNT = CorePackage.CORE_DAG_NODE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link es.unizar.disco.dice.DTSM.Storm.impl.StormSpoutImpl <em>Spout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unizar.disco.dice.DTSM.Storm.impl.StormSpoutImpl
	 * @see es.unizar.disco.dice.DTSM.Storm.impl.StormPackageImpl#getStormSpout()
	 * @generated
	 */
	int STORM_SPOUT = 1;

	/**
	 * The feature id for the '<em><b>Exec Time</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SPOUT__EXEC_TIME = CorePackage.CORE_DAG_SOURCE_NODE__EXEC_TIME;

	/**
	 * The feature id for the '<em><b>Allocated Memory</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SPOUT__ALLOCATED_MEMORY = CorePackage.CORE_DAG_SOURCE_NODE__ALLOCATED_MEMORY;

	/**
	 * The feature id for the '<em><b>Used Memory</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SPOUT__USED_MEMORY = CorePackage.CORE_DAG_SOURCE_NODE__USED_MEMORY;

	/**
	 * The feature id for the '<em><b>Power Peak</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SPOUT__POWER_PEAK = CorePackage.CORE_DAG_SOURCE_NODE__POWER_PEAK;

	/**
	 * The feature id for the '<em><b>Energy</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SPOUT__ENERGY = CorePackage.CORE_DAG_SOURCE_NODE__ENERGY;

	/**
	 * The feature id for the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SPOUT__BASE_NAMED_ELEMENT = CorePackage.CORE_DAG_SOURCE_NODE__BASE_NAMED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Sub Usage</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SPOUT__SUB_USAGE = CorePackage.CORE_DAG_SOURCE_NODE__SUB_USAGE;

	/**
	 * The feature id for the '<em><b>Used Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SPOUT__USED_RESOURCES = CorePackage.CORE_DAG_SOURCE_NODE__USED_RESOURCES;

	/**
	 * The feature id for the '<em><b>Msg Size</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SPOUT__MSG_SIZE = CorePackage.CORE_DAG_SOURCE_NODE__MSG_SIZE;

	/**
	 * The feature id for the '<em><b>On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SPOUT__ON = CorePackage.CORE_DAG_SOURCE_NODE__ON;

	/**
	 * The feature id for the '<em><b>Base Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SPOUT__BASE_ACTION = CorePackage.CORE_DAG_SOURCE_NODE__BASE_ACTION;

	/**
	 * The feature id for the '<em><b>Base Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SPOUT__BASE_BEHAVIOR = CorePackage.CORE_DAG_SOURCE_NODE__BASE_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Base Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SPOUT__BASE_MESSAGE = CorePackage.CORE_DAG_SOURCE_NODE__BASE_MESSAGE;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SPOUT__DURATION = CorePackage.CORE_DAG_SOURCE_NODE__DURATION;

	/**
	 * The feature id for the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SPOUT__START = CorePackage.CORE_DAG_SOURCE_NODE__START;

	/**
	 * The feature id for the '<em><b>Finish</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SPOUT__FINISH = CorePackage.CORE_DAG_SOURCE_NODE__FINISH;

	/**
	 * The feature id for the '<em><b>Cause</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SPOUT__CAUSE = CorePackage.CORE_DAG_SOURCE_NODE__CAUSE;

	/**
	 * The feature id for the '<em><b>Host Demand</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SPOUT__HOST_DEMAND = CorePackage.CORE_DAG_SOURCE_NODE__HOST_DEMAND;

	/**
	 * The feature id for the '<em><b>Host Demand Ops</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SPOUT__HOST_DEMAND_OPS = CorePackage.CORE_DAG_SOURCE_NODE__HOST_DEMAND_OPS;

	/**
	 * The feature id for the '<em><b>Inter Occ T</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SPOUT__INTER_OCC_T = CorePackage.CORE_DAG_SOURCE_NODE__INTER_OCC_T;

	/**
	 * The feature id for the '<em><b>Throughput</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SPOUT__THROUGHPUT = CorePackage.CORE_DAG_SOURCE_NODE__THROUGHPUT;

	/**
	 * The feature id for the '<em><b>Resp T</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SPOUT__RESP_T = CorePackage.CORE_DAG_SOURCE_NODE__RESP_T;

	/**
	 * The feature id for the '<em><b>Utilization</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SPOUT__UTILIZATION = CorePackage.CORE_DAG_SOURCE_NODE__UTILIZATION;

	/**
	 * The feature id for the '<em><b>Utilization On Host</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SPOUT__UTILIZATION_ON_HOST = CorePackage.CORE_DAG_SOURCE_NODE__UTILIZATION_ON_HOST;

	/**
	 * The feature id for the '<em><b>Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SPOUT__ROOT = CorePackage.CORE_DAG_SOURCE_NODE__ROOT;

	/**
	 * The feature id for the '<em><b>Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SPOUT__STEPS = CorePackage.CORE_DAG_SOURCE_NODE__STEPS;

	/**
	 * The feature id for the '<em><b>Parent Step</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SPOUT__PARENT_STEP = CorePackage.CORE_DAG_SOURCE_NODE__PARENT_STEP;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SPOUT__TIMING = CorePackage.CORE_DAG_SOURCE_NODE__TIMING;

	/**
	 * The feature id for the '<em><b>Is Atomic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SPOUT__IS_ATOMIC = CorePackage.CORE_DAG_SOURCE_NODE__IS_ATOMIC;

	/**
	 * The feature id for the '<em><b>Block T</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SPOUT__BLOCK_T = CorePackage.CORE_DAG_SOURCE_NODE__BLOCK_T;

	/**
	 * The feature id for the '<em><b>Rep</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SPOUT__REP = CorePackage.CORE_DAG_SOURCE_NODE__REP;

	/**
	 * The feature id for the '<em><b>Prob</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SPOUT__PROB = CorePackage.CORE_DAG_SOURCE_NODE__PROB;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SPOUT__PRIORITY = CorePackage.CORE_DAG_SOURCE_NODE__PRIORITY;

	/**
	 * The feature id for the '<em><b>Concur Res</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SPOUT__CONCUR_RES = CorePackage.CORE_DAG_SOURCE_NODE__CONCUR_RES;

	/**
	 * The feature id for the '<em><b>Host</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SPOUT__HOST = CorePackage.CORE_DAG_SOURCE_NODE__HOST;

	/**
	 * The feature id for the '<em><b>Serv Demand</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SPOUT__SERV_DEMAND = CorePackage.CORE_DAG_SOURCE_NODE__SERV_DEMAND;

	/**
	 * The feature id for the '<em><b>Serv Count</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SPOUT__SERV_COUNT = CorePackage.CORE_DAG_SOURCE_NODE__SERV_COUNT;

	/**
	 * The feature id for the '<em><b>Self Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SPOUT__SELF_DELAY = CorePackage.CORE_DAG_SOURCE_NODE__SELF_DELAY;

	/**
	 * The feature id for the '<em><b>Scenario</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SPOUT__SCENARIO = CorePackage.CORE_DAG_SOURCE_NODE__SCENARIO;

	/**
	 * The feature id for the '<em><b>Child Scenario</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SPOUT__CHILD_SCENARIO = CorePackage.CORE_DAG_SOURCE_NODE__CHILD_SCENARIO;

	/**
	 * The feature id for the '<em><b>Res Mult</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SPOUT__RES_MULT = CorePackage.CORE_DAG_SOURCE_NODE__RES_MULT;

	/**
	 * The feature id for the '<em><b>Is Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SPOUT__IS_PROTECTED = CorePackage.CORE_DAG_SOURCE_NODE__IS_PROTECTED;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SPOUT__IS_ACTIVE = CorePackage.CORE_DAG_SOURCE_NODE__IS_ACTIVE;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SPOUT__BASE_PROPERTY = CorePackage.CORE_DAG_SOURCE_NODE__BASE_PROPERTY;

	/**
	 * The feature id for the '<em><b>Base Instance Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SPOUT__BASE_INSTANCE_SPECIFICATION = CorePackage.CORE_DAG_SOURCE_NODE__BASE_INSTANCE_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Base Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SPOUT__BASE_CLASSIFIER = CorePackage.CORE_DAG_SOURCE_NODE__BASE_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Base Lifeline</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SPOUT__BASE_LIFELINE = CorePackage.CORE_DAG_SOURCE_NODE__BASE_LIFELINE;

	/**
	 * The feature id for the '<em><b>Base Connectable Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SPOUT__BASE_CONNECTABLE_ELEMENT = CorePackage.CORE_DAG_SOURCE_NODE__BASE_CONNECTABLE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Stateful</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SPOUT__STATEFUL = CorePackage.CORE_DAG_SOURCE_NODE__STATEFUL;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SPOUT__ORIGIN = CorePackage.CORE_DAG_SOURCE_NODE__ORIGIN;

	/**
	 * The feature id for the '<em><b>Failure Coverage</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SPOUT__FAILURE_COVERAGE = CorePackage.CORE_DAG_SOURCE_NODE__FAILURE_COVERAGE;

	/**
	 * The feature id for the '<em><b>Perc Perm Fault</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SPOUT__PERC_PERM_FAULT = CorePackage.CORE_DAG_SOURCE_NODE__PERC_PERM_FAULT;

	/**
	 * The feature id for the '<em><b>Ss Avail</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SPOUT__SS_AVAIL = CorePackage.CORE_DAG_SOURCE_NODE__SS_AVAIL;

	/**
	 * The feature id for the '<em><b>Unreliability</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SPOUT__UNRELIABILITY = CorePackage.CORE_DAG_SOURCE_NODE__UNRELIABILITY;

	/**
	 * The feature id for the '<em><b>Reliability</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SPOUT__RELIABILITY = CorePackage.CORE_DAG_SOURCE_NODE__RELIABILITY;

	/**
	 * The feature id for the '<em><b>Mission Time</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SPOUT__MISSION_TIME = CorePackage.CORE_DAG_SOURCE_NODE__MISSION_TIME;

	/**
	 * The feature id for the '<em><b>Avail Level</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SPOUT__AVAIL_LEVEL = CorePackage.CORE_DAG_SOURCE_NODE__AVAIL_LEVEL;

	/**
	 * The feature id for the '<em><b>Reliability Level</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SPOUT__RELIABILITY_LEVEL = CorePackage.CORE_DAG_SOURCE_NODE__RELIABILITY_LEVEL;

	/**
	 * The feature id for the '<em><b>Safety Level</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SPOUT__SAFETY_LEVEL = CorePackage.CORE_DAG_SOURCE_NODE__SAFETY_LEVEL;

	/**
	 * The feature id for the '<em><b>Complexity</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SPOUT__COMPLEXITY = CorePackage.CORE_DAG_SOURCE_NODE__COMPLEXITY;

	/**
	 * The feature id for the '<em><b>Fault</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SPOUT__FAULT = CorePackage.CORE_DAG_SOURCE_NODE__FAULT;

	/**
	 * The feature id for the '<em><b>Error</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SPOUT__ERROR = CorePackage.CORE_DAG_SOURCE_NODE__ERROR;

	/**
	 * The feature id for the '<em><b>Failure</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SPOUT__FAILURE = CorePackage.CORE_DAG_SOURCE_NODE__FAILURE;

	/**
	 * The feature id for the '<em><b>Hazard</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SPOUT__HAZARD = CorePackage.CORE_DAG_SOURCE_NODE__HAZARD;

	/**
	 * The feature id for the '<em><b>Repair</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SPOUT__REPAIR = CorePackage.CORE_DAG_SOURCE_NODE__REPAIR;

	/**
	 * The feature id for the '<em><b>Substituted By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SPOUT__SUBSTITUTED_BY = CorePackage.CORE_DAG_SOURCE_NODE__SUBSTITUTED_BY;

	/**
	 * The feature id for the '<em><b>Node Throughput</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SPOUT__NODE_THROUGHPUT = CorePackage.CORE_DAG_SOURCE_NODE__NODE_THROUGHPUT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SPOUT__TYPE = CorePackage.CORE_DAG_SOURCE_NODE__TYPE;

	/**
	 * The feature id for the '<em><b>Target Tech</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SPOUT__TARGET_TECH = CorePackage.CORE_DAG_SOURCE_NODE__TARGET_TECH;

	/**
	 * The feature id for the '<em><b>Proc Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SPOUT__PROC_TYPE = CorePackage.CORE_DAG_SOURCE_NODE__PROC_TYPE;

	/**
	 * The feature id for the '<em><b>Store</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SPOUT__STORE = CorePackage.CORE_DAG_SOURCE_NODE__STORE;

	/**
	 * The feature id for the '<em><b>Provides</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SPOUT__PROVIDES = CorePackage.CORE_DAG_SOURCE_NODE__PROVIDES;

	/**
	 * The feature id for the '<em><b>Source Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SPOUT__SOURCE_TYPE = CorePackage.CORE_DAG_SOURCE_NODE__SOURCE_TYPE;

	/**
	 * The feature id for the '<em><b>Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SPOUT__RATE = CorePackage.CORE_DAG_SOURCE_NODE__RATE;

	/**
	 * The feature id for the '<em><b>Parallelism</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SPOUT__PARALLELISM = CorePackage.CORE_DAG_SOURCE_NODE__PARALLELISM;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SPOUT__OPERATION = CorePackage.CORE_DAG_SOURCE_NODE__OPERATION;

	/**
	 * The feature id for the '<em><b>Has Successor</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SPOUT__HAS_SUCCESSOR = CorePackage.CORE_DAG_SOURCE_NODE__HAS_SUCCESSOR;

	/**
	 * The feature id for the '<em><b>Read From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SPOUT__READ_FROM = CorePackage.CORE_DAG_SOURCE_NODE__READ_FROM;

	/**
	 * The feature id for the '<em><b>Avg Emit Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SPOUT__AVG_EMIT_RATE = CorePackage.CORE_DAG_SOURCE_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Spout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SPOUT_FEATURE_COUNT = CorePackage.CORE_DAG_SOURCE_NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link es.unizar.disco.dice.DTSM.Storm.impl.StormScenarioTopologyImpl <em>Scenario Topology</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unizar.disco.dice.DTSM.Storm.impl.StormScenarioTopologyImpl
	 * @see es.unizar.disco.dice.DTSM.Storm.impl.StormPackageImpl#getStormScenarioTopology()
	 * @generated
	 */
	int STORM_SCENARIO_TOPOLOGY = 2;

	/**
	 * The feature id for the '<em><b>Exec Time</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SCENARIO_TOPOLOGY__EXEC_TIME = CorePackage.CORE_DIRECT_ACYCLIC_GRAPH__EXEC_TIME;

	/**
	 * The feature id for the '<em><b>Allocated Memory</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SCENARIO_TOPOLOGY__ALLOCATED_MEMORY = CorePackage.CORE_DIRECT_ACYCLIC_GRAPH__ALLOCATED_MEMORY;

	/**
	 * The feature id for the '<em><b>Used Memory</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SCENARIO_TOPOLOGY__USED_MEMORY = CorePackage.CORE_DIRECT_ACYCLIC_GRAPH__USED_MEMORY;

	/**
	 * The feature id for the '<em><b>Power Peak</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SCENARIO_TOPOLOGY__POWER_PEAK = CorePackage.CORE_DIRECT_ACYCLIC_GRAPH__POWER_PEAK;

	/**
	 * The feature id for the '<em><b>Energy</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SCENARIO_TOPOLOGY__ENERGY = CorePackage.CORE_DIRECT_ACYCLIC_GRAPH__ENERGY;

	/**
	 * The feature id for the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SCENARIO_TOPOLOGY__BASE_NAMED_ELEMENT = CorePackage.CORE_DIRECT_ACYCLIC_GRAPH__BASE_NAMED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Sub Usage</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SCENARIO_TOPOLOGY__SUB_USAGE = CorePackage.CORE_DIRECT_ACYCLIC_GRAPH__SUB_USAGE;

	/**
	 * The feature id for the '<em><b>Used Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SCENARIO_TOPOLOGY__USED_RESOURCES = CorePackage.CORE_DIRECT_ACYCLIC_GRAPH__USED_RESOURCES;

	/**
	 * The feature id for the '<em><b>Msg Size</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SCENARIO_TOPOLOGY__MSG_SIZE = CorePackage.CORE_DIRECT_ACYCLIC_GRAPH__MSG_SIZE;

	/**
	 * The feature id for the '<em><b>On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SCENARIO_TOPOLOGY__ON = CorePackage.CORE_DIRECT_ACYCLIC_GRAPH__ON;

	/**
	 * The feature id for the '<em><b>Base Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SCENARIO_TOPOLOGY__BASE_ACTION = CorePackage.CORE_DIRECT_ACYCLIC_GRAPH__BASE_ACTION;

	/**
	 * The feature id for the '<em><b>Base Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SCENARIO_TOPOLOGY__BASE_BEHAVIOR = CorePackage.CORE_DIRECT_ACYCLIC_GRAPH__BASE_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Base Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SCENARIO_TOPOLOGY__BASE_MESSAGE = CorePackage.CORE_DIRECT_ACYCLIC_GRAPH__BASE_MESSAGE;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SCENARIO_TOPOLOGY__DURATION = CorePackage.CORE_DIRECT_ACYCLIC_GRAPH__DURATION;

	/**
	 * The feature id for the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SCENARIO_TOPOLOGY__START = CorePackage.CORE_DIRECT_ACYCLIC_GRAPH__START;

	/**
	 * The feature id for the '<em><b>Finish</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SCENARIO_TOPOLOGY__FINISH = CorePackage.CORE_DIRECT_ACYCLIC_GRAPH__FINISH;

	/**
	 * The feature id for the '<em><b>Cause</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SCENARIO_TOPOLOGY__CAUSE = CorePackage.CORE_DIRECT_ACYCLIC_GRAPH__CAUSE;

	/**
	 * The feature id for the '<em><b>Host Demand</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SCENARIO_TOPOLOGY__HOST_DEMAND = CorePackage.CORE_DIRECT_ACYCLIC_GRAPH__HOST_DEMAND;

	/**
	 * The feature id for the '<em><b>Host Demand Ops</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SCENARIO_TOPOLOGY__HOST_DEMAND_OPS = CorePackage.CORE_DIRECT_ACYCLIC_GRAPH__HOST_DEMAND_OPS;

	/**
	 * The feature id for the '<em><b>Inter Occ T</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SCENARIO_TOPOLOGY__INTER_OCC_T = CorePackage.CORE_DIRECT_ACYCLIC_GRAPH__INTER_OCC_T;

	/**
	 * The feature id for the '<em><b>Throughput</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SCENARIO_TOPOLOGY__THROUGHPUT = CorePackage.CORE_DIRECT_ACYCLIC_GRAPH__THROUGHPUT;

	/**
	 * The feature id for the '<em><b>Resp T</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SCENARIO_TOPOLOGY__RESP_T = CorePackage.CORE_DIRECT_ACYCLIC_GRAPH__RESP_T;

	/**
	 * The feature id for the '<em><b>Utilization</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SCENARIO_TOPOLOGY__UTILIZATION = CorePackage.CORE_DIRECT_ACYCLIC_GRAPH__UTILIZATION;

	/**
	 * The feature id for the '<em><b>Utilization On Host</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SCENARIO_TOPOLOGY__UTILIZATION_ON_HOST = CorePackage.CORE_DIRECT_ACYCLIC_GRAPH__UTILIZATION_ON_HOST;

	/**
	 * The feature id for the '<em><b>Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SCENARIO_TOPOLOGY__ROOT = CorePackage.CORE_DIRECT_ACYCLIC_GRAPH__ROOT;

	/**
	 * The feature id for the '<em><b>Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SCENARIO_TOPOLOGY__STEPS = CorePackage.CORE_DIRECT_ACYCLIC_GRAPH__STEPS;

	/**
	 * The feature id for the '<em><b>Parent Step</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SCENARIO_TOPOLOGY__PARENT_STEP = CorePackage.CORE_DIRECT_ACYCLIC_GRAPH__PARENT_STEP;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SCENARIO_TOPOLOGY__TIMING = CorePackage.CORE_DIRECT_ACYCLIC_GRAPH__TIMING;

	/**
	 * The feature id for the '<em><b>Exec Prob</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SCENARIO_TOPOLOGY__EXEC_PROB = CorePackage.CORE_DIRECT_ACYCLIC_GRAPH__EXEC_PROB;

	/**
	 * The feature id for the '<em><b>Ss Avail</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SCENARIO_TOPOLOGY__SS_AVAIL = CorePackage.CORE_DIRECT_ACYCLIC_GRAPH__SS_AVAIL;

	/**
	 * The feature id for the '<em><b>Inst Avail</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SCENARIO_TOPOLOGY__INST_AVAIL = CorePackage.CORE_DIRECT_ACYCLIC_GRAPH__INST_AVAIL;

	/**
	 * The feature id for the '<em><b>Unreliability</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SCENARIO_TOPOLOGY__UNRELIABILITY = CorePackage.CORE_DIRECT_ACYCLIC_GRAPH__UNRELIABILITY;

	/**
	 * The feature id for the '<em><b>Reliability</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SCENARIO_TOPOLOGY__RELIABILITY = CorePackage.CORE_DIRECT_ACYCLIC_GRAPH__RELIABILITY;

	/**
	 * The feature id for the '<em><b>Mission Time</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SCENARIO_TOPOLOGY__MISSION_TIME = CorePackage.CORE_DIRECT_ACYCLIC_GRAPH__MISSION_TIME;

	/**
	 * The feature id for the '<em><b>Avail Level</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SCENARIO_TOPOLOGY__AVAIL_LEVEL = CorePackage.CORE_DIRECT_ACYCLIC_GRAPH__AVAIL_LEVEL;

	/**
	 * The feature id for the '<em><b>Reliab Level</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SCENARIO_TOPOLOGY__RELIAB_LEVEL = CorePackage.CORE_DIRECT_ACYCLIC_GRAPH__RELIAB_LEVEL;

	/**
	 * The feature id for the '<em><b>Safety Level</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SCENARIO_TOPOLOGY__SAFETY_LEVEL = CorePackage.CORE_DIRECT_ACYCLIC_GRAPH__SAFETY_LEVEL;

	/**
	 * The feature id for the '<em><b>Complexity</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SCENARIO_TOPOLOGY__COMPLEXITY = CorePackage.CORE_DIRECT_ACYCLIC_GRAPH__COMPLEXITY;

	/**
	 * The feature id for the '<em><b>Failure</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SCENARIO_TOPOLOGY__FAILURE = CorePackage.CORE_DIRECT_ACYCLIC_GRAPH__FAILURE;

	/**
	 * The feature id for the '<em><b>Hazard</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SCENARIO_TOPOLOGY__HAZARD = CorePackage.CORE_DIRECT_ACYCLIC_GRAPH__HAZARD;

	/**
	 * The feature id for the '<em><b>Recovery</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SCENARIO_TOPOLOGY__RECOVERY = CorePackage.CORE_DIRECT_ACYCLIC_GRAPH__RECOVERY;

	/**
	 * The feature id for the '<em><b>Conf Level</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SCENARIO_TOPOLOGY__CONF_LEVEL = CorePackage.CORE_DIRECT_ACYCLIC_GRAPH__CONF_LEVEL;

	/**
	 * The feature id for the '<em><b>Integ Level</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SCENARIO_TOPOLOGY__INTEG_LEVEL = CorePackage.CORE_DIRECT_ACYCLIC_GRAPH__INTEG_LEVEL;

	/**
	 * The feature id for the '<em><b>Has Source Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SCENARIO_TOPOLOGY__HAS_SOURCE_NODE = CorePackage.CORE_DIRECT_ACYCLIC_GRAPH__HAS_SOURCE_NODE;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SCENARIO_TOPOLOGY__BASE_CLASS = CorePackage.CORE_DIRECT_ACYCLIC_GRAPH__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Queue Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SCENARIO_TOPOLOGY__QUEUE_THRESHOLD = CorePackage.CORE_DIRECT_ACYCLIC_GRAPH_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max Task Parallelism</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SCENARIO_TOPOLOGY__MAX_TASK_PARALLELISM = CorePackage.CORE_DIRECT_ACYCLIC_GRAPH_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Max Spout Pending</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SCENARIO_TOPOLOGY__MAX_SPOUT_PENDING = CorePackage.CORE_DIRECT_ACYCLIC_GRAPH_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Reliable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SCENARIO_TOPOLOGY__IS_RELIABLE = CorePackage.CORE_DIRECT_ACYCLIC_GRAPH_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Scenario Topology</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SCENARIO_TOPOLOGY_FEATURE_COUNT = CorePackage.CORE_DIRECT_ACYCLIC_GRAPH_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link es.unizar.disco.dice.DTSM.Storm.impl.StormApplicationImpl <em>Application</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unizar.disco.dice.DTSM.Storm.impl.StormApplicationImpl
	 * @see es.unizar.disco.dice.DTSM.Storm.impl.StormPackageImpl#getStormApplication()
	 * @generated
	 */
	int STORM_APPLICATION = 3;

	/**
	 * The feature id for the '<em><b>Res Mult</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_APPLICATION__RES_MULT = CorePackage.CORE_COMPUTATION_NODE__RES_MULT;

	/**
	 * The feature id for the '<em><b>Is Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_APPLICATION__IS_PROTECTED = CorePackage.CORE_COMPUTATION_NODE__IS_PROTECTED;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_APPLICATION__IS_ACTIVE = CorePackage.CORE_COMPUTATION_NODE__IS_ACTIVE;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_APPLICATION__BASE_PROPERTY = CorePackage.CORE_COMPUTATION_NODE__BASE_PROPERTY;

	/**
	 * The feature id for the '<em><b>Base Instance Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_APPLICATION__BASE_INSTANCE_SPECIFICATION = CorePackage.CORE_COMPUTATION_NODE__BASE_INSTANCE_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Base Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_APPLICATION__BASE_CLASSIFIER = CorePackage.CORE_COMPUTATION_NODE__BASE_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Base Lifeline</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_APPLICATION__BASE_LIFELINE = CorePackage.CORE_COMPUTATION_NODE__BASE_LIFELINE;

	/**
	 * The feature id for the '<em><b>Base Connectable Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_APPLICATION__BASE_CONNECTABLE_ELEMENT = CorePackage.CORE_COMPUTATION_NODE__BASE_CONNECTABLE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Stateful</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_APPLICATION__STATEFUL = CorePackage.CORE_COMPUTATION_NODE__STATEFUL;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_APPLICATION__ORIGIN = CorePackage.CORE_COMPUTATION_NODE__ORIGIN;

	/**
	 * The feature id for the '<em><b>Failure Coverage</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_APPLICATION__FAILURE_COVERAGE = CorePackage.CORE_COMPUTATION_NODE__FAILURE_COVERAGE;

	/**
	 * The feature id for the '<em><b>Perc Perm Fault</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_APPLICATION__PERC_PERM_FAULT = CorePackage.CORE_COMPUTATION_NODE__PERC_PERM_FAULT;

	/**
	 * The feature id for the '<em><b>Ss Avail</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_APPLICATION__SS_AVAIL = CorePackage.CORE_COMPUTATION_NODE__SS_AVAIL;

	/**
	 * The feature id for the '<em><b>Unreliability</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_APPLICATION__UNRELIABILITY = CorePackage.CORE_COMPUTATION_NODE__UNRELIABILITY;

	/**
	 * The feature id for the '<em><b>Reliability</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_APPLICATION__RELIABILITY = CorePackage.CORE_COMPUTATION_NODE__RELIABILITY;

	/**
	 * The feature id for the '<em><b>Mission Time</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_APPLICATION__MISSION_TIME = CorePackage.CORE_COMPUTATION_NODE__MISSION_TIME;

	/**
	 * The feature id for the '<em><b>Avail Level</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_APPLICATION__AVAIL_LEVEL = CorePackage.CORE_COMPUTATION_NODE__AVAIL_LEVEL;

	/**
	 * The feature id for the '<em><b>Reliability Level</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_APPLICATION__RELIABILITY_LEVEL = CorePackage.CORE_COMPUTATION_NODE__RELIABILITY_LEVEL;

	/**
	 * The feature id for the '<em><b>Safety Level</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_APPLICATION__SAFETY_LEVEL = CorePackage.CORE_COMPUTATION_NODE__SAFETY_LEVEL;

	/**
	 * The feature id for the '<em><b>Complexity</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_APPLICATION__COMPLEXITY = CorePackage.CORE_COMPUTATION_NODE__COMPLEXITY;

	/**
	 * The feature id for the '<em><b>Fault</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_APPLICATION__FAULT = CorePackage.CORE_COMPUTATION_NODE__FAULT;

	/**
	 * The feature id for the '<em><b>Error</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_APPLICATION__ERROR = CorePackage.CORE_COMPUTATION_NODE__ERROR;

	/**
	 * The feature id for the '<em><b>Failure</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_APPLICATION__FAILURE = CorePackage.CORE_COMPUTATION_NODE__FAILURE;

	/**
	 * The feature id for the '<em><b>Hazard</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_APPLICATION__HAZARD = CorePackage.CORE_COMPUTATION_NODE__HAZARD;

	/**
	 * The feature id for the '<em><b>Repair</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_APPLICATION__REPAIR = CorePackage.CORE_COMPUTATION_NODE__REPAIR;

	/**
	 * The feature id for the '<em><b>Substituted By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_APPLICATION__SUBSTITUTED_BY = CorePackage.CORE_COMPUTATION_NODE__SUBSTITUTED_BY;

	/**
	 * The feature id for the '<em><b>Node Throughput</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_APPLICATION__NODE_THROUGHPUT = CorePackage.CORE_COMPUTATION_NODE__NODE_THROUGHPUT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_APPLICATION__TYPE = CorePackage.CORE_COMPUTATION_NODE__TYPE;

	/**
	 * The feature id for the '<em><b>Target Tech</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_APPLICATION__TARGET_TECH = CorePackage.CORE_COMPUTATION_NODE__TARGET_TECH;

	/**
	 * The feature id for the '<em><b>Proc Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_APPLICATION__PROC_TYPE = CorePackage.CORE_COMPUTATION_NODE__PROC_TYPE;

	/**
	 * The feature id for the '<em><b>Has Successor</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_APPLICATION__HAS_SUCCESSOR = CorePackage.CORE_COMPUTATION_NODE__HAS_SUCCESSOR;

	/**
	 * The feature id for the '<em><b>Process Input Data</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_APPLICATION__PROCESS_INPUT_DATA = CorePackage.CORE_COMPUTATION_NODE__PROCESS_INPUT_DATA;

	/**
	 * The feature id for the '<em><b>Realise</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_APPLICATION__REALISE = CorePackage.CORE_COMPUTATION_NODE__REALISE;

	/**
	 * The feature id for the '<em><b>Produce Output Data</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_APPLICATION__PRODUCE_OUTPUT_DATA = CorePackage.CORE_COMPUTATION_NODE__PRODUCE_OUTPUT_DATA;

	/**
	 * The feature id for the '<em><b>Has Master Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_APPLICATION__HAS_MASTER_NODE = CorePackage.CORE_COMPUTATION_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Has Slave Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_APPLICATION__HAS_SLAVE_NODE = CorePackage.CORE_COMPUTATION_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Depends On Zookeeper</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_APPLICATION__DEPENDS_ON_ZOOKEEPER = CorePackage.CORE_COMPUTATION_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_APPLICATION_FEATURE_COUNT = CorePackage.CORE_COMPUTATION_NODE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link es.unizar.disco.dice.DTSM.Storm.impl.StormNimbusImpl <em>Nimbus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unizar.disco.dice.DTSM.Storm.impl.StormNimbusImpl
	 * @see es.unizar.disco.dice.DTSM.Storm.impl.StormPackageImpl#getStormNimbus()
	 * @generated
	 */
	int STORM_NIMBUS = 4;

	/**
	 * The feature id for the '<em><b>Task Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_NIMBUS__TASK_TIMEOUT = 0;

	/**
	 * The feature id for the '<em><b>Supervisor Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_NIMBUS__SUPERVISOR_TIMEOUT = 1;

	/**
	 * The feature id for the '<em><b>Monitor Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_NIMBUS__MONITOR_FREQUENCY = 2;

	/**
	 * The feature id for the '<em><b>Base Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_NIMBUS__BASE_CLASSIFIER = 3;

	/**
	 * The number of structural features of the '<em>Nimbus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_NIMBUS_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link es.unizar.disco.dice.DTSM.Storm.impl.StormSupervisorImpl <em>Supervisor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unizar.disco.dice.DTSM.Storm.impl.StormSupervisorImpl
	 * @see es.unizar.disco.dice.DTSM.Storm.impl.StormPackageImpl#getStormSupervisor()
	 * @generated
	 */
	int STORM_SUPERVISOR = 5;

	/**
	 * The feature id for the '<em><b>Monitro Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SUPERVISOR__MONITRO_FREQUENCY = 0;

	/**
	 * The feature id for the '<em><b>Worker Satrt Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SUPERVISOR__WORKER_SATRT_TIMEOUT = 1;

	/**
	 * The feature id for the '<em><b>Worker Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SUPERVISOR__WORKER_TIMEOUT = 2;

	/**
	 * The feature id for the '<em><b>Heartbrack Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SUPERVISOR__HEARTBRACK_FREQUENCY = 3;

	/**
	 * The feature id for the '<em><b>Memory Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SUPERVISOR__MEMORY_CAPACITY = 4;

	/**
	 * The feature id for the '<em><b>Cpu Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SUPERVISOR__CPU_CAPACITY = 5;

	/**
	 * The feature id for the '<em><b>Base Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SUPERVISOR__BASE_CLASSIFIER = 6;

	/**
	 * The number of structural features of the '<em>Supervisor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SUPERVISOR_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link es.unizar.disco.dice.DTSM.Storm.impl.StormZookeeperImpl <em>Zookeeper</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unizar.disco.dice.DTSM.Storm.impl.StormZookeeperImpl
	 * @see es.unizar.disco.dice.DTSM.Storm.impl.StormPackageImpl#getStormZookeeper()
	 * @generated
	 */
	int STORM_ZOOKEEPER = 6;

	/**
	 * The feature id for the '<em><b>Session Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_ZOOKEEPER__SESSION_TIMEOUT = 0;

	/**
	 * The feature id for the '<em><b>Connection Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_ZOOKEEPER__CONNECTION_TIMEOUT = 1;

	/**
	 * The feature id for the '<em><b>Retry Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_ZOOKEEPER__RETRY_TIME = 2;

	/**
	 * The feature id for the '<em><b>Retry Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_ZOOKEEPER__RETRY_INTERVAL = 3;

	/**
	 * The feature id for the '<em><b>User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_ZOOKEEPER__USER = 4;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_ZOOKEEPER__PASSWORD = 5;

	/**
	 * The feature id for the '<em><b>Base Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_ZOOKEEPER__BASE_CLASSIFIER = 6;

	/**
	 * The number of structural features of the '<em>Zookeeper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_ZOOKEEPER_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link es.unizar.disco.dice.DTSM.Storm.impl.StormStreamStepImpl <em>Stream Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unizar.disco.dice.DTSM.Storm.impl.StormStreamStepImpl
	 * @see es.unizar.disco.dice.DTSM.Storm.impl.StormPackageImpl#getStormStreamStep()
	 * @generated
	 */
	int STORM_STREAM_STEP = 7;

	/**
	 * The feature id for the '<em><b>Exec Time</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_STREAM_STEP__EXEC_TIME = GQAMPackage.GA_STEP__EXEC_TIME;

	/**
	 * The feature id for the '<em><b>Allocated Memory</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_STREAM_STEP__ALLOCATED_MEMORY = GQAMPackage.GA_STEP__ALLOCATED_MEMORY;

	/**
	 * The feature id for the '<em><b>Used Memory</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_STREAM_STEP__USED_MEMORY = GQAMPackage.GA_STEP__USED_MEMORY;

	/**
	 * The feature id for the '<em><b>Power Peak</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_STREAM_STEP__POWER_PEAK = GQAMPackage.GA_STEP__POWER_PEAK;

	/**
	 * The feature id for the '<em><b>Energy</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_STREAM_STEP__ENERGY = GQAMPackage.GA_STEP__ENERGY;

	/**
	 * The feature id for the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_STREAM_STEP__BASE_NAMED_ELEMENT = GQAMPackage.GA_STEP__BASE_NAMED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Sub Usage</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_STREAM_STEP__SUB_USAGE = GQAMPackage.GA_STEP__SUB_USAGE;

	/**
	 * The feature id for the '<em><b>Used Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_STREAM_STEP__USED_RESOURCES = GQAMPackage.GA_STEP__USED_RESOURCES;

	/**
	 * The feature id for the '<em><b>Msg Size</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_STREAM_STEP__MSG_SIZE = GQAMPackage.GA_STEP__MSG_SIZE;

	/**
	 * The feature id for the '<em><b>On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_STREAM_STEP__ON = GQAMPackage.GA_STEP__ON;

	/**
	 * The feature id for the '<em><b>Base Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_STREAM_STEP__BASE_ACTION = GQAMPackage.GA_STEP__BASE_ACTION;

	/**
	 * The feature id for the '<em><b>Base Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_STREAM_STEP__BASE_BEHAVIOR = GQAMPackage.GA_STEP__BASE_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Base Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_STREAM_STEP__BASE_MESSAGE = GQAMPackage.GA_STEP__BASE_MESSAGE;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_STREAM_STEP__DURATION = GQAMPackage.GA_STEP__DURATION;

	/**
	 * The feature id for the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_STREAM_STEP__START = GQAMPackage.GA_STEP__START;

	/**
	 * The feature id for the '<em><b>Finish</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_STREAM_STEP__FINISH = GQAMPackage.GA_STEP__FINISH;

	/**
	 * The feature id for the '<em><b>Cause</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_STREAM_STEP__CAUSE = GQAMPackage.GA_STEP__CAUSE;

	/**
	 * The feature id for the '<em><b>Host Demand</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_STREAM_STEP__HOST_DEMAND = GQAMPackage.GA_STEP__HOST_DEMAND;

	/**
	 * The feature id for the '<em><b>Host Demand Ops</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_STREAM_STEP__HOST_DEMAND_OPS = GQAMPackage.GA_STEP__HOST_DEMAND_OPS;

	/**
	 * The feature id for the '<em><b>Inter Occ T</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_STREAM_STEP__INTER_OCC_T = GQAMPackage.GA_STEP__INTER_OCC_T;

	/**
	 * The feature id for the '<em><b>Throughput</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_STREAM_STEP__THROUGHPUT = GQAMPackage.GA_STEP__THROUGHPUT;

	/**
	 * The feature id for the '<em><b>Resp T</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_STREAM_STEP__RESP_T = GQAMPackage.GA_STEP__RESP_T;

	/**
	 * The feature id for the '<em><b>Utilization</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_STREAM_STEP__UTILIZATION = GQAMPackage.GA_STEP__UTILIZATION;

	/**
	 * The feature id for the '<em><b>Utilization On Host</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_STREAM_STEP__UTILIZATION_ON_HOST = GQAMPackage.GA_STEP__UTILIZATION_ON_HOST;

	/**
	 * The feature id for the '<em><b>Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_STREAM_STEP__ROOT = GQAMPackage.GA_STEP__ROOT;

	/**
	 * The feature id for the '<em><b>Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_STREAM_STEP__STEPS = GQAMPackage.GA_STEP__STEPS;

	/**
	 * The feature id for the '<em><b>Parent Step</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_STREAM_STEP__PARENT_STEP = GQAMPackage.GA_STEP__PARENT_STEP;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_STREAM_STEP__TIMING = GQAMPackage.GA_STEP__TIMING;

	/**
	 * The feature id for the '<em><b>Is Atomic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_STREAM_STEP__IS_ATOMIC = GQAMPackage.GA_STEP__IS_ATOMIC;

	/**
	 * The feature id for the '<em><b>Block T</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_STREAM_STEP__BLOCK_T = GQAMPackage.GA_STEP__BLOCK_T;

	/**
	 * The feature id for the '<em><b>Rep</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_STREAM_STEP__REP = GQAMPackage.GA_STEP__REP;

	/**
	 * The feature id for the '<em><b>Prob</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_STREAM_STEP__PROB = GQAMPackage.GA_STEP__PROB;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_STREAM_STEP__PRIORITY = GQAMPackage.GA_STEP__PRIORITY;

	/**
	 * The feature id for the '<em><b>Concur Res</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_STREAM_STEP__CONCUR_RES = GQAMPackage.GA_STEP__CONCUR_RES;

	/**
	 * The feature id for the '<em><b>Host</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_STREAM_STEP__HOST = GQAMPackage.GA_STEP__HOST;

	/**
	 * The feature id for the '<em><b>Serv Demand</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_STREAM_STEP__SERV_DEMAND = GQAMPackage.GA_STEP__SERV_DEMAND;

	/**
	 * The feature id for the '<em><b>Serv Count</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_STREAM_STEP__SERV_COUNT = GQAMPackage.GA_STEP__SERV_COUNT;

	/**
	 * The feature id for the '<em><b>Self Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_STREAM_STEP__SELF_DELAY = GQAMPackage.GA_STEP__SELF_DELAY;

	/**
	 * The feature id for the '<em><b>Scenario</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_STREAM_STEP__SCENARIO = GQAMPackage.GA_STEP__SCENARIO;

	/**
	 * The feature id for the '<em><b>Child Scenario</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_STREAM_STEP__CHILD_SCENARIO = GQAMPackage.GA_STEP__CHILD_SCENARIO;

	/**
	 * The feature id for the '<em><b>Num Tuples</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_STREAM_STEP__NUM_TUPLES = GQAMPackage.GA_STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Grouping</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_STREAM_STEP__GROUPING = GQAMPackage.GA_STEP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Prob Fields</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_STREAM_STEP__PROB_FIELDS = GQAMPackage.GA_STEP_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Stream Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_STREAM_STEP_FEATURE_COUNT = GQAMPackage.GA_STEP_FEATURE_COUNT + 3;


	/**
	 * Returns the meta object for class '{@link es.unizar.disco.dice.DTSM.Storm.StormBolt <em>Bolt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bolt</em>'.
	 * @see es.unizar.disco.dice.DTSM.Storm.StormBolt
	 * @generated
	 */
	EClass getStormBolt();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DTSM.Storm.StormBolt#getD <em>D</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>D</em>'.
	 * @see es.unizar.disco.dice.DTSM.Storm.StormBolt#getD()
	 * @see #getStormBolt()
	 * @generated
	 */
	EAttribute getStormBolt_D();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DTSM.Storm.StormBolt#getAlpha <em>Alpha</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alpha</em>'.
	 * @see es.unizar.disco.dice.DTSM.Storm.StormBolt#getAlpha()
	 * @see #getStormBolt()
	 * @generated
	 */
	EAttribute getStormBolt_Alpha();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DTSM.Storm.StormBolt#getSigma <em>Sigma</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sigma</em>'.
	 * @see es.unizar.disco.dice.DTSM.Storm.StormBolt#getSigma()
	 * @see #getStormBolt()
	 * @generated
	 */
	EAttribute getStormBolt_Sigma();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DTSM.Storm.StormBolt#getMinRebootTime <em>Min Reboot Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Reboot Time</em>'.
	 * @see es.unizar.disco.dice.DTSM.Storm.StormBolt#getMinRebootTime()
	 * @see #getStormBolt()
	 * @generated
	 */
	EAttribute getStormBolt_MinRebootTime();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DTSM.Storm.StormBolt#getMaxRebootTime <em>Max Reboot Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Reboot Time</em>'.
	 * @see es.unizar.disco.dice.DTSM.Storm.StormBolt#getMaxRebootTime()
	 * @see #getStormBolt()
	 * @generated
	 */
	EAttribute getStormBolt_MaxRebootTime();

	/**
	 * Returns the meta object for class '{@link es.unizar.disco.dice.DTSM.Storm.StormSpout <em>Spout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spout</em>'.
	 * @see es.unizar.disco.dice.DTSM.Storm.StormSpout
	 * @generated
	 */
	EClass getStormSpout();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DTSM.Storm.StormSpout#getAvgEmitRate <em>Avg Emit Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Avg Emit Rate</em>'.
	 * @see es.unizar.disco.dice.DTSM.Storm.StormSpout#getAvgEmitRate()
	 * @see #getStormSpout()
	 * @generated
	 */
	EAttribute getStormSpout_AvgEmitRate();

	/**
	 * Returns the meta object for class '{@link es.unizar.disco.dice.DTSM.Storm.StormScenarioTopology <em>Scenario Topology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scenario Topology</em>'.
	 * @see es.unizar.disco.dice.DTSM.Storm.StormScenarioTopology
	 * @generated
	 */
	EClass getStormScenarioTopology();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DTSM.Storm.StormScenarioTopology#getQueueThreshold <em>Queue Threshold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Queue Threshold</em>'.
	 * @see es.unizar.disco.dice.DTSM.Storm.StormScenarioTopology#getQueueThreshold()
	 * @see #getStormScenarioTopology()
	 * @generated
	 */
	EAttribute getStormScenarioTopology_QueueThreshold();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DTSM.Storm.StormScenarioTopology#getMaxTaskParallelism <em>Max Task Parallelism</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Task Parallelism</em>'.
	 * @see es.unizar.disco.dice.DTSM.Storm.StormScenarioTopology#getMaxTaskParallelism()
	 * @see #getStormScenarioTopology()
	 * @generated
	 */
	EAttribute getStormScenarioTopology_MaxTaskParallelism();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DTSM.Storm.StormScenarioTopology#getMaxSpoutPending <em>Max Spout Pending</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Spout Pending</em>'.
	 * @see es.unizar.disco.dice.DTSM.Storm.StormScenarioTopology#getMaxSpoutPending()
	 * @see #getStormScenarioTopology()
	 * @generated
	 */
	EAttribute getStormScenarioTopology_MaxSpoutPending();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DTSM.Storm.StormScenarioTopology#isReliable <em>Is Reliable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Reliable</em>'.
	 * @see es.unizar.disco.dice.DTSM.Storm.StormScenarioTopology#isReliable()
	 * @see #getStormScenarioTopology()
	 * @generated
	 */
	EAttribute getStormScenarioTopology_IsReliable();

	/**
	 * Returns the meta object for class '{@link es.unizar.disco.dice.DTSM.Storm.StormApplication <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application</em>'.
	 * @see es.unizar.disco.dice.DTSM.Storm.StormApplication
	 * @generated
	 */
	EClass getStormApplication();

	/**
	 * Returns the meta object for the reference '{@link es.unizar.disco.dice.DTSM.Storm.StormApplication#getHasMasterNode <em>Has Master Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has Master Node</em>'.
	 * @see es.unizar.disco.dice.DTSM.Storm.StormApplication#getHasMasterNode()
	 * @see #getStormApplication()
	 * @generated
	 */
	EReference getStormApplication_HasMasterNode();

	/**
	 * Returns the meta object for the reference '{@link es.unizar.disco.dice.DTSM.Storm.StormApplication#getHasSlaveNode <em>Has Slave Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has Slave Node</em>'.
	 * @see es.unizar.disco.dice.DTSM.Storm.StormApplication#getHasSlaveNode()
	 * @see #getStormApplication()
	 * @generated
	 */
	EReference getStormApplication_HasSlaveNode();

	/**
	 * Returns the meta object for the reference '{@link es.unizar.disco.dice.DTSM.Storm.StormApplication#getDependsOnZookeeper <em>Depends On Zookeeper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Depends On Zookeeper</em>'.
	 * @see es.unizar.disco.dice.DTSM.Storm.StormApplication#getDependsOnZookeeper()
	 * @see #getStormApplication()
	 * @generated
	 */
	EReference getStormApplication_DependsOnZookeeper();

	/**
	 * Returns the meta object for class '{@link es.unizar.disco.dice.DTSM.Storm.StormNimbus <em>Nimbus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nimbus</em>'.
	 * @see es.unizar.disco.dice.DTSM.Storm.StormNimbus
	 * @generated
	 */
	EClass getStormNimbus();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DTSM.Storm.StormNimbus#getTaskTimeout <em>Task Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Task Timeout</em>'.
	 * @see es.unizar.disco.dice.DTSM.Storm.StormNimbus#getTaskTimeout()
	 * @see #getStormNimbus()
	 * @generated
	 */
	EAttribute getStormNimbus_TaskTimeout();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DTSM.Storm.StormNimbus#getSupervisorTimeout <em>Supervisor Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Supervisor Timeout</em>'.
	 * @see es.unizar.disco.dice.DTSM.Storm.StormNimbus#getSupervisorTimeout()
	 * @see #getStormNimbus()
	 * @generated
	 */
	EAttribute getStormNimbus_SupervisorTimeout();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DTSM.Storm.StormNimbus#getMonitorFrequency <em>Monitor Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Monitor Frequency</em>'.
	 * @see es.unizar.disco.dice.DTSM.Storm.StormNimbus#getMonitorFrequency()
	 * @see #getStormNimbus()
	 * @generated
	 */
	EAttribute getStormNimbus_MonitorFrequency();

	/**
	 * Returns the meta object for the reference '{@link es.unizar.disco.dice.DTSM.Storm.StormNimbus#getBase_Classifier <em>Base Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Classifier</em>'.
	 * @see es.unizar.disco.dice.DTSM.Storm.StormNimbus#getBase_Classifier()
	 * @see #getStormNimbus()
	 * @generated
	 */
	EReference getStormNimbus_Base_Classifier();

	/**
	 * Returns the meta object for class '{@link es.unizar.disco.dice.DTSM.Storm.StormSupervisor <em>Supervisor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Supervisor</em>'.
	 * @see es.unizar.disco.dice.DTSM.Storm.StormSupervisor
	 * @generated
	 */
	EClass getStormSupervisor();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DTSM.Storm.StormSupervisor#getMonitroFrequency <em>Monitro Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Monitro Frequency</em>'.
	 * @see es.unizar.disco.dice.DTSM.Storm.StormSupervisor#getMonitroFrequency()
	 * @see #getStormSupervisor()
	 * @generated
	 */
	EAttribute getStormSupervisor_MonitroFrequency();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DTSM.Storm.StormSupervisor#getWorkerSatrtTimeout <em>Worker Satrt Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Worker Satrt Timeout</em>'.
	 * @see es.unizar.disco.dice.DTSM.Storm.StormSupervisor#getWorkerSatrtTimeout()
	 * @see #getStormSupervisor()
	 * @generated
	 */
	EAttribute getStormSupervisor_WorkerSatrtTimeout();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DTSM.Storm.StormSupervisor#getWorkerTimeout <em>Worker Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Worker Timeout</em>'.
	 * @see es.unizar.disco.dice.DTSM.Storm.StormSupervisor#getWorkerTimeout()
	 * @see #getStormSupervisor()
	 * @generated
	 */
	EAttribute getStormSupervisor_WorkerTimeout();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DTSM.Storm.StormSupervisor#getHeartbrackFrequency <em>Heartbrack Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Heartbrack Frequency</em>'.
	 * @see es.unizar.disco.dice.DTSM.Storm.StormSupervisor#getHeartbrackFrequency()
	 * @see #getStormSupervisor()
	 * @generated
	 */
	EAttribute getStormSupervisor_HeartbrackFrequency();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DTSM.Storm.StormSupervisor#getMemoryCapacity <em>Memory Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Memory Capacity</em>'.
	 * @see es.unizar.disco.dice.DTSM.Storm.StormSupervisor#getMemoryCapacity()
	 * @see #getStormSupervisor()
	 * @generated
	 */
	EAttribute getStormSupervisor_MemoryCapacity();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DTSM.Storm.StormSupervisor#getCpuCapacity <em>Cpu Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cpu Capacity</em>'.
	 * @see es.unizar.disco.dice.DTSM.Storm.StormSupervisor#getCpuCapacity()
	 * @see #getStormSupervisor()
	 * @generated
	 */
	EAttribute getStormSupervisor_CpuCapacity();

	/**
	 * Returns the meta object for the reference '{@link es.unizar.disco.dice.DTSM.Storm.StormSupervisor#getBase_Classifier <em>Base Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Classifier</em>'.
	 * @see es.unizar.disco.dice.DTSM.Storm.StormSupervisor#getBase_Classifier()
	 * @see #getStormSupervisor()
	 * @generated
	 */
	EReference getStormSupervisor_Base_Classifier();

	/**
	 * Returns the meta object for class '{@link es.unizar.disco.dice.DTSM.Storm.StormZookeeper <em>Zookeeper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Zookeeper</em>'.
	 * @see es.unizar.disco.dice.DTSM.Storm.StormZookeeper
	 * @generated
	 */
	EClass getStormZookeeper();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DTSM.Storm.StormZookeeper#getSessionTimeout <em>Session Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Session Timeout</em>'.
	 * @see es.unizar.disco.dice.DTSM.Storm.StormZookeeper#getSessionTimeout()
	 * @see #getStormZookeeper()
	 * @generated
	 */
	EAttribute getStormZookeeper_SessionTimeout();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DTSM.Storm.StormZookeeper#getConnectionTimeout <em>Connection Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connection Timeout</em>'.
	 * @see es.unizar.disco.dice.DTSM.Storm.StormZookeeper#getConnectionTimeout()
	 * @see #getStormZookeeper()
	 * @generated
	 */
	EAttribute getStormZookeeper_ConnectionTimeout();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DTSM.Storm.StormZookeeper#getRetryTime <em>Retry Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Retry Time</em>'.
	 * @see es.unizar.disco.dice.DTSM.Storm.StormZookeeper#getRetryTime()
	 * @see #getStormZookeeper()
	 * @generated
	 */
	EAttribute getStormZookeeper_RetryTime();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DTSM.Storm.StormZookeeper#getRetryInterval <em>Retry Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Retry Interval</em>'.
	 * @see es.unizar.disco.dice.DTSM.Storm.StormZookeeper#getRetryInterval()
	 * @see #getStormZookeeper()
	 * @generated
	 */
	EAttribute getStormZookeeper_RetryInterval();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DTSM.Storm.StormZookeeper#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User</em>'.
	 * @see es.unizar.disco.dice.DTSM.Storm.StormZookeeper#getUser()
	 * @see #getStormZookeeper()
	 * @generated
	 */
	EAttribute getStormZookeeper_User();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DTSM.Storm.StormZookeeper#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see es.unizar.disco.dice.DTSM.Storm.StormZookeeper#getPassword()
	 * @see #getStormZookeeper()
	 * @generated
	 */
	EAttribute getStormZookeeper_Password();

	/**
	 * Returns the meta object for the reference '{@link es.unizar.disco.dice.DTSM.Storm.StormZookeeper#getBase_Classifier <em>Base Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Classifier</em>'.
	 * @see es.unizar.disco.dice.DTSM.Storm.StormZookeeper#getBase_Classifier()
	 * @see #getStormZookeeper()
	 * @generated
	 */
	EReference getStormZookeeper_Base_Classifier();

	/**
	 * Returns the meta object for class '{@link es.unizar.disco.dice.DTSM.Storm.StormStreamStep <em>Stream Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stream Step</em>'.
	 * @see es.unizar.disco.dice.DTSM.Storm.StormStreamStep
	 * @generated
	 */
	EClass getStormStreamStep();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DTSM.Storm.StormStreamStep#getNumTuples <em>Num Tuples</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Tuples</em>'.
	 * @see es.unizar.disco.dice.DTSM.Storm.StormStreamStep#getNumTuples()
	 * @see #getStormStreamStep()
	 * @generated
	 */
	EAttribute getStormStreamStep_NumTuples();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DTSM.Storm.StormStreamStep#getGrouping <em>Grouping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grouping</em>'.
	 * @see es.unizar.disco.dice.DTSM.Storm.StormStreamStep#getGrouping()
	 * @see #getStormStreamStep()
	 * @generated
	 */
	EAttribute getStormStreamStep_Grouping();

	/**
	 * Returns the meta object for the attribute list '{@link es.unizar.disco.dice.DTSM.Storm.StormStreamStep#getProbFields <em>Prob Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Prob Fields</em>'.
	 * @see es.unizar.disco.dice.DTSM.Storm.StormStreamStep#getProbFields()
	 * @see #getStormStreamStep()
	 * @generated
	 */
	EAttribute getStormStreamStep_ProbFields();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StormFactory getStormFactory();

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
		 * The meta object literal for the '{@link es.unizar.disco.dice.DTSM.Storm.impl.StormBoltImpl <em>Bolt</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unizar.disco.dice.DTSM.Storm.impl.StormBoltImpl
		 * @see es.unizar.disco.dice.DTSM.Storm.impl.StormPackageImpl#getStormBolt()
		 * @generated
		 */
		EClass STORM_BOLT = eINSTANCE.getStormBolt();

		/**
		 * The meta object literal for the '<em><b>D</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORM_BOLT__D = eINSTANCE.getStormBolt_D();

		/**
		 * The meta object literal for the '<em><b>Alpha</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORM_BOLT__ALPHA = eINSTANCE.getStormBolt_Alpha();

		/**
		 * The meta object literal for the '<em><b>Sigma</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORM_BOLT__SIGMA = eINSTANCE.getStormBolt_Sigma();

		/**
		 * The meta object literal for the '<em><b>Min Reboot Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORM_BOLT__MIN_REBOOT_TIME = eINSTANCE.getStormBolt_MinRebootTime();

		/**
		 * The meta object literal for the '<em><b>Max Reboot Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORM_BOLT__MAX_REBOOT_TIME = eINSTANCE.getStormBolt_MaxRebootTime();

		/**
		 * The meta object literal for the '{@link es.unizar.disco.dice.DTSM.Storm.impl.StormSpoutImpl <em>Spout</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unizar.disco.dice.DTSM.Storm.impl.StormSpoutImpl
		 * @see es.unizar.disco.dice.DTSM.Storm.impl.StormPackageImpl#getStormSpout()
		 * @generated
		 */
		EClass STORM_SPOUT = eINSTANCE.getStormSpout();

		/**
		 * The meta object literal for the '<em><b>Avg Emit Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORM_SPOUT__AVG_EMIT_RATE = eINSTANCE.getStormSpout_AvgEmitRate();

		/**
		 * The meta object literal for the '{@link es.unizar.disco.dice.DTSM.Storm.impl.StormScenarioTopologyImpl <em>Scenario Topology</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unizar.disco.dice.DTSM.Storm.impl.StormScenarioTopologyImpl
		 * @see es.unizar.disco.dice.DTSM.Storm.impl.StormPackageImpl#getStormScenarioTopology()
		 * @generated
		 */
		EClass STORM_SCENARIO_TOPOLOGY = eINSTANCE.getStormScenarioTopology();

		/**
		 * The meta object literal for the '<em><b>Queue Threshold</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORM_SCENARIO_TOPOLOGY__QUEUE_THRESHOLD = eINSTANCE.getStormScenarioTopology_QueueThreshold();

		/**
		 * The meta object literal for the '<em><b>Max Task Parallelism</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORM_SCENARIO_TOPOLOGY__MAX_TASK_PARALLELISM = eINSTANCE.getStormScenarioTopology_MaxTaskParallelism();

		/**
		 * The meta object literal for the '<em><b>Max Spout Pending</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORM_SCENARIO_TOPOLOGY__MAX_SPOUT_PENDING = eINSTANCE.getStormScenarioTopology_MaxSpoutPending();

		/**
		 * The meta object literal for the '<em><b>Is Reliable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORM_SCENARIO_TOPOLOGY__IS_RELIABLE = eINSTANCE.getStormScenarioTopology_IsReliable();

		/**
		 * The meta object literal for the '{@link es.unizar.disco.dice.DTSM.Storm.impl.StormApplicationImpl <em>Application</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unizar.disco.dice.DTSM.Storm.impl.StormApplicationImpl
		 * @see es.unizar.disco.dice.DTSM.Storm.impl.StormPackageImpl#getStormApplication()
		 * @generated
		 */
		EClass STORM_APPLICATION = eINSTANCE.getStormApplication();

		/**
		 * The meta object literal for the '<em><b>Has Master Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORM_APPLICATION__HAS_MASTER_NODE = eINSTANCE.getStormApplication_HasMasterNode();

		/**
		 * The meta object literal for the '<em><b>Has Slave Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORM_APPLICATION__HAS_SLAVE_NODE = eINSTANCE.getStormApplication_HasSlaveNode();

		/**
		 * The meta object literal for the '<em><b>Depends On Zookeeper</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORM_APPLICATION__DEPENDS_ON_ZOOKEEPER = eINSTANCE.getStormApplication_DependsOnZookeeper();

		/**
		 * The meta object literal for the '{@link es.unizar.disco.dice.DTSM.Storm.impl.StormNimbusImpl <em>Nimbus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unizar.disco.dice.DTSM.Storm.impl.StormNimbusImpl
		 * @see es.unizar.disco.dice.DTSM.Storm.impl.StormPackageImpl#getStormNimbus()
		 * @generated
		 */
		EClass STORM_NIMBUS = eINSTANCE.getStormNimbus();

		/**
		 * The meta object literal for the '<em><b>Task Timeout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORM_NIMBUS__TASK_TIMEOUT = eINSTANCE.getStormNimbus_TaskTimeout();

		/**
		 * The meta object literal for the '<em><b>Supervisor Timeout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORM_NIMBUS__SUPERVISOR_TIMEOUT = eINSTANCE.getStormNimbus_SupervisorTimeout();

		/**
		 * The meta object literal for the '<em><b>Monitor Frequency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORM_NIMBUS__MONITOR_FREQUENCY = eINSTANCE.getStormNimbus_MonitorFrequency();

		/**
		 * The meta object literal for the '<em><b>Base Classifier</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORM_NIMBUS__BASE_CLASSIFIER = eINSTANCE.getStormNimbus_Base_Classifier();

		/**
		 * The meta object literal for the '{@link es.unizar.disco.dice.DTSM.Storm.impl.StormSupervisorImpl <em>Supervisor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unizar.disco.dice.DTSM.Storm.impl.StormSupervisorImpl
		 * @see es.unizar.disco.dice.DTSM.Storm.impl.StormPackageImpl#getStormSupervisor()
		 * @generated
		 */
		EClass STORM_SUPERVISOR = eINSTANCE.getStormSupervisor();

		/**
		 * The meta object literal for the '<em><b>Monitro Frequency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORM_SUPERVISOR__MONITRO_FREQUENCY = eINSTANCE.getStormSupervisor_MonitroFrequency();

		/**
		 * The meta object literal for the '<em><b>Worker Satrt Timeout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORM_SUPERVISOR__WORKER_SATRT_TIMEOUT = eINSTANCE.getStormSupervisor_WorkerSatrtTimeout();

		/**
		 * The meta object literal for the '<em><b>Worker Timeout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORM_SUPERVISOR__WORKER_TIMEOUT = eINSTANCE.getStormSupervisor_WorkerTimeout();

		/**
		 * The meta object literal for the '<em><b>Heartbrack Frequency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORM_SUPERVISOR__HEARTBRACK_FREQUENCY = eINSTANCE.getStormSupervisor_HeartbrackFrequency();

		/**
		 * The meta object literal for the '<em><b>Memory Capacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORM_SUPERVISOR__MEMORY_CAPACITY = eINSTANCE.getStormSupervisor_MemoryCapacity();

		/**
		 * The meta object literal for the '<em><b>Cpu Capacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORM_SUPERVISOR__CPU_CAPACITY = eINSTANCE.getStormSupervisor_CpuCapacity();

		/**
		 * The meta object literal for the '<em><b>Base Classifier</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORM_SUPERVISOR__BASE_CLASSIFIER = eINSTANCE.getStormSupervisor_Base_Classifier();

		/**
		 * The meta object literal for the '{@link es.unizar.disco.dice.DTSM.Storm.impl.StormZookeeperImpl <em>Zookeeper</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unizar.disco.dice.DTSM.Storm.impl.StormZookeeperImpl
		 * @see es.unizar.disco.dice.DTSM.Storm.impl.StormPackageImpl#getStormZookeeper()
		 * @generated
		 */
		EClass STORM_ZOOKEEPER = eINSTANCE.getStormZookeeper();

		/**
		 * The meta object literal for the '<em><b>Session Timeout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORM_ZOOKEEPER__SESSION_TIMEOUT = eINSTANCE.getStormZookeeper_SessionTimeout();

		/**
		 * The meta object literal for the '<em><b>Connection Timeout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORM_ZOOKEEPER__CONNECTION_TIMEOUT = eINSTANCE.getStormZookeeper_ConnectionTimeout();

		/**
		 * The meta object literal for the '<em><b>Retry Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORM_ZOOKEEPER__RETRY_TIME = eINSTANCE.getStormZookeeper_RetryTime();

		/**
		 * The meta object literal for the '<em><b>Retry Interval</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORM_ZOOKEEPER__RETRY_INTERVAL = eINSTANCE.getStormZookeeper_RetryInterval();

		/**
		 * The meta object literal for the '<em><b>User</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORM_ZOOKEEPER__USER = eINSTANCE.getStormZookeeper_User();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORM_ZOOKEEPER__PASSWORD = eINSTANCE.getStormZookeeper_Password();

		/**
		 * The meta object literal for the '<em><b>Base Classifier</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORM_ZOOKEEPER__BASE_CLASSIFIER = eINSTANCE.getStormZookeeper_Base_Classifier();

		/**
		 * The meta object literal for the '{@link es.unizar.disco.dice.DTSM.Storm.impl.StormStreamStepImpl <em>Stream Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unizar.disco.dice.DTSM.Storm.impl.StormStreamStepImpl
		 * @see es.unizar.disco.dice.DTSM.Storm.impl.StormPackageImpl#getStormStreamStep()
		 * @generated
		 */
		EClass STORM_STREAM_STEP = eINSTANCE.getStormStreamStep();

		/**
		 * The meta object literal for the '<em><b>Num Tuples</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORM_STREAM_STEP__NUM_TUPLES = eINSTANCE.getStormStreamStep_NumTuples();

		/**
		 * The meta object literal for the '<em><b>Grouping</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORM_STREAM_STEP__GROUPING = eINSTANCE.getStormStreamStep_Grouping();

		/**
		 * The meta object literal for the '<em><b>Prob Fields</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORM_STREAM_STEP__PROB_FIELDS = eINSTANCE.getStormStreamStep_ProbFields();

	}

} //StormPackage
