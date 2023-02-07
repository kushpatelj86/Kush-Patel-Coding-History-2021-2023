/**
 *<BR> Name:          First Last
 *<BR> Date:          0-00-0000
 *<BR> Period:        0
 *<BR> Assignment:    Lesson00
 *<BR> Description:   In a sentence, what does this code do?
 *<BR> Cite Sources:  Everyone who helped, and/or websites used
 */

import edu.cmu.ri.createlab.terk.robot.finch.Finch;

public class TemperatureFinch
{
    public static void main(String[] args)
    { 
        double temperature1;
        double nextTempeture = 0.0;
        double temp;
        Finch MyFinch = new Finch();
        temperature1 = (MyFinch.getTemperature() * 1.8) + 32.0;
        System.out.println();
        temp = temperature1;
        double difference = 0;
        for(int i = 1; i <= 20;i++)
        {
                nextTempeture = (MyFinch.getTemperature() * 1.8) + 32.0;
                difference = nextTempeture - temp;
                System.out.printf("Temperature #%d is %.2f", i, nextTempeture);
                System.out.print((char) 176);
                System.out.print((char) 102);
                
                if(difference > 0.25)
                {
                    System.out.print(" and climbing");
                    MyFinch.setLED(255, 0, 0);    
                }
                else if(difference < -0.25)
                {
                    
                    System.out.print(" and falling");
                    MyFinch.setLED(0, 0, 255);
                }
                else
                {  
                    System.out.print(" and stable");
                    MyFinch.setLED(255, 255, 255);
                }    
                System.out.println();
                temp = nextTempeture;
                MyFinch.sleep(6000);
        }
        MyFinch.quit(); 
    }
}

/*
RUN OUTPUT:

*/