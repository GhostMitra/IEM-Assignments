// Write a Program to find factorial of a number using recursion function.

#include <stdio.h>

long factorial(int n) 
{
    return (n == 0) ? 1 : n * factorial(n - 1);
}

int main() 
{
    int n;
    printf("Enter number: ");
    scanf("%d", &n);
    printf("Factorial: %ld\n", factorial(n));
    return 0;
}


// output 
// 
// Enter the last limit of first N natural numbers: 5
// Sum of first 5 natural numbers: 15