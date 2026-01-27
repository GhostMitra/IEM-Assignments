import java.util.Scanner;

public class largestPalindromicSubstring 
{

    String findLargestPalindromicSubstring(String s) 
    {
        if (s == null || s.length() == 0) return "";

        int maxLength = 1; 
        int start = 0;

        for (int i = 0; i < s.length(); i++) {
            int left = i, right = i;
            while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                int currentLength = right - left + 1;
                if (currentLength > maxLength) {
                    maxLength = currentLength;
                    start = left;
                }
                left--;
                right++;
            }

            left = i;
            right = i + 1;
            while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) 
            {
                int currentLength = right - left + 1;
                if (currentLength > maxLength) {
                    maxLength = currentLength;
                    start = left;
                }
                left--;
                right++;
            }
        }

        return s.substring(start, start + maxLength);
    }

    public static void main(String args[])
    {
        Scanner keyboard = new Scanner(System.in);
        largestPalindromicSubstring process = new largestPalindromicSubstring();
        System.out.println("Enter a string: ");
        String input = keyboard.nextLine();
        System.out.println("Largest palindromic substring present in \"" + input + "\" is \"" + process.findLargestPalindromicSubstring(input) + "\".");
        keyboard.close();
    }
}
