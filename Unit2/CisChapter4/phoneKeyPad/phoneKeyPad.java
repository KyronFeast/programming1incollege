import java.util.Scanner;
/**
 *  This program simulates a key pad for a phone allowing you
 *  to enter a letter that represents a letter on a phone key pad
 *  and displays the result unless invalid then tell them invalid.
 *  Thomas J. Short
 *  Cis 260-01 
 *  10/2/2019
 *  Chapter4 P.E. #4.15 pg.154
 *  Phone KeyPad Version1
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
    String letterPressed = input.next();
    //Convert letterPressed to lowerCase and assign that to Letter
    // test uppercase letter no need to test lowercase
    char letter = letterPressed.toLowerCase().charAt(0);
    // Declare the number that represents the letter the user pressed
    int userNumber;
    
    switch(letter)
    {
    case 'a': userNumber = 2; //break;
    case 'b': userNumber = 2; //break;
    case 'c': userNumber = 2; break;
    case 'd': userNumber = 3; //break;
    case 'e': userNumber = 3; //break;
    case 'f': userNumber = 3; break;
    case 'g': userNumber = 4; //break;
    case 'h': userNumber = 4; //break;
    case 'i': userNumber = 4; break;
    case 'j': userNumber = 5; //break;
    case 'k': userNumber = 5; //break;
    case 'l': userNumber = 5; break;
    case 'm': userNumber = 6; //break;
    case 'n': userNumber = 6; //break;
    case 'o': userNumber = 6; break;
    case 'p': userNumber = 7; //break;
    case 'q': userNumber = 7; //break;
    case 'r': userNumber = 7; //break;
    case 's': userNumber = 7; break;
    case 't': userNumber = 8; //break;
    case 'u': userNumber = 8; //break;
    case 'v': userNumber = 8; break;
    case 'w': userNumber = 9; //break;
    case 'x': userNumber = 9; //break;
    case 'y': userNumber = 9; //break;
    case 'z': userNumber = 9; break;
    default:  userNumber = 0; break;
    }
    // if the userNumber is not equal to zero display their number
    //If it is exit the case and tell user that imput was invalid
    if (userNumber != 0)
    {
     System.out.print(" The number for letter entered is " + userNumber);
     System.exit(0);
    }
      else
      {
      System.out.print(letterPressed + " is not a valid entry ");
      }
    
  }
}

