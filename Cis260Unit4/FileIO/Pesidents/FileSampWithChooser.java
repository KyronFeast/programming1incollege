///**********
// * File Input Sample - In Class Ex from Nov 20, 2019
import java.util.Scanner; 
import javax.swing.JFileChooser;

public class FileSampWithChooser {
 
  public static void main(String[] args) throws Exception {
      
    JFileChooser fileChooser = new JFileChooser();
    if (fileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) 
    {
      // Get the selected file
      java.io.File file = fileChooser.getSelectedFile();

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
    else {
      System.out.println("No file selected");
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