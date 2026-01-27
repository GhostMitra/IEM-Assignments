import java.util.Arrays;
import java.util.Scanner;
import static java.lang.StrictMath.sqrt;
public class primeWithDifferenceFour
{
    boolean isPrime(int number)
    {
        if(number == 2)
        {
            return true;
        }
        int i = 2;
        while( i < sqrt(number) + 1) 
        {
            if (number % i == 0)
            {
                return false;
            }
        }
        return true;
    }
    
    int[] checkDiffFour(int[] nums)
    {
        for(int i = 0; i< nums.length - 1 ; i++)
        {
            if(nums[i] - nums[i+1] == 4)
            {
                return new int[] {nums[i], nums[i+1]};
            }
        }
        return new int[] {0, 0};
    }

    int[] generatePrime(int number)
    {
        //check if number is prime -> false -> generate 6 primes
        return[];
    }
}