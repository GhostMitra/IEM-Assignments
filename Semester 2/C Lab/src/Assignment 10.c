// Write a program to swap two numbers using and without using third variable.

// Algorithm:
// 1. Declare three integer variables to store the user inputs and a temporary variable for swapping.
// 2. Prompt the user to enter the first number.
// 3. Read the first number from the user.
// 4. Prompt the user to enter the second number.
// 5. Read the second number from the user.
// 6. Swap the numbers using a temporary variable:
//    - Store the value of the second number in the temporary variable.
//    - Assign the value of the first number to the second number.
//    - Assign the value stored in the temporary variable to the first number.
// 7. Swap the numbers without using a third variable using arithmetic operations:
//    - Add both numbers and store the sum in one number.
//    - Subtract the new number from the sum to get the original second number.
//    - Subtract the new number from the sum to get the original first number.
// 8. Swap the numbers without using a third variable using XOR bitwise operation:
//    - Apply XOR on both numbers, assign it to one of the numbers.
//    - Apply XOR again to swap the values.
// 9. Return 0 to indicate successful execution.

#include<stdio.h>   // Header file for standard input/output functions

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

    getchar();  // Wait for a key press to pause the output screen
    return 0; // Return 0 to indicate successful execution
}

// Variable Description:

// | Variable Identifier | Data Type | Use/Description                                                         |
// |---------------------|-----------|-------------------------------------------------------------------------|
// | number1             | int       | Stores the first number entered by the user                             |
// | number2             | int       | Stores the second number entered by the user                            |
// | temp                | int       | Temporary variable used for swapping values between number1 and number2 |
