import java.util.Scanner;

/* Result class */
class TwoSumResult
{
    private int i, j;
    private boolean found;

    public TwoSumResult(int i, int j, boolean found)
    {
        this.i = i;
        this.j = j;
        this.found = found;
    }

    public String toString()
    {
        return found ?
            "Indices: " + i + ", " + j :
            "No valid pair found";
    }
}

/* Logic class */
class TwoSumFinder
{
    private int[] arr;
    private int target;

    public TwoSumFinder(int[] arr, int target)
    {
        this.arr = arr;
        this.target = target;
    }

    public TwoSumResult find()
    {
        int l = 0, r = arr.length - 1;
        while (l < r)
        {
            int sum = arr[l] + arr[r];
            if (sum == target)
            {
                return new TwoSumResult(l, r, true);
            }
            if (sum < target)
            {
                l++;
            }
            else
            {
                r--;
            }
        }
        return new TwoSumResult(-1, -1, false);
    }
}

/* Driver class */
public class Assignment_1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        if (n < 2)
        {
            System.out.println("At least two elements are required for the Two Sum problem.");
            sc.close();
            return;
        }

        int[] arr = new int[n];
        System.out.println("Enter the elements of the sorted array:");
        for (int i = 0; i < n; i++)
        {
            System.out.print("Enter element number " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        if (!isSorted(arr))
        {
            System.out.println("Error: The input array is not sorted. The two-pointer approach requires a sorted array.");
            sc.close();
            return;
        }

        System.out.print("Enter the target sum: ");
        int target = sc.nextInt();

        TwoSumFinder obj = new TwoSumFinder(arr, target);
        System.out.println("Searching for a pair with the sum " + target + "...");
        System.out.println(obj.find());
        sc.close();
    }

    private static boolean isSorted(int[] arr)
    {
        for (int i = 0; i < arr.length - 1; i++)
        {
            if (arr[i] > arr[i + 1])
            {
                return false;
            }
        }
        return true;
    }
}
