package Assignment_1;
import java.util.Scanner;

class BankAccount {
    private String name;
    private double balance;

    // Constructor
    BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    void deposit(double amt) {
        balance += amt;
        System.out.println("Deposited: " + amt);
    }

    void withdraw(double amt) {
        if (amt <= balance) {
            balance -= amt;
            System.out.println("Withdrawn: " + amt);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    double showBalance() {
        return balance;
    }

    void showDetails() {
        System.out.println("\nAccount Holder: " + name);
        System.out.println("Current Balance: " + showBalance());
    }
}

public class Assignment_1e {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter initial balance: ");
        double bal = sc.nextDouble();

        BankAccount acc = new BankAccount(name, bal);

        System.out.print("Enter deposit amount: ");
        acc.deposit(sc.nextDouble());

        System.out.print("Enter withdrawal amount: ");
        acc.withdraw(sc.nextDouble());

        acc.showDetails();

        sc.close();
    }
}
