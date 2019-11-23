import java.util.Scanner;
/*This program allows a user to enter 10 numbers and prints 
 * only the numbers that show up once in the list.
 * Thomas J. Short
 * Cis 260 
 * 11/03/2019
 * Chapter 7 pg. 279 
 * Programming Exersice **7.5
 */
 
public class PrintDistinctNumbers 
{  //program starts execution
  public static void main(String[] args) 
  {
     // Create Scanner object
     Scanner input = new Scanner(System.in);
     //Create array to hold user input
     int[] numbers = new int[10];
     // declare a variable to count user input
     int number;  
     // declare vaiable for counting the distinct numbers found
     int distinctnumbers = 0; 
     // count the repeat numbers
     int repeatnumber = 0; 
     // count user input
     int usernumbers = 0;
     // prompt user for input
     System.out.print("Enter ten numbers:");
     
     // when userinput is less than ten ask for input and count them
     while (usernumbers < 10) 
     {
       number = input.nextInt();
       usernumbers++;
       
       for (repeatnumber = 0; repeatnumber <= distinctnumbers; repeatnumber++) 
       {
          if (number == numbers[repeatnumber]) 
          {
                break;
          }
       }
       // see if the number is distinct
       if (repeatnumber - distinctnumbers == 1) 
       {
          numbers[distinctnumbers] = number;
          distinctnumbers++;
       }
  
     } 
 
     System.out.println("There are " + distinctnumbers + " distinct numbers" );
     System.out.print("The distinct numbers are:");
 
     for (int displaydistinct = 0; displaydistinct < distinctnumbers; 
     displaydistinct++)
     {
          System.out.print(numbers[displaydistinct] + " ");      
     }
  
  }
}