package Assignment_3;

import java.util.Scanner;

class Patient {
    private String diagnosis;

    public Patient(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getDiagnosis(String key) {
        return key.equals("DOC123") ? diagnosis : "Access Denied";
    }
}

public class Assignment_3c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter diagnosis: ");
        String d = sc.nextLine();

        Patient p = new Patient(d);

        System.out.print("Enter doctor key: ");
        String key = sc.nextLine();

        System.out.println(p.getDiagnosis(key));
        sc.close();
    }
}
