package Assignment_4;

import java.util.Scanner;

class Person {
    protected String name;
    protected int age;

    public void setPerson(String n, int a) {
        name = n;
        age = a;
    }
}

class Student extends Person {
    private int roll;
    private String course;

    public void setStudent(int r, String c) {
        roll = r;
        course = c;
    }

    public void showStudent() {
        System.out.println("\n--- Student Details ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll No: " + roll);
        System.out.println("Course: " + course);
    }
}

class Teacher extends Person {
    private String subject;
    private double salary;

    public void setTeacher(String s, double sal) {
        subject = s;
        salary = sal;
    }

    public void showTeacher() {
        System.out.println("\n--- Teacher Details ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Subject: " + subject);
        System.out.println("Salary: " + salary);
    }
}

public class Assignment_4a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student st = new Student();
        Teacher tr = new Teacher();

        // Student input
        System.out.print("Enter student name: ");
        String sname = sc.nextLine();
        System.out.print("Enter student age: ");
        int sage = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter roll number: ");
        int roll = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter course: ");
        String course = sc.nextLine();

        st.setPerson(sname, sage);
        st.setStudent(roll, course);

        // Teacher input
        System.out.print("\nEnter teacher name: ");
        String tname = sc.nextLine();
        System.out.print("Enter teacher age: ");
        int tage = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter subject: ");
        String subject = sc.nextLine();
        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();

        tr.setPerson(tname, tage);
        tr.setTeacher(subject, salary);

        // Output
        st.showStudent();
        tr.showTeacher();

        sc.close();
    }
}