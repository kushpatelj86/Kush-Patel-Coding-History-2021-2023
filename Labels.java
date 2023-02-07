import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;
public class Labels
{
    public static void main(String[] args)
    {
        //JLabel a gui display area fpr a string of text, image or both

        ImageIcon image = new ImageIcon("channels4_profile.jpg"); //create an image icon


        Border border = BorderFactory.createLineBorder(Color.blue,3);



        JLabel label = new JLabel(); //create a label object
        label.setText("Bro do you even code?"); ///set text of label
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER); //options LEFT,CENTER,RIGHT
        label.setVerticalTextPosition(JLabel.TOP); //options TOP,CENTER,BOTTOM
        label.setForeground(new Color(134,24,123)); //set font color of text
        label.setFont(new Font("MV Boli",Font.PLAIN,20)); //set font of text
        label.setIconTextGap(25); //set gap of text to image
        label.setBackground(Color.green); //set background color
        label.setOpaque(true); //display background color
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER); //set vertical position of icon+text within label options TOP,CENTER,BOTTOM
        label.setHorizontalAlignment(JLabel.CENTER); //set horizotal position of icon+text within label options LEFT,CENTER,RIGHT
        label.setBounds(0,0,250,250); ///set x and y position within frame as well as dimensions
        
        
        
        
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.pack();
        frame.add(label);















    }
}