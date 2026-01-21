class PredefinedAdd {
    void add() {
        int a = 10, b = 20;
        System.out.println("Sum = " + (a + b));
    }
}

public class Assignment_3 {
    public static void main(String[] args) {
        PredefinedAdd obj = new PredefinedAdd();
        obj.add();
    }
}
