// Write a program to reverse the digits of an integer.

// Algorithm:
// 1. Start.
// 2. Initialize a variable to store the reversed number.
// 3. Use recursion to reverse the digits by extracting the last digit and appending it to the reversed number.
// 4. Once all digits are reversed, return the reversed number.
// 5. Display the reversed number.
// 6. End.

#include<stdio.h>   // Header file for standard input/output functions

long unsigned rev = 0;  // Variable to store the reversed number

// Function to reverse the digits of the number recursively
long unsigned reverse(long unsigned number) 
{
    if (number == 0)  // Base case: If the number is 0, return the reversed number
    {
        return rev;
    }
    else 
    {
        rev = rev * 10 + (number % 10);  // Extract the last digit and append to the reversed number
        return reverse(number / 10);  // Recursive call with the number divided by 10
    }
}

int main() 
{
    long unsigned num;  // Variable to store the input number
    printf("Enter a number: ");
    scanf("%lu", &num);  // Read the number from the user

    // Call the reverse function and display the reversed number
    printf("Reversed number is %lu.\n", reverse(num));

    getchar();  // Pause the output screen before exiting
    return 0;  // Indicate successful execution
}

/*
Variable Identifier | Data Type     | Use/Description
--------------------|---------------|----------------------------
rev                 | long unsigned | Stores the reversed number (used globally).
num                 | long unsigned | Stores the input number entered by the user.
number              | long unsigned | Stores the number passed to the reverse() function.
*/
