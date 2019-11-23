import java.util.Scanner;
/**
 * Thomas J. Short
 * Cis 260-01
 * This program comutes a cd and display results
 * 10/14/2019
 */
public class computeCdValue
{
   public static void main(String[] args)
   {
    //create a new scanner object
    Scanner input = new Scanner(System.in);
    //Ask user for input
    System.out.print("Enter the deposite amount you would like to start with: \n"
    + "E.g. 10000");
    // assing input to user amount
    double depositeAmount = input.nextDouble();
    // ask user for apr		
    System.out.print("Enter The Annual Percentage Yield: \n" +
    "E.g 5.75");
    //Assign apr
    double annualRate = input.nextDouble();
    // Ask user how long the deposite has matured for	
    System.out.print("Enter maturity period (Enter the number of months):\n "
    + "e.g 1,2,3...");
    //assign that value
    int maturityPeroid = input.nextInt();
    // calculate the monthly rate		
    double monthlyRate = annualRate / 1200;
	// print header	
    System.out.println("\nMonth  CD Value");
		
    //set count to 1  if count less then the maturity period add 1 to count	
    for(int count = 1; count <= maturityPeroid; count++) 
    {
     // calculate deposite amount
     depositeAmount = depositeAmount + (depositeAmount * monthlyRate);
     //if count is ten go ahead and print
     
     if(count == 10)
     {
        System.out.printf("%-5d %.2f\n" ,count,depositeAmount);
     }
    
    }
   }
}
