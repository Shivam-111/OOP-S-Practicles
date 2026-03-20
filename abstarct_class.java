// Abstract class Shape
abstract class Shape {
    // Abstract method (must be implemented by subclasses)
    abstract double calculate_area();

    // Concrete method (common to all shapes)
    void display_info() {
        System.out.println("This is a shape.");
    }
}

// Concrete subclass Circle
class Circle extends Shape {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculate_area() {
        return Math.PI * radius * radius;
    }
}

// Concrete subclass Rectangle
class Rectangle extends Shape {
    private double length;
    private double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double calculate_area() {
        return length * width;
    }
}

// Main class to test
public class abstarct_class {
    public static void main(String[] args) {
        // ✅ Using subclass Circle
        Shape circle = new Circle(5);
        circle.display_info();
        System.out.println("Circle area: " + circle.calculate_area());

        // ✅ Using subclass Rectangle
        Shape rectangle = new Rectangle(4, 6);
        rectangle.display_info();
        System.out.println("Rectangle area: " + rectangle.calculate_area());
    }
}