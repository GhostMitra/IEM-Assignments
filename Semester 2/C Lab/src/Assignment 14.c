// Write a program, which reads a, b and c as sides of a triangle and prints whether angle A is a right angle or not.

// Algorithm:
// 1. Start.
// 2. Read the lengths of the three sides a, b, and c of the triangle.
// 3. Check if any angle of the triangle is a right angle using the Pythagorean theorem:
//      - If a² = b² + c², then angle A is a right angle.
//      - If b² = a² + c², then angle B is a right angle.
//      - If c² = a² + b², then angle C is a right angle.
// 4. Print the result based on the condition.
// 5. End.

#include<stdio.h>   // Header file for standard input/output functions
#include<math.h>    // Header file for mathematical functions like pow()

int main() 
{
    double a, b, c;  // Declare variables to store the three sides of the triangle

    // Prompt and read the first side of the triangle
    printf("Enter the first side of the triangle: ");
    scanf("%lf", &a);

    // Prompt and read the second side of the triangle
    printf("Enter the second side of the triangle: ");
    scanf("%lf", &b);

    // Prompt and read the third side of the triangle
    printf("Enter the third side of the triangle: ");
    scanf("%lf", &c);

    // Check if angle A is a right angle using the Pythagorean theorem
    if (pow(a, 2) == pow(b, 2) + pow(c, 2)) 
    {
        printf("Angle A is a right angle");
    }
    // Check if angle B is a right angle
    else if (pow(b, 2) == pow(a, 2) + pow(c, 2)) 
    {
        printf("Angle B is a right angle");
    }
    // Check if angle C is a right angle
    else if (pow(c, 2) == pow(b, 2) + pow(a, 2)) 
    {
        printf("Angle C is a right angle");
    }
    // If no angle is a right angle
    else 
    {
        printf("No angle is a right angle");
    }

    getch();  // Pause the output screen before exiting
    return 0; // Indicate successful execution
}

/*
Variable Identifier | Data Type | Use/Description
--------------------|-----------|----------------------------
a                   | double    | Stores the first side of the triangle.
b                   | double    | Stores the second side of the triangle.
c                   | double    | Stores the third side of the triangle.
*/