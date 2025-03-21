// Write a Program to copy the elements of one array into another array.

#include <stdio.h>

int main() 
{
    int n;
    printf("Enter the number of elements: ");
    scanf("%d", &n);

    double arr1[n], arr2[n];
    for (int i = 0; i < n; i++) 
    {
        printf("Enter the element no %d: ", i+1);
        scanf("%lf", &arr1[i]);
    }

    // Copy elements from arr1 to arr2
    for (int i = 0; i < n; i++) 
    {
        arr2[i] = arr1[i];
    }

    // Display copied array
    printf("Copied array:\n");
    for (int i = 0; i < n; i++) 
    {
        printf("%lf ", arr2[i]);
    }
    printf("\n");
    return 0;
}


// output
// 
// Enter the number of elements: 5           
// Enter the element no 1: 5
// Enter the element no 2: 2
// Enter the element no 3: 8
// Enter the element no 4: 6
// Enter the element no 5: 9
// Copied array:
// 5.000000 2.000000 8.000000 6.000000 9.000000
