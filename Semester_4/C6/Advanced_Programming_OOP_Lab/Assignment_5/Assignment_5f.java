package Assignment_5;

import static java.lang.System.out;

interface Payment {
    void processPayment(double amount);
}

class CreditCardPayment implements Payment {
    public void processPayment(double amount) {
        out.println("Processing Credit Card Payment of Rs. " + amount);
    }
}

class UPIPayment implements Payment {
    public void processPayment(double amount) {
        out.println("Processing UPI Payment of Rs. " + amount);
    }
}

class NetBankingPayment implements Payment {
    public void processPayment(double amount) {
        out.println("Processing Net Banking Payment of Rs. " + amount);
    }
}

public class Assignment_5f {
    public static void main(String[] args) {

        Payment p;

        p = new CreditCardPayment();
        p.processPayment(5000);

        p = new UPIPayment();
        p.processPayment(2500);

        p = new NetBankingPayment();
        p.processPayment(10000);
    }
}