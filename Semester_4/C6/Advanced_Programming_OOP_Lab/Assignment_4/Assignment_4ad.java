package Assignment_4;

class A {
    int x = 10;

    void show() {
        System.out.println("A show()");
    }
}

class B extends A {
    int x = 20;

    void show() {
        System.out.println("B show()");
    }
}

public class Assignment_4ad {
    public static void main(String[] args) {

        A obj = new B();

        System.out.println(obj.x);  // variable access
        obj.show();                 // method call
    }
}