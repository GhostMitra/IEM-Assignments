// Write a Program to split an array from a user defined position.

#include <stdio.h>

int main() 
{
    int n, pos;
    printf("Enter the number of elements: ");
    scanf("%d", &n);
    double arr[n];
    for (int i = 0; i < n; i++) 
    {
        printf("Enter the element no %d: ", i+1);
        scanf("%lf", &arr[i]);
    }
    printf("Enter the position to split (1 to %d): ", n - 1);
    scanf("%d", &pos);
    if (pos <= 0 || pos >= n) 
    {
        printf("Invalid position! Must be between 1 and %d.\n", n - 1);
        return 1;
    }
    printf("First subarray:\n");
    for (int i = 0; i < pos; i++) 
    {
        printf("%lf ", arr[i]);
    }
    printf("\nSecond subarray:\n");
    for (int i = pos; i < n; i++) 
    {
        printf("%lf ", arr[i]);
    }

    return 0;
}

// output 
// 
// Enter the number of elements: 6
// Enter the element no 1: 5
// Enter the element no 2: 8
// Enter the element no 3: 9
// Enter the element no 4: 7
// Enter the element no 5: 2
// Enter the element no 6: 3
// Enter the position to split (1 to 5): 4
// First subarray:
// 5.000000 8.000000 9.000000 7.000000 
// Second subarray:
// 2.000000 3.000000 