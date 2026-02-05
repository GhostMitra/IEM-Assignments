package Assignment_1;
import java.util.Scanner;
import static java.lang.StrictMath.PI;

class Circle {
    private float radius;

    // Constructor
    Circle(float radius) {
        this.radius = radius;
    }

    double diameter() {
        return 2 * radius;
    }

    double circumference() {
        return 2 * PI * radius;
    }

    double area() {
        return PI * radius * radius;
    }
}

public class Assignment_1c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        float r = sc.nextFloat();

        // Using constructor
        Circle c = new Circle(r);

        System.out.println("Diameter = " + c.diameter());
        System.out.println("Circumference = " + c.circumference());
        System.out.println("Area = " + c.area());

        sc.close();
    }
}
