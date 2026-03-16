import java.util.Scanner;

class mpl {
    int empno;
    String ename;
    float basic, hra, da;
    float netpay;

    // Function to calculate net pay
    float calculate() {
        netpay = basic + hra + da;
        return netpay;
    }

    // Function to accept data
    void havedata() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee Number: ");
        empno = sc.nextInt();

        System.out.print("Enter Employee Name: ");
        ename = sc.next();

        System.out.print("Enter Basic Salary: ");
        basic = sc.nextFloat();

        System.out.print("Enter HRA: ");
        hra = sc.nextFloat();

        System.out.print("Enter DA: ");
        da = sc.nextFloat();

        calculate(); // calculate net pay
    }

    // Function to display data
    void dispdata() {
        System.out.println("\nEmployee Details");
        System.out.println("Employee No: " + empno);
        System.out.println("Employee Name: " + ename);
        System.out.println("Basic Salary: " + basic);
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("Net Pay: " + netpay);
    }
}

public class Employee {
    public static void main(String[] args) {
        mpl e = new mpl();

        e.havedata();
        e.dispdata();
    }
}