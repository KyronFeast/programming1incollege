/*This program is the blueprint to create a fan. 
 * we set defaults and creat method to let the
 * user make only the changes we allow by creating accessor and 
 * mutator methods
 * Thomas J. Short
 * 11/20/2019
 * CIS 260
 * page 364  P.E 9.8
   */
public class Fan 
{
    // declare three Constants to denote fan speed
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;
    //four privet datafields speed, on/off, radius, color
    private int fanSpeed;
    private boolean fanOn;
    private double fanRadius;
    private String fanColor;
    // Set defaults
    public Fan() 
    {
        fanSpeed = 1;
        fanRadius = 5;
        fanColor = "blue";
    }
    //Accessor and Mutator methods for all four data fields
    public int getSpeed() 
    {
        return fanSpeed;
    }
    public void setSpeed(int speed)
    {
        fanSpeed = speed;
    }
    
    public boolean isOn() 
    {
        return fanOn;
    }
    public void setOn(boolean on) 
    {
        fanOn = on;
    }

    public double getRadius() 
    {
        return fanRadius;
    }
    public void setRadius(double radius) 
    {
        fanRadius = radius;
    }

    public String getColor() 
    {
        return fanColor;
    }
    public void setColor(String color) 
    {
        fanColor = color;
    }
    //return String Description
    public String toString() 
    {
        if (isOn()) 
        {
            return "Speed: " + getSpeed() + " Color: " 
            + getColor() + " Radius: " + getRadius();
        } 
        else 
        {
            return "Color: " + getColor() + " Radius: " 
            + getRadius() + ". The fan is OFF.";
        }
    }

}