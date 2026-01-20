import java.util.Scanner;

/* Result class */
class BinarySearchResult
{
    private int index;

    public BinarySearchResult(int index)
    {
        this.index = index;
    }

    public String toString()
    {
        return index != -1 ?
            "Element found at index: " + index :
            "Element not found";
    }
}

/* Logic class */
class BinarySearchAlgo
{
    private int[] arr;

    public BinarySearchAlgo(int[] arr)
    {
        this.arr = arr;
    }

    private int search(int low, int high, int target)
    {
        if (low > high)
        {
            return -1;
        }
        int mid = low + (high - low) / 2;
        if (arr[mid] == target)
        {
            return mid;
        }
        if (arr[mid] > target)
        {
            return search(low, mid - 1, target);
        }
        return search(mid + 1, high, target);
    }

    public BinarySearchResult process(int target)
    {
        return new BinarySearchResult(search(0, arr.length - 1, target));
    }
}

/* Driver class */
public class Assignment_2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        if (n < 0)
        {
            System.out.println("Array size cannot be negative.");
            sc.close();
            return;
        }

        int[] arr = new int[n];
        if (n > 0)
        {
            System.out.println("Enter the elements of the sorted array:");
            for (int i = 0; i < n; i++)
            {
                System.out.print("Enter element number " + (i + 1) + ": ");
                arr[i] = sc.nextInt();
            }

            if (!isSorted(arr))
            {
                System.out.println("Error: The input array is not sorted. Binary search requires a sorted array.");
                sc.close();
                return;
            }
        }

        System.out.print("Enter the target element to search: ");
        int target = sc.nextInt();

        BinarySearchAlgo obj = new BinarySearchAlgo(arr);
        System.out.println("Performing binary search...");
        System.out.println(obj.process(target));
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
