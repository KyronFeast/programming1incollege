
/**
 * Write a description of class PalindromeInteger here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PalindromeInteger
{



 public static int reverse(int number)
 {
     int reverse = 0;
     int digit;
        do 
        {
            digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;
        }while (number != 0);
     return reverse;
 }

 public static boolean isPalindrome(int number)
 {
     return (number == reverse(number));
 }
 
}


