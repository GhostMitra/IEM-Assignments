#include <stdio.h>
#include <math.h>
#define _USE_MATH_DEFINES
#ifndef M_PI
    #define M_PI 3.14159265358979323846
#endif
double volumeSphere(double radius) 
{
    return (4.0/3.0) * M_PI * pow(radius, 3);
}
double volumeCylinder(double radius, double height) 
{
    return M_PI * pow(radius, 2) * height;
}
double volumeCone(double radius, double height) 
{
    return (1.0/3.0) * volumeCylinder(radius, height);
}
double volumeCuboid(double length, double breadth, double height) 
{
    return length * breadth * height;
}
int main() 
{
    int choice;
    double r, h, l, b;

    while (1) 
    {
        printf("\n--- Volume Calculator ---\n");
        printf("1. Sphere\n2. Cylinder\n3. Cone\n4. Cuboid\n5. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);

        switch (choice) {
            case 1:
                printf("Enter radius of sphere: ");
                scanf("%lf", &r);
                printf("Volume of Sphere: %.2lf sq. unit\n", volumeSphere(r));
                break;
            case 2:
                printf("Enter radius of cylinder: ");
                scanf("%lf", &r);
                printf("Enter height of cylinder: ");
                scanf("%lf", &h);
                printf("Volume of Cylinder: %.2lf sq. unit\n", volumeCylinder(r, h));
                break;
            case 3:
                printf("Enter radius of cone: ");
                scanf("%lf", &r);
                printf("Enter height of cone: ");
                scanf("%lf", &h);
                printf("Volume of Cone: %.2lf sq. unit\n", volumeCone(r, h));
                break;
            case 4:
                printf("Enter length of cuboid: ");
                scanf("%lf", &l);
                printf("Enter breadth of cuboid: ");
                scanf("%lf", &b);
                printf("Enter height of cuboid: ");
                scanf("%lf", &h);
                printf("Volume of Cuboid: %.2lf sq. unit\n", volumeCuboid(l, b, h));
                break;
            case 5:
                printf("Exiting program.\n");
                return 0;
            default:
                printf("Invalid choice. Please try again.\n");
        }
    }
}
