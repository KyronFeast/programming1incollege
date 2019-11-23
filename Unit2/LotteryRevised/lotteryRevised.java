import java.util.Scanner;
/**
 * Write a description of class lotteryRevised here.
 *
 * @author (Thomas J. Short)
 * @version (V1 09/24/2019)
 */
public class lotteryRevised
{
   public static void main(String[] args)
   {
      //3 digit Random lottery number
      final int lottery = (int) (Math.random() * 1000);
      Scanner input = new Scanner(System.in);
      
      System.out.println("The lottery number is " + lottery);
      //Prompt the user for a three digit number 
      System.out.println("Enter a three digit number e.g. 1,2,3... ");
      int guess = input.nextInt(); 
      
      // get digit from lottery
      int lotteryDigit1 = lottery / 100;
      int remainingDigit = lottery % 100;
      // Get 2nd lotto number
      int lotteryDigit2 = remainingDigit / 10;
      int lotteryDigit3 = remainingDigit % 10;
      // get digit from lottery
      int guessDigit1 = guess / 100;
      int guessRemainingDigit = guess % 100;
      // Get 2nd lotto number
      int guessDigit2 = guessRemainingDigit / 10;
      int guessDigit3 = guessRemainingDigit % 10;
      /*System.out.println(guessDigit1);
      System.out.println(guessDigit2);
      System.out.println(guessDigit3);*/
      
      System.out.println("The lottery number is " + lottery);
      
      //Check the guess
      if (guess == lottery)
         System.out.println("Exact match: you win $10,000");
      else if((guessDigit1 == lotteryDigit2 && guessDigit2 == lotteryDigit1 
      && guessDigit3 == lotteryDigit3)
      ||(guessDigit1 == lotteryDigit2 && guessDigit1 == lotteryDigit3 
      && guessDigit3 == lotteryDigit1)
      ||(guessDigit1 == lotteryDigit3 && guessDigit2 == lotteryDigit1 
      && guessDigit3 == lotteryDigit2)
      ||(guessDigit1 == lotteryDigit3 && guessDigit2 == lotteryDigit2
      && guessDigit3 == lotteryDigit1)
      ||(guessDigit1 == lotteryDigit1 && guessDigit2 == lotteryDigit3 
      && guessDigit3 == lotteryDigit2))
            
         System.out.println("Match all digits: you win $3,000");
      else if (guessDigit1 == lotteryDigit1
            || guessDigit1 == lotteryDigit2
            || guessDigit1 == lotteryDigit3
            || guessDigit2 == lotteryDigit1
            || guessDigit2 == lotteryDigit2
            || guessDigit2 == lotteryDigit3
            || guessDigit3 == lotteryDigit1
            || guessDigit3 == lotteryDigit2
            || guessDigit3 == lotteryDigit3)
         System.out.println("Match one digit: you win $1,000");
      else
         System.out.println("Sorry no match! Please play again");
         
     
      
   }
}
