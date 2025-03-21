// Write a Program to check whether a string is palindrome or not.
// Hint: “malayalam”, “radar”.
#include <stdio.h>
#include <string.h>
#include <stdbool.h>

bool isPalindrome(char str[]) 
{
    int len = strlen(str);
    for (int i = 0; i < len / 2; i++) 
    {
        if (str[i] != str[len - i - 1]) 
        {
            return false;
        }
    }
    return true;
}

int main() 
{
    char str[100];
    printf("Enter a string: ");
    scanf("%s", str);
    printf("The string is%s a palindrome.\n", isPalindrome(str)?"":" not");
    return 0;
}

// output 
// 
// Enter a string: radar
// The string is a palindrome.