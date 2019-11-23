import java.util.Scanner; 
import java.io.File;


public class FileInHardCodeName {
 
  public static void main(String[] args) throws Exception {

    {
      // Get the selected file
      java.io.File file = new File("simple.txt");

      // Create a Scanner for the file
      Scanner input = new Scanner(file);
      
      String curLine;
      int lettercount = 0;
      
      // Read text from the file
      while (input.hasNext()) {
          curLine = input.nextLine();
          
          lettercount += countLetters( curLine );
      }
      
      System.out.printf("The file %s contains %d letters\n", 
                                 file, lettercount);

      // Close the file
      input.close();
    }

  }
  static int countLetters(String s)
  {
      int ltrcount = 0;
      for (int i =0; i < s.length(); i++)
      {
          if ( Character.isLetter( s.charAt(i) ) )
              ltrcount++;
      } // end for
      return ltrcount;
  } 
}