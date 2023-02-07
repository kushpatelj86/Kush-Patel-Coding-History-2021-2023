/**
 *<BR> Name:          Kush Patel
 *<BR> Date:          10-05-2021
 *<BR> Period:        2
 *<BR> Assignment:    ICT Lesson 4.2
 *<BR> Description:   In this assignment we will calculating the area and permiter of five rectangles
 *<BR> Cite Sources:  Mr.Elliot taught me how to write constructors and the websites I used are https://ap.mreliot.com/LessonA01/HA1_1DrawingTool.html 
 */

import java.awt.Color;		//For use of Color Objects
import gpdraw.*;

public class Rectangle
{
	//static means ONE SketchPad and ONE DrawingTool is shared among
	//all of the Rectangle objects you create.
	private static SketchPad MyPad = new SketchPad(500,500);
	private static DrawingTool MyPencil = new DrawingTool(MyPad);
	
	//private primitive values
	private double myX;				//upper-left corner of Rectangle
	private double myY;				//upper-left corner of Rectangle
	private double myWidth;			//width of Rectangle
	private double myHeight;		//height of Rectangle

	

	//constructors
	public Rectangle()
	{
		myX = 0.0;
		myY = 0.0;
		myWidth = 40.0;
		myHeight = 20.0;
	}
	public Rectangle(double x, double y, double width, double height)
	{
		myX = x;
		myY = y;
		myWidth = width;
		myHeight = height;
	}
	public Rectangle(Rectangle OtherRectangle)
	{
		myX = OtherRectangle.getMyX();
		myY = OtherRectangle.getMyY();
		myWidth = OtherRectangle.getMyWidth();
		myHeight = OtherRectangle.getMyHeight();
	}

	//mutator methods "change" or "do" things
	public double getPerimeter()
	{
		double myPerimeter;
		myPerimeter = (2 * myWidth) + (2 * myHeight);
		return myPerimeter;
	}
	public double getArea()
	{
		double myArea;
		myArea = (myWidth) * (myHeight);
		return myArea;
	}
	public void draw()
	{
		MyPencil.up();
		MyPencil.move(myX,myY);
        MyPencil.setDirection(0);
		MyPencil.setWidth(3);
		MyPencil.down();
		MyPencil.forward(myWidth);
		MyPencil.turnRight(90);
		MyPencil.forward(myHeight);
		MyPencil.turnRight(90);
		MyPencil.forward(myWidth);
		MyPencil.turnRight(90);
		MyPencil.forward(myHeight);
		MyPencil.up();
	}
	public void draw(Color MyColor)
	{
		MyPencil.setColor(MyColor);
		draw();
		MyPencil.setColor(Color.RED);
	} 
	
	//accessor methods "access" private values, nothing changes.
	//used by copy constructor to get info from "other" Rectangle
	public double getMyX()
	{
		return myX;
	}
	public double getMyY()
	{
		return myY;
	}
	public double getMyWidth()
	{
		return myWidth;
	}
	public double getMyHeight()
	{
		return myHeight;
	}
}














