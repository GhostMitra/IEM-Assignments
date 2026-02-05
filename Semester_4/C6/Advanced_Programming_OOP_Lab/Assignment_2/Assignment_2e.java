package Assignment_2;
import java.util.Scanner;

class Book {
    private String title;
    private String author;
    private double price;

    // Constructor with same parameter names (uses this keyword)
    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void showBook() {
        System.out.println("\nTitle: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

public class Assignment_2e {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter title: ");
        String title = sc.nextLine();

        System.out.print("Enter author: ");
        String author = sc.nextLine();

        System.out.print("Enter price: ");
        double price = sc.nextDouble();

        Book b = new Book(title, author, price);

        b.showBook();

        sc.close();
    }
}
