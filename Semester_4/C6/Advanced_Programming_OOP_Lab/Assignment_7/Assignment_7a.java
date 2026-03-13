package Assignment_7;
import java.util.Scanner;
import static java.lang.System.out;
public class Assignment_7a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        out.println("Enter the first number: ");
        int num1 = sc.nextInt();
        out.println("Enter the second number: ");
        int num2 = sc.nextInt();
        try {
            out.println(num1 + " / " + num2 + " = " + (num1/num2));
        }
        catch(ArithmeticException e){
            out.println("Division by zero");
        }
        sc.close();
    }
}
