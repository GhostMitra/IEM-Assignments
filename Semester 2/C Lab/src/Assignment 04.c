// Write a program to delete the last two digits of any user given input number.

#include<stdio.h>   // Header file for standard input/output functions
#include<conio.h>   // Header file for console input/output functions (used for getch())

// Main function - entry point of the program
int main()
{
    int number;  // Declare an integer variable to store the user input

    printf("Enter a number: ");  // Prompt the user to enter a number
    scanf("%d", &number);       // Read the input number from the user

    // Calculate and display the last two digits of the number using the modulus operator
    // number % 100 gives the last two digits of the number
    printf("The last two digits of the number are %d \n", (number % 100));

    // Remove the last two digits by performing integer division by 100
    number /= 100;

    // Display the new number after deleting the last two digits
    printf("The new number after deleting the last two digits is %d \n", number);

    getch();  // Wait for a key press to pause the output screen
    return 0; // Return 0 to indicate successful execution
}
