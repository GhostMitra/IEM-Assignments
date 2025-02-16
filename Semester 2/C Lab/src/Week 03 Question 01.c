#include<stdio.h>
void fourByNStarRectangle(unsigned long long int lines)
{
    unsigned long long int i, j;
    for(i=1; i<=lines; printf("\n"), i++)
	   {
        for(j=1; j<=4; printf("*"), j++);
   	}
}
int main()
{
    unsigned long long int numberOfLine, i, j;
    printf("Enter the number of lines you want to print the pattern: ");
   	scanf("%llu", &numberOfLine);
	   fourByNStarRectangle(numberOfLine);
    return 0;
}