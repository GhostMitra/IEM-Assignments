#include<stdio.h>
#include<stdbool.h>
bool isPerfect(unsigned long long int number)
{
    unsigned long long int i, sum = 0;
    for(i=1; i<number; i++)
    {
        if(number%i == 0)
        {
            sum += i;
        }
    }
    return (sum==number?true:false);
}
int main()
{
    unsigned long long int num;
    printf("Enter a number: ");
    scanf("%llu", &num);
    printf("The number %llu is %s perfect number. \n", num, isPerfect(num)?"a":"not a");
    return 0;
}