import java.util.Scanner;
/**
 * This is a program that lets users enter a sentence A.k.a(string) and displays
 * the number of consonants and vowels the string contains within it.
 * Thomas J. Short
 * Cis 260-01
 * 10/13/2019
 * Count Vowels and Consonants
 * Chapter 5  pg.117  
 * Programming Exercise 5.49 
 */
 
public class vowelsAndConsonants
{
  public static void main(String[] args)
  {
     // create a new scanner object
     Scanner input = new Scanner(System.in);
     //Prompt user to enter a string
     System.out.print("Enter a string to count the vowels and consonants for"
      + "\nE.g Programming is very hard yet intriguing ");
     //assign user input to a string
     String userString = input.nextLine();
     //convert userString to all lower case
     userString = userString.toLowerCase();
     /*declare vaiables vowelcount, consonants, whitespace and digits
      * as integers with the initial value of 0*/
     int vowelCount = 0, consonants = 0, whitespace =0, digits = 0;
     /* create a for loop to count the userString's Characters
      * if counter is less than what the user entered update the counter*/
     for(int counter = 0; counter < userString.length(); counter++)
     {
        /*assign userString.charAt(counter) to a char variable
         named c for easier use in the if statement*/
        char c = userString.charAt(counter);
        //If the letters are vowels, count them
        if((c == 'a') || (c == 'e') || (c == 'i') || (c == 'o') || (c == 'u')
        /* || (c == 'A') || (c == 'E') || (c == 'I') || (c == 'O') || (c == 'U')*/)
        {
        
         vowelCount++;
        }
        // count the whitespace
        else if (Character.isWhitespace(c))
        {
         whitespace++;
        }
        //check to see if the character are digits and count them if they are
        else if(Character.isDigit(c))
        {
          digits++;
        }
        //everything else must be consonants
        else
        {
         consonants++;
        }
     }//End the for loop
     //Print the number of consonants and move to next line
     System.out.print("The number of consonants is " + consonants +"\n");
     //Print the number of vowels
     System.out.println("The number of vowels is " + vowelCount);
  }
}
