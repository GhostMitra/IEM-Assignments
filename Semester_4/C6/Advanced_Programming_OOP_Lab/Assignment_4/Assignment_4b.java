package Assignment_4;

class Animal {
    public void speak() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    public void speak() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    public void speak() {
        System.out.println("Cat meows");
    }
}

class Cow extends Animal {
    public void speak() {
        System.out.println("Cow moos");
    }
}

public class Assignment_4b {
    public static void main(String[] args) {

        Animal a;   // Parent reference

        a = new Dog();
        a.speak();

        a = new Cat();
        a.speak();

        a = new Cow();
        a.speak();
    }
}