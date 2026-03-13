package Assignment_6;

import java.util.Scanner;
import static java.lang.System.out;

abstract class AutoBoxDemo {
    abstract void performAutoboxing();
    abstract void performUnboxing();
    abstract void display();
}

class IntegerAutoBox extends AutoBoxDemo {
    private int primitiveValue;
    private Integer objectValue;

    public void setValue(int value) {
        primitiveValue = value;
    }

    public void performAutoboxing() {
        objectValue = primitiveValue;   // Autoboxing (primitive → object)
    }

    public void performUnboxing() {
        primitiveValue = objectValue;   // Auto-unboxing (object → primitive)
    }

    public void display() {
        out.println("\n--- Autoboxing & Auto-Unboxing Demonstration ---");
        out.println("Primitive Value: " + primitiveValue);
        out.println("Integer Object Value: " + objectValue);
    }
}

public class Assignment_6b {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        IntegerAutoBox obj = new IntegerAutoBox();

        out.print("Enter an integer value: ");
        int value = sc.nextInt();

        obj.setValue(value);

        obj.performAutoboxing();
        obj.performUnboxing();

        obj.display();

        sc.close();
    }
}