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

import com.birdbraintechnologies.Finch;
import info.gridworld.actor.Actor;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;
import info.gridworld.actor.ActorWorld;
import com.birdbraintechnologies.Finch;


//MODIFY AS NEEDED, ESPECIALLY THE .locationClicked() METHOD:
//The key to this code is the .locationClicked() method.
//The .locationClicked() method should use if statements to make
//things happen based on the image suffix.
public class FinchGUI extends ActorWorld
{	
	//Creates the one and only Finch robot we need
	private Finch MyFinch;

	public FinchGUI(Grid<Actor> grid)
	{
		super(grid);
		MyFinch = new Finch();
		
		//various GUI Window settings
		System.setProperty("info.gridworld.gui.selection", "hide");
		System.setProperty("info.gridworld.gui.watermark", "hide");
		System.setProperty("info.gridworld.gui.tooltips", "hide");
		System.setProperty("info.gridworld.gui.frametitle", "Finch Motion Controller");
		
		//sets the message at the top of the GUI window.
		//use this often to change what the GUI window says.
		setMessage("Click a direction to move the Finch...");
	}
	
	//allows code to run when a particular square is clicked in GridWorld
	public boolean locationClicked(Location loc)
	{
		//Finds the Actor at this location and casts it 
		//as a FinchControl Object.
		Grid<Actor> gr = getGrid();
		FinchControl clicked = (FinchControl) gr.get(loc);
		String suffix = "";
		
		//.getImageSuffix() tells which image was clicked
		//based on the suffix of the image GIF file.
		//For example, "FinchControl_forward.gif" 
		//would return "_forward" as the suffix.
		//Check for "null" in case there is not an 
		//image in that square.
		if(clicked != null)
		{
			suffix = clicked.getImageSuffix();
		}
		
		//YOU WRITE IF STATEMENT(S) HERE that checks the image suffix String, and 
		//based on the result, makes the Finch move.  So if the image
		//suffix equals "_forward", then the Finch should at least move FORWARD
		//and the .setMessage() for the GUI should say something like,
		//"The Finch is moving forward...", "The Finch is stopped...", etc.
		if(suffix.equals("_forward"))
		{
			setMessage("The Finch is moving forward...");
			MyFinch.setWheelVelocities(255, 255);

		}
		else if(suffix.equals("_backward"))
		{
			setMessage("The Finch is moving backward...");
			MyFinch.setWheelVelocities(-255, -255);
		}
		else if(suffix.equals("_right"))
		{
			setMessage("The Finch is moving right...");
			MyFinch.setWheelVelocities(255, 0);
		}
		else if(suffix.equals("_left"))
		{
			setMessage("The Finch is moving left...");
			MyFinch.setWheelVelocities(0, 255);
		}
		else if(suffix.equals("_stop"))
		{
			setMessage("The Finch stopped...");
			MyFinch.setWheelVelocities(0, 0);
		}
		
		else if(suffix.equals("_tap"))
		{
			boolean tap = false;
			if(MyFinch.isTapped() == true)
            {
				setMessage("The Finch is asking who's there because someone tapped him recently");
				MyFinch.saySomething("Who's there");
				tap = true;
            }
            else
            {
				setMessage("The Finch is quiet becuse no one tapped him recently");
				tap = false;

            }
		}
		else if(suffix.equals("_honk"))
		{
			
			
			setMessage("The Finch is honking...");
			MyFinch.buzz(10000, 1000);
		}
		
		else if(suffix.equals("_lightemotes"))
		{
			
			int rnd = (int) (Math.random() * 6);
			if(rnd == 0)
			{
				setMessage("The Finch is Angry...");
				MyFinch.setLED(255,0,0);
			}

			if(rnd == 1)
			{
				setMessage("The Finch is Happy...");
				MyFinch.setLED(0,255,0);

			}

			if(rnd == 2)
			{
				setMessage("The Finch is Sad...");
				MyFinch.setLED(0,0,255);


			}
			if(rnd == 3)
			{
				setMessage("The Finch is Afraid...");
				MyFinch.setLED(255,127,0);

			}
			if(rnd == 4)
			{
				setMessage("The Finch is Surprised...");
				MyFinch.setLED(255,255,0);


			}
			if(rnd == 5)
			{
				setMessage("The Finch is Disgusted");
				MyFinch.setLED(255,0,255);

			}


		}
		else if(suffix.equals("_zigzag"))
		{
			MyFinch.setWheelVelocities(0, 255,500);
			MyFinch.setWheelVelocities(255, 255,500);
			MyFinch.setWheelVelocities(255, 0,500);
			MyFinch.setWheelVelocities(255, 255,500);
			MyFinch.setWheelVelocities(0, 240,500);
			MyFinch.setWheelVelocities(0, 100,500);

			

		}

		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		//this method ALWAYS returns true!!
		return true;      
	}		
}