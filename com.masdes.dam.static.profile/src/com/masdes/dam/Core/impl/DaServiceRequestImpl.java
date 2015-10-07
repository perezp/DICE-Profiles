/**
 */
package com.masdes.dam.Core.impl;

import com.masdes.dam.Core.CorePackage;
import com.masdes.dam.Core.DaService;
import com.masdes.dam.Core.DaServiceRequest;

import com.masdes.dam.Core.util.CoreValidator;
import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.InstanceSpecification;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.Lifeline;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Da Service Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.masdes.dam.Core.impl.DaServiceRequestImpl#getAccessProb <em>Access Prob</em>}</li>
 *   <li>{@link com.masdes.dam.Core.impl.DaServiceRequestImpl#getServiceProb <em>Service Prob</em>}</li>
 *   <li>{@link com.masdes.dam.Core.impl.DaServiceRequestImpl#getRequest <em>Request</em>}</li>
 *   <li>{@link com.masdes.dam.Core.impl.DaServiceRequestImpl#getBase_Classifier <em>Base Classifier</em>}</li>
 *   <li>{@link com.masdes.dam.Core.impl.DaServiceRequestImpl#getBase_Lifeline <em>Base Lifeline</em>}</li>
 *   <li>{@link com.masdes.dam.Core.impl.DaServiceRequestImpl#getBase_Interaction <em>Base Interaction</em>}</li>
 *   <li>{@link com.masdes.dam.Core.impl.DaServiceRequestImpl#getBase_InstanceSpecification <em>Base Instance Specification</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DaServiceRequestImpl extends MinimalEObjectImpl.Container implements DaServiceRequest {
	/**
	 * The cached value of the '{@link #getAccessProb() <em>Access Prob</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessProb()
	 * @generated
	 * @ordered
	 */
	protected EList<String> accessProb;

	/**
	 * The cached value of the '{@link #getServiceProb() <em>Service Prob</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceProb()
	 * @generated
	 * @ordered
	 */
	protected EList<String> serviceProb;

	/**
	 * The cached value of the '{@link #getRequest() <em>Request</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequest()
	 * @generated
	 * @ordered
	 */
	protected EList<DaService> request;

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
	 * The cached value of the '{@link #getBase_Lifeline() <em>Base Lifeline</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Lifeline()
	 * @generated
	 * @ordered
	 */
	protected Lifeline base_Lifeline;

	/**
	 * The cached value of the '{@link #getBase_Interaction() <em>Base Interaction</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Interaction()
	 * @generated
	 * @ordered
	 */
	protected Interaction base_Interaction;

	/**
	 * The cached value of the '{@link #getBase_InstanceSpecification() <em>Base Instance Specification</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_InstanceSpecification()
	 * @generated
	 * @ordered
	 */
	protected InstanceSpecification base_InstanceSpecification;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DaServiceRequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.DA_SERVICE_REQUEST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getAccessProb() {
		if (accessProb == null) {
			accessProb = new EDataTypeUniqueEList<String>(String.class, this, CorePackage.DA_SERVICE_REQUEST__ACCESS_PROB);
		}
		return accessProb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getServiceProb() {
		if (serviceProb == null) {
			serviceProb = new EDataTypeUniqueEList<String>(String.class, this, CorePackage.DA_SERVICE_REQUEST__SERVICE_PROB);
		}
		return serviceProb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DaService> getRequest() {
		if (request == null) {
			request = new EObjectResolvingEList<DaService>(DaService.class, this, CorePackage.DA_SERVICE_REQUEST__REQUEST);
		}
		return request;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.DA_SERVICE_REQUEST__BASE_CLASSIFIER, oldBase_Classifier, base_Classifier));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.DA_SERVICE_REQUEST__BASE_CLASSIFIER, oldBase_Classifier, base_Classifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lifeline getBase_Lifeline() {
		if (base_Lifeline != null && base_Lifeline.eIsProxy()) {
			InternalEObject oldBase_Lifeline = (InternalEObject)base_Lifeline;
			base_Lifeline = (Lifeline)eResolveProxy(oldBase_Lifeline);
			if (base_Lifeline != oldBase_Lifeline) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.DA_SERVICE_REQUEST__BASE_LIFELINE, oldBase_Lifeline, base_Lifeline));
			}
		}
		return base_Lifeline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lifeline basicGetBase_Lifeline() {
		return base_Lifeline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Lifeline(Lifeline newBase_Lifeline) {
		Lifeline oldBase_Lifeline = base_Lifeline;
		base_Lifeline = newBase_Lifeline;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.DA_SERVICE_REQUEST__BASE_LIFELINE, oldBase_Lifeline, base_Lifeline));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interaction getBase_Interaction() {
		if (base_Interaction != null && base_Interaction.eIsProxy()) {
			InternalEObject oldBase_Interaction = (InternalEObject)base_Interaction;
			base_Interaction = (Interaction)eResolveProxy(oldBase_Interaction);
			if (base_Interaction != oldBase_Interaction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.DA_SERVICE_REQUEST__BASE_INTERACTION, oldBase_Interaction, base_Interaction));
			}
		}
		return base_Interaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interaction basicGetBase_Interaction() {
		return base_Interaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Interaction(Interaction newBase_Interaction) {
		Interaction oldBase_Interaction = base_Interaction;
		base_Interaction = newBase_Interaction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.DA_SERVICE_REQUEST__BASE_INTERACTION, oldBase_Interaction, base_Interaction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceSpecification getBase_InstanceSpecification() {
		if (base_InstanceSpecification != null && base_InstanceSpecification.eIsProxy()) {
			InternalEObject oldBase_InstanceSpecification = (InternalEObject)base_InstanceSpecification;
			base_InstanceSpecification = (InstanceSpecification)eResolveProxy(oldBase_InstanceSpecification);
			if (base_InstanceSpecification != oldBase_InstanceSpecification) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.DA_SERVICE_REQUEST__BASE_INSTANCE_SPECIFICATION, oldBase_InstanceSpecification, base_InstanceSpecification));
			}
		}
		return base_InstanceSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceSpecification basicGetBase_InstanceSpecification() {
		return base_InstanceSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_InstanceSpecification(InstanceSpecification newBase_InstanceSpecification) {
		InstanceSpecification oldBase_InstanceSpecification = base_InstanceSpecification;
		base_InstanceSpecification = newBase_InstanceSpecification;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.DA_SERVICE_REQUEST__BASE_INSTANCE_SPECIFICATION, oldBase_InstanceSpecification, base_InstanceSpecification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean requestSize(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CoreValidator.DIAGNOSTIC_SOURCE,
						 CoreValidator.DA_SERVICE_REQUEST__REQUEST_SIZE,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "requestSize", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.DA_SERVICE_REQUEST__ACCESS_PROB:
				return getAccessProb();
			case CorePackage.DA_SERVICE_REQUEST__SERVICE_PROB:
				return getServiceProb();
			case CorePackage.DA_SERVICE_REQUEST__REQUEST:
				return getRequest();
			case CorePackage.DA_SERVICE_REQUEST__BASE_CLASSIFIER:
				if (resolve) return getBase_Classifier();
				return basicGetBase_Classifier();
			case CorePackage.DA_SERVICE_REQUEST__BASE_LIFELINE:
				if (resolve) return getBase_Lifeline();
				return basicGetBase_Lifeline();
			case CorePackage.DA_SERVICE_REQUEST__BASE_INTERACTION:
				if (resolve) return getBase_Interaction();
				return basicGetBase_Interaction();
			case CorePackage.DA_SERVICE_REQUEST__BASE_INSTANCE_SPECIFICATION:
				if (resolve) return getBase_InstanceSpecification();
				return basicGetBase_InstanceSpecification();
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
			case CorePackage.DA_SERVICE_REQUEST__ACCESS_PROB:
				getAccessProb().clear();
				getAccessProb().addAll((Collection<? extends String>)newValue);
				return;
			case CorePackage.DA_SERVICE_REQUEST__SERVICE_PROB:
				getServiceProb().clear();
				getServiceProb().addAll((Collection<? extends String>)newValue);
				return;
			case CorePackage.DA_SERVICE_REQUEST__REQUEST:
				getRequest().clear();
				getRequest().addAll((Collection<? extends DaService>)newValue);
				return;
			case CorePackage.DA_SERVICE_REQUEST__BASE_CLASSIFIER:
				setBase_Classifier((Classifier)newValue);
				return;
			case CorePackage.DA_SERVICE_REQUEST__BASE_LIFELINE:
				setBase_Lifeline((Lifeline)newValue);
				return;
			case CorePackage.DA_SERVICE_REQUEST__BASE_INTERACTION:
				setBase_Interaction((Interaction)newValue);
				return;
			case CorePackage.DA_SERVICE_REQUEST__BASE_INSTANCE_SPECIFICATION:
				setBase_InstanceSpecification((InstanceSpecification)newValue);
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
			case CorePackage.DA_SERVICE_REQUEST__ACCESS_PROB:
				getAccessProb().clear();
				return;
			case CorePackage.DA_SERVICE_REQUEST__SERVICE_PROB:
				getServiceProb().clear();
				return;
			case CorePackage.DA_SERVICE_REQUEST__REQUEST:
				getRequest().clear();
				return;
			case CorePackage.DA_SERVICE_REQUEST__BASE_CLASSIFIER:
				setBase_Classifier((Classifier)null);
				return;
			case CorePackage.DA_SERVICE_REQUEST__BASE_LIFELINE:
				setBase_Lifeline((Lifeline)null);
				return;
			case CorePackage.DA_SERVICE_REQUEST__BASE_INTERACTION:
				setBase_Interaction((Interaction)null);
				return;
			case CorePackage.DA_SERVICE_REQUEST__BASE_INSTANCE_SPECIFICATION:
				setBase_InstanceSpecification((InstanceSpecification)null);
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
			case CorePackage.DA_SERVICE_REQUEST__ACCESS_PROB:
				return accessProb != null && !accessProb.isEmpty();
			case CorePackage.DA_SERVICE_REQUEST__SERVICE_PROB:
				return serviceProb != null && !serviceProb.isEmpty();
			case CorePackage.DA_SERVICE_REQUEST__REQUEST:
				return request != null && !request.isEmpty();
			case CorePackage.DA_SERVICE_REQUEST__BASE_CLASSIFIER:
				return base_Classifier != null;
			case CorePackage.DA_SERVICE_REQUEST__BASE_LIFELINE:
				return base_Lifeline != null;
			case CorePackage.DA_SERVICE_REQUEST__BASE_INTERACTION:
				return base_Interaction != null;
			case CorePackage.DA_SERVICE_REQUEST__BASE_INSTANCE_SPECIFICATION:
				return base_InstanceSpecification != null;
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
		result.append(" (accessProb: ");
		result.append(accessProb);
		result.append(", serviceProb: ");
		result.append(serviceProb);
		result.append(')');
		return result.toString();
	}

} //DaServiceRequestImpl
