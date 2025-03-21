// Write a Program to accept your name and print your name using string.

#include <stdio.h>

int main() 
{
    char name[100];
    printf("Enter your name: ");
    scanf("%[^\n]", name);
    printf("Your name is: %s\n", name);
    return 0;
}

// output
// 
// Enter your name: Debarghaya Mitra
// Your name is: Debarghaya Mitra