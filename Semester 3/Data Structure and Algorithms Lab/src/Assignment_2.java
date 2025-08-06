import java.util.Scanner;

class MissingNumberFinder {
    private int[] arr;
    private int n;

    MissingNumberFinder(int[] arr, int n) {
        this.arr = arr;
        this.n = n;
    }

    int findMissingNumber() {
        int totalSum = n * (n + 1) / 2;
        int arrSum = 0;
        for (int value : arr) {
            arrSum += value;
        }
        return totalSum - arrSum;
    }
}

public class Assignment_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n (the range's maximum value): ");
        int n = sc.nextInt();
        int[] arr = new int[n - 1];
        System.out.println("Enter " + (n - 1) + " unique numbers in range 1 to " + n + ":");
        for (int i = 0; i < n - 1; i++) {
            arr[i] = sc.nextInt();
        }

        MissingNumberFinder finder = new MissingNumberFinder(arr, n);
        int missing = finder.findMissingNumber();

        System.out.println("The missing number is: " + missing);

        sc.close();
    }
}
