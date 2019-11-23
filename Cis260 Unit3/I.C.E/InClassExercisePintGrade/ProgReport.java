import java.util.Scanner;
/** * Write a description of class ProgReport here. * 
 * @author (CIS260 Thomas J. Short) 
 * @version (20191023) */
public class ProgReport
{    
    public static void main(String[] args)
    {
        int numericscore;  
        String lettergrade;  
        String status;        
        //Get numeric score      
        numericscore = getScore();      
        // Calculate letter grade      
        lettergrade = determineGrade( numericscore ); 
        // Get grade status  
        status = getStatusMsg( lettergrade ); 
        // display message   
        System.out.printf("Student with a score of %d%% %s - %s\n",numericscore, 
        lettergrade, status);  
    }
    public static int getScore() 
    {  
        //Create a Scanner
        Scanner input = new Scanner(System.in);
        //Prompt user for input
        System.out.print("Enter your score");
        //read input and assign it an integer datatype
        int userinput = input.nextInt();
        //Return the user input to our main
        return userinput;
    }    
    public static String determineGrade( int num ) 
    {   
        if(num >= 92 )
        {
        return ("A");   
        }
        else if(num >= 90)
        {
        return ("A-");
        }
        else if(num >= 88)
        {
        return ("B+");
        }
        else if(num >= 82)
        {
        return ("B");
        }
        else if(num >= 80)
        {
        return ("B-");
        }
        else if(num >= 78)
        {
        return ("C+");
        }
        else if(num >= 72)
        {
        return ("C");
        }
        else if(num >= 70)
        {
        return ("C-");
        }
        else if(num >= 68)
        {
        return ("D+") ;
        }
        else if(num >= 62)
        {
        return ("D");
        }
        else if(num >= 60)
        {
        return ("D-") ;
        }
        else if(num >= 59)
        {
        return ("E");
        }
        else
        {
        return ( "F " + num );   
        }   
    }
    public static String getStatusMsg( String s ) 
    {  
        switch(s)
        {
        case "A": return ("honors"); 
        case "A-":
        case "B+":
        case "B":
        case "B-":
        case "C+":
        case "C": 
        case "C-": return ("Passing"); 
        case "D+":
        case "D":
        case "D-": return ("Non-transferable, contact the tutoring center"); 
        case "E": return ("Failing, contact an advisor break"); 
        }
        return ( "Thats all folks!");  
    }
    /*public static String getStatusMsg(String s)
    {
       if(s == "A")
       {
           return ("honors");
       }
       else if(s == "A-" || s == "B+" || s == "B" || s == "B-" || s == "C+" || s == "C"
       || s == "C-")
       {
           return ("passing"); 
       }
       else if(s == "D+" || s == "D" || s == "D-" )
           return ("Non-tranferable, contact the tutoring center");
       else
       {
           return ("Thats all folks");
       }
    }*/
}
  

