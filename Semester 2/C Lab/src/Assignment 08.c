// Write a program to insert 1 as a first digit after decimal.

#include<stdio.h>   // Header file for standard input/output functions
#include<conio.h>   // Header file for console input/output functions (used for getch())

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

    getch();  // Wait for a key press to pause the output screen
    return 0; // Return 0 to indicate successful execution
}
