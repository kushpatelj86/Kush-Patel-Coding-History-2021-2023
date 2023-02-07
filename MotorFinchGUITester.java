/**
 *<BR> Name:          First Last
 *<BR> Date:          0-00-0000
 *<BR> Period:        0
 *<BR> Assignment:    Lesson00
 *<BR> Description:   In a sentence, what does this code do?
 *<BR> Cite Sources:  Everyone who helped, and/or websites used
 *<BR> Cite Sources:  Cay Horstmann		http://www.horstmann.com/gridworld/extending-gridworld.html
 *<BR> Cite Sources:  Mr. Eliot			05-12-2012, 05-24-2019, 05-19-2022
 */

import info.gridworld.actor.Actor;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.Location;
import java.awt.Color;

//SAMPLE TESTER, CHANGE AS NEEDED:
//This example loads "arrow" and "stop" images into GridWorld.  These
//images can then be CLICKED on, and code can be written to make the finch
//move based on which square is clicked.
//
//IMAGE REQUIREMENTS:
//(1)  Images must be GIF images.
//(2)  Images should be named such as "FinchControl_forward.gif"
//(3)  When FinchControl objects are constructed, send the suffix
//     to the constructor (EX:  "forward") so the object knows what 
//     type of control it is!!
public class MotorFinchGUITester
{
    public static void main(String[] args)
    {
		BoundedGrid<Actor> grid = new BoundedGrid<Actor>(3, 3);
        FinchGUI controller = new FinchGUI(grid);
		
		//Adds FinchControl images to GridWorld and sets the image color
        controller.add(new Location(0, 1), new FinchControl("forward", Color.green));
        controller.add(new Location(1, 0), new FinchControl("left", Color.green));
		controller.add(new Location(1, 1), new FinchControl("stop", Color.red));
		controller.add(new Location(1, 2), new FinchControl("right", Color.green));
        controller.add(new Location(2, 1), new FinchControl("backward", new Color(0,255,0)));	//green!
        controller.add(new Location(0, 0), new FinchControl("tap", Color.black));
        controller.add(new Location(2, 0), new FinchControl("honk", Color.yellow));
        controller.add(new Location(0, 2), new FinchControl("lightemotes",Color.yellow));
        controller.add(new Location(2, 2), new FinchControl("zigzag", Color.black));

        controller.show();
    }
}

/**
RUN OUTPUT:

*/