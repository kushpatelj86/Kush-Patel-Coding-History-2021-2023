/**
 *<BR> Name:          Kush Patel
 *<BR> Date:          9-10-2021
 *<BR> Period:        2
 *<BR> Assignment:    Karel02a
 *<BR> Description:   Karel the robot needs to go to the office and pick up all 7 packages and return, 6 of the packages are for the emploees and 1 is for the boss. 
 *<BR> Cite Sources:  Mr.Elliot taught me a new method on how to move a chunk of code all at once and create new methods.
 */

import kareltherobot.*;

public class Karel02a implements Directions
{
    private static UrRobot Karel;
   
    public static void main(String[] args)
    {
        //load world window
        World.reset();
        World.readWorld("karel_office.kwld");	//load world map
        World.setVisible(true);				//show map
        World.setDelay(50);					//hundredths of seconds

        Karel = new UrRobot(1, 1, East, 0);

        //move Karel forward, face north, turn off
        moveFour();
        turnLeftMoveFivePickBeeper();
        turnAroundMove();
        turnLeftMovePickBeeper();
        turnAroundMoveTwoPickBeeper();
        turnAroundMoveTurnRightMove();
        turnLeftMovePickBeeper();
        turnAroundMoveTwoPickBeeper();
        turnAroundMoveTurnRightMove();
        turnLeftMovePickBeeper();
        turnAroundMoveTwoPickBeeper();
        turnAroundMoveTurnRightMove();
        moveTurnRightMoveFour();
        turnAround();

        //turn off Karel
        Karel.turnOff();
    }

    private static void turnRight()
    {
        Karel.turnLeft();
        turnAround();
    }

    private static void turnAround()
    {
        Karel.turnLeft();
        Karel.turnLeft();  
    }

    private static void moveFour()
    {
        moveTwo();
        moveTwo();
    }
    private static void moveFive()
    {
        moveFour();
        Karel.move();
    }

    private static void moveTurnRightMoveFour()
    {
        Karel.move();
        turnRight();
        moveFour();
    }

    private static void moveTwo()
    {
        Karel.move();
        Karel.move();
    }

    private static void turnAroundMove()
    {
        turnAround();
        Karel.move();
    }

    private static void turnAroundMoveTwo()
    {
        turnAround();
        moveTwo();
    }

    private static void turnLeftMovePickBeeper()
    {
        Karel.turnLeft();
        Karel.move();
        Karel.pickBeeper();
    }

    private static void turnAroundMoveTwoPickBeeper()
    {
        turnAroundMoveTwo();
        Karel.pickBeeper();
    }

    private static void turnAroundMoveTurnRightMove()
    {
        turnAround();
        Karel.move();
        turnRight();
        Karel.move();
    }

    private static void turnLeftMoveFivePickBeeper()
    {
        Karel.turnLeft();
        moveFive();
        Karel.pickBeeper();
    }

}





/*
RUN OUTPUT:

*/