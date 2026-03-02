package library;

public class Main {
    public static void main(String[] args) {
        // Create the library instance
        Library library = new Library();

        // Add books from the "Throne of Glass" saga
        library.addBook(new Book("Throne of Glass", "The first book in the saga.", 2012, new Author("Sarah J. Maas", "Author of the Throne of Glass saga")));
        library.addBook(new Book("Crown of Midnight", "The second book in the saga.", 2013, new Author("Sarah J. Maas", "Author of the Throne of Glass saga")));
        library.addBook(new Book("Heir of Fire", "The third book in the saga.", 2014, new Author("Sarah J. Maas", "Author of the Throne of Glass saga")));
        library.addBook(new Book("Queen of Shadows", "The fourth book in the saga.", 2015, new Author("Sarah J. Maas", "Author of the Throne of Glass saga")));
        library.addBook(new Book("Empire of Storms", "The fifth book in the saga.", 2016, new Author("Sarah J. Maas", "Author of the Throne of Glass saga")));
        library.addBook(new Book("Tower of Dawn", "The sixth book in the saga.", 2017, new Author("Sarah J. Maas", "Author of the Throne of Glass saga")));
        library.addBook(new Book("Kingdom of Ash", "The seventh book in the saga.", 2018, new Author("Sarah J. Maas", "Author of the Throne of Glass saga")));

        // Launch the Login GUI
        new LoginGUI(library);
    }
}