// Declare the package name for the class, grouping related classes together.
// Think of a package as a folder to keep related files organized in one place.
package BankingManagementSystem;

// Importing the Swing component library, which lets us create buttons, labels, and windows (GUI elements).
import javax.swing.*;

// Importing the ActionEvent class, which helps us detect when a user interacts with something (like clicking a button).
import java.awt.event.ActionEvent;

// Importing the ActionListener interface, which allows us to define what happens when buttons are clicked.
import java.awt.event.ActionListener;

// The Main class serves as the entry point for the entire application.
// This is where the program starts running when you click "Run."
public class Main {
    // Declaring a private field for the AccountManager object.
    // The AccountManager will be responsible for keeping track of all the accounts in the system.
    private AccountManager accountManager;

    // Constructor for the Main class.
    // This method is automatically called when we create an object of the Main class.
    public Main() {
        // Initializing the AccountManager to handle all account-related operations in the system.
        accountManager = new AccountManager();

        // Creating a new JFrame (a window on your screen) with the title "Banking Management System."
        JFrame frame = new JFrame("Banking Management System");

        // Setting the size of the application window. It will be 400 pixels wide and 300 pixels high.
        frame.setSize(400, 300);

        // Configuring the window to close the application entirely when the user clicks the close button.
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Creating a JPanel (a section within the window) to hold and organize all the elements like buttons and labels.
        JPanel panel = new JPanel();

        // Setting the layout of the panel to 'null' so that we can position items (like buttons and labels) precisely where we want them.
        panel.setLayout(null);
        frame.add(panel); // Adding the panel to the JFrame so it becomes part of the window.

        // Adding all the components (buttons and labels) to the panel using a helper method.
        placeComponents(panel);

        // Making the JFrame visible to display the window and all its components on the screen.
        frame.setVisible(true);
    }

    // A helper method to add and arrange all the components (like buttons and labels) on the panel.
    private void placeComponents(JPanel panel) {
        // Creating a welcome label to display "Banking Management System" at the top of the window.
        JLabel welcomeLabel = new JLabel("Banking Management System");
        welcomeLabel.setBounds(100, 20, 200, 25); // Setting the position (x, y) and size (width, height) of the label.
        panel.add(welcomeLabel); // Adding the label to the panel so it appears on the window.

        // Creating a button labeled "Create Account" to allow users to create a new account.
        JButton createAccountButton = new JButton("Create Account");
        createAccountButton.setBounds(100, 60, 200, 25); // Setting the position and size of the button.
        // Adding an action listener to handle what happens when the button is clicked.
        createAccountButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Open the CreateAccount window and pass the AccountManager object to manage accounts.
                new CreateAccount(accountManager);
            }
        });
        panel.add(createAccountButton); // Adding the button to the panel so it appears on the window.

        // Creating a button labeled "Login" to allow existing users to log into their accounts.
        JButton loginButton = new JButton("Login");
        loginButton.setBounds(100, 100, 200, 25); // Setting the position and size of the button.
        // Adding an action listener to handle what happens when the button is clicked.
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Open the Login window and pass the AccountManager object to validate login details.
                new Login(accountManager);
            }
        });
        panel.add(loginButton); // Adding the button to the panel so it appears on the window.

        // Creating a button labeled "Exit" to allow users to close the application.
        JButton exitButton = new JButton("Exit");
        exitButton.setBounds(100, 140, 200, 25); // Setting the position and size of the button.
        // Adding an action listener to handle what happens when the button is clicked.
        // When clicked, the application will exit (close entirely).
        exitButton.addActionListener(e -> System.exit(0));
        panel.add(exitButton); // Adding the button to the panel so it appears on the window.
    }

    // The main method is the starting point of the application.
    // When you run the program, this method is executed first.
    public static void main(String[] args) {
        new Main(); // Creating an instance of the Main class to launch the application.
    }
}