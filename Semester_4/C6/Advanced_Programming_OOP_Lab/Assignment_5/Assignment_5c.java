package Assignment_5;

import static java.lang.System.out;

abstract class Bank {
    abstract double getInterestRate();
}

class SBI extends Bank {
    public double getInterestRate() {
        return 6.5;
    }
}

class HDFC extends Bank {
    public double getInterestRate() {
        return 7.0;
    }
}

class ICICI extends Bank {
    public double getInterestRate() {
        return 6.8;
    }
}

public class Assignment_5c {
    public static void main(String[] args) {

        Bank b;

        b = new SBI();
        out.println("SBI Interest Rate: " + b.getInterestRate() + "%");

        b = new HDFC();
        out.println("HDFC Interest Rate: " + b.getInterestRate() + "%");

        b = new ICICI();
        out.println("ICICI Interest Rate: " + b.getInterestRate() + "%");
    }
}