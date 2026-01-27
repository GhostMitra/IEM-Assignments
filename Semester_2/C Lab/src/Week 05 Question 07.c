// Write a Program to check if a word is present or not in a user input sentence.
// (no using Pointers or other libraries)

#include <stdio.h>
#include <stdbool.h>

int stringLength(char str[]) 
{
    int length = 0;
    while (str[length] != '\0') 
    {
        length++;
    }
    return length;
}

bool isWordPresent(char sentence[], char word[]) 
{
    int i, j, found = 0;
    int len = stringLength(sentence);
    int wlen = stringLength(word);

    for (i = 0; i <= len - wlen; i++) 
    {
        for (j = 0; j < wlen; j++) 
        {
            if (sentence[i + j] != word[j])
            {
                break;
            }
        }
        if (j == wlen && (sentence[i + j] == ' ' || sentence[i + j] == '\0')) 
        {
            return true;
        }
    }
    return false;
}

int main() 
{
    char sentence[200], word[50];
    printf("Enter a sentence: \n");
    scanf("%[^\n]", sentence);
    printf("Enter a word to search: ");
    scanf("%s", word);
    printf("Word%s found in the sentence.\n", isWordPresent(sentence, word)?"":" not");
    return 0;
}

// output 
// 
// Enter a sentence: 
// My name is Alokparna Mitra
// Enter a word to search: Mitra
// Word found in the sentence.