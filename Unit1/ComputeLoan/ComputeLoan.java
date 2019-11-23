import java.util.Scanner;
/**
 * Write a description of class ComputeLoan here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ComputeLoan
{
  public static void main(String[] args)
  {
     Scanner input = new Scanner(System.in);
     System.out.print("Enter an annual interest rate e.g.  1.75 ");
     double annualInterestRate = input.nextDouble();
     double monthlyInterestRate = annualInterestRate / 1200;
     System.out.print("Enter the number of years as a whole number e.g.10 ");
     double numberOfYears = input.nextDouble();
     System.out.print("Enter the loan amount e.g 15000.26 ");
     double loanAmount = input.nextDouble();
     double monthlyPayment = loanAmount * monthlyInterestRate / (1-1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
     double totalPayment = monthlyPayment * numberOfYears * 12;
     System.out.print("The monthly payment is " + (int) (monthlyPayment * 100) / 100.0);
     
     System.out.print(" The total payment is " + (int) (totalPayment * 100) / 100.0);
  }
}
