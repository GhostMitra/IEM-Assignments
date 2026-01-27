// Write a program to insert 1 as a first digit after decimal.

// Algorithm:
// 1. Declare a variable of type double to store the user input number.
// 2. Prompt the user to input a number with a decimal.
// 3. Extract the integer part of the number using type casting.
// 4. Add 0.1 to the integer part to insert '1' after the decimal point.
// 5. Extract the fractional part of the number, scale it, and add it back to the result.
// 6. Display the modified number with '1' inserted after the decimal point.
// 7. Return 0 to indicate successful execution.

#include<stdio.h>   // Header file for standard input/output functions

// Main function - entry point of the program
int main()
{
    double number;  // Declare a variable of type double to store the user input

    printf("Enter a number: ");  // Prompt the user to enter a number
    scanf("%lf", &number);       // Read the input number from the user

    // Insert '1' as the first digit after the decimal point
    // The expression ((int)number) extracts the integer part of the number.
    // Adding 0.1 places the digit 1 after the decimal point.
    // (number - (int)number) extracts the fractional part of the number and adds a scaled fraction.
    number = ((int)number) + 0.1 + (number - (int)number) * 0.1;

    // Display the modified number after inserting 0.1 as the first digit after the decimal
    printf("The number after inserting 0.1 as the first digit after the decimal is: %lf", number);

    return 0; // Return 0 to indicate successful execution
}

// Variable Description:

// | Variable Identifier | Data Type | Use/Description                                       |
// |---------------------|-----------|-------------------------------------------------------|
// | number              | double    | Stores the number entered by the user with decimal part|
