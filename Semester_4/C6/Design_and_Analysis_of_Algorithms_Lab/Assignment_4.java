import java.util.Scanner;
import static java.lang.System.out;

/* Logic class */
class QuickSorter {
    private int[] arr;

    public QuickSorter(int[] arr) {
        this.arr = arr;
    }

    private int partition(int low, int high) {
        int pivot = arr[high];   // last element as pivot
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    private void quickSort(int low, int high) {
        if (low < high) {
            int pivotIndex = partition(low, high);

            quickSort(low, pivotIndex - 1);
            quickSort(pivotIndex + 1, high);
        }
    }

    public void process() {
        quickSort(0, arr.length - 1);
    }

    public void display() {
        out.println("Sorted Array:");
        for (int x : arr)
            out.print(x + " ");
    }
}

/* Driver class */
public class Assignment_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        out.println("Enter array elements:");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        QuickSorter obj = new QuickSorter(arr);
        obj.process();
        obj.display();

        sc.close();
    }
}