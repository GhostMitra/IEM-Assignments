#include<stdio.h>
unsigned long long int factorial(unsigned long long int num) 
{
    return (num == 0 || num == 1) ? 1 : num * factorial(num - 1);
}

unsigned long long int combination(unsigned long long int total, unsigned long long int selection) 
{
    return factorial(total) / (factorial(selection) * factorial(total - selection));
}

void centeredPascalsTriangle(unsigned long long int lines)
{
    unsigned long long int i, j;
    for (i = 1; i <= lines; i++) 
    {
        for (j = 1; j <= lines - i; printf(" "), j++);
        for (j = 1; j <= i; printf("%llu ", combination(i - 1, j - 1)), j++);
        printf("\n");
    }
}
int main()
{
    unsigned long long int numberOfLine;
    printf("Enter the number of lines you want to print the pattern: ");
    scanf("%llu", &numberOfLine);
    centeredPascalsTriangle(numberOfLine);
    return 0;
}