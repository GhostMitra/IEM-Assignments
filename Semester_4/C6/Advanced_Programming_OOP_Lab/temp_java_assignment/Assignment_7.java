package temp_java_assignment;
import java.util.Scanner;

class BitwiseSwapper {
    int[] swap(int a, int b) {
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        return new int[]{a, b};
    }
}

public class Assignment_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BitwiseSwapper obj = new BitwiseSwapper();

        System.out.print("Enter first number : ");
        int x = sc.nextInt();

        System.out.print("Enter second number: ");
        int y = sc.nextInt();

        System.out.println("Before Swap: a = " + x + ", b = " + y);

        int[] result = obj.swap(x, y);

        System.out.println("After Swap : a = " + result[0] + ", b = " + result[1]);
        sc.close();
    }
}
