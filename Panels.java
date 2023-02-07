import java.awt.Color;
import java.awt.Font;
import java.awt.BorderLayout;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.LayoutFocusTraversalPolicy;

public class Panels
{
    public static void main(String[] args)
    {
        //JPanel = a gui component that acts like a container to hold other components

        ImageIcon image = new ImageIcon("channels4_profile.jpg"); //create an image icon




        JLabel label = new JLabel();
        label.setText("Hi");
        label.setIcon(image);
        label.setVerticalAlignment(JLabel.BOTTOM);
        label.setHorizontalAlignment(JLabel.RIGHT);
        label.setBounds(0,0,75,75);

        JPanel redpanel = new JPanel();
        redpanel.setBackground(Color.red);
        redpanel.setBounds(0, 0, 250, 250);
        redpanel.setLayout(new BorderLayout());

        JPanel bluepanel = new JPanel();
        bluepanel.setBackground(Color.blue);
        bluepanel.setBounds(250, 0, 250, 250);
        bluepanel.setLayout(new BorderLayout());

        JPanel greenpanel = new JPanel();
        greenpanel.setBackground(Color.green);
        greenpanel.setBounds(0, 250, 500, 250);
        greenpanel.setLayout(new BorderLayout());










        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(750,750);
        frame.setVisible(true);
        redpanel.add(label);
        frame.add(redpanel);
        frame.add(bluepanel);
        frame.add(greenpanel);











    }
}