import java.util.Scanner;

/* Result class */
class MinMaxResult
{
    private int min, max;
    private boolean valid;

    public MinMaxResult(int min, int max, boolean valid)
    {
        this.min = min;
        this.max = max;
        this.valid = valid;
    }

    public int getMin()
    {
        return min;
    }
    public int getMax()
    {
        return max;
    }

    public String toString()
    {
        return valid ?
            "Minimum: " + min + "\nMaximum: " + max :
            "Invalid Array";
    }
}

/* Logic class */
class MinMaxFinder
{
    private int[] arr;

    public MinMaxFinder(int[] arr)
    {
        this.arr = arr;
    }

    private MinMaxResult solve(int low, int high)
    {
        if (low == high)
        {
            return new MinMaxResult(arr[low], arr[low], true);
        }

        int mid = low + (high - low) / 2;
        MinMaxResult left = solve(low, mid);
        MinMaxResult right = solve(mid + 1, high);

        int min = left.getMin() < right.getMin() ? left.getMin() : right.getMin();
        int max = left.getMax() > right.getMax() ? left.getMax() : right.getMax();

        return new MinMaxResult(min, max, true);
    }

    public MinMaxResult process()
    {
        if (arr == null || arr.length == 0)
        {
            return new MinMaxResult(0, 0, false);
        }

        return solve(0, arr.length - 1);
    }
}

/* Driver class */
public class Assignment_0
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        if (n > 0)
        {
            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < n; i++)
            {
                System.out.print("Enter element number " + (i + 1) + ": ");
                arr[i] = sc.nextInt();
            }
        }

        MinMaxFinder obj = new MinMaxFinder(arr);
        System.out.println("Finding the minimum and maximum elements...");
        System.out.println(obj.process());
        sc.close();
    }
}
