/**
 *<BR> Name:          First Last
 *<BR> Date:          0-00-0000
 *<BR> Period:        0
 *<BR> Assignment:    Lesson00
 *<BR> Description:   In a sentence, what does this code do?
 *<BR> Cite Sources:  Everyone who helped, and/or websites used
 */


import com.birdbraintechnologies.Finch;


public class StraightEdgeRaveFinch 
{
    static Finch RaveFinch = new Finch();

    public static void main(String[] args)
    {
        
        for(int i = 1; i <= 10; i++)
        {

            raveBeat();
            int rndMove = (int) (Math.random() * 4);
            int rndStatement = (int) (Math.random() * 4);
            if(rndMove == 0)
            {
                if(rndStatement == 0)
                {
                    raveStatement1();
                }
                if(rndStatement == 1)
                {
                    raveStatement2();
                }

                if(rndStatement == 2)
                {
                    raveStatement3();
                }
                if(rndStatement == 3)
                {
                    raveStatement4();
                }
                System.out.println("Bounce(Dance Move 1) is playing");
                danceMove1();

            }
            if(rndMove == 1)
            {
                
                if(rndStatement == 0)
                {
                    raveStatement1();
                }
                if(rndStatement == 1)
                {
                    raveStatement2();
                }

                if(rndStatement == 2)
                {
                    raveStatement3();
                }
                if(rndStatement == 3)
                {
                    raveStatement4();
                }
                
                
                System.out.println("Twizzler(Dance Move 2) is playing");

                danceMove2();
            }

            if(rndMove == 2)
            {
                
                
                if(rndStatement == 0)
                {
                    raveStatement1();
                }
                if(rndStatement == 1)
                {
                    raveStatement2();
                }

                if(rndStatement == 2)
                {
                    raveStatement3();
                }
                if(rndStatement == 3)
                {
                    raveStatement4();
                }
                
                System.out.println("BackAndForth(Dance Move 3) is playing");

                danceMove3();
            }
            if(rndMove == 3)
            {
                if(rndStatement == 0)
                {
                    raveStatement1();
                }
                if(rndStatement == 1)
                {
                    raveStatement2();
                }

                if(rndStatement == 2)
                {
                    raveStatement3();
                }
                if(rndStatement == 3)
                {
                    raveStatement4();
                }
                System.out.println("UTurn(Dance Move 4) is playing");
                danceMove4();

            }

            






        }
        
        
        
    }
   
   
   
   
    private static void randomLed()
    {
        
        int rgb1 = (int) (Math.random() * 256);
        int rgb2 = (int) (Math.random() * 256);
        int rgb3 = (int) (Math.random() * 256);
        RaveFinch.setLED(rgb1, rgb2, rgb3);
    }


    private static void danceMove1()
    {
        RaveFinch.setWheelVelocities(-156, 146,250);
        randomLed();
        RaveFinch.setWheelVelocities(243, 146,250);
        randomLed();
        RaveFinch.setWheelVelocities(-103, 146,250);
        randomLed();
        RaveFinch.setWheelVelocities(-123, 246,250);
        randomLed();
        RaveFinch.setWheelVelocities(156, -246,250);
        randomLed();
        RaveFinch.setWheelVelocities(206, 146,250);
        randomLed();
        RaveFinch.setWheelVelocities(-136, 116,250);
        randomLed();
        RaveFinch.setWheelVelocities(-114, 135,250);
        randomLed();
        RaveFinch.setWheelVelocities(165, -222,250);
        randomLed();
        RaveFinch.setWheelVelocities(-156, 146,250);
        randomLed();
        RaveFinch.setWheelVelocities(-223, 246,250);
        randomLed();
        RaveFinch.setWheelVelocities(113, -146,250);
        randomLed();
        RaveFinch.setWheelVelocities(-223, 146,250);
        randomLed();
        RaveFinch.setWheelVelocities(-156, -166,250);
        randomLed();
        RaveFinch.setWheelVelocities(-166, 146,250);
        randomLed();
        RaveFinch.setWheelVelocities(136, 116,250);
        randomLed();
        RaveFinch.setWheelVelocities(-236, 116,250);
        randomLed();
        RaveFinch.setWheelVelocities(205, 136,250);
        randomLed();
        
    }

    private static void danceMove2()
    {
       
       
        RaveFinch.setWheelVelocities(156, -146,250);
        randomLed();
        RaveFinch.setWheelVelocities(-206, 146,250);
        randomLed();
        RaveFinch.setWheelVelocities(123, 246,250);
        randomLed();
        RaveFinch.setWheelVelocities(-156, -205,250);
        randomLed();
        RaveFinch.setWheelVelocities(116, -146,250);
        randomLed();
        RaveFinch.setWheelVelocities(156, -146,250);
        randomLed();
        RaveFinch.setWheelVelocities(156, 116,250);
        randomLed();
        RaveFinch.setWheelVelocities(-114, -146,250);
        randomLed();
        RaveFinch.setWheelVelocities(236, 116,250);
        randomLed();
        RaveFinch.setWheelVelocities(-116, 116,250);
        randomLed();
        RaveFinch.setWheelVelocities(-156, -146,250);
        randomLed();
        RaveFinch.setWheelVelocities(116, 136,250);
        randomLed();
        RaveFinch.setWheelVelocities(-165, -246,250);
        randomLed();
        RaveFinch.setWheelVelocities(246, 246,250);
        randomLed();
        RaveFinch.setWheelVelocities(-146, -246,250);
        randomLed();
        RaveFinch.setWheelVelocities(161, 222,250);
        randomLed();
        RaveFinch.setWheelVelocities(-222, -226,250);
        randomLed();
        RaveFinch.setWheelVelocities(226, 223,250);
        randomLed();
        
    }

    private static void danceMove3()
    {
        

        RaveFinch.setWheelVelocities(226, 255,250);
        randomLed();
        RaveFinch.setWheelVelocities(-111, 168,250);
        randomLed();
        RaveFinch.setWheelVelocities(157, -255,250);
        randomLed();
        RaveFinch.setWheelVelocities(-111, 158,250);
        randomLed();
        RaveFinch.setWheelVelocities(0, 255,250);
        randomLed();
        RaveFinch.setWheelVelocities(-140, -146,250);
        randomLed();
        RaveFinch.setWheelVelocities(174, 255,250);
        randomLed();
        RaveFinch.setWheelVelocities(110,-174,250);
        randomLed();
        RaveFinch.setWheelVelocities(0, 255,250);
        randomLed();
        RaveFinch.setWheelVelocities(110, 146,250);
        randomLed();
        RaveFinch.setWheelVelocities(-136, -110,250);
        randomLed();
        RaveFinch.setWheelVelocities(166, 200,250);
        randomLed();
        RaveFinch.setWheelVelocities(-255, -253,250);
        randomLed();
        RaveFinch.setWheelVelocities(255, -156,250);
        randomLed();
        RaveFinch.setWheelVelocities(-175, 110,250);
        randomLed();
        RaveFinch.setWheelVelocities(0, 255,250);
        randomLed();
        RaveFinch.setWheelVelocities(174,111,250);
        randomLed();
        RaveFinch.setWheelVelocities(147, 111,250);
        randomLed();
        
    }

    private static void danceMove4()
    {
        
        
        RaveFinch.setWheelVelocities(0, 255,250);
        randomLed();
        RaveFinch.setWheelVelocities(0, 255,250);
        randomLed();
        RaveFinch.setWheelVelocities(0, 255,250);
        randomLed();
        RaveFinch.setWheelVelocities(0, 255,250);
        randomLed();
        RaveFinch.setWheelVelocities(0, 255,250);
        randomLed();
        RaveFinch.setWheelVelocities(0, 255,250);
        randomLed();
        RaveFinch.setWheelVelocities(0, 255,250);
        randomLed();
        RaveFinch.setWheelVelocities(0, 255,250);
        randomLed();
        RaveFinch.setWheelVelocities(0, 255,250);
        randomLed();
        RaveFinch.setWheelVelocities(0, 255,250);
        randomLed();
        RaveFinch.setWheelVelocities(0, 255,250);
        randomLed();
        RaveFinch.setWheelVelocities(0, 255,250);
        randomLed();
        RaveFinch.setWheelVelocities(0, 255,250);
        randomLed();
        RaveFinch.setWheelVelocities(0, 255,250);
        randomLed();
        RaveFinch.setWheelVelocities(0, 255,250);
        randomLed();
        RaveFinch.setWheelVelocities(0, 255,250);
        randomLed();
        RaveFinch.setWheelVelocities(0, 255,250);
        randomLed();
        RaveFinch.setWheelVelocities(0, 255,250);
        randomLed();
        
        
    }



    private static void raveStatement1()
    {
        System.out.println("I'm ok");
        RaveFinch.saySomething("I'm ok");
    }
    private static void raveStatement2()
    {
        System.out.println("You're fun");
        RaveFinch.saySomething("You're fun");
    }
    private static void raveStatement3()
    {
        System.out.println("He's Not");
        RaveFinch.saySomething("He's Not");
    }
    private static void raveStatement4()
    {
        System.out.println("She is");
        RaveFinch.saySomething("She is");
    }

    private static void raveBeat()
    {
        System.out.println("Rave is playing");
        RaveFinch.playClip("rave.wav");
    }
}
