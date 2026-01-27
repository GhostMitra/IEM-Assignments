// You are given two sorted arrays, arr1 and arr2, each of size m and n, respectively. Design a
// function to merge these two arrays into a single sorted array without using extra space.

import java.util.Scanner;

class MergeArrays 
{
    private final int[] arr1;
    private final int[] arr2;
    private final int m;
    private final int n;

    MergeArrays(int[] arr1, int[] arr2) 
    {
        this.arr1 = arr1;
        this.arr2 = arr2;
        this.m = arr1.length;
        this.n = arr2.length;
    }

    // Merges arr1 and arr2 into a new sorted array
    int[] mergeToOneArray() 
    {
        int[] result = new int[m + n];
        int i = 0, j = 0, k = 0;

        // Merge both arrays
        while (i < m && j < n) 
        {
            if (arr1[i] <= arr2[j]) 
            {
                result[k++] = arr1[i++];
            }
            else
            {
                result[k++] = arr2[j++];
            }
        }
        // Copy leftovers
        while (i < m) result[k++] = arr1[i++];
        while (j < n) result[k++] = arr2[j++];
        return result;
    }

    // Returns a string version of merged 1D array
    String mergedArrayString(int[] merged) 
    {
        StringBuilder sb = new StringBuilder();
        sb.append("Merged 1D array: ");
        for (int x : merged) sb.append(x).append(" ");
        return sb.toString();
    }
}

public class Assignment_1 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements in arr1: ");
        int m = sc.nextInt();
        int[] arr1 = new int[m];
        System.out.println("Enter " + m + " sorted elements for arr1:");
        for (int i = 0; i < m; i++) arr1[i] = sc.nextInt();

        System.out.print("Enter number of elements in arr2: ");
        int n = sc.nextInt();
        int[] arr2 = new int[n];
        System.out.println("Enter " + n + " sorted elements for arr2:");
        for (int i = 0; i < n; i++) arr2[i] = sc.nextInt();

        MergeArrays merger = new MergeArrays(arr1, arr2);
        int[] merged = merger.mergeToOneArray();

        System.out.println("\n" + merger.mergedArrayString(merged));

        sc.close();
    }
}
