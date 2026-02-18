package Assignment_2;
import java.util.Scanner;

class Rectangle {
    private float length;
    private float breadth;

    // Parameterized Constructor
    Rectangle(float length, float breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    float area() {
        return length * breadth;
    }

    float perimeter() {
        return 2 * (length + breadth);
    }

    void showResult() {
        System.out.println("\nLength: " + length);
        System.out.println("Breadth: " + breadth);
        System.out.println("Area = " + area());
        System.out.println("Perimeter = " + perimeter());
    }
}

public class Assignment_2c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        float l = sc.nextFloat();

        System.out.print("Enter breadth: ");
        float b = sc.nextFloat();

        Rectangle r = new Rectangle(l, b);

        r.showResult();

        sc.close();
    }
}
