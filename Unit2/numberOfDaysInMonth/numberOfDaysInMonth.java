import java.util.Scanner;
/**
 * Write a description of class numberOfDaysInMonth here.
 * (Thomas J. Short)
 * (V1 09/24/2019)
 * (Cis 260-01)
 * (pg)
 */
public class numberOfDaysInMonth
{
   public static void main(String[] args)
   {
     
     //Create Scanner
     Scanner input = new Scanner(System.in);
     int days;
     //Prompt user to enter the month
     System.out.print("Enter the month ");
     int month = input.nextInt();
     
     //Prompt user to enter the month
     System.out.print("Enter the year ");
     int year = input.nextInt();
     if (month == 2)
     {
        if (year % 4 == 0){
             if (year % 100 == 0){
                if (year % 400 == 0){
                    days = 29;
                }
                else{
                    days = 28;
                }
             }
             else {
                 days = 29;
                }
        }
        else{
            days = 28;
        }
        System.out.println("Febuary " + year + " has " + days + " days ");
     }
     else {
         switch(month){
             case 1:
                  System.out.print("January " + year + " has 31 days.");
                  break;
             case 3:
                  System.out.print("March " + year + " has 31 days.");
                  break;
             case 4:
                  System.out.print("April " + year + " has 30 days.");
                  break;
             case 5:
                  System.out.print("May " + year + " has 31 days.");
                  break;
             case 6:
                  System.out.print("June " + year + " has 30 days.");
                  break;
             case 7:
                  System.out.print("July " + year + " has 31 days.");
                  break;
             case 8:
                  System.out.print("Augest " + year + " has 31 days.");
                  break;
             case 9:
                  System.out.print("September " + year + " has 30 days.");
                  break;
             case 10:
                  System.out.print("October " + year + " has 31 days.");
                  break;
             case 11:
                  System.out.print("November " + year + " has 30 days.");
                  break;
             case 12:
                  System.out.print("December " + year + " has 31 days.");
                  break;
             default:
                  System.out.print("Month entered is incorrect! ");
            }
        }
    }
}     