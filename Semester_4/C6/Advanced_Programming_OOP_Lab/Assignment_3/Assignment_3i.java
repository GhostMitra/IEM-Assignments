package Assignment_3;

import java.util.Scanner;

class Candidate {
    private int age;

    public Candidate(int age) {
        this.age = age;
    }

    public boolean isEligible() {
        return age >= 18;
    }
}

public class Assignment_3i {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        Candidate c = new Candidate(sc.nextInt());

        System.out.println("Eligible: " + c.isEligible());
        sc.close();
    }
}
