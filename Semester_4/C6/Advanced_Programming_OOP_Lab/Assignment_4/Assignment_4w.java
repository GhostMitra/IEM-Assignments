package Assignment_4;

class A {
    void show() {
        System.out.println("Class A show()");
    }
}

class B extends A {

    // Overriding
    void show() {
        System.out.println("Class B show()");
    }

    // Overloading (same class, different parameter)
    void show(int x) {
        System.out.println("Class B show(int): " + x);
    }
}

public class Assignment_4w {
    public static void main(String[] args) {

        B obj1 = new B();

        System.out.println("Using B object:");
        obj1.show();       
        obj1.show(10);    

        System.out.println("\nUsing parent reference:");

        A obj2 = new B();
        obj2.show();      

        // obj2.show(10); ❌ Not allowed (A doesn't know show(int))
    }
}