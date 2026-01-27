#include <stdio.h>
#include <stdlib.h>

int partition(int *arr, int low, int high, int order) 
{
    int pivot = arr[high];
    int i = low - 1, temp;

    for (int j = low; j < high; j++) 
    {
        if ((order == 1 && arr[j] <= pivot) || (order == 2 && arr[j] >= pivot)) 
        {
            i++;
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    temp = arr[i + 1];
    arr[i + 1] = arr[high];
    arr[high] = temp;

    return i + 1;
}

void quickSort(int *arr, int low, int high, int order) 
{
    if (low < high) 
    {
        int pi = partition(arr, low, high, order);
        quickSort(arr, low, pi - 1, order);
        quickSort(arr, pi + 1, high, order);
    }
}

void printArray(int *arr, int n) 
{
    for (int i = 0; i < n; i++)
        printf("%d ", arr[i]);
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

    quickSort(arr, 0, n - 1, order);

    printf("Sorted array:   ");
    printArray(arr, n);

    free(arr);
    return 0;
}
