//give to students

import kareltherobot.*;

public class MazeRobotTester implements Directions
{
    public static void main(String args[])  
    {
    
		World.reset(); 
		World.readWorld("karel_maze.kwld"); 
		World.setDelay(1);  
		World.setVisible(true);

        MazeRobot Karel = new MazeRobot(1, 1, East, 0);  
        
        while (Karel.nextToABeeper() == false) 
        {
          Karel.move();
        }
        
        Karel.turnOff();

    } 

}
