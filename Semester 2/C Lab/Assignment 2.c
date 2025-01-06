#include<stdio.h>
int main()
{
    int number;
    printf("Enter a number: ");
    scanf("%d", &number);
    printf("The last digit of the number is %d \n", (number % 10));
    number /= 10;
    printf("The new number after deleting the last digit is %d \n" , number);
    return 0;
}