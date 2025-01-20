#include<stdio.h>
double electricityBill(double units)
{
    double billAmount;
    if(units <= 50)
    {
        billAmount = units*1.25;
    }
    else if(units>50 && units<=100)
    {
        billAmount = 50*1.25 + (units-50)*1.50;
    }
    else if(units>100 && units<=200)
    {
        billAmount = 50*1.25 + 50*1.50 + (units-100)*2;
    }
    else if(units>200 && units<=300)
    {
        billAmount = 50*1.25 + 50*1.50 + 100*2 + (units-200)*2.50;
    }
    else if(units>300)
    {
        billAmount = 50*1.25 + 50*1.50 + 100*2 + 100*2.50 + (units-300)*3.25;
    }
    return billAmount + billAmount*0.2;
}

int main()
{
    double unit;
    printf("Enter the units consumed: ");
    scanf("%lf", &unit);
    printf("Your electricity bill amount is ₹ %.2lf \n", electricityBill(unit));
    return 0;
}