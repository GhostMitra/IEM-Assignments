package Assignment_1;
import java.util.Scanner;

class Weather {
    private String city;
    private float temp;
    private int humidity;

    // Constructor
    Weather(String city, float temp, int humidity) {
        this.city = city;
        this.temp = temp;
        this.humidity = humidity;
    }

    // Returns message instead of void
    String getWeatherReport() {

        if (temp > 35) {
            if (humidity > 70)
                return "Very Hot — Drink water";
            else
                return "Very Hot";
        }
        else if (temp >= 20)
            return "Moderate Weather";
        else
            return "Cold Weather";
    }

    void printDetails() {
        System.out.println("\nCity: " + city);
        System.out.println("Temperature: " + temp);
        System.out.println("Humidity: " + humidity);
        System.out.println("Status: " + getWeatherReport());
    }
}

public class Assignment_1d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter city: ");
        String city = sc.nextLine();

        System.out.print("Enter temperature: ");
        float temp = sc.nextFloat();

        System.out.print("Enter humidity: ");
        int humidity = sc.nextInt();

        Weather w = new Weather(city, temp, humidity);

        w.printDetails();

        sc.close();
    }
}
