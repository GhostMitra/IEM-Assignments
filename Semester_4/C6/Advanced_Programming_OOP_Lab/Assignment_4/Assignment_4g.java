package Assignment_4;

import java.util.Scanner;

class Area {

    final double PI = 3.1416;

    public double calculateArea(double r) {        // Circle
        return PI * r * r;
    }

    public double calculateArea(double l, double b) {   // Rectangle
        return l * b;
    }

    public double calculateArea(int s) {            // Square
        return s * s;
    }
}

public class Assignment_4g {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Area a = new Area();

        // Circle
        System.out.print("Enter radius of circle: ");
        double r = sc.nextDouble();
        System.out.println("Area of Circle = " + a.calculateArea(r));

        // Rectangle
        System.out.print("\nEnter length and breadth of rectangle: ");
        double l = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.println("Area of Rectangle = " + a.calculateArea(l, b));

        // Square
        System.out.print("\nEnter side of square: ");
        int s = sc.nextInt();
        System.out.println("Area of Square = " + a.calculateArea(s));

        sc.close();
    }
}