package Assignment_4;

import java.util.Scanner;

interface Calculate {
    double area();
    double perimeter();
}

class Square implements Calculate {

    private double side;

    public Square(double s) {
        side = s;
    }

    public double area() {
        return side * side;
    }

    public double perimeter() {
        return 4 * side;
    }
}

public class Assignment_4s {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side of square: ");
        double side = sc.nextDouble();

        Square sq = new Square(side);

        System.out.println("Area of Square: " + sq.area());
        System.out.println("Perimeter of Square: " + sq.perimeter());

        sc.close();
    }
}