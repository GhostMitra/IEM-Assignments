#include<stdio.h>
void centeredNumericPalindromicTriangle(unsigned long long int lines)
{
    unsigned long long int i, j;
    for (i = 1; i <= lines; i++) 
    {
        for (j = 1; j <= lines - i; printf(" "), j++);
        for (j = 1; j <= i; printf("%d", j), j++);
        for (j = i - 1; j >= 1; printf("%d", j), j--);
        printf("\n");
    }
}
int main()
{
    unsigned long long int numberOfLine;
    printf("Enter the number of lines you want to print the pattern: ");
    scanf("%llu", &numberOfLine);
    centeredNumericPalindromicTriangle(numberOfLine);
    return 0;
}