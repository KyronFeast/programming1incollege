import java.util.Scanner;
/**
 * Write a description of class AdditionQuiz here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AdditionQuiz
{
  public static void main(String[] args)
  {
     //Generate random numbers
     int number1 = (int) (System.currentTimeMillis() % 10);
     int number2 = (int) (System.currentTimeMillis() / 10 % 10);
     
     //Create a scanner
     Scanner input = new Scanner(System.in);
     
     System.out.print(
     "What is " + number1 + " + " + number2 + "? ");
     
     int answer = input.nextInt();
     
     System.out.println(
       number1 + " + " + number2 + " = " + answer + " is " + 
       (number1 + number2 == answer));
     
     
     
  }
}
