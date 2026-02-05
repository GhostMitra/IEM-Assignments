package Assignment_2;
import java.util.Scanner;

class BankAccount {
    private int accNo;
    private String holderName;
    private double balance;

    // Parameterized Constructor
    BankAccount(int accNo, String holderName, double balance) {
        this.accNo = accNo;
        this.holderName = holderName;
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
            System.out.println("Insufficient Balance!");
        }
    }

    void showAccount() {
        System.out.println("\nAccount No: " + accNo);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Current Balance: " + balance);
    }
}

public class Assignment_2d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int acc = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter holder name: ");
        String name = sc.nextLine();

        System.out.print("Enter initial balance: ");
        double bal = sc.nextDouble();

        BankAccount account = new BankAccount(acc, name, bal);

        System.out.print("Enter deposit amount: ");
        account.deposit(sc.nextDouble());

        System.out.print("Enter withdraw amount: ");
        account.withdraw(sc.nextDouble());

        account.showAccount();

        sc.close();
    }
}
