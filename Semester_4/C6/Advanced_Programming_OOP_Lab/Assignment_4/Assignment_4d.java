package Assignment_4;

class Appliance {
    protected String brand;
    protected int power;

    public void setAppliance(String b, int p) {
        brand = b;
        power = p;
    }
}

class WashingMachine extends Appliance {
    protected int capacity;

    public void setWashingMachine(int c) {
        capacity = c;
    }
}

class SmartWashingMachine extends WashingMachine {
    private boolean wifi;

    public void setSmart(boolean w) {
        wifi = w;
    }

    public void showDetails() {
        System.out.println("\n--- Smart Washing Machine Details ---");
        System.out.println("Brand: " + brand);
        System.out.println("Power: " + power + " W");
        System.out.println("Capacity: " + capacity + " kg");
        System.out.println("WiFi Enabled: " + wifi);
    }
}

public class Assignment_4d {
    public static void main(String[] args) {

        SmartWashingMachine swm = new SmartWashingMachine();

        swm.setAppliance("LG", 500);
        swm.setWashingMachine(7);
        swm.setSmart(true);

        swm.showDetails();
    }
}