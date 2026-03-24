import java.util.Scanner;

public class DivisionCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Accept two integers from user
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        // Perform division with exception handling
        try {
            int result = num1 / num2;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }

        sc.close();
    }
}