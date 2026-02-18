package Assignment_1;
import java.util.Scanner;

class NumberTool {
    private int n;

    // Constructor
    NumberTool(int n) {
        this.n = n;
    }

    String signCheck() {
        if (n > 0) return "Number is Positive";
        else if (n < 0) return "Number is Negative";
        else return "Number is Zero";
    }

    String evenOddCheck() {
        if (n % 2 == 0) return "Number is Even";
        else return "Number is Odd";
    }

    String divisibilityCheck() {
        if (n % 3 == 0) {
            if (n % 5 == 0)
                return "Divisible by 3 and 5";
            else
                return "Divisible by 3 only";
        } else {
            if (n % 5 == 0)
                return "Divisible by 5 only";
            else
                return "Not divisible by 3 or 5";
        }
    }
}

public class Assignment_1h {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        NumberTool tool = new NumberTool(num);

        System.out.println("\nAnalysis Result:");
        System.out.println(tool.signCheck());
        System.out.println(tool.evenOddCheck());
        System.out.println(tool.divisibilityCheck());

        sc.close();
    }
}
