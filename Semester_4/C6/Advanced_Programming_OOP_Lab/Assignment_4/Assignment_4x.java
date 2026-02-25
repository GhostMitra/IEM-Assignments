package Assignment_4;

class Demo {

    // Default constructor
    Demo() {
        System.out.println("Default");
    }

    // Parameterized constructor
    Demo(int x) {
        System.out.println("Parameterized");
    }
}

public class Assignment_4x {
    public static void main(String[] args) {

        Demo d1 = new Demo();     
        Demo d2 = new Demo(10);  
    }
}