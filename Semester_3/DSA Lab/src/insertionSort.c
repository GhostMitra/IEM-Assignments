#include <stdio.h>
#include <stdlib.h>

void insertionSort(int *arr, int n, int order) 
{
    if (n <= 1) return;

    insertionSort(arr, n - 1, order);

    int last = arr[n - 1];
    int j = n - 2;

    if (order == 1) 
    {
        while (j >= 0 && arr[j] > last) 
        {
            arr[j + 1] = arr[j];
            j--;
        }
    } 
    else
    { 
        while (j >= 0 && arr[j] < last) 
        {
            arr[j + 1] = arr[j];
            j--;
        }
    }

    arr[j + 1] = last;
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

    insertionSort(arr, n, order);

    printf("Sorted array:   ");
    printArray(arr, n);

    free(arr);
    return 0;
}
