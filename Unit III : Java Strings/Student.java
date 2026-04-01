class Student {
    // Attributes
    private int id;
    private String name;

    // Constructor
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Override toString() method
    @Override
    public String toString() {
        return "Student [ID=" + id + ", Name=" + name + "]";
    }

    // Main method to test
    public static void main(String[] args) {
        // Create object of Student class
        Student s1 = new Student(101, "Shivam");

        // Display object details using toString()
        System.out.println(s1.toString());

        // You can also directly print the object
        System.out.println(s1);
    }
}