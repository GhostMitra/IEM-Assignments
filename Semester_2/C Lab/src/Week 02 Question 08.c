#include<stdio.h>
#include<stdbool.h>
bool isPalindrome(unsigned long long int number)
{
    unsigned long long int tempNumber, sum = 0;
    for(tempNumber = number ; tempNumber > 0 ; sum= sum*10 + tempNumber%10, tempNumber/=10);
    return number==sum?true:false;
}
int main()
{
    unsigned long long int startNumber, endNumber, i;
    printf("Enter the starting number: ");
    scanf("%llu", &startNumber);
    printf("Enter the ending number: ");
    scanf("%llu", &endNumber);
    printf("The palindrome number(s) between %llu and %llu (including %llu) is/are: \n", startNumber, endNumber, endNumber);
    for(i=startNumber; i<=endNumber;isPalindrome(i)?printf("%llu \n", i):printf(""),i++);
    return 0;
}