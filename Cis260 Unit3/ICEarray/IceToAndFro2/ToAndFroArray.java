import java.util.Scanner;
/**
 * Read in 5 numbers
 * Cis 260 -01
 * @author (Thomas J. Short)
 * @version (V1)
 */
public class ToAndFroArray
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int[] numbers = readInput(5);
        
        printReverseArray(numbers);
        printArray(numbers);
    }
    public static int[] readInput(int userlist )
    {
        System.out.print("Enter " + userlist + " userlist:");
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[userlist];
            for(int i = 0; i < numbers.length; i++)
            {
                numbers[i] = input.nextInt();
            }
            return numbers;
    }
    public static void printArray(int[] values)
    {
        for(int counter = 0; counter < values.length; counter++)
        {
            System.out.print(values[counter] + " ");
        }
    }
    public static void printReverseArray(int[] values)
    {
        for(int counter = values.length -1; counter >= 0; counter--)
        {
            System.out.print( values[counter] + " ");
        }
    }
       
       
}
