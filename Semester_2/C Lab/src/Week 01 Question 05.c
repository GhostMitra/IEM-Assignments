// Write a program to exchange the last two digits of any user given input number.

// Algorithm:
// 1. Declare an integer variable to store the number.
// 2. Prompt the user to input a number.
// 3. Calculate and display the last two digits of the number using the modulus operator.
// 4. Remove the last two digits from the number.
// 5. Extract the second last digit and place it in the units position.
// 6. Move the last digit to the tens place.
// 7. Reassemble the number with the last two digits swapped.
// 8. Display the new number after exchanging the last two digits.
// 9. Return 0 to indicate successful execution of the program.

#include<stdio.h>   // Header file for standard input/output functions

// Main function - entry point of the program
int main()
{
    int number;  // Declare an integer variable to store the user input

    printf("Enter a number: ");  // Prompt the user to enter a number
    scanf("%d", &number);       // Read the input number from the user

    // Calculate and display the last two digits of the number using the modulus operator
    // number % 100 gives the last two digits of the number
    printf("The last two digits of the number are %d \n", (number % 100));

    // Swap the last two digits of the number
    // number - number % 100 removes the last two digits.
    // (number % 100 - number % 10) / 10 extracts the second last digit and places it in the units position.
    // (number % 10) * 10 moves the last digit to the tens place.
    number = (number - number % 100) + (number % 100 - number % 10) / 10 + (number % 10) * 10;

    // Display the new number after exchanging the last two digits
    printf("The new number after exchanging the last two digits is %d \n", number);

    return 0; // Return 0 to indicate successful execution
}

// Variable Description:

// | Variable Identifier | Data Type | Use/Description                                    |
// |---------------------|-----------|----------------------------------------------------|
// | number              | int       | Stores the number entered by the user for processing |
