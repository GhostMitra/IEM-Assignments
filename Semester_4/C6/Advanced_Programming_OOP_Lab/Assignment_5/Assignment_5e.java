package Assignment_5;

import static java.lang.System.out;

abstract class Machine {

    abstract void start();

    final void stop() {
        out.println("Machine has stopped.");
    }

    static void machineInfo() {
        out.println("Machines are devices used to perform work.");
    }
}

class WashingMachine extends Machine {

    public void start() {
        out.println("Washing Machine has started washing clothes.");
    }
}

public class Assignment_5e {
    public static void main(String[] args) {

        WashingMachine wm = new WashingMachine();

        wm.start();   // calling abstract method implementation
        wm.stop();    // calling final method

        Machine.machineInfo(); // calling static method using abstract class name
    }
}