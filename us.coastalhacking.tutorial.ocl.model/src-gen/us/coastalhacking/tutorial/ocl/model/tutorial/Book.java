/**
 */
package us.coastalhacking.tutorial.ocl.model.tutorial;

import java.math.BigInteger;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Book</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link us.coastalhacking.tutorial.ocl.model.tutorial.Book#getName <em>Name</em>}</li>
 *   <li>{@link us.coastalhacking.tutorial.ocl.model.tutorial.Book#getCopies <em>Copies</em>}</li>
 *   <li>{@link us.coastalhacking.tutorial.ocl.model.tutorial.Book#getLibrary <em>Library</em>}</li>
 *   <li>{@link us.coastalhacking.tutorial.ocl.model.tutorial.Book#getLoans <em>Loans</em>}</li>
 * </ul>
 *
 * @see us.coastalhacking.tutorial.ocl.model.tutorial.TutorialPackage#getBook()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='SufficientCopies'"
 * @generated
 */
public interface Book extends EObject {
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
	 * @see us.coastalhacking.tutorial.ocl.model.tutorial.TutorialPackage#getBook_Name()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.eclipse.org/mdt/ocl/oclinecore/tutorial!Book!name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link us.coastalhacking.tutorial.ocl.model.tutorial.Book#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Copies</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Copies</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Copies</em>' attribute.
	 * @see #setCopies(BigInteger)
	 * @see us.coastalhacking.tutorial.ocl.model.tutorial.TutorialPackage#getBook_Copies()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.eclipse.org/mdt/ocl/oclinecore/tutorial!Book!copies'"
	 * @generated
	 */
	BigInteger getCopies();

	/**
	 * Sets the value of the '{@link us.coastalhacking.tutorial.ocl.model.tutorial.Book#getCopies <em>Copies</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Copies</em>' attribute.
	 * @see #getCopies()
	 * @generated
	 */
	void setCopies(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Library</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link us.coastalhacking.tutorial.ocl.model.tutorial.Library#getBooks <em>Books</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Library</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Library</em>' container reference.
	 * @see #setLibrary(Library)
	 * @see us.coastalhacking.tutorial.ocl.model.tutorial.TutorialPackage#getBook_Library()
	 * @see us.coastalhacking.tutorial.ocl.model.tutorial.Library#getBooks
	 * @model opposite="books" transient="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.eclipse.org/mdt/ocl/oclinecore/tutorial!Book!library'"
	 * @generated
	 */
	Library getLibrary();

	/**
	 * Sets the value of the '{@link us.coastalhacking.tutorial.ocl.model.tutorial.Book#getLibrary <em>Library</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Library</em>' container reference.
	 * @see #getLibrary()
	 * @generated
	 */
	void setLibrary(Library value);

	/**
	 * Returns the value of the '<em><b>Loans</b></em>' reference list.
	 * The list contents are of type {@link us.coastalhacking.tutorial.ocl.model.tutorial.Loan}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Loans</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loans</em>' reference list.
	 * @see us.coastalhacking.tutorial.ocl.model.tutorial.TutorialPackage#getBook_Loans()
	 * @model volatile="true" derived="true" ordered="false"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='/**\n * library.loans-&gt;select(book = self)\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.ids.IdResolver%&gt; idResolver = executor.getIdResolver();\nfinal /*@NonInvalid\052/ &lt;%us.coastalhacking.tutorial.ocl.model.tutorial.Library%&gt; library = this.getLibrary();\nif (library == null) {\n\tthrow new &lt;%org.eclipse.ocl.pivot.values.InvalidValueException%&gt;(\"Null source for \\\'\\\'http://www.eclipse.org/mdt/ocl/oclinecore/tutorial\\\'::Library::loans\\\'\");\n}\nfinal /*@Thrown\052/ &lt;%java.util.List%&gt;&lt;&lt;%us.coastalhacking.tutorial.ocl.model.tutorial.Loan%&gt;&gt; loans = library.getLoans();\nfinal /*@Thrown\052/ &lt;%org.eclipse.ocl.pivot.values.SetValue%&gt; BOXED_loans = idResolver.createSetOfAll(&lt;%us.coastalhacking.tutorial.ocl.model.tutorial.TutorialTables%&gt;.SET_CLSSid_Loan, loans);\n/*@Thrown\052/ &lt;%org.eclipse.ocl.pivot.values.SetValue%&gt;.Accumulator accumulator = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createSetAccumulatorValue(&lt;%us.coastalhacking.tutorial.ocl.model.tutorial.TutorialTables%&gt;.SET_CLSSid_Loan);\n/*@Nullable\052/ &lt;%java.util.Iterator%&gt;&lt;&lt;%java.lang.Object%&gt;&gt; ITERATOR__1 = BOXED_loans.iterator();\n/*@Thrown\052/ &lt;%org.eclipse.ocl.pivot.values.SetValue%&gt; select;\nwhile (true) {\n\tif (!ITERATOR__1.hasNext()) {\n\t\tselect = accumulator;\n\t\tbreak;\n\t}\n\t/*@NonInvalid\052/ &lt;%us.coastalhacking.tutorial.ocl.model.tutorial.Loan%&gt; _1 = (&lt;%us.coastalhacking.tutorial.ocl.model.tutorial.Loan%&gt;)ITERATOR__1.next();\n\t/**\n\t * book = self\n\t \052/\n\tif (_1 == null) {\n\t\tthrow new &lt;%org.eclipse.ocl.pivot.values.InvalidValueException%&gt;(\"Null source for \\\'\\\'http://www.eclipse.org/mdt/ocl/oclinecore/tutorial\\\'::Loan::book\\\'\");\n\t}\n\tfinal /*@Thrown\052/ &lt;%us.coastalhacking.tutorial.ocl.model.tutorial.Book%&gt; book = _1.getBook();\n\tfinal /*@Thrown\052/ boolean eq = this.equals(book);\n\t//\n\tif (eq == &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE) {\n\t\taccumulator.add(_1);\n\t}\n}\nfinal /*@Thrown\052/ &lt;%java.util.List%&gt;&lt;&lt;%us.coastalhacking.tutorial.ocl.model.tutorial.Loan%&gt;&gt; ECORE_select = ((&lt;%org.eclipse.ocl.pivot.ids.IdResolver%&gt;.IdResolverExtension)idResolver).ecoreValueOfAll(&lt;%us.coastalhacking.tutorial.ocl.model.tutorial.Loan%&gt;.class, select);\nreturn (&lt;%org.eclipse.emf.common.util.EList%&gt;&lt;&lt;%us.coastalhacking.tutorial.ocl.model.tutorial.Loan%&gt;&gt;)ECORE_select;'"
	 * @generated
	 */
	EList<Loan> getLoans();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n * loans-&gt;size() &lt; copies\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.ids.IdResolver%&gt; idResolver = executor.getIdResolver();\nfinal /*@NonInvalid\052/ &lt;%java.util.List%&gt;&lt;&lt;%us.coastalhacking.tutorial.ocl.model.tutorial.Loan%&gt;&gt; loans = this.getLoans();\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.SetValue%&gt; BOXED_loans = idResolver.createSetOfAll(&lt;%us.coastalhacking.tutorial.ocl.model.tutorial.TutorialTables%&gt;.SET_CLSSid_Loan, loans);\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; size = &lt;%org.eclipse.ocl.pivot.library.collection.CollectionSizeOperation%&gt;.INSTANCE.evaluate(BOXED_loans);\nfinal /*@NonInvalid\052/ &lt;%java.math.BigInteger%&gt; copies = this.getCopies();\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; BOXED_copies = copies == null ? null : &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.integerValueOf(copies);\nfinal /*@Thrown\052/ boolean lt = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanOperation%&gt;.INSTANCE.evaluate(executor, size, BOXED_copies).booleanValue();\nreturn lt;'"
	 * @generated
	 */
	Boolean isAvailable();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * inv SufficientCopies:\n *   let severity : Integer[1] = \'Book::SufficientCopies\'.getSeverity()\n *   in\n *     if severity &lt;= 0\n *     then true\n *     else\n *       let\n *         result : Boolean[1] = library.loans-&gt;select((book = self))\n *         -&gt;size() &lt;= copies\n *       in\n *         \'Book::SufficientCopies\'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n *     endif\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.ids.IdResolver%&gt; idResolver = executor.getIdResolver();\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; severity_0 = &lt;%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%&gt;.INSTANCE.evaluate(executor, &lt;%us.coastalhacking.tutorial.ocl.model.tutorial.TutorialTables%&gt;.STR_Book_c_c_SufficientCopies);\nfinal /*@NonInvalid\052/ boolean le = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%&gt;.INSTANCE.evaluate(executor, severity_0, &lt;%us.coastalhacking.tutorial.ocl.model.tutorial.TutorialTables%&gt;.INT_0).booleanValue();\n/*@NonInvalid\052/ boolean symbol_0;\nif (le) {\n\tsymbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n}\nelse {\n\t/*@Caught\052/ /*@NonNull\052/ &lt;%java.lang.Object%&gt; CAUGHT_result;\n\ttry {\n\t\tfinal /*@NonInvalid\052/ &lt;%us.coastalhacking.tutorial.ocl.model.tutorial.Library%&gt; library = this.getLibrary();\n\t\tif (library == null) {\n\t\t\tthrow new &lt;%org.eclipse.ocl.pivot.values.InvalidValueException%&gt;(\"Null source for \\\'\\\'http://www.eclipse.org/mdt/ocl/oclinecore/tutorial\\\'::Library::loans\\\'\");\n\t\t}\n\t\tfinal /*@Thrown\052/ &lt;%java.util.List%&gt;&lt;&lt;%us.coastalhacking.tutorial.ocl.model.tutorial.Loan%&gt;&gt; loans = library.getLoans();\n\t\tfinal /*@Thrown\052/ &lt;%org.eclipse.ocl.pivot.values.SetValue%&gt; BOXED_loans = idResolver.createSetOfAll(&lt;%us.coastalhacking.tutorial.ocl.model.tutorial.TutorialTables%&gt;.SET_CLSSid_Loan, loans);\n\t\t/*@Thrown\052/ &lt;%org.eclipse.ocl.pivot.values.SetValue%&gt;.Accumulator accumulator = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createSetAccumulatorValue(&lt;%us.coastalhacking.tutorial.ocl.model.tutorial.TutorialTables%&gt;.SET_CLSSid_Loan);\n\t\t/*@Nullable\052/ &lt;%java.util.Iterator%&gt;&lt;&lt;%java.lang.Object%&gt;&gt; ITERATOR__1 = BOXED_loans.iterator();\n\t\t/*@Thrown\052/ &lt;%org.eclipse.ocl.pivot.values.SetValue%&gt; select;\n\t\twhile (true) {\n\t\t\tif (!ITERATOR__1.hasNext()) {\n\t\t\t\tselect = accumulator;\n\t\t\t\tbreak;\n\t\t\t}\n\t\t\t/*@NonInvalid\052/ &lt;%us.coastalhacking.tutorial.ocl.model.tutorial.Loan%&gt; _1 = (&lt;%us.coastalhacking.tutorial.ocl.model.tutorial.Loan%&gt;)ITERATOR__1.next();\n\t\t\t/**\n\t\t\t * book = self\n\t\t\t \052/\n\t\t\tif (_1 == null) {\n\t\t\t\tthrow new &lt;%org.eclipse.ocl.pivot.values.InvalidValueException%&gt;(\"Null source for \\\'\\\'http://www.eclipse.org/mdt/ocl/oclinecore/tutorial\\\'::Loan::book\\\'\");\n\t\t\t}\n\t\t\tfinal /*@Thrown\052/ &lt;%us.coastalhacking.tutorial.ocl.model.tutorial.Book%&gt; book = _1.getBook();\n\t\t\tfinal /*@Thrown\052/ boolean eq = this.equals(book);\n\t\t\t//\n\t\t\tif (eq == &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE) {\n\t\t\t\taccumulator.add(_1);\n\t\t\t}\n\t\t}\n\t\tfinal /*@Thrown\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; size = &lt;%org.eclipse.ocl.pivot.library.collection.CollectionSizeOperation%&gt;.INSTANCE.evaluate(select);\n\t\tfinal /*@NonInvalid\052/ &lt;%java.math.BigInteger%&gt; copies = this.getCopies();\n\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; BOXED_copies = copies == null ? null : &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.integerValueOf(copies);\n\t\tfinal /*@Thrown\052/ boolean result = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%&gt;.INSTANCE.evaluate(executor, size, BOXED_copies).booleanValue();\n\t\tCAUGHT_result = result;\n\t}\n\tcatch (&lt;%java.lang.Exception%&gt; e) {\n\t\tCAUGHT_result = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.createInvalidValue(e);\n\t}\n\tfinal /*@NonInvalid\052/ boolean logDiagnostic = &lt;%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, &lt;%us.coastalhacking.tutorial.ocl.model.tutorial.TutorialTables%&gt;.STR_Book_c_c_SufficientCopies, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, &lt;%us.coastalhacking.tutorial.ocl.model.tutorial.TutorialTables%&gt;.INT_0).booleanValue();\n\tsymbol_0 = logDiagnostic;\n}\nreturn Boolean.TRUE == symbol_0;'"
	 * @generated
	 */
	boolean SufficientCopies(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Book
