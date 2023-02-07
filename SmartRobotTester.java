/**
 *<BR> Name:          First Last
 *<BR> Date:          0-00-0000
 *<BR> Period:        0
 *<BR> Assignment:    Lesson00
 *<BR> Description:   In a sentence, describe goals
 *<BR> Cite Sources:  People who helped, and/or websites used
 */

import kareltherobot.*;

public class SmartRobotTester implements Directions
{
    public static void main(String[] args)
    {
        //load world window
        World.reset();
        World.readWorld("Default.kwld");	//load world map
        World.setVisible(true);				//show map
        World.setDelay(50);					//hundredths of seconds

        SmartRobota Michael = new SmartRobota(1, 1, East, 0);

        //move Michael forward, face north, turn off
        Michael.moveFour();
        Michael.turnLeft();
        Michael.moveFour();
        Michael.turnRight();
        Michael.moveFour();
        Michael.turnAround();
        Michael.moveTwo();

        //turn off Michael
        Michael.turnOff();
    }
}

/*
RUN OUTPUT:

*/