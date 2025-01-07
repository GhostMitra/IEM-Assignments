// Write a program to print the summation of digits of user given input number.

// Algorithm:
// 1. Start.
// 2. Initialize a variable to store the sum of digits.
// 3. Use recursion to calculate the sum of digits by extracting the last digit and adding it to the sum.
// 4. Once all digits are processed, return the sum.
// 5. Display the sum of digits.
// 6. End.

#include<stdio.h>   // Header file for standard input/output functions

long unsigned sum = 0;  // Variable to store the sum of digits

// Function to calculate the sum of digits recursively
long unsigned digitsSum(long unsigned number) 
{
    if (number == 0)  // Base case: If the number is 0, return the sum of digits
    {
        return sum;
    }
    else 
    {
        sum = sum + (number % 10);  // Extract the last digit and add it to the sum
        return digitsSum(number / 10);  // Recursive call with the number divided by 10
    }
}

int main() 
{
    long unsigned num;  // Variable to store the input number
    printf("Enter a number: ");
    scanf("%lu", &num);  // Read the number from the user

    // Call the digitsSum function and display the sum of digits
    printf("Sum of digits of the number %lu is %lu.\n", num, digitsSum(num));

    getchar();  // Pause the output screen before exiting
    return 0;  // Indicate successful execution
}

/*
Variable Identifier | Data Type     | Use/Description
--------------------|---------------|----------------------------
sum                 | long unsigned | Stores the sum of the digits (used globally).
num                 | long unsigned | Stores the input number entered by the user.
number              | long unsigned | Stores the number passed to the digitsSum() function.
*/
