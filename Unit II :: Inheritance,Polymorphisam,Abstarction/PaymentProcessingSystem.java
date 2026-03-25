// Abstract class
abstract class Payment {
    abstract void pay(double amount);
}

// Subclass 1
class CreditCardPayment extends Payment {
    void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card.");
    }
}

// Subclass 2
class UPIPayment extends Payment {
    void pay(double amount) {
        System.out.println("Paid " + amount + " using UPI.");
    }
}

// Subclass 3
class NetBankingPayment extends Payment {
    void pay(double amount) {
        System.out.println("Paid " + amount + " using Net Banking.");
    }
}

// Main class
class PaymentProcessingSystem {
    public static void main(String[] args) {

        Payment p1 = new CreditCardPayment();
        p1.pay(1000);

        Payment p2 = new UPIPayment();
        p2.pay(500);

        Payment p3 = new NetBankingPayment();
        p3.pay(2000);
    }
}