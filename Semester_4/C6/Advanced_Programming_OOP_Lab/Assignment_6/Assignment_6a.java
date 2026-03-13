package Assignment_6;

import java.util.Scanner;
import static java.lang.System.out;

abstract class WrapperDemo {
    abstract void performWrapping();
    abstract void performUnwrapping();
    abstract void display();
}

class IntegerWrapper extends WrapperDemo {
    private int primitiveValue;
    private Integer objectValue;

    public void setValue(int value) {
        primitiveValue = value;
    }

    public void performWrapping() {
        objectValue = Integer.valueOf(primitiveValue); // Wrapping
    }

    public void performUnwrapping() {
        primitiveValue = objectValue.intValue(); // Unwrapping
    }

    public void display() {
        out.println("\n--- Wrapper Demonstration ---");
        out.println("Primitive Value: " + primitiveValue);
        out.println("Integer Object Value: " + objectValue);
    }
}

public class Assignment_6a {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        IntegerWrapper obj = new IntegerWrapper();

        out.print("Enter an integer value: ");
        int value = sc.nextInt();

        obj.setValue(value);
        obj.performWrapping();
        obj.performUnwrapping();

        obj.display();

        sc.close();
    }
}