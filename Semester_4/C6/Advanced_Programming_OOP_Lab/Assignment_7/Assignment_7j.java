package Assignment_7;
import java.util.Scanner;
import static java.lang.System.out;

class ArrayExceptionDemo {
    private int[] arr;

    public ArrayExceptionDemo(int a, int b, int c) {
        this.arr = new int[]{a, b, c};
    }

    public int getElement(int index) {
        try {
            return arr[index];
        } catch (Exception e) {
            out.println("Exception caught: " + e.getMessage());
            return -1;
        }
    }
}

public class Assignment_7j {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        out.print("Enter 3 array elements: ");
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        out.print("Enter index to access (enter >= 3 to trigger exception): ");
        int index = sc.nextInt();
        ArrayExceptionDemo arr = new ArrayExceptionDemo(a, b, c);
        out.println("Value at index " + index + ": " + arr.getElement(index));
        sc.close();
    }
}
