// Base class
class Shape {
    String name;

    Shape(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("This is a " + name + ".");
    }
}

// Subclass Circle
class Circle extends Shape {
    double radius;

    Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    double area() {
        return Math.PI * radius * radius;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Radius: " + radius);
        System.out.println("Area of Circle: " + area());
    }
}

// Subclass Rectangle
class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        super("Rectangle");
        this.length = length;
        this.width = width;
    }

    double area() {
        return length * width;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Length: " + length + ", Width: " + width);
        System.out.println("Area of Rectangle: " + area());
    }
}

// Main class
public class DrawingApp {
    public static void main(String[] args) {
        Circle circle = new Circle(7);
        Rectangle rectangle = new Rectangle(5, 8);

        circle.display();
        System.out.println();
        rectangle.display();
    }
}