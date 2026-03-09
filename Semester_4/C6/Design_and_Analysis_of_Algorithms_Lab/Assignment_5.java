import java.util.Scanner;
import static java.lang.System.out;

/* Logic class */
class QuickSorter {
    private int[] arr;

    public QuickSorter(int[] arr) {
        this.arr = arr;
    }

    private void quickSort(int low, int high) {

        if (low >= high)
            return;

        int i = low;
        int j = high;
        int pivot = arr[(low + high) / 2];   // middle element as pivot

        while (i <= j) {

            while (arr[i] < pivot)
                i++;

            while (arr[j] > pivot)
                j--;

            if (i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                i++;
                j--;
            }
        }

        if (low < j)
            quickSort(low, j);

        if (i < high)
            quickSort(i, high);
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
public class Assignment_5 {
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