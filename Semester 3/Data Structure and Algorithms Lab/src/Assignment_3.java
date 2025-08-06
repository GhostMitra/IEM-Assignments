import java.util.Scanner;

class DynamicArray {
    private final int[] arr;
    int size;    // Current number of elements
    private final int capacity; // Max capacity of the array

    // Constructor to create array of given capacity
    public DynamicArray(int capacity) {
        this.capacity = capacity;
        this.arr = new int[capacity];
        this.size = 0;
    }

    // Populate array with initial elements
    public void populateArray(Scanner sc) {
        System.out.println("Enter " + capacity + " elements:");
        for (int i = 0; i < capacity; i++) {
            arr[i] = sc.nextInt();
        }
        size = capacity;
    }

    // Insert element at given position (0-based index)
    public boolean insertElement(int element, int position) {
        if (position < 0 || position > size) {
            System.out.println("Invalid position! Position should be between 0 and " + size);
            return false;
        }
        if (size == capacity) {
            System.out.println("Array is full! Cannot insert new element.");
            return false;
        }
        // Shift elements to right
        for (int i = size - 1; i >= position; i--) {
            arr[i + 1] = arr[i];
        }
        arr[position] = element;
        size++;
        return true;
    }

    // Delete element at given position (0-based index)
    public boolean deleteElement(int position) {
        if (position < 0 || position >= size) {
            System.out.println("Invalid position! Position should be between 0 and " + (size - 1));
            return false;
        }
        // Shift elements to left
        for (int i = position; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        size--;
        return true;
    }

    // Search for element, return index or -1 if not found
    public int searchElement(int element) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == element)
                return i;
        }
        return -1;
    }

    // Find maximum element
    public int findMax() {
        if (size == 0) throw new IllegalStateException("Array is empty.");
        int max = arr[0];
        for (int i = 1; i < size; i++) {
            if (arr[i] > max) max = arr[i];
        }
        return max;
    }

    // Find minimum element
    public int findMin() {
        if (size == 0) throw new IllegalStateException("Array is empty.");
        int min = arr[0];
        for (int i = 1; i < size; i++) {
            if (arr[i] < min) min = arr[i];
        }
        return min;
    }

    // Display array elements
    public void display() {
        if (size == 0) {
            System.out.println("Array is empty.");
            return;
        }
        System.out.print("Array elements: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

public class Assignment_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        DynamicArray array = new DynamicArray(n);

        // Populate the array first
        array.populateArray(scanner);

        boolean exit = false;
        while (!exit) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Insert element");
            System.out.println("2. Delete element");
            System.out.println("3. Search element");
            System.out.println("4. Find max and min");
            System.out.println("5. Display array");
            System.out.println("6. Exit");
            System.out.print("Enter option (1-6): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element to insert: ");
                    int element = scanner.nextInt();
                    System.out.print("Enter position to insert (0 to " + array.size + "): ");
                    int position = scanner.nextInt();
                    if (array.insertElement(element, position)) {
                        System.out.println("Element inserted.");
                    }
                    break;

                case 2:
                    System.out.print("Enter position to delete (0 to " + (array.size - 1) + "): ");
                    int deletePos = scanner.nextInt();
                    if (array.deleteElement(deletePos)) {
                        System.out.println("Element deleted.");
                    }
                    break;

                case 3:
                    System.out.print("Enter element to search: ");
                    int searchElement = scanner.nextInt();
                    int foundIndex = array.searchElement(searchElement);
                    if (foundIndex == -1) {
                        System.out.println("Element not found in array.");
                    } else {
                        System.out.println("Element found at index: " + foundIndex);
                    }
                    break;

                case 4:
                    try {
                        int max = array.findMax();
                        int min = array.findMin();
                        System.out.println("Maximum element: " + max);
                        System.out.println("Minimum element: " + min);
                    } catch (IllegalStateException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 5:
                    array.display();
                    break;

                case 6:
                    exit = true;
                    System.out.println("Exiting program. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice! Please enter a number between 1 and 6.");
            }
        }

        scanner.close();
    }
}
