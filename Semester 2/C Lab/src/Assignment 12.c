// Write a program, which reads a, b, and c as sides of a triangle and prints the area.

// Algorithm:
// 1. Start.
// 2. Read the three sides of the triangle: a, b, and c.
// 3. Calculate the semi-perimeter (s) using the formula:
//      s = (a + b + c) / 2
// 4. Calculate the area of the triangle using Heron's formula:
//      area = sqrt(s * (s - a) * (s - b) * (s - c))
// 5. Print the calculated area.
// 6. End.

#include<stdio.h>   // Header file for standard input/output functions
#include<math.h>    // Header file for mathematical functions like sqrt()

// Function to calculate the area of a triangle using Heron's formula
double area(double side1, double side2, double side3) 
{
    double s = (side1 + side2 + side3) / 2; // Calculate the semi-perimeter
    // Return the calculated area using Heron's formula
    return sqrt(s * (s - side1) * (s - side2) * (s - side3));
}

int main() 
{
    double a, b, c; // Declare variables to store the sides of the triangle

    // Prompt and read the first side of the triangle
    printf("Enter the first side of the triangle: ");
    scanf("%lf", &a);

    // Prompt and read the second side of the triangle
    printf("Enter the second side of the triangle: ");
    scanf("%lf", &b);

    // Prompt and read the third side of the triangle
    printf("Enter the third side of the triangle: ");
    scanf("%lf", &c);

    // Print the calculated area of the triangle
    printf("The area of the triangle is %lf sq. units", area(a, b, c));

    return 0; // Indicate successful execution
}

/*
Variable Identifier | Data Type | Use/Description
---------------- ---|-----------|----------------------------
a                   | double    | Stores the first side of the triangle.
b                   | double    | Stores the second side of the triangle.
c                   | double    | Stores the third side of the triangle.
s                   | double    | Stores the semi-perimeter of the triangle (local to the area function).
side1               | double    | Parameters representing the sides of the triangle passed to the area function.
side2               | double    | Parameters representing the sides of the triangle passed to the area function.
side3               | double    | Parameters representing the sides of the triangle passed to the area function.
*/
