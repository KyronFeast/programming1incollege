import java.util.Scanner;
/**
 * Write a description of class phoneKeyPads here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class phoneKeyPads
{
   public static void main(String[] args)
   {
       Scanner input = new Scanner(System.in);
       System.out.println("Enter a letter ");
       String s1 = input.next();
       
       char character = s1.toLowerCase().charAt(0);
       int keypadNumber;
       
       switch(character){
       case 'a':
       case 'b':
       case 'c':
       keypadNumber = 2;
       break;
       
       case 'd':
       case 'e':
       case 'f':
       keypadNumber = 3;
       break;
       
       case 'g':
       case 'h':
       case 'i':
       keypadNumber = 4;
       break;
       
       case 'j':
       case'k':
       case'l':
       keypadNumber = 5;
       break;
       
       case 'm':
       case 'n':
       case 'o':
       keypadNumber = 6;
       break;
       
       case 'p':
       case 'q':
       case 'r':
       case 's':
       keypadNumber = 7;
       break;
       
       case 't':
       case 'u':
       case 'v':
       keypadNumber = 8;
       break;
       
       case 'w':
       case 'x':
       case 'y':
       case 'z':
       keypadNumber = 9;
       break;
       
       default:
       keypadNumber = 0;
       break;
       }
       
       if(keypadNumber != 0){
        System.out.print("The keypadNumber for the letter you entered is " + keypadNumber);
        System.exit(0);
       }
       else{
       System.out.print(s1 + " is invalid");
    }
   }
}
