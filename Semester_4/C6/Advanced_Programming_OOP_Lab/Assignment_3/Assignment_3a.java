package Assignment_3;

import java.util.Scanner;

class BankAccount {
    private String accNo, name;
    private double balance;

    public BankAccount(String accNo, String name, double balance) {
        this.accNo = accNo;
        this.name = name;
        this.balance = balance;
    }

    public void deposit(double amt) {
        balance += amt;
    }

    public void withdraw(double amt) {
        if (amt <= balance) balance -= amt;
        else System.out.println("Insufficient Balance");
    }

    public double getBalance() {
        return balance;
    }
}

public class Assignment_3a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Account No: ");
        String acc = sc.nextLine();

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Initial Balance: ");
        double bal = sc.nextDouble();

        BankAccount b = new BankAccount(acc, name, bal);

        System.out.print("Deposit Amount: ");
        b.deposit(sc.nextDouble());

        System.out.print("Withdraw Amount: ");
        b.withdraw(sc.nextDouble());

        System.out.println("Final Balance: " + b.getBalance());
        sc.close();
    }
}
