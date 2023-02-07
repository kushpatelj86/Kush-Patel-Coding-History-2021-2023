import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;


public class CreatingAJFramePart2 extends JFrame
{
    
        CreatingAJFramePart2()
        {
        this.setTitle("JFrame title goes here");//sets the title of frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application
        this.setResizable(false); //prevent frame from being resized
        this.setSize(420,420); //set the x dimension and y dimension
        this.setVisible(true); //make frame visible

 
        ImageIcon image = new ImageIcon("channels4_profile.jpg"); //create an image icon
        this.setIconImage(image.getImage());//change icon of frame
        this.getContentPane().setBackground(new Color(31,165,235)); //change color of background
        }
        public static void main(String[] args) 
        {
            new CreatingAJFramePart2();
        }
}
