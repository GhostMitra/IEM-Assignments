package Assignment_2;
class CounterDemo {
    private static int count = 0;

    // Constructor increments counter
    CounterDemo() {
        count++;
        System.out.println("Object created. Total objects: " + count);
    }

    static int getCount() {
        return count;
    }
}

public class Assignment_2j {
    public static void main(String[] args) {

        CounterDemo obj1 = new CounterDemo();
        CounterDemo obj2 = new CounterDemo();
        CounterDemo obj3 = new CounterDemo();

        System.out.println("\nFinal Object Count: " + CounterDemo.getCount());
    }
}
