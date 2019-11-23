import java.util.Scanner;
/**
 * Write a description of class reverseNumbersEntered here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class reverseNumbersEntered
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 10 numbers to print in reverse ");
        int[] userinput = new int[10];
        int total = 0;
        int max = userinput[0];
        int min = userinput[0];
       
        for(int counter = 0; counter < userinput.length; counter++)
        {
            userinput[counter] = input.nextInt();
            
        }
        for(int counter = 0; counter < userinput.length; counter++)
        {
            System.out.println(userinput[counter]);
        }
        for(int counter = userinput.length -1; counter >= 0; counter--)
        {
            System.out.println(userinput[counter] + " ");
        }
        for(int totalcount = 0; totalcount < userinput.length; totalcount++)
        {
            total += userinput[totalcount];
        }
        System.out.println("your total is " +  total);
        for(int maxcount = 1; maxcount < userinput.length; maxcount++)
        {
            if(userinput[maxcount] > max)
            {
                max = userinput[maxcount];
            }
        }
        System.out.println("The largest element is " + max);
         for(int mincount = 0; mincount < userinput.length; mincount++)
        {
            if(userinput[mincount] < min)
            {
                min = userinput[mincount];
            }
        }
        System.out.println("The smallest element is " + min);
    }
}
