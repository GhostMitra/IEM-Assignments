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
int main() {
    int choice;
    double r, h, l, b;

    while (1) {
        printf("\n--- Volume Calculator ---\n");
        printf("1. Sphere\n2. Cylinder\n3. Cone\n4. Cuboid\n5. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);

        switch (choice) {
            case 1:
                printf("Enter radius of sphere: ");
                scanf("%lf", &r);
                printf("Volume of Sphere: %.2lf\n", volumeSphere(r));
                break;
            case 2:
                printf("Enter radius and height of cylinder: ");
                scanf("%lf %lf", &r, &h);
                printf("Volume of Cylinder: %.2lf\n", volumeCylinder(r, h));
                break;
            case 3:
                printf("Enter radius and height of cone: ");
                scanf("%lf %lf", &r, &h);
                printf("Volume of Cone: %.2lf\n", volumeCone(r, h));
                break;
            case 4:
                printf("Enter length, breadth, and height of cuboid: ");
                scanf("%lf %lf %lf", &l, &b, &h);
                printf("Volume of Cuboid: %.2lf\n", volumeCuboid(l, b, h));
                break;
            case 5:
                printf("Exiting program.\n");
                return 0;
            default:
                printf("Invalid choice. Please try again.\n");
        }
    }
}
