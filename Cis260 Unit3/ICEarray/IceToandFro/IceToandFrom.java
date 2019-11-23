import java.util.Scanner;
/**
 * Write a description of class IceToandFrom here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class IceToandFrom
{
    public static void main(String[] args)
    {
    Scanner input = new Scanner(System.in);
    int[] numbers = readInput(5);
    
    printReversed(numbers);
    }
    public static int[] readInput(int numberOfInputs)
    {
        System.out.println("Enter " + numberOfInputs + " numbers: ");
        Scanner input = new Scanner(System.in);
        int[] usernumbers = new int[numberOfInputs];
        for (int i = 0; i < usernumbers.length; i++)
        {
        usernumbers[i] = input.nextInt();
        }
        return usernumbers;
    }
   
    public static void printReversed(int[] values)
    {
        for(int i = values.length -1; i >= 0; i--)
        {
            System.out.print(values[i] + " ");
        }   
    }
}
