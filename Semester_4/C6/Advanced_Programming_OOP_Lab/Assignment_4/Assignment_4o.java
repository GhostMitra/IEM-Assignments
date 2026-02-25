package Assignment_4;

interface Drawable {
    void draw();
}

class Rectangle implements Drawable {
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}

class Circle implements Drawable {
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

public class Assignment_4o {
    public static void main(String[] args) {

        // Direct objects
        Rectangle r = new Rectangle();
        Circle c = new Circle();

        System.out.println("Direct Calls:");
        r.draw();
        c.draw();

        // Interface reference (Polymorphism)
        System.out.println("\nInterface Reference Calls:");

        Drawable d;

        d = new Rectangle();
        d.draw();

        d = new Circle();
        d.draw();
    }
}