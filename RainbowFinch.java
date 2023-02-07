/**
 *<BR> Name:          First Last
 *<BR> Date:          0-00-0000
 *<BR> Period:        0
 *<BR> Assignment:    Lesson00
 *<BR> Description:   In a sentence, what does this code do?
 *<BR> Cite Sources:  Everyone who helped, and/or websites used
 */

import edu.cmu.ri.createlab.terk.robot.finch.Finch;

public class RainbowFinch
{
    public static void main(String[] args)
    {
        Finch MyFinch = new Finch();
        
        MyFinch.setLED(255, 0, 0);
        MyFinch.sleep(30000);
        MyFinch.setLED(255, 127, 0);
        MyFinch.sleep(30000);
        MyFinch.setLED(255, 255, 0);
        MyFinch.sleep(30000);
        MyFinch.setLED(0, 255, 0);
        MyFinch.sleep(30000);
        MyFinch.setLED(0, 0, 255);
        MyFinch.sleep(30000);
        MyFinch.setLED(75, 0, 130);
        MyFinch.sleep(30000);
        MyFinch.setLED(148, 0, 211);
        MyFinch.sleep(30000);
        MyFinch.quit();
    }
}

/*
RUN OUTPUT:

*/