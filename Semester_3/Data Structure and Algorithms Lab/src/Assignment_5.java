// Given an array of integers, write a program to rearrange the elements such that all positive
// numbers come before negative numbers while maintaining the relative order of positive and
// negative numbers in the original array.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class RearrangeArray 
{
    private final int[] arr;

    public RearrangeArray(int[] arr)
    {
        this.arr = arr;
    }

    // Rearranges the array to put all positive before negative preserving relative order
    public void rearrange() 
    {
        List<Integer> positiveList = new ArrayList<>();
        List<Integer> negativeList = new ArrayList<>();

        for (int value : arr) 
        {
            if (value >= 0) 
            {  // change to > 0 if zero should be treated negative
                positiveList.add(value);
            }
            else
            {
                negativeList.add(value);
            }
        }

        int index = 0;
        for (int val : positiveList) 
        {
            arr[index++] = val;
        }
        for (int val : negativeList) 
        {
            arr[index++] = val;
        }
    }

    public String getFormattedArray() 
    {
        StringBuilder sb = new StringBuilder();
        for (int val : arr) 
        {
            sb.append(val).append(" ");
        }
        return sb.toString().trim();
    }
}

public class Assignment_5 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter size of the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) 
        {
            arr[i] = scanner.nextInt();
        }

        RearrangeArray rearranger = new RearrangeArray(arr);
        rearranger.rearrange();

        System.out.println("Array after rearranging positive and negative elements:");
        System.out.println(rearranger.getFormattedArray());

        scanner.close();
    }
}
