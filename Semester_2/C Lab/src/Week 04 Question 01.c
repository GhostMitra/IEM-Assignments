//Write a Program to declare, read and display values in 2-D array.

#include <stdio.h>

int main() 
{
    int rows, cols;
    printf("Enter the number of rows: ");
    scanf("%d", &rows);
    printf("Enter the number of rows: ");
    scanf("%d", &cols);
    double arr[rows][cols];
    for (int i = 0; i < rows; i++) 
    {
        for (int j = 0; j < cols; j++) 
        {
            printf("Enter the elements at position row %d, column %d: ", i+1, j+1);
            scanf("%lf", &arr[i][j]);
        }
    }
    printf("The 2-D array is:\n");
    for (int i = 0; i < rows; i++) 
    {
        for (int j = 0; j < cols; j++) 
        {
            printf("%lf ", arr[i][j]);
        }
        printf("\n");
    }

    return 0;
}


// output


// Enter the number of rows: 2
// Enter the number of rows: 2
// Enter the elements at position row 1, column 1: 1
// Enter the elements at position row 1, column 2: 2
// Enter the elements at position row 2, column 1: 3
// Enter the elements at position row 2, column 2: 4
// The 2-D array is:
// 1.000000 2.000000 
// 3.000000 4.000000