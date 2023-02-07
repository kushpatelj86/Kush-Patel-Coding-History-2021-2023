/**
 *<BR> Name:          Kush Patel
 *<BR> Date:          9-07-2021
 *<BR> Period:        2
 *<BR> Assignment:    Karel01
 *<BR> Description:   First Karel assignment
 *<BR> Cite Sources:  Just Me
 */
//My first program I ever coded
import kareltherobot.*;

public class Karel01a implements Directions
{
    public static void main(String[] args)
    {
        //I coded only from line 18- 46, the rest of it was a model/template, my computer science teacher gave to me
        //load world window
        World.reset();
        World.readWorld("java_karel01_world.kwld");	//load world map
        World.setVisible(true);				//show map
        World.setDelay(50);					//hundredths of seconds

        UrRobot Karel = new UrRobot(1, 1, East, 1);

        //move Karel forward, face north, turn off
        Karel.move();
        Karel.move();
        Karel.turnLeft();
        Karel.move();
        Karel.move();
        Karel.pickBeeper();
        Karel.turnLeft();
        Karel.turnLeft();
        Karel.move();
        Karel.move();
        Karel.turnLeft();
        Karel.turnLeft();
        Karel.turnLeft();
        Karel.move();
        Karel.move();
        Karel.turnLeft();
        Karel.turnLeft();
         
        //turn off Karel
        Karel.turnOff();
    }
}

/*
RUN OUTPUT:

*/