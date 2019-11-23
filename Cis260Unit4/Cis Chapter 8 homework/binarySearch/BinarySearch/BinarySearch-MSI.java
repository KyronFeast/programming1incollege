 1  public class BinarySearch {
  2    /** Use binary search to find the key in the list */
  3    public static int binarySearch(int[] list, int key) {
  4      int low = 0;
  5      int high = list.length - 1;
  6  
  7      while (high >= low) {
  8        int mid = (low + high) / 2;
  9        if (key < list[mid])
 10          high = mid - 1;
 11        else if (key == list[mid])
 12          return mid;
 13        else
 14          low = mid + 1;
 15      }
 16  
 17      return -low - 1; // Now high < low
 18    }
 19  
 20    public static void main(String[] args) {
 21      int[] list = {-3, 1, 2, 4, 9, 23};
 22      System.out.println(binarySearch(list, 
2
));
 23    }
 24  }