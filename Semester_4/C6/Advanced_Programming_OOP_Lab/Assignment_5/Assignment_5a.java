package Assignment_5;

import java.util.Scanner;
import static java.lang.System.out;

abstract class Shape {
    abstract double calculateArea();
    abstract void display();
}

class Circle extends Shape {
    private double radius;
    private double area;

    public void setCircle(double r) {
        radius = r;
    }

    public double calculateArea() {
        area = Math.PI * radius * radius;
        return area;
    }

    public void display() {
        out.println("\n--- Circle Details ---");
        out.println("Radius: " + radius);
        out.println("Area: " + calculateArea());
    }
}

class Rectangle extends Shape {
    private double length;
    private double breadth;
    private double area;

    public void setRectangle(double l, double b) {
        length = l;
        breadth = b;
    }

    public double calculateArea() {
        area = length * breadth;
        return area;
    }

    public void display() {
        out.println("\n--- Rectangle Details ---");
        out.println("Length: " + length);
        out.println("Breadth: " + breadth);
        out.println("Area: " + calculateArea());
    }
}

public class Assignment_5a {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Circle c = new Circle();
        Rectangle r = new Rectangle();

        out.print("Enter radius of circle: ");
        double radius = sc.nextDouble();
        c.setCircle(radius);

        out.print("\nEnter length of rectangle: ");
        double length = sc.nextDouble();
        out.print("Enter breadth of rectangle: ");
        double breadth = sc.nextDouble();
        r.setRectangle(length, breadth);

        c.display();
        r.display();

        sc.close();
    }
}