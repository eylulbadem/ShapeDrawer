/**
 * ShapeTest
 * @author Eylul Badem
 * @version 01.03.2021
*/ 
public class ShapeTest
{
    public static void main(String[] args)
    {
        // variables
        Circle circle = new Circle (13, 15, 3.0);
        Rectangle rectangle = new Rectangle ( 2, 3, 8, 15);
        Square square = new Square ( -2, -5, 5);
        Square square2 = new Square ( -2, -5, 5);
        Square square3 = new Square ( -1, -5, 5);
        Square square4 = null;
        Shape2D[] shapes = { circle, rectangle, square };
        
        // program code
        System.out.println();
        System.out.println( "First shape is a circle with " + circle.toString() );
        System.out.println( "Second shape is a rectangle with " + rectangle.toString() );
        System.out.println( "Third shape is a square with " + square.toString() );
        System.out.println( "--------------------------------------" );
        System.out.println( square.equals( square2 ) );
        System.out.println( square.equals( square3 ) );
        System.out.println( square.equals( square4 ) );
        System.out.println( square.equals( circle ) );
        System.out.println( "--------------------------------------" );
        System.out.println( "The shape with the largest area is the " + typeFinder( findLargestArea( shapes ) ) );
        System.out.println( "The shape with the longest perimeter is the " + typeFinder( findLongestPerimeter( shapes ) ) );
        System.out.println( "--------------------------------------" );
        System.out.println( "Distance between the circle and the rectangle is: " + circle.calculateDistance( rectangle ) );
        System.out.println( "Distance between the rectangle and the square is: " + rectangle.calculateDistance( square ));
        System.out.println( "Distance between the square and the circle is: " + square.calculateDistance( circle ));
        
    }
    
    // methods
    
    /**
     * This method finds the shape with the largest area in an array
     * @param array array of shapes 
     * @return the shape with the largest area
     */
    public static Shape2D findLargestArea( Shape2D[] array )
        {
            double max = 0;
            Shape2D shapeWithMaxArea = new Circle ( 1, 2, 3 );
            Shape2D currentShape;
            for ( int i = 0; i < array.length; i++)
            {
                currentShape = array[i];

                if ( currentShape.calculateArea() > max )
                {
                    max = currentShape.calculateArea();
                    shapeWithMaxArea = currentShape;
                }
            }
            return shapeWithMaxArea;
        }
        
        /**
        * This method finds the shape with the longest perimeter in an array
        * @param array array of shapes 
        * @return the shape with the longest perimeter
        */
        public static Shape2D findLongestPerimeter( Shape2D[] array )
        {
            double max = 0;
            Shape2D shapeWithMaxPeri = new Circle ( 1, 2, 3 );;
            Shape2D currentShape;
            for ( int i = 0; i < array.length; i++)
            {
                currentShape = array[i];

                if ( currentShape.calculatePerimeter() > max )
                {
                    max = currentShape.calculatePerimeter();
                    shapeWithMaxPeri = currentShape;
                }
            }
            return shapeWithMaxPeri;
        }
        
        /**
        * This method finds the type of any wanted shape
        * @param shape shape  the user wants to find type of
        * @return the type
        */
        public static String typeFinder ( Shape2D shape )
        {
            String type = "";
            if ( shape instanceof Circle )
                type = "Circle";
            else if ( shape instanceof Rectangle )
                type = "Rectangle";
            else if ( shape instanceof Square )
                type = "Square";

            return type;
        }
}