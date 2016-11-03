/**
 */
package es.unizar.disco.dice.DDSM.impl;

import es.unizar.disco.dice.DDSM.DDSMPackage;
import es.unizar.disco.dice.DDSM.DdsmBigDataJob;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.uml2.uml.Artifact;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ddsm Big Data Job</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.unizar.disco.dice.DDSM.impl.DdsmBigDataJobImpl#getArtifactURL <em>Artifact URL</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.impl.DdsmBigDataJobImpl#getMainClass <em>Main Class</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.impl.DdsmBigDataJobImpl#getBase_Artifact <em>Base Artifact</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DdsmBigDataJobImpl extends MinimalEObjectImpl.Container implements DdsmBigDataJob {
	/**
	 * The default value of the '{@link #getArtifactURL() <em>Artifact URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtifactURL()
	 * @generated
	 * @ordered
	 */
	protected static final String ARTIFACT_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getArtifactURL() <em>Artifact URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtifactURL()
	 * @generated
	 * @ordered
	 */
	protected String artifactURL = ARTIFACT_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getMainClass() <em>Main Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMainClass()
	 * @generated
	 * @ordered
	 */
	protected static final String MAIN_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMainClass() <em>Main Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMainClass()
	 * @generated
	 * @ordered
	 */
	protected String mainClass = MAIN_CLASS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBase_Artifact() <em>Base Artifact</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Artifact()
	 * @generated
	 * @ordered
	 */
	protected Artifact base_Artifact;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DdsmBigDataJobImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DDSMPackage.Literals.DDSM_BIG_DATA_JOB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getArtifactURL() {
		return artifactURL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArtifactURL(String newArtifactURL) {
		String oldArtifactURL = artifactURL;
		artifactURL = newArtifactURL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DDSMPackage.DDSM_BIG_DATA_JOB__ARTIFACT_URL, oldArtifactURL, artifactURL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMainClass() {
		return mainClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMainClass(String newMainClass) {
		String oldMainClass = mainClass;
		mainClass = newMainClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DDSMPackage.DDSM_BIG_DATA_JOB__MAIN_CLASS, oldMainClass, mainClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Artifact getBase_Artifact() {
		if (base_Artifact != null && base_Artifact.eIsProxy()) {
			InternalEObject oldBase_Artifact = (InternalEObject)base_Artifact;
			base_Artifact = (Artifact)eResolveProxy(oldBase_Artifact);
			if (base_Artifact != oldBase_Artifact) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DDSMPackage.DDSM_BIG_DATA_JOB__BASE_ARTIFACT, oldBase_Artifact, base_Artifact));
			}
		}
		return base_Artifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Artifact basicGetBase_Artifact() {
		return base_Artifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Artifact(Artifact newBase_Artifact) {
		Artifact oldBase_Artifact = base_Artifact;
		base_Artifact = newBase_Artifact;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DDSMPackage.DDSM_BIG_DATA_JOB__BASE_ARTIFACT, oldBase_Artifact, base_Artifact));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DDSMPackage.DDSM_BIG_DATA_JOB__ARTIFACT_URL:
				return getArtifactURL();
			case DDSMPackage.DDSM_BIG_DATA_JOB__MAIN_CLASS:
				return getMainClass();
			case DDSMPackage.DDSM_BIG_DATA_JOB__BASE_ARTIFACT:
				if (resolve) return getBase_Artifact();
				return basicGetBase_Artifact();
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
			case DDSMPackage.DDSM_BIG_DATA_JOB__ARTIFACT_URL:
				setArtifactURL((String)newValue);
				return;
			case DDSMPackage.DDSM_BIG_DATA_JOB__MAIN_CLASS:
				setMainClass((String)newValue);
				return;
			case DDSMPackage.DDSM_BIG_DATA_JOB__BASE_ARTIFACT:
				setBase_Artifact((Artifact)newValue);
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
			case DDSMPackage.DDSM_BIG_DATA_JOB__ARTIFACT_URL:
				setArtifactURL(ARTIFACT_URL_EDEFAULT);
				return;
			case DDSMPackage.DDSM_BIG_DATA_JOB__MAIN_CLASS:
				setMainClass(MAIN_CLASS_EDEFAULT);
				return;
			case DDSMPackage.DDSM_BIG_DATA_JOB__BASE_ARTIFACT:
				setBase_Artifact((Artifact)null);
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
			case DDSMPackage.DDSM_BIG_DATA_JOB__ARTIFACT_URL:
				return ARTIFACT_URL_EDEFAULT == null ? artifactURL != null : !ARTIFACT_URL_EDEFAULT.equals(artifactURL);
			case DDSMPackage.DDSM_BIG_DATA_JOB__MAIN_CLASS:
				return MAIN_CLASS_EDEFAULT == null ? mainClass != null : !MAIN_CLASS_EDEFAULT.equals(mainClass);
			case DDSMPackage.DDSM_BIG_DATA_JOB__BASE_ARTIFACT:
				return base_Artifact != null;
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
		result.append(" (artifactURL: ");
		result.append(artifactURL);
		result.append(", mainClass: ");
		result.append(mainClass);
		result.append(')');
		return result.toString();
	}

} //DdsmBigDataJobImpl
