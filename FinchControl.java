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
import java.awt.Color;

//DO NOT MODIFY THIS CLASS:
//This class loads images with specific colors into GridWorld.
//You shouldn't need to modify this class.  It allows you to create
//any GUI you want.  Everything is based on the image suffix, for
//example in "FinchControl_stop.gif" the image suffix is "_stop".
public class FinchControl extends Actor
{
	private String controlType;
	
	//default tile image, black color
    public FinchControl()
    {
		controlType = "";
        setColor(Color.black);
    }
	
	//default tile image, custom color
    public FinchControl(Color color)
    {
		controlType = "";
        setColor(color);
    }
	
	//custom control image, black color
    public FinchControl(String type)
    {
		controlType = type;
        setColor(Color.black);
    }

	//custom control image, custom color
    public FinchControl(String type, Color color)
    {
		controlType = type;
        setColor(color);
    }
	
	//Allows correct control image to be loaded as object is created.
	//Allows the image suffix to be checked, so actions can be taken
	public String getImageSuffix()
	{
		if (controlType.equals(""))
		{
			return "";
		}
		else
		{
			return "_" + controlType;
		}
	}		
}