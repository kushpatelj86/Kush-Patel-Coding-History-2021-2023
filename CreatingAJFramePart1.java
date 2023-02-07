import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.Color;
public class CreatingAJFramePart1
{
    public static void main(String[] args) 
    {
        //JFrame = a GUI window to add components with


        JFrame frame = new JFrame(); //creates a frame
        frame.setTitle("JFrame title goes here");//sets the title of frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application
        frame.setResizable(false); //prevent frame from being resized
        frame.setSize(420,420); //set the x dimension and y dimension
        frame.setVisible(true); //make frame visible

 
        ImageIcon image = new ImageIcon("channels4_profile.jpg"); //create an image icon
        frame.setIconImage(image.getImage());//change icon of frame
        frame.getContentPane().setBackground(new Color(31,165,235)); //change color of background












    }
}