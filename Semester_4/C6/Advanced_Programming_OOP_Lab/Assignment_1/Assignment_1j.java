package Assignment_1;
import java.util.Scanner;

class Polygon {
    private String name;
    private int sides;
    private float sideLength;

    // Constructor
    Polygon(String name, int sides, float sideLength) {
        this.name = name;
        this.sides = sides;
        this.sideLength = sideLength;
    }

    float perimeter() {
        float p = 0;

        for (int i = 1; i <= sides; i++) {
            p += sideLength;
        }

        return p;
    }

    void showDetails() {
        System.out.println("\nPolygon: " + name);
        System.out.println("Number of sides: " + sides);
        System.out.println("Each side length: " + sideLength);
        System.out.println("Perimeter = " + perimeter());
    }
}

public class Assignment_1j {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter polygon name: ");
        String name = sc.nextLine();

        System.out.print("Enter number of sides: ");
        int sides = sc.nextInt();

        System.out.print("Enter length of each side: ");
        float len = sc.nextFloat();

        Polygon poly = new Polygon(name, sides, len);

        poly.showDetails();

        sc.close();
    }
}
