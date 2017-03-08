/**
 */
package es.unizar.disco.dice.DTSM.Spark.impl;

import es.unizar.disco.dice.DTSM.Spark.SparkPackage;
import es.unizar.disco.dice.DTSM.Spark.SparkReduce;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reduce</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.unizar.disco.dice.DTSM.Spark.impl.SparkReduceImpl#getReduceType <em>Reduce Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SparkReduceImpl extends SparkOperationImpl implements SparkReduce {
	/**
	 * The default value of the '{@link #getReduceType() <em>Reduce Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReduceType()
	 * @generated
	 * @ordered
	 */
	protected static final es.unizar.disco.dice.Basic_Enumeration_Types.SparkReduce REDUCE_TYPE_EDEFAULT = es.unizar.disco.dice.Basic_Enumeration_Types.SparkReduce.REDUCE;

	/**
	 * The cached value of the '{@link #getReduceType() <em>Reduce Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReduceType()
	 * @generated
	 * @ordered
	 */
	protected es.unizar.disco.dice.Basic_Enumeration_Types.SparkReduce reduceType = REDUCE_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SparkReduceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SparkPackage.Literals.SPARK_REDUCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public es.unizar.disco.dice.Basic_Enumeration_Types.SparkReduce getReduceType() {
		return reduceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReduceType(es.unizar.disco.dice.Basic_Enumeration_Types.SparkReduce newReduceType) {
		es.unizar.disco.dice.Basic_Enumeration_Types.SparkReduce oldReduceType = reduceType;
		reduceType = newReduceType == null ? REDUCE_TYPE_EDEFAULT : newReduceType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SparkPackage.SPARK_REDUCE__REDUCE_TYPE, oldReduceType, reduceType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SparkPackage.SPARK_REDUCE__REDUCE_TYPE:
				return getReduceType();
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
			case SparkPackage.SPARK_REDUCE__REDUCE_TYPE:
				setReduceType((es.unizar.disco.dice.Basic_Enumeration_Types.SparkReduce)newValue);
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
			case SparkPackage.SPARK_REDUCE__REDUCE_TYPE:
				setReduceType(REDUCE_TYPE_EDEFAULT);
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
			case SparkPackage.SPARK_REDUCE__REDUCE_TYPE:
				return reduceType != REDUCE_TYPE_EDEFAULT;
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
		result.append(" (ReduceType: ");
		result.append(reduceType);
		result.append(')');
		return result.toString();
	}

} //SparkReduceImpl
