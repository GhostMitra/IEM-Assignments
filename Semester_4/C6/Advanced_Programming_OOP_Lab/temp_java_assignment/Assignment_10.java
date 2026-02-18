package temp_java_assignment;
class Shape {

    Shape() {
        System.out.println("Shape default constructor");
    }

    Shape(String name) {
        System.out.println("Shape constructor with name: " + name);
    }

    void draw() {
        System.out.println("Drawing a shape");
    }

    void draw(String color) {
        System.out.println("Drawing a shape in " + color);
    }
}

class Circle extends Shape {

    Circle() {
        super();   
        System.out.println("Circle default constructor");
    }

    Circle(String name) {
        super(name);   
        System.out.println("Circle constructor with name: " + name);
    }

    Circle(String name, int radius) {
        super(name);
        System.out.println("Circle constructor with radius: " + radius);
    }

    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }

    void draw(int radius) {
        System.out.println("Drawing a circle with radius " + radius);
    }
}

public class Assignment_10 {
    public static void main(String[] args) {

        Circle c1 = new Circle();
        Circle c2 = new Circle("MyCircle");
        Circle c3 = new Circle("BigCircle", 10);

        System.out.println();

        Shape s = new Circle();
        s.draw();          
        s.draw("blue");   

        System.out.println();

        c3.draw();
        c3.draw(15);
        c3.draw("red");
    }
}
