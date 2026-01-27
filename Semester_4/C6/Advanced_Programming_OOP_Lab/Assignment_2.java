import java.util.Scanner;

class IEMStrings {
    void show(String a, String b) {
        System.out.println("IEM");
        System.out.println("First String : " + a);
        System.out.println("Second String: " + b);
    }
}

public class Assignment_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IEMStrings obj = new IEMStrings();

        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();

        obj.show(s1, s2);
        sc.close();
    }
}
