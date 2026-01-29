class Shape {

    // 1️⃣ Constructor Overloading (Parent class)
    Shape() {
        System.out.println("Shape default constructor");
    }

    Shape(String name) {
        System.out.println("Shape constructor with name: " + name);
    }

    // Method overloading
    void draw() {
        System.out.println("Drawing a shape");
    }

    void draw(String color) {
        System.out.println("Drawing a shape in " + color);
    }
}

class Circle extends Shape {

    // 2️⃣ Constructor Overloading (Child class)
    Circle() {
        super();   // calls Shape()
        System.out.println("Circle default constructor");
    }

    Circle(String name) {
        super(name);   // calls Shape(String)
        System.out.println("Circle constructor with name: " + name);
    }

    Circle(String name, int radius) {
        super(name);
        System.out.println("Circle constructor with radius: " + radius);
    }

    // Method overriding (runtime polymorphism)
    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }

    // Method overloading
    void draw(int radius) {
        System.out.println("Drawing a circle with radius " + radius);
    }
}

public class Assignment_10 {
    public static void main(String[] args) {

        // Constructor overloading
        Circle c1 = new Circle();
        Circle c2 = new Circle("MyCircle");
        Circle c3 = new Circle("BigCircle", 10);

        System.out.println();

        // Runtime polymorphism
        Shape s = new Circle();
        s.draw();           // Circle's draw()
        s.draw("blue");     // Shape's draw(String)

        System.out.println();

        // Compile-time polymorphism
        c3.draw();
        c3.draw(15);
        c3.draw("red");
    }
}
