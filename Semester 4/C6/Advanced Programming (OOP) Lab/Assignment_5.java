import java.util.Scanner;

class UserAdd {
    int sum;
    UserAdd() {
        sum = 0;
    }
    // Parameterized constructor
    UserAdd(int a, int b) {
        sum = a + b;
    }

    int getSum() {
        return sum;
    }
}

public class Assignment_5 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter first number : ");
            int x = sc.nextInt();

            System.out.print("Enter second number: ");
            int y = sc.nextInt();

            UserAdd obj = new UserAdd(x, y);
            System.out.println("Sum = " + obj.getSum());
        }
    }
}
