
/* This program allows the user to enter an integer and then return the 
 * reversal of the integer entered or you may enter a number to find out if it 
 * is a palindrome or not. 
 * Thomas J. Short
 * Cis 260-01
 * 10/22/2019
 * pg. 236 P.E. 6.3 
 */
public class PalindromeInteger
{
    //This method returns the reverse of the number that was entered
    //By moving the decimal point similar to pars int
    public static int reverse(int number)
    {
        int reverse = 0, digit;
        while(number != 0)
        {
            digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;
        }
        return reverse;
    }
    //This isPalindrome invokes reverse for its return value
    //This method check to see if a number is the same forward as backwards
    public static boolean isPalindrome(int number)
    {
        return (number == reverse(number));
    }

}

