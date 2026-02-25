package Assignment_4;

class A {
    int x = 10;
}

class B extends A {
    int x = 20;
}

public class Assignment_4u {
    public static void main(String[] args) {

        A obj = new B();   // Parent reference → Child object

        System.out.println(obj.x);
    }
}