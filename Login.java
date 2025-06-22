package BankingManagementSystem;

import javax.swing.*;

public class Login {
    public Login(AccountManager accountManager) {
        JFrame frame = new JFrame("Login");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLayout(null);

        JLabel accountLabel = new JLabel("Enter Account Number:");
        accountLabel.setBounds(50, 30, 200, 25);

        JTextField accountField = new JTextField();
        accountField.setBounds(50, 60, 200, 25);

        JButton loginButton = new JButton("Login");
        loginButton.setBounds(50, 100, 200, 25);

        // Action Listener for Login Button
        loginButton.addActionListener(e -> {
            try {
                int accountNumber = Integer.parseInt(accountField.getText());
                Account account = accountManager.findAccount(accountNumber);

                if (account != null) {
                    JOptionPane.showMessageDialog(frame, "Login Successful! Welcome, " + account.getName());
                    new AccountMenu(account); // Open account-specific menu
                    frame.dispose();
                } else {
                    JOptionPane.showMessageDialog(frame, "Account Not Found!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "Please enter a valid account number!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        frame.add(accountLabel);
        frame.add(accountField);
        frame.add(loginButton);

        frame.setVisible(true);
    }
}