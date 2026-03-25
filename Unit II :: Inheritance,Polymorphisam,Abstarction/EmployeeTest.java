// Abstract class
abstract class Employee {
    String name;
    int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Abstract method
    abstract double calculateBonus();
}

// Subclass: Manager
class Manager extends Employee {
    double salary;

    Manager(String name, int id, double salary) {
        super(name, id);
        this.salary = salary;
    }

    double calculateBonus() {
        return salary * 0.20;  // 20% bonus
    }
}

// Subclass: Developer
class Developer extends Employee {
    double salary;
    double incentive;

    Developer(String name, int id, double salary, double incentive) {
        super(name, id);
        this.salary = salary;
        this.incentive = incentive;
    }

    double calculateBonus() {
        return (salary * 0.10) + incentive;  // 10% + incentive
    }
}

// Main class
class EmployeeTest {
    public static void main(String[] args) {

        Employee e1 = new Manager("Shivam", 101, 50000);
        Employee e2 = new Developer("Rahul", 102, 40000, 5000);

        System.out.println(e1.name + " Bonus: " + e1.calculateBonus());
        System.out.println(e2.name + " Bonus: " + e2.calculateBonus());
    }
}