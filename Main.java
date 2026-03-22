class Calculator {
    // Method to add two integers
    int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add two doubles
    double add(double a, double b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // Calls add(int, int)
        int sum1 = calc.add(10, 20);
        System.out.println("Sum of two integers: " + sum1);

        // Calls add(int, int, int)
        int sum2 = calc.add(5, 15, 25);
        System.out.println("Sum of three integers: " + sum2);

        // Calls add(double, double)
        double sum3 = calc.add(12.5, 7.3);
        System.out.println("Sum of two doubles: " + sum3);
    }
}