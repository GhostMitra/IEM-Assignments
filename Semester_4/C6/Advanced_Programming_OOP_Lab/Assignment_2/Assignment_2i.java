package Assignment_2;
import java.util.Scanner;

class Product {
    private int productId;
    private String name;
    private int quantity;

    // Constructor with validation
    Product(int productId, String name, int quantity) {
        this.productId = productId;
        this.name = name;
        this.quantity = (quantity < 0) ? 0 : quantity;
    }

    void showProduct() {
        System.out.println("\nProduct ID: " + productId);
        System.out.println("Name: " + name);
        System.out.println("Quantity: " + quantity);
    }
}

public class Assignment_2i {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter product ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter product name: ");
        String name = sc.nextLine();

        System.out.print("Enter quantity: ");
        int qty = sc.nextInt();

        Product p = new Product(id, name, qty);

        p.showProduct();

        sc.close();
    }
}
