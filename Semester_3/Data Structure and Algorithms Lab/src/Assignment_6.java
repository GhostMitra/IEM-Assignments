// You are tasked with implementing an inventory management system for a retail store. The
// system should handle adding, updating, and querying products in the inventory using arrays.
// a. Implement a function to add a new product to the inventory.
// b. Implement a function to update the quantity of a product based on its ID.
// c. Implement a function to find a product by its ID and return its details.
// d. Implement a function to calculate the total value of the inventory (the sum of the
//    price * quantity for all products).

import java.util.Scanner;

class Product 
{
    private final int id;
    private final String name;
    private final double price;
    private int quantity;

    public Product(int id, String name, double price, int quantity) 
    {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters and setters
    public int getId() { return id; }

    public double getPrice() { return price; }

    public int getQuantity() { return quantity; }

    public void setQuantity(int quantity) { this.quantity = quantity; }

    public String getDetails()
    {
        return "ID: " + id + ", Name: " + name +
                ", Price: " + price + ", Quantity: " + quantity;
    }
}

class Inventory 
{
    private final Product[] products;
    private int size;       // Number of products currently in inventory
    private final int capacity;   // Max capacity

    public Inventory(int capacity) 
    {
        this.capacity = capacity;
        this.products = new Product[capacity];
        this.size = 0;
    }

    // a. Add new product
    // Returns true if added successfully, false if inventory full or product ID already exists
    public boolean addProduct(Product product) 
    {
        if (size == capacity) 
        {
            System.out.println("Inventory full! Cannot add more products.");
            return false;
        }
        if (findProductIndexById(product.getId()) != -1) 
        {
            System.out.println("Product with ID " + product.getId() + " already exists.");
            return false;
        }
        products[size++] = product;
        return true;
    }

    // b. Update quantity of product by ID
    // Returns true if update successful, false if product not found
    public boolean updateQuantityById(int id, int newQuantity) 
    {
        int index = findProductIndexById(id);
        if (index == -1) 
        {
            System.out.println("Product with ID " + id + " not found.");
            return false;
        }
        products[index].setQuantity(newQuantity);
        return true;
    }

    // c. Find product by ID and return details (or null if not found)
    public String findProductDetailsById(int id) 
    {
        int index = findProductIndexById(id);
        if (index == -1) 
        {
            return null;
        }
        return products[index].getDetails();
    }

    // Helper to find product index by ID, returns -1 if not found
    private int findProductIndexById(int id) 
    {
        for (int i = 0; i < size; i++) 
        {
            if (products[i].getId() == id) return i;
        }
        return -1;
    }

    // d. Calculate total value of inventory: sum of (price * quantity)
    public double calculateTotalValue() 
    {
        double total = 0;
        for (int i = 0; i < size; i++) 
        {
            total += products[i].getPrice() * products[i].getQuantity();
        }
        return total;
    }

    // Additional method: display all products (for convenience)
    public void displayAllProducts() 
    {
        if (size == 0) 
        {
            System.out.println("No products in inventory.");
            return;
        }
        System.out.println("Inventory Products:");
        for (int i = 0; i < size; i++) 
        {
            System.out.println(products[i].getDetails());
        }
    }
}

public class Assignment_6 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter maximum number of products inventory can hold: ");
        int capacity = scanner.nextInt();
        scanner.nextLine();  // consume newline

        Inventory inventory = new Inventory(capacity);

        boolean exit = false;
        while (!exit) 
        {
            System.out.println("\nInventory Management Menu:");
            System.out.println("1. Add new product");
            System.out.println("2. Update product quantity");
            System.out.println("3. Find product by ID");
            System.out.println("4. Calculate total inventory value");
            System.out.println("5. Display all products");
            System.out.println("6. Exit");
            System.out.print("Enter your choice (1-6): ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // consume newline

            switch (choice) 
            {
                case 1:
                    System.out.print("Enter product ID (integer): ");
                    int id = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter product name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter product price: ");
                    double price = scanner.nextDouble();

                    System.out.print("Enter product quantity: ");
                    int quantity = scanner.nextInt();

                    Product newProduct = new Product(id, name, price, quantity);
                    if(inventory.addProduct(newProduct)) 
                    {
                        System.out.println("Product added successfully.");
                    }
                    break;

                case 2:
                    System.out.print("Enter product ID to update: ");
                    int updateId = scanner.nextInt();

                    System.out.print("Enter new quantity: ");
                    int newQuantity = scanner.nextInt();

                    if (inventory.updateQuantityById(updateId, newQuantity)) 
                    {
                        System.out.println("Quantity updated successfully.");
                    }
                    break;

                case 3:
                    System.out.print("Enter product ID to find: ");
                    int findId = scanner.nextInt();

                    String details = inventory.findProductDetailsById(findId);
                    if (details != null) 
                    {
                        System.out.println("Product details: " + details);
                    }
                    else
                    {
                        System.out.println("Product not found.");
                    }
                    break;

                case 4:
                    double totalValue = inventory.calculateTotalValue();
                    System.out.printf("Total inventory value: %.2f\n", totalValue);
                    break;

                case 5:
                    inventory.displayAllProducts();
                    break;

                case 6:
                    exit = true;
                    System.out.println("Exiting Inventory Management System. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice! Please enter a number between 1 and 6.");
            }
        }

        scanner.close();
    }
}
