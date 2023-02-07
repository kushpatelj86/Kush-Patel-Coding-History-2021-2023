/**
 *<BR> Name:          Kush Patel
 *<BR> Date:          12-20-2021
 *<BR> Period:        2
 *<BR> Assignment:    ICT Lesson 13.3
 *<BR> Description:   We will be using a while loop with hasNext to read the file, we included equation in the loop and to end the loop we do, we will
 *<BR> Cite Sources:  Mr.Eliot taught me how to always set goodData to faLse before running and brady reiss and I got the same average/we comparex our averages
 */
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class SqueezeFile
{
    
    
    public static void squeeze()
    {
        try 
        {
            File MyFile = new File("squeeze-before.txt");
            Scanner inFile = new Scanner((MyFile));
            FileWriter outFile = new FileWriter("squeeze-after.txt");
           
            while(inFile.hasNext())
            {
                String line = inFile.nextLine();
                int whiteSpace = 0;
                int linePos = 0;
                boolean quitLoop;
                
                if(line.length() > 0)
                {         
                    quitLoop = false;
                    while(quitLoop == false)
                    {                        
                        char character = line.charAt(linePos);
                        if(character == ' ')
                        {
                            whiteSpace++;
                            
                           
                        }
                        else if(character == '\t')
                        {
                            whiteSpace += 4;
                            

                        }
                        else
                        {
                            outFile.write(whiteSpace + " " + line.substring(linePos) + "\r\n");
                            quitLoop = true;
                        }
                        linePos++;
                    }
                }
                else
                {
                    outFile.write("0\r\n");
                }
            }
            inFile.close();
            outFile.close();
            System.out.println("Your file has been compressed..."); 
        } 
        catch (Exception e) 
        {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
}
   
   