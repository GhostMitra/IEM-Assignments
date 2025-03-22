// Write program to find Fibonacci Series of n-terms using recursion function.

#include <stdio.h>

int fibonacci(int n) 
{
    return (n <= 1) ? n : fibonacci(n - 1) + fibonacci(n - 2);
}

int main() 
{
    int n;
    printf("Enter number of terms: ");
    scanf("%d", &n);

    printf("Fibonacci Series: ");
    for (int i = 0; i < n; i++) printf("%d ", fibonacci(i));
    
    return 0;
}

// output 
// 
// Enter number of terms: 5
// Fibonacci Series: 0 1 1 2 3