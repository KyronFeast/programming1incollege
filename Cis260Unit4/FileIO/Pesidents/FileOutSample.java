///**********
// * File Input Sample - In Class Ex from Nov 20, 2019
import java.util.Scanner; 
import java.io.File;
import java.io.PrintWriter;


public class FileOutSample   {
 
  public static void main(String[] args) throws Exception {

    {
      // Get the selected file
      java.io.File file = new File("nov20.out");

      // Create a Scanner for the file
      PrintWriter output = new PrintWriter(file);
      
      String curLine;
      int lettercount = 40;
      for( int i = 0; i < lettercount; i++)
      {
          output.printf("line %d \n", i);
      }
        
     
      System.out.printf("Done \n" );

      // Close the file
      output.close();
    }

  }
}