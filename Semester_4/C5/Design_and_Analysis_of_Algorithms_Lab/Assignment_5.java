import java.util.Scanner;
class InversionResult
{
    private long count;

    public InversionResult(long count)
    {
        this.count = count;
    }

    public String toString()
    {
        return "Number of inversion pairs: " + count;
    }
}

/* Logic class */
class InversionCounter
{
    private int[] arr;

    public InversionCounter(int[] arr)
    {
        this.arr = arr;
    }

    public InversionResult countInversions()
    {
        long count = mergeSort(0, arr.length - 1);
        return new InversionResult(count);
    }

    private long mergeSort(int low, int high)
    {
        if (low >= high)
            return 0;

        int mid = (low + high) / 2;
        long count = 0;

        count += mergeSort(low, mid);
        count += mergeSort(mid + 1, high);
        count += merge(low, mid, high);

        return count;
    }

    private long merge(int low, int mid, int high)
    {
        int[] temp = new int[high - low + 1];
        int i = low, j = mid + 1, k = 0;
        long invCount = 0;

        while (i <= mid && j <= high)
        {
            if (arr[i] <= arr[j])
                temp[k++] = arr[i++];
            else
            {
                temp[k++] = arr[j++];
                invCount += (mid - i + 1);
            }
        }

        while (i <= mid)
            temp[k++] = arr[i++];

        while (j <= high)
            temp[k++] = arr[j++];

        for (i = 0; i < temp.length; i++)
            arr[low + i] = temp[i];

        return invCount;
    }
}

/* Driver class */
public class Assignment_5
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        if (n <= 0)
        {
            System.out.println("Array size must be positive.");
            sc.close();
            return;
        }

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++)
        {
            System.out.print("Enter element number " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        InversionCounter obj = new InversionCounter(arr);
        System.out.println(obj.countInversions());

        sc.close();
    }
}