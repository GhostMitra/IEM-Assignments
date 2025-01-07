// Write a program to swap two numbers using and without using third variable.

#include<stdio.h>   // Header file for standard input/output functions
#include<conio.h>   // Header file for console input/output functions (used for getch())

// Main function - entry point of the program
int main()
{
    int number1, number2, temp;  // Declare integer variables to store the user inputs and a temporary variable for swapping

    // Prompt the user to enter the first number
    printf("Enter the first number: ");
    scanf("%d", &number1);  // Read the first number from the user

    // Prompt the user to enter the second number
    printf("Enter the second number: ");
    scanf("%d", &number2);  // Read the second number from the user

    // Swap the numbers using a temporary variable
    temp = number2;      // Store the value of number2 in temp
    number2 = number1;   // Assign the value of number1 to number2
    number1 = temp;      // Assign the value of temp (original number2) to number1
    printf("After swapping, the numbers are: %d, %d \n", number1, number2);

    // Swap the numbers using arithmetic operations
    temp = 0;            // Reset temp
    number2 = number1 + number2;  // number2 becomes the sum of number1 and number2
    number1 = number2 - number1;  // number1 becomes the original value of number2
    number2 = number2 - number1;  // number2 becomes the original value of number1
    printf("After swapping, the numbers are again: %d, %d \n", number1, number2);

    // Swap the numbers using bitwise XOR
    number1 ^= number2;  // XOR number1 and number2 and store the result in number1
    number2 ^= number1;  // XOR the new value of number1 with number2 and store the result in number2
    number1 ^= number2;  // XOR the new value of number2 with number1 and store the result in number1
    printf("After swapping, the numbers are again: %d, %d \n", number1, number2);

    getch();  // Wait for a key press to pause the output screen
    return 0; // Return 0 to indicate successful execution
}
