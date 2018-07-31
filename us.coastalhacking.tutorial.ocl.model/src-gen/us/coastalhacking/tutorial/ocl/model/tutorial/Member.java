/**
 */
package us.coastalhacking.tutorial.ocl.model.tutorial;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Member</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link us.coastalhacking.tutorial.ocl.model.tutorial.Member#getName <em>Name</em>}</li>
 *   <li>{@link us.coastalhacking.tutorial.ocl.model.tutorial.Member#getLibrary <em>Library</em>}</li>
 * </ul>
 *
 * @see us.coastalhacking.tutorial.ocl.model.tutorial.TutorialPackage#getMember()
 * @model
 * @generated
 */
public interface Member extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see us.coastalhacking.tutorial.ocl.model.tutorial.TutorialPackage#getMember_Name()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.eclipse.org/mdt/ocl/oclinecore/tutorial!Member!name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link us.coastalhacking.tutorial.ocl.model.tutorial.Member#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Library</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link us.coastalhacking.tutorial.ocl.model.tutorial.Library#getMembers <em>Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Library</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Library</em>' container reference.
	 * @see #setLibrary(Library)
	 * @see us.coastalhacking.tutorial.ocl.model.tutorial.TutorialPackage#getMember_Library()
	 * @see us.coastalhacking.tutorial.ocl.model.tutorial.Library#getMembers
	 * @model opposite="members" transient="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.eclipse.org/mdt/ocl/oclinecore/tutorial!Member!library'"
	 * @generated
	 */
	Library getLibrary();

	/**
	 * Sets the value of the '{@link us.coastalhacking.tutorial.ocl.model.tutorial.Member#getLibrary <em>Library</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Library</em>' container reference.
	 * @see #getLibrary()
	 * @generated
	 */
	void setLibrary(Library value);

} // Member
