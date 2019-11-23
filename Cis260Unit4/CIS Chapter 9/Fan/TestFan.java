/*This program allows us to create fan objects and
 * use accessor and mutator methods to change
 * speed, color radius and if the fan is on or off
 * Thomas J. Short
 * 11/20/2019
 * CIS 260
 * page 364  P.E. 9.8
   */
public class TestFan{

    public static void main(String[] args) {
        // Assign max spped set radius to ten
        //Set color to yellow and turn fan on
        Fan fan1 = new Fan();
        fan1.setSpeed(Fan.FAST);
        fan1.setRadius(10);
        fan1.setColor("YELLOW");
        fan1.setOn(true);
        //Assign fan to medium speed , set radius to 5,
        //set color to blue and turn fan off
        Fan fan2 = new Fan();
        fan2.setSpeed(Fan.MEDIUM);
        fan2.setRadius(5);
        fan2.setColor("BLUE");
        fan2.setOn(false);
        // Return description of fan 1 and fan 2
        System.out.println("Fan 1: "+fan1.toString());
        System.out.println("Fan 2: "+fan2.toString());
    }
}