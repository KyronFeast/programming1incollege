import java.util.Scanner;
/**
 * Compare Cost
 * this is a program that uses a formula to decide which package is a 
 * better deal based on the weight and the price of two packages
 * Thomas J. Short
 * 09/25/2019
 * Version1
 * Chapter 3 selectors pg. 118
 */
public class compareCost
{
  public static void main(String[] args)
  {
    //Create a new scanner object
    Scanner input = new Scanner(System.in);
  
    //Propmt user for weight and price of first package
    System.out.println("Enter weight and price for package 1:");
    double weight1 = input.nextDouble();
    double price1 = input.nextDouble();
  
    //Prompt user for weight and price of second package
    System.out.println("Enter weight and price for package 2:");
    double weight2 = input.nextDouble();
    double price2 = input.nextDouble();
    
    // calculate using wight / prrice
    double rice = weight2 / price2 - weight1 / price1;
  
 
   
     /*if rice is greater then zero then print package two otherwise
    print package one
    */
    if (rice > 0) {
     System.out.println("Pakage 2 is the best buy. ");
    } 
      else {
        System.out.println("Pakage 1 is the best buy. ");
    }
       if (rice < 0){
     System.out.println("Both packages are the same price. ");
    }
 
 
  }
} 
 
   

