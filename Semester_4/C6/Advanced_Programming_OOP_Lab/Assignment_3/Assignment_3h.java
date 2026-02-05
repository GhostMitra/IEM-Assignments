package Assignment_3;

import java.util.Scanner;

class RentalCar {
    private double rate;
    private int days;

    public RentalCar(double rate, int days) {
        this.rate = rate;
        this.days = days;
    }

    public double getTotalFare() {
        return (days > 0) ? rate * days : 0;
    }
}

public class Assignment_3h {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Rate per day: ");
        double r = sc.nextDouble();

        System.out.print("Days: ");
        int d = sc.nextInt();

        RentalCar car = new RentalCar(r, d);

        System.out.println("Total Fare: " + car.getTotalFare());
        sc.close();
    }
}
