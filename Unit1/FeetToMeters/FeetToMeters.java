import java.util.Scanner;
/* Convert feet to meters
 * Thomas J. Short
 * Cis 260-01
 * 09/09/2019
 * pg 69 chapter 2 java
 */
public class FeetToMeters
{
  public static void main(String[] args)
  {
      // Ask user to input number of feet
      System.out.print("Enter the number of feet to be converted ");
      // Allows user to use keyboard for input
      Scanner input = new Scanner(System.in);
      double feet = input.nextDouble();
      // Calculate meters
      double meters = (0.305*feet);
      // print results
      System.out.println(feet + " feet is " + meters + " meters ");
    
  }
}
