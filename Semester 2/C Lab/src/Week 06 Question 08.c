// Write a Program to check whether any input number is Happy number or not using user defined functions. 
// Hint: 19. (1^2 + 9^2) = 82, (8^2 + 2^2) = 68, (6^2 + 8^2) = 100, (1^2 + 0^2 + 0^2) = 1.

#include <stdio.h>
#include <stdbool.h>

int squareSum(int n) 
{
    return (n == 0) ? 0 : (n % 10) * (n % 10) + squareSum(n / 10);
}

bool isHappy(int n, int seen[]) 
{
    if (n == 1) return true;
    if (seen[n]) return false;
    seen[n] = true;
    return isHappy(squareSum(n), seen);
}

int main() 
{
    int n, seen[1000] = {0};
    printf("Enter number: ");
    scanf("%d", &n);
    printf(isHappy(n, seen) ? "The number is a Happy Number\n" : "The number is not a Happy Number\n");
    return 0;
}

// output
//
// Enter number: 19
// The number is a Happy Number