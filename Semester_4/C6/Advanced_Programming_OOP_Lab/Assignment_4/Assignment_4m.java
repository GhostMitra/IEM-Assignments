package Assignment_4;

class Employee {
    public void work() {
        System.out.println("Employee is working");
    }
}

class Manager extends Employee {
    public void work() {
        System.out.println("Manager is managing team");
    }
}

public class Assignment_4m {
    public static void main(String[] args) {

        // Direct objects
        Employee e = new Employee();
        Manager m = new Manager();

        System.out.println("Direct Calls:");
        e.work();
        m.work();

        // Superclass reference
        System.out.println("\nSuperclass Reference Calls:");

        Employee ref;

        ref = new Manager();
        ref.work();
    }
}