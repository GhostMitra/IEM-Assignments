package Assignment_3;

import java.util.Scanner;

class Book {
    private boolean isIssued = false;

    public boolean issueBook() {
        if (isIssued)
            return false;
        isIssued = true;
        return true;
    }

    public void returnBook() {
        isIssued = false;
    }
}

public class Assignment_3f {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book b = new Book();

        System.out.println("1. Issue Book");
        System.out.println("2. Return Book");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        if (choice == 1) {
            if (b.issueBook())
                System.out.println("Book issued successfully");
            else
                System.out.println("Book already issued!");
        }
        else if (choice == 2) {
            b.returnBook();
            System.out.println("Book returned successfully");
        }
        else {
            System.out.println("Invalid choice");
        }

        sc.close();
    }
}
