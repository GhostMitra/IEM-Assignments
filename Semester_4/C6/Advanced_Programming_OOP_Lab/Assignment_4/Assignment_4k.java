package Assignment_4;

class Vehicle {
    public void move() {
        System.out.println("Vehicle is moving");
    }
}

class Car extends Vehicle {
    public void move() {
        System.out.println("Car is driving fast");
    }
}

class Bike extends Vehicle {
    public void move() {
        System.out.println("Bike is riding");
    }
}

public class Assignment_4k {
    public static void main(String[] args) {

        Vehicle v;   // Parent reference

        v = new Car();
        v.move();

        v = new Bike();
        v.move();
    }
}