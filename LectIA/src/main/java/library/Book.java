package library;

/**
 * Represents a book in the library system.
 */
public class Book {
    private String title; // The title of the book
    private String genre; // The genre of the book
    private int publicationYear; // The year the book was published
    private Author author; // The author of the book

    /**
     * Constructs a Book object with the specified title, genre, publication year, and author.
     *
     * @param title           The title of the book.
     * @param genre           The genre of the book.
     * @param publicationYear The year the book was published.
     * @param author          The author of the book.
     */
    public Book(String title, String genre, int publicationYear, Author author) {
        this.title = title;
        this.genre = genre;
        this.publicationYear = publicationYear;
        this.author = author;
        // Add this book to the author's list of books
        if (author != null) {
            author.addBook(title);
        }
    }

    /**
     * Gets the title of the book.
     *
     * @return The title of the book.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the title of the book.
     *
     * @param title The new title of the book.
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Gets the genre of the book.
     *
     * @return The genre of the book.
     */
    public String getGenre() {
        return genre;
    }

    /**
     * Sets the genre of the book.
     *
     * @param genre The new genre of the book.
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }

    /**
     * Gets the publication year of the book.
     *
     * @return The year the book was published.
     */
    public int getPublicationYear() {
        return publicationYear;
    }

    /**
     * Sets the publication year of the book.
     *
     * @param publicationYear The new publication year of the book.
     */
    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    /**
     * Gets the author of the book.
     *
     * @return The author of the book.
     */
    public Author getAuthor() {
        return author;
    }

    /**
     * Sets the author of the book. Updates the author's list of books accordingly.
     *
     * @param author The new author of the book.
     */
    public void setAuthor(Author author) {
        // Remove this book from the previous author's list of books
        if (this.author != null) {
            this.author.removeBook(this.title);
        }
        this.author = author;
        // Add this book to the new author's list of books
        if (author != null) {
            author.addBook(this.title);
        }
    }

    /**
     * Returns a string representation of the book, including its title, genre,
     * publication year, and author.
     *
     * @return A string representation of the book.
     */
    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", publicationYear=" + publicationYear +
                ", author=" + (author != null ? author.getName() : "Unknown") +
                '}';
    }
}