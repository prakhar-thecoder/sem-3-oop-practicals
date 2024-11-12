class NegativeAmount extends Exception {
    public NegativeAmount(String message) {
        super(message);
    }
}

class InsufficientFunds extends Exception {
    public InsufficientFunds(String message) {
        super(message);
    }
}

class LowBalance extends Exception {
    public LowBalance(String message) {
        super(message);
    }
}

class BankAccount {
    private int accountNumber;
    private String customerName;
    private String accountType;
    private float balance;

    public BankAccount(int accountNumber, String customerName, String accountType, float openingBalance) throws LowBalance {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.accountType = accountType;
        
        if (accountType.equals("Savings") && openingBalance < 1000) {
            throw new LowBalance("Minimum opening balance for Savings is Rs. 1000");
        } else if (accountType.equals("Current") && openingBalance < 5000) {
            throw new LowBalance("Minimum opening balance for Current is Rs. 5000");
        }
        this.balance = openingBalance;
    }

    public void deposit(float amt) throws NegativeAmount {
        if (amt < 0) {
            throw new NegativeAmount("Cannot deposit a negative amount.");
        }
        balance += amt;
    }

    public void withdraw(float amt) throws NegativeAmount, InsufficientFunds {
        if (amt < 0) {
            throw new NegativeAmount("Cannot withdraw a negative amount.");
        }
        if (accountType.equals("Savings") && (balance - amt < 1000)) {
            throw new InsufficientFunds("Insufficient funds. Minimum balance for Savings is Rs. 1000");
        }
        if (accountType.equals("Current") && (balance - amt < 5000)) {
            throw new InsufficientFunds("Insufficient funds. Minimum balance for Current is Rs. 5000");
        }
        balance -= amt;
    }

    public float getBalance() {
        return balance;
    }
}

public class P9B {
    public static void main(String[] args) {
        try {
            BankAccount account1 = new BankAccount(101, "Alice", "Savings", 1500);
            BankAccount account2 = new BankAccount(102, "Bob", "Current", 6000);

            account1.deposit(500);
            System.out.println("Alice's Balance after deposit: " + account1.getBalance());

            account1.withdraw(300);
            System.out.println("Alice's Balance after withdrawal: " + account1.getBalance());

            account2.deposit(2000);
            System.out.println("Bob's Balance after deposit: " + account2.getBalance());

            account2.withdraw(1000);
            System.out.println("Bob's Balance after withdrawal: " + account2.getBalance());
        } catch (NegativeAmount | InsufficientFunds | LowBalance e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
