/**
 *<BR> Name:          Kush Patel
 *<BR> Date:          9-15-2021
 *<BR> Period:        2
 *<BR> Assignment:    Karel03
 *<BR> Description:   This runs and tests all the methods witten in the smart robot program
 *<BR> Cite Sources:  I just did everything myself while i asked Mr.Elliot to make sure I did everything correctly.
 */

import kareltherobot.*;

public class SmartRobotTesterb implements Directions
{
    public static void main(String[] args)
    {
        //load world window
        World.reset();
        World.readWorld("karel_pinsetter.kwld");	//load world map
        World.setVisible(true);				//show map
        World.setDelay(50);					//hundredths of seconds

        SmartRobot Michael = new SmartRobot(1, 1, North, 10);

        //move Michael forward, face north, turn off
        Michael.pinSetBackRow();
        Michael.pinSetThirdRow();
        Michael.pinSetSecondRow();
        Michael.pinSetFirstRow();

        //turn off Michael
        Michael.turnOff();
    }
}

/*
RUN OUTPUT:

*/