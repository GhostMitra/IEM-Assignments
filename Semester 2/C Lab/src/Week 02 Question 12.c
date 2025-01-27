#include<stdio.h>
void fibonacci(unsigned long long int number)
{
    static unsigned long long int n1 = 0, n2 = 1, n3;
    if (number>0)
    {
        n3 = n1 + n2;
        n1 = n2;
        n2 = n3;
        printf("%llu \n", n3);
        fibonacci(number-1);
    }
}
int main()
{
    unsigned long long int num;
    printf("Enter the number terms you want fibonacci series upto: ");
    scanf("%llu", &num);
    printf("The fibonacci series is as follows:- \n");
    printf("%s", num==1?"0":"0\n1\n");
    fibonacci(num-2);
    return 0;
}