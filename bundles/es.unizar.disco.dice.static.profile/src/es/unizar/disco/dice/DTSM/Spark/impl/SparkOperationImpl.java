/**
 */
package es.unizar.disco.dice.DTSM.Spark.impl;

import es.unizar.disco.dice.DTSM.Spark.SparkOperation;
import es.unizar.disco.dice.DTSM.Spark.SparkPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

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
	 * The cached value of the '{@link #getRDD() <em>RDD</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRDD()
	 * @generated
	 * @ordered
	 */
	protected EList<String> rdd;

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
	public EList<String> getRDD() {
		if (rdd == null) {
			rdd = new EDataTypeUniqueEList<String>(String.class, this, SparkPackage.SPARK_OPERATION__RDD);
		}
		return rdd;
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
				getRDD().clear();
				getRDD().addAll((Collection<? extends String>)newValue);
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
				getRDD().clear();
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
				return rdd != null && !rdd.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //SparkOperationImpl
