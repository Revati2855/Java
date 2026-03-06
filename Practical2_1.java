class BankAccount {
    protected double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
        System.out.println("Current Balance: " + balance);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance.");
        }
        System.out.println("Current Balance: " + balance);
    }
}

class SavingsAccount extends BankAccount {

    SavingsAccount(double balance) {
        super(balance);
    }

    // Overriding withdraw method
    @Override
    void withdraw(double amount) {
        if ((balance - amount) < 100) {
            System.out.println("Cannot withdraw! Minimum balance of 100 required.");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
        System.out.println("Current Balance: " + balance);
    }
}

public class Practical2_1 {
    public static void main(String[] args) {
        SavingsAccount acc = new SavingsAccount(500);

        acc.deposit(200);
        acc.withdraw(400);
        acc.withdraw(300);  // This should fail
    }
}