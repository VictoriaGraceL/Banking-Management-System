// Declare the package name for this class to group related files together.
// Think of a package like a folder that organizes similar files in one place.
package BankingManagementSystem;

// The 'Account' class represents the basic structure of an account in the banking system.
// This class is marked as 'abstract', which means you cannot create an object directly from this class.
// Instead, other classes (like 'SavingsAccount' or 'CheckingAccount') will extend this one and fill in the missing details.
public abstract class Account {
    // 'name' will store the name of the person who owns this account.
    private String name;

    // 'accountNumber' will store a unique number that identifies this account.
    private int accountNumber;

    // 'address' stores the address of the account holder, like where they live.
    private String address;

    // 'email' stores the account holder's email address so the bank can communicate with them.
    private String email;

    // 'phone' stores the phone number of the account holder for contact purposes.
    private String phone;

    // 'balance' keeps track of how much money the account has right now.
    private double balance;

    // 'lastAccountNumber' is a static variable shared by all accounts.
    // It's used to make sure each new account gets a unique number by incrementing this value.
    private static int lastAccountNumber = 10000;

    // Constructor: This is like a blueprint for building an account.
    // Whenever you make a new account, you'll provide the name, address, email, phone, and initial balance.
    // The constructor will also automatically assign a unique account number by adding 1 to 'lastAccountNumber'.
    public Account(String name, String address, String email, String phone, double initialBalance) {
        this.name = name; // Set the account holder's name.
        this.address = address; // Set the account holder's address.
        this.email = email; // Set the account holder's email address.
        this.phone = phone; // Set the account holder's phone number.
        this.balance = initialBalance; // Set the starting balance for this account.
        this.accountNumber = ++lastAccountNumber; // Assign a unique account number by incrementing 'lastAccountNumber'.
    }

    // Getters are small methods that let you see the values of private fields like 'name' or 'balance'.
    // For example, if you want to know the account holder's name, you'd call getName().

    // This method returns the name of the account holder.
    public String getName() {
        return name;
    }

    // This method returns the unique account number assigned to this account.
    public int getAccountNumber() {
        return accountNumber;
    }

    // This method returns the current balance in the account.
    public double getBalance() {
        return balance;
    }

    // Operations: These are methods that let you do things with the account, like adding or withdrawing money.

    // This method lets you deposit money into the account.
    // It checks if the amount is positive (you can't deposit negative money).
    // If it is, it adds that amount to the current balance.
    public void deposit(double amount) {
        if (amount > 0) { // Make sure the deposit amount is valid (greater than 0).
            balance += amount; // Add the deposit amount to the balance.
        }
    }

    // This method lets you withdraw money from the account.
    // It checks two things:
    // 1. The amount to withdraw must be positive.
    // 2. The amount must not exceed the current balance (you can't withdraw more than you have).
    // If both conditions are true, the amount is subtracted from the balance.
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) { // Check if the withdrawal is valid.
            balance -= amount; // Subtract the withdrawal amount from the balance.
        }
    }

    // Abstract methods: These methods don't have a body here. Why?
    // Because this is an abstract class, and the subclasses (like 'SavingsAccount') will define these methods.
    // Think of it as a promise that every subclass must fill in the details for these methods.

    // This is an abstract method for applying a monthly fee to the account.
    // Different types of accounts may have different monthly fees, so we leave this blank for now.
    public abstract void applyMonthlyFee();

    // This is an abstract method for adding interest to the account.
    // For example, a savings account might earn interest over time.
    // The specific calculation depends on the type of account, so we don't define it here.
    public abstract void addInterest();
}