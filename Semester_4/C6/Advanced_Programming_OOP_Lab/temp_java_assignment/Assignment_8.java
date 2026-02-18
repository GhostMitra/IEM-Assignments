package temp_java_assignment;
import java.util.Scanner;

class EvenOddCheck {
    boolean isEven(int n) {
        return n % 2 == 0;
    }
}

public class Assignment_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EvenOddCheck obj = new EvenOddCheck();

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (obj.isEven(num))
            System.out.println(num + " is Even");
        else
            System.out.println(num + " is Odd");

        sc.close();
    }
}
