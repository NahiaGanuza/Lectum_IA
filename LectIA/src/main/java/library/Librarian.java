package library;

/**
 * Represents a librarian in the library system.
 */
public class Librarian {
    private String name; // The name of the librarian
    private String username; // The username of the librarian
    private Library library; // The library the librarian manages

    /**
     * Constructs a Librarian object with the specified name, username, and library.
     *
     * @param name     The name of the librarian.
     * @param username The username of the librarian.
     * @param library  The library the librarian manages.
     */
    public Librarian(String name, String username, Library library) {
        this.name = name;
        this.username = username;
        this.library = library;
    }

    /**
     * Gets the name of the librarian.
     *
     * @return The name of the librarian.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the librarian.
     *
     * @param name The new name of the librarian.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the username of the librarian.
     *
     * @return The username of the librarian.
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the username of the librarian.
     *
     * @param username The new username of the librarian.
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Adds a book to the library.
     *
     * @param book The book to add.
     */
    public void addBookToLibrary(Book book) {
        if (library != null) {
            library.addBook(book);
        }
    }

    /**
     * Removes a book from the library.
     *
     * @param book The book to remove.
     */
    public void removeBookFromLibrary(Book book) {
      if (library != null) {
        library.removeBook(book);
      }
    }
}