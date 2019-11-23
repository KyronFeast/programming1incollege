 
/**
 * Write a description of class milesToKmTable here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class milesToKmTable
{
   public static void main(String[] args)
   {
  
     final int MILES_FINISH = 10;
     final int MILES_BEGIN = 20;
   
     // Display the table heading   
     System.out.println(" Miles To Kilometers Table");
     // Display the number title
     System.out.print("Miles    Kilometers     |     Kilometers    Miles   ");
   
      for( int j = 0,  i = 1;  i <= MILES_FINISH;  i++, j += 5)
      {
        System.out.printf("%5d %13.3f", i, i * 1.609 );
        System.out.printf("\t\t%8d %8.3f\n", MILES_BEGIN + j, (MILES_BEGIN + j) / 1.609);
      }   
   
    
    
 
   }
}