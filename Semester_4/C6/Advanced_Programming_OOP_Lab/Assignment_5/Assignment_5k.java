package Assignment_5;

import static java.lang.System.out;

interface EmployeeRole {
    void describeRole();
}

class Manager implements EmployeeRole {
    public void describeRole() {
        out.println("Manager is responsible for managing the team and projects.");
    }
}

class Developer implements EmployeeRole {
    public void describeRole() {
        out.println("Developer is responsible for writing and maintaining code.");
    }
}

class Tester implements EmployeeRole {
    public void describeRole() {
        out.println("Tester is responsible for testing the software for bugs.");
    }
}

public class Assignment_5k {
    public static void main(String[] args) {

        EmployeeRole e;

        e = new Manager();
        e.describeRole();

        e = new Developer();
        e.describeRole();

        e = new Tester();
        e.describeRole();
    }
}