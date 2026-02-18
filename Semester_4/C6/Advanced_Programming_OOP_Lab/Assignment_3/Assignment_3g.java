package Assignment_3;

import java.util.Scanner;

class Wallet {
    private double balance;
    private int pin;

    public Wallet(double balance, int pin) {
        this.balance = balance;
        this.pin = pin;
    }

    public boolean transfer(double amt, int enteredPin) {
        if (enteredPin == pin && amt > 0 && balance >= amt) {
            balance -= amt;
            return true;
        }
        return false;
    }

    public double getBalance() {
        return balance;
    }
}

public class Assignment_3g {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Balance: ");
        double bal = sc.nextDouble();

        System.out.print("Set PIN: ");
        int pin = sc.nextInt();

        Wallet w = new Wallet(bal, pin);

        System.out.print("Transfer amount: ");
        double amt = sc.nextDouble();

        System.out.print("Enter PIN: ");
        int ep = sc.nextInt();

        System.out.println("Success: " + w.transfer(amt, ep));
        System.out.println("Remaining: " + w.getBalance());
        sc.close();
    }
}
