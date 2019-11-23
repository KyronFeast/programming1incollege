import java.util.Scanner;
 
public class FutureInvestment {
 
    public static void main(String[] args) {
         
      
 
        // create a new Scanner object
        Scanner input = new Scanner(System.in);
 
        // prompt user to enter investment amount
        System.out.println("Enter an investment amount:");
        double investmentAmount = input.nextDouble();
         
        //Prompt user to enter interst rate 
        System.out.println("Enter annual interest rate in percentage:");
        double monthlyInterestRate = input.nextDouble();
       
       //Prompt user to enter the number of years
        System.out.println("Enter the number of years:");
        double numberOfYears = input.nextDouble();
 
        // calculate  using the formula futureInvestmentValue = 
        // investmentAmount x (1 + monthlyInterestRate)^numberOfYears*12
        
        double futureInvestmentValue =
                investmentAmount * Math.pow((1 + (monthlyInterestRate / 1200)), (numberOfYears * 12));
        // format futureInvestmentValue to two decimal places
        futureInvestmentValue = (int) (futureInvestmentValue * 100) / 100.0;
 
        // display the results
        System.out.println("total amount is $" + futureInvestmentValue + "\n");
    }   
}  