package Assignment_3;

import java.util.Scanner;

class Student {
    private int roll, marks;
    private String name;

    public Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    public void setMarks(int marks) {
        this.marks = (marks >= 0 && marks <= 100) ? marks : 0;
    }

    public int getMarks() {
        return marks;
    }
}

public class Assignment_3b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Roll: ");
        int r = sc.nextInt();
        sc.nextLine();

        System.out.print("Name: ");
        String n = sc.nextLine();

        Student s = new Student(r, n);

        System.out.print("Enter marks: ");
        s.setMarks(sc.nextInt());

        System.out.println("Valid Marks: " + s.getMarks());
        sc.close();
    }
}
