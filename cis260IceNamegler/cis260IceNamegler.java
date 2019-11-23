import java.util.Scanner;
/**
 * This program let's the user input their full name seperated by spaces
 * Then it display's their name in phonebook format
 * Thomas J. Short
 * Cis 260-01 
 * NameGler ICE
 * 10/07/2019
 */
public class cis260IceNamegler
{
  public static void main(String[] args)
  {
  //Create new Scanner object
  Scanner input = new Scanner(System.in);
  
  //Prompt the user to enter their full name 
  System.out.println("Enter full name seperated by spaces: eg. Thomas J Short ");
  
  String name1 = input.next();
  String name2 = input.next();
  String name3 = input.next();
  int space =  name1.indexOf(' ');
  String middleInital = name2.substring(0,1);
  //String fName = firstName.substring(0, space);
  //String lName = lastName.substring(space + 1);
  
  System.out.printf("%s"+"," + "%8s" + "%4s", name3, name1, middleInital + ".");
  //System.out.println(name2);
  
  
  
  
  
  }
  
}
