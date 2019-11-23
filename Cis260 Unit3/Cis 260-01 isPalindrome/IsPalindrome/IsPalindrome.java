import java.util.Scanner;
public class IsPalindrome
{   // program starts execution here
    public static void main (String [] args)
    {   
        //Create a Scanner
        Scanner input = new Scanner(System.in);
        //Prompt the user to enter a string
        System.out.println("Enter a string ");
        String s = input.nextLine();
        // initialize the index of the first character
        int low = 0;
        //Initialize a place in memory for last index of the string
        int high = s.length() - 1;
        //Set boolean variable isPalindrome to true
        boolean isPalindrome = true;
        /*While low is less than high increment low and decrement high
           While checking to see if characters match*/
        while(low < high)
        {
            // if the first character and the last character don't
            // match it is not a palindrome
            if(s.charAt(low) != s.charAt(high))
            {
                isPalindrome = false;
            }
            low++;
            high--;
        }
        if(isPalindrome)
        {
            System.out.println(s + " is a palindrome");
        }
        else
        {
            System.out.println(s + " is not a palindrome");
        }
    }       
}