package Assignment_4;

class Vehicle {
    protected String name;
    protected int speed;

    public Vehicle(String n, int s) {
        name = n;
        speed = s;
    }
}

class Car extends Vehicle {
    private int mileage;

    public Car(String n, int s, int m) {
        super(n, s);        // calling Vehicle constructor
        mileage = m;
    }

    public void showCar() {
        System.out.println("\n--- Car Details ---");
        System.out.println("Name: " + name);
        System.out.println("Speed: " + speed);
        System.out.println("Mileage: " + mileage);
    }
}

class Bike extends Vehicle {
    private String fuelType;

    public Bike(String n, int s, String f) {
        super(n, s);        // calling Vehicle constructor
        fuelType = f;
    }

    public void showBike() {
        System.out.println("\n--- Bike Details ---");
        System.out.println("Name: " + name);
        System.out.println("Speed: " + speed);
        System.out.println("Fuel Type: " + fuelType);
    }
}

public class Assignment_4c {
    public static void main(String[] args) {

        Car c = new Car("Honda City", 180, 18);
        Bike b = new Bike("Yamaha R15", 140, "Petrol");

        c.showCar();
        b.showBike();
    }
}