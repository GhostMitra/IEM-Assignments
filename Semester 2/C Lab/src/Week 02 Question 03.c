// Write a program to check whether a number is even or odd.

// Algorithm:
// 1. Start.
// 2. Read the input number from the user.
// 3. Check if the number is divisible by 2:
//      - If number % 2 == 0, the number is even.
//      - Else, the number is odd.
// 4. Print the result (whether the number is even or odd).
// 5. End.

#include<stdio.h>   // Header file for standard input/output functions

int main() 
{
    long number;  // Declare variable to store the number entered by the user

    // Prompt the user to enter a number
    printf("Enter a number: ");
    scanf("%ld", &number);  // Read the input number from the user

    // Check if the number is even or odd and display the result
    printf("%ld is %s number.\n", number, (number % 2 == 0) ? "even" : "odd");

    return 0; // Indicate successful execution
}

/*
Variable Identifier | Data Type | Use/Description
--------------------|-----------|----------------------------
number              | long      | Stores the input number entered by the user.
*/
