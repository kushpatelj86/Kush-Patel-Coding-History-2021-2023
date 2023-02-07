/**
 *<BR> Name:          Kush Patel
 *<BR> Date:          10-18-2021
 *<BR> Period:        2
 *<BR> Assignment:    ICT Lesson 6.2
 *<BR> Description:   We will be calculating the number of sides, side length, width, height, area, perimeter, inscribed radius, and circumscribed radius on a polygon.
 *<BR> Cite Sources:  Mr Elliot taught me what I was doing wrong and helped me fix my errors. Websites I used:https://ap.mreliot.com/LessonA06/Lab-A6-2.html
 */

 /**
 * class RegularPolygon - a class used to demonstrate
 * the construction of a class including
 * constructors, methods, and instance variables
 * @author Kush Patel
 * @version 1.1
 */

public class RegularPolygon
{
	//Private INSTANCE VARIABLES
	// Tells us the number of sides there are
    
    /**
	* <b>summary</b>: A list of all private instance variables  
	* As part of that process, this method initalizes all "global"
	* private variables in the class.  
	* myNumSides = tells us the number of sides in a polygon
    * mySideLength = tells us the length of each side of the polygon
    * myR = gives us the radius of the circumscribed circle
    * myr =  gives us the radius of the inscribed circle
	*/     
    
    /**
    * <b>summary</b>: counts the number of sides  
	* As part of that process, this method initalizes all "global"
	* private variables in the class.  
    */ 
    private double myNumSides;    // # sides, "double" avoids typecasting in formulas
    //Tells us the side length

    /**
    * <b>summary</b>: tells us the length of each side  
	* As part of that process, this method initalizes all "global"
	* private variables in the class.  
    */ 
	private double mySideLength;  // length of each side
    ///Tells us the radius of the circumscribed circle

    /**
    * <b>summary</b>: tells us the circumscribed radius of each polygon  
	* As part of that process, this method initalizes all "global"
	* private variables in the class.  
    */ 
	private double myR;           // radius of circumscribed (outside) circle
    ///Tells us the radius of the inscribed circle

    /**
    * <b>summary</b>: tells us the inscribed radius of each polygon  
	* As part of that process, this method initalizes all "global"
	* private variables in the class.  
    */ 
	private double myr;           // radius of inscribed (inside) circle

	//Public CONSTRUCTOR methods
	// constructor
	/**
	* <b>summary</b>: default RegularPolygon constructor - creates a RegularPolygon object.  
	* As part of that process, this method initalizes all "global"
	* private values in the class.
	*/ 
    public RegularPolygon()
    {
        myNumSides = 3.0;
        mySideLength = 7.0;
        myR = calcR();
        myr = calcr();
    }

    /**
	* <b>summary</b>: Normal RegularPolygon constructor with arguments - creates a RegularPolygon object.  
	* As part of that process, this method initalizes all "global"
	* private values in the class.  Tester program supplies these parameters.
	* @param numSides -- Number of sides listed for a specific polygon
	* @param sideLength -- The length of each side for that polygon
	*/     
    public RegularPolygon(int numSides, double sideLength)
    {
        myNumSides = numSides;
        mySideLength = sideLength;
        myR = calcR();
        myr = calcr();
    }
	/**
	* <b>summary</b>: Normal RegularPolygon constructor with  a argument that is used as a copy constructor and gets the same data from other constructors - creates a RegularPolygon object.  
	* As part of that process, this method initalizes all "global"
	* private values in the class.  Tester program supplies these parameters.
	* @param OtherPolygon -- It creates a new object for the copy constructor 
	*/     
    public RegularPolygon(RegularPolygon OtherPolygon)
    {
        myNumSides = OtherPolygon.getNumSides();
        mySideLength = OtherPolygon.getSideLength();
        myR = OtherPolygon.getR();
        myr = OtherPolygon.getr();
    }
	
	//Private HELPER methods, help other public methods

    /**
	* <b>summary</b>: provides a method for calculating the circumscribed circle radius and inscribed circle radius -
	* this updates print polygon and 
	* modifies the myR and myr objects
	*/  
	
    /**
	* <b>summary</b>: Provides and calculate the radius of each circumscribed circle
    * the method myR calculates the the radius of each circumscribed circle
    * modifies the myR object
    * updates the circumsbirbed circle radius
	* @return myR gives us the circumsbribed circle radius of the polygon 
	*/
    private double calcR()
    {
        double myR;
        myR = (0.5) * mySideLength * ((1 / Math.sin(Math.PI / myNumSides)));
        return myR;
    }
    /**
	* <b>summary</b>: Provides and calculate the radius of each inscribed circle
    * the method myr calculates the the radius of each inscribed circle
    * modifies the myr object
    * updates the inscribed circle radius
	* @return myr gives us the inscribed circle radius of the polygon 
	*/
	private double calcr()
    {
        double myr;
        myr = (0.5) * mySideLength * ((1 / Math.tan((Math.PI) / myNumSides)));
        return myr;
    }

	//Public MUTATOR methods

    /**
	* <b>summary</b>: provides the angle of the vertex for each polygon
    * the method myAngle calculates the value of the angle
	* @return myAngle the vertex of the polygon
	*/
	public double vertexAngle()
    {
        double myAngle;
        myAngle = ((myNumSides - 2) / myNumSides) * 180;
        return myAngle;
    }

    /**
	* <b>summary</b>: provides the perimeter of each polygon
    * the method myPerimeter calculates the perimeter of the polygon
	* @return myPerimeter gives us the perimeter of the polygon 
	*/
	public double perimeter()
    {
        double myPerimeter;
        myPerimeter = (myNumSides) * (mySideLength);
        return myPerimeter;
    }
	
    /**
	* <b>summary</b>: provides the area of each polygon
    * the method myArea calculaates the area of the polygon
	* @return myArea gives us the area of the polygon 
	*/
    public double area()
    {
        double myArea;
        myArea = (0.5) * (myNumSides) * (myR) * (myR) * Math.sin((2 * Math.PI) / myNumSides);
        return myArea;
    }
		
	//Public ACCESSOR methods

    /**
	* <b>summary</b>: provides the number of sides of each polygon
    * the method getNumSides() gets the number of sides each polygon has
	* @return (int) myNumSides gives us the number of sides each polygon has
	*/
	public int getNumSides()
    {
        return (int) myNumSides;
    }

    /**
	* <b>summary</b>: provides the side length of each polygon
    * the method getSideLength() gets the length of each side the polygon has
	* @return mySideLength gives us the length of each side the polygon has
	*/
	public double getSideLength()
    {
        return mySideLength;
    }
	
    /**
	* <b>summary</b>: provides the circumsbribed circle radius of each polygon
    * the method getR() gets the circumscribed radius of the polygon
	* @return myR gives us the circumscribed radius of the polygon
	*/
    public double getR()
    {
        return myR;
    }

    /**
	* <b>summary</b>: provides the inscribed circle radius of each polygon
    * the method getr() gets the inscribed radius of the polygon
	* @return myr gives us the inscribed radius of the polygon
	*/
	public double getr()
    {
        return myr;
    }
	
	//Public print method, makes the tester shorter by having a built in print method

    /**
	* <b>summary</b>: provides the characteristics of each polygon-
	* It gets all the number of sides, the length of each side, the vertex angle, the radius of the circumscribed cicle, the radius of the inscribed circle, the area and perimeter of the perimeter
	* It makes the tester shorter
    */
	public void printPolygon()
    {
        System.out.println("The number of sides(n) are " + (int) myNumSides);
        System.out.printf("The side length(s) is %.2f", mySideLength);
        System.out.print(" units");
        System.out.println();
        System.out.printf("The vertex is %.2f", vertexAngle());
        System.out.print((char) 176);
        System.out.println();
        System.out.printf("The circumscribed circle radius (R) is %.2f", myR);
        System.out.print(" units");
        System.out.println();
        System.out.printf("The inscribed circle radius (r) is %.2f", myr);
        System.out.print(" units");
        System.out.println();
        System.out.printf("The perimeter is %.2f", perimeter());
        System.out.print(" units");
        System.out.println();
        System.out.printf("The area is %.2f", area());
        System.out.print(" units^2");
        System.out.println();
        System.out.println();
        System.out.println();
    }
}