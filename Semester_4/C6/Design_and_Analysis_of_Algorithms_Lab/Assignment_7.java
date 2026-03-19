import java.util.Scanner;
import static java.lang.System.out;
import static java.lang.Math.max;

/* Result class to hold subset sum output */
class SubsetSumResult {
    private int maxSum;
    private int target;

    public SubsetSumResult(int maxSum, int target) {
        this.maxSum = maxSum;
        this.target = target;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Target Sum: ").append(target).append("\n");
        sb.append("Maximum sum that can be obtained is: ").append(maxSum);
        if (maxSum == target) {
            sb.append("\nExact subset found that matches the target!");
        } else {
            sb.append("\nNo exact subset found. Closest possible sum returned.");
        }
        return sb.toString();
    }
}

/* Processor class to encapsulate DP logic */
class SubsetSumProcessor {
    private int[] weights;
    private int target;

    public SubsetSumProcessor(int[] weights, int target) {
        this.weights = weights;
        this.target = target;
    }

    public SubsetSumResult process() {
        int n = weights.length;
        int[][] dp = new int[n + 1][target + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= target; j++) {
                if (weights[i - 1] > j) {
                    dp[i][j] = dp[i - 1][j];
                } else {
                    dp[i][j] = max(dp[i - 1][j], dp[i - 1][j - weights[i - 1]] + weights[i - 1]);
                }
            }
        }

        return new SubsetSumResult(dp[n][target], target);
    }
}

/* Driver class */
public class Assignment_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] weights = new int[n];
        out.print("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            weights[i] = sc.nextInt();
        }

        out.print("Input target sum: ");
        int target = sc.nextInt();

        SubsetSumProcessor processor = new SubsetSumProcessor(weights, target);
        out.println(processor.process());

        sc.close();
    }
}