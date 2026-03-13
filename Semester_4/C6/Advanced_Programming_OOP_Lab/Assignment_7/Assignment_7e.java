package Assignment_7;
import java.util.Scanner;
import static java.lang.System.out;

class MultiExceptionDemo {
    private String input;
    private int index;

    public MultiExceptionDemo(String input, int index) {
        this.input = input;
        this.index = index;
    }

    public int process() {
        try {
            int num = Integer.parseInt(input);
            int[] arr = new int[]{10, 20, 30};
            return arr[index] / num;
        } catch (NumberFormatException e) {
            out.println("NumberFormatException: \"" + input + "\" is not a valid integer.");
            return -1;
        } catch (ArrayIndexOutOfBoundsException e) {
            out.println("ArrayIndexOutOfBoundsException: Index " + index + " is out of bounds.");
            return -1;
        }
    }
}

public class Assignment_7e {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        out.print("Enter a number as string (enter non-numeric to trigger NumberFormatException): ");
        String input = sc.next();
        out.print("Enter array index (enter >= 3 to trigger ArrayIndexOutOfBoundsException): ");
        int index = sc.nextInt();
        MultiExceptionDemo m = new MultiExceptionDemo(input, index);
        out.println("Result: " + m.process());
        sc.close();
    }
}
