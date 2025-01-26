#include<stdio.h>
#include<stdbool.h>
#include<math.h>
bool isDisarium(unsigned long long int number)
{
    unsigned long long int tempNumber, reqdSum = 0, noOfDigits = 0;
    for(tempNumber = number; tempNumber > 0; noOfDigits++, tempNumber/=10);
    for(tempNumber = number ; tempNumber > 0 ; reqdSum += pow(tempNumber%10, noOfDigits), tempNumber/=10, noOfDigits--);
    return number==reqdSum?true:false;
}
int main()
{
    unsigned long long int number, endNumber, i;
    printf("Enter a number: ");
    scanf("%llu", &number);
    printf("The number %llu is %s disarium number.", number, isDisarium(i)?"a":"not a");
    return 0;
}