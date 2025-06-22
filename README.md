Banking Management System

A comprehensive Java-based banking management system with a graphical user interface built using Java Swing. This application provides essential banking operations including account creation, login functionality, deposits, withdrawals, and automated fee/interest calculations.

🏦 Features
Account Management

Multiple Account Types: Support for Personal and Business accounts (Checking and Savings)

Automatic Account Number Generation: Sequential account numbers starting from 10001
Customer Information Storage: Name, address, email, and phone number tracking

Account Types & Rules
Account TypeMonthly FeeInterest RateSpecial FeaturesPersonal CheckingNoneNoneBasic checking accountPersonal Savings$20 (if balance < $3000)3% monthly5 free withdrawals/month, $5 fee afterBusiness Checking$20NoneBusiness-focused checkingBusiness Savings$202.5% monthlyBusiness savings with interest

Core Banking Operations

✅ Account Creation with customer details
✅ Secure Login using account numbers
✅ Deposits with real-time balance updates
✅ Withdrawals with insufficient funds protection
✅ Automatic Monthly Fee Processing
✅ Interest Calculation and Application
✅ Balance Inquiry

User Interface

🖥️ Intuitive GUI built with Java Swing
🔐 Login System for account access
📊 Real-time Balance Display
⚡ Instant Transaction Processing
🎯 User-friendly Forms for all operations

🚀 Getting Started
Prerequisites

Java Development Kit (JDK) 8 or higher
Java Runtime Environment (JRE)
IDE (recommended: IntelliJ IDEA, Eclipse, or VS Code with Java extensions)

Installation


Clone the repository https://github.com/VictoriaGraceL/Banking-Management-System
bashgit clone 
cd banking-management-system


Compile the project
bashjavac -d bin src/BankingManagementSystem/*.java


Run the application
bashjava -cp bin BankingManagementSystem.Main


Alternative: IDE Setup


Import the project into your preferred Java IDE
Ensure all .java files are in the BankingManagementSystem package
Run the Main.java file

📖 Usage Guide
1. Starting the Application

Launch the application by running Main.java
The main menu will display with options: Create Account, Login, and Exit

2. Creating a New Account

Click "Create Account"
Fill in the required information:

Name
Address
Email
Phone Number
Initial Balance


Click "Create" to generate the account
Note down the generated account number for future logins


3. Logging In

Click "Login" from the main menu
Enter your account number
Click "Login" to access your account

4. Account Operations
Once logged in, you can:


View Current Balance
Make Deposits: Enter amount and click "Deposit"
Make Withdrawals: Enter amount and click "Withdraw"
All transactions are processed instantly with balance updates


5. Administrative Operations
The system automatically handles:


Monthly fee deductions based on account type
Interest calculations and deposits
Withdrawal fee processing for Personal Savings accounts


🏗️ Project Structure
BankingManagementSystem/

 Account.java              # Abstract base class for all accounts
 
 AccountManager.java       # Manages collections of accounts

 AccountMenu.java         # GUI for individual account operations
 
 BankingSystemTest.java   # Test class with sample operations

BusinessChecking.java   # Business checking account implementation

 BusinessSaving.java     # Business savings account implementation
 
 CreateAccount.java      # GUI for account creation

Login.java             # GUI for user authentication
 
 Main.java             # Application entry point and main GUI
 
 PersonalChecking.java # Personal checking account implementation
 
 PersonalSaving.java   # Personal savings account implementation

🔧 Technical Details
Architecture Patterns

Inheritance: All account types extend the abstract Account class
Polymorphism: Different account types implement their own fee and interest rules
Encapsulation: Private fields with public getter/setter methods
GUI Design: Swing components with event-driven programming

Key Classes
Account (Abstract)

Base class defining common account properties
Abstract methods for applyMonthlyFee() and addInterest()
Common operations: deposit, withdraw, balance inquiry

AccountManager

Centralized account management
Account storage using ArrayList
Batch operations for fees and interest

GUI Classes

Main: Primary application window and navigation
CreateAccount: Account registration form
Login: Authentication interface
AccountMenu: Individual account management dashboard

🧪 Testing
The project includes BankingSystemTest.java which demonstrates:

Account creation for all types
Deposit and withdrawal operations
Fee application scenarios
Interest calculation verification
Monthly maintenance operations

To run tests:
bashjava -cp bin BankingManagementSystem.BankingSystemTest
🛠️ Future Enhancements
Planned Features

 Account Type Selection during account creation
 Data Persistence with file I/O or database integration
 Transaction History tracking and display
 Enhanced Security with password protection
 Report Generation for account statements
 Multi-language Support
 Email Notifications for transactions
 Mobile-responsive Web Interface

Technical Improvements

 Input Validation enhancement (email format, phone validation)
 Exception Handling improvements
 Unit Testing framework integration
 Configuration Management for fees and interest rates
 Logging System for audit trails

🤝 Contributing

Fork the repository
Create a feature branch (git checkout -b feature/AmazingFeature)
Commit your changes (git commit -m 'Add some AmazingFeature')
Push to the branch (git push origin feature/AmazingFeature)
Open a Pull Request

Contribution Guidelines

Follow existing code style and naming conventions
Add appropriate comments for new functionality
Update documentation for any new features
Test thoroughly before submitting pull requests

📝 License
This project is licensed under the MIT License - see the LICENSE file for details.
👨‍💻 Author
Viktoriia Lavrenchuk

GitHub: VictoriaGracel
Email: victoriagrace984@gmail.com

🙏 Acknowledgments

Java Swing documentation and tutorials
Object-oriented programming principles
Banking system design patterns and best practices
