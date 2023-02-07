/**
 *<BR> Name:          Kush Patel
 *<BR> Date:          10-05-2021
 *<BR> Period:        2
 *<BR> Assignment:    ICT Lesson 4.2
 *<BR> Description:   In this assignment we will calculating the area and permiter of five rectangles
 *<BR> Cite Sources:  Mr.Elliot taught me how to write constructors and the websites i used are https://ap.mreliot.com/LessonA01/HA1_1DrawingTool.html 
 */

import java.awt.Color;
import gpdraw.*;

 public class RectangleTester
 {
    public static void main(String[] args)
    {
        Rectangle RectA = new Rectangle();
        Rectangle RectB = new Rectangle(-210.0, 210.0, 420.0, 420.0);
        Rectangle RectC = new Rectangle(-70.0, 210.0, 140.0, 420.0);
        Rectangle RectD = new Rectangle(-210.0, 70.0, 420.0, 140.0);
        Rectangle RectE = new Rectangle(RectA);
    
    
        //draw Rectangle Objects
        RectA.draw();
        RectB.draw();
        RectC.draw();
        RectD.draw();
        RectE.draw(Color.RED);

        //test the public.getArea() method of the Rectangle class
        System.out.println("The Area of RectA is " + RectA.getArea());
        System.out.println("The Area of RectB is " + RectB.getArea());
        System.out.println("The Area of RectC is " + RectC.getArea());
        System.out.println("The Area of RectD is " + RectD.getArea());
        System.out.println("The Area of RectE is " + RectE.getArea());

        //test the public.getPerimeter() method of the Rectangle class
        System.out.println("The Perimeter of RectA is " + RectA.getPerimeter());
        System.out.println("The Perimeter of RectB is " + RectB.getPerimeter());
        System.out.println("The Perimeter of RectC is " + RectC.getPerimeter());
        System.out.println("The Perimeter of RectD is " + RectD.getPerimeter());
        System.out.println("The Perimeter of RectE is " + RectE.getPerimeter());
    }
   
 }
 