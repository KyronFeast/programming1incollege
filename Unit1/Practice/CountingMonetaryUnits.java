import java.util.Scanner;
/**
 * Write a description of class MonetaryUnits here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class CountingMonetaryUnits
{
    public static void main() 
    {
        //Create a scanner
        Scanner input = new Scanner(System.in);
        //Promt user for the amount
        System.out.print("Enter an amount as a decimal number ,such as , 11.56");
        double userNumber = input.nextDouble();

        //Convert the amount into cents
        int remainingAmount = (int) (userNumber * 100);

        //Find the number of one dollars
        int numberOfOneDollarBills = remainingAmount / 100;
        remainingAmount = remainingAmount % 100;
        
        //divide the remainingAmount by 25 to get total number of quarters then obtain the remaining amount using the remainder cents % 25
        int numberOfQuarters = remainingAmount / 25;
        remainingAmount = remainingAmount % 25;

        //divide the remaing amount by ten the get the remaing cents using % 10
        int nuberOfDimes = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;

        //find the number of nickels by dividing the remaining cents by 5 then take the remainingAmount and finding the remainder of that with % 
        int numberOfNickles = remainingAmount / 5;
        remainingAmount = remainingAmount % 5;

        //the remaining cents are now the pennies
        int nuberOfPennies = remainingAmount;

        //display the results 
        System.out.println("Your amount " + userNumber + "consits of");
        System.out.println(" " + numberOfOneDollarBills + "dollars");
        System.out.println(" " + numberOfQuarters + "quarters");
        System.out.println(" " + nuberOfDimes + "dimes");
        System.out.println(" " + numberOfNickles + "nickels");
        System.out.println(" " + nuberOfPennies + "pennies");

    }
}

  
