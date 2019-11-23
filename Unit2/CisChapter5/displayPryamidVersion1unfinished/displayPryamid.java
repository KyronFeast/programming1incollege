import java.util.Scanner;
/*This program allows the user to enter a number 1 through 15 and then
 * displays a pryamid based on the number that was entered.
 * Thomas J. Short  
*/
public class displayPryamid
{
   public static void main(String[] args)
   {
      // create new scanner object
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a number from one to 15 \n "
      + "e.g. 1,2,3,...,15");
      // assing input to an integer variable called usernumber
      int userNumber = input.nextInt();
      
      // if usernumber is too big or small end program
      if (userNumber >= 1 && userNumber <= 15)
      {
         //set row to 0 if the row is less or equal to input increment row by one
          for (int row = 0; row <= userNumber; row++)
         {
           //create our white space for our columns
           for (int column = (int) (userNumber - row); column >= 0; column--)
           {
             System.out.print("  ");
           }
           //create our first number pattern
           for (int pattern = row; pattern > 0; pattern--)
           {
             System.out.print(pattern + " " );
           }
           //create our second number pattern
           for (int pattern2 = 2; pattern2 <= row; pattern2++)
           {
             System.out.print(pattern2 + " ");
           }
           System.out.println();
         }
      }// end of if
      
      else
      {
        System.out.println("Sorry your number less than 1 or greater than 15");
      }// end of else
   }
}
