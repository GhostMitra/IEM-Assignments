#include<stdio.h>
int main()
{
    int number;
    printf("Enter a number: ");
    scanf("%d", &number);
    printf("The last digit of the number is %d \n", number - (number / 10)*10);
    return 0;
}