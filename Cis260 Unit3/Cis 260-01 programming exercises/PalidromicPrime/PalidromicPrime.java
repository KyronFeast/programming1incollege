
/**
 * This program takes some pieces from the previous programs and prints 
 * the first 100 primes that are also palindromes
 * it prints ten numbers per seperated by exactly one space
 * Thomas J. Short
 * Cis 260-01
 * 10/23/2019
 * Chapter 6 Methods pg. 242
 * 
 */
public class PalidromicPrime
{
    public static void main(String[] args)
    {
        //Declare how many palindromic primes we would like to to print
        //and Declare a variable to keep trak of primes printed
        //and primes printed
        final int PalindromicPrimes = 100;
        int palindromicPrimesPrinted = 0,
        palindromicPrimesTested = 2;
        //First invoke is prime return invoke ispalindorme add to printed 
        while(palindromicPrimesPrinted < PalindromicPrimes)
        {
            if(isPrime(palindromicPrimesTested)
            && isPalindrome(palindromicPrimesTested))
            {
                palindromicPrimesPrinted++;
                System.out.print(palindromicPrimesTested + " ");
                if(palindromicPrimesPrinted % 10 == 0)
                {
                    System.out.println();
                }
            }
            palindromicPrimesTested++;
        }
        
    }
    
    public static boolean isPrime(int number)
    {
        for(int divisor = 2; divisor <= number / 2; divisor++)
        {
            if(number % divisor == 0)
            {
                return false;
            }
        }
        return true;
    }
    
    public static int reverse(int number)
    {
        int reverse = 0;
        int digit;
        while(number != 0)
        {
            digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;
        }
        return reverse;
    }
    
    public static boolean isPalindrome(int number)
    {
        return(number == reverse(number));
    }
}
