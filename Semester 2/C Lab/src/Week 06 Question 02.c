// Write a Program to perform Bubble Sort in descending order in a user defined array.

#include <stdio.h>
#include <stdbool.h>

void bubbleSortDsc(double arr[], int n) 
{
    if (n == 1) return;
    bool swapped = false;
    for (int i = 0; i < n - 1; i++) 
    {
        if (arr[i] < arr[i + 1]) 
        {
            double temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
            swapped = true;
        }
    }
    if (swapped) bubbleSortDsc(arr, n - 1);
}

int main() 
{
    int n;
    printf("Enter number of elements: ");
    scanf("%d", &n);
    double arr[n];
    for (int i = 0; i < n; i++)
    {
        printf("Enter element at index %d: ", i); 
        scanf("%lf", &arr[i]);
    }
    bubbleSortDsc(arr, n);
    printf("Sorted array (descending): ");
    for (int i = 0; i < n; i++) printf("%lf ", arr[i]);
    return 0;
}


// output 
// 
// Enter number of elements: 5 
// Enter element at index 0: 52
// Enter element at index 1: 55
// Enter element at index 2: 65
// Enter element at index 3: 19
// Enter element at index 4: 23
// Sorted array (descending): 65.000000 55.000000 52.000000 23.000000 19.000000 