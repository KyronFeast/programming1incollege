import java.util.Scanner;
/*This program allows the user to enter a number 1 through 15 and then
 * displays a pryamid based on the number that was entered.
 * Thomas J. Short  
 * Cis 260-01
 * 10/13/2019
 * Display Pryamid
 * Chapter 5 pg.196
 * Programming Exercise 5.17
 */
public class displayPryamid
{
   public static void main(String[] args)
   {
      // create new scanner object
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the number of lines for the pattern "  +
       "to be displayed \n" +
      "choose any number from 1 to 15 " + " E.g. 1,2,3,...,15 ");
      // assing input to an integer variable called usernumber
      int userNumber = input.nextInt();
      
      // if usernumber is too big or small end program
      if (userNumber >= 1 && userNumber <= 15)
      {//open if
         //set row to 0 if the row is less or equal to input increment row by one
          for (int row = 0; row <= userNumber; row++)
         {//open for loop
           //create our white space for our columns
           for (int column = (int) (userNumber - row); column >= 0; column--)
           {
             System.out.printf("%4s", " ");
           }
           //create our first number pattern
           for (int pattern = row; pattern > 0; pattern--)
           {
             System.out.printf("%4d", pattern  );
           }
           //create our second number pattern
           for (int pattern2 = 2; pattern2 <= row; pattern2++)
           {
             System.out.printf("%4d", pattern2);
           }
           System.out.println();
         }//End of for loop
      }// end of if
      
      else
      {
        System.out.println("Sorry your number is less than 1 or greater than 15 \n" +
        "can not display the pattern");
      }// end of else
   }
}
