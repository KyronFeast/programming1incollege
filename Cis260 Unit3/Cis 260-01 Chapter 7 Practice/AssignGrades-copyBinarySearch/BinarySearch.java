//create a class for binary search
public class BinarySearch
{
   /*Create a method of integer datatype that accepts the
  * parameters  integer array and int key*/ 
  public static int binarySearch(int[] list, int key)
  {
     //initialize an integer varable named low, set to 0
     int low = 0;
     //declare a variable integer high set it to end of the array
     int high = list.length -1;
     //create while loop that checks if high is greater than low
     while(high >= low)
     {
         // get mid using low + high / 2
         int mid = (low + high) / 2;
         if(key < list[mid])
         {
             high = mid -1;
         }
         else if (key == list[mid])
         {
             return mid;
         }
         else
         {
             low = mid +1;
         }
     }
     return -low -1;// now high < low
  }
  public static void main(String[] args)
  {
      int [] list = {-3, 1, 2, 4, 9, 23};
      System.out.println(binarySearch(list, 5));
  }
}





