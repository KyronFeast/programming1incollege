import java.util.Scanner;
/*Thomas J. Short
 * Cis 260-01
 * 
 */
 
 
public class phoneKeypad 
{
 
 public static void main(String[] args) 
 {
  Scanner input = new Scanner(System.in);
  System.out.print("Enter a string: ");
  String userString1 = input.nextLine();
  String userString2 = "";
   
  for (int counter = 0; counter < userString1.length(); counter++) 
  {
    
   int number = getNumber(userString1.toUpperCase().charAt(counter));
   if (number !=0) 
   {
    userString2 = userString2 + number;
   }else {
    userString2 = userString2 + userString1.charAt(counter);
   }
    
  }
   
  System.out.println(userString2);
   
 
 }
 
 static int getNumber(char uppercaseLetter) {
 
  int n;
 
  switch (uppercaseLetter) {
  case 'A': n = 2;  break;
  case 'B': n = 2;  break;
  case 'C': n = 2;  break;
 
  case 'D': n = 3;  break;
  case 'E': n = 3;  break;
  case 'F': n = 3;  break;
  
  case 'G': n = 4;  break;
  case 'H': n = 4;  break;
  case 'I': n = 4;  break;
  
  case 'J': n = 5;  break;
  case 'K': n = 5;  break;
  case 'L': n = 5;  break;
  
  case 'M': n = 6;  break;
  case 'N': n = 6;  break;
  case 'O': n = 6;  break;
  
  case 'P': n = 7;  break;
  case 'Q': n = 7;  break;
  case 'R': n = 7;  break;
  case 'S': n = 7;  break;
  
  case 'T': n = 8;  break;
  case 'U': n = 8;  break;
  case 'V': n = 8;  break;
  
  case 'W': n = 9;  break;
  case 'X': n = 9;  break;
  case 'Y': n = 9;  break;
  case 'Z': n = 9;  break;
   
  default: n = 0;   break;
   
   
  }
 
  return n;
 }
 
}