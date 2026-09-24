class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positive.");
        }
        balance += amount;
        System.out.println("Deposited: " + amount + ", New Balance: " + balance);
    }

    public void withdraw(double amount) throws InsufficientFundsException {//we can take inputs from the jva and the uder alomg th eeay
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be positive.");
        }
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds for withdrawal.");
        }
        balance -= amount;
        System.out.println("Withdrawn: " + amount + ", New Balance: " + balance);
    }
}

public class CompleteBankExceptionHandling {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000.0);
        
        try {
            account.deposit(500.0);
            account.withdraw(2000.0); // This will throw InsufficientFundsException
        } catch (InsufficientFundsException e) {
            System.out.println("Bank Exception: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid Argument: " + e.getMessage());
        } finally {
            System.out.println("Transaction attempt finished. Thank you for using our bank.");
        }
    }
}
