/**
 */
package es.unizar.disco.dice.DTSM.Hadoop;

import com.masdes.dam.Core.CorePackage;

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
 * @see es.unizar.disco.dice.DTSM.Hadoop.HadoopFactory
 * @model kind="package"
 * @generated
 */
public interface HadoopPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Hadoop";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://es.unizar.disco.dice/profiles/DTSM/Hadoop/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Hadoop";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HadoopPackage eINSTANCE = es.unizar.disco.dice.DTSM.Hadoop.impl.HadoopPackageImpl.init();

	/**
	 * The meta object id for the '{@link es.unizar.disco.dice.DTSM.Hadoop.impl.HadoopMapReduceJobImpl <em>Map Reduce Job</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unizar.disco.dice.DTSM.Hadoop.impl.HadoopMapReduceJobImpl
	 * @see es.unizar.disco.dice.DTSM.Hadoop.impl.HadoopPackageImpl#getHadoopMapReduceJob()
	 * @generated
	 */
	int HADOOP_MAP_REDUCE_JOB = 0;

	/**
	 * The feature id for the '<em><b>Map Resuce Phases</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_MAP_REDUCE_JOB__MAP_RESUCE_PHASES = 0;

	/**
	 * The feature id for the '<em><b>Base Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_MAP_REDUCE_JOB__BASE_CLASSIFIER = 1;

	/**
	 * The number of structural features of the '<em>Map Reduce Job</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_MAP_REDUCE_JOB_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link es.unizar.disco.dice.DTSM.Hadoop.impl.HadoopMapReducePhaseImpl <em>Map Reduce Phase</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unizar.disco.dice.DTSM.Hadoop.impl.HadoopMapReducePhaseImpl
	 * @see es.unizar.disco.dice.DTSM.Hadoop.impl.HadoopPackageImpl#getHadoopMapReducePhase()
	 * @generated
	 */
	int HADOOP_MAP_REDUCE_PHASE = 1;

	/**
	 * The feature id for the '<em><b>Has Map</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_MAP_REDUCE_PHASE__HAS_MAP = 0;

	/**
	 * The feature id for the '<em><b>Has Reduce</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_MAP_REDUCE_PHASE__HAS_REDUCE = 1;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_MAP_REDUCE_PHASE__OUTPUT = 2;

	/**
	 * The feature id for the '<em><b>Base Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_MAP_REDUCE_PHASE__BASE_CLASSIFIER = 3;

	/**
	 * The number of structural features of the '<em>Map Reduce Phase</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_MAP_REDUCE_PHASE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link es.unizar.disco.dice.DTSM.Hadoop.impl.HadoopOperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unizar.disco.dice.DTSM.Hadoop.impl.HadoopOperationImpl
	 * @see es.unizar.disco.dice.DTSM.Hadoop.impl.HadoopPackageImpl#getHadoopOperation()
	 * @generated
	 */
	int HADOOP_OPERATION = 3;

	/**
	 * The feature id for the '<em><b>Exec Time</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_OPERATION__EXEC_TIME = GQAMPackage.GA_STEP__EXEC_TIME;

	/**
	 * The feature id for the '<em><b>Allocated Memory</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_OPERATION__ALLOCATED_MEMORY = GQAMPackage.GA_STEP__ALLOCATED_MEMORY;

	/**
	 * The feature id for the '<em><b>Used Memory</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_OPERATION__USED_MEMORY = GQAMPackage.GA_STEP__USED_MEMORY;

	/**
	 * The feature id for the '<em><b>Power Peak</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_OPERATION__POWER_PEAK = GQAMPackage.GA_STEP__POWER_PEAK;

	/**
	 * The feature id for the '<em><b>Energy</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_OPERATION__ENERGY = GQAMPackage.GA_STEP__ENERGY;

	/**
	 * The feature id for the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_OPERATION__BASE_NAMED_ELEMENT = GQAMPackage.GA_STEP__BASE_NAMED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Sub Usage</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_OPERATION__SUB_USAGE = GQAMPackage.GA_STEP__SUB_USAGE;

	/**
	 * The feature id for the '<em><b>Used Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_OPERATION__USED_RESOURCES = GQAMPackage.GA_STEP__USED_RESOURCES;

	/**
	 * The feature id for the '<em><b>Msg Size</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_OPERATION__MSG_SIZE = GQAMPackage.GA_STEP__MSG_SIZE;

	/**
	 * The feature id for the '<em><b>On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_OPERATION__ON = GQAMPackage.GA_STEP__ON;

	/**
	 * The feature id for the '<em><b>Base Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_OPERATION__BASE_ACTION = GQAMPackage.GA_STEP__BASE_ACTION;

	/**
	 * The feature id for the '<em><b>Base Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_OPERATION__BASE_BEHAVIOR = GQAMPackage.GA_STEP__BASE_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Base Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_OPERATION__BASE_MESSAGE = GQAMPackage.GA_STEP__BASE_MESSAGE;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_OPERATION__DURATION = GQAMPackage.GA_STEP__DURATION;

	/**
	 * The feature id for the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_OPERATION__START = GQAMPackage.GA_STEP__START;

	/**
	 * The feature id for the '<em><b>Finish</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_OPERATION__FINISH = GQAMPackage.GA_STEP__FINISH;

	/**
	 * The feature id for the '<em><b>Cause</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_OPERATION__CAUSE = GQAMPackage.GA_STEP__CAUSE;

	/**
	 * The feature id for the '<em><b>Host Demand</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_OPERATION__HOST_DEMAND = GQAMPackage.GA_STEP__HOST_DEMAND;

	/**
	 * The feature id for the '<em><b>Host Demand Ops</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_OPERATION__HOST_DEMAND_OPS = GQAMPackage.GA_STEP__HOST_DEMAND_OPS;

	/**
	 * The feature id for the '<em><b>Inter Occ T</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_OPERATION__INTER_OCC_T = GQAMPackage.GA_STEP__INTER_OCC_T;

	/**
	 * The feature id for the '<em><b>Throughput</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_OPERATION__THROUGHPUT = GQAMPackage.GA_STEP__THROUGHPUT;

	/**
	 * The feature id for the '<em><b>Resp T</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_OPERATION__RESP_T = GQAMPackage.GA_STEP__RESP_T;

	/**
	 * The feature id for the '<em><b>Utilization</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_OPERATION__UTILIZATION = GQAMPackage.GA_STEP__UTILIZATION;

	/**
	 * The feature id for the '<em><b>Utilization On Host</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_OPERATION__UTILIZATION_ON_HOST = GQAMPackage.GA_STEP__UTILIZATION_ON_HOST;

	/**
	 * The feature id for the '<em><b>Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_OPERATION__ROOT = GQAMPackage.GA_STEP__ROOT;

	/**
	 * The feature id for the '<em><b>Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_OPERATION__STEPS = GQAMPackage.GA_STEP__STEPS;

	/**
	 * The feature id for the '<em><b>Parent Step</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_OPERATION__PARENT_STEP = GQAMPackage.GA_STEP__PARENT_STEP;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_OPERATION__TIMING = GQAMPackage.GA_STEP__TIMING;

	/**
	 * The feature id for the '<em><b>Is Atomic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_OPERATION__IS_ATOMIC = GQAMPackage.GA_STEP__IS_ATOMIC;

	/**
	 * The feature id for the '<em><b>Block T</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_OPERATION__BLOCK_T = GQAMPackage.GA_STEP__BLOCK_T;

	/**
	 * The feature id for the '<em><b>Rep</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_OPERATION__REP = GQAMPackage.GA_STEP__REP;

	/**
	 * The feature id for the '<em><b>Prob</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_OPERATION__PROB = GQAMPackage.GA_STEP__PROB;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_OPERATION__PRIORITY = GQAMPackage.GA_STEP__PRIORITY;

	/**
	 * The feature id for the '<em><b>Concur Res</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_OPERATION__CONCUR_RES = GQAMPackage.GA_STEP__CONCUR_RES;

	/**
	 * The feature id for the '<em><b>Host</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_OPERATION__HOST = GQAMPackage.GA_STEP__HOST;

	/**
	 * The feature id for the '<em><b>Serv Demand</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_OPERATION__SERV_DEMAND = GQAMPackage.GA_STEP__SERV_DEMAND;

	/**
	 * The feature id for the '<em><b>Serv Count</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_OPERATION__SERV_COUNT = GQAMPackage.GA_STEP__SERV_COUNT;

	/**
	 * The feature id for the '<em><b>Self Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_OPERATION__SELF_DELAY = GQAMPackage.GA_STEP__SELF_DELAY;

	/**
	 * The feature id for the '<em><b>Scenario</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_OPERATION__SCENARIO = GQAMPackage.GA_STEP__SCENARIO;

	/**
	 * The feature id for the '<em><b>Child Scenario</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_OPERATION__CHILD_SCENARIO = GQAMPackage.GA_STEP__CHILD_SCENARIO;

	/**
	 * The feature id for the '<em><b>Parallelism</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_OPERATION__PARALLELISM = GQAMPackage.GA_STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>NTasks</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_OPERATION__NTASKS = GQAMPackage.GA_STEP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_OPERATION_FEATURE_COUNT = GQAMPackage.GA_STEP_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link es.unizar.disco.dice.DTSM.Hadoop.impl.HadoopMapImpl <em>Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unizar.disco.dice.DTSM.Hadoop.impl.HadoopMapImpl
	 * @see es.unizar.disco.dice.DTSM.Hadoop.impl.HadoopPackageImpl#getHadoopMap()
	 * @generated
	 */
	int HADOOP_MAP = 2;

	/**
	 * The feature id for the '<em><b>Exec Time</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_MAP__EXEC_TIME = HADOOP_OPERATION__EXEC_TIME;

	/**
	 * The feature id for the '<em><b>Allocated Memory</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_MAP__ALLOCATED_MEMORY = HADOOP_OPERATION__ALLOCATED_MEMORY;

	/**
	 * The feature id for the '<em><b>Used Memory</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_MAP__USED_MEMORY = HADOOP_OPERATION__USED_MEMORY;

	/**
	 * The feature id for the '<em><b>Power Peak</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_MAP__POWER_PEAK = HADOOP_OPERATION__POWER_PEAK;

	/**
	 * The feature id for the '<em><b>Energy</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_MAP__ENERGY = HADOOP_OPERATION__ENERGY;

	/**
	 * The feature id for the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_MAP__BASE_NAMED_ELEMENT = HADOOP_OPERATION__BASE_NAMED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Sub Usage</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_MAP__SUB_USAGE = HADOOP_OPERATION__SUB_USAGE;

	/**
	 * The feature id for the '<em><b>Used Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_MAP__USED_RESOURCES = HADOOP_OPERATION__USED_RESOURCES;

	/**
	 * The feature id for the '<em><b>Msg Size</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_MAP__MSG_SIZE = HADOOP_OPERATION__MSG_SIZE;

	/**
	 * The feature id for the '<em><b>On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_MAP__ON = HADOOP_OPERATION__ON;

	/**
	 * The feature id for the '<em><b>Base Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_MAP__BASE_ACTION = HADOOP_OPERATION__BASE_ACTION;

	/**
	 * The feature id for the '<em><b>Base Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_MAP__BASE_BEHAVIOR = HADOOP_OPERATION__BASE_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Base Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_MAP__BASE_MESSAGE = HADOOP_OPERATION__BASE_MESSAGE;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_MAP__DURATION = HADOOP_OPERATION__DURATION;

	/**
	 * The feature id for the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_MAP__START = HADOOP_OPERATION__START;

	/**
	 * The feature id for the '<em><b>Finish</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_MAP__FINISH = HADOOP_OPERATION__FINISH;

	/**
	 * The feature id for the '<em><b>Cause</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_MAP__CAUSE = HADOOP_OPERATION__CAUSE;

	/**
	 * The feature id for the '<em><b>Host Demand</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_MAP__HOST_DEMAND = HADOOP_OPERATION__HOST_DEMAND;

	/**
	 * The feature id for the '<em><b>Host Demand Ops</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_MAP__HOST_DEMAND_OPS = HADOOP_OPERATION__HOST_DEMAND_OPS;

	/**
	 * The feature id for the '<em><b>Inter Occ T</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_MAP__INTER_OCC_T = HADOOP_OPERATION__INTER_OCC_T;

	/**
	 * The feature id for the '<em><b>Throughput</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_MAP__THROUGHPUT = HADOOP_OPERATION__THROUGHPUT;

	/**
	 * The feature id for the '<em><b>Resp T</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_MAP__RESP_T = HADOOP_OPERATION__RESP_T;

	/**
	 * The feature id for the '<em><b>Utilization</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_MAP__UTILIZATION = HADOOP_OPERATION__UTILIZATION;

	/**
	 * The feature id for the '<em><b>Utilization On Host</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_MAP__UTILIZATION_ON_HOST = HADOOP_OPERATION__UTILIZATION_ON_HOST;

	/**
	 * The feature id for the '<em><b>Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_MAP__ROOT = HADOOP_OPERATION__ROOT;

	/**
	 * The feature id for the '<em><b>Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_MAP__STEPS = HADOOP_OPERATION__STEPS;

	/**
	 * The feature id for the '<em><b>Parent Step</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_MAP__PARENT_STEP = HADOOP_OPERATION__PARENT_STEP;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_MAP__TIMING = HADOOP_OPERATION__TIMING;

	/**
	 * The feature id for the '<em><b>Is Atomic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_MAP__IS_ATOMIC = HADOOP_OPERATION__IS_ATOMIC;

	/**
	 * The feature id for the '<em><b>Block T</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_MAP__BLOCK_T = HADOOP_OPERATION__BLOCK_T;

	/**
	 * The feature id for the '<em><b>Rep</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_MAP__REP = HADOOP_OPERATION__REP;

	/**
	 * The feature id for the '<em><b>Prob</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_MAP__PROB = HADOOP_OPERATION__PROB;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_MAP__PRIORITY = HADOOP_OPERATION__PRIORITY;

	/**
	 * The feature id for the '<em><b>Concur Res</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_MAP__CONCUR_RES = HADOOP_OPERATION__CONCUR_RES;

	/**
	 * The feature id for the '<em><b>Host</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_MAP__HOST = HADOOP_OPERATION__HOST;

	/**
	 * The feature id for the '<em><b>Serv Demand</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_MAP__SERV_DEMAND = HADOOP_OPERATION__SERV_DEMAND;

	/**
	 * The feature id for the '<em><b>Serv Count</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_MAP__SERV_COUNT = HADOOP_OPERATION__SERV_COUNT;

	/**
	 * The feature id for the '<em><b>Self Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_MAP__SELF_DELAY = HADOOP_OPERATION__SELF_DELAY;

	/**
	 * The feature id for the '<em><b>Scenario</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_MAP__SCENARIO = HADOOP_OPERATION__SCENARIO;

	/**
	 * The feature id for the '<em><b>Child Scenario</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_MAP__CHILD_SCENARIO = HADOOP_OPERATION__CHILD_SCENARIO;

	/**
	 * The feature id for the '<em><b>Parallelism</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_MAP__PARALLELISM = HADOOP_OPERATION__PARALLELISM;

	/**
	 * The feature id for the '<em><b>NTasks</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_MAP__NTASKS = HADOOP_OPERATION__NTASKS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_MAP__TYPE = HADOOP_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_MAP_FEATURE_COUNT = HADOOP_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link es.unizar.disco.dice.DTSM.Hadoop.impl.HadoopReduceImpl <em>Reduce</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unizar.disco.dice.DTSM.Hadoop.impl.HadoopReduceImpl
	 * @see es.unizar.disco.dice.DTSM.Hadoop.impl.HadoopPackageImpl#getHadoopReduce()
	 * @generated
	 */
	int HADOOP_REDUCE = 4;

	/**
	 * The feature id for the '<em><b>Exec Time</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_REDUCE__EXEC_TIME = HADOOP_OPERATION__EXEC_TIME;

	/**
	 * The feature id for the '<em><b>Allocated Memory</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_REDUCE__ALLOCATED_MEMORY = HADOOP_OPERATION__ALLOCATED_MEMORY;

	/**
	 * The feature id for the '<em><b>Used Memory</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_REDUCE__USED_MEMORY = HADOOP_OPERATION__USED_MEMORY;

	/**
	 * The feature id for the '<em><b>Power Peak</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_REDUCE__POWER_PEAK = HADOOP_OPERATION__POWER_PEAK;

	/**
	 * The feature id for the '<em><b>Energy</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_REDUCE__ENERGY = HADOOP_OPERATION__ENERGY;

	/**
	 * The feature id for the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_REDUCE__BASE_NAMED_ELEMENT = HADOOP_OPERATION__BASE_NAMED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Sub Usage</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_REDUCE__SUB_USAGE = HADOOP_OPERATION__SUB_USAGE;

	/**
	 * The feature id for the '<em><b>Used Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_REDUCE__USED_RESOURCES = HADOOP_OPERATION__USED_RESOURCES;

	/**
	 * The feature id for the '<em><b>Msg Size</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_REDUCE__MSG_SIZE = HADOOP_OPERATION__MSG_SIZE;

	/**
	 * The feature id for the '<em><b>On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_REDUCE__ON = HADOOP_OPERATION__ON;

	/**
	 * The feature id for the '<em><b>Base Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_REDUCE__BASE_ACTION = HADOOP_OPERATION__BASE_ACTION;

	/**
	 * The feature id for the '<em><b>Base Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_REDUCE__BASE_BEHAVIOR = HADOOP_OPERATION__BASE_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Base Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_REDUCE__BASE_MESSAGE = HADOOP_OPERATION__BASE_MESSAGE;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_REDUCE__DURATION = HADOOP_OPERATION__DURATION;

	/**
	 * The feature id for the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_REDUCE__START = HADOOP_OPERATION__START;

	/**
	 * The feature id for the '<em><b>Finish</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_REDUCE__FINISH = HADOOP_OPERATION__FINISH;

	/**
	 * The feature id for the '<em><b>Cause</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_REDUCE__CAUSE = HADOOP_OPERATION__CAUSE;

	/**
	 * The feature id for the '<em><b>Host Demand</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_REDUCE__HOST_DEMAND = HADOOP_OPERATION__HOST_DEMAND;

	/**
	 * The feature id for the '<em><b>Host Demand Ops</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_REDUCE__HOST_DEMAND_OPS = HADOOP_OPERATION__HOST_DEMAND_OPS;

	/**
	 * The feature id for the '<em><b>Inter Occ T</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_REDUCE__INTER_OCC_T = HADOOP_OPERATION__INTER_OCC_T;

	/**
	 * The feature id for the '<em><b>Throughput</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_REDUCE__THROUGHPUT = HADOOP_OPERATION__THROUGHPUT;

	/**
	 * The feature id for the '<em><b>Resp T</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_REDUCE__RESP_T = HADOOP_OPERATION__RESP_T;

	/**
	 * The feature id for the '<em><b>Utilization</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_REDUCE__UTILIZATION = HADOOP_OPERATION__UTILIZATION;

	/**
	 * The feature id for the '<em><b>Utilization On Host</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_REDUCE__UTILIZATION_ON_HOST = HADOOP_OPERATION__UTILIZATION_ON_HOST;

	/**
	 * The feature id for the '<em><b>Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_REDUCE__ROOT = HADOOP_OPERATION__ROOT;

	/**
	 * The feature id for the '<em><b>Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_REDUCE__STEPS = HADOOP_OPERATION__STEPS;

	/**
	 * The feature id for the '<em><b>Parent Step</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_REDUCE__PARENT_STEP = HADOOP_OPERATION__PARENT_STEP;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_REDUCE__TIMING = HADOOP_OPERATION__TIMING;

	/**
	 * The feature id for the '<em><b>Is Atomic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_REDUCE__IS_ATOMIC = HADOOP_OPERATION__IS_ATOMIC;

	/**
	 * The feature id for the '<em><b>Block T</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_REDUCE__BLOCK_T = HADOOP_OPERATION__BLOCK_T;

	/**
	 * The feature id for the '<em><b>Rep</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_REDUCE__REP = HADOOP_OPERATION__REP;

	/**
	 * The feature id for the '<em><b>Prob</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_REDUCE__PROB = HADOOP_OPERATION__PROB;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_REDUCE__PRIORITY = HADOOP_OPERATION__PRIORITY;

	/**
	 * The feature id for the '<em><b>Concur Res</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_REDUCE__CONCUR_RES = HADOOP_OPERATION__CONCUR_RES;

	/**
	 * The feature id for the '<em><b>Host</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_REDUCE__HOST = HADOOP_OPERATION__HOST;

	/**
	 * The feature id for the '<em><b>Serv Demand</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_REDUCE__SERV_DEMAND = HADOOP_OPERATION__SERV_DEMAND;

	/**
	 * The feature id for the '<em><b>Serv Count</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_REDUCE__SERV_COUNT = HADOOP_OPERATION__SERV_COUNT;

	/**
	 * The feature id for the '<em><b>Self Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_REDUCE__SELF_DELAY = HADOOP_OPERATION__SELF_DELAY;

	/**
	 * The feature id for the '<em><b>Scenario</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_REDUCE__SCENARIO = HADOOP_OPERATION__SCENARIO;

	/**
	 * The feature id for the '<em><b>Child Scenario</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_REDUCE__CHILD_SCENARIO = HADOOP_OPERATION__CHILD_SCENARIO;

	/**
	 * The feature id for the '<em><b>Parallelism</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_REDUCE__PARALLELISM = HADOOP_OPERATION__PARALLELISM;

	/**
	 * The feature id for the '<em><b>NTasks</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_REDUCE__NTASKS = HADOOP_OPERATION__NTASKS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_REDUCE__TYPE = HADOOP_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Reduce</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_REDUCE_FEATURE_COUNT = HADOOP_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link es.unizar.disco.dice.DTSM.Hadoop.impl.HadoopScenarioImpl <em>Scenario</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unizar.disco.dice.DTSM.Hadoop.impl.HadoopScenarioImpl
	 * @see es.unizar.disco.dice.DTSM.Hadoop.impl.HadoopPackageImpl#getHadoopScenario()
	 * @generated
	 */
	int HADOOP_SCENARIO = 5;

	/**
	 * The feature id for the '<em><b>Exec Time</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_SCENARIO__EXEC_TIME = CorePackage.DA_SERVICE__EXEC_TIME;

	/**
	 * The feature id for the '<em><b>Allocated Memory</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_SCENARIO__ALLOCATED_MEMORY = CorePackage.DA_SERVICE__ALLOCATED_MEMORY;

	/**
	 * The feature id for the '<em><b>Used Memory</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_SCENARIO__USED_MEMORY = CorePackage.DA_SERVICE__USED_MEMORY;

	/**
	 * The feature id for the '<em><b>Power Peak</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_SCENARIO__POWER_PEAK = CorePackage.DA_SERVICE__POWER_PEAK;

	/**
	 * The feature id for the '<em><b>Energy</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_SCENARIO__ENERGY = CorePackage.DA_SERVICE__ENERGY;

	/**
	 * The feature id for the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_SCENARIO__BASE_NAMED_ELEMENT = CorePackage.DA_SERVICE__BASE_NAMED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Sub Usage</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_SCENARIO__SUB_USAGE = CorePackage.DA_SERVICE__SUB_USAGE;

	/**
	 * The feature id for the '<em><b>Used Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_SCENARIO__USED_RESOURCES = CorePackage.DA_SERVICE__USED_RESOURCES;

	/**
	 * The feature id for the '<em><b>Msg Size</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_SCENARIO__MSG_SIZE = CorePackage.DA_SERVICE__MSG_SIZE;

	/**
	 * The feature id for the '<em><b>On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_SCENARIO__ON = CorePackage.DA_SERVICE__ON;

	/**
	 * The feature id for the '<em><b>Base Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_SCENARIO__BASE_ACTION = CorePackage.DA_SERVICE__BASE_ACTION;

	/**
	 * The feature id for the '<em><b>Base Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_SCENARIO__BASE_BEHAVIOR = CorePackage.DA_SERVICE__BASE_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Base Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_SCENARIO__BASE_MESSAGE = CorePackage.DA_SERVICE__BASE_MESSAGE;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_SCENARIO__DURATION = CorePackage.DA_SERVICE__DURATION;

	/**
	 * The feature id for the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_SCENARIO__START = CorePackage.DA_SERVICE__START;

	/**
	 * The feature id for the '<em><b>Finish</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_SCENARIO__FINISH = CorePackage.DA_SERVICE__FINISH;

	/**
	 * The feature id for the '<em><b>Cause</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_SCENARIO__CAUSE = CorePackage.DA_SERVICE__CAUSE;

	/**
	 * The feature id for the '<em><b>Host Demand</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_SCENARIO__HOST_DEMAND = CorePackage.DA_SERVICE__HOST_DEMAND;

	/**
	 * The feature id for the '<em><b>Host Demand Ops</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_SCENARIO__HOST_DEMAND_OPS = CorePackage.DA_SERVICE__HOST_DEMAND_OPS;

	/**
	 * The feature id for the '<em><b>Inter Occ T</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_SCENARIO__INTER_OCC_T = CorePackage.DA_SERVICE__INTER_OCC_T;

	/**
	 * The feature id for the '<em><b>Throughput</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_SCENARIO__THROUGHPUT = CorePackage.DA_SERVICE__THROUGHPUT;

	/**
	 * The feature id for the '<em><b>Resp T</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_SCENARIO__RESP_T = CorePackage.DA_SERVICE__RESP_T;

	/**
	 * The feature id for the '<em><b>Utilization</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_SCENARIO__UTILIZATION = CorePackage.DA_SERVICE__UTILIZATION;

	/**
	 * The feature id for the '<em><b>Utilization On Host</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_SCENARIO__UTILIZATION_ON_HOST = CorePackage.DA_SERVICE__UTILIZATION_ON_HOST;

	/**
	 * The feature id for the '<em><b>Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_SCENARIO__ROOT = CorePackage.DA_SERVICE__ROOT;

	/**
	 * The feature id for the '<em><b>Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_SCENARIO__STEPS = CorePackage.DA_SERVICE__STEPS;

	/**
	 * The feature id for the '<em><b>Parent Step</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_SCENARIO__PARENT_STEP = CorePackage.DA_SERVICE__PARENT_STEP;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_SCENARIO__TIMING = CorePackage.DA_SERVICE__TIMING;

	/**
	 * The feature id for the '<em><b>Exec Prob</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_SCENARIO__EXEC_PROB = CorePackage.DA_SERVICE__EXEC_PROB;

	/**
	 * The feature id for the '<em><b>Ss Avail</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_SCENARIO__SS_AVAIL = CorePackage.DA_SERVICE__SS_AVAIL;

	/**
	 * The feature id for the '<em><b>Inst Avail</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_SCENARIO__INST_AVAIL = CorePackage.DA_SERVICE__INST_AVAIL;

	/**
	 * The feature id for the '<em><b>Unreliability</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_SCENARIO__UNRELIABILITY = CorePackage.DA_SERVICE__UNRELIABILITY;

	/**
	 * The feature id for the '<em><b>Reliability</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_SCENARIO__RELIABILITY = CorePackage.DA_SERVICE__RELIABILITY;

	/**
	 * The feature id for the '<em><b>Mission Time</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_SCENARIO__MISSION_TIME = CorePackage.DA_SERVICE__MISSION_TIME;

	/**
	 * The feature id for the '<em><b>Avail Level</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_SCENARIO__AVAIL_LEVEL = CorePackage.DA_SERVICE__AVAIL_LEVEL;

	/**
	 * The feature id for the '<em><b>Reliab Level</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_SCENARIO__RELIAB_LEVEL = CorePackage.DA_SERVICE__RELIAB_LEVEL;

	/**
	 * The feature id for the '<em><b>Safety Level</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_SCENARIO__SAFETY_LEVEL = CorePackage.DA_SERVICE__SAFETY_LEVEL;

	/**
	 * The feature id for the '<em><b>Complexity</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_SCENARIO__COMPLEXITY = CorePackage.DA_SERVICE__COMPLEXITY;

	/**
	 * The feature id for the '<em><b>Failure</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_SCENARIO__FAILURE = CorePackage.DA_SERVICE__FAILURE;

	/**
	 * The feature id for the '<em><b>Hazard</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_SCENARIO__HAZARD = CorePackage.DA_SERVICE__HAZARD;

	/**
	 * The feature id for the '<em><b>Recovery</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_SCENARIO__RECOVERY = CorePackage.DA_SERVICE__RECOVERY;

	/**
	 * The feature id for the '<em><b>Conf Level</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_SCENARIO__CONF_LEVEL = CorePackage.DA_SERVICE__CONF_LEVEL;

	/**
	 * The feature id for the '<em><b>Integ Level</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_SCENARIO__INTEG_LEVEL = CorePackage.DA_SERVICE__INTEG_LEVEL;

	/**
	 * The feature id for the '<em><b>Job Schedule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_SCENARIO__JOB_SCHEDULE = CorePackage.DA_SERVICE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Scenario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_SCENARIO_FEATURE_COUNT = CorePackage.DA_SERVICE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link es.unizar.disco.dice.DTSM.Hadoop.impl.HadoopWorkloadEventImpl <em>Workload Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unizar.disco.dice.DTSM.Hadoop.impl.HadoopWorkloadEventImpl
	 * @see es.unizar.disco.dice.DTSM.Hadoop.impl.HadoopPackageImpl#getHadoopWorkloadEvent()
	 * @generated
	 */
	int HADOOP_WORKLOAD_EVENT = 6;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_WORKLOAD_EVENT__PATTERN = GQAMPackage.GA_WORKLOAD_EVENT__PATTERN;

	/**
	 * The feature id for the '<em><b>Generator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_WORKLOAD_EVENT__GENERATOR = GQAMPackage.GA_WORKLOAD_EVENT__GENERATOR;

	/**
	 * The feature id for the '<em><b>Trace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_WORKLOAD_EVENT__TRACE = GQAMPackage.GA_WORKLOAD_EVENT__TRACE;

	/**
	 * The feature id for the '<em><b>Effect</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_WORKLOAD_EVENT__EFFECT = GQAMPackage.GA_WORKLOAD_EVENT__EFFECT;

	/**
	 * The feature id for the '<em><b>Timed Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_WORKLOAD_EVENT__TIMED_EVENT = GQAMPackage.GA_WORKLOAD_EVENT__TIMED_EVENT;

	/**
	 * The feature id for the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_WORKLOAD_EVENT__BASE_NAMED_ELEMENT = GQAMPackage.GA_WORKLOAD_EVENT__BASE_NAMED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Hadoop Population</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_WORKLOAD_EVENT__HADOOP_POPULATION = GQAMPackage.GA_WORKLOAD_EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Hadoop Ext Delay</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_WORKLOAD_EVENT__HADOOP_EXT_DELAY = GQAMPackage.GA_WORKLOAD_EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Workload Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_WORKLOAD_EVENT_FEATURE_COUNT = GQAMPackage.GA_WORKLOAD_EVENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link es.unizar.disco.dice.DTSM.Hadoop.impl.HadoopComputationNodeImpl <em>Computation Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unizar.disco.dice.DTSM.Hadoop.impl.HadoopComputationNodeImpl
	 * @see es.unizar.disco.dice.DTSM.Hadoop.impl.HadoopPackageImpl#getHadoopComputationNode()
	 * @generated
	 */
	int HADOOP_COMPUTATION_NODE = 7;

	/**
	 * The feature id for the '<em><b>Res Mult</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_COMPUTATION_NODE__RES_MULT = es.unizar.disco.dice.DTSM.Core.CorePackage.CORE_COMPUTATION_NODE__RES_MULT;

	/**
	 * The feature id for the '<em><b>Is Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_COMPUTATION_NODE__IS_PROTECTED = es.unizar.disco.dice.DTSM.Core.CorePackage.CORE_COMPUTATION_NODE__IS_PROTECTED;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_COMPUTATION_NODE__IS_ACTIVE = es.unizar.disco.dice.DTSM.Core.CorePackage.CORE_COMPUTATION_NODE__IS_ACTIVE;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_COMPUTATION_NODE__BASE_PROPERTY = es.unizar.disco.dice.DTSM.Core.CorePackage.CORE_COMPUTATION_NODE__BASE_PROPERTY;

	/**
	 * The feature id for the '<em><b>Base Instance Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_COMPUTATION_NODE__BASE_INSTANCE_SPECIFICATION = es.unizar.disco.dice.DTSM.Core.CorePackage.CORE_COMPUTATION_NODE__BASE_INSTANCE_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Base Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_COMPUTATION_NODE__BASE_CLASSIFIER = es.unizar.disco.dice.DTSM.Core.CorePackage.CORE_COMPUTATION_NODE__BASE_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Base Lifeline</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_COMPUTATION_NODE__BASE_LIFELINE = es.unizar.disco.dice.DTSM.Core.CorePackage.CORE_COMPUTATION_NODE__BASE_LIFELINE;

	/**
	 * The feature id for the '<em><b>Base Connectable Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_COMPUTATION_NODE__BASE_CONNECTABLE_ELEMENT = es.unizar.disco.dice.DTSM.Core.CorePackage.CORE_COMPUTATION_NODE__BASE_CONNECTABLE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Stateful</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_COMPUTATION_NODE__STATEFUL = es.unizar.disco.dice.DTSM.Core.CorePackage.CORE_COMPUTATION_NODE__STATEFUL;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_COMPUTATION_NODE__ORIGIN = es.unizar.disco.dice.DTSM.Core.CorePackage.CORE_COMPUTATION_NODE__ORIGIN;

	/**
	 * The feature id for the '<em><b>Failure Coverage</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_COMPUTATION_NODE__FAILURE_COVERAGE = es.unizar.disco.dice.DTSM.Core.CorePackage.CORE_COMPUTATION_NODE__FAILURE_COVERAGE;

	/**
	 * The feature id for the '<em><b>Perc Perm Fault</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_COMPUTATION_NODE__PERC_PERM_FAULT = es.unizar.disco.dice.DTSM.Core.CorePackage.CORE_COMPUTATION_NODE__PERC_PERM_FAULT;

	/**
	 * The feature id for the '<em><b>Ss Avail</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_COMPUTATION_NODE__SS_AVAIL = es.unizar.disco.dice.DTSM.Core.CorePackage.CORE_COMPUTATION_NODE__SS_AVAIL;

	/**
	 * The feature id for the '<em><b>Unreliability</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_COMPUTATION_NODE__UNRELIABILITY = es.unizar.disco.dice.DTSM.Core.CorePackage.CORE_COMPUTATION_NODE__UNRELIABILITY;

	/**
	 * The feature id for the '<em><b>Reliability</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_COMPUTATION_NODE__RELIABILITY = es.unizar.disco.dice.DTSM.Core.CorePackage.CORE_COMPUTATION_NODE__RELIABILITY;

	/**
	 * The feature id for the '<em><b>Mission Time</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_COMPUTATION_NODE__MISSION_TIME = es.unizar.disco.dice.DTSM.Core.CorePackage.CORE_COMPUTATION_NODE__MISSION_TIME;

	/**
	 * The feature id for the '<em><b>Avail Level</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_COMPUTATION_NODE__AVAIL_LEVEL = es.unizar.disco.dice.DTSM.Core.CorePackage.CORE_COMPUTATION_NODE__AVAIL_LEVEL;

	/**
	 * The feature id for the '<em><b>Reliability Level</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_COMPUTATION_NODE__RELIABILITY_LEVEL = es.unizar.disco.dice.DTSM.Core.CorePackage.CORE_COMPUTATION_NODE__RELIABILITY_LEVEL;

	/**
	 * The feature id for the '<em><b>Safety Level</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_COMPUTATION_NODE__SAFETY_LEVEL = es.unizar.disco.dice.DTSM.Core.CorePackage.CORE_COMPUTATION_NODE__SAFETY_LEVEL;

	/**
	 * The feature id for the '<em><b>Complexity</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_COMPUTATION_NODE__COMPLEXITY = es.unizar.disco.dice.DTSM.Core.CorePackage.CORE_COMPUTATION_NODE__COMPLEXITY;

	/**
	 * The feature id for the '<em><b>Fault</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_COMPUTATION_NODE__FAULT = es.unizar.disco.dice.DTSM.Core.CorePackage.CORE_COMPUTATION_NODE__FAULT;

	/**
	 * The feature id for the '<em><b>Error</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_COMPUTATION_NODE__ERROR = es.unizar.disco.dice.DTSM.Core.CorePackage.CORE_COMPUTATION_NODE__ERROR;

	/**
	 * The feature id for the '<em><b>Failure</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_COMPUTATION_NODE__FAILURE = es.unizar.disco.dice.DTSM.Core.CorePackage.CORE_COMPUTATION_NODE__FAILURE;

	/**
	 * The feature id for the '<em><b>Hazard</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_COMPUTATION_NODE__HAZARD = es.unizar.disco.dice.DTSM.Core.CorePackage.CORE_COMPUTATION_NODE__HAZARD;

	/**
	 * The feature id for the '<em><b>Repair</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_COMPUTATION_NODE__REPAIR = es.unizar.disco.dice.DTSM.Core.CorePackage.CORE_COMPUTATION_NODE__REPAIR;

	/**
	 * The feature id for the '<em><b>Substituted By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_COMPUTATION_NODE__SUBSTITUTED_BY = es.unizar.disco.dice.DTSM.Core.CorePackage.CORE_COMPUTATION_NODE__SUBSTITUTED_BY;

	/**
	 * The feature id for the '<em><b>Node Throughput</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_COMPUTATION_NODE__NODE_THROUGHPUT = es.unizar.disco.dice.DTSM.Core.CorePackage.CORE_COMPUTATION_NODE__NODE_THROUGHPUT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_COMPUTATION_NODE__TYPE = es.unizar.disco.dice.DTSM.Core.CorePackage.CORE_COMPUTATION_NODE__TYPE;

	/**
	 * The feature id for the '<em><b>Target Tech</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_COMPUTATION_NODE__TARGET_TECH = es.unizar.disco.dice.DTSM.Core.CorePackage.CORE_COMPUTATION_NODE__TARGET_TECH;

	/**
	 * The feature id for the '<em><b>Proc Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_COMPUTATION_NODE__PROC_TYPE = es.unizar.disco.dice.DTSM.Core.CorePackage.CORE_COMPUTATION_NODE__PROC_TYPE;

	/**
	 * The feature id for the '<em><b>Has Successor</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_COMPUTATION_NODE__HAS_SUCCESSOR = es.unizar.disco.dice.DTSM.Core.CorePackage.CORE_COMPUTATION_NODE__HAS_SUCCESSOR;

	/**
	 * The feature id for the '<em><b>Process Input Data</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_COMPUTATION_NODE__PROCESS_INPUT_DATA = es.unizar.disco.dice.DTSM.Core.CorePackage.CORE_COMPUTATION_NODE__PROCESS_INPUT_DATA;

	/**
	 * The feature id for the '<em><b>Realise</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_COMPUTATION_NODE__REALISE = es.unizar.disco.dice.DTSM.Core.CorePackage.CORE_COMPUTATION_NODE__REALISE;

	/**
	 * The feature id for the '<em><b>Produce Output Data</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_COMPUTATION_NODE__PRODUCE_OUTPUT_DATA = es.unizar.disco.dice.DTSM.Core.CorePackage.CORE_COMPUTATION_NODE__PRODUCE_OUTPUT_DATA;

	/**
	 * The feature id for the '<em><b>NCores</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_COMPUTATION_NODE__NCORES = es.unizar.disco.dice.DTSM.Core.CorePackage.CORE_COMPUTATION_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Computation Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HADOOP_COMPUTATION_NODE_FEATURE_COUNT = es.unizar.disco.dice.DTSM.Core.CorePackage.CORE_COMPUTATION_NODE_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link es.unizar.disco.dice.DTSM.Hadoop.HadoopMapReduceJob <em>Map Reduce Job</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Map Reduce Job</em>'.
	 * @see es.unizar.disco.dice.DTSM.Hadoop.HadoopMapReduceJob
	 * @generated
	 */
	EClass getHadoopMapReduceJob();

	/**
	 * Returns the meta object for the reference list '{@link es.unizar.disco.dice.DTSM.Hadoop.HadoopMapReduceJob#getMapResucePhases <em>Map Resuce Phases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Map Resuce Phases</em>'.
	 * @see es.unizar.disco.dice.DTSM.Hadoop.HadoopMapReduceJob#getMapResucePhases()
	 * @see #getHadoopMapReduceJob()
	 * @generated
	 */
	EReference getHadoopMapReduceJob_MapResucePhases();

	/**
	 * Returns the meta object for the reference '{@link es.unizar.disco.dice.DTSM.Hadoop.HadoopMapReduceJob#getBase_Classifier <em>Base Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Classifier</em>'.
	 * @see es.unizar.disco.dice.DTSM.Hadoop.HadoopMapReduceJob#getBase_Classifier()
	 * @see #getHadoopMapReduceJob()
	 * @generated
	 */
	EReference getHadoopMapReduceJob_Base_Classifier();

	/**
	 * Returns the meta object for class '{@link es.unizar.disco.dice.DTSM.Hadoop.HadoopMapReducePhase <em>Map Reduce Phase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Map Reduce Phase</em>'.
	 * @see es.unizar.disco.dice.DTSM.Hadoop.HadoopMapReducePhase
	 * @generated
	 */
	EClass getHadoopMapReducePhase();

	/**
	 * Returns the meta object for the reference '{@link es.unizar.disco.dice.DTSM.Hadoop.HadoopMapReducePhase#getHasMap <em>Has Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has Map</em>'.
	 * @see es.unizar.disco.dice.DTSM.Hadoop.HadoopMapReducePhase#getHasMap()
	 * @see #getHadoopMapReducePhase()
	 * @generated
	 */
	EReference getHadoopMapReducePhase_HasMap();

	/**
	 * Returns the meta object for the reference '{@link es.unizar.disco.dice.DTSM.Hadoop.HadoopMapReducePhase#getHasReduce <em>Has Reduce</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has Reduce</em>'.
	 * @see es.unizar.disco.dice.DTSM.Hadoop.HadoopMapReducePhase#getHasReduce()
	 * @see #getHadoopMapReducePhase()
	 * @generated
	 */
	EReference getHadoopMapReducePhase_HasReduce();

	/**
	 * Returns the meta object for the reference '{@link es.unizar.disco.dice.DTSM.Hadoop.HadoopMapReducePhase#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output</em>'.
	 * @see es.unizar.disco.dice.DTSM.Hadoop.HadoopMapReducePhase#getOutput()
	 * @see #getHadoopMapReducePhase()
	 * @generated
	 */
	EReference getHadoopMapReducePhase_Output();

	/**
	 * Returns the meta object for the reference '{@link es.unizar.disco.dice.DTSM.Hadoop.HadoopMapReducePhase#getBase_Classifier <em>Base Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Classifier</em>'.
	 * @see es.unizar.disco.dice.DTSM.Hadoop.HadoopMapReducePhase#getBase_Classifier()
	 * @see #getHadoopMapReducePhase()
	 * @generated
	 */
	EReference getHadoopMapReducePhase_Base_Classifier();

	/**
	 * Returns the meta object for class '{@link es.unizar.disco.dice.DTSM.Hadoop.HadoopMap <em>Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Map</em>'.
	 * @see es.unizar.disco.dice.DTSM.Hadoop.HadoopMap
	 * @generated
	 */
	EClass getHadoopMap();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DTSM.Hadoop.HadoopMap#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see es.unizar.disco.dice.DTSM.Hadoop.HadoopMap#getType()
	 * @see #getHadoopMap()
	 * @generated
	 */
	EAttribute getHadoopMap_Type();

	/**
	 * Returns the meta object for class '{@link es.unizar.disco.dice.DTSM.Hadoop.HadoopOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see es.unizar.disco.dice.DTSM.Hadoop.HadoopOperation
	 * @generated
	 */
	EClass getHadoopOperation();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DTSM.Hadoop.HadoopOperation#getParallelism <em>Parallelism</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parallelism</em>'.
	 * @see es.unizar.disco.dice.DTSM.Hadoop.HadoopOperation#getParallelism()
	 * @see #getHadoopOperation()
	 * @generated
	 */
	EAttribute getHadoopOperation_Parallelism();

	/**
	 * Returns the meta object for the attribute list '{@link es.unizar.disco.dice.DTSM.Hadoop.HadoopOperation#getNTasks <em>NTasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>NTasks</em>'.
	 * @see es.unizar.disco.dice.DTSM.Hadoop.HadoopOperation#getNTasks()
	 * @see #getHadoopOperation()
	 * @generated
	 */
	EAttribute getHadoopOperation_NTasks();

	/**
	 * Returns the meta object for class '{@link es.unizar.disco.dice.DTSM.Hadoop.HadoopReduce <em>Reduce</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reduce</em>'.
	 * @see es.unizar.disco.dice.DTSM.Hadoop.HadoopReduce
	 * @generated
	 */
	EClass getHadoopReduce();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DTSM.Hadoop.HadoopReduce#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see es.unizar.disco.dice.DTSM.Hadoop.HadoopReduce#getType()
	 * @see #getHadoopReduce()
	 * @generated
	 */
	EAttribute getHadoopReduce_Type();

	/**
	 * Returns the meta object for class '{@link es.unizar.disco.dice.DTSM.Hadoop.HadoopScenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scenario</em>'.
	 * @see es.unizar.disco.dice.DTSM.Hadoop.HadoopScenario
	 * @generated
	 */
	EClass getHadoopScenario();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DTSM.Hadoop.HadoopScenario#getJobSchedule <em>Job Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Job Schedule</em>'.
	 * @see es.unizar.disco.dice.DTSM.Hadoop.HadoopScenario#getJobSchedule()
	 * @see #getHadoopScenario()
	 * @generated
	 */
	EAttribute getHadoopScenario_JobSchedule();

	/**
	 * Returns the meta object for class '{@link es.unizar.disco.dice.DTSM.Hadoop.HadoopWorkloadEvent <em>Workload Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workload Event</em>'.
	 * @see es.unizar.disco.dice.DTSM.Hadoop.HadoopWorkloadEvent
	 * @generated
	 */
	EClass getHadoopWorkloadEvent();

	/**
	 * Returns the meta object for the attribute list '{@link es.unizar.disco.dice.DTSM.Hadoop.HadoopWorkloadEvent#getHadoopPopulation <em>Hadoop Population</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Hadoop Population</em>'.
	 * @see es.unizar.disco.dice.DTSM.Hadoop.HadoopWorkloadEvent#getHadoopPopulation()
	 * @see #getHadoopWorkloadEvent()
	 * @generated
	 */
	EAttribute getHadoopWorkloadEvent_HadoopPopulation();

	/**
	 * Returns the meta object for the attribute list '{@link es.unizar.disco.dice.DTSM.Hadoop.HadoopWorkloadEvent#getHadoopExtDelay <em>Hadoop Ext Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Hadoop Ext Delay</em>'.
	 * @see es.unizar.disco.dice.DTSM.Hadoop.HadoopWorkloadEvent#getHadoopExtDelay()
	 * @see #getHadoopWorkloadEvent()
	 * @generated
	 */
	EAttribute getHadoopWorkloadEvent_HadoopExtDelay();

	/**
	 * Returns the meta object for class '{@link es.unizar.disco.dice.DTSM.Hadoop.HadoopComputationNode <em>Computation Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Computation Node</em>'.
	 * @see es.unizar.disco.dice.DTSM.Hadoop.HadoopComputationNode
	 * @generated
	 */
	EClass getHadoopComputationNode();

	/**
	 * Returns the meta object for the attribute list '{@link es.unizar.disco.dice.DTSM.Hadoop.HadoopComputationNode#getNCores <em>NCores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>NCores</em>'.
	 * @see es.unizar.disco.dice.DTSM.Hadoop.HadoopComputationNode#getNCores()
	 * @see #getHadoopComputationNode()
	 * @generated
	 */
	EAttribute getHadoopComputationNode_NCores();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	HadoopFactory getHadoopFactory();

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
		 * The meta object literal for the '{@link es.unizar.disco.dice.DTSM.Hadoop.impl.HadoopMapReduceJobImpl <em>Map Reduce Job</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unizar.disco.dice.DTSM.Hadoop.impl.HadoopMapReduceJobImpl
		 * @see es.unizar.disco.dice.DTSM.Hadoop.impl.HadoopPackageImpl#getHadoopMapReduceJob()
		 * @generated
		 */
		EClass HADOOP_MAP_REDUCE_JOB = eINSTANCE.getHadoopMapReduceJob();

		/**
		 * The meta object literal for the '<em><b>Map Resuce Phases</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HADOOP_MAP_REDUCE_JOB__MAP_RESUCE_PHASES = eINSTANCE.getHadoopMapReduceJob_MapResucePhases();

		/**
		 * The meta object literal for the '<em><b>Base Classifier</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HADOOP_MAP_REDUCE_JOB__BASE_CLASSIFIER = eINSTANCE.getHadoopMapReduceJob_Base_Classifier();

		/**
		 * The meta object literal for the '{@link es.unizar.disco.dice.DTSM.Hadoop.impl.HadoopMapReducePhaseImpl <em>Map Reduce Phase</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unizar.disco.dice.DTSM.Hadoop.impl.HadoopMapReducePhaseImpl
		 * @see es.unizar.disco.dice.DTSM.Hadoop.impl.HadoopPackageImpl#getHadoopMapReducePhase()
		 * @generated
		 */
		EClass HADOOP_MAP_REDUCE_PHASE = eINSTANCE.getHadoopMapReducePhase();

		/**
		 * The meta object literal for the '<em><b>Has Map</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HADOOP_MAP_REDUCE_PHASE__HAS_MAP = eINSTANCE.getHadoopMapReducePhase_HasMap();

		/**
		 * The meta object literal for the '<em><b>Has Reduce</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HADOOP_MAP_REDUCE_PHASE__HAS_REDUCE = eINSTANCE.getHadoopMapReducePhase_HasReduce();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HADOOP_MAP_REDUCE_PHASE__OUTPUT = eINSTANCE.getHadoopMapReducePhase_Output();

		/**
		 * The meta object literal for the '<em><b>Base Classifier</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HADOOP_MAP_REDUCE_PHASE__BASE_CLASSIFIER = eINSTANCE.getHadoopMapReducePhase_Base_Classifier();

		/**
		 * The meta object literal for the '{@link es.unizar.disco.dice.DTSM.Hadoop.impl.HadoopMapImpl <em>Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unizar.disco.dice.DTSM.Hadoop.impl.HadoopMapImpl
		 * @see es.unizar.disco.dice.DTSM.Hadoop.impl.HadoopPackageImpl#getHadoopMap()
		 * @generated
		 */
		EClass HADOOP_MAP = eINSTANCE.getHadoopMap();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HADOOP_MAP__TYPE = eINSTANCE.getHadoopMap_Type();

		/**
		 * The meta object literal for the '{@link es.unizar.disco.dice.DTSM.Hadoop.impl.HadoopOperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unizar.disco.dice.DTSM.Hadoop.impl.HadoopOperationImpl
		 * @see es.unizar.disco.dice.DTSM.Hadoop.impl.HadoopPackageImpl#getHadoopOperation()
		 * @generated
		 */
		EClass HADOOP_OPERATION = eINSTANCE.getHadoopOperation();

		/**
		 * The meta object literal for the '<em><b>Parallelism</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HADOOP_OPERATION__PARALLELISM = eINSTANCE.getHadoopOperation_Parallelism();

		/**
		 * The meta object literal for the '<em><b>NTasks</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HADOOP_OPERATION__NTASKS = eINSTANCE.getHadoopOperation_NTasks();

		/**
		 * The meta object literal for the '{@link es.unizar.disco.dice.DTSM.Hadoop.impl.HadoopReduceImpl <em>Reduce</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unizar.disco.dice.DTSM.Hadoop.impl.HadoopReduceImpl
		 * @see es.unizar.disco.dice.DTSM.Hadoop.impl.HadoopPackageImpl#getHadoopReduce()
		 * @generated
		 */
		EClass HADOOP_REDUCE = eINSTANCE.getHadoopReduce();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HADOOP_REDUCE__TYPE = eINSTANCE.getHadoopReduce_Type();

		/**
		 * The meta object literal for the '{@link es.unizar.disco.dice.DTSM.Hadoop.impl.HadoopScenarioImpl <em>Scenario</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unizar.disco.dice.DTSM.Hadoop.impl.HadoopScenarioImpl
		 * @see es.unizar.disco.dice.DTSM.Hadoop.impl.HadoopPackageImpl#getHadoopScenario()
		 * @generated
		 */
		EClass HADOOP_SCENARIO = eINSTANCE.getHadoopScenario();

		/**
		 * The meta object literal for the '<em><b>Job Schedule</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HADOOP_SCENARIO__JOB_SCHEDULE = eINSTANCE.getHadoopScenario_JobSchedule();

		/**
		 * The meta object literal for the '{@link es.unizar.disco.dice.DTSM.Hadoop.impl.HadoopWorkloadEventImpl <em>Workload Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unizar.disco.dice.DTSM.Hadoop.impl.HadoopWorkloadEventImpl
		 * @see es.unizar.disco.dice.DTSM.Hadoop.impl.HadoopPackageImpl#getHadoopWorkloadEvent()
		 * @generated
		 */
		EClass HADOOP_WORKLOAD_EVENT = eINSTANCE.getHadoopWorkloadEvent();

		/**
		 * The meta object literal for the '<em><b>Hadoop Population</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HADOOP_WORKLOAD_EVENT__HADOOP_POPULATION = eINSTANCE.getHadoopWorkloadEvent_HadoopPopulation();

		/**
		 * The meta object literal for the '<em><b>Hadoop Ext Delay</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HADOOP_WORKLOAD_EVENT__HADOOP_EXT_DELAY = eINSTANCE.getHadoopWorkloadEvent_HadoopExtDelay();

		/**
		 * The meta object literal for the '{@link es.unizar.disco.dice.DTSM.Hadoop.impl.HadoopComputationNodeImpl <em>Computation Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unizar.disco.dice.DTSM.Hadoop.impl.HadoopComputationNodeImpl
		 * @see es.unizar.disco.dice.DTSM.Hadoop.impl.HadoopPackageImpl#getHadoopComputationNode()
		 * @generated
		 */
		EClass HADOOP_COMPUTATION_NODE = eINSTANCE.getHadoopComputationNode();

		/**
		 * The meta object literal for the '<em><b>NCores</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HADOOP_COMPUTATION_NODE__NCORES = eINSTANCE.getHadoopComputationNode_NCores();

	}

} //HadoopPackage
