// Write a program to display "Hello World".

#include<stdio.h>   // Header file for standard input/output functions
#include<conio.h>   // Header file for console input/output functions (used for getch())

// Main function - entry point of the program
int main()
{
    printf("Hello World \n");  // Prints "Hello World" followed by a newline character
    getch();                   // Waits for a key press (used to pause the output screen)
    return 0;                  // Returns 0 to indicate successful execution
}
