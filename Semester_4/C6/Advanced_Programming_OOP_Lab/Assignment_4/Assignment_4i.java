package Assignment_4;

import java.util.Scanner;

class MathOperation {

    public int multiply(int a, int b) {
        return a * b;
    }

    public int multiply(int a, int b, int c) {
        return a * b * c;
    }

    public float multiply(float a, float b) {
        return a * b;
    }
}

public class Assignment_4i {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        MathOperation m = new MathOperation();

        // Two integers
        System.out.print("Enter two integers: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("Product = " + m.multiply(x, y));

        // Three integers
        System.out.print("\nEnter three integers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("Product = " + m.multiply(a, b, c));

        // Two floats
        System.out.print("\nEnter two float values: ");
        float f1 = sc.nextFloat();
        float f2 = sc.nextFloat();
        System.out.println("Product = " + m.multiply(f1, f2));

        sc.close();
    }
}