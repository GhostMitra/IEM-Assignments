package Assignment_4;

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows");
    }
}

public class Assignment_4ab {
    public static void main(String[] args) {

        Animal a;

        a = new Dog();   // Parent reference → Dog object
        a.sound();

        a = new Cat();   // Parent reference → Cat object
        a.sound();
    }
}