import java.util.Scanner;
/**
 * Write a description of class cis260IceNamegler here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class cis260IceNameglerversion2
{
  public static void main(String[] args)
  {
  //Create new Scanner object
  Scanner input = new Scanner(System.in);
  
  //Prompt the user to enter their full name 
  System.out.println("Enter full name seperated by spaces: eg. Thomas J Short ");
  
  String name1 = input.nextLine();
  
  int space =  name1.indexOf(' ');
  //String  = name2.substring(space + 1);
  String fName = name1.substring(0, space);
  String mName = name1.substring(space + 1);
  String lName = name1.substring();
  System.out.printf("%59s, %s %s", lName, fName, mName);
  //System.out.println(name2);
  } 
}