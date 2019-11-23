import java.util.Scanner;
/**
 * This program allows the user to enter one side of a hexagon then
 * computes the area of the hexagon, after rounding to show only
 * two decimal places the program displays the result back to the user.
 *
 * Thomas J. Short 
 * Area Of A Hexagon Version1
 * Chapter4  P.E. #4.4 pg.151
 * Cis 260-01
 * 10/04/2019
 */
public class areaOfaHexagon
{
  public static void main(String[] args)
  {
    //Create a new scanner object 
      Scanner input = new Scanner(System.in);
    
    //Prompt user for the one side of the hexagon
      System.out.print("Enter the side lenght of a hexagon for \n" + 
      "the calculation of it's area");
    //assign users input variable to side with a double datatype 
      double side = input.nextDouble();
    
    //Calculate the area 
      double area =(int) 6 * Math.pow(side, 2)/(4 * Math.tan(Math.PI/6 )) ;
    
    //Round to show only two decimal places
      area = Math.round(area * 100 )/ 100.0;
    
    //Display Result using concatination
      System.out.println("The area for a hexagon with a side lenght of "
      + side + " is " + area );
  }
}
