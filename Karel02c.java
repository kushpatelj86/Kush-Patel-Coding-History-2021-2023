/**
 *<BR> Name:          Kush Patel
 *<BR> Date:          9-10-2021
 *<BR> Period:        2
 *<BR> Assignment:    Karel02c
 *<BR> Description:   Karel the robot needs to go to the office and pick up all 7 packages and return, 6 of the packages are for the emploees and 1 is for the boss. 
 *<BR> Cite Sources:  Mr.Elliot taught me a new method on how to move a chunk of code all at once and create new methods.
 */

import kareltherobot.*;

public class Karel02c implements Directions
{
    private static UrRobot Karel;
   
    public static void main(String[] args)
    {
        //load world window
        World.reset();
        World.readWorld("karel_help.kwld");	//load world map
        World.setVisible(true);				//show map
        World.setDelay(50);					//hundredths of seconds

        Karel = new UrRobot(1, 1, East, 39);

        //move Karel forward, face north, turn off
       drawH();
       drawE();
       drawL();
       drawP();
       
        //turn off Karel
        Karel.turnOff();
    }
       
    private static void drawH()
    {
        moveTurnLeftMove();
        movePutBeeperFive();
        turnRight();
        moveTwo();
        turnRightPutBeeper();
        movePutBeeper();
        movePutBeeper();
        turnRightMovePutBeeper();
        turnAroundMove();
        turnRight();
        movePutBeeper();
        movePutBeeper();
        moveTwoTurnLeft();
    }

    private static void drawE()
    {
        moveTwo();
        turnLeftMove();
        movePutBeeperFive();
        turnRight();
        movePutBeeperTwo();
        turnRight();
        moveTwo();
        turnRightPutBeeper();
        movePutBeeper();
        moveTurnLeft();
        moveTwo();
        turnLeftMovePutBeeperTwo();
        turnRight();
        moveTwoTurnLeft();
    }
    
    private static void drawL()
    {
        moveTwo();
        turnLeftMove();
        movePutBeeperFive();
        turnAround();
        moveFour();
        turnLeftMovePutBeeper();
        movePutBeeper();
        turnRight();
        moveTwoTurnLeft();
    }
    
    private static void drawP()
    {
        moveTwo();
        turnLeftMove();
        movePutBeeperFive();
        turnRight();
        movePutBeeperTwo();
        turnRight();
        movePutBeeperTwo();
        turnRight();
        movePutBeeperMove();
        turnLeftMoveFour();
        turnRightMoveThirteen();
        turnAround();
    }

    private static void turnLeftMoveFour()
    {
        Karel.turnLeft();
        moveFour();
    }

    private static void turnRightMoveThirteen()
    {
        turnRight();
        moveThirteen();
    }

    private static void moveTurnLeftMove()
    {
        Karel.move();
        Karel.turnLeft();
        Karel.move();
    }

    private static void movePutBeeperMove()
    {
        movePutBeeper();
        Karel.move();
    }

    private static void moveTwoTurnLeft()
    {
        moveTwo();
        Karel.turnLeft();
    }

    private static void turnRightPutBeeper()
    {
        turnRight();
        Karel.putBeeper();
    }

    private static void turnLeftMovePutBeeperTwo()
    {
        Karel.turnLeft();
        movePutBeeperTwo();
    }

    private static void movePutBeeper()
    {
        Karel.move();
        Karel.putBeeper();
    }

    private static void movePutBeeperTwo()
    {
        Karel.move();
        Karel.putBeeper();
        Karel.move();
        Karel.putBeeper();
    }

    private static void movePutBeeperFive()
    {
        movePutBeeperTwo();
        movePutBeeperTwo();
        Karel.move();
        Karel.putBeeper();
    }

    private static void moveThirteen()
    {  
        moveNine();
        moveFour();
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
        moveThree();
        Karel.move();
    }

    private static void moveFive()
    {
        moveFour();
        Karel.move();
    }

    private static void moveTwo()
    {
        Karel.move();
        Karel.move();
    }

    private static void moveNine()
    {
        moveFive();
        moveFour();
    }

    private static void turnAroundMove()
    {
        turnAround();
        Karel.move();
    }

    private static void turnLeftMovePutBeeper()
    {
        turnLeftMove();
        Karel.putBeeper();
    }

    private static void turnRightMovePutBeeper()
    {
        turnRightMove();
        Karel.putBeeper();
    }

    private static void turnRightMove()
    {
        turnRight();
        Karel.move();
    }

    private static void turnLeftMove()
    {
        Karel.turnLeft();
        Karel.move();
    }

    private static void moveTurnLeft()
    {   
        Karel.move();
        Karel.turnLeft();
    }

    private static void moveThree()
    {
        moveTwo();
        Karel.move();
    }
}










/*
RUN OUTPUT:

*/