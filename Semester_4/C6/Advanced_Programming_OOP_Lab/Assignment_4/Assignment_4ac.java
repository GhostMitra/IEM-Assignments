package Assignment_4;

class Shape {
    void draw() {
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a circle");
    }
}

class Rectangle extends Shape {
    void draw() {
        System.out.println("Drawing a rectangle");
    }
}

public class Assignment_4ac {
    public static void main(String[] args) {

        Shape[] shapes = new Shape[2];

        shapes[0] = new Circle();
        shapes[1] = new Rectangle();

        for (int i = 0; i < shapes.length; i++) {
            shapes[i].draw();   // Runtime decision by JVM
        }
    }
}