// Declare the package name for this class, grouping it with related classes in the project.
package BankingManagementSystem;

// Importing the Swing library for creating graphical user interface (GUI) elements like windows, buttons, and text fields.
import javax.swing.*;

// Importing the AWT library, specifically for the GridLayout manager, which helps arrange components in a grid pattern.
import java.awt.*;

// The CreateAccount class provides a GUI for creating a new bank account.
// When this class is called, it opens a form where users can enter details like name, address, etc.
public class CreateAccount {
    // Constructor: This method runs automatically when the CreateAccount class is called.
    public CreateAccount(AccountManager accountManager) {
        // Create a new JFrame (a window) with the title "Create New Account."
        JFrame frame = new JFrame("Create New Account");

        // Set the size of the window to 400 pixels wide by 400 pixels high.
        frame.setSize(400, 400);

        // Configure the window so that only the current window (for account creation) is closed when the user clicks "X."
        // The main application remains open.
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Set the layout manager of the frame to GridLayout, which divides the window into rows and columns (6 rows, 2 columns).
        frame.setLayout(new GridLayout(6, 2));

        // Creating labels and input fields for user details (name, address, email, etc.).
        // Each label describes the purpose of the adjacent text field.

        JLabel nameLabel = new JLabel("Name:"); // Label for "Name"
        JTextField nameField = new JTextField(); // Text field for entering the name

        JLabel addressLabel = new JLabel("Address:"); // Label for "Address"
        JTextField addressField = new JTextField(); // Text field for entering the address

        JLabel emailLabel = new JLabel("Email:"); // Label for "Email"
        JTextField emailField = new JTextField(); // Text field for entering the email

        JLabel phoneLabel = new JLabel("Phone:"); // Label for "Phone"
        JTextField phoneField = new JTextField(); // Text field for entering the phone number

        JLabel balanceLabel = new JLabel("Initial Balance:"); // Label for "Initial Balance"
        JTextField balanceField = new JTextField(); // Text field for entering the starting balance

        // Create a button labeled "Create" that the user clicks to submit the entered details.
        JButton createButton = new JButton("Create");

        // Add an action listener to the "Create" button to handle what happens when the button is clicked.
        createButton.addActionListener(e -> {
            // Retrieve the values entered in the text fields.
            String name = nameField.getText(); // Get the name from the text field
            String address = addressField.getText(); // Get the address
            String email = emailField.getText(); // Get the email
            String phone = phoneField.getText(); // Get the phone number
            double balance; // Variable to hold the initial balance

            try {
                // Convert the balance input (String) to a double for calculations.
                balance = Double.parseDouble(balanceField.getText());

                // Create a new account using the PersonalChecking class (this is an example of an account type).
                // The account includes the name, address, email, phone, and initial balance.
                Account newAccount = new PersonalChecking(name, address, email, phone, balance);

                // Add the newly created account to the AccountManager, which keeps track of all accounts.
                accountManager.addAccount(newAccount);

                // Show a message box to the user with the account number of the newly created account.
                JOptionPane.showMessageDialog(frame, "Account Created! Account Number: " + newAccount.getAccountNumber());

                // Close the account creation window after the account is successfully created.
                frame.dispose();
            } catch (NumberFormatException ex) {
                // If the balance input is invalid (not a number), show an error message.
                JOptionPane.showMessageDialog(frame, "Please enter a valid balance!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        // Add all the components (labels and text fields) to the frame in a grid-like order.
        frame.add(nameLabel); // Add "Name" label
        frame.add(nameField); // Add text field for "Name"
        frame.add(addressLabel); // Add "Address" label
        frame.add(addressField); // Add text field for "Address"
        frame.add(emailLabel); // Add "Email" label
        frame.add(emailField); // Add text field for "Email"
        frame.add(phoneLabel); // Add "Phone" label
        frame.add(phoneField); // Add text field for "Phone"
        frame.add(balanceLabel); // Add "Initial Balance" label
        frame.add(balanceField); // Add text field for "Initial Balance"
        frame.add(new JLabel()); // Add a blank placeholder to align the "Create" button
        frame.add(createButton); // Add the "Create" button

        // Make the window visible to display the form to the user.
        frame.setVisible(true);
    }
}