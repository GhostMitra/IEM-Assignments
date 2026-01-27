// Write a Program to add N natural numbers using function.

#include <stdio.h>

int sumN(int n) 
{
    return n * (n + 1) / 2;
}

int main() 
{
    int n;
    printf("Enter the last limit of first N natural numbers: ");
    scanf("%d", &n);
    printf("Sum of first %d natural numbers: %d\n", n, sumN(n));
    return 0;
}

// output 
// 
// Enter the last limit of first N natural numbers: 5
// Sum of first 5 natural numbers: 15