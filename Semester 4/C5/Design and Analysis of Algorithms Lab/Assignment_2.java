import java.util.Scanner;
import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.MIN_VALUE;


class MinMaxResult {
    private int min;
    private int max;
    private int secondMin;
    private int secondMax;
    private boolean isValid;
    private String message;
    
    public MinMaxResult(int min, int max, int secondMin, int secondMax, boolean isValid, String message) {
        this.min = min;
        this.max = max;
        this.secondMin = secondMin;
        this.secondMax = secondMax;
        this.isValid = isValid;
        this.message = message;
    }
    
    public int getMin() { return min; }
    public int getMax() { return max; }
    public int getSecondMin() { return secondMin; }
    public int getSecondMax() { return secondMax; }
    public boolean isValid() { return isValid; }
    public String getMessage() { return message; }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!isValid) {
            sb.append(message);
        } else {
            sb.append("Minimum: ").append(min).append("\n");
            sb.append("Maximum: ").append(max).append("\n");
            sb.append("Second Minimum: ").append(secondMin).append("\n");
            sb.append("Second Maximum: ").append(secondMax);
        }
        return sb.toString();
    }
}

/**
 * ArrayAnalyzer class to analyze unsorted arrays
 */
public class Assignment_2 {
    private int[] array;
    
    public Assignment_2(int[] array) {                                
        this.array = array;
    }
    
    /**
     * Validates if array is not null
     * @return true if valid, false otherwise
     */
    private boolean validateArray() {
        return array != null;
    }
    
    /**
     * Finds min, max, second min, and second max from an unsorted array
     * @return MinMaxResult object containing the results
     */
    public MinMaxResult findMinMaxElements() {
        if (!validateArray() || array.length == 0) {
            return new MinMaxResult(0, 0, 0, 0, false, 
                "Not A Number");
        }
        
        // Handle single element case
        if (array.length == 1) {
            return new MinMaxResult(array[0], array[0], array[0], array[0], true, "");
        }
        
        int min = array[0];
        int max = array[0];
        int secondMin = MAX_VALUE;
        int secondMax = MIN_VALUE;
        
        for (int i = 0; i < array.length; i++) {
            // Update min and second min
            if (array[i] < min) {
                secondMin = min;
                min = array[i];
            } else if (array[i] < secondMin && array[i] != min) {
                secondMin = array[i];
            }
            
            if (array[i] > max) {
                secondMax = max;
                max = array[i];
            } else if (array[i] > secondMax && array[i] != max) {
                secondMax = array[i];
            }
        }
        
        boolean hasSecondMin = secondMin != MAX_VALUE;
        boolean hasSecondMax = secondMax != MIN_VALUE;
        
        if (!hasSecondMin || !hasSecondMax) {
            String msg = "Second min/max not found - array may have duplicates";
            return new MinMaxResult(min, max, secondMin, secondMax, false, msg);
        }
        
        return new MinMaxResult(min, max, secondMin, secondMax, true, "");
    }
    
    /**
     * Gets the array
     * @return the array
     */
    public int[] getArray() {
        return array;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        
        int[] arr = new int[n];
        
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }
        
        // Create ArrayAnalyzer object
        Assignment_2 analyzer = new Assignment_2(arr);
        
        System.out.println("\nArray: " + java.util.Arrays.toString(analyzer.getArray()));
        System.out.println("\nResults:");
        
        // Get results and display
        MinMaxResult result = analyzer.findMinMaxElements();
        System.out.println(result);
        
        scanner.close();
    }
}
