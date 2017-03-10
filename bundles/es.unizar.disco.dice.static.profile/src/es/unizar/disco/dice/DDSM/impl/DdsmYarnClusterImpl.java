/**
 */
package es.unizar.disco.dice.DDSM.impl;

import es.unizar.disco.dice.Basic_Enumeration_Types.Scheduling;

import es.unizar.disco.dice.DDSM.DDSMPackage;
import es.unizar.disco.dice.DDSM.DdsmYarnCluster;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.uml2.uml.ExecutionEnvironment;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ddsm Yarn Cluster</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.unizar.disco.dice.DDSM.impl.DdsmYarnClusterImpl#getBase_ExecutionEnvironment <em>Base Execution Environment</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.impl.DdsmYarnClusterImpl#isEnable_acl <em>Enable acl</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.impl.DdsmYarnClusterImpl#getScheduler_type <em>Scheduler type</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.impl.DdsmYarnClusterImpl#getScheduler_min_container_mem_mb <em>Scheduler min container mem mb</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.impl.DdsmYarnClusterImpl#getScheduler_max_container_mem_mb <em>Scheduler max container mem mb</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.impl.DdsmYarnClusterImpl#getScheduler_min_container_core_num <em>Scheduler min container core num</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.impl.DdsmYarnClusterImpl#getScheduler_max_container_core_num <em>Scheduler max container core num</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.impl.DdsmYarnClusterImpl#getNodemanager_available_mem <em>Nodemanager available mem</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DdsmYarnClusterImpl extends DdsmMasterSlavePlatformImpl implements DdsmYarnCluster {
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
	 * The default value of the '{@link #isEnable_acl() <em>Enable acl</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnable_acl()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ENABLE_ACL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEnable_acl() <em>Enable acl</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnable_acl()
	 * @generated
	 * @ordered
	 */
	protected boolean enable_acl = ENABLE_ACL_EDEFAULT;

	/**
	 * The default value of the '{@link #getScheduler_type() <em>Scheduler type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduler_type()
	 * @generated
	 * @ordered
	 */
	protected static final Scheduling SCHEDULER_TYPE_EDEFAULT = Scheduling.CAPACITY;

	/**
	 * The cached value of the '{@link #getScheduler_type() <em>Scheduler type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduler_type()
	 * @generated
	 * @ordered
	 */
	protected Scheduling scheduler_type = SCHEDULER_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getScheduler_min_container_mem_mb() <em>Scheduler min container mem mb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduler_min_container_mem_mb()
	 * @generated
	 * @ordered
	 */
	protected static final int SCHEDULER_MIN_CONTAINER_MEM_MB_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getScheduler_min_container_mem_mb() <em>Scheduler min container mem mb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduler_min_container_mem_mb()
	 * @generated
	 * @ordered
	 */
	protected int scheduler_min_container_mem_mb = SCHEDULER_MIN_CONTAINER_MEM_MB_EDEFAULT;

	/**
	 * The default value of the '{@link #getScheduler_max_container_mem_mb() <em>Scheduler max container mem mb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduler_max_container_mem_mb()
	 * @generated
	 * @ordered
	 */
	protected static final int SCHEDULER_MAX_CONTAINER_MEM_MB_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getScheduler_max_container_mem_mb() <em>Scheduler max container mem mb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduler_max_container_mem_mb()
	 * @generated
	 * @ordered
	 */
	protected int scheduler_max_container_mem_mb = SCHEDULER_MAX_CONTAINER_MEM_MB_EDEFAULT;

	/**
	 * The default value of the '{@link #getScheduler_min_container_core_num() <em>Scheduler min container core num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduler_min_container_core_num()
	 * @generated
	 * @ordered
	 */
	protected static final int SCHEDULER_MIN_CONTAINER_CORE_NUM_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getScheduler_min_container_core_num() <em>Scheduler min container core num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduler_min_container_core_num()
	 * @generated
	 * @ordered
	 */
	protected int scheduler_min_container_core_num = SCHEDULER_MIN_CONTAINER_CORE_NUM_EDEFAULT;

	/**
	 * The default value of the '{@link #getScheduler_max_container_core_num() <em>Scheduler max container core num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduler_max_container_core_num()
	 * @generated
	 * @ordered
	 */
	protected static final int SCHEDULER_MAX_CONTAINER_CORE_NUM_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getScheduler_max_container_core_num() <em>Scheduler max container core num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduler_max_container_core_num()
	 * @generated
	 * @ordered
	 */
	protected int scheduler_max_container_core_num = SCHEDULER_MAX_CONTAINER_CORE_NUM_EDEFAULT;

	/**
	 * The default value of the '{@link #getNodemanager_available_mem() <em>Nodemanager available mem</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodemanager_available_mem()
	 * @generated
	 * @ordered
	 */
	protected static final int NODEMANAGER_AVAILABLE_MEM_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNodemanager_available_mem() <em>Nodemanager available mem</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodemanager_available_mem()
	 * @generated
	 * @ordered
	 */
	protected int nodemanager_available_mem = NODEMANAGER_AVAILABLE_MEM_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DdsmYarnClusterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DDSMPackage.Literals.DDSM_YARN_CLUSTER;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DDSMPackage.DDSM_YARN_CLUSTER__BASE_EXECUTION_ENVIRONMENT, oldBase_ExecutionEnvironment, base_ExecutionEnvironment));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DDSMPackage.DDSM_YARN_CLUSTER__BASE_EXECUTION_ENVIRONMENT, oldBase_ExecutionEnvironment, base_ExecutionEnvironment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEnable_acl() {
		return enable_acl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnable_acl(boolean newEnable_acl) {
		boolean oldEnable_acl = enable_acl;
		enable_acl = newEnable_acl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DDSMPackage.DDSM_YARN_CLUSTER__ENABLE_ACL, oldEnable_acl, enable_acl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scheduling getScheduler_type() {
		return scheduler_type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScheduler_type(Scheduling newScheduler_type) {
		Scheduling oldScheduler_type = scheduler_type;
		scheduler_type = newScheduler_type == null ? SCHEDULER_TYPE_EDEFAULT : newScheduler_type;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DDSMPackage.DDSM_YARN_CLUSTER__SCHEDULER_TYPE, oldScheduler_type, scheduler_type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getScheduler_min_container_mem_mb() {
		return scheduler_min_container_mem_mb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScheduler_min_container_mem_mb(int newScheduler_min_container_mem_mb) {
		int oldScheduler_min_container_mem_mb = scheduler_min_container_mem_mb;
		scheduler_min_container_mem_mb = newScheduler_min_container_mem_mb;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DDSMPackage.DDSM_YARN_CLUSTER__SCHEDULER_MIN_CONTAINER_MEM_MB, oldScheduler_min_container_mem_mb, scheduler_min_container_mem_mb));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getScheduler_max_container_mem_mb() {
		return scheduler_max_container_mem_mb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScheduler_max_container_mem_mb(int newScheduler_max_container_mem_mb) {
		int oldScheduler_max_container_mem_mb = scheduler_max_container_mem_mb;
		scheduler_max_container_mem_mb = newScheduler_max_container_mem_mb;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DDSMPackage.DDSM_YARN_CLUSTER__SCHEDULER_MAX_CONTAINER_MEM_MB, oldScheduler_max_container_mem_mb, scheduler_max_container_mem_mb));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getScheduler_min_container_core_num() {
		return scheduler_min_container_core_num;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScheduler_min_container_core_num(int newScheduler_min_container_core_num) {
		int oldScheduler_min_container_core_num = scheduler_min_container_core_num;
		scheduler_min_container_core_num = newScheduler_min_container_core_num;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DDSMPackage.DDSM_YARN_CLUSTER__SCHEDULER_MIN_CONTAINER_CORE_NUM, oldScheduler_min_container_core_num, scheduler_min_container_core_num));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getScheduler_max_container_core_num() {
		return scheduler_max_container_core_num;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScheduler_max_container_core_num(int newScheduler_max_container_core_num) {
		int oldScheduler_max_container_core_num = scheduler_max_container_core_num;
		scheduler_max_container_core_num = newScheduler_max_container_core_num;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DDSMPackage.DDSM_YARN_CLUSTER__SCHEDULER_MAX_CONTAINER_CORE_NUM, oldScheduler_max_container_core_num, scheduler_max_container_core_num));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNodemanager_available_mem() {
		return nodemanager_available_mem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNodemanager_available_mem(int newNodemanager_available_mem) {
		int oldNodemanager_available_mem = nodemanager_available_mem;
		nodemanager_available_mem = newNodemanager_available_mem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DDSMPackage.DDSM_YARN_CLUSTER__NODEMANAGER_AVAILABLE_MEM, oldNodemanager_available_mem, nodemanager_available_mem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DDSMPackage.DDSM_YARN_CLUSTER__BASE_EXECUTION_ENVIRONMENT:
				if (resolve) return getBase_ExecutionEnvironment();
				return basicGetBase_ExecutionEnvironment();
			case DDSMPackage.DDSM_YARN_CLUSTER__ENABLE_ACL:
				return isEnable_acl();
			case DDSMPackage.DDSM_YARN_CLUSTER__SCHEDULER_TYPE:
				return getScheduler_type();
			case DDSMPackage.DDSM_YARN_CLUSTER__SCHEDULER_MIN_CONTAINER_MEM_MB:
				return getScheduler_min_container_mem_mb();
			case DDSMPackage.DDSM_YARN_CLUSTER__SCHEDULER_MAX_CONTAINER_MEM_MB:
				return getScheduler_max_container_mem_mb();
			case DDSMPackage.DDSM_YARN_CLUSTER__SCHEDULER_MIN_CONTAINER_CORE_NUM:
				return getScheduler_min_container_core_num();
			case DDSMPackage.DDSM_YARN_CLUSTER__SCHEDULER_MAX_CONTAINER_CORE_NUM:
				return getScheduler_max_container_core_num();
			case DDSMPackage.DDSM_YARN_CLUSTER__NODEMANAGER_AVAILABLE_MEM:
				return getNodemanager_available_mem();
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
			case DDSMPackage.DDSM_YARN_CLUSTER__BASE_EXECUTION_ENVIRONMENT:
				setBase_ExecutionEnvironment((ExecutionEnvironment)newValue);
				return;
			case DDSMPackage.DDSM_YARN_CLUSTER__ENABLE_ACL:
				setEnable_acl((Boolean)newValue);
				return;
			case DDSMPackage.DDSM_YARN_CLUSTER__SCHEDULER_TYPE:
				setScheduler_type((Scheduling)newValue);
				return;
			case DDSMPackage.DDSM_YARN_CLUSTER__SCHEDULER_MIN_CONTAINER_MEM_MB:
				setScheduler_min_container_mem_mb((Integer)newValue);
				return;
			case DDSMPackage.DDSM_YARN_CLUSTER__SCHEDULER_MAX_CONTAINER_MEM_MB:
				setScheduler_max_container_mem_mb((Integer)newValue);
				return;
			case DDSMPackage.DDSM_YARN_CLUSTER__SCHEDULER_MIN_CONTAINER_CORE_NUM:
				setScheduler_min_container_core_num((Integer)newValue);
				return;
			case DDSMPackage.DDSM_YARN_CLUSTER__SCHEDULER_MAX_CONTAINER_CORE_NUM:
				setScheduler_max_container_core_num((Integer)newValue);
				return;
			case DDSMPackage.DDSM_YARN_CLUSTER__NODEMANAGER_AVAILABLE_MEM:
				setNodemanager_available_mem((Integer)newValue);
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
			case DDSMPackage.DDSM_YARN_CLUSTER__BASE_EXECUTION_ENVIRONMENT:
				setBase_ExecutionEnvironment((ExecutionEnvironment)null);
				return;
			case DDSMPackage.DDSM_YARN_CLUSTER__ENABLE_ACL:
				setEnable_acl(ENABLE_ACL_EDEFAULT);
				return;
			case DDSMPackage.DDSM_YARN_CLUSTER__SCHEDULER_TYPE:
				setScheduler_type(SCHEDULER_TYPE_EDEFAULT);
				return;
			case DDSMPackage.DDSM_YARN_CLUSTER__SCHEDULER_MIN_CONTAINER_MEM_MB:
				setScheduler_min_container_mem_mb(SCHEDULER_MIN_CONTAINER_MEM_MB_EDEFAULT);
				return;
			case DDSMPackage.DDSM_YARN_CLUSTER__SCHEDULER_MAX_CONTAINER_MEM_MB:
				setScheduler_max_container_mem_mb(SCHEDULER_MAX_CONTAINER_MEM_MB_EDEFAULT);
				return;
			case DDSMPackage.DDSM_YARN_CLUSTER__SCHEDULER_MIN_CONTAINER_CORE_NUM:
				setScheduler_min_container_core_num(SCHEDULER_MIN_CONTAINER_CORE_NUM_EDEFAULT);
				return;
			case DDSMPackage.DDSM_YARN_CLUSTER__SCHEDULER_MAX_CONTAINER_CORE_NUM:
				setScheduler_max_container_core_num(SCHEDULER_MAX_CONTAINER_CORE_NUM_EDEFAULT);
				return;
			case DDSMPackage.DDSM_YARN_CLUSTER__NODEMANAGER_AVAILABLE_MEM:
				setNodemanager_available_mem(NODEMANAGER_AVAILABLE_MEM_EDEFAULT);
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
			case DDSMPackage.DDSM_YARN_CLUSTER__BASE_EXECUTION_ENVIRONMENT:
				return base_ExecutionEnvironment != null;
			case DDSMPackage.DDSM_YARN_CLUSTER__ENABLE_ACL:
				return enable_acl != ENABLE_ACL_EDEFAULT;
			case DDSMPackage.DDSM_YARN_CLUSTER__SCHEDULER_TYPE:
				return scheduler_type != SCHEDULER_TYPE_EDEFAULT;
			case DDSMPackage.DDSM_YARN_CLUSTER__SCHEDULER_MIN_CONTAINER_MEM_MB:
				return scheduler_min_container_mem_mb != SCHEDULER_MIN_CONTAINER_MEM_MB_EDEFAULT;
			case DDSMPackage.DDSM_YARN_CLUSTER__SCHEDULER_MAX_CONTAINER_MEM_MB:
				return scheduler_max_container_mem_mb != SCHEDULER_MAX_CONTAINER_MEM_MB_EDEFAULT;
			case DDSMPackage.DDSM_YARN_CLUSTER__SCHEDULER_MIN_CONTAINER_CORE_NUM:
				return scheduler_min_container_core_num != SCHEDULER_MIN_CONTAINER_CORE_NUM_EDEFAULT;
			case DDSMPackage.DDSM_YARN_CLUSTER__SCHEDULER_MAX_CONTAINER_CORE_NUM:
				return scheduler_max_container_core_num != SCHEDULER_MAX_CONTAINER_CORE_NUM_EDEFAULT;
			case DDSMPackage.DDSM_YARN_CLUSTER__NODEMANAGER_AVAILABLE_MEM:
				return nodemanager_available_mem != NODEMANAGER_AVAILABLE_MEM_EDEFAULT;
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
		result.append(" (enable_acl: ");
		result.append(enable_acl);
		result.append(", scheduler_type: ");
		result.append(scheduler_type);
		result.append(", scheduler_min_container_mem_mb: ");
		result.append(scheduler_min_container_mem_mb);
		result.append(", scheduler_max_container_mem_mb: ");
		result.append(scheduler_max_container_mem_mb);
		result.append(", scheduler_min_container_core_num: ");
		result.append(scheduler_min_container_core_num);
		result.append(", scheduler_max_container_core_num: ");
		result.append(scheduler_max_container_core_num);
		result.append(", nodemanager_available_mem: ");
		result.append(nodemanager_available_mem);
		result.append(')');
		return result.toString();
	}

} //DdsmYarnClusterImpl
