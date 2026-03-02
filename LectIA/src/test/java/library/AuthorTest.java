package library;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the Author class.
 */
public class AuthorTest {

    @Test
    public void testAuthorConstructor() {
        Author author = new Author("Sarah J. Maas", "Author of the Throne of Glass saga");
        assertEquals("Sarah J. Maas", author.getName());
        assertEquals("Author of the Throne of Glass saga", author.getBiography());
    }

    @Test
    public void testSetName() {
        Author author = new Author("Sarah J. Maas", "Author of the Throne of Glass saga");
        author.setName("J.K. Rowling");
        assertEquals("J.K. Rowling", author.getName());
    }

    @Test
    public void testSetBiography() {
        Author author = new Author("Sarah J. Maas", "Author of the Throne of Glass saga");
        author.setBiography("Author of the Harry Potter series");
        assertEquals("Author of the Harry Potter series", author.getBiography());
    }

    @Test
    public void testToString() {
        Author author = new Author("Sarah J. Maas", "Author of the Throne of Glass saga");
        String expected = "Author{name='Sarah J. Maas', biography='Author of the Throne of Glass saga', books=[]}";
        assertEquals(expected, author.toString());
    }
}