/**
 */
package es.unizar.disco.dice.DTSM.Spark.impl;

import es.unizar.disco.dice.DTSM.Spark.SparkOperation;
import es.unizar.disco.dice.DTSM.Spark.SparkPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.papyrus.MARTE.MARTE_AnalysisModel.GQAM.impl.GaStepImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.unizar.disco.dice.DTSM.Spark.impl.SparkOperationImpl#getNumTasks <em>Num Tasks</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DTSM.Spark.impl.SparkOperationImpl#getOpType <em>Op Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SparkOperationImpl extends GaStepImpl implements SparkOperation {
	/**
	 * The default value of the '{@link #getNumTasks() <em>Num Tasks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumTasks()
	 * @generated
	 * @ordered
	 */
	protected static final String NUM_TASKS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumTasks() <em>Num Tasks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumTasks()
	 * @generated
	 * @ordered
	 */
	protected String numTasks = NUM_TASKS_EDEFAULT;

	/**
	 * The default value of the '{@link #getOpType() <em>Op Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpType()
	 * @generated
	 * @ordered
	 */
	protected static final es.unizar.disco.dice.Basic_Enumeration_Types.SparkOperation OP_TYPE_EDEFAULT = es.unizar.disco.dice.Basic_Enumeration_Types.SparkOperation.TRANSFORMATION;

	/**
	 * The cached value of the '{@link #getOpType() <em>Op Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpType()
	 * @generated
	 * @ordered
	 */
	protected es.unizar.disco.dice.Basic_Enumeration_Types.SparkOperation opType = OP_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SparkOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SparkPackage.Literals.SPARK_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNumTasks() {
		return numTasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumTasks(String newNumTasks) {
		String oldNumTasks = numTasks;
		numTasks = newNumTasks;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SparkPackage.SPARK_OPERATION__NUM_TASKS, oldNumTasks, numTasks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public es.unizar.disco.dice.Basic_Enumeration_Types.SparkOperation getOpType() {
		return opType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpType(es.unizar.disco.dice.Basic_Enumeration_Types.SparkOperation newOpType) {
		es.unizar.disco.dice.Basic_Enumeration_Types.SparkOperation oldOpType = opType;
		opType = newOpType == null ? OP_TYPE_EDEFAULT : newOpType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SparkPackage.SPARK_OPERATION__OP_TYPE, oldOpType, opType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SparkPackage.SPARK_OPERATION__NUM_TASKS:
				return getNumTasks();
			case SparkPackage.SPARK_OPERATION__OP_TYPE:
				return getOpType();
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
			case SparkPackage.SPARK_OPERATION__NUM_TASKS:
				setNumTasks((String)newValue);
				return;
			case SparkPackage.SPARK_OPERATION__OP_TYPE:
				setOpType((es.unizar.disco.dice.Basic_Enumeration_Types.SparkOperation)newValue);
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
			case SparkPackage.SPARK_OPERATION__NUM_TASKS:
				setNumTasks(NUM_TASKS_EDEFAULT);
				return;
			case SparkPackage.SPARK_OPERATION__OP_TYPE:
				setOpType(OP_TYPE_EDEFAULT);
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
			case SparkPackage.SPARK_OPERATION__NUM_TASKS:
				return NUM_TASKS_EDEFAULT == null ? numTasks != null : !NUM_TASKS_EDEFAULT.equals(numTasks);
			case SparkPackage.SPARK_OPERATION__OP_TYPE:
				return opType != OP_TYPE_EDEFAULT;
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
		result.append(" (numTasks: ");
		result.append(numTasks);
		result.append(", OpType: ");
		result.append(opType);
		result.append(')');
		return result.toString();
	}

} //SparkOperationImpl
