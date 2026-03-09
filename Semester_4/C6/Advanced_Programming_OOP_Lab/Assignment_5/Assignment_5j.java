package Assignment_5;

import java.util.Scanner;
import static java.lang.System.out;

interface Calculator {
    int calculate(int a, int b);
}

class Addition implements Calculator {
    public int calculate(int a, int b) {
        return a + b;
    }
}

class Subtraction implements Calculator {
    public int calculate(int a, int b) {
        return a - b;
    }
}

class Multiplication implements Calculator {
    public int calculate(int a, int b) {
        return a * b;
    }
}

public class Assignment_5j {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        out.print("Enter first number: ");
        int a = sc.nextInt();

        out.print("Enter second number: ");
        int b = sc.nextInt();

        Calculator c;

        c = new Addition();
        out.println("Addition: " + c.calculate(a, b));

        c = new Subtraction();
        out.println("Subtraction: " + c.calculate(a, b));

        c = new Multiplication();
        out.println("Multiplication: " + c.calculate(a, b));

        sc.close();
    }
}