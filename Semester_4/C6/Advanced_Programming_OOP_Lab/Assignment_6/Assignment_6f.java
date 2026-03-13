package Assignment_6;

import java.util.Scanner;
import static java.lang.System.out;

/*
Program: Compare two Integer wrapper objects using == and .equals()
*/

abstract class IntegerCompare {
    abstract void compare();
    abstract void display();
}

class CompareObjects extends IntegerCompare {
    private Integer num1;
    private Integer num2;
    private boolean result1;
    private boolean result2;

    public void setValues(int a, int b) {
        num1 = Integer.valueOf(a);
        num2 = Integer.valueOf(b);
    }

    public void compare() {
        result1 = (num1 == num2);        // Reference comparison
        result2 = num1.equals(num2);     // Value comparison
    }

    public void display() {
        out.println("\n--- Comparison Details ---");
        out.println("First Integer Object: " + num1);
        out.println("Second Integer Object: " + num2);
        out.println("Using == : " + result1);
        out.println("Using .equals() : " + result2);
    }
}

public class Assignment_6f {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        CompareObjects obj = new CompareObjects();

        out.print("Enter first integer: ");
        int a = sc.nextInt();

        out.print("Enter second integer: ");
        int b = sc.nextInt();

        obj.setValues(a, b);
        obj.compare();
        obj.display();

        sc.close();
    }
}