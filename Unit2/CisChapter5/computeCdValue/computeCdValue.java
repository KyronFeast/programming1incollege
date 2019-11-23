import java.util.Scanner;
/**
 * Thomas J. Short
 */
public class computeCdValue
{
   public static void main(String[] args)
   {
    //create a new scanner object
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the deposite amount you would like to start with: \n"
    + "E.g. 10000");
    double depositeAmount = input.nextDouble();
		
    System.out.print("Enter The Annual Percentage Yield: \n" +
    "E.g 5.75");
    double annualRate = input.nextDouble();
		
    System.out.print("Enter maturity period (Enter the number of months):\n "
    + "e.g 1,2,3...");
    int maturityPeroid = input.nextInt();
		
    double monthlyRate = annualRate / 1200;
		
    System.out.println("\nMonth  CD Value");
		
    int formatter = 14;
		
    for(int count = 1; count <= maturityPeroid; count++) 
    {
     depositeAmount = depositeAmount + (depositeAmount * monthlyRate);
     if(count == 10) 
     formatter--;
     System.out.printf(count + "%" + formatter + ".2f\n", depositeAmount);
    }
   }
}
