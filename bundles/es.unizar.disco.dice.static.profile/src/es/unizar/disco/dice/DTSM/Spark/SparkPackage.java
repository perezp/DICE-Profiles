/**
 */
package es.unizar.disco.dice.DTSM.Spark;

import es.unizar.disco.dice.DTSM.Core.CorePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see es.unizar.disco.dice.DTSM.Spark.SparkFactory
 * @model kind="package"
 * @generated
 */
public interface SparkPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Spark";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://es.unizar.disco.dice/profiles/DTSM/Spark/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Spark";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SparkPackage eINSTANCE = es.unizar.disco.dice.DTSM.Spark.impl.SparkPackageImpl.init();

	/**
	 * The meta object id for the '{@link es.unizar.disco.dice.DTSM.Spark.impl.SparkScenarioImpl <em>Scenario</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unizar.disco.dice.DTSM.Spark.impl.SparkScenarioImpl
	 * @see es.unizar.disco.dice.DTSM.Spark.impl.SparkPackageImpl#getSparkScenario()
	 * @generated
	 */
	int SPARK_SCENARIO = 0;

	/**
	 * The feature id for the '<em><b>Exec Time</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_SCENARIO__EXEC_TIME = GQAMPackage.GA_SCENARIO__EXEC_TIME;

	/**
	 * The feature id for the '<em><b>Allocated Memory</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_SCENARIO__ALLOCATED_MEMORY = GQAMPackage.GA_SCENARIO__ALLOCATED_MEMORY;

	/**
	 * The feature id for the '<em><b>Used Memory</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_SCENARIO__USED_MEMORY = GQAMPackage.GA_SCENARIO__USED_MEMORY;

	/**
	 * The feature id for the '<em><b>Power Peak</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_SCENARIO__POWER_PEAK = GQAMPackage.GA_SCENARIO__POWER_PEAK;

	/**
	 * The feature id for the '<em><b>Energy</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_SCENARIO__ENERGY = GQAMPackage.GA_SCENARIO__ENERGY;

	/**
	 * The feature id for the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_SCENARIO__BASE_NAMED_ELEMENT = GQAMPackage.GA_SCENARIO__BASE_NAMED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Sub Usage</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_SCENARIO__SUB_USAGE = GQAMPackage.GA_SCENARIO__SUB_USAGE;

	/**
	 * The feature id for the '<em><b>Used Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_SCENARIO__USED_RESOURCES = GQAMPackage.GA_SCENARIO__USED_RESOURCES;

	/**
	 * The feature id for the '<em><b>Msg Size</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_SCENARIO__MSG_SIZE = GQAMPackage.GA_SCENARIO__MSG_SIZE;

	/**
	 * The feature id for the '<em><b>On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_SCENARIO__ON = GQAMPackage.GA_SCENARIO__ON;

	/**
	 * The feature id for the '<em><b>Base Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_SCENARIO__BASE_ACTION = GQAMPackage.GA_SCENARIO__BASE_ACTION;

	/**
	 * The feature id for the '<em><b>Base Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_SCENARIO__BASE_BEHAVIOR = GQAMPackage.GA_SCENARIO__BASE_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Base Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_SCENARIO__BASE_MESSAGE = GQAMPackage.GA_SCENARIO__BASE_MESSAGE;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_SCENARIO__DURATION = GQAMPackage.GA_SCENARIO__DURATION;

	/**
	 * The feature id for the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_SCENARIO__START = GQAMPackage.GA_SCENARIO__START;

	/**
	 * The feature id for the '<em><b>Finish</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_SCENARIO__FINISH = GQAMPackage.GA_SCENARIO__FINISH;

	/**
	 * The feature id for the '<em><b>Cause</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_SCENARIO__CAUSE = GQAMPackage.GA_SCENARIO__CAUSE;

	/**
	 * The feature id for the '<em><b>Host Demand</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_SCENARIO__HOST_DEMAND = GQAMPackage.GA_SCENARIO__HOST_DEMAND;

	/**
	 * The feature id for the '<em><b>Host Demand Ops</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_SCENARIO__HOST_DEMAND_OPS = GQAMPackage.GA_SCENARIO__HOST_DEMAND_OPS;

	/**
	 * The feature id for the '<em><b>Inter Occ T</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_SCENARIO__INTER_OCC_T = GQAMPackage.GA_SCENARIO__INTER_OCC_T;

	/**
	 * The feature id for the '<em><b>Throughput</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_SCENARIO__THROUGHPUT = GQAMPackage.GA_SCENARIO__THROUGHPUT;

	/**
	 * The feature id for the '<em><b>Resp T</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_SCENARIO__RESP_T = GQAMPackage.GA_SCENARIO__RESP_T;

	/**
	 * The feature id for the '<em><b>Utilization</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_SCENARIO__UTILIZATION = GQAMPackage.GA_SCENARIO__UTILIZATION;

	/**
	 * The feature id for the '<em><b>Utilization On Host</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_SCENARIO__UTILIZATION_ON_HOST = GQAMPackage.GA_SCENARIO__UTILIZATION_ON_HOST;

	/**
	 * The feature id for the '<em><b>Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_SCENARIO__ROOT = GQAMPackage.GA_SCENARIO__ROOT;

	/**
	 * The feature id for the '<em><b>Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_SCENARIO__STEPS = GQAMPackage.GA_SCENARIO__STEPS;

	/**
	 * The feature id for the '<em><b>Parent Step</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_SCENARIO__PARENT_STEP = GQAMPackage.GA_SCENARIO__PARENT_STEP;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_SCENARIO__TIMING = GQAMPackage.GA_SCENARIO__TIMING;

	/**
	 * The feature id for the '<em><b>NAssigned Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_SCENARIO__NASSIGNED_CORES = GQAMPackage.GA_SCENARIO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>NAssigned Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_SCENARIO__NASSIGNED_MEMORY = GQAMPackage.GA_SCENARIO_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Job Schedule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_SCENARIO__JOB_SCHEDULE = GQAMPackage.GA_SCENARIO_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Scenario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_SCENARIO_FEATURE_COUNT = GQAMPackage.GA_SCENARIO_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link es.unizar.disco.dice.DTSM.Spark.impl.SparkOperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unizar.disco.dice.DTSM.Spark.impl.SparkOperationImpl
	 * @see es.unizar.disco.dice.DTSM.Spark.impl.SparkPackageImpl#getSparkOperation()
	 * @generated
	 */
	int SPARK_OPERATION = 1;

	/**
	 * The feature id for the '<em><b>Exec Time</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_OPERATION__EXEC_TIME = GQAMPackage.GA_STEP__EXEC_TIME;

	/**
	 * The feature id for the '<em><b>Allocated Memory</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_OPERATION__ALLOCATED_MEMORY = GQAMPackage.GA_STEP__ALLOCATED_MEMORY;

	/**
	 * The feature id for the '<em><b>Used Memory</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_OPERATION__USED_MEMORY = GQAMPackage.GA_STEP__USED_MEMORY;

	/**
	 * The feature id for the '<em><b>Power Peak</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_OPERATION__POWER_PEAK = GQAMPackage.GA_STEP__POWER_PEAK;

	/**
	 * The feature id for the '<em><b>Energy</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_OPERATION__ENERGY = GQAMPackage.GA_STEP__ENERGY;

	/**
	 * The feature id for the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_OPERATION__BASE_NAMED_ELEMENT = GQAMPackage.GA_STEP__BASE_NAMED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Sub Usage</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_OPERATION__SUB_USAGE = GQAMPackage.GA_STEP__SUB_USAGE;

	/**
	 * The feature id for the '<em><b>Used Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_OPERATION__USED_RESOURCES = GQAMPackage.GA_STEP__USED_RESOURCES;

	/**
	 * The feature id for the '<em><b>Msg Size</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_OPERATION__MSG_SIZE = GQAMPackage.GA_STEP__MSG_SIZE;

	/**
	 * The feature id for the '<em><b>On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_OPERATION__ON = GQAMPackage.GA_STEP__ON;

	/**
	 * The feature id for the '<em><b>Base Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_OPERATION__BASE_ACTION = GQAMPackage.GA_STEP__BASE_ACTION;

	/**
	 * The feature id for the '<em><b>Base Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_OPERATION__BASE_BEHAVIOR = GQAMPackage.GA_STEP__BASE_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Base Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_OPERATION__BASE_MESSAGE = GQAMPackage.GA_STEP__BASE_MESSAGE;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_OPERATION__DURATION = GQAMPackage.GA_STEP__DURATION;

	/**
	 * The feature id for the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_OPERATION__START = GQAMPackage.GA_STEP__START;

	/**
	 * The feature id for the '<em><b>Finish</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_OPERATION__FINISH = GQAMPackage.GA_STEP__FINISH;

	/**
	 * The feature id for the '<em><b>Cause</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_OPERATION__CAUSE = GQAMPackage.GA_STEP__CAUSE;

	/**
	 * The feature id for the '<em><b>Host Demand</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_OPERATION__HOST_DEMAND = GQAMPackage.GA_STEP__HOST_DEMAND;

	/**
	 * The feature id for the '<em><b>Host Demand Ops</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_OPERATION__HOST_DEMAND_OPS = GQAMPackage.GA_STEP__HOST_DEMAND_OPS;

	/**
	 * The feature id for the '<em><b>Inter Occ T</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_OPERATION__INTER_OCC_T = GQAMPackage.GA_STEP__INTER_OCC_T;

	/**
	 * The feature id for the '<em><b>Throughput</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_OPERATION__THROUGHPUT = GQAMPackage.GA_STEP__THROUGHPUT;

	/**
	 * The feature id for the '<em><b>Resp T</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_OPERATION__RESP_T = GQAMPackage.GA_STEP__RESP_T;

	/**
	 * The feature id for the '<em><b>Utilization</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_OPERATION__UTILIZATION = GQAMPackage.GA_STEP__UTILIZATION;

	/**
	 * The feature id for the '<em><b>Utilization On Host</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_OPERATION__UTILIZATION_ON_HOST = GQAMPackage.GA_STEP__UTILIZATION_ON_HOST;

	/**
	 * The feature id for the '<em><b>Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_OPERATION__ROOT = GQAMPackage.GA_STEP__ROOT;

	/**
	 * The feature id for the '<em><b>Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_OPERATION__STEPS = GQAMPackage.GA_STEP__STEPS;

	/**
	 * The feature id for the '<em><b>Parent Step</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_OPERATION__PARENT_STEP = GQAMPackage.GA_STEP__PARENT_STEP;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_OPERATION__TIMING = GQAMPackage.GA_STEP__TIMING;

	/**
	 * The feature id for the '<em><b>Is Atomic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_OPERATION__IS_ATOMIC = GQAMPackage.GA_STEP__IS_ATOMIC;

	/**
	 * The feature id for the '<em><b>Block T</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_OPERATION__BLOCK_T = GQAMPackage.GA_STEP__BLOCK_T;

	/**
	 * The feature id for the '<em><b>Rep</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_OPERATION__REP = GQAMPackage.GA_STEP__REP;

	/**
	 * The feature id for the '<em><b>Prob</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_OPERATION__PROB = GQAMPackage.GA_STEP__PROB;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_OPERATION__PRIORITY = GQAMPackage.GA_STEP__PRIORITY;

	/**
	 * The feature id for the '<em><b>Concur Res</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_OPERATION__CONCUR_RES = GQAMPackage.GA_STEP__CONCUR_RES;

	/**
	 * The feature id for the '<em><b>Host</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_OPERATION__HOST = GQAMPackage.GA_STEP__HOST;

	/**
	 * The feature id for the '<em><b>Serv Demand</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_OPERATION__SERV_DEMAND = GQAMPackage.GA_STEP__SERV_DEMAND;

	/**
	 * The feature id for the '<em><b>Serv Count</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_OPERATION__SERV_COUNT = GQAMPackage.GA_STEP__SERV_COUNT;

	/**
	 * The feature id for the '<em><b>Self Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_OPERATION__SELF_DELAY = GQAMPackage.GA_STEP__SELF_DELAY;

	/**
	 * The feature id for the '<em><b>Scenario</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_OPERATION__SCENARIO = GQAMPackage.GA_STEP__SCENARIO;

	/**
	 * The feature id for the '<em><b>Child Scenario</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_OPERATION__CHILD_SCENARIO = GQAMPackage.GA_STEP__CHILD_SCENARIO;

	/**
	 * The feature id for the '<em><b>RDD Available</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_OPERATION__RDD_AVAILABLE = GQAMPackage.GA_STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>RDD</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_OPERATION__RDD = GQAMPackage.GA_STEP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Op Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_OPERATION__OP_TYPE = GQAMPackage.GA_STEP_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_OPERATION_FEATURE_COUNT = GQAMPackage.GA_STEP_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link es.unizar.disco.dice.DTSM.Spark.impl.SparkReduceImpl <em>Reduce</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unizar.disco.dice.DTSM.Spark.impl.SparkReduceImpl
	 * @see es.unizar.disco.dice.DTSM.Spark.impl.SparkPackageImpl#getSparkReduce()
	 * @generated
	 */
	int SPARK_REDUCE = 2;

	/**
	 * The feature id for the '<em><b>Exec Time</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_REDUCE__EXEC_TIME = SPARK_OPERATION__EXEC_TIME;

	/**
	 * The feature id for the '<em><b>Allocated Memory</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_REDUCE__ALLOCATED_MEMORY = SPARK_OPERATION__ALLOCATED_MEMORY;

	/**
	 * The feature id for the '<em><b>Used Memory</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_REDUCE__USED_MEMORY = SPARK_OPERATION__USED_MEMORY;

	/**
	 * The feature id for the '<em><b>Power Peak</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_REDUCE__POWER_PEAK = SPARK_OPERATION__POWER_PEAK;

	/**
	 * The feature id for the '<em><b>Energy</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_REDUCE__ENERGY = SPARK_OPERATION__ENERGY;

	/**
	 * The feature id for the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_REDUCE__BASE_NAMED_ELEMENT = SPARK_OPERATION__BASE_NAMED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Sub Usage</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_REDUCE__SUB_USAGE = SPARK_OPERATION__SUB_USAGE;

	/**
	 * The feature id for the '<em><b>Used Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_REDUCE__USED_RESOURCES = SPARK_OPERATION__USED_RESOURCES;

	/**
	 * The feature id for the '<em><b>Msg Size</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_REDUCE__MSG_SIZE = SPARK_OPERATION__MSG_SIZE;

	/**
	 * The feature id for the '<em><b>On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_REDUCE__ON = SPARK_OPERATION__ON;

	/**
	 * The feature id for the '<em><b>Base Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_REDUCE__BASE_ACTION = SPARK_OPERATION__BASE_ACTION;

	/**
	 * The feature id for the '<em><b>Base Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_REDUCE__BASE_BEHAVIOR = SPARK_OPERATION__BASE_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Base Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_REDUCE__BASE_MESSAGE = SPARK_OPERATION__BASE_MESSAGE;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_REDUCE__DURATION = SPARK_OPERATION__DURATION;

	/**
	 * The feature id for the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_REDUCE__START = SPARK_OPERATION__START;

	/**
	 * The feature id for the '<em><b>Finish</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_REDUCE__FINISH = SPARK_OPERATION__FINISH;

	/**
	 * The feature id for the '<em><b>Cause</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_REDUCE__CAUSE = SPARK_OPERATION__CAUSE;

	/**
	 * The feature id for the '<em><b>Host Demand</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_REDUCE__HOST_DEMAND = SPARK_OPERATION__HOST_DEMAND;

	/**
	 * The feature id for the '<em><b>Host Demand Ops</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_REDUCE__HOST_DEMAND_OPS = SPARK_OPERATION__HOST_DEMAND_OPS;

	/**
	 * The feature id for the '<em><b>Inter Occ T</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_REDUCE__INTER_OCC_T = SPARK_OPERATION__INTER_OCC_T;

	/**
	 * The feature id for the '<em><b>Throughput</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_REDUCE__THROUGHPUT = SPARK_OPERATION__THROUGHPUT;

	/**
	 * The feature id for the '<em><b>Resp T</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_REDUCE__RESP_T = SPARK_OPERATION__RESP_T;

	/**
	 * The feature id for the '<em><b>Utilization</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_REDUCE__UTILIZATION = SPARK_OPERATION__UTILIZATION;

	/**
	 * The feature id for the '<em><b>Utilization On Host</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_REDUCE__UTILIZATION_ON_HOST = SPARK_OPERATION__UTILIZATION_ON_HOST;

	/**
	 * The feature id for the '<em><b>Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_REDUCE__ROOT = SPARK_OPERATION__ROOT;

	/**
	 * The feature id for the '<em><b>Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_REDUCE__STEPS = SPARK_OPERATION__STEPS;

	/**
	 * The feature id for the '<em><b>Parent Step</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_REDUCE__PARENT_STEP = SPARK_OPERATION__PARENT_STEP;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_REDUCE__TIMING = SPARK_OPERATION__TIMING;

	/**
	 * The feature id for the '<em><b>Is Atomic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_REDUCE__IS_ATOMIC = SPARK_OPERATION__IS_ATOMIC;

	/**
	 * The feature id for the '<em><b>Block T</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_REDUCE__BLOCK_T = SPARK_OPERATION__BLOCK_T;

	/**
	 * The feature id for the '<em><b>Rep</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_REDUCE__REP = SPARK_OPERATION__REP;

	/**
	 * The feature id for the '<em><b>Prob</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_REDUCE__PROB = SPARK_OPERATION__PROB;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_REDUCE__PRIORITY = SPARK_OPERATION__PRIORITY;

	/**
	 * The feature id for the '<em><b>Concur Res</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_REDUCE__CONCUR_RES = SPARK_OPERATION__CONCUR_RES;

	/**
	 * The feature id for the '<em><b>Host</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_REDUCE__HOST = SPARK_OPERATION__HOST;

	/**
	 * The feature id for the '<em><b>Serv Demand</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_REDUCE__SERV_DEMAND = SPARK_OPERATION__SERV_DEMAND;

	/**
	 * The feature id for the '<em><b>Serv Count</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_REDUCE__SERV_COUNT = SPARK_OPERATION__SERV_COUNT;

	/**
	 * The feature id for the '<em><b>Self Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_REDUCE__SELF_DELAY = SPARK_OPERATION__SELF_DELAY;

	/**
	 * The feature id for the '<em><b>Scenario</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_REDUCE__SCENARIO = SPARK_OPERATION__SCENARIO;

	/**
	 * The feature id for the '<em><b>Child Scenario</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_REDUCE__CHILD_SCENARIO = SPARK_OPERATION__CHILD_SCENARIO;

	/**
	 * The feature id for the '<em><b>RDD Available</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_REDUCE__RDD_AVAILABLE = SPARK_OPERATION__RDD_AVAILABLE;

	/**
	 * The feature id for the '<em><b>RDD</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_REDUCE__RDD = SPARK_OPERATION__RDD;

	/**
	 * The feature id for the '<em><b>Op Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_REDUCE__OP_TYPE = SPARK_OPERATION__OP_TYPE;

	/**
	 * The feature id for the '<em><b>Reduce Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_REDUCE__REDUCE_TYPE = SPARK_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Reduce</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_REDUCE_FEATURE_COUNT = SPARK_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link es.unizar.disco.dice.DTSM.Spark.impl.SparkForEachImpl <em>For Each</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unizar.disco.dice.DTSM.Spark.impl.SparkForEachImpl
	 * @see es.unizar.disco.dice.DTSM.Spark.impl.SparkPackageImpl#getSparkForEach()
	 * @generated
	 */
	int SPARK_FOR_EACH = 3;

	/**
	 * The feature id for the '<em><b>Exec Time</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_FOR_EACH__EXEC_TIME = SPARK_OPERATION__EXEC_TIME;

	/**
	 * The feature id for the '<em><b>Allocated Memory</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_FOR_EACH__ALLOCATED_MEMORY = SPARK_OPERATION__ALLOCATED_MEMORY;

	/**
	 * The feature id for the '<em><b>Used Memory</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_FOR_EACH__USED_MEMORY = SPARK_OPERATION__USED_MEMORY;

	/**
	 * The feature id for the '<em><b>Power Peak</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_FOR_EACH__POWER_PEAK = SPARK_OPERATION__POWER_PEAK;

	/**
	 * The feature id for the '<em><b>Energy</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_FOR_EACH__ENERGY = SPARK_OPERATION__ENERGY;

	/**
	 * The feature id for the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_FOR_EACH__BASE_NAMED_ELEMENT = SPARK_OPERATION__BASE_NAMED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Sub Usage</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_FOR_EACH__SUB_USAGE = SPARK_OPERATION__SUB_USAGE;

	/**
	 * The feature id for the '<em><b>Used Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_FOR_EACH__USED_RESOURCES = SPARK_OPERATION__USED_RESOURCES;

	/**
	 * The feature id for the '<em><b>Msg Size</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_FOR_EACH__MSG_SIZE = SPARK_OPERATION__MSG_SIZE;

	/**
	 * The feature id for the '<em><b>On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_FOR_EACH__ON = SPARK_OPERATION__ON;

	/**
	 * The feature id for the '<em><b>Base Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_FOR_EACH__BASE_ACTION = SPARK_OPERATION__BASE_ACTION;

	/**
	 * The feature id for the '<em><b>Base Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_FOR_EACH__BASE_BEHAVIOR = SPARK_OPERATION__BASE_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Base Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_FOR_EACH__BASE_MESSAGE = SPARK_OPERATION__BASE_MESSAGE;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_FOR_EACH__DURATION = SPARK_OPERATION__DURATION;

	/**
	 * The feature id for the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_FOR_EACH__START = SPARK_OPERATION__START;

	/**
	 * The feature id for the '<em><b>Finish</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_FOR_EACH__FINISH = SPARK_OPERATION__FINISH;

	/**
	 * The feature id for the '<em><b>Cause</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_FOR_EACH__CAUSE = SPARK_OPERATION__CAUSE;

	/**
	 * The feature id for the '<em><b>Host Demand</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_FOR_EACH__HOST_DEMAND = SPARK_OPERATION__HOST_DEMAND;

	/**
	 * The feature id for the '<em><b>Host Demand Ops</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_FOR_EACH__HOST_DEMAND_OPS = SPARK_OPERATION__HOST_DEMAND_OPS;

	/**
	 * The feature id for the '<em><b>Inter Occ T</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_FOR_EACH__INTER_OCC_T = SPARK_OPERATION__INTER_OCC_T;

	/**
	 * The feature id for the '<em><b>Throughput</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_FOR_EACH__THROUGHPUT = SPARK_OPERATION__THROUGHPUT;

	/**
	 * The feature id for the '<em><b>Resp T</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_FOR_EACH__RESP_T = SPARK_OPERATION__RESP_T;

	/**
	 * The feature id for the '<em><b>Utilization</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_FOR_EACH__UTILIZATION = SPARK_OPERATION__UTILIZATION;

	/**
	 * The feature id for the '<em><b>Utilization On Host</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_FOR_EACH__UTILIZATION_ON_HOST = SPARK_OPERATION__UTILIZATION_ON_HOST;

	/**
	 * The feature id for the '<em><b>Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_FOR_EACH__ROOT = SPARK_OPERATION__ROOT;

	/**
	 * The feature id for the '<em><b>Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_FOR_EACH__STEPS = SPARK_OPERATION__STEPS;

	/**
	 * The feature id for the '<em><b>Parent Step</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_FOR_EACH__PARENT_STEP = SPARK_OPERATION__PARENT_STEP;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_FOR_EACH__TIMING = SPARK_OPERATION__TIMING;

	/**
	 * The feature id for the '<em><b>Is Atomic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_FOR_EACH__IS_ATOMIC = SPARK_OPERATION__IS_ATOMIC;

	/**
	 * The feature id for the '<em><b>Block T</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_FOR_EACH__BLOCK_T = SPARK_OPERATION__BLOCK_T;

	/**
	 * The feature id for the '<em><b>Rep</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_FOR_EACH__REP = SPARK_OPERATION__REP;

	/**
	 * The feature id for the '<em><b>Prob</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_FOR_EACH__PROB = SPARK_OPERATION__PROB;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_FOR_EACH__PRIORITY = SPARK_OPERATION__PRIORITY;

	/**
	 * The feature id for the '<em><b>Concur Res</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_FOR_EACH__CONCUR_RES = SPARK_OPERATION__CONCUR_RES;

	/**
	 * The feature id for the '<em><b>Host</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_FOR_EACH__HOST = SPARK_OPERATION__HOST;

	/**
	 * The feature id for the '<em><b>Serv Demand</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_FOR_EACH__SERV_DEMAND = SPARK_OPERATION__SERV_DEMAND;

	/**
	 * The feature id for the '<em><b>Serv Count</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_FOR_EACH__SERV_COUNT = SPARK_OPERATION__SERV_COUNT;

	/**
	 * The feature id for the '<em><b>Self Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_FOR_EACH__SELF_DELAY = SPARK_OPERATION__SELF_DELAY;

	/**
	 * The feature id for the '<em><b>Scenario</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_FOR_EACH__SCENARIO = SPARK_OPERATION__SCENARIO;

	/**
	 * The feature id for the '<em><b>Child Scenario</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_FOR_EACH__CHILD_SCENARIO = SPARK_OPERATION__CHILD_SCENARIO;

	/**
	 * The feature id for the '<em><b>RDD Available</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_FOR_EACH__RDD_AVAILABLE = SPARK_OPERATION__RDD_AVAILABLE;

	/**
	 * The feature id for the '<em><b>RDD</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_FOR_EACH__RDD = SPARK_OPERATION__RDD;

	/**
	 * The feature id for the '<em><b>Op Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_FOR_EACH__OP_TYPE = SPARK_OPERATION__OP_TYPE;

	/**
	 * The number of structural features of the '<em>For Each</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_FOR_EACH_FEATURE_COUNT = SPARK_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.unizar.disco.dice.DTSM.Spark.impl.SparkMapImpl <em>Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unizar.disco.dice.DTSM.Spark.impl.SparkMapImpl
	 * @see es.unizar.disco.dice.DTSM.Spark.impl.SparkPackageImpl#getSparkMap()
	 * @generated
	 */
	int SPARK_MAP = 4;

	/**
	 * The feature id for the '<em><b>Exec Time</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_MAP__EXEC_TIME = SPARK_OPERATION__EXEC_TIME;

	/**
	 * The feature id for the '<em><b>Allocated Memory</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_MAP__ALLOCATED_MEMORY = SPARK_OPERATION__ALLOCATED_MEMORY;

	/**
	 * The feature id for the '<em><b>Used Memory</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_MAP__USED_MEMORY = SPARK_OPERATION__USED_MEMORY;

	/**
	 * The feature id for the '<em><b>Power Peak</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_MAP__POWER_PEAK = SPARK_OPERATION__POWER_PEAK;

	/**
	 * The feature id for the '<em><b>Energy</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_MAP__ENERGY = SPARK_OPERATION__ENERGY;

	/**
	 * The feature id for the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_MAP__BASE_NAMED_ELEMENT = SPARK_OPERATION__BASE_NAMED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Sub Usage</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_MAP__SUB_USAGE = SPARK_OPERATION__SUB_USAGE;

	/**
	 * The feature id for the '<em><b>Used Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_MAP__USED_RESOURCES = SPARK_OPERATION__USED_RESOURCES;

	/**
	 * The feature id for the '<em><b>Msg Size</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_MAP__MSG_SIZE = SPARK_OPERATION__MSG_SIZE;

	/**
	 * The feature id for the '<em><b>On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_MAP__ON = SPARK_OPERATION__ON;

	/**
	 * The feature id for the '<em><b>Base Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_MAP__BASE_ACTION = SPARK_OPERATION__BASE_ACTION;

	/**
	 * The feature id for the '<em><b>Base Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_MAP__BASE_BEHAVIOR = SPARK_OPERATION__BASE_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Base Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_MAP__BASE_MESSAGE = SPARK_OPERATION__BASE_MESSAGE;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_MAP__DURATION = SPARK_OPERATION__DURATION;

	/**
	 * The feature id for the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_MAP__START = SPARK_OPERATION__START;

	/**
	 * The feature id for the '<em><b>Finish</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_MAP__FINISH = SPARK_OPERATION__FINISH;

	/**
	 * The feature id for the '<em><b>Cause</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_MAP__CAUSE = SPARK_OPERATION__CAUSE;

	/**
	 * The feature id for the '<em><b>Host Demand</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_MAP__HOST_DEMAND = SPARK_OPERATION__HOST_DEMAND;

	/**
	 * The feature id for the '<em><b>Host Demand Ops</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_MAP__HOST_DEMAND_OPS = SPARK_OPERATION__HOST_DEMAND_OPS;

	/**
	 * The feature id for the '<em><b>Inter Occ T</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_MAP__INTER_OCC_T = SPARK_OPERATION__INTER_OCC_T;

	/**
	 * The feature id for the '<em><b>Throughput</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_MAP__THROUGHPUT = SPARK_OPERATION__THROUGHPUT;

	/**
	 * The feature id for the '<em><b>Resp T</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_MAP__RESP_T = SPARK_OPERATION__RESP_T;

	/**
	 * The feature id for the '<em><b>Utilization</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_MAP__UTILIZATION = SPARK_OPERATION__UTILIZATION;

	/**
	 * The feature id for the '<em><b>Utilization On Host</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_MAP__UTILIZATION_ON_HOST = SPARK_OPERATION__UTILIZATION_ON_HOST;

	/**
	 * The feature id for the '<em><b>Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_MAP__ROOT = SPARK_OPERATION__ROOT;

	/**
	 * The feature id for the '<em><b>Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_MAP__STEPS = SPARK_OPERATION__STEPS;

	/**
	 * The feature id for the '<em><b>Parent Step</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_MAP__PARENT_STEP = SPARK_OPERATION__PARENT_STEP;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_MAP__TIMING = SPARK_OPERATION__TIMING;

	/**
	 * The feature id for the '<em><b>Is Atomic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_MAP__IS_ATOMIC = SPARK_OPERATION__IS_ATOMIC;

	/**
	 * The feature id for the '<em><b>Block T</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_MAP__BLOCK_T = SPARK_OPERATION__BLOCK_T;

	/**
	 * The feature id for the '<em><b>Rep</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_MAP__REP = SPARK_OPERATION__REP;

	/**
	 * The feature id for the '<em><b>Prob</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_MAP__PROB = SPARK_OPERATION__PROB;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_MAP__PRIORITY = SPARK_OPERATION__PRIORITY;

	/**
	 * The feature id for the '<em><b>Concur Res</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_MAP__CONCUR_RES = SPARK_OPERATION__CONCUR_RES;

	/**
	 * The feature id for the '<em><b>Host</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_MAP__HOST = SPARK_OPERATION__HOST;

	/**
	 * The feature id for the '<em><b>Serv Demand</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_MAP__SERV_DEMAND = SPARK_OPERATION__SERV_DEMAND;

	/**
	 * The feature id for the '<em><b>Serv Count</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_MAP__SERV_COUNT = SPARK_OPERATION__SERV_COUNT;

	/**
	 * The feature id for the '<em><b>Self Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_MAP__SELF_DELAY = SPARK_OPERATION__SELF_DELAY;

	/**
	 * The feature id for the '<em><b>Scenario</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_MAP__SCENARIO = SPARK_OPERATION__SCENARIO;

	/**
	 * The feature id for the '<em><b>Child Scenario</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_MAP__CHILD_SCENARIO = SPARK_OPERATION__CHILD_SCENARIO;

	/**
	 * The feature id for the '<em><b>RDD Available</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_MAP__RDD_AVAILABLE = SPARK_OPERATION__RDD_AVAILABLE;

	/**
	 * The feature id for the '<em><b>RDD</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_MAP__RDD = SPARK_OPERATION__RDD;

	/**
	 * The feature id for the '<em><b>Op Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_MAP__OP_TYPE = SPARK_OPERATION__OP_TYPE;

	/**
	 * The feature id for the '<em><b>Map Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_MAP__MAP_TYPE = SPARK_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_MAP_FEATURE_COUNT = SPARK_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link es.unizar.disco.dice.DTSM.Spark.impl.SparkNodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unizar.disco.dice.DTSM.Spark.impl.SparkNodeImpl
	 * @see es.unizar.disco.dice.DTSM.Spark.impl.SparkPackageImpl#getSparkNode()
	 * @generated
	 */
	int SPARK_NODE = 5;

	/**
	 * The feature id for the '<em><b>Res Mult</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_NODE__RES_MULT = CorePackage.CORE_COMPUTATION_NODE__RES_MULT;

	/**
	 * The feature id for the '<em><b>Is Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_NODE__IS_PROTECTED = CorePackage.CORE_COMPUTATION_NODE__IS_PROTECTED;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_NODE__IS_ACTIVE = CorePackage.CORE_COMPUTATION_NODE__IS_ACTIVE;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_NODE__BASE_PROPERTY = CorePackage.CORE_COMPUTATION_NODE__BASE_PROPERTY;

	/**
	 * The feature id for the '<em><b>Base Instance Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_NODE__BASE_INSTANCE_SPECIFICATION = CorePackage.CORE_COMPUTATION_NODE__BASE_INSTANCE_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Base Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_NODE__BASE_CLASSIFIER = CorePackage.CORE_COMPUTATION_NODE__BASE_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Base Lifeline</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_NODE__BASE_LIFELINE = CorePackage.CORE_COMPUTATION_NODE__BASE_LIFELINE;

	/**
	 * The feature id for the '<em><b>Base Connectable Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_NODE__BASE_CONNECTABLE_ELEMENT = CorePackage.CORE_COMPUTATION_NODE__BASE_CONNECTABLE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Stateful</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_NODE__STATEFUL = CorePackage.CORE_COMPUTATION_NODE__STATEFUL;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_NODE__ORIGIN = CorePackage.CORE_COMPUTATION_NODE__ORIGIN;

	/**
	 * The feature id for the '<em><b>Failure Coverage</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_NODE__FAILURE_COVERAGE = CorePackage.CORE_COMPUTATION_NODE__FAILURE_COVERAGE;

	/**
	 * The feature id for the '<em><b>Perc Perm Fault</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_NODE__PERC_PERM_FAULT = CorePackage.CORE_COMPUTATION_NODE__PERC_PERM_FAULT;

	/**
	 * The feature id for the '<em><b>Ss Avail</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_NODE__SS_AVAIL = CorePackage.CORE_COMPUTATION_NODE__SS_AVAIL;

	/**
	 * The feature id for the '<em><b>Unreliability</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_NODE__UNRELIABILITY = CorePackage.CORE_COMPUTATION_NODE__UNRELIABILITY;

	/**
	 * The feature id for the '<em><b>Reliability</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_NODE__RELIABILITY = CorePackage.CORE_COMPUTATION_NODE__RELIABILITY;

	/**
	 * The feature id for the '<em><b>Mission Time</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_NODE__MISSION_TIME = CorePackage.CORE_COMPUTATION_NODE__MISSION_TIME;

	/**
	 * The feature id for the '<em><b>Avail Level</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_NODE__AVAIL_LEVEL = CorePackage.CORE_COMPUTATION_NODE__AVAIL_LEVEL;

	/**
	 * The feature id for the '<em><b>Reliability Level</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_NODE__RELIABILITY_LEVEL = CorePackage.CORE_COMPUTATION_NODE__RELIABILITY_LEVEL;

	/**
	 * The feature id for the '<em><b>Safety Level</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_NODE__SAFETY_LEVEL = CorePackage.CORE_COMPUTATION_NODE__SAFETY_LEVEL;

	/**
	 * The feature id for the '<em><b>Complexity</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_NODE__COMPLEXITY = CorePackage.CORE_COMPUTATION_NODE__COMPLEXITY;

	/**
	 * The feature id for the '<em><b>Fault</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_NODE__FAULT = CorePackage.CORE_COMPUTATION_NODE__FAULT;

	/**
	 * The feature id for the '<em><b>Error</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_NODE__ERROR = CorePackage.CORE_COMPUTATION_NODE__ERROR;

	/**
	 * The feature id for the '<em><b>Failure</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_NODE__FAILURE = CorePackage.CORE_COMPUTATION_NODE__FAILURE;

	/**
	 * The feature id for the '<em><b>Hazard</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_NODE__HAZARD = CorePackage.CORE_COMPUTATION_NODE__HAZARD;

	/**
	 * The feature id for the '<em><b>Repair</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_NODE__REPAIR = CorePackage.CORE_COMPUTATION_NODE__REPAIR;

	/**
	 * The feature id for the '<em><b>Substituted By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_NODE__SUBSTITUTED_BY = CorePackage.CORE_COMPUTATION_NODE__SUBSTITUTED_BY;

	/**
	 * The feature id for the '<em><b>Node Throughput</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_NODE__NODE_THROUGHPUT = CorePackage.CORE_COMPUTATION_NODE__NODE_THROUGHPUT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_NODE__TYPE = CorePackage.CORE_COMPUTATION_NODE__TYPE;

	/**
	 * The feature id for the '<em><b>Target Tech</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_NODE__TARGET_TECH = CorePackage.CORE_COMPUTATION_NODE__TARGET_TECH;

	/**
	 * The feature id for the '<em><b>Proc Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_NODE__PROC_TYPE = CorePackage.CORE_COMPUTATION_NODE__PROC_TYPE;

	/**
	 * The feature id for the '<em><b>Has Successor</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_NODE__HAS_SUCCESSOR = CorePackage.CORE_COMPUTATION_NODE__HAS_SUCCESSOR;

	/**
	 * The feature id for the '<em><b>Process Input Data</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_NODE__PROCESS_INPUT_DATA = CorePackage.CORE_COMPUTATION_NODE__PROCESS_INPUT_DATA;

	/**
	 * The feature id for the '<em><b>Realise</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_NODE__REALISE = CorePackage.CORE_COMPUTATION_NODE__REALISE;

	/**
	 * The feature id for the '<em><b>Produce Output Data</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_NODE__PRODUCE_OUTPUT_DATA = CorePackage.CORE_COMPUTATION_NODE__PRODUCE_OUTPUT_DATA;

	/**
	 * The feature id for the '<em><b>Exec Time</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_NODE__EXEC_TIME = CorePackage.CORE_COMPUTATION_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Allocated Memory</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_NODE__ALLOCATED_MEMORY = CorePackage.CORE_COMPUTATION_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Used Memory</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_NODE__USED_MEMORY = CorePackage.CORE_COMPUTATION_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Power Peak</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_NODE__POWER_PEAK = CorePackage.CORE_COMPUTATION_NODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Energy</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_NODE__ENERGY = CorePackage.CORE_COMPUTATION_NODE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_NODE__BASE_NAMED_ELEMENT = CorePackage.CORE_COMPUTATION_NODE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Sub Usage</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_NODE__SUB_USAGE = CorePackage.CORE_COMPUTATION_NODE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Used Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_NODE__USED_RESOURCES = CorePackage.CORE_COMPUTATION_NODE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Msg Size</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_NODE__MSG_SIZE = CorePackage.CORE_COMPUTATION_NODE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_NODE__ON = CorePackage.CORE_COMPUTATION_NODE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Base Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_NODE__BASE_ACTION = CorePackage.CORE_COMPUTATION_NODE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Base Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_NODE__BASE_BEHAVIOR = CorePackage.CORE_COMPUTATION_NODE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Base Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_NODE__BASE_MESSAGE = CorePackage.CORE_COMPUTATION_NODE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_NODE__DURATION = CorePackage.CORE_COMPUTATION_NODE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_NODE__START = CorePackage.CORE_COMPUTATION_NODE_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Finish</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_NODE__FINISH = CorePackage.CORE_COMPUTATION_NODE_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Cause</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_NODE__CAUSE = CorePackage.CORE_COMPUTATION_NODE_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Host Demand</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_NODE__HOST_DEMAND = CorePackage.CORE_COMPUTATION_NODE_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Host Demand Ops</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_NODE__HOST_DEMAND_OPS = CorePackage.CORE_COMPUTATION_NODE_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Inter Occ T</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_NODE__INTER_OCC_T = CorePackage.CORE_COMPUTATION_NODE_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Throughput</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_NODE__THROUGHPUT = CorePackage.CORE_COMPUTATION_NODE_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Resp T</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_NODE__RESP_T = CorePackage.CORE_COMPUTATION_NODE_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Utilization</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_NODE__UTILIZATION = CorePackage.CORE_COMPUTATION_NODE_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Utilization On Host</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_NODE__UTILIZATION_ON_HOST = CorePackage.CORE_COMPUTATION_NODE_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_NODE__ROOT = CorePackage.CORE_COMPUTATION_NODE_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_NODE__STEPS = CorePackage.CORE_COMPUTATION_NODE_FEATURE_COUNT + 25;

	/**
	 * The feature id for the '<em><b>Parent Step</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_NODE__PARENT_STEP = CorePackage.CORE_COMPUTATION_NODE_FEATURE_COUNT + 26;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_NODE__TIMING = CorePackage.CORE_COMPUTATION_NODE_FEATURE_COUNT + 27;

	/**
	 * The feature id for the '<em><b>NCores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_NODE__NCORES = CorePackage.CORE_COMPUTATION_NODE_FEATURE_COUNT + 28;

	/**
	 * The feature id for the '<em><b>Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_NODE__MEMORY = CorePackage.CORE_COMPUTATION_NODE_FEATURE_COUNT + 29;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_NODE_FEATURE_COUNT = CorePackage.CORE_COMPUTATION_NODE_FEATURE_COUNT + 30;

	/**
	 * The meta object id for the '{@link es.unizar.disco.dice.DTSM.Spark.impl.SparkWorkloadEventImpl <em>Workload Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unizar.disco.dice.DTSM.Spark.impl.SparkWorkloadEventImpl
	 * @see es.unizar.disco.dice.DTSM.Spark.impl.SparkPackageImpl#getSparkWorkloadEvent()
	 * @generated
	 */
	int SPARK_WORKLOAD_EVENT = 6;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_WORKLOAD_EVENT__PATTERN = GQAMPackage.GA_WORKLOAD_EVENT__PATTERN;

	/**
	 * The feature id for the '<em><b>Generator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_WORKLOAD_EVENT__GENERATOR = GQAMPackage.GA_WORKLOAD_EVENT__GENERATOR;

	/**
	 * The feature id for the '<em><b>Trace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_WORKLOAD_EVENT__TRACE = GQAMPackage.GA_WORKLOAD_EVENT__TRACE;

	/**
	 * The feature id for the '<em><b>Effect</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_WORKLOAD_EVENT__EFFECT = GQAMPackage.GA_WORKLOAD_EVENT__EFFECT;

	/**
	 * The feature id for the '<em><b>Timed Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_WORKLOAD_EVENT__TIMED_EVENT = GQAMPackage.GA_WORKLOAD_EVENT__TIMED_EVENT;

	/**
	 * The feature id for the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_WORKLOAD_EVENT__BASE_NAMED_ELEMENT = GQAMPackage.GA_WORKLOAD_EVENT__BASE_NAMED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Spark Population</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_WORKLOAD_EVENT__SPARK_POPULATION = GQAMPackage.GA_WORKLOAD_EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Spark Ext Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_WORKLOAD_EVENT__SPARK_EXT_DELAY = GQAMPackage.GA_WORKLOAD_EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Workload Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_WORKLOAD_EVENT_FEATURE_COUNT = GQAMPackage.GA_WORKLOAD_EVENT_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link es.unizar.disco.dice.DTSM.Spark.SparkScenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scenario</em>'.
	 * @see es.unizar.disco.dice.DTSM.Spark.SparkScenario
	 * @generated
	 */
	EClass getSparkScenario();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DTSM.Spark.SparkScenario#getNAssignedCores <em>NAssigned Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>NAssigned Cores</em>'.
	 * @see es.unizar.disco.dice.DTSM.Spark.SparkScenario#getNAssignedCores()
	 * @see #getSparkScenario()
	 * @generated
	 */
	EAttribute getSparkScenario_NAssignedCores();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DTSM.Spark.SparkScenario#getNAssignedMemory <em>NAssigned Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>NAssigned Memory</em>'.
	 * @see es.unizar.disco.dice.DTSM.Spark.SparkScenario#getNAssignedMemory()
	 * @see #getSparkScenario()
	 * @generated
	 */
	EAttribute getSparkScenario_NAssignedMemory();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DTSM.Spark.SparkScenario#getJobSchedule <em>Job Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Job Schedule</em>'.
	 * @see es.unizar.disco.dice.DTSM.Spark.SparkScenario#getJobSchedule()
	 * @see #getSparkScenario()
	 * @generated
	 */
	EAttribute getSparkScenario_JobSchedule();

	/**
	 * Returns the meta object for class '{@link es.unizar.disco.dice.DTSM.Spark.SparkOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see es.unizar.disco.dice.DTSM.Spark.SparkOperation
	 * @generated
	 */
	EClass getSparkOperation();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DTSM.Spark.SparkOperation#getRDDAvailable <em>RDD Available</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>RDD Available</em>'.
	 * @see es.unizar.disco.dice.DTSM.Spark.SparkOperation#getRDDAvailable()
	 * @see #getSparkOperation()
	 * @generated
	 */
	EAttribute getSparkOperation_RDDAvailable();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DTSM.Spark.SparkOperation#getRDD <em>RDD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>RDD</em>'.
	 * @see es.unizar.disco.dice.DTSM.Spark.SparkOperation#getRDD()
	 * @see #getSparkOperation()
	 * @generated
	 */
	EAttribute getSparkOperation_RDD();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DTSM.Spark.SparkOperation#getOpType <em>Op Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Op Type</em>'.
	 * @see es.unizar.disco.dice.DTSM.Spark.SparkOperation#getOpType()
	 * @see #getSparkOperation()
	 * @generated
	 */
	EAttribute getSparkOperation_OpType();

	/**
	 * Returns the meta object for class '{@link es.unizar.disco.dice.DTSM.Spark.SparkReduce <em>Reduce</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reduce</em>'.
	 * @see es.unizar.disco.dice.DTSM.Spark.SparkReduce
	 * @generated
	 */
	EClass getSparkReduce();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DTSM.Spark.SparkReduce#getReduceType <em>Reduce Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reduce Type</em>'.
	 * @see es.unizar.disco.dice.DTSM.Spark.SparkReduce#getReduceType()
	 * @see #getSparkReduce()
	 * @generated
	 */
	EAttribute getSparkReduce_ReduceType();

	/**
	 * Returns the meta object for class '{@link es.unizar.disco.dice.DTSM.Spark.SparkForEach <em>For Each</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>For Each</em>'.
	 * @see es.unizar.disco.dice.DTSM.Spark.SparkForEach
	 * @generated
	 */
	EClass getSparkForEach();

	/**
	 * Returns the meta object for class '{@link es.unizar.disco.dice.DTSM.Spark.SparkMap <em>Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Map</em>'.
	 * @see es.unizar.disco.dice.DTSM.Spark.SparkMap
	 * @generated
	 */
	EClass getSparkMap();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DTSM.Spark.SparkMap#getMapType <em>Map Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Map Type</em>'.
	 * @see es.unizar.disco.dice.DTSM.Spark.SparkMap#getMapType()
	 * @see #getSparkMap()
	 * @generated
	 */
	EAttribute getSparkMap_MapType();

	/**
	 * Returns the meta object for class '{@link es.unizar.disco.dice.DTSM.Spark.SparkNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see es.unizar.disco.dice.DTSM.Spark.SparkNode
	 * @generated
	 */
	EClass getSparkNode();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DTSM.Spark.SparkNode#getNCores <em>NCores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>NCores</em>'.
	 * @see es.unizar.disco.dice.DTSM.Spark.SparkNode#getNCores()
	 * @see #getSparkNode()
	 * @generated
	 */
	EAttribute getSparkNode_NCores();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DTSM.Spark.SparkNode#getMemory <em>Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Memory</em>'.
	 * @see es.unizar.disco.dice.DTSM.Spark.SparkNode#getMemory()
	 * @see #getSparkNode()
	 * @generated
	 */
	EAttribute getSparkNode_Memory();

	/**
	 * Returns the meta object for class '{@link es.unizar.disco.dice.DTSM.Spark.SparkWorkloadEvent <em>Workload Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workload Event</em>'.
	 * @see es.unizar.disco.dice.DTSM.Spark.SparkWorkloadEvent
	 * @generated
	 */
	EClass getSparkWorkloadEvent();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DTSM.Spark.SparkWorkloadEvent#getSparkPopulation <em>Spark Population</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Spark Population</em>'.
	 * @see es.unizar.disco.dice.DTSM.Spark.SparkWorkloadEvent#getSparkPopulation()
	 * @see #getSparkWorkloadEvent()
	 * @generated
	 */
	EAttribute getSparkWorkloadEvent_SparkPopulation();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DTSM.Spark.SparkWorkloadEvent#getSparkExtDelay <em>Spark Ext Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Spark Ext Delay</em>'.
	 * @see es.unizar.disco.dice.DTSM.Spark.SparkWorkloadEvent#getSparkExtDelay()
	 * @see #getSparkWorkloadEvent()
	 * @generated
	 */
	EAttribute getSparkWorkloadEvent_SparkExtDelay();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SparkFactory getSparkFactory();

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
		 * The meta object literal for the '{@link es.unizar.disco.dice.DTSM.Spark.impl.SparkScenarioImpl <em>Scenario</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unizar.disco.dice.DTSM.Spark.impl.SparkScenarioImpl
		 * @see es.unizar.disco.dice.DTSM.Spark.impl.SparkPackageImpl#getSparkScenario()
		 * @generated
		 */
		EClass SPARK_SCENARIO = eINSTANCE.getSparkScenario();

		/**
		 * The meta object literal for the '<em><b>NAssigned Cores</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPARK_SCENARIO__NASSIGNED_CORES = eINSTANCE.getSparkScenario_NAssignedCores();

		/**
		 * The meta object literal for the '<em><b>NAssigned Memory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPARK_SCENARIO__NASSIGNED_MEMORY = eINSTANCE.getSparkScenario_NAssignedMemory();

		/**
		 * The meta object literal for the '<em><b>Job Schedule</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPARK_SCENARIO__JOB_SCHEDULE = eINSTANCE.getSparkScenario_JobSchedule();

		/**
		 * The meta object literal for the '{@link es.unizar.disco.dice.DTSM.Spark.impl.SparkOperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unizar.disco.dice.DTSM.Spark.impl.SparkOperationImpl
		 * @see es.unizar.disco.dice.DTSM.Spark.impl.SparkPackageImpl#getSparkOperation()
		 * @generated
		 */
		EClass SPARK_OPERATION = eINSTANCE.getSparkOperation();

		/**
		 * The meta object literal for the '<em><b>RDD Available</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPARK_OPERATION__RDD_AVAILABLE = eINSTANCE.getSparkOperation_RDDAvailable();

		/**
		 * The meta object literal for the '<em><b>RDD</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPARK_OPERATION__RDD = eINSTANCE.getSparkOperation_RDD();

		/**
		 * The meta object literal for the '<em><b>Op Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPARK_OPERATION__OP_TYPE = eINSTANCE.getSparkOperation_OpType();

		/**
		 * The meta object literal for the '{@link es.unizar.disco.dice.DTSM.Spark.impl.SparkReduceImpl <em>Reduce</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unizar.disco.dice.DTSM.Spark.impl.SparkReduceImpl
		 * @see es.unizar.disco.dice.DTSM.Spark.impl.SparkPackageImpl#getSparkReduce()
		 * @generated
		 */
		EClass SPARK_REDUCE = eINSTANCE.getSparkReduce();

		/**
		 * The meta object literal for the '<em><b>Reduce Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPARK_REDUCE__REDUCE_TYPE = eINSTANCE.getSparkReduce_ReduceType();

		/**
		 * The meta object literal for the '{@link es.unizar.disco.dice.DTSM.Spark.impl.SparkForEachImpl <em>For Each</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unizar.disco.dice.DTSM.Spark.impl.SparkForEachImpl
		 * @see es.unizar.disco.dice.DTSM.Spark.impl.SparkPackageImpl#getSparkForEach()
		 * @generated
		 */
		EClass SPARK_FOR_EACH = eINSTANCE.getSparkForEach();

		/**
		 * The meta object literal for the '{@link es.unizar.disco.dice.DTSM.Spark.impl.SparkMapImpl <em>Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unizar.disco.dice.DTSM.Spark.impl.SparkMapImpl
		 * @see es.unizar.disco.dice.DTSM.Spark.impl.SparkPackageImpl#getSparkMap()
		 * @generated
		 */
		EClass SPARK_MAP = eINSTANCE.getSparkMap();

		/**
		 * The meta object literal for the '<em><b>Map Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPARK_MAP__MAP_TYPE = eINSTANCE.getSparkMap_MapType();

		/**
		 * The meta object literal for the '{@link es.unizar.disco.dice.DTSM.Spark.impl.SparkNodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unizar.disco.dice.DTSM.Spark.impl.SparkNodeImpl
		 * @see es.unizar.disco.dice.DTSM.Spark.impl.SparkPackageImpl#getSparkNode()
		 * @generated
		 */
		EClass SPARK_NODE = eINSTANCE.getSparkNode();

		/**
		 * The meta object literal for the '<em><b>NCores</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPARK_NODE__NCORES = eINSTANCE.getSparkNode_NCores();

		/**
		 * The meta object literal for the '<em><b>Memory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPARK_NODE__MEMORY = eINSTANCE.getSparkNode_Memory();

		/**
		 * The meta object literal for the '{@link es.unizar.disco.dice.DTSM.Spark.impl.SparkWorkloadEventImpl <em>Workload Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unizar.disco.dice.DTSM.Spark.impl.SparkWorkloadEventImpl
		 * @see es.unizar.disco.dice.DTSM.Spark.impl.SparkPackageImpl#getSparkWorkloadEvent()
		 * @generated
		 */
		EClass SPARK_WORKLOAD_EVENT = eINSTANCE.getSparkWorkloadEvent();

		/**
		 * The meta object literal for the '<em><b>Spark Population</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPARK_WORKLOAD_EVENT__SPARK_POPULATION = eINSTANCE.getSparkWorkloadEvent_SparkPopulation();

		/**
		 * The meta object literal for the '<em><b>Spark Ext Delay</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPARK_WORKLOAD_EVENT__SPARK_EXT_DELAY = eINSTANCE.getSparkWorkloadEvent_SparkExtDelay();

	}

} //SparkPackage
