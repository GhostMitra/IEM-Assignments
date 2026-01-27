#include<stdio.h>
void alphabetRightTriangle(unsigned long long int lines)
{
    unsigned long long int i, j;
    for (i = 0; i < lines; printf("\n"), i++) 
    {
         for ( j = 0; j < i+1; printf("%c", 'A' + 2 * j), j++);
    }
}
int main()
{
    unsigned long long int numberOfLine;
    printf("Enter the number of lines you want to print the pattern: ");
    scanf("%llu", &numberOfLine);
    alphabetRightTriangle(numberOfLine);
    return 0;
}