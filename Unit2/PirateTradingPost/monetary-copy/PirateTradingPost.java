
/**
 * The pirate tradig post asks for the cost of an item?
 * how many big bills you are paying with? then coverts big bills to smallest 
 * currency and prints your change.
 *
 * @author (Thomas J. Short)
 * @version ( version1 or a date)
 * Cis 260 alan C. 09/18/2019
 */
import java.util.Scanner;
public class PirateTradingPost
{
    public static void main(String[] args) 
    {
        //Intro message
        System.out.println("yer matey, Enter the Pirates Trading Post with caution and watch yer teasure !!!");
        System.out.println("There be dirty scallywag round these parts, but i'll make sure yer get the right change, ya scoundral !!!");
        
        //Create a new scanner object.
        Scanner input = new Scanner(System.in);
        
        //Promt user for the number of bits that his item cost's?
        System.out.print("How many bits did yer pirate item cost?    Enter a whole number e.g. 1,2,3.... ");
        int costOfItem = input.nextInt();
        
        //Promt the user to how many doubloons he will be paying with?
        System.out.print("How many Doubloons does yer want to pay me with, ya dirty scallywag? Enter a whole nuber e.g. 1,2,3....");
        int userNumber = input.nextInt();
        
        /* If the user has no doubloons then i dont even want to process his number
         if (userNumber == 0){
         System.out.println("yar need money in pirates post!!  GET OUT!! ");
        }*/
        
        //Convert the users doubloons into bits and subtract the cost of the item
        int remainingAmount = (userNumber * 128 - costOfItem) ;
         

        //Find the number of doubloon total
        int doubloon = remainingAmount / 128;
        remainingAmount = remainingAmount % 128;
        
        //Find the number of pistole total
        int pistole = remainingAmount / 32;
        remainingAmount = remainingAmount % 32;

        //Find the pieces of eight total
        int pieceOfEight = remainingAmount / 8;
        remainingAmount = remainingAmount % 8;

              
        
        //the remaining amount is the amount of bits left
        int bits = remainingAmount;
        
        //if (bits > 0){
        //display the results 
        System.out.println("Yer gave me " + userNumber + " Doubloons. Yer change consits of ");
        System.out.println(" " + bits + " bits ");
        System.out.println(" " + pieceOfEight + " pieces of eight ");
        System.out.println(" " + pistole + " pistoles ");
        System.out.println(" " + doubloon + " doubloons ");
        System.out.println(" Yer welcome, and i'm not responable if yer new treasure gets pirated out yer way out");
        //System.out.println("math joke for pirates day... polynomial want a cracker!!!");
        
        //System.out.println(" " + pistole + " pistoles ");
        //System.out.println(" " + pieceOfEight + " pieces of eight ");
        //System.out.println(" " + bits + " bits ");
        //}
             // else
             //System.out.println("Yer better steal another tresure your broke ");
    
    
    }
}

