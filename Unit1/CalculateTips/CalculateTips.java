import java.util.Scanner;

/**
 * This program will allow users to calculat tips using subtotal and gratuity
 * Cis 260-01
 * Thomas J. Short
 * 9/4/2019 
 * pg 70 chaptr 2 java
 */
public class CalculateTips
{
  public static void main(String[] args)
  {
    // Declare variables
    double subtotal;
 
    double gratuity;
    double total;
    
    // Create a scanner object   
    Scanner input = new Scanner(System.in);
    
    // prompt the user to enter a radius
    System.out.println("Enter a subtotal ");
    subtotal = input.nextDouble();
    System.out.println("Enter gratuity rate ");
    gratuity = input.nextDouble();
    
    // Computing tips
    gratuity = (subtotal * gratuity)/100;
    total = subtotal + gratuity;
    
    // Display results
    System.out.println("The gratuity is " + gratuity + " and the total is " +total);
    
    
    
    
  }
}
