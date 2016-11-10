/**
 */
package es.unizar.disco.dice.DTSM.Hadoop.impl;

import es.unizar.disco.dice.DTSM.Core.CoreData;

import es.unizar.disco.dice.DTSM.Hadoop.HadoopMap;
import es.unizar.disco.dice.DTSM.Hadoop.HadoopMapReducePhase;
import es.unizar.disco.dice.DTSM.Hadoop.HadoopPackage;
import es.unizar.disco.dice.DTSM.Hadoop.HadoopReduce;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.uml2.uml.Classifier;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Map Reduce Phase</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.unizar.disco.dice.DTSM.Hadoop.impl.HadoopMapReducePhaseImpl#getHasMap <em>Has Map</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DTSM.Hadoop.impl.HadoopMapReducePhaseImpl#getHasReduce <em>Has Reduce</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DTSM.Hadoop.impl.HadoopMapReducePhaseImpl#getOutput <em>Output</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DTSM.Hadoop.impl.HadoopMapReducePhaseImpl#getBase_Classifier <em>Base Classifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HadoopMapReducePhaseImpl extends MinimalEObjectImpl.Container implements HadoopMapReducePhase {
	/**
	 * The cached value of the '{@link #getHasMap() <em>Has Map</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasMap()
	 * @generated
	 * @ordered
	 */
	protected HadoopMap hasMap;

	/**
	 * The cached value of the '{@link #getHasReduce() <em>Has Reduce</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasReduce()
	 * @generated
	 * @ordered
	 */
	protected HadoopReduce hasReduce;

	/**
	 * The cached value of the '{@link #getOutput() <em>Output</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput()
	 * @generated
	 * @ordered
	 */
	protected CoreData output;

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
	protected HadoopMapReducePhaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HadoopPackage.Literals.HADOOP_MAP_REDUCE_PHASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HadoopMap getHasMap() {
		if (hasMap != null && hasMap.eIsProxy()) {
			InternalEObject oldHasMap = (InternalEObject)hasMap;
			hasMap = (HadoopMap)eResolveProxy(oldHasMap);
			if (hasMap != oldHasMap) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HadoopPackage.HADOOP_MAP_REDUCE_PHASE__HAS_MAP, oldHasMap, hasMap));
			}
		}
		return hasMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HadoopMap basicGetHasMap() {
		return hasMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasMap(HadoopMap newHasMap) {
		HadoopMap oldHasMap = hasMap;
		hasMap = newHasMap;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HadoopPackage.HADOOP_MAP_REDUCE_PHASE__HAS_MAP, oldHasMap, hasMap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HadoopReduce getHasReduce() {
		if (hasReduce != null && hasReduce.eIsProxy()) {
			InternalEObject oldHasReduce = (InternalEObject)hasReduce;
			hasReduce = (HadoopReduce)eResolveProxy(oldHasReduce);
			if (hasReduce != oldHasReduce) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HadoopPackage.HADOOP_MAP_REDUCE_PHASE__HAS_REDUCE, oldHasReduce, hasReduce));
			}
		}
		return hasReduce;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HadoopReduce basicGetHasReduce() {
		return hasReduce;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasReduce(HadoopReduce newHasReduce) {
		HadoopReduce oldHasReduce = hasReduce;
		hasReduce = newHasReduce;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HadoopPackage.HADOOP_MAP_REDUCE_PHASE__HAS_REDUCE, oldHasReduce, hasReduce));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoreData getOutput() {
		if (output != null && output.eIsProxy()) {
			InternalEObject oldOutput = (InternalEObject)output;
			output = (CoreData)eResolveProxy(oldOutput);
			if (output != oldOutput) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HadoopPackage.HADOOP_MAP_REDUCE_PHASE__OUTPUT, oldOutput, output));
			}
		}
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoreData basicGetOutput() {
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput(CoreData newOutput) {
		CoreData oldOutput = output;
		output = newOutput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HadoopPackage.HADOOP_MAP_REDUCE_PHASE__OUTPUT, oldOutput, output));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HadoopPackage.HADOOP_MAP_REDUCE_PHASE__BASE_CLASSIFIER, oldBase_Classifier, base_Classifier));
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
			eNotify(new ENotificationImpl(this, Notification.SET, HadoopPackage.HADOOP_MAP_REDUCE_PHASE__BASE_CLASSIFIER, oldBase_Classifier, base_Classifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HadoopPackage.HADOOP_MAP_REDUCE_PHASE__HAS_MAP:
				if (resolve) return getHasMap();
				return basicGetHasMap();
			case HadoopPackage.HADOOP_MAP_REDUCE_PHASE__HAS_REDUCE:
				if (resolve) return getHasReduce();
				return basicGetHasReduce();
			case HadoopPackage.HADOOP_MAP_REDUCE_PHASE__OUTPUT:
				if (resolve) return getOutput();
				return basicGetOutput();
			case HadoopPackage.HADOOP_MAP_REDUCE_PHASE__BASE_CLASSIFIER:
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
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case HadoopPackage.HADOOP_MAP_REDUCE_PHASE__HAS_MAP:
				setHasMap((HadoopMap)newValue);
				return;
			case HadoopPackage.HADOOP_MAP_REDUCE_PHASE__HAS_REDUCE:
				setHasReduce((HadoopReduce)newValue);
				return;
			case HadoopPackage.HADOOP_MAP_REDUCE_PHASE__OUTPUT:
				setOutput((CoreData)newValue);
				return;
			case HadoopPackage.HADOOP_MAP_REDUCE_PHASE__BASE_CLASSIFIER:
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
			case HadoopPackage.HADOOP_MAP_REDUCE_PHASE__HAS_MAP:
				setHasMap((HadoopMap)null);
				return;
			case HadoopPackage.HADOOP_MAP_REDUCE_PHASE__HAS_REDUCE:
				setHasReduce((HadoopReduce)null);
				return;
			case HadoopPackage.HADOOP_MAP_REDUCE_PHASE__OUTPUT:
				setOutput((CoreData)null);
				return;
			case HadoopPackage.HADOOP_MAP_REDUCE_PHASE__BASE_CLASSIFIER:
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
			case HadoopPackage.HADOOP_MAP_REDUCE_PHASE__HAS_MAP:
				return hasMap != null;
			case HadoopPackage.HADOOP_MAP_REDUCE_PHASE__HAS_REDUCE:
				return hasReduce != null;
			case HadoopPackage.HADOOP_MAP_REDUCE_PHASE__OUTPUT:
				return output != null;
			case HadoopPackage.HADOOP_MAP_REDUCE_PHASE__BASE_CLASSIFIER:
				return base_Classifier != null;
		}
		return super.eIsSet(featureID);
	}

} //HadoopMapReducePhaseImpl
