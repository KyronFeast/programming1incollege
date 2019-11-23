
/**
 * This version of the pirates trading asks the user the cost of their item 
 * and how much they will be paying with. The program then checks to see if the pirate has enough money
 * to pay for their item or not. This version also uses an if else to print their change in single or 
 * or plural form (bits or bit)
 * @author (Thomas J. Short)
 * @version ( version2 )
 * Cis 260 alan C. 10/1/2019
 */
import java.util.Scanner;
public class PirateTradingPost
{
   public static void main(String[] args) 
   {
        //Gretting message for the pirates post
        System.out.println("Welcome to Pirates Trading Post !!!");
        
        //Create a new scanner object.
        Scanner input = new Scanner(System.in);
        
        //Promt user for the number of bits that his item cost's?
        System.out.print("How many bits did your item cost? Enter a whole number e.g. 1,2,3.... ");
        int costOfItem = input.nextInt();
        
        //Promt the user to how many doubloons he will be paying with?
              System.out.print("How many Doubloons are you paying with, Enter a whole number e.g. 1,2,3....");
        int paymentAmount = input.nextInt();
        final int doubloonsToBits =128;
        final int bitsToPeices = 32;
        final int peicesToBits = 8;
        //Determine if pirate has paid enough. convert doubloons to bits
        //payment amount by cost of item
        if ((paymentAmount * 128) - costOfItem < 0 ){
          System.out.println("You don't have enough money, please leave!!");
        }
        else {
        //Convert the users doubloons into bits and subtract the cost of the item
        int remainingAmount = (paymentAmount * doubloonsToBits - costOfItem) ;

        //Find the number of doubloon total
        int doubloon = remainingAmount / doubloonsToBits;
        remainingAmount = remainingAmount % doubloonsToBits;
        
        //Find the number of pistole total
        int pistole = remainingAmount / bitsToPeices;
        remainingAmount = remainingAmount % bitsToPeices;

        //Find the pieces of eight total
        int pieceOfEight = remainingAmount / peicesToBits;
        remainingAmount = remainingAmount % peicesToBits;

        //the remaining amount is the amount of bits left
        int bits = remainingAmount;
        
        
        if (paymentAmount == 1){ 
          System.out.println("You gave me " + paymentAmount + " Doubloon. Your change consits of ");
        }
        
         else  {
            System.out.println("You gave me " + paymentAmount + " Doubloons. Your change consits of ");
        }
        
        if (bits == 1){
           System.out.println(" " + bits + " bit. ");
        }
        else if (bits > 1) {
            System.out.println(" " + bits + " bits ");
        }
           
        if (pieceOfEight == 1){
          System.out.println(" " + pieceOfEight + " piece of eight ");
        }
        else if(pieceOfEight > 1){
            System.out.println(" " + pieceOfEight + " pieces of eight ");}
      
        if (pistole == 1){
          System.out.println(" " + pistole + " pistole. ");
        }
        else if(pistole > 1){
           System.out.println(" " + pistole + " pistoles ");}
      
        if(doubloon == 1){
           System.out.println(" " + doubloon + " doubloon. ");
        }
        else if (doubloon > 1){
          System.out.println(" " + doubloon + " doubloons ");
          
    
        
    
        }
        System.out.println(" Thank you for visiting Pirates Trading Post");
        }
   }
}

