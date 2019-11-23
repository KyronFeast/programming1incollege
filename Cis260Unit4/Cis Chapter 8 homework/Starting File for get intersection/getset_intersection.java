
/**
 * TestIntersection - Sample code for the "Get Set" project
 * 
 * @author (Mr. Collard + your name) 
 * @version (FA2018)
 */
public class getset_intersection
{
    public static void main(String[] args)
    {
        int[] teens = { 13, 17, 14, 18, 15, 16, 19 };

        
        int[] setA = getUserSet();
        int[] setB = getUserSet();
        
        printIntersection( setA, setB );

        System.out.println("Done Testing");
    }

    /* get user set
     * 
     */
    
    static int[] getUserSet()
    {
        int[] primes = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31 };
        
        return primes;
    }
    /**
     * printIntersection - YOU write it
     * 
     * @param  listA, listB  - 2 sets (arrays) of integers
     */
    static void printIntersection( int listA[], int listB[] )
    {
        // put your code here
        System.out.println("printIntersection called");
    }
}
