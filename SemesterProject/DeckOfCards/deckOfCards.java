import java.util.Scanner;
/**
 * Write a description of class DeckOfCards here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class deckOfCards
{
   //static int deck[] = 0;
   //Create a deck of cards
   public static void main(String[] args)
   {
       //create an array with 52 spots in memory initalized to zero 
       int[] deck = new int [52];
       //create an array for 4 suits hearts dimonds clubs and spades
       String[] suits = {"Spades", "Hearts", "Diamonds", "clubs"};
       // Create an array to rank the cards
       String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7","8", 
       "9", "10", "jack","Queen", "King"};
       //give the cards a value
       for(int cards = 0; cards < deck.length; cards++)
       {
           deck[cards] = cards;
       }
        
       //shuffle the cards
       for (int shuffle = 0; shuffle < deck.length; shuffle++)
       {
           int index = (int)(Math.random() * deck.length);
           int temp = deck[shuffle];
           deck[shuffle] = deck[index];
           deck[index] = temp;
       }
       // display the first 4 cards
       for(int dealcount = 0; dealcount < 4; dealcount++)
       {
           String suit = suits[deck[dealcount] / 13];
           String rank = ranks[deck[dealcount] % 13];
           System.out.println("card number " + deck[dealcount] +
           ": " + rank + " of " + suit);
       }
   }

}
