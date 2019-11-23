import java.util.Scanner;
/* This program gets two stes from the user 
 * then decide if they are identical or not
 * Programming exercise 7.27  pg 283
 * Thomas J. Short 
 * 11/12/2019
 * CIS 260  */ 
public class IdenticalArrarys
{
   public static void main(String[] args) 
  {
     //Creats Scanner and ask user for
     //list one and populate list
     Scanner input = new Scanner(System.in);
     System.out.print("Enter list1:");
     int[] list1 = new int[input.nextInt()];
     for (int populatelist = 0; populatelist < list1.length;
     populatelist++) 
     {
         list1[populatelist] = input.nextInt();
     }
     //Ask user for second list and populate it
     System.out.print("Enter list2:");
     int[] list2 = new int[input.nextInt()];
     for (int populatelist2 = 0; populatelist2 < list2.length;
     populatelist2++) 
     {
         list2[populatelist2] = input.nextInt();
     }
     // call equals method If true lists are
     //identical otherwise they are not
     if(equals(list1, list2)) 
     {
         System.out.println("The Two lists are identical");
     }
     else 
     {
         System.out.println("The Two lists are not identical");
     }
  }
  // method to see if the lists are identical 
  public static boolean equals(int[] list1, int[] list2)
  {
     // if the lists are not equal in length return false 
     //otherwise call selection sort to sort both lists  
     if(list1.length != list2.length) 
     {
        return false;
     }
     //Use array class to sort our list
     java.util.Arrays.sort(list1);
     java.util.Arrays.sort(list2);
     //After lists are sorted check to see if the 
     //elements are the same if not return false 
     //otherwise true 
     for (int i = 0; i < list2.length; i++) 
     {
        if (list1[i] != list2[i])
        {
            return false;
        }
     }
     return true;
  }
}   