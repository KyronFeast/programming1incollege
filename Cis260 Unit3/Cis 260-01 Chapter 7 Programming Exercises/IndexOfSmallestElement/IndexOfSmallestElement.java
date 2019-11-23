import java.util.Scanner;
/**
 * This program lets the user enter 10 numbers and finds the
 * index of the smallest number and display it
 * @author (Thomas J. Short)
 * @version (11/03/2019)
 * Cis 260
 * Chapter 7 pg. 280
 * Programming Exersice 7.10
 */
public class IndexOfSmallestElement
{
    //Program starts execution here
    public static void main(String[] args)
    {
        //Prompt user to enter 10 numbers and assign them to an array
        System.out.print("Enter ten numbers ");
        Scanner input = new Scanner(System.in);
        double[] userinput = new double [10];
        //Populate the array with user input
        for(int counter = 0; counter < userinput.length; counter++ )
        {
            userinput[counter] = input.nextDouble();
        }
        //Display the smallest input the user entered
        System.out.println("The index of the smallest number is " + 
        IndexOfSmallestElement(userinput));
    }
    
    public static int IndexOfSmallestElement(double[] array)
    {
        //Set the users first number to minimum so we have a starting point
        double minimum = array[0];
        int minimumIndex = 0;
        //Start counting with second number and compare to first number
        for(int counter = 1; counter < array.length; counter++)
        {
            if(minimum > array[counter])
            {
                minimumIndex = counter;
            }
        }
        return minimumIndex;
    }
}
