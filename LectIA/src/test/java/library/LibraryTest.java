package library;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the Library class.
 */
public class LibraryTest {

    @Test
    public void testAddAuthor() {
        Library library = new Library();
        Author author = new Author("Sarah J. Maas", "Author of the Throne of Glass saga");

        library.addAuthor(author);
        assertTrue(library.getAuthors().contains(author));
    }

    @Test
    public void testRemoveAuthor() {
        Library library = new Library();
        Author author = new Author("Sarah J. Maas", "Author of the Throne of Glass saga");

        library.addAuthor(author);
        library.removeAuthor(author);
        assertFalse(library.getAuthors().contains(author));
    }

    @Test
    public void testGetAuthors() {
        Library library = new Library();
        Author author1 = new Author("Sarah J. Maas", "Author of the Throne of Glass saga");
        Author author2 = new Author("J.K. Rowling", "Author of the Harry Potter series");

        library.addAuthor(author1);
        library.addAuthor(author2);

        List<Author> authors = library.getAuthors();
        assertEquals(2, authors.size());
        assertTrue(authors.contains(author1));
        assertTrue(authors.contains(author2));
    }

    @Test
    public void testFindBooksByAuthor() {
        Library library = new Library();
        Author author = new Author("Sarah J. Maas", "Author of the Throne of Glass saga");
        Book book = new Book("Throne of Glass", "Fantasy", 2012, author);

        library.addBook(book);
        List<Book> booksByAuthor = library.findBooksByAuthor(author);

        assertEquals(1, booksByAuthor.size());
        assertTrue(booksByAuthor.contains(book));
    }

    @Test
    public void testFindBooksByAuthorNotFound() {
        Library library = new Library();
        Author author = new Author("Nonexistent Author", "Unknown");

        List<Book> booksByAuthor = library.findBooksByAuthor(author);
        assertTrue(booksByAuthor.isEmpty());
    }
}