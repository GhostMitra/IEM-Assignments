#include <stdio.h>
struct student
{
    char name[100];
    int rollNumber;
    char stream[100];
    double marks;
};
int main()
{
    int num;
    printf("Enter the number of students: ");
    scanf("%d", &num);
    struct student database[num];
    for(int i = 0; i<num; i++)
    {
        printf("Enter the roll number of student %d: ", i+1);
        scanf("%d", &database[i].rollNumber);
        getchar();
        printf("Enter the name of student %d: ", i+1);
        scanf("%[^\n]", database[i].name);
        getchar();
        printf("Enter the stream of student %d: ", i+1);
        scanf("%[^\n]", database[i].stream);
        getchar();
        printf("Enter the marks of student %d: ", i+1);
        scanf("%lf", &database[i].marks);
        getchar();
    }
    printf("\n\n\nName \t\t\t Roll Number \t\t Stream \t Marks\n");
    for(int i = 0; i<num; i++)
    {
        printf("%s \t %d \t\t %s \t\t %lf \n", database[i].name, database[i].rollNumber, database[i].stream, database[i].marks);
    }
    return 0;
}