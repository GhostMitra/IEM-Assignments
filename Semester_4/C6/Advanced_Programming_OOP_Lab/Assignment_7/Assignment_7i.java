package Assignment_7;
import java.util.Scanner;
import static java.lang.System.out;

class GenericExceptionDemo {
    private int num1, num2;

    public GenericExceptionDemo(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int divide() {
        try {
            return num1 / num2;
        } catch (Exception e) {
            out.println("Exception caught: " + e.getMessage());
            return -1;
        }
    }
}

public class Assignment_7i {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        out.print("Enter Dividend: ");
        int num1 = sc.nextInt();
        out.print("Enter Divisor (enter 0 to trigger exception): ");
        int num2 = sc.nextInt();
        GenericExceptionDemo g = new GenericExceptionDemo(num1, num2);
        out.println("Result: " + g.divide());
        sc.close();
    }
}
