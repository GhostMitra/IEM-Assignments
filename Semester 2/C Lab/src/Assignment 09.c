// Write a program to find out the summation of two variables.

#include<stdio.h>   // Header file for standard input/output functions
#include<conio.h>   // Header file for console input/output functions (used for getch())

// Main function - entry point of the program
int main()
{
    double number1, number2;  // Declare two variables of type double to store the user inputs

    // Prompt the user to enter the first number
    printf("Enter the first number: ");
    scanf("%lf", &number1);  // Read the first number from the user

    // Prompt the user to enter the second number
    printf("Enter the second number: ");
    scanf("%lf", &number2);  // Read the second number from the user

    // Calculate and display the sum of the two numbers
    printf("The sum of %lf and %lf is %lf\n", number1, number2, number1 + number2);

    getch();  // Wait for a key press to pause the output screen
    return 0; // Return 0 to indicate successful execution
}
