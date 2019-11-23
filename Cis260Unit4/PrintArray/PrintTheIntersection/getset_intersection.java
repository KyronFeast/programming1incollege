import java.util.Scanner;
/** * TestIntersection - Sample code for the "Get Set" project * 
   * @author (Mr. Collard + your name)
   * @version (FA2018) */
   public class getset_intersection
   {
      
      public static void main(String[] args)
      { 
          int lineup = 0; 
          int answerList;    
          int[] setA = getUserSet();       
          int[] setB = getUserSet();    
          printIntersection( setA, setB );   
          System.out.println(lineup + " ");   
      }   
      /* get user set  */ 
      static int[] getUserSet()   
      {  
          Scanner input = new Scanner(System.in);
          System.out.print("How many players on your team ");
          
          int jerseyNumber = input.nextInt();
          
          int[] lineup = new int [jerseyNumber];
          System.out.print("Enter" + jerseyNumber + " Jersey numbers ");
          for (int populatelineup = 0; populatelineup < lineup.length; populatelineup++)
          {
              lineup[populatelineup] = input.nextInt(); 
          }
          
          return lineup;
      }  
      /**     * printIntersection - YOU write it     *   
      * @param  listA, listB  - 2 sets (arrays) of integers     */ 
      static int[]  printIntersection( int listA[], int listB[] )  
      {        // put your code here     
          
    
       int answerList[]  = new int[Math.min(listA.length, listB.length)];
       int answerIndex = 0;
       for(int i = 0; i < listA.length; i++)
       {
           int checkNum = listA[i]; 
           for(int j = 0; j < listB.length; j++)
           {
             if(listB[j] == checkNum)
             {
                answerList[answerIndex] = checkNum;
                answerIndex++;
             }
           }
           
       }
        return answerList;
      }
}