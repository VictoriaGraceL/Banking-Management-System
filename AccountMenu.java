// Declare the package name for this class to group it with related files in the banking system project.
package BankingManagementSystem;

// Importing the Swing library to create GUI elements like windows, buttons, labels, and text fields.
import javax.swing.*;

// Importing AWT for the GridLayout manager, which helps organize components in a grid-like structure (rows and columns).
import java.awt.*;

// The AccountMenu class creates a graphical interface for managing an individual account.
// Users can view the current balance and perform actions like deposit or withdraw money.
public class AccountMenu {
    // Constructor: This method is automatically executed when an AccountMenu object is created.
    // It builds the interface for managing the account passed as an argument.
    public AccountMenu(Account account) {
        // Create a new JFrame (a window) with the title "Account Menu."
        JFrame frame = new JFrame("Account Menu");

        // Set the size of the window to 400 pixels wide by 300 pixels high.
        frame.setSize(400, 300);

        // Configure the window to close only the current "Account Menu" window (not the entire application) when "X" is clicked.
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Set the layout manager to GridLayout, dividing the window into 4 rows and 2 columns.
        frame.setLayout(new GridLayout(4, 2));

        // Create a label to display the text "Current Balance:" to the user.
        JLabel balanceLabel = new JLabel("Current Balance:");

        // Create another label to display the current balance of the account, formatted as a dollar amount.
        JLabel balanceValueLabel = new JLabel("$" + account.getBalance());

        // Create a button labeled "Deposit" for users to add money to their account.
        JButton depositButton = new JButton("Deposit");

        // Create a text field where users can enter the amount they want to deposit.
        JTextField depositField = new JTextField();

        // Create a button labeled "Withdraw" for users to remove money from their account.
        JButton withdrawButton = new JButton("Withdraw");

        // Create a text field where users can enter the amount they want to withdraw.
        JTextField withdrawField = new JTextField();

        // Add an action listener to the "Deposit" button to handle what happens when the button is clicked.
        depositButton.addActionListener(e -> {
            try {
                // Get the deposit amount entered by the user and convert it from a String to a double (number with decimals).
                double depositAmount = Double.parseDouble(depositField.getText());

                // Call the deposit method on the account to increase its balance.
                account.deposit(depositAmount);

                // Update the balance label to show the new balance after the deposit.
                balanceValueLabel.setText("$" + account.getBalance());

                // Show a message box confirming the deposit was successful.
                JOptionPane.showMessageDialog(frame, "Deposit Successful!");
            } catch (NumberFormatException ex) {
                // If the user enters an invalid amount (not a number), show an error message.
                JOptionPane.showMessageDialog(frame, "Enter a valid amount!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        // Add an action listener to the "Withdraw" button to handle what happens when the button is clicked.
        withdrawButton.addActionListener(e -> {
            try {
                // Get the withdrawal amount entered by the user and convert it from a String to a double.
                double withdrawAmount = Double.parseDouble(withdrawField.getText());

                // Call the withdraw method on the account to decrease its balance.
                account.withdraw(withdrawAmount);

                // Update the balance label to show the new balance after the withdrawal.
                balanceValueLabel.setText("$" + account.getBalance());

                // Show a message box confirming the withdrawal was successful.
                JOptionPane.showMessageDialog(frame, "Withdrawal Successful!");
            } catch (NumberFormatException ex) {
                // If the user enters an invalid amount (not a number), show an error message.
                JOptionPane.showMessageDialog(frame, "Enter a valid amount!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        // Add the "Current Balance" label to the window.
        frame.add(balanceLabel);

        // Add the label showing the current balance to the window.
        frame.add(balanceValueLabel);

        // Add the "Deposit" button to the window.
        frame.add(depositButton);

        // Add the text field for entering deposit amounts to the window.
        frame.add(depositField);

        // Add the "Withdraw" button to the window.
        frame.add(withdrawButton);

        // Add the text field for entering withdrawal amounts to the window.
        frame.add(withdrawField);

        // Make the window visible so users can interact with it.
        frame.setVisible(true);
    }
}