import java.util.Scanner;
/**
 * This is a modded version of the phone key pad version in which
 * we invoke a sperate method called getNumber
 *  Thomas J. Short
 *  Cis 260-01 
 *  10/22/2019
 *  Chapter6 P.E. #6.21 pg.241
 *  Phone KeyPad Version2
 */ 
public class phoneKeyPad
{
  public static void main(String[] args)
  {
    //Create a new Scanner object
    Scanner input = new Scanner(System.in);
    //Prompt user to enter a letter representing his number
    System.out.print("Enter a letter representing the number ");
    //Assign user's entry to a string
    String letterPressed = input.nextLine();
    //initialize LetterToNumber
    String letterToNumber = "";
    for(int counter = 0; counter < letterPressed.length(); counter++)
    {
     int userNumber = getNumber(letterPressed.toUpperCase().charAt(counter));
     //if usernumber is not zero assign
     if (userNumber != 0)
     {
         letterToNumber = letterToNumber + userNumber;
     }
       else
       {
           letterToNumber = letterToNumber + letterPressed.charAt(counter);
       }
   
    }
    System.out.println(letterToNumber);
  }
  
  public static int getNumber(char uppercaseLetter)
  {
    int userNumber;
    
    switch (uppercaseLetter)
    {
    case 'A': userNumber = 2; break;
    case 'B': userNumber = 2; break;
    case 'C': userNumber = 2; break;
    case 'D': userNumber = 3; break;
    case 'E': userNumber = 3; break;
    case 'F': userNumber = 3; break;
    case 'G': userNumber = 4; break;
    case 'H': userNumber = 4; break;
    case 'I': userNumber = 4; break;
    case 'J': userNumber = 5; break;
    case 'K': userNumber = 5; break;
    case 'L': userNumber = 5; break;
    case 'M': userNumber = 6; break;
    case 'N': userNumber = 6; break;
    case 'O': userNumber = 6; break;
    case 'P': userNumber = 7; break;
    case 'Q': userNumber = 7; break;
    case 'R': userNumber = 7; break;
    case 'S': userNumber = 7; break;
    case 'T': userNumber = 8; break;
    case 'U': userNumber = 8; break;
    case 'V': userNumber = 8; break;
    case 'W': userNumber = 9; break;
    case 'X': userNumber = 9; break;
    case 'Y': userNumber = 9; break;
    case 'Z': userNumber = 9; break;
    default:  userNumber = 0; break;
    }

    return userNumber;
  }
}


