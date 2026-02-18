package Assignment_1;
import java.util.Scanner;

class Student {
    private String name;
    private float marks;

    // Constructor
    Student(String name, float marks) {
        this.name = name;
        this.marks = marks;
    }

    void printDetails() {
        System.out.println("\nName: " + name);
        System.out.println("Marks: " + marks);
        printGrade();
    }

    void printGrade() {
        if (marks >= 90)
            System.out.println("Grade: A");
        else if (marks >= 75)
            System.out.println("Grade: B");
        else if (marks >= 60)
            System.out.println("Grade: C");
        else
            System.out.println("Grade: Fail");
    }
}

public class Assignment_1b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter marks: ");
        float marks = sc.nextFloat();

        // Using constructor
        Student s = new Student(name, marks);

        s.printDetails();

        sc.close();
    }
}
