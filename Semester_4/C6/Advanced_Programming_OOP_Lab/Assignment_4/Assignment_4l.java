package Assignment_4;

class Shape {
    public void draw() {
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape {
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

class Square extends Shape {
    public void draw() {
        System.out.println("Drawing a square");
    }
}

class Triangle extends Shape {
    public void draw() {
        System.out.println("Drawing a triangle");
    }
}

public class Assignment_4l {
    public static void main(String[] args) {

        Shape[] shapes = new Shape[4];

        shapes[0] = new Shape();
        shapes[1] = new Circle();
        shapes[2] = new Square();
        shapes[3] = new Triangle();

        for (int i = 0; i < shapes.length; i++) {
            shapes[i].draw();
        }
    }
}