package Assignment_4;

class A {
    int x = 10;
}

class B extends A {
    int x = 20;

    public void show() {
        int x = 30;   // local variable

        System.out.println("x = " + x);           // local
        System.out.println("this.x = " + this.x); // class B variable
        System.out.println("super.x = " + super.x); // class A variable
    }
}

public class Assignment_4t {
    public static void main(String[] args) {

        B obj = new B();
        obj.show();
    }
}