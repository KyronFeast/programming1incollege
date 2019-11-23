
/**
 * This program generates three random letters followed by 4 random numbers
 * resulting in a vehicle licence plate number.
 * Thomas J. Short
 * Cis 260-01
 * Chapter4 P.E.#4.2.5  pg.154
 * Version1
 */
public class generatedVehiclePlateNumbers
{
   public static void main (String[] args)
   {
      //Character random letter is assigned a random letter 
        char randomLetter1 = (char) ((int) (Math.random() * 26+65));
        char randomLetter2 = (char) ((int) (Math.random() * 26+65));
        char randomLetter3 = (char) ((int) (Math.random() * 26+65));
      //Generate a random 4 number digit and assign that to a integer
      //called random number
        int randomNumbers = (int) (Math.random() * 10000);
      //Print out the licence plate number using concatination
        System.out.println("The random vehicle plate number is " + randomLetter1
        + randomLetter2 + randomLetter3 + " "  + randomNumbers );
   }
}
