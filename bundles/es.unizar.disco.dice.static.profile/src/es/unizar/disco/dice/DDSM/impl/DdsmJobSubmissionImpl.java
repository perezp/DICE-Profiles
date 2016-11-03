/**
 */
package es.unizar.disco.dice.DDSM.impl;

import es.unizar.disco.dice.DDSM.DDSMPackage;
import es.unizar.disco.dice.DDSM.DdsmJobSubmission;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.uml2.uml.Deployment;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ddsm Job Submission</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.unizar.disco.dice.DDSM.impl.DdsmJobSubmissionImpl#getBase_Deployment <em>Base Deployment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DdsmJobSubmissionImpl extends MinimalEObjectImpl.Container implements DdsmJobSubmission {
	/**
	 * The cached value of the '{@link #getBase_Deployment() <em>Base Deployment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Deployment()
	 * @generated
	 * @ordered
	 */
	protected Deployment base_Deployment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DdsmJobSubmissionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DDSMPackage.Literals.DDSM_JOB_SUBMISSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Deployment getBase_Deployment() {
		if (base_Deployment != null && base_Deployment.eIsProxy()) {
			InternalEObject oldBase_Deployment = (InternalEObject)base_Deployment;
			base_Deployment = (Deployment)eResolveProxy(oldBase_Deployment);
			if (base_Deployment != oldBase_Deployment) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DDSMPackage.DDSM_JOB_SUBMISSION__BASE_DEPLOYMENT, oldBase_Deployment, base_Deployment));
			}
		}
		return base_Deployment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Deployment basicGetBase_Deployment() {
		return base_Deployment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Deployment(Deployment newBase_Deployment) {
		Deployment oldBase_Deployment = base_Deployment;
		base_Deployment = newBase_Deployment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DDSMPackage.DDSM_JOB_SUBMISSION__BASE_DEPLOYMENT, oldBase_Deployment, base_Deployment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DDSMPackage.DDSM_JOB_SUBMISSION__BASE_DEPLOYMENT:
				if (resolve) return getBase_Deployment();
				return basicGetBase_Deployment();
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
			case DDSMPackage.DDSM_JOB_SUBMISSION__BASE_DEPLOYMENT:
				setBase_Deployment((Deployment)newValue);
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
			case DDSMPackage.DDSM_JOB_SUBMISSION__BASE_DEPLOYMENT:
				setBase_Deployment((Deployment)null);
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
			case DDSMPackage.DDSM_JOB_SUBMISSION__BASE_DEPLOYMENT:
				return base_Deployment != null;
		}
		return super.eIsSet(featureID);
	}

} //DdsmJobSubmissionImpl
