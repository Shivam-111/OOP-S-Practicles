import java.util.Scanner;

public class EmailChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Accept email address from user
        System.out.print("Enter your email address: ");
        String email = sc.nextLine();

        // Check if email contains "@gmail.com"
        if (email.endsWith("@gmail.com")) {
            System.out.println("Valid Gmail Address");
        } else {
            System.out.println("Invalid Email");
        }

        sc.close();
    }
} 