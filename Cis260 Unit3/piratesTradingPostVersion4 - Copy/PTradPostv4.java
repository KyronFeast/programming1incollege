import java.util.Scanner;
/**
 * Pirate Trading Post Version 3
 * In this version we provide the pirates with an item list 
 * Ask them to choose items, print them a receipt ask them how
 * many doubloons they and calculate their change
 * @author (Thomas J. Short)
 * @version (version 3)
 * Cis 260-01
 * 10/20/2019
 */
 /* Write a description of class PTradPostv4 here. 
  * @author (Mr. Collard and your name) 
  * @version (2017Fall) */
  import java.util.Scanner;
  public class PTradPostv4
  {  
      int peiceOfEightCount = 0, pirateHatCount = 0, eyePatchCount = 0, 
      swordCount = 0, treasureMapCount = 0, tShirtCount = 0,
      /*Delcare variables to keep track of the cost of the items
      we are counting*/
      costOfPeiceOfEight = 8, costOfHats = 32,
      costOfEyePatch = 2, costOfSword = 20, 
      costOfMaps = 100, costOftShirt = 150;
     public static void main(String Args[]) 
     { 
         int purchaseAmount;
         int amountTendered; 
     
         displayUserInstructions();
         purchaseAmount = getShoppingList();
         amountTendered = getDoubloons(); //how may ye got?       
         calcChange( purchaseAmount, amountTendered);   
         
     } 
         
     
     public static void displayUserInstructions()
     {
     
        String userString = " ";
      // Declare the variables to keep track of items purchused
   
      //Create a new scanner object
      Scanner input = new Scanner(System.in);
      //Print a welcome message
      System.out.println("Welcome to The Pirate Trading Post V3 ");
      /*while user input does not contain q, prompt user for input 
       * */
      while(userString.contains("q") != true)
      {
       //Prompt user to enter item code,see item codes or exit and calculate
       System.out.print("Enter the item code or press ? or Q");
       // get input assign to userString
       userString = input.nextLine();
       //convert the input to lowercase for less mistakes on the user's part
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
        }


   public static int getShoppingList()
   {
      
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
        //Show user the total cost of all the items they ordered
        System.out.println("\nYour total cost is " + totalPrice + " bits");
        return totalPrice; 
     
    }
        
    public static int getDoubloons()
    {
        Scanner input = new Scanner(System.in);
        /* Prompt user to Enter how many doubloons they are paying with
        so we can calculate their change*/
        System.out.print("How many Doubloons are you paying with," +
        "Enter a whole number e.g. 1,2,3....");
        //Assign user input to an integer variable variable named paymentAmount
        int paymentAmount = input.nextInt();
        return paymentAmount;
    }
     public static void calcChange(int purchaseAmount, int amountTendered )
     {
        //Declare integer constants  for our calculation 
        final int doubloonsToBits =128;
        final int bitsToPeices = 32;
        final int peicesToBits = 8;
        //Determine if pirate has paid enough. convert doubloons to bits
        //Use calculation (payment amount by cost of item)
       if ((purchaseAmount * 128) - amountTendered < 0 )
       {
         System.out.println("You don't have enough money, please leave!!");
       }
       else 
       {
        /*Convert the users doubloons into bits
        * and subtract the cost of the item*/
        int remainingAmount = (purchaseAmount * doubloonsToBits - amountTendered) ;
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
       if (purchaseAmount == 1)
       { 
           System.out.println("You gave me " + purchaseAmount +
            " Doubloon. \nYour change consits of: ");
       }
       else  
       {
           System.out.println("You gave me " + purchaseAmount +
            " Doubloons. \nYour change consits of: ");
       } 
       if (bits == 1)
       {
           System.out.printf("%4s %19s", bits, "bit\n");
       }
       else if (bits > 1) 
       {
           System.out.printf("%4s %19s", bits, "bits\n");
       }    
       if (pieceOfEight == 1)
       {
           System.out.printf("%4s %19s", pieceOfEight, "piece of eight\n");
       }
       else if(pieceOfEight > 1)
       {
           System.out.printf("%4s %19s", pieceOfEight, "pieces of eight\n");
       }
       if (pistole == 1)
       {
           System.out.printf("%4s %19s", pistole, "pistole\n");
       }
       else if(pistole > 1)
       {
           System.out.printf("%4s %19s", pistole, "pistoles\n");
       }
       if(doubloon == 1)
       {
           System.out.printf("%4s %19s", doubloon, "doubloon\n");
       }
       else if (doubloon > 1)
       {
           System.out.printf("%4s %19s", doubloon , "doubloons\n");
       }
        //Goodbye statement
        System.out.println(" Thank you for visiting Pirates Trading Post");
       }
   }//End of public 
}
