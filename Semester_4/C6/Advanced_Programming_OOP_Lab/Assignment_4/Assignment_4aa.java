package Assignment_4;

class A {

    // Overloaded constructors (allowed)
    A() {
        System.out.println("A Default Constructor");
    }

    A(int x) {
        System.out.println("A Parameterized Constructor: " + x);
    }
}

class B extends A {

    // This is NOT overriding — it is a new constructor (constructors are not inherited)
    B() {
        System.out.println("B Default Constructor");
    }

    /*
    ❌ Trying to override constructor (INVALID in Java)

    A() {
        System.out.println("Trying to override");
    }

    Compile-time error:
    Constructor A() is undefined / Constructors are not inherited
    */

}

public class Assignment_4aa {
    public static void main(String[] args) {

        A a1 = new A();
        A a2 = new A(10);

        B b1 = new B();
    }
}