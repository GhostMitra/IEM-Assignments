package Assignment_3;

import java.util.Scanner;

class Employee {
    private double basic;

    public Employee(double basic) {
        this.basic = basic;
    }

    public double getGross() {
        return basic + 0.2 * basic + 0.1 * basic;
    }
}

public class Assignment_3e {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter basic salary: ");
        Employee e = new Employee(sc.nextDouble());

        System.out.println("Gross Salary: " + e.getGross());
        sc.close();
    }
}
