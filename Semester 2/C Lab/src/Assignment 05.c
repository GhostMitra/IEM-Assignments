// Write a program to double the last digit of any user given input number.

#include<stdio.h>   // Header file for standard input/output functions
#include<conio.h>   // Header file for console input/output functions (used for getch())

// Main function - entry point of the program
int main()
{
    int number;  // Declare an integer variable to store the user input

    printf("Enter a number: ");  // Prompt the user to enter a number
    scanf("%d", &number);       // Read the input number from the user

    // Calculate and display the last digit of the number using the modulus operator
    // number % 10 gives the last digit of the number
    printf("The last digit of the number is %d \n", (number % 10));

    // Check if the last digit is greater than 4. If true, multiply the last digit by 2 and reassemble the number.
    // Otherwise, directly double the last digit and add it back to the number without changing the other digits.
    number = (number % 10) > 4 ? (number - number % 10) * 10 + (number % 10) * 2 : (number - number % 10) + (number % 10) * 2;

    // Display the new number after doubling the last digit
    printf("The new number after doubling the last digit is %d \n", number);

    getch();  // Wait for a key press to pause the output screen
    return 0; // Return 0 to indicate successful execution
}
