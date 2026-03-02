package library;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents an author in the library system.
 */
public class Author {
    private String name; // The name of the author
    private String biography; // A short biography of the author
    private List<String> books; // A list of book titles written by the author

    /**
     * Constructs an Author object with the specified name and biography.
     *
     * @param name      The name of the author.
     * @param biography A short biography of the author.
     */
    public Author(String name, String biography) {
        this.name = name;
        this.biography = biography;
        this.books = new ArrayList<>();
    }

    /**
     * Gets the name of the author.
     *
     * @return The name of the author.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the author.
     *
     * @param name The new name of the author.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the biography of the author.
     *
     * @return The biography of the author.
     */
    public String getBiography() {
        return biography;
    }

    /**
     * Sets the biography of the author.
     *
     * @param biography The new biography of the author.
     */
    public void setBiography(String biography) {
        this.biography = biography;
    }

    /**
     * Gets the list of books written by the author.
     *
     * @return A list of book titles written by the author.
     */
    public List<String> getBooks() {
        return books;
    }

    /**
     * Adds a book title to the author's list of books.
     *
     * @param bookTitle The title of the book to add.
     */
    public void addBook(String bookTitle) {
        books.add(bookTitle);
    }

    /**
     * Removes a book title from the author's list of books.
     *
     * @param bookTitle The title of the book to remove.
     */
    public void removeBook(String bookTitle) {
        books.remove(bookTitle);
    }

    /**
     * Returns a string representation of the author, including their name,
     * biography, and list of books.
     *
     * @return A string representation of the author.
     */
    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", biography='" + biography + '\'' +
                ", books=" + books +
                '}';
    }
}