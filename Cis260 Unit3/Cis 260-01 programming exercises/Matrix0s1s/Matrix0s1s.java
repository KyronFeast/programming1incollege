import java.util.Scanner;
/*This program allows the user to enter a number and prints
 * a matrix of 1's and 0'2 based on that number. It does 
 * this by getting input, then caling a print module which then 
 * calls another integer module 
 * function
 *  Thomas J, Short
 *  Cis 260-01
 *  Chapter 6 P.E. 6.17 
 *  pg. 6.17
 */
public class Matrix0s1s
{
    //main arguments
    public static void main(String[] args) 
    {
      //Create a New Scanner Object
      Scanner input = new Scanner(System.in);
      //Prompt user to enter the number of lines in the matrix
      System.out.print("Enter number of lines: ");
      //assigns user input to integer datatype
      int numberOfLines = input.nextInt();
      //Invoke printMatrix Method using the method signature
      printMatrix(numberOfLines);
    }//End of the main module
    //Module to print a matrix of our rows and columns
    public static void printMatrix(int numberOfLines)
    {
        for(int row = 0; row < numberOfLines; row++)
        {
            for(int column = 0; column < numberOfLines; 
            column++)
            {
                System.out.print(intRandom(0, 1) + " ");
            }
            System.out.println();
        }
    }//End of printMatrix module
    
    /*printMax invoke intRandom 
    This module returns a randomly generated number either 0 or 1*/
    public static int intRandom(int lowerBound, int upperBound)
    {
        return (int) (lowerBound + Math.random() *  
        (upperBound - lowerBound + 1));
    }//End of intRandom method
}