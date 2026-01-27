// Write a Program to perform Linear Search in a user defined array.

#include <stdio.h>

int linearSearch(double arr[], int n, int key, int index) 
{
    if (index == n) return -1;
    return (arr[index] == key) ? index : linearSearch(arr, n, key, index + 1);
}

int main() 
{
    int n;
    double key;
    printf("Enter number of elements: ");
    scanf("%d", &n);
    double arr[n];
    for (int i = 0; i < n; i++)
    {
        printf("Enter element at index %d: ", i); 
        scanf("%lf", &arr[i]);
    }
    printf("Enter key: ");
    scanf("%lf", &key);
    
    int index = linearSearch(arr, n, key, 0);
    printf(index != -1 ? "Element found at index %d\n" : "Element not found\n", index);
    
    return 0;
}


// output 
// 
// Enter number of elements: 5
// Enter element at index 0: 23
// Enter element at index 1: 19
// Enter element at index 2: 55
// Enter element at index 3: 65
// Enter element at index 4: 85
// Enter key: 19
// Element found at index 1