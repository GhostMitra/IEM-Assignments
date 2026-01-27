// Write a program to test whether any year is leap year or not.

// Algorithm:
// 1. Start.
// 2. Read the year input from the user.
// 3. Check the leap year conditions:
//      - A year is a leap year if it is divisible by 4, but not divisible by 100, 
//        except if it is divisible by 400.
// 4. Print whether the year is a leap year or not.
// 5. End.

#include<stdio.h>   // Header file for standard input/output functions

int main() 
{
    long year;  // Declare a variable to store the year entered by the user

    // Prompt the user to enter a year
    printf("Enter a year: ");
    scanf("%ld", &year);  // Read the year input from the user

    // Check if the year is a leap year and display the result
    printf("The Year %ld is %s ", year, (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) ? "Leap Year." : "not Leap Year.");

    return 0; // Indicate successful execution
}

/*
Variable Identifier | Data Type | Use/Description
--------------------|-----------|----------------------------
year               | long      | Stores the year entered by the user.
*/