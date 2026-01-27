#include <stdio.h>
struct employee
{
    char name[100];
    int employeeID;
    char department[100];
    char position[100];
    double salary;
};
int main()
{
    int num;
    printf("Enter the number of employees: ");
    scanf("%d", &num);
    struct employee database[num];
    for(int i = 0; i<num; i++)
    {
        printf("Enter the Employee ID of Employee %d: ", i+1);
        scanf("%d", &database[i].employeeID);
        getchar();
        printf("Enter the name of employee %d: ", i+1);
        scanf("%[^\n]", database[i].name);
        getchar();
        printf("Enter the department of employee %d: ", i+1);
        scanf("%[^\n]", database[i].department);
        getchar();
        printf("Enter the department of employee %d: ", i+1);
        scanf("%[^\n]", database[i].department);
        getchar();
        printf("Enter the position of employee %d: ", i+1);
        scanf("%[^\n]", database[i].position);
        getchar();
        printf("Enter the salary of employee %d: ", i+1);
        scanf("%lf", &database[i].salary);
        getchar();
    }
    printf("\n\n\nName \t\t\t Employee ID \t\t Department \t\t Position \t\t Salary\n");
    for(int i = 0; i<num; i++)
    {
        printf("%s \t %d \t\t %s \t\t %s \t\t %lf \n", database[i].name, database[i].employeeID, database[i].department, database[i].position, database[i].salary);
    }
    return 0;
}