import java.util.Scanner;
import java.util.HashSet;

public class nonRepeatingUniqueSubstring
{

    String longestUniqueSubstring(String s) {
        int n = s.length();
        int left = 0, right = 0;
        int maxLength = 0;
        int start = 0;

        HashSet<Character> set = new HashSet<>();

        while (right < n) {
            char c = s.charAt(right);
            if (!set.contains(c)) 
            {
                set.add(c);
                right++;
                if (right - left > maxLength) 
                {
                    maxLength = right - left;
                    start = left;
                }
            } 
            else 
            {
                set.remove(s.charAt(left));
                left++;
            }
        }

        return s.substring(start, start + maxLength);
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        nonRepeatingUniqueSubstring process = new nonRepeatingUniqueSubstring();
        System.out.println("Enter a string: ");
        String input = keyboard.nextLine();
        System.out.println("Largest unique substring present in \"" + input + "\" is \"" + process.longestUniqueSubstring(input) + "\".");
        keyboard.close();
    }
}