import java.util.Scanner;

class KnapsackResult
{
    private double maxProfit;

    public KnapsackResult(double maxProfit)
    {
        this.maxProfit = maxProfit;
    }

    public String toString()
    {
        return "Maximum profit: " + maxProfit;
    }
}

/* Logic class */
class FractionalKnapsack
{
    private int[] weight, profit;
    private int capacity;

    public FractionalKnapsack(int[] weight, int[] profit, int capacity)
    {
        this.weight = weight;
        this.profit = profit;
        this.capacity = capacity;
    }

    public KnapsackResult solve()
    {
        int n = weight.length;
        double[] ratio = new double[n];

        for (int i = 0; i < n; i++)
            ratio[i] = (double) profit[i] / weight[i];

        // Sort items by decreasing profit/weight ratio
        for (int i = 0; i < n - 1; i++)
        {
            for (int j = i + 1; j < n; j++)
            {
                if (ratio[i] < ratio[j])
                {
                    double tr = ratio[i]; ratio[i] = ratio[j]; ratio[j] = tr;
                    int tw = weight[i]; weight[i] = weight[j]; weight[j] = tw;
                    int tp = profit[i]; profit[i] = profit[j]; profit[j] = tp;
                }
            }
        }

        double totalProfit = 0;
        int remaining = capacity;

        for (int i = 0; i < n && remaining > 0; i++)
        {
            if (weight[i] <= remaining)
            {
                totalProfit += profit[i];
                remaining -= weight[i];
            }
            else
            {
                totalProfit += ratio[i] * remaining;
                remaining = 0;
            }
        }

        return new KnapsackResult(totalProfit);
    }
}

/* Driver class */
public class Assignment_6
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of items: ");
        int n = sc.nextInt();

        int[] weight = new int[n];
        int[] profit = new int[n];

        System.out.println("Enter weights:");
        for (int i = 0; i < n; i++)
            weight[i] = sc.nextInt();

        System.out.println("Enter profits:");
        for (int i = 0; i < n; i++)
            profit[i] = sc.nextInt();

        System.out.print("Enter knapsack capacity: ");
        int capacity = sc.nextInt();

        FractionalKnapsack obj = new FractionalKnapsack(weight, profit, capacity);
        System.out.println(obj.solve());

        sc.close();
    }
}