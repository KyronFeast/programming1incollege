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
  
  Scanner input = new Scanner(System.in);
  System.out.println("Enter weight and price for package 1:");
  double w1 = input.nextDouble();
  double p1 = input.nextDouble();
  System.out.println("Enter weight and price for package 2:");
  double w2 = input.nextDouble();
  double p2 = input.nextDouble();
  double r = w2 / p2 - w1 / p1;
  
 
  if (r < 0) { 
   System.out.println("Two packages have the same price.");
   
  }
 
  if (r > 0) {
   System.out.println( "Pakage 2");
  } else if (r < 0){
      System.out.println( "Pakage 2");
    else
      System.out.println("Pakage 1");
  }
 
  
 
 }
 
} 
   

