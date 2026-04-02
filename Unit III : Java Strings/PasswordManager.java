// 10.	Create a class PasswordMaskingSystem.
// 	Accept password from the user. 
// 	Replace all characters except last two using replace() method. 
// 	Display masked password. 


import java.util.Scanner;

class PasswordManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Accept password from user
        System.out.print("Enter your password: ");
        String password = sc.nextLine();

        String maskedPassword;

        // Check password length
        if (password.length() <= 2) {
            maskedPassword = password; // No masking needed
        } else {
            // Separate last 2 characters
            String lastTwo = password.substring(password.length() - 2);

            // Replace remaining characters with '*'
            String firstPart = password.substring(0, password.length() - 2);
            String maskedPart = firstPart.replaceAll(".", "*");

            // Combine masked part + last 2 characters
            maskedPassword = maskedPart + lastTwo;
        }

        // Display masked password
        System.out.println("Masked Password: " + maskedPassword);

        sc.close();
    }
}