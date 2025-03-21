#include <stdio.h>

int main() 
{
    int n1, n2;
    printf("Enter the number of elements in the first array: ");
    scanf("%d", &n1);
    double arr1[n1];
    for (int i = 0; i < n1; i++) 
    {
        printf("Enter the element no %d of first array: ", i+1);
        scanf("%lf", &arr1[i]);
    }
    printf("Enter the number of elements in the second array: ");
    scanf("%d", &n2);
    double arr2[n2];
    for (int i = 0; i < n2; i++) 
    {
        printf("Enter the element no %d of second array: ", i+1);
        scanf("%lf", &arr2[i]);
    }
    int n3 = n1 + n2;
    double merged[n3];

    for (int i = 0; i < n1; i++) 
    {
        merged[i] = arr1[i];
    }
    for (int i = 0; i < n2; i++) 
    {
        merged[n1 + i] = arr2[i];
    }
    printf("\nMerged Array:\n");
    for (int i = 0; i < n3; i++) 
    {
        printf("%lf ", merged[i]);
    }

    return 0;
}

// output 
// 
// Enter the number of elements in the first array: 4 
// Enter the element no 1 of first array: 3
// Enter the element no 2 of first array: 2
// Enter the element no 3 of first array: 6
// Enter the element no 4 of first array: 5
// Enter the number of elements in the second array: 2
// Enter the element no 1 of second array: 5
// Enter the element no 2 of second array: 80
// 
// Merged Array:
// 3.000000 2.000000 6.000000 5.000000 5.000000 80.000000