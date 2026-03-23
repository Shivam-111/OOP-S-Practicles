// Define the interface
interface Bank {
    double getInterestRate();
}

// Implement SBI class
class SBI implements Bank {
    public double getInterestRate() {
        return 6.5; // SBI interest rate
    }
}

// Implement HDFC class
class HDFC implements Bank {
    public double getInterestRate() {
        return 7.2; // HDFC interest rate
    }
}

// Implement ICICI class
class ICICI implements Bank {
    public double getInterestRate() {
        return 6.8; // ICICI interest rate
    }
}

// Main class to test
public class BankInterest {
    public static void main(String[] args) {
        Bank sbi = new SBI();
        Bank hdfc = new HDFC();
        Bank icici = new ICICI();

        System.out.println("SBI Interest Rate: " + sbi.getInterestRate() + "%");
        System.out.println("HDFC Interest Rate: " + hdfc.getInterestRate() + "%");
        System.out.println("ICICI Interest Rate: " + icici.getInterestRate() + "%");
    }
}