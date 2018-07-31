/**
 */
package us.coastalhacking.tutorial.ocl.model.tutorial.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.IdResolver;

import org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal;

import org.eclipse.ocl.pivot.library.collection.CollectionAsSequenceOperation;
import org.eclipse.ocl.pivot.library.collection.OrderedCollectionFirstOperation;

import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.SequenceValue;
import org.eclipse.ocl.pivot.values.SetValue;

import us.coastalhacking.tutorial.ocl.model.tutorial.Book;
import us.coastalhacking.tutorial.ocl.model.tutorial.Library;
import us.coastalhacking.tutorial.ocl.model.tutorial.Loan;
import us.coastalhacking.tutorial.ocl.model.tutorial.Member;
import us.coastalhacking.tutorial.ocl.model.tutorial.TutorialPackage;
import us.coastalhacking.tutorial.ocl.model.tutorial.TutorialTables;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Library</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link us.coastalhacking.tutorial.ocl.model.tutorial.impl.LibraryImpl#getName <em>Name</em>}</li>
 *   <li>{@link us.coastalhacking.tutorial.ocl.model.tutorial.impl.LibraryImpl#getBooks <em>Books</em>}</li>
 *   <li>{@link us.coastalhacking.tutorial.ocl.model.tutorial.impl.LibraryImpl#getLoans <em>Loans</em>}</li>
 *   <li>{@link us.coastalhacking.tutorial.ocl.model.tutorial.impl.LibraryImpl#getMembers <em>Members</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LibraryImpl extends MinimalEObjectImpl.Container implements Library {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBooks() <em>Books</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBooks()
	 * @generated
	 * @ordered
	 */
	protected EList<Book> books;

	/**
	 * The cached value of the '{@link #getLoans() <em>Loans</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoans()
	 * @generated
	 * @ordered
	 */
	protected EList<Loan> loans;

	/**
	 * The cached value of the '{@link #getMembers() <em>Members</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMembers()
	 * @generated
	 * @ordered
	 */
	protected EList<Member> members;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LibraryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TutorialPackage.Literals.LIBRARY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TutorialPackage.LIBRARY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Book> getBooks() {
		if (books == null) {
			books = new EObjectContainmentWithInverseEList<Book>(Book.class, this, TutorialPackage.LIBRARY__BOOKS, TutorialPackage.BOOK__LIBRARY);
		}
		return books;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Loan> getLoans() {
		if (loans == null) {
			loans = new EObjectContainmentEList<Loan>(Loan.class, this, TutorialPackage.LIBRARY__LOANS);
		}
		return loans;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Member> getMembers() {
		if (members == null) {
			members = new EObjectContainmentWithInverseEList<Member>(Member.class, this, TutorialPackage.LIBRARY__MEMBERS, TutorialPackage.MEMBER__LIBRARY);
		}
		return members;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Book findBook(final String bookName) {
		/**
		 * self.books->select(name = bookName)->asSequence()->first()
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ List<Book> books = this.getBooks();
		final /*@NonInvalid*/ SetValue BOXED_books = idResolver.createSetOfAll(TutorialTables.SET_CLSSid_Book, books);
		/*@Thrown*/ SetValue.Accumulator accumulator = ValueUtil.createSetAccumulatorValue(TutorialTables.SET_CLSSid_Book);
		/*@Nullable*/ Iterator<Object> ITERATOR__1 = BOXED_books.iterator();
		/*@Thrown*/ SetValue select;
		while (true) {
			if (!ITERATOR__1.hasNext()) {
				select = accumulator;
				break;
			}
			/*@NonInvalid*/ Book _1 = (Book)ITERATOR__1.next();
			/**
			 * name = bookName
			 */
			if (_1 == null) {
				throw new InvalidValueException("Null source for \'\'http://www.eclipse.org/mdt/ocl/oclinecore/tutorial\'::Book::name\'");
			}
			final /*@Thrown*/ String name = _1.getName();
			final /*@Thrown*/ boolean eq = (name != null) ? name.equals(bookName) : (bookName == null);
			//
			if (eq == ValueUtil.TRUE_VALUE) {
				accumulator.add(_1);
			}
		}
		final /*@Thrown*/ SequenceValue asSequence = CollectionAsSequenceOperation.INSTANCE.evaluate(select);
		final /*@Thrown*/ Book first = (Book)OrderedCollectionFirstOperation.INSTANCE.evaluate(asSequence);
		return first;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TutorialPackage.LIBRARY__BOOKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBooks()).basicAdd(otherEnd, msgs);
			case TutorialPackage.LIBRARY__MEMBERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMembers()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TutorialPackage.LIBRARY__BOOKS:
				return ((InternalEList<?>)getBooks()).basicRemove(otherEnd, msgs);
			case TutorialPackage.LIBRARY__LOANS:
				return ((InternalEList<?>)getLoans()).basicRemove(otherEnd, msgs);
			case TutorialPackage.LIBRARY__MEMBERS:
				return ((InternalEList<?>)getMembers()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TutorialPackage.LIBRARY__NAME:
				return getName();
			case TutorialPackage.LIBRARY__BOOKS:
				return getBooks();
			case TutorialPackage.LIBRARY__LOANS:
				return getLoans();
			case TutorialPackage.LIBRARY__MEMBERS:
				return getMembers();
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
			case TutorialPackage.LIBRARY__NAME:
				setName((String)newValue);
				return;
			case TutorialPackage.LIBRARY__BOOKS:
				getBooks().clear();
				getBooks().addAll((Collection<? extends Book>)newValue);
				return;
			case TutorialPackage.LIBRARY__LOANS:
				getLoans().clear();
				getLoans().addAll((Collection<? extends Loan>)newValue);
				return;
			case TutorialPackage.LIBRARY__MEMBERS:
				getMembers().clear();
				getMembers().addAll((Collection<? extends Member>)newValue);
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
			case TutorialPackage.LIBRARY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TutorialPackage.LIBRARY__BOOKS:
				getBooks().clear();
				return;
			case TutorialPackage.LIBRARY__LOANS:
				getLoans().clear();
				return;
			case TutorialPackage.LIBRARY__MEMBERS:
				getMembers().clear();
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
			case TutorialPackage.LIBRARY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TutorialPackage.LIBRARY__BOOKS:
				return books != null && !books.isEmpty();
			case TutorialPackage.LIBRARY__LOANS:
				return loans != null && !loans.isEmpty();
			case TutorialPackage.LIBRARY__MEMBERS:
				return members != null && !members.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case TutorialPackage.LIBRARY___FIND_BOOK__STRING:
				return findBook((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //LibraryImpl
