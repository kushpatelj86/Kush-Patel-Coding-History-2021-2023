/**
 *<BR> Name:          Kush Patel
 *<BR> Date:          11/05/21
 *<BR> Period:        2
 *<BR> Assignment:    ICT Lesson 9.2
 *<BR> Description:   We will be using recursion to draw out different shapes. Recursion is using a method inside itself
 *<BR> Cite Sources:  Mr.Eliot taught me what recursion is 
 */

import gpdraw.*;
import java.awt.Color;


public class KochCurve
{
   private DrawingTool myPencil;
   private SketchPad myPaper;


   public KochCurve()
   {
        myPaper = new SketchPad(1000, 800);
        myPencil = new DrawingTool(myPaper);
   }

    private void drawKochCurve(int level, double length)
    {
        if(level < 1)
        {
            myPencil.forward(length);
            
        }

        else
        {
            drawKochCurve(level - 1, length / 3.0);
            drawKochCurve(level - 1, length / 3.0);
            myPencil.turnRight(120);
            drawKochCurve(level - 1, length / 3.0);
            myPencil.turnLeft(60);
            drawKochCurve(level - 1, length / 3.0);
        }   
    }

    public void drawCurve(int level, double length, double x, double y)
    {
        myPencil.up();
        myPencil.move(x, y);
        myPencil.setDirection(90);
        myPencil.down();
        drawKochCurve(level, length);
    }


    public void drawSnowFlake(int level, double length, double x, double y)
    {
        myPencil.up();
        myPencil.move(x, y);
        myPencil.setWidth(1);
        myPencil.setDirection(60);
        myPencil.down();
        drawKochCurve(level, length);
        myPencil.turnRight(120);
        myPencil.up();
        myPencil.down();
        drawKochCurve(level, length);
        myPencil.turnRight(120);
        myPencil.up();
        myPencil.down();
        drawKochCurve(level, length);
    } 
    
    public void drawKite(int level, double length, double x, double y)
    {
        myPencil.up();
        myPencil.move(x, y);
        myPencil.setDirection(40);
        myPencil.down();
        drawKochCurve(level, length);
        myPencil.turnLeft(90);
        myPencil.up();
        myPencil.down();
        drawKochCurve(level, length);
        myPencil.turnLeft(90);
        myPencil.up();
        myPencil.down();
        drawKochCurve(level, length);
        myPencil.turnLeft(90);
        myPencil.up();
        myPencil.down();
        drawKochCurve(level, length);
        myPencil.turnRight(40);
        myPencil.up();
        myPencil.down();
        drawKochCurve(level, length);
    }

    public void drawTree(int level, double length, double x, double y)
    {
        myPencil.up();
        myPencil.move(x, y);
        myPencil.setDirection(100);
        myPencil.down();
        drawKochCurve(level, length);
        drawKochCurve(level, length);
        myPencil.up();
        myPencil.turnLeft(35);
        myPencil.down();
        drawKochCurve(level, length);
        myPencil.up();
        myPencil.turnRight(55);
        myPencil.down();
        drawKochCurve(level, length);
        myPencil.turnRight(55);
        myPencil.down();
        drawKochCurve(level, length);
        myPencil.turnRight(55);
        myPencil.down();
        drawKochCurve(level, length);
        myPencil.turnRight(55);
        myPencil.down();
        drawKochCurve(level, length);
        myPencil.turnRight(55);
        myPencil.down();
        drawKochCurve(level, length);
        myPencil.turnLeft(45);
        myPencil.down();
        drawKochCurve(level, length);
        drawKochCurve(level, length);
    }

    private void drawOutsideFidgetSpinner(int level, double length, double x, double y)
    {
        myPencil.up();
        myPencil.move(x, y);
        myPencil.setDirection(0);
        myPencil.down();
        drawKochCurve(level, length);
        myPencil.turnRight(120);
        myPencil.up();
        myPencil.down();
        drawKochCurve(level, length);
        myPencil.turnLeft(120);
        myPencil.up();
        myPencil.down();
        drawKochCurve(level, length);
        myPencil.turnRight(120);
        myPencil.up();
        myPencil.down();
        drawKochCurve(level, length);
        myPencil.turnRight(120);
        myPencil.up();
        myPencil.down();
        drawKochCurve(level, length);
        myPencil.turnLeft(120);
        myPencil.up();
        myPencil.down();
        drawKochCurve(level, length);
        myPencil.turnRight(120);
        myPencil.up();
        myPencil.down();
        drawKochCurve(level, length);
        myPencil.turnRight(120);
        myPencil.up();
        myPencil.down();
        drawKochCurve(level, length);
        myPencil.turnLeft(120);
        myPencil.up();
        myPencil.down();
        drawKochCurve(level, length);
    }

    private void drawInsideBearing1(int level, double length, double x, double y)
    {
        myPencil.up();
        myPencil.move(x, y);
        myPencil.setDirection(60);
        myPencil.down();
        drawKochCurve(level, length);
        myPencil.turnRight(120);
        myPencil.up();
        myPencil.down();
        drawKochCurve(level, length);
        myPencil.turnRight(120);
        myPencil.up();
        myPencil.down();
        drawKochCurve(level, length);
    }

    private void drawInsideBearing2(int level, double length, double x, double y)
    {
        myPencil.up();
        myPencil.move(x, y);
        myPencil.setDirection(60);
        myPencil.down();
        drawKochCurve(level, length);
        myPencil.turnRight(120);
        myPencil.up();
        myPencil.down();
        drawKochCurve(level, length);
        myPencil.turnRight(120);
        myPencil.up();
        myPencil.down();
        drawKochCurve(level, length);
    }

    private void drawInsideBearing3(int level, double length, double x, double y)
    {
        myPencil.up();
        myPencil.move(x, y);
        myPencil.setDirection(60);
        myPencil.down();
        drawKochCurve(level, length);
        myPencil.turnRight(120);
        myPencil.up();
        myPencil.down();
        drawKochCurve(level, length);
        myPencil.turnRight(120);
        myPencil.up();
        myPencil.down();
        drawKochCurve(level, length);
    }
    public void drawFidgetSpinner()
    {
        drawOutsideFidgetSpinner(5, 100 , -320, 250);
        drawInsideBearing1(6, 50, -295, 210);
        drawInsideBearing2(6, 50, -345, 120);
        drawInsideBearing3(6, 50, -245, 120);
    }

    private void drawBodyOFBat(int level, double length, double x, double y)
    {
        myPencil.up();
        myPencil.move(x, y);
        myPencil.setDirection(0);
        myPencil.down();
        drawKochCurve(level, length);
        myPencil.turnRight(120);
        myPencil.up();
        myPencil.down();
        drawKochCurve(level, length * 2);
        myPencil.turnRight(60);
        myPencil.up();
        myPencil.down();
        drawKochCurve(level, length * 2);
        myPencil.turnRight(60);
        myPencil.up();
        myPencil.down();
        drawKochCurve(level, length * 2);
        myPencil.turnRight(120);
        myPencil.up();
        myPencil.down();
        drawKochCurve(level, length);
        myPencil.turnRight(60);
        myPencil.up();
        myPencil.down();
        drawKochCurve(level, length);
        myPencil.turnLeft(60);
        myPencil.up();
        myPencil.down();
        drawKochCurve(level, length);
        myPencil.turnLeft(60);
        myPencil.up();
        myPencil.down();
        drawKochCurve(level, length);
        myPencil.up();

    }

    private void drawEyesOfBat(int level, double length, double x, double y)
    {
        myPencil.up();
        myPencil.move(x, y);
        myPencil.setDirection(0);
        myPencil.down();
        drawKochCurve(level, length);
        myPencil.turnRight(25);
        drawKochCurve(level, length);
        myPencil.turnRight(25);
        drawKochCurve(level, length);
        myPencil.turnRight(25);
        drawKochCurve(level, length);
        myPencil.turnRight(25);
        drawKochCurve(level, length);
        myPencil.turnRight(25);
        drawKochCurve(level, length);
        myPencil.turnRight(25);
        drawKochCurve(level, length);
        myPencil.turnRight(25);
        drawKochCurve(level, length);
        myPencil.turnRight(25);
        drawKochCurve(level, length);
        myPencil.turnRight(25);
        drawKochCurve(level, length);
        myPencil.turnRight(25);
        drawKochCurve(level, length);
        myPencil.turnRight(25);
        drawKochCurve(level, length);
        myPencil.turnRight(25);
        drawKochCurve(level, length);
        myPencil.turnRight(25);
        drawKochCurve(level, length);
        myPencil.turnRight(25);
        drawKochCurve(level, length);
        myPencil.turnRight(25);
        drawKochCurve(level, length);
        myPencil.turnRight(25);
        myPencil.up();

    }
    public void drawBat()
    {
        drawBodyOFBat(3, 75, -200, -100);
        drawEyesOfBat(7, 1, -278, -155);
        drawEyesOfBat(7, 1, -273, -155);
    }


    public void drawHandDrill(int level, double length, double x, double y)
    {
    
        myPencil.move(x, y);
        myPencil.setDirection(90);
        myPencil.turnRight(90);
        myPencil.up();
        myPencil.down();
        drawKochCurve(level, length / 2);
        myPencil.turnRight(90);
        myPencil.up();
        myPencil.down();
        drawKochCurve(level, length);
        myPencil.turnLeft(90);
        myPencil.up();
        myPencil.down();
        drawKochCurve(level, length);
        drawKochCurve(level, length);
        drawKochCurve(level, length);
        myPencil.turnRight(90);
        myPencil.up();
        myPencil.down();
        drawKochCurve(level, length / 8);
        myPencil.turnRight(90);
        myPencil.up();
        myPencil.down();
        drawKochCurve(level, length);
        drawKochCurve(level, length);
        drawKochCurve(level, length);
        myPencil.turnLeft(90);
        myPencil.up();
        myPencil.down();
        drawKochCurve(level, length);
        myPencil.turnRight(90);
        myPencil.up();
        myPencil.down();
        drawKochCurve(level, length);
        drawKochCurve(level, length);
        drawKochCurve(level, length);
        myPencil.turnLeft(90);
        myPencil.up();
        myPencil.down();
        drawKochCurve(level, length);
        myPencil.turnRight(60);
        myPencil.up();
        myPencil.down();
        drawKochCurve(level, length);
        myPencil.turnRight(60);
        myPencil.up();
        myPencil.down();
        drawKochCurve(level, length);
        myPencil.turnRight(90);
        myPencil.up();
        myPencil.down();
        drawKochCurve(level, length);
        myPencil.turnLeft(30);
        myPencil.up();
        myPencil.down();
        drawKochCurve(level, length);
        drawKochCurve(level, length);
        drawKochCurve(level, length / 4);
        myPencil.turnRight(90);
        myPencil.up();
        myPencil.down();
        drawKochCurve(level, length / 4);
        drawKochCurve(level, length * 2);
        drawKochCurve(level, length * 2);
    }

    private void drawBoard(int level, double length, double x, double y)
    {
        myPencil.up();
        myPencil.move(x, y);
        myPencil.setDirection(0);
        myPencil.down();
        myPencil.turnLeft(90);
        drawKochCurve(level, length);
        myPencil.turnRight(90);
        drawKochCurve(level, length);
        drawKochCurve(level, length);
        drawKochCurve(level, length);
        myPencil.turnRight(90);
        drawKochCurve(level, length);
        myPencil.turnLeft(90);
        drawKochCurve(level, length);
        drawKochCurve(level, length);
        myPencil.turnRight(25);
        drawKochCurve(level, length / 2);
        myPencil.turnRight(30);
        drawKochCurve(level, length / 2);
        myPencil.turnRight(45);
        drawKochCurve(level, length / 2);
        myPencil.turnRight(80);
        drawKochCurve(level, length);
        drawKochCurve(level, length);
        drawKochCurve(level, length);
        drawKochCurve(level, length);
        drawKochCurve(level, length);
        myPencil.turnRight(25);
        drawKochCurve(level, length / 2);
        myPencil.turnRight(30);
        drawKochCurve(level, length / 2);
        myPencil.turnRight(45);
        drawKochCurve(level, length);      
        myPencil.up();
    }

    private void drawWheel(int level, double length, double x, double y)
    {
        myPencil.up();
        myPencil.move(x, y);
        myPencil.setDirection(0);
        myPencil.setWidth(5);
        myPencil.down();
        drawKochCurve(level, length);
        myPencil.turnRight(25);
        drawKochCurve(level, length);
        myPencil.turnRight(25);
        drawKochCurve(level, length);
        myPencil.turnRight(25);
        drawKochCurve(level, length);
        myPencil.turnRight(25);
        drawKochCurve(level, length);
        myPencil.turnRight(25);
        drawKochCurve(level, length);
        myPencil.turnRight(25);
        drawKochCurve(level, length);
        myPencil.turnRight(25);
        drawKochCurve(level, length);
        myPencil.turnRight(25);
        drawKochCurve(level, length);
        myPencil.turnRight(25);
        drawKochCurve(level, length);
        myPencil.turnRight(25);
        drawKochCurve(level, length);
        myPencil.turnRight(25);
        drawKochCurve(level, length);
        myPencil.turnRight(25);
        drawKochCurve(level, length);
        myPencil.turnRight(25);
        drawKochCurve(level, length);
        myPencil.turnRight(25);
        drawKochCurve(level, length);
        myPencil.turnRight(25);
        drawKochCurve(level, length);
        myPencil.turnRight(25);
        myPencil.up();
    }

    public void drawCar()
    {
        drawBoard(8, 25, 275, 250);
        drawWheel(7, 5, 290, 225);
        drawWheel(7, 5, 388, 225);
    }

    
}

/*
RUN OUTPUT:

*/