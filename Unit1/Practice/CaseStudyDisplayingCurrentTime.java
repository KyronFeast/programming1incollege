
/**
 * Write a description of class CaseStudyDisplayingCurrentTime here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CaseStudyDisplayingCurrentTime
{
  public static void main(String[] args)
  {
    //obtain the total milliseconds since midnight january, 1, 1970
    long totalMilliseconds = System.currentTimeMillis();
    //System.out.println("total milliseconds " + totalMilliseconds);
    
    //divide totalMilliSeconds by 1000 to get the seconds
    long totalSeconds = totalMilliseconds / 1000;
    //System.out.println("total seconds is " + totalSeconds);
    
    //compute the current second by finding the remainder of totalSeconds
    long currentSecond = totalSeconds % 60;
    //System.out.println("The current second is " + currentSecond);
    
    //to calculate total minutes divide the totalSeconds by 60
    long totalMinutes = totalSeconds / 60;
    //System.out.println("The toatal minutes is " + totalMinutes);
    
    //to calculate current minute' take total minutes and find the remainder
    long currentMinute = totalMinutes % 60;
    //System.out.println("The current minute is " + currentMinute);
    
    /*
     *now we need to divide the toatl minutes by 60 to get the total hours
     *so we declare totalHours and assign it a long datatye and we assign
     *it totalMinute / 60
    */
    long totalHours = totalMinutes / 60;
    //System.out.println("The total hours is " + totalHours);
    
    // current hour is found by the remainder of the total hours 
    long currentHour = totalHours % 24;
    //System.out.println("the current hour is " + currentHour);
    
    //Disply the result in gmt(Greenwhich Mean Time) hour:minute:second 
    System.out.println("The current time is " + currentHour + ":" + currentMinute + ":" + currentSecond + "GMT");
     
   
    
  }
}
