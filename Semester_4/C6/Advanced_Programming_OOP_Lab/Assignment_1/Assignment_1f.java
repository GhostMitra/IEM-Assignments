package Assignment_1;
import java.util.Scanner;

class ShoppingCart {
    private String itemName;
    private int qty;
    private float price;

    // Constructor
    ShoppingCart(String itemName, int qty, float price) {
        this.itemName = itemName;
        this.qty = qty;
        this.price = price;
    }

    float bill() {
        float total = qty * price;
        float finalAmt;

        if (total >= 2000)
            finalAmt = total - total * 0.15f;
        else if (total >= 1000)
            finalAmt = total - total * 0.10f;
        else
            finalAmt = total;

        return finalAmt;
    }

    void showDetails() {
        float total = qty * price;

        System.out.println("\nItem: " + itemName);
        System.out.println("Quantity: " + qty);
        System.out.println("Price per item: " + price);
        System.out.println("Total: " + total);
        System.out.println("Final Bill (after discount): " + bill());
    }
}

public class Assignment_1f {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter item name: ");
        String item = sc.nextLine();

        System.out.print("Enter quantity: ");
        int qty = sc.nextInt();

        System.out.print("Enter price: ");
        float price = sc.nextFloat();

        ShoppingCart cart = new ShoppingCart(item, qty, price);

        cart.showDetails();

        sc.close();
    }
}
