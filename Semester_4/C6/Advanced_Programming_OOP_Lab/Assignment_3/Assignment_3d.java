package Assignment_3;

import java.util.Scanner;

class Product {
    private int stock;

    public Product(int stock) {
        this.stock = stock;
    }

    public void purchase(int qty) {
        if (qty > 0 && stock >= qty)
            stock -= qty;
        else
            System.out.println("Not enough stock");
    }

    public int getStock() {
        return stock;
    }
}

public class Assignment_3d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Initial stock: ");
        Product p = new Product(sc.nextInt());

        System.out.print("Purchase qty: ");
        p.purchase(sc.nextInt());

        System.out.println("Remaining stock: " + p.getStock());
        sc.close();
    }
}
