// search element in a 2d array using linear search

// Take a input matrix from a user and display it using for loop

#include<stdio.h>
int main()
{
    int cols, rows;
    printf("Enter number of rows for matrix: ");
    scanf("%d", &rows);
    printf("Enter number of columns for matrix: ");
    scanf("%d", &cols);
    double matrix[rows][cols];
    for(int i = 0; i< rows; i++)
    {
        for(int j = 0; j< cols; j++)
        {
            printf("Enter the value at position (%d, %d): ", i+1, j+1);
            scanf("%lf", &matrix[i][j]);
        }

    }
    printf("\nMatrix you have given is : \n");
    for(int i = 0; i< rows; i++)
    {
        for(int j = 0; j< cols; j++)
        {
            printf("%lf ", matrix[i][j]);
        }
        printf("\n");
    }
    return 0;
}