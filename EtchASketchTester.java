/** 
 *<BR> Name:          First Last
 *<BR> Date:          0-00-0000
 *<BR> Period:        0
 *<BR> Assignment:    EtchASketch Finch
 *<BR> Description:   In a sentence, what does this code do?
 *<BR> Cite Sources:  Everyone who helped, and/or websites used
 *<BR> Cite Sources:  Student EtchASketchTester.java by Mr. Eliot
 */

import com.birdbraintechnologies.Finch;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Actor;
import info.gridworld.grid.Location;
import info.gridworld.grid.Grid;
import info.gridworld.grid.BoundedGrid;

//Tester creates a 40 row, 80 column drawing area.  
//This can be increased by student.
public class EtchASketchTester
{
	//Finch must be static since ONE Finch is shared by all pixels!!
	private static Finch MyFinch = new Finch();
	
    public static void main(String[] args)
    {
		int rows = 40;
		int cols = 80;
		Location Loc = new Location(rows / 2, cols / 2);	//integer division!
        BoundedGrid<Actor> MyGrid = new BoundedGrid<Actor>(rows, cols);
        ActorWorld World = new ActorWorld(MyGrid);
		
		World.add(Loc, new EtchASketch(Loc, MyFinch, 0)); 
		
        World.show();
    }
}