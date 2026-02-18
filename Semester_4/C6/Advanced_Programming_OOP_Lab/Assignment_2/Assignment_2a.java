package Assignment_2;
import java.util.Scanner;

class Student {
    private String name;
    private int roll;
    private String dept;

    // Parameterized Constructor
    Student(String name, int roll, String dept) {
        this.name = name;
        this.roll = roll;
        this.dept = dept;
    }

    void showDetails() {
        System.out.println("\nStudent Name: " + name);
        System.out.println("Roll Number: " + roll);
        System.out.println("Department: " + dept);
    }
}

public class Assignment_2a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter roll: ");
        int roll = sc.nextInt();
        sc.nextLine(); // clear buffer

        System.out.print("Enter department: ");
        String dept = sc.nextLine();

        Student s = new Student(name, roll, dept);

        s.showDetails();

        sc.close();
    }
}
