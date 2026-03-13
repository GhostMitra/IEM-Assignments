package Assignment_7;
import java.util.Scanner;
import static java.lang.System.out;

class ToStringDemo {
    private int num1, num2;

    public ToStringDemo(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int divide() {
        try {
            return num1 / num2;
        } catch (ArithmeticException e) {
            out.println("Exception: " + e.toString());
            return -1;
        }
    }
}

public class Assignment_7h {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        out.print("Enter Dividend: ");
        int num1 = sc.nextInt();
        out.print("Enter Divisor (enter 0 to trigger exception): ");
        int num2 = sc.nextInt();
        ToStringDemo t = new ToStringDemo(num1, num2);
        out.println("Result: " + t.divide());
        sc.close();
    }
}
