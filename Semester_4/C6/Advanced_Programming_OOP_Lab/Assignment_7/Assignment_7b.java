package Assignment_7;
import java.util.Scanner;
import static java.lang.System.out;
public class Assignment_7b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[3];
        out.println("Enter the 3 elements: ");
        for(int i = 0; i< a.length; i++)
        {
            a[i] = sc.nextInt();
        }
        try {
            System.out.println("Enter the index you want to show: ");
            int num = sc.nextInt();
            System.out.println("The Element is: " + a[num]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            out.println("Array Index out of Bounds");
        }
        sc.close();
    }
}
