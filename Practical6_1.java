// User-defined Exception for Low Balance
class LowBalanceException extends Exception {
    public LowBalanceException(String message) {
        super(message);
    }
}

// User-defined Exception for Negative Number
class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}

// BankAccount Class
class BankAccount {
    private double balance;

    // Constructor
    public BankAccount(double balance) {
        this.balance = balance;
    }

    // Balance Enquiry
    public void balanceEnquiry() {
        System.out.println("Current Balance: " + balance);
    }

    // Deposit Method
    public void deposit(double amount) throws NegativeNumberException {
        if (amount < 0) {
            throw new NegativeNumberException("Deposit amount cannot be negative!");
        }
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    // Withdraw Method
    public void withdraw(double amount) throws LowBalanceException, NegativeNumberException {
        if (amount < 0) {
            throw new NegativeNumberException("Withdrawal amount cannot be negative!");
        }
        if (amount > balance) {
            throw new LowBalanceException("Insufficient balance!");
        }
        balance -= amount;
        System.out.println("Withdrawn: " + amount);
    }
}

// Main Class
public class Practical6_1 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000); // Initial balance

        // Balance Enquiry
        account.balanceEnquiry();

        // Deposit
        try {
            account.deposit(500);
        } catch (NegativeNumberException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Withdraw (valid)
        try {
            account.withdraw(300);
        } catch (LowBalanceException | NegativeNumberException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Withdraw (exceed balance)
        try {
            account.withdraw(2000);
        } catch (LowBalanceException | NegativeNumberException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Deposit (negative amount)
        try {
            account.deposit(-100);
        } catch (NegativeNumberException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Final Balance
        account.balanceEnquiry();
    }
}
