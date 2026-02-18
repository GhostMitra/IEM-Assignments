package Assignment_2;
class Car {
    private String brand;
    private int year;

    // Default Constructor
    Car() {
        brand = "Unknown";
        year = 0;
        System.out.println("Default constructor called");
    }

    // Constructor with brand (calls default first)
    Car(String brand) {
        this();   // calls Car()
        this.brand = brand;
        System.out.println("Brand constructor called");
    }

    // Constructor with brand and year (calls brand constructor)
    Car(String brand, int year) {
        this(brand);   // calls Car(String)
        this.year = year;
        System.out.println("Brand & Year constructor called");
    }

    void showCar() {
        System.out.println("\nBrand: " + brand);
        System.out.println("Year: " + year);
    }
}

public class Assignment_2g {
    public static void main(String[] args) {

        Car c1 = new Car();
        c1.showCar();

        Car c2 = new Car("Toyota");
        c2.showCar();

        Car c3 = new Car("Toyota", 2023);
        c3.showCar();
    }
}
