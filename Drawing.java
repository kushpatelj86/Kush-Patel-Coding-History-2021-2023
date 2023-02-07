/**
 *<BR> Name:          Kush Patel
 *<BR> Date:          01-18-2022
 *<BR> Period:        2
 *<BR> Assignment:    AP Comp Sci A First Semester Extra Credit Assignment
 *<BR> Description:   We will be coding different draeings to make them unique and  beautiful
 *<BR> Cite Sources:  https://www.rapidtables.com/web/color/RGB_Color.html ; https://greenteapress.com/thinkjava6/html/thinkjava6017.html;https://www.geeksforgeeks.org/draw-polygon-java-applet/; https://docs.oracle.com/en/java/javase/11/docs/api/java.desktop/java/awt/Graphics.html; https://docs.oracle.com/en/java/javase/11/docs/api/java.desktop/java/awt/Color.htm;  No human assistance as stated for this extra credit assignment
 */
import gpdraw.*;
import java.awt.Graphics;
import java.awt.Canvas;
import java.awt.Color;

public class Drawing extends Canvas         // Drawing is a "child" class of Canvas and Canvas is ther parent class
{

    public Drawing()
    {
        SketchPad myPaper = new SketchPad(1000, 800);   //1000 is the width and 800 is the height, sets the sketchpad
    }
    
    public void paint(Graphics g)           // it paints all the drawings
    {    
       drawUkraineSupport(g);
        /* drawSnowMan(g, true); //this draws a snowman, if you set it to false then there will ber no hat drawn, if you set it to true then there will be a hat drawn
        drawBaby(g); //this draws an ordianry baby
        drawR2D2(g);  /// this draws the whole body of r2d2, with the legs, and patterns were drawn with for loops
        drawLightSaber(g, 600, Color.red, true); /// You must choose 600 as the length if you want to ignite the lightsaber, if you don't it wont be ignited, if the lightsaber length is not 600 it will not ignite, you must set it to true if you want it to be ignited and can choose different colors for a lightsaber
        drawIndiaFlag(g);  //this draws India's national flag
        drawTraffic(g);  //this draws a road and a bunch of cars on it
        drawMickyMouse(g);  //this draws micky mouse's head
        drawMoljinor(g); //this draws thor's first hammer
        drawLacrosseStick(g);  ///draws an ordinary lacrosse stick
        drawTrident(g); // this draws king neptune's trident in its pointing position, it's point toward micky's head
        */

        
    }

    private void drawMickyMouse(Graphics g)
    {
        int k = 390;   // first ear location
        
        while(k <= 595) //this is a loop that draws micky's ears
        {
            g.setColor(Color.black);
            g.fillOval(k, 150, 110, 110);
            k += 205;
        }
        
        g.setColor(Color.black);
        g.fillArc(450, 200, 200, 200, 0, 180);   // top part of micky's head
        g.setColor(Color.red);
        g.fillArc(450, 201, 200, 200, 180, 180);   // botoom part of micky's head
        
        int i = 465;
        
        while(i <= 515)
        {
            i += 50;
             

            g.setColor(Color.yellow);   // this draws micky's eyess
            g.fillOval(i, 315, 25, 55);
        }
    }
    
    //private void draw
    private void drawIndiaFlag(Graphics g)  // this draws the indian flag using for loops to make a rythymm/ Using for lops makes it faster to draw rather than looking at the x y coordinate and plotting them hand by hand
    {
        
        for(int b = 420; b <= 460;b++)    // draws top orange part of the flag
        {
            g.setColor(Color.orange);
            g.fillRect(525, b, 200, 5);
        } 
        
        for(int b = 460; b <= 500;b++) // draws middle white part of the flag
        {
            g.setColor(Color.white);
            g.fillRect(525, b, 200, 5);
        }
        
        for(int b = 500; b <= 530;b++)    // draws bottom green part of the flag
        {
            g.setColor(Color.GREEN);
            g.fillRect(525, b, 200, 5);         
        }
       
        g.setColor(Color.BLUE);             //draws the center symbol of the india flag
        g.fillOval(610, 460, 40, 40);             //draws the center symbol of the india flag
        g.setColor(Color.white);           //draws the center symbol of the india flag
        g.fillOval(617, 468, 25, 25);       //draws the center symbol of the india flag
        g.setColor(Color.BLUE);          //draws the center symbol of the india flag
        g.fillOval(624, 476, 10, 10);        //draws the center symbol of the india flag

        for(int b = 0; b <= 4; b +=2)                                ///the remaining for loops i used to create a patter of lines to draw the indian flag
        {
            g.setColor(Color.BLUE);
            g.drawLine(627 + b, 464 - b, 631 + b , 475 - b);
        }
        
        for(int b = 0; b <= 14; b += 2)
        {
            g.setColor(Color.BLUE);
            g.drawLine(635 + b, 462 + b, 631, 484);
        }

        for(int b = 0; b <= 14; b += 2)
        {
            g.setColor(Color.BLUE);
            g.drawLine(631, 484, 641, 480 + b);
        }

        for(int b = 0; b <= 10; b += 2)
        {
            g.setColor(Color.BLUE);
            g.drawLine(631, 484, 640 - b, 490 + b);
        }

        for(int b = 0; b <= 20; b += 2)
        {
            g.setColor(Color.BLUE);
            g.drawLine(631, 484, 630 - b, 500 - b);
        }

        for(int b = 0; b <= 20; b += 2)
        {
            g.setColor(Color.BLUE);
            g.drawLine(631, 484, 610 + b, 480 - b);
        }

        for(int b = 0; b <= 10; b += 2)
        {
            g.setColor(Color.BLUE);
            g.drawLine(631, 484, 630 + b, 500 - b);
        }

        for(int b = 0; b <= 10; b += 2)
        {
            g.setColor(Color.BLUE);
            g.drawLine(631, 484, 630 + b, 500 - b);
        }

        for(int b = 0; b <= 10; b += 2)
        {
            g.setColor(Color.BLUE);
            g.drawLine(631, 484, 630 + b, 500 - b);
        }

        g.setColor(Color.black);         /// this draws the pole of the flag
        g.fillRect(525, 420, 5, 250);
        
    }

    private void drawR2D2(Graphics g)      // this draws all the parts of r2d2 using for loops, istead of drawing it by hand, for loops saves and space time in coding 
    {       
        for(int i = 780; i <= 950; i += 170)  /// this draws one of the buttons for r2 d2
        {            
            g.setColor(Color.blue);
            g.fillRect(i, 200, 20, 150);
        }
       
        g.setColor(Color.gray);
        g.fillRect(850, 350, 35, 25);
        g.setColor(Color.gray);
        drawMyPolygon3(g);                         // draws the center leggs and feet of r2 d2
        g.setColor(Color.LIGHT_GRAY);
        g.fillArc(800, 100, 150, 200, 0, 180);
        g.setColor(Color.WHITE);
        g.fillRect(800, 200, 150, 150);
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(810, 350, 125, 10);
        g.setColor(Color.WHITE);
        g.fillRect(950, 200, 25, 50);
        g.setColor(Color.WHITE);
        g.fillRect(775, 200, 25, 50);
        g.setColor(Color.black);

        for(int i = 785; i <= 945; i += 160)   // draws the legs of r2 d2
        {
            g.setColor(Color.black);
            g.drawRect(i, 200, 20, 170);
            g.setColor(Color.white);
            g.fillRect(i, 200, 20, 170);
        }
        
        g.setColor(Color.WHITE);
        g.fillRect(935, 200, 25, 50);            //draws button
        g.setColor(Color.black);
        g.setColor(Color.gray);
        g.fillRect(945, 350, 35, 35);        // draws pattern
        g.setColor(Color.gray);
        g.fillRect(770, 350, 35, 35);
        g.setColor(Color.gray);
        drawMyPolygon1(g);        /// these two polygons draw the feet of r2d2
        drawMyPolygon2(g);
        g.setColor(Color.BLUE);
        g.fillRect(855, 110, 40, 40);
        g.setColor(Color.black);           //buttons
        g.fillOval(863, 117, 25, 25);
        g.setColor(Color.BLUE);        //buttons
        g.fillRect(850, 160, 50, 25);
        g.setColor(Color.red);         ///draw it's eye
        g.fillOval(865, 162, 20, 20);
        
        for(int i = 210; i <= 250; i += 20)  //draws the buttons
        {
            g.setColor(Color.BLUE);
            g.fillRect(835, i, 75, 10);
        }

        for(int i = 815; i <= 830; i += 15)   //draws the button
        {
            g.setColor(Color.BLUE);
            g.fillRect(i, 160, 10, 30);
        }

        g.setColor(Color.BLUE);
        g.fillRect(930, 160, 10, 30);

        for(int i = 810; i <= 920; i += 110)   ///draws
        {
            g.setColor(Color.black);
            g.drawRect(i, 210, 20, 110);
        }

        for(int i = 835; i <= 895; i += 60)
        {
            g.setColor(Color.black);
            g.drawRect(i, 270, 20, 50);
        }

        g.setColor(Color.BLUE);
        g.fillRect(860, 270, 30, 50);   ///draws btoons
       
        for(int i = 280; i <= 300; i += 20)
        {
            g.setColor(Color.white);
            g.fillRect(867, i, 15, 15);
        }

        for(int i = 810; i <= 920; i += 50)
        {
            g.setColor(Color.blue);
            g.fillOval(i, 325, 20, 20);
        }

        g.setColor(Color.black);
        g.fillOval(910, 180, 10, 10);
        g.drawOval(905, 175, 20, 20);

        for(int i = 815; i <= 935; i += 15)
        {
            g.setColor(Color.black);
            g.fillRect(i, 350, 5, 10);

            for(int k = 780; k <= 960; k += 180)
            {
                
                g.setColor(Color.blue);

                g.fillRect(k, 360, 10, 10);
            }
        }
   
    }
    private void drawMyPolygon1(Graphics g) /// draws one of the feet
    {
        // x coordinates of vertices
        int x[] = { 740, 840, 780 };
  
        // y coordinates of vertices
        int y[] = { 400, 400, 350};
  
        // number of vertices
        int numberofpoints = 3;
  
        // set the color of line drawn
        g.setColor(Color.gray); 
  
        // draw the polygon using Java Graphics class method 
        g.drawPolygon(x, y, numberofpoints); 
        g.setColor(Color.gray);
        g.fillPolygon(x, y, numberofpoints);           
    }
    private void drawMyPolygon2(Graphics g)
    {
        // x coordinates of vertices
        int x[] = { 900, 1000, 975 };
  
        // y coordinates of vertices
        int y[] = { 400, 400, 350};
  
        // number of vertices
        int numberofpoints = 3;
  
        // set the color of line drawn
        g.setColor(Color.gray); 
  
        // draw the polygon using Java Graphics class method 
        g.drawPolygon(x, y, numberofpoints); 
        g.setColor(Color.gray);                        //// gives the polygon a color
        g.fillPolygon(x, y, numberofpoints);               
    }

    private void drawMyPolygon3(Graphics g)
    {
        // x coordinates of vertices
        int x[] = { 860, 880, 870 };
  
        // y coordinates of vertices
        int y[] = { 400, 400, 360};
  
        // number of vertices
        int numberofpoints = 3;
  
        // set the color of line drawn
        g.setColor(Color.gray); 
  
        // draw the polygon using Java Graphics class method 
        g.drawPolygon(x, y, numberofpoints); 
        g.setColor(Color.gray);
        g.fillPolygon(x, y, numberofpoints); 
              
    }
    
    private void drawHilt(Graphics g)  /// this method draws the lightsaber handle or hilt the jedi carries when the blade isn't out and the light saber is turned off
    {
        g.setColor(Color.gray);
        g.fillRect(15, 400, 20, 75);
        g.setColor(Color.black);
        g.fillArc(15, 460, 20, 25, 180, 180);
        g.setColor(Color.gray);
        g.fillRect(10, 400, 30, 10);
        
        for(int i = 420; i <= 470; i += 10)    //draws the pattern
        {
            g.setColor(Color.black);
            g.fillRect(15, i, 20, 5);
        }
    }
    
    private void drawLightSaber(Graphics g, int length, Color c, boolean isIgnited) // boolean isIgnited tells if the blade is ignited and you can choose a different color for your blade
    {     
        if(length == 600.00 && isIgnited == true)   // the length must be exact 600 and it must be set to true if you want the ligthsaber to ignite
        {
        
            g.setColor(c);
            g.fillArc(17, 180, 15, length, 0, 180);
            drawHilt(g);
        }

        else
        {
            drawHilt(g);
        }
    }

    private void drawSnowMan(Graphics g, boolean hasHat)   //this draws an ordanary snoman with it's nose and hat and buttons
    { 
        if(hasHat == true)
        {
            g.setColor(Color.white);
            g.fillOval(270, 500, 150, 150);
            g.setColor(Color.white);
            g.fillOval(290, 440, 100, 100);
            g.setColor(Color.white);
            g.fillOval(300, 400, 75, 75);
            
            for(int i = 320; i <= 340; i += 20)
            {
                g.setColor(Color.black);
                g.fillOval(i, 420, 10, 10);
            }
            
            g.drawArc(330, 445, 20, 10, 180, 180);
            g.setColor(Color.orange);               /// draws nose
            g.fillArc(330, 430, 70, 20, 0, 180);

            for(int i = 460; i <= 500; i += 10)   //draws buttons
            {
                g.setColor(Color.black);
                g.fillOval(340, i, 10, 10); 
            }

            for(int i = 200; i <= 380; i += 180)
            {
                g.setColor(Color.DARK_GRAY);
                g.fillRect(i, 496, 100, 10);
            }

            g.setColor(Color.black);
            g.fillRect(300, 390, 70, 20);
            g.fillRect(315, 340, 40, 60);
        }
        
        else
        {
            g.setColor(Color.white);
            g.fillOval(270, 500, 150, 150);
            g.setColor(Color.white);
            g.fillOval(290, 440, 100, 100);
            g.setColor(Color.white);
            g.fillOval(300, 400, 75, 75);
            
            for(int i = 320; i <= 340; i += 20)
            {
                g.setColor(Color.black);
                g.fillOval(i, 420, 10, 10);
            }
           
            g.drawArc(330, 445, 20, 10, 180, 180);
            g.setColor(Color.orange);               /// draws nose
            g.fillArc(330, 430, 70, 20, 0, 180);
    
            for(int i = 460; i <= 500; i += 10)   //draws buttons
            {
                g.setColor(Color.black);
                g.fillOval(340, i, 10, 10); 
            }
    
            for(int i = 200; i <= 380; i += 180)
            {
                g.setColor(Color.DARK_GRAY);
                g.fillRect(i, 496, 100, 10);
            }

            g.setColor(Color.black);
        }
    }

    private void drawTridentBase(Graphics g, int num)  //this draws the points/base of neptune's trident using recursion and for loops
    {
        if(num == 0)    //stops the object from drawing at a certain point and base case of the recursion
        {
            g.setColor(Color.YELLOW);
            g.fillRect(200, 200, 10, 10);
        }
        else
        {
            for(int x = 200; x <= 300; x++)    /// draws the first part of the base of thhe trident using nested for loop
            {
                for(int y = 200; y <= 300; y++)
                {
                    g.setColor(Color.YELLOW);
                    g.fillRect(y, 200, 10, 10);
                }
                g.setColor(Color.YELLOW);
                g.fillRect(200, x, 10, 10);
            }
            for(int x = 200; x <= 300; x++)    //second parta
            {
                g.setColor(Color.YELLOW);
                g.fillRect(x, 300, 10, 10);
            }
            for(int y = 45; y <= 300; y++)         ///third part
            {
                g.setColor(Color.YELLOW);
                g.fillRect(y, 250, 10, 10);
            }
            
            drawTridentBase(g, num - 1);   //recursion, without it. it would draw the trident randomly
        }
    }
    
    private void drawTrident(Graphics g)   //this draws neptune's trident
    {
        drawTridentBase(g, 500);                  ////gets the base of the trident
        for(int i = 200; i <= 300; i += 50)         //draws the points of the trident
        {
            g.setColor(Color.YELLOW);
            g.fillArc(280, i, 100, 20, 0, 180);
        }
    }
    
    private void drawBaby(Graphics g)   //this draws an ordinary baby similiar to simpsons like characters
    {
        g.setColor(Color.cyan); // this color coat is what the baby is wearing
        g.fillRoundRect(780, 480, 80, 160, 180, 180);     //draws the body        
        g.setColor(Color.yellow);     //draws the head
        g.fillOval(790, 500, 50, 50);
        
        for(int i = 800; i <= 820; i += 20)     ///draws the eyes
        {
            g.setColor(Color.black);
            g.fillOval(i, 520, 10, 10);
            g.drawArc(805, 535, 20, 10, 180, 180);
        }

    }
    private void drawRoad(Graphics g)   //this draws an empty road for the cars to drive on
    {
        g.setColor(Color.gray);
        g.fillRect(0, 95, 800, 50);     //draw pavement
        
        for(int i = 0; i <= 700; i += 100)   // draws the yellow lines using for loops
        {
            g.setColor(Color.yellow);
            g.fillRect(i, 125, 60, 5);
        }

    }

    private void drawCar1(Graphics g)   // it draws the red car
    {
        g.setColor(Color.red);        ///draw base
        g.fillRect(10, 60, 100, 50);        
        g.setColor(Color.red);
        g.fillRect(50, 20, 70, 90);
            
        for(int i = 10; i <= 80; i += 70)    //draws the wheel
        {
            g.setColor(Color.black);        
            g.fillOval(i, 100, 40, 40);
        }
        
        g.setColor(Color.yellow);
        g.fillRect(55, 30, 30, 30);   ///draw window
    }

    private void drawCar2(Graphics g)  ///blue car
    {
        g.setColor(Color.blue);     ///draw base
        g.fillRect(140, 60, 100, 50);
        g.setColor(Color.blue);
        g.fillRect(180, 20, 70, 90);   
        
        for(int i = 140; i <= 210; i += 70)      ///draws the wheel
        {
            g.setColor(Color.black);        
            g.fillOval(i, 100, 40, 40);
        }
        
        g.setColor(Color.yellow);             ///draw window
        g.fillRect(185, 30, 30, 30);
    }

    private void drawCar3(Graphics g)  ///black car
    {
        g.setColor(Color.black);            ///draw base
        g.fillRect(270, 60, 100, 50);      
        g.setColor(Color.black);
        g.fillRect(310, 20, 70, 90);       
      
        for(int i = 270; i <= 340; i += 70)    //draws the wheel
        {
            g.setColor(Color.black);        
            g.fillOval(i, 100, 40, 40);
        }
       
        g.setColor(Color.yellow);          ///draw window
        g.fillRect(315, 30, 30, 30);
    }

    private void drawCar4(Graphics g) //draw white car
    {
        g.setColor(Color.white);                 ///draw base
        g.fillRect(400, 60, 100, 50);
        g.setColor(Color.white);
        g.fillRect(440, 20, 70, 90);
        
        for(int i = 400; i <= 470; i += 70)        ///////// draws the wheel
        {
            g.setColor(Color.black);        
            g.fillOval(i, 100, 40, 40);
        }
        
        g.setColor(Color.yellow);                  ///draw window
        g.fillRect(445, 30, 30, 30);
    }

    private void drawCar5(Graphics g) /// draw green car
    {
        g.setColor(Color.green);            ///draw base
        g.fillRect(530, 60, 100, 50);
        g.setColor(Color.green);
        g.fillRect(570, 20, 70, 90);
        
        for(int i = 530; i <= 600; i += 70)           ////draw the wheel
        {
            g.setColor(Color.black);        
            g.fillOval(i, 100, 40, 40);
        }
        
        g.setColor(Color.yellow);                     //draw window
        g.fillRect(575, 30, 30, 30);
    }

    private void drawCar6(Graphics g)  //draw orange car
    {
        g.setColor(Color.orange);
        g.fillRect(660, 60, 100, 50);                   ///draw base
        g.setColor(Color.orange);
        g.fillRect(700, 20, 70, 90);   
        
        for(int i = 660; i <= 730; i += 70)   ///draw the wheel
        {
            g.setColor(Color.black);        
            g.fillOval(i, 100, 40, 40);
        }
        
        g.setColor(Color.yellow);
        g.fillRect(705, 30, 30, 30);              //draw window
    }
    private void drawTraffic(Graphics g)    ///draws the road and cars into one picture
    {
        
        drawRoad(g);
        drawCar1(g);
        drawCar2(g);
        drawCar3(g);
        drawCar4(g);
        drawCar5(g);
        drawCar6(g);

    }
    private void drawMoljinor(Graphics g) // this draws thor's first hammer and there are patterns onn the hander
    {
        g.setColor(Color.gray);
        g.fillRoundRect(90, 400, 100, 75, 10, 90);               ///draws base of hammer
        g.setColor(Color.black);                           
        g.fill3DRect(130, 475, 20, 100, true);                      ///draws handle of hammer
         
        for(int i = 475; i <= 555; i += 20)         ////draws the paterrn
        {
            g.setColor(Color.darkGray);
            g.fill3DRect(130, i, 20, 10, true);
        }
    }

    private void drawLacrosseStick(Graphics g)
    {
        g.setColor(Color.black);           
        g.fillOval(905, 470, 40, 80);
        g.setColor(Color.black);        
        g.fillOval(900, 470, 50, 40);
        g.setColor(Color.white);
        g.fillOval(910, 475, 30, 70);
        g.fillOval(905, 475, 40, 30);
        
        for(int i = 0; i <= 25; i +=5)     //draws part of net using for loop
        {
            g.setColor(Color.black);
            g.drawLine(912 + i, 540, 912 + i, 475);
        }
        
        for(int i = 0; i <= 10; i +=5)    //draws part of net using for loop
        {
            g.setColor(Color.black);
            g.drawLine(905, 480 + i, 940 + i, 480 + i);
        }

        for(int i = 40; i >= 0; i -=5)            //draws part of net using for loop
        { 
            g.setColor(Color.black);
            g.drawLine(908, 490 + i, 940, 490 + i);
        }

        for(int i = 10; i >= 0; i -= 5)                 //draws part of net using for loop
        { 
            g.setColor(Color.black);
            g.drawLine(915, 530 + i, 935, 530 + i);
        }

        for(int i = 4; i >= 0; i -= 1)                    //draws part of net using for loop
        {
            g.setColor(Color.black);
            g.drawLine(915, 540 + i, 935, 540 + i);
        }
        
        g.fillRect(920, 540, 10, 160);               ///draws handle

        for(int i = 10; i >= 0; i -=5)                 //draws part of net using for loop
        {
            g.setColor(Color.black);
            g.drawLine(905, 490 + i, 945, 490 + i);
        }
    }
    private void drawUkraineSupport(Graphics g)
    {
    
        g.setColor(Color.BLUE);
        g.fillRect(0, 0, 1500, 325); 
        g.setColor(Color.yellow);

        g.fillRect(0, 325, 1500, 340); 

        g.setColor(Color.black);
        g.fillRect(200, 125, 20, 200); 
        
        for(int i = 0; i < 2;i++)
        {
            for(int k = 0; k <= 75;k+= 75)
            {
                
                
                    g.setColor(Color.black);
                    g.fillRect(200, 110 + k, 115, 20); 
                
            }

            
        }
        
        for(int i = 0; i <= 200; i++ )
        {
            g.setColor(Color.black);
            g.fillOval(320 + i, 100, 100, 220);
        }
        

        g.setColor(Color.black);
        g.fillRect(650, 105, 20, 220);
       
        g.setColor(Color.black);
        
        for(int i = 0; i <= 95; i +=5)
        {
            g.fillOval(650+i, 200-i, 20, 20);

        }
        for(int i = 0; i <= 105; i +=5)
        {
            g.fillOval(650+i, 200+i, 20, 20);

        }
        
        
        g.setColor(Color.black);
        g.fillRect(200, 360, 20, 200);
        g.fillRoundRect(200, 360, 100, 100, 50, 50);
        g.setColor(Color.yellow);
        g.fillRect(220, 375, 65, 65);
        g.setColor(Color.black);
        g.fillRoundRect(310, 410, 100, 150, 50, 10);
        g.setColor(Color.YELLOW);
        g.fillRoundRect(320, 405, 80, 140, 50, 10);

        
        g.setColor(Color.black);
        g.fillRect(460, 360, 20, 200);
        g.setColor(Color.black);
        g.fillRect(430, 420, 80, 20);
        g.setColor(Color.black);
        g.fillRect(540, 430, 20, 130);
        g.fillOval(535, 390, 30, 30);
        g.fillRect(600, 450, 20, 100);
        for(int i = 0; i <= 85; i +=5)
        {
            
            
            
            g.fillOval(600+i, 445+i, 20, 20);

        }
        g.fillRect(690, 450, 20, 100);


    }
}



    


