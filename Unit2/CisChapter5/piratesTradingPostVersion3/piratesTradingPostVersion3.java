import java.util.Scanner;
/**
 * Write a description of class piratesTradingPostVersion3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class piratesTradingPostVersion3
{
   public static void main(String[] args)
   {
       String userString = " ";
       int peiceOfEightCount = 0, pirateHatCount = 0, eyePatchCount = 0, 
       swordCount = 0, treasureMapCount = 0, tShirtCount = 0, costOfPeiceOfEight = 8, costOfHats = 32,
       costOfEyePatch = 2, costOfSword = 20, costOfMaps = 100, costOftShirt = 150;
       Scanner input = new Scanner(System.in);
       System.out.println("Welcome to The Pirate Trading Post V3 ");
     while(userString.contains("q") != true)
     {
       System.out.print("Enter the item code or press ? or Q");
       userString = input.nextLine();
       // Declare the variables to keep track of items purchused
       //userString = userString.toLowerCase();
      for(int counter = 0; counter < userString.length(); counter++)
      {
        /*assign userString.charAt(counter) to a char variable
         named c for easier use in the if statement*/
        char c = userString.charAt(counter);
        //If the letters are vowels, count them
        if(c == '8')
        {
         peiceOfEightCount++;
         
        }
        // 
        else if (c == 'h')
        {
         pirateHatCount++;
        }
        //
        else if(c == 'i')
        {
         eyePatchCount++;
        }
        //
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
        System.out.println("Valid item codes are: 8  I  H  M  S  T \n" + "Q to Quit");
        }
        else if(c != 'q')
        {
         System.out.println("Try Again invalid character " + c);
        }
     
     }
    }//ENd of while loop
    System.out.println("Your receipt ");
    if(peiceOfEightCount != 0)    
    {
        System.out.println("poe");
    }
    if(pirateHatCount != 0)    
    {
        System.out.println("hats");
    }
    if(eyePatchCount != 0)    
    {
        System.out.println("eyePatch");
    }
    if(swordCount != 0)    
    {
        System.out.println("Sword");
    }
    if(treasureMapCount != 0)    
    {
        System.out.println("Maps");
    }
    if(tShirtCount != 0)    
    {
        System.out.println("tShirt");
    }
    int totalPrice = 0;
    //Calculate the total
    totalPrice = (peiceOfEightCount * costOfPeiceOfEight) + (pirateHatCount * costOfHats) + (treasureMapCount * costOfMaps) + 
    (swordCount * costOfSword) + (eyePatchCount * costOfEyePatch) + (tShirtCount * costOftShirt);
    //Show user the total cost of all the item they ordered
    System.out.println("Your total cost is " + totalPrice + " bits");
    // Prompt user to Enter how many doubloons they are paying with
    //So we can calculate their change
    System.out.print("How many Doubloons are you paying with, Enter a whole number e.g. 1,2,3....");
    int paymentAmount = input.nextInt();
    final int doubloonsToBits =128;
    final int bitsToPeices = 32;
    final int peicesToBits = 8;
        //Determine if pirate has paid enough. convert doubloons to bits
        //payment amount by cost of item
        if ((paymentAmount * 128) - totalPrice < 0 ){
          System.out.println("You don't have enough money, please leave!!");
        }
        else {
        //Convert the users doubloons into bits and subtract the cost of the item
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
   }//End of public 
}