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
 *   <li>{@link es.unizar.disco.dice.DTSM.Spark.impl.SparkOperationImpl#getRDDAvailable <em>RDD Available</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DTSM.Spark.impl.SparkOperationImpl#getRDD <em>RDD</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DTSM.Spark.impl.SparkOperationImpl#getOpType <em>Op Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SparkOperationImpl extends GaStepImpl implements SparkOperation {
	/**
	 * The default value of the '{@link #getRDDAvailable() <em>RDD Available</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRDDAvailable()
	 * @generated
	 * @ordered
	 */
	protected static final String RDD_AVAILABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRDDAvailable() <em>RDD Available</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRDDAvailable()
	 * @generated
	 * @ordered
	 */
	protected String rddAvailable = RDD_AVAILABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRDD() <em>RDD</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRDD()
	 * @generated
	 * @ordered
	 */
	protected static final String RDD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRDD() <em>RDD</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRDD()
	 * @generated
	 * @ordered
	 */
	protected String rdd = RDD_EDEFAULT;

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
	public String getRDDAvailable() {
		return rddAvailable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRDDAvailable(String newRDDAvailable) {
		String oldRDDAvailable = rddAvailable;
		rddAvailable = newRDDAvailable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SparkPackage.SPARK_OPERATION__RDD_AVAILABLE, oldRDDAvailable, rddAvailable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRDD() {
		return rdd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRDD(String newRDD) {
		String oldRDD = rdd;
		rdd = newRDD;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SparkPackage.SPARK_OPERATION__RDD, oldRDD, rdd));
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
			case SparkPackage.SPARK_OPERATION__RDD_AVAILABLE:
				return getRDDAvailable();
			case SparkPackage.SPARK_OPERATION__RDD:
				return getRDD();
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
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SparkPackage.SPARK_OPERATION__RDD_AVAILABLE:
				setRDDAvailable((String)newValue);
				return;
			case SparkPackage.SPARK_OPERATION__RDD:
				setRDD((String)newValue);
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
			case SparkPackage.SPARK_OPERATION__RDD_AVAILABLE:
				setRDDAvailable(RDD_AVAILABLE_EDEFAULT);
				return;
			case SparkPackage.SPARK_OPERATION__RDD:
				setRDD(RDD_EDEFAULT);
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
			case SparkPackage.SPARK_OPERATION__RDD_AVAILABLE:
				return RDD_AVAILABLE_EDEFAULT == null ? rddAvailable != null : !RDD_AVAILABLE_EDEFAULT.equals(rddAvailable);
			case SparkPackage.SPARK_OPERATION__RDD:
				return RDD_EDEFAULT == null ? rdd != null : !RDD_EDEFAULT.equals(rdd);
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
		result.append(" (RDDAvailable: ");
		result.append(rddAvailable);
		result.append(", RDD: ");
		result.append(rdd);
		result.append(", OpType: ");
		result.append(opType);
		result.append(')');
		return result.toString();
	}

} //SparkOperationImpl
