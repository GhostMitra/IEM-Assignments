import java.util.Scanner;

class UserAdd {
    void add(int a, int b) {
        System.out.println("Sum = " + (a + b));
    }
}

public class Assignment_5 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            UserAdd obj = new UserAdd();

            System.out.print("Enter first number : ");
            int x = sc.nextInt();

            System.out.print("Enter second number: ");
            int y = sc.nextInt();

            obj.add(x, y);
        }
    }
}
