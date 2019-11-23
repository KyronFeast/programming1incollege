
/**
 * Future Tuition
 *This program computes tuition for ten years with a .05 percent 
 *increase each year. also after ten years it calculates 4 years
 *of tuition
 *Thomas J. Short
 *Cis 260-01
 *10/13/2019
 *Chapter 5 pg.195
 *Programming Exercise 5.7
 */
public class computeFutureTuition
{
  public static void main(String[] args)
  {
     // declare a variable for total tuition
     double totalTuition = 0;
     // declare the initial tuiton
     double tuition = 10000;
     //declare the constant year
     final int YEAR = 14;
     //declare the constant tuitionIncrease
     final double TUITION_INCREASE= 0.05;
     //Print the table header
     System.out.println("      Year              Tuition Cost ");
     //create a for loop to count years
     for (int counter = 1; counter <= YEAR; counter++)
     {
	//print the year and tuition up to ten years
         if (counter <= 10)
	{
	    // format tuition to only show 2 decimal places
	    System.out.printf("\t %2d \t\t    %8.2f\n", counter, tuition);   
	}//end of if
        
	else
        {
          totalTuition += tuition;
        }
         tuition += (tuition * TUITION_INCREASE);
	
        
     }//end of for loop
     System.out.printf
	(
	  "In 10 years, 4 years worth of tuition will cost " + "$"
	+ "%.2f",totalTuition
	);
  }
}
