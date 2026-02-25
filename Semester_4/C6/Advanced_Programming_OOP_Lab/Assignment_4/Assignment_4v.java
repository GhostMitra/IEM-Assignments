package Assignment_4;

class A {
    void show() {
        System.out.println("Class A show() method");
    }
}

class B extends A {
    void show() {
        System.out.println("Class B show() method");
    }
}

public class Assignment_4v {
    public static void main(String[] args) {

        A obj = new B();   // Parent reference → Child object
        obj.show();
    }
}