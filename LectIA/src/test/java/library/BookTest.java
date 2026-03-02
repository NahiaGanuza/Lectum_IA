package library;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the Book class.
 */
public class BookTest {

    @Test
    public void testBookConstructor() {
        Author author = new Author("Sarah J. Maas", "Author of the Throne of Glass saga");
        Book book = new Book("Throne of Glass", "Fantasy", 2012, author);

        assertEquals("Throne of Glass", book.getTitle());
        assertEquals("Fantasy", book.getGenre());
        assertEquals(2012, book.getPublicationYear());
        assertEquals(author, book.getAuthor());
    }

    @Test
    public void testSetTitle() {
        Book book = new Book("Throne of Glass", "Fantasy", 2012, null);
        book.setTitle("Crown of Midnight");
        assertEquals("Crown of Midnight", book.getTitle());
    }

    @Test
    public void testSetGenre() {
        Book book = new Book("Throne of Glass", "Fantasy", 2012, null);
        book.setGenre("Adventure");
        assertEquals("Adventure", book.getGenre());
    }

    @Test
    public void testSetPublicationYear() {
        Book book = new Book("Throne of Glass", "Fantasy", 2012, null);
        book.setPublicationYear(2013);
        assertEquals(2013, book.getPublicationYear());
    }

    @Test
    public void testSetAuthor() {
        Author author1 = new Author("Sarah J. Maas", "Author of the Throne of Glass saga");
        Author author2 = new Author("J.K. Rowling", "Author of the Harry Potter series");
        Book book = new Book("Throne of Glass", "Fantasy", 2012, author1);
        book.setAuthor(author2);
        assertEquals(author2, book.getAuthor());
    }

    @Test
    public void testToString() {
        Author author = new Author("Sarah J. Maas", "Author of the Throne of Glass saga");
        Book book = new Book("Throne of Glass", "Fantasy", 2012, author);
        String expected = "Book{title='Throne of Glass', genre='Fantasy', publicationYear=2012, author=Sarah J. Maas}";
        assertEquals(expected, book.toString());
    }
}