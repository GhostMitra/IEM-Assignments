package Assignment_4;

interface Flyable {
    void fly();
}

class Bird implements Flyable {
    public void fly() {
        System.out.println("Bird is flying");
    }
}

class Airplane implements Flyable {
    public void fly() {
        System.out.println("Airplane is flying high");
    }
}

public class Assignment_4q {
    public static void main(String[] args) {

        Flyable[] f = new Flyable[2];

        f[0] = new Bird();
        f[1] = new Airplane();

        for (int i = 0; i < f.length; i++) {
            f[i].fly();
        }
    }
}