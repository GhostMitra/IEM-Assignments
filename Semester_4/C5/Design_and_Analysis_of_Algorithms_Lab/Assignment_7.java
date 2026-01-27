import java.util.Scanner;
class SecondResult
{
    int min, secondMin, max, secondMax;

    public SecondResult(int min, int secondMin, int max, int secondMax)
    {
        this.min = min;
        this.secondMin = secondMin;
        this.max = max;
        this.secondMax = secondMax;
    }

    public String toString()
    {
        return "Second Smallest: " + secondMin + "\nSecond Largest: " + secondMax;
    }
}

/* Logic class */
class SecondFinder
{
    private int[] arr;

    public SecondFinder(int[] arr)
    {
        this.arr = arr;
    }

    public SecondResult find()
    {
        return divide(0, arr.length - 1);
    }

    private SecondResult divide(int low, int high)
    {
        if (low == high)
            return new SecondResult(arr[low], Integer.MAX_VALUE, arr[low], Integer.MIN_VALUE);

        if (high == low + 1)
        {
            if (arr[low] < arr[high])
                return new SecondResult(arr[low], arr[high], arr[high], arr[low]);
            else
                return new SecondResult(arr[high], arr[low], arr[low], arr[high]);
        }

        int mid = (low + high) / 2;
        SecondResult left = divide(low, mid);
        SecondResult right = divide(mid + 1, high);

        int min = Math.min(left.min, right.min);
        int secondMin = (left.min < right.min)
                ? Math.min(left.secondMin, right.min)
                : Math.min(right.secondMin, left.min);

        int max = Math.max(left.max, right.max);
        int secondMax = (left.max > right.max)
                ? Math.max(left.secondMax, right.max)
                : Math.max(right.secondMax, left.max);

        return new SecondResult(min, secondMin, max, secondMax);
    }
}

/* Driver class */
public class Assignment_7
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        if (n < 2)
        {
            System.out.println("At least two elements are required.");
            sc.close();
            return;
        }

        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        SecondFinder obj = new SecondFinder(arr);
        System.out.println(obj.find());

        sc.close();
    }
}
