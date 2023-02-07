/**
 *<BR> Name:          First Last
 *<BR> Date:          0-00-0000
 *<BR> Period:        0
 *<BR> Assignment:    Lesson00
 *<BR> Description:   In a sentence, describe goals
 *<BR> Cite Sources:  People who helped, and/or websites used
 */

import kareltherobot.*;

public class SmartRobotb extends UrRobot
{
    public SmartRobotb(int street, int avenue, Direction dir, int numBeepers)
    {
        super(street, avenue, dir, numBeepers);
    }

    public void turnRight()
    {
        turnLeft();
        turnLeft();
        turnLeft();
    }

    public void turnAround()
    {
        turnLeft();
        turnLeft();
    }

    public void moveFour()
    {
        moveTwo();
        moveTwo();
    }

    public void moveFive()
    {
        moveTwo();
        moveTwo();
        move();
    }

    public void moveTwo()
    {
        move();
        move();
    }

    public void moveTwoPutBeeper()
    {
        moveTwo();
        putBeeper();
    }

    public void moveTwoPutBeeperFourTimes()
    {
        moveTwoPutBeeper();
        moveTwoPutBeeper();
        moveTwoPutBeeper();
        moveTwoPutBeeper();
    }

    public void moveTwoPutBeeperTwoTimes()
    {
        moveTwoPutBeeper();
        moveTwoPutBeeper();
    }

    public void pinSetBackRow()
    {
        moveFour();
        turnRight();
        moveTwoPutBeeperFourTimes();
        climbStepRight();
    }

    public void pinSetThirdRow()
    {
        climbStepRight();
        putBeeper();
        moveTwoPutBeeperTwoTimes();
        climbStepLeft();
    }

    public void pinSetSecondRow()
    {
        climbStepLeftPutBeeper();
        moveTwoPutBeeper();
        climbStepRight();
    }

    public void putBeeperMoveFive()
    {
        putBeeper();
        moveFive();
    }

    public void pinSetFirstRow()
    {
        climbStepRight();
        putBeeper();
        moveFive();
        climbStepLeft();
        turnAround();
    }

    public void climbStepLeft()
    {
        turnLeft();
        move();
    }

    public void climbStepLeftPutBeeper()
    {
        climbStepLeft();
        putBeeper();
    }

    public void climbStepRight()
    {
        turnRight();
        move();
    } 

}

/*
RUN OUTPUT:

*/