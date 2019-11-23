import java.util.Scanner;
/**
 * Population growth calculator 
 * Thomas J. Short
 * Cis 260-01
 * 09/09/2019
 * pg 71 chapter 2 java
 */
public class PopulationGrowth
{
  public static void main(String[] args)
  {
    // Declare variables
    double secondsInYear = (60*60*24*365);
    double birthsPerYear = secondsInYear/7.0;
    double deathsPerYear = secondsInYear/13.0;
    double imigrantsPerYear = secondsInYear/45.0;
    int years;
    int currentYear = 312032486;
    // Create a scanner object
    Scanner input = new Scanner(System.in);
    //Prompt user to enter number of year
    System.out.print("Enter the number of years to calculate population for " );
     years = input.nextInt();
    
    // Compute population
    //double total = year0+increse*userNumber;
    currentYear += (birthsPerYear + imigrantsPerYear - deathsPerYear)*years;
    // Display the results
    System.out.println("The population for " + years +  " years  is " +  currentYear);
    
    
    
    
  }
}
