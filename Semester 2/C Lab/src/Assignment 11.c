// Write a program to convert temperature between Fahrenheit to Celsius and Vice Versa

// Algorithm:
// 1. Start
// 2. Initialize variables: `temperature` (double), `choice` (int), and `flag` (int).
// 3. Display a menu for temperature conversion options:
//    a. Option 1: Convert Celsius to Fahrenheit.
//    b. Option 2: Convert Fahrenheit to Celsius.
// 4. Read user's choice and validate input.
// 5. Perform the selected conversion:
//    a. If choice = 1: Read temperature in Celsius, convert to Fahrenheit using the formula:
//       Fahrenheit = (Celsius * 180 / 100) + 32
//    b. If choice = 2: Read temperature in Fahrenheit, convert to Celsius using the formula:
//       Celsius = (Fahrenheit - 32) * 100 / 180
// 6. Display the result of the conversion.
// 7. Ask the user if they want to continue or exit:
//    a. If yes, repeat from step 3.
//    b. If no, terminate the program.
// 8. Stop.

#include<stdio.h>   // Header file for standard input/output functions
#include<conio.h>   // Header file for console input/output functions (used for getch())

// Function to convert temperature scales
// Parameters:
// - fromScaleRange: Scale range of the original unit (e.g., 100 for Celsius, 180 for Fahrenheit)
// - toScaleRange: Scale range of the target unit
// - offset: The value to be added or subtracted during conversion
// - temp: The temperature value to be converted
double changeScale(double fromScaleRange, double toScaleRange, double offset, double temp) 
{
    return (temp * fromScaleRange / toScaleRange + offset);  // Perform the conversion
}

int main() 
{
    double temperature; // Variable to store the user-input temperature
    int choice, flag;   // Variables for user choice and control flow

    do 
    {
        flag = 1;       // Initialize the flag for looping
        choice = 0;     // Reset the choice variable for each iteration

        // Display the main menu
        printf("The Temperature Converter\n");
        printf("1. Celsius to Fahrenheit\n");
        printf("2. Fahrenheit to Celsius\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);  // Read user's choice

        switch (choice) 
        {
        case 1:
            // Conversion from Celsius to Fahrenheit
            printf("Enter the temperature in Celsius: ");
            scanf("%lf", &temperature);  // Read temperature in Celsius
            // Convert and display the result
            printf("The temperature %.2lf°C in Fahrenheit scale is %.2lf°F \n\n", temperature, changeScale(180, 100, 32, temperature));
            break;

        case 2:
            // Conversion from Fahrenheit to Celsius
            printf("Enter the temperature in Fahrenheit: ");
            scanf("%lf", &temperature);  // Read temperature in Fahrenheit
            // Convert and display the result
            printf("The temperature %.2lf°F in Celsius scale is %.2lf°C \n\n", temperature, changeScale(100, 180, -32 / 1.8, temperature));
            break;

        default:
            // Handle invalid choices
            printf("Invalid Choice! Please choose 1 or 2.\n\n");
            flag = 0; // Set flag to re-display the menu
            continue; // Skip further execution and return to the menu
        }

        // Prompt the user to continue or exit
        do 
        {
            printf("Do you want to continue? 1. Yes, 2. No\nEnter your choice: ");
            scanf("%d", &choice);  // Read the user's choice for continuation

            if (choice == 1) 
            {
                flag = 0; // Continue the program
            } 
            else if (choice == 2) 
            {
                flag = 1; // Exit the program
            } 
            else 
            {
                // Handle invalid input
                printf("Invalid choice. Please enter 1 or 2.\n\n");
                flag = 2; // Re-prompt the user
            }
        } while (flag == 2); // Repeat until a valid choice is entered

    } while (flag == 0); // Repeat the entire process if the user chooses to continue

    getch(); // Pause the program before exiting
    return 0; // Indicate successful program termination
}

// Variable Descriptions
// ------------------------------------------------------------------------------
// Variable Identifier | Data Type    | Use/Description
// ------------------------------------------------------------------------------
// temperature         | double       | Stores the temperature entered by the user.
// choice              | int          | Stores the user's menu choice for conversion.
// flag                | int          | Controls the program flow for continuation or termination.
// fromScaleRange      | double       | Parameter to represent the scale range of the original unit.
// toScaleRange        | double       | Parameter to represent the scale range of the target unit.
// offset              | double       | Parameter to adjust the result during the conversion.
// temp                | double       | Parameter to pass the temperature for conversion.
// ------------------------------------------------------------------------------
