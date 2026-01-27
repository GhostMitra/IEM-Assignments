#include<stdio.h>
void increasingLeftRightAngledStarTriangle(unsigned long long int lines)
{
    unsigned long long int i, j;
    for(i=1; i<=lines; printf("\n"), i++)
   	{
	       for(j=1; j<=i; printf("*"), j++);
   	}
}
int main()
{
   	unsigned long long int numberOfLine;
   	printf("Enter the number of lines you want to print the pattern: ");
   	scanf("%llu", &numberOfLine);
   	increasingLeftRightAngledStarTriangle(numberOfLine);
   	return 0;
}