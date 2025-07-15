import java.util.Scanner;

class extractDigitsOfANumber
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = keyboard.nextInt();
        System.out.println("The digits of "+ number + " are " );
        while(number>0)
        {
            System.out.print(number%10 + " ");
            number/=10;
        }
        System.out.println();
        keyboard.close();
    }
}