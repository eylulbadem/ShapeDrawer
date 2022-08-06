/**
 * Circle class 
 * @author Eylul Badem
 * @version 01.03.2021
*/ 
public class Circle extends Shape2D
{
    // properties
    double radius;
    
    // constructors
    
    public Circle ( int x, int y, double r )
    {
        super( x, y );
        this.radius = r;
    }
    
    // methods
    
    /**
     * This method calculates the perimeter of this circle
     * 
     * @return perimeter of this circle
     */
    public double calculatePerimeter()
    {
        return Math.PI * 2.0 * radius;
    }
    
    /**
     * This method calculates the area of this circle
     * 
     * @return area of this circle
     */
    public double calculateArea()
    {
        return Math.PI * radius * radius;
    }
    
    @Override
    /**
     * This method returns a String which includes the current square's info
     * 
     * @return information x and y coordinates with radius for the current circle as String
     */
    public String toString()
    {
        return super.toString() + " and radius=" + radius;
    }
    
    @Override
    /**
     * This method compares this shape with the wanted shape
     * @param o a shape to compare with this shape
     * @return true if the distance between shapes are zero and their radius are the same 
     */
    public boolean equals( Object o )
    {
        if (o instanceof Circle) {
            Circle otherShape2d = (Circle) o;
            
            if ( super.equals(o) && this.radius == otherShape2d.radius )
                return true;
            else
                return false;
        }
        else
            return false;   
    }
}
