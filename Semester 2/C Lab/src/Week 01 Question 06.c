// Read two numbers. Write a program to find their product after exchanging their last digits.

// Algorithm:
// 1. Declare two integer variables to store the user input for both numbers.
// 2. Prompt the user to input the first number.
// 3. Prompt the user to input the second number.
// 4. Swap the last digits of both numbers:
//    - Remove the last digit of the first number and add the last digit of the second number.
//    - Remove the last digit of the second number and add the last digit of the first number.
// 5. Display the modified numbers after swapping their last digits.
// 6. Calculate and display the product of the modified numbers.
// 7. Return 0 to indicate successful execution.

#include<stdio.h>   // Header file for standard input/output functions

// Main function - entry point of the program
int main()
{
    int number1, number2;  // Declare two integer variables to store the user input

    // Prompt the user to enter the first number
    printf("Enter the first number: ");
    scanf("%d", &number1);  // Read the first number from the user

    // Prompt the user to enter the second number
    printf("Enter the second number: ");
    scanf("%d", &number2);  // Read the second number from the user

    // Swap the last digits of both numbers
    // Remove the last digit of the first number (number1 - number1%10) and add the last digit of the second number (number2%10)
    printf("After swapping, first number is: %d\n", number1 - number1 % 10 + number2 % 10);

    // Remove the last digit of the second number (number2 - number2%10) and add the last digit of the first number (number1%10)
    printf("After swapping, second number is: %d\n", number2 - number2 % 10 + number1 % 10);

    // Calculate the product of the modified numbers and display it
    // Multiply the new numbers after swapping their last digits
    printf("The product of the new numbers %d, %d is: %d\n", number1 - number1 % 10 + number2 % 10, number2 - number2 % 10 + number1 % 10, (number1 - number1 % 10 + number2 % 10) * (number2 - number2 % 10 + number1 % 10));

    return 0; // Return 0 to indicate successful execution
}

// Variable Description:

// | Variable Identifier | Data Type | Use/Description                                    |
// |---------------------|-----------|----------------------------------------------------|
// | number1             | int       | Stores the first number entered by the user        |
// | number2             | int       | Stores the second number entered by the user       |
