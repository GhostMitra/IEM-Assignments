import java.util.Scanner;

public class palindromeNumber
{
    boolean isPalindrome(long number)
    {
        long numCopy = number;
        long checkNum = 0;
        while(number>0)
        {
            checkNum =checkNum*10 + number %10;
            number/=10;
        }
        return (checkNum == numCopy);
    }
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        palindromeNumber check = new palindromeNumber();
        System.out.print("Enter a number: ");
        long number = keyboard.nextLong();
        if(check.isPalindrome(number))
        {
            System.out.println("The number is palindrome.");
        }
        else
        {
            System.out.println("The number is not palindrome.");
        }
        System.out.println();
        keyboard.close();
    
    }
}