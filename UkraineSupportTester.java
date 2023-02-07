import java.awt.Canvas;
import javax.swing.JFrame;


public class UkraineSupportTester
{
    public static void main(String[] args) 
    {
        JFrame Frame = new JFrame("Ukraine Support");    //creates a window in the JFrame container
        Canvas Canvas = new UkraineSupport();              //It prints out the constructor with the sketch pad
        
        Frame.setVisible(true);                     //makes everything visible
        Canvas.setSize(1000, 800);                   //set the width(1000) and height(800)          
        Frame.add(Canvas);                        //adds the Canvas to the frame
        Frame.pack();                               //sizes the frame to the same size as the canvas
        
    }
}