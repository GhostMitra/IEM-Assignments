// Write a Program to find GCD (Greatest Common Divisor) and LCM (Least Common Multiple) of two numbers using user defined recursion function.

#include <stdio.h>

int gcd(int a, int b) 
{
    return (b == 0) ? a : gcd(b, a % b);
}

int lcm(int a, int b) 
{
    return (a / gcd(a, b)) * b;
}

int main() 
{
    int a, b;
    printf("Enter first number: ");
    scanf("%d", &a);
    printf("Enter second number: ");
    scanf("%d", &b);
    printf("GCD: %d\n", gcd(a, b));
    printf("LCM: %d\n", lcm(a, b));
    return 0;
}

// output 
// 
// Enter first number: 100
// Enter second number: 52
// GCD: 4
// LCM: 1300
