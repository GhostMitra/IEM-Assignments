package Assignment_4;

import java.util.Scanner;

class Display {

    public void show(int a) {
        System.out.println("Showing: " + a);
    }

    public void show(int a, int b) {
        System.out.println("Showing: " + a + " , " + b);
    }

    public void show(String msg) {
        System.out.println("Showing: " + msg);
    }
}

public class Assignment_4h {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Display d = new Display();

        // One integer
        System.out.print("Enter one integer: ");
        int x = sc.nextInt();
        d.show(x);

        // Two integers
        System.out.print("\nEnter two integers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        d.show(a, b);

        // One string
        sc.nextLine(); // clear buffer
        System.out.print("\nEnter a message: ");
        String msg = sc.nextLine();
        d.show(msg);

        sc.close();
    }
}