// Write a program to accept the marks of a student and display the grade accordingly.

// Algorithm:
// 1. Start.
// 2. Initialize variables to store the total and full marks, and a temporary variable for individual subject marks.
// 3. Loop to accept multiple subjects' marks, adding them to the total marks.
// 4. Calculate the grade based on the total marks obtained and full marks for all subjects.
// 5. Display the grade.
// 6. End.

#include<stdio.h>   // Header file for standard input/output functions

// Function to calculate the grade based on total marks and full marks
char grade(double totalMarks, double fullMarks) 
{
    // Determine the grade based on percentage
    if (totalMarks / fullMarks <= 1 && totalMarks / fullMarks >= 0.9) 
    {
        return 'O';  // Grade O for marks 90% and above
    } 
    else if (totalMarks / fullMarks < 0.9 && totalMarks / fullMarks >= 0.8) 
    {
        return 'E';  // Grade E for marks between 80% and 89%
    } 
    else if (totalMarks / fullMarks < 0.8 && totalMarks / fullMarks >= 0.7) 
    {
        return 'A';  // Grade A for marks between 70% and 79%
    } 
    else if (totalMarks / fullMarks < 0.7 && totalMarks / fullMarks >= 0.6) 
    {
        return 'B';  // Grade B for marks between 60% and 69%
    } 
    else if (totalMarks / fullMarks < 0.6 && totalMarks / fullMarks >= 0.5) 
    {
        return 'C';  // Grade C for marks between 50% and 59%
    } 
    else if (totalMarks / fullMarks < 0.5 && totalMarks / fullMarks >= 0.4) 
    {
        return 'D';  // Grade D for marks between 40% and 49%
    } 
    else if (totalMarks < 0.4) 
    {
        return 'F';  // Grade F for marks below 40%
    }
}

// Main function to interact with the user and calculate the grade
int main() 
{
    double totalMark = 0, fullMark = 0, temp1 = 0, temp2 = 0;  // Declare variables for total and full marks
    int flag = 0, choice = 0;  // Flag for continuation and choice for actions

    do 
    {
        // Prompt the user to enter the full marks for the subject
        printf("Enter the full marks in the subject: ");
        scanf("%lf", &temp1);  // Read full marks for the subject

        // Prompt the user to enter the total marks obtained by the student
        printf("Enter the total marks obtained by a student in the subject: ");
        scanf("%lf", &temp2);  // Read total marks for the subject
        if(temp1 < temp2)
        {
            printf("Invalid marks enter again \n\n");
            continue; // Re-enter the marks if total exceeds full marks
        }
        else
        {
            fullMark += temp1;  // Add to the full marks for the subject
            totalMark += temp2;  // Add to the total marks obtained
        }

        // Prompt the user to continue or exit
        do 
        {
            printf("Do you want to continue? 1. Yes, 2. No\nEnter your choice: ");
            scanf("%d", &choice);  // Read the user's choice to continue

            if (choice == 1) 
            {
                flag = 0;  // Continue the program
            } 
            else if (choice == 2) 
            {
                flag = 1;  // Exit the program
            } 
            else 
            {
                printf("Invalid choice. Please enter 1 or 2.\n\n");
                flag = 2;  // Re-prompt for valid input
            }
        } while (flag == 2);

    } while (flag == 0);  // Repeat the program if the user chooses to continue

    // Calculate and print the grade based on total marks
    printf("The grade of the student is: %c\n", grade(totalMark, fullMark));

    return 0;  // Indicate successful execution
}

/*
Variable Identifier | Data Type | Use/Description
--------------------|-----------|----------------------------
totalMark           | double    | Stores the total marks obtained by the student.
fullMark            | double    | Stores the total full marks for all subjects.
temp1               | double    | Temporary variable used for individual subject full marks input.
temp2               | double    | Temporary variable used for individual subject total marks input.
flag                | int       | Controls the continuation of the program.
choice              | int       | Stores the user's choice for continuation.
totalMarks          | double    | Stores the total marks obtained by the student as parameters in the grade() function.
fullMarks           | double    | Stores the total full marks for all subjects as parameters in the grade() function.
*/