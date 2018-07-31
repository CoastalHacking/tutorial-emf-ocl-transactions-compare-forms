/**
 */
package us.coastalhacking.tutorial.ocl.model.tutorial;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Library</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link us.coastalhacking.tutorial.ocl.model.tutorial.Library#getName <em>Name</em>}</li>
 *   <li>{@link us.coastalhacking.tutorial.ocl.model.tutorial.Library#getBooks <em>Books</em>}</li>
 *   <li>{@link us.coastalhacking.tutorial.ocl.model.tutorial.Library#getLoans <em>Loans</em>}</li>
 *   <li>{@link us.coastalhacking.tutorial.ocl.model.tutorial.Library#getMembers <em>Members</em>}</li>
 * </ul>
 *
 * @see us.coastalhacking.tutorial.ocl.model.tutorial.TutorialPackage#getLibrary()
 * @model
 * @generated
 */
public interface Library extends EObject {
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
	 * @see us.coastalhacking.tutorial.ocl.model.tutorial.TutorialPackage#getLibrary_Name()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.eclipse.org/mdt/ocl/oclinecore/tutorial!Library!name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link us.coastalhacking.tutorial.ocl.model.tutorial.Library#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Books</b></em>' containment reference list.
	 * The list contents are of type {@link us.coastalhacking.tutorial.ocl.model.tutorial.Book}.
	 * It is bidirectional and its opposite is '{@link us.coastalhacking.tutorial.ocl.model.tutorial.Book#getLibrary <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Books</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Books</em>' containment reference list.
	 * @see us.coastalhacking.tutorial.ocl.model.tutorial.TutorialPackage#getLibrary_Books()
	 * @see us.coastalhacking.tutorial.ocl.model.tutorial.Book#getLibrary
	 * @model opposite="library" containment="true" ordered="false"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.eclipse.org/mdt/ocl/oclinecore/tutorial!Library!books'"
	 * @generated
	 */
	EList<Book> getBooks();

	/**
	 * Returns the value of the '<em><b>Loans</b></em>' containment reference list.
	 * The list contents are of type {@link us.coastalhacking.tutorial.ocl.model.tutorial.Loan}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Loans</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loans</em>' containment reference list.
	 * @see us.coastalhacking.tutorial.ocl.model.tutorial.TutorialPackage#getLibrary_Loans()
	 * @model containment="true" ordered="false"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.eclipse.org/mdt/ocl/oclinecore/tutorial!Library!loans'"
	 * @generated
	 */
	EList<Loan> getLoans();

	/**
	 * Returns the value of the '<em><b>Members</b></em>' containment reference list.
	 * The list contents are of type {@link us.coastalhacking.tutorial.ocl.model.tutorial.Member}.
	 * It is bidirectional and its opposite is '{@link us.coastalhacking.tutorial.ocl.model.tutorial.Member#getLibrary <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Members</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Members</em>' containment reference list.
	 * @see us.coastalhacking.tutorial.ocl.model.tutorial.TutorialPackage#getLibrary_Members()
	 * @see us.coastalhacking.tutorial.ocl.model.tutorial.Member#getLibrary
	 * @model opposite="library" containment="true" ordered="false"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.eclipse.org/mdt/ocl/oclinecore/tutorial!Library!members'"
	 * @generated
	 */
	EList<Member> getMembers();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n * self.books-&gt;select(name = bookName)-&gt;asSequence()-&gt;first()\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.ids.IdResolver%&gt; idResolver = executor.getIdResolver();\nfinal /*@NonInvalid\052/ &lt;%java.util.List%&gt;&lt;&lt;%us.coastalhacking.tutorial.ocl.model.tutorial.Book%&gt;&gt; books = this.getBooks();\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.SetValue%&gt; BOXED_books = idResolver.createSetOfAll(&lt;%us.coastalhacking.tutorial.ocl.model.tutorial.TutorialTables%&gt;.SET_CLSSid_Book, books);\n/*@Thrown\052/ &lt;%org.eclipse.ocl.pivot.values.SetValue%&gt;.Accumulator accumulator = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createSetAccumulatorValue(&lt;%us.coastalhacking.tutorial.ocl.model.tutorial.TutorialTables%&gt;.SET_CLSSid_Book);\n/*@Nullable\052/ &lt;%java.util.Iterator%&gt;&lt;&lt;%java.lang.Object%&gt;&gt; ITERATOR__1 = BOXED_books.iterator();\n/*@Thrown\052/ &lt;%org.eclipse.ocl.pivot.values.SetValue%&gt; select;\nwhile (true) {\n\tif (!ITERATOR__1.hasNext()) {\n\t\tselect = accumulator;\n\t\tbreak;\n\t}\n\t/*@NonInvalid\052/ &lt;%us.coastalhacking.tutorial.ocl.model.tutorial.Book%&gt; _1 = (&lt;%us.coastalhacking.tutorial.ocl.model.tutorial.Book%&gt;)ITERATOR__1.next();\n\t/**\n\t * name = bookName\n\t \052/\n\tif (_1 == null) {\n\t\tthrow new &lt;%org.eclipse.ocl.pivot.values.InvalidValueException%&gt;(\"Null source for \\\'\\\'http://www.eclipse.org/mdt/ocl/oclinecore/tutorial\\\'::Book::name\\\'\");\n\t}\n\tfinal /*@Thrown\052/ &lt;%java.lang.String%&gt; name = _1.getName();\n\tfinal /*@Thrown\052/ boolean eq = (name != null) ? name.equals(bookName) : (bookName == null);\n\t//\n\tif (eq == &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE) {\n\t\taccumulator.add(_1);\n\t}\n}\nfinal /*@Thrown\052/ &lt;%org.eclipse.ocl.pivot.values.SequenceValue%&gt; asSequence = &lt;%org.eclipse.ocl.pivot.library.collection.CollectionAsSequenceOperation%&gt;.INSTANCE.evaluate(select);\nfinal /*@Thrown\052/ &lt;%us.coastalhacking.tutorial.ocl.model.tutorial.Book%&gt; first = (&lt;%us.coastalhacking.tutorial.ocl.model.tutorial.Book%&gt;)&lt;%org.eclipse.ocl.pivot.library.collection.OrderedCollectionFirstOperation%&gt;.INSTANCE.evaluate(asSequence);\nreturn first;'"
	 * @generated
	 */
	Book findBook(String bookName);

} // Library
