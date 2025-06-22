// Declare the package name for this class to group it with other related files in the banking management system project.
package BankingManagementSystem;

// The BusinessSaving class represents a specialized type of savings account tailored for businesses.
// It extends (inherits from) the abstract Account class and provides specific behaviors for business savings accounts.
public class BusinessSaving extends Account {

    // Constructor: This method is automatically executed when a new BusinessSaving account is created.
    // It takes in the customer's name, address, email, phone, and initial balance as inputs to set up the account.
    public BusinessSaving(String name, String address, String email, String phone, double initialBalance) {
        // Call the constructor of the parent class (Account) to initialize common fields.
        // These fields include the name, address, email, phone, and the initial balance.
        super(name, address, email, phone, initialBalance);
    }

    // Override the applyMonthlyFee method from the Account class.
    // This method deducts a fixed monthly fee of $20 from the account balance.
    @Override
    public void applyMonthlyFee() {
        // Use the withdraw method from the parent Account class to reduce the balance by $20.
        super.withdraw(20); // Deduct $20 as a monthly account maintenance fee.
    }

    // Override the addInterest method from the Account class.
    // BusinessSaving accounts earn 2.5% monthly interest on the current balance.
    @Override
    public void addInterest() {
        // Calculate 2.5% interest on the current balance.
        // Use the deposit method from the parent Account class to add the interest to the balance.
        super.deposit(super.getBalance() * 0.025); // Deposit the calculated interest back into the account.
    }
}