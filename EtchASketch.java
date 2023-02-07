/** 
 * @student.info 
 *<BR> Name:          First Last
 *<BR> Date:          0-00-0000
 *<BR> Period:        0
 *<BR> Assignment:    EtchASketch Finch
 *<BR> Description:   the EtchASketch class deals with drawing each pixel on screen
 *<BR> Cite Sources:  Student EtchASketch.java by Mr. Eliot
 */

import com.birdbraintechnologies.Finch;
import info.gridworld.actor.Actor;
import info.gridworld.actor.Bug;
import info.gridworld.grid.Location;
import info.gridworld.grid.Grid;
import java.awt.Color;

public class EtchASketch extends Bug
{
	//Create a PRIVATE copy of the static Finch sent from main() to the constructor
	private Finch MyFinch;
	
	//IMPORTANT:  We don't want all of the pixels creating more pixels,
	//so we create a STATIC value shared by all pixels drawn so far.
	//Only the LATEST pixel can draw a new pixel...
	private static Location MyLocation;
	
	//number which tracks which of the 6 or more colors will be used
	private int myColor;
	
    public EtchASketch(Location Loc, Finch AFinch, int color)
    {
		MyLocation = Loc;
		MyFinch = AFinch;
		//pre-increment color by one, there are other ways to change color values.
		//you might modify this if you want to do color changes differently!!
		myColor = ++color;
		setColor();
    }

    public void act()
    {
		if (canDraw())
		{
            draw();
        }
    }
	
	//draw the next pixel at the newest location
    public void draw()
    {
        Grid<Actor> MyGrid = getGrid();
        if (MyGrid == null)
		{
            return;
		}
		
        Location Next = getNextLocation();
        EtchASketch NextPixel = new EtchASketch(Next, MyFinch, myColor);
        NextPixel.putSelfInGrid(MyGrid, Next);
    }

	//Amongst other things, determines if THIS object is allowed to draw
    public boolean canDraw()
    { 
        Grid<Actor> MyGrid = getGrid();
        if (MyGrid == null)
		{
            return false;
		}
		
		//PROBLEM:  
		//There are lots of pixels on the drawing, and all of them will TRY to draw more pixels.
		//If every pixel could draw more pixels, the grid would quickly fill and make a big mess.
		//To solve this problem, we have created a GLOBAL STATIC variable called "MyLocation".  It is declared
		//above as "private static Location MyLocation;".  Since it is STATIC, all pixels share this value.
		//Every time a NEW pixel is created, "MyLocation" is set to the location of that NEW pixel.  That way,
		//WE ALWAYS KNOW THE LOCATION OF THE LATEST PIXEL CREATED!!
		//
		//SOLUTION:  
		//We only want the LATEST PIXEL to be able to draw more pixels.  So we have every pixel
		//check it's location using the Actor class getLocation() method, and see if it is the latest pixel.
		//If this is the latest pixel, then it is allowed to draw.  If it is NOT the latest pixel, then it is 
		//not allowed to draw. This canDraw() method determines if a pixel is allowed to draw by returning
		//a boolean.  TRUE if the pixel is allowed to draw, FALSE if the pixel is not allowed to draw.
		//
		//DIRECTIONS:
		//Check the Gridworld API for the Actor class .getLocation() method.
		//Write code here that sees if "MyLocation" of the LATEST pixel is NOT EQUAL TO "getLocation()" 
		//for THIS pixel. Remember that Locations are Objects and not primitives!
		//If THIS pixel is NOT at the LATEST pixel location, return FALSE and leave this method!
		
		
		
		//****COMPLETE THIS MISSING CODE****
		//****COMPLETE THIS MISSING CODE****
		//****COMPLETE THIS MISSING CODE****
		//****COMPLETE THIS MISSING CODE****
		
		
	
		//DO NOT MOVE:  it is VERY important that .getNextLocation() happens last
		//otherwise, ALL drawn pixels will run getNextLocation() method and the drawing
		//will become slower and slower...  
		//This happens because too many checks of X and Y acceleration will happen,
		//bogging down the program.
		Location Next = getNextLocation();
        if (! MyGrid.isValid(Next))
		{
            return false;
		}
		
		return true;
    }
	
	//must write this method to use the Finch acceleration to determine which
	//way to move.  Beak up means up, beak down means down,  left wing down
	//means left, right wing down means right.  Combinations should be diagonals.
	//Move to one of 8 adjacent locations directly around this square, or stay put.
	private Location getNextLocation()
	{
		//NOTE:  These two lines use the Finch .getXAcceleration() and .getYAcceleration() methods!
		//READ THE API and learn what the range for these double values are.  If you don't
		//understand how these methods work, you won't be able to write the code below...
		double yAccel = MyFinch.getXAcceleration();
		double xAccel = MyFinch.getYAcceleration();
		//Create a Location object to set the NEW (next) Location!
		Location Next = null;
		
		//DIRECTIONS:  Write an IF STATEMENT below that, based on the X and Y accelerations,
		//gets the NEXT location.  There are EIGHT possible Location squares around this grid pixel.
		//There are NINE possible moves, including "don't move at all".  So if the 
		//Finch were level, then you should stay in the same place.  If you start turning
		//The Finch Up, Down, Left, Right, Up-Left, Up-Right, Down-Left, or Down-Right
		//then this method returns the Location in that direction.
		//
		//To find the new Location, use the Location class ".getAdjacentLocation(angle);" method.
		//This method, if you give it an angle as a parameter, will tell you the adjacent Location object in 
		//that direction.  So if I said "MyLocation.getAdjacentLocation(0);", it would tell me 
		//The Location directly above my current location. Use angles like 0, 45, 90, 135, 180, etc...
		
		
	
		//****COMPLETE THIS MISSING CODE****
		//****COMPLETE THIS MISSING CODE****
		//****COMPLETE THIS MISSING CODE****
		//****COMPLETE THIS MISSING CODE****		
		
		
		
		//NOTE:  This method returns the NEW (next) Location.  It could be any of the eight squares around
		//this one on the Grid, or even the SAME LOCATION if the Finch is "level".
		//HINT: It is important that this square that you return here is ON the grid!
		//HINT: This code MAY NOT always work.  It may go off grid sometimes and crash.
		//HINT: You might have to ADD CODE here to deal with this issue.
		
		return Next;
	}
	
	//set the color of this square in the grid to one of at least 6 different colors.
	//could be rainbow colors in order, shades of blue, shades of gray, etc.
	//importantly, colors must stand out from the grid background color!
	private void setColor()
	{
		//DIRECTIONS:  Check the global "myColor" int value.  Based on that int value, use
		//the **PARENT CLASS** .setColor() method to set the color (ex:  Color.RED, Color.MAGENTA, etc.).
		//You might also need to "reset" the color back to zero (0) once you reach your last color.
		//That way, the colors will "cycle" correctly.
		
		
		
		//****COMPLETE THIS MISSING CODE****
		//****COMPLETE THIS MISSING CODE****
		//****COMPLETE THIS MISSING CODE****
		//****COMPLETE THIS MISSING CODE****
		
		
		
	}
}
