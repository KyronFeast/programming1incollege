import java.util.Scanner;
/**
 * Write a description of class ToAndFro3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ToAndFro3
{
    public static void main(String[] args)
    {
        
        System.out.print("Enter 5 numbers: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        
        int[] mylist = new int[n];
        for(int counter = 0; counter < mylist.length; counter++)
        {
            System.out.print(mylist[counter]);
        } 
       
        
        
    }
}
