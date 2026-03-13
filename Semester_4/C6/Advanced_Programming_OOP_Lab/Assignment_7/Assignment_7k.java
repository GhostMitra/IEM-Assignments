package Assignment_7;
import java.util.Scanner;
import static java.lang.System.out;

class NegativeChecker {
    private int number;

    public NegativeChecker(int number) {
        this.number = number;
    }

    public int check() {
        try {
            if (number < 0)
                throw new Exception("Negative numbers are not allowed. Entered: " + number);
            return number;
        } catch (Exception e) {
            out.println("Error: " + e.getMessage());
            return -1;
        }
    }
}

public class Assignment_7k {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        out.print("Enter a number (enter negative to trigger exception): ");
        int number = sc.nextInt();
        NegativeChecker n = new NegativeChecker(number);
        out.println("Valid Number: " + n.check());
        sc.close();
    }
}
