// Write a Program to perform matrix addition and multiplication operations with a 3x3 user defined matrix and print the final matrix accordingly.

#include <stdio.h>

int main() 
{
    double A[3][3], B[3][3], sum[3][3], product[3][3] = {0};
    for (int i = 0; i < 3; i++) 
    {
        for (int j = 0; j < 3; j++) 
        {
            printf("Enter the elements of first matrix at position row %d, column %d: ", i+1, j+1);
            scanf("%lf", &A[i][j]);
        }
    }
    for (int i = 0; i < 3; i++) 
    {
        for (int j = 0; j < 3; j++) 
        {
            printf("Enter the elements of second matrix at position row %d, column %d: ", i+1, j+1);
            scanf("%lf", &B[i][j]);
        }
    }
    for (int i = 0; i < 3; i++) 
    {
        for (int j = 0; j < 3; j++) 
        {
            sum[i][j] = A[i][j] + B[i][j];
        }
    }
    for (int i = 0; i < 3; i++) 
    {
        for (int j = 0; j < 3; j++) 
        {
            for (int k = 0; k < 3; k++) 
            {
                product[i][j] += A[i][k] * B[k][j];
            }
        }
    }
    printf("\nMatrix Addition Result:\n");
    for (int i = 0; i < 3; i++) 
    {
        for (int j = 0; j < 3; j++) 
        {
            printf("%lf ", sum[i][j]);
        }
        printf("\n");
    }
    printf("\nMatrix Multiplication Result:\n");
    for (int i = 0; i < 3; i++) 
    {
        for (int j = 0; j < 3; j++) 
        {
            printf("%lf ", product[i][j]);
        }
        printf("\n");
    }

    return 0;
}

// output 
// 
// Enter the elements of first matrix at position row 1, column 1: 5
// Enter the elements of first matrix at position row 1, column 2: 2
// Enter the elements of first matrix at position row 1, column 3: 6
// Enter the elements of first matrix at position row 2, column 1: 8
// Enter the elements of first matrix at position row 2, column 2: 9
// Enter the elements of first matrix at position row 2, column 3: 6
// Enter the elements of first matrix at position row 3, column 1: 3
// Enter the elements of first matrix at position row 3, column 2: 2
// Enter the elements of first matrix at position row 3, column 3: 5
// Enter the elements of second matrix at position row 1, column 1: 8
// Enter the elements of second matrix at position row 1, column 2: 5
// Enter the elements of second matrix at position row 1, column 3: 4
// Enter the elements of second matrix at position row 2, column 1: 2
// Enter the elements of second matrix at position row 2, column 2: 5
// Enter the elements of second matrix at position row 2, column 3: 2
// Enter the elements of second matrix at position row 3, column 1: 4
// Enter the elements of second matrix at position row 3, column 2: 8
// Enter the elements of second matrix at position row 3, column 3: 5
// 
// Matrix Addition Result:
// 13.000000 7.000000 10.000000 
// 10.000000 14.000000 8.000000 
// 7.000000 10.000000 10.000000 
// 
// Matrix Multiplication Result:
// 68.000000 83.000000 54.000000 
// 106.000000 133.000000 80.000000 
// 48.000000 65.000000 41.000000 