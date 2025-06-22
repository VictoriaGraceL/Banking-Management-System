// Declare the package name to group this class with other related files in the banking management system.
package BankingManagementSystem;

// The PersonalSaving class represents a specific type of savings account for individual users.
// It extends (inherits from) the abstract Account class and provides custom behaviors for personal savings accounts.
public class PersonalSaving extends Account {

    // Define a field to track the number of free withdrawals allowed each month.
    // Every month, account holders can withdraw money up to 5 times without incurring extra fees.
    private int freeWithdrawals = 5;

    // Constructor: This method runs automatically when a new PersonalSaving account is created.
    // It takes customer details (name, address, email, phone) and an initial balance as inputs.
    public PersonalSaving(String name, String address, String email, String phone, double initialBalance) {
        // Call the constructor of the parent class (Account) to initialize common fields like name, balance, etc.
        super(name, address, email, phone, initialBalance);
    }

    // Override the withdraw method from the Account class to customize withdrawal rules for PersonalSaving accounts.
    @Override
    public void withdraw(double amount) {
        // Check if the user has remaining free withdrawals for the month.
        if (freeWithdrawals > 0) {
            // Deduct one free withdrawal and process the withdrawal without an extra fee.
            freeWithdrawals--; // Decrease the count of free withdrawals by 1.
            super.withdraw(amount); // Call the withdraw method in the parent class to reduce the balance.
        } else {
            // If no free withdrawals are left, deduct an additional $5 fee for each withdrawal.
            super.withdraw(amount + 5); // Withdraw the amount plus a $5 fee.
        }
    }

    // Override the applyMonthlyFee method to implement monthly fee rules for PersonalSaving accounts.
    @Override
    public void applyMonthlyFee() {
        // If the account balance is below $3000 at the end of the month, deduct a $20 maintenance fee.
        if (super.getBalance() < 3000) {
            super.withdraw(20); // Deduct $20 from the balance.
        }
        // Reset the number of free withdrawals back to 5 for the new month.
        freeWithdrawals = 5;
    }

    // Override the addInterest method to apply a 3% monthly interest rate for PersonalSaving accounts.
    @Override
    public void addInterest() {
        // Calculate 3% interest based on the current balance and deposit it back into the account.
        super.deposit(super.getBalance() * 0.03); // Add 3% interest to the account balance.
    }
}