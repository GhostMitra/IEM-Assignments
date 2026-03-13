package Assignment_6;

import java.util.Scanner;
import static java.lang.System.out;

/*
Program: Find the maximum of two numbers using Integer.max() method
*/

abstract class MaxFinder {
    abstract void findMax();
    abstract void display();
}

class IntegerMax extends MaxFinder {
    private int num1;
    private int num2;
    private int max;

    public void setValues(int a, int b) {
        num1 = a;
        num2 = b;
    }

    public void findMax() {
        max = Integer.max(num1, num2);   // Using wrapper class method
    }

    public void display() {
        out.println("\n--- Maximum Value Details ---");
        out.println("First Number: " + num1);
        out.println("Second Number: " + num2);
        out.println("Maximum Number: " + max);
    }
}

public class Assignment_6g {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        IntegerMax obj = new IntegerMax();

        out.print("Enter first number: ");
        int a = sc.nextInt();

        out.print("Enter second number: ");
        int b = sc.nextInt();

        obj.setValues(a, b);
        obj.findMax();
        obj.display();

        sc.close();
    }
}