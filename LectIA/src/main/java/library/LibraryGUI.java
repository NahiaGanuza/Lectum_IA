package library;

import javax.swing.*;
import java.awt.*;
import java.util.List;

/**
 * Represents the library GUI for displaying available books.
 */
public class LibraryGUI extends JFrame {
    private Library library;

    /**
     * Constructs the LibraryGUI.
     *
     * @param library The library whose books will be displayed.
     */
    public LibraryGUI(Library library) {
        this.library = library;

        setTitle("Library - Available Books");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Title Label
        JLabel titleLabel = new JLabel("Available Books", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        add(titleLabel, BorderLayout.NORTH);

        // Books Panel
        JPanel booksPanel = new JPanel();
        booksPanel.setLayout(new GridLayout(0, 3, 10, 10)); // 3 columns, dynamic rows
        booksPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // Load books
        List<Book> books = library.getBooks();
        for (Book book : books) {
            JPanel bookPanel = createBookPanel(book);
            booksPanel.add(bookPanel);
        }

        JScrollPane scrollPane = new JScrollPane(booksPanel);
        add(scrollPane, BorderLayout.CENTER);

        setVisible(true);
    }

    /**
     * Creates a panel for a single book.
     *
     * @param book The book to display.
     * @return A JPanel representing the book.
     */
    private JPanel createBookPanel(Book book) {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));

        // Book Image
        JLabel imageLabel = new JLabel();
        imageLabel.setHorizontalAlignment(SwingConstants.CENTER);

        // Load image using ClassLoader
        String imagePath = "images/" + book.getTitle().toLowerCase().replace(" ", "_").replace("'", "") + ".jpg";
        java.net.URL imageUrl = getClass().getClassLoader().getResource(imagePath);
        if (imageUrl != null) {
            ImageIcon bookIcon = new ImageIcon(imageUrl);
            Image scaledImage = bookIcon.getImage().getScaledInstance(100, 150, Image.SCALE_SMOOTH);
            imageLabel.setIcon(new ImageIcon(scaledImage));
        } else {
            imageLabel.setText("Image not found");
        }

        panel.add(imageLabel, BorderLayout.CENTER);

        // Book Info
        JPanel infoPanel = new JPanel();
        infoPanel.setLayout(new GridLayout(2, 1));
        JLabel titleLabel = new JLabel(book.getTitle(), SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 14));
        JLabel authorLabel = new JLabel("By: " + book.getAuthor().getName(), SwingConstants.CENTER);
        authorLabel.setFont(new Font("Arial", Font.ITALIC, 12));
        infoPanel.add(titleLabel);
        infoPanel.add(authorLabel);

        panel.add(infoPanel, BorderLayout.SOUTH);

        return panel;
    }
}