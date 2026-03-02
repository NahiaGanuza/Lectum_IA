package library;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginGUI extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private Library library;

    public LoginGUI(Library library) {
        this.library = library;

        setTitle("Library Login");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Logo Panel
        JPanel logoPanel = new JPanel(new FlowLayout(FlowLayout.CENTER)); // Center the logo
        JLabel logoLabel = new JLabel();

        // Load and scale the logo
        String logoPath = "images/logo.png";
        java.net.URL logoUrl = getClass().getClassLoader().getResource(logoPath);
        if (logoUrl != null) {
            ImageIcon logoIcon = new ImageIcon(logoUrl);
            Image scaledLogo = logoIcon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH); // Adjust size
            logoLabel.setIcon(new ImageIcon(scaledLogo));
        } else {
            logoLabel.setText("Logo not found");
        }

        logoPanel.add(logoLabel);
        add(logoPanel, BorderLayout.NORTH); // Place the logo at the top

        // Input Panel
        JPanel inputPanel = new JPanel(new GridLayout(3, 2, 10, 10));
        inputPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JLabel usernameLabel = new JLabel("Username:");
        usernameField = new JTextField();
        JLabel passwordLabel = new JLabel("Password:");
        passwordField = new JPasswordField();

        inputPanel.add(usernameLabel);
        inputPanel.add(usernameField);
        inputPanel.add(passwordLabel);
        inputPanel.add(passwordField);

        add(inputPanel, BorderLayout.CENTER);

        // Button Panel
        JPanel buttonPanel = new JPanel();
        JButton loginButton = new JButton("Login");
        loginButton.addActionListener(new LoginButtonListener());
        buttonPanel.add(loginButton);

        add(buttonPanel, BorderLayout.SOUTH);

        setVisible(true);
    }

    private class LoginButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String username = usernameField.getText();
            String password = new String(passwordField.getPassword());

            if (!username.isEmpty() && !password.isEmpty()) {
                dispose();
                new LibraryGUI(library);
            } else {
                JOptionPane.showMessageDialog(LoginGUI.this, "Please enter both username and password.", "Login Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}