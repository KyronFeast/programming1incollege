import java.util.Scanner;
/**
 * Write a description of class ToAndFro4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ToAndFro4
{
   Scanner input = new Scanner(System.in);
   double[] myList = new double[5];
   System.out.print("Enter" + myList.length + " values: ");
   for( double i = 0; i < myList.length; i++)
   {
    myList[i] = input.nextDouble(); 
    }
}
