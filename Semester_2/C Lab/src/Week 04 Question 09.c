// Write a Program to find the number of even and odd positions elements in a 1D array.

#include <stdio.h>

int main() 
{
    int n, evenCount = 0, oddCount = 0;
    printf("Enter the number of elements: ");
    scanf("%d", &n);

    double arr[n];
    for (int i = 0; i < n; i++) 
    {
        printf("Enter the element no %d: ", i+1);
        scanf("%lf", &arr[i]);
    }
    for (int i = 0; i < n; i%2==0 ? evenCount++ : oddCount++, i++);
    printf("\nNumber of elements at even positions: %d", evenCount);
    printf("\nNumber of elements at odd positions: %d", oddCount);

    return 0;
}


// output 
// 
// Enter the number of elements: 5
// Enter the element no 1: 1
// Enter the element no 2: 2
// Enter the element no 3: 3
// Enter the element no 4: 4
// Enter the element no 5: 5
// 
// Number of elements at even positions: 3
// Number of elements at odd positions: 2