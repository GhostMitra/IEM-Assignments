import java.util.Scanner;

class CalcLogic {
    int result;
    CalcLogic() {
        result = 0;
    }
    CalcLogic(int a, int b, char op) {
        switch (op) {
            case '+': result = a + b; break;
            case '-': result = a - b; break;
            case '*': result = a * b; break;
            case '/': result = a / b; break;
            default:
                System.out.println("Invalid Operator");
                return;
        }
    }

    int getResult() {
        return result;
    }
}

public class Assignment_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number : ");
        int x = sc.nextInt();

        System.out.print("Enter second number: ");
        int y = sc.nextInt();

        System.out.print("Enter operator (+ - * /): ");
        char op = sc.next().charAt(0);

        CalcLogic obj = new CalcLogic(x, y, op);
        System.out.println("Result = " + obj.getResult());

        sc.close();
    }
}
