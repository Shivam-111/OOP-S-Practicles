// 17.	A company wants to track how many employees have been created in the system. 
// Question: 
// Create a class Employee with attributes name and id. 
// Use a static variable employeeCount that increases every time a new object is created. 
// Write a program that: 
// 	Creates multiple employee objects 
// Displays the total number of employees using a static method 

class Employee {
    private String name;
    private int id;

    // Static variable to track employee count
    private static int employeeCount = 0;

    // Constructor
    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
        employeeCount++; // Increment count whenever a new employee is created
    }

    // Static method to display total employees
    public static void displayEmployeeCount() {
        System.out.println("Total number of employees: " + employeeCount);
    }

    // Optional: method to display employee details
    public void displayInfo() {
        System.out.println("Employee Name: " + name + ", ID: " + id);
    }
}

public class EmployeeTestQ17 {
    public static void main(String[] args) {
        // Creating multiple employee objects
        Employee e1 = new Employee("Alice", 101);
        Employee e2 = new Employee("Bob", 102);
        Employee e3 = new Employee("Charlie", 103);

        // Displaying individual employee info
        e1.displayInfo();
        e2.displayInfo();
        e3.displayInfo();

        // Displaying total number of employees
        Employee.displayEmployeeCount();
    }
}