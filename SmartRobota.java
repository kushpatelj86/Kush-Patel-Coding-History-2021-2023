/**
 *<BR> Name:          First Last
 *<BR> Date:          0-00-0000
 *<BR> Period:        0
 *<BR> Assignment:    Lesson00
 *<BR> Description:   In a sentence, describe goals
 *<BR> Cite Sources:  People who helped, and/or websites used
 */

import kareltherobot.*;

public class SmartRobota extends UrRobot
{
    public SmartRobota(int street, int avenue, Direction dir, int numBeepers)
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

    public void climbStepRight()
    {
        turnRight();
        move();
    } 

    public void climbRightStepPickBeeper()
    {
        turnRight();
        move();
        pickBeeper();
    } 
    
    public void climbStepLeft()
    {
        turnLeft();
        move();
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

    public void moveTurnLeft()
    {
        move();
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
        moveTurnLeft();
        movePickBeeperTurnRight();
    }

    public void movePickBeeper()
    {
        move();
        pickBeeper();
    }
}

/*
RUN OUTPUT:

*/