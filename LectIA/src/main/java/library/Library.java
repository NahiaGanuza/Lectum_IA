package library;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a library that manages authors and books.
 */
public class Library {
    private List<Author> authors; // List of authors in the library
    private List<Book> books; // List of books in the library

    /**
     * Constructs a Library object.
     */
    public Library() {
        this.authors = new ArrayList<>();
        this.books = new ArrayList<>();
    }

    /**
     * Adds an author to the library.
     *
     * @param author The author to add.
     */
    public void addAuthor(Author author) {
        if (author != null && !authors.contains(author)) {
            authors.add(author);
        }
    }

    /**
     * Removes an author from the library.
     *
     * @param author The author to remove.
     */
    public void removeAuthor(Author author) {
        if (author != null) {
            authors.remove(author);
        }
    }

    /**
     * Retrieves the list of authors in the library.
     *
     * @return A list of authors.
     */
    public List<Author> getAuthors() {
        return authors;
    }

    /**
     * Adds a book to the library.
     *
     * @param book The book to add.
     */
    public void addBook(Book book) {
        if (book != null && !books.contains(book)) {
            books.add(book);
        }
    }

    /**
     * Removes a book from the library.
     *
     * @param book The book to remove.
     */
    public void removeBook(Book book) {
        if (book != null) {
            books.remove(book);
        }
    }

    /**
     * Retrieves the list of books in the library.
     *
     * @return A list of books.
     */
    public List<Book> getBooks() {
        return books;
    }

    /**
     * Finds books by a specific author.
     *
     * @param author The author whose books to find.
     * @return A list of books written by the specified author.
     */
    public List<Book> findBooksByAuthor(Author author) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor() != null && book.getAuthor().equals(author)) {
                result.add(book);
            }
        }
        return result;
    }

    /**
     * Finds books by title.
     *
     * @param title The title of the book to find.
     * @return A list of books with the specified title.
     */
    public List<Book> findBooksByTitle(String title) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                result.add(book);
            }
        }
        return result;
    }
}