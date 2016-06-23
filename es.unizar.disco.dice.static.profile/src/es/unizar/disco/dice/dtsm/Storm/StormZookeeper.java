/**
 */
package es.unizar.disco.dice.dtsm.Storm;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Classifier;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Zookeeper</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.unizar.disco.dice.dtsm.Storm.StormZookeeper#getSessionTimeout <em>Session Timeout</em>}</li>
 *   <li>{@link es.unizar.disco.dice.dtsm.Storm.StormZookeeper#getConnectionTimeout <em>Connection Timeout</em>}</li>
 *   <li>{@link es.unizar.disco.dice.dtsm.Storm.StormZookeeper#getRetryTime <em>Retry Time</em>}</li>
 *   <li>{@link es.unizar.disco.dice.dtsm.Storm.StormZookeeper#getRetryInterval <em>Retry Interval</em>}</li>
 *   <li>{@link es.unizar.disco.dice.dtsm.Storm.StormZookeeper#getUser <em>User</em>}</li>
 *   <li>{@link es.unizar.disco.dice.dtsm.Storm.StormZookeeper#getPassword <em>Password</em>}</li>
 *   <li>{@link es.unizar.disco.dice.dtsm.Storm.StormZookeeper#getBase_Classifier <em>Base Classifier</em>}</li>
 * </ul>
 *
 * @see es.unizar.disco.dice.dtsm.Storm.StormPackage#getStormZookeeper()
 * @model
 * @generated
 */
public interface StormZookeeper extends EObject {
	/**
	 * Returns the value of the '<em><b>Session Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Session Timeout</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Session Timeout</em>' attribute.
	 * @see #setSessionTimeout(int)
	 * @see es.unizar.disco.dice.dtsm.Storm.StormPackage#getStormZookeeper_SessionTimeout()
	 * @model dataType="org.eclipse.uml2.types.Integer" ordered="false"
	 * @generated
	 */
	int getSessionTimeout();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.dtsm.Storm.StormZookeeper#getSessionTimeout <em>Session Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Session Timeout</em>' attribute.
	 * @see #getSessionTimeout()
	 * @generated
	 */
	void setSessionTimeout(int value);

	/**
	 * Returns the value of the '<em><b>Connection Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connection Timeout</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection Timeout</em>' attribute.
	 * @see #setConnectionTimeout(int)
	 * @see es.unizar.disco.dice.dtsm.Storm.StormPackage#getStormZookeeper_ConnectionTimeout()
	 * @model dataType="org.eclipse.uml2.types.Integer" ordered="false"
	 * @generated
	 */
	int getConnectionTimeout();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.dtsm.Storm.StormZookeeper#getConnectionTimeout <em>Connection Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connection Timeout</em>' attribute.
	 * @see #getConnectionTimeout()
	 * @generated
	 */
	void setConnectionTimeout(int value);

	/**
	 * Returns the value of the '<em><b>Retry Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Retry Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Retry Time</em>' attribute.
	 * @see #setRetryTime(int)
	 * @see es.unizar.disco.dice.dtsm.Storm.StormPackage#getStormZookeeper_RetryTime()
	 * @model dataType="org.eclipse.uml2.types.Integer" ordered="false"
	 * @generated
	 */
	int getRetryTime();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.dtsm.Storm.StormZookeeper#getRetryTime <em>Retry Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Retry Time</em>' attribute.
	 * @see #getRetryTime()
	 * @generated
	 */
	void setRetryTime(int value);

	/**
	 * Returns the value of the '<em><b>Retry Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Retry Interval</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Retry Interval</em>' attribute.
	 * @see #setRetryInterval(int)
	 * @see es.unizar.disco.dice.dtsm.Storm.StormPackage#getStormZookeeper_RetryInterval()
	 * @model dataType="org.eclipse.uml2.types.Integer" ordered="false"
	 * @generated
	 */
	int getRetryInterval();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.dtsm.Storm.StormZookeeper#getRetryInterval <em>Retry Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Retry Interval</em>' attribute.
	 * @see #getRetryInterval()
	 * @generated
	 */
	void setRetryInterval(int value);

	/**
	 * Returns the value of the '<em><b>User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User</em>' attribute.
	 * @see #setUser(String)
	 * @see es.unizar.disco.dice.dtsm.Storm.StormPackage#getStormZookeeper_User()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getUser();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.dtsm.Storm.StormZookeeper#getUser <em>User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User</em>' attribute.
	 * @see #getUser()
	 * @generated
	 */
	void setUser(String value);

	/**
	 * Returns the value of the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Password</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Password</em>' attribute.
	 * @see #setPassword(String)
	 * @see es.unizar.disco.dice.dtsm.Storm.StormPackage#getStormZookeeper_Password()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getPassword();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.dtsm.Storm.StormZookeeper#getPassword <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' attribute.
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(String value);

	/**
	 * Returns the value of the '<em><b>Base Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Classifier</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Classifier</em>' reference.
	 * @see #setBase_Classifier(Classifier)
	 * @see es.unizar.disco.dice.dtsm.Storm.StormPackage#getStormZookeeper_Base_Classifier()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Classifier getBase_Classifier();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.dtsm.Storm.StormZookeeper#getBase_Classifier <em>Base Classifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Classifier</em>' reference.
	 * @see #getBase_Classifier()
	 * @generated
	 */
	void setBase_Classifier(Classifier value);

} // StormZookeeper
