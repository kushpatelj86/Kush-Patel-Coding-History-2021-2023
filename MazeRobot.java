
import kareltherobot.*;

public class MazeRobot extends SmartRobot implements Directions 
{

	public MazeRobot(int st, int av, Direction dir, int numBeepers) 
	{
		super(st, av, dir, numBeepers);
	}

	public void move() 
	{
		if(leftIsClear() == true)
		{
			turnLeft();
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
				turnRight();
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
              