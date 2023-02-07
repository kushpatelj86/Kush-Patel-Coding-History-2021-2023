/**
 *<BR> Name:          Kush Patel
 *<BR> Date:          12-20-2021
 *<BR> Period:        2
 *<BR> Assignment:    ICT Lesson 13.3
 *<BR> Description:   We will be counting number of spaces in a line
 *<BR> Cite Sources:  Mr.Eliot taught me how to always set goodData to faLse before running and brady reiss and I got the same average/we comparex our averages
 */
public class SqueezeFileTester
{
    public static void main(String[] args) 
    {
        SqueezeFile.squeeze();
        
    }
}
/*
RUN OUTPUT:
Output that is provided by running your tester:
Your file has been compressed...




import kareltherobot.*;

public class MazeRobot extends SmartRobot implements Directions
{

    public MazeRobot(int st, int av, Direction dir, int numBeepers)
    {
        super(st,av,dir,numBeepers);
    }

    public void move()
    {
        if(rightIsClear() == true)
        {
            turnRight();
            super.move();
        }
        else
        {
			if(frontIsClear() == true)
			{
				super.move();
			}
			else
			{
				turnLeft();
			}
        }
    }

    public boolean rightIsClear()
    {
        boolean myClear = false;

        turnRight();
        if ( frontIsClear() == true )
        {
            turnLeft();
            myClear = true;
        }
        else
        {
            turnLeft();
        }

        return myClear;
    }

    public boolean leftIsClear()
    {
        boolean myClear = false;

        turnLeft();
        if ( frontIsClear() == true )
        {
            turnRight();
            myClear = true;
        }
        else
        {
            turnRight();
        }

        return myClear;
    }
}


0
0 import kareltherobot.*;
0
0 public class MazeRobot extends SmartRobot implements Directions
0 {
0
4 public MazeRobot(int st, int av, Direction dir, int numBeepers)
4 {
8 super(st,av,dir,numBeepers);
4 }
0
4 public void move()
4 {
8 if(rightIsClear() == true)
8 {
12 turnRight();
12 super.move();
8 }
8 else
8 {
12 if(frontIsClear() == true)
12 {
16 super.move();
12 }
12 else
12 {
16 turnLeft();
12 }
8 }
4 }
0
4 public boolean rightIsClear()
4 {
8 boolean myClear = false;
0
8 turnRight();
8 if ( frontIsClear() == true )
8 {
12 turnLeft();
12 myClear = true;
8 }
8 else
8 {
12 turnLeft();
8 }
0
8 return myClear;
4 }
0
4 public boolean leftIsClear()
4 {
8 boolean myClear = false;
0
8 turnLeft();
8 if ( frontIsClear() == true )
8 {
12 turnRight();
12 myClear = true;
8 }
8 else
8 {
12 turnRight();
8 }
0
8 return myClear;
4 }
0 }



*/