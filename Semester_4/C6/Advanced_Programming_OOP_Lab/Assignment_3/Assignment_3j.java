package Assignment_3;

import java.util.Scanner;

class Thermostat {
    private int temperature;

    public void setTemperature(int t) {
        if (t < 16) temperature = 16;
        else if (t > 30) temperature = 30;
        else temperature = t;
    }

    public int getTemperature() {
        return temperature;
    }
}

public class Assignment_3j {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Thermostat t = new Thermostat();

        System.out.print("Set temperature: ");
        t.setTemperature(sc.nextInt());

        System.out.println("Actual temperature: " + t.getTemperature());
        sc.close();
    }
}
