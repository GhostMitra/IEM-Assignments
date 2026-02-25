package Assignment_4;

class Animal {
    public void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

class Dog extends Animal {
    public void makeSound() {
        System.out.println("Woof!");
    }
}

class Cat extends Animal {
    public void makeSound() {
        System.out.println("Meow!");
    }
}

public class Assignment_4j {
    public static void main(String[] args) {

        // Direct calls
        Animal a = new Animal();
        Dog d = new Dog();
        Cat c = new Cat();

        System.out.println("Direct Calls:");
        a.makeSound();
        d.makeSound();
        c.makeSound();

        // Reference type calls (Polymorphism)
        System.out.println("\nReference Type Calls:");

        Animal ref;

        ref = new Dog();
        ref.makeSound();

        ref = new Cat();
        ref.makeSound();
    }
}