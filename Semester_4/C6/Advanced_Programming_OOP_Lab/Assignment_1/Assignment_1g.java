package Assignment_1;
import java.util.Scanner;

class Table {
    private int number;

    // Constructor
    Table(int number) {
        this.number = number;
    }

    void printTable() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}

public class Assignment_1g {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        Table t = new Table(num);

        System.out.println("\nMultiplication Table:");
        t.printTable();

        sc.close();
    }
}
