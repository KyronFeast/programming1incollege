import java.util.Scanner;
/**
 * Write a description of class compareCost here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class compareCost
{
  public static void main(String[] args)
  {
  //Create a new scanner object
  Scanner input = new Scanner(System.in);
  //Pr
  System.out.println("Enter weight and price for package 1:");
  double w1 = input.nextDouble();
  double p1 = input.nextDouble();
  System.out.println("Enter weight and price for package 2:");
  double w2 = input.nextDouble();
  double p2 = input.nextDouble();
  double rice = w2 / p2 - w1 / p1;
  
 
  
 
  if (rice > 0) {
   System.out.println("Pakage 2 is the best buy. ");
  } else {
   System.out.println("Pakage 1 is the best buy. ");
  }
 
 
 
  }
 
} 
   

