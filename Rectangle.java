/**
 * Rectangle class
 * @author Eylul Badem
 * @version 01.03.2021
*/ 
public class Rectangle extends Shape2D
{
    // properties
    int height;
    int width;
    
    // constructors
    
    public Rectangle ( int x, int y, int h, int w )
    {
        super( x, y );
        this.height = h;
        this.width = w;
    }
    
    // methods
    
    /**
     * This method calculates the perimeter of this rectangle
     * 
     * @return perimeter of this rectangle
     */
    public double calculatePerimeter()
    {
        return 2.0*(width + height);
    }
    
    /**
     * This method calculates the area of this rectangle
     * 
     * @return area of this rectangle
     */
    public double calculateArea()
    {
        return width * height;
    }
    
    @Override
    /**
     * This method returns a String which includes the current rectangle's info
     * 
     * @return information x and y coordinates with height and width for the current rectangle as String
     */
    public String toString()
    {
        return super.toString() + ", height=" + height + " and width=" + width;
    }
    
    @Override
    /**
     * This method compares this shape with the wanted shape
     * @param o a shape to compare with this shape
     * @return true if the distance between shapes are zero and their edge lengths are the same 
     */
    public boolean equals( Object o )
    {
        if (o instanceof Rectangle) {
            Rectangle otherShape2d = (Rectangle) o;
            
            if ( super.equals(o) && this.width == otherShape2d.width && this.height == otherShape2d.height )
                return true;
            else
                return false;
        }
        else
            return false;
    } 
}