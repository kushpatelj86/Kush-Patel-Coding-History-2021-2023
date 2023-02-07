import gpdraw.*;
import java.awt.Graphics;
import java.awt.Canvas;
import java.awt.Color;

public class UkraineSupport extends Canvas         // Drawing is a "child" class of Canvas and Canvas is ther parent class
{

    public UkraineSupport()
    {
        SketchPad myPaper = new SketchPad(1000, 800);   //1000 is the width and 800 is the height, sets the sketchpad
    }
    
    public void paint(Graphics g)           // it paints all the drawings
    {    
        drawUkraineFlagBase(g);
    }

    private void drawUkraineFlagBase(Graphics g)
    {
        g.setColor(Color.BLUE);
        g.fillRect(0, 0, 500, 250);
    }

    
}