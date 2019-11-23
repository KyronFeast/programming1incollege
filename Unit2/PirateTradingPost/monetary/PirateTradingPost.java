
/**
 * The pirate tradig post asks for the cost of an item
 * how many big bills you are paying with then coverts big bills to smallest 
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
        //Create a scanner
        Scanner input = new Scanner(System.in);
        
        //Promt user for the number of bits his item cost's
        System.out.print("How many bits was your item ");
        int costOfItem = input.nextInt();
        
        //Promt the user to
        System.out.print("How many Doubloons do you have?");
        int userNumber = input.nextInt();
        
        //If the user has no doubloons then i dont even want to process his number
        //if (userNumber == 0){
           //System.out.println("yar need money in pirates post!!  GET OUT!! ");
        //}
        //Convert the users doubloons into bits and minus the cost of the item
        int remainingAmount = (int) ((userNumber * 128) - costOfItem );
         

        //Find the number of doubloon
        int doubloon = remainingAmount / 128;
        remainingAmount = remainingAmount % 128;
        
        //Find the number of pistole
        int pistole = remainingAmount / 32;
        remainingAmount = remainingAmount % 32;

        //Find the pieces of eight
        int pieceOfEight = remainingAmount / 8;
        remainingAmount = remainingAmount % 8;

              
        
        //the remaining amount is the bits left
        int bits = remainingAmount;
        
        //if (bits > 0){
        //display the results 
        System.out.println("You gave me " + userNumber + " doubloons. Your change consits of ");
        System.out.println(" " + bits + " bits ");
        System.out.println(" " + pieceOfEight + " pieces of eight ");
        System.out.println(" " + pistole + " pistoles ");
        System.out.println(" " + doubloon + " doubloons ");
        //System.out.println(" " + pistole + " pistoles ");
        //System.out.println(" " + pieceOfEight + " pieces of eight ");
        //System.out.println(" " + bits + " bits ");
    //}
  
         //else if (bits == 0){
          //System.out.println("yar have no change");
          //} 
    
          // else
            //System.out.println("Yer better steal another tresure your broke ");
    
    
    }
}

