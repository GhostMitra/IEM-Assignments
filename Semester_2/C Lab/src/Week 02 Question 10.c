#include<stdio.h>
#include<stdbool.h>
unsigned long long int factorial(unsigned long long int number)
{
    if(number==1 || number == 0)
    {
        return 1;
    }
    else
    {
        return number*factorial(number-1);
    }
}
bool isKrishnamurthy(unsigned long long int number)
{
    unsigned long long int reqdSum = 0, tempNumber;
    for(tempNumber=number; tempNumber > 0; reqdSum+=factorial(tempNumber%10),tempNumber/=10);
    return reqdSum==number?true:false;
}
int main()
{
    unsigned long long int startNumber, endNumber, i;
    printf("Enter the starting number: ");
    scanf("%llu", &startNumber);
    printf("Enter the ending number: ");
    scanf("%llu", &endNumber);
    printf("The krishnamurthy number(s) between %llu and %llu (including %llu) is/are: \n", startNumber, endNumber, endNumber);
    for(i=startNumber; i<=endNumber;isKrishnamurthy(i)?printf("%llu \n", i):printf(""),i++);
    return 0;
}