import java.util.Scanner;
import static java.lang.System.out;
import static java.lang.Math.max;
public class Assignment_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        out.print("Enter number of elements: ");
        int n = sc.nextInt();
        out.print("Enter the elements of the array: ");
        int[] weight = new int[n];
        for (int i = 0; i < n; i++) {
            weight[i] = sc.nextInt();
        }
        out.print("Input target sum: ");
        int target = sc.nextInt();
        int[][] dp = new int[n + 1][target + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= target; j++) {
                if (weight[i-1] > j) {
                    dp[i][j] = dp[i - 1][j];
                } else {
                    dp[i][j] = max(dp[i - 1][j], dp[i - 1][j - weight[i-1]] + weight[i-1]);
                }
            }
        }
        out.println("Maximum sum that can be obtained is: " + dp[n][target]);
        sc.close();
    }
}