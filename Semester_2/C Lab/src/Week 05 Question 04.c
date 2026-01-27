// Write a Program to find the vowels and count them in the given string.

#include <stdio.h>

int main() 
{
    char str[100];
    int count = 0, i = 0;
    printf("Enter a string: ");
    scanf("%[^\n]", str);
    while (str[i] != '\0') 
    {
        char ch = str[i];
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
            ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') 
        {
            count++;
        }
        i++;
    }
    printf("Number of vowels: %d\n", count);
    return 0;
}

// output 
// 
// Enter a string: Alokparna Mitra
// Number of vowels: 6