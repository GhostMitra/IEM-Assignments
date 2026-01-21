import java.util.Scanner;

class BitwiseSwapper {
    void swap(int a, int b) {
        System.out.println("Before Swap: a = " + a + ", b = " + b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("After Swap : a = " + a + ", b = " + b);
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

        obj.swap(x, y);
        sc.close();
    }
}
