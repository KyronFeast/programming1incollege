/*This is the blueprint program for creating a rectangle
 * Thomas J. Short
 * 11/20/2019
 * CIS 260
 * page. 362 P.E 9.1
   */
public class Rectangle {
    // declare two double datafields for width and height
    private double width;
    private double height;
    // no arg constuctor for default rectangle
    public Rectangle() {
        this.width = 1.0;
        this.height = 1.0;
    }
    // constructor for a rectangle of specified width and height
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    /* return area of this rectangle */
    public double getArea() {
        return this.width * this.height;
    }
    /* return perimeter of this rectangle */
    public double getPerimeter() {
        return this.width * 2 + this.height * 2;
    }

}