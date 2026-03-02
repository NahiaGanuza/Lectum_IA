package library;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the Librarian class.
 */
public class LibrarianTest {

    @Test
    public void testLibrarianConstructor() {
        Library library = new Library();
        Librarian librarian = new Librarian("Alice", "alice123", library);
        assertEquals("Alice", librarian.getName());
        assertEquals("alice123", librarian.getUsername());
    }

    @Test
    public void testSetName() {
        Librarian librarian = new Librarian("Alice", "alice123", null);
        librarian.setName("Bob");
        assertEquals("Bob", librarian.getName());
    }

    @Test
    public void testSetUsername() {
        Librarian librarian = new Librarian("Alice", "alice123", null);
        librarian.setUsername("bob456");
        assertEquals("bob456", librarian.getUsername());
    }

    @Test
    public void testAddBookToLibrary() {
        Library library = new Library();
        Librarian librarian = new Librarian("Alice", "alice123", library);
        Book book = new Book("Throne of Glass", "Fantasy", 2012, null);

        librarian.addBookToLibrary(book);
        assertTrue(library.getBooks().contains(book));
    }

    @Test
    public void testRemoveBookFromLibrary() {
        Library library = new Library();
        Librarian librarian = new Librarian("Alice", "alice123", library);
        Book book = new Book("Throne of Glass", "Fantasy", 2012, null);

        library.addBook(book);
        librarian.removeBookFromLibrary(book);
        assertFalse(library.getBooks().contains(book));
    }
}