package Assignment_6;

import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.System.out;

/*
Program: Create two threads using Thread class
a) First thread finds prime numbers between n and m
b) Second thread calculates square of each prime number
*/

class PrimeThread extends Thread {
    private int n, m;
    public static ArrayList<Integer> primes = new ArrayList<>();

    public PrimeThread(int n, int m) {
        this.n = n;
        this.m = m;
    }

    public void run() {
        for (int i = n; i <= m; i++) {
            int count = 0;

            if (i < 2)
                continue;

            for (int j = 1; j <= i; j++) {
                if (i % j == 0)
                    count++;
            }

            if (count == 2) {
                primes.add(i);
                out.println("Prime: " + i);
            }
        }
    }
}

class SquareThread extends Thread {

    public void run() {
        out.println("\nSquares of Prime Numbers:");

        for (Integer num : PrimeThread.primes) {
            out.println(num + "² = " + (num * num));
        }
    }
}

public class Assignment_6j {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        out.print("Enter starting number (n): ");
        int n = sc.nextInt();

        out.print("Enter ending number (m): ");
        int m = sc.nextInt();

        PrimeThread t1 = new PrimeThread(n, m);
        SquareThread t2 = new SquareThread();

        t1.start();

        try {
            t1.join(); // Ensure primes are found before squaring
        } catch (InterruptedException e) {
            out.println(e);
        }

        t2.start();

        sc.close();
    }
}