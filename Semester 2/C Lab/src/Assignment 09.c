// Write a program to find out the summation of two variables.

// Algorithm:
// 1. Declare two variables of type double to store the user input numbers.
// 2. Prompt the user to enter the first number.
// 3. Read the first number from the user.
// 4. Prompt the user to enter the second number.
// 5. Read the second number from the user.
// 6. Calculate the sum of the two numbers.
// 7. Display the result of the summation.
// 8. Return 0 to indicate successful execution.

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

// Variable Description:

// | Variable Identifier | Data Type | Use/Description                                 |
// |---------------------|-----------|-------------------------------------------------|
// | number1             | double    | Stores the first number entered by the user     |
// | number2             | double    | Stores the second number entered by the user    |
