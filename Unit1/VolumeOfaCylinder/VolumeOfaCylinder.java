import java.util.Scanner;
/**
 * Write a description of class VolumeOfaCylinder here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class VolumeOfaCylinder
{
  public static void main(String[] args)
  {
     Scanner input = new Scanner(System.in);
     final double PI = 3.14159;
     
     System.out.print("Please enter the radius of the cylinder ");
     double radius = input.nextDouble();
     double area = radius * radius * PI;
     
     System.out.print("Please enter the lenght of the cylinder ");
     double lenght = input.nextDouble();
     double volume = area * lenght;
     
     System.out.print("The area of the circle is "  + area + 
     "The volume of the cylinder is " + volume);
     
    }
}
