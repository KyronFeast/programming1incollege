import java.util.Scanner;
/*This program take an array of nubers from the user and checks if
 * the list is sorted already or not
 * Programming exercise 7.19 sorted?
 * Thomas J. Short
 * 11/13/2019
 * CIS 260-01
 * p.g. 282
  */
public class Sorted
{
    public static void main(String[] args)
    {
        // Create Scanner object ask user for the size of their list
        // and read user input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the list: ");
        int listsize = input.nextInt();
        //Ask user for input and assign it to an array
        System.out.print("Enter the contents of the list: ");
        int[] list = new int[listsize];
        // loop to populate the array
        for(int populatelist = 0; populatelist < list.length; populatelist++)
        {
            list[populatelist] = input.nextInt();
            
        }
        //use ternary operator to print if already else not
        System.out.println("The list is " + 
        (isSorted(list) ? "already " : "not ") + "sorted");
        
    }//End of main
    public static boolean isSorted(int[] list)
    {
        //if list is sorted return true otherwise return false
        for(int count = 0; count < list.length -1; count++)
        {
            if(list[count] > list[count + 1])
            {
                return false;  
            }
        }
        return true;
    }//End of isSorted
}
