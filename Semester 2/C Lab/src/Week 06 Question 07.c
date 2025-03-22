// Write a Program to check whether any input number is Armstrong number or not using user defined functions. 
// Hint: 153. (1^3 + 5^3 + 3^3) = 153.

#include <stdio.h>
#include <math.h>
#include <stdbool.h>

int countDigits(int n) 
{
    return (n == 0) ? 0 : 1 + countDigits(n / 10);
}

int armstrongSum(int n, int power) 
{
    return (n == 0) ? 0 : pow(n % 10, power) + armstrongSum(n / 10, power);
}

bool isArmstrong(int n) 
{
    return n == armstrongSum(n, countDigits(n))? true : false;
}

int main() 
{
    int n;
    printf("Enter number: ");
    scanf("%d", &n);
    printf(isArmstrong(n) ? "The number is a Armstrong Number\n" : "The number is not an Armstrong Number\n");
    return 0;
}

// output
//
// Enter number: 153
// The number is a Armstrong Number
