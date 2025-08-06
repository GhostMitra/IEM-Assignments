// Given an array of integers, design a program to find if there exists a subarray with a given sum. If
// such a subarray exists, print the starting and ending indices of the subarray. If multiple subarrays
// with the same sum exist, display any one of them.

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class SubarraySumFinder 
{
    private final int[] arr;
    private final int targetSum;

    public SubarraySumFinder(int[] arr, int targetSum) 
    {
        this.arr = arr;
        this.targetSum = targetSum;
    }

    // Finds one subarray with sum = targetSum and returns start & end indices (inclusive)
    // Returns null if no such subarray exists
    public int[] findSubarrayWithSum() 
    {
        Map<Integer, Integer> prefixSumIndices = new HashMap<>();
        int prefixSum = 0;
        prefixSumIndices.put(0, -1);  // For subarrays starting at index 0

        for (int i = 0; i < arr.length; i++) 
        {
            prefixSum += arr[i];

            if (prefixSumIndices.containsKey(prefixSum - targetSum)) 
            {
                int startIndex = prefixSumIndices.get(prefixSum - targetSum) + 1;
                return new int[]{startIndex, i};
            }

            prefixSumIndices.put(prefixSum, i);
        }
        return null; // No subarray found
    }
}

public class Assignment_4 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter size of the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements of the array:");
        for (int i = 0; i < n; i++) 
        {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter the target sum: ");
        int targetSum = scanner.nextInt();

        SubarraySumFinder finder = new SubarraySumFinder(arr, targetSum);
        int[] result = finder.findSubarrayWithSum();

        if (result != null) 
        {
            System.out.println("Subarray with sum " + targetSum + " found from index " +
                    result[0] + " to " + result[1]);
        }
        else
        {
            System.out.println("No subarray with sum " + targetSum + " found.");
        }

        scanner.close();
    }
}
