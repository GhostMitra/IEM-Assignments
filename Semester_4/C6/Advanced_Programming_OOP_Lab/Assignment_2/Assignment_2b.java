package Assignment_2;
import java.util.Scanner;

class Employee {
    private int empId;
    private String name;
    private double basicPay;

    // Parameterized Constructor
    Employee(int empId, String name, double basicPay) {
        this.empId = empId;
        this.name = name;
        this.basicPay = basicPay;
    }

    double grossSalary() {
        double hra = 0.20 * basicPay;
        double da  = 0.10 * basicPay;
        return basicPay + hra + da;
    }

    void showSlip() {
        System.out.println("\nEmployee ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Basic Pay: " + basicPay);
        System.out.println("Gross Salary: " + grossSalary());
    }
}

public class Assignment_2b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter employee ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter basic pay: ");
        double basic = sc.nextDouble();

        Employee emp = new Employee(id, name, basic);

        emp.showSlip();

        sc.close();
    }
}
