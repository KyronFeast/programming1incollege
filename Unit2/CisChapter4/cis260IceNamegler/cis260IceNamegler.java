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
  String fullName = input.nextLine();
  /*String name1 = input.next();
  String name2 = input.next();
  String name3 = input.next();*/
  int space =  fullName.indexOf(' ');
  int lastSpace = fullName.lastIndexOf(' ');
  String firstName = fullName.substring(0 , space);
  String middleName = fullName.substring(space, lastSpace);
  //String middleInitial = middleName.substring(1,2);
  String lastName = fullName.substring(lastSpace);
  System.out.printf("%s" + "," + " " + " " + "%s" + " " + "%s", lastName, firstName, middleName + ".");
  //System.out.println(name2);
  
  
  
  
  
  }
  
}
