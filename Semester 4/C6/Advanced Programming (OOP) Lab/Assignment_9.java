import java.util.Scanner;

class CalcLogic {
    void calculate(int a, int b, char op) {
        switch (op) {
            case '+': System.out.println("Result = " + (a + b)); break;
            case '-': System.out.println("Result = " + (a - b)); break;
            case '*': System.out.println("Result = " + (a * b)); break;
            case '/': System.out.println("Result = " + (a / b)); break;
            default : System.out.println("Invalid Operator");
        }
    }
}

public class Assignment_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CalcLogic obj = new CalcLogic();

        System.out.print("Enter first number : ");
        int x = sc.nextInt();

        System.out.print("Enter second number: ");
        int y = sc.nextInt();

        System.out.print("Enter operator (+ - * /): ");
        char op = sc.next().charAt(0);

        obj.calculate(x, y, op);
        sc.close();
    }
}
