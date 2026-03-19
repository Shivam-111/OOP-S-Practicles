class Rectangle {
    int length;
    int breadth;

    // Constructor to initialize length and breadth
    Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }

    // Method to calculate area
    int Area() {
        return length * breadth;
    }
}

public class reactangle {
    public static void main(String[] args) {
        // Create two rectangle objects
        Rectangle rect1 = new Rectangle(4, 5);
        Rectangle rect2 = new Rectangle(5, 8);

        // Print their areas
        System.out.println("Area of Rectangle 1: " + rect1.Area());
        System.out.println("Area of Rectangle 2: " + rect2.Area());
    }
}