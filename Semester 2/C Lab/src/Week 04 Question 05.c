// Write a Program to reverse an array.

#include <stdio.h>

int main() 
{
    int n;
    printf("Enter the number of elements: ");
    scanf("%d", &n);
    double arr[n];
    for (int i = 0; i < n; i++) 
    {
        printf("Enter the element no %d: ", i+1);
        scanf("%lf", &arr[i]);
    }
    printf("Reversed array:\n");
    for (int i = n - 1; i >= 0; i--) 
    {
        printf("%lf ", arr[i]);
    }
    printf("\n");
    return 0;
}


// output
// 
// Enter the number of elements: 5
// Enter the element no 1: 6
// Enter the element no 2: 9
// Enter the element no 3: 3
// Enter the element no 4: 65
// Enter the element no 5: 5
// Reversed array:
// 5.00 65.00 3.00 9.00 6.00