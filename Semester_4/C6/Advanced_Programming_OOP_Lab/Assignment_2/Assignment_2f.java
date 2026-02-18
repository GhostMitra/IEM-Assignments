package Assignment_2;
import java.util.Scanner;

class Mobile {
    private String brand;
    private String model;
    private double price;

    // Default Constructor
    Mobile() {
        brand = "Unknown";
        model = "Unknown";
        price = 0;
    }

    // Parameterized Constructor
    Mobile(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    void showMobile() {
        System.out.println("\nBrand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }
}

public class Assignment_2f {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Using Default Constructor:");
        Mobile m1 = new Mobile();
        m1.showMobile();

        System.out.println("\nUsing Parameterized Constructor:");
        System.out.print("Enter brand: ");
        String brand = sc.nextLine();

        System.out.print("Enter model: ");
        String model = sc.nextLine();

        System.out.print("Enter price: ");
        double price = sc.nextDouble();

        Mobile m2 = new Mobile(brand, model, price);
        m2.showMobile();

        sc.close();
    }
}
