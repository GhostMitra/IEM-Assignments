package Assignment_5;

import java.util.Scanner;
import static java.lang.System.out;

abstract class Vehicle {
    protected int speed;

    public Vehicle(int s) {
        speed = s;
    }

    abstract void move();

    public void showSpeed() {
        out.println("Speed: " + speed + " km/h");
    }
}

class Car extends Vehicle {

    public Car(int s) {
        super(s);
    }

    public void move() {
        out.println("Car is moving on four wheels.");
    }
}

class Bike extends Vehicle {

    public Bike(int s) {
        super(s);
    }

    public void move() {
        out.println("Bike is moving on two wheels.");
    }
}

public class Assignment_5b {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        out.print("Enter speed of Car: ");
        int carSpeed = sc.nextInt();

        out.print("Enter speed of Bike: ");
        int bikeSpeed = sc.nextInt();

        Car c = new Car(carSpeed);
        Bike b = new Bike(bikeSpeed);

        out.println("\n--- Car Details ---");
        c.showSpeed();
        c.move();

        out.println("\n--- Bike Details ---");
        b.showSpeed();
        b.move();

        sc.close();
    }
}