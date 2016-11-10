/**
 */
package es.unizar.disco.dice.DDSM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ddsm Nimbus</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * self.componentType = DDSMcomponentType::MasterNode
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.unizar.disco.dice.DDSM.DdsmNimbus#getTaskTimeout <em>Task Timeout</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.DdsmNimbus#getSupervisorFrequency <em>Supervisor Frequency</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.DdsmNimbus#getQueueSize <em>Queue Size</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.DdsmNimbus#getMonitorFrequency <em>Monitor Frequency</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.DdsmNimbus#getRetryTimes <em>Retry Times</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.DdsmNimbus#getRetryInterval <em>Retry Interval</em>}</li>
 * </ul>
 *
 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmNimbus()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='NimbusTypeMasterNode'"
 * @generated
 */
public interface DdsmNimbus extends DdsmInternalComponent {
	/**
	 * Returns the value of the '<em><b>Task Timeout</b></em>' attribute.
	 * The default value is <code>"60"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task Timeout</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task Timeout</em>' attribute.
	 * @see #setTaskTimeout(int)
	 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmNimbus_TaskTimeout()
	 * @model default="60" required="true" ordered="false"
	 * @generated
	 */
	int getTaskTimeout();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DDSM.DdsmNimbus#getTaskTimeout <em>Task Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task Timeout</em>' attribute.
	 * @see #getTaskTimeout()
	 * @generated
	 */
	void setTaskTimeout(int value);

	/**
	 * Returns the value of the '<em><b>Supervisor Frequency</b></em>' attribute.
	 * The default value is <code>"60"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supervisor Frequency</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supervisor Frequency</em>' attribute.
	 * @see #setSupervisorFrequency(int)
	 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmNimbus_SupervisorFrequency()
	 * @model default="60" required="true" ordered="false"
	 * @generated
	 */
	int getSupervisorFrequency();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DDSM.DdsmNimbus#getSupervisorFrequency <em>Supervisor Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supervisor Frequency</em>' attribute.
	 * @see #getSupervisorFrequency()
	 * @generated
	 */
	void setSupervisorFrequency(int value);

	/**
	 * Returns the value of the '<em><b>Queue Size</b></em>' attribute.
	 * The default value is <code>"10000"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Queue Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Queue Size</em>' attribute.
	 * @see #setQueueSize(int)
	 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmNimbus_QueueSize()
	 * @model default="10000" required="true" ordered="false"
	 * @generated
	 */
	int getQueueSize();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DDSM.DdsmNimbus#getQueueSize <em>Queue Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Queue Size</em>' attribute.
	 * @see #getQueueSize()
	 * @generated
	 */
	void setQueueSize(int value);

	/**
	 * Returns the value of the '<em><b>Monitor Frequency</b></em>' attribute.
	 * The default value is <code>"40"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Monitor Frequency</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Monitor Frequency</em>' attribute.
	 * @see #setMonitorFrequency(int)
	 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmNimbus_MonitorFrequency()
	 * @model default="40" required="true" ordered="false"
	 * @generated
	 */
	int getMonitorFrequency();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DDSM.DdsmNimbus#getMonitorFrequency <em>Monitor Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Monitor Frequency</em>' attribute.
	 * @see #getMonitorFrequency()
	 * @generated
	 */
	void setMonitorFrequency(int value);

	/**
	 * Returns the value of the '<em><b>Retry Times</b></em>' attribute.
	 * The default value is <code>"5"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Retry Times</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Retry Times</em>' attribute.
	 * @see #setRetryTimes(int)
	 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmNimbus_RetryTimes()
	 * @model default="5" required="true" ordered="false"
	 * @generated
	 */
	int getRetryTimes();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DDSM.DdsmNimbus#getRetryTimes <em>Retry Times</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Retry Times</em>' attribute.
	 * @see #getRetryTimes()
	 * @generated
	 */
	void setRetryTimes(int value);

	/**
	 * Returns the value of the '<em><b>Retry Interval</b></em>' attribute.
	 * The default value is <code>"2000"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Retry Interval</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Retry Interval</em>' attribute.
	 * @see #setRetryInterval(int)
	 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmNimbus_RetryInterval()
	 * @model default="2000" required="true" ordered="false"
	 * @generated
	 */
	int getRetryInterval();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DDSM.DdsmNimbus#getRetryInterval <em>Retry Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Retry Interval</em>' attribute.
	 * @see #getRetryInterval()
	 * @generated
	 */
	void setRetryInterval(int value);

} // DdsmNimbus
