
/**
 * Write a description of class TestArrayArguments here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TestArrayArguments
{
    public static void main(String[] args)
    {
        //declare x with an initial value of 1
        int x = 1;
        /*Create an array called numbers of 10 
        integers with the starting values of 0*/
        int[] y = new int [10];
        //invoke method m with x and y
        m(x, y);
        // Display x 
        System.out.println("x is " + x);
        // Display y[0]
        System.out.println("y[0] is " + y[0]);
    }
    //Create a method named m that accepts x and y
    public static void m(int number, int[] numbers)
    {
        //assign 1001 to the variable number
        number = 1001;
        //assign 5555 to numbers sub[0]
        numbers[0] = 5555; 
    }
}
