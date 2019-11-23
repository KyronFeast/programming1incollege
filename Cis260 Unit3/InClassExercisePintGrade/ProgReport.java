import java.util.Scanner;
/** * Write a description of class ProgReport here. * 
 * @author (CIS260) 
 * @version (20191023) */
public class ProgReport
{    
    public static void main(String args[])
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
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your score");
        int userinput = input.nextInt();
        return userinput;
    }    
    public static String determineGrade( int num ) 
    {   //Create Scanner
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();  
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
        else if(num >= 88)
        {
        return ("E ");
        }
        else
        {
        return ( "F " + num );   
        }   
    }
    public static String getStatusMsg( String s ) 
    {  
        Scanner input = new Scanner(System.in);
        String status = input.nextLine();
        status = status.toLowerCase();
        switch(s)
        {
        case "a": return ("honors"); break;
        case "a-":
        case "b+":
        case "b":
        case "b-":
        case "c+":
        case "c":
        case "c-": return ("Passing"); break;
        case "d+":
        case "d":
        case "d-": return ("Non-transferable, contact the tutoring center"); break;
        case "E": return ("Failing, contact an advisor break"); break;
        }
        return ( "Thats all folks!");   
    }
}
