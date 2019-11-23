import java.util.Scanner;
/**
 * This program allows the user to enter the number of students
 * then prompts the user to enter all of the scores. 
 * displays grades based on the best scores
 * @author (Thomas J. Short)
 * @version (11/04/2019)
 * Chapter 7 pg.278
 * Cis 260
 */
public class AssignGrades
{
    public static void main(String[] args)
    {
        //Create a Scanner Object
        Scanner input = new Scanner(System.in);
        //Prompt user and assign to an array
        System.out.print("Enter the number of students " );
        int numberOfStudents = input.nextInt();
        int[] studentScore = new int [numberOfStudents];
        //Prompt user to enter the students scores
        System.out.print(" Enter " + numberOfStudents + " Scores: ");
        //Declare variables to for letter grade and bestscore
        char lettergrade;
        int bestScore = 0;
        //Populate our list with user input and find the best grade
        for( int scorecount = 0; scorecount < studentScore.length; 
        scorecount++)
        {
            studentScore[scorecount] = input.nextInt();
            if(bestScore < studentScore[scorecount])
            {
                bestScore = studentScore[scorecount];
            }
        }
        // this cycles through our grades comparing them with the best 
        //grade we found earlier, then displays the grade.
        for(int displaygrade = 0; displaygrade < studentScore.length;
        displaygrade++)
        {
            if(studentScore[displaygrade] >= bestScore - 10)
            {
                lettergrade = 'A';
            }
            else if(studentScore[displaygrade] >= bestScore - 20)
            {
                lettergrade = 'B';
            }
            else if(studentScore[displaygrade] >= bestScore - 30)
            {
               lettergrade = 'C';
            }
            else if(studentScore[displaygrade] >= bestScore - 40)
            {
                lettergrade = 'D';
            }
            else
            {
                lettergrade = 'F';
            }
            System.out.println("Student " + displaygrade + " score is " +
            studentScore[displaygrade] + " and grade is " + lettergrade);
        }
    }
}
