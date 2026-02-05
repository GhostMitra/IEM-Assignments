package temp_java_assignment;
class PredefinedAdd {
    int add() {
        int a = 10, b = 20;
        return a + b;
    }
}

public class Assignment_3 {
    public static void main(String[] args) {
        PredefinedAdd obj = new PredefinedAdd();
        int result = obj.add();
        System.out.println("Sum = " + result);
    }
}
