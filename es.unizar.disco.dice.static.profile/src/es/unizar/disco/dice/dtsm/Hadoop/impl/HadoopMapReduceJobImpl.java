/**
 */
package es.unizar.disco.dice.dtsm.Hadoop.impl;

import es.unizar.disco.dice.dtsm.Hadoop.HadoopMapReduceJob;
import es.unizar.disco.dice.dtsm.Hadoop.HadoopMapReducePhase;
import es.unizar.disco.dice.dtsm.Hadoop.HadoopPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.uml2.uml.Classifier;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Map Reduce Job</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.unizar.disco.dice.dtsm.Hadoop.impl.HadoopMapReduceJobImpl#getMapResucePhases <em>Map Resuce Phases</em>}</li>
 *   <li>{@link es.unizar.disco.dice.dtsm.Hadoop.impl.HadoopMapReduceJobImpl#getBase_Classifier <em>Base Classifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HadoopMapReduceJobImpl extends MinimalEObjectImpl.Container implements HadoopMapReduceJob {
	/**
	 * The cached value of the '{@link #getMapResucePhases() <em>Map Resuce Phases</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapResucePhases()
	 * @generated
	 * @ordered
	 */
	protected EList<HadoopMapReducePhase> mapResucePhases;

	/**
	 * The cached value of the '{@link #getBase_Classifier() <em>Base Classifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Classifier()
	 * @generated
	 * @ordered
	 */
	protected Classifier base_Classifier;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HadoopMapReduceJobImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HadoopPackage.Literals.HADOOP_MAP_REDUCE_JOB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HadoopMapReducePhase> getMapResucePhases() {
		if (mapResucePhases == null) {
			mapResucePhases = new EObjectResolvingEList<HadoopMapReducePhase>(HadoopMapReducePhase.class, this, HadoopPackage.HADOOP_MAP_REDUCE_JOB__MAP_RESUCE_PHASES);
		}
		return mapResucePhases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier getBase_Classifier() {
		if (base_Classifier != null && base_Classifier.eIsProxy()) {
			InternalEObject oldBase_Classifier = (InternalEObject)base_Classifier;
			base_Classifier = (Classifier)eResolveProxy(oldBase_Classifier);
			if (base_Classifier != oldBase_Classifier) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HadoopPackage.HADOOP_MAP_REDUCE_JOB__BASE_CLASSIFIER, oldBase_Classifier, base_Classifier));
			}
		}
		return base_Classifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier basicGetBase_Classifier() {
		return base_Classifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Classifier(Classifier newBase_Classifier) {
		Classifier oldBase_Classifier = base_Classifier;
		base_Classifier = newBase_Classifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HadoopPackage.HADOOP_MAP_REDUCE_JOB__BASE_CLASSIFIER, oldBase_Classifier, base_Classifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HadoopPackage.HADOOP_MAP_REDUCE_JOB__MAP_RESUCE_PHASES:
				return getMapResucePhases();
			case HadoopPackage.HADOOP_MAP_REDUCE_JOB__BASE_CLASSIFIER:
				if (resolve) return getBase_Classifier();
				return basicGetBase_Classifier();
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
			case HadoopPackage.HADOOP_MAP_REDUCE_JOB__MAP_RESUCE_PHASES:
				getMapResucePhases().clear();
				getMapResucePhases().addAll((Collection<? extends HadoopMapReducePhase>)newValue);
				return;
			case HadoopPackage.HADOOP_MAP_REDUCE_JOB__BASE_CLASSIFIER:
				setBase_Classifier((Classifier)newValue);
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
			case HadoopPackage.HADOOP_MAP_REDUCE_JOB__MAP_RESUCE_PHASES:
				getMapResucePhases().clear();
				return;
			case HadoopPackage.HADOOP_MAP_REDUCE_JOB__BASE_CLASSIFIER:
				setBase_Classifier((Classifier)null);
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
			case HadoopPackage.HADOOP_MAP_REDUCE_JOB__MAP_RESUCE_PHASES:
				return mapResucePhases != null && !mapResucePhases.isEmpty();
			case HadoopPackage.HADOOP_MAP_REDUCE_JOB__BASE_CLASSIFIER:
				return base_Classifier != null;
		}
		return super.eIsSet(featureID);
	}

} //HadoopMapReduceJobImpl
