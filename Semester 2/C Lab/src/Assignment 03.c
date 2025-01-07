// Write a program to find the last digit of a number without using modulus operator.

// Algorithm:
// 1. Declare an integer variable to store the number.
// 2. Prompt the user to input a number.
// 3. Use integer division and multiplication to extract the last digit of the number without using the modulus operator.
// 4. Display the last digit of the number.
// 5. Return 0 to indicate successful execution of the program.

#include<stdio.h>   // Header file for standard input/output functions

// Main function - entry point of the program
int main()
{
    int number;  // Declare an integer variable to store the user input

    printf("Enter a number: ");  // Prompt the user to enter a number
    scanf("%d", &number);       // Read the input number from the user

    // Calculate the last digit without using the modulus operator.
    // (number / 10) gives the number without the last digit.
    // Multiplying by 10 gives back the nearest multiple of 10 smaller than the number.
    // Subtracting from the original number gives the last digit.
    printf("The last digit of the number is %d \n", number - (number / 10) * 10);

    getch();  // Wait for a key press to pause the output screen
    return 0; // Return 0 to indicate successful execution
}

// Variable Description:

// | Variable Identifier | Data Type | Use/Description                                    |
// |---------------------|-----------|----------------------------------------------------|
// | number              | int       | Stores the number entered by the user for processing |
