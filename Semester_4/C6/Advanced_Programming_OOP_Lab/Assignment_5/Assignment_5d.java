package Assignment_5;

import java.util.Scanner;
import static java.lang.System.out;

abstract class Employee {
    protected String name;
    protected int id;

    public Employee(String n, int i) {
        name = n;
        id = i;
    }

    abstract double calculateSalary();

    public void displayEmployeeDetails() {
        out.println("Employee Name: " + name);
        out.println("Employee ID: " + id);
    }
}

class FullTimeEmployee extends Employee {
    private double monthlySalary;

    public FullTimeEmployee(String n, int i, double s) {
        super(n, i);
        monthlySalary = s;
    }

    public double calculateSalary() {
        return monthlySalary;
    }
}

class PartTimeEmployee extends Employee {
    private int hoursWorked;
    private double ratePerHour;

    public PartTimeEmployee(String n, int i, int h, double r) {
        super(n, i);
        hoursWorked = h;
        ratePerHour = r;
    }

    public double calculateSalary() {
        return hoursWorked * ratePerHour;
    }
}

public class Assignment_5d {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        out.print("Enter Full Time Employee Name: ");
        String fname = sc.nextLine();
        out.print("Enter Employee ID: ");
        int fid = sc.nextInt();
        out.print("Enter Monthly Salary: ");
        double fsalary = sc.nextDouble();
        sc.nextLine();

        FullTimeEmployee f = new FullTimeEmployee(fname, fid, fsalary);

        out.print("\nEnter Part Time Employee Name: ");
        String pname = sc.nextLine();
        out.print("Enter Employee ID: ");
        int pid = sc.nextInt();
        out.print("Enter Hours Worked: ");
        int hours = sc.nextInt();
        out.print("Enter Rate Per Hour: ");
        double rate = sc.nextDouble();

        PartTimeEmployee p = new PartTimeEmployee(pname, pid, hours, rate);

        out.println("\n--- Full Time Employee ---");
        f.displayEmployeeDetails();
        out.println("Salary: " + f.calculateSalary());

        out.println("\n--- Part Time Employee ---");
        p.displayEmployeeDetails();
        out.println("Salary: " + p.calculateSalary());

        sc.close();
    }
}