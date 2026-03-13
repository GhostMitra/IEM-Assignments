package Assignment_6;

import java.util.Scanner;
import static java.lang.System.out;

/*
Program: Convert an integer value into a String using wrapper class
*/

abstract class IntegerToString {
    abstract void convert();
    abstract void display();
}

class Converter extends IntegerToString {
    private int number;
    private String str;

    public void setNumber(int n) {
        number = n;
    }

    public void convert() {
        str = Integer.toString(number);   // Integer → String using wrapper class
    }

    public void display() {
        out.println("\n--- Conversion Details ---");
        out.println("Integer Value: " + number);
        out.println("String Value: " + str);
    }
}

public class Assignment_6d {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Converter obj = new Converter();

        out.print("Enter an integer value: ");
        int value = sc.nextInt();

        obj.setNumber(value);
        obj.convert();
        obj.display();

        sc.close();
    }
}