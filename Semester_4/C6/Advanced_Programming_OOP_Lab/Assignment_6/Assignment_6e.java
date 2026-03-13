package Assignment_6;

import java.util.Scanner;
import java.util.ArrayList;
import static java.lang.System.out;

/*
Program: Store integer values in an ArrayList using wrapper classes
and display them.
*/

abstract class ArrayListDemo {
    abstract void storeValues(int n);
    abstract void display();
}

class IntegerList extends ArrayListDemo {
    private ArrayList<Integer> list = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public void storeValues(int n) {
        out.println("Enter " + n + " integer values:");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt()); // Autoboxing to Integer
        }
    }

    public void display() {
        out.println("\n--- ArrayList Elements ---");
        for (Integer num : list) {
            out.println(num);
        }
    }
}

public class Assignment_6e {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        IntegerList obj = new IntegerList();

        out.print("Enter number of elements: ");
        int n = sc.nextInt();

        obj.storeValues(n);
        obj.display();

        sc.close();
    }
}