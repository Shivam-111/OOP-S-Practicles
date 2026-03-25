import java.util.Scanner;

class StudentNameComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //  Accept two student names
        System.out.print("Enter first student name: ");
        String name1 = sc.nextLine();

        System.out.print("Enter second student name: ");
        String name2 = sc.nextLine();

        // Case-sensitive comparison......nbh
        if (name1.equals(name2)) {
            System.out.println("Case-Sensitive: Names are SAME");
        } else {
            System.out.println("Case-Sensitive: Names are DIFFERENT");
        }

        // Case-insensitive comparison..h
        if (name1.equalsIgnoreCase(name2)) {
            System.out.println("Case-Insensitive: Names are SAME");
        } else {
            System.out.println("Case-Insensitive: Names are DIFFERENT");
        }

        sc.close();
    }
}