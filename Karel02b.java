/**
 *<BR> Name:          Kush Patel
 *<BR> Date:          9-10-2021
 *<BR> Period:        2
 *<BR> Assignment:    Karel02b
 *<BR> Description:   Karel the robot needs to go to the office and pick up all 7 packages and return, 6 of the packages are for the emploees and 1 is for the boss. 
 *<BR> Cite Sources:  Mr.Elliot taught me a new method on how to move a chunk of code all at once and create new methods.Mr.Elliot taught me how to write new methods. I just did the rest of the things myself
 */

import kareltherobot.*;

public class Karel02b implements Directions
{
    private static UrRobot Karel;
   
    public static void main(String[] args)
    {
        //load world window
        World.reset();
        World.readWorld("karel_vacuum.kwld");	//load world map
        World.setVisible(true);				//show map
        World.setDelay(50);					//hundredths of seconds

        Karel = new UrRobot(1, 1, East, 0);

        //move Karel forward, face north, turn off
        moveNine();
        turnLeftMoveTwo();
        pickBeeperMoveSeven();
        turnLeftMoveSixPickBeeper();
        makeLoopToCollectBeepers();
        turnRightMoveNineTurnAround();
        
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

    private static void turnRightMove()
    {
        turnRight();
        Karel.move();
    }

    private static void movePickBeeperSeven()
    {
        movePickBeeper();
        movePickBeeper();
        movePickBeeper();
        movePickBeeper();
        movePickBeeper();
        movePickBeeper();
        movePickBeeper();
    }

    private static void pickBeeperMoveSeven()
    {
        Karel.pickBeeper();
        movePickBeeperSeven();
    }

    private static void turnLeftMoveTwo()
    {
        Karel.turnLeft();
        moveTwo();
    }

    private static void moveThree()
    {
        moveTwo();
        Karel.move();
    }

    private static void turnLeftMovePickBeeper()
    {
        Karel.turnLeft();
        movePickBeeper();
    }

    private static void turnRightMovePickBeeper()
    {
        turnRight();
        movePickBeeper();
    }

    private static void turnLeftMoveTurnLeft()
    {
        Karel.turnLeft();
        Karel.move();
        Karel.turnLeft();
    }

    private static void turnLeftMoveSixPickBeeper()
    {
        turnLeftMovePickBeeper();
        turnLeftMovePickBeeper();
        Karel.turnLeft();
        moveTwo();
        Karel.pickBeeper();
        turnLeftMovePickBeeper();
        turnLeftMoveTurnLeft();
    }

    private static void movePickBeeper()
    {
        Karel.move();
        Karel.pickBeeper();
    }

    private static void turnLeftMovePickBeeperThree()
    {
        turnLeftMovePickBeeper();
        movePickBeeper();
        movePickBeeper();
    }

    private static void turnRightMovePickBeeperTwo()
    {
        turnRightMovePickBeeper();
        movePickBeeper();
    }

    private static void makeLoopToCollectBeepers()
    {
        moveFour();
        turnLeftMovePickBeeperThree();
        turnLeftMovePickBeeper();
        turnRightMovePickBeeper();
        turnRightMovePickBeeper();
        movePickBeeper();
        turnRightMovePickBeeper();
        turnRightMoveTurnLeft();
        moveFourPickBeeper();
        movePickBeeper();
        movePickBeeper();
        turnLeftMovePickBeeper();
        turnRightMovePickBeeper();
        turnRightMovePickBeeperTwo();
        turnRightMovePickBeeper();
        turnRight();
        moveTurnLeft();
        moveThree();
        turnRight();
        moveFive();
    }

    private static void turnRightMoveTurnLeft()
    {
        turnRightMove();
        Karel.turnLeft();
    }

      
    private static void turnRightMoveNineTurnAround()
    {
        turnRight();
        moveNine();
        turnAround(); 
    }

    private static void moveTurnLeft()
    {
        Karel.move();
        Karel.turnLeft();
    }

    private static void moveFourPickBeeper()
    {
        moveFour();
        Karel.pickBeeper();
    }
}

/*
RUN OUTPUT:

*/