// Write a program which reads x1, y1, x2, and y2 and finds the distance between points (x1, y1) and (x2, y2).

// Algorithm:
// 1. Start.
// 2. Read the coordinates of the first point (x1, y1).
// 3. Read the coordinates of the second point (x2, y2).
// 4. Use the distance formula to calculate the distance between the two points:
//      distance = sqrt((x2 - x1)^2 + (y2 - y1)^2)
// 5. Print the calculated distance.
// 6. End.

#include<stdio.h>   // Header file for standard input/output functions
#include<math.h>    // Header file for mathematical functions like sqrt() and pow()
#include<conio.h>   // Header file for console input/output functions (used for getch())

// Function to calculate the distance between two points using the distance formula
// Parameters: 
// x1, y1  - Coordinates of the first point.
// x2, y2  - Coordinates of the second point.
// Returns: The calculated distance between the two points.
double distance(double x1, double y1, double x2, double y2) 
{
    // Calculate and return the distance between the two points
    return sqrt(pow((x2 - x1), 2) + pow((y2 - y1), 2));
}

int main() 
{
    double x_1, y_1, x_2, y_2; // Declare variables to store the coordinates of the two points

    // Prompt and read the abscissa (x-coordinate) of the first point
    printf("Enter the abscissa of the first point: ");
    scanf("%lf", &x_1);

    // Prompt and read the ordinate (y-coordinate) of the first point
    printf("Enter the ordinate of the first point: ");
    scanf("%lf", &y_1);

    // Prompt and read the abscissa (x-coordinate) of the second point
    printf("Enter the abscissa of the second point: ");
    scanf("%lf", &x_2);

    // Prompt and read the ordinate (y-coordinate) of the second point
    printf("Enter the ordinate of the second point: ");
    scanf("%lf", &y_2);

    // Print the calculated distance between the two points
    printf("Distance between points (%.2lf, %.2lf) and (%.2lf, %.2lf) is %.2lf\n", x_1, y_1, x_2, y_2, distance(x_1, y_1, x_2, y_2));

    getch(); // Pause the output screen before exiting
    return 0; // Indicate successful execution
}

/*
Variable Identifier | Data Type | Use/Description
--------------------|-----------|----------------------------
x_1                 | double    | Stores the abscissa (x-coordinate) of the first point.
y_1                 | double    | Stores the ordinate (y-coordinate) of the first point.
x_2                 | double    | Stores the abscissa (x-coordinate) of the second point.
y_2                 | double    | Stores the ordinate (y-coordinate) of the second point.
x1                  | double    | Coordinates of the two points whose distance is being calculated.
x2                  | double    | Coordinates of the two points whose distance is being calculated.
y1                  | double    | Coordinates of the two points whose distance is being calculated.
y2                  | double    | Coordinates of the two points whose distance is being calculated.
*/