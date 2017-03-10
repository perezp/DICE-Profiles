/**
 */
package es.unizar.disco.dice.DDSM.impl;

import es.unizar.disco.dice.DDSM.DDSMPackage;
import es.unizar.disco.dice.DDSM.DdsmKafkaCluster;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.uml2.uml.ExecutionEnvironment;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ddsm Kafka Cluster</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.unizar.disco.dice.DDSM.impl.DdsmKafkaClusterImpl#getBase_ExecutionEnvironment <em>Base Execution Environment</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.impl.DdsmKafkaClusterImpl#isEnable_topic_deletion <em>Enable topic deletion</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.impl.DdsmKafkaClusterImpl#getNum_network_threads <em>Num network threads</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.impl.DdsmKafkaClusterImpl#getNum_io_threads <em>Num io threads</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.impl.DdsmKafkaClusterImpl#getNum_log_partition_per_topic <em>Num log partition per topic</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.impl.DdsmKafkaClusterImpl#getNum_recovery_threads_per_data_dir <em>Num recovery threads per data dir</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.impl.DdsmKafkaClusterImpl#getNum_messages_for_flush_to_dick <em>Num messages for flush to dick</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.impl.DdsmKafkaClusterImpl#getMax_message_sit_time_before_flush_ms <em>Max message sit time before flush ms</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.impl.DdsmKafkaClusterImpl#isEnable_topic_auto_creation <em>Enable topic auto creation</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.impl.DdsmKafkaClusterImpl#isEnable_leader_rebalancing <em>Enable leader rebalancing</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.impl.DdsmKafkaClusterImpl#getLog_retention_hours <em>Log retention hours</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.impl.DdsmKafkaClusterImpl#getQueued_max_requests <em>Queued max requests</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DdsmKafkaClusterImpl extends DdsmPeerToPeerPlatformImpl implements DdsmKafkaCluster {
	/**
	 * The cached value of the '{@link #getBase_ExecutionEnvironment() <em>Base Execution Environment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_ExecutionEnvironment()
	 * @generated
	 * @ordered
	 */
	protected ExecutionEnvironment base_ExecutionEnvironment;

	/**
	 * The default value of the '{@link #isEnable_topic_deletion() <em>Enable topic deletion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnable_topic_deletion()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ENABLE_TOPIC_DELETION_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isEnable_topic_deletion() <em>Enable topic deletion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnable_topic_deletion()
	 * @generated
	 * @ordered
	 */
	protected boolean enable_topic_deletion = ENABLE_TOPIC_DELETION_EDEFAULT;
	/**
	 * The default value of the '{@link #getNum_network_threads() <em>Num network threads</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNum_network_threads()
	 * @generated
	 * @ordered
	 */
	protected static final int NUM_NETWORK_THREADS_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getNum_network_threads() <em>Num network threads</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNum_network_threads()
	 * @generated
	 * @ordered
	 */
	protected int num_network_threads = NUM_NETWORK_THREADS_EDEFAULT;
	/**
	 * The default value of the '{@link #getNum_io_threads() <em>Num io threads</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNum_io_threads()
	 * @generated
	 * @ordered
	 */
	protected static final int NUM_IO_THREADS_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getNum_io_threads() <em>Num io threads</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNum_io_threads()
	 * @generated
	 * @ordered
	 */
	protected int num_io_threads = NUM_IO_THREADS_EDEFAULT;
	/**
	 * The default value of the '{@link #getNum_log_partition_per_topic() <em>Num log partition per topic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNum_log_partition_per_topic()
	 * @generated
	 * @ordered
	 */
	protected static final int NUM_LOG_PARTITION_PER_TOPIC_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getNum_log_partition_per_topic() <em>Num log partition per topic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNum_log_partition_per_topic()
	 * @generated
	 * @ordered
	 */
	protected int num_log_partition_per_topic = NUM_LOG_PARTITION_PER_TOPIC_EDEFAULT;
	/**
	 * The default value of the '{@link #getNum_recovery_threads_per_data_dir() <em>Num recovery threads per data dir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNum_recovery_threads_per_data_dir()
	 * @generated
	 * @ordered
	 */
	protected static final int NUM_RECOVERY_THREADS_PER_DATA_DIR_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getNum_recovery_threads_per_data_dir() <em>Num recovery threads per data dir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNum_recovery_threads_per_data_dir()
	 * @generated
	 * @ordered
	 */
	protected int num_recovery_threads_per_data_dir = NUM_RECOVERY_THREADS_PER_DATA_DIR_EDEFAULT;
	/**
	 * The default value of the '{@link #getNum_messages_for_flush_to_dick() <em>Num messages for flush to dick</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNum_messages_for_flush_to_dick()
	 * @generated
	 * @ordered
	 */
	protected static final int NUM_MESSAGES_FOR_FLUSH_TO_DICK_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getNum_messages_for_flush_to_dick() <em>Num messages for flush to dick</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNum_messages_for_flush_to_dick()
	 * @generated
	 * @ordered
	 */
	protected int num_messages_for_flush_to_dick = NUM_MESSAGES_FOR_FLUSH_TO_DICK_EDEFAULT;
	/**
	 * The default value of the '{@link #getMax_message_sit_time_before_flush_ms() <em>Max message sit time before flush ms</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax_message_sit_time_before_flush_ms()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_MESSAGE_SIT_TIME_BEFORE_FLUSH_MS_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getMax_message_sit_time_before_flush_ms() <em>Max message sit time before flush ms</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax_message_sit_time_before_flush_ms()
	 * @generated
	 * @ordered
	 */
	protected int max_message_sit_time_before_flush_ms = MAX_MESSAGE_SIT_TIME_BEFORE_FLUSH_MS_EDEFAULT;
	/**
	 * The default value of the '{@link #isEnable_topic_auto_creation() <em>Enable topic auto creation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnable_topic_auto_creation()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ENABLE_TOPIC_AUTO_CREATION_EDEFAULT = true;
	/**
	 * The cached value of the '{@link #isEnable_topic_auto_creation() <em>Enable topic auto creation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnable_topic_auto_creation()
	 * @generated
	 * @ordered
	 */
	protected boolean enable_topic_auto_creation = ENABLE_TOPIC_AUTO_CREATION_EDEFAULT;
	/**
	 * The default value of the '{@link #isEnable_leader_rebalancing() <em>Enable leader rebalancing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnable_leader_rebalancing()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ENABLE_LEADER_REBALANCING_EDEFAULT = true;
	/**
	 * The cached value of the '{@link #isEnable_leader_rebalancing() <em>Enable leader rebalancing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnable_leader_rebalancing()
	 * @generated
	 * @ordered
	 */
	protected boolean enable_leader_rebalancing = ENABLE_LEADER_REBALANCING_EDEFAULT;
	/**
	 * The default value of the '{@link #getLog_retention_hours() <em>Log retention hours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLog_retention_hours()
	 * @generated
	 * @ordered
	 */
	protected static final int LOG_RETENTION_HOURS_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getLog_retention_hours() <em>Log retention hours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLog_retention_hours()
	 * @generated
	 * @ordered
	 */
	protected int log_retention_hours = LOG_RETENTION_HOURS_EDEFAULT;
	/**
	 * The default value of the '{@link #getQueued_max_requests() <em>Queued max requests</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueued_max_requests()
	 * @generated
	 * @ordered
	 */
	protected static final int QUEUED_MAX_REQUESTS_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getQueued_max_requests() <em>Queued max requests</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueued_max_requests()
	 * @generated
	 * @ordered
	 */
	protected int queued_max_requests = QUEUED_MAX_REQUESTS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DdsmKafkaClusterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DDSMPackage.Literals.DDSM_KAFKA_CLUSTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionEnvironment getBase_ExecutionEnvironment() {
		if (base_ExecutionEnvironment != null && base_ExecutionEnvironment.eIsProxy()) {
			InternalEObject oldBase_ExecutionEnvironment = (InternalEObject)base_ExecutionEnvironment;
			base_ExecutionEnvironment = (ExecutionEnvironment)eResolveProxy(oldBase_ExecutionEnvironment);
			if (base_ExecutionEnvironment != oldBase_ExecutionEnvironment) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DDSMPackage.DDSM_KAFKA_CLUSTER__BASE_EXECUTION_ENVIRONMENT, oldBase_ExecutionEnvironment, base_ExecutionEnvironment));
			}
		}
		return base_ExecutionEnvironment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionEnvironment basicGetBase_ExecutionEnvironment() {
		return base_ExecutionEnvironment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_ExecutionEnvironment(ExecutionEnvironment newBase_ExecutionEnvironment) {
		ExecutionEnvironment oldBase_ExecutionEnvironment = base_ExecutionEnvironment;
		base_ExecutionEnvironment = newBase_ExecutionEnvironment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DDSMPackage.DDSM_KAFKA_CLUSTER__BASE_EXECUTION_ENVIRONMENT, oldBase_ExecutionEnvironment, base_ExecutionEnvironment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEnable_topic_deletion() {
		return enable_topic_deletion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnable_topic_deletion(boolean newEnable_topic_deletion) {
		boolean oldEnable_topic_deletion = enable_topic_deletion;
		enable_topic_deletion = newEnable_topic_deletion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DDSMPackage.DDSM_KAFKA_CLUSTER__ENABLE_TOPIC_DELETION, oldEnable_topic_deletion, enable_topic_deletion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNum_network_threads() {
		return num_network_threads;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNum_network_threads(int newNum_network_threads) {
		int oldNum_network_threads = num_network_threads;
		num_network_threads = newNum_network_threads;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DDSMPackage.DDSM_KAFKA_CLUSTER__NUM_NETWORK_THREADS, oldNum_network_threads, num_network_threads));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNum_io_threads() {
		return num_io_threads;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNum_io_threads(int newNum_io_threads) {
		int oldNum_io_threads = num_io_threads;
		num_io_threads = newNum_io_threads;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DDSMPackage.DDSM_KAFKA_CLUSTER__NUM_IO_THREADS, oldNum_io_threads, num_io_threads));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNum_log_partition_per_topic() {
		return num_log_partition_per_topic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNum_log_partition_per_topic(int newNum_log_partition_per_topic) {
		int oldNum_log_partition_per_topic = num_log_partition_per_topic;
		num_log_partition_per_topic = newNum_log_partition_per_topic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DDSMPackage.DDSM_KAFKA_CLUSTER__NUM_LOG_PARTITION_PER_TOPIC, oldNum_log_partition_per_topic, num_log_partition_per_topic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNum_recovery_threads_per_data_dir() {
		return num_recovery_threads_per_data_dir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNum_recovery_threads_per_data_dir(int newNum_recovery_threads_per_data_dir) {
		int oldNum_recovery_threads_per_data_dir = num_recovery_threads_per_data_dir;
		num_recovery_threads_per_data_dir = newNum_recovery_threads_per_data_dir;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DDSMPackage.DDSM_KAFKA_CLUSTER__NUM_RECOVERY_THREADS_PER_DATA_DIR, oldNum_recovery_threads_per_data_dir, num_recovery_threads_per_data_dir));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNum_messages_for_flush_to_dick() {
		return num_messages_for_flush_to_dick;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNum_messages_for_flush_to_dick(int newNum_messages_for_flush_to_dick) {
		int oldNum_messages_for_flush_to_dick = num_messages_for_flush_to_dick;
		num_messages_for_flush_to_dick = newNum_messages_for_flush_to_dick;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DDSMPackage.DDSM_KAFKA_CLUSTER__NUM_MESSAGES_FOR_FLUSH_TO_DICK, oldNum_messages_for_flush_to_dick, num_messages_for_flush_to_dick));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMax_message_sit_time_before_flush_ms() {
		return max_message_sit_time_before_flush_ms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMax_message_sit_time_before_flush_ms(int newMax_message_sit_time_before_flush_ms) {
		int oldMax_message_sit_time_before_flush_ms = max_message_sit_time_before_flush_ms;
		max_message_sit_time_before_flush_ms = newMax_message_sit_time_before_flush_ms;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DDSMPackage.DDSM_KAFKA_CLUSTER__MAX_MESSAGE_SIT_TIME_BEFORE_FLUSH_MS, oldMax_message_sit_time_before_flush_ms, max_message_sit_time_before_flush_ms));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEnable_topic_auto_creation() {
		return enable_topic_auto_creation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnable_topic_auto_creation(boolean newEnable_topic_auto_creation) {
		boolean oldEnable_topic_auto_creation = enable_topic_auto_creation;
		enable_topic_auto_creation = newEnable_topic_auto_creation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DDSMPackage.DDSM_KAFKA_CLUSTER__ENABLE_TOPIC_AUTO_CREATION, oldEnable_topic_auto_creation, enable_topic_auto_creation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEnable_leader_rebalancing() {
		return enable_leader_rebalancing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnable_leader_rebalancing(boolean newEnable_leader_rebalancing) {
		boolean oldEnable_leader_rebalancing = enable_leader_rebalancing;
		enable_leader_rebalancing = newEnable_leader_rebalancing;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DDSMPackage.DDSM_KAFKA_CLUSTER__ENABLE_LEADER_REBALANCING, oldEnable_leader_rebalancing, enable_leader_rebalancing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLog_retention_hours() {
		return log_retention_hours;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLog_retention_hours(int newLog_retention_hours) {
		int oldLog_retention_hours = log_retention_hours;
		log_retention_hours = newLog_retention_hours;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DDSMPackage.DDSM_KAFKA_CLUSTER__LOG_RETENTION_HOURS, oldLog_retention_hours, log_retention_hours));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getQueued_max_requests() {
		return queued_max_requests;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQueued_max_requests(int newQueued_max_requests) {
		int oldQueued_max_requests = queued_max_requests;
		queued_max_requests = newQueued_max_requests;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DDSMPackage.DDSM_KAFKA_CLUSTER__QUEUED_MAX_REQUESTS, oldQueued_max_requests, queued_max_requests));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DDSMPackage.DDSM_KAFKA_CLUSTER__BASE_EXECUTION_ENVIRONMENT:
				if (resolve) return getBase_ExecutionEnvironment();
				return basicGetBase_ExecutionEnvironment();
			case DDSMPackage.DDSM_KAFKA_CLUSTER__ENABLE_TOPIC_DELETION:
				return isEnable_topic_deletion();
			case DDSMPackage.DDSM_KAFKA_CLUSTER__NUM_NETWORK_THREADS:
				return getNum_network_threads();
			case DDSMPackage.DDSM_KAFKA_CLUSTER__NUM_IO_THREADS:
				return getNum_io_threads();
			case DDSMPackage.DDSM_KAFKA_CLUSTER__NUM_LOG_PARTITION_PER_TOPIC:
				return getNum_log_partition_per_topic();
			case DDSMPackage.DDSM_KAFKA_CLUSTER__NUM_RECOVERY_THREADS_PER_DATA_DIR:
				return getNum_recovery_threads_per_data_dir();
			case DDSMPackage.DDSM_KAFKA_CLUSTER__NUM_MESSAGES_FOR_FLUSH_TO_DICK:
				return getNum_messages_for_flush_to_dick();
			case DDSMPackage.DDSM_KAFKA_CLUSTER__MAX_MESSAGE_SIT_TIME_BEFORE_FLUSH_MS:
				return getMax_message_sit_time_before_flush_ms();
			case DDSMPackage.DDSM_KAFKA_CLUSTER__ENABLE_TOPIC_AUTO_CREATION:
				return isEnable_topic_auto_creation();
			case DDSMPackage.DDSM_KAFKA_CLUSTER__ENABLE_LEADER_REBALANCING:
				return isEnable_leader_rebalancing();
			case DDSMPackage.DDSM_KAFKA_CLUSTER__LOG_RETENTION_HOURS:
				return getLog_retention_hours();
			case DDSMPackage.DDSM_KAFKA_CLUSTER__QUEUED_MAX_REQUESTS:
				return getQueued_max_requests();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DDSMPackage.DDSM_KAFKA_CLUSTER__BASE_EXECUTION_ENVIRONMENT:
				setBase_ExecutionEnvironment((ExecutionEnvironment)newValue);
				return;
			case DDSMPackage.DDSM_KAFKA_CLUSTER__ENABLE_TOPIC_DELETION:
				setEnable_topic_deletion((Boolean)newValue);
				return;
			case DDSMPackage.DDSM_KAFKA_CLUSTER__NUM_NETWORK_THREADS:
				setNum_network_threads((Integer)newValue);
				return;
			case DDSMPackage.DDSM_KAFKA_CLUSTER__NUM_IO_THREADS:
				setNum_io_threads((Integer)newValue);
				return;
			case DDSMPackage.DDSM_KAFKA_CLUSTER__NUM_LOG_PARTITION_PER_TOPIC:
				setNum_log_partition_per_topic((Integer)newValue);
				return;
			case DDSMPackage.DDSM_KAFKA_CLUSTER__NUM_RECOVERY_THREADS_PER_DATA_DIR:
				setNum_recovery_threads_per_data_dir((Integer)newValue);
				return;
			case DDSMPackage.DDSM_KAFKA_CLUSTER__NUM_MESSAGES_FOR_FLUSH_TO_DICK:
				setNum_messages_for_flush_to_dick((Integer)newValue);
				return;
			case DDSMPackage.DDSM_KAFKA_CLUSTER__MAX_MESSAGE_SIT_TIME_BEFORE_FLUSH_MS:
				setMax_message_sit_time_before_flush_ms((Integer)newValue);
				return;
			case DDSMPackage.DDSM_KAFKA_CLUSTER__ENABLE_TOPIC_AUTO_CREATION:
				setEnable_topic_auto_creation((Boolean)newValue);
				return;
			case DDSMPackage.DDSM_KAFKA_CLUSTER__ENABLE_LEADER_REBALANCING:
				setEnable_leader_rebalancing((Boolean)newValue);
				return;
			case DDSMPackage.DDSM_KAFKA_CLUSTER__LOG_RETENTION_HOURS:
				setLog_retention_hours((Integer)newValue);
				return;
			case DDSMPackage.DDSM_KAFKA_CLUSTER__QUEUED_MAX_REQUESTS:
				setQueued_max_requests((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DDSMPackage.DDSM_KAFKA_CLUSTER__BASE_EXECUTION_ENVIRONMENT:
				setBase_ExecutionEnvironment((ExecutionEnvironment)null);
				return;
			case DDSMPackage.DDSM_KAFKA_CLUSTER__ENABLE_TOPIC_DELETION:
				setEnable_topic_deletion(ENABLE_TOPIC_DELETION_EDEFAULT);
				return;
			case DDSMPackage.DDSM_KAFKA_CLUSTER__NUM_NETWORK_THREADS:
				setNum_network_threads(NUM_NETWORK_THREADS_EDEFAULT);
				return;
			case DDSMPackage.DDSM_KAFKA_CLUSTER__NUM_IO_THREADS:
				setNum_io_threads(NUM_IO_THREADS_EDEFAULT);
				return;
			case DDSMPackage.DDSM_KAFKA_CLUSTER__NUM_LOG_PARTITION_PER_TOPIC:
				setNum_log_partition_per_topic(NUM_LOG_PARTITION_PER_TOPIC_EDEFAULT);
				return;
			case DDSMPackage.DDSM_KAFKA_CLUSTER__NUM_RECOVERY_THREADS_PER_DATA_DIR:
				setNum_recovery_threads_per_data_dir(NUM_RECOVERY_THREADS_PER_DATA_DIR_EDEFAULT);
				return;
			case DDSMPackage.DDSM_KAFKA_CLUSTER__NUM_MESSAGES_FOR_FLUSH_TO_DICK:
				setNum_messages_for_flush_to_dick(NUM_MESSAGES_FOR_FLUSH_TO_DICK_EDEFAULT);
				return;
			case DDSMPackage.DDSM_KAFKA_CLUSTER__MAX_MESSAGE_SIT_TIME_BEFORE_FLUSH_MS:
				setMax_message_sit_time_before_flush_ms(MAX_MESSAGE_SIT_TIME_BEFORE_FLUSH_MS_EDEFAULT);
				return;
			case DDSMPackage.DDSM_KAFKA_CLUSTER__ENABLE_TOPIC_AUTO_CREATION:
				setEnable_topic_auto_creation(ENABLE_TOPIC_AUTO_CREATION_EDEFAULT);
				return;
			case DDSMPackage.DDSM_KAFKA_CLUSTER__ENABLE_LEADER_REBALANCING:
				setEnable_leader_rebalancing(ENABLE_LEADER_REBALANCING_EDEFAULT);
				return;
			case DDSMPackage.DDSM_KAFKA_CLUSTER__LOG_RETENTION_HOURS:
				setLog_retention_hours(LOG_RETENTION_HOURS_EDEFAULT);
				return;
			case DDSMPackage.DDSM_KAFKA_CLUSTER__QUEUED_MAX_REQUESTS:
				setQueued_max_requests(QUEUED_MAX_REQUESTS_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DDSMPackage.DDSM_KAFKA_CLUSTER__BASE_EXECUTION_ENVIRONMENT:
				return base_ExecutionEnvironment != null;
			case DDSMPackage.DDSM_KAFKA_CLUSTER__ENABLE_TOPIC_DELETION:
				return enable_topic_deletion != ENABLE_TOPIC_DELETION_EDEFAULT;
			case DDSMPackage.DDSM_KAFKA_CLUSTER__NUM_NETWORK_THREADS:
				return num_network_threads != NUM_NETWORK_THREADS_EDEFAULT;
			case DDSMPackage.DDSM_KAFKA_CLUSTER__NUM_IO_THREADS:
				return num_io_threads != NUM_IO_THREADS_EDEFAULT;
			case DDSMPackage.DDSM_KAFKA_CLUSTER__NUM_LOG_PARTITION_PER_TOPIC:
				return num_log_partition_per_topic != NUM_LOG_PARTITION_PER_TOPIC_EDEFAULT;
			case DDSMPackage.DDSM_KAFKA_CLUSTER__NUM_RECOVERY_THREADS_PER_DATA_DIR:
				return num_recovery_threads_per_data_dir != NUM_RECOVERY_THREADS_PER_DATA_DIR_EDEFAULT;
			case DDSMPackage.DDSM_KAFKA_CLUSTER__NUM_MESSAGES_FOR_FLUSH_TO_DICK:
				return num_messages_for_flush_to_dick != NUM_MESSAGES_FOR_FLUSH_TO_DICK_EDEFAULT;
			case DDSMPackage.DDSM_KAFKA_CLUSTER__MAX_MESSAGE_SIT_TIME_BEFORE_FLUSH_MS:
				return max_message_sit_time_before_flush_ms != MAX_MESSAGE_SIT_TIME_BEFORE_FLUSH_MS_EDEFAULT;
			case DDSMPackage.DDSM_KAFKA_CLUSTER__ENABLE_TOPIC_AUTO_CREATION:
				return enable_topic_auto_creation != ENABLE_TOPIC_AUTO_CREATION_EDEFAULT;
			case DDSMPackage.DDSM_KAFKA_CLUSTER__ENABLE_LEADER_REBALANCING:
				return enable_leader_rebalancing != ENABLE_LEADER_REBALANCING_EDEFAULT;
			case DDSMPackage.DDSM_KAFKA_CLUSTER__LOG_RETENTION_HOURS:
				return log_retention_hours != LOG_RETENTION_HOURS_EDEFAULT;
			case DDSMPackage.DDSM_KAFKA_CLUSTER__QUEUED_MAX_REQUESTS:
				return queued_max_requests != QUEUED_MAX_REQUESTS_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (enable_topic_deletion: ");
		result.append(enable_topic_deletion);
		result.append(", num_network_threads: ");
		result.append(num_network_threads);
		result.append(", num_io_threads: ");
		result.append(num_io_threads);
		result.append(", num_log_partition_per_topic: ");
		result.append(num_log_partition_per_topic);
		result.append(", num_recovery_threads_per_data_dir: ");
		result.append(num_recovery_threads_per_data_dir);
		result.append(", num_messages_for_flush_to_dick: ");
		result.append(num_messages_for_flush_to_dick);
		result.append(", max_message_sit_time_before_flush_ms: ");
		result.append(max_message_sit_time_before_flush_ms);
		result.append(", enable_topic_auto_creation: ");
		result.append(enable_topic_auto_creation);
		result.append(", enable_leader_rebalancing: ");
		result.append(enable_leader_rebalancing);
		result.append(", log_retention_hours: ");
		result.append(log_retention_hours);
		result.append(", queued_max_requests: ");
		result.append(queued_max_requests);
		result.append(')');
		return result.toString();
	}

} //DdsmKafkaClusterImpl
