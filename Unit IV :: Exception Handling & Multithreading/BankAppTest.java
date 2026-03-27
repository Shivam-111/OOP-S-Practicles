// Custom Exception
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

// BankApplication class
class BankApplication {
    private double balance;

    // Constructor
    public BankApplication(double balance) {
        this.balance = balance;
    }

    // Method that throws exception
    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Withdrawal failed! Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful. Remaining Balance: ₹" + balance);
        }
    }
}

// Main class renamed
public class BankAppTest {
    public static void main(String[] args) {
        BankApplication account = new BankApplication(5000); // initial balance ₹5000

        try {
            account.withdraw(2000); // valid withdrawal
            account.withdraw(4000); // will throw exception
        } catch (InsufficientBalanceException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        System.out.println("Program continues normally after handling exception.");
    }
}