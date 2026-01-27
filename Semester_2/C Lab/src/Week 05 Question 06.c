// Write a Program to encode a word in Pig Latin.
// Hint: “trouble” -> “oubletray”. “paris” -> “arispay”.

#include <stdio.h>
#include <string.h>

int main() 
{
    char word[100];
    int i, len;
    
    // Input word
    printf("Enter a word: ");
    scanf("%s", word);

    len = strlen(word);

    // Find first vowel position
    int pos = -1;
    for (i = 0; i < len; i++) 
    {
        if (word[i] == 'a' || word[i] == 'e' || word[i] == 'i' ||
            word[i] == 'o' || word[i] == 'u' || word[i] == 'A' ||
            word[i] == 'E' || word[i] == 'I' || word[i] == 'O' ||
            word[i] == 'U') 
        {
            pos = i;
            break;
        }
    }

    // Convert to Pig Latin
    if (pos == -1) 
    {
        printf("Pig Latin: %say\n", word);
    } 
    else 
    {
        printf("Pig Latin: %s%say\n", word + pos, strncat(word, word, pos));
    }
    return 0;
}

// output 
// 
// Enter a word: paris
// Pig Latin: arispparispay