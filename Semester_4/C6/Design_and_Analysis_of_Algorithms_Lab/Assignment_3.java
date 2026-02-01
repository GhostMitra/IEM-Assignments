import java.util.Scanner;
import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.MIN_VALUE;

/* Result class */
class ExtremeResult {
    private int min;
    private int secondMin;
    private int max;
    private int secondMax;

    public ExtremeResult(int min, int secondMin, int max, int secondMax) {
        this.min = min;
        this.secondMin = secondMin;
        this.max = max;
        this.secondMax = secondMax;
    }

    public int getMin() {
        return min;
    }

    public int getSecondMin() {
        return secondMin;
    }

    public int getMax() {
        return max;
    }

    public int getSecondMax() {
        return secondMax;
    }

    @Override
    public String toString() {
        return "Minimum: " + min +
               "\nSecond Minimum: " + secondMin +
               "\nMaximum: " + max +
               "\nSecond Maximum: " + secondMax;
    }
}

/* Logic class */
class ExtremeFinder {
    private int[] arr;

    public ExtremeFinder(int[] arr) {
        this.arr = arr;
    }

    private ExtremeResult solve(int low, int high) {

        // Base case: single element
        if (low == high) {
            return new ExtremeResult(arr[low], MAX_VALUE, arr[low], MIN_VALUE);
        }

        int mid = low + (high - low) / 2;

        ExtremeResult L = solve(low, mid);
        ExtremeResult R = solve(mid + 1, high);

        int min = (L.getMin() < R.getMin()) ? L.getMin() : R.getMin();
        int max = (L.getMax() > R.getMax()) ? L.getMax() : R.getMax();

        int secondMin;
        if (L.getMin() < R.getMin())
            secondMin = (L.getSecondMin() < R.getMin()) ? L.getSecondMin() : R.getMin();
        else
            secondMin = (R.getSecondMin() < L.getMin()) ? R.getSecondMin() : L.getMin();

        int secondMax;
        if (L.getMax() > R.getMax())
            secondMax = (L.getSecondMax() > R.getMax()) ? L.getSecondMax() : R.getMax();
        else
            secondMax = (R.getSecondMax() > L.getMax()) ? R.getSecondMax() : L.getMax();

        return new ExtremeResult(min, secondMin, max, secondMax);
    }

    public ExtremeResult process() {
        return solve(0, arr.length - 1);
    }
}

/* Driver class */
public class Assignment_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        ExtremeFinder obj = new ExtremeFinder(arr);
        System.out.println(obj.process());

        sc.close();
    }
}
