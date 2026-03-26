// Base class
class Person {
    void role() {
        System.out.println("I am a Person.");
    }
}

// Subclass of Person
class Employee extends Person {
    @Override
    void role() {
        System.out.println("I am an Employee.");
    }
}

// Subclass of Employee (multilevel inheritance)
class Manager extends Employee {
    @Override
    void role() {
        System.out.println("I am a Manager.");
    }
}

// Demonstration class
public class InheritanceDemo {
    public static void main(String[] args) {
        // Base class reference pointing to different objects
        Person p = new Person();
        Person e = new Employee();
        Person m = new Manager();

        // Runtime polymorphism: same method call, different outputs
        p.role();  // Output: I am a Person.
        e.role();  // Output: I am an Employee.
        m.role();  // Output: I am a Manager.
    }
}