// Declare the package name to group this class with other related files in the banking management system project.
package BankingManagementSystem;

// Import the ArrayList class from the Java standard library.
// ArrayList is used to store and manage a collection of Account objects.
import java.util.ArrayList;

// The AccountManager class acts as a central system to manage all the accounts.
// It provides methods to add accounts, search for accounts, and perform operations like applying fees or adding interest.
public class AccountManager {

    // Create an ArrayList to store all Account objects.
    // Think of this as a virtual ledger where each account is recorded.
    private ArrayList<Account> accounts = new ArrayList<>();

    // Method to add a new account to the list.
    // When a new account is created, it will be passed to this method and added to the accounts list.
    public void addAccount(Account account) {
        // Add the given account to the ArrayList.
        accounts.add(account);
    }

    // Method to find an account by its unique account number.
    // This is useful for looking up a specific account in the system.
    public Account findAccount(int accountNumber) {
        // Loop through each account in the ArrayList.
        for (Account account : accounts) {
            // Check if the current account's number matches the given account number.
            if (account.getAccountNumber() == accountNumber) {
                // If a match is found, return the account object.
                return account;
            }
        }
        // If no matching account is found, return null.
        return null;
    }

    // Method to apply monthly fees to all accounts in the system.
    // This method calls the applyMonthlyFee method for each account individually.
    public void applyMonthlyFees() {
        // Loop through each account in the ArrayList.
        for (Account account : accounts) {
            // Call the applyMonthlyFee method on the account.
            // This deducts fees based on the rules defined in the specific account type (e.g., BusinessSaving, PersonalSaving).
            account.applyMonthlyFee();
        }
    }

    // Method to add interest to all accounts in the system.
    // This method calls the addInterest method for each account individually.
    public void addInterest() {
        // Loop through each account in the ArrayList.
        for (Account account : accounts) {
            // Call the addInterest method on the account.
            // This calculates and adds interest based on the rules defined in the specific account type (e.g., BusinessSaving, PersonalSaving).
            account.addInterest();
        }
    }
}