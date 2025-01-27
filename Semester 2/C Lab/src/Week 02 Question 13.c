#include<stdio.h>
#include<math.h>
#define _USE_MATH_DEFINES
#ifndef M_PI
    #define M_PI 3.14159265358979323846
#endif

double volumeSphere(double radius)
{
    return M_PI * pow(radius,3) * (4.0/3.0);
}
double volumeCylinder(double radius, double height)
{
    return M_PI * pow(radius,2) * height;
}
double volumeCone(double radius, double height)
{
    return 1.0/3.0 * volumeCylinder(radius, height); 
}
double volumeCuboid(double length, double breadth, double height)
{
    return length * breadth * height;
}
int main()
{
    
    return 0;
}