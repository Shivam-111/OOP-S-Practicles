import java.util.Scanner;

class MassageFormatter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Accept first and last name
        System.out.print("Enter first name: ");
        String firstName = sc.nextLine();

        System.out.print("Enter last name: ");
        String lastName = sc.nextLine();

        // Concatenate with space
        String fullName = firstName + " " + lastName;

        // Display formatted name
        System.out.println("Full Name: " + fullName);

        sc.close();
    }
}