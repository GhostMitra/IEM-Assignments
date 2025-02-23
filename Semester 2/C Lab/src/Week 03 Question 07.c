#include<stdio.h>
void binaryTriangle(unsigned long long int lines)
{
    unsigned long long int i, j;
    for (i = 1; i <= lines; i++) 
    {
        for (j =1; j <= lines; printf("%s", (i == j || i + j == lines+1)?"1":"0"), j++);
        printf("\n");
    }
}
int main()
{
    unsigned long long int numberOfLine;
    printf("Enter the number of lines you want to print the pattern: ");
    scanf("%llu", &numberOfLine);
    binaryTriangle(numberOfLine);
    return 0;
}