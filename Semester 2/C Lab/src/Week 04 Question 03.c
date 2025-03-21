// Write a Program to count the frequency of each element of an array.

#include <stdio.h>

int main() 
{
    int n;
    printf("Enter the number of elements: ");
    scanf("%d", &n);
    double arr[n];
    int freq[n];
    for (int i = 0; i < n; i++) 
    {
        printf("Enter the element no %d: ", i+1);
        scanf("%lf", &arr[i]);
        freq[i] = -1;
    }
    for (int i = 0; i < n; i++) 
    {
        if (freq[i] == -1) 
        { 
            int count = 1;
            for (int j = i + 1; j < n; j++) 
            {
                if (arr[i] == arr[j]) 
                {
                    count++;
                    freq[j] = 0; // Mark duplicate as counted
                }
            }
            freq[i] = count;
        }
    }

    // Display frequency of each unique element
    printf("Element      Frequency\n");
    for (int i = 0; i < n; i++) 
    {
        if (freq[i] != 0) 
        {
            printf("%lf\t  %d\n", arr[i], freq[i]);
        }
    }

    return 0;
}



// output
// 
// Enter the number of elements: 3
// Enter the element no 1: 5
// Enter the element no 2: 5
// Enter the element no 3: 2
// Element      Frequency
// 5.000000          2
// 2.000000          1
