import java.util.Scanner;

// Custom exception class
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

class ATMWithdrawal {
    private double balance;

    // Constructor to set initial balance
    public ATMWithdrawal(double balance) {
        this.balance = balance;
    }

    // Method to withdraw amount
    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            // Throw exception manually
            throw new InsufficientBalanceException("Insufficient Balance");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful.");
            System.out.println("Remaining balance: " + balance);
        }
    }
}

public class ATMWithdrawall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Accept account balance
        System.out.print("Enter account balance: ");
        double balance = sc.nextDouble();

        // Accept withdrawal amount
        System.out.print("Enter withdrawal amount: ");
        double amount = sc.nextDouble();

        // Create ATMWithdrawal object
        ATMWithdrawal atm = new ATMWithdrawal(balance);

        try {
            atm.withdraw(amount);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}