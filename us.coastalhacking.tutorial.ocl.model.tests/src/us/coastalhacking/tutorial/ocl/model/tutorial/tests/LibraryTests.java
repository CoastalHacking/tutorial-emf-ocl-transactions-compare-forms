package us.coastalhacking.tutorial.ocl.model.tutorial.tests;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.eclipse.emf.ecore.util.EcoreUtil;
import us.coastalhacking.tutorial.ocl.model.tutorial.Book;
import us.coastalhacking.tutorial.ocl.model.tutorial.Library;
import us.coastalhacking.tutorial.ocl.model.tutorial.TutorialFactory;

import org.junit.jupiter.api.Test;

class LibraryTests {

	@Test
	void shouldFindBook() {
		Library library = TutorialFactory.eINSTANCE.createLibrary();
		Book book = TutorialFactory.eINSTANCE.createBook();
		book.setName("bob");
		library.getBooks().add(book);
		assertTrue(EcoreUtil.equals(book, library.findBook("bob")));
		assertThrows(org.eclipse.ocl.pivot.values.InvalidValueException.class, () -> {
			library.findBook("boba");
		});
	}

	@Test
	void shouldNotFindBook() {
		Library library = TutorialFactory.eINSTANCE.createLibrary();
		Book book = TutorialFactory.eINSTANCE.createBook();
		book.setName("bob");
		library.getBooks().add(book);
		assertThrows(org.eclipse.ocl.pivot.values.InvalidValueException.class, () -> {
			library.findBook("boba");
		});
	}

}
