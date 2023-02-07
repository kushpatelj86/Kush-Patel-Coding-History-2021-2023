/**
 *<BR> Name:          Kush Patel
 *<BR> Date:          01-18-2022
 *<BR> Period:        2
 *<BR> Assignment:    AP Comp Sci A First Semester Extra Credit Assignment
 *<BR> Description:   We will be coding different draeings to make them unique and  beautiful
 *<BR> Cite Sources:  https://www.rapidtables.com/web/color/RGB_Color.html ; https://greenteapress.com/thinkjava6/html/thinkjava6017.html;https://www.geeksforgeeks.org/draw-polygon-java-applet/; https://docs.oracle.com/en/java/javase/11/docs/api/java.desktop/java/awt/Graphics.html; https://docs.oracle.com/en/java/javase/11/docs/api/java.desktop/java/awt/Color.htm;  No human assistance as stated for this extra credit assignment
 */
import java.awt.Canvas;
import javax.swing.JFrame;


public class DrawingTester 
{
    public static void main(String[] args) 
    {
        JFrame Frame = new JFrame("Drawings");    //creates a window in the JFrame container
        Canvas Canvas = new Drawing();              //It prints out the constructor with the sketch pad
        
        Frame.setVisible(true);                     //makes everything visible
        Canvas.setSize(1000, 800);                   //set the width(1000) and height(800)          
        Frame.add(Canvas);                        //adds the Canvas to the frame
        Frame.pack();                               //sizes the frame to the same size as the canvas
        
    }
}