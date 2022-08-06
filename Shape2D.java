/**
 * Shape2D class
 * @author Eylul Badem
 * @version 01.03.2021
*/ 
public abstract class Shape2D
{
    // properties
    int x;
    int y;
    
    // constructor 
    public Shape2D ( int xCoord, int yCoord )
    {
        this.x = xCoord;
        this.y = yCoord;
    }
    
    // methods
    public abstract double calculatePerimeter();
    
    public abstract double calculateArea();
    
    /**
     * This method evaluates the polynomial at x and returns the result
     * @param anyShape a shape to compare with this shape
     * @return the result of evalutaion
     */
    public double calculateDistance( Object anyShape )
    {
        if ( anyShape instanceof Shape2D )
        {
            Shape2D o = (Shape2D) anyShape;
            return Math.sqrt((o.x - x) * (o.x - x) + (o.y - y) * (o.y - y));
        }
        else
            return -1;
    }
    
    @Override
    /**
     * This method evaluates the polynomial at x and returns the result
     * @param 
     * 
     */
    public String toString()
    {
        return "x=" + x + ", y=" + y;
    }
    
    @Override
    /**
     * This method compares this shape with the wanted shape
     * @param o a shape to compare with this shape
     * @return true if the distance between shapes are zero
     */
    public boolean equals( Object o )
    {
        if (o instanceof Shape2D) {
            
            if ( this.calculateDistance(o) == 0 )
                return true;
            else
                return false;
        }
        else
            return false;
    }
}