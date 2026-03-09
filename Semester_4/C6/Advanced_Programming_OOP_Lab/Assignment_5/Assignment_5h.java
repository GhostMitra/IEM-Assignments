package Assignment_5;

import static java.lang.System.out;

interface UniversityRules {

    int MAX_MARKS = 100;
    int MIN_ATTENDANCE = 75;
}

class Student implements UniversityRules {

    public void displayRules() {
        out.println("Maximum Marks: " + MAX_MARKS);
        out.println("Minimum Attendance Percentage: " + MIN_ATTENDANCE + "%");

        // Attempt to modify (will cause error because interface variables are final)
        // MAX_MARKS = 120;
        // MIN_ATTENDANCE = 80;
    }
}

public class Assignment_5h {
    public static void main(String[] args) {

        Student s = new Student();
        s.displayRules();
    }
}