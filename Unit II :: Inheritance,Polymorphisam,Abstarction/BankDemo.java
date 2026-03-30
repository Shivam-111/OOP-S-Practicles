// 11.	A class bank has a fixed interest rate that should not be changed once it is defined. 
// Question: 
// Create a class Bank with a final variable interestRate. 
// Create a method calculateInterest(double amount) that calculates the interest using the fixed rate. 
// Write a program to calculate interest for different customers. 


class Bank {
    // Final variable for fixed interest rate
    private final double interestRate;

    // Constructor to initialize interest rate
    public Bank(double rate) {
        this.interestRate = rate;
    }

    // Method to calculate interest
    public double calculateInterest(double amount) {
        return amount * interestRate / 100;
    }
}

public class BankDemo {
    public static void main(String[] args) {
        // Create a Bank object with fixed interest rate
        Bank bank = new Bank(5.0); // 5% interest rate

        // Different customers with different amounts
        double customer1 = 10000;
        double customer2 = 25000;
        double customer3 = 50000;

        System.out.println("Customer 1 Interest: " + bank.calculateInterest(customer1));
        System.out.println("Customer 2 Interest: " + bank.calculateInterest(customer2));
        System.out.println("Customer 3 Interest: " + bank.calculateInterest(customer3));
    }
}