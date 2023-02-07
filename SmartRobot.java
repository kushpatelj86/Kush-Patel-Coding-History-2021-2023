/**
 *<BR> Name:          Kush Patel
 *<BR> Date:          9-15-2021
 *<BR> Period:        2
 *<BR> Assignment:    Karel03
 *<BR> Description:   This is code programmed to make karel do so many methods and it will all be tested and programmed in the Tester classes with the main method.
 *<BR> Cite Sources:  I just did everything myself while i asked Mr.Elliot to make sure I did everything correctly.
 */

import kareltherobot.*;

public class SmartRobot extends Robot
{
    public SmartRobot(int street, int avenue, Direction dir, int numBeepers)
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

    public void climbUp()
    {
        pickBeeperClimbUpStepRight();
        climbUpStepRight();
        climbUpStepRight();
        climbUpStepRight();
        climbUpStepRightMove();
    }

    public void climbDown()
    {
        pickBeeperClimbDownStepRight();
        climbDownStepRight();
        climbDownStepRight();
        climbDownStepRight();
        climbDownStepRight();
        pickBeeperClimbDownStepRightTurnAround();
    }

    public void climbBackUp()
    {
        climbBackUpStepLeft();
        climbBackUpStepLeft();
        climbBackUpStepLeft();
        climbBackUpStepLeft();
        climbBackUpStepLeft();
        movePickBeeper();
    }

    public void climbBackDown()
    {
        climbBackDownStepLeft();
        climbBackDownStepLeft();
        climbBackDownStepLeft();
        climbBackDownStepLeft();
        climbBackDownStepLeft();
        turnAround();
    }

    public void climbRightStepPickBeeper()
    {
        turnRight();
        move();
        pickBeeper();
    } 

    public void climbUpStepRight()
    {
        climbStepLeft();
        climbRightStepPickBeeper();
    }

    public void pickBeeperClimbUpStepRight()
    {
        pickBeeper();
        climbUpStepRight();
    }

    public void climbUpStepRightMove()
    {
        climbStepLeft();
        climbStepRight();
    }

    public void climbDownStepRight()
    {
        pickBeeper();
        climbStepLeft();
        climbStepRight();
    }
    
    public void pickBeeperClimbDownStepRight()
    {
        pickBeeper();
        move();
        climbStepRight();
    }

    public void pickBeeperClimbDownStepRightTurnAround()
    {
        pickBeeper();
        climbStepLeft();
        turnAround();
    }

    public void climbBackUpStepLeft()
    {
        movePickBeeper();
        climbStepRight();
        turnLeft();
    }

    public void movePickBeeperTurnRight()
    {
        move();
        pickBeeper();
        turnRight();
    }

    public void climbBackDownStepLeft()
    {
        stepLeftClimb();
        movePickBeeperTurnRight();
    }

    public void movePickBeeper()
    {
        move();
        pickBeeper();
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
        putBeeperMoveFive();
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

    public void stepLeftClimb()
    {
        move();
        turnLeft();
    }

    public void stepRightClimb()
    {
        move();
        turnRight();
    }
}

/*
RUN OUTPUT:

*/