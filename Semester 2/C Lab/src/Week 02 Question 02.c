#include<stdio.h>
#include<math.h>
int isPrimeOrComposite(long number)
{
    long i;
    if(number == 0 || number == 1)
    {
        return 2;
    }
    else
    {
        for(i = 2; i < (long)sqrt(number) + 1; i++)
        {
            if(number%i == 0)
            {
                return 1;
            }
        }
        return 0;
    }
}
int main()
{
    long num;
    printf("Enter a number: ");
    scanf("%ld",&num);
    printf("The number %ld is %s",num, (isPrimeOrComposite(num)==0?"Prime\n":(isPrimeOrComposite(num)==1)?"Composite\n":"neither Prime nor Composite\n"));
    return 0;
}