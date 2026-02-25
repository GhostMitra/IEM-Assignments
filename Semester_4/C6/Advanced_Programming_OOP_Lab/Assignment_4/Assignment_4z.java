package Assignment_4;

class A {
    int x;

    A(int x) {
        this.x = x;
        System.out.println("Parent x = " + x);
    }
}

class B extends A {
    int y;

    B(int x, int y) {
        super(x);        // must be first line
        this.y = y;
        System.out.println("Child y = " + y);
    }
}

public class Assignment_4z {
    public static void main(String[] args) {

        B obj = new B(10, 20);
    }
}