import java.util.Scanner;
/**
 * Pirate Trading Post Version 3
 * In this version we provide the pirates with an item list 
 * Ask them to choose items, print them a receipt ask them how
 * many doubloons they and convert doubllonto bits a calculater
 * their change
 * @author (Thomas J. Short)
 * @version (version 3)
 * Cis 260-01
 * 10/20/2019
 */
public class piratesTradingPostVersion3
{
   public static void main(String[] args)
   {
      String userString = " ";
      // Declare the variables to keep track of items purchused
      int peiceOfEightCount = 0, pirateHatCount = 0, eyePatchCount = 0, 
      swordCount = 0, treasureMapCount = 0, tShirtCount = 0,
      /*Delcare variables to keep track of the cost of the items
         we are counting*/
      costOfPeiceOfEight = 8, costOfHats = 32,
      costOfEyePatch = 2, costOfSword = 20, 
      costOfMaps = 100, costOftShirt = 150;
      //Create a new scanner object
      Scanner input = new Scanner(System.in);
      //Print a welcome message
      System.out.println("Welcome to The Pirate Trading Post V3 ");
      /*while user input does not contain q, prompt user for input and 
       * convert the input to lowercase for less mistakes on the user's part*/
      while(userString.contains("q") != true)
      {
       //Prompt user to enter item code,see item codes or exit and calculate
       System.out.print("Enter the item code or press ? or Q");
       userString = input.nextLine();
        // Declare the variables to keep track of items purchused
       userString = userString.toLowerCase();
        /* Set conter to 0 and count while counter is less then 
        the userinput and add one to it's counter variable*/
       for(int counter = 0; counter < userString.length(); counter++)
       {
         /*assign userString.charAt(counter) to a char variable
         named c for easier use in the if statement*/
         char c = userString.charAt(counter);
        
         if(c == '8')
         {
            peiceOfEightCount++;
         }
         else if (c == 'h')
         {
            pirateHatCount++;
         }
         else if(c == 'i')
         {
           eyePatchCount++;
         }
         else if(c == 's')
         {
            swordCount++;
         }
         else if(c == 'm')
         {
            treasureMapCount++;
         }
         else if(c == 't')
         {
            tShirtCount++;
         }
         else if(c == '?')
         {
            System.out.println("Valid item codes are: 8  I  H  M  S  T \n" 
            + "Q to Quit");
         }
         else if(c != 'q')
         {
            System.out.println("Try Again invalid character " + c);
         }
     
       }//End of for loop
      }//End of while loop
       // Time to print the user a receipt 
      System.out.println("Your receipt consits of:");
       // if else to print single or pluaral answers
      if(peiceOfEightCount > 1)    
      {
          System.out.printf("%4s %21s", peiceOfEightCount, " Peices of eight \n");
      }
      else if(peiceOfEightCount == 1)
      {
          System.out.printf("%4s %21s", peiceOfEightCount, " Peice Of Eight \n");
      }
      if(pirateHatCount > 1)    
      {
          System.out.printf("%4s %21s", pirateHatCount, " Pirate Hats \n");
      }
      else if(pirateHatCount == 1)
      {
          System.out.printf("%4s %21s", pirateHatCount, " Pirate Hat \n");
      }
      if(eyePatchCount > 1)    
      {
          System.out.printf("%4s %21s", eyePatchCount, " Eye patches \n");
      }
      else if(eyePatchCount == 1)
      {
          System.out.printf("%4s %21s", eyePatchCount, " Eye patch \n");
      }
      if(swordCount > 1)    
      {
          System.out.printf("%4s %21s", swordCount, " Inflatable Swords \n");
      } 
      else if(swordCount == 1)
      {
          System.out.printf("%4s %21s", swordCount, " Inflatable Sword \n");
      }
      if(treasureMapCount > 1)    
      {
          System.out.printf("%4s %21s",treasureMapCount, " Treasure Maps \n");
      }
      else if(treasureMapCount == 1)
      {
          System.out.printf("%4s %21s", treasureMapCount, " Treasure map \n");
      }
      if(tShirtCount > 1)    
      {
          System.out.printf("%4s %21s", tShirtCount, " Tee Shirts \n");
      }
      else if(tShirtCount == 1)
      {
          System.out.printf("%4s %21s", tShirtCount, " Tee Shirt \n");
      }
        //Declare an integer to hold the total price of their order
        int totalPrice = 0;
        //Calculate the total using the number of items purchused by the cost of each item
        totalPrice = (peiceOfEightCount * costOfPeiceOfEight) + 
        (pirateHatCount * costOfHats)+ (treasureMapCount * costOfMaps) + 
        (swordCount * costOfSword) + (eyePatchCount * costOfEyePatch) + 
        (tShirtCount * costOftShirt);
        //Show user the total cost of all the item they ordered
        System.out.println("\nYour total cost is " + totalPrice + " bits");
        /* Prompt user to Enter how many doubloons they are paying with
        so we can calculate their change*/
        System.out.print("How many Doubloons are you paying with," +
        "Enter a whole number e.g. 1,2,3....");
        //Assign user input to an integer variable variable named paymentAmount
        int paymentAmount = input.nextInt();
        //Declare integer constants  for our calculation 
        final int doubloonsToBits =128;
        final int bitsToPeices = 32;
        final int peicesToBits = 8;
        //Determine if pirate has paid enough. convert doubloons to bits
        //Use calculation (payment amount by cost of item)
       if ((paymentAmount * 128) - totalPrice < 0 )
       {
         System.out.println("You don't have enough money, please leave!!");
       }
       else 
       {
        /*Convert the users doubloons into bits
        * and subtract the cost of the item*/
        int remainingAmount = (paymentAmount * doubloonsToBits - totalPrice) ;
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
        // print single or plural
       if (paymentAmount == 1)
       { 
           System.out.println("You gave me " + paymentAmount +
            " Doubloon. \n Your change consits of ");
       }
       else  
       {
           System.out.println("You gave me " + paymentAmount +
            " Doubloons. \n Your change consits of ");
       } 
       if (bits == 1)
       {
           System.out.println(" " + bits + " bit ");
       }
       else if (bits > 1) 
       {
           System.out.println(" " + bits + " bits ");
       }    
       if (pieceOfEight == 1)
       {
           System.out.println(" " + pieceOfEight + " piece of eight ");
       }
       else if(pieceOfEight > 1)
       {
           System.out.println(" " + pieceOfEight + " pieces of eight ");
       }
       if (pistole == 1)
       {
           System.out.println(" " + pistole + " pistole ");
       }
       else if(pistole > 1)
       {
           System.out.println(" " + pistole + " pistoles ");
       }
       if(doubloon == 1)
       {
           System.out.println(" " + doubloon + " doubloon ");
       }
       else if (doubloon > 1)
       {
           System.out.println(" " + doubloon + " doubloons ");
       }
        //Goodbye statement
        System.out.println(" Thank you for visiting Pirates Trading Post");
       }
   }//End of public 
}