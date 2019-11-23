import java.util.Scanner;
/*Thomas J. Short
 * Cis260-01
 * 09/24/2019
 * 
   */ 
public class daysInMonth 
{
  public static void main(String[] args)
  {
    //Create scanner object
    Scanner input = new Scanner(System.in);
  
    //Prompt the user to enter the month using an integer
    System.out.print("Enter the month: e.g. 1.2.3 ");
    int month = input.nextInt();
  
    //Prompt the user to enter the year using an integer
    System.out.print("Enter the year:  e.g. 1.2.3...");
    int year = input.nextInt();
  
    //There are 31 day in most months
    int days = 31;
   
 
    
    switch (month) {
    case 2:
    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
    days = 29;
    break;
    }
    days = 28;
    break;
 
    case 4:
    case 6:
    case 9:
    case 11:
    days = 30;
  
    }
 
    switch (month) {
    case 1:
    System.out.println("January " + year + " has " + days + " days." ); break;
    case 2:
    System.out.println("Febuary " + year + " has " + days + " days." ); break;
    case 3:
    System.out.println("March " + year + " has " + days + " days." ); break;
    case 4:
    System.out.println("April " + year + " has " + days + " days." );break;
    case 5:
    System.out.println("May " + year + " has " + days + " days." ); break;
    case 6:
    System.out.println("June " + year + " has " + days + " days." ); break;
    case 7:
    System.out.println("July " + year + " has " + days + " days." ); break;
    case 8:
    System.out.println("Augest " + year + " has " + days + " days." ); break;
    case 9:
    System.out.println("September " + year + " has " + days + " days." ); break;
    case 10:
    System.out.println("October " + year + " has " + days + " days." ); break;
    case 11:
    System.out.println("November " + year + " has " + days + " days." ); break;
    case 12:
    System.out.println("December " + year + " has " + days + " days." ); break;
    default:
    days = 0;
    System.out.print(" the month entered is incorrect! "); break;
    }
   } 
}
