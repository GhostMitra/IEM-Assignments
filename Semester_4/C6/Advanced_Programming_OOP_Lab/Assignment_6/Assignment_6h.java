package Assignment_6;

import java.util.Scanner;
import static java.lang.System.out;

/*
Program: Demonstrate that wrapper objects can be null and may cause
NullPointerException during auto-unboxing
*/

abstract class NullDemo {
    abstract void performUnboxing();
    abstract void display();
}

class WrapperNull extends NullDemo {
    private Integer objectValue;
    private int primitiveValue;

    public void setNull() {
        objectValue = null;   // Wrapper object set to null
    }

    public void performUnboxing() {
        try {
            primitiveValue = objectValue;   // Auto-unboxing (causes NullPointerException)
        } catch (NullPointerException e) {
            out.println("\nException Occurred: " + e);
        }
    }

    public void display() {
        out.println("\n--- Null Wrapper Demonstration ---");
        out.println("Wrapper Object Value: " + objectValue);
        out.println("Primitive Value (if assigned): " + primitiveValue);
    }
}

public class Assignment_6h {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        WrapperNull obj = new WrapperNull();

        obj.setNull();
        obj.performUnboxing();
        obj.display();

        sc.close();
    }
}