#include<stdio.h>
#include<stdbool.h>
#include<math.h>
bool isArmstrong(unsigned long long int number)
{
    unsigned long long int tempNumber, reqdSum = 0, noOfDigits = 0;
    for(tempNumber = number; tempNumber > 0; noOfDigits++, tempNumber/=10);
    for(tempNumber = number ; tempNumber > 0 ; reqdSum += pow(tempNumber%10, noOfDigits), tempNumber/=10);
    return number==reqdSum?true:false;
}
int main()
{
    unsigned long long int startNumber, endNumber, i;
    printf("Enter the starting number: ");
    scanf("%llu", &startNumber);
    printf("Enter the ending number: ");
    scanf("%llu", &endNumber);
    printf("The armstrong number(s) between %llu and %llu (including %llu) is/are: \n", startNumber, endNumber, endNumber);
    for(i=startNumber; i<=endNumber;isArmstrong(i)?printf("%llu \n", i):printf(""),i++);
    return 0;
}