package library;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a user (client) in the library system.
 */
public class User {
    private String name; // The name of the user
    private String username; // The username of the user
    private List<Book> borrowedBooks; // List of books borrowed by the user
    private Library library; // The library the user interacts with

    /**
     * Constructs a User object with the specified name, username, and library.
     *
     * @param name     The name of the user.
     * @param username The username of the user.
     * @param library  The library the user interacts with.
     */
    public User(String name, String username, Library library) {
        this.name = name;
        this.username = username;
        this.library = library;
        this.borrowedBooks = new ArrayList<>();
    }

    /**
     * Gets the name of the user.
     *
     * @return The name of the user.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the user.
     *
     * @param name The new name of the user.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the username of the user.
     *
     * @return The username of the user.
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the username of the user.
     *
     * @param username The new username of the user.
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Books a book from the library.
     *
     * @param book The book to book.
     * @return True if the book was successfully booked, false otherwise.
     */
    public boolean bookBook(Book book) {
        if (library != null && library.getBooks().contains(book) && !borrowedBooks.contains(book)) {
            borrowedBooks.add(book);
            library.removeBook(book); // Remove the book from the library's available books
            return true;
        }
        return false;
    }

    /**
     * Returns a borrowed book to the library.
     *
     * @param book The book to return.
     * @return True if the book was successfully returned, false otherwise.
     */
    public boolean returnBook(Book book) {
        if (borrowedBooks.contains(book)) {
            borrowedBooks.remove(book);
            library.addBook(book); // Add the book back to the library's available books
            return true;
        }
        return false;
    }

    /**
     * Gets the list of books borrowed by the user.
     *
     * @return A list of borrowed books.
     */
    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }
}