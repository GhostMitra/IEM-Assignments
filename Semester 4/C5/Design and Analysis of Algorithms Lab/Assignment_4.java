import java.util.Scanner;

/* Result class */
class BitonicResult
{
    private int index, value;

    public BitonicResult(int index, int value)
    {
        this.index = index;
        this.value = value;
    }

    public String toString()
    {
        return "Bitonic Point: " + value + " at index " + index;
    }
}

/* Logic class */
class BitonicFinder
{
    private int[] arr;

    public BitonicFinder(int[] arr)
    {
        this.arr = arr;
    }

    public BitonicResult find()
    {
        int low = 0, high = arr.length - 1;
        while (low < high)
        {
            int mid = low + (high - low) / 2;
            if (arr[mid] < arr[mid + 1])
            {
                low = mid + 1;
            }
            else
            {
                high = mid;
            }
        }
        return new BitonicResult(low, arr[low]);
    }
}

/* Driver class */
public class Assignment_4
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

        BitonicFinder obj = new BitonicFinder(arr);
        System.out.println("Searching for the bitonic point...");
        System.out.println(obj.find());
        sc.close();
    }
}
