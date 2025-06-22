// Declare the package name for the class to group it with other related classes in the banking management system.
package BankingManagementSystem;

// The PersonalChecking class represents a specific type of bank account tailored for individual users.
// It extends (inherits from) the abstract Account class, which means it uses shared properties and methods defined in Account.
public class PersonalChecking extends Account {

    // Constructor: This method runs automatically when a new PersonalChecking account is created.
    // It takes customer details (name, address, email, phone) and an initial balance as inputs.
    public PersonalChecking(String name, String address, String email, String phone, double initialBalance) {
        // Call the constructor of the parent Account class to initialize the common fields.
        super(name, address, email, phone, initialBalance);
    }

    // Override the applyMonthlyFee method from the Account class.
    // PersonalChecking accounts have no monthly fee, so this method is intentionally left empty.
    @Override
    public void applyMonthlyFee() {
        // No fee is charged for Personal Checking accounts.
    }

    // Override the addInterest method from the Account class.
    // PersonalChecking accounts do not earn interest, so this method is intentionally left empty.
    @Override
    public void addInterest() {
        // No interest is added to Personal Checking accounts.
    }
}