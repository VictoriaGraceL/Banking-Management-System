// Declare the package name to group this class with related classes in the banking management system.
package BankingManagementSystem;

// The BusinessChecking class is a specific type of bank account tailored for business users.
// It extends (inherits from) the abstract Account class, meaning it uses all the properties and methods from Account.
// It also defines its own special behavior for business accounts.
public class BusinessChecking extends Account {

    // Constructor: This is used to create a new BusinessChecking account.
    // It takes in customer details (name, address, email, phone) and an initial balance as input.
    // These details are passed to the parent class (Account) using the 'super' keyword.
    public BusinessChecking(String name, String address, String email, String phone, double initialBalance) {
        // Call the constructor of the Account class to initialize the account with the provided details.
        super(name, address, email, phone, initialBalance);
    }

    // Override the applyMonthlyFee method from the Account class.
    // This method deducts a fixed monthly fee of $20 from the account balance.
    @Override
    public void applyMonthlyFee() {
        super.withdraw(20); // Call the withdraw method from the parent class to deduct $20.
    }

    // Override the addInterest method from the Account class.
    // BusinessChecking accounts do not earn interest, so this method is intentionally left empty.
    @Override
    public void addInterest() {
        // No interest is applied to BusinessChecking accounts.
        // This is a unique feature of this account type.
    }
}