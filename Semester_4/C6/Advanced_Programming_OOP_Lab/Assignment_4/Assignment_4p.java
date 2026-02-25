package Assignment_4;

interface Resizable {
    void resize(int percent);
}

class Box implements Resizable {

    private int size;

    public Box(int s) {
        size = s;
    }

    public void resize(int percent) {
        size = size + (size * percent / 100);
    }

    public int getSize() {
        return size;
    }
}

public class Assignment_4p {
    public static void main(String[] args) {

        Box b = new Box(100);

        System.out.println("Original Size: " + b.getSize());

        b.resize(20);

        System.out.println("Size after 20% resize: " + b.getSize());
    }
}