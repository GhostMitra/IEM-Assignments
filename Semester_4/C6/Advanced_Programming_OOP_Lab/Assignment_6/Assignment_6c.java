package Assignment_6;

import java.util.Scanner;
import static java.lang.System.out;

/*
Program: Convert a String into an Integer using wrapper class methods
*/

abstract class StringToInteger {
    abstract void convert();
    abstract void display();
}

class Converter extends StringToInteger {
    private String str;
    private Integer number;

    public void setString(String s) {
        str = s;
    }

    public void convert() {
        number = Integer.valueOf(str);   // String → Integer using wrapper class
    }

    public void display() {
        out.println("\n--- Conversion Details ---");
        out.println("String Value: " + str);
        out.println("Integer Value: " + number);
    }
}

public class Assignment_6c {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Converter obj = new Converter();

        out.print("Enter a numeric string: ");
        String input = sc.nextLine();

        obj.setString(input);
        obj.convert();
        obj.display();

        sc.close();
    }
}