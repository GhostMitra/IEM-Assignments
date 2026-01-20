#include <stdio.h>
#include <stdlib.h>

void selectionSort(int *arr, int n, int order, int index) 
{
    if (index >= n - 1) return;

    int minMaxIndex = index;
    for (int j = index + 1; j < n; j++) 
    {
        if ((order == 1 && arr[j] < arr[minMaxIndex]) || (order == 2 && arr[j] > arr[minMaxIndex])) 
        {
            minMaxIndex = j;
        }
    }

    if (minMaxIndex != index) 
    {
        int temp = arr[index];
        arr[index] = arr[minMaxIndex];
        arr[minMaxIndex] = temp;
    }

    selectionSort(arr, n, order, index + 1);
}

void printArray(int *arr, int n) 
{
    for (int i = 0; i < n; i++) printf("%d ", arr[i]);
    printf("\n");
}

int main() 
{
    int n, order;

    printf("Enter number of elements: ");
    scanf("%d", &n);

    int *arr = (int*)malloc(n * sizeof(int));
    if (!arr) return 1;

    printf("Enter %d elements:\n", n);
    for (int i = 0; i < n; i++) scanf("%d", &arr[i]);

    printf("Choose sorting order:\n1. Ascending\n2. Descending\nEnter choice: ");
    scanf("%d", &order);

    printf("Original array: ");
    printArray(arr, n);

    selectionSort(arr, n, order, 0);

    printf("Sorted array:   ");
    printArray(arr, n);

    free(arr);
    return 0;
}
