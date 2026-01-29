public class Assignment_10 {

    // Method with two int parameters
    int add(int a, int b) {
        return a + b;
    }

    // Method with three int parameters
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method with two double parameters
    double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println(calc.add(2, 3));        // calls add(int, int)
        System.out.println(calc.add(1, 2, 3));     // calls add(int, int, int)
        System.out.println(calc.add(2.5, 3.5));    // calls add(double, double)
    }
}
