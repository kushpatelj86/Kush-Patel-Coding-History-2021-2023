/**
 *<BR> Name:          First Last
 *<BR> Date:          0-00-0000
 *<BR> Period:        0
 *<BR> Assignment:    Lesson00
 *<BR> Description:   In a sentence, what does this code do?
 *<BR> Cite Sources:  Everyone who helped, and/or websites used
 */

import com.birdbraintechnologies.Finch;

public class SoundFinch
{
    public static void main(String[] args)
    {
        Finch MyFinch = new Finch();

        MyFinch.saySomething("Greetings");
        MyFinch.sleep(1000);
        System.out.print("Greetings");
        MyFinch.saySomething("Aee");
        MyFinch.sleep(500);
        MyFinch.saySomething("Pee");
        MyFinch.sleep(500);
        System.out.print(" AP ");
        MyFinch.saySomething(" Students ");
        MyFinch.sleep(2000);
        System.out.print("Students");
        System.out.println();
       
        System.out.println("Count Down from 10 to 0");
        MyFinch.saySomething("Count Down from 10 to 0");
        MyFinch.sleep(5000);

        for(int i = 10; i >= 0; i--)
        {
            System.out.println(i);
            MyFinch.saySomething("" + i);
            MyFinch.sleep(1000);
        }
        MyFinch.sleep(5000);

        System.out.println("Footsteps is playing");
        MyFinch.playClip("footsteps.wav");
        
        MyFinch.sleep(12000);
        
        System.out.println("Birds are chirping at the lake");
        MyFinch.playClip("lake.wav");


        MyFinch.sleep(20000);

        System.out.println("Playing a tone#1");
        MyFinch.playTone(10000,2000);
        System.out.println("Playing a tone#2");
        MyFinch.playTone(5000,2000);

        MyFinch.sleep(5000);

    
        System.out.println("Buzzing for 2 seconds");
        MyFinch.buzz(440,2000);
        MyFinch.sleep(3000);
        System.out.println("Buzzing for 2 seconds");
        MyFinch.buzz(4400, 2000);
        MyFinch.sleep(3000);

        MyFinch.quit();
    }
}

/*
RUN OUTPUT:
Greetings AP Students
Count Down from 10 to 0
10
9
8
7
6
5
4
3
2
1
0
Footsteps is playing
Birds are chirping at the lake
Playing a tone#1
Playing a tone#2
Buzzing for 2 seconds
Buzzing for 2 seconds

*/