/**
 *<BR> Name:          Kush Patel
 *<BR> Date:          11/05/21
 *<BR> Period:        2
 *<BR> Assignment:    ICT Lesson 9.2
 *<BR> Description:   We will be using recursion to draw out different shapes. Recursion is using a method inside itself
 *<BR> Cite Sources:  Mr.Eliot taught me what recursion is. Websites I used: https://courses.mreliot.com/pluginfile.php/2255/mod_resource/content/12/apcsa_ICT_L09_recursion.pdf, 
 */

import gpdraw.*;


public class KochCurveTester
{
     

    public static void main(String[] args)
    {
        KochCurve MyCurve = new KochCurve();

        MyCurve.drawCurve(3, 300, -400, 10);
        MyCurve.drawSnowFlake(6, 300, -150, 10);
        MyCurve.drawKite(5, 100, 180, 180);
        MyCurve.drawTree(3, 100, 370, -275);
        MyCurve.drawFidgetSpinner();
        MyCurve.drawBat();
        MyCurve.drawHandDrill(6, 50, 100,-100);
        MyCurve.drawCar();
        
    }
}

/*
RUN OUTPUT:

*/