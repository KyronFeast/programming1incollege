import java.util.Scanner;
/**
 * This program prompts the user to enter an integer and if the number
 * is a multiple of 5 it display HiFive. If the number is divisable by 2
 * it displays HiEven
 *
 * @author (Thomas J. Short)
 * @version (v1 09/18/2019)
 * Cis 260 
 */
public class SimpleIfDemo
{
  public static void main(String[] args)
  {
    //Create a scanner
    Scanner input = new Scanner(System.in);
    
    //Prompt user to enter an integer
    System.out.print("Enter an integer ");
    int number = input.nextInt();
    
    //If number is a multiple of 5 print HiFive
    if (number % 5 == 0)
      System.out.println("HiFive");
      
    if (number % 2 == 0)
      System.out.println("HiEleven");
  }
}
