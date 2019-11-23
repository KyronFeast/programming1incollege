
/**
 * Test program to construct rectangles.
 *
 * @author (Thomas j. Short)
 * @version (11/20/2019)
 * CIS 260
 * page 362 P.E 9.1
 */
public class TestRectangle {

    public static void main(String[] args) {

        // create an array for 2 Rectangles
        Rectangle[] Myrectangle = new Rectangle[2];
        // Assign first array values width4 height 40
        Myrectangle[0] = new Rectangle(4,40);
        // Assign first array values width3.5 height35.9
        Myrectangle[1] = new Rectangle(3.5, 35.9);
        // Display array objects
        for (int count = 0; count < 2; count++){
            System.out.println("TestRectangle" + (count+1) +":");
            System.out.println("Area = " + Myrectangle[count].getArea());
            System.out.println("Perimeter = " +  
            Myrectangle[count].getPerimeter() +"\n");
        }
    }
}