package Assignment_5;

import static java.lang.System.out;

interface Animal {
    void eat();
}

interface Pet extends Animal {
    void play();
}

class Dog implements Pet {

    public void eat() {
        out.println("Dog is eating food.");
    }

    public void play() {
        out.println("Dog is playing with a ball.");
    }
}

public class Assignment_5l {
    public static void main(String[] args) {

        Dog d = new Dog();

        d.eat();
        d.play();
    }
}