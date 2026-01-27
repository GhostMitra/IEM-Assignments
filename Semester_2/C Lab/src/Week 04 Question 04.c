// Write a Program to find out the largest and smallest element in an array.

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
    double smallest = arr[0], largest = arr[0];
    for (int i = 1; i < n; i++) 
    {
        if (arr[i] < smallest) 
        {
            smallest = arr[i];
        }
        if (arr[i] > largest) 
        {
            largest = arr[i];
        }
    }
    printf("Smallest element: %lf\n", smallest);
    printf("Largest element: %lf\n", largest);

    return 0;
}


// output
// 
// Enter the number of elements: 4
// Enter the element no 1: 5
// Enter the element no 2: 2
// Enter the element no 3: 9.02
// Enter the element no 4: 56.33
// Smallest element: 2.000000
// Largest element: 56.330000