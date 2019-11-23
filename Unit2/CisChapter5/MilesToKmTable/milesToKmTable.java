
/**
 * This Program is supposed to covert mile to km and km to miles. 
 * Not really finished aghhh
 * Thomas J. Short
 * Cis 260-01
 * 10/14/2019
 */
public class milesToKmTable
{
   public static void main(String[] args)
   {
   // Display the number title
   System.out.print("Miles    Kilometers     |     Kilometers    Miles   ");
   //Declare consonant
   final double MILE_IN_KILOMETER = 1.609;
   // Create loop to create two tables
   for( int mile = 0,  km = 20;  mile <= 10;  mile++, km += 5)
   {
     System.out.printf("%-12d %6.3f  |  %-16d %1.3f\n", mile, mile * MILE_IN_KILOMETER
     ,km,  km / MILE_IN_KILOMETER); 
    }   
   
    
    
 
   }
}