import java.util.Scanner;

class EvenOddCheck {
    void check(int n) {
        if (n % 2 == 0)
            System.out.println(n + " is Even");
        else
            System.out.println(n + " is Odd");
    }
}

public class Assignment_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EvenOddCheck obj = new EvenOddCheck();

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        obj.check(num);
        sc.close();
    }
}
