// Write a program to check whether a number is prime or composite.

/*
Algorithm:
1. Start.
2. Read a number as input.
3. Check if the number is 0 or 1:
    a. If yes, return "neither prime nor composite".
4. If the number is greater than 1:
    a. For each integer from 2 to sqrt(number), check if the number is divisible by any of these integers.
    b. If divisible by any integer, return "Composite".
    c. If not divisible by any integer, return "Prime".
5. Print the result ("Prime", "Composite", or "neither Prime nor Composite").
6. End.
*/

#include<stdio.h>   // Header file for standard input/output functions
#include<math.h>    // Header file for mathematical functions like sqrt()

// Function to check if a number is prime, composite, or neither
int isPrimeOrComposite(unsigned long long int number) 
{
    unsigned long long int i;

    // If the number is 0 or 1, return 2 (indicating neither prime nor composite)
    if(number == 0 || number == 1)
    {
        return 2;
    }
    else
    {
        // Check if the number is divisible by any number from 2 to sqrt(number)
        for(i = 2; i < (unsigned long long int)sqrt(number) + 1; i++)
        {
            // If divisible, return 1 (indicating it's a composite number)
            if(number % i == 0)
            {
                return 1;
            }
        }
        // If no divisor is found, return 0 (indicating it's a prime number)
        return 0;
    }
}

int main() 
{
    unsigned long long int num; // Declare variable to store the input number

    // Prompt and read the input number
    printf("Enter a number: ");
    scanf("%llu", &num);

    // Check if the number is prime, composite, or neither
    // The result is printed based on the function's return value
    printf("The number %llu is %s", num, (isPrimeOrComposite(num) == 0 ? "Prime\n" : (isPrimeOrComposite(num) == 1) ? "Composite\n" : "neither Prime nor Composite\n"));
    return 0; // Indicate successful execution
}

/*
Variable Identifier | Data Type                   | Use/Description
---------------- ---|-----------------------------|----------------------------
num                 | unsigned long long int      | Stores the number entered by the user.
i                   | unsigned long long int      | Used as a loop counter to check divisibility of the number.
number              | unsigned long long int      | The parameter passed to the isPrimeOrComposite function representing the number to be checked.
*/ 
