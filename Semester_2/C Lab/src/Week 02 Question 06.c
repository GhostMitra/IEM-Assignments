// Write a C program to input electricity unit consumed and calculate the total electricity bill according to the given condition:
// ▪ For first 50 units Rs. 1.25/unit
// ▪ For next 50 units Rs. 1.50/unit
// ▪ For next 100 units Rs. 2.00/unit
// ▪ For next 100 units Rs. 2.50/unit
// ▪ For unit above 300 Rs. 3.25/unit
// An additional surcharge of 20% is added to the overall bill.

/*
Algorithm:
1. Start.
2. Read the number of electricity units consumed.
3. Check the range of units consumed:
    a. If units are less than or equal to 50, calculate the bill as units * 1.25.
    b. If units are between 51 and 100, calculate the bill as (50 * 1.25) + (remaining units * 1.50).
    c. If units are between 101 and 200, calculate the bill as (50 * 1.25) + (50 * 1.50) + (remaining units * 2).
    d. If units are between 201 and 300, calculate the bill as (50 * 1.25) + (50 * 1.50) + (100 * 2) + (remaining units * 2.50).
    e. If units are above 300, calculate the bill as (50 * 1.25) + (50 * 1.50) + (100 * 2) + (100 * 2.50) + (remaining units * 3.25).
4. Add a 20% surcharge on the calculated bill.
5. Print the final electricity bill amount.
6. End.
*/

#include<stdio.h>   // Header file for standard input/output functions

// Function to calculate electricity bill based on the units consumed
double electricityBill(double units) 
{
    double billAmount;

    // If units are less than or equal to 50, apply the first rate
    if(units <= 50)
    {
        billAmount = units * 1.25;
    }
    // If units are between 51 and 100, apply rates for the first 50 units and then the next units
    else if(units > 50 && units <= 100)
    {
        billAmount = 50 * 1.25 + (units - 50) * 1.50;
    }
    // If units are between 101 and 200, apply rates for the first 100 units and then the next units
    else if(units > 100 && units <= 200)
    {
        billAmount = 50 * 1.25 + 50 * 1.50 + (units - 100) * 2;
    }
    // If units are between 201 and 300, apply rates for the first 200 units and then the next units
    else if(units > 200 && units <= 300)
    {
        billAmount = 50 * 1.25 + 50 * 1.50 + 100 * 2 + (units - 200) * 2.50;
    }
    // If units are greater than 300, apply rates for the first 300 units and then the next units
    else if(units > 300)
    {
        billAmount = 50 * 1.25 + 50 * 1.50 + 100 * 2 + 100 * 2.50 + (units - 300) * 3.25;
    }

    // Add 20% surcharge to the bill
    return billAmount + billAmount * 0.2;
}

int main() 
{
    double unit;  // Declare variable to store the units consumed

    // Prompt the user to enter the units consumed
    printf("Enter the units consumed: ");
    scanf("%lf", &unit);

    // Print the final electricity bill amount, rounded to two decimal places
    printf("Your electricity bill amount is ₹ %.2lf \n", electricityBill(unit));

    return 0;  // Indicate successful execution
}

/*
Variable Identifier | Data Type | Use/Description
---------------- ---|-----------|----------------------------
unit                | double    | Stores the number of electricity units consumed.
billAmount          | double    | Stores the calculated electricity bill before surcharge.
units               | double    | The parameter passed to the electricityBill function representing the number of units consumed.
*/ 
