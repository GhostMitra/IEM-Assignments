package Assignment_1;
import java.util.Scanner;

class Student {
    private String name;
    private int rollNumber;
    private float marks;

    Student(String n, int r, float m) {
        name = n;
        rollNumber = r;
        marks = m;
    }

    void display() {
        System.out.println("\nStudent Details:");
        System.out.println("Name : " + name);
        System.out.println("Roll Number : " + rollNumber);
        System.out.println("Marks : " + marks);
    }
}

public class Assignment_1a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String n = sc.nextLine();

        System.out.print("Enter roll number: ");
        int r = sc.nextInt();

        System.out.print("Enter marks: ");
        float m = sc.nextFloat();

        Student s = new Student(n, r, m);
        s.display();

        sc.close();
    }
}
