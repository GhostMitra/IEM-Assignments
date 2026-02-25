package Assignment_4;

import java.util.Scanner;

class Printer {

    public void print(String msg) {
        System.out.println(msg);
    }

    public void print(int num) {
        System.out.println(num);
    }

    public void print(String msg, int times) {
        for (int i = 1; i <= times; i++)
            System.out.println(msg);
    }
}

public class Assignment_4f {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Printer p = new Printer();

        // Print String
        System.out.print("Enter a message: ");
        String msg = sc.nextLine();
        p.print(msg);

        // Print Integer
        System.out.print("\nEnter a number: ");
        int num = sc.nextInt();
        p.print(num);

        // Print String multiple times
        sc.nextLine(); // clear buffer
        System.out.print("\nEnter message to repeat: ");
        String repeatMsg = sc.nextLine();
        System.out.print("Enter number of times: ");
        int times = sc.nextInt();

        p.print(repeatMsg, times);

        sc.close();
    }
}