import java.util.Scanner;

class Resort {
    // Data members
    private int RNo;          // Room Number
    private String Name;      // Customer Name
    private double Charges;   // Per day charges
    private int Days;         // Number of days of stay

    // Compute total amount
    private double Compute() {
        double Amount = Days * Charges;
        if (Amount > 11000) {
            Amount = 1.02 * Amount; // Add 2% surcharge
        }
        return Amount;
    }

    // Input details
    public void GetInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Room Number: ");
        RNo = sc.nextInt();
        sc.nextLine(); // clear buffer
        System.out.print("Enter Customer Name: ");
        Name = sc.nextLine();
        System.out.print("Enter Charges per day: ");
        Charges = sc.nextDouble();
        System.out.print("Enter Number of Days: ");
        Days = sc.nextInt();
    }

    // Display details
    public void DispInfo() {
        double Amount = Compute();
        System.out.println("\n--- Resort Bill Details ---");
        System.out.println("Room Number   : " + RNo);
        System.out.println("Customer Name : " + Name);
        System.out.println("Charges/day   : " + Charges);
        System.out.println("Days of Stay  : " + Days);
        System.out.println("Total Amount  : " + Amount);
    }
}

// Driver class
public class ResortDemo {
    public static void main(String[] args) {
        Resort R = new Resort();
        R.GetInfo();
        R.DispInfo();
    }
}