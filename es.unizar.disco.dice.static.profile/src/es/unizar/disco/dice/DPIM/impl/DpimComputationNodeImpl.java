/**
 */
package es.unizar.disco.dice.DPIM.impl;

import com.masdes.dam.Core.impl.DaComponentImpl;

import es.unizar.disco.dice.Basic_Enumeration_Types.ComputationType;
import es.unizar.disco.dice.Basic_Enumeration_Types.ProcessingType;
import es.unizar.disco.dice.Basic_Enumeration_Types.TechType;

import es.unizar.disco.dice.DPIM.DPIMPackage;
import es.unizar.disco.dice.DPIM.DpimComputationNode;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dpim Computation Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.unizar.disco.dice.DPIM.impl.DpimComputationNodeImpl#getThroughput <em>Throughput</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DPIM.impl.DpimComputationNodeImpl#getType <em>Type</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DPIM.impl.DpimComputationNodeImpl#getTargetTech <em>Target Tech</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DPIM.impl.DpimComputationNodeImpl#getProcType <em>Proc Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DpimComputationNodeImpl extends DaComponentImpl implements DpimComputationNode {
	/**
	 * The default value of the '{@link #getThroughput() <em>Throughput</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThroughput()
	 * @generated
	 * @ordered
	 */
	protected static final String THROUGHPUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getThroughput() <em>Throughput</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThroughput()
	 * @generated
	 * @ordered
	 */
	protected String throughput = THROUGHPUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final ComputationType TYPE_EDEFAULT = ComputationType.DISTRIBUTED;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ComputationType type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetTech() <em>Target Tech</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetTech()
	 * @generated
	 * @ordered
	 */
	protected static final TechType TARGET_TECH_EDEFAULT = TechType.RDD;

	/**
	 * The cached value of the '{@link #getTargetTech() <em>Target Tech</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetTech()
	 * @generated
	 * @ordered
	 */
	protected TechType targetTech = TARGET_TECH_EDEFAULT;

	/**
	 * The default value of the '{@link #getProcType() <em>Proc Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcType()
	 * @generated
	 * @ordered
	 */
	protected static final ProcessingType PROC_TYPE_EDEFAULT = ProcessingType.SYNCH;

	/**
	 * The cached value of the '{@link #getProcType() <em>Proc Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcType()
	 * @generated
	 * @ordered
	 */
	protected ProcessingType procType = PROC_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DpimComputationNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DPIMPackage.Literals.DPIM_COMPUTATION_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getThroughput() {
		return throughput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThroughput(String newThroughput) {
		String oldThroughput = throughput;
		throughput = newThroughput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DPIMPackage.DPIM_COMPUTATION_NODE__THROUGHPUT, oldThroughput, throughput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComputationType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(ComputationType newType) {
		ComputationType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DPIMPackage.DPIM_COMPUTATION_NODE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TechType getTargetTech() {
		return targetTech;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetTech(TechType newTargetTech) {
		TechType oldTargetTech = targetTech;
		targetTech = newTargetTech == null ? TARGET_TECH_EDEFAULT : newTargetTech;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DPIMPackage.DPIM_COMPUTATION_NODE__TARGET_TECH, oldTargetTech, targetTech));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessingType getProcType() {
		return procType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcType(ProcessingType newProcType) {
		ProcessingType oldProcType = procType;
		procType = newProcType == null ? PROC_TYPE_EDEFAULT : newProcType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DPIMPackage.DPIM_COMPUTATION_NODE__PROC_TYPE, oldProcType, procType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DPIMPackage.DPIM_COMPUTATION_NODE__THROUGHPUT:
				return getThroughput();
			case DPIMPackage.DPIM_COMPUTATION_NODE__TYPE:
				return getType();
			case DPIMPackage.DPIM_COMPUTATION_NODE__TARGET_TECH:
				return getTargetTech();
			case DPIMPackage.DPIM_COMPUTATION_NODE__PROC_TYPE:
				return getProcType();
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
			case DPIMPackage.DPIM_COMPUTATION_NODE__THROUGHPUT:
				setThroughput((String)newValue);
				return;
			case DPIMPackage.DPIM_COMPUTATION_NODE__TYPE:
				setType((ComputationType)newValue);
				return;
			case DPIMPackage.DPIM_COMPUTATION_NODE__TARGET_TECH:
				setTargetTech((TechType)newValue);
				return;
			case DPIMPackage.DPIM_COMPUTATION_NODE__PROC_TYPE:
				setProcType((ProcessingType)newValue);
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
			case DPIMPackage.DPIM_COMPUTATION_NODE__THROUGHPUT:
				setThroughput(THROUGHPUT_EDEFAULT);
				return;
			case DPIMPackage.DPIM_COMPUTATION_NODE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case DPIMPackage.DPIM_COMPUTATION_NODE__TARGET_TECH:
				setTargetTech(TARGET_TECH_EDEFAULT);
				return;
			case DPIMPackage.DPIM_COMPUTATION_NODE__PROC_TYPE:
				setProcType(PROC_TYPE_EDEFAULT);
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
			case DPIMPackage.DPIM_COMPUTATION_NODE__THROUGHPUT:
				return THROUGHPUT_EDEFAULT == null ? throughput != null : !THROUGHPUT_EDEFAULT.equals(throughput);
			case DPIMPackage.DPIM_COMPUTATION_NODE__TYPE:
				return type != TYPE_EDEFAULT;
			case DPIMPackage.DPIM_COMPUTATION_NODE__TARGET_TECH:
				return targetTech != TARGET_TECH_EDEFAULT;
			case DPIMPackage.DPIM_COMPUTATION_NODE__PROC_TYPE:
				return procType != PROC_TYPE_EDEFAULT;
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
		result.append(" (throughput: ");
		result.append(throughput);
		result.append(", type: ");
		result.append(type);
		result.append(", targetTech: ");
		result.append(targetTech);
		result.append(", procType: ");
		result.append(procType);
		result.append(')');
		return result.toString();
	}

} //DpimComputationNodeImpl
