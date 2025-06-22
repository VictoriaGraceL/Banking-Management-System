package BankingManagementSystem;
public class BankingSystemTest {
    public static void main(String[] args) {
        // Instantiate AccountManager
        AccountManager manager = new AccountManager();

        // Test 1: Create accounts
        Account bChecking = new BusinessChecking("Alice", "123 Main St", "alice@example.com", "555-3434", 100000);
        Account bSaving = new BusinessSaving("Bob", "456 Elm St", "bob@example.com", "555-5678", 500000);
        Account pChecking = new PersonalChecking("Denis", "789 Oak St", "denis@example.com", "555-0000", 365000);
        Account pSaving = new PersonalSaving("Diana", "321 Pine St", "diana@example.com", "555-8685", 879000000);

        manager.addAccount(bChecking);
        manager.addAccount(bSaving);
        manager.addAccount(pChecking);
        manager.addAccount(pSaving);

        // Test 2: Deposit
        bChecking.deposit(2000);
        System.out.println("Business Checking Balance: " + bChecking.getBalance()); // Expect 12000

        // Test 3: Withdrawals
        bSaving.withdraw(100);
        System.out.println("Business Saving Balance (after $10 fee): " + bSaving.getBalance()); // Expect 4890

        pSaving.withdraw(50);
        pSaving.withdraw(50);
        pSaving.withdraw(50);
        pSaving.withdraw(50);
        pSaving.withdraw(50);
        System.out.println("Personal Saving Balance (after 5 free withdrawals): " + pSaving.getBalance()); // Expect 3250

        pSaving.withdraw(50);
        System.out.println("Personal Saving Balance (after $5 fee): " + pSaving.getBalance()); // Expect 3195

        // Test 4: Monthly Fee
        manager.applyMonthlyFees();
        System.out.println("Personal Saving Balance (after waived fee): " + pSaving.getBalance()); // Expect no change due to balance > $3000

        // Test 5: Interest Addition
        manager.addInterest();
        System.out.println("Personal Saving Balance (after interest): " + pSaving.getBalance()); // Expect 3% interest added
    }
}