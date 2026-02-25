package Assignment_4;

class BankAccount {
    public double getInterestRate() {
        return 4.0;
    }
}

class SavingsAccount extends BankAccount {
    public double getInterestRate() {
        return 5.5;
    }
}

class CurrentAccount extends BankAccount {
    public double getInterestRate() {
        return 0.0;
    }
}

public class Assignment_4n {
    public static void main(String[] args) {

        // Direct objects
        BankAccount ba = new BankAccount();
        SavingsAccount sa = new SavingsAccount();
        CurrentAccount ca = new CurrentAccount();

        System.out.println("Direct Calls:");
        System.out.println("Bank Account Rate: " + ba.getInterestRate());
        System.out.println("Savings Account Rate: " + sa.getInterestRate());
        System.out.println("Current Account Rate: " + ca.getInterestRate());

        // Superclass references
        System.out.println("\nSuperclass Reference Calls:");

        BankAccount ref;

        ref = new SavingsAccount();
        System.out.println("Savings via reference: " + ref.getInterestRate());

        ref = new CurrentAccount();
        System.out.println("Current via reference: " + ref.getInterestRate());
    }
}