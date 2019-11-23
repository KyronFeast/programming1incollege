import java.util.Scanner;
public class Population
{
   public static void main(String[] args)
   {
     double secondsInYear = (60*60*24*365);
     double birthsPerYear = secondsInYear/7.0;
     double deathsPerYear = secondsInYear/13.0;
     double imigrantsPerYear = secondsInYear/45.0;
     double increse = birthsPerYear + imigrantsPerYear - deathsPerYear;
     int year0 = 312032486;
     //Create a scanner object
     Scanner input = new Scanner(System.in);
     
     //Prompt user to enter the number of years
     System.out.println("Enter an integer for the number of years you wish to calculate the population for ");
     int userNumber = input.nextInt();
     
     //Compute
     double total = year0+increse*userNumber;
     
     //Display Results
     System.out.println("The population for " + userNumber + " years is " + total);
   }
}
