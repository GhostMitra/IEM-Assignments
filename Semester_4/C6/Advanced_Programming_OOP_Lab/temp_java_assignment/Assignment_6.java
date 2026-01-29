import java.util.Scanner;

class StringPrinter {
    void print(String s) {
        System.out.println("You entered: " + s);
    }
}

public class Assignment_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringPrinter obj = new StringPrinter();

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        obj.print(str);
        sc.close();
    }
}
