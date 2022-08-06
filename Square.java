/**
 * Square class 
 * @author Eylul Badem
 * @version 01.03.2021
*/ 
public class Square extends Shape2D
{
    // properties
    int sideLength;
    
    // constructors
    
    public Square ( int x, int y, int sL )
    {
        super( x, y );
        this.sideLength = sL;
    }
    
    // methods
    
    /**
     * This method calculates the perimeter of this square
     * 
     * @return perimeter of this square
     */
    public double calculatePerimeter()
    {
        return 4.0 * ( sideLength );
    }
    
    /**
     * This method calculates the area of this square
     * 
     * @return area of this square
     */
    public double calculateArea()
    {
        return sideLength * sideLength;
    }
    
    @Override
    /**
     * This method returns a String which includes the current square's info
     * 
     * @return information x and y coordinates with side length for the current square as String
     */
    public String toString()
    {
        return super.toString() + " and side length=" + sideLength;
    }
    
    @Override
    /**
     * This method compares this shape with the wanted shape
     * @param o a shape to compare with this shape
     * @return true if the distance between shapes are zero and their side lengths are the same
     */
    public boolean equals( Object o )
    {
        if (o instanceof Square) {
            Square otherShape2d = (Square) o;
            
            if ( super.equals(o) && this.sideLength == otherShape2d.sideLength )
                return true;
            else
                return false;
        }
        else
            return false;
    }
}