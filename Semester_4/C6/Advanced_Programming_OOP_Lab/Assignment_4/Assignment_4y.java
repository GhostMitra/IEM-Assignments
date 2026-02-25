package Assignment_4;

class A {
    A() {
        System.out.println("A");
    }
}

class B extends A {
    B() {
        System.out.println("B");
    }
}

public class Assignment_4y {
    public static void main(String[] args) {

        A obj = new B();
    }
}