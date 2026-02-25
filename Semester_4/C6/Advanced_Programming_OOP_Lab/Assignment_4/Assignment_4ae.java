package Assignment_4;

class A {
    void display() {
        System.out.println("Class A display()");
    }
}

class B extends A {
    // No overriding here
}

public class Assignment_4ae {
    public static void main(String[] args) {

        A obj = new B();
        obj.display();
    }
}