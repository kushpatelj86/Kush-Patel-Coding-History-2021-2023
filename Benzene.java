/**
 *<BR> Name:          Kush Patel
 *<BR> Date:          9-25-2021
 *<BR> Period:        2
 *<BR> Assignment:    ICT Curriculim L02
 *<BR> Description:   I am trying to draw the benzene molecule
 *<BR> Cite Sources:  The Websites I used are https://ap.mreliot.com/LessonA02/A2-C.html, https://ap.mreliot.com/LessonA02/Lab-A2-1.html, https://ap.mreliot.com/LessonA02/A2-A.html, https://ap.mreliot.com/LessonA02/A2-B.html, and https://ap.mreliot.com/LessonA02/A2-D.html, and I did it myself.
 */

import gpdraw.*;


public class Benzene
{
    
    //global private values available tp
    //All methods in the class
    private DrawingTool myPencil;
    private SketchPad myPaper;
    
    
    public Benzene()
    {
        myPaper = new SketchPad(300, 300);
        myPencil = new DrawingTool(myPaper);
    }

    public void draw()
    {       
        drawBonds();
        drawRing(); 
    }


    public void drawRing()
    {
        myPencil.up();
        myPencil.move(4,-2);
        myPencil.setDirection(0);
        myPencil.setWidth(1);
        myPencil.down();
        myPencil.drawCircle(65);
        myPencil.up();
    }
   
    public void drawBonds()
    {
        myPencil.up();
        myPencil.move(0, -100);
        myPencil.setDirection(0);
        myPencil.setWidth(1);
        myPencil.down();
        myPencil.turnLeft(25);
        myPencil.move(100);
        myPencil.turnLeft(65);
        myPencil.move(105);
        myPencil.turnLeft(60);
        myPencil.move(100);
        myPencil.turnLeft(60);
        myPencil.move(100);
        myPencil.turnLeft(60);
        myPencil.move(105);
        myPencil.turnLeft(62.5);
        myPencil.move(93);
        myPencil.up();

    }
}

/*
RUN OUTPUT:

*/