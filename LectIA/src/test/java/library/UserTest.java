package library;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the User class.
 */
public class UserTest {

    @Test
    public void testUserConstructor() {
        Library library = new Library();
        User user = new User("John Doe", "johndoe123", library);

        assertEquals("John Doe", user.getName());
        assertEquals("johndoe123", user.getUsername());
        assertTrue(user.getBorrowedBooks().isEmpty());
    }

    @Test
    public void testSetName() {
        User user = new User("John Doe", "johndoe123", null);
        user.setName("Jane Doe");
        assertEquals("Jane Doe", user.getName());
    }

    @Test
    public void testSetUsername() {
        User user = new User("John Doe", "johndoe123", null);
        user.setUsername("janedoe456");
        assertEquals("janedoe456", user.getUsername());
    }

    @Test
    public void testBookBookSuccess() {
        Library library = new Library();
        Book book = new Book("Throne of Glass", "Fantasy", 2012, null);
        library.addBook(book);

        User user = new User("John Doe", "johndoe123", library);
        boolean result = user.bookBook(book);

        assertTrue(result);
        assertTrue(user.getBorrowedBooks().contains(book));
        assertFalse(library.getBooks().contains(book));
    }

    @Test
    public void testBookBookFailure() {
        Library library = new Library();
        Book book = new Book("Throne of Glass", "Fantasy", 2012, null);

        User user = new User("John Doe", "johndoe123", library);
        boolean result = user.bookBook(book);

        assertFalse(result);
        assertFalse(user.getBorrowedBooks().contains(book));
    }

    @Test
    public void testReturnBookSuccess() {
        Library library = new Library();
        Book book = new Book("Throne of Glass", "Fantasy", 2012, null);
        library.addBook(book);

        User user = new User("John Doe", "johndoe123", library);
        user.bookBook(book);

        boolean result = user.returnBook(book);

        assertTrue(result);
        assertFalse(user.getBorrowedBooks().contains(book));
        assertTrue(library.getBooks().contains(book));
    }

    @Test
    public void testReturnBookFailure() {
        Library library = new Library();
        Book book = new Book("Throne of Glass", "Fantasy", 2012, null);

        User user = new User("John Doe", "johndoe123", library);
        boolean result = user.returnBook(book);

        assertFalse(result);
        assertFalse(user.getBorrowedBooks().contains(book));
    }
}