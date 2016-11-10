/**
 */
package es.unizar.disco.dice.DTSM.Hadoop.impl;

import es.unizar.disco.dice.DTSM.Hadoop.HadoopOperation;
import es.unizar.disco.dice.DTSM.Hadoop.HadoopPackage;

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
 *   <li>{@link es.unizar.disco.dice.DTSM.Hadoop.impl.HadoopOperationImpl#getParallelism <em>Parallelism</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DTSM.Hadoop.impl.HadoopOperationImpl#getNTasks <em>NTasks</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HadoopOperationImpl extends GaStepImpl implements HadoopOperation {
	/**
	 * The default value of the '{@link #getParallelism() <em>Parallelism</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParallelism()
	 * @generated
	 * @ordered
	 */
	protected static final String PARALLELISM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParallelism() <em>Parallelism</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParallelism()
	 * @generated
	 * @ordered
	 */
	protected String parallelism = PARALLELISM_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNTasks() <em>NTasks</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNTasks()
	 * @generated
	 * @ordered
	 */
	protected EList<String> nTasks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HadoopOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HadoopPackage.Literals.HADOOP_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getParallelism() {
		return parallelism;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParallelism(String newParallelism) {
		String oldParallelism = parallelism;
		parallelism = newParallelism;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HadoopPackage.HADOOP_OPERATION__PARALLELISM, oldParallelism, parallelism));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getNTasks() {
		if (nTasks == null) {
			nTasks = new EDataTypeUniqueEList<String>(String.class, this, HadoopPackage.HADOOP_OPERATION__NTASKS);
		}
		return nTasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HadoopPackage.HADOOP_OPERATION__PARALLELISM:
				return getParallelism();
			case HadoopPackage.HADOOP_OPERATION__NTASKS:
				return getNTasks();
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
			case HadoopPackage.HADOOP_OPERATION__PARALLELISM:
				setParallelism((String)newValue);
				return;
			case HadoopPackage.HADOOP_OPERATION__NTASKS:
				getNTasks().clear();
				getNTasks().addAll((Collection<? extends String>)newValue);
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
			case HadoopPackage.HADOOP_OPERATION__PARALLELISM:
				setParallelism(PARALLELISM_EDEFAULT);
				return;
			case HadoopPackage.HADOOP_OPERATION__NTASKS:
				getNTasks().clear();
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
			case HadoopPackage.HADOOP_OPERATION__PARALLELISM:
				return PARALLELISM_EDEFAULT == null ? parallelism != null : !PARALLELISM_EDEFAULT.equals(parallelism);
			case HadoopPackage.HADOOP_OPERATION__NTASKS:
				return nTasks != null && !nTasks.isEmpty();
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
		result.append(" (parallelism: ");
		result.append(parallelism);
		result.append(", nTasks: ");
		result.append(nTasks);
		result.append(')');
		return result.toString();
	}

} //HadoopOperationImpl
