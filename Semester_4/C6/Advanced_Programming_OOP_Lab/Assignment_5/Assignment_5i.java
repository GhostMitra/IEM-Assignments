package Assignment_5;

import static java.lang.System.out;

interface Vehicle {

    void start(); // abstract method

    default void stop() { // default method
        out.println("Vehicle has stopped.");
    }
}

class Car implements Vehicle {

    public void start() {
        out.println("Car starts with a key ignition.");
    }
}

class Bike implements Vehicle {

    public void start() {
        out.println("Bike starts with a self starter.");
    }
}

public class Assignment_5i {
    public static void main(String[] args) {

        Car c = new Car();
        Bike b = new Bike();

        out.println("--- Car ---");
        c.start();
        c.stop();

        out.println("\n--- Bike ---");
        b.start();
        b.stop();
    }
}