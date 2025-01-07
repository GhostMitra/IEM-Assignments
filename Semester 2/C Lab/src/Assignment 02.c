// Write a program to find the last digit of the number and delete the last digit.

#include<stdio.h>   // Header file for standard input/output functions
#include<conio.h>   // Header file for console input/output functions (used for getch())

// Main function - entry point of the program
int main()
{
    int number;  // Declare an integer variable to store the user input

    printf("Enter a number: ");  // Prompt the user to enter a number
    scanf("%d", &number);       // Read the input number from the user

    // Calculate and display the last digit of the number
    printf("The last digit of the number is %d \n", (number % 10));

    // Remove the last digit by performing integer division by 10
    number /= 10;

    // Display the number after deleting the last digit
    printf("The new number after deleting the last digit is %d \n", number);

    getch();  // Wait for a key press to pause the output screen
    return 0; // Return 0 to indicate successful execution
}
