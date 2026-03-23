import java.util.Scanner;

class UsernameValidator {
    private String username;

    // Constructor to accept username
    public UsernameValidator(String username) {
        this.username = username;
    }

    // Method to clean the username
    public String cleanUsername() {
        // Remove leading/trailing spaces and convert to lowercase
        return username.trim().toLowerCase();
    }
}

public class UsernameValidators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Accept username from user
        System.out.print("Enter a username: ");
        String inputUsername = sc.nextLine();

        // Create UsernameValidator object
        UsernameValidator validator = new UsernameValidator(inputUsername);

        // Display cleaned username
        System.out.println("Cleaned Username: " + validator.cleanUsername());

        sc.close();
    }
}