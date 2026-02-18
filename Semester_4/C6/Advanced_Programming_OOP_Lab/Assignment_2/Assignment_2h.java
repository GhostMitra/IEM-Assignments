package Assignment_2;
import java.util.Scanner;

class Point {
    private int x;
    private int y;

    // Parameterized Constructor
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Copy Constructor
    Point(Point p) {
        this.x = p.x;
        this.y = p.y;
    }

    void showPoint() {
        System.out.println("Point: (" + x + ", " + y + ")");
    }
}

public class Assignment_2h {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x: ");
        int x = sc.nextInt();

        System.out.print("Enter y: ");
        int y = sc.nextInt();

        Point p1 = new Point(x, y);
        Point p2 = new Point(p1);   // Copying p1

        System.out.println("\nOriginal Point:");
        p1.showPoint();

        System.out.println("Copied Point:");
        p2.showPoint();

        sc.close();
    }
}
